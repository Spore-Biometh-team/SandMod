package greg.contents.blocks;

import arc.struct.Seq;
import mindustry.entities.units.*;
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


public class GregOverride{
    public static Block

        ID, Furnace, Crafter, Boiler;
        public static void load(){
            Blocks.copperWallLarge.requirements(Category.defense, with(GregItems.copper, 25));
            Blocks.copperWall.requirements(Category.defense, with(GregItems.copper, 5));
            Blocks.duo.requirements(Category.turret, with(GregItems.copper, 115, GregItems.MS, 1));  
            Blocks.scatter.requirements(Category.turret, with(GregItems.copper, 115, GregItems.lead, 250, GregItems.MS, 1));
            Blocks.scorch.requirements(Category.turret, with(GregItems.copper, 75, Items.graphite, 45, GregItems.MS, 1));
            Blocks.mechanicalDrill.requirements(Category.production, with(GregItems.copper, 50));
            Blocks.mechanicalDrill.consumeLiquid(GregLiquids.steam, 6f / 60f);
            Blocks.mechanicalDrill.researchCost = with(GregItems.copper, 5);
            Blocks.pneumaticDrill.requirements(Category.production, with(GregItems.copper, 75, Items.graphite, 25));
            Blocks.laserDrill.requirements(Category.production, with(GregItems.Circuit, 1, GregItems.copper, 125, GregItems.Silisteel, 75));
            Blocks.conveyor.requirements(Category.distribution, with(GregItems.stone, 1));
            Blocks.router.requirements(Category.distribution, with(GregItems.stone, 3));
            Blocks.junction.requirements(Category.distribution, with(GregItems.stone, 2));
            Blocks.sorter.requirements(Category.distribution, with(GregItems.stone, 10));
            Blocks.invertedSorter.requirements(Category.distribution, with(GregItems.copper, 5, GregItems.stone , 10));
            Blocks.overflowGate.requirements(Category.distribution, with(GregItems.stone, 10));
            Blocks.underflowGate.requirements(Category.distribution, with(GregItems.copper, 5, GregItems.stone, 10));
            Blocks.conveyor.researchCost = with(GregItems.stone, 25);
            Blocks.plastaniumWall.requirements(Category.defense, with(GregItems.PES, 5, Items.metaglass, 2));
            Blocks.plastaniumWallLarge.requirements(Category.defense, with(GregItems.PES, 25, Items.metaglass, 50));
            Blocks.duneWall.itemDrop = GregItems.stone;
            Blocks.iceWall.itemDrop = GregItems.Ice;
            Blocks.whiteTree.itemDrop = GregItems.Resin;
            UnitTypes.alpha.mineWalls = true;
            UnitTypes.alpha.mineTier = 2;
            UnitTypes.beta.mineWalls = true;
            UnitTypes.beta.mineTier = 2;
            UnitTypes.gamma.mineWalls = true;

}};