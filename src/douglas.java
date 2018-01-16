/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUMPSTONIK
 */
public interface douglas {
    
    public void onOff(boolean estado);
    
    public void Switch(boolean tipo);
        
    public float siguiente(float frecuencia);
    
    public float anterior(float frecuencia);     
       
    public void guardar(float frecuencia, int boton);
    
    public float seleccionarFav(int boton);
}
