package com.kbaez.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

    @Id
    @Column(name = "COD_EMPLEADO")
    private Long codigo;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    public Empleado(Long codigo, String apellido, String nombre, Date fechaNacimiento) {
        this.codigo = codigo;
        this.apellidos= apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado(){}

    public Long getCodigo() {
        return codigo;
    }

    public String getApellidoS() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo=" + codigo +
                ", apellido='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
