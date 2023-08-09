/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication77;

/**
 *
 * @author franco
 */
public class Televisor extends Electrodomestico{
    
    double resolucion=0;
    boolean TDT=false;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        this.resolucion = resolucion;
        this.TDT = TDT;
        super.Electrodomestico(precio,color,consumoEnergetico, peso);
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public double precioFinal(){
        
        double precio = super.precioFinal();
                
        if (resolucion > 30){
            precio *=0.3;
        }
        
        if (TDT){
            precio += 500;
        }
        
        return precio;
    }
    
    
    public double precioFinal(){
        
        consumo = comprobarConsumoEnergetico();
        
        switch (consumo) {
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
                System.out.println("Ocurrio un error");;
        }
        
        peso = comprobarConsumoEnergetico();
        
        if peso > 1 && peso >
    }
}
