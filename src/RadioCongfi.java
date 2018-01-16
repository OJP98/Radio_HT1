/**
 * Clase que contiene los metodos llamados mediante la interzaf
 * @author: Oscar Juárez - 17315; Josue Florian - 17
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

public class RadioCongfi implements douglas {

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
        
        if (OnOff) {
            
            if (AmFm) {
                
                if (frecuencia < 1610) {
                    
                    frecuencia += 10;
                    
                } else {
                    
                    frecuencia = 530;
                    
                }
                
            } else {
                
                if (frecuencia < 107.9) {
                    
                    frecuencia += 0.2;
                    frecuencia = (float) (Math.round(frecuencia*10.0)/10.0);
                    
                } else {
                    
                    frecuencia = (float) 87.9;
                }            
            }          
        }                
        
        return frecuencia;
    }
    
    public float anterior(float frecuencia){
        
        if (OnOff) {
            
            if (AmFm) {
                
                if (frecuencia > 530) {
                    
                    frecuencia -= 10;                    
                    
                } else {
                    
                    frecuencia = 1610;
                    
                }
                
            } else {
                
                if (frecuencia > 88.0) {
                    
                    frecuencia -= 0.2;
                    frecuencia = (float) (Math.round(frecuencia*10.0)/10.0);
                    
                } else {
                    
                    frecuencia = (float) 107.9;
                }                
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
        
        if  (OnOff) {
                    
            //Si la radio es AM
            if (AmFm) {

                favoritoAm[boton] = frecuencia;            

            //Si la radio es FM
            } else {

                favoritosFm[boton] = frecuencia;                        
            }      
        }                
    }
    
    /**
     * 
     * @param boton: El boton del cual se quiere seleccionar la radio
     * @return: La radio guardada en dicho boton.
     */
    public float seleccionarFav(int boton) {
        
        float frecuenciaGuardada=0;
        
        if (OnOff) {
        
            //Si la radio es AM
            if (AmFm) {

                frecuenciaGuardada = favoritoAm[boton];

            //Si la radio es FM
            } else {

                frecuenciaGuardada = favoritosFm[boton];

            }   
        }                
        
        return frecuenciaGuardada;        
    }    
    
}
