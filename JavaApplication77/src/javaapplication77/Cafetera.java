
package javaapplication77;


public class Cafetera extends Electrodomestico{
    private String latte;
    private String lecheEspumada;
    
    public Cafetera(double precio, String color, char consumoEnergetico, double peso, String latte, String lecheEspumada){
        super(precio, color, consumoEnergetico, peso);
        this.latte = latte;
        this.lecheEspumada = lecheEspumada;
    }

    public String getLatte() {
        return latte;
    }

    public void setLatte(String latte) {
        this.latte = latte;
    }

    public String getLecheEspumada() {
        return lecheEspumada;
    }

    public void setLecheEspumada(String lecheEspumada) {
        this.lecheEspumada = lecheEspumada;
    }
    
    @Override
    public double precioFinal() {
        precio= super.precioFinal();
        if (latte.equalsIgnoreCase("si")){
            precio = precio+500;
        if (lecheEspumada.equalsIgnoreCase("si"))
            precio = precio+500;
        }
        return precio;
    }
    
    
    
    
    
}
