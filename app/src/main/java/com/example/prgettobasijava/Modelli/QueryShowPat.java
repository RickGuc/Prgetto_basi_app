package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class QueryShowPat {

    private String CodFisc;
    private String Patologia;
    private LocalDate Data;

    public QueryShowPat(String codFisc, String patologia, LocalDate data) {
        CodFisc = codFisc;
        Patologia = patologia;
        Data = data;
    }


    public String getCodFisc() {
        return CodFisc;
    }

    public void setCodFisc(String codFisc) {
        CodFisc = codFisc;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String patologia) {
        Patologia = patologia;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "QueryShowPat{" +
                "CodFisc='" + CodFisc + '\'' +
                ", Patologia='" + Patologia + '\'' +
                ", Data=" + Data +
                '}';
    }
}
