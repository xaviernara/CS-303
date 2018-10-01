package edu.pnw.cs303.hw3;

/**
 * The Sunglasses Shoes cosmetics, the player can decorate their avatar with.
 */
public class Sunglasses extends CosmeticsDecorator {
    /**
     * The avatar that will have the Sunglasses cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Sunglasses cosmetics.
     *
     * @param avatar The avatar that will have the Sunglasses cosmetics equipped.
     */
    public Sunglasses(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The Sunglasses cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Sunglasses" + avatar.getCosmetics();
    }
}
