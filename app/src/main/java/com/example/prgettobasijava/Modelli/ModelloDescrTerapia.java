package com.example.prgettobasijava.Modelli;

public class ModelloDescrTerapia {

    private String nome;

    private String dosaggio;

    private static Integer vas;

    public ModelloDescrTerapia(String Nome, String Dosaggio, int VaS) {
       nome = Nome;
       dosaggio = Dosaggio;
       vas = VaS;

    }

    public ModelloDescrTerapia() {

    }

    @Override
    public String toString() {
        return
                "Nome='" + nome + '\'' +
                ", Dosaggio='" + dosaggio + '\'';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosaggio() {
        return dosaggio;
    }

    public void setDosaggio(String dosaggio) {
        this.dosaggio = dosaggio;
    }

    public static Integer getVas() {
        return vas;
    }

    public void setVas(int vas) {
        this.vas = vas;
    }
}
