/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import net.minecraft.J.p;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class ba
extends bE {
    public /* synthetic */ hH m;
    public /* synthetic */ hH n;
    public /* synthetic */ hH k;
    public /* synthetic */ hH l;

    public ba() {
        super("AutoTotem", a5.Combat);
        this.l = new hH("Health", this, 10.0, 1.0, 20.0, 1.0);
        cj.b.f.b(this.l);
        this.n = new hH("Count Totem", this, true);
        cj.b.f.b(this.n);
        this.k = new hH("Check Crystal", this, true);
        cj.b.f.b(this.k);
        this.m = new hH("Distance to Crystal", this, 6.0, 1.0, 8.0, 1.0);
        cj.b.f.b(this.m);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private boolean a() {
        boolean bl2;
        block3: {
            Iterator iterator = ba.c.e.O.iterator();
            int[] arrn = net.minecraft.ac.c.i();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block6: {
                        block4: {
                            x x2 = (x)iterator.next();
                            bl2 = x2 instanceof p;
                            if (arrn == null) break block3;
                            if (arrn == null) break block4;
                            if (!bl2) break block5;
                            float f10 = ba.c.s.o(x2) - this.m.r();
                            bl3 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                        }
                        if (arrn == null) break block6;
                        if (bl3 > 0) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrn != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    @cL
    public void a(fb fb2) {
        block9: {
            int n2;
            block8: {
                int[] arrn;
                block7: {
                    block6: {
                        arrn = net.minecraft.ac.c.i();
                        if (ba.c.s.b().w() == h.A) break block6;
                        n2 = aK.b();
                        if (arrn == null) break block7;
                        if (n2 == -1) break block6;
                        double d10 = (double)ba.c.s.V() - this.l.f();
                        n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                        if (arrn == null) break block7;
                        if (n2 <= 0) {
                            ba.c.aW.a(0, aK.b(), 1, net.minecraft.B.h.PICKUP, ba.c.s);
                            ba.c.aW.a(0, 45, 1, net.minecraft.B.h.PICKUP, ba.c.s);
                        }
                    }
                    n2 = this.a() ? 1 : 0;
                }
                if (arrn == null) break block8;
                if (n2 == 0) break block9;
                n2 = this.k.l() ? 1 : 0;
            }
            if (n2 != 0 && ba.c.s.b().w() != h.A && aK.b() != -1) {
                ba.c.aW.a(0, aK.b(), 1, net.minecraft.B.h.PICKUP, ba.c.s);
                ba.c.aW.a(0, 45, 1, net.minecraft.B.h.PICKUP, ba.c.s);
            }
        }
    }

    public int b() {
        int n2 = 0;
        int n3 = 0;
        int[] arrn = net.minecraft.ac.c.i();
        while (n3 < ba.c.s.cB.e()) {
            d d10 = ba.c.s.cB.a(n3);
            if (arrn != null) {
                if (d10.w() == h.A) {
                    ++n2;
                }
                ++n3;
            }
            if (arrn != null) continue;
        }
        return n2;
    }

    @cL
    public void a(fn fn2) {
        block7: {
            int n2;
            int[] arrn;
            block8: {
                int n3;
                block6: {
                    arrn = net.minecraft.ac.c.i();
                    n3 = this.b();
                    if (arrn == null) break block6;
                    if (n3 <= 0) break block7;
                    n3 = this.n.l() ? 1 : 0;
                }
                if (arrn == null) break block8;
                if (n3 == 0) break block7;
                ba.c.f.c(this.b() + "", (float)fn2.a().e() / 2.0f + 19.0f, (float)fn2.a().a() / 2.0f, -1);
                n3 = n2 = 0;
            }
            while (n2 < ba.c.s.cB.e()) {
                d d10 = ba.c.s.cB.a(n2);
                if (arrn != null) {
                    if (d10.w() == h.A) {
                        dJ.a(d10, fn2.a().e() / 2 + 4, fn2.a().a() / 2 - 7);
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
        }
    }
}

