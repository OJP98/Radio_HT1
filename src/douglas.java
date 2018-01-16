/**
 * interfaz del programa
 * @author: Oscar Juárez - 17315; Josue Florian - 17
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

public interface douglas {
    
    public void onOff(boolean estado);
    
    public void Switch(boolean tipo);
        
    public float siguiente(float frecuencia);
    
    public float anterior(float frecuencia);     
       
    public void guardar(float frecuencia, int boton);
    
    public float seleccionarFav(int boton);
}
