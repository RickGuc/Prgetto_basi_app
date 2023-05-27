package com.example.prgettobasijava.Modelli;

public class ModelloEsenzionePaziente {

    private static int codice;

    private static String codicesanitariopaziente;

    private static String esenzione;

    public ModelloEsenzionePaziente(int Codice, String Codicesanitariopaziente, String Esenzione){
        codice = Codice;
        codicesanitariopaziente = Codicesanitariopaziente;
        esenzione = Esenzione;
    }

    @Override
    public String toString() {
        return "ModelloEsenzionePaziente{" +
                "codice=" + codice +
                ", codicesanitariopaziente='" + codicesanitariopaziente + '\'' +
                ", esenzione='" + esenzione + '\'' +
                '}';
    }

    public static int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public static String getCodicesanitariopaziente() {
        return codicesanitariopaziente;
    }

    public void setCodicesanitariopaziente(String codicesanitariopaziente) {
        this.codicesanitariopaziente = codicesanitariopaziente;
    }

    public static String getEsenzione() {
        return esenzione;
    }

    public void setEsenzione(String esenzione) {
        this.esenzione = esenzione;
    }
}
