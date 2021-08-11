/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.U.x;
import net.minecraft.ag.C;
import net.minecraft.i.j;

public class cF
extends bE {
    public static /* synthetic */ hH m;
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH k;

    @cL
    public void a(dS dS2) {
        String[] arrstring = C.f();
        Color color = k.l() ? cj.h() : Color.white;
        Iterator iterator = cF.c.e.O.iterator();
        while (iterator.hasNext()) {
            block6: {
                x x2;
                x x3;
                block7: {
                    block5: {
                        x2 = x3 = (x)iterator.next();
                        if (arrstring != null) break block5;
                        if (x2 == cF.c.s) break block6;
                        x2 = x3;
                    }
                    if (arrstring != null) break block7;
                    if (x2 == null) break block6;
                    x2 = x3;
                }
                if (arrstring == null) {
                    if (!(x2 instanceof j) && arrstring == null) continue;
                    x2 = x3;
                }
                dJ.a(x2, dS2.a(), color);
            }
            if (arrstring == null) continue;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public cF() {
        super("Tracers", a5.Visuals);
        l = new hH("Tracer Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(l);
        k = new hH("ClientColors", this, false);
        cj.b.f.b(k);
        m = new hH("Friend Highlight", this, true);
        cj.b.f.b(m);
    }
}

