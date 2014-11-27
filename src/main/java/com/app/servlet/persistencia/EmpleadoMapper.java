package com.app.servlet.persistencia;

import com.app.servlet.modelo.Empleado;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by GEINER on 26/11/2014.
 */
public interface EmpleadoMapper {

    @Select(value = "select codprovi as provincia,nombprovi as desc_provincia from provincia")
    @Results(value = {
            @Result(javaType = Empleado.class),
            @Result(property = "provincia", column = "provincia"),
            @Result(property = "desc_provincia", column = "desc_provincia")
    })
    List<Empleado> Provincias();

    @Select(value = "select coddistri as distrito,nombdistri as desc_distrito from distrito where codprovi=#{idprov}")
    @Results(value = {
            @Result(javaType = Empleado.class),
            @Result(property = "distrito", column = "provindistritocia"),
            @Result(property = "desc_distrito", column = "desc_distrito")
    })
    List<Empleado> Distritos(@Param("idprov")int idprov);

    @Insert(value = "insert into empleado(nombemple,apepater,dni,direccion,codprovi,coddistri) VALUES(\n" +
            "#{worker.nombres},\n" +
            "#{worker.apellidos},\n" +
            "#{worker.dni},\n" +
            "#{worker.direccion},\n" +
            "#{worker.provincia},\n" +
            "#{worker.distrito}\n" +
            ")")
    void grabar(@Param("worker") Empleado worker);
}
