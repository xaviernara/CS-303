package edu.pnw.cs303.hw3;

public class Earrings extends CosmeticsDecorator {
    private Avatar avatar;

    public Earrings(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {

        return "Earrings" + avatar.getCosmetics();
    }

}
