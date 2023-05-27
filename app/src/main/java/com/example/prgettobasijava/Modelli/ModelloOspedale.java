package com.example.prgettobasijava.Modelli;

public class ModelloOspedale {

    private int id;

    private static String nome;

    private static String città;

    private static String via;

    private static String numero;

    private static String nt;

    public ModelloOspedale( int Id, String Nome, String Città, String Via, String Numero, String Nt){
        id = Id;
        nome = Nome;
        città = Città;
        via = Via;
        numero = Numero;
        nt = Nt;
    }

    public ModelloOspedale() {

    }

    @Override
    public String toString() {
        return "ModelloOspedale{" +
               // "id=" + id +//
                ", nome='" + nome + '\'' +
                ", città='" + città + '\'' +
                ", via='" + via + '\'' +
                ", numero='" + numero + '\'' +
                ", nt=" + nt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public static String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public static String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static String getNt() {
        return nt;
    }

    public void String (String nt) {
        this.nt = nt;
    }
}
