package com.example.prgettobasijava.Modelli;

public class ModelloDescrEsame {

    private static String nome;

    private static String tipo;

    private static int costo;

    private static String specialista;

    public ModelloDescrEsame(String Nome, String Tipo, int Costo, String Specialista){
        nome = Nome;
        tipo = Tipo;
        costo = Costo;
        specialista = Specialista;
    }

    public ModelloDescrEsame() {

    }

    @Override
    public String toString() {
        return
                "Nome='" + nome + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Costo=" + costo +
                ", Specialista='" + specialista + '\'';
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public static String getSpecialista() {
        return specialista;
    }

    public void setSpecialista(String specialista) {
        this.specialista = specialista;
    }
}
