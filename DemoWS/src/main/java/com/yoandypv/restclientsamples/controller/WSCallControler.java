package com.yoandypv.restclientsamples.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.yoandypv.restclientsamples.pruebas.PruebaWSConsumer;
import com.yoandypv.restclientsamples.pruebas.PruebaWSReporte;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("WSCall")
public class WSCallControler {

    @PostMapping(value = "Exec")
    public String exec(@RequestParam String tipoDocumento, @RequestParam String numeroDocumento) throws JsonProcessingException {
        PruebaWSConsumer pruebaWSConsumer = new PruebaWSConsumer();
        String salida = pruebaWSConsumer.Ejecutar(tipoDocumento,numeroDocumento);

        String reporteSentinel = "";

        PruebaWSReporte pruebaWSReporte = new PruebaWSReporte();
        reporteSentinel = pruebaWSReporte.EjecutarReporte(salida);


        return reporteSentinel; ///"Executar from public endpoint";
    }


    @PostMapping(value = "login")
    public String login(@RequestParam String username, @RequestParam String password)
    {
        return "login from public endpoint";

    }

}
