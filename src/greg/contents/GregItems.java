package greg.contents;

import arc.graphics.*;
import mindustry.type.*;

public class GregItems{
    public static Item

    copper, lead, titanium, bauxite, gallium, stone, ice, resin, iron, zinc,
    bronze, aluminum, rawIron, dustAluminum, dustGallium, silisteel, PES,
    circuit, pizza, resistor, transistor, sulfur, tube, vacc, MS ,buldr, CLG, diode, healr,
    NAND, MVcircuit, PVCS, schizo, gerbe;
    public static void load(){
        rawIron = new Item("rawIron", Color.valueOf("d99d73")){{
        }};
        iron = new Item("iron", Color.valueOf("d99d73")){{
        }};
        aluminum = new Item("aluminum", Color.valueOf("74cbdb")){{
        }};
        zinc = new Item("zinc", Color.valueOf("d2c1b4")){{
        }};
        bronze = new Item("bronze", Color.valueOf("e5955c")){{
        }};
        resin = new Item("resin", Color.valueOf("b26512")){{
            hardness = 1;
        }};
        ice = new Item("ice", Color.valueOf("99ddec")){{
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
        circuit = new Item("Circuit", Color.valueOf("505050")){{
        }};
        MVcircuit = new Item("MVCircuit", Color.valueOf("505050")){{
        }};
        MS = new Item("MS", Color.valueOf("6abe30")){{
        }};
        silisteel = new Item("silisteel", Color.valueOf("5a5a5a")){{
        }};
        pizza = new Item("pizza", Color.valueOf("b26512")){{
        }};
        transistor = new Item("Transistor", Color.valueOf("3e3b2f")){{
        }};
        resistor = new Item("Resistor", Color.valueOf("d3a67c")){{
        }};
        sulfur = new Item("Sulfur", Color.valueOf("cfbd2f")){{
        }};
        tube = new Item("Tube", Color.valueOf("ebeef5")){{
        }};
        vacc = new Item("Vacc", Color.valueOf("ebeef5")){{
        }};
        PES = new Item("PES", Color.valueOf("ffffff")){{
        }};
        buldr = new Item("Buldr", Color.valueOf("ffbc00")){{
        }};
        CLG = new Item("CLG", Color.valueOf("ebeef5")){{
        }};
        diode = new Item("Diode", Color.valueOf("efeee5")){{
        }};
        healr = new Item("Healr", Color.valueOf("84f491")){{
        }};
        PVCS = new Item("PVCS", Color.valueOf("245485")){{
        }};
        bauxite = new Item("bauxite", Color.valueOf("9a554a")){{
        }};
        dustGallium = new Item("dustGallium", Color.valueOf("cbcbcb")){{
        }};
        gallium = new Item("Gallium", Color.valueOf("cbcbcb")){{
        }};
        dustAluminum = new Item("dustAluminum", Color.valueOf("4a4040")){{
        }};
        schizo = new Item("schizo", Color.valueOf("4a4040")){{
        }};
        gerbe = new Item("gerbe", Color.valueOf("65d453")){{
        }};
}};