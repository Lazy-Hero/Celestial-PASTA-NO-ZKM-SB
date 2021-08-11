/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.z;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.z.d;

public abstract class r
extends x
implements net.minecraft.U.b {
    public /* synthetic */ int aU;
    private /* synthetic */ int aM;
    private /* synthetic */ int aP;
    protected /* synthetic */ B aO;
    private /* synthetic */ String aK;
    private /* synthetic */ int aL;
    private /* synthetic */ int aS;
    private /* synthetic */ int aV;
    private /* synthetic */ K aT;
    private /* synthetic */ int aN;
    protected /* synthetic */ boolean aR;
    public /* synthetic */ x aQ;

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11) {
        block0: {
            float f12 = h.e(d10 * d10 + d11 * d11 + d12 * d12);
            d10 /= (double)f12;
            d11 /= (double)f12;
            d12 /= (double)f12;
            d10 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
            d11 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
            d12 += this.g.nextGaussian() * (double)0.0075f * (double)f11;
            m[] arrm = net.minecraft.z.d.b();
            this.aq = d10 *= (double)f10;
            this.G = d11 *= (double)f10;
            this.d = d12 *= (double)f10;
            float f13 = h.e(d10 * d10 + d12 * d12);
            this.e = (float)(h.a(d10, d12) * 57.29577951308232);
            this.at = (float)(h.a(d11, (double)f13) * 57.29577951308232);
            this.ak = this.e;
            this.E = this.at;
            this.aL = 0;
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.z.d.b(new m[3]);
        }
    }

    @Override
    public boolean b(double d10) {
        double d11 = this.m().d() * 4.0;
        m[] arrm = net.minecraft.z.d.b();
        boolean bl2 = Double.isNaN(d11);
        if (arrm == null) {
            double d12;
            if (bl2) {
                d11 = 4.0;
            }
            bl2 = (d12 = d10 - (d11 *= 64.0) * d11) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (arrm == null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    @Override
    protected void ab() {
    }

    @Override
    public void ae() {
        r r2;
        block83: {
            boolean bl2;
            float f10;
            block82: {
                m[] arrm;
                block55: {
                    block54: {
                        block53: {
                            block52: {
                                block79: {
                                    r r3;
                                    i i2;
                                    block81: {
                                        block80: {
                                            i i3;
                                            block78: {
                                                x x2;
                                                x x3;
                                                block74: {
                                                    block75: {
                                                        int n2;
                                                        block76: {
                                                            block77: {
                                                                block51: {
                                                                    l l2;
                                                                    l l3;
                                                                    block65: {
                                                                        l l4;
                                                                        block64: {
                                                                            block63: {
                                                                                r r4;
                                                                                block57: {
                                                                                    block58: {
                                                                                        block59: {
                                                                                            r r5;
                                                                                            block60: {
                                                                                                block62: {
                                                                                                    r r6;
                                                                                                    block61: {
                                                                                                        int n3;
                                                                                                        block56: {
                                                                                                            this.am = this.a;
                                                                                                            this.af = this.aF;
                                                                                                            arrm = net.minecraft.z.d.b();
                                                                                                            this.n = this.ax;
                                                                                                            super.ae();
                                                                                                            n3 = this.aU--;
                                                                                                            if (arrm != null) break block56;
                                                                                                            if (n3 > 0) {
                                                                                                                // empty if block
                                                                                                            }
                                                                                                            r4 = this;
                                                                                                            if (arrm != null) break block57;
                                                                                                            n3 = r4.aR ? 1 : 0;
                                                                                                        }
                                                                                                        if (n3 == 0) break block58;
                                                                                                        r5 = this;
                                                                                                        if (arrm != null) break block59;
                                                                                                        if (r5.aG.d(new n(this.aN, this.aS, this.aV)).b() != this.aT) break block60;
                                                                                                        ++this.aL;
                                                                                                        r6 = this;
                                                                                                        if (arrm != null) break block61;
                                                                                                        if (r6.aL != 1200) break block62;
                                                                                                        r6 = this;
                                                                                                    }
                                                                                                    r6.a();
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            this.aR = false;
                                                                                            this.aq *= (double)(this.g.nextFloat() * 0.2f);
                                                                                            this.G *= (double)(this.g.nextFloat() * 0.2f);
                                                                                            this.d *= (double)(this.g.nextFloat() * 0.2f);
                                                                                            this.aL = 0;
                                                                                            r5 = this;
                                                                                        }
                                                                                        r5.aP = 0;
                                                                                        if (arrm == null) break block63;
                                                                                    }
                                                                                    r4 = this;
                                                                                }
                                                                                ++r4.aP;
                                                                            }
                                                                            l3 = new l(this.a, this.aF, this.ax);
                                                                            l2 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                                                            i2 = this.aG.a(l3, l2);
                                                                            l3 = new l(this.a, this.aF, this.ax);
                                                                            l4 = new l(this.a + this.aq, this.aF + this.G, this.ax + this.d);
                                                                            if (arrm != null) break block64;
                                                                            l2 = l4;
                                                                            if (i2 == null) break block65;
                                                                            l4 = new l(i2.c.e, i2.c.d, i2.c.b);
                                                                        }
                                                                        l2 = l4;
                                                                    }
                                                                    x3 = null;
                                                                    List<x> list = this.aG.b((x)this, this.m().d(this.aq, this.G, this.d).a(1.0));
                                                                    double d10 = 0.0;
                                                                    int n4 = 0;
                                                                    int n5 = 0;
                                                                    while (n5 < list.size()) {
                                                                        block66: {
                                                                            block67: {
                                                                                double d11;
                                                                                block72: {
                                                                                    double d12;
                                                                                    x x4;
                                                                                    block73: {
                                                                                        x x5;
                                                                                        block69: {
                                                                                            int n6;
                                                                                            block71: {
                                                                                                block70: {
                                                                                                    block68: {
                                                                                                        x4 = list.get(n5);
                                                                                                        if (arrm != null) break block66;
                                                                                                        n2 = x4.M();
                                                                                                        if (arrm != null) break block51;
                                                                                                        if (n2 == 0) break block67;
                                                                                                        if (x4 != this.aQ) break block68;
                                                                                                        n4 = 1;
                                                                                                        if (arrm == null) break block67;
                                                                                                    }
                                                                                                    x5 = this.aO;
                                                                                                    if (arrm != null) break block69;
                                                                                                    if (x5 == null) break block70;
                                                                                                    n6 = this.H;
                                                                                                    if (arrm != null) break block71;
                                                                                                    if (n6 >= 2) break block70;
                                                                                                    x5 = this.aQ;
                                                                                                    if (arrm != null) break block69;
                                                                                                    if (x5 != null) break block70;
                                                                                                    this.aQ = x4;
                                                                                                    n4 = 1;
                                                                                                    if (arrm == null) break block67;
                                                                                                }
                                                                                                n6 = 0;
                                                                                            }
                                                                                            n4 = n6;
                                                                                            x5 = x4;
                                                                                        }
                                                                                        k k2 = x5.m().a(0.3f);
                                                                                        i i4 = k2.b(l3, l2);
                                                                                        if (arrm != null) break block66;
                                                                                        if (i4 == null) break block67;
                                                                                        d11 = d12 = l3.f(i4.c);
                                                                                        if (arrm != null) break block72;
                                                                                        if (d11 < d10) break block73;
                                                                                        d11 = d10;
                                                                                        if (arrm != null) break block72;
                                                                                        if (d11 != 0.0) break block67;
                                                                                    }
                                                                                    x3 = x4;
                                                                                    d11 = d12;
                                                                                }
                                                                                d10 = d11;
                                                                            }
                                                                            ++n5;
                                                                        }
                                                                        if (arrm == null) continue;
                                                                    }
                                                                    x2 = this.aQ;
                                                                    if (arrm != null) break block74;
                                                                    if (x2 == null) break block75;
                                                                    n2 = n4;
                                                                }
                                                                if (arrm != null) break block76;
                                                                if (n2 == 0) break block77;
                                                                this.aM = 2;
                                                                if (arrm == null) break block75;
                                                            }
                                                            x2 = this;
                                                            if (arrm != null) break block74;
                                                            int n2 = ((r)x2).aM;
                                                            n2 = n2;
                                                            ((r)x2).aM = n7 - 1;
                                                        }
                                                        if (n2 <= 0) {
                                                            this.aQ = null;
                                                        }
                                                    }
                                                    x2 = x3;
                                                }
                                                if (x2 != null) {
                                                    i2 = new i(x3);
                                                }
                                                i3 = i2;
                                                if (arrm != null) break block78;
                                                if (i3 == null) break block79;
                                                i3 = i2;
                                            }
                                            if (i3.d != net.minecraft.k.j.BLOCK) break block80;
                                            r3 = this;
                                            if (arrm != null) break block81;
                                            if (r3.aG.d(i2.a()).b() != net.minecraft.u.g.aN) break block80;
                                            this.a(i2.a());
                                            if (arrm == null) break block79;
                                        }
                                        r3 = this;
                                    }
                                    r3.a(i2);
                                }
                                this.a += this.aq;
                                this.aF += this.G;
                                this.ax += this.d;
                                float f11 = h.e(this.aq * this.aq + this.d * this.d);
                                this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                this.at = (float)(h.a(this.G, (double)f11) * 57.29577951308232);
                                while (this.at - this.E < -180.0f) {
                                    this.E -= 360.0f;
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block52;
                                }
                                while (this.at - this.E >= 180.0f) {
                                    this.E += 360.0f;
                                    if (arrm == null) {
                                        if (arrm == null) continue;
                                    }
                                    break block53;
                                }
                            }
                            while (this.e - this.ak < -180.0f) {
                                this.ak -= 360.0f;
                                if (arrm == null) {
                                    if (arrm == null) continue;
                                }
                                break block54;
                            }
                        }
                        while (this.e - this.ak >= 180.0f) {
                            this.ak += 360.0f;
                            if (arrm == null) {
                                if (arrm == null) continue;
                            }
                            break block54;
                        }
                        this.at = this.E + (this.at - this.E) * 0.2f;
                        this.e = this.ak + (this.e - this.ak) * 0.2f;
                    }
                    float f12 = 0.99f;
                    f10 = this.a();
                    bl2 = this.aj();
                    if (arrm != null) break block82;
                    if (bl2) {
                        for (int i5 = 0; i5 < 4; ++i5) {
                            float f13 = 0.25f;
                            this.aG.a(net.minecraft.ar.aH.WATER_BUBBLE, this.a - this.aq * 0.25, this.aF - this.G * 0.25, this.ax - this.d * 0.25, this.aq, this.G, this.d, new int[0]);
                            if (arrm == null) {
                                if (arrm == null) continue;
                            }
                            break block55;
                        }
                        f12 = 0.8f;
                    }
                    this.aq *= (double)f12;
                    this.G *= (double)f12;
                    this.d *= (double)f12;
                }
                r2 = this;
                if (arrm != null) break block83;
                bl2 = r2.aI();
            }
            if (!bl2) {
                this.G -= (double)f10;
            }
            r2 = this;
        }
        r2.g(this.a, this.aF, this.ax);
    }

    protected float a() {
        return 0.03f;
    }

    protected abstract void a(i var1);

    public r(z z2, double d10, double d11, double d12) {
        this(z2);
        this.g(d10, d11, d12);
    }

    public static void a(b b10, String string) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void f(net.minecraft.P.r var1_1) {
        block11: {
            block12: {
                block10: {
                    block8: {
                        block9: {
                            var1_1.b("xTile", this.aN);
                            v0 = net.minecraft.z.d.b();
                            var1_1.b("yTile", this.aS);
                            var1_1.b("zTile", this.aV);
                            var2_2 = v0;
                            v1 = var3_3 = net.minecraft.W.K.h.b(this.aT);
                            if (var2_2 != null) ** GOTO lbl12
                            if (v1 == null) {
                                v2 = "";
                            } else {
                                v1 = var3_3;
lbl12:
                                // 2 sources

                                v2 = v1.toString();
                            }
                            var1_1.a("inTile", v2);
                            var1_1.a("shake", (byte)this.aU);
                            v3 = this.aR;
                            if (var2_2 == null) {
                                v3 = v3 != false;
                            }
                            var1_1.a("inGround", (byte)(v3 ? 1 : 0));
                            v4 = this;
                            if (var2_2 != null) break block8;
                            if (v4.aK == null) break block9;
                            v5 = this.aK.isEmpty();
                            if (var2_2 != null) break block10;
                            if (!v5) break block11;
                        }
                        v4 = this;
                    }
                    if (var2_2 != null) break block12;
                    v5 = v4.aO instanceof net.minecraft.i.j;
                }
                if (!v5) break block11;
                v4 = this;
            }
            v4.aK = this.aO.g();
        }
        v6 = this;
        if (var2_2 != null) ** GOTO lbl42
        if (v6.aK == null) {
            v7 = "";
        } else {
            v6 = this;
lbl42:
            // 2 sources

            v7 = v6.aK;
        }
        var1_1.a("ownerName", v7);
    }

    public void a(x x2, float f10, float f11, float f12, float f13, float f14) {
        block3: {
            double d10;
            block2: {
                float f15 = -h.g(f11 * ((float)Math.PI / 180)) * h.c(f10 * ((float)Math.PI / 180));
                m[] arrm = net.minecraft.z.d.b();
                float f16 = -h.g((f10 + f12) * ((float)Math.PI / 180));
                float f17 = h.c(f11 * ((float)Math.PI / 180)) * h.c(f10 * ((float)Math.PI / 180));
                this.a((double)f15, (double)f16, (double)f17, f13, f14);
                this.aq += x2.aq;
                r r2 = this;
                r r3 = r2;
                d10 = r2.d + x2.d;
                if (arrm != null) break block2;
                r3.d = d10;
                if (x2.A) break block3;
                r r4 = this;
                r3 = r4;
                d10 = r4.G + x2.G;
            }
            r3.G = d10;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public r(z z2) {
        super(z2);
        this.aN = -1;
        this.aS = -1;
        this.aV = -1;
        this.c(0.25f, 0.25f);
    }

    public r(z z2, B b10) {
        this(z2, b10.a, b10.aF + (double)b10.l() - (double)0.1f, b10.ax);
        this.aO = b10;
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        block11: {
            r r3;
            block12: {
                m[] arrm;
                block10: {
                    int n2;
                    block8: {
                        r r4;
                        block9: {
                            this.aN = r2.m("xTile");
                            arrm = net.minecraft.z.d.b();
                            this.aS = r2.m("yTile");
                            r4 = this;
                            n2 = r2.m("zTile");
                            if (arrm != null) break block8;
                            r4.aV = n2;
                            if (!r2.a("inTile", 8)) break block9;
                            this.aT = net.minecraft.W.K.d(r2.j("inTile"));
                            if (arrm == null) break block10;
                        }
                        r4 = this;
                        n2 = r2.r("inTile") & 0xFF;
                    }
                    r4.aT = net.minecraft.W.K.b(n2);
                }
                this.aU = r2.r("shake") & 0xFF;
                byte by2 = r2.r("inGround");
                if (arrm == null) {
                    by2 = by2 == 1 ? (byte)1 : 0;
                }
                this.aR = by2;
                this.aO = null;
                this.aK = r2.j("ownerName");
                r3 = this;
                if (arrm != null) break block11;
                if (r3.aK == null) break block12;
                r3 = this;
                if (arrm != null) break block11;
                if (r3.aK.isEmpty()) {
                    this.aK = null;
                }
            }
            r3 = this;
        }
        r3.aO = this.b();
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
            this.e = (float)(h.a(d10, d12) * 57.29577951308232);
            this.at = (float)(h.a(d11, (double)f14) * 57.29577951308232);
            this.ak = this.e;
            this.E = this.at;
        }
    }

    @Nullable
    public B b() {
        B b10;
        block5: {
            r r2;
            block7: {
                block6: {
                    m[] arrm = net.minecraft.z.d.b();
                    b10 = this.aO;
                    if (arrm != null) break block5;
                    if (b10 != null) break block6;
                    r2 = this;
                    if (arrm != null) break block7;
                    if (r2.aK == null) break block6;
                    r2 = this;
                    if (arrm != null) break block7;
                    if (r2.aK.isEmpty()) break block6;
                    b10 = this.aO = this.aG.c(this.aK);
                    if (arrm != null) break block5;
                    if (b10 != null) break block6;
                    r2 = this;
                    if (arrm != null) break block7;
                    if (r2.aG instanceof A) {
                        try {
                            x x2 = ((A)this.aG).a(UUID.fromString(this.aK));
                            if (x2 instanceof B) {
                                this.aO = (B)x2;
                            }
                        }
                        catch (Throwable throwable) {
                            this.aO = null;
                        }
                    }
                }
                r2 = this;
            }
            b10 = r2.aO;
        }
        return b10;
    }
}

