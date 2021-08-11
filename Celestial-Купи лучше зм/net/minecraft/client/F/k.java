/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.E;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.w.y;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class k
extends f<E> {
    private final /* synthetic */ y g;
    private static final /* synthetic */ v a;

    static {
        a = new v("textures/entity/enchanting_table_book.png");
    }

    @Override
    public void a(E e10, double d10, double d11, double d12, float f10, int n2, float f11) {
        block18: {
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            block17: {
                float f17;
                block16: {
                    float f18;
                    String[] arrstring;
                    block15: {
                        float f19;
                        block14: {
                            String[] arrstring2 = net.minecraft.client.F.f.b();
                            net.minecraft.client.a.v.M();
                            net.minecraft.client.a.v.b((float)d10 + 0.5f, (float)d11 + 0.75f, (float)d12 + 0.5f);
                            arrstring = arrstring2;
                            f16 = (float)e10.j + f10;
                            net.minecraft.client.a.v.b(0.0f, 0.1f + h.g(f16 * 0.1f) * 0.01f, 0.0f);
                            for (f19 = e10.p - e10.o; f19 >= (float)Math.PI; f19 -= (float)Math.PI * 2) {
                                if (arrstring != null) {
                                    if (arrstring != null) continue;
                                }
                                break block14;
                            }
                            while (f19 < (float)(-Math.PI)) {
                                f18 = f19 + (float)Math.PI * 2;
                                if (arrstring != null) {
                                    f19 = f18;
                                    if (arrstring != null) continue;
                                }
                                break block15;
                            }
                        }
                        f18 = e10.o + f19 * f10;
                    }
                    float f20 = f18;
                    net.minecraft.client.a.v.a(-f20 * 57.295776f, 0.0f, 1.0f, 0.0f);
                    net.minecraft.client.a.v.a(80.0f, 0.0f, 0.0f, 1.0f);
                    this.b(a);
                    f15 = e10.i + (e10.k - e10.i) * f10 + 0.25f;
                    f14 = e10.i + (e10.k - e10.i) * f10 + 0.75f;
                    f15 = (f15 - (float)h.c((double)f15)) * 1.6f - 0.3f;
                    f14 = (f14 - (float)h.c((double)f14)) * 1.6f - 0.3f;
                    float f21 = f15 - 0.0f;
                    f17 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                    if (arrstring != null) {
                        float f22;
                        if (f17 < 0) {
                            f15 = 0.0f;
                        }
                        f17 = (f22 = f14 - 0.0f) == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
                    }
                    if (arrstring != null) {
                        float f23;
                        if (f17 < 0) {
                            f14 = 0.0f;
                        }
                        f17 = (f23 = f15 - 1.0f) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                    }
                    if (arrstring == null) break block16;
                    if (f17 > 0) {
                        f15 = 1.0f;
                    }
                    f13 = f14;
                    f12 = 1.0f;
                    if (arrstring == null) break block17;
                    float f24 = f13 - f12;
                    f17 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                }
                if (f17 > 0) {
                    f14 = 1.0f;
                }
                f13 = e10.m;
                f12 = (e10.r - e10.m) * f10;
            }
            float f25 = f13 + f12;
            net.minecraft.client.a.v.c();
            this.g.b(null, f16, f15, f14, f25, 0.0f, 0.0625f);
            net.minecraft.client.a.v.B();
            if (m.d()) break block18;
            net.minecraft.client.F.f.b(new String[1]);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k() {
        this.g = new y();
    }
}

