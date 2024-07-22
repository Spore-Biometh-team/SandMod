package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregLiquids{
    public static Liquid

    steam, cl, dio, ethanol, ethy, polyethy;
    public static void load(){
        steam = new Liquid("steam", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        cl = new Liquid("cl", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        dio = new Liquid("dio", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        ethanol = new Liquid("ethanol", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        ethy = new Liquid("ethy", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        polyethy = new Liquid("polyethy", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
}};