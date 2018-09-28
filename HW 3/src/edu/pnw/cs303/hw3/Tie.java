package edu.pnw.cs303.hw3;

public class Tie extends CosmeticsDecorator {
    private Avatar avatar;

    public Tie(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Tie" + avatar.getCosmetics();
    }
}
