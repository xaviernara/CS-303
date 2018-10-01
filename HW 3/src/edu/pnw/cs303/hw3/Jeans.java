package edu.pnw.cs303.hw3;

/**
 * The Jeans cosmetics, the player can decorate their avatar with.
 */
public class Jeans extends CosmeticsDecorator {

    /**
     * The avatar that will have the Jeans cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Jeans cosmetics.
     *
     * @param avatar The avatar that will have the Jeans cosmetics equipped.
     */
    public Jeans(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The Jeans cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Jeans" + avatar.getCosmetics();
    }
}
