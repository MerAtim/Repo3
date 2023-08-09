package javaapplication77;

public class Lavadora extends Electrodomestico {

    private double Carga;

    public Lavadora() {
    }

    public Lavadora(double Carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.Carga = Carga;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    

    @Override
  public double precioFinal() {
    double precio = super.precioFinal();
    if (Carga > 30) {
      precio += 500;
    }
    return precio;
  }
}
