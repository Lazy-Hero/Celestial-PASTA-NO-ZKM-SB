/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class c9
extends bE {
    public static /* synthetic */ hH k;

    @cL
    public void a(da da2) {
        Color color = new Color(k.o());
        da2.c(color.getRed());
        da2.a((float)color.getGreen());
        da2.b(color.getBlue());
    }

    public c9() {
        super("FogColor", a5.Visuals);
        k = new hH("Fog Color", (bE)this, Color.PINK.getRGB(), true);
        cj.b.f.b(k);
    }
}

