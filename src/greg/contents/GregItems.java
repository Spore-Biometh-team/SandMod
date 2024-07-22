package greg.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class GregItems{
    public static Item

    copper, lead, stone, Ice, Resin, Iron, Silisteel, Circuit, Pizza, Resistor, Transistor, Sulfur, Tube, Vacc, MS ,Buldr, CLG, Diode, Healr, NAND, Mvcircuit;
    public static void load(){
        Iron = new Item("Iron", Color.valueOf("d99d73")){{
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
        Mvcircuit = new Item("Mvcircuit", Color.valueOf("245485")){{
        }};
}};