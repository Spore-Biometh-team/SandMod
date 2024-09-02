package greg.contents.blocks;


import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.liquid.*;
import greg.contents.*;

import static mindustry.type.ItemStack.*;


public class GregDistribution{
    public static Block

        Copperconduit, Copperliquidrouter, Copperliquidjunction, Stoneconveyor;
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
        Stoneconveyor = new Conveyor("Stoneconveyor"){{
            requirements(Category.distribution, with(GregItems.stone, 10));
            health = 45;
            speed = 0.005f;
            displayedSpeed = 2.2f;
            buildCostMultiplier = 2f;
        }};
}};