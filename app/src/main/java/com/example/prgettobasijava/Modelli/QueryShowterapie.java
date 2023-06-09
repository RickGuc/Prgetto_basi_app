package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class QueryShowterapie {
    String CodFisc;
    String Terapia;
    String Patologia;
    String OpSan;
    String Caregiver;
    LocalDate DataInizio;
    LocalDate DataFine;
    String Note;

    public QueryShowterapie(String codFisc, String terapia, String patologia, String opSan, String caregiver, LocalDate dataInizio, LocalDate dataFine, String note){
        CodFisc = codFisc;
        Terapia = terapia;
        Patologia = patologia;
        OpSan = opSan;
        Caregiver = caregiver;
        DataInizio = dataInizio;
        DataFine = dataFine;
        Note = note;
    }

    public String getCodFisc() {
        return CodFisc;
    }

    public void setCodFisc(String codFisc) {
        CodFisc = codFisc;
    }

    public String getTerapia() {
        return Terapia;
    }

    public void setTerapia(String terapia) {
        Terapia = terapia;
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

    public String getCaregiver() {
        return Caregiver;
    }

    public void setCaregiver(String caregiver) {
        Caregiver = caregiver;
    }

    public LocalDate getDataInizio() {
        return DataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        DataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return DataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        DataFine = dataFine;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    @Override
    public String toString() {
        return
                "Codice Fiscale='" + CodFisc + '\'' +
                ", Terapia='" + Terapia + '\'' +
                ", Patologia='" + Patologia + '\'' +
                ", Operatore sanitario='" + OpSan + '\'' +
                ", Caregiver='" + Caregiver + '\'' +
                ", Data inizio=" + DataInizio +
                ", Data fine=" + DataFine +
                ", Note='" + Note + '\'';
    }
}
