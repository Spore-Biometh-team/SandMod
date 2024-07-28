package greg.contents;

import mindustry.type.*;

import static mindustry.content.Planets.*;

public class GregSectors{
    public static SectorPreset
    groundZero, fungalPass;


    public static void load(){
        //region serpulo
        groundZero = new SectorPreset("groundZero", serpulo, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            overrideLaunchDefaults = true;
            noLighting = true;
            startWaveTimeMultiplier = 3f;
        }};

        // fungalPass = new SectorPreset("fungalPass", serpulo, 21){{
        //     difficulty = 4;
        // }};
    }
}