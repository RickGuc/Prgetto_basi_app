package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class ModelloPatologia {

    private static int id;

    private static String patologia;

    private static String codicesanitario;

    private static LocalDate datarilevazione;


    public ModelloPatologia(int Id, String Patologia, String Codicesanitario, LocalDate Datarilevazione){
        id = Id;
        patologia = Patologia;
        codicesanitario = Codicesanitario;
        datarilevazione = Datarilevazione;
    }

    public ModelloPatologia(){

    }

    @Override
    public String toString() {
        return "ModelloPatologie{" +
                "id=" + id +
                ", patologia='" + patologia + '\'' +
                ", codicesanitario='" + codicesanitario + '\'' +
                ", datarilevazione=" + datarilevazione +
                '}';
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public static String getCodicesanitario() {
        return codicesanitario;
    }

    public void setCodicesanitario(String codicesanitario) {
        this.codicesanitario = codicesanitario;
    }

    public static LocalDate getDatarilevazione() {
        return datarilevazione;
    }

    public void setDatarilevazione(LocalDate datarilevazione) {
        this.datarilevazione = datarilevazione;
    }
}
