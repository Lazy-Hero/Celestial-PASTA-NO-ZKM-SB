/*
 * Decompiled with CFR 0.150.
 */
import java.util.Objects;
import net.minecraft.K.b;
import net.minecraft.U.x;
import net.minecraft.ar.a6;
import net.minecraft.client.Q;
import net.minecraft.k.k;
import net.minecraft.k.m;

public class hC
implements ag {
    private static /* synthetic */ int[] e;

    static {
        if (hC.b() == null) {
            hC.b(new int[2]);
        }
    }

    public static double f() {
        Q q2 = Q.P();
        double d10 = q2.s.aq;
        double d11 = q2.s.d;
        double d12 = Math.atan2(d10, d11) / Math.PI * 180.0;
        return -d12;
    }

    public static void a(f9 f92, double d10) {
        block12: {
            double d11;
            float f10;
            double d12;
            double d13;
            block13: {
                block14: {
                    double d14;
                    block19: {
                        int[] arrn;
                        block20: {
                            block18: {
                                block17: {
                                    block15: {
                                        double d15;
                                        block16: {
                                            double d16;
                                            block10: {
                                                block11: {
                                                    d13 = a6.a;
                                                    d12 = a6.e;
                                                    arrn = hC.b();
                                                    f10 = hC.b.s.e;
                                                    double d17 = d13 - 0.0;
                                                    d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                    if (arrn == null) break block10;
                                                    if (d16 != false) break block11;
                                                    double d18 = d12 - 0.0;
                                                    d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                    if (arrn == null) break block10;
                                                    if (d16 != false) break block11;
                                                    f92.b(0.0);
                                                    f92.c(0.0);
                                                    if (arrn != null) break block12;
                                                }
                                                d11 = d13;
                                                if (arrn == null) break block13;
                                                double d19 = d11 - 0.0;
                                                d16 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                            }
                                            if (d16 == false) break block14;
                                            double d20 = d12 - 0.0;
                                            d14 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                            if (arrn == null) break block15;
                                            if (d14 <= 0) break block16;
                                            double d21 = d13 - 0.0;
                                            double d22 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                            if (arrn != null) {
                                                d22 = d22 > 0 ? (double)-45 : (double)45;
                                            }
                                            f10 += (float)d22;
                                            if (arrn != null) break block17;
                                        }
                                        d14 = (d15 = d12 - 0.0) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                    }
                                    if (arrn == null) break block18;
                                    if (d14 < 0) {
                                        double d23 = d13 - 0.0;
                                        double d24 = d23 == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                                        if (arrn != null) {
                                            d24 = d24 > 0 ? (double)45 : (double)-45;
                                        }
                                        f10 += (float)d24;
                                    }
                                }
                                d12 = 0.0;
                                double d25 = d13 - 0.0;
                                d14 = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
                            }
                            if (arrn == null) break block19;
                            if (d14 <= 0) break block20;
                            d13 = 1.0;
                            if (arrn != null) break block14;
                        }
                        d11 = d13;
                        if (arrn == null) break block13;
                        double d26 = d11 - 0.0;
                        d14 = d26 == 0.0 ? 0 : (d26 < 0.0 ? -1 : 1);
                    }
                    if (d14 < 0) {
                        d13 = -1.0;
                    }
                }
                d11 = Math.cos(Math.toRadians(f10 + 90.0f));
            }
            double d27 = d11;
            double d28 = Math.sin(Math.toRadians(f10 + 90.0f));
            f92.b(d13 * d10 * d27 + d12 * d10 * d28);
            f92.c(d13 * d10 * d28 - d12 * d10 * d27);
        }
    }

    public static void a(double d10) {
        block12: {
            double d11;
            float f10;
            double d12;
            double d13;
            block13: {
                block14: {
                    double d14;
                    block19: {
                        int[] arrn;
                        block20: {
                            block18: {
                                block17: {
                                    block15: {
                                        double d15;
                                        block16: {
                                            double d16;
                                            block10: {
                                                block11: {
                                                    d13 = a6.a;
                                                    arrn = hC.b();
                                                    d12 = a6.e;
                                                    f10 = hC.b.s.e;
                                                    double d17 = d13 - 0.0;
                                                    d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                    if (arrn == null) break block10;
                                                    if (d16 != false) break block11;
                                                    double d18 = d12 - 0.0;
                                                    d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                    if (arrn == null) break block10;
                                                    if (d16 != false) break block11;
                                                    hC.b.s.aq = 0.0;
                                                    hC.b.s.d = 0.0;
                                                    if (arrn != null) break block12;
                                                }
                                                d11 = d13;
                                                if (arrn == null) break block13;
                                                double d19 = d11 - 0.0;
                                                d16 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                            }
                                            if (d16 == false) break block14;
                                            double d20 = d12 - 0.0;
                                            d14 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                            if (arrn == null) break block15;
                                            if (d14 <= 0) break block16;
                                            double d21 = d13 - 0.0;
                                            double d22 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                            if (arrn != null) {
                                                d22 = d22 > 0 ? (double)-45 : (double)45;
                                            }
                                            f10 += (float)d22;
                                            if (arrn != null) break block17;
                                        }
                                        d14 = (d15 = d12 - 0.0) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                    }
                                    if (arrn == null) break block18;
                                    if (d14 < 0) {
                                        double d23 = d13 - 0.0;
                                        double d24 = d23 == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                                        if (arrn != null) {
                                            d24 = d24 > 0 ? (double)45 : (double)-45;
                                        }
                                        f10 += (float)d24;
                                    }
                                }
                                d12 = 0.0;
                                double d25 = d13 - 0.0;
                                d14 = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
                            }
                            if (arrn == null) break block19;
                            if (d14 <= 0) break block20;
                            d13 = 1.0;
                            if (arrn != null) break block14;
                        }
                        d11 = d13;
                        if (arrn == null) break block13;
                        double d26 = d11 - 0.0;
                        d14 = d26 == 0.0 ? 0 : (d26 < 0.0 ? -1 : 1);
                    }
                    if (d14 < 0) {
                        d13 = -1.0;
                    }
                }
                d11 = Math.cos(Math.toRadians(f10 + 90.0f));
            }
            double d27 = d11;
            double d28 = Math.sin(Math.toRadians(f10 + 90.0f));
            hC.b.s.aq = d13 * d10 * d27 + d12 * d10 * d28;
            hC.b.s.d = d13 * d10 * d28 - d12 * d10 * d27;
        }
    }

    public static void a(float f10) {
        if (!hC.b.s.F()) {
            return;
        }
        double d10 = hC.e();
        hC.b.s.aq = -Math.sin(d10) * (double)f10;
        hC.b.s.d = Math.cos(d10) * (double)f10;
    }

    public static int[] b() {
        return e;
    }

    public static float d() {
        return (float)Math.sqrt(hC.b.s.aq * hC.b.s.aq + hC.b.s.d * hC.b.s.d);
    }

    public static double g() {
        double d10;
        block3: {
            int n2;
            block2: {
                d10 = 0.2873;
                int[] arrn = hC.b();
                n2 = hC.b.s.c(Objects.requireNonNull(b.a(1)));
                if (arrn == null) break block2;
                if (n2 == 0) break block3;
                n2 = Objects.requireNonNull(hC.b.s.a(Objects.requireNonNull(b.a(1)))).h();
            }
            int n3 = n2;
            d10 *= 1.0 + 0.2 * (double)(n3 + 1);
        }
        return d10;
    }

    public static float e() {
        float f10;
        float f11;
        float f12;
        block16: {
            float f13;
            float f14;
            block15: {
                int[] arrn;
                Q q2;
                block14: {
                    float f15;
                    block13: {
                        block11: {
                            float f16;
                            block12: {
                                q2 = Q.P();
                                f12 = q2.s.e;
                                arrn = hC.b();
                                float f17 = q2.s.bS;
                                if (arrn != null) {
                                    if (f17 < 0.0f) {
                                        f12 += 180.0f;
                                    }
                                    f17 = 1.0f;
                                }
                                f14 = f17;
                                float f18 = q2.s.bS - 0.0f;
                                f13 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                if (arrn == null) break block11;
                                if (f13 >= 0) break block12;
                                f14 = -0.5f;
                                if (arrn != null) break block13;
                            }
                            f13 = (f16 = q2.s.bS - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                        }
                        if (arrn == null) break block14;
                        if (f13 > 0) {
                            f14 = 0.5f;
                        }
                    }
                    f13 = (f15 = q2.s.bu - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                }
                if (arrn == null) break block15;
                if (f13 > 0) {
                    f12 -= 90.0f * f14;
                }
                f11 = q2.s.bu;
                f10 = 0.0f;
                if (arrn == null) break block16;
                float f19 = f11 - f10;
                f13 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
            }
            if (f13 < 0) {
                f12 += 90.0f * f14;
            }
            f11 = f12;
            f10 = (float)Math.PI / 180;
        }
        f12 = f11 * f10;
        return f12;
    }

    public static boolean a() {
        boolean bl2;
        block0: {
            int[] arrn = hC.b();
            k k2 = new k(hC.b.s.a - 0.3, hC.b.s.aF + (double)hC.b.s.l(), hC.b.s.ax + 0.3, hC.b.s.a + 0.3, hC.b.s.aF + (!hC.b.s.A ? 1.5 : 2.5), hC.b.s.ax - 0.3);
            bl2 = hC.b.e.a((x)hC.b.s, k2).isEmpty();
            if (m.d()) break block0;
            hC.b(new int[1]);
        }
        return bl2;
    }

    public static void c() {
        if (hC.b.ac.O.b()) {
            return;
        }
        hC.a(hC.d());
    }

    public static void a(double d10, float f10, double d11, double d12) {
        double d13;
        float f11;
        block23: {
            block22: {
                double d14;
                block20: {
                    int[] arrn;
                    block21: {
                        block12: {
                            double d15;
                            block13: {
                                block18: {
                                    double d16;
                                    block19: {
                                        block17: {
                                            block16: {
                                                block14: {
                                                    double d17;
                                                    block15: {
                                                        f11 = f10;
                                                        arrn = hC.b();
                                                        double d18 = d12 - 0.0;
                                                        d14 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                        if (arrn == null) break block12;
                                                        if (d14 == false) break block13;
                                                        double d19 = d11 - 0.0;
                                                        d14 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                        if (arrn == null) break block14;
                                                        if (d14 <= 0) break block15;
                                                        f11 += -45.0f;
                                                        if (arrn != null) break block16;
                                                        m.b(!m.c());
                                                    }
                                                    d14 = (d17 = d11 - 0.0) == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                                }
                                                if (arrn == null) break block17;
                                                if (d14 < 0) {
                                                    f11 += 45.0f;
                                                }
                                            }
                                            d11 = 0.0;
                                            double d20 = d12 - 0.0;
                                            d14 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                                        }
                                        if (arrn == null) break block18;
                                        if (d14 <= 0) break block19;
                                        d12 = 1.0;
                                        if (arrn != null) break block13;
                                    }
                                    d14 = (d16 = d12 - 0.0) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                }
                                if (arrn == null) break block12;
                                if (d14 < 0) {
                                    d12 = -1.0;
                                }
                            }
                            d14 = (d15 = d11 - 0.0) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        }
                        if (arrn == null) break block20;
                        if (d14 <= 0) break block21;
                        d11 = 1.0;
                        if (arrn != null) break block22;
                    }
                    d13 = d11;
                    if (arrn == null) break block23;
                    double d21 = d13 - 0.0;
                    d14 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                }
                if (d14 < 0) {
                    d11 = -1.0;
                }
            }
            d13 = Math.cos(Math.toRadians(f11 + 90.0f));
        }
        double d22 = d13;
        double d23 = Math.sin(Math.toRadians(f11 + 90.0f));
        hC.b.s.aq = d12 * d10 * d22 + d11 * d10 * d23;
        hC.b.s.d = d12 * d10 * d23 - d11 * d10 * d22;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(int[] arrn) {
        e = arrn;
    }
}

