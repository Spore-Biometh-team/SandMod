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
import greg.contents.*;


import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;

public class greg extends Mod{

    public greg(){
        Log.info("IM GREGGING");

        Events.on(ClientLoadEvent.class, e -> {
            
        });
    }

    @Override
    public void loadContent(){
        Log.info("IM BOUT TA GREG");
        GregItems.load();
        GregLoader.load();
    }

}