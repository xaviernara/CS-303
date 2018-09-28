package edu.pnw.cs303.hw3;

public class HighHeels extends CosmeticsDecorator {
    private Avatar avatar;

    public HighHeels(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getCosmetics() {
        return "High Heels" + avatar.getCosmetics();
    }
}
