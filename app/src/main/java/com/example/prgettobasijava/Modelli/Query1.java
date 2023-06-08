package com.example.prgettobasijava.Modelli;

public class Query1 {
    private String Nome;
    private String Cognome;
    private String Patologia;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String patologia) {
        Patologia = patologia;
    }

    public Query1(String nome, String cognome, String patologia) {
        Nome = nome;
        Cognome = cognome;
        Patologia = patologia;
    }

    public Query1() {

    }


    @Override
    public String toString() {
        return
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Patologia='" + Patologia + '\'';
    }
}
