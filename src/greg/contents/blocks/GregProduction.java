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

        Furnace, Crafter, mine;
        public static void load(){
            Blocks.mechanicalDrill.requirements(Category.production, with(GregItems.copper, 50));
            mine = new MultiCrafter("mine") {{
            resolvedRecipes = Seq.with(
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.copper, 10)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 5)),
                        Seq.with()
                    ), 5f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.copper, 1)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.stone, 5)),
                        Seq.with()
                    ), 2.5f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.copper, 1)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 5)),
                        Seq.with()
                    ), 2.5f * 60f
                ),
                new Recipe(
                    new IOEntry(
                        Seq.with(ItemStack.with(Items.lead, 1)),
                        Seq.with()
                    ),
                    new IOEntry(
                        Seq.with(ItemStack.with(GregItems.copper, 10)),
                        Seq.with()
                    ), 5f * 60f
                )
            );
            }};

}};