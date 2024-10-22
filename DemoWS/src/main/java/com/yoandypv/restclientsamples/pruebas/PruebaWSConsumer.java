package com.yoandypv.restclientsamples.pruebas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yoandypv.restclientsamples.service.dto.team.ReportRequest;
import com.yoandypv.restclientsamples.service.dto.team.TokenRequest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.json.JsonObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class PruebaWSConsumer {


    ///private Environment environment;

    public String Ejecutar(String cabTipoDocumento, String cabNumDocumento)
    {

        ///String message1 = environment.getProperty("password-experian");

        ///System.out.println("PASSWORD" + message1);

        //Esta variable res la usaremos únicamente para dar un respuesta final
        String resToken = "";
        String authToken = "";
        String URL = "https://api.experian.com.pe/iam/oauth2/v1/basic/token";

        try {
            //Creamos el cliente de conexión al API Restful
            Client client = ClientBuilder.newClient();

            //Creamos el target lo cuál es nuestra URL junto con el nombre del método a llamar
            WebTarget target = client.target(URL);

            //Creamos nuestra solicitud que realizará el request
            Invocation.Builder solicitudToken = target.request();
            solicitudToken.header("Content-Type", "application/json");
            solicitudToken.header("Client_Id", "V63yUUOrxLtkGVFwNfq1ylXCstbGbnP3");
            solicitudToken.header("Client_Secret", "RC2LmnVMelpuiHlG");
            solicitudToken.header("Gx_Key", "556BA842B8E1CD5C4FA692A263BEF85C");


            //Creamos y llenamos nuestro objeto TokenRequest con los datos que solicita el API
            TokenRequest reqToken = new TokenRequest();

            reqToken.setUsername("jose.zelada@gmail.com");
            reqToken.setPassword("Sc4r3cr0w!");

            //Convertimos el objeto req a un json
            Gson gsonToken = new Gson();
            String jsonStringToken = gsonToken.toJson(reqToken);

            System.out.println("********************************");
            System.out.println("jsonString");
            System.out.println("********************************");

            //Enviamos nuestro json vía post al API Restful
            Response postToken = solicitudToken.post(Entity.json(jsonStringToken));

            //Recibimos la respuesta y la leemos en una clase de tipo String, en caso de que el json sea tipo json y no string, debemos usar la clase de tipo JsonObject.class en lugar de String.class
            String responseJsonToken = postToken.readEntity(String.class);
            resToken = responseJsonToken;

            //Imprimimos el status de la solicitud
            System.out.println("Estatus: " + postToken.getStatus());

            switch (postToken.getStatus()) {
                case 200:
                    resToken = responseJsonToken;

                    System.out.println("111********************************");
                    System.out.println(responseJsonToken);
                    System.out.println("111********************************");

                    JSONObject jsonAutorizacion = new JSONObject(responseJsonToken);
                    authToken  = jsonAutorizacion.getString("access_token");
                    System.out.println("TOKEN : " + jsonAutorizacion.getString("access_token"));

                    /*
                    JSONArray jsonArray = new JSONArray(resToken);

                    for (int i = 0; i < jsonArray.length(); i++) {

                        System.out.println(jsonArray.getJSONObject(i));
                    }*/
                    break;
                default:
                    resToken = "Error";
                    break;
            }

        } catch (Exception e) {
            //En caso de un error en la solicitud, llenaremos res con la exceptión para verificar que sucedió
            resToken = e.toString();
            System.out.println("Error : " + resToken);
        }

        //Imprimimos la respuesta del API Restful
        ///System.out.println(resToken);
        ///System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        ///System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        ///System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // Esta variable resReport la usaremos únicamente para dar un respuesta final del reporte de deudas //
        //////////////////////////////////////////////////////////////////////////////////////////////////////

        String resReport = "";
        ///String authToken = "Bearer eyJraWQiOiJ1WkdGMFlXTnlaV1JwZEc4dVkyOXRMbU52SWl3aVJtbHljM1JPWVcxbElqIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJpc3MiOiJFWFBFUklBTiIsInN1YiI6Impvc2UuemVsYWRhQGdtYWlsLmNvbSIsImV4cCI6MTcyODgxNjA4MSwiaWF0IjoxNzI4ODE1NDgxLCJqdGkiOiJjMzY2MDM1OC0zZWQ5LTRlMGItOTNhMC0zMmYwODI2YjY1NDAiLCJBdXRoIjoiQVVUSC1CQVNJQyJ9.tFwMy1NzNtqoGsnBvMtZ2wrFaCpULpeRPa9eC_ZPk3f1LRov74rUzCh-hvZnCVjahUItu-9WNlU6hEDXFbTeJhnG9zKPJLyS73eNuHbLcLJVRwTrHHKTHqllQ_OyflyfnVF1k0dz4fYrkrZ3oqT74Sdp6gwBRWEe377wmvg6YrzlzKOMn8UWwiPCJOjEla-tWzlhI580BCaqaM2-MzcBOB22wINIGNp8gGfYRwyngW6PKMGHWQmfQFGN92uS20-KnZMZiZObojIT_SHoIcFIXRHm1fMW1dbVs7JirjoGJ7YVeWJjZfn7P3Aq4ZLtRR7GSYa9oLp_OFXs3oYL6UcTUQ";

        String URL2 = "https://api.experian.com.pe/modular/credit-history/v1/hdc/gethistory";
        //URL2 = "https://uat-api.experian.com.pe/modular/credit-history/v1/hdc/gethistory";
        try{

             //Creamos el cliente de conexión al API Restful
             Client client2 = ClientBuilder.newClient();

             //Creamos el target lo cuál es nuestra URL junto con el nombre del método a llamar
             WebTarget target = client2.target(URL2);


             //Creamos nuestra solicitud que realizará el request2 de datos de Historia de Crédito
             Invocation.Builder solicitudReporte = target.request();

             solicitudReporte.header("Content-Type", "application/json");
             solicitudReporte.header("Accept", "*/*");
             //solicitudReporte.header("Accept/Encoding", "gzip, deflate, br");

             solicitudReporte.header("Authorization", "Bearer " + authToken);
             solicitudReporte.header("Gx_email", "jose.zelada@gmail.com");
             solicitudReporte.header("Gx_Key", "556BA842B8E1CD5C4FA692A263BEF85C");
             solicitudReporte.header("Gx_Usuario", "08173966");
             solicitudReporte.header("Client_Id", "V63yUUOrxLtkGVFwNfq1ylXCstbGbnP3");
             solicitudReporte.header("Client_Secret", "RC2LmnVMelpuiHlG");

             ////System.out.println(" ----------> "+solicitudReporte.get().getHeaderString("Gx_Usuario"));

             //Creamos y llenamos nuestro objeto ReportRequest con los datos que solicita el API
             ReportRequest reqReport = new ReportRequest();

             reqReport.setTipDoc(cabTipoDocumento);
             reqReport.setNroDoc(cabNumDocumento);

             //Convertimos el objeto req a un json
             Gson gsonReport = new Gson();

             String jsonStringReport = gsonReport.toJson(reqReport);


             System.out.println("///********************************");
             System.out.println(jsonStringReport);
             System.out.println("///********************************");

             //Enviamos nuestro json vía post al API Restful

             Response postReport = solicitudReporte.post(Entity.json(jsonStringReport));

             //Recibimos la respuesta y la leemos en una clase de tipo String, en caso de que el json sea tipo json y no string, debemos usar la clase de tipo JsonObject.class en lugar de String.class
             String responseJsonReport = postReport.readEntity(String.class);
             resReport = responseJsonReport;

             System.out.println("222********************************");
             System.out.println(responseJsonReport);
             System.out.println("222********************************");

             //Imprimimos el status de la solicitud
            //*/System.out.println("Estatus: " + postReport.getStatus());

             switch (postReport.getStatus()) {
                case 200:
                    resReport = responseJsonReport;
                    break;
                default:
                    resReport = "Error";
                    break;
             }

        } catch (Exception e) {
             //En caso de un error en la solicitud, llenaremos res con la exceptión para verificar que sucedió
             resReport = e.toString();

        }

        //Imprimimos la respuesta del API Restful
        ///System.out.println("resReport : " + resReport);
        return resReport;

    }
}