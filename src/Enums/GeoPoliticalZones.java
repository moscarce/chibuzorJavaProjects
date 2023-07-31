package Enums;

public enum GeoPoliticalZones {
    NORTH_CENTRAL( "Kwara, Kogi, Benue, Plateau, Niger, Nasarawa, FCT Abuja"),
    NORTH_EAST( "Yobe, Borno, Taraba, Bauchi, Adamawa, Gombe"),
    NORTH_WEST( "Katsina, Sokoto, Jigawa, Kaduna, Kebbi, Kano, Zamfara"),
    SOUTH_EAST( "Anambra, Imo, Ebonyi, Enugu, Abia"),
    SOUTH_WEST( "Lagos, Ogun, Oyo, Osun, Ondo, Ekiti."),
    SOUTH_SOUTH( "Rivers, Delta, Bayelsa, Edo, Akwa Ibom, Cross River");
    private final GeoPoliticalZones states;

    GeoPoliticalZones(String states) {
        this.states = GeoPoliticalZones.valueOf(states);
    }


    public GeoPoliticalZones states(){return states;}
}
