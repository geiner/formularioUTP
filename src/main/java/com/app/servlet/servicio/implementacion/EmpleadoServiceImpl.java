package com.app.servlet.servicio.implementacion;

import com.app.servlet.modelo.Empleado;
import com.app.servlet.persistencia.EmpleadoMapper;
import com.app.servlet.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Repository
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    EmpleadoMapper empleadoMapper;

    @Override
    public List<Empleado> Provincias() {
        return empleadoMapper.Provincias();
    }

    @Override
    public List<Empleado> Distritos(int idprov) {
        return empleadoMapper.Distritos(idprov);
    }

    @Override
    public void grabar(Empleado worker) {
        empleadoMapper.grabar(worker);
    }
}
