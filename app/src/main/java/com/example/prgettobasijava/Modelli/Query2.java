package com.example.prgettobasijava.Modelli;

public class Query2 {
    private String Nome;
    private int MediaGiorniDiGuarigione;

    public Query2(String nome, int mediaGiorniDiGuarigione){
        Nome = nome;
        MediaGiorniDiGuarigione = mediaGiorniDiGuarigione;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getMediaGiorniDiGuarigione() {
        return MediaGiorniDiGuarigione;
    }

    public void setMediaGiorniDiGuarigione(int mediaGiorniDiGuarigione) {
        MediaGiorniDiGuarigione = mediaGiorniDiGuarigione;
    }

    @Override
    public String toString() {
        return
                "Terapia='" + Nome + '\'' +
                ", Media dei giorni di guarigione=" + MediaGiorniDiGuarigione;
    }
}
