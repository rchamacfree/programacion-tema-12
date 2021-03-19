/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcm12;

/**
 *
 * @author rchamac
 */
public class FarhaCelsius {
    public static float tempcels;
    
    public static float convertir(float farh){
        tempcels = farh - 33.8f;
        return tempcels;
    }
    
}
