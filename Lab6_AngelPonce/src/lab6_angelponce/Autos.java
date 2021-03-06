package lab6_angelponce;

public class Autos {
    
    private String VIN,marca, modelo, tipocarroceria, cantidadpasajeros, capacidadmaletero, //en litros 
    color;
    private double precio;
    private String potenciamotor; //(en caballos de fuerza).
    private String duenio;
    
    public Autos() {
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    
    public Autos(String VIN, String marca, String modelo, 
            String tipocarroceria, String cantidadpasajeros, 
            String capacidadmaletero, String color, int precio, String potenciamotor) {
        this.VIN = VIN;
        this.marca = marca;
        this.modelo = modelo;
        this.tipocarroceria = tipocarroceria;
        this.cantidadpasajeros = cantidadpasajeros;
        this.capacidadmaletero = capacidadmaletero;
        this.color = color;
        this.precio = precio;
        this.potenciamotor = potenciamotor;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipotipocarroceria() {
        return tipocarroceria;
    }

    public void setTipotipocarroceria(String tipocarroceria) {
        this.tipocarroceria = tipocarroceria;
    }

    public String getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    public void setCantidadpasajeros(String cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

    public String getCapacidadmaletero() {
        return capacidadmaletero;
    }

    public void setCapacidadmaletero(String capacidadmaletero) {
        this.capacidadmaletero = capacidadmaletero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPotenciamotor() {
        return potenciamotor;
    }

    public void setPotenciamotor(String potenciamotor) {
        this.potenciamotor = potenciamotor;
    }

    @Override
    public String toString() {
        return "VIN=" + VIN 
                + ", \nmarca=" + marca 
                + ", \nmodelo=" + modelo 
                + ",\ntipo carroceria=" + tipocarroceria 
                + ",\ncantidad pasajeros=" + cantidadpasajeros 
                + ",\ncapacidad maletero=" + capacidadmaletero 
                + ",\ncolor=" + color 
                + ",\nprecio=" + precio 
                + ",\npotenciamotor=" + potenciamotor + '\n';
    }

    
    
 
    
    
}
