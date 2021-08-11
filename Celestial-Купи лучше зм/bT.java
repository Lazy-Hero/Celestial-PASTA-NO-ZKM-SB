/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.U.E;
import net.minecraft.k.m;

public class bT
extends bE {
    public static /* synthetic */ hH o;
    public static /* synthetic */ hH n;
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH t;
    public static /* synthetic */ hH q;
    public static /* synthetic */ hH r;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH s;
    public static /* synthetic */ hH p;
    public static /* synthetic */ hH m;

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        String string = cj.b.f.a("ArrayList Color").m();
        this.b(string);
    }

    public bT() {
        boolean bl2 = E.f();
        super("ArrayList", a5.Hud);
        boolean bl3 = bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Custom");
        arrayList.add("Rainbow");
        arrayList.add("Pulse");
        arrayList.add("Astolfo");
        arrayList.add("None");
        arrayList.add("Category");
        cj.b.f.b(new hH("ArrayList Color", (bE)this, "Astolfo", arrayList));
        n = new hH("Background", this, true);
        cj.b.f.b(n);
        q = new hH("Border", this, true);
        cj.b.f.b(q);
        p = new hH("RectRight", this, true);
        cj.b.f.b(p);
        cj.b.f.b(new hH("BackgroundAplha", this, 1.0, 1.0, 255.0, 1.0));
        cj.b.f.b(new hH("BackgroundBright", this, 255.0, 1.0, 255.0, 1.0));
        s = new hH("One Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(s);
        t = new hH("Two Color", (bE)this, new Color(0xFF0000).getRGB(), true);
        cj.b.f.b(t);
        r = new hH("Color Time", this, 10.0, 1.0, 100.0, 1.0);
        cj.b.f.b(r);
        l = new hH("ArrayList X", this, 0.0, 0.0, 500.0, 0.1f);
        cj.b.f.b(l);
        k = new hH("ArrayList Y", this, 0.0, 0.0, 500.0, 0.1f);
        cj.b.f.b(k);
        o = new hH("Font Height", this, 10.0, 7.0, 20.0, 1.0);
        cj.b.f.b(o);
        if (net.minecraft.k.m.c()) {
            E.q(!bl3);
        }
    }

    @cL
    public void a(fn fn2) {
        bk.a(fn2.a());
    }
}

