/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.k.h;

public class w {
    private final /* synthetic */ B a;
    private /* synthetic */ float c;
    private /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    private float a(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = h.b(f10 - f11);
                int[] arrn = M.b();
                float f17 = f16 - -f12;
                f15 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                if (arrn == null) break block5;
                if (f15 < 0) {
                    f16 = -f12;
                }
                f14 = f16;
                f13 = f12;
                if (arrn == null) break block6;
                float f18 = f14 - f13;
                f15 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            }
            if (f15 >= 0) {
                f16 = f12;
            }
            f14 = f10;
            f13 = f16;
        }
        return f14 - f13;
    }

    public void a() {
        block6: {
            float f10;
            block12: {
                w w2;
                block11: {
                    float f11;
                    int[] arrn;
                    block9: {
                        block10: {
                            block8: {
                                double d10;
                                block7: {
                                    block4: {
                                        block5: {
                                            double d11 = this.a.a - this.a.N;
                                            arrn = M.b();
                                            double d12 = this.a.ax - this.a.k;
                                            double d13 = d11 * d11 + d12 * d12 - 2.500000277905201E-7;
                                            d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (arrn == null) break block4;
                                            if (d10 <= 0) break block5;
                                            this.a.bf = this.a.e;
                                            this.c = this.a.a1 = this.a(this.a.bf, this.a.a1, 75.0f);
                                            this.b = 0;
                                            if (arrn != null) break block6;
                                        }
                                        d10 = (double)this.a.j().isEmpty();
                                    }
                                    if (arrn == null) break block7;
                                    if (d10 != false) break block8;
                                    d10 = (double)(this.a.j().get(0) instanceof C);
                                }
                                if (d10 != false) break block6;
                            }
                            f10 = 75.0f;
                            float f12 = Math.abs(this.a.a1 - this.c) - 15.0f;
                            f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            if (arrn == null) break block9;
                            if (f11 <= 0) break block10;
                            this.b = 0;
                            this.c = this.a.a1;
                            if (arrn != null) break block11;
                        }
                        ++this.b;
                        f11 = 10;
                    }
                    float f13 = f11;
                    w2 = this;
                    if (arrn == null) break block12;
                    if (w2.b > 10) {
                        f10 = Math.max(1.0f - (float)(this.b - 10) / 10.0f, 0.0f) * 75.0f;
                    }
                }
                w2 = this;
            }
            w2.a.bf = this.a(this.a.a1, this.a.bf, f10);
        }
    }

    public w(B b10) {
        this.a = b10;
    }
}

