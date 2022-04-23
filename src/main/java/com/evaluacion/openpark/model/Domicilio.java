package com.evaluacion.openpark.model;

public class Domicilio {
    private String dirección;
    private int numero;
    private String barrio;
    private String provincia;

    public Domicilio(String dirección, int numero, String barrio, String provincia) {
        this.dirección = dirección;
        this.numero = numero;
        this.barrio = barrio;
        this.provincia = provincia;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
