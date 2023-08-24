package Reflection;

import java.util.Arrays;
import java.util.List;

public enum NigeriaGeoPoliticalZone {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-river","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");
    private final List<String> states;
    NigeriaGeoPoliticalZone(String... states){
        this.states = Arrays.asList(states);
    }
    public List<String> getStates() {
        return states;
    }
}
