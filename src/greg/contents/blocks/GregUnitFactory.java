package greg.contents.blocks;

import arc.struct.Seq;
import mindustry.type.Category;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.content.*;
import greg.contents.*;

import static mindustry.type.ItemStack.*;



public class GregUnitFactory{
    public static UnitFactory
        groundFactory, airFactory, navalFactory;

        public static void load(){
        groundFactory = new UnitFactory("groundFactory"){{
            requirements(Category.units, with(GregItems.copper, 50, GregItems.lead, 120, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.dagger, 60f * 15, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.crawler, 60f * 10, with(GregItems.Silisteel, 5, GregItems.Circuit, 1, GregItems.MS, 1, Items.pyratite, 15)),
                new UnitPlan(UnitTypes.nova, 60f * 40, with(GregItems.Silisteel, 20, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Healr, 1, GregItems.Buldr, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
        airFactory= new UnitFactory("airFactory"){{
            requirements(Category.units, with(GregItems.copper, 25, GregItems.lead, 45, Items.silicon, 60));
            plans = Seq.with(
                new UnitPlan(UnitTypes.mono, 60f * 15, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Buldr, 1)),
                new UnitPlan(UnitTypes.flare, 60f * 10, with(GregItems.Silisteel, 5, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.alpha, 60f * 25, with(GregItems.Silisteel, 35, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Buldr, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
        navalFactory = new UnitFactory("navalFactory"){{
            requirements(Category.units, with(GregItems.copper, 145, GregItems.titanium, 50, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.retusa, 60f * 60, with(GregItems.Silisteel, 30, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Healr, 1)),
                new UnitPlan(UnitTypes.risso, 60f * 45, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
}};