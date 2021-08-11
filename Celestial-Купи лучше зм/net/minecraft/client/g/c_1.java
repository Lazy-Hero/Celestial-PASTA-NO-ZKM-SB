/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.G;

import net.minecraft.k.m;

public class c {
    public /* synthetic */ float[] e;
    public /* synthetic */ float[] b;
    private static /* synthetic */ m[] c;
    public /* synthetic */ float[][] d;
    public /* synthetic */ float[] a;

    public static void b(m[] arrm) {
        c = arrm;
    }

    public c() {
        this.d = new float[6][4];
        this.e = new float[16];
        this.a = new float[16];
        this.b = new float[16];
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        if (net.minecraft.client.G.c.b() == null) {
            net.minecraft.client.G.c.b(new m[3]);
        }
    }

    private float a(float[] arrf, float f10, float f11, float f12) {
        return arrf[0] * f10 + arrf[1] * f11 + arrf[2] * f12 + arrf[3];
    }

    public static m[] b() {
        return c;
    }

    public boolean a(double d10, double d11, double d12, double d13, double d14, double d15) {
        int n2;
        block3: {
            float f10 = (float)d10;
            float f11 = (float)d11;
            float f12 = (float)d12;
            float f13 = (float)d13;
            float f14 = (float)d14;
            m[] arrm = net.minecraft.client.G.c.b();
            float f15 = (float)d15;
            int n3 = 0;
            while (n3 < 6) {
                block4: {
                    block5: {
                        float f16;
                        block12: {
                            block11: {
                                float[] arrf;
                                block10: {
                                    block9: {
                                        block8: {
                                            block7: {
                                                block6: {
                                                    arrf = this.d[n3];
                                                    if (arrm == null) break block4;
                                                    float f17 = this.a(arrf, f10, f11, f12) - 0.0f;
                                                    n2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                                                    if (arrm == null) break block3;
                                                    if (n2 > 0) break block5;
                                                    float f18 = this.a(arrf, f13, f11, f12) - 0.0f;
                                                    f16 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                                    if (arrm == null) break block6;
                                                    if (f16 > 0) break block5;
                                                    float f19 = this.a(arrf, f10, f14, f12) - 0.0f;
                                                    f16 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                                                }
                                                if (arrm == null) break block7;
                                                if (f16 > 0) break block5;
                                                float f20 = this.a(arrf, f13, f14, f12) - 0.0f;
                                                f16 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                                            }
                                            if (arrm == null) break block8;
                                            if (f16 > 0) break block5;
                                            float f21 = this.a(arrf, f10, f11, f15) - 0.0f;
                                            f16 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                                        }
                                        if (arrm == null) break block9;
                                        if (f16 > 0) break block5;
                                        float f22 = this.a(arrf, f13, f11, f15) - 0.0f;
                                        f16 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
                                    }
                                    if (arrm == null) break block10;
                                    if (f16 > 0) break block5;
                                    float f23 = this.a(arrf, f10, f14, f15) - 0.0f;
                                    f16 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                                }
                                if (arrm == null) break block11;
                                if (f16 > 0) break block5;
                                float f24 = this.a(arrf, f13, f14, f15) - 0.0f;
                                f16 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                            }
                            if (arrm == null) break block12;
                            if (f16 > 0) break block5;
                            f16 = 0.0f;
                        }
                        return (boolean)f16;
                    }
                    ++n3;
                }
                if (arrm != null) continue;
                m.b(!m.d());
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }
}

