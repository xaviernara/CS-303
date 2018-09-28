package edu.pnw.cs303.hw3;

public class Sweater extends CosmeticsDecorator {
    private Avatar avatar;

    public Sweater(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Sweater" + avatar.getCosmetics();
    }
}
