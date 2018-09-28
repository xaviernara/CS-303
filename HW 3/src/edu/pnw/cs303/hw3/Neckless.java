package edu.pnw.cs303.hw3;

public class Neckless extends CosmeticsDecorator {
    private Avatar avatar;


    public Neckless(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Neckless" + avatar.getCosmetics();
    }


}
