package edu.pnw.cs303.hw3;

/**
 * The shorts cosmetics, the player can decorate their avatar with.
 */
public class Shorts extends CosmeticsDecorator {
    /**
     * The avatar that will have the Shorts cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Shorts cosmetics.
     *
     * @param avatar The avatar that will have the Shorts cosmetics equipped.
     */
    public Shorts(Avatar avatar) {

        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The Shorts cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Shorts" + avatar.getCosmetics();
    }


}
