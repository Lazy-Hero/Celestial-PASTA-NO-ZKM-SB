/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.util.BitSet;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.client.a.I;
import net.minecraft.client.a.O;
import net.minecraft.client.a.aX;
import net.minecraft.client.a.f;
import net.minecraft.client.a.y;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.k.p;

public class aJ {
    private final /* synthetic */ int[] a;
    private final /* synthetic */ float[] b;

    public aJ() {
        this.b = new float[4];
        this.a = new int[4];
    }

    static int[] a(aJ aJ2) {
        return aJ2.a;
    }

    private int a(int n2, int n3, int n4, int n5) {
        String string = I.j();
        int n6 = n2;
        if (string == null) {
            if (n6 == 0) {
                n2 = n5;
            }
            n6 = n3;
        }
        if (string == null) {
            if (n6 == 0) {
                n3 = n5;
            }
            n6 = n4;
        }
        if (string == null) {
            if (n6 == 0) {
                n4 = n5;
            }
            n6 = n2 + n3 + n4 + n5 >> 2 & 0xFF00FF;
        }
        return n6;
    }

    public aJ(y y2) {
        this.b = new float[4];
        this.a = new int[4];
    }

    public void a(t t2, i i2, n n2, aA aA2, float[] arrf, BitSet bitSet) {
        block30: {
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            int n3;
            int n4;
            float f15;
            int n5;
            float f16;
            int n6;
            float f17;
            int n7;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            int n8;
            int n9;
            int n10;
            int n11;
            block29: {
                boolean bl2;
                O o2;
                String string;
                block28: {
                    boolean bl3;
                    o o3;
                    o o4;
                    o o5;
                    o o6;
                    p p2;
                    n n12;
                    block26: {
                        block27: {
                            int n13;
                            block24: {
                                block25: {
                                    block23: {
                                        block22: {
                                            boolean bl4;
                                            block21: {
                                                boolean bl5;
                                                boolean bl6;
                                                block20: {
                                                    block19: {
                                                        boolean bl7;
                                                        block18: {
                                                            boolean bl8;
                                                            block17: {
                                                                block16: {
                                                                    boolean bl9;
                                                                    block15: {
                                                                        boolean bl10;
                                                                        block14: {
                                                                            block13: {
                                                                                boolean bl11;
                                                                                block12: {
                                                                                    string = I.j();
                                                                                    n12 = bitSet.get(0) ? n2.a(aA2) : n2;
                                                                                    p2 = p.a();
                                                                                    o2 = O.a(aA2);
                                                                                    o6 = p.a(n12).a(O.c(o2)[0]);
                                                                                    o5 = p.a(n12).a(O.c(o2)[1]);
                                                                                    o4 = p.a(n12).a(O.c(o2)[2]);
                                                                                    o3 = p.a(n12).a(O.c(o2)[3]);
                                                                                    n11 = i2.e(t2, o6);
                                                                                    n10 = i2.e(t2, o5);
                                                                                    n9 = i2.e(t2, o4);
                                                                                    n8 = i2.e(t2, o3);
                                                                                    f22 = t2.d(o6).g();
                                                                                    f21 = t2.d(o5).g();
                                                                                    f20 = t2.d(o4).g();
                                                                                    f19 = t2.d(o3).g();
                                                                                    f22 = y.a(f22);
                                                                                    f21 = y.a(f21);
                                                                                    f20 = y.a(f20);
                                                                                    f19 = y.a(f19);
                                                                                    bl10 = t2.d(p2.b(o6).a(aA2)).l();
                                                                                    bl6 = t2.d(p2.b(o5).a(aA2)).l();
                                                                                    bl8 = t2.d(p2.b(o4).a(aA2)).l();
                                                                                    bl5 = t2.d(p2.b(o3).a(aA2)).l();
                                                                                    bl11 = bl8;
                                                                                    if (string != null) break block12;
                                                                                    if (bl11) break block13;
                                                                                    bl11 = bl10;
                                                                                }
                                                                                if (bl11) break block13;
                                                                                f18 = f22;
                                                                                n7 = n11;
                                                                                if (string == null) break block14;
                                                                                m.b(!m.d());
                                                                            }
                                                                            o o7 = p2.b(o6).a(O.c(o2)[2]);
                                                                            f18 = t2.d(o7).g();
                                                                            f18 = y.a(f18);
                                                                            n7 = i2.e(t2, o7);
                                                                        }
                                                                        bl9 = bl5;
                                                                        if (string != null) break block15;
                                                                        if (bl9) break block16;
                                                                        bl9 = bl10;
                                                                    }
                                                                    if (bl9) break block16;
                                                                    f17 = f22;
                                                                    n6 = n11;
                                                                    if (string == null) break block17;
                                                                }
                                                                o o8 = p2.b(o6).a(O.c(o2)[3]);
                                                                f17 = t2.d(o8).g();
                                                                f17 = y.a(f17);
                                                                n6 = i2.e(t2, o8);
                                                            }
                                                            bl7 = bl8;
                                                            if (string != null) break block18;
                                                            if (bl7) break block19;
                                                            bl7 = bl6;
                                                        }
                                                        if (bl7) break block19;
                                                        f16 = f21;
                                                        n5 = n10;
                                                        if (string == null) break block20;
                                                    }
                                                    o o9 = p2.b(o5).a(O.c(o2)[2]);
                                                    f16 = t2.d(o9).g();
                                                    f16 = y.a(f16);
                                                    n5 = i2.e(t2, o9);
                                                }
                                                bl4 = bl5;
                                                if (string != null) break block21;
                                                if (bl4) break block22;
                                                bl4 = bl6;
                                            }
                                            if (bl4) break block22;
                                            f15 = f21;
                                            n4 = n10;
                                            if (string == null) break block23;
                                        }
                                        o o10 = p2.b(o5).a(O.c(o2)[3]);
                                        f15 = t2.d(o10).g();
                                        f15 = y.a(f15);
                                        n4 = i2.e(t2, o10);
                                    }
                                    n3 = i2.e(t2, n2);
                                    n13 = bitSet.get(0);
                                    if (string != null) break block24;
                                    if (n13 != 0) break block25;
                                    bl3 = t2.d(n2.a(aA2)).i();
                                    if (string != null) break block26;
                                    if (bl3) break block27;
                                }
                                n13 = i2.e(t2, n2.a(aA2));
                            }
                            n3 = n13;
                        }
                        bl3 = bitSet.get(0);
                    }
                    f14 = bl3 ? t2.d(n12).g() : t2.d(n2).g();
                    f14 = y.a(f14);
                    f f23 = f.a(aA2);
                    p2.b();
                    ((p)o6).b();
                    ((p)o5).b();
                    ((p)o4).b();
                    ((p)o3).b();
                    bl2 = bitSet.get(1);
                    if (string != null) break block28;
                    if (!bl2) break block29;
                    bl2 = O.f(o2);
                }
                if (!bl2) break block29;
                f13 = (f19 + f22 + f17 + f14) * 0.25f;
                f12 = (f20 + f22 + f18 + f14) * 0.25f;
                f11 = (f20 + f21 + f16 + f14) * 0.25f;
                f10 = (f19 + f21 + f15 + f14) * 0.25f;
                float f24 = arrf[aX.a(O.d(o2)[0])] * arrf[aX.a(O.d(o2)[1])];
                float f25 = arrf[aX.a(O.d(o2)[2])] * arrf[aX.a(O.d(o2)[3])];
                float f26 = arrf[aX.a(O.d(o2)[4])] * arrf[aX.a(O.d(o2)[5])];
                float f27 = arrf[aX.a(O.d(o2)[6])] * arrf[aX.a(O.d(o2)[7])];
                float f28 = arrf[aX.a(O.b(o2)[0])] * arrf[aX.a(O.b(o2)[1])];
                float f29 = arrf[aX.a(O.b(o2)[2])] * arrf[aX.a(O.b(o2)[3])];
                float f30 = arrf[aX.a(O.b(o2)[4])] * arrf[aX.a(O.b(o2)[5])];
                float f31 = arrf[aX.a(O.b(o2)[6])] * arrf[aX.a(O.b(o2)[7])];
                float f32 = arrf[aX.a(O.a(o2)[0])] * arrf[aX.a(O.a(o2)[1])];
                float f33 = arrf[aX.a(O.a(o2)[2])] * arrf[aX.a(O.a(o2)[3])];
                float f34 = arrf[aX.a(O.a(o2)[4])] * arrf[aX.a(O.a(o2)[5])];
                float f35 = arrf[aX.a(O.a(o2)[6])] * arrf[aX.a(O.a(o2)[7])];
                float f36 = arrf[aX.a(O.e(o2)[0])] * arrf[aX.a(O.e(o2)[1])];
                float f37 = arrf[aX.a(O.e(o2)[2])] * arrf[aX.a(O.e(o2)[3])];
                float f38 = arrf[aX.a(O.e(o2)[4])] * arrf[aX.a(O.e(o2)[5])];
                float f39 = arrf[aX.a(O.e(o2)[6])] * arrf[aX.a(O.e(o2)[7])];
                this.b[f.c((f)f23)] = f13 * f24 + f12 * f25 + f11 * f26 + f10 * f27;
                this.b[f.b((f)f23)] = f13 * f28 + f12 * f29 + f11 * f30 + f10 * f31;
                this.b[f.d((f)f23)] = f13 * f32 + f12 * f33 + f11 * f34 + f10 * f35;
                this.b[f.a((f)f23)] = f13 * f36 + f12 * f37 + f11 * f38 + f10 * f39;
                int n14 = this.a(n8, n11, n6, n3);
                int n15 = this.a(n9, n11, n7, n3);
                int n16 = this.a(n9, n10, n5, n3);
                int n17 = this.a(n8, n10, n4, n3);
                this.a[f.c((f)f23)] = this.a(n14, n15, n16, n17, f24, f25, f26, f27);
                this.a[f.b((f)f23)] = this.a(n14, n15, n16, n17, f28, f29, f30, f31);
                this.a[f.d((f)f23)] = this.a(n14, n15, n16, n17, f32, f33, f34, f35);
                this.a[f.a((f)f23)] = this.a(n14, n15, n16, n17, f36, f37, f38, f39);
                if (string == null) break block30;
            }
            f13 = (f19 + f22 + f17 + f14) * 0.25f;
            f12 = (f20 + f22 + f18 + f14) * 0.25f;
            f11 = (f20 + f21 + f16 + f14) * 0.25f;
            f10 = (f19 + f21 + f15 + f14) * 0.25f;
            this.a[f.c((f)f23)] = this.a(n8, n11, n6, n3);
            this.a[f.b((f)f23)] = this.a(n9, n11, n7, n3);
            this.a[f.d((f)f23)] = this.a(n9, n10, n5, n3);
            this.a[f.a((f)f23)] = this.a(n8, n10, n4, n3);
            this.b[f.c((f)f23)] = f13;
            this.b[f.b((f)f23)] = f12;
            this.b[f.d((f)f23)] = f11;
            this.b[f.a((f)f23)] = f10;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static float[] b(aJ aJ2) {
        return aJ2.b;
    }

    private int a(int n2, int n3, int n4, int n5, float f10, float f11, float f12, float f13) {
        int n6 = (int)((float)(n2 >> 16 & 0xFF) * f10 + (float)(n3 >> 16 & 0xFF) * f11 + (float)(n4 >> 16 & 0xFF) * f12 + (float)(n5 >> 16 & 0xFF) * f13) & 0xFF;
        int n7 = (int)((float)(n2 & 0xFF) * f10 + (float)(n3 & 0xFF) * f11 + (float)(n4 & 0xFF) * f12 + (float)(n5 & 0xFF) * f13) & 0xFF;
        return n6 << 16 | n7;
    }
}

