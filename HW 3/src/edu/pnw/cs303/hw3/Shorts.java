package edu.pnw.cs303.hw3;

public class Shorts extends CosmeticsDecorator {

    private Avatar avatar;

    public Shorts(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Shorts" + avatar.getCosmetics();
    }


}
