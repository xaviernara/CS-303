package edu.pnw.cs303.hw3;

public class Sweater extends CosmeticsDecorator {
    /**
     * The avatar that will have the Sweater cosmetics equipped
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Sweater cosmetics
     *
     * @param avatar The avatar that will have the Sweater cosmetics equipped
     */
    public Sweater(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar
     *
     * @return The Sweater cosmetics a male or female avatar has equipped
     */
    @Override
    public String getCosmetics() {
        return "Sweater" + avatar.getCosmetics();
    }
}
