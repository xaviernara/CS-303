package edu.pnw.cs303.hw3;

/**
 * The Leather Shoes cosmetics, the player can decorate their avatar with.
 */
public class LeatherShoes extends CosmeticsDecorator {

    /**
     * The avatar that will have the LeatherShoes cosmetics equipped.
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the LeatherShoes cosmetics.
     *
     * @param avatar The avatar that will have the LeatherShoes cosmetics equipped.
     */
    public LeatherShoes(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The LeatherShoes cosmetics a male or female avatar has equipped.
     */
    @Override
    public String getCosmetics() {
        return "Leather Shoes" + avatar.getCosmetics();
    }
}
