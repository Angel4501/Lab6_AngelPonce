package lab6_angelponce;

import java.util.ArrayList;

public class Clientes {
    
     private String ID, nombre, apellido, nacionalidad, lugartrabajo, puestotrabajo, nombreusuario, 
             pass;
     private double dinero;
    private ArrayList<String> vinLista; //lista de los vin de los carros que compró

    public Clientes() {
    }

    public Clientes(String ID, String nombre, String apellido, 
            String nacionalidad, String lugartrabajo, 
            String puestotrabajo, String nombreusuario, String pass, double dinero, ArrayList<String> vinLista) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.lugartrabajo = lugartrabajo;
        this.puestotrabajo = puestotrabajo;
        this.nombreusuario = nombreusuario;
        this.pass = pass;
        this.dinero = dinero;
        this.vinLista = vinLista;
    }

    public Clientes(String ID, String nombre, String apellido, String nacionalidad, String lugartrabajo, String puestotrabajo, String nombreusuario, String pass, double dinero) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.lugartrabajo = lugartrabajo;
        this.puestotrabajo = puestotrabajo;
        this.nombreusuario = nombreusuario;
        this.pass = pass;
        this.dinero = dinero;
    }
    
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugartrabajo() {
        return lugartrabajo;
    }

    public void setLugartrabajo(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }

    public String getPuestotrabajo() {
        return puestotrabajo;
    }

    public void setPuestotrabajo(String puestotrabajo) {
        this.puestotrabajo = puestotrabajo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<String> getVinLista() {
        return vinLista;
    }

    public void setVinLista(ArrayList<String> vinLista) {
        this.vinLista = vinLista;
    }

    @Override
    public String toString() {
        return "Clientes{" + "\nID=" + ID 
                + ",\nnombre=" + nombre 
                + ",\napellido=" + apellido 
                + ",\nnacionalidad=" + nacionalidad 
                + ",\nlugar trabajo=" + lugartrabajo 
                + ",\npuesto trabajo=" + puestotrabajo 
                + ",\nnombre usuario=" + nombreusuario 
                + ",\npassword=" + pass 
                + ",\ndinero=" + dinero 
                + ",\nvin=" + vinLista + '}';
    }
    
    
    
}
