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

        ID, Furnace, Crafter, Boiler, PDD, CR, Brewery, Distillery, Solidifier, Electrolyzer;
        public static void load(){
            Furnace = new MultiCrafter("Furnace") {{
            requirements(Category.crafting, with(GregItems.stone, 80));
            menu = "simple";
            researchCostMultiplier = 0.05f;
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
                        Seq.with(ItemStack.with(GregItems.rawIron, 5, Items.coal, 10)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Iron, 1)),
                        Seq.with()
                    ), 60f * 60f
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
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.sand, 20, Items.coal, 5)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Tube, 6)),
                        Seq.with()
                    ), 60f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.silicon, 3, GregItems.Iron, 5)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Silisteel, 1)),
                        Seq.with()
                    ), 30f * 60f
                )
            );
            }};
            Crafter = new MultiCrafter("Crafter") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 450));
            menu = "simple";
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 6, GregItems.lead, 4,Items.coal, 4)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Resistor, 3)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.CLG, 2, GregItems.Transistor, 1, GregItems.Pizza, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 35f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.MS, 1)),
                        Seq.with()
                    ), 60f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 9, GregItems.Tube, 1, GregItems.Silisteel, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Vacc, 1)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 20, GregItems.Resin, 9)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Pizza, 1)),
                        Seq.with()
                    ), 25f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.lead, 5, GregItems.Pizza, 1, GregItems.Silisteel, 1, GregItems.Resistor, 2, GregItems.Vacc, 2)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
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
            explosionPuddleLiquid = GregLiquids.steam;
            explosionPuddleAmount = 20f;
            hasItems = true;
            hasPower = true;
            consumeEffect = Fx.smeltsmoke;
            outputLiquid = new LiquidStack(GregLiquids.steam, 12f / 60f);
            liquidCapacity = 600f;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.water), new DrawLiquidTile(GregLiquids.steam){{drawLiquidLight = true;}}, new DrawDefault());
            consumeItem(Items.coal, 2);
            consumeLiquid(Liquids.water, 12f / 60f);
            researchCostMultiplier = 0.05f;
        }};
        PDD = new Separator("PDD"){{
            requirements(Category.production, with(GregItems.copper, 220, GregItems.lead, 175));
            results = with(
                GregItems.rawIron, 1,
                Items.titanium, 1,
                Items.lead, 2,
                Items.copper, 2
            );
            hasPower = true;
            craftTime = 150f;
            size = 2;
            itemCapacity = 50;
            consumeItems(with(Items.coal, 10));
            consumeLiquid(GregLiquids.steam, 0.3f);

            // drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(), new DrawRegion("-spinner", 3, true), new DrawDefault());
        }};
            CR = new MultiCrafter("CR") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 450, GregItems.Circuit, 5));
            menu = "simple";
            liquidCapacity = 16000f;
            fluidOutputDirections = new int[]{2, 4};
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"), 
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    //input
                    new IOEntry(
                        //Items
                        Seq.with(ItemStack.with(GregItems.Sulfur, 1)),
                        //Liquids and power
                        Seq.with(LiquidStack.with(GregLiquids.oxygen, 666f / 60f)),
                        420f / 60f
                    ),
                    //output
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.dio, 333f / 60f))
                    ), 3f * 60f
                ),
                new Recipe(
                    //input
                    new IOEntry(
                        //Items
                        Seq.with(ItemStack.with(GregItems.Iron, 1)),
                        //Liquids and power
                        Seq.with(LiquidStack.with(GregLiquids.hcl, 150f / 60f)),
                        1800f / 60f
                    ),
                    //output
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.ironiiicl, 50f / 60f, Liquids.hydrogen, 150f / 60f))
                    ), 20f * 60f
                ),
                new Recipe(
                    //input
                    new IOEntry(
                        //Items
                        Seq.with(ItemStack.with(GregItems.Iron, 1)),
                        //Liquids and power
                        Seq.with(LiquidStack.with(GregLiquids.hcl, 150f / 60f)),
                        1800f / 60f
                    ),
                    //output
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.ironiiicl, 50f / 60f, Liquids.hydrogen, 150f / 60f))
                    ), 20f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.dio, 100f / 60f ,GregLiquids.oxygen, 100f / 60f)),
                        420f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.trio, 100f / 60f))
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.trio, 125f / 60f ,Liquids.water, 125f / 60f)),
                        500f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.sulfuric, 125f / 60f))
                    ), 8f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.sulfuric, 16f / 60f, GregLiquids.ethanol, 16f / 60f)),
                        7200f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.ethy, 16f / 60f))
                    ), 60f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.ethy, 18f / 60f, GregLiquids.oxygen, 125f / 60f)),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.polyethy, 26f / 60f))
                    ), 8f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            Brewery = new MultiCrafter("Brewery") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.Circuit, 1));
            menu = "simple";
            liquidCapacity = 16000f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"), 
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.sporePod, 1)),
                        Seq.with(),
                        180f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.bio, 6f / 60f))
                    ), 3f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            Distillery = new MultiCrafter("Distillery") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.Circuit, 3));
            menu = "simple";
            liquidCapacity = 16000f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"),
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.bio, 333f / 60f)),
                        120f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.ethanol, 166f / 60f))
                    ), 3f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            Solidifier = new MultiCrafter("Solidifier") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.Circuit, 2));
            menu = "simple";
            liquidCapacity = 16000f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"),
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.Ice, 5)),
                        Seq.with(LiquidStack.with(GregLiquids.bio, 77f / 60f)),
                        420f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.PES, 1)),
                        Seq.with()
                    ), 2f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            Electrolyzer = new MultiCrafter("Electrolyzer") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.Circuit, 2));
            menu = "simple";
            liquidCapacity = 16000f;
            fluidOutputDirections = new int[]{2, 4};
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            drawer = new DrawMulti(new DrawRegion("-bottom"),
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(Liquids.water, 13f / 60f)),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(GregLiquids.oxygen, 13f / 60f, Liquids.hydrogen, 26f / 60f))
                    ), 75f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
}};