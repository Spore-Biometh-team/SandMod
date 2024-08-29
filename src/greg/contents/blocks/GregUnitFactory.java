package greg.contents.blocks;

import arc.graphics.g2d.TextureRegion;
import arc.struct.Seq;
import mindustry.type.Category;
import mindustry.type.PayloadSeq;
import mindustry.type.PayloadStack;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.world.blocks.units.*;
import greg.contents.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;



public class GregUnitFactory{
    public static UnitFactory
        groundFactory, airFactory, navalFactory;

        public static void load(){
        groundFactory = new UnitFactory("ground-factory"){{
            requirements(Category.units, with(Items.copper, 50, Items.lead, 120, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.dagger, 60f * 15, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.crawler, 60f * 10, with(GregItems.Silisteel, 5, GregItems.Circuit, 1, GregItems.MS, 1, Items.pyratite, 15)),
                new UnitPlan(UnitTypes.nova, 60f * 40, with(GregItems.Silisteel, 20, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Healr, 1, GregItems.Buldr, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
        airFactory= new UnitFactory("ground-factory"){{
            requirements(Category.units, with(Items.copper, 50, Items.lead, 120, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.mono, 60f * 15, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Buldr, 1)),
                new UnitPlan(UnitTypes.flare, 60f * 10, with(GregItems.Silisteel, 5, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.alpha, 60f * 40, with(GregItems.Silisteel, 35, GregItems.Circuit, 1, GregItems.MS, 1, GregItems.Buldr, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
        navalFactory = new UnitFactory("ground-factory"){{
            requirements(Category.units, with(Items.copper, 50, Items.lead, 120, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.dagger, 60f * 15, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.crawler, 60f * 10, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1)),
                new UnitPlan(UnitTypes.nova, 60f * 40, with(GregItems.Silisteel, 15, GregItems.Circuit, 1, GregItems.MS, 1))
            );
            size = 3;
            consumePower(1.2f);
        }};
}};