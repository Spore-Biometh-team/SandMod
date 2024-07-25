package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregLiquids{
    public static Liquid

    steam, cl, hcl, oxygen, dio, trio, ethanol, ethy, polyethy, sulfide, sulfuric, bio;
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
        hcl = new Liquid("hcl", Color.valueOf("ffffff")){{
            coolant = false;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        oxygen = new Liquid("oxygen", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        dio = new Liquid("dio", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        trio = new Liquid("trio", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        ethanol = new Liquid("ethanol", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        sulfide = new Liquid("sulfide", Color.valueOf("ffffff")){{
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