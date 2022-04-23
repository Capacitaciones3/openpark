package com.evaluacion.openpark.model;

import com.evaluacion.openpark.enums.Especialidad;

import javax.persistence.Entity;

public class Entrenador extends Postulante{
    private Especialidad especialidad;
    private float sueldo;

    public Entrenador(String nombre, int fecha_nacimiento, int dni, float altura, int peso) {
        super(nombre, fecha_nacimiento, dni, altura, peso);
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
