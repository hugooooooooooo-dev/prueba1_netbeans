/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gt.edu.umg.proyectocalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("prueba para metodo sumar");
        int x = -2;
        int y = 3;
        //creamos un objeto
        Calculadora calc = new Calculadora();
        //valor esperado
        int esperado = 1;
        //obtenemos resultado calculado por el metodo
        //enviamos los valores de prueba
        int resultado = calc.sumar(x, y);
        //comparamos valor esperado y valor devuelto por el metodo
        assertEquals(esperado, resultado);
    }

    @Test
    public void testRestar() {
        System.out.println("prueba para metodo restar");
        int x = 7;
        int y = -8;
        Calculadora calc = new Calculadora();
        int esperado = 15;
        int resultado = calc.restar(x, y);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("prueba para metodo multiplicar");
        int x = 1;
        int y = 0;
        Calculadora calc = new Calculadora();
        int valorespe = 2;
        int resultado = calc.multiplicar(x, y);
        assertEquals(valorespe, resultado);
    }
    
}
