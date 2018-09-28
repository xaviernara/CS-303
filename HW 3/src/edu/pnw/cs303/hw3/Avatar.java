package edu.pnw.cs303.hw3;

public abstract class Avatar {

    private String cosmetics ="";

    private String gender = "";

    public String getCosmetics() {
        return cosmetics;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
