package com.yoandypv.restclientsamples.pruebas;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoandypv.restclientsamples.service.dto.team.ReporteCredito;

public class PruebaWSReporte {

    public String EjecutarReporte(String jsonReporte) throws JsonProcessingException {

        String reporteResumido ="";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode =  objectMapper.readTree(jsonReporte);
        ReporteCredito reporteCredito = new ReporteCredito();

        ///Carga Información Básica

        reporteCredito.setTDoc(jsonNode.path("respuesta").path("InfBas").path("TDoc").toString());
        reporteCredito.setNDoc(jsonNode.path("respuesta").path("InfBas").path("NDoc").toString());
        reporteCredito.setApePat(jsonNode.path("respuesta").path("InfBas").path("ApePat").toString());
        reporteCredito.setApeMat(jsonNode.path("respuesta").path("InfBas").path("ApeMat").toString());
        reporteCredito.setNom(jsonNode.path("respuesta").path("InfBas").path("Nom").toString());
        reporteCredito.setRazSoc(jsonNode.path("respuesta").path("InfBas").path("RazSoc").toString());
        reporteCredito.setTipCon(jsonNode.path("respuesta").path("InfBas").path("TipCon").toString());
        reporteCredito.setIniAct(jsonNode.path("respuesta").path("IniAct").toString());
        reporteCredito.setCIIU(jsonNode.path("respuesta").path("InfBas").path("CIIU").toString());
        reporteCredito.setAgeRet(jsonNode.path("respuesta").path("InfBas").path("AgeRet").toString());
        reporteCredito.setActEco(jsonNode.path("respuesta").path("InfBas").path("actEco").toString());
        reporteCredito.setFchInsRRPP(jsonNode.path("respuesta").path("InfBas").path("actEco").toString());
        reporteCredito.setNumParReg(jsonNode.path("respuesta").path("InfBas").path("numParReg").toString());
        reporteCredito.setFol(jsonNode.path("respuesta").path("InfBas").path("fol").toString());
        reporteCredito.setAsi(jsonNode.path("respuesta").path("Asi").toString());
        reporteCredito.setAgeRet(jsonNode.path("respuesta").path("AgeRet").toString());
        reporteCredito.setEstConC(jsonNode.path("respuesta").path("EstConC").toString());
        reporteCredito.setEstCon(jsonNode.path("respuesta").path("EstCon").toString());
        reporteCredito.setEstDomC(jsonNode.path("respuesta").path("EstDomC").toString());
        reporteCredito.setEstDom(jsonNode.path("respuesta").path("EstDom").toString());
        reporteCredito.setRelTDoc(jsonNode.path("respuesta").path("RelTDoc").toString());
        reporteCredito.setRelNDoc(jsonNode.path("respuesta").path("RelTDoc").toString());

        /// Carga Consulta Rápida

        reporteCredito.setFechaProceso(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("FechaProceso").toString());
        reporteCredito.setSemaforos(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("Semaforos").toString());
        reporteCredito.setNota(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("Nota").toString());
        reporteCredito.setNroEntFin(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("NroEntFin").toString());
        reporteCredito.setNEntFinNR(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("NEntFinNR").toString());
        reporteCredito.setSemaActual(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("SemaActual").toString());
        reporteCredito.setSemaPrevio(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("SemaPrevio").toString());
        reporteCredito.setSemaPeorMejor(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("SemaPeorMejor").toString());
        reporteCredito.setDeudaTotal(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaTotal").toString());
        reporteCredito.setCalificativo(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("Calificativo").toString());
        reporteCredito.setDeudaTributaria(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaTributaria").toString());
        reporteCredito.setDeudaLaboral(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaLaboral").toString());
        reporteCredito.setDeudaImpaga(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaImpaga").toString());
        reporteCredito.setDeudaProtestos(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaProtestos").toString());
        reporteCredito.setDeudaSBSMicrof(jsonNode.path("respuesta").path("ConRap").path("Resumen_ConRap").path("DeudaSBSMicrof").toString());

        if (reporteCredito.getTDoc() == "D")
        {

            reporteResumido = reporteResumido + "Tip Doc: "  + reporteCredito.getTDoc() + "\n";
            reporteResumido = reporteResumido + "Nom: " + reporteCredito.getNom() + "\n";
            reporteResumido = reporteResumido + "Ape Pat: " +  reporteCredito.getApePat() + "\n";
            reporteResumido = reporteResumido + "Ape Mat: " + reporteCredito.getApeMat() + "\n";
            reporteResumido = reporteResumido + "24 Semáforos: " + reporteCredito.getSemaforos()+ "\n";
            reporteResumido = reporteResumido + "DeudaTributaria: " + reporteCredito.getDeudaTributaria()+ "\n";
            reporteResumido = reporteResumido + "DeudaLaboral" + reporteCredito.getDeudaLaboral()+ "\n";
            reporteResumido = reporteResumido + "DeudaImpaga" + reporteCredito.getDeudaImpaga()+ "\n";
            reporteResumido = reporteResumido + "DeudaProtestos" + reporteCredito.getDeudaProtestos()+ "\n";
            reporteResumido = reporteResumido + "DeudaSBSMicrof" + reporteCredito.getDeudaSBSMicrof()+ "\n";
            reporteResumido = reporteResumido + "Fecha de Proceso" + reporteCredito.getFechaProceso();

        }
        else

        {
            reporteResumido = reporteResumido + "Tip Doc: "  + reporteCredito.getTDoc() + "\n";
            reporteResumido = reporteResumido + "Razón Social : " + reporteCredito.getRazSoc() + "\n";
            reporteResumido = reporteResumido + "24 Semáforos: " + reporteCredito.getSemaforos()+ "\n";
            reporteResumido = reporteResumido + "DeudaTributaria: " + reporteCredito.getDeudaTributaria()+ "\n";
            reporteResumido = reporteResumido + "DeudaLaboral" + reporteCredito.getDeudaLaboral()+ "\n";
            reporteResumido = reporteResumido + "DeudaImpaga" + reporteCredito.getDeudaImpaga()+ "\n";
            reporteResumido = reporteResumido + "DeudaProtestos" + reporteCredito.getDeudaProtestos()+ "\n";
            reporteResumido = reporteResumido + "DeudaSBSMicrof" + reporteCredito.getDeudaSBSMicrof()+ "\n";
            reporteResumido = reporteResumido + "Fecha de Proceso" + reporteCredito.getFechaProceso();

        }

        return reporteResumido;
        /*
        System.out.println("Mensaje : "+ reporteCredito.getRazSoc());
        System.out.println("Mensaje : "+ reporteCredito.getNroEntFin());
        */

    }

}
