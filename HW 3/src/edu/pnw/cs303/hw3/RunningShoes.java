package edu.pnw.cs303.hw3;

public class RunningShoes extends CosmeticsDecorator {
    /**
     * The avatar that will have the Running Shoes cosmetics equipped
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Running Shoes cosmetics
     *
     * @param avatar The avatar that will have the Running Shoes cosmetics equipped
     */
    public RunningShoes(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar
     *
     * @return The Running Shoes cosmetics a male or female avatar has equipped
     */
    @Override
    public String getCosmetics() {
        return "Running Shoes" + avatar.getCosmetics();
    }
}
