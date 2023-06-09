package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;
import java.time.LocalTime;

public class QueryShowEsamiP {
    String CodFis;
    String Esame;
    LocalDate Data;
    LocalTime Ora;
    String Patologia;
    String OpSan;
    String Ospedale;

    public QueryShowEsamiP(String codFis, String esame, LocalDate data, LocalTime ora, String patologia, String opSan, String ospedale){
        CodFis = codFis;
        Esame = esame;
        Data = data;
        Ora = ora;
        Patologia = patologia;
        OpSan = opSan;
        Ospedale = ospedale;
    }

    public String getCodSan() {
        return CodFis;
    }

    public void setCodSan(String codSan) {
        CodFis = codSan;
    }

    public String getEsame() {
        return Esame;
    }

    public void setEsame(String esame) {
        Esame = esame;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public LocalTime getOra() {
        return Ora;
    }

    public void setOra(LocalTime ora) {
        Ora = ora;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String patologia) {
        Patologia = patologia;
    }

    public String getOpSan() {
        return OpSan;
    }

    public void setOpSan(String opSan) {
        OpSan = opSan;
    }

    public String getOspedale() {
        return Ospedale;
    }

    public void setOspedale(String ospedale) {
        Ospedale = ospedale;
    }

    @Override
    public String toString() {
        return
                "Codice Fiscale paziente='" + CodFis + '\'' +
                ", Esame='" + Esame + '\'' +
                ", Data=" + Data +
                ", Ora=" + Ora +
                ", Patologia='" + Patologia + '\'' +
                ", Operatore sanitario='" + OpSan + '\'' +
                ", Ospedale='" + Ospedale + '\'';
    }
}
