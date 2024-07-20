package greg.contents;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import arc.struct.*;
import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;
import greg.contents.*;
import greg.contents.blocks.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;
import static mindustry.content.SectorPresets.*;

public class GregTechtree {
    public static void load(){
        nodeRoot("Gregtech", coreShard, false, () -> {

            node(GregProduction.Furnace, () -> {
                node(GregProduction.Boiler);
                node(GregProduction.Crafter);
            });
            });   
            node(GregTurrets.pduo); 
    }};
