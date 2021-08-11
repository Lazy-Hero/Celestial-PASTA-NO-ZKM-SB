/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.aA.h;

public class s {
    public /* synthetic */ double a;
    public static final /* synthetic */ double c;
    private static final /* synthetic */ double d;
    public /* synthetic */ double f;
    private static final /* synthetic */ int[][] g;
    public /* synthetic */ double h;
    private final /* synthetic */ int[] b;
    private static final /* synthetic */ double e;

    private static double a(int[] arrn, double d10, double d11) {
        return (double)arrn[0] * d10 + (double)arrn[1] * d11;
    }

    public void a(double[] arrd, double d10, double d11, int n2, int n3, double d12, double d13, double d14) {
        int n4 = 0;
        boolean bl2 = net.minecraft.aA.h.a();
        int n5 = 0;
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < n3) {
                double d15 = (d11 + (double)n5) * d13 + this.a;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n7;
                    double d16;
                    double d17;
                    double d18;
                    block22: {
                        double d19;
                        double d20;
                        block20: {
                            double d21;
                            int n8;
                            double d22;
                            double d23;
                            block21: {
                                block19: {
                                    double d24;
                                    double d25;
                                    block17: {
                                        double d26;
                                        int n9;
                                        double d27;
                                        double d28;
                                        block18: {
                                            block16: {
                                                double d29;
                                                double d30;
                                                block14: {
                                                    double d31;
                                                    int n10;
                                                    double d32;
                                                    double d33;
                                                    block15: {
                                                        int n11;
                                                        int n12;
                                                        int n13;
                                                        int n14;
                                                        block13: {
                                                            boolean bl3;
                                                            block11: {
                                                                block12: {
                                                                    double d34 = (d10 + (double)i2) * d12 + this.f;
                                                                    double d35 = (d34 + d15) * e;
                                                                    n14 = s.a(d34 + d35);
                                                                    n13 = s.a(d15 + d35);
                                                                    double d36 = (double)(n14 + n13) * d;
                                                                    double d37 = (double)n14 - d36;
                                                                    double d38 = (double)n13 - d36;
                                                                    d33 = d34 - d37;
                                                                    d32 = d15 - d38;
                                                                    n6 = d33 == d32 ? 0 : (d33 > d32 ? 1 : -1);
                                                                    if (bl2) continue block1;
                                                                    if (bl2) break block11;
                                                                    if (n6 <= 0) break block12;
                                                                    n12 = 1;
                                                                    n11 = 0;
                                                                    if (!bl2) break block13;
                                                                }
                                                                bl3 = false;
                                                            }
                                                            n12 = bl3;
                                                            n11 = 1;
                                                        }
                                                        d28 = d33 - (double)n12 + d;
                                                        d27 = d32 - (double)n11 + d;
                                                        d23 = d33 - 1.0 + 2.0 * d;
                                                        d22 = d32 - 1.0 + 2.0 * d;
                                                        int n15 = n14 & 0xFF;
                                                        int n16 = n13 & 0xFF;
                                                        n10 = this.b[n15 + this.b[n16]] % 12;
                                                        n9 = this.b[n15 + n12 + this.b[n16 + n11]] % 12;
                                                        n8 = this.b[n15 + 1 + this.b[n16 + 1]] % 12;
                                                        d30 = d31 = 0.5 - d33 * d33 - d32 * d32;
                                                        d29 = 0.0;
                                                        if (bl2) break block14;
                                                        if (!(d30 < d29)) break block15;
                                                        d18 = 0.0;
                                                        if (!bl2) break block16;
                                                    }
                                                    d31 *= d31;
                                                    d30 = d31 * d31;
                                                    d29 = s.a(g[n10], d33, d32);
                                                }
                                                d18 = d30 * d29;
                                            }
                                            d25 = d26 = 0.5 - d28 * d28 - d27 * d27;
                                            d24 = 0.0;
                                            if (bl2) break block17;
                                            if (!(d25 < d24)) break block18;
                                            d17 = 0.0;
                                            if (!bl2) break block19;
                                        }
                                        d26 *= d26;
                                        d25 = d26 * d26;
                                        d24 = s.a(g[n9], d28, d27);
                                    }
                                    d17 = d25 * d24;
                                }
                                d20 = d21 = 0.5 - d23 * d23 - d22 * d22;
                                d19 = 0.0;
                                if (bl2) break block20;
                                if (!(d20 < d19)) break block21;
                                d16 = 0.0;
                                if (!bl2) break block22;
                            }
                            d21 *= d21;
                            d20 = d21 * d21;
                            d19 = s.a(g[n8], d23, d22);
                        }
                        d16 = d20 * d19;
                    }
                    int n8 = n7 = n4++;
                    arrd[n8] = arrd[n8] + 70.0 * (d18 + d17 + d16) * d14;
                    if (!bl2) continue;
                }
                ++n5;
                if (!bl2) continue block0;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(double d10) {
        int n2;
        boolean bl2 = net.minecraft.aA.h.a();
        double d11 = d10 - 0.0;
        int n3 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (!bl2) {
            if (n3 > 0) {
                n2 = (int)d10;
                return n2;
            }
            n3 = (int)d10;
        }
        n2 = n3 - true;
        return n2;
    }

    public s(Random random) {
        this.b = new int[512];
        this.f = random.nextDouble() * 256.0;
        this.a = random.nextDouble() * 256.0;
        this.h = random.nextDouble() * 256.0;
        int n2 = 0;
        while (n2 < 256) {
            this.b[n2] = n2++;
        }
        for (n2 = 0; n2 < 256; ++n2) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.b[n2];
            this.b[n2] = this.b[n3];
            this.b[n3] = n4;
            this.b[n2 + 256] = this.b[n2];
        }
    }

    static {
        g = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
        c = Math.sqrt(3.0);
        e = 0.5 * (c - 1.0);
        d = (3.0 - c) / 6.0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public s() {
        this(new Random());
    }

    public double a(double d10, double d11) {
        double d12;
        double d13;
        double d14;
        block19: {
            double d15;
            double d16;
            block17: {
                double d17;
                int n2;
                double d18;
                double d19;
                block18: {
                    boolean bl2;
                    block16: {
                        double d20;
                        double d21;
                        block14: {
                            double d22;
                            int n3;
                            double d23;
                            double d24;
                            block15: {
                                block13: {
                                    double d25;
                                    double d26;
                                    block11: {
                                        double d27;
                                        int n4;
                                        double d28;
                                        double d29;
                                        block12: {
                                            int n5;
                                            double d30;
                                            double d31;
                                            int n6;
                                            int n7;
                                            block10: {
                                                double d32;
                                                block8: {
                                                    block9: {
                                                        double d33 = 0.5 * (c - 1.0);
                                                        double d34 = (d10 + d11) * d33;
                                                        n7 = s.a(d10 + d34);
                                                        n6 = s.a(d11 + d34);
                                                        d31 = (3.0 - c) / 6.0;
                                                        double d35 = (double)(n7 + n6) * d31;
                                                        double d36 = (double)n7 - d35;
                                                        bl2 = net.minecraft.aA.h.b();
                                                        double d37 = (double)n6 - d35;
                                                        d29 = d10 - d36;
                                                        d28 = d11 - d37;
                                                        d32 = d29 == d28 ? 0 : (d29 > d28 ? 1 : -1);
                                                        if (!bl2) break block8;
                                                        if (d32 <= 0) break block9;
                                                        d30 = 1.0;
                                                        n5 = 0;
                                                        if (bl2) break block10;
                                                    }
                                                    d32 = 0.0;
                                                }
                                                d30 = d32;
                                                n5 = 1;
                                            }
                                            d24 = d29 - (double)d30 + d31;
                                            d23 = d28 - (double)n5 + d31;
                                            d19 = d29 - 1.0 + 2.0 * d31;
                                            d18 = d28 - 1.0 + 2.0 * d31;
                                            int n8 = n7 & 0xFF;
                                            int n9 = n6 & 0xFF;
                                            n4 = this.b[n8 + this.b[n9]] % 12;
                                            n3 = this.b[n8 + d30 + this.b[n9 + n5]] % 12;
                                            n2 = this.b[n8 + 1 + this.b[n9 + 1]] % 12;
                                            d26 = d27 = 0.5 - d29 * d29 - d28 * d28;
                                            d25 = 0.0;
                                            if (!bl2) break block11;
                                            if (!(d26 < d25)) break block12;
                                            d14 = 0.0;
                                            if (bl2) break block13;
                                        }
                                        d27 *= d27;
                                        d26 = d27 * d27;
                                        d25 = s.a(g[n4], d29, d28);
                                    }
                                    d14 = d26 * d25;
                                }
                                d21 = d22 = 0.5 - d24 * d24 - d23 * d23;
                                d20 = 0.0;
                                if (!bl2) break block14;
                                if (!(d21 < d20)) break block15;
                                d13 = 0.0;
                                if (bl2) break block16;
                            }
                            d22 *= d22;
                            d21 = d22 * d22;
                            d20 = s.a(g[n3], d24, d23);
                        }
                        d13 = d21 * d20;
                    }
                    d16 = d17 = 0.5 - d19 * d19 - d18 * d18;
                    d15 = 0.0;
                    if (!bl2) break block17;
                    if (!(d16 < d15)) break block18;
                    d12 = 0.0;
                    if (bl2) break block19;
                }
                d17 *= d17;
                d16 = d17 * d17;
                d15 = s.a(g[n2], d19, d18);
            }
            d12 = d16 * d15;
        }
        return 70.0 * (d14 + d13 + d12);
    }
}

