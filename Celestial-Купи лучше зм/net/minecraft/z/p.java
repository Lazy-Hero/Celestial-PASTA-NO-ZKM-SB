/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.z;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.b;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.z.d;

public class p
extends x
implements b {
    public /* synthetic */ net.minecraft.ag.G aK;
    private /* synthetic */ r aL;

    private void b() {
        block3: {
            block4: {
                p p2;
                block5: {
                    m[] arrm = net.minecraft.z.d.b();
                    p2 = this;
                    if (arrm != null) break block4;
                    if (p2.aL == null) break block5;
                    p2 = this;
                    if (arrm != null) break block4;
                    if (!p2.aL.p("OwnerUUID")) break block5;
                    UUID uUID = this.aL.l("OwnerUUID");
                    for (net.minecraft.ag.G g10 : this.aG.a(net.minecraft.ag.G.class, this.m().a(15.0))) {
                        block7: {
                            block6: {
                                if (arrm != null) break block3;
                                if (arrm != null) break block6;
                                if (!g10.u().equals(uUID)) break block7;
                                this.aK = g10;
                            }
                            if (arrm == null) break;
                        }
                        if (arrm == null) continue;
                    }
                }
                p2 = this;
            }
            p2.aL = null;
        }
    }

    @Override
    public void b(double d10, double d11, double d12) {
        block3: {
            float f10;
            block4: {
                float f11;
                block2: {
                    this.aq = d10;
                    this.G = d11;
                    this.d = d12;
                    m[] arrm = net.minecraft.z.d.b();
                    float f12 = this.E - 0.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (arrm != null) break block2;
                    if (f11 != false) break block3;
                    f10 = this.ak;
                    if (arrm != null) break block4;
                    float f13 = f10 - 0.0f;
                    f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f11 != false) break block3;
                f10 = h.e(d10 * d10 + d12 * d12);
            }
            float f14 = f10;
            this.at = (float)(h.a(d11, (double)f14) * 57.29577951308232);
            this.e = (float)(h.a(d10, d12) * 57.29577951308232);
            this.E = this.at;
            this.ak = this.e;
            this.c(this.a, this.aF, this.ax, this.e, this.at);
        }
    }

    public p(z z2) {
        super(z2);
    }

    @Override
    protected void f(r r2) {
        if (this.aK != null) {
            r r3 = new r();
            UUID uUID = this.aK.u();
            r3.a("OwnerUUID", uUID);
            r2.a("Owner", r3);
        }
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11) {
        float f12 = h.e(d10 * d10 + d11 * d11 + d12 * d12);
        d10 /= (double)f12;
        d11 /= (double)f12;
        d12 /= (double)f12;
        d10 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        d11 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        d12 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
        this.aq = d10 *= (double)f10;
        this.G = d11 *= (double)f10;
        this.d = d12 *= (double)f10;
        float f13 = h.e(d10 * d10 + d12 * d12);
        this.e = (float)(h.a(d10, d12) * 57.29577951308232);
        this.at = (float)(h.a(d11, (double)f13) * 57.29577951308232);
        this.ak = this.e;
        this.E = this.at;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
    }

    @Nullable
    private x a(l l2, l l3) {
        x x2;
        block3: {
            x x3 = null;
            List<x> list = this.aG.b((x)this, this.m().d(this.aq, this.G, this.d).a(1.0));
            double d10 = 0.0;
            Iterator<x> iterator = list.iterator();
            m[] arrm = net.minecraft.z.d.b();
            while (iterator.hasNext()) {
                block5: {
                    double d11;
                    double d12;
                    x x4;
                    block6: {
                        k k2;
                        i i2;
                        x x5;
                        block4: {
                            x2 = x4 = iterator.next();
                            if (arrm != null) break block3;
                            if (arrm != null) break block4;
                            if (x2 == this.aK) break block5;
                            x5 = x4;
                        }
                        if ((i2 = (k2 = x5.m().a(0.3f)).b(l2, l3)) == null) break block5;
                        d11 = d12 = l2.f(i2.c);
                        if (arrm != null) break block5;
                        if (d11 < d10) break block6;
                        d11 = d10;
                        if (arrm != null || d11 != 0.0) break block5;
                    }
                    x3 = x4;
                    d11 = d10 = d12;
                }
                if (arrm == null) continue;
            }
            x2 = x3;
        }
        return x2;
    }

    public p(z z2, net.minecraft.ag.G g10) {
        super(z2);
        this.aK = g10;
        this.g(g10.a - (double)(g10.ad + 1.0f) * 0.5 * (double)h.g(g10.bf * ((float)Math.PI / 180)), g10.aF + (double)g10.l() - (double)0.1f, g10.ax + (double)(g10.ad + 1.0f) * 0.5 * (double)h.c(g10.bf * ((float)Math.PI / 180)));
        this.c(0.25f, 0.25f);
    }

    @Override
    protected void a(r r2) {
        block0: {
            if (!r2.a("Owner", 10)) break block0;
            this.aL = r2.h("Owner");
        }
    }

    @Override
    public void ae() {
        block28: {
            p p2;
            block31: {
                boolean bl2;
                block29: {
                    m[] arrm;
                    block30: {
                        block26: {
                            block27: {
                                block23: {
                                    block22: {
                                        block21: {
                                            x x2;
                                            block25: {
                                                p p3;
                                                block24: {
                                                    m[] arrm2 = net.minecraft.z.d.b();
                                                    super.ae();
                                                    arrm = arrm2;
                                                    p3 = this;
                                                    if (arrm != null) break block24;
                                                    if (p3.aL == null) break block25;
                                                    p3 = this;
                                                }
                                                p3.b();
                                            }
                                            l l2 = new l(this.a, this.aF, this.ax);
                                            l l3 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                            i i2 = this.aG.a(l2, l3);
                                            l2 = new l(this.a, this.aF, this.ax);
                                            l l4 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                            if (arrm == null) {
                                                l3 = l4;
                                                if (i2 != null) {
                                                    l4 = l3 = new l(i2.c.e, i2.c.d, i2.c.b);
                                                }
                                            }
                                            if ((x2 = this.a(l2, l3)) != null) {
                                                i2 = new i(x2);
                                            }
                                            if (i2 != null) {
                                                this.a(i2);
                                            }
                                            this.a += this.aq;
                                            this.aF += this.G;
                                            this.ax += this.d;
                                            float f10 = h.e(this.aq * this.aq + this.d * this.d);
                                            this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                            this.at = (float)(h.a(this.G, (double)f10) * 57.29577951308232);
                                            while (this.at - this.E < -180.0f) {
                                                this.E -= 360.0f;
                                                if (arrm == null) {
                                                    if (arrm == null) continue;
                                                    net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                                    break;
                                                }
                                                break block21;
                                            }
                                            while (this.at - this.E >= 180.0f) {
                                                this.E += 360.0f;
                                                if (arrm == null) {
                                                    if (arrm == null) continue;
                                                }
                                                break block22;
                                            }
                                        }
                                        while (this.e - this.ak < -180.0f) {
                                            this.ak -= 360.0f;
                                            if (arrm == null) {
                                                if (arrm == null) continue;
                                            }
                                            break block23;
                                        }
                                    }
                                    while (this.e - this.ak >= 180.0f) {
                                        this.ak += 360.0f;
                                        if (arrm == null) {
                                            if (arrm == null) continue;
                                        }
                                        break block23;
                                    }
                                    this.at = this.E + (this.at - this.E) * 0.2f;
                                    this.e = this.ak + (this.e - this.ak) * 0.2f;
                                }
                                float f11 = 0.99f;
                                float f12 = 0.06f;
                                bl2 = this.aG.a(this.m(), c.A);
                                if (arrm != null) break block26;
                                if (bl2) break block27;
                                this.a();
                                if (arrm == null) break block28;
                            }
                            bl2 = this.aj();
                        }
                        if (arrm != null) break block29;
                        if (!bl2) break block30;
                        this.a();
                        if (arrm == null) break block28;
                    }
                    this.aq *= (double)0.99f;
                    this.G *= (double)0.99f;
                    this.d *= (double)0.99f;
                    p2 = this;
                    if (arrm != null) break block31;
                    bl2 = p2.aI();
                }
                if (!bl2) {
                    this.G -= (double)0.06f;
                }
                p2 = this;
            }
            p2.g(this.a, this.aF, this.ax);
        }
    }

    public void a(i i2) {
        block10: {
            p p2;
            block9: {
                m[] arrm;
                block8: {
                    block7: {
                        arrm = net.minecraft.z.d.b();
                        if (i2.e == null) break block7;
                        p2 = this;
                        if (arrm != null) break block8;
                        if (p2.aK != null) {
                            i2.e.a(net.minecraft.ar.G.a((x)this, this.aK).r(), 1.0f);
                        }
                    }
                    p2 = this;
                }
                if (arrm != null) break block9;
                if (p2.aG.C) break block10;
                p2 = this;
            }
            p2.a();
        }
    }

    public p(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        block2: {
            m[] arrm = net.minecraft.z.d.b();
            super(z2);
            m[] arrm2 = arrm;
            this.g(d10, d11, d12);
            for (int i2 = 0; i2 < 7; ++i2) {
                double d16 = 0.4 + 0.1 * (double)i2;
                z2.a(net.minecraft.ar.aH.SPIT, d10, d11, d12, d13 * d16, d14, d15 * d16, new int[0]);
                if (arrm2 == null) {
                    if (arrm2 == null) continue;
                }
                break block2;
            }
            this.aq = d13;
            this.G = d14;
            this.d = d15;
        }
    }
}

