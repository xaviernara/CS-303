package edu.pnw.cs303.hw3;

public class RunningShoes extends CosmeticsDecorator {

    private Avatar avatar;


    public RunningShoes(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "Running Shoes" + avatar.getCosmetics();
    }
}
