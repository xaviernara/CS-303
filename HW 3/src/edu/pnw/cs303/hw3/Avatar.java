package edu.pnw.cs303.hw3;

/**
 * The Avatar, the player can decorate with cosmetics and change gender.
 */
public abstract class Avatar {
    /**
     * The cosmetics a male or female avatar can have equipped by the player.
     */
    private String cosmetics = "";

    /**
     * The gender a player can pick for their avatar.
     */
    private String gender = "";

    /**
     * Gets the equipped cosmetics the player has chosen for their avatar.
     *
     * @return The cosmetics a male or female avatar has equipped.
     */
    public String getCosmetics() {
        return cosmetics;
    }

    /**
     * Gets the gender of the avatar the player has chosen.
     *
     * @return The gender of the avatar the player has chosen.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the avatar the player has chosen.
     *
     * @param gender The gender the player chose for their avatar.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
