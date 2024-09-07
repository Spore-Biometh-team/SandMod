package greg.contents;

import arc.graphics.*;
import mindustry.type.*;

public class GregItems{
    public static Item

    copper, lead, titanium, Bauxite, Gallium, stone, Ice, Resin, Iron, Zinc, Bronze, Aluminum, rawIron, dustAluminum, dustGallium, Silisteel, PES, Circuit, Pizza, Resistor, Transistor, Sulfur, Tube, Vacc, MS ,Buldr, CLG, Diode, Healr, NAND, MVCircuit,
    PVCS, Schizo;
    public static void load(){
        rawIron = new Item("rawIron", Color.valueOf("d99d73")){{
        }};
        Iron = new Item("Iron", Color.valueOf("d99d73")){{
        }};
        Aluminum = new Item("Aluminum", Color.valueOf("74cbdb")){{
        }};
        Zinc = new Item("Zinc", Color.valueOf("d2c1b4")){{
        }};
        Bronze = new Item("Bronze", Color.valueOf("e5955c")){{
        }};
        Resin = new Item("Resin", Color.valueOf("b26512")){{
            hardness = 1;
        }};
        Ice = new Item("Ice", Color.valueOf("99ddec")){{
            hardness = 1;
        }};
        stone = new Item("stone", Color.valueOf("918e85")){{
            hardness = 1;
        }};
        copper = new Item("copper", Color.valueOf("d99d73")){{
        }};
        lead = new Item("lead", Color.valueOf("8c7fa9")){{
        }};
        titanium = new Item("titanium", Color.valueOf("8da1e3")){{
        }};
        NAND = new Item("NAND", Color.valueOf("505050")){{
        }};
        Circuit = new Item("Circuit", Color.valueOf("505050")){{
        }};
        MVCircuit = new Item("MVCircuit", Color.valueOf("505050")){{
        }};
        MS = new Item("MS", Color.valueOf("6abe30")){{
        }};
        Silisteel = new Item("Silisteel", Color.valueOf("5a5a5a")){{
        }};
        Pizza = new Item("Pizza", Color.valueOf("b26512")){{
        }};
        Transistor = new Item("Transistor", Color.valueOf("3e3b2f")){{
        }};
        Resistor = new Item("Resistor", Color.valueOf("d3a67c")){{
        }};
        Sulfur = new Item("Sulfur", Color.valueOf("cfbd2f")){{
        }};
        Tube = new Item("Tube", Color.valueOf("ebeef5")){{
        }};
        Vacc = new Item("Vacc", Color.valueOf("ebeef5")){{
        }};
        PES = new Item("PES", Color.valueOf("ffffff")){{
        }};
        Buldr = new Item("Buldr", Color.valueOf("ffbc00")){{
        }};
        CLG = new Item("CLG", Color.valueOf("ebeef5")){{
        }};
        Diode = new Item("Diode", Color.valueOf("efeee5")){{
        }};
        Healr = new Item("Healr", Color.valueOf("84f491")){{
        }};
        PVCS = new Item("PVCS", Color.valueOf("245485")){{
        }};
        Bauxite = new Item("Bauxite", Color.valueOf("9a554a")){{
        }};
        dustGallium = new Item("dustGallium", Color.valueOf("cbcbcb")){{
        }};
        Gallium = new Item("Gallium", Color.valueOf("cbcbcb")){{
        }};
        dustAluminum = new Item("dustAluminum", Color.valueOf("4a4040")){{
        }};
        Schizo = new Item("Schizo", Color.valueOf("4a4040")){{
        }};
}};