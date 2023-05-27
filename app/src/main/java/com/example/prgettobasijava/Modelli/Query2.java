package com.example.prgettobasijava.Modelli;

public class Query2 {
    private String Nome;
    private int DifferenzaMedia;

    public Query2(String nome, int differenzaMedia){
        Nome = nome;
        DifferenzaMedia = differenzaMedia;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getDifferenzaMedia() {
        return DifferenzaMedia;
    }

    public void setDifferenzaMedia(int differenzaMedia) {
        DifferenzaMedia = differenzaMedia;
    }

    @Override
    public String toString() {
        return "Query2{" +
                "Nome='" + Nome + '\'' +
                ", DifferenzaMedia=" + DifferenzaMedia +
                '}';
    }
}
