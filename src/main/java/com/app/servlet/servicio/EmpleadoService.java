package com.app.servlet.servicio;

import com.app.servlet.modelo.Empleado;

import java.util.List;


public interface EmpleadoService {
    List<Empleado> Provincias();

    List<Empleado> Distritos(int idprov);

    void grabar(Empleado worker);
}
