/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class d5
implements ag {
    private static /* synthetic */ boolean e;

    public static boolean c() {
        return e;
    }

    public static boolean a() {
        boolean bl2 = d5.c();
        return !bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static x a(x var0, double var1_1) {
        var4_2 = var0.h().c(new l(0.0, var0.l(), 0.0));
        var5_3 = d5.b.s.h().c(new l(0.0, d5.b.s.l(), 0.0));
        var6_4 = d5.b.s.m().d(var4_2.e - var5_3.e, var4_2.d - var5_3.d, var4_2.b - var5_3.b).a(1.0, 1.0, 1.0);
        var7_5 = null;
        var3_6 = d5.c();
        var9_7 = d5.b.e.b((x)d5.b.s, var6_4).iterator();
        while (var9_7.hasNext()) {
            block7: {
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                block6: {
                                    v0 = var11_10 = (var10_9 = var9_7.next());
                                    if (var3_6 != false) return v0;
                                    v1 = v0.M();
                                    if (var3_6) break block6;
                                    if (!v1) break block7;
                                    v2 = var11_10;
                                    if (var3_6) break block8;
                                    v1 = v2 instanceof B;
                                }
                                if (!v1) break block7;
                                v2 = var11_10;
                            }
                            var12_11 = v2.aw();
                            var13_12 = var11_10.m().a((double)var12_11, var12_11, var12_11);
                            var14_13 = var13_12.b(var5_3, var4_2);
                            v3 = var13_12.b(var5_3);
                            if (var3_6) break block9;
                            if (v3 == 0) break block10;
                            cfr_temp_0 = var1_1 - 0.0;
                            v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        }
                        if (v3 < 0) break block7;
                        var7_5 = var11_10;
                        v4 = var14_13;
                        if (var3_6) ** GOTO lbl37
                        if (v4 == null) {
                            v5 = var5_3;
                        } else {
                            v4 = var14_13;
lbl37:
                            // 2 sources

                            v5 = v4.c;
                        }
                        var8_8 = v5;
                        var1_1 = 0.0;
                        if (!var3_6) break block7;
                    }
                    if (var14_13 == null) break block7;
                    var15_14 = var5_3.d(var14_13.c);
                    if (var3_6) break block11;
                    if (var1_1 != 0.0 && !(var15_14 < var1_1)) break block7;
                    var7_5 = var11_10;
                }
                var8_8 = var14_13.c;
                var1_1 = var15_14;
            }
            if (!var3_6) continue;
        }
        v0 = var7_5;
        return v0;
    }

    static {
        if (!d5.a()) {
            d5.b(true);
        }
    }

    public static boolean a(x x2) {
        float f10 = d5.a(x2.e);
        boolean bl2 = d5.a();
        float f11 = Math.abs(d5.a(d5.a(x2, (x)d5.b.s)) - f10) - (80.0f - d5.b.s.o(x2) / 2.0f);
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (bl2) {
            f12 = f12 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f12;
    }

    public static boolean b(l l2) {
        float[] arrf = d5.a(l2);
        float f10 = Math.abs(h.b(arrf[0] - dC.a())) / 0.6f;
        boolean bl2 = d5.a();
        float f11 = f10 - 20.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (bl2) {
            f12 = f12 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f12;
    }

    public static float[] a(B b10, x x2) {
        if (x2 == null) {
            return new float[]{b10.e, b10.at};
        }
        return d5.a(new l(b10.a, b10.aF, b10.ax), new l(x2.a, x2.aF, x2.ax));
    }

    public static boolean a(float f10, float f11, float f12, float f13, float f14, x x2, double d10) {
        l l2 = d5.b.s.c(1.0f);
        l l3 = x.b(f11, f10);
        l l4 = l2.c(l3.e * d10, l3.d * d10, l3.b * d10);
        i i2 = d5.b.e.a(l2, l4, false, false, true);
        boolean bl2 = d5.c();
        i i3 = i2;
        if (!bl2) {
            if (i3 == null) {
                return false;
            }
            i3 = x2.m().a((double)f12, f13, f14).b(l2, l4);
        }
        return i3 != null;
    }

    public static float[] a(l l2) {
        float[] arrf = new float[2];
        arrf[0] = (float)(Math.atan2(d5.b.s.ax - l2.b, d5.b.s.a - l2.e) / Math.PI * 180.0) + 90.0f;
        float f10 = (float)(d5.b.s.aF + (double)d5.b.s.l() - l2.d);
        float f11 = (float)Math.sqrt((d5.b.s.ax - l2.b) * (d5.b.s.ax - l2.b) + (d5.b.s.a - l2.e) * (d5.b.s.a - l2.e));
        boolean bl2 = d5.c();
        arrf[1] = (float)(Math.atan2(f10, f11) / Math.PI * 180.0);
        if (!m.d()) {
            d5.b(!bl2);
        }
        return arrf;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static float[] a(x x2, boolean bl2) {
        double d10;
        double d11;
        double d12;
        block7: {
            x x3;
            block5: {
                block6: {
                    d12 = x2.a - d5.b.s.a;
                    d11 = x2.ax - d5.b.s.ax;
                    boolean bl3 = d5.c();
                    x3 = x2;
                    if (bl3) break block5;
                    if (!(x3 instanceof B)) break block6;
                    d10 = x2.aF + (double)x2.l() - (d5.b.s.aF + (double)d5.b.s.l()) - 0.5;
                    if (!bl3) break block7;
                    m.b(!m.d());
                }
                x3 = x2;
            }
            d10 = (x3.m().b + x2.m().a) / 2.0 - (d5.b.s.aF + (double)d5.b.s.l());
        }
        double d13 = h.e(d12 * d12 + d11 * d11);
        float f10 = 0.0f;
        if (bl2) {
            f10 = gx.a(-2.0f, 2.0f);
        }
        float f11 = 0.0f;
        if (bl2) {
            f11 = gx.a(-2.0f, 2.0f);
        }
        float f12 = (float)(Math.atan2(d11, d12) * 180.0 / Math.PI - 90.0) + f10;
        float f13 = (float)(-(Math.atan2(d10, d13) * 180.0 / Math.PI)) + f11;
        f13 = h.c(f13, -90.0f, 90.0f);
        float f14 = d5.b.ac.bv * 0.6f + 0.2f;
        float f15 = f14 * f14 * f14 * 1.2f;
        f12 -= f12 % f15;
        f13 -= f13 % f15;
        return new float[]{f12, f13};
    }

    public static float[] a(l l2, l l3) {
        double d10 = l3.e - l2.e;
        double d11 = l3.d - l2.d;
        double d12 = l3.b - l2.b;
        double d13 = h.e(d10 * d10 + d12 * d12);
        float f10 = (float)(Math.atan2(d12, d10) * 180.0 / Math.PI) - 90.0f;
        float f11 = (float)(-(Math.atan2(d11, d13) * 180.0 / Math.PI));
        return new float[]{d5.a(d5.b.s.e, f10, 360.0f), d5.a(d5.b.s.at, f11, 360.0f)};
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float a(float f10, float f11) {
        float f12;
        float f13 = Math.abs(f11 - f10) % 360.0f;
        boolean bl2 = d5.c();
        float f14 = f13;
        float f15 = 180.0f;
        if (!bl2) {
            if (!(f14 > f15)) {
                f12 = f13;
                return f12;
            }
            f14 = 360.0f;
            f15 = f13;
        }
        f12 = f14 - f15;
        return f12;
    }

    public static float a(float f10, float f11, float f12) {
        float f13;
        float f14;
        block6: {
            float f15;
            float f16;
            block5: {
                f16 = h.b(f11 - f10);
                boolean bl2 = d5.c();
                f15 = f16 == f12 ? 0 : (f16 > f12 ? 1 : -1);
                if (bl2) break block5;
                if (f15 > 0) {
                    f16 = f12;
                }
                f14 = f16;
                f13 = -f12;
                if (bl2) break block6;
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

    public static void b(boolean bl2) {
        e = bl2;
    }

    public static boolean a(float f10, float f11, x x2, double d10) {
        l l2 = d5.b.s.c(1.0f);
        l l3 = x.b(f11, f10);
        l l4 = l2.c(l3.e * d10, l3.d * d10, l3.b * d10);
        i i2 = d5.b.e.a(l2, l4, false, false, true);
        boolean bl2 = d5.a();
        i i3 = i2;
        if (bl2) {
            if (i3 == null) {
                return true;
            }
            i3 = x2.m().a(0.06, 0.06, 0.06).b(l2, l4);
        }
        return i3 == null;
    }

    public static l b() {
        return new l(d5.b.s.a, d5.b.s.m().b + (double)d5.b.s.l(), d5.b.s.ax);
    }

    public static float a(float f10) {
        float f11;
        block6: {
            float f12;
            float f13;
            block5: {
                f13 = f10 % 360.0f;
                boolean bl2 = d5.c();
                float f14 = f13 - 180.0f;
                f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (bl2) break block5;
                if (f12 > 0) {
                    return f13 -= 360.0f;
                }
                f11 = f13;
                if (bl2) break block6;
                float f15 = f11 - -180.0f;
                f12 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            }
            if (f12 < 0) {
                return f13 += 360.0f;
            }
            f11 = f13;
        }
        return f11;
    }

    public static float a(x x2, x x3) {
        double d10 = x2.a;
        double d11 = x2.ax;
        double d12 = x3.a;
        double d13 = x3.ax;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = Math.toDegrees(Math.atan2(d15, d14)) + 90.0;
        return (float)d16;
    }
}

