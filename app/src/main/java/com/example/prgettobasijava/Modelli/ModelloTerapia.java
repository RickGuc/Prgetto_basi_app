package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class ModelloTerapia {

    private static int id;

    private static String nometerapia;

    private static String codicesanitariopaziente;

    private static int idcontrazione;

    private static String operatoresanitario;

    private static String caregiver;

    private static LocalDate datainizio;

    private static LocalDate datafine;

    private static String note;

    public ModelloTerapia(int Id, String Nometerapia, String Codicesanitariopaziente, int IdContrazione, String Operatoresanitario, String Caregiver, LocalDate Datainizio, LocalDate Datafine, String Note){
        id = Id;
        nometerapia = Nometerapia;
        codicesanitariopaziente = Codicesanitariopaziente;
        idcontrazione = IdContrazione;
        operatoresanitario = Operatoresanitario;
        caregiver = Caregiver;
        datainizio = Datainizio;
        datafine = Datafine;
        note = Note;
    }

    @Override
    public String toString() {
        return "ModelloTerapia{" +
                "id=" + id +
                ", nometerapia='" + nometerapia + '\'' +
                ", codicesanitariopaziente='" + codicesanitariopaziente + '\'' +
                ", idcontrazione=" + idcontrazione +
                ", operatoresanitario='" + operatoresanitario + '\'' +
                ", caregiver='" + caregiver + '\'' +
                ", datainizio=" + datainizio +
                ", datafine=" + datafine +
                ", note='" + note + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNometerapia() {
        return nometerapia;
    }

    public void setNometerapia(String nometerapia) {
        this.nometerapia = nometerapia;
    }

    public static String getCodicesanitariopaziente() {
        return codicesanitariopaziente;
    }

    public void setCodicesanitariopaziente(String codicesanitariopaziente) {
        this.codicesanitariopaziente = codicesanitariopaziente;
    }

    public static int getIdcontrazione() {
        return idcontrazione;
    }

    public void setIdcontrazione(int idcontrazione) {
        this.idcontrazione = idcontrazione;
    }

    public static String getOperatoresanitario() {
        return operatoresanitario;
    }

    public void setOperatoresanitario(String operatoresanitario) {
        this.operatoresanitario = operatoresanitario;
    }

    public static String getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    public static LocalDate getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(LocalDate datainizio) {
        this.datainizio = datainizio;
    }

    public static LocalDate getDatafine() {
        return datafine;
    }

    public void setDatafine(LocalDate datafine) {
        this.datafine = datafine;
    }

    public static String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
