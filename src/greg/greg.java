package greg;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
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
import greg.*;


import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;

public class greg extends Mod{

    public greg(){
        Log.info("IM GREGGING");

        Events.on(ClientLoadEvent.class, e -> {
            Blocks.pulverizer.requirements(Category.crafting, with(Items.copper, 1984, Items.lead, 1984));
        });
    }

    @Override
    public void loadContent(){
        Log.info("IM BOUT TA GREG");
        GregItem.load();
        GregLoader.load();
    }

}