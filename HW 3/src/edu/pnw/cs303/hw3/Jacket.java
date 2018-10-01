package edu.pnw.cs303.hw3;

/**
 * The Jacket cosmetics, the player can decorate their avatar with.
 */
public class Jacket extends CosmeticsDecorator {

    /**
     * The avatar that will have the Jacket cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Jacket cosmetics.
     *
     * @param avatar The avatar that will have the Jacket cosmetics equipped.
     */
    public Jacket(Avatar avatar) {
        super();
        this.avatar = avatar;
    }


    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The Jacket cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Jacket" + avatar.getCosmetics();
    }
}
