/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.K.b;
import net.minecraft.ag.C;
import net.minecraft.client.q.c;

public class c7
extends bE {
    public static /* synthetic */ hH r;
    public static /* synthetic */ hH t;
    public static /* synthetic */ hH n;
    public static /* synthetic */ hH u;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH q;
    public static /* synthetic */ hH o;
    public static /* synthetic */ hH p;
    public static /* synthetic */ hH s;
    public static /* synthetic */ hH m;
    public static /* synthetic */ hH l;

    @cL
    public void a(fb fb2) {
        block8: {
            b b10;
            c c10;
            block13: {
                boolean bl2;
                block12: {
                    String[] arrstring;
                    block10: {
                        block11: {
                            block9: {
                                block7: {
                                    arrstring = C.f();
                                    bl2 = m.l();
                                    if (arrstring != null) break block7;
                                    if (!bl2) break block8;
                                    bl2 = this.i();
                                }
                                if (arrstring != null) break block9;
                                if (!bl2) break block8;
                                c7.c.ac.d = false;
                                bl2 = k.l();
                            }
                            if (arrstring != null) break block10;
                            if (!bl2) break block11;
                            bl2 = c7.c.e.J();
                            if (arrstring != null) break block10;
                            if (bl2) {
                                c7.c.e.f(0.0f);
                                c7.c.e.i(0.0f);
                            }
                        }
                        bl2 = s.l();
                    }
                    if (arrstring != null) break block12;
                    if (!bl2) break block8;
                    c10 = c7.c.s;
                    b10 = b.a(15);
                    if (arrstring != null) break block13;
                    bl2 = c10.c(b10);
                }
                if (!bl2) break block8;
                c10 = c7.c.s;
                b10 = b.a(15);
            }
            c10.b(b10);
        }
    }

    public c7() {
        super("NoRender", a5.Visuals);
        k = new hH("Rain", this, true);
        cj.b.f.b(k);
        l = new hH("HurtCamera", this, true);
        cj.b.f.b(l);
        u = new hH("Pumpkin", this, true);
        cj.b.f.b(u);
        n = new hH("Armor", this, false);
        cj.b.f.b(n);
        r = new hH("Totem", this, true);
        cj.b.f.b(r);
        s = new hH("Blindness", this, true);
        cj.b.f.b(s);
        t = new hH("Liquid Overlay", this, true);
        cj.b.f.b(t);
        m = new hH("Camera Smooth", this, true);
        cj.b.f.b(m);
        q = new hH("Fire", this, true);
        cj.b.f.b(q);
        o = new hH("Walk", this, false);
        cj.b.f.b(o);
        p = new hH("Arrow", this, true);
        cj.b.f.b(p);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

