/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ak.an;
import net.minecraft.ak.h;
import net.minecraft.e.a;
import net.minecraft.e.b;
import net.minecraft.e.i;

public class d {
    protected /* synthetic */ double f;
    protected /* synthetic */ float c;
    public /* synthetic */ an a;
    protected /* synthetic */ double b;
    protected final /* synthetic */ C e;
    protected /* synthetic */ float d;
    protected /* synthetic */ double h;
    protected /* synthetic */ double g;

    public void a(double d10, double d11, double d12, double d13) {
        this.h = d10;
        this.b = d11;
        this.g = d12;
        this.f = d13;
        this.a = an.MOVE_TO;
    }

    public double b() {
        return this.h;
    }

    public void a() {
        block19: {
            d d10;
            block24: {
                block25: {
                    String string;
                    block26: {
                        an an2;
                        an an3;
                        block20: {
                            block21: {
                                block23: {
                                    double d11;
                                    block22: {
                                        double d12;
                                        float f10;
                                        block15: {
                                            block16: {
                                                block17: {
                                                    float f11;
                                                    block18: {
                                                        float f12;
                                                        string = net.minecraft.ak.h.h();
                                                        an3 = this.a;
                                                        an2 = an.STRAFE;
                                                        if (string != null) break block15;
                                                        if (an3 != an2) break block16;
                                                        float f13 = (float)this.e.a(M.d).d();
                                                        f11 = (float)this.f * f13;
                                                        float f14 = this.c;
                                                        float f15 = this.d;
                                                        float f16 = f12 = net.minecraft.k.h.a(f14 * f14 + f15 * f15);
                                                        float f17 = 1.0f;
                                                        if (string == null) {
                                                            if (f16 < f17) {
                                                                f12 = 1.0f;
                                                            }
                                                            f12 = f11 / f12;
                                                            f14 *= f12;
                                                            f15 *= f12;
                                                            f16 = this.e.e;
                                                            f17 = (float)Math.PI / 180;
                                                        }
                                                        float f18 = net.minecraft.k.h.g(f16 * f17);
                                                        float f19 = net.minecraft.k.h.c(this.e.e * ((float)Math.PI / 180));
                                                        float f20 = f14 * f19 - f15 * f18;
                                                        f10 = f15 * f19 + f14 * f18;
                                                        i i2 = this.e.l();
                                                        if (string != null) break block17;
                                                        if (i2 == null) break block18;
                                                        b b10 = i2.b();
                                                        if (string != null) break block17;
                                                        if (b10 != null && b10.a(this.e.aG, net.minecraft.k.h.f(this.e.a + (double)f20), net.minecraft.k.h.f(this.e.aF), net.minecraft.k.h.f(this.e.ax + (double)f10)) != net.minecraft.e.a.WALKABLE) {
                                                            this.c = 1.0f;
                                                            this.d = 0.0f;
                                                            f11 = f13;
                                                        }
                                                    }
                                                    this.e.g(f11);
                                                    this.e.c(this.c);
                                                    this.e.j(this.d);
                                                    this.a = an.WAIT;
                                                }
                                                if (string == null) break block19;
                                            }
                                            an3 = this.a;
                                            an2 = an.MOVE_TO;
                                        }
                                        if (string != null) break block20;
                                        if (an3 != an2) break block21;
                                        this.a = an.WAIT;
                                        double d13 = this.h - this.e.a;
                                        double d14 = this.g - this.e.ax;
                                        double d15 = this.b - this.e.aF;
                                        double d16 = d12 = d13 * d13 + d15 * d15 + d14 * d14;
                                        double d17 = 2.500000277905201E-7;
                                        if (string == null) {
                                            if (d16 < d17) {
                                                this.e.c(0.0f);
                                                return;
                                            }
                                            d16 = net.minecraft.k.h.a(d14, d13);
                                            d17 = 57.29577951308232;
                                        }
                                        f10 = (float)(d16 * d17) - 90.0f;
                                        this.e.e = this.a(this.e.e, f10, 90.0f);
                                        this.e.g((float)(this.f * this.e.a(M.d).d()));
                                        double d18 = d15 - (double)this.e.aI;
                                        d11 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                        if (string != null) break block22;
                                        if (d11 <= 0) break block23;
                                        double d19 = d13 * d13 + d14 * d14 - (double)Math.max(1.0f, this.e.ad);
                                        d11 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                    }
                                    if (d11 < 0) {
                                        this.e.V().b();
                                        this.a = an.JUMPING;
                                    }
                                }
                                if (string == null) break block19;
                            }
                            d10 = this;
                            if (string != null) break block24;
                            an3 = d10.a;
                            an2 = an.JUMPING;
                        }
                        if (an3 != an2) break block25;
                        this.e.g((float)(this.f * this.e.a(M.d).d()));
                        d d20 = this;
                        if (string != null) break block26;
                        if (!d20.e.A) break block19;
                        d20 = this;
                    }
                    d20.a = an.WAIT;
                    if (string == null) break block19;
                }
                d10 = this;
            }
            d10.e.c(0.0f);
        }
    }

    public void a(float f10, float f11) {
        this.a = an.STRAFE;
        this.c = f10;
        this.d = f11;
        this.f = 0.25;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public d(C c10) {
        this.a = an.WAIT;
        this.e = c10;
    }

    public double e() {
        return this.b;
    }

    public void a(d d10) {
        this.a = d10.a;
        this.h = d10.h;
        this.b = d10.b;
        this.g = d10.g;
        this.f = Math.max(d10.f, 1.0);
        this.c = d10.c;
        this.d = d10.d;
    }

    public boolean c() {
        return this.a == an.MOVE_TO;
    }

    public double d() {
        return this.f;
    }

    public double f() {
        return this.g;
    }

    protected float a(float f10, float f11, float f12) {
        float f13;
        block14: {
            float f14;
            block13: {
                float f15;
                block11: {
                    String string;
                    block12: {
                        float f16;
                        float f17;
                        block10: {
                            float f18;
                            float f19;
                            block9: {
                                f19 = net.minecraft.k.h.b(f11 - f10);
                                string = net.minecraft.ak.h.h();
                                f18 = f19 == f12 ? 0 : (f19 > f12 ? 1 : -1);
                                if (string != null) break block9;
                                if (f18 > 0) {
                                    f19 = f12;
                                }
                                f17 = f19;
                                f16 = -f12;
                                if (string != null) break block10;
                                float f20 = f17 - f16;
                                f18 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                            }
                            if (f18 < 0) {
                                f19 = -f12;
                            }
                            f17 = f10;
                            f16 = f19;
                        }
                        f14 = f17 + f16;
                        float f21 = f14 - 0.0f;
                        f15 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                        if (string != null) break block11;
                        if (f15 >= 0) break block12;
                        f14 += 360.0f;
                        if (string == null) break block13;
                    }
                    f13 = f14;
                    if (string != null) break block14;
                    float f22 = f13 - 360.0f;
                    f15 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                }
                if (f15 > 0) {
                    f14 -= 360.0f;
                }
            }
            f13 = f14;
        }
        return f13;
    }
}

