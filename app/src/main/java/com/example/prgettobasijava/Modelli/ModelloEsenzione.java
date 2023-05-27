package com.example.prgettobasijava.Modelli;

public class ModelloEsenzione {

    private static String esenzione;

    private static String nomeesame;

    public ModelloEsenzione(String Esenzione, String NomeEsame){
        esenzione = Esenzione;
        nomeesame = NomeEsame;
    }

    public ModelloEsenzione(){

    }

    @Override
    public String toString() {
        return "ModelloEsenzione{" +
                "esenzione='" + esenzione + '\'' +
                ", nomeesame='" + nomeesame + '\'' +
                '}';
    }

    public static String getEsenzione() {
        return esenzione;
    }

    public void setEsenzione(String esenzione) {
        this.esenzione = esenzione;
    }

    public static String getNomeesame() {
        return nomeesame;
    }

    public void setNomeesame(String nomeesame) {
        this.nomeesame = nomeesame;
    }
}
