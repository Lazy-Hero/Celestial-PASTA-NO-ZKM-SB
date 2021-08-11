/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.w.d;
import net.minecraft.x.c;

public class s
extends x {
    private static final /* synthetic */ net.minecraft.q.r<Integer> aL;
    private /* synthetic */ int aO;
    private /* synthetic */ int aK;
    private static final /* synthetic */ net.minecraft.q.r<d> aN;
    private /* synthetic */ B aM;

    static {
        aN = net.minecraft.q.m.a(s.class, net.minecraft.q.h.o);
        aL = net.minecraft.q.m.a(s.class, net.minecraft.q.h.n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void c() {
        block20: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            var2_1 = 0.0f;
                            var1_2 = net.minecraft.J.j.c();
                            v0 = var3_3 = this.ap.b(net.minecraft.J.s.aN);
                            if (var1_2 != 0) ** GOTO lbl9
                            if (v0.G()) {
                                v1 = null;
                            } else {
                                v0 = var3_3;
lbl9:
                                // 2 sources

                                v1 = v0.c("Fireworks");
                            }
                            v2 = var4_4 = v1;
                            if (var1_2 != 0) ** GOTO lbl14
                            if (v2 != null) {
                                v2 = var4_4;
lbl14:
                                // 2 sources

                                v3 = v2.c("Explosions", 10);
                            } else {
                                v3 = null;
                            }
                            v4 = var5_5 = v3;
                            if (var1_2 != 0) break block16;
                            if (v4 == null) break block17;
                            v4 = var5_5;
                        }
                        v5 = v4.c();
                        if (var1_2 != 0) break block18;
                        if (v5 == 0) {
                            var2_1 = 5 + var5_5.b() * 2;
                        }
                    }
                    v5 = (cfr_temp_0 = var2_1 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                }
                if (v5 <= 0) return;
                v6 = this.aM;
                if (var1_2 != 0) break block19;
                if (v6 == null) break block20;
                v6 = this.aM;
            }
            v6.a(net.minecraft.ar.G.z, (float)(5 + var5_5.b() * 2));
        }
        var6_6 = 5.0;
        var8_7 = new l(this.a, this.aF, this.ax);
        var9_8 = this.aG.a(B.class, this.m().a(5.0)).iterator();
        block0: do {
            if (var9_8.hasNext() == false) return;
            v7 = var9_8.next();
            block1: while ((var10_9 = v7) != this.aM) {
                cfr_temp_1 = this.s(var10_9) - 25.0;
                v8 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                if (var1_2 == 0) {
                    if (v8 > 0) continue block0;
                    v8 = (double)false;
                }
                var11_10 = v8;
                for (var12_11 = 0; var12_11 < 2; ++var12_11) {
                    var13_13 = this.aG.a(var8_7, new l(var10_9.a, var10_9.aF + (double)var10_9.aD * 0.5 * (double)var12_11, var10_9.ax), false, true, false);
                    if (var1_2 == 0) {
                        v7 = var13_13;
                        if (var1_2 != 0) continue block1;
                        if (v7 != null && var13_13.d != net.minecraft.k.j.MISS) continue;
                        var11_10 = (double)true;
                    }
                    if (var1_2 == 0) break;
                    if (var1_2 == 0) continue;
                }
                if (var11_10 == false) continue block0;
                var12_12 = var2_1 * (float)Math.sqrt((5.0 - (double)this.o(var10_9)) / 5.0);
                var10_9.a(net.minecraft.ar.G.z, var12_12);
                continue block0;
            }
        } while (var1_2 == 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(byte var1_1) {
        block3: {
            block2: {
                var2_2 = net.minecraft.J.j.d();
                if (var2_2 == 0) return;
                if (var1_1 != 17) break block2;
                v0 = this;
                if (var2_2 == 0) break block3;
                if (!v0.aG.C) break block2;
                v1 = var3_3 = this.ap.b(net.minecraft.J.s.aN);
                if (var2_2 == 0) ** GOTO lbl13
                if (v1.G()) {
                    v2 = null;
                } else {
                    v1 = var3_3;
lbl13:
                    // 2 sources

                    v2 = v1.c("Fireworks");
                }
                var4_4 = v2;
                this.aG.a(this.a, this.aF, this.ax, this.aq, this.G, this.d, var4_4);
            }
            v0 = this;
        }
        super.a(var1_1);
    }

    @Override
    public boolean aN() {
        return false;
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
                    int n2 = net.minecraft.J.j.c();
                    float f12 = this.E - 0.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (n2 != 0) break block2;
                    if (f11 != false) break block3;
                    f10 = this.ak;
                    if (n2 != 0) break block4;
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

    @Override
    public void ae() {
        block48: {
            s s2;
            block49: {
                int n2;
                block47: {
                    int n3;
                    block45: {
                        block46: {
                            block43: {
                                block44: {
                                    block35: {
                                        block34: {
                                            block33: {
                                                s s3;
                                                block41: {
                                                    block42: {
                                                        s s4;
                                                        block36: {
                                                            block37: {
                                                                Object object;
                                                                B b10;
                                                                block38: {
                                                                    block40: {
                                                                        block39: {
                                                                            this.am = this.a;
                                                                            this.af = this.aF;
                                                                            n3 = net.minecraft.J.j.d();
                                                                            this.n = this.ax;
                                                                            super.ae();
                                                                            s4 = this;
                                                                            if (n3 == 0) break block36;
                                                                            if (!s4.b()) break block37;
                                                                            b10 = this.aM;
                                                                            if (n3 == 0) break block38;
                                                                            if (b10 != null) break block39;
                                                                            s3 = this;
                                                                            if (n3 == 0) break block40;
                                                                            object = s3.aG.a(this.ap.b(aL));
                                                                            if (object instanceof B) {
                                                                                this.aM = (B)object;
                                                                            }
                                                                        }
                                                                        s3 = this;
                                                                    }
                                                                    if (n3 == 0) break block41;
                                                                    b10 = s3.aM;
                                                                }
                                                                if (b10 == null) break block42;
                                                                s s5 = this;
                                                                if (n3 != 0) {
                                                                    if (s5.aM.aK()) {
                                                                        object = this.aM.Y();
                                                                        double d10 = 1.5;
                                                                        double d11 = 0.1;
                                                                        this.aM.aq += ((l)object).e * 0.1 + (((l)object).e * 1.5 - this.aM.aq) * 0.5;
                                                                        this.aM.G += ((l)object).d * 0.1 + (((l)object).d * 1.5 - this.aM.G) * 0.5;
                                                                        this.aM.d += ((l)object).b * 0.1 + (((l)object).b * 1.5 - this.aM.d) * 0.5;
                                                                    }
                                                                    this.g(this.aM.a, this.aM.aF, this.aM.ax);
                                                                    this.aq = this.aM.aq;
                                                                    this.G = this.aM.G;
                                                                    s5 = this;
                                                                }
                                                                s5.d = this.aM.d;
                                                                if (n3 != 0) break block42;
                                                            }
                                                            this.aq *= 1.15;
                                                            this.d *= 1.15;
                                                            this.G += 0.04;
                                                            s4 = this;
                                                        }
                                                        s4.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                                                    }
                                                    s3 = this;
                                                }
                                                float f10 = h.e(s3.aq * this.aq + this.d * this.d);
                                                this.e = (float)(h.a(this.aq, this.d) * 57.29577951308232);
                                                this.at = (float)(h.a(this.G, (double)f10) * 57.29577951308232);
                                                while (this.at - this.E < -180.0f) {
                                                    this.E -= 360.0f;
                                                    if (n3 != 0) {
                                                        if (n3 != 0) continue;
                                                    }
                                                    break block33;
                                                }
                                                while (this.at - this.E >= 180.0f) {
                                                    this.E += 360.0f;
                                                    if (n3 != 0) {
                                                        if (n3 != 0) continue;
                                                    }
                                                    break block34;
                                                }
                                            }
                                            while (this.e - this.ak < -180.0f) {
                                                this.ak -= 360.0f;
                                                if (n3 != 0) {
                                                    if (n3 != 0) continue;
                                                }
                                                break block35;
                                            }
                                        }
                                        while (this.e - this.ak >= 180.0f) {
                                            this.ak += 360.0f;
                                            if (n3 != 0) {
                                                if (n3 != 0) continue;
                                            }
                                            break block35;
                                        }
                                        this.at = this.E + (this.at - this.E) * 0.2f;
                                        this.e = this.ak + (this.e - this.ak) * 0.2f;
                                    }
                                    n2 = this.aK;
                                    if (n3 == 0) break block43;
                                    if (n2 != 0) break block44;
                                    n2 = this.aR() ? 1 : 0;
                                    if (n3 == 0) break block43;
                                    if (n2 == 0) {
                                        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.fU, ay.AMBIENT, 3.0f, 1.0f);
                                    }
                                }
                                ++this.aK;
                                n2 = this.aG.C ? 1 : 0;
                            }
                            if (n3 == 0) break block45;
                            if (n2 == 0) break block46;
                            n2 = this.aK % 2;
                            if (n3 == 0) break block45;
                            if (n2 < 2) {
                                this.aG.a(net.minecraft.ar.aH.FIREWORKS_SPARK, this.a, this.aF - 0.3, this.ax, this.g.nextGaussian() * 0.05, -this.G * 0.5, this.g.nextGaussian() * 0.05, new int[0]);
                            }
                        }
                        n2 = this.aG.C ? 1 : 0;
                    }
                    if (n3 == 0) break block47;
                    if (n2 != 0) break block48;
                    s2 = this;
                    if (n3 == 0) break block49;
                    n2 = s2.aK;
                }
                if (n2 <= this.aO) break block48;
                this.aG.a((x)this, (byte)17);
                this.c();
                s2 = this;
            }
            s2.a();
        }
    }

    @Override
    public void f(r r2) {
        block0: {
            r2.b("Life", this.aK);
            r2.b("LifeTime", this.aO);
            d d10 = this.ap.b(aN);
            if (d10.G()) break block0;
            r2.a("FireworksItem", d10.a(new r()));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(r r2) {
        block0: {
            d d10;
            this.aK = r2.m("Life");
            this.aO = r2.m("LifeTime");
            r r3 = r2.h("FireworksItem");
            if (r3 == null || (d10 = new d(r3)).G()) break block0;
            this.ap.b(aN, d10);
        }
    }

    public boolean b() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.ap.b(aL).intValue();
        if (n2 != 0) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean b(double d10) {
        double d11;
        block5: {
            int n2;
            block4: {
                n2 = net.minecraft.J.j.c();
                double d12 = d10 - 4096.0;
                d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                if (n2 != 0) break block4;
                if (d11 >= 0) break block5;
                d11 = (double)this.b();
            }
            if (n2 != 0) return (boolean)d11;
            if (d11 == false) {
                d11 = 1.0;
                return (boolean)d11;
            }
        }
        d11 = 0.0;
        return (boolean)d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean i(double d10, double d11, double d12) {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = super.i(d10, d11, d12);
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = this.b();
        }
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    protected void ab() {
        this.ap.c(aN, net.minecraft.w.d.m);
        this.ap.c(aL, 0);
    }

    public s(z z2) {
        super(z2);
        this.c(0.25f, 0.25f);
    }

    public s(z z2, d d10, B b10) {
        this(z2, b10.a, b10.aF, b10.ax, d10);
        this.ap.b(aL, b10.W());
        this.aM = b10;
    }

    public s(z z2, double d10, double d11, double d12, d d13) {
        block2: {
            int n2;
            block3: {
                d d14;
                block4: {
                    super(z2);
                    int n3 = net.minecraft.J.j.c();
                    this.aK = 0;
                    this.c(0.25f, 0.25f);
                    this.g(d10, d11, d12);
                    int n4 = n3;
                    n2 = 1;
                    if (n4 != 0) break block2;
                    if (d13.G()) break block3;
                    d14 = d13;
                    if (n4 != 0) break block4;
                    if (!d14.x()) break block3;
                    this.ap.b(aN, d13.C());
                    d14 = d13;
                }
                r r2 = d14.v();
                r r3 = r2.h("Fireworks");
                n2 += r3.r("Flight");
            }
            this.aq = this.g.nextGaussian() * 0.001;
            this.d = this.g.nextGaussian() * 0.001;
            this.G = 0.05;
            this.aO = 10 * n2 + this.g.nextInt(6) + this.g.nextInt(7);
        }
    }

    public static void b(b b10) {
        b10.a(net.minecraft.av.f.ENTITY, (g)new c(s.class, "FireworksItem"));
    }
}

