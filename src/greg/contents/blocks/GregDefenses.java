package greg.contents.blocks;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import greg.contents.*;

import static mindustry.type.ItemStack.*;


public class GregDefenses{
    public static Block

        PEWall, PEWallLarge, PVCWall, PVCWallLarge;
        public static void load(){
        PEWall = new Wall("PEWall"){{
            requirements(Category.defense, with(GregItems.PES, 5, Items.metaglass, 10));
            health = 50 * 12;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};

        PEWallLarge = new Wall("PEWallLarge"){{
            requirements(Category.defense, ItemStack.mult(PEWall.requirements, 5));
            health = 50 * 24;
            size = 2;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};

        PVCWall = new Wall("PVCWall"){{
            requirements(Category.defense, with(GregItems.PVCS, 5, GregItems.CLG, 10));
            health = 150 * 4;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};

        PVCWallLarge = new Wall("PVCWallLarge"){{
            requirements(Category.defense, ItemStack.mult(PVCWall.requirements, 5));
            health = 150 * 4 * 4;
            size = 2;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
}};