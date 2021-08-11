/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class fI
implements Cloneable,
Serializable {
    static final /* synthetic */ long serialVersionUID = 2777097312029690941L;
    private static final /* synthetic */ double b = 1.0E-10;
    private static final /* synthetic */ boolean d;
    /* synthetic */ int a;
    /* synthetic */ double[][] c;
    /* synthetic */ int e;

    public final void a(gY gY2) {
        int n2;
        int n3;
        block10: {
            int n4;
            block11: {
                block8: {
                    fI fI2;
                    block9: {
                        n3 = ae.f();
                        fI2 = this;
                        if (n3 == 0) break block8;
                        if (fI2.a < 3) break block9;
                        n4 = this.e;
                        if (n3 == 0) break block10;
                        if (n4 >= 3) break block11;
                    }
                    this.c = new double[3][3];
                    this.a = 3;
                    fI2 = this;
                }
                fI2.e = 3;
            }
            this.c[0][0] = gY2.h;
            this.c[0][1] = gY2.j;
            this.c[0][2] = gY2.i;
            this.c[1][0] = gY2.f;
            this.c[1][1] = gY2.d;
            this.c[1][2] = gY2.c;
            this.c[2][0] = gY2.g;
            this.c[2][1] = gY2.b;
            this.c[2][2] = gY2.e;
            n4 = n2 = 3;
        }
        while (n2 < this.a) {
            block7: {
                for (int i2 = 3; i2 < this.e; ++i2) {
                    this.c[n2][i2] = 0.0;
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block7;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    static double c(double d10, double d11) {
        int n2 = ae.f();
        double d12 = d10;
        if (n2 != 0) {
            if (d12 < d11) {
                return d10;
            }
            d12 = d11;
        }
        return d12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.a * this.e * 8);
        int n2 = 0;
        int n3 = ae.g();
        while (n2 < this.a) {
            block3: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    stringBuffer.append(this.c[n2][i2]).append(" ");
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block3;
                }
                stringBuffer.append("\n");
                ++n2;
            }
            if (n3 == 0) continue;
        }
        return stringBuffer.toString();
    }

    public final void e(fI fI2) {
        int n2;
        int n3;
        block11: {
            int n4;
            int n5;
            block10: {
                n3 = ae.f();
                n5 = this.a;
                n4 = fI2.a;
                if (n3 == 0) break block10;
                if (n5 != n4) {
                    throw new gX(cK.a("GMatrix4"));
                }
                n5 = this.e;
                if (n3 == 0) break block11;
                n4 = fI2.e;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GMatrix5"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.a) {
            block9: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = this.c[n2][i2] + fI2.c[n2][i2];
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block9;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public final void d(int n2, e e10) {
        int n3;
        int n4 = ae.g();
        int n5 = e10.c();
        if (n4 == 0) {
            if (n5 < this.a) {
                e10.a(this.a);
            }
            n5 = n3 = 0;
        }
        while (n3 < this.a) {
            e10.a[n3] = this.c[n3][n2];
            ++n3;
            if (n4 == 0) continue;
        }
    }

    public final int d() {
        return this.e;
    }

    public final void b(int n2, double[] arrd) {
        int n3 = ae.g();
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.c[n2][i2] = arrd[i2];
            if (n3 == 0) continue;
        }
    }

    static double a(double d10, double d11, double d12) {
        double d13;
        block5: {
            double d14;
            double d15;
            double d16;
            double d17;
            double d18;
            double d19;
            double d20;
            double d21;
            double d22;
            block8: {
                block9: {
                    double d23;
                    double d24;
                    int n2;
                    double d25;
                    block6: {
                        block7: {
                            double d26;
                            block2: {
                                block3: {
                                    double d27;
                                    double d28;
                                    block4: {
                                        double d29 = Math.abs(d10);
                                        d25 = Math.abs(d11);
                                        double d30 = Math.abs(d12);
                                        n2 = ae.f();
                                        d22 = fI.c(d29, d30);
                                        d21 = fI.a(d29, d30);
                                        double d31 = d22 - 0.0;
                                        d26 = d31 == 0.0 ? 0 : (d31 > 0.0 ? 1 : -1);
                                        if (n2 == 0) break block2;
                                        if (d26 != false) break block3;
                                        d13 = 0.0;
                                        d28 = d21;
                                        d27 = 0.0;
                                        if (n2 == 0) break block4;
                                        if (d28 == d27) break block5;
                                        d28 = fI.c(d21, d25);
                                        d27 = fI.a(d21, d25);
                                    }
                                    d20 = d28 / d27;
                                    if (n2 != 0) break block5;
                                }
                                d24 = d25;
                                d23 = d21;
                                if (n2 == 0) break block6;
                                double d32 = d24 - d23;
                                d26 = d32 == 0.0 ? 0 : (d32 < 0.0 ? -1 : 1);
                            }
                            if (d26 >= 0) break block7;
                            d19 = d22 / d21 + 1.0;
                            d18 = (d21 - d22) / d21;
                            d20 = d25 / d21;
                            d17 = d20 * d20;
                            d16 = 2.0 / (Math.sqrt(d19 * d19 + d17) + Math.sqrt(d18 * d18 + d17));
                            d13 = d22 * d16;
                            if (n2 != 0) break block5;
                        }
                        d24 = d21;
                        d23 = d25;
                    }
                    d15 = d17 = d24 / d23;
                    d14 = 0.0;
                    if (n2 == 0) break block8;
                    if (d15 != d14) break block9;
                    d13 = d22 * d21 / d25;
                    if (n2 != 0) break block5;
                }
                d15 = d22 / d21;
                d14 = 1.0;
            }
            d19 = d15 + d14;
            d18 = (d21 - d22) / d21;
            d20 = d19 * d17;
            double d33 = d18 * d17;
            d16 = 1.0 / (Math.sqrt(d20 * d20 + 1.0) + Math.sqrt(d33 * d33 + 1.0));
            d13 = d22 * d16 * d17;
            d13 += d13;
        }
        return d13;
    }

    private static void a(int n2, int n3, fI fI2, double[] arrd, double[] arrd2, fI fI3, fI fI4) {
        block2: {
            int n4 = ae.g();
            for (int i2 = 0; i2 < fI2.a; ++i2) {
                double d10 = fI2.c[i2][n2];
                fI2.c[i2][n2] = arrd[0] * d10 - arrd2[0] * fI2.c[i2][n3];
                fI2.c[i2][n3] = arrd2[0] * d10 + arrd[0] * fI2.c[i2][n3];
                if (n4 == 0) {
                    if (n4 == 0) continue;
                }
                break block2;
            }
            System.out.println("topr    =" + n2);
            System.out.println("bottomr =" + n3);
            System.out.println("cosr =" + arrd[0]);
            System.out.println("sinr =" + arrd2[0]);
            System.out.println("\nm =");
            fI.f(fI4);
            System.out.println("\nv =");
            fI.f(fI3);
            fI4.e(fI4, fI3);
            System.out.println("\nt*m =");
            fI.f(fI4);
        }
    }

    public final void a(fI fI2, fI fI3) {
        int n2;
        int n3;
        block14: {
            int n4;
            block15: {
                block13: {
                    int n5;
                    block12: {
                        n3 = ae.g();
                        n4 = fI3.a;
                        n5 = fI2.a;
                        if (n3 == 0) {
                            if (n4 != n5) {
                                throw new gX(cK.a("GMatrix6"));
                            }
                            n4 = fI3.e;
                            n5 = fI2.e;
                        }
                        if (n3 == 0) {
                            if (n4 != n5) {
                                throw new gX(cK.a("GMatrix7"));
                            }
                            n4 = this.e;
                            n5 = fI2.e;
                        }
                        if (n3 != 0) break block12;
                        if (n4 != n5) break block13;
                        n4 = this.a;
                        if (n3 != 0) break block14;
                        n5 = fI2.a;
                    }
                    if (n4 == n5) break block15;
                }
                throw new gX(cK.a("GMatrix8"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.a) {
            block11: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = fI2.c[n2][i2] + fI3.c[n2][i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block11;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    public final void a(dc dc2) {
        block8: {
            block6: {
                int n2;
                block19: {
                    int n3;
                    int n4;
                    block18: {
                        block17: {
                            block16: {
                                int n5;
                                block15: {
                                    block13: {
                                        block14: {
                                            block12: {
                                                int n6;
                                                block11: {
                                                    block9: {
                                                        block10: {
                                                            block7: {
                                                                block4: {
                                                                    block5: {
                                                                        n2 = ae.g();
                                                                        n4 = this.a;
                                                                        if (n2 != 0) break block4;
                                                                        if (n4 < 3) break block5;
                                                                        n4 = this.e;
                                                                        if (n2 != 0) break block4;
                                                                        if (n4 >= 3) break block6;
                                                                    }
                                                                    dc2.q();
                                                                    n4 = this.e;
                                                                }
                                                                if (n2 != 0) break block7;
                                                                if (n4 <= 0) break block8;
                                                                n4 = this.a;
                                                            }
                                                            if (n2 != 0) break block9;
                                                            if (n4 <= 0) break block10;
                                                            dc2.j = (float)this.c[0][0];
                                                            n4 = this.a;
                                                            n6 = 1;
                                                            if (n2 != 0) break block11;
                                                            if (n4 <= n6) break block10;
                                                            dc2.c = (float)this.c[1][0];
                                                            n4 = this.a;
                                                            n6 = 2;
                                                            if (n2 != 0) break block11;
                                                            if (n4 > n6) {
                                                                dc2.f = (float)this.c[2][0];
                                                            }
                                                        }
                                                        n4 = this.e;
                                                    }
                                                    if (n2 != 0) break block12;
                                                    n6 = 1;
                                                }
                                                if (n4 <= n6) break block8;
                                                n4 = this.a;
                                            }
                                            if (n2 != 0) break block13;
                                            if (n4 <= 0) break block14;
                                            dc2.d = (float)this.c[0][1];
                                            n4 = this.a;
                                            n5 = 1;
                                            if (n2 != 0) break block15;
                                            if (n4 <= n5) break block14;
                                            dc2.g = (float)this.c[1][1];
                                            n4 = this.a;
                                            n5 = 2;
                                            if (n2 != 0) break block15;
                                            if (n4 > n5) {
                                                dc2.e = (float)this.c[2][1];
                                            }
                                        }
                                        n4 = this.e;
                                    }
                                    if (n2 != 0) break block16;
                                    n5 = 2;
                                }
                                if (n4 <= n5) break block8;
                                n4 = this.a;
                            }
                            if (n2 != 0) break block17;
                            if (n4 <= 0) break block8;
                            dc2.a = (float)this.c[0][2];
                            n4 = this.a;
                        }
                        n3 = 1;
                        if (n2 != 0) break block18;
                        if (n4 <= n3) break block8;
                        dc2.h = (float)this.c[1][2];
                        if (n2 != 0) break block19;
                        n4 = this.a;
                        n3 = 2;
                    }
                    if (n4 <= n3) break block8;
                    dc2.i = (float)this.c[2][2];
                }
                if (n2 == 0) break block8;
            }
            dc2.j = (float)this.c[0][0];
            dc2.d = (float)this.c[0][1];
            dc2.a = (float)this.c[0][2];
            dc2.c = (float)this.c[1][0];
            dc2.g = (float)this.c[1][1];
            dc2.h = (float)this.c[1][2];
            dc2.f = (float)this.c[2][0];
            dc2.e = (float)this.c[2][1];
            dc2.i = (float)this.c[2][2];
        }
    }

    static boolean a(int n2, double[] arrd, int[] arrn, int[] arrn2) {
        int n3;
        block31: {
            double d10;
            int n4;
            int n5;
            double d11;
            int n6;
            int n7;
            double[] arrd2;
            block29: {
                arrd2 = new double[n2];
                n7 = ae.f();
                int n8 = 0;
                int n9 = 0;
                arrn2[0] = 1;
                n6 = n2;
                while (n6-- != 0) {
                    block37: {
                        double d12;
                        block36: {
                            block30: {
                                double d13;
                                d11 = 0.0;
                                n5 = n2;
                                if (n7 == 0) break block29;
                                n4 = n5;
                                while (n4-- != 0) {
                                    d10 = arrd[n8++];
                                    double d14 = d10 = Math.abs(d10);
                                    if (n7 != 0) {
                                        double d15 = d14 - d11;
                                        d12 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        if (n7 == 0) break block30;
                                        if (d12 <= 0) continue;
                                        d14 = d11 = d10;
                                    }
                                    if (n7 != 0) continue;
                                }
                                d12 = (d13 = d11 - 0.0) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            }
                            if (n7 == 0) break block36;
                            if (d12 != false) break block37;
                            d12 = 0.0;
                        }
                        return (boolean)d12;
                    }
                    arrd2[n9++] = 1.0 / d11;
                    if (n7 != 0) continue;
                }
                n5 = 0;
            }
            int n10 = n5;
            n4 = 0;
            block2: while (true) {
                int n11 = n4;
                block3: while (n11 < n2) {
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    block33: {
                        double d16;
                        n3 = 0;
                        if (n7 == 0) break block31;
                        n6 = n3;
                        while (n6 < n4) {
                            block32: {
                                n17 = n10 + n2 * n6 + n4;
                                d16 = arrd[n17];
                                n16 = n6;
                                n15 = n10 + n2 * n6;
                                n11 = n10 + n4;
                                if (n7 == 0) continue block3;
                                n14 = n11;
                                while (n16-- != 0) {
                                    d16 -= arrd[n15] * arrd[n14];
                                    ++n15;
                                    n14 += n2;
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block32;
                                }
                                arrd[n17] = d16;
                                ++n6;
                            }
                            if (n7 != 0) continue;
                        }
                        d11 = 0.0;
                        n13 = -1;
                        for (n6 = n4; n6 < n2; ++n6) {
                            block34: {
                                n17 = n10 + n2 * n6 + n4;
                                d16 = arrd[n17];
                                n16 = n4;
                                n15 = n10 + n2 * n6;
                                n12 = n10 + n4;
                                if (n7 == 0) break block33;
                                n14 = n12;
                                while (n16-- != 0) {
                                    d16 -= arrd[n15] * arrd[n14];
                                    ++n15;
                                    n14 += n2;
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block34;
                                }
                                arrd[n17] = d16;
                            }
                            d10 = arrd2[n6] * Math.abs(d16);
                            double d17 = d10 == d11 ? 0 : (d10 > d11 ? 1 : -1);
                            if (n7 != 0) {
                                if (d17 < 0) continue;
                                d11 = d10;
                                d17 = n6;
                            }
                            n13 = (int)d17;
                            if (n7 != 0) continue;
                        }
                        n12 = n13;
                    }
                    if (n7 != 0) {
                        if (n12 < 0) {
                            throw new RuntimeException(cK.a("GMatrix24"));
                        }
                        n12 = n4;
                    }
                    if (n7 != 0) {
                        if (n12 != n13) {
                            block35: {
                                n16 = n2;
                                n15 = n10 + n2 * n13;
                                n14 = n10 + n2 * n4;
                                while (n16-- != 0) {
                                    d10 = arrd[n15];
                                    arrd[n15++] = arrd[n14];
                                    arrd[n14++] = d10;
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block35;
                                }
                                arrd2[n13] = arrd2[n4];
                            }
                            arrn2[0] = -arrn2[0];
                        }
                        arrn[n4] = n13;
                        double d18 = arrd[n10 + n2 * n4 + n4] - 0.0;
                        n12 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                    }
                    if (n7 != 0) {
                        if (n12 == 0) {
                            return false;
                        }
                        n12 = n4;
                    }
                    if (n12 != n2 - 1) {
                        d10 = 1.0 / arrd[n10 + n2 * n4 + n4];
                        n17 = n10 + n2 * (n4 + 1) + n4;
                        n6 = n2 - 1 - n4;
                        while (n6-- != 0) {
                            int n18 = n17;
                            arrd[n18] = arrd[n18] * d10;
                            n17 += n2;
                            if (n7 == 0) continue block2;
                            if (n7 != 0) continue;
                        }
                    }
                    ++n4;
                    if (n7 != 0) continue block2;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public final void b(fI fI2, fI fI3) {
        block26: {
            int n2;
            int n3;
            int n4;
            int n5;
            block25: {
                block15: {
                    fI fI4;
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block19: {
                                        int n6;
                                        int n7;
                                        block20: {
                                            block18: {
                                                n5 = ae.f();
                                                n7 = fI2.a;
                                                n6 = fI3.e;
                                                if (n5 == 0) break block18;
                                                if (n7 != n6) break block19;
                                                n7 = this.a;
                                                n6 = fI2.e;
                                            }
                                            if (n5 == 0) break block20;
                                            if (n7 != n6) break block19;
                                            fI4 = this;
                                            if (n5 == 0) break block21;
                                            n7 = fI4.e;
                                            n6 = fI3.a;
                                        }
                                        if (n7 == n6) break block22;
                                    }
                                    throw new gX(cK.a("GMatrix14"));
                                }
                                fI4 = fI2;
                            }
                            if (n5 == 0) break block23;
                            if (fI4 == this) break block24;
                            fI4 = fI3;
                            if (n5 == 0) break block23;
                            if (fI4 != this) break block25;
                        }
                        fI4 = this;
                    }
                    double[][] arrd = new double[fI4.a][this.e];
                    n4 = 0;
                    block0: while (true) {
                        int n8 = n4;
                        block1: while (n8 < this.a) {
                            if (n5 == 0) break block15;
                            n3 = 0;
                            while (n3 < this.e) {
                                block16: {
                                    arrd[n4][n3] = 0.0;
                                    n8 = 0;
                                    if (n5 == 0) continue block1;
                                    for (n2 = v1149011; n2 < fI2.a; ++n2) {
                                        double[] arrd2 = arrd[n4];
                                        int n9 = n3;
                                        arrd2[n9] = arrd2[n9] + fI2.c[n2][n4] * fI3.c[n3][n2];
                                        if (n5 != 0) {
                                            if (n5 != 0) continue;
                                        }
                                        break block16;
                                    }
                                    ++n3;
                                }
                                if (n5 != 0) continue;
                            }
                            ++n4;
                            if (n5 != 0) continue block0;
                        }
                        break;
                    }
                    this.c = arrd;
                }
                if (n5 != 0) break block26;
            }
            n4 = 0;
            block4: while (true) {
                int n10 = n4;
                block5: while (n10 < this.a) {
                    n3 = 0;
                    while (n3 < this.e) {
                        block17: {
                            this.c[n4][n3] = 0.0;
                            n10 = 0;
                            if (n5 == 0) continue block5;
                            for (n2 = v1149060; n2 < fI2.a; ++n2) {
                                double[] arrd = this.c[n4];
                                int n11 = n3;
                                arrd[n11] = arrd[n11] + fI2.c[n2][n4] * fI3.c[n3][n2];
                                if (n5 != 0) {
                                    if (n5 != 0) continue;
                                }
                                break block17;
                            }
                            ++n3;
                        }
                        if (n5 != 0) continue;
                    }
                    ++n4;
                    if (n5 != 0) continue block4;
                }
                break;
            }
        }
    }

    private static void b(fI fI2, fI fI3, fI fI4) {
        fI fI5 = new fI(fI2.e, fI2.a);
        fI5.e(fI3, fI5);
        fI5.e(fI5, fI4);
        System.out.println("\n m = \n" + fI.i(fI5));
    }

    public final int a(fI fI2, e e10) {
        int n2;
        int[] arrn;
        int[] arrn2;
        int n3;
        block21: {
            int n4;
            int n5;
            int n6;
            double[] arrd;
            block19: {
                block24: {
                    int n7;
                    int n8;
                    block23: {
                        int n9 = fI2.a * fI2.e;
                        n3 = ae.g();
                        arrd = new double[n9];
                        arrn2 = new int[1];
                        arrn = new int[fI2.a];
                        n8 = this.a;
                        n7 = this.e;
                        if (n3 == 0) {
                            if (n8 != n7) {
                                throw new gX(cK.a("GMatrix19"));
                            }
                            n8 = this.a;
                            n7 = fI2.a;
                        }
                        if (n3 == 0) {
                            if (n8 != n7) {
                                throw new gX(cK.a("GMatrix27"));
                            }
                            n8 = this.e;
                            n7 = fI2.e;
                        }
                        if (n3 != 0) break block23;
                        if (n8 != n7) {
                            throw new gX(cK.a("GMatrix27"));
                        }
                        n8 = fI2.a;
                        if (n3 != 0) break block24;
                        n7 = e10.c();
                    }
                    if (n8 != n7) {
                        throw new gX(cK.a("GMatrix20"));
                    }
                    n8 = n2 = 0;
                }
                while (n2 < this.a) {
                    block20: {
                        n6 = 0;
                        if (n3 != 0) break block19;
                        for (n5 = v1149244; n5 < this.e; ++n5) {
                            arrd[n2 * this.e + n5] = this.c[n2][n5];
                            if (n3 == 0) {
                                if (n3 == 0) continue;
                            }
                            break block20;
                        }
                        ++n2;
                    }
                    if (n3 == 0) continue;
                }
                n6 = fI.a(fI2.a, arrd, arrn, arrn2) ? 1 : 0;
            }
            if (n3 == 0) {
                if (n6 == 0) {
                    throw new gP(cK.a("GMatrix21"));
                }
                n6 = n2 = 0;
            }
            while (n2 < this.a) {
                block22: {
                    n4 = 0;
                    if (n3 != 0) break block21;
                    for (n5 = v1149269; n5 < this.e; ++n5) {
                        fI2.c[n2][n5] = arrd[n2 * this.e + n5];
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                        }
                        break block22;
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            n4 = n2 = 0;
        }
        while (n2 < fI2.a) {
            e10.a[n2] = arrn[n2];
            ++n2;
            if (n3 == 0) continue;
        }
        return arrn2[0];
    }

    public final void g(fI fI2) {
        int n2;
        int n3;
        block11: {
            int n4;
            int n5;
            block10: {
                n3 = ae.g();
                n5 = this.a;
                n4 = fI2.a;
                if (n3 != 0) break block10;
                if (n5 != n4) {
                    throw new gX(cK.a("GMatrix9"));
                }
                n5 = this.e;
                if (n3 != 0) break block11;
                n4 = fI2.e;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GMatrix28"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.a) {
            block9: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = this.c[n2][i2] - fI2.c[n2][i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block9;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    private static void a(double[] arrd, double[] arrd2) {
        System.out.println("\ns =" + arrd[0] + " " + arrd[1] + " " + arrd[2]);
        System.out.println("e =" + arrd2[0] + " " + arrd2[1]);
    }

    public boolean a(fI fI2, double d10) {
        int n2;
        block8: {
            int n3;
            int n4;
            block11: {
                block12: {
                    int n5;
                    block9: {
                        block10: {
                            n4 = ae.g();
                            n5 = this.a;
                            if (n4 != 0) break block9;
                            if (n5 != fI2.a) break block10;
                            n3 = this.e;
                            if (n4 != 0) break block11;
                            if (n3 == fI2.e) break block12;
                        }
                        n5 = 0;
                    }
                    return n5 != 0;
                }
                n3 = 0;
            }
            int n6 = n3;
            block0: while (true) {
                int n7 = n6;
                block1: while (n7 < this.a) {
                    n2 = 0;
                    if (n4 != 0) break block8;
                    for (int i2 = v1149439; i2 < this.e; ++i2) {
                        double d11;
                        double d12;
                        double d13 = d12 = this.c[n6][i2] - fI2.c[n6][i2];
                        if (n4 == 0) {
                            double d14 = d13 - 0.0;
                            n7 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                            if (n4 != 0) continue block1;
                            d13 = n7 < 0 ? -d12 : d12;
                        }
                        double d15 = (d11 = d13 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (n4 == 0) {
                            if (d15 <= 0) continue;
                            d15 = 0.0;
                        }
                        return (boolean)d15;
                    }
                    ++n6;
                    if (n4 == 0) continue block0;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static String i(fI fI2) {
        StringBuffer stringBuffer = new StringBuffer(fI2.a * fI2.e * 8);
        int n2 = 0;
        int n3 = ae.g();
        block0: while (true) {
            int n4 = n2;
            block1: while (n4 < fI2.a) {
                for (int i2 = 0; i2 < fI2.e; ++i2) {
                    double d10 = Math.abs(fI2.c[n2][i2]) - 1.0E-9;
                    n4 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    if (n3 != 0) continue block1;
                    if (n4 < 0) {
                        stringBuffer.append("0.0000 ");
                        if (n3 == 0) continue;
                    }
                    stringBuffer.append(fI2.c[n2][i2]).append(" ");
                    if (n3 == 0) continue;
                }
                stringBuffer.append("\n");
                ++n2;
                if (n3 == 0) continue block0;
            }
            break;
        }
        return stringBuffer.toString();
    }

    private static void a(double[] arrd, double[] arrd2, int n2, fI fI2) {
        block2: {
            int n3;
            double[] arrd3 = new double[1];
            double[] arrd4 = new double[1];
            fI fI3 = new fI(fI2.a, fI2.e);
            fI fI4 = new fI(fI2.a, fI2.e);
            double d10 = arrd2[n2];
            double d11 = arrd[n2];
            int n4 = ae.f();
            for (n3 = n2; n3 > 0; --n3) {
                double d12 = fI.a(d10, d11, arrd4, arrd3);
                d10 = -arrd2[n3 - 1] * arrd4[0];
                d11 = arrd[n3 - 1];
                arrd[n3] = d12;
                arrd2[n3 - 1] = arrd2[n3 - 1] * arrd3[0];
                fI.a(n3, n2 + 1, fI2, arrd3, arrd4, fI3, fI4);
                if (n4 != 0) {
                    if (n4 != 0) continue;
                }
                break block2;
            }
            arrd[n3 + 1] = fI.a(d10, d11, arrd4, arrd3);
            fI.a(n3, n2 + 1, fI2, arrd3, arrd4, fI3, fI4);
        }
    }

    public final void b(int n2, e e10) {
        int n3 = ae.g();
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.c[i2][n2] = e10.a[i2];
            if (n3 == 0) continue;
        }
    }

    public final void d(fI fI2, fI fI3) {
        block26: {
            int n2;
            int n3;
            int n4;
            int n5;
            block25: {
                block15: {
                    fI fI4;
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block19: {
                                        int n6;
                                        int n7;
                                        block20: {
                                            block18: {
                                                n5 = ae.f();
                                                n7 = fI2.e;
                                                n6 = fI3.e;
                                                if (n5 == 0) break block18;
                                                if (n7 != n6) break block19;
                                                n7 = this.e;
                                                n6 = fI3.a;
                                            }
                                            if (n5 == 0) break block20;
                                            if (n7 != n6) break block19;
                                            fI4 = this;
                                            if (n5 == 0) break block21;
                                            n7 = fI4.a;
                                            n6 = fI2.a;
                                        }
                                        if (n7 == n6) break block22;
                                    }
                                    throw new gX(cK.a("GMatrix15"));
                                }
                                fI4 = fI2;
                            }
                            if (n5 == 0) break block23;
                            if (fI4 == this) break block24;
                            fI4 = fI3;
                            if (n5 == 0) break block23;
                            if (fI4 != this) break block25;
                        }
                        fI4 = this;
                    }
                    double[][] arrd = new double[fI4.a][this.e];
                    n4 = 0;
                    block0: while (true) {
                        int n8 = n4;
                        block1: while (n8 < this.a) {
                            if (n5 == 0) break block15;
                            n3 = 0;
                            while (n3 < this.e) {
                                block16: {
                                    arrd[n4][n3] = 0.0;
                                    n8 = 0;
                                    if (n5 == 0) continue block1;
                                    for (n2 = v1149647; n2 < fI2.e; ++n2) {
                                        double[] arrd2 = arrd[n4];
                                        int n9 = n3;
                                        arrd2[n9] = arrd2[n9] + fI2.c[n4][n2] * fI3.c[n3][n2];
                                        if (n5 != 0) {
                                            if (n5 != 0) continue;
                                        }
                                        break block16;
                                    }
                                    ++n3;
                                }
                                if (n5 != 0) continue;
                            }
                            ++n4;
                            if (n5 != 0) continue block0;
                        }
                        break;
                    }
                    this.c = arrd;
                }
                if (n5 != 0) break block26;
            }
            n4 = 0;
            block4: while (true) {
                int n10 = n4;
                block5: while (n10 < this.a) {
                    n3 = 0;
                    while (n3 < this.e) {
                        block17: {
                            this.c[n4][n3] = 0.0;
                            n10 = 0;
                            if (n5 == 0) continue block5;
                            for (n2 = v1149696; n2 < fI2.e; ++n2) {
                                double[] arrd = this.c[n4];
                                int n11 = n3;
                                arrd[n11] = arrd[n11] + fI2.c[n4][n2] * fI3.c[n3][n2];
                                if (n5 != 0) {
                                    if (n5 != 0) continue;
                                }
                                break block17;
                            }
                            ++n3;
                        }
                        if (n5 != 0) continue;
                    }
                    ++n4;
                    if (n5 != 0) continue block4;
                }
                break;
            }
        }
    }

    public final void h(fI fI2) {
        block9: {
            int n2;
            int n3;
            int n4;
            block13: {
                block14: {
                    block12: {
                        block11: {
                            n4 = ae.g();
                            n3 = this.e;
                            n2 = fI2.a;
                            if (n4 != 0) break block11;
                            if (n3 != n2) break block12;
                            n3 = this.e;
                            n2 = fI2.e;
                        }
                        if (n4 != 0) break block13;
                        if (n3 == n2) break block14;
                    }
                    throw new gX(cK.a("GMatrix0"));
                }
                n3 = this.a;
                n2 = this.e;
            }
            double[][] arrd = new double[n3][n2];
            int n5 = 0;
            block0: while (true) {
                int n6 = n5;
                block1: while (n6 < this.a) {
                    if (n4 != 0) break block9;
                    int n7 = 0;
                    while (n7 < this.e) {
                        block10: {
                            arrd[n5][n7] = 0.0;
                            n6 = 0;
                            if (n4 != 0) continue block1;
                            for (int i2 = v1149785; i2 < this.e; ++i2) {
                                double[] arrd2 = arrd[n5];
                                int n8 = n7;
                                arrd2[n8] = arrd2[n8] + this.c[n5][i2] * fI2.c[i2][n7];
                                if (n4 == 0) {
                                    if (n4 == 0) continue;
                                }
                                break block10;
                            }
                            ++n7;
                        }
                        if (n4 == 0) continue;
                    }
                    ++n5;
                    if (n4 == 0) continue block0;
                }
                break;
            }
            this.c = arrd;
        }
    }

    public final void a(int n2, int n3, double d10) {
        this.c[n2][n3] = d10;
    }

    public fI(fI fI2) {
        this.a = fI2.a;
        this.e = fI2.e;
        this.c = new double[this.a][this.e];
        int n2 = 0;
        int n3 = ae.g();
        while (n2 < this.a) {
            block3: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = fI2.c[n2][i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    static {
        d = false;
    }

    private static void b(int n2, fI fI2, double[] arrd, double[] arrd2) {
        int n3 = ae.f();
        for (int i2 = 0; i2 < fI2.a; ++i2) {
            double d10 = fI2.c[i2][n2];
            fI2.c[i2][n2] = arrd[0] * d10 + arrd2[0] * fI2.c[i2][n2 + 1];
            fI2.c[i2][n2 + 1] = -arrd2[0] * d10 + arrd[0] * fI2.c[i2][n2 + 1];
            if (n3 != 0) continue;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static void a(int n2, int n3, double[] arrd, double[] arrd2, fI fI2, fI fI3) {
        int n4;
        int n5;
        double[] arrd3;
        int n6;
        double[] arrd4;
        double[] arrd5;
        double[] arrd6;
        block23: {
            double d10;
            arrd6 = new double[1];
            arrd5 = new double[1];
            arrd4 = new double[1];
            n6 = ae.g();
            arrd3 = new double[1];
            fI fI4 = new fI(fI2.e, fI3.a);
            int n7 = 2;
            double d11 = 4.89E-15;
            double d12 = 1.0;
            double d13 = -1.0;
            int n8 = 0;
            double d14 = 0.0;
            double d15 = 0.0;
            for (int i2 = 0; i2 < 2; ++i2) {
                int n9;
                block26: {
                    int n10;
                    block25: {
                        double d16;
                        int n11;
                        int n12;
                        block24: {
                            n5 = n8;
                            if (n6 != 0 || n6 != 0) break block23;
                            if (n5 != 0) break;
                            for (n4 = n2; n4 <= n3; ++n4) {
                                int n13;
                                block33: {
                                    int n14;
                                    block32: {
                                        block28: {
                                            int n15;
                                            block31: {
                                                int n16;
                                                int n17;
                                                block29: {
                                                    block30: {
                                                        block27: {
                                                            n12 = n4;
                                                            n11 = n2;
                                                            if (n6 != 0) break block24;
                                                            if (n6 != 0) break block27;
                                                            if (n12 != n11) break block28;
                                                            n17 = arrd2.length;
                                                            n16 = arrd.length;
                                                        }
                                                        if (n6 != 0) break block29;
                                                        if (n17 != n16) break block30;
                                                        n15 = n3;
                                                        if (n6 == 0) break block31;
                                                    }
                                                    n17 = n3;
                                                    n16 = 1;
                                                }
                                                n15 = n17 + n16;
                                            }
                                            double d17 = fI.a(arrd[n15 - 1], arrd2[n3], arrd[n15]);
                                            d14 = (Math.abs(arrd[n4]) - d17) * (fI.b(d12, arrd[n4]) + d17 / arrd[n4]);
                                            d15 = arrd2[n4];
                                        }
                                        d16 = fI.a(d14, d15, arrd3, arrd5);
                                        n13 = n4;
                                        n14 = n2;
                                        if (n6 != 0) break block32;
                                        if (n13 != n14) {
                                            arrd2[n4 - 1] = d16;
                                        }
                                        d14 = arrd5[0] * arrd[n4] + arrd3[0] * arrd2[n4];
                                        arrd2[n4] = arrd5[0] * arrd2[n4] - arrd3[0] * arrd[n4];
                                        d15 = arrd3[0] * arrd[n4 + 1];
                                        arrd[n4 + 1] = arrd5[0] * arrd[n4 + 1];
                                        fI.b(n4, fI3, arrd5, arrd3);
                                        arrd[n4] = d16 = fI.a(d14, d15, arrd4, arrd6);
                                        d14 = arrd6[0] * arrd2[n4] + arrd4[0] * arrd[n4 + 1];
                                        arrd[n4 + 1] = arrd6[0] * arrd[n4 + 1] - arrd4[0] * arrd2[n4];
                                        n13 = n4;
                                        if (n6 != 0) break block33;
                                        n14 = n3;
                                    }
                                    if (n13 < n14) {
                                        d15 = arrd4[0] * arrd2[n4 + 1];
                                        arrd2[n4 + 1] = arrd6[0] * arrd2[n4 + 1];
                                    }
                                    n13 = n4;
                                }
                                fI.a(n13, fI2, arrd6, arrd4);
                                if (n6 == 0) continue;
                            }
                            n12 = arrd.length;
                            n11 = arrd2.length;
                        }
                        boolean bl2 = true;
                        do {
                            block35: {
                                block34: {
                                    if (!bl2 || (bl2 = false)) break block34;
                                    if (n6 != 0) break block35;
                                    if (n12 == n11) {
                                        d16 = fI.a(d14, d15, arrd3, arrd5);
                                        d14 = arrd5[0] * arrd[n4] + arrd3[0] * arrd2[n4];
                                        arrd2[n4] = arrd5[0] * arrd2[n4] - arrd3[0] * arrd[n4];
                                        arrd[n4 + 1] = arrd5[0] * arrd[n4 + 1];
                                        fI.b(n4, fI3, arrd5, arrd3);
                                    }
                                }
                                n12 = n3 - n2;
                                n11 = 1;
                            }
                            if (n12 <= n11) break;
                            double d18 = Math.abs(arrd2[n3]) - 4.89E-15;
                            n10 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                            if (n6 != 0 || n6 != 0) break block25;
                            if (n10 >= 0) break;
                            --n3;
                        } while (n6 == 0);
                        n10 = n3 - 2;
                    }
                    int n18 = n10;
                    block3: while (true) {
                        int n19 = n18;
                        block4: while (n19 > n2) {
                            block37: {
                                block36: {
                                    double d19 = Math.abs(arrd2[n18]) - 4.89E-15;
                                    n9 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                    if (n6 != 0) break block26;
                                    if (n6 != 0) break block36;
                                    if (n9 >= 0) break block37;
                                    fI.a(n18 + 1, n3, arrd, arrd2, fI2, fI3);
                                    int n20 = n3 = n18 - 1;
                                }
                                while (n3 - n2 > 1) {
                                    double d20 = Math.abs(arrd2[n3]) - 4.89E-15;
                                    n19 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                    if (n6 != 0) continue block4;
                                    if (n19 >= 0) break;
                                    --n3;
                                    if (n6 == 0) continue;
                                }
                            }
                            --n18;
                            if (n6 == 0) continue block3;
                        }
                        break;
                    }
                    n9 = n3 - n2;
                }
                if (n6 == 0) {
                    if (n9 > 1) continue;
                    double d21 = Math.abs(arrd2[n2 + 1]) - 4.89E-15;
                    n9 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                }
                if (n6 == 0) {
                    if (n9 >= 0) continue;
                    n9 = 1;
                }
                n8 = n9;
                if (n6 == 0) continue;
            }
            n5 = (d10 = Math.abs(arrd2[1]) - 4.89E-15) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        }
        if (n6 == 0) {
            if (n5 < 0) {
                fI.a(arrd[n2], arrd2[n2], arrd[n2 + 1], arrd, arrd4, arrd6, arrd3, arrd5, 0);
                arrd2[n2] = 0.0;
                arrd2[n2 + 1] = 0.0;
            }
            n5 = n2;
        }
        n4 = n5;
        fI.a(n4, fI2, arrd6, arrd4);
        fI.b(n4, fI3, arrd5, arrd3);
    }

    public final void j(fI fI2) {
        int n2;
        int n3;
        int n4;
        int n5;
        block19: {
            int n6;
            int n7;
            block17: {
                int n8;
                block27: {
                    int n9;
                    block25: {
                        block26: {
                            block24: {
                                int n10;
                                block22: {
                                    block23: {
                                        n5 = ae.f();
                                        n10 = this.e;
                                        if (n5 == 0) break block22;
                                        if (n10 >= fI2.e) break block23;
                                        n7 = this.e;
                                        if (n5 != 0) break block24;
                                    }
                                    n10 = fI2.e;
                                }
                                n7 = n10;
                            }
                            n9 = this.a;
                            if (n5 == 0) break block25;
                            if (n9 >= fI2.a) break block26;
                            n4 = this.a;
                            if (n5 != 0) break block27;
                        }
                        n9 = fI2.a;
                    }
                    n4 = n9;
                }
                n3 = 0;
                while (n3 < n4) {
                    block18: {
                        n8 = 0;
                        if (n5 == 0) break block17;
                        for (n2 = v1153351; n2 < n7; ++n2) {
                            fI2.c[n3][n2] = this.c[n3][n2];
                            if (n5 != 0) {
                                if (n5 != 0) continue;
                            }
                            break block18;
                        }
                        ++n3;
                    }
                    if (n5 != 0) continue;
                }
                n8 = n3 = n4;
            }
            while (n3 < fI2.a) {
                block20: {
                    n6 = 0;
                    if (n5 == 0) break block19;
                    for (n2 = v1153369; n2 < fI2.e; ++n2) {
                        fI2.c[n3][n2] = 0.0;
                        if (n5 != 0) {
                            if (n5 != 0) continue;
                        }
                        break block20;
                    }
                    ++n3;
                }
                if (n5 != 0) continue;
            }
            n6 = n2 = n7;
        }
        while (n2 < fI2.e) {
            block21: {
                for (n3 = 0; n3 < n4; ++n3) {
                    fI2.c[n3][n2] = 0.0;
                    if (n5 != 0) {
                        if (n5 != 0) continue;
                    }
                    break block21;
                }
                ++n2;
            }
            if (n5 != 0) continue;
        }
    }

    public final void c() {
        int n2 = 0;
        int n3 = ae.g();
        while (n2 < this.a) {
            block3: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = 0.0;
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    public final void c(fI fI2, fI fI3) {
        block26: {
            int n2;
            int n3;
            int n4;
            int n5;
            block25: {
                block15: {
                    fI fI4;
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block19: {
                                        int n6;
                                        int n7;
                                        block20: {
                                            block18: {
                                                n5 = ae.g();
                                                n7 = fI2.a;
                                                n6 = fI3.a;
                                                if (n5 != 0) break block18;
                                                if (n7 != n6) break block19;
                                                n7 = this.e;
                                                n6 = fI3.e;
                                            }
                                            if (n5 != 0) break block20;
                                            if (n7 != n6) break block19;
                                            fI4 = this;
                                            if (n5 != 0) break block21;
                                            n7 = fI4.a;
                                            n6 = fI2.e;
                                        }
                                        if (n7 == n6) break block22;
                                    }
                                    throw new gX(cK.a("GMatrix16"));
                                }
                                fI4 = fI2;
                            }
                            if (n5 != 0) break block23;
                            if (fI4 == this) break block24;
                            fI4 = fI3;
                            if (n5 != 0) break block23;
                            if (fI4 != this) break block25;
                        }
                        fI4 = this;
                    }
                    double[][] arrd = new double[fI4.a][this.e];
                    n4 = 0;
                    block0: while (true) {
                        int n8 = n4;
                        block1: while (n8 < this.a) {
                            if (n5 != 0) break block15;
                            n3 = 0;
                            while (n3 < this.e) {
                                block16: {
                                    arrd[n4][n3] = 0.0;
                                    n8 = 0;
                                    if (n5 != 0) continue block1;
                                    for (n2 = v1153455; n2 < fI2.a; ++n2) {
                                        double[] arrd2 = arrd[n4];
                                        int n9 = n3;
                                        arrd2[n9] = arrd2[n9] + fI2.c[n2][n4] * fI3.c[n2][n3];
                                        if (n5 == 0) {
                                            if (n5 == 0) continue;
                                        }
                                        break block16;
                                    }
                                    ++n3;
                                }
                                if (n5 == 0) continue;
                            }
                            ++n4;
                            if (n5 == 0) continue block0;
                        }
                        break;
                    }
                    this.c = arrd;
                }
                if (n5 == 0) break block26;
            }
            n4 = 0;
            block4: while (true) {
                int n10 = n4;
                block5: while (n10 < this.a) {
                    n3 = 0;
                    while (n3 < this.e) {
                        block17: {
                            this.c[n4][n3] = 0.0;
                            n10 = 0;
                            if (n5 != 0) continue block5;
                            for (n2 = v1153504; n2 < fI2.a; ++n2) {
                                double[] arrd = this.c[n4];
                                int n11 = n3;
                                arrd[n11] = arrd[n11] + fI2.c[n2][n4] * fI3.c[n2][n3];
                                if (n5 == 0) {
                                    if (n5 == 0) continue;
                                }
                                break block17;
                            }
                            ++n3;
                        }
                        if (n5 == 0) continue;
                    }
                    ++n4;
                    if (n5 == 0) continue block4;
                }
                break;
            }
        }
    }

    public final void f() {
        this.l(this);
    }

    public final void a(e e10, e e11) {
        int n2;
        int n3;
        block11: {
            int n4;
            int n5;
            block10: {
                n3 = ae.g();
                n5 = this.a;
                n4 = e10.c();
                if (n3 != 0) break block10;
                if (n5 < n4) {
                    throw new gX(cK.a("GMatrix2"));
                }
                n5 = this.e;
                if (n3 != 0) break block11;
                n4 = e11.c();
            }
            if (n5 < n4) {
                throw new gX(cK.a("GMatrix3"));
            }
            n5 = n2 = 0;
        }
        while (n2 < e10.c()) {
            block9: {
                for (int i2 = 0; i2 < e11.c(); ++i2) {
                    this.c[n2][i2] = e10.a[n2] * e11.a[i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block9;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    public final void b(int n2, int n3) {
        block11: {
            int n4;
            int n5;
            int n6;
            double[][] arrd;
            block18: {
                int n7;
                block16: {
                    block17: {
                        block15: {
                            int n8;
                            block13: {
                                block14: {
                                    arrd = new double[n2][n3];
                                    n6 = ae.f();
                                    n8 = this.a;
                                    if (n6 == 0) break block13;
                                    if (n8 >= n2) break block14;
                                    n5 = this.a;
                                    if (n6 != 0) break block15;
                                }
                                n8 = n2;
                            }
                            n5 = n8;
                        }
                        n7 = this.e;
                        if (n6 == 0) break block16;
                        if (n7 >= n3) break block17;
                        n4 = this.e;
                        if (n6 != 0) break block18;
                    }
                    n7 = n3;
                }
                n4 = n7;
            }
            int n9 = 0;
            while (n9 < n5) {
                block12: {
                    if (n6 == 0) break block11;
                    for (int i2 = 0; i2 < n4; ++i2) {
                        arrd[n9][i2] = this.c[n9][i2];
                        if (n6 != 0) {
                            if (n6 != 0) continue;
                        }
                        break block12;
                    }
                    ++n9;
                }
                if (n6 != 0) continue;
            }
            this.a = n2;
            this.e = n3;
            this.c = arrd;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static double b(double var0, double var2_1) {
        var4_2 = ae.f();
        v0 = var0;
        if (var4_2 == 0) ** GOTO lbl8
        if (v0 >= 0.0) {
            v1 = var0;
        } else {
            v0 = var0;
lbl8:
            // 2 sources

            v1 = -v0;
        }
        var5_3 = v1;
        v2 = var2_1;
        if (var4_2 != 0) {
            if (v2 >= 0.0) {
                v3 = var5_3;
                return v3;
            }
            v2 = var5_3;
        }
        v3 = -v2;
        return v3;
    }

    final void l(fI fI2) {
        int n2;
        int n3;
        double[] arrd;
        int n4;
        block17: {
            int[] arrn;
            double[] arrd2;
            block16: {
                int n5;
                int n6;
                block14: {
                    n6 = fI2.a * fI2.e;
                    arrd2 = new double[n6];
                    n4 = ae.f();
                    arrd = new double[n6];
                    arrn = new int[fI2.a];
                    int[] arrn2 = new int[1];
                    int n7 = fI2.a;
                    if (n4 != 0) {
                        if (n7 != fI2.e) {
                            throw new gX(cK.a("GMatrix22"));
                        }
                        n7 = n3 = 0;
                    }
                    while (n3 < this.a) {
                        block15: {
                            n5 = 0;
                            if (n4 == 0) break block14;
                            for (n2 = v1153894; n2 < this.e; ++n2) {
                                arrd2[n3 * this.e + n2] = fI2.c[n3][n2];
                                if (n4 != 0) {
                                    if (n4 != 0) continue;
                                }
                                break block15;
                            }
                            ++n3;
                        }
                        if (n4 != 0) continue;
                    }
                    n5 = fI.a(fI2.a, arrd2, arrn, arrn2) ? 1 : 0;
                }
                if (n4 != 0) {
                    if (n5 == 0) {
                        throw new gP(cK.a("GMatrix21"));
                    }
                    n5 = n3 = 0;
                }
                while (n3 < n6) {
                    arrd[n3] = 0.0;
                    ++n3;
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                    }
                    break block16;
                }
                n3 = 0;
            }
            while (n3 < this.e) {
                arrd[n3 + n3 * this.e] = 1.0;
                ++n3;
                if (n4 != 0) {
                    if (n4 != 0) continue;
                }
                break block17;
            }
            fI.a(fI2.a, arrd2, arrn, arrd);
        }
        n3 = 0;
        while (n3 < this.a) {
            block18: {
                for (n2 = 0; n2 < this.e; ++n2) {
                    this.c[n3][n2] = arrd[n3 * this.e + n2];
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                    }
                    break block18;
                }
                ++n3;
            }
            if (n4 != 0) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, fI fI2) {
        int n8;
        double[][] arrd;
        int n9;
        int n10;
        int n11;
        block8: {
            n11 = ae.g();
            if (this != fI2) {
                n10 = 0;
                block0: do {
                    if (n10 >= n4) return;
                    for (n9 = 0; n9 < n5; ++n9) {
                        fI2.c[n6 + n10][n7 + n9] = this.c[n2 + n10][n3 + n9];
                        if (n11 != 0) continue block0;
                        if (n11 == 0) continue;
                    }
                    ++n10;
                } while (n11 == 0);
            }
            arrd = new double[n4][n5];
            n10 = 0;
            while (n10 < n4) {
                block9: {
                    n8 = 0;
                    if (n11 != 0) break block8;
                    for (n9 = v1154569; n9 < n5; ++n9) {
                        arrd[n10][n9] = this.c[n2 + n10][n3 + n9];
                        if (n11 == 0) {
                            if (n11 == 0) continue;
                        }
                        break block9;
                    }
                    ++n10;
                }
                if (n11 == 0) continue;
            }
            n8 = 0;
        }
        n10 = n8;
        block4: do {
            if (n10 >= n4) return;
            for (n9 = 0; n9 < n5; ++n9) {
                fI2.c[n6 + n10][n7 + n9] = arrd[n10][n9];
                if (n11 != 0) continue block4;
                if (n11 == 0) continue;
            }
            ++n10;
        } while (n11 == 0);
    }

    public final void c(int n2, double[] arrd) {
        int n3 = ae.g();
        for (int i2 = 0; i2 < this.a; ++i2) {
            arrd[i2] = this.c[i2][n2];
            if (n3 == 0) continue;
        }
    }

    public final void e(fI fI2, fI fI3) {
        block9: {
            int n2;
            int n3;
            int n4;
            block14: {
                block15: {
                    block12: {
                        block13: {
                            block11: {
                                n4 = ae.g();
                                n3 = fI2.e;
                                n2 = fI3.a;
                                if (n4 != 0) break block11;
                                if (n3 != n2) break block12;
                                n3 = this.a;
                                n2 = fI2.a;
                            }
                            if (n4 != 0) break block13;
                            if (n3 != n2) break block12;
                            n3 = this.e;
                            n2 = fI3.e;
                        }
                        if (n4 != 0) break block14;
                        if (n3 == n2) break block15;
                    }
                    throw new gX(cK.a("GMatrix1"));
                }
                n3 = this.a;
                n2 = this.e;
            }
            double[][] arrd = new double[n3][n2];
            int n5 = 0;
            block0: while (true) {
                int n6 = n5;
                block1: while (n6 < fI2.a) {
                    if (n4 != 0) break block9;
                    int n7 = 0;
                    while (n7 < fI3.e) {
                        block10: {
                            arrd[n5][n7] = 0.0;
                            n6 = 0;
                            if (n4 != 0) continue block1;
                            for (int i2 = v1154646; i2 < fI2.e; ++i2) {
                                double[] arrd2 = arrd[n5];
                                int n8 = n7;
                                arrd2[n8] = arrd2[n8] + fI2.c[n5][i2] * fI3.c[i2][n7];
                                if (n4 == 0) {
                                    if (n4 == 0) continue;
                                }
                                break block10;
                            }
                            ++n7;
                        }
                        if (n4 == 0) continue;
                    }
                    ++n5;
                    if (n4 == 0) continue block0;
                }
                break;
            }
            this.c = arrd;
        }
    }

    public final void b(dc dc2) {
        int n2;
        int n3;
        block10: {
            int n4;
            block11: {
                block8: {
                    fI fI2;
                    block9: {
                        n3 = ae.f();
                        fI2 = this;
                        if (n3 == 0) break block8;
                        if (fI2.e < 3) break block9;
                        n4 = this.a;
                        if (n3 == 0) break block10;
                        if (n4 >= 3) break block11;
                    }
                    this.e = 3;
                    this.a = 3;
                    fI2 = this;
                }
                fI2.c = new double[this.a][this.e];
            }
            this.c[0][0] = dc2.j;
            this.c[0][1] = dc2.d;
            this.c[0][2] = dc2.a;
            this.c[1][0] = dc2.c;
            this.c[1][1] = dc2.g;
            this.c[1][2] = dc2.h;
            this.c[2][0] = dc2.f;
            this.c[2][1] = dc2.e;
            this.c[2][2] = dc2.i;
            n4 = n2 = 3;
        }
        while (n2 < this.a) {
            block7: {
                for (int i2 = 3; i2 < this.e; ++i2) {
                    this.c[n2][i2] = 0.0;
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block7;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public final void b() {
        int n2;
        int n3;
        int n4;
        block12: {
            int n5;
            block10: {
                block11: {
                    block8: {
                        n4 = 0;
                        n3 = ae.g();
                        while (n4 < this.a) {
                            block9: {
                                n5 = 0;
                                if (n3 != 0) break block8;
                                for (int i2 = v1154846; i2 < this.e; ++i2) {
                                    this.c[n4][i2] = 0.0;
                                    if (n3 == 0) {
                                        if (n3 == 0) continue;
                                    }
                                    break block9;
                                }
                                ++n4;
                            }
                            if (n3 == 0) continue;
                        }
                        n5 = this.a;
                    }
                    if (n3 != 0) break block10;
                    if (n5 >= this.e) break block11;
                    n2 = this.a;
                    if (n3 == 0) break block12;
                }
                n5 = this.e;
            }
            n2 = n5;
        }
        for (n4 = 0; n4 < n2; ++n4) {
            this.c[n4][n4] = 1.0;
            if (n3 == 0) continue;
        }
    }

    public final void d(fI fI2) {
        int n2;
        int n3;
        int n4;
        block10: {
            int n5;
            block15: {
                int n6;
                block16: {
                    block13: {
                        fI fI3;
                        block14: {
                            n4 = ae.f();
                            fI3 = this;
                            if (n4 == 0) break block13;
                            if (fI3.a < fI2.a) break block14;
                            n6 = this.e;
                            if (n4 == 0) break block15;
                            if (n6 >= fI2.e) break block16;
                        }
                        this.a = fI2.a;
                        this.e = fI2.e;
                        fI3 = this;
                    }
                    fI3.c = new double[this.a][this.e];
                }
                n6 = n3 = 0;
            }
            while (n3 < Math.min(this.a, fI2.a)) {
                block11: {
                    n5 = 0;
                    if (n4 == 0) break block10;
                    for (n2 = v1154918; n2 < Math.min(this.e, fI2.e); ++n2) {
                        this.c[n3][n2] = fI2.c[n3][n2];
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                        }
                        break block11;
                    }
                    ++n3;
                }
                if (n4 != 0) continue;
            }
            n5 = n3 = fI2.a;
        }
        while (n3 < this.a) {
            block12: {
                for (n2 = fI2.e; n2 < this.e; ++n2) {
                    this.c[n3][n2] = 0.0;
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                    }
                    break block12;
                }
                ++n3;
            }
            if (n4 != 0) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 10[FORLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public final void a(double[] arrd) {
        int n2 = 0;
        int n3 = ae.g();
        while (n2 < this.a) {
            block3: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = arrd[this.e * n2 + i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    private static void f(fI fI2) {
        int n2 = 0;
        int n3 = ae.g();
        block0: while (true) {
            int n4 = n2;
            block1: while (n4 < fI2.a) {
                for (int i2 = 0; i2 < fI2.e; ++i2) {
                    double d10 = Math.abs(fI2.c[n2][i2]) - 1.0E-10;
                    n4 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    if (n3 != 0) continue block1;
                    if (n4 < 0) {
                        System.out.print(" 0.0     ");
                        if (n3 == 0) continue;
                    }
                    System.out.print(" " + fI2.c[n2][i2]);
                    if (n3 == 0) continue;
                }
                System.out.print("\n");
                ++n2;
                if (n3 == 0) continue block0;
            }
            break;
        }
    }

    public final void g() {
        int n2 = 0;
        int n3 = ae.g();
        while (n2 < this.a) {
            block3: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = -this.c[n2][i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static double a(double var0, double var2_1, double[] var4_2, double[] var5_3) {
        block11: {
            block15: {
                block10: {
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    var26_4 = 2.002083095183101E-146;
                                    var6_5 = ae.f();
                                    var28_6 = 4.9947976805055876E145;
                                    cfr_temp_0 = var2_1 - 0.0;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var6_5 == 0) break block13;
                                    if (v0 != false) break block14;
                                    var12_7 = 1.0;
                                    var14_8 = 0.0;
                                    var24_9 = var0;
                                    if (var6_5 != 0) break block15;
                                }
                                v1 = var0;
                                if (var6_5 == 0) break block16;
                                cfr_temp_1 = v1 - 0.0;
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                            }
                            if (v0 != false) break block17;
                            var12_7 = 0.0;
                            var14_8 = 1.0;
                            var24_9 = var2_1;
                            if (var6_5 != 0) break block15;
                        }
                        v1 = var0;
                    }
                    var20_10 = v1;
                    var22_11 = var2_1;
                    var17_12 = fI.a(Math.abs(var20_10), Math.abs(var22_11));
                    cfr_temp_2 = var17_12 - 4.9947976805055876E145;
                    v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    if (var6_5 == 0) ** GOTO lbl56
                    if (v2 < 0) ** GOTO lbl51
                    var19_13 = 0;
                    while (var17_12 >= 4.9947976805055876E145) {
                        ++var19_13;
                        v3 = fI.a(Math.abs(var20_10 *= 2.002083095183101E-146), Math.abs(var22_11 *= 2.002083095183101E-146));
                        if (var6_5 != 0) {
                            var17_12 = v3;
                            if (var6_5 != 0) continue;
                        }
                        break block10;
                    }
                    v3 = Math.sqrt(var20_10 * var20_10 + var22_11 * var22_11);
                }
                var24_9 = v3;
                var12_7 = var20_10 / var24_9;
                var14_8 = var22_11 / var24_9;
                var7_14 = var19_13;
                for (var16_15 = 1; var16_15 <= var19_13; var24_9 *= 4.9947976805055876E145, ++var16_15) {
                    block12: {
                        if (var6_5 != 0) {
                            if (var6_5 != 0) continue;
                        }
                        break block11;
lbl51:
                        // 2 sources

                        v4 = var17_12;
                        v5 = 2.002083095183101E-146;
                        if (var6_5 == 0) ** GOTO lbl77
                        cfr_temp_3 = v4 - v5;
                        v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
lbl56:
                        // 2 sources

                        if (v2 > 0) ** GOTO lbl75
                        var19_13 = 0;
                        while (var17_12 <= 2.002083095183101E-146) {
                            ++var19_13;
                            v6 = fI.a(Math.abs(var20_10 *= 4.9947976805055876E145), Math.abs(var22_11 *= 4.9947976805055876E145));
                            if (var6_5 != 0) {
                                var17_12 = v6;
                                if (var6_5 != 0) continue;
                            }
                            break block12;
                        }
                        v6 = Math.sqrt(var20_10 * var20_10 + var22_11 * var22_11);
                    }
                    var24_9 = v6;
                    var12_7 = var20_10 / var24_9;
                    var14_8 = var22_11 / var24_9;
                    var7_14 = var19_13;
                    for (var16_15 = 1; var16_15 <= var19_13; var24_9 *= 2.002083095183101E-146, ++var16_15) {
                        if (var6_5 != 0) {
                            if (var6_5 != 0) continue;
                        }
                        break block11;
lbl75:
                        // 2 sources

                        v4 = var20_10 * var20_10;
                        v5 = var22_11 * var22_11;
lbl77:
                        // 2 sources

                        var24_9 = Math.sqrt(v4 + v5);
                        var12_7 = var20_10 / var24_9;
                        var14_8 = var22_11 / var24_9;
                        break;
                    }
                    break;
                }
                v7 = Math.abs(var0);
                if (var6_5 == 0) return v7;
                if (v7 > Math.abs(var2_1)) {
                    v7 = var12_7;
                    if (var6_5 == 0) return v7;
                    if (v7 < 0.0) {
                        var12_7 = -var12_7;
                        var14_8 = -var14_8;
                        var24_9 = -var24_9;
                    }
                }
            }
            var4_2[0] = var14_8;
            var5_3[0] = var12_7;
        }
        v7 = var24_9;
        return v7;
    }

    public final void a(dA dA2) {
        block9: {
            block7: {
                int n2;
                block25: {
                    int n3;
                    int n4;
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    int n5;
                                    block20: {
                                        block18: {
                                            block19: {
                                                block17: {
                                                    int n6;
                                                    block16: {
                                                        block14: {
                                                            block15: {
                                                                block13: {
                                                                    int n7;
                                                                    block12: {
                                                                        block10: {
                                                                            block11: {
                                                                                block8: {
                                                                                    block5: {
                                                                                        block6: {
                                                                                            n2 = ae.f();
                                                                                            n4 = this.a;
                                                                                            if (n2 == 0) break block5;
                                                                                            if (n4 < 4) break block6;
                                                                                            n4 = this.e;
                                                                                            if (n2 == 0) break block5;
                                                                                            if (n4 >= 4) break block7;
                                                                                        }
                                                                                        dA2.v();
                                                                                        n4 = this.e;
                                                                                    }
                                                                                    if (n2 == 0) break block8;
                                                                                    if (n4 <= 0) break block9;
                                                                                    n4 = this.a;
                                                                                }
                                                                                if (n2 == 0) break block10;
                                                                                if (n4 <= 0) break block11;
                                                                                dA2.o = this.c[0][0];
                                                                                n4 = this.a;
                                                                                n7 = 1;
                                                                                if (n2 == 0) break block12;
                                                                                if (n4 <= n7) break block11;
                                                                                dA2.b = this.c[1][0];
                                                                                n4 = this.a;
                                                                                n7 = 2;
                                                                                if (n2 == 0) break block12;
                                                                                if (n4 <= n7) break block11;
                                                                                dA2.k = this.c[2][0];
                                                                                n4 = this.a;
                                                                                n7 = 3;
                                                                                if (n2 == 0) break block12;
                                                                                if (n4 > n7) {
                                                                                    dA2.a = this.c[3][0];
                                                                                }
                                                                            }
                                                                            n4 = this.e;
                                                                        }
                                                                        if (n2 == 0) break block13;
                                                                        n7 = 1;
                                                                    }
                                                                    if (n4 <= n7) break block9;
                                                                    n4 = this.a;
                                                                }
                                                                if (n2 == 0) break block14;
                                                                if (n4 <= 0) break block15;
                                                                dA2.f = this.c[0][1];
                                                                n4 = this.a;
                                                                n6 = 1;
                                                                if (n2 == 0) break block16;
                                                                if (n4 <= n6) break block15;
                                                                dA2.l = this.c[1][1];
                                                                n4 = this.a;
                                                                n6 = 2;
                                                                if (n2 == 0) break block16;
                                                                if (n4 <= n6) break block15;
                                                                dA2.i = this.c[2][1];
                                                                n4 = this.a;
                                                                n6 = 3;
                                                                if (n2 == 0) break block16;
                                                                if (n4 > n6) {
                                                                    dA2.j = this.c[3][1];
                                                                }
                                                            }
                                                            n4 = this.e;
                                                        }
                                                        if (n2 == 0) break block17;
                                                        n6 = 2;
                                                    }
                                                    if (n4 <= n6) break block9;
                                                    n4 = this.a;
                                                }
                                                if (n2 == 0) break block18;
                                                if (n4 <= 0) break block19;
                                                dA2.m = this.c[0][2];
                                                n4 = this.a;
                                                n5 = 1;
                                                if (n2 == 0) break block20;
                                                if (n4 <= n5) break block19;
                                                dA2.g = this.c[1][2];
                                                n4 = this.a;
                                                n5 = 2;
                                                if (n2 == 0) break block20;
                                                if (n4 <= n5) break block19;
                                                dA2.h = this.c[2][2];
                                                n4 = this.a;
                                                n5 = 3;
                                                if (n2 == 0) break block20;
                                                if (n4 > n5) {
                                                    dA2.n = this.c[3][2];
                                                }
                                            }
                                            n4 = this.e;
                                        }
                                        if (n2 == 0) break block21;
                                        n5 = 3;
                                    }
                                    if (n4 <= n5) break block9;
                                    n4 = this.a;
                                }
                                if (n2 == 0) break block22;
                                if (n4 <= 0) break block9;
                                dA2.p = this.c[0][3];
                                n4 = this.a;
                            }
                            n3 = 1;
                            if (n2 == 0) break block23;
                            if (n4 <= n3) break block9;
                            dA2.q = this.c[1][3];
                            n4 = this.a;
                            n3 = 2;
                        }
                        if (n2 == 0) break block24;
                        if (n4 <= n3) break block9;
                        dA2.e = this.c[2][3];
                        if (n2 == 0) break block25;
                        n4 = this.a;
                        n3 = 3;
                    }
                    if (n4 <= n3) break block9;
                    dA2.d = this.c[3][3];
                }
                if (n2 != 0) break block9;
            }
            dA2.o = this.c[0][0];
            dA2.f = this.c[0][1];
            dA2.m = this.c[0][2];
            dA2.p = this.c[0][3];
            dA2.b = this.c[1][0];
            dA2.l = this.c[1][1];
            dA2.g = this.c[1][2];
            dA2.q = this.c[1][3];
            dA2.k = this.c[2][0];
            dA2.i = this.c[2][1];
            dA2.h = this.c[2][2];
            dA2.e = this.c[2][3];
            dA2.a = this.c[3][0];
            dA2.j = this.c[3][1];
            dA2.n = this.c[3][2];
            dA2.d = this.c[3][3];
        }
    }

    private static void b(int n2, int n3, fI fI2, double[] arrd, double[] arrd2, fI fI3, fI fI4) {
        block2: {
            int n4 = ae.f();
            for (int i2 = 0; i2 < fI2.e; ++i2) {
                double d10 = fI2.c[n2][i2];
                fI2.c[n2][i2] = arrd[0] * d10 - arrd2[0] * fI2.c[n3][i2];
                fI2.c[n3][i2] = arrd2[0] * d10 + arrd[0] * fI2.c[n3][i2];
                if (n4 != 0) {
                    if (n4 != 0) continue;
                }
                break block2;
            }
            System.out.println("\nm=");
            fI.f(fI4);
            System.out.println("\nu=");
            fI.f(fI3);
            fI4.e(fI3, fI4);
            System.out.println("\nt*m=");
            fI.f(fI4);
        }
    }

    public final void a(int n2, double[] arrd) {
        int n3 = ae.g();
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.c[i2][n2] = arrd[i2];
            if (n3 == 0) continue;
        }
    }

    public final void a(fI fI2) {
        this.l(fI2);
    }

    public final void a(dU dU2) {
        int n2;
        int n3;
        block10: {
            int n4;
            block11: {
                block8: {
                    fI fI2;
                    block9: {
                        n3 = ae.f();
                        fI2 = this;
                        if (n3 == 0) break block8;
                        if (fI2.a < 4) break block9;
                        n4 = this.e;
                        if (n3 == 0) break block10;
                        if (n4 >= 4) break block11;
                    }
                    this.c = new double[4][4];
                    this.a = 4;
                    fI2 = this;
                }
                fI2.e = 4;
            }
            this.c[0][0] = dU2.l;
            this.c[0][1] = dU2.i;
            this.c[0][2] = dU2.g;
            this.c[0][3] = dU2.c;
            this.c[1][0] = dU2.a;
            this.c[1][1] = dU2.d;
            this.c[1][2] = dU2.f;
            this.c[1][3] = dU2.o;
            this.c[2][0] = dU2.e;
            this.c[2][1] = dU2.k;
            this.c[2][2] = dU2.m;
            this.c[2][3] = dU2.n;
            this.c[3][0] = dU2.q;
            this.c[3][1] = dU2.b;
            this.c[3][2] = dU2.j;
            this.c[3][3] = dU2.h;
            n4 = n2 = 4;
        }
        while (n2 < this.a) {
            block7: {
                for (int i2 = 4; i2 < this.e; ++i2) {
                    this.c[n2][i2] = 0.0;
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block7;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    private static void a(int n2, fI fI2, double[] arrd, double[] arrd2) {
        int n3 = ae.f();
        for (int i2 = 0; i2 < fI2.e; ++i2) {
            double d10 = fI2.c[n2][i2];
            fI2.c[n2][i2] = arrd[0] * d10 + arrd2[0] * fI2.c[n2 + 1][i2];
            fI2.c[n2 + 1][i2] = -arrd2[0] * d10 + arrd[0] * fI2.c[n2 + 1][i2];
            if (n3 != 0) continue;
        }
    }

    public final void h() {
        block12: {
            int n2;
            int n3;
            int n4;
            block10: {
                int n5;
                block11: {
                    block7: {
                        n4 = ae.f();
                        n5 = this.a;
                        if (n4 == 0) break block10;
                        if (n5 == this.e) break block11;
                        n3 = this.a;
                        this.a = this.e;
                        this.e = n3;
                        double[][] arrd = new double[this.a][this.e];
                        n3 = 0;
                        while (n3 < this.a) {
                            block8: {
                                if (n4 == 0) break block7;
                                for (n2 = 0; n2 < this.e; ++n2) {
                                    arrd[n3][n2] = this.c[n2][n3];
                                    if (n4 != 0) {
                                        if (n4 != 0) continue;
                                    }
                                    break block8;
                                }
                                ++n3;
                            }
                            if (n4 != 0) continue;
                        }
                        this.c = arrd;
                    }
                    if (n4 != 0) break block12;
                }
                n5 = n3 = 0;
            }
            while (n3 < this.a) {
                block9: {
                    for (n2 = 0; n2 < n3; ++n2) {
                        double d10 = this.c[n3][n2];
                        this.c[n3][n2] = this.c[n2][n3];
                        this.c[n2][n3] = d10;
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                        }
                        break block9;
                    }
                    ++n3;
                }
                if (n4 != 0) continue;
            }
        }
    }

    public final void f(fI fI2, fI fI3) {
        int n2;
        int n3;
        block14: {
            int n4;
            block15: {
                block13: {
                    int n5;
                    block12: {
                        n3 = ae.g();
                        n4 = fI3.a;
                        n5 = fI2.a;
                        if (n3 == 0) {
                            if (n4 != n5) {
                                throw new gX(cK.a("GMatrix10"));
                            }
                            n4 = fI3.e;
                            n5 = fI2.e;
                        }
                        if (n3 == 0) {
                            if (n4 != n5) {
                                throw new gX(cK.a("GMatrix11"));
                            }
                            n4 = this.a;
                            n5 = fI2.a;
                        }
                        if (n3 != 0) break block12;
                        if (n4 != n5) break block13;
                        n4 = this.e;
                        if (n3 != 0) break block14;
                        n5 = fI2.e;
                    }
                    if (n4 == n5) break block15;
                }
                throw new gX(cK.a("GMatrix12"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.a) {
            block11: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = fI2.c[n2][i2] - fI3.c[n2][i2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block11;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    static int a(double d10, double d11, double d12, double[] arrd, double[] arrd2, double[] arrd3, double[] arrd4, double[] arrd5, int n2) {
        block37: {
            int n3;
            int n4;
            double d13;
            double d14;
            double d15;
            double d16;
            block68: {
                double d17;
                double d18;
                double d19;
                double d20;
                block67: {
                    double d21;
                    block43: {
                        double d22;
                        block44: {
                            double d23;
                            double d24;
                            double d25;
                            double d26;
                            double d27;
                            double d28;
                            block66: {
                                double d29;
                                double d30;
                                block62: {
                                    double d31;
                                    double d32;
                                    block63: {
                                        double d33;
                                        double d34;
                                        block64: {
                                            double d35;
                                            double d36;
                                            block65: {
                                                double d37;
                                                double d38;
                                                double d39;
                                                double d40;
                                                block61: {
                                                    double d41;
                                                    double d42;
                                                    block59: {
                                                        block60: {
                                                            double d43;
                                                            block58: {
                                                                double d44;
                                                                double d45;
                                                                block56: {
                                                                    block57: {
                                                                        block51: {
                                                                            double d46;
                                                                            block52: {
                                                                                block55: {
                                                                                    double d47;
                                                                                    double d48;
                                                                                    block53: {
                                                                                        double d49;
                                                                                        block54: {
                                                                                            block50: {
                                                                                                double d50;
                                                                                                double d51;
                                                                                                block48: {
                                                                                                    block49: {
                                                                                                        block47: {
                                                                                                            double d52;
                                                                                                            double d53;
                                                                                                            block45: {
                                                                                                                block46: {
                                                                                                                    block38: {
                                                                                                                        block39: {
                                                                                                                            block42: {
                                                                                                                                double d54;
                                                                                                                                double d55;
                                                                                                                                block40: {
                                                                                                                                    block41: {
                                                                                                                                        double d56;
                                                                                                                                        block35: {
                                                                                                                                            block36: {
                                                                                                                                                block34: {
                                                                                                                                                    double d57;
                                                                                                                                                    block33: {
                                                                                                                                                        d40 = 2.0;
                                                                                                                                                        d16 = 1.0;
                                                                                                                                                        d15 = arrd[0];
                                                                                                                                                        d14 = arrd[1];
                                                                                                                                                        d20 = 0.0;
                                                                                                                                                        d19 = 0.0;
                                                                                                                                                        d18 = 0.0;
                                                                                                                                                        d17 = 0.0;
                                                                                                                                                        d13 = 0.0;
                                                                                                                                                        d28 = d10;
                                                                                                                                                        n4 = ae.g();
                                                                                                                                                        d39 = Math.abs(d28);
                                                                                                                                                        d27 = d12;
                                                                                                                                                        d38 = Math.abs(d12);
                                                                                                                                                        n3 = 1;
                                                                                                                                                        double d58 = d38 == d39 ? 0 : (d38 > d39 ? 1 : -1);
                                                                                                                                                        if (n4 == 0) {
                                                                                                                                                            d58 = d58 > 0 ? 1.0 : 0.0;
                                                                                                                                                        }
                                                                                                                                                        d57 = d22 = d58;
                                                                                                                                                        if (n4 != 0) break block33;
                                                                                                                                                        if (d57 == false) break block34;
                                                                                                                                                        d57 = 3;
                                                                                                                                                    }
                                                                                                                                                    n3 = d57;
                                                                                                                                                    double d59 = d28;
                                                                                                                                                    d28 = d27;
                                                                                                                                                    d27 = d59;
                                                                                                                                                    d59 = d39;
                                                                                                                                                    d39 = d38;
                                                                                                                                                    d38 = d59;
                                                                                                                                                }
                                                                                                                                                d36 = d11;
                                                                                                                                                d49 = Math.abs(d36);
                                                                                                                                                double d60 = d49 - 0.0;
                                                                                                                                                d56 = d60 == 0.0 ? 0 : (d60 > 0.0 ? 1 : -1);
                                                                                                                                                if (n4 != 0) break block35;
                                                                                                                                                if (d56 != false) break block36;
                                                                                                                                                arrd[1] = d38;
                                                                                                                                                arrd[0] = d39;
                                                                                                                                                d20 = 1.0;
                                                                                                                                                d19 = 1.0;
                                                                                                                                                d18 = 0.0;
                                                                                                                                                d17 = 0.0;
                                                                                                                                                if (n4 == 0) break block37;
                                                                                                                                            }
                                                                                                                                            d56 = 1.0;
                                                                                                                                        }
                                                                                                                                        d46 = d56;
                                                                                                                                        d21 = d49 == d39 ? 0 : (d49 > d39 ? 1 : -1);
                                                                                                                                        if (n4 != 0) break block38;
                                                                                                                                        if (d21 <= 0) break block39;
                                                                                                                                        n3 = 2;
                                                                                                                                        double d61 = d39 / d49 - 1.0E-10;
                                                                                                                                        d21 = d61 == 0.0 ? 0 : (d61 < 0.0 ? -1 : 1);
                                                                                                                                        if (n4 != 0) break block38;
                                                                                                                                        if (d21 >= 0) break block39;
                                                                                                                                        d46 = 0.0;
                                                                                                                                        d15 = d49;
                                                                                                                                        d55 = d38;
                                                                                                                                        d54 = 1.0;
                                                                                                                                        if (n4 != 0) break block40;
                                                                                                                                        if (!(d55 > d54)) break block41;
                                                                                                                                        d14 = d39 / (d49 / d38);
                                                                                                                                        if (n4 == 0) break block42;
                                                                                                                                    }
                                                                                                                                    d55 = d39 / d49;
                                                                                                                                    d54 = d38;
                                                                                                                                }
                                                                                                                                d14 = d55 * d54;
                                                                                                                            }
                                                                                                                            d20 = 1.0;
                                                                                                                            d18 = d27 / d36;
                                                                                                                            d17 = 1.0;
                                                                                                                            d19 = d28 / d36;
                                                                                                                        }
                                                                                                                        d21 = d46;
                                                                                                                    }
                                                                                                                    if (n4 != 0) break block43;
                                                                                                                    if (d21 == false) break block44;
                                                                                                                    d53 = d35 = d39 - d38;
                                                                                                                    d52 = d39;
                                                                                                                    if (n4 != 0) break block45;
                                                                                                                    if (d53 != d52) break block46;
                                                                                                                    d26 = 1.0;
                                                                                                                    if (n4 == 0) break block47;
                                                                                                                }
                                                                                                                d53 = d35;
                                                                                                                d52 = d39;
                                                                                                            }
                                                                                                            d26 = d53 / d52;
                                                                                                        }
                                                                                                        d25 = d36 / d28;
                                                                                                        d24 = 2.0 - d26;
                                                                                                        d37 = d25 * d25;
                                                                                                        d43 = d24 * d24;
                                                                                                        d32 = Math.sqrt(d43 + d37);
                                                                                                        d51 = d26;
                                                                                                        d50 = 0.0;
                                                                                                        if (n4 != 0) break block48;
                                                                                                        if (d51 != d50) break block49;
                                                                                                        d31 = Math.abs(d25);
                                                                                                        if (n4 == 0) break block50;
                                                                                                    }
                                                                                                    d51 = d26 * d26;
                                                                                                    d50 = d37;
                                                                                                }
                                                                                                d31 = Math.sqrt(d51 + d50);
                                                                                            }
                                                                                            d23 = (d32 + d31) * 0.5;
                                                                                            d21 = d49 == d39 ? 0 : (d49 > d39 ? 1 : -1);
                                                                                            if (n4 != 0) break block51;
                                                                                            if (d21 <= 0) break block52;
                                                                                            n3 = 2;
                                                                                            double d62 = d39 / d49 - 1.0E-10;
                                                                                            d21 = d62 == 0.0 ? 0 : (d62 < 0.0 ? -1 : 1);
                                                                                            if (n4 != 0) break block51;
                                                                                            if (d21 >= 0) break block52;
                                                                                            d46 = 0.0;
                                                                                            d15 = d49;
                                                                                            d48 = d38;
                                                                                            d47 = 1.0;
                                                                                            if (n4 != 0) break block53;
                                                                                            if (!(d48 > d47)) break block54;
                                                                                            d14 = d39 / (d49 / d38);
                                                                                            if (n4 == 0) break block55;
                                                                                        }
                                                                                        d48 = d39 / d49;
                                                                                        d47 = d38;
                                                                                    }
                                                                                    d14 = d48 * d47;
                                                                                }
                                                                                d20 = 1.0;
                                                                                d18 = d27 / d36;
                                                                                d17 = 1.0;
                                                                                d19 = d28 / d36;
                                                                            }
                                                                            d21 = d46;
                                                                        }
                                                                        if (n4 != 0) break block43;
                                                                        if (d21 == false) break block44;
                                                                        d45 = d35 = d39 - d38;
                                                                        d44 = d39;
                                                                        if (n4 != 0) break block56;
                                                                        if (d45 != d44) break block57;
                                                                        d26 = 1.0;
                                                                        if (n4 == 0) break block58;
                                                                    }
                                                                    d45 = d35;
                                                                    d44 = d39;
                                                                }
                                                                d26 = d45 / d44;
                                                            }
                                                            d25 = d36 / d28;
                                                            d24 = 2.0 - d26;
                                                            d37 = d25 * d25;
                                                            d43 = d24 * d24;
                                                            d32 = Math.sqrt(d43 + d37);
                                                            d42 = d26;
                                                            d41 = 0.0;
                                                            if (n4 != 0) break block59;
                                                            if (d42 != d41) break block60;
                                                            d31 = Math.abs(d25);
                                                            if (n4 == 0) break block61;
                                                        }
                                                        d42 = d26 * d26;
                                                        d41 = d37;
                                                    }
                                                    d31 = Math.sqrt(d42 + d41);
                                                }
                                                d23 = (d32 + d31) * 0.5;
                                                d14 = d38 / d23;
                                                d15 = d39 * d23;
                                                d30 = d37;
                                                d29 = 0.0;
                                                if (n4 != 0) break block62;
                                                if (d30 != d29) break block63;
                                                d34 = d26;
                                                d33 = 0.0;
                                                if (n4 != 0) break block64;
                                                if (d34 != d33) break block65;
                                                d24 = fI.b(d40, d28) * fI.b(d16, d36);
                                                if (n4 == 0) break block66;
                                            }
                                            d34 = d36 / fI.b(d35, d28);
                                            d33 = d25 / d24;
                                        }
                                        d24 = d34 + d33;
                                        if (n4 == 0) break block66;
                                    }
                                    d30 = d25 / (d32 + d24) + d25 / (d31 + d26);
                                    d29 = d23 + 1.0;
                                }
                                d24 = d30 * d29;
                            }
                            d26 = Math.sqrt(d24 * d24 + 4.0);
                            d19 = 2.0 / d26;
                            d17 = d24 / d26;
                            d20 = (d19 + d17 * d25) / d23;
                            d18 = d27 / d28 * d17 / d23;
                        }
                        d21 = d22;
                    }
                    if (d21 == false) break block67;
                    arrd3[0] = d17;
                    arrd2[0] = d19;
                    arrd5[0] = d18;
                    arrd4[0] = d20;
                    if (n4 == 0) break block68;
                }
                arrd3[0] = d20;
                arrd2[0] = d18;
                arrd5[0] = d19;
                arrd4[0] = d17;
            }
            int n5 = n3;
            int n6 = 1;
            if (n4 == 0) {
                if (n5 == n6) {
                    d13 = fI.b(d16, arrd5[0]) * fI.b(d16, arrd3[0]) * fI.b(d16, d10);
                }
                n5 = n3;
                n6 = 2;
            }
            if (n4 == 0) {
                if (n5 == n6) {
                    d13 = fI.b(d16, arrd4[0]) * fI.b(d16, arrd3[0]) * fI.b(d16, d11);
                }
                n5 = n3;
                n6 = 3;
            }
            if (n5 == n6) {
                d13 = fI.b(d16, arrd4[0]) * fI.b(d16, arrd2[0]) * fI.b(d16, d12);
            }
            arrd[n2] = fI.b(d15, d13);
            double d63 = d13 * fI.b(d16, d10) * fI.b(d16, d12);
            arrd[n2 + 1] = fI.b(d14, d63);
        }
        return 0;
    }

    public fI(int n2, int n3, double[] arrd) {
        this.c = new double[n2][n3];
        this.a = n2;
        int n4 = ae.f();
        this.e = n3;
        int n5 = 0;
        while (n5 < n2) {
            block3: {
                for (int i2 = 0; i2 < n3; ++i2) {
                    this.c[n5][i2] = arrd[n5 * n3 + i2];
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                    }
                    break block3;
                }
                ++n5;
            }
            if (n4 != 0) continue;
        }
    }

    private static void b(double[] arrd, double[] arrd2, int n2, fI fI2) {
        block2: {
            int n3;
            double[] arrd3 = new double[1];
            int n4 = ae.g();
            double[] arrd4 = new double[1];
            fI fI3 = new fI(fI2.a, fI2.e);
            fI fI4 = new fI(fI2.a, fI2.e);
            double d10 = arrd2[n2];
            double d11 = arrd[n2 + 1];
            for (n3 = n2; n3 < fI2.e - 2; ++n3) {
                double d12 = fI.a(d11, d10, arrd4, arrd3);
                d10 = -arrd2[n3 + 1] * arrd4[0];
                d11 = arrd[n3 + 2];
                arrd[n3 + 1] = d12;
                arrd2[n3 + 1] = arrd2[n3 + 1] * arrd3[0];
                fI.b(n2, n3 + 1, fI2, arrd3, arrd4, fI3, fI4);
                if (n4 == 0) {
                    if (n4 == 0) continue;
                }
                break block2;
            }
            arrd[n3 + 1] = fI.a(d11, d10, arrd4, arrd3);
            fI.b(n2, n3 + 1, fI2, arrd3, arrd4, fI3, fI4);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static int a(fI var0, fI var1_1, fI var2_2, fI var3_3) {
        block109: {
            block82: {
                block115: {
                    block113: {
                        block114: {
                            block112: {
                                block110: {
                                    block111: {
                                        var28_4 = new fI(var0.a, var0.e);
                                        var4_5 = ae.f();
                                        var29_6 = new fI(var0.a, var0.e);
                                        var30_7 = new fI(var0.a, var0.e);
                                        var31_8 = new fI(var0);
                                        v0 = var31_8.a;
                                        if (var4_5 == 0) break block110;
                                        if (v0 < var31_8.e) break block111;
                                        var26_9 = var31_8.e;
                                        var25_10 = var31_8.e - 1;
                                        if (var4_5 != 0) break block112;
                                    }
                                    v0 = var31_8.a;
                                }
                                var26_9 = v0;
                                var25_10 = var31_8.a;
                            }
                            v1 = var31_8.a;
                            if (var4_5 == 0) break block113;
                            if (v1 <= var31_8.e) break block114;
                            var27_11 = var31_8.a;
                            if (var4_5 != 0) break block115;
                        }
                        v1 = var31_8.e;
                    }
                    var27_11 = v1;
                }
                var32_12 = new double[var27_11];
                var33_13 = new double[var26_9];
                var34_14 = new double[var25_10];
                var12_15 = 0;
                var1_1.b();
                var3_3.b();
                var8_16 = var31_8.a;
                var9_17 = var31_8.e;
                var10_18 = 0;
                block0: while (true) {
                    v2 = var10_18;
                    block1: while (v2 < var26_9) {
                        block120: {
                            block106: {
                                block104: {
                                    block102: {
                                        block101: {
                                            block99: {
                                                block98: {
                                                    block123: {
                                                        block121: {
                                                            block122: {
                                                                block97: {
                                                                    block116: {
                                                                        block95: {
                                                                            block84: {
                                                                                block93: {
                                                                                    block91: {
                                                                                        block89: {
                                                                                            block88: {
                                                                                                block86: {
                                                                                                    block85: {
                                                                                                        block119: {
                                                                                                            block117: {
                                                                                                                block118: {
                                                                                                                    block83: {
                                                                                                                        v3 = var8_16;
                                                                                                                        if (var4_5 == 0) break block82;
                                                                                                                        v4 = 1;
                                                                                                                        if (var4_5 == 0) break block116;
                                                                                                                        if (v3 <= v4) break block84;
                                                                                                                        var19_22 = 0.0;
                                                                                                                        for (var5_19 = 0; var5_19 < var8_16; var19_22 += var31_8.c[var5_19 + var10_18][var10_18] * var31_8.c[var5_19 + var10_18][var10_18], ++var5_19) {
                                                                                                                            if (var4_5 != 0) {
                                                                                                                                if (var4_5 != 0) continue;
                                                                                                                            }
                                                                                                                            break block83;
                                                                                                                        }
                                                                                                                        var19_22 = Math.sqrt(var19_22);
                                                                                                                    }
                                                                                                                    v5 = var31_8.c[var10_18];
                                                                                                                    v6 = var10_18;
                                                                                                                    if (var4_5 == 0) break block117;
                                                                                                                    if (v5[v6] != 0.0) break block118;
                                                                                                                    var32_12[0] = var19_22;
                                                                                                                    if (var4_5 != 0) break block119;
                                                                                                                }
                                                                                                                v5 = var32_12;
                                                                                                                v6 = 0;
                                                                                                            }
                                                                                                            v5[v6] = var31_8.c[var10_18][var10_18] + fI.b(var19_22, var31_8.c[var10_18][var10_18]);
                                                                                                        }
                                                                                                        for (var5_19 = 1; var5_19 < var8_16; ++var5_19) {
                                                                                                            var32_12[var5_19] = var31_8.c[var10_18 + var5_19][var10_18];
                                                                                                            if (var4_5 != 0) {
                                                                                                                if (var4_5 != 0) continue;
                                                                                                            }
                                                                                                            break block84;
                                                                                                        }
                                                                                                        var21_23 = 0.0;
                                                                                                        for (var5_19 = 0; var5_19 < var8_16; var21_23 += var32_12[var5_19] * var32_12[var5_19], ++var5_19) {
                                                                                                            if (var4_5 != 0) {
                                                                                                                if (var4_5 != 0) continue;
                                                                                                            }
                                                                                                            break block85;
                                                                                                        }
                                                                                                        var21_23 = 2.0 / var21_23;
                                                                                                    }
                                                                                                    var6_20 = var10_18;
                                                                                                    while (var6_20 < var31_8.a) {
                                                                                                        block87: {
                                                                                                            v7 = var10_18;
                                                                                                            if (var4_5 == 0) break block86;
                                                                                                            for (var7_21 = v1166008; var7_21 < var31_8.a; ++var7_21) {
                                                                                                                var29_6.c[var6_20][var7_21] = -var21_23 * var32_12[var6_20 - var10_18] * var32_12[var7_21 - var10_18];
                                                                                                                if (var4_5 != 0) {
                                                                                                                    if (var4_5 != 0) continue;
                                                                                                                }
                                                                                                                break block87;
                                                                                                            }
                                                                                                            ++var6_20;
                                                                                                        }
                                                                                                        if (var4_5 != 0) continue;
                                                                                                    }
                                                                                                    v7 = var5_19 = var10_18;
                                                                                                }
                                                                                                while (var5_19 < var31_8.a) {
                                                                                                    v8 = var29_6.c[var5_19];
                                                                                                    v9 = var5_19++;
                                                                                                    v8[v9] = v8[v9] + 1.0;
                                                                                                    if (var4_5 != 0) {
                                                                                                        if (var4_5 != 0) continue;
                                                                                                    }
                                                                                                    break block84;
                                                                                                }
                                                                                                var23_24 = 0.0;
                                                                                                for (var5_19 = var10_18; var5_19 < var31_8.a; var23_24 += var29_6.c[var10_18][var5_19] * var31_8.c[var5_19][var10_18], ++var5_19) {
                                                                                                    if (var4_5 != 0) {
                                                                                                        if (var4_5 != 0) continue;
                                                                                                    }
                                                                                                    break block88;
                                                                                                }
                                                                                                var31_8.c[var10_18][var10_18] = var23_24;
                                                                                            }
                                                                                            var6_20 = var10_18;
                                                                                            block9: while (true) {
                                                                                                v10 = var6_20;
                                                                                                block10: while (v10 < var31_8.a) {
                                                                                                    v11 = var10_18 + 1;
                                                                                                    if (var4_5 == 0) break block89;
                                                                                                    var7_21 = v11;
                                                                                                    while (var7_21 < var31_8.e) {
                                                                                                        block90: {
                                                                                                            var28_4.c[var6_20][var7_21] = 0.0;
                                                                                                            v10 = var10_18;
                                                                                                            if (var4_5 == 0) continue block10;
                                                                                                            for (var5_19 = v1166055; var5_19 < var31_8.e; ++var5_19) {
                                                                                                                v12 = var28_4.c[var6_20];
                                                                                                                v13 = var7_21;
                                                                                                                v12[v13] = v12[v13] + var29_6.c[var6_20][var5_19] * var31_8.c[var5_19][var7_21];
                                                                                                                if (var4_5 != 0) {
                                                                                                                    if (var4_5 != 0) continue;
                                                                                                                }
                                                                                                                break block90;
                                                                                                            }
                                                                                                            ++var7_21;
                                                                                                        }
                                                                                                        if (var4_5 != 0) continue;
                                                                                                    }
                                                                                                    ++var6_20;
                                                                                                    if (var4_5 != 0) continue block9;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            v11 = var6_20 = var10_18;
                                                                                        }
                                                                                        while (var6_20 < var31_8.a) {
                                                                                            block92: {
                                                                                                v14 = var10_18 + 1;
                                                                                                if (var4_5 == 0) break block91;
                                                                                                for (var7_21 = v1166129; var7_21 < var31_8.e; ++var7_21) {
                                                                                                    var31_8.c[var6_20][var7_21] = var28_4.c[var6_20][var7_21];
                                                                                                    if (var4_5 != 0) {
                                                                                                        if (var4_5 != 0) continue;
                                                                                                    }
                                                                                                    break block92;
                                                                                                }
                                                                                                ++var6_20;
                                                                                            }
                                                                                            if (var4_5 != 0) continue;
                                                                                        }
                                                                                        v14 = var10_18;
                                                                                    }
                                                                                    var6_20 = v14;
                                                                                    block15: while (true) {
                                                                                        v15 = var6_20;
                                                                                        block16: while (v15 < var31_8.a) {
                                                                                            v16 = 0;
                                                                                            if (var4_5 == 0) break block93;
                                                                                            var7_21 = v16;
                                                                                            while (var7_21 < var31_8.e) {
                                                                                                block94: {
                                                                                                    var28_4.c[var6_20][var7_21] = 0.0;
                                                                                                    v15 = var10_18;
                                                                                                    if (var4_5 == 0) continue block16;
                                                                                                    for (var5_19 = v1166130; var5_19 < var31_8.e; ++var5_19) {
                                                                                                        v17 = var28_4.c[var6_20];
                                                                                                        v18 = var7_21;
                                                                                                        v17[v18] = v17[v18] + var29_6.c[var6_20][var5_19] * var1_1.c[var5_19][var7_21];
                                                                                                        if (var4_5 != 0) {
                                                                                                            if (var4_5 != 0) continue;
                                                                                                        }
                                                                                                        break block94;
                                                                                                    }
                                                                                                    ++var7_21;
                                                                                                }
                                                                                                if (var4_5 != 0) continue;
                                                                                            }
                                                                                            ++var6_20;
                                                                                            if (var4_5 != 0) continue block15;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    v16 = var6_20 = var10_18;
                                                                                }
                                                                                while (var6_20 < var31_8.a) {
                                                                                    block96: {
                                                                                        v19 = 0;
                                                                                        if (var4_5 == 0) break block95;
                                                                                        for (var7_21 = v1166200; var7_21 < var31_8.e; ++var7_21) {
                                                                                            var1_1.c[var6_20][var7_21] = var28_4.c[var6_20][var7_21];
                                                                                            if (var4_5 != 0) {
                                                                                                if (var4_5 != 0) continue;
                                                                                            }
                                                                                            break block96;
                                                                                        }
                                                                                        ++var6_20;
                                                                                    }
                                                                                    if (var4_5 != 0) continue;
                                                                                }
                                                                                --var8_16;
                                                                            }
                                                                            v19 = var9_17;
                                                                        }
                                                                        v4 = 2;
                                                                    }
                                                                    if (v19 <= v4) break block120;
                                                                    var19_22 = 0.0;
                                                                    for (var5_19 = 1; var5_19 < var9_17; var19_22 += var31_8.c[var10_18][var10_18 + var5_19] * var31_8.c[var10_18][var10_18 + var5_19], ++var5_19) {
                                                                        if (var4_5 != 0) {
                                                                            if (var4_5 != 0) continue;
                                                                        }
                                                                        break block97;
                                                                    }
                                                                    var19_22 = Math.sqrt(var19_22);
                                                                }
                                                                v20 = var31_8.c[var10_18];
                                                                v21 = var10_18 + 1;
                                                                if (var4_5 == 0) break block121;
                                                                if (v20[v21] != 0.0) break block122;
                                                                var32_12[0] = var19_22;
                                                                if (var4_5 != 0) break block123;
                                                            }
                                                            v20 = var32_12;
                                                            v21 = 0;
                                                        }
                                                        v20[v21] = var31_8.c[var10_18][var10_18 + 1] + fI.b(var19_22, var31_8.c[var10_18][var10_18 + 1]);
                                                    }
                                                    for (var5_19 = 1; var5_19 < var9_17 - 1; ++var5_19) {
                                                        var32_12[var5_19] = var31_8.c[var10_18][var10_18 + var5_19 + 1];
                                                        if (var4_5 == 0) continue block0;
                                                        if (var4_5 != 0) continue;
                                                    }
                                                    var21_23 = 0.0;
                                                    for (var5_19 = 0; var5_19 < var9_17 - 1; var21_23 += var32_12[var5_19] * var32_12[var5_19], ++var5_19) {
                                                        if (var4_5 != 0) {
                                                            if (var4_5 != 0) continue;
                                                        }
                                                        break block98;
                                                    }
                                                    var21_23 = 2.0 / var21_23;
                                                }
                                                var6_20 = var10_18 + 1;
                                                while (var6_20 < var9_17) {
                                                    block100: {
                                                        v22 = var10_18 + 1;
                                                        if (var4_5 == 0) break block99;
                                                        for (var7_21 = v1166344; var7_21 < var31_8.e; ++var7_21) {
                                                            var30_7.c[var6_20][var7_21] = -var21_23 * var32_12[var6_20 - var10_18 - 1] * var32_12[var7_21 - var10_18 - 1];
                                                            if (var4_5 != 0) {
                                                                if (var4_5 != 0) continue;
                                                            }
                                                            break block100;
                                                        }
                                                        ++var6_20;
                                                    }
                                                    if (var4_5 != 0) continue;
                                                }
                                                v22 = var5_19 = var10_18 + 1;
                                            }
                                            while (var5_19 < var31_8.e) {
                                                v23 = var30_7.c[var5_19];
                                                v24 = var5_19++;
                                                v23[v24] = v23[v24] + 1.0;
                                                if (var4_5 == 0) continue block0;
                                                if (var4_5 != 0) continue;
                                            }
                                            var23_24 = 0.0;
                                            for (var5_19 = var10_18; var5_19 < var31_8.e; var23_24 += var30_7.c[var5_19][var10_18 + 1] * var31_8.c[var10_18][var5_19], ++var5_19) {
                                                if (var4_5 != 0) {
                                                    if (var4_5 != 0) continue;
                                                }
                                                break block101;
                                            }
                                            var31_8.c[var10_18][var10_18 + 1] = var23_24;
                                        }
                                        var6_20 = var10_18 + 1;
                                        block28: while (true) {
                                            v25 = var6_20;
                                            block29: while (v25 < var31_8.a) {
                                                v26 = var10_18 + 1;
                                                if (var4_5 == 0) break block102;
                                                var7_21 = v26;
                                                while (var7_21 < var31_8.e) {
                                                    block103: {
                                                        var28_4.c[var6_20][var7_21] = 0.0;
                                                        v25 = var10_18 + 1;
                                                        if (var4_5 == 0) continue block29;
                                                        for (var5_19 = v1166397; var5_19 < var31_8.e; ++var5_19) {
                                                            v27 = var28_4.c[var6_20];
                                                            v28 = var7_21;
                                                            v27[v28] = v27[v28] + var30_7.c[var5_19][var7_21] * var31_8.c[var6_20][var5_19];
                                                            if (var4_5 != 0) {
                                                                if (var4_5 != 0) continue;
                                                            }
                                                            break block103;
                                                        }
                                                        ++var7_21;
                                                    }
                                                    if (var4_5 != 0) continue;
                                                }
                                                ++var6_20;
                                                if (var4_5 != 0) continue block28;
                                            }
                                            break;
                                        }
                                        v26 = var6_20 = var10_18 + 1;
                                    }
                                    while (var6_20 < var31_8.a) {
                                        block105: {
                                            v29 = var10_18 + 1;
                                            if (var4_5 == 0) break block104;
                                            for (var7_21 = v1166475; var7_21 < var31_8.e; ++var7_21) {
                                                var31_8.c[var6_20][var7_21] = var28_4.c[var6_20][var7_21];
                                                if (var4_5 != 0) {
                                                    if (var4_5 != 0) continue;
                                                }
                                                break block105;
                                            }
                                            ++var6_20;
                                        }
                                        if (var4_5 != 0) continue;
                                    }
                                    v29 = 0;
                                }
                                var6_20 = v29;
                                block34: while (true) {
                                    v30 = var6_20;
                                    block35: while (v30 < var31_8.a) {
                                        v31 = var10_18 + 1;
                                        if (var4_5 == 0) break block106;
                                        var7_21 = v31;
                                        while (var7_21 < var31_8.e) {
                                            block107: {
                                                var28_4.c[var6_20][var7_21] = 0.0;
                                                v30 = var10_18 + 1;
                                                if (var4_5 == 0) continue block35;
                                                for (var5_19 = v1166476; var5_19 < var31_8.e; ++var5_19) {
                                                    v32 = var28_4.c[var6_20];
                                                    v33 = var7_21;
                                                    v32[v33] = v32[v33] + var30_7.c[var5_19][var7_21] * var3_3.c[var6_20][var5_19];
                                                    if (var4_5 != 0) {
                                                        if (var4_5 != 0) continue;
                                                    }
                                                    break block107;
                                                }
                                                ++var7_21;
                                            }
                                            if (var4_5 != 0) continue;
                                        }
                                        ++var6_20;
                                        if (var4_5 != 0) continue block34;
                                    }
                                    break;
                                }
                                v31 = var6_20 = 0;
                            }
                            while (var6_20 < var31_8.a) {
                                block108: {
                                    v2 = var10_18 + 1;
                                    if (var4_5 == 0) continue block1;
                                    for (var7_21 = v1165881; var7_21 < var31_8.e; ++var7_21) {
                                        var3_3.c[var6_20][var7_21] = var28_4.c[var6_20][var7_21];
                                        if (var4_5 != 0) {
                                            if (var4_5 != 0) continue;
                                        }
                                        break block108;
                                    }
                                    ++var6_20;
                                }
                                if (var4_5 != 0) continue;
                            }
                            --var9_17;
                        }
                        ++var10_18;
                        if (var4_5 != 0) continue block0;
                    }
                    break;
                }
                v3 = var5_19 = 0;
            }
            while (var5_19 < var26_9) {
                var33_13[var5_19] = var31_8.c[var5_19][var5_19];
                ++var5_19;
                if (var4_5 != 0) {
                    if (var4_5 != 0) continue;
                }
                break block109;
            }
            var5_19 = 0;
        }
        while (var5_19 < var25_10) {
            var34_14[var5_19] = var31_8.c[var5_19][var5_19 + 1];
            ++var5_19;
            if (var4_5 == 0) return var12_15;
            if (var4_5 != 0) continue;
        }
        v34 = var31_8.a;
        v35 = 2;
        if (var4_5 != 0) {
            if (v34 == v35) {
                v34 = var31_8.e;
                v35 = 2;
                if (var4_5 != 0) {
                    if (v34 == v35) {
                        var35_25 = new double[1];
                        var36_26 = new double[1];
                        var37_27 = new double[1];
                        var38_28 = new double[1];
                        fI.a(var33_13[0], var34_14[0], var33_13[1], var33_13, var37_27, var35_25, var38_28, var36_26, 0);
                        fI.a(0, var1_1, var35_25, var37_27);
                        fI.b(0, var3_3, var36_26, var38_28);
                        return 2;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v34 = 0;
                v35 = var34_14.length - 1;
            }
        }
        fI.a(v34, v35, var33_13, var34_14, var1_1, var3_3);
        return var33_13.length;
    }

    public Object clone() {
        fI fI2 = null;
        int n2 = ae.g();
        try {
            fI2 = (fI)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        fI2.c = new double[this.a][this.e];
        int n3 = 0;
        while (n3 < this.a) {
            block5: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    fI2.c[n3][i2] = this.c[n3][i2];
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                    }
                    break block5;
                }
                ++n3;
            }
            if (n2 == 0) continue;
        }
        return fI2;
    }

    public final void b(dU dU2) {
        block9: {
            block7: {
                int n2;
                block25: {
                    int n3;
                    int n4;
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    int n5;
                                    block20: {
                                        block18: {
                                            block19: {
                                                block17: {
                                                    int n6;
                                                    block16: {
                                                        block14: {
                                                            block15: {
                                                                block13: {
                                                                    int n7;
                                                                    block12: {
                                                                        block10: {
                                                                            block11: {
                                                                                block8: {
                                                                                    block5: {
                                                                                        block6: {
                                                                                            n2 = ae.g();
                                                                                            n4 = this.a;
                                                                                            if (n2 != 0) break block5;
                                                                                            if (n4 < 4) break block6;
                                                                                            n4 = this.e;
                                                                                            if (n2 != 0) break block5;
                                                                                            if (n4 >= 4) break block7;
                                                                                        }
                                                                                        dU2.a();
                                                                                        n4 = this.e;
                                                                                    }
                                                                                    if (n2 != 0) break block8;
                                                                                    if (n4 <= 0) break block9;
                                                                                    n4 = this.a;
                                                                                }
                                                                                if (n2 != 0) break block10;
                                                                                if (n4 <= 0) break block11;
                                                                                dU2.l = (float)this.c[0][0];
                                                                                n4 = this.a;
                                                                                n7 = 1;
                                                                                if (n2 != 0) break block12;
                                                                                if (n4 <= n7) break block11;
                                                                                dU2.a = (float)this.c[1][0];
                                                                                n4 = this.a;
                                                                                n7 = 2;
                                                                                if (n2 != 0) break block12;
                                                                                if (n4 <= n7) break block11;
                                                                                dU2.e = (float)this.c[2][0];
                                                                                n4 = this.a;
                                                                                n7 = 3;
                                                                                if (n2 != 0) break block12;
                                                                                if (n4 > n7) {
                                                                                    dU2.q = (float)this.c[3][0];
                                                                                }
                                                                            }
                                                                            n4 = this.e;
                                                                        }
                                                                        if (n2 != 0) break block13;
                                                                        n7 = 1;
                                                                    }
                                                                    if (n4 <= n7) break block9;
                                                                    n4 = this.a;
                                                                }
                                                                if (n2 != 0) break block14;
                                                                if (n4 <= 0) break block15;
                                                                dU2.i = (float)this.c[0][1];
                                                                n4 = this.a;
                                                                n6 = 1;
                                                                if (n2 != 0) break block16;
                                                                if (n4 <= n6) break block15;
                                                                dU2.d = (float)this.c[1][1];
                                                                n4 = this.a;
                                                                n6 = 2;
                                                                if (n2 != 0) break block16;
                                                                if (n4 <= n6) break block15;
                                                                dU2.k = (float)this.c[2][1];
                                                                n4 = this.a;
                                                                n6 = 3;
                                                                if (n2 != 0) break block16;
                                                                if (n4 > n6) {
                                                                    dU2.b = (float)this.c[3][1];
                                                                }
                                                            }
                                                            n4 = this.e;
                                                        }
                                                        if (n2 != 0) break block17;
                                                        n6 = 2;
                                                    }
                                                    if (n4 <= n6) break block9;
                                                    n4 = this.a;
                                                }
                                                if (n2 != 0) break block18;
                                                if (n4 <= 0) break block19;
                                                dU2.g = (float)this.c[0][2];
                                                n4 = this.a;
                                                n5 = 1;
                                                if (n2 != 0) break block20;
                                                if (n4 <= n5) break block19;
                                                dU2.f = (float)this.c[1][2];
                                                n4 = this.a;
                                                n5 = 2;
                                                if (n2 != 0) break block20;
                                                if (n4 <= n5) break block19;
                                                dU2.m = (float)this.c[2][2];
                                                n4 = this.a;
                                                n5 = 3;
                                                if (n2 != 0) break block20;
                                                if (n4 > n5) {
                                                    dU2.j = (float)this.c[3][2];
                                                }
                                            }
                                            n4 = this.e;
                                        }
                                        if (n2 != 0) break block21;
                                        n5 = 3;
                                    }
                                    if (n4 <= n5) break block9;
                                    n4 = this.a;
                                }
                                if (n2 != 0) break block22;
                                if (n4 <= 0) break block9;
                                dU2.c = (float)this.c[0][3];
                                n4 = this.a;
                            }
                            n3 = 1;
                            if (n2 != 0) break block23;
                            if (n4 <= n3) break block9;
                            dU2.o = (float)this.c[1][3];
                            n4 = this.a;
                            n3 = 2;
                        }
                        if (n2 != 0) break block24;
                        if (n4 <= n3) break block9;
                        dU2.n = (float)this.c[2][3];
                        if (n2 != 0) break block25;
                        n4 = this.a;
                        n3 = 3;
                    }
                    if (n4 <= n3) break block9;
                    dU2.h = (float)this.c[3][3];
                }
                if (n2 == 0) break block9;
            }
            dU2.l = (float)this.c[0][0];
            dU2.i = (float)this.c[0][1];
            dU2.g = (float)this.c[0][2];
            dU2.c = (float)this.c[0][3];
            dU2.a = (float)this.c[1][0];
            dU2.d = (float)this.c[1][1];
            dU2.f = (float)this.c[1][2];
            dU2.o = (float)this.c[1][3];
            dU2.e = (float)this.c[2][0];
            dU2.k = (float)this.c[2][1];
            dU2.m = (float)this.c[2][2];
            dU2.n = (float)this.c[2][3];
            dU2.q = (float)this.c[3][0];
            dU2.b = (float)this.c[3][1];
            dU2.j = (float)this.c[3][2];
            dU2.h = (float)this.c[3][3];
        }
    }

    public final void b(dA dA2) {
        int n2;
        int n3;
        block10: {
            int n4;
            block11: {
                block8: {
                    fI fI2;
                    block9: {
                        n3 = ae.g();
                        fI2 = this;
                        if (n3 != 0) break block8;
                        if (fI2.a < 4) break block9;
                        n4 = this.e;
                        if (n3 != 0) break block10;
                        if (n4 >= 4) break block11;
                    }
                    this.c = new double[4][4];
                    this.a = 4;
                    fI2 = this;
                }
                fI2.e = 4;
            }
            this.c[0][0] = dA2.o;
            this.c[0][1] = dA2.f;
            this.c[0][2] = dA2.m;
            this.c[0][3] = dA2.p;
            this.c[1][0] = dA2.b;
            this.c[1][1] = dA2.l;
            this.c[1][2] = dA2.g;
            this.c[1][3] = dA2.q;
            this.c[2][0] = dA2.k;
            this.c[2][1] = dA2.i;
            this.c[2][2] = dA2.h;
            this.c[2][3] = dA2.e;
            this.c[3][0] = dA2.a;
            this.c[3][1] = dA2.j;
            this.c[3][2] = dA2.n;
            this.c[3][3] = dA2.d;
            n4 = n2 = 4;
        }
        while (n2 < this.a) {
            block7: {
                for (int i2 = 4; i2 < this.e; ++i2) {
                    this.c[n2][i2] = 0.0;
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block7;
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    public final int a() {
        return this.a;
    }

    public final void b(fI fI2) {
        int n2;
        int n3;
        block10: {
            int n4;
            block11: {
                block9: {
                    int n5;
                    block8: {
                        n3 = ae.f();
                        n4 = this.a;
                        n5 = fI2.a;
                        if (n3 == 0) break block8;
                        if (n4 != n5) break block9;
                        n4 = this.e;
                        if (n3 == 0) break block10;
                        n5 = fI2.e;
                    }
                    if (n4 == n5) break block11;
                }
                throw new gX(cK.a("GMatrix13"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.a) {
            block7: {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    this.c[n2][i2] = -fI2.c[n2][i2];
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block7;
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public final void b(gY gY2) {
        block8: {
            block6: {
                int n2;
                block19: {
                    int n3;
                    int n4;
                    block18: {
                        block17: {
                            block16: {
                                int n5;
                                block15: {
                                    block13: {
                                        block14: {
                                            block12: {
                                                int n6;
                                                block11: {
                                                    block9: {
                                                        block10: {
                                                            block7: {
                                                                block4: {
                                                                    block5: {
                                                                        n2 = ae.f();
                                                                        n4 = this.a;
                                                                        if (n2 == 0) break block4;
                                                                        if (n4 < 3) break block5;
                                                                        n4 = this.e;
                                                                        if (n2 == 0) break block4;
                                                                        if (n4 >= 3) break block6;
                                                                    }
                                                                    gY2.h();
                                                                    n4 = this.e;
                                                                }
                                                                if (n2 == 0) break block7;
                                                                if (n4 <= 0) break block8;
                                                                n4 = this.a;
                                                            }
                                                            if (n2 == 0) break block9;
                                                            if (n4 <= 0) break block10;
                                                            gY2.h = this.c[0][0];
                                                            n4 = this.a;
                                                            n6 = 1;
                                                            if (n2 == 0) break block11;
                                                            if (n4 <= n6) break block10;
                                                            gY2.f = this.c[1][0];
                                                            n4 = this.a;
                                                            n6 = 2;
                                                            if (n2 == 0) break block11;
                                                            if (n4 > n6) {
                                                                gY2.g = this.c[2][0];
                                                            }
                                                        }
                                                        n4 = this.e;
                                                    }
                                                    if (n2 == 0) break block12;
                                                    n6 = 1;
                                                }
                                                if (n4 <= n6) break block8;
                                                n4 = this.a;
                                            }
                                            if (n2 == 0) break block13;
                                            if (n4 <= 0) break block14;
                                            gY2.j = this.c[0][1];
                                            n4 = this.a;
                                            n5 = 1;
                                            if (n2 == 0) break block15;
                                            if (n4 <= n5) break block14;
                                            gY2.d = this.c[1][1];
                                            n4 = this.a;
                                            n5 = 2;
                                            if (n2 == 0) break block15;
                                            if (n4 > n5) {
                                                gY2.b = this.c[2][1];
                                            }
                                        }
                                        n4 = this.e;
                                    }
                                    if (n2 == 0) break block16;
                                    n5 = 2;
                                }
                                if (n4 <= n5) break block8;
                                n4 = this.a;
                            }
                            if (n2 == 0) break block17;
                            if (n4 <= 0) break block8;
                            gY2.i = this.c[0][2];
                            n4 = this.a;
                        }
                        n3 = 1;
                        if (n2 == 0) break block18;
                        if (n4 <= n3) break block8;
                        gY2.c = this.c[1][2];
                        if (n2 == 0) break block19;
                        n4 = this.a;
                        n3 = 2;
                    }
                    if (n4 <= n3) break block8;
                    gY2.e = this.c[2][2];
                }
                if (n2 != 0) break block8;
            }
            gY2.h = this.c[0][0];
            gY2.j = this.c[0][1];
            gY2.i = this.c[0][2];
            gY2.f = this.c[1][0];
            gY2.d = this.c[1][1];
            gY2.c = this.c[1][2];
            gY2.g = this.c[2][0];
            gY2.b = this.c[2][1];
            gY2.e = this.c[2][2];
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    public boolean c(fI var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public fI(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        block12: {
            int n7;
            block10: {
                block11: {
                    block8: {
                        this.c = new double[n2][n3];
                        this.a = n2;
                        this.e = n3;
                        n6 = ae.f();
                        n5 = 0;
                        while (n5 < n2) {
                            block9: {
                                n7 = 0;
                                if (n6 == 0) break block8;
                                for (int i2 = v1168033; i2 < n3; ++i2) {
                                    this.c[n5][i2] = 0.0;
                                    if (n6 != 0) {
                                        if (n6 != 0) continue;
                                    }
                                    break block9;
                                }
                                ++n5;
                            }
                            if (n6 != 0) continue;
                        }
                        n7 = n2;
                    }
                    if (n6 == 0) break block10;
                    if (n7 >= n3) break block11;
                    n4 = n2;
                    if (n6 != 0) break block12;
                }
                n7 = n3;
            }
            n4 = n7;
        }
        for (n5 = 0; n5 < n4; ++n5) {
            this.c[n5][n5] = 1.0;
            if (n6 != 0) continue;
        }
    }

    public final void i() {
        int n2;
        int n3;
        int n4;
        block12: {
            int n5;
            block10: {
                block11: {
                    block8: {
                        n4 = 0;
                        n3 = ae.f();
                        while (n4 < this.a) {
                            block9: {
                                n5 = 0;
                                if (n3 == 0) break block8;
                                for (int i2 = v1168086; i2 < this.e; ++i2) {
                                    this.c[n4][i2] = -this.c[n4][i2];
                                    if (n3 != 0) {
                                        if (n3 != 0) continue;
                                    }
                                    break block9;
                                }
                                ++n4;
                            }
                            if (n3 != 0) continue;
                        }
                        n5 = this.a;
                    }
                    if (n3 == 0) break block10;
                    if (n5 >= this.e) break block11;
                    n2 = this.a;
                    if (n3 != 0) break block12;
                }
                n5 = this.e;
            }
            n2 = n5;
        }
        n4 = 0;
        while (n4 < n2) {
            double[] arrd = this.c[n4];
            int n6 = n4++;
            arrd[n6] = arrd[n6] + 1.0;
            if (n3 != 0) continue;
        }
    }

    static double a(double d10, double d11) {
        int n2 = ae.g();
        double d12 = d10;
        if (n2 == 0) {
            if (d12 > d11) {
                return d10;
            }
            d12 = d11;
        }
        return d12;
    }

    public final void d(int n2, double[] arrd) {
        int n3 = ae.f();
        for (int i2 = 0; i2 < this.e; ++i2) {
            arrd[i2] = this.c[n2][i2];
            if (n3 != 0) continue;
        }
    }

    public final void a(double d10) {
        int n2;
        int n3;
        int n4;
        block8: {
            int n5;
            block12: {
                int n6;
                block10: {
                    block11: {
                        n4 = ae.g();
                        n6 = this.a;
                        if (n4 != 0) break block10;
                        if (n6 >= this.e) break block11;
                        n3 = this.a;
                        if (n4 == 0) break block12;
                    }
                    n6 = this.e;
                }
                n3 = n6;
            }
            n2 = 0;
            while (n2 < this.a) {
                block9: {
                    n5 = 0;
                    if (n4 != 0) break block8;
                    for (int i2 = v1168162; i2 < this.e; ++i2) {
                        this.c[n2][i2] = 0.0;
                        if (n4 == 0) {
                            if (n4 == 0) continue;
                        }
                        break block9;
                    }
                    ++n2;
                }
                if (n4 == 0) continue;
            }
            n5 = n2 = 0;
        }
        while (n2 < n3) {
            this.c[n2][n2] = d10;
            ++n2;
            if (n4 == 0) continue;
        }
    }

    private static void a(double[] arrd, double[] arrd2, fI fI2, fI fI3) {
        block11: {
            int n2;
            int n3;
            fI fI4;
            block10: {
                block9: {
                    block8: {
                        fI4 = new fI(fI2.e, fI3.a);
                        int n4 = ae.g();
                        System.out.println(" \ns = ");
                        n3 = n4;
                        for (n2 = 0; n2 < arrd.length; ++n2) {
                            System.out.println(" " + arrd[n2]);
                            if (n3 == 0) {
                                if (n3 == 0) continue;
                            }
                            break block8;
                        }
                        System.out.println(" \ne = ");
                    }
                    for (n2 = 0; n2 < arrd2.length; ++n2) {
                        System.out.println(" " + arrd2[n2]);
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                        }
                        break block9;
                    }
                    System.out.println(" \nu  = \n" + fI2);
                    System.out.println(" \nv  = \n" + fI3);
                    fI4.b();
                }
                for (n2 = 0; n2 < arrd.length; ++n2) {
                    fI4.c[n2][n2] = arrd[n2];
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                    }
                    break block10;
                }
                n2 = 0;
            }
            while (n2 < arrd2.length) {
                fI4.c[n2][n2 + 1] = arrd2[n2];
                ++n2;
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block11;
            }
            System.out.println(" \nm  = \n" + fI4);
            fI4.c(fI2, fI4);
            fI4.d(fI4, fI3);
            System.out.println(" \n u.transpose*m*v.transpose  = \n" + fI4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(fI fI2, fI fI3, fI fI4) {
        int n2 = ae.g();
        int n3 = this.e;
        int n4 = fI4.e;
        if (n2 == 0) {
            if (n3 != n4) throw new gX(cK.a("GMatrix18"));
            n3 = this.e;
            n4 = fI4.a;
        }
        if (n2 == 0) {
            if (n3 != n4) {
                throw new gX(cK.a("GMatrix18"));
            }
            n3 = this.a;
            n4 = fI2.a;
        }
        if (n2 == 0) {
            if (n3 != n4) throw new gX(cK.a("GMatrix25"));
            n3 = this.a;
            n4 = fI2.e;
        }
        if (n2 == 0) {
            if (n3 != n4) {
                throw new gX(cK.a("GMatrix25"));
            }
            n3 = this.a;
            n4 = fI3.a;
        }
        if (n2 == 0) {
            if (n3 != n4) throw new gX(cK.a("GMatrix26"));
            n3 = this.e;
            n4 = fI3.e;
        }
        if (n2 == 0) {
            if (n3 != n4) {
                throw new gX(cK.a("GMatrix26"));
            }
            n3 = this.a;
            if (n2 != 0) return n3;
            n4 = 2;
        }
        if (n3 == n4) {
            n3 = this.e;
            if (n2 != 0) return n3;
            if (n3 == 2) {
                double d10 = this.c[1][0] - 0.0;
                n3 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                if (n2 != 0) return n3;
                if (n3 == 0) {
                    fI2.b();
                    fI4.b();
                    double d11 = this.c[0][1] - 0.0;
                    double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (n2 == 0) {
                        if (d12 == false) {
                            return 2;
                        }
                        d12 = 1.0;
                    }
                    double[] arrd = new double[d12];
                    double[] arrd2 = new double[1];
                    double[] arrd3 = new double[1];
                    double[] arrd4 = new double[1];
                    double[] arrd5 = new double[]{this.c[0][0], this.c[1][1]};
                    fI.a(this.c[0][0], this.c[0][1], this.c[1][1], arrd5, arrd, arrd3, arrd2, arrd4, 0);
                    fI.a(0, fI2, arrd3, arrd);
                    fI.b(0, fI4, arrd4, arrd2);
                    return 2;
                }
            }
        }
        n3 = fI.a(this, fI2, fI3, fI4);
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void k(fI fI2) {
        fI fI3;
        int n2;
        block9: {
            int n3;
            int n4;
            block8: {
                n2 = ae.g();
                n4 = this.a;
                n3 = fI2.e;
                if (n2 != 0) break block8;
                if (n4 != n3) throw new gX(cK.a("GMatrix17"));
                fI3 = this;
                if (n2 != 0) break block9;
                n4 = fI3.e;
                n3 = fI2.a;
            }
            if (n4 != n3) {
                throw new gX(cK.a("GMatrix17"));
            }
            fI3 = fI2;
        }
        if (n2 == 0) {
            if (fI3 != this) {
                int n5 = 0;
                block0: do {
                    if (n5 >= this.a) return;
                    for (int i2 = 0; i2 < this.e; ++i2) {
                        this.c[n5][i2] = fI2.c[i2][n5];
                        if (n2 != 0) continue block0;
                        if (n2 == 0) continue;
                    }
                    ++n5;
                } while (n2 == 0);
            }
            fI3 = this;
        }
        fI3.h();
    }

    public final void c(int n2, e e10) {
        int n3;
        int n4 = ae.g();
        int n5 = e10.c();
        if (n4 == 0) {
            if (n5 < this.e) {
                e10.a(this.e);
            }
            n5 = n3 = 0;
        }
        while (n3 < this.e) {
            e10.a[n3] = this.c[n2][n3];
            ++n3;
            if (n4 == 0) continue;
        }
    }

    public final double e() {
        double d10;
        block6: {
            int n2;
            int n3;
            block9: {
                int n4;
                block7: {
                    block8: {
                        n3 = ae.f();
                        n4 = this.a;
                        if (n3 == 0) break block7;
                        if (n4 >= this.e) break block8;
                        n2 = this.a;
                        if (n3 != 0) break block9;
                    }
                    n4 = this.e;
                }
                n2 = n4;
            }
            double d11 = 0.0;
            for (int i2 = 0; i2 < n2; ++i2) {
                d10 = d11 + this.c[i2][i2];
                if (n3 != 0) {
                    d11 = d10;
                    if (n3 != 0) continue;
                }
                break block6;
            }
            d10 = d11;
        }
        return d10;
    }

    public boolean a(fI fI2, float f10) {
        return this.a(fI2, (double)f10);
    }

    public int hashCode() {
        int n2;
        block3: {
            long l2 = 1L;
            int n3 = ae.f();
            l2 = gW.a(l2, this.a);
            l2 = gW.a(l2, this.e);
            int n4 = 0;
            while (n4 < this.a) {
                block4: {
                    n2 = 0;
                    if (n3 == 0) break block3;
                    for (int i2 = v1169207; i2 < this.e; ++i2) {
                        l2 = gW.a(l2, this.c[n4][i2]);
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block4;
                    }
                    ++n4;
                }
                if (n3 != 0) continue;
            }
            n2 = gW.a(l2);
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    static void a(int var0, double[] var1_1, int[] var2_2, double[] var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[SIMPLE_IF_TAKEN]], but top level block is 3[FORLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public final void a(int n2, e e10) {
        int n3 = ae.f();
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.c[n2][i2] = e10.a[i2];
            if (n3 != 0) continue;
        }
    }

    public final double a(int n2, int n3) {
        return this.c[n2][n3];
    }
}

