package javaapplication77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        List<String> correcto = Arrays.asList("A", "B", "C", "D", "E", "F");
        String letter = String.valueOf(letra);

        if (correcto.contains(letter.toUpperCase())) {
            return letra;
        } else {
            return 'F';
        }

    }

    public String comprobarColor(String color) {
        List<String> coloresCorrectos = Arrays.asList("BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS");

        if (coloresCorrectos.contains(color.toUpperCase())) {
            return color;
        } else {
            return "BLANCO";
        }

    }
    
    
    public double precioFinal(){
             
        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;                
                break;
            case 'B':
                precio += 800;                
                break;
            case 'C':
                precio += 600;                
                break;
            case 'D':
                precio += 500;                
                break;
            case 'E':
                precio += 300;                
                break;
            case 'F':
                precio += 100;                
                break;
            default:
                System.out.println("Ocurrio un error");
        }
        
        if (peso>=1 && peso<=19){
            precio+=100;
        } 
          if (peso >= 20 && peso<=49){
            precio+=500;
          }
           if (peso >= 50 && peso<=79){
            precio+=800;
          }
            if (peso>=80){
            precio+=1000;
          }
    }
  
}
