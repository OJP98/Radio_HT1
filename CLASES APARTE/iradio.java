/**
 * interfaz del programa
 * @author: Oscar Juárez - 17315; Josue Florian - 17081
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

public interface iradio {
    
    public void onOff();
    
    public float Switch();
        
    public float siguiente(float frecuencia);
    
    public float anterior(float frecuencia);     
       
    public void guardar(float frecuencia, int boton);
    
    public float seleccionarFav(int boton);
}
