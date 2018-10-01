package edu.pnw.cs303.hw3;

/**
 * The T-Shirt  cosmetics, the player can decorate their avatar with.
 */
public class TShirt extends CosmeticsDecorator {

    /**
     * The avatar that will have the T-Shirt cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the T-Shirt cosmetics.
     *
     * @param avatar The avatar that will have the T-Shirt cosmetics equipped.
     */
    public TShirt(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The T-Shirt cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return " T-Shirt" + avatar.getCosmetics();
    }
}
