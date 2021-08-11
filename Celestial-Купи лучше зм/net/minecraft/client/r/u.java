/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.U.z;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.minecraft.client.w.j;
import net.minecraft.k.m;

public abstract class u<T extends C>
extends s<T> {
    private static /* synthetic */ boolean y;

    public void b(T t2, double d10, double d11, double d12, float f10, float f11) {
        block3: {
            u u2;
            block2: {
                m[] arrm = b.b();
                super.a(t2, d10, d11, d12, f10, f11);
                m[] arrm2 = arrm;
                u2 = this;
                if (arrm2 != null) break block2;
                if (u2.g) break block3;
                u2 = this;
            }
            u2.a(t2, d10, d11, d12, f10, f11);
        }
    }

    @Override
    public boolean a(T t2, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        boolean bl2;
        block5: {
            block6: {
                x x2;
                block7: {
                    m[] arrm = b.b();
                    bl2 = super.a(t2, b10, d10, d11, d12);
                    if (arrm == null) {
                        if (bl2) {
                            return true;
                        }
                        bl2 = ((C)t2).O();
                    }
                    if (arrm != null) break block5;
                    if (!bl2) break block6;
                    x2 = ((C)t2).e();
                    if (arrm != null) break block7;
                    if (x2 == null) break block6;
                    x2 = ((C)t2).e();
                }
                x x3 = x2;
                return b10.a(x3.aF());
            }
            bl2 = false;
        }
        return bl2;
    }

    static {
        if (!u.b()) {
            u.b(true);
        }
    }

    public static boolean b() {
        boolean bl2 = u.a();
        return !bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(T t2) {
        m[] arrm = b.b();
        boolean bl2 = super.d(t2);
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = ((B)t2).v();
        }
        if (arrm != null) return bl2;
        if (bl2) return true;
        T t3 = t2;
        if (arrm == null) {
            if (!((x)t3).g()) return false;
            t3 = t2;
        }
        if (t3 != this.h.n) return false;
        return true;
    }

    @Override
    protected void a(T t2, double d10, double d11, double d12, float f10, float f11) {
        block23: {
            block27: {
                int n2;
                block20: {
                    float f12;
                    float f13;
                    float f14;
                    float f15;
                    int n3;
                    double d13;
                    double d14;
                    double d15;
                    I i2;
                    W w2;
                    m[] arrm;
                    block19: {
                        int n4;
                        double d16;
                        double d17;
                        double d18;
                        double d19;
                        x x2;
                        block26: {
                            block25: {
                                block24: {
                                    block22: {
                                        boolean bl2;
                                        block21: {
                                            arrm = b.b();
                                            bl2 = fU.ag();
                                            if (arrm != null) break block21;
                                            if (!bl2) break block22;
                                            bl2 = cS.dn;
                                        }
                                        if (bl2) break block23;
                                    }
                                    x2 = ((C)t2).e();
                                    if (arrm != null) break block24;
                                    if (x2 == null) break block23;
                                    d11 -= (1.6 - (double)((C)t2).aD) * 0.5;
                                }
                                w2 = W.c();
                                i2 = w2.b();
                                double d20 = this.a((double)x2.ak, (double)x2.e, (double)(f11 * 0.5f)) * 0.01745329238474369;
                                d19 = this.a((double)x2.E, (double)x2.at, (double)(f11 * 0.5f)) * 0.01745329238474369;
                                d18 = Math.cos(d20);
                                d17 = Math.sin(d20);
                                d16 = Math.sin(d19);
                                if (arrm != null) break block25;
                                if (!(x2 instanceof z)) break block26;
                                d18 = 0.0;
                                d17 = 0.0;
                            }
                            d16 = -1.0;
                        }
                        double d21 = Math.cos(d19);
                        double d22 = this.a(x2.N, x2.a, (double)f11) - d18 * 0.7 - d17 * 0.5 * d21;
                        double d23 = this.a(x2.L + (double)x2.l() * 0.7, x2.aF + (double)x2.l() * 0.7, (double)f11) - d16 * 0.5 - 0.25;
                        double d24 = this.a(x2.k, x2.ax, (double)f11) - d17 * 0.7 + d18 * 0.5 * d21;
                        double d25 = this.a((double)((C)t2).aU, (double)((C)t2).bf, (double)f11) * 0.01745329238474369 + 1.5707963267948966;
                        d18 = Math.cos(d25) * (double)((C)t2).ad * 0.4;
                        d17 = Math.sin(d25) * (double)((C)t2).ad * 0.4;
                        double d26 = this.a(((C)t2).N, ((C)t2).a, (double)f11) + d18;
                        double d27 = this.a(((C)t2).L, ((C)t2).aF, (double)f11);
                        double d28 = this.a(((C)t2).k, ((C)t2).ax, (double)f11) + d17;
                        d10 += d18;
                        d12 += d17;
                        d15 = (float)(d22 - d26);
                        d14 = (float)(d23 - d27);
                        d13 = (float)(d24 - d28);
                        net.minecraft.client.a.v.L();
                        net.minecraft.client.a.v.y();
                        net.minecraft.client.a.v.E();
                        int n5 = fU.ag();
                        if (arrm == null) {
                            if (n5 != 0) {
                                cS.r();
                            }
                            n5 = 24;
                        }
                        int n6 = n5;
                        double d29 = 0.025;
                        i2.a(5, net.minecraft.client.y.b.i);
                        for (n3 = 0; n3 <= 24; ++n3) {
                            f15 = 0.5f;
                            f14 = 0.4f;
                            f13 = 0.3f;
                            n4 = n3 % 2;
                            if (arrm == null) {
                                int n7;
                                if (arrm == null) {
                                    if (n4 == 0) {
                                        f15 *= 0.7f;
                                        f14 *= 0.7f;
                                        f13 *= 0.7f;
                                    }
                                    n7 = n3;
                                }
                                f12 = (float)n7 / 24.0f;
                                i2.c(d10 + d15 * (double)f12 + 0.0, d11 + d14 * (double)(f12 * f12 + f12) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f), d12 + d13 * (double)f12).a(f15, f14, f13, 1.0f).d();
                                i2.c(d10 + d15 * (double)f12 + 0.025, d11 + d14 * (double)(f12 * f12 + f12) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f) + 0.025, d12 + d13 * (double)f12).a(f15, f14, f13, 1.0f).d();
                                if (arrm == null) continue;
                            }
                            break block19;
                        }
                        w2.a();
                        i2.a(5, net.minecraft.client.y.b.i);
                        n4 = n3 = 0;
                    }
                    while (n3 <= 24) {
                        f15 = 0.5f;
                        f14 = 0.4f;
                        f13 = 0.3f;
                        n2 = n3 % 2;
                        if (arrm == null) {
                            int n8;
                            if (arrm == null) {
                                if (n2 == 0) {
                                    f15 *= 0.7f;
                                    f14 *= 0.7f;
                                    f13 *= 0.7f;
                                }
                                n8 = n3;
                            }
                            f12 = (float)n8 / 24.0f;
                            i2.c(d10 + d15 * (double)f12 + 0.0, d11 + d14 * (double)(f12 * f12 + f12) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f) + 0.025, d12 + d13 * (double)f12).a(f15, f14, f13, 1.0f).d();
                            i2.c(d10 + d15 * (double)f12 + 0.025, d11 + d14 * (double)(f12 * f12 + f12) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f), d12 + d13 * (double)f12 + 0.025).a(f15, f14, f13, 1.0f).d();
                            ++n3;
                            if (arrm == null) continue;
                        }
                        break block20;
                    }
                    w2.a();
                    if (arrm != null) break block27;
                    n2 = fU.ag();
                }
                if (n2 != 0) {
                    cS.R();
                }
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.x();
            }
            net.minecraft.client.a.v.c();
        }
    }

    public u(a4 a42, j j2, float f10) {
        super(a42, j2, f10);
    }

    public static void b(boolean bl2) {
        y = bl2;
    }

    public void b(T t2) {
        int n2 = ((x)t2).aS();
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        as.a(as.p, n3, (float)n4);
    }

    public static boolean a() {
        return y;
    }

    private double a(double d10, double d11, double d12) {
        return d10 + (d11 - d10) * d12;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

