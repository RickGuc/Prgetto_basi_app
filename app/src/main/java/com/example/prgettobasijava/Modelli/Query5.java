package com.example.prgettobasijava.Modelli;

public class Query5 {
    private String Nome;
    private String Cognome;
    private String Terapia;

    public Query5(String nome, String cognome, String terapia){
      Nome = nome;
      Cognome = cognome;
      Terapia = terapia;
    }

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

    public String getTerapia() {
        return Terapia;
    }

    public void setTerapia(String terapia) {
        Terapia = terapia;
    }

    @Override
    public String toString() {
        return "Query5{" +
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Terapia='" + Terapia + '\'' +
                '}';
    }
}
