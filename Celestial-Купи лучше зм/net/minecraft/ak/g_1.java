/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.ac.c;
import net.minecraft.ak.h;
import net.minecraft.e.i;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class g {
    private static /* synthetic */ l a;

    @Nullable
    private static l a(D d10, int n2, int n3, @Nullable l l2, boolean bl2) {
        block38: {
            l l3;
            block18: {
                boolean bl3;
                Random random;
                String string;
                i i2;
                block21: {
                    boolean bl4;
                    block19: {
                        block20: {
                            i2 = d10.l();
                            string = h.h();
                            random = d10.f();
                            bl4 = d10.m();
                            if (string != null) break block19;
                            if (!bl4) break block20;
                            double d11 = d10.n().b(net.minecraft.k.h.f(d10.a), net.minecraft.k.h.f(d10.aF), net.minecraft.k.h.f(d10.ax)) + 4.0;
                            double d12 = d10.q() + (float)n2;
                            double d13 = d11 - d12 * d12;
                            double d14 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                            if (string == null) {
                                bl3 = d14 < 0 ? 1.0 : 0.0;
                                d14 = (double)bl3;
                            }
                            if (string == null) break block21;
                        }
                        bl4 = false;
                    }
                    bl3 = bl4;
                }
                boolean bl5 = false;
                float f10 = -99999.0f;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                while (n7 < 10) {
                    block37: {
                        block24: {
                            n n8;
                            int n9;
                            int n10;
                            int n11;
                            block36: {
                                boolean bl6;
                                block35: {
                                    block34: {
                                        block32: {
                                            block33: {
                                                block26: {
                                                    double d15;
                                                    block30: {
                                                        block31: {
                                                            double d16;
                                                            block29: {
                                                                double d17;
                                                                block27: {
                                                                    block28: {
                                                                        int n12;
                                                                        block25: {
                                                                            block23: {
                                                                                block22: {
                                                                                    n11 = random.nextInt(2 * n2 + 1) - n2;
                                                                                    n10 = random.nextInt(2 * n3 + 1) - n3;
                                                                                    n9 = random.nextInt(2 * n2 + 1) - n2;
                                                                                    l3 = l2;
                                                                                    if (string != null) break block18;
                                                                                    if (l3 == null) break block22;
                                                                                    double d18 = (double)n11 * l2.e + (double)n9 * l2.b - 0.0;
                                                                                    n12 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                                                    if (string != null) break block23;
                                                                                    if (n12 < 0) break block24;
                                                                                }
                                                                                n12 = d10.m();
                                                                            }
                                                                            if (string != null) break block25;
                                                                            if (n12 == 0) break block26;
                                                                            n12 = n2;
                                                                        }
                                                                        if (n12 <= 1) break block26;
                                                                        n8 = d10.n();
                                                                        double d19 = d10.a - (double)n8.e();
                                                                        d17 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                                        if (string != null) break block27;
                                                                        if (d17 <= 0) break block28;
                                                                        n11 -= random.nextInt(n2 / 2);
                                                                        if (string == null) break block29;
                                                                    }
                                                                    d17 = n11 + random.nextInt(n2 / 2);
                                                                }
                                                                n11 = (int)d17;
                                                            }
                                                            d15 = (d16 = d10.ax - (double)n8.a()) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                                                            if (string != null) break block30;
                                                            if (d15 <= 0) break block31;
                                                            n9 -= random.nextInt(n2 / 2);
                                                            if (string == null) break block26;
                                                        }
                                                        d15 = n9 + random.nextInt(n2 / 2);
                                                    }
                                                    n9 = (int)d15;
                                                }
                                                n8 = new n((double)n11 + d10.a, (double)n10 + d10.aF, (double)n9 + d10.ax);
                                                bl6 = bl3;
                                                if (string != null) break block32;
                                                if (!bl6) break block33;
                                                bl6 = d10.a(n8);
                                                if (string != null) break block32;
                                                if (!bl6) break block24;
                                            }
                                            bl6 = i2.a(n8);
                                        }
                                        if (string != null) break block34;
                                        if (!bl6) break block24;
                                        bl6 = bl2;
                                    }
                                    if (string != null) break block35;
                                    if (bl6) break block36;
                                    n8 = g.a(n8, d10);
                                    bl6 = g.b(n8, d10);
                                }
                                if (bl6 && string == null) break block24;
                            }
                            float f11 = d10.b(n8);
                            if (string != null) break block37;
                            if (f11 > f10) {
                                f10 = f11;
                                n4 = n11;
                                n5 = n10;
                                n6 = n9;
                                bl5 = true;
                            }
                        }
                        ++n7;
                    }
                    if (string == null) continue;
                }
                if (!bl5) break block38;
                l3 = new l((double)n4 + d10.a, (double)n5 + d10.aF, (double)n6 + d10.ax);
            }
            return l3;
        }
        return null;
    }

    private static n a(n n2, D d10) {
        String string = h.h();
        if (!d10.aG.d(n2).o().d()) {
            return n2;
        }
        n n3 = n2.a();
        while (n3.b() < d10.aG.i() && d10.aG.d(n3).o().d()) {
            n3 = n3.a();
            if (string == null) continue;
        }
        return n3;
    }

    @Nullable
    public static l b(D d10, int n2, int n3) {
        return g.a(d10, n2, n3, null, false);
    }

    static {
        a = l.a;
    }

    @Nullable
    public static l c(D d10, int n2, int n3, l l2) {
        a = new l(d10.a, d10.aF, d10.ax).b(l2);
        return g.a(d10, n2, n3, a);
    }

    @Nullable
    public static l a(D d10, int n2, int n3) {
        return g.a(d10, n2, n3, null);
    }

    private static boolean b(n n2, D d10) {
        return d10.aG.d(n2).o() == c.L;
    }

    @Nullable
    public static l b(D d10, int n2, int n3, l l2) {
        a = l2.a(d10.a, d10.aF, d10.ax);
        return g.a(d10, n2, n3, a);
    }

    @Nullable
    private static l a(D d10, int n2, int n3, @Nullable l l2) {
        return g.a(d10, n2, n3, l2, true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

