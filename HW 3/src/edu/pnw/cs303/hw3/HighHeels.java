package edu.pnw.cs303.hw3;

public class HighHeels extends CosmeticsDecorator {

    /**
     * The avatar that will have the high heels cosmetics equipped
     */
    private Avatar avatar;

    /**
     * The player has chosen to decorate their avatar with the high heels cosmetics
     *
     * @param avatar The avatar that will have the high heels cosmetics equipped
     */
    public HighHeels(Avatar avatar) {
        super();
        this.avatar = avatar;
    }

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar
     *
     * @return The high heels cosmetics a male or female avatar has equipped
     */
    @Override
    public String getCosmetics() {
        return "High Heels" + avatar.getCosmetics();
    }
}
