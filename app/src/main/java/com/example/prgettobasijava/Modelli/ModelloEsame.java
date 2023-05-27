package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;
import java.time.LocalTime;

public class ModelloEsame {

    private static int id;

    private static String nomeesame;

    private static LocalDate data;

    private static LocalTime ora;

    private static String codicesanitariopaziente;

    private static int idpatologia;

    private static String operatoresanitario;

    private static int idospedale;

    public ModelloEsame(int Id, String NomeEsame, LocalDate Data, LocalTime Ora, String Codicesanitariopaziente, int Idpatologia, String Operatoresanitario, int Idospedale){
        id = Id;
        nomeesame = NomeEsame;
        data = Data;
        ora = Ora;
        codicesanitariopaziente = Codicesanitariopaziente;
        idpatologia = Idpatologia;
        operatoresanitario = Operatoresanitario;
        idospedale = Idospedale;
    }

    public ModelloEsame(){

    }

    @Override
    public String toString() {
        return "ModelloEsame{" +
                "id=" + id +
                ", nomeesame='" + nomeesame + '\'' +
                ", data=" + data +
                ", ora=" + ora +
                ", codicesanitariopaziente='" + codicesanitariopaziente + '\'' +
                ", idpatologia=" + idpatologia +
                ", operatoresanitario='" + operatoresanitario + '\'' +
                ", idospedale=" + idospedale +
                '}';
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNomeesame() {
        return nomeesame;
    }

    public void setNomeesame(String nomeesame) {
        this.nomeesame = nomeesame;
    }

    public static LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public static LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public static String getCodicesanitariopaziente() {
        return codicesanitariopaziente;
    }

    public void setCodicesanitariopaziente(String codicesanitariopaziente) {
        this.codicesanitariopaziente = codicesanitariopaziente;
    }

    public static int getIdpatologia() {
        return idpatologia;
    }

    public void setIdpatologia(int idpatologia) {
        this.idpatologia = idpatologia;
    }

    public static String getOperatoresanitario() {
        return operatoresanitario;
    }

    public void setOperatoresanitario(String operatoresanitario) {
        this.operatoresanitario = operatoresanitario;
    }

    public static int getIdospedale() {
        return idospedale;
    }

    public void setIdospedale(int idospedale) {
        this.idospedale = idospedale;
    }
}
