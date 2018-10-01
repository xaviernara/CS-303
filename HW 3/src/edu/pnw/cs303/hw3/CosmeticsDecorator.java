package edu.pnw.cs303.hw3;

/**
 * The cosmetics, the player can decorate their avatar with.
 */
public abstract class CosmeticsDecorator extends Avatar {
    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The cosmetics a male or female avatar has equipped
     */
    public abstract String getCosmetics();
}
