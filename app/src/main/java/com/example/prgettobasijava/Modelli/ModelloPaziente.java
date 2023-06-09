package com.example.prgettobasijava.Modelli;

import java.time.LocalDate;

public class ModelloPaziente {

    private String Nome;
    private String Cognome;
    private LocalDate date;
    private String CodiceSanitario;
    private String CodiceFiscale;
    private String Città;
    private String Via;
    private String Numero;

    private String Genere;

    public ModelloPaziente(String nome, String cognome, LocalDate date, String codiceSanitario, String codiceFiscale, String città, String via, String numero, String genere) {
        Nome = nome;
        Cognome = cognome;
        this.date = date;
        CodiceSanitario = codiceSanitario;
        CodiceFiscale = codiceFiscale;
        Città = città;
        Via = via;
        Numero = numero;
        Genere = genere;
    }

    public ModelloPaziente() {
    }

    @Override
    public String toString() {
        return
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Data di nascita=" + date +
                ", Codice Sanitario='" + CodiceSanitario + '\'' +
                ", Codice Fiscale='" + CodiceFiscale + '\'' +
                ", Città='" + Città + '\'' +
                ", Via='" + Via + '\'' +
                ", Numero='" + Numero + '\'';
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCodiceSanitario() {
        return CodiceSanitario;
    }

    public void setCodiceSanitario(String codiceSanitario) {
        CodiceSanitario = codiceSanitario;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        CodiceFiscale = codiceFiscale;
    }

    public String getCittà() {
        return Città;
    }

    public void setCità(String città) {
        Città = città;
    }

    public String getVia() {
        return Via;
    }

    public void setVia(String via) {
        Via = via;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
}}

