package greg.contents.blocks;

import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import greg.contents.*;


import static mindustry.type.ItemStack.*;


public class GregOverride{
    public static Block

        ID, Furnace, Crafter, Boiler;
        public static void load(){
            // Blocks.groundFactory.plans = Seq.with(
            //     new UnitPlan(UnitTypes.dagger, 60f * 15, with(Items.silicon, 10, Items.lead, 10)),
            //     new UnitPlan(UnitTypes.crawler, 60f * 10, with(Items.silicon, 8, Items.coal, 10)),
            //     new UnitPlan(UnitTypes.nova, 60f * 40, with(Items.silicon, 30, Items.lead, 20, Items.titanium, 20))
            // );
            Blocks.duo.requirements(Category.turret, with(GregItems.copper, 115, GregItems.MS, 1, GregItems.PES, 25));
            Blocks.scatter.requirements(Category.turret, with(GregItems.copper, 115, GregItems.lead, 250, GregItems.MS, 1, GregItems.PES, 100));
            Blocks.scorch.requirements(Category.turret, with(GregItems.copper, 75, Items.graphite, 45, GregItems.MS, 1, GregItems.PES, 25));
            Blocks.hail.requirements(Category.turret, with(GregItems.copper, 75, Items.graphite, 45, GregItems.MS, 1, GregItems.PES, 25));
            Blocks.arc.requirements(Category.turret, with(GregItems.copper, 75, GregItems.lead, 65, GregItems.MS, 1, GregItems.PES, 25));
            Blocks.lancer.requirements(Category.turret, with(GregItems.copper, 225, GregItems.lead, 115, GregItems.titanium, 50, Items.silicon, 115, GregItems.MS, 1, GregItems.PES, 100));
            Blocks.salvo.requirements(Category.turret, with(GregItems.copper, 225, GregItems.titanium, 75, Items.silicon, 115, GregItems.MS, 1, GregItems.PES, 100));
            Blocks.parallax.requirements(Category.turret, with(Items.silicon, 120, GregItems.titanium, 175, GregItems.MS, 1, GregItems.PVCS, 100));
            Blocks.segment.requirements(Category.turret, with(Items.silicon, 275, Items.thorium, 225,  Items.phaseFabric, 80,GregItems.MS, 1, GregItems.PVCS, 100));
            Blocks.mechanicalDrill.requirements(Category.production, with(GregItems.copper, 50));
            Blocks.mechanicalDrill.consumeLiquid(GregLiquids.steam, 2f / 60f);
            Blocks.mechanicalDrill.researchCost = with(GregItems.copper, 5);
            Blocks.pneumaticDrill.requirements(Category.production, with(GregItems.copper, 75, Items.graphite, 25));
            Blocks.laserDrill.requirements(Category.production, with(GregItems.circuit, 1, GregItems.titanium, 125, GregItems.silisteel, 75));
            Blocks.cultivator.requirements(Category.production, with(GregItems.circuit, 1, GregItems.copper, 75, GregItems.lead, 75, GregItems.silisteel, 25));
            Blocks.conveyor.requirements(Category.distribution, with(GregItems.bronze, 1));
            Blocks.itemBridge.requirements(Category.distribution, with(GregItems.bronze, 15));
            Blocks.distributor.requirements(Category.distribution, with(GregItems.bronze, 25));
            Blocks.router.requirements(Category.distribution, with(GregItems.bronze, 5));
            Blocks.junction.requirements(Category.distribution, with(GregItems.bronze, 5));
            Blocks.sorter.requirements(Category.distribution, with(GregItems.bronze, 25));
            Blocks.invertedSorter.requirements(Category.distribution, with(GregItems.bronze , 25));
            Blocks.overflowGate.requirements(Category.distribution, with(GregItems.bronze, 25));
            Blocks.underflowGate.requirements(Category.distribution, with(GregItems.bronze, 25));
            Blocks.conveyor.researchCost = with(GregItems.bronze, 25);
            Blocks.plastaniumWall.requirements(Category.defense, BuildVisibility.editorOnly, with());
            Blocks.plastaniumWallLarge.requirements(Category.defense, BuildVisibility.editorOnly, with());
            Blocks.airFactory.requirements(Category.defense, BuildVisibility.editorOnly, with());
            Blocks.groundFactory.requirements(Category.defense, BuildVisibility.editorOnly, with());
            Blocks.navalFactory.requirements(Category.defense, BuildVisibility.editorOnly, with());
            Blocks.copperWallLarge.requirements(Category.defense, with(GregItems.copper, 25));
            Blocks.copperWall.requirements(Category.defense, with(GregItems.copper, 5));
            Blocks.titaniumWallLarge.requirements(Category.defense, with(GregItems.titanium, 25));
            Blocks.titaniumWall.requirements(Category.defense, with(GregItems.titanium, 5));
            Blocks.combustionGenerator.requirements(Category.power, with(GregItems.copper, 75, GregItems.lead, 60));
            Blocks.graphitePress.requirements(Category.crafting, with(GregItems.copper, 95, GregItems.lead, 115));
            Blocks.siliconSmelter.requirements(Category.crafting, with(GregItems.copper, 95, GregItems.lead, 115));
            Blocks.coreShard.requirements(Category.effect, BuildVisibility.editorOnly, with(GregItems.copper, 1000, GregItems.lead, 800));
            Blocks.duneWall.itemDrop = GregItems.stone;
            Blocks.iceWall.itemDrop = GregItems.ice;
            Blocks.basalt.itemDrop = GregItems.stone;
            Blocks.ice.itemDrop = GregItems.ice;
            Blocks.deepwater.attributes.set(GregWater.truewater, 0.3f);
            Blocks.water.attributes.set(GregWater.truewater, 0.15f);
            Blocks.taintedWater.attributes.set(GregWater.truewater, 0.3f);
            Blocks.deepTaintedWater.attributes.set(GregWater.truewater, 0.15f);
            Blocks.sandWater.attributes.set(GregWater.truewater, 0.15f);
            Blocks.darksandWater.attributes.set(GregWater.truewater, 0.15f);
            Blocks.whiteTree.itemDrop = GregItems.resin;
            UnitTypes.crawler.weapons.add(new Weapon("Crawlmegadeath"){{
                shootOnDeath = true;
                reload = 24f;
                shootCone = 180f;
                ejectEffect = Fx.none;
                shootSound = Sounds.explosion;
                x = shootY = 0f;
                mirror = false;
                bullet = new BulletType(){{
                    collidesTiles = false;
                    collides = false;
                    hitSound = Sounds.explosion;
                    incendChance = 100f;
                    incendSpread = 50f;
                    incendAmount = 100;
                    rangeOverride = 30f;
                    hitEffect = Fx.pulverize;
                    speed = 0f;
                    splashDamageRadius = 95f;
                    instantDisappear = true;
                    splashDamage = 900f;
                    killShooter = true;
                    hittable = false;
                    collidesAir = true;
                }};
            }});
            UnitTypes.alpha.mineWalls = true;
            UnitTypes.alpha.buildSpeed = 0.1f;
            UnitTypes.alpha.mineTier = 2;
            UnitTypes.beta.mineWalls = true;
            UnitTypes.beta.buildSpeed = 0.5f;
            UnitTypes.beta.mineTier = 2;
            UnitTypes.gamma.mineWalls = true;
            UnitTypes.gamma.buildSpeed = 1.5f;
            UnitTypes.mono.buildSpeed = 0.05f;

}};