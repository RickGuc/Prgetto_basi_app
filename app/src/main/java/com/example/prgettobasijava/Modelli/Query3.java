package com.example.prgettobasijava.Modelli;

public class Query3 {
    private String Ospedale;
    private int NumEsami;

    public Query3(String ospedale, int numEsami){
        Ospedale = ospedale;
        NumEsami = numEsami;
    }

    public String getOspedale() {
        return Ospedale;
    }

    public void setOspedale(String ospedale) {
        Ospedale = ospedale;
    }

    public int getNumEsami() {
        return NumEsami;
    }

    public void setNumEsami(int numEsami) {
        NumEsami = numEsami;
    }

    @Override
    public String toString() {
        return
                "Ospedale='" + Ospedale + '\'' +
                ", Numero degli esami=" + NumEsami;
    }
}
