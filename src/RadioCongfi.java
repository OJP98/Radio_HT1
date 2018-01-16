/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUMPSTONIK
 */

public class RadioCongfi implements douglas{

    private boolean OnOff;
    private boolean AmFm;
    private float[] favoritoAm = new float[12];
    private float[] favoritosFm = new float[12];
    
    public RadioCongfi(){
        OnOff = false;
        AmFm = false;
        
        // Si AmFm es falso = FM
        // Si AmFm es verdadero = AM
        
    }
    public void onOff(boolean estado){      
        OnOff = estado;
    }
    
    public void Switch(boolean tipo){
        if (OnOff == true) {
            AmFm = tipo;
        }   
    }
    
    public float siguiente(float frecuencia){
        
        if (OnOff == true) {
            
            if (AmFm == false && frecuencia <= 107.7 && frecuencia >= 87.9) {
                frecuencia += 0.2;
            }
            
            else {
                
                frecuencia = (float) 87.9;
            }
            
            if (AmFm == true && frecuencia <= 1600 && frecuencia >= 530) {
                frecuencia += 10;
            }
            else {
                frecuencia = 530;
            }
            
        }   
        
        return frecuencia;
    }
    
    public float anterior(float frecuencia){
        
        if (OnOff == true) {
            
            if (AmFm == false && frecuencia <= 107.9 && frecuencia >= 88.1) {
                frecuencia -= 0.2;
            }
            else {
                frecuencia = (float) 107.9;
            }   
            
            if (AmFm == true && frecuencia <= 1610 && frecuencia >= 540) {
                frecuencia -= 10;
            }
            else {
                frecuencia = 1610;
            }
        }     
        return frecuencia;
    }
    
    /**
     * 
     * @param frecuencia: la frecuencia que se quiere guardar
     * @param boton: el boton en donde se quiere guardar la frecuencia
     */
    public void guardar(float frecuencia, int boton){
        
        //Si la radio es AM
        if (AmFm) {
            
            favoritoAm[boton] = frecuencia;
            
        } else {
            
            favoritosFm[boton] = frecuencia;
            
        }
        
    }
    
    /**
     * 
     * @param boton: Ek boton del cual se quiere seleccionar la radio
     * @return: La radio guardada en dicho boton.
     */
    public float seleccionarFav(int boton) {
        
        float frecuenciaGuardada;
        
        //Si la radio es AM
        if (AmFm) {
            
            frecuenciaGuardada = favoritoAm[boton];
            
        } else {
            
            frecuenciaGuardada = favoritosFm[boton];
            
        }
        
        return frecuenciaGuardada;
        
    }    
    
}
