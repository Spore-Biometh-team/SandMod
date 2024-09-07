package greg.contents;

import mindustry.entities.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import arc.graphics.Color;
import arc.math.Mathf;

public class GregFX{
    public static Effect
        schizoShoot = new Effect(12f, e -> {
        color(Color.white, Color.valueOf("4a4040"), e.fin());
        stroke(e.fout() * 1.2f + 0.5f);

        randLenVectors(e.id, 7, 25f * e.finpow(), e.rotation, 50f, (x, y) -> {
            lineAngle(e.x + x, e.y + y, Mathf.angle(x, y), e.fin() * 5f + 2f);
        });
    });
}
