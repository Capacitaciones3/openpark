package com.evaluacion.openpark.model;

import com.evaluacion.openpark.enums.Plan;
import com.evaluacion.openpark.enums.TipoPago;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "postulante")
public class Postulante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int fecha_nacimiento;
    private int dni;
    private float altura;
    private int peso;
    private Plan plan = Plan.BASIC;
    private Domicilio domicilio;
    private TipoPago pago = TipoPago.EFECTIVO;

    public Postulante() {
    }
    public Postulante(String nombre, int fecha_nacimiento, int dni, float altura, int peso) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    public Postulante(String nombre, int fecha_nacimiento, int dni, float altura, int peso, Domicilio domicilio) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.domicilio = domicilio;
    }

    public Postulante(String nombre, int fecha_nacimiento, int dni, float altura, int peso, Plan plan, Domicilio domicilio, TipoPago pago) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.plan = plan;
        this.domicilio = domicilio;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public TipoPago getPago() {
        return pago;
    }

    public void setPago(TipoPago pago) {
        this.pago = pago;
    }
}
