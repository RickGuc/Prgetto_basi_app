package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class ModelloRicovero {

    private int id;

    private static int idOspedale;

    private static String codicesanitariopaziente;

    private static LocalDate dataricovero;

    private static LocalDate datarilascio;

    public ModelloRicovero(int Id, int IdOspedale, String Codicesanitariopaziente, LocalDate Dataricovero, LocalDate Datarilascio){
        id = Id;
        idOspedale = IdOspedale;
        codicesanitariopaziente = Codicesanitariopaziente;
        dataricovero = Dataricovero;
        datarilascio = Datarilascio;
    }

    public ModelloRicovero(){

    }

    @Override
    public String toString() {
        return "ModelloRicoveri{" +
                "id=" + id +
                ", idOspedale=" + idOspedale +
                ", codicesanitariopaziente='" + codicesanitariopaziente + '\'' +
                ", dataricovero=" + dataricovero +
                ", datarilascio=" + datarilascio +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdOspedale() {
        return idOspedale;
    }

    public void setIdOspedale(int idOspedale) {
        this.idOspedale = idOspedale;
    }

    public static String getCodicesanitariopaziente() {
        return codicesanitariopaziente;
    }

    public void setCodicesanitariopaziente(String codicesanitariopaziente) {
        this.codicesanitariopaziente = codicesanitariopaziente;
    }

    public static LocalDate getDataricovero() {
        return dataricovero;
    }

    public void setDataricovero(LocalDate dataricovero) {
        this.dataricovero = dataricovero;
    }

    public static LocalDate getDatarilascio() {
        return datarilascio;
    }

    public void setDatarilascio(LocalDate datarilascio) {
        this.datarilascio = datarilascio;
    }
}
