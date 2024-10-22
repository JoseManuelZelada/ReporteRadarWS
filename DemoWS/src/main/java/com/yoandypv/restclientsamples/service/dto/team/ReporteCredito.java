package com.yoandypv.restclientsamples.service.dto.team;

import lombok.Getter;
import lombok.Setter;


public class ReporteCredito {
    private String TDoc;         //"D",
    private String NDoc;         //"08173966",
    private String ApePat;       //"ZELADA",
    private String ApeMat;       //"DOMINGUEZ",
    private String Nom;          //"JOSE MANUEL",
    private String RazSoc;       //"ZELADA DOMINGUEZ JOSE MANUEL",
    private String NomCom;       //"-",
    private String TipCon;       //"PERSONA NATURAL SIN NEGOCIO",
    private String IniAct;       //"1999-11-23",
    private String CIIU;         //"6209",
    private String ActEco;       //"OTRAS ACTIVIDADES DE TECNOLOGÍA DE LA INFORMACIÓN Y DE SERVICIOS INFORMÁTICOS",
    private String FchInsRRPP;   //"1999-11-23",
    private String NumParReg;    //"-",
    private String Fol;          //"-",
    private String Asi;          //"-",
    private String AgeRet;       //"N",
    private String EstConC;      //"00",
    private String EstCon;       //"ACTIVO",
    private String EstDomC;      //"0",
    private String EstDom;       //"HABIDO",
    private String RelTDoc;      //"R",
    private String RelNDoc;      //"10081739663"

// Consulta Rápida

    private String FechaProceso;        //2024-09-20"
    private String Semaforos;           //VVVVVVVVVVVVVVVVVVVVVVVV"
    private String Nota;                //0.0000"
    private String NroEntFin;           //3"
    private String NEntFinNR;           //0"
    private String SemaActual;          //4"
    private String SemaPrevio;          //4"
    private String SemaPeorMejor;       //4"
    private String DeudaTotal;          //537.63"
    private String Calificativo;        //NOR 100.00% CPP 0.00% DEF 0.00% DUD 0.00% PER 0.00%"
    private String DeudaTributaria;     //0.00"
    private String DeudaLaboral;        //0.00"
    private String DeudaImpaga;         //0.00"
    private String DeudaProtestos;      //0.00"
    private String DeudaSBSMicrof;      //537.63"

    public String getFechaProceso() {
        return FechaProceso;
    }

    public void setFechaProceso(String fechaProceso) {
        FechaProceso = fechaProceso;
    }

    public String getSemaforos() {
        return Semaforos;
    }

    public void setSemaforos(String semaforos) {
        Semaforos = semaforos;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public String getNroEntFin() {
        return NroEntFin;
    }

    public void setNroEntFin(String nroEntFin) {
        NroEntFin = nroEntFin;
    }

    public String getNEntFinNR() {
        return NEntFinNR;
    }

    public void setNEntFinNR(String NEntFinNR) {
        this.NEntFinNR = NEntFinNR;
    }

    public String getSemaActual() {
        return SemaActual;
    }

    public void setSemaActual(String semaActual) {
        SemaActual = semaActual;
    }

    public String getSemaPrevio() {
        return SemaPrevio;
    }

    public void setSemaPrevio(String semaPrevio) {
        SemaPrevio = semaPrevio;
    }

    public String getSemaPeorMejor() {
        return SemaPeorMejor;
    }

    public void setSemaPeorMejor(String semaPeorMejor) {
        SemaPeorMejor = semaPeorMejor;
    }

    public String getDeudaTotal() {
        return DeudaTotal;
    }

    public void setDeudaTotal(String deudaTotal) {
        DeudaTotal = deudaTotal;
    }

    public String getCalificativo() {
        return Calificativo;
    }

    public void setCalificativo(String calificativo) {
        Calificativo = calificativo;
    }

    public String getDeudaTributaria() {
        return DeudaTributaria;
    }

    public void setDeudaTributaria(String deudaTributaria) {
        DeudaTributaria = deudaTributaria;
    }

    public String getDeudaLaboral() {
        return DeudaLaboral;
    }

    public void setDeudaLaboral(String deudaLaboral) {
        DeudaLaboral = deudaLaboral;
    }

    public String getDeudaImpaga() {
        return DeudaImpaga;
    }

    public void setDeudaImpaga(String deudaImpaga) {
        DeudaImpaga = deudaImpaga;
    }

    public String getDeudaProtestos() {
        return DeudaProtestos;
    }

    public void setDeudaProtestos(String deudaProtestos) {
        DeudaProtestos = deudaProtestos;
    }

    public String getDeudaSBSMicrof() {
        return DeudaSBSMicrof;
    }

    public void setDeudaSBSMicrof(String deudaSBSMicrof) {
        DeudaSBSMicrof = deudaSBSMicrof;
    }



    public String getRelNDoc() {
        return RelNDoc;
    }

    public void setRelNDoc(String relNDoc) {
        RelNDoc = relNDoc;
    }

    public String getRelTDoc() {
        return RelTDoc;
    }

    public void setRelTDoc(String relTDoc) {
        RelTDoc = relTDoc;
    }

    public String getEstDom() {
        return EstDom;
    }

    public void setEstDom(String estDom) {
        EstDom = estDom;
    }

    public String getEstDomC() {
        return EstDomC;
    }

    public void setEstDomC(String estDomC) {
        EstDomC = estDomC;
    }

    public String getEstCon() {
        return EstCon;
    }

    public void setEstCon(String estCon) {
        EstCon = estCon;
    }

    public String getEstConC() {
        return EstConC;
    }

    public void setEstConC(String estConC) {
        EstConC = estConC;
    }

    public String getAgeRet() {
        return AgeRet;
    }

    public void setAgeRet(String ageRet) {
        AgeRet = ageRet;
    }

    public String getAsi() {
        return Asi;
    }

    public void setAsi(String asi) {
        Asi = asi;
    }

    public String getFol() {
        return Fol;
    }

    public void setFol(String fol) {
        Fol = fol;
    }

    public String getNumParReg() {
        return NumParReg;
    }

    public void setNumParReg(String numParReg) {
        NumParReg = numParReg;
    }

    public String getFchInsRRPP() {
        return FchInsRRPP;
    }

    public void setFchInsRRPP(String fchInsRRPP) {
        FchInsRRPP = fchInsRRPP;
    }

    public String getActEco() {
        return ActEco;
    }

    public void setActEco(String actEco) {
        ActEco = actEco;
    }

    public String getCIIU() {
        return CIIU;
    }

    public void setCIIU(String CIIU) {
        this.CIIU = CIIU;
    }

    public String getIniAct() {
        return IniAct;
    }

    public void setIniAct(String iniAct) {
        IniAct = iniAct;
    }

    public String getTipCon() {
        return TipCon;
    }

    public void setTipCon(String tipCon) {
        TipCon = tipCon;
    }

    public String getNomCom() {
        return NomCom;
    }

    public void setNomCom(String nomCom) {
        NomCom = nomCom;
    }

    public String getRazSoc() {
        return RazSoc;
    }

    public void setRazSoc(String razSoc) {
        RazSoc = razSoc;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getApeMat() {
        return ApeMat;
    }

    public void setApeMat(String apeMat) {
        ApeMat = apeMat;
    }

    public String getApePat() {
        return ApePat;
    }

    public void setApePat(String apePat) {
        ApePat = apePat;
    }

    public String getNDoc() {
        return NDoc;
    }

    public void setNDoc(String NDoc) {
        this.NDoc = NDoc;
    }






    public String getTDoc() {
        return TDoc;
    }

    public void setTDoc(String TDoc) {
        this.TDoc = TDoc;
    }






}
