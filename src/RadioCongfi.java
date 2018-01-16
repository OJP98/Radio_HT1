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
        this.OnOff = false;
        this.AmFm = false;
        
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
            else{
                frecuencia = (float) 87.9;
            }
            
            if (AmFm == true && frecuencia <= 1600 && frecuencia >= 530) {
                frecuencia += 10;
            }
            else{
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
            else{
                frecuencia = (float) 107.9;
            }   
            
            if (AmFm == true && frecuencia <= 1610 && frecuencia >= 540) {
                frecuencia -= 10;
            }
            else{
                frecuencia = 1610;
            }
        }     
        return frecuencia;
    }
    public void guardar(float frecuencia, int boton){
        
    }
    public float seleccionarFav(int boton){
        return:
    }
    
    
}
