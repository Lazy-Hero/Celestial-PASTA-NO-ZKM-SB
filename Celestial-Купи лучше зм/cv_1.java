/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class cv
extends bE {
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH m;

    public cv() {
        super("Chams", a5.Visuals);
        k = new hH("Chams Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(k);
        m = new hH("Chams Alpha", this, 0.2f, 0.2, 1.0, 0.1f);
        cj.b.f.b(m);
        l = new hH("Client Colored", this, false);
        cj.b.f.b(l);
    }
}

