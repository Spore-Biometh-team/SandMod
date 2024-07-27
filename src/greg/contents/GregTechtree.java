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
        nodeRoot("Gregtech", GregProduction.Furnace, false, () -> {

                node(GregProduction.Boiler, () -> {
                node(GregProduction.Crafter, () ->{
                    node(GregProduction.Brewery, () -> {
                        node(GregProduction.Distillery);
                    });
                    node(GregProduction.CR);
                    node(GregProduction.Electrolyzer);
                    node(GregProduction.Solidifier);
                });
            });
            node(GregDistribution.Copperconduit);
            node(GregTurrets.pduo, () ->{
                node(GregDefenses.PEWall, () -> {
                    node(GregDefenses.PEWallLarge);
                    node(GregDefenses.PVCWall, () -> {
                        node(GregDefenses.PVCWallLarge);
                    });
                });
            });
            });   
            
    }};
