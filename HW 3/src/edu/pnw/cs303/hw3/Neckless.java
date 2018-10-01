package edu.pnw.cs303.hw3;

public class Neckless extends CosmeticsDecorator {
    /**
     * The avatar that will have the Neckless cosmetics equipped
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the Neckless cosmetics
     *
     * @param avatar The avatar that will have the Neckless cosmetics equipped
     */
    public Neckless(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar
     *
     * @return The Neckless cosmetics a male or female avatar has equipped
     */
    @Override
    public String getCosmetics() {
        return "Neckless" + avatar.getCosmetics();
    }


}
