package com.example.prgettobasijava.Modelli;

public class Query4 {
    private String Nome;
    private String OperatoreSanitario;
    private String Caregiver;

    public Query4(String nome, String operatoreSanitario, String caregiver){
        Nome = nome;
        OperatoreSanitario = operatoreSanitario;
        Caregiver = caregiver;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getOperatoreSanitario() {
        return OperatoreSanitario;
    }

    public void setOperatoreSanitario(String operatoreSanitario) {
        OperatoreSanitario = operatoreSanitario;
    }

    public String getCaregiver() {
        return Caregiver;
    }

    public void setCaregiver(String caregiver) {
        Caregiver = caregiver;
    }

    @Override
    public String toString() {
        return
                "Nome='" + Nome + '\'' +
                ", Operatore sanitario='" + OperatoreSanitario + '\'' +
                ", Caregiver='" + Caregiver + '\'';
    }
}
