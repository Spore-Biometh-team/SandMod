package greg.contents.blocks;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import greg.contents.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;


public class GregDefenses{
    public static Block

        PEWall, PEWallLarge, PVCWall, PVCWallLarge;
        public static void load(){
        PEWall = new Wall("PEWall"){{
            requirements(Category.defense, with(GregItems.PES, 5, Items.metaglass, 10));
            health = 50 * 4;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};

        PEWallLarge = new Wall("PEWallLarge"){{
            requirements(Category.defense, ItemStack.mult(PEWall.requirements, 5));
            health = 50 * 8;
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