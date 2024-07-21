package greg.contents.blocks;

import arc.struct.Seq;
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
import multicraft.*;


import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;


public class GregProduction{
    public static Block

        ID, Furnace, Crafter, Boiler;
        public static void load(){
            Furnace = new MultiCrafter("Furnace") {{
            researchCostMultiplier = 0.05f;
            requirements(Category.crafting, with(GregItems.stone, 80));
            size = 2;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.copper, 5, Items.coal, 2)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 1)),
                        Seq.with()
                    ), 30f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.lead, 5, Items.coal, 5)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.lead, 1)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Ice, 5, Items.coal, 1)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(Liquids.water, 6f / 60f))
                    ), 10f * 60f
                )
            );
            }};
            Crafter = new MultiCrafter("Crafter") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 450));
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 8, Items.coal, 4)),
                        Seq.with(LiquidStack.with(GregLiquids.Steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Resistor, 3)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 9, GregItems.Tube, 1, GregItems.Silisteel, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.Steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Vacc, 1)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 20, GregItems.Resin, 9)),
                        Seq.with(LiquidStack.with(GregLiquids.Steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Pizza, 1)),
                        Seq.with()
                    ), 25f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.lead, 5, GregItems.Pizza, 1, GregItems.Silisteel, 1, GregItems.Resistor, 2, GregItems.Vacc, 2)),
                        Seq.with(LiquidStack.with(GregLiquids.Steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Circuit, 1)),
                        Seq.with()
                    ), 60f * 60f
                )
            );
            }};
        ID = new ItemSource("ID"){{
            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        Boiler = new ConsumeGenerator("Boiler"){{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 55));
            health = 320;
            powerProduction = 0f;
            explodeOnFull = true;
            explosionPuddles = 5;
            explosionPuddleRange = 4f;
            explosionPuddleLiquid = GregLiquids.Steam;
            explosionPuddleAmount = 20f;
            hasItems = true;
            hasPower = true;
            consumeEffect = Fx.smeltsmoke;
            outputLiquid = new LiquidStack(GregLiquids.Steam, 12f / 60f);
            liquidCapacity = 600f;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.water), new DrawLiquidTile(GregLiquids.Steam){{drawLiquidLight = true;}}, new DrawDefault());
            consumeItem(Items.coal, 2);
            consumeLiquid(Liquids.water, 12f / 60f);
            researchCostMultiplier = 0.05f;
        }};

}};