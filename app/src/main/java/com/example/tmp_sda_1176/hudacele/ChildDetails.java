package com.example.tmp_sda_1176.hudacele;

public class ChildDetails {

    String name;
    String balance;
    int idPicture;

    public ChildDetails(String name, String balance, int idPicture) {
        this.name = name;
        this.balance = balance;
        this.idPicture = idPicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getIdPicture() {
        return idPicture;
    }

    public void setIdPicture(int idPicture) {
        this.idPicture = idPicture;
    }
}
