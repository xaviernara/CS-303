package edu.pnw.cs303.hw3;

public class TShirt extends CosmeticsDecorator {
    private Avatar avatar;

    public TShirt(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return " T-Shirt" + avatar.getCosmetics();
    }
}
