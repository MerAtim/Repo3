package javaapplication77;

public class Lavadora extends Electrodomestico {

    private double Carga;

    public Lavadora() {
    }

    public void Constructor_todos() {
        this.Precio=Precio;
        this.Color=Color;
        this.ConsumoEnergetico=ConsumoEnergetico;
        this.Peso=Peso;
        this.Carga=Carga;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    public Object getPrecio() {
        return Precio;
    }

    public void setPrecio(Object Precio) {
        this.Precio = Precio;
    }

    public Object getColor() {
        return Color;
    }

    public void setColor(Object Color) {
        this.Color = Color;
    }

    public Object getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(Object ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public Object getPeso() {
        return Peso;
    }

    public void setPeso(Object Peso) {
        this.Peso = Peso;
    }

    @Override
  public double PrecioFinal() {
    double precio = super.PrecioFinal();
    if (Carga > 30) {
      precio += 500;
    }
    return precio;
  }
}
