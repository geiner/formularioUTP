package com.app.servlet.controlador;

import com.app.servlet.modelo.Empleado;
import com.app.servlet.servicio.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/rest/empleado")
public class EmpleadoController {
    private static final Logger log= LoggerFactory.getLogger(EmpleadoController.class);

    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/provincias")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Empleado> listarProvincias(){
        return empleadoService.Provincias();
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/distritos/{idprov}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Empleado> listarDistritos(@PathVariable(value = "idprov") int idprov){
        return empleadoService.Distritos(idprov);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json", value = "/grabar")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String addEstadoConsolidado(@RequestBody Empleado  worker) {
        System.out.println(worker.getNombres()+" "+worker.getApellidos()+" "+worker.getDni()+" "+worker.getProvincia()+" "+worker.getDistrito()+" "
        +worker.getDireccion());
        empleadoService.grabar(worker);
        return "save";
    }
}
