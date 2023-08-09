/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication77;

/**
 *
 * @author franco
 */
public class JavaApplication77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Esto agrego franco");
    
    
    Electrodomestico tele = new Televisor(15.0, true, 500, "AZUL", 'A', 10);
    Electrodomestico lavadora = new Lavadora(10, 100, "NEGRO", 'B', 15);
    Electrodomestico cafetera = new Cafetera(100, "GRIS", 'A', 2, "latte", "lecheEspumada");
    
        System.out.println(tele.precioFinal());
    
}
}
