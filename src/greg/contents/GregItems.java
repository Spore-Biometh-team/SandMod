package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregItems{
    public static Item

    copper, lead, titanium, stone, Ice, Resin, Iron, Zinc, Bronze, Aluminum, rawIron, Silisteel, PES, Circuit, Pizza, Resistor, Transistor, Sulfur, Tube, Vacc, MS ,Buldr, CLG, Diode, Healr, NAND, MVCircuit,
    PVCS;
    public static void load(){
        rawIron = new Item("rawIron", Color.valueOf("d99d73")){{
        }};
        Iron = new Item("Iron", Color.valueOf("d99d73")){{
        }};
        Aluminum = new Item("Aluminum", Color.valueOf("74cbdb")){{
        }};
        Zinc = new Item("Zinc", Color.valueOf("d2c1b4")){{
        }};
        Bronze = new Item("Bronze", Color.valueOf("d2c1b4")){{
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
        Circuit = new Item("Circuit", Color.valueOf("245485")){{
        }};
        MS = new Item("MS", Color.valueOf("6abe30")){{
        }};
        Silisteel = new Item("Silisteel", Color.valueOf("245485")){{
        }};
        Pizza = new Item("Pizza", Color.valueOf("b26512")){{
        }};
        Transistor = new Item("Transistor", Color.valueOf("3e3b2f")){{
        }};
        Resistor = new Item("Resistor", Color.valueOf("245485")){{
        }};
        Sulfur = new Item("Sulfur", Color.valueOf("245485")){{
        }};
        Tube = new Item("Tube", Color.valueOf("ebeef5")){{
        }};
        Vacc = new Item("Vacc", Color.valueOf("ebeef5")){{
        }};
        PES = new Item("PES", Color.valueOf("ffffff")){{
        }};
        Buldr = new Item("Buldr", Color.valueOf("245485")){{
        }};
        CLG = new Item("CLG", Color.valueOf("ebeef5")){{
        }};
        Diode = new Item("Diode", Color.valueOf("245485")){{
        }};
        Healr = new Item("Healr", Color.valueOf("245485")){{
        }};
        NAND = new Item("NAND", Color.valueOf("245485")){{
        }};
        MVCircuit = new Item("MVCircuit", Color.valueOf("245485")){{
        }};
        PVCS = new Item("PVCS", Color.valueOf("245485")){{
        }};
}};