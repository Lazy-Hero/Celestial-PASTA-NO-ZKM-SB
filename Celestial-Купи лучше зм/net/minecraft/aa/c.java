/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.aA.b;
import net.minecraft.aA.h;

public class c
extends b {
    private final /* synthetic */ int[] e;
    private static final /* synthetic */ double[] g;
    private static final /* synthetic */ double[] a;
    public /* synthetic */ double f;
    public /* synthetic */ double h;
    private static final /* synthetic */ double[] d;
    public /* synthetic */ double b;
    private static final /* synthetic */ double[] i;
    private static final /* synthetic */ double[] c;

    public c(Random random) {
        int n2;
        boolean bl2;
        block3: {
            this.e = new int[512];
            this.b = random.nextDouble() * 256.0;
            bl2 = net.minecraft.aA.h.a();
            this.f = random.nextDouble() * 256.0;
            this.h = random.nextDouble() * 256.0;
            n2 = 0;
            while (n2 < 256) {
                this.e[n2] = n2++;
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block3;
            }
            n2 = 0;
        }
        while (n2 < 256) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.e[n2];
            this.e[n2] = this.e[n3];
            this.e[n3] = n4;
            this.e[n2 + 256] = this.e[n2];
            ++n2;
            if (!bl2) continue;
        }
    }

    public final double a(int n2, double d10, double d11, double d12) {
        int n3 = n2 & 0xF;
        return c[n3] * d10 + g[n3] * d11 + d[n3] * d12;
    }

    public final double a(int n2, double d10, double d11) {
        int n3 = n2 & 0xF;
        return i[n3] * d10 + a[n3] * d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public final double a(double d10, double d11, double d12) {
        return d11 + d10 * (d12 - d11);
    }

    static {
        c = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
        g = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
        d = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
        i = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
        a = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    }

    public c() {
        this(new Random());
    }

    /*
     * WARNING - void declaration
     */
    public void a(double[] arrd, double d10, double d11, double d12, int n2, int n3, int n4, double d13, double d14, double d15, double d16) {
        block21: {
            double d17;
            double d18;
            int n5;
            double d19;
            int n6;
            double d20;
            double d21;
            int n7;
            int n8;
            int n9;
            int n10;
            boolean bl2;
            block22: {
                block23: {
                    bl2 = net.minecraft.aA.h.b();
                    n10 = n3;
                    if (!bl2) break block22;
                    if (n10 != 1) break block23;
                    n9 = 0;
                    int n11 = 0;
                    int n12 = 0;
                    n8 = 0;
                    double d22 = 0.0;
                    double d23 = 0.0;
                    n7 = 0;
                    double d24 = 1.0 / d16;
                    int n13 = 0;
                    block0: while (true) {
                        int n14 = n13;
                        block1: while (n14 < n2) {
                            d21 = d10 + (double)n13 * d13 + this.b;
                            int n15 = (int)d21;
                            if (!bl2) break block21;
                            double d25 = d21 - (double)n15;
                            double d26 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                            if (bl2) {
                                if (d26 < 0) {
                                    --n15;
                                }
                                d26 = n15 & 0xFF;
                            }
                            double d27 = d26;
                            d20 = (d21 -= (double)n15) * d21 * d21 * (d21 * (d21 * 6.0 - 15.0) + 10.0);
                            for (n6 = 0; n6 < n4; ++n6) {
                                int n16;
                                int n17;
                                d19 = d12 + (double)n6 * d15 + this.h;
                                n5 = (int)d19;
                                double d28 = d19 - (double)n5;
                                n14 = d28 == 0.0 ? 0 : (d28 < 0.0 ? -1 : 1);
                                if (!bl2) continue block1;
                                if (bl2) {
                                    if (n14 < 0) {
                                        --n5;
                                    }
                                    n17 = n5 & 0xFF;
                                }
                                d18 = n17;
                                d17 = (d19 -= (double)n5) * d19 * d19 * (d19 * (d19 * 6.0 - 15.0) + 10.0);
                                n9 = this.e[d27] + 0;
                                n11 = this.e[n9] + d18;
                                n12 = this.e[d27 + true] + 0;
                                n8 = this.e[n12] + d18;
                                d22 = this.a(d20, this.a(this.e[n11], d21, d19), this.a(this.e[n8], d21 - 1.0, 0.0, d19));
                                d23 = this.a(d20, this.a(this.e[n11 + 1], d21, 0.0, d19 - 1.0), this.a(this.e[n8 + 1], d21 - 1.0, 0.0, d19 - 1.0));
                                double d29 = this.a(d17, d22, d23);
                                int n18 = n16 = n7++;
                                arrd[n18] = arrd[n18] + d29 * d24;
                                if (bl2) continue;
                            }
                            ++n13;
                            if (bl2) continue block0;
                        }
                        break;
                    }
                    if (bl2) break block21;
                }
                n10 = 0;
            }
            n9 = n10;
            double d30 = 1.0 / d16;
            n8 = -1;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            n7 = 0;
            int n23 = 0;
            double d31 = 0.0;
            d21 = 0.0;
            double d32 = 0.0;
            d20 = 0.0;
            n6 = 0;
            block3: while (true) {
                int n24 = n6;
                block4: while (n24 < n2) {
                    d19 = d10 + (double)n6 * d13 + this.b;
                    n5 = (int)d19;
                    double d33 = d19 - (double)n5;
                    double d34 = d33 == 0.0 ? 0 : (d33 < 0.0 ? -1 : 1);
                    if (bl2) {
                        if (d34 < 0) {
                            --n5;
                        }
                        d34 = n5 & 0xFF;
                    }
                    d18 = d34;
                    d17 = (d19 -= (double)n5) * d19 * d19 * (d19 * (d19 * 6.0 - 15.0) + 10.0);
                    int n25 = 0;
                    block5: while (true) {
                        int n26 = n25;
                        block6: while (n26 < n4) {
                            int n27;
                            double d35 = d12 + (double)n25 * d15 + this.h;
                            int n28 = (int)d35;
                            double d36 = d35 - (double)n28;
                            n24 = d36 == 0.0 ? 0 : (d36 < 0.0 ? -1 : 1);
                            if (!bl2) continue block4;
                            if (bl2) {
                                if (n24 < 0) {
                                    --n28;
                                }
                                n27 = n28 & 0xFF;
                            }
                            void var49_44 = n27;
                            double d37 = (d35 -= (double)n28) * d35 * d35 * (d35 * (d35 * 6.0 - 15.0) + 10.0);
                            for (int i2 = 0; i2 < n3; ++i2) {
                                int n29;
                                double d38;
                                block27: {
                                    int n30;
                                    double d39;
                                    block24: {
                                        int n31;
                                        int n32;
                                        block26: {
                                            void var56_49;
                                            block25: {
                                                int n33;
                                                d39 = d11 + (double)i2 * d14 + this.f;
                                                int n34 = (int)d39;
                                                double d40 = d39 - (double)n34;
                                                n26 = d40 == 0.0 ? 0 : (d40 < 0.0 ? -1 : 1);
                                                if (!bl2) continue block6;
                                                if (bl2) {
                                                    if (n26 < 0) {
                                                        --n34;
                                                    }
                                                    n33 = n34 & 0xFF;
                                                }
                                                var56_49 = n33;
                                                d38 = (d39 -= (double)n34) * d39 * d39 * (d39 * (d39 * 6.0 - 15.0) + 10.0);
                                                n30 = i2;
                                                if (!bl2) break block24;
                                                if (n30 == 0) break block25;
                                                n32 = var56_49;
                                                n31 = n8;
                                                if (!bl2) break block26;
                                                if (n32 == n31) break block27;
                                            }
                                            n8 = var56_49;
                                            n19 = this.e[d18] + var56_49;
                                            n20 = this.e[n19] + var49_44;
                                            n21 = this.e[n19 + 1] + var49_44;
                                            n22 = this.e[d18 + true] + var56_49;
                                            n7 = this.e[n22] + var49_44;
                                            n32 = this.e[n22 + 1];
                                            n31 = var49_44;
                                        }
                                        n30 = n32 + n31;
                                    }
                                    n23 = n30;
                                    d31 = this.a(d17, this.a(this.e[n20], d19, d39, d35), this.a(this.e[n7], d19 - 1.0, d39, d35));
                                    d21 = this.a(d17, this.a(this.e[n21], d19, d39 - 1.0, d35), this.a(this.e[n23], d19 - 1.0, d39 - 1.0, d35));
                                    d32 = this.a(d17, this.a(this.e[n20 + 1], d19, d39, d35 - 1.0), this.a(this.e[n7 + 1], d19 - 1.0, d39, d35 - 1.0));
                                    d20 = this.a(d17, this.a(this.e[n21 + 1], d19, d39 - 1.0, d35 - 1.0), this.a(this.e[n23 + 1], d19 - 1.0, d39 - 1.0, d35 - 1.0));
                                }
                                double d41 = this.a(d38, d31, d21);
                                double d42 = this.a(d38, d32, d20);
                                double d43 = this.a(d37, d41, d42);
                                int n35 = n29 = n9++;
                                arrd[n35] = arrd[n35] + d43 * d30;
                                if (bl2) continue;
                            }
                            ++n25;
                            if (bl2) continue block5;
                        }
                        break;
                    }
                    ++n6;
                    if (bl2) continue block3;
                }
                break;
            }
        }
    }
}

