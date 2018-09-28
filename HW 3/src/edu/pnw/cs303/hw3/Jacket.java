package edu.pnw.cs303.hw3;

public class Jacket extends CosmeticsDecorator {

    private Avatar avatar;

    public Jacket(Avatar avatar) {
        this.avatar = avatar;
    }


    @Override
    public String getCosmetics() {
        return "Jacket" + avatar.getCosmetics();
    }
}
