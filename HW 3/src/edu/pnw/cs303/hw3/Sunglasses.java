package edu.pnw.cs303.hw3;

public class Sunglasses extends CosmeticsDecorator {
    private Avatar avatar;

    public Sunglasses(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Sunglasses" + avatar.getCosmetics();
    }
}
