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
    
    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
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
    
    @Override
        public double precioFinal(){
        
        double precio = super.precioFinal();
                
        if (resolucion > 30){
            precio *=1.3;
        }
        
        if (TDT){
            precio += 500;
        }
        
        return precio;
    }

    }

