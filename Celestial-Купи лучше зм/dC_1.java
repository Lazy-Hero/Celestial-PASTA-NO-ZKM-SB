/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.d.H;
import net.minecraft.k.h;

public class dC {
    public static /* synthetic */ float c;
    public static /* synthetic */ float b;
    public static /* synthetic */ float e;
    public static /* synthetic */ float h;
    public static /* synthetic */ float i;
    public static /* synthetic */ boolean k;
    public static /* synthetic */ int j;
    public static /* synthetic */ float d;
    public static /* synthetic */ float a;
    private static /* synthetic */ boolean f;
    public static /* synthetic */ float g;

    public static float a() {
        return b;
    }

    @cL
    public void a(fz fz2) {
        block3: {
            int n2;
            block2: {
                boolean bl2 = d5.c();
                n2 = fz2.a() instanceof H;
                if (bl2) break block2;
                if (n2 == 0) break block3;
                n2 = 10;
            }
            j = n2;
        }
    }

    @cL
    public void a(fy fy2) {
        block6: {
            block4: {
                boolean bl2;
                block5: {
                    boolean bl3;
                    block2: {
                        block3: {
                            bl3 = d5.c();
                            bl2 = dC.c();
                            if (bl3) break block2;
                            if (bl2) break block3;
                            bl2 = fy2.j();
                            if (bl3) break block2;
                            if (!bl2) break block3;
                            k = true;
                            if (!bl3) break block4;
                        }
                        bl2 = dC.c();
                    }
                    if (bl3) break block4;
                    if (bl2) break block5;
                    bl2 = k;
                    if (bl3) break block4;
                    if (!bl2) break block5;
                    bl2 = fy2.f();
                    if (bl3) break block4;
                    if (!bl2) break block5;
                    e = Q.P().s.at;
                    b = Q.P().s.e;
                    g = Q.P().s.at;
                    i = Q.P().s.e;
                    h = Q.P().s.bf;
                    k = false;
                    if (!bl3) break block4;
                }
                bl2 = k = false;
            }
            if (!fy2.j()) break block6;
            a = h;
            g = e;
            i = b;
            h = dC.a(h, b, 50.0f);
            dC.b();
            d = c;
            c = b;
        }
    }

    private static float a(float f10, float f11, float f12) {
        return 0.0f;
    }

    static {
        k = false;
    }

    public static float b(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = net.minecraft.k.h.b(f10 - f11);
                boolean bl2 = d5.c();
                float f17 = f16 - -f12;
                f15 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                if (bl2) break block5;
                if (f15 < 0) {
                    f16 = -f12;
                }
                f14 = f16;
                f13 = f12;
                if (bl2) break block6;
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

    public static boolean c() {
        return f;
    }

    public static void b() {
        block4: {
            double d10;
            block5: {
                boolean bl2;
                block2: {
                    block3: {
                        Q q2 = Q.P();
                        double d11 = q2.s.a - q2.s.N;
                        double d12 = q2.s.ax - q2.s.k;
                        bl2 = d5.a();
                        double d13 = d11 * d11 + d12 * d12 - 2.500000277905201E-7;
                        d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        if (!bl2) break block2;
                        if (d10 <= 0) break block3;
                        h = dC.a((float)hC.f(), b, 50.0f);
                        j = 0;
                        if (bl2) break block4;
                    }
                    d10 = j;
                }
                if (!bl2) break block5;
                if (d10 <= 0) break block4;
                d10 = j - 1;
            }
            j = (int)d10;
            h = dC.b(b, h, 10.0f);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

