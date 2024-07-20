package greg.contents;

import greg.contents.blocks.*;

public class GregLoader {
    public static void load(){
        GregOverride.load();
        GregTurrets.load();
        GregProduction.load();
    }
}