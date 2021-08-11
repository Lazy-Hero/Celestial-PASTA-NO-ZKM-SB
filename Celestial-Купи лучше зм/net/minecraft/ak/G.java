/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.List;
import java.util.Random;
import net.minecraft.U.E;
import net.minecraft.a6;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.ar.aH;
import net.minecraft.i.k;
import net.minecraft.l.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class G
extends h {
    private final /* synthetic */ Class<? extends C> e;
    private /* synthetic */ C c;
    private final /* synthetic */ C h;
    /* synthetic */ z f;
    /* synthetic */ int g;
    /* synthetic */ double d;

    @Override
    public void b() {
        block3: {
            G g10;
            block4: {
                int n2;
                block2: {
                    String string = net.minecraft.ak.h.h();
                    this.h.I().a(this.c, 10.0f, (float)this.h.j());
                    String string2 = string;
                    this.h.l().a(this.c, this.d);
                    n2 = ++this.g;
                    if (string2 != null) break block2;
                    if (n2 < 60) break block3;
                    g10 = this;
                    if (string2 != null) break block4;
                    double d10 = g10.h.s(this.c) - 9.0;
                    n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                }
                if (n2 >= 0) break block3;
                g10 = this;
            }
            g10.c();
        }
    }

    public G(C c10, double d10, Class<? extends C> class_) {
        this.h = c10;
        this.f = c10.aG;
        this.e = class_;
        this.d = d10;
        this.a(3);
    }

    @Override
    public void g() {
        this.c = null;
        this.g = 0;
    }

    public G(C c10, double d10) {
        this(c10, d10, c10.getClass());
    }

    private void c() {
        block12: {
            String string;
            E e10;
            block16: {
                k k2;
                k k3;
                block15: {
                    block13: {
                        block14: {
                            e10 = this.h.a((E)this.c);
                            string = net.minecraft.ak.h.h();
                            if (e10 == null) break block12;
                            k2 = k3 = this.h.a();
                            if (string != null) break block13;
                            if (k2 != null) break block14;
                            k2 = this.c.a();
                            if (string != null) break block13;
                            if (k2 != null) {
                                k3 = this.c.a();
                            }
                        }
                        k2 = k3;
                    }
                    if (string != null) break block15;
                    if (k2 == null) break block16;
                    k2 = k3;
                }
                k2.b(m.O);
                a6.f.a(k3, this.h, this.c, e10);
            }
            this.h.l(6000);
            this.c.l(6000);
            this.h.e();
            this.c.e();
            e10.l(-24000);
            e10.c(this.h.a, this.h.aF, this.h.ax, 0.0f, 0.0f);
            this.f.f(e10);
            Random random = this.h.f();
            for (int i2 = 0; i2 < 7; ++i2) {
                double d10 = random.nextGaussian() * 0.02;
                double d11 = random.nextGaussian() * 0.02;
                double d12 = random.nextGaussian() * 0.02;
                double d13 = random.nextDouble() * (double)this.h.ad * 2.0 - (double)this.h.ad;
                double d14 = 0.5 + random.nextDouble() * (double)this.h.aD;
                double d15 = random.nextDouble() * (double)this.h.ad * 2.0 - (double)this.h.ad;
                this.f.a(aH.HEART, this.h.a + d13, this.h.aF + d14, this.h.ax + d15, d10, d11, d12, new int[0]);
                if (string == null) {
                    if (string == null) continue;
                }
                break block12;
            }
            boolean bl2 = this.f.M().c("doMobLoot");
            if (string == null && bl2) {
                bl2 = this.f.f(new net.minecraft.J.E(this.f, this.h.a, this.h.aF, this.h.ax, random.nextInt(7) + 1));
            }
        }
    }

    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        C c10 = this.h;
        if (string == null) {
            if (!c10.z()) {
                return false;
            }
            c10 = this.c = this.d();
        }
        return c10 != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        int n2 = this.c.aL();
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.c.z();
        }
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.g;
        }
        if (string != null) return n2 != 0;
        if (n2 >= 60) return 0 != 0;
        return 1 != 0;
    }

    private C d() {
        C c10;
        block5: {
            List<? extends C> list = this.f.a(this.e, this.h.m().a(8.0));
            String string = net.minecraft.ak.h.h();
            double d10 = Double.MAX_VALUE;
            C c11 = null;
            for (C c12 : list) {
                block7: {
                    double d11;
                    int n2;
                    block6: {
                        c10 = this.h;
                        if (string != null) break block5;
                        n2 = c10.a(c12);
                        if (string != null) break block6;
                        if (n2 == 0) break block7;
                        d11 = this.h.s(c12);
                        if (string != null) break block7;
                        double d12 = d11 - d10;
                        n2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (n2 < 0) {
                        c11 = c12;
                        d11 = d10 = this.h.s(c12);
                    }
                }
                if (string == null) continue;
            }
            c10 = c11;
        }
        return c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

