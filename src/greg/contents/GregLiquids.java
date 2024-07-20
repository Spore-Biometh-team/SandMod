package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregLiquids{
    public static Liquid

    Steam;
    public static void load(){
        Steam = new Liquid("Steam", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
}};