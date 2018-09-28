package edu.pnw.cs303.hw3;

public class Jeans extends CosmeticsDecorator {

    private Avatar avatar;

    public Jeans(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Jeans" + avatar.getCosmetics();
    }
}
