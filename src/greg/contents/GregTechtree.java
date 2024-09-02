package greg.contents;

import greg.contents.blocks.*;
import static mindustry.content.TechTree.*;

public class GregTechtree {
    public static void load(){
        nodeRoot("Gregtech", GregProduction.Furnace, false, () -> {
                node(GregProduction.PAlloyer);
                node(GregProduction.Boiler, () -> {
                node(GregProduction.Crafter, () ->{
                    node(GregProduction.Brewery, () -> {
                        node(GregProduction.Distillery);
                    });
                    node(GregProduction.CR);
                    node(GregProduction.Assembler);
                    node(GregProduction.Circuitassembler);
                    node(GregProduction.Electrolyzer);
                    node(GregProduction.Solidifier);
                });
            });
            node(GregDistribution.Copperconduit, () -> {
                node(GregDistribution.Copperliquidrouter, () ->{
                    node(GregDistribution.Copperliquidjunction);
                });
            });
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
