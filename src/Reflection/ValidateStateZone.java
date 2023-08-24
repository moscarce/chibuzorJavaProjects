package Reflection;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateStateZone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter state");
        String userState = input.nextLine();
        NigeriaGeoPoliticalZone[] zone = NigeriaGeoPoliticalZone.values();
        for (NigeriaGeoPoliticalZone state: NigeriaGeoPoliticalZone.values()) {
            for (String states: state.getStates()) {
                if(userState.equalsIgnoreCase(states)) System.out.println(state);
            }
        }
    }
}
