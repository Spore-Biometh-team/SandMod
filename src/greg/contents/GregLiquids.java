package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregLiquids{
    public static Liquid

    steam, cl, hcl, oxygen, dio, trio, ethanol, ethy, polyethy, sulfide, sulfuric, bio, ironiiicl, vcl, pvcl;
    public static void load(){
        steam = new Liquid("steam", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        bio = new Liquid("bio", Color.valueOf("12ec00")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        cl = new Liquid("cl", Color.valueOf("1d945c")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        vcl = new Liquid("vcl", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        pvcl = new Liquid("pvcl", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        hcl = new Liquid("hcl", Color.valueOf("ffffff")){{
            coolant = false;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        ironiiicl = new Liquid("ironiiicl", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        oxygen = new Liquid("oxygen", Color.valueOf("56c0f5")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        dio = new Liquid("dio", Color.valueOf("aaab18")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        trio = new Liquid("trio", Color.valueOf("aaab18")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        ethanol = new Liquid("ethanol", Color.valueOf("e84b08")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        sulfide = new Liquid("sulfide", Color.valueOf("df5505")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
        ethy = new Liquid("ethy", Color.valueOf("ffffff")){{
            gas = true;
            gasColor = Color.grays(0.9f);
            // alwaysUnlocked = true;
        }};
        sulfuric = new Liquid("sulfuric", Color.valueOf("febd00")){{
            coolant = false;
        }};
        polyethy = new Liquid("polyethy", Color.valueOf("ffffff")){{
            coolant = false;
            // alwaysUnlocked = true;
        }};
}};