/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.k.m;

public class n {
    private static /* synthetic */ boolean b;

    public static float a(float f10, float f11, float f12) {
        float f13;
        float f14;
        block7: {
            float f15;
            block6: {
                float f16;
                block4: {
                    boolean bl2;
                    block5: {
                        f15 = (f11 - f10) / Math.max((float)Q.aL(), 5.0f) * 15.0f;
                        bl2 = n.b();
                        float f17 = f15 - 0.0f;
                        f16 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                        if (!bl2) break block4;
                        if (f16 <= 0) break block5;
                        f15 = Math.max(f12, f15);
                        f15 = Math.min(f11 - f10, f15);
                        if (bl2) break block6;
                    }
                    f14 = f15;
                    f13 = 0.0f;
                    if (!bl2) break block7;
                    float f18 = f14 - f13;
                    f16 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                }
                if (f16 < 0) {
                    f15 = Math.min(-f12, f15);
                    f15 = Math.max(f11 - f10, f15);
                }
            }
            f14 = f10;
            f13 = f15;
        }
        return f14 + f13;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean b() {
        return b;
    }

    public static float a(float f10, float f11, long l2, double d10) {
        block11: {
            float f12;
            block12: {
                block13: {
                    double d11;
                    long l3;
                    boolean bl2;
                    block9: {
                        float f13;
                        block10: {
                            f13 = f11 - f10;
                            bl2 = n.b();
                            long l4 = l2 - 1L;
                            l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (bl2) {
                                long l5;
                                if (l3 < 0) {
                                    l2 = 1L;
                                }
                                l3 = (l5 = l2 - 1000L) == 0L ? 0 : (l5 < 0L ? -1 : 1);
                            }
                            if (bl2) {
                                double d12;
                                if (l3 > 0) {
                                    l2 = 16L;
                                }
                                l3 = (d12 = (double)f13 - d10) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (!bl2) break block9;
                            if (l3 <= 0) break block10;
                            d11 = Math.max(d10 * (double)l2 / 16.0, 0.5);
                            float f14 = f11 = (float)((double)f11 - d11);
                            if (bl2 && f14 < f10) {
                                f14 = f11 = f10;
                            }
                            if (bl2) break block11;
                        }
                        f12 = f13;
                        if (!bl2) break block12;
                        double d13 = (double)f12 - -d10;
                        l3 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                    }
                    if (l3 >= 0) break block13;
                    d11 = Math.max(d10 * (double)l2 / 16.0, 0.5);
                    float f15 = f11 = (float)((double)f11 + d11);
                    if (bl2 && f15 > f10) {
                        f15 = f11 = f10;
                    }
                    if (bl2) break block11;
                }
                f12 = f10;
            }
            f11 = f12;
        }
        return f11;
    }

    public static double a(double d10, double d11, double d12) {
        boolean bl2;
        block16: {
            double d13;
            block15: {
                double d14;
                double d15;
                double d16;
                block14: {
                    block13: {
                        double d17;
                        block11: {
                            block12: {
                                bl2 = n.b();
                                double d18 = d10 == d11 ? 0 : (d10 > d11 ? 1 : -1);
                                if (bl2) {
                                    d18 = d18 > 0 ? 1.0 : 0.0;
                                }
                                d16 = d18;
                                double d19 = d12 - 0.0;
                                d17 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                if (!bl2) break block11;
                                if (d17 >= 0) break block12;
                                d12 = 0.0;
                                if (bl2) break block13;
                            }
                            d15 = d12;
                            d14 = 1.0;
                            if (!bl2) break block14;
                            double d20 = d15 - d14;
                            d17 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                        }
                        if (d17 > 0) {
                            d12 = 1.0;
                        }
                    }
                    d15 = Math.max(d10, d11);
                    d14 = Math.min(d10, d11);
                }
                double d21 = d15 - d14;
                d13 = d21 * d12;
                double d22 = d13 - 0.1;
                double d23 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                if (bl2) {
                    if (d23 <= 0) {
                        d13 = 0.1;
                    }
                    d23 = d16;
                }
                if (d23 == false) break block15;
                d11 += d13;
                if (bl2) break block16;
            }
            d11 -= d13;
        }
        if (!m.d()) {
            n.b(!bl2);
        }
        return d11;
    }

    public static boolean c() {
        boolean bl2 = n.b();
        return !bl2;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    static {
        if (!n.b()) {
            n.b(true);
        }
    }
}

