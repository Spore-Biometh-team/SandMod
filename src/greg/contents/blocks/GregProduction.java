package greg.contents.blocks;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import greg.contents.*;
import multicraft.*;


import static mindustry.type.ItemStack.*;

public class GregProduction{
    public static Block

        ID, Furnace, Crafter, Boiler, PDD, CR, Brewery, Distillery, Solidifier, MVSolidifier, Electrolyzer, PAlloyer, Circuitassembler, Assembler, ThermalCentrifuge, ElectricFurnace,
        LVConstructor, gerbFisher;
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
                        Seq.with(ItemStack.with(GregItems.iron, 1)),
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
                        Seq.with(ItemStack.with(GregItems.ice, 3, Items.coal, 1)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(),
                        Seq.with(LiquidStack.with(Liquids.water, 12f / 60f))
                    ), 8f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.sand, 20, Items.coal, 5)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.tube, 6)),
                        Seq.with()
                    ), 60f * 60f
                )
            );
            }};
            PAlloyer = new MultiCrafter("PAlloyer") {{
            requirements(Category.crafting, with(GregItems.copper, 175, GregItems.lead, 50));
            menu = "simple";
            researchCostMultiplier = 0.05f;
            size = 2;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 6, GregItems.aluminum, 4, GregItems.zinc, 4)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.bronze, 1)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.silicon, 3, GregItems.iron, 5)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.silisteel, 1)),
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
                        Seq.with(ItemStack.with(GregItems.resistor, 3)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.CLG, 2, GregItems.transistor, 1, GregItems.pizza, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 36f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.MS, 1)),
                        Seq.with()
                    ), 60f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 9, GregItems.tube, 1, GregItems.silisteel, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.vacc, 1)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 20, GregItems.resin, 9)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 12f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.pizza, 1)),
                        Seq.with()
                    ), 25f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.lead, 5, GregItems.pizza, 1, GregItems.silisteel, 1, GregItems.resistor, 2, GregItems.vacc, 2)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 32f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.circuit, 1)),
                        Seq.with()
                    ), 30f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.diode, 2, GregItems.pizza, 1, GregItems.silisteel, 1, GregItems.resistor, 2, GregItems.circuit, 3)),
                        Seq.with(LiquidStack.with(GregLiquids.steam, 32f / 60f))
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.MVcircuit, 1)),
                        Seq.with()
                    ), 45f * 60f
                )
            );
            researchCostMultiplier = 0.01f;
            }};
        ID = new ItemSource("ID"){{
            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        Boiler = new ConsumeGenerator("Boiler"){{
            requirements(Category.crafting, with(GregItems.copper, 75, GregItems.lead, 45));
            health = 450;
            size = 3;
            powerProduction = 0f;
            explodeOnFull = true;
            explosionPuddles = 15;
            explosionPuddleRange = 8f;
            explosionPuddleLiquid = GregLiquids.steam;
            explosionPuddleAmount = 50f;
            hasItems = true;
            hasPower = true;
            consumeEffect = Fx.smeltsmoke;
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.24f;
            liquidCapacity = 600f;
            itemCapacity = 25;
            itemDuration = 240f;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.water), new DrawLiquidTile(GregLiquids.steam){{drawLiquidLight = true;}}, new DrawDefault());
            consumeItem(Items.coal, 2);
            consumeLiquid(Liquids.water, 18f / 60f);
            outputLiquid = new LiquidStack(GregLiquids.steam, 24f / 60f);
            researchCostMultiplier = 0.01f;
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
        // EDD = new Separator("EDD"){{
        //     requirements(Category.production, with(GregItems.copper, 220, GregItems.lead, 175));
        //     results = with(
        //         GregItems.rawIron, 1,
        //         Items.titanium, 1,
        //         Items.lead, 2,
        //         Items.copper, 2
        //     );
        //     hasPower = true;
        //     craftTime = 150f;
        //     size = 2;
        //     itemCapacity = 50;
        //     consumePower(2f);

        //     // drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(), new DrawRegion("-spinner", 3, true), new DrawDefault());
        // }};
            CR = new MultiCrafter("CR") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 450, GregItems.circuit, 5, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
            liquidCapacity = 16000f;
            fluidOutputDirections = new int[]{2, 4};
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            
            drawer = new DrawMulti(new DrawRegion("-bottom"), 
            // new DrawLiquidTile(GregLiquids.oxygen), 
            // new DrawLiquidTile(GregLiquids.dio), 
            new DrawDefault());
            resolvedRecipes = Seq.with(
                new Recipe(
                    //input
                    new IOEntry(
                        //Items
                        Seq.with(ItemStack.with(GregItems.sulfur, 1)),
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
                        Seq.with(ItemStack.with(GregItems.iron, 1)),
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
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.circuit, 1, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
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
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.circuit, 3, GregItems.silisteel, 24));
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
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.circuit, 2, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
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
                        Seq.with(ItemStack.with(GregItems.ice, 5)),
                        Seq.with(LiquidStack.with(GregLiquids.polyethy, 77f / 60f)),
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
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.circuit, 2, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
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
            Circuitassembler = new MultiCrafter("Circuitassembler") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.MVcircuit, 2, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
            liquidCapacity = 16000f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.lead, 2, GregItems.pizza, 1, GregItems.silisteel, 1, GregItems.resistor, 2, GregItems.vacc, 1)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.circuit, 1)),
                        Seq.with()
                    ), 45f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            Assembler = new MultiCrafter("Assembler") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.circuit, 6, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
            liquidCapacity = 16000f;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 5, GregItems.lead, 2,Items.coal, 2)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.resistor, 4)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 4, GregItems.dustGallium, 1,Items.metaglass, 2)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.diode, 16)),
                        Seq.with()
                    ), 15f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.CLG, 2, GregItems.transistor, 1, GregItems.pizza, 1)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.MS, 1)),
                        Seq.with()
                    ), 30f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 4, GregItems.tube, 9, GregItems.silisteel, 4)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.vacc, 9)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 10, GregItems.resin, 9)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.pizza, 1)),
                        Seq.with()
                    ), 25f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.silisteel, 1, GregItems.aluminum, 1)),
                        Seq.with(LiquidStack.with(GregLiquids.polyethy, 36f / 60f)),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.transistor, 8)),
                        Seq.with()
                    ), 4f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            MVSolidifier = new MultiCrafter("MVSolidifier") {{
            requirements(Category.crafting, with(GregItems.copper, 150, GregItems.lead, 150, GregItems.MVcircuit, 2, GregItems.aluminum, 24));
            menu = "simple";
            health = 450;
            size = 2;
            placeablePlayer = false;
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
                        Seq.with(ItemStack.with(GregItems.ice, 5)),
                        Seq.with(LiquidStack.with(GregLiquids.polyethy, 77f / 60f)),
                        420f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.PES, 1)),
                        Seq.with()
                    ), 2f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.ice, 5)),
                        Seq.with(LiquidStack.with(GregLiquids.pvcl, 77f / 60f)),
                        420f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.PVCS, 1)),
                        Seq.with()
                    ), 2f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            ThermalCentrifuge = new MultiCrafter("ThermalCentrifuge") {{
            requirements(Category.crafting, with(GregItems.copper, 450, GregItems.lead, 350, GregItems.circuit, 4, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
            hasPower = true;
            hasItems = true;
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.bauxite, 64)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.dustAluminum, 32, GregItems.dustGallium, 1)),
                        Seq.with()
                    ), 270f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            ElectricFurnace = new MultiCrafter("ElectricFurnace") {{
            requirements(Category.crafting, with(GregItems.copper, 450, GregItems.lead, 350, GregItems.circuit, 4, GregItems.silisteel, 24));
            menu = "simple";
            health = 450;
            size = 2;
            hasPower = true;
            hasItems = true;
            size = 2;
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.dustAluminum, 1)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.aluminum, 1)),
                        Seq.with()
                    ), 10f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.dustGallium, 1)),
                        Seq.with(),
                        1800f / 60f
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.gallium, 1)),
                        Seq.with()
                    ), 10f * 60f
                )
            );
            powerCapacity = 2048f;
            }};
            LVConstructor = new Constructor("LVConstructor"){{
            requirements(Category.units, with(GregItems.copper, 450, GregItems.lead, 350, GregItems.MVcircuit, 4, GregItems.silisteel, 24));
            regionSuffix = "-dark";
            hasPower = true;
            buildSpeed = 0.6f;
            consumePower(2f);
            size = 3;
            filter = Seq.with(GregProduction.MVSolidifier);

            gerbFisher = new AttributeCrafter("gerbFisher"){{
                requirements(Category.production, with(Items.copper, 25, Items.lead, 25, Items.silicon, 10));
                outputItem = new ItemStack(GregItems.gerbe, 1);
                craftTime = 100;
                size = 2;
                hasLiquids = true;
                hasPower = true;
                hasItems = true;

                craftEffect = Fx.none;
                attribute = GregWater.truewater;

                maxBoost = 2f;
                new DrawParticles(){{
                    color = Color.valueOf("d4f0ff");
                    alpha = 0.6f;
                    particleSize = 4f;
                    particles = 10;
                    particleRad = 12f;
                    particleLife = 140f;
                }};
                consumePower(80f / 60f);
                consumeLiquid(Liquids.water, 18f / 60f);
            }};
        }};
}};