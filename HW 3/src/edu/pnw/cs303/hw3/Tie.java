package edu.pnw.cs303.hw3;

/**
 * The tie cosmetics, the player can decorate their avatar with.
 */
public class Tie extends CosmeticsDecorator {

    /**
     * The avatar that will have the Tie cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Tie cosmetics.
     *
     * @param avatar The avatar that will have the Tie cosmetics equipped.
     */
    public Tie(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The Tie cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Tie" + avatar.getCosmetics();
    }
}
