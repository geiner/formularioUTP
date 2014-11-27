package com.app.servlet.modelo;

/**
 * Created by GEINER on 26/11/2014.
 */
public class Empleado {
    private String nombres;
    private String apellidos;
    private Integer dni;
    private Integer provincia;
    private Integer distrito;
    private String direccion;

    //para provincia
    private String desc_provincia;
    private String desc_distrito;

    public String getDesc_provincia() {
        return desc_provincia;
    }

    public void setDesc_provincia(String desc_provincia) {
        this.desc_provincia = desc_provincia;
    }

    public String getDesc_distrito() {
        return desc_distrito;
    }

    public void setDesc_distrito(String desc_distrito) {
        this.desc_distrito = desc_distrito;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getProvincia() {
        return provincia;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia;
    }

    public Integer getDistrito() {
        return distrito;
    }

    public void setDistrito(Integer distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
