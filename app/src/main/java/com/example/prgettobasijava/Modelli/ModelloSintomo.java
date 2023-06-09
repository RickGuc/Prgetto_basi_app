package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class ModelloSintomo {

    private static int id;

    private static String descrizionesintomo;

    private static String codicesanitariopaziente;

    private static LocalDate datarilevazione;

    public ModelloSintomo(int Id, String Descrizionesintomo, String Codicesanitariopaziente, LocalDate Datarilevazione){
        id = Id;
        descrizionesintomo = Descrizionesintomo;
        codicesanitariopaziente = Codicesanitariopaziente;
        datarilevazione = Datarilevazione;
    }

    @Override
    public String toString() {
        return
                "Id=" + id +
                ", Descrizione sintomo='" + descrizionesintomo + '\'' +
                ", Codice Sanitario paziente='" + codicesanitariopaziente + '\'' +
                ", Data rilevazione=" + datarilevazione;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getDescrizionesintomo() {
        return descrizionesintomo;
    }

    public void setDescrizionesintomo(String descrizionesintomo) {
        this.descrizionesintomo = descrizionesintomo;
    }

    public static String getCodicesanitariopaziente() {
        return codicesanitariopaziente;
    }

    public void setCodicesanitariopaziente(String codicesanitariopaziente) {
        this.codicesanitariopaziente = codicesanitariopaziente;
    }

    public static LocalDate getDatarilevazione() {
        return datarilevazione;
    }

    public void setDatarilevazione(LocalDate datarilevazione) {
        this.datarilevazione = datarilevazione;
    }
}
