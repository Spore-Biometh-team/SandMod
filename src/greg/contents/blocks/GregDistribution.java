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


public class GregDistribution{
    public static Block

        Copperconduit, Copperliquidrouter, Copperliquidjunction;
        public static void load(){
        Copperconduit = new Conduit("Copperconduit"){{
            requirements(Category.liquid, with(GregItems.copper, 1));
            health = 15;
            liquidCapacity = 5f;
            liquidPressure = 0.75f;
            solid = false;
        }};
        Copperliquidrouter = new LiquidRouter("Copperliquidrouter"){{
            requirements(Category.liquid, with(GregItems.copper, 5, GregItems.lead , 5));
            liquidCapacity = 5f;
            underBullets = true;
            liquidPressure = 0.75f;
            solid = false;
        }};

        Copperliquidjunction = new LiquidJunction("Copperliquidjunction"){{
            requirements(Category.liquid, with(GregItems.copper, 5, GregItems.lead , 5));
            solid = false;
        }};
}};