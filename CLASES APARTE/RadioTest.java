/**
 * Clase tipo JUnit, encarga de probar los metodos existentes
 * @author: Oscar Juárez - 17315; Josue Florian - 17081
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RadioTest {
    
    private RadioCongfi Radio = new RadioCongfi();
    
    public RadioTest() {        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void testSwitch(){
        
        float retorno = Radio.Switch();
        float respuesta = (float) 530.0;
        assertEquals(respuesta,retorno, 0);
        
    }
    
    @Test
    public void testSiguienteFM(){
        
        float frecuenciaFM = (float) 87.9;        
        
        Radio.onOff();
        float retorno1 = Radio.siguiente(frecuenciaFM);
        float respuesta1 = (float) (frecuenciaFM + 0.2);
                
        assertEquals(respuesta1,retorno1, 0);
                        
    }
    
    @Test
    public void testSiguienteAM(){
        
        float frecuenciaAM = (float) 1610.0;
        
        Radio.onOff();
        Radio.Switch();
        float retorno2 = Radio.siguiente(frecuenciaAM);
        float respuesta2 = (float) 530.0;
        
        assertEquals(respuesta2,retorno2, 0);
        
    }
    
    @Test
    public void testAnteriorFM() {
        
        float frecuencia = (float) 87.9;
        
        Radio.onOff();
        float anterior = Radio.anterior(frecuencia);
        float respuesta = (float) 107.9;
        
        assertEquals(respuesta,anterior,0);
        
    }
    
    @Test
    public void testAnteriorAM(){
        
        float frecuencia = (float) 560;
        
        Radio.onOff();
        Radio.Switch();
        float anterior = Radio.anterior(frecuencia);
        float respuesta = frecuencia-10;
        
        assertEquals(respuesta,anterior,0);
        
    }
    
    @Test
    public void testSeleccionarFav(){
        
        float frecuenciaGuardada = (float)98.7;
        int botonApretado = 4;
        
        float respuesta = 0;
        
        //En esta simulacion, el usuario guarda la estacion 98.7 en el boton 4.
        Radio.onOff();
        Radio.guardar(frecuenciaGuardada, botonApretado);
        
        respuesta = Radio.seleccionarFav(botonApretado);
        
        assertEquals(frecuenciaGuardada,respuesta,0);
    }
}
