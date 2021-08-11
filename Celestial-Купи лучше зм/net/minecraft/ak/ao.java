/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ak.h;

public class ao {
    private /* synthetic */ double c;
    private /* synthetic */ float a;
    private final /* synthetic */ C g;
    private /* synthetic */ float d;
    private /* synthetic */ double e;
    private /* synthetic */ boolean f;
    private /* synthetic */ double b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public double d() {
        return this.b;
    }

    public void a(x x2, float f10, float f11) {
        block4: {
            double d10;
            block2: {
                ao ao2;
                block3: {
                    String string = h.h();
                    ao2 = this;
                    d10 = x2.a;
                    if (string != null) break block2;
                    ao2.e = d10;
                    if (!(x2 instanceof B)) break block3;
                    this.c = x2.aF + (double)x2.l();
                    if (string == null) break block4;
                }
                ao2 = this;
                d10 = (x2.m().b + x2.m().a) / 2.0;
            }
            ao2.c = d10;
        }
        this.b = x2.ax;
        this.d = f10;
        this.a = f11;
        this.f = true;
    }

    private float a(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = net.minecraft.k.h.b(f11 - f10);
                String string = h.h();
                f15 = f16 == f12 ? 0 : (f16 > f12 ? 1 : -1);
                if (string != null) break block5;
                if (f15 > 0) {
                    f16 = f12;
                }
                f14 = f16;
                f13 = -f12;
                if (string != null) break block6;
                float f17 = f14 - f13;
                f15 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            }
            if (f15 < 0) {
                f16 = -f12;
            }
            f14 = f10;
            f13 = f16;
        }
        return f14 + f13;
    }

    public ao(C c10) {
        this.g = c10;
    }

    public boolean e() {
        return this.f;
    }

    public double b() {
        return this.c;
    }

    public void a(double d10, double d11, double d12, float f10, float f11) {
        this.e = d10;
        this.c = d11;
        this.b = d12;
        this.d = f10;
        this.a = f11;
        this.f = true;
    }

    public void c() {
        block11: {
            int n2;
            float f10;
            String string;
            block10: {
                block9: {
                    block7: {
                        ao ao2;
                        block8: {
                            this.g.at = 0.0f;
                            string = h.h();
                            ao2 = this;
                            if (string != null) break block7;
                            if (!ao2.f) break block8;
                            this.f = false;
                            double d10 = this.e - this.g.a;
                            double d11 = this.c - (this.g.aF + (double)this.g.l());
                            double d12 = this.b - this.g.ax;
                            double d13 = net.minecraft.k.h.e(d10 * d10 + d12 * d12);
                            float f11 = (float)(net.minecraft.k.h.a(d12, d10) * 57.29577951308232) - 90.0f;
                            float f12 = (float)(-(net.minecraft.k.h.a(d11, d13) * 57.29577951308232));
                            this.g.at = this.a(this.g.at, f12, this.a);
                            this.g.a1 = this.a(this.g.a1, f11, this.d);
                            if (string == null) break block9;
                        }
                        ao2 = this;
                    }
                    ao2.g.a1 = this.a(this.g.a1, this.g.bf, 10.0f);
                }
                f10 = net.minecraft.k.h.b(this.g.a1 - this.g.bf);
                n2 = this.g.l().o();
                if (string != null) break block10;
                if (n2 != 0) break block11;
                float f13 = f10 - -75.0f;
                n2 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
            }
            if (string == null) {
                float f14;
                if (n2 < 0) {
                    this.g.a1 = this.g.bf - 75.0f;
                }
                n2 = (f14 = f10 - 75.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            }
            if (n2 > 0) {
                this.g.a1 = this.g.bf + 75.0f;
            }
        }
    }

    public double a() {
        return this.e;
    }
}

