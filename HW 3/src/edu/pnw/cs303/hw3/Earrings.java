package edu.pnw.cs303.hw3;

public class Earrings extends CosmeticsDecorator {

    /**
     * The avatar that will have the earrings cosmetics equipped
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the earrings cosmetics
     *
     * @param avatar The avatar that will have the earrings cosmetics equipped
     */
    public Earrings(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar
     *
     * @return The earrings cosmetics a male or female avatar has equipped
     */
    @Override
    public String getCosmetics() {

        return "Earrings" + avatar.getCosmetics();
    }

}
