package greg.contents.blocks;

import arc.graphics.*;
import mindustry.entities.bullet.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.Sounds;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.draw.*;
import mindustry.world.meta.Env;
import mindustry.content.*;
import greg.contents.*;


import static mindustry.type.ItemStack.*;


public class GregTurrets{
    public static Block

        pduo, Groundshaker;
        public static void load(){
        pduo = new ItemTurret("pduo"){{
            requirements(Category.turret, with(GregItems.copper, 35));
            ammo(
                GregItems.stone,  new BasicBulletType(2.5f, 17){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 1;
                    reloadMultiplier = 0.6f;
                }},
                Items.copper, new BasicBulletType(2.5f, 9){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                    ammoMultiplier = 2;
                }}
            );

            shoot = new ShootAlternate(3.5f);

            recoils = 2;
            drawer = new DrawTurret(){{
                for(int i = 0; i < 2; i ++){
                    int f = i;
                    parts.add(new RegionPart("-barrel-" + (i == 0 ? "l" : "r")){{
                        progress = PartProgress.recoil;
                        recoilIndex = f;
                        under = true;
                        moveY = -1.5f;
                    }});
                }
            }};

            recoil = 0.5f;
            shootY = 3f;
            reload = 50f;
            range = 0f;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 125;
            inaccuracy = 2f;
            rotateSpeed = 2f;
            consumeLiquid(GregLiquids.steam, 6f / 60f);
            researchCostMultiplier = 0.05f;
            //tf is this!?!?!
            // limitRange();
        }};
    
        Groundshaker = new ItemTurret("Groundshaker"){{
            requirements(Category.turret, with(GregItems.copper, 1125, GregItems.titanium, 725, GregItems.schizo, 800));

            reload = 35f;
            shake = 6f;
            range = 90f;
            recoil = 5f;

            shoot = new ShootSpread(3, 20f);

            shootCone = 30;
            size = 3;
            envEnabled |= Env.space;

            scaledHealth = 220;
            shootSound = Sounds.shotgun;
            coolant = consumeCoolant(0.3f);

            float brange = range + 10f;

            ammo(
                GregItems.schizo, new ShrapnelBulletType(){{
                    length = brange;
                    damage = 225f;
                    ammoMultiplier = 1f;
                    width = 17f;
                    reloadMultiplier = 1.3f;
                    fragBullets = 3;
                    shootEffect = smokeEffect = GregFX.schizoShoot;
                    toColor = Color.valueOf("4a4040");
                    fragBullet = new BasicBulletType(3f, 1){{
                        fragBullets = 10;
                        damage = 1f;
                        width = 17f;
                        height = 15f;
                        smokeEffect = GregFX.schizoShoot;
                        toColor = Color.valueOf("4a4040");
                        fragBullet = new ShrapnelBulletType(){{
                            length = brange;
                            damage = 100f;
                            width = 17f;
                            smokeEffect = GregFX.schizoShoot;
                            toColor = Color.valueOf("4a4040");
                        }};
                    }};
                }}
            );
        }};

        }};