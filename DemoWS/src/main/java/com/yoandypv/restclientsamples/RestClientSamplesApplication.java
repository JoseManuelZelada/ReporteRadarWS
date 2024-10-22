package com.yoandypv.restclientsamples;

import com.yoandypv.restclientsamples.pruebas.PruebaWSConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestClientSamplesApplication {

    public static void main(String[] args)
    {
       SpringApplication.run(RestClientSamplesApplication.class, args);
        //PruebaWSConsumer pruebaWSConsumer = new PruebaWSConsumer();
        //pruebaWSConsumer.Ejecutar();

    }

}
