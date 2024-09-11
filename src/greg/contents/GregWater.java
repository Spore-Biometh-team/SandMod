package greg.contents;


import mindustry.world.meta.Attribute;

public class GregWater {

    public static Attribute
            truewater;

    public static void load() {
        truewater = Attribute.add("truewater");
    }
}
