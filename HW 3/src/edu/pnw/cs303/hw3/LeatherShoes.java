package edu.pnw.cs303.hw3;

public class LeatherShoes extends CosmeticsDecorator {

    private Avatar avatar;

    public LeatherShoes(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Leather Shoes" + avatar.getCosmetics();
    }
}
