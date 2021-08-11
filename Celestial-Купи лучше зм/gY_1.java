/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class gY
implements Cloneable,
Serializable {
    public /* synthetic */ double h;
    public /* synthetic */ double j;
    public /* synthetic */ double d;
    private static final /* synthetic */ double a = 1.110223024E-16;
    public /* synthetic */ double e;
    static final /* synthetic */ long serialVersionUID = 6837536777072402710L;
    public /* synthetic */ double f;
    public /* synthetic */ double i;
    public /* synthetic */ double g;
    public /* synthetic */ double c;
    public /* synthetic */ double b;

    public final void a(int n2, q q2) {
        block4: {
            block7: {
                int n3;
                int n4;
                int n5;
                block5: {
                    block6: {
                        block2: {
                            block3: {
                                n5 = ae.g();
                                n4 = n2;
                                if (n5 != 0) break block2;
                                if (n4 != 0) break block3;
                                q2.c = this.h;
                                q2.b = this.f;
                                q2.a = this.g;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 != 0) break block5;
                        if (n4 != n3) break block6;
                        q2.c = this.j;
                        q2.b = this.d;
                        q2.a = this.b;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                q2.c = this.i;
                q2.b = this.c;
                q2.a = this.e;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d4"));
        }
    }

    public final void a(gY gY2, gY gY3) {
        this.h = gY2.h + gY3.h;
        this.j = gY2.j + gY3.j;
        this.i = gY2.i + gY3.i;
        this.f = gY2.f + gY3.f;
        this.d = gY2.d + gY3.d;
        this.c = gY2.c + gY3.c;
        this.g = gY2.g + gY3.g;
        this.b = gY2.b + gY3.b;
        this.e = gY2.e + gY3.e;
    }

    public gY(dc dc2) {
        this.h = dc2.j;
        this.j = dc2.d;
        this.i = dc2.a;
        this.f = dc2.c;
        this.d = dc2.g;
        this.c = dc2.h;
        this.g = dc2.f;
        this.b = dc2.e;
        this.e = dc2.i;
    }

    public final void a(eG eG2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n2 = ae.g();
                    d11 = d12;
                    d10 = 1.110223024E-16;
                    if (n2 != 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.h = 1.0;
                    this.j = 0.0;
                    this.i = 0.0;
                    this.f = 0.0;
                    this.d = 1.0;
                    this.c = 0.0;
                    this.g = 0.0;
                    this.b = 0.0;
                    this.e = 1.0;
                    if (n2 == 0) break block4;
                }
                d12 = 1.0 / d12;
                d11 = eG2.e;
                d10 = d12;
            }
            double d13 = d11 * d10;
            double d14 = (double)eG2.d * d12;
            double d15 = (double)eG2.c * d12;
            double d16 = Math.sin(eG2.a);
            double d17 = Math.cos(eG2.a);
            double d18 = 1.0 - d17;
            double d19 = d13 * d15;
            double d20 = d13 * d14;
            double d21 = d14 * d15;
            this.h = d18 * d13 * d13 + d17;
            this.j = d18 * d20 - d16 * d15;
            this.i = d18 * d19 + d16 * d14;
            this.f = d18 * d20 + d16 * d15;
            this.d = d18 * d14 * d14 + d17;
            this.c = d18 * d21 - d16 * d13;
            this.g = d18 * d19 - d16 * d14;
            this.b = d18 * d21 + d16 * d13;
            this.e = d18 * d15 * d15 + d17;
        }
    }

    public final void b(double d10, gY gY2) {
        this.h = gY2.h + d10;
        this.j = gY2.j + d10;
        this.i = gY2.i + d10;
        this.f = gY2.f + d10;
        this.d = gY2.d + d10;
        this.c = gY2.c + d10;
        this.g = gY2.g + d10;
        this.b = gY2.b + d10;
        this.e = gY2.e + d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static double c(double var0, double var2_1) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(int var1_1, double[] var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2[0];
                this.f = var2_2[1];
                this.g = var2_2[2];
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.j = var2_2[0];
                this.d = var2_2[1];
                this.b = var2_2[2];
                if (var3_3 != 0) return;
            }
            case 2: {
                this.i = var2_2[0];
                this.c = var2_2[1];
                this.e = var2_2[2];
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d9"));
    }

    public boolean a(gY gY2, double d10) {
        double d11;
        double d12;
        int n2;
        block49: {
            double d13;
            double d14;
            block48: {
                double d15;
                double d16;
                block47: {
                    double d17;
                    block46: {
                        double d18;
                        double d19;
                        block45: {
                            double d20;
                            block44: {
                                double d21;
                                double d22;
                                block43: {
                                    double d23;
                                    block42: {
                                        double d24;
                                        double d25;
                                        block41: {
                                            double d26;
                                            block40: {
                                                double d27;
                                                double d28;
                                                block39: {
                                                    double d29;
                                                    block38: {
                                                        double d30;
                                                        double d31;
                                                        block37: {
                                                            double d32;
                                                            block36: {
                                                                double d33;
                                                                double d34;
                                                                block35: {
                                                                    double d35;
                                                                    block34: {
                                                                        double d36;
                                                                        d14 = this.h - gY2.h;
                                                                        n2 = ae.g();
                                                                        double d37 = d14;
                                                                        if (n2 == 0) {
                                                                            d37 = d37 < 0.0 ? -d14 : d14;
                                                                        }
                                                                        d35 = (d36 = d37 - d10) == 0.0 ? 0 : (d36 > 0.0 ? 1 : -1);
                                                                        if (n2 != 0) break block34;
                                                                        if (d35 > 0) {
                                                                            return false;
                                                                        }
                                                                        d34 = d14 = this.j - gY2.j;
                                                                        if (n2 != 0) break block35;
                                                                        double d38 = d34 - 0.0;
                                                                        d35 = d38 == 0.0 ? 0 : (d38 < 0.0 ? -1 : 1);
                                                                    }
                                                                    d34 = d35 < 0 ? -d14 : d14;
                                                                }
                                                                d32 = (d33 = d34 - d10) == 0.0 ? 0 : (d33 > 0.0 ? 1 : -1);
                                                                if (n2 != 0) break block36;
                                                                if (d32 > 0) {
                                                                    return false;
                                                                }
                                                                d31 = d14 = this.i - gY2.i;
                                                                if (n2 != 0) break block37;
                                                                double d39 = d31 - 0.0;
                                                                d32 = d39 == 0.0 ? 0 : (d39 < 0.0 ? -1 : 1);
                                                            }
                                                            d31 = d32 < 0 ? -d14 : d14;
                                                        }
                                                        d29 = (d30 = d31 - d10) == 0.0 ? 0 : (d30 > 0.0 ? 1 : -1);
                                                        if (n2 != 0) break block38;
                                                        if (d29 > 0) {
                                                            return false;
                                                        }
                                                        d28 = d14 = this.f - gY2.f;
                                                        if (n2 != 0) break block39;
                                                        double d40 = d28 - 0.0;
                                                        d29 = d40 == 0.0 ? 0 : (d40 < 0.0 ? -1 : 1);
                                                    }
                                                    d28 = d29 < 0 ? -d14 : d14;
                                                }
                                                d26 = (d27 = d28 - d10) == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                if (n2 != 0) break block40;
                                                if (d26 > 0) {
                                                    return false;
                                                }
                                                d25 = d14 = this.d - gY2.d;
                                                if (n2 != 0) break block41;
                                                double d41 = d25 - 0.0;
                                                d26 = d41 == 0.0 ? 0 : (d41 < 0.0 ? -1 : 1);
                                            }
                                            d25 = d26 < 0 ? -d14 : d14;
                                        }
                                        d23 = (d24 = d25 - d10) == 0.0 ? 0 : (d24 > 0.0 ? 1 : -1);
                                        if (n2 != 0) break block42;
                                        if (d23 > 0) {
                                            return false;
                                        }
                                        d22 = d14 = this.c - gY2.c;
                                        if (n2 != 0) break block43;
                                        double d42 = d22 - 0.0;
                                        d23 = d42 == 0.0 ? 0 : (d42 < 0.0 ? -1 : 1);
                                    }
                                    d22 = d23 < 0 ? -d14 : d14;
                                }
                                d20 = (d21 = d22 - d10) == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                if (n2 != 0) break block44;
                                if (d20 > 0) {
                                    return false;
                                }
                                d19 = d14 = this.g - gY2.g;
                                if (n2 != 0) break block45;
                                double d43 = d19 - 0.0;
                                d20 = d43 == 0.0 ? 0 : (d43 < 0.0 ? -1 : 1);
                            }
                            d19 = d20 < 0 ? -d14 : d14;
                        }
                        d17 = (d18 = d19 - d10) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        if (n2 != 0) break block46;
                        if (d17 > 0) {
                            return false;
                        }
                        d16 = d14 = this.b - gY2.b;
                        if (n2 != 0) break block47;
                        double d44 = d16 - 0.0;
                        d17 = d44 == 0.0 ? 0 : (d44 < 0.0 ? -1 : 1);
                    }
                    d16 = d17 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 != 0) break block48;
                if (d13 > 0) {
                    return false;
                }
                d12 = d14 = this.e - gY2.e;
                if (n2 != 0) break block49;
                double d45 = d12 - 0.0;
                d13 = d45 == 0.0 ? 0 : (d45 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d46 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 == 0) {
            d46 = d46 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d46;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, double var2_2, double var4_3, double var6_4) {
        var8_5 = ae.g();
        if (var8_5 != 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2;
                this.j = var4_3;
                this.i = var6_4;
lbl8:
                // 2 sources

                if (var8_5 == 0) return;
            }
            case 1: {
                this.f = var2_2;
                this.d = var4_3;
                this.c = var6_4;
                if (var8_5 == 0) return;
            }
            case 2: {
                this.g = var2_2;
                this.b = var4_3;
                this.e = var6_4;
                if (var8_5 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d6"));
    }

    static void a(double[] arrd) {
        double d10 = arrd[0] * arrd[4] * arrd[8] + arrd[1] * arrd[5] * arrd[6] + arrd[2] * arrd[3] * arrd[7] - arrd[2] * arrd[4] * arrd[6] - arrd[0] * arrd[5] * arrd[7] - arrd[1] * arrd[3] * arrd[8];
        System.out.println("det= " + d10);
    }

    public final void d(gY gY2, gY gY3) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = gY2.h * gY3.h + gY2.j * gY3.f + gY2.i * gY3.g;
        arrd[1] = gY2.h * gY3.j + gY2.j * gY3.d + gY2.i * gY3.b;
        arrd[2] = gY2.h * gY3.i + gY2.j * gY3.c + gY2.i * gY3.e;
        arrd[3] = gY2.f * gY3.h + gY2.d * gY3.f + gY2.c * gY3.g;
        arrd[4] = gY2.f * gY3.j + gY2.d * gY3.d + gY2.c * gY3.b;
        arrd[5] = gY2.f * gY3.i + gY2.d * gY3.c + gY2.c * gY3.e;
        arrd[6] = gY2.g * gY3.h + gY2.b * gY3.f + gY2.e * gY3.g;
        arrd[7] = gY2.g * gY3.j + gY2.b * gY3.d + gY2.e * gY3.b;
        arrd[8] = gY2.g * gY3.i + gY2.b * gY3.c + gY2.e * gY3.e;
        gY.b(arrd, arrd3, arrd2);
        this.h = arrd2[0];
        this.j = arrd2[1];
        this.i = arrd2[2];
        this.f = arrd2[3];
        this.d = arrd2[4];
        this.c = arrd2[5];
        this.g = arrd2[6];
        this.b = arrd2[7];
        this.e = arrd2[8];
    }

    public gY(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.h = d10;
        this.j = d11;
        this.i = d12;
        this.f = d13;
        this.d = d14;
        this.c = d15;
        this.g = d16;
        this.b = d17;
        this.e = d18;
    }

    public final void j() {
        this.h = -this.h;
        this.j = -this.j;
        this.i = -this.i;
        this.f = -this.f;
        this.d = -this.d;
        this.c = -this.c;
        this.g = -this.g;
        this.b = -this.b;
        this.e = -this.e;
    }

    public final void a() {
        this.h = 1.0;
        this.j = 0.0;
        this.i = 0.0;
        this.f = 0.0;
        this.d = 1.0;
        this.c = 0.0;
        this.g = 0.0;
        this.b = 0.0;
        this.e = 1.0;
    }

    public gY(gY gY2) {
        this.h = gY2.h;
        this.j = gY2.j;
        this.i = gY2.i;
        this.f = gY2.f;
        this.d = gY2.d;
        this.c = gY2.c;
        this.g = gY2.g;
        this.b = gY2.b;
        this.e = gY2.e;
    }

    public final void c(double[] arrd) {
        this.h = arrd[0];
        this.j = arrd[1];
        this.i = arrd[2];
        this.f = arrd[3];
        this.d = arrd[4];
        this.c = arrd[5];
        this.g = arrd[6];
        this.b = arrd[7];
        this.e = arrd[8];
    }

    private final void b(gY gY2) {
        block4: {
            int n2;
            double[] arrd = new double[9];
            int[] arrn = new int[3];
            double[] arrd2 = new double[9];
            arrd2[0] = gY2.h;
            arrd2[1] = gY2.j;
            arrd2[2] = gY2.i;
            arrd2[3] = gY2.f;
            arrd2[4] = gY2.d;
            int n3 = ae.g();
            arrd2[5] = gY2.c;
            arrd2[6] = gY2.g;
            arrd2[7] = gY2.b;
            arrd2[8] = gY2.e;
            int n4 = gY.a(arrd2, arrn);
            if (n3 == 0) {
                if (n4 == 0) {
                    throw new gP(cK.a("Matrix3d12"));
                }
                n4 = n2 = 0;
            }
            while (n2 < 9) {
                arrd[n2] = 0.0;
                ++n2;
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block4;
            }
            arrd[0] = 1.0;
            arrd[4] = 1.0;
            arrd[8] = 1.0;
            gY.a(arrd2, arrn, arrd);
            this.h = arrd[0];
            this.j = arrd[1];
            this.i = arrd[2];
            this.f = arrd[3];
            this.d = arrd[4];
            this.c = arrd[5];
            this.g = arrd[6];
            this.b = arrd[7];
            this.e = arrd[8];
        }
    }

    public final void a(double d10, gY gY2) {
        this.h = d10 * gY2.h;
        this.j = d10 * gY2.j;
        this.i = d10 * gY2.i;
        this.f = d10 * gY2.f;
        this.d = d10 * gY2.d;
        this.c = d10 * gY2.c;
        this.g = d10 * gY2.g;
        this.b = d10 * gY2.b;
        this.e = d10 * gY2.e;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static void a(double[] arrd, double[] arrd2, double[] arrd3, double[] arrd4, double[] arrd5, double[] arrd6) {
        int n2;
        double d10;
        int n3;
        double[] arrd7;
        int[] arrn;
        block40: {
            double d11;
            block41: {
                block42: {
                    double d12;
                    int n4;
                    block43: {
                        block44: {
                            double[] arrd8;
                            block34: {
                                double d13;
                                block35: {
                                    double d14;
                                    block36: {
                                        block37: {
                                            double d15;
                                            block38: {
                                                block39: {
                                                    block30: {
                                                        block32: {
                                                            block33: {
                                                                double d16;
                                                                block31: {
                                                                    block25: {
                                                                        double d17;
                                                                        block26: {
                                                                            block28: {
                                                                                block29: {
                                                                                    double d18;
                                                                                    block27: {
                                                                                        block23: {
                                                                                            double d19;
                                                                                            block24: {
                                                                                                arrn = new int[3];
                                                                                                int[] arrn2 = new int[3];
                                                                                                arrd8 = new double[3];
                                                                                                arrd7 = new double[9];
                                                                                                n4 = ae.f();
                                                                                                double d20 = arrd4[0] - 0.0;
                                                                                                d16 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                                                                                if (n4 != 0) {
                                                                                                    double d21;
                                                                                                    if (d16 < 0) {
                                                                                                        arrd4[0] = -arrd4[0];
                                                                                                        arrd3[0] = -arrd3[0];
                                                                                                        arrd3[1] = -arrd3[1];
                                                                                                        arrd3[2] = -arrd3[2];
                                                                                                    }
                                                                                                    d16 = (d21 = arrd4[1] - 0.0) == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                                                                                                }
                                                                                                if (n4 != 0) {
                                                                                                    double d22;
                                                                                                    if (d16 < 0) {
                                                                                                        arrd4[1] = -arrd4[1];
                                                                                                        arrd3[3] = -arrd3[3];
                                                                                                        arrd3[4] = -arrd3[4];
                                                                                                        arrd3[5] = -arrd3[5];
                                                                                                    }
                                                                                                    d16 = (d22 = arrd4[2] - 0.0) == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                                                                                                }
                                                                                                if (n4 != 0) {
                                                                                                    if (d16 < 0) {
                                                                                                        arrd4[2] = -arrd4[2];
                                                                                                        arrd3[6] = -arrd3[6];
                                                                                                        arrd3[7] = -arrd3[7];
                                                                                                        arrd3[8] = -arrd3[8];
                                                                                                    }
                                                                                                    gY.a(arrd2, arrd3, arrd7);
                                                                                                    d16 = (double)gY.a(Math.abs(arrd4[0]), Math.abs(arrd4[1]));
                                                                                                }
                                                                                                if (n4 == 0) break block23;
                                                                                                if (d16 == false) break block24;
                                                                                                d16 = (double)gY.a(Math.abs(arrd4[1]), Math.abs(arrd4[2]));
                                                                                                if (n4 == 0) break block23;
                                                                                                if (d16 != false) {
                                                                                                    int n5;
                                                                                                    block22: {
                                                                                                        for (n5 = 0; n5 < 9; ++n5) {
                                                                                                            arrd5[n5] = arrd7[n5];
                                                                                                            if (n4 != 0) {
                                                                                                                if (n4 != 0) continue;
                                                                                                            }
                                                                                                            break block22;
                                                                                                        }
                                                                                                        n5 = 0;
                                                                                                    }
                                                                                                    do {
                                                                                                        if (n5 >= 3) return;
                                                                                                        arrd6[n5] = arrd4[n5];
                                                                                                        ++n5;
                                                                                                    } while (n4 != 0);
                                                                                                }
                                                                                            }
                                                                                            d16 = (d19 = arrd4[0] - arrd4[1]) == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                                                        }
                                                                                        if (n4 == 0) break block25;
                                                                                        if (d16 <= 0) break block26;
                                                                                        double d23 = arrd4[0] - arrd4[2];
                                                                                        d18 = d23 == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                                                                                        if (n4 == 0) break block27;
                                                                                        if (d18 <= 0) break block28;
                                                                                        double d24 = arrd4[2] - arrd4[1];
                                                                                        d18 = d24 == 0.0 ? 0 : (d24 > 0.0 ? 1 : -1);
                                                                                    }
                                                                                    if (d18 <= 0) break block29;
                                                                                    arrn[0] = 0;
                                                                                    arrn[1] = 2;
                                                                                    arrn[2] = 1;
                                                                                    if (n4 != 0) break block30;
                                                                                }
                                                                                arrn[0] = 0;
                                                                                arrn[1] = 1;
                                                                                arrn[2] = 2;
                                                                                if (n4 != 0) break block30;
                                                                            }
                                                                            arrn[0] = 2;
                                                                            arrn[1] = 0;
                                                                            arrn[2] = 1;
                                                                            if (n4 != 0) break block30;
                                                                        }
                                                                        d16 = (d17 = arrd4[1] - arrd4[2]) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                                    }
                                                                    if (n4 == 0) break block31;
                                                                    if (d16 <= 0) break block32;
                                                                    double d25 = arrd4[2] - arrd4[0];
                                                                    d16 = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
                                                                }
                                                                if (d16 <= 0) break block33;
                                                                arrn[0] = 1;
                                                                arrn[1] = 2;
                                                                arrn[2] = 0;
                                                                if (n4 != 0) break block30;
                                                            }
                                                            arrn[0] = 1;
                                                            arrn[1] = 0;
                                                            arrn[2] = 2;
                                                            if (n4 != 0) break block30;
                                                        }
                                                        arrn[0] = 2;
                                                        arrn[1] = 1;
                                                        arrn[2] = 0;
                                                    }
                                                    arrd8[0] = arrd[0] * arrd[0] + arrd[1] * arrd[1] + arrd[2] * arrd[2];
                                                    arrd8[1] = arrd[3] * arrd[3] + arrd[4] * arrd[4] + arrd[5] * arrd[5];
                                                    arrd8[2] = arrd[6] * arrd[6] + arrd[7] * arrd[7] + arrd[8] * arrd[8];
                                                    double d26 = arrd8[0] - arrd8[1];
                                                    d11 = d26 == 0.0 ? 0 : (d26 > 0.0 ? 1 : -1);
                                                    if (n4 == 0) break block34;
                                                    if (d11 <= 0) break block35;
                                                    double d27 = arrd8[0] - arrd8[2];
                                                    d14 = d27 == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                    if (n4 == 0) break block36;
                                                    if (d14 <= 0) break block37;
                                                    double d28 = arrd8[2] - arrd8[1];
                                                    d15 = d28 == 0.0 ? 0 : (d28 > 0.0 ? 1 : -1);
                                                    if (n4 == 0) break block38;
                                                    if (d15 <= 0) break block39;
                                                    n3 = 0;
                                                    d10 = 1.0;
                                                    n2 = 2;
                                                    if (n4 != 0) break block40;
                                                }
                                                d15 = 0.0;
                                            }
                                            n3 = (int)d15;
                                            n2 = 1;
                                            d10 = 2;
                                            if (n4 != 0) break block40;
                                        }
                                        d14 = 0.0;
                                    }
                                    d10 = d14;
                                    n3 = 1;
                                    n2 = 2;
                                    if (n4 != 0) break block40;
                                }
                                d11 = (d13 = arrd8[1] - arrd8[2]) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            }
                            if (n4 == 0) break block41;
                            if (d11 <= 0) break block42;
                            double d29 = arrd8[2] - arrd8[0];
                            d12 = d29 == 0.0 ? 0 : (d29 > 0.0 ? 1 : -1);
                            if (n4 == 0) break block43;
                            if (d12 <= 0) break block44;
                            n2 = 0;
                            d10 = 1.0;
                            n3 = 2;
                            if (n4 != 0) break block40;
                        }
                        d12 = 0.0;
                    }
                    n2 = d12;
                    n3 = 1;
                    d10 = 2;
                    if (n4 != 0) break block40;
                }
                d11 = 0.0;
            }
            d10 = d11;
            n2 = 1;
            n3 = 2;
        }
        int n6 = arrn[n3];
        arrd6[0] = arrd4[n6];
        n6 = arrn[n2];
        arrd6[1] = arrd4[n6];
        n6 = arrn[d10];
        arrd6[2] = arrd4[n6];
        n6 = arrn[n3];
        arrd5[0] = arrd7[n6];
        n6 = arrn[n3] + 3;
        arrd5[3] = arrd7[n6];
        n6 = arrn[n3] + 6;
        arrd5[6] = arrd7[n6];
        n6 = arrn[n2];
        arrd5[1] = arrd7[n6];
        n6 = arrn[n2] + 3;
        arrd5[4] = arrd7[n6];
        n6 = arrn[n2] + 6;
        arrd5[7] = arrd7[n6];
        n6 = arrn[d10];
        arrd5[2] = arrd7[n6];
        n6 = arrn[d10] + 3;
        arrd5[5] = arrd7[n6];
        n6 = arrn[d10] + 6;
        arrd5[8] = arrd7[n6];
    }

    public final void j(double d10) {
        this.h += d10;
        this.j += d10;
        this.i += d10;
        this.f += d10;
        this.d += d10;
        this.c += d10;
        this.g += d10;
        this.b += d10;
        this.e += d10;
    }

    public final void e(gY gY2, gY gY3) {
        block4: {
            gY gY4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY2) break block3;
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY3) break block3;
                    this.h = gY2.h * gY3.h + gY2.j * gY3.j + gY2.i * gY3.i;
                    this.j = gY2.h * gY3.f + gY2.j * gY3.d + gY2.i * gY3.c;
                    this.i = gY2.h * gY3.g + gY2.j * gY3.b + gY2.i * gY3.e;
                    this.f = gY2.f * gY3.h + gY2.d * gY3.j + gY2.c * gY3.i;
                    this.d = gY2.f * gY3.f + gY2.d * gY3.d + gY2.c * gY3.c;
                    this.c = gY2.f * gY3.g + gY2.d * gY3.b + gY2.c * gY3.e;
                    this.g = gY2.g * gY3.h + gY2.b * gY3.j + gY2.e * gY3.i;
                    this.b = gY2.g * gY3.f + gY2.b * gY3.d + gY2.e * gY3.c;
                    this.e = gY2.g * gY3.g + gY2.b * gY3.b + gY2.e * gY3.e;
                    if (n2 == 0) break block4;
                }
                gY4 = gY2;
            }
            double d10 = gY4.h * gY3.h + gY2.j * gY3.j + gY2.i * gY3.i;
            double d11 = gY2.h * gY3.f + gY2.j * gY3.d + gY2.i * gY3.c;
            double d12 = gY2.h * gY3.g + gY2.j * gY3.b + gY2.i * gY3.e;
            double d13 = gY2.f * gY3.h + gY2.d * gY3.j + gY2.c * gY3.i;
            double d14 = gY2.f * gY3.f + gY2.d * gY3.d + gY2.c * gY3.c;
            double d15 = gY2.f * gY3.g + gY2.d * gY3.b + gY2.c * gY3.e;
            double d16 = gY2.g * gY3.h + gY2.b * gY3.j + gY2.e * gY3.i;
            double d17 = gY2.g * gY3.f + gY2.b * gY3.d + gY2.e * gY3.c;
            double d18 = gY2.g * gY3.g + gY2.b * gY3.b + gY2.e * gY3.e;
            this.h = d10;
            this.j = d11;
            this.i = d12;
            this.f = d13;
            this.d = d14;
            this.c = d15;
            this.g = d16;
            this.b = d17;
            this.e = d18;
        }
    }

    public final void c(gY gY2) {
        this.h = -gY2.h;
        this.j = -gY2.j;
        this.i = -gY2.i;
        this.f = -gY2.f;
        this.d = -gY2.d;
        this.c = -gY2.c;
        this.g = -gY2.g;
        this.b = -gY2.b;
        this.e = -gY2.e;
    }

    public final void a(gY gY2) {
        this.h -= gY2.h;
        this.j -= gY2.j;
        this.i -= gY2.i;
        this.f -= gY2.f;
        this.d -= gY2.d;
        this.c -= gY2.c;
        this.g -= gY2.g;
        this.b -= gY2.b;
        this.e -= gY2.e;
    }

    public final void k(double d10) {
        this.b = d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean g(gY var1_1) {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    var2_2 = ae.f();
                                    try {
                                        block26: {
                                            cfr_temp_0 = this.h - var1_1.h;
                                            v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                            if (var2_2 == 0) break block26;
                                            if (v0 != false) ** GOTO lbl66
                                            cfr_temp_1 = this.j - var1_1.j;
                                            v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                        }
                                        if (var2_2 == 0) break block19;
                                        if (v0 != false) ** GOTO lbl66
                                    }
                                    catch (NullPointerException var3_3) {
                                        return false;
                                    }
                                    cfr_temp_2 = this.i - var1_1.i;
                                    v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                }
                                if (var2_2 == 0) break block20;
                                if (v0 != false) ** GOTO lbl66
                                cfr_temp_3 = this.f - var1_1.f;
                                v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                            }
                            if (var2_2 == 0) break block21;
                            if (v0 != false) ** GOTO lbl66
                            cfr_temp_4 = this.d - var1_1.d;
                            v0 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                        }
                        if (var2_2 == 0) break block22;
                        if (v0 != false) ** GOTO lbl66
                        cfr_temp_5 = this.c - var1_1.c;
                        v0 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 == 0) break block23;
                    if (v0 != false) ** GOTO lbl66
                    cfr_temp_6 = this.g - var1_1.g;
                    v0 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                }
                if (var2_2 == 0) break block24;
                if (v0 != false) ** GOTO lbl66
                cfr_temp_7 = this.b - var1_1.b;
                v0 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
            }
            if (var2_2 == 0) break block25;
            if (v0 != false) ** GOTO lbl66
            cfr_temp_8 = this.e - var1_1.e;
            v0 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl66
        v0 = (double)true;
        return (boolean)v0;
lbl66:
        // 9 sources

        v0 = (double)false;
        return (boolean)v0;
    }

    public final void i(gY gY2) {
        this.h += gY2.h;
        this.j += gY2.j;
        this.i += gY2.i;
        this.f += gY2.f;
        this.d += gY2.d;
        this.c += gY2.c;
        this.g += gY2.g;
        this.b += gY2.b;
        this.e += gY2.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean equals(Object var1_1) {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    block27: {
                                        var2_2 = ae.g();
                                        var3_3 = (gY)var1_1;
                                        cfr_temp_0 = this.h - var3_3.h;
                                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                        if (var2_2 != 0) break block27;
                                        if (v0 != false) ** GOTO lbl65
                                        cfr_temp_1 = this.j - var3_3.j;
                                        v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                    }
                                    if (var2_2 != 0) break block20;
                                    if (v0 != false) ** GOTO lbl65
                                    cfr_temp_2 = this.i - var3_3.i;
                                    v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                }
                                if (var2_2 != 0) break block21;
                                if (v0 != false) ** GOTO lbl65
                                cfr_temp_3 = this.f - var3_3.f;
                                v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                            }
                            if (var2_2 != 0) break block22;
                            if (v0 != false) ** GOTO lbl65
                            cfr_temp_4 = this.d - var3_3.d;
                            v0 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                        }
                        if (var2_2 != 0) break block23;
                        if (v0 != false) ** GOTO lbl65
                        cfr_temp_5 = this.c - var3_3.c;
                        v0 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 != 0) break block24;
                    if (v0 != false) ** GOTO lbl65
                    cfr_temp_6 = this.g - var3_3.g;
                    v0 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                }
                if (var2_2 != 0) break block25;
                if (v0 != false) ** GOTO lbl65
                cfr_temp_7 = this.b - var3_3.b;
                v0 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block26;
            if (v0 != false) ** GOTO lbl65
            cfr_temp_8 = this.e - var3_3.e;
            v0 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl65
        try {
            v0 = (double)true;
            return (boolean)v0;
lbl65:
            // 9 sources

            v0 = (double)false;
            return (boolean)v0;
        }
        catch (ClassCastException var3_4) {
            return false;
        }
        catch (NullPointerException var3_5) {
            return false;
        }
    }

    public final void a(dc dc2) {
        this.h = dc2.j;
        this.j = dc2.d;
        this.i = dc2.a;
        this.f = dc2.c;
        this.d = dc2.g;
        this.c = dc2.h;
        this.g = dc2.f;
        this.b = dc2.e;
        this.e = dc2.i;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public final void d(double d10) {
        this.h = d10;
    }

    public final double c() {
        return this.h;
    }

    public final void h(gY gY2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = this.h * gY2.h + this.j * gY2.f + this.i * gY2.g;
        arrd[1] = this.h * gY2.j + this.j * gY2.d + this.i * gY2.b;
        arrd[2] = this.h * gY2.i + this.j * gY2.c + this.i * gY2.e;
        arrd[3] = this.f * gY2.h + this.d * gY2.f + this.c * gY2.g;
        arrd[4] = this.f * gY2.j + this.d * gY2.d + this.c * gY2.b;
        arrd[5] = this.f * gY2.i + this.d * gY2.c + this.c * gY2.e;
        arrd[6] = this.g * gY2.h + this.b * gY2.f + this.e * gY2.g;
        arrd[7] = this.g * gY2.j + this.b * gY2.d + this.e * gY2.b;
        arrd[8] = this.g * gY2.i + this.b * gY2.c + this.e * gY2.e;
        gY.b(arrd, arrd3, arrd2);
        this.h = arrd2[0];
        this.j = arrd2[1];
        this.i = arrd2[2];
        this.f = arrd2[3];
        this.d = arrd2[4];
        this.c = arrd2[5];
        this.g = arrd2[6];
        this.b = arrd2[7];
        this.e = arrd2[8];
    }

    public final void g(gY gY2, gY gY3) {
        block4: {
            gY gY4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY2) break block3;
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY3) break block3;
                    this.h = gY2.h * gY3.h + gY2.f * gY3.f + gY2.g * gY3.g;
                    this.j = gY2.h * gY3.j + gY2.f * gY3.d + gY2.g * gY3.b;
                    this.i = gY2.h * gY3.i + gY2.f * gY3.c + gY2.g * gY3.e;
                    this.f = gY2.j * gY3.h + gY2.d * gY3.f + gY2.b * gY3.g;
                    this.d = gY2.j * gY3.j + gY2.d * gY3.d + gY2.b * gY3.b;
                    this.c = gY2.j * gY3.i + gY2.d * gY3.c + gY2.b * gY3.e;
                    this.g = gY2.i * gY3.h + gY2.c * gY3.f + gY2.e * gY3.g;
                    this.b = gY2.i * gY3.j + gY2.c * gY3.d + gY2.e * gY3.b;
                    this.e = gY2.i * gY3.i + gY2.c * gY3.c + gY2.e * gY3.e;
                    if (n2 == 0) break block4;
                }
                gY4 = gY2;
            }
            double d10 = gY4.h * gY3.h + gY2.f * gY3.f + gY2.g * gY3.g;
            double d11 = gY2.h * gY3.j + gY2.f * gY3.d + gY2.g * gY3.b;
            double d12 = gY2.h * gY3.i + gY2.f * gY3.c + gY2.g * gY3.e;
            double d13 = gY2.j * gY3.h + gY2.d * gY3.f + gY2.b * gY3.g;
            double d14 = gY2.j * gY3.j + gY2.d * gY3.d + gY2.b * gY3.b;
            double d15 = gY2.j * gY3.i + gY2.d * gY3.c + gY2.b * gY3.e;
            double d16 = gY2.i * gY3.h + gY2.c * gY3.f + gY2.e * gY3.g;
            double d17 = gY2.i * gY3.j + gY2.c * gY3.d + gY2.e * gY3.b;
            double d18 = gY2.i * gY3.i + gY2.c * gY3.c + gY2.e * gY3.e;
            this.h = d10;
            this.j = d11;
            this.i = d12;
            this.f = d13;
            this.d = d14;
            this.c = d15;
            this.g = d16;
            this.b = d17;
            this.e = d18;
        }
    }

    public final void a(em em2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(em2.d * em2.d + em2.b * em2.b + em2.e * em2.e);
                    int n2 = ae.f();
                    d11 = d12;
                    d10 = 1.110223024E-16;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.h = 1.0;
                    this.j = 0.0;
                    this.i = 0.0;
                    this.f = 0.0;
                    this.d = 1.0;
                    this.c = 0.0;
                    this.g = 0.0;
                    this.b = 0.0;
                    this.e = 1.0;
                    if (n2 != 0) break block4;
                }
                d12 = 1.0 / d12;
                d11 = em2.d;
                d10 = d12;
            }
            double d13 = d11 * d10;
            double d14 = em2.b * d12;
            double d15 = em2.e * d12;
            double d16 = Math.sin(em2.a);
            double d17 = Math.cos(em2.a);
            double d18 = 1.0 - d17;
            double d19 = d13 * d15;
            double d20 = d13 * d14;
            double d21 = d14 * d15;
            this.h = d18 * d13 * d13 + d17;
            this.j = d18 * d20 - d16 * d15;
            this.i = d18 * d19 + d16 * d14;
            this.f = d18 * d20 + d16 * d15;
            this.d = d18 * d14 * d14 + d17;
            this.c = d18 * d21 - d16 * d13;
            this.g = d18 * d19 - d16 * d14;
            this.b = d18 * d21 + d16 * d13;
            this.e = d18 * d15 * d15 + d17;
        }
    }

    public final void d(gY gY2) {
        block4: {
            gY gY3;
            block2: {
                block3: {
                    int n2 = ae.g();
                    gY3 = this;
                    if (n2 != 0) break block2;
                    if (gY3 == gY2) break block3;
                    this.h = gY2.h;
                    this.j = gY2.f;
                    this.i = gY2.g;
                    this.f = gY2.j;
                    this.d = gY2.d;
                    this.c = gY2.b;
                    this.g = gY2.i;
                    this.b = gY2.c;
                    this.e = gY2.e;
                    if (n2 == 0) break block4;
                }
                gY3 = this;
            }
            gY3.b();
        }
    }

    public final void o(double d10) {
        double d11 = Math.sin(d10);
        double d12 = Math.cos(d10);
        this.h = 1.0;
        this.j = 0.0;
        this.i = 0.0;
        this.f = 0.0;
        this.d = d12;
        this.c = -d11;
        this.g = 0.0;
        this.b = d11;
        this.e = d12;
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
                                                                                                                                                        d39 = Math.abs(d28);
                                                                                                                                                        d27 = d12;
                                                                                                                                                        d38 = Math.abs(d12);
                                                                                                                                                        n4 = 1;
                                                                                                                                                        n3 = ae.g();
                                                                                                                                                        double d58 = d38 == d39 ? 0 : (d38 > d39 ? 1 : -1);
                                                                                                                                                        if (n3 == 0) {
                                                                                                                                                            d58 = d58 > 0 ? 1.0 : 0.0;
                                                                                                                                                        }
                                                                                                                                                        d57 = d22 = d58;
                                                                                                                                                        if (n3 != 0) break block33;
                                                                                                                                                        if (d57 == false) break block34;
                                                                                                                                                        d57 = 3;
                                                                                                                                                    }
                                                                                                                                                    n4 = d57;
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
                                                                                                                                                if (n3 != 0) break block35;
                                                                                                                                                if (d56 != false) break block36;
                                                                                                                                                arrd[1] = d38;
                                                                                                                                                arrd[0] = d39;
                                                                                                                                                d20 = 1.0;
                                                                                                                                                d19 = 1.0;
                                                                                                                                                d18 = 0.0;
                                                                                                                                                d17 = 0.0;
                                                                                                                                                if (n3 == 0) break block37;
                                                                                                                                            }
                                                                                                                                            d56 = 1.0;
                                                                                                                                        }
                                                                                                                                        d46 = d56;
                                                                                                                                        d21 = d49 == d39 ? 0 : (d49 > d39 ? 1 : -1);
                                                                                                                                        if (n3 != 0) break block38;
                                                                                                                                        if (d21 <= 0) break block39;
                                                                                                                                        n4 = 2;
                                                                                                                                        double d61 = d39 / d49 - 1.110223024E-16;
                                                                                                                                        d21 = d61 == 0.0 ? 0 : (d61 < 0.0 ? -1 : 1);
                                                                                                                                        if (n3 != 0) break block38;
                                                                                                                                        if (d21 >= 0) break block39;
                                                                                                                                        d46 = 0.0;
                                                                                                                                        d15 = d49;
                                                                                                                                        d55 = d38;
                                                                                                                                        d54 = 1.0;
                                                                                                                                        if (n3 != 0) break block40;
                                                                                                                                        if (!(d55 > d54)) break block41;
                                                                                                                                        d14 = d39 / (d49 / d38);
                                                                                                                                        if (n3 == 0) break block42;
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
                                                                                                                    if (n3 != 0) break block43;
                                                                                                                    if (d21 == false) break block44;
                                                                                                                    d53 = d35 = d39 - d38;
                                                                                                                    d52 = d39;
                                                                                                                    if (n3 != 0) break block45;
                                                                                                                    if (d53 != d52) break block46;
                                                                                                                    d26 = 1.0;
                                                                                                                    if (n3 == 0) break block47;
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
                                                                                                        if (n3 != 0) break block48;
                                                                                                        if (d51 != d50) break block49;
                                                                                                        d31 = Math.abs(d25);
                                                                                                        if (n3 == 0) break block50;
                                                                                                    }
                                                                                                    d51 = d26 * d26;
                                                                                                    d50 = d37;
                                                                                                }
                                                                                                d31 = Math.sqrt(d51 + d50);
                                                                                            }
                                                                                            d23 = (d32 + d31) * 0.5;
                                                                                            d21 = d49 == d39 ? 0 : (d49 > d39 ? 1 : -1);
                                                                                            if (n3 != 0) break block51;
                                                                                            if (d21 <= 0) break block52;
                                                                                            n4 = 2;
                                                                                            double d62 = d39 / d49 - 1.110223024E-16;
                                                                                            d21 = d62 == 0.0 ? 0 : (d62 < 0.0 ? -1 : 1);
                                                                                            if (n3 != 0) break block51;
                                                                                            if (d21 >= 0) break block52;
                                                                                            d46 = 0.0;
                                                                                            d15 = d49;
                                                                                            d48 = d38;
                                                                                            d47 = 1.0;
                                                                                            if (n3 != 0) break block53;
                                                                                            if (!(d48 > d47)) break block54;
                                                                                            d14 = d39 / (d49 / d38);
                                                                                            if (n3 == 0) break block55;
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
                                                                        if (n3 != 0) break block43;
                                                                        if (d21 == false) break block44;
                                                                        d45 = d35 = d39 - d38;
                                                                        d44 = d39;
                                                                        if (n3 != 0) break block56;
                                                                        if (d45 != d44) break block57;
                                                                        d26 = 1.0;
                                                                        if (n3 == 0) break block58;
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
                                                            if (n3 != 0) break block59;
                                                            if (d42 != d41) break block60;
                                                            d31 = Math.abs(d25);
                                                            if (n3 == 0) break block61;
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
                                                if (n3 != 0) break block62;
                                                if (d30 != d29) break block63;
                                                d34 = d26;
                                                d33 = 0.0;
                                                if (n3 != 0) break block64;
                                                if (d34 != d33) break block65;
                                                d24 = gY.c(d40, d28) * gY.c(d16, d36);
                                                if (n3 == 0) break block66;
                                            }
                                            d34 = d36 / gY.c(d35, d28);
                                            d33 = d25 / d24;
                                        }
                                        d24 = d34 + d33;
                                        if (n3 == 0) break block66;
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
                    if (n3 == 0) break block68;
                }
                arrd3[0] = d20;
                arrd2[0] = d18;
                arrd5[0] = d19;
                arrd4[0] = d17;
            }
            int n5 = n4;
            int n6 = 1;
            if (n3 == 0) {
                if (n5 == n6) {
                    d13 = gY.c(d16, arrd5[0]) * gY.c(d16, arrd3[0]) * gY.c(d16, d10);
                }
                n5 = n4;
                n6 = 2;
            }
            if (n3 == 0) {
                if (n5 == n6) {
                    d13 = gY.c(d16, arrd4[0]) * gY.c(d16, arrd3[0]) * gY.c(d16, d11);
                }
                n5 = n4;
                n6 = 3;
            }
            if (n5 == n6) {
                d13 = gY.c(d16, arrd4[0]) * gY.c(d16, arrd2[0]) * gY.c(d16, d12);
            }
            arrd[n2] = gY.c(d15, d13);
            double d63 = d13 * gY.c(d16, d10) * gY.c(d16, d12);
            arrd[n2 + 1] = gY.c(d14, d63);
        }
        return 0;
    }

    public final double m() {
        return this.c;
    }

    public final void g(double d10) {
        this.e = d10;
    }

    public final void a(double d10) {
        this.j = d10;
    }

    public final void l(double d10) {
        this.d = d10;
    }

    public final void a(ao ao2) {
        this.h = 1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b;
        this.f = 2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b);
        this.g = 2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a);
        this.j = 2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b);
        this.d = 1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b;
        this.b = 2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c);
        this.i = 2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a);
        this.c = 2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c);
        this.e = 1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a;
    }

    public final void h(double d10) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.b(arrd2, arrd);
        this.h = arrd[0] * d10;
        this.j = arrd[1] * d10;
        this.i = arrd[2] * d10;
        this.f = arrd[3] * d10;
        this.d = arrd[4] * d10;
        this.c = arrd[5] * d10;
        this.g = arrd[6] * d10;
        this.b = arrd[7] * d10;
        this.e = arrd[8] * d10;
    }

    public final void p(double d10) {
        this.c = d10;
    }

    public final void a(g4 g42) {
        this.h = 1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b;
        this.f = 2.0 * (g42.c * g42.a + g42.d * g42.b);
        this.g = 2.0 * (g42.c * g42.b - g42.d * g42.a);
        this.j = 2.0 * (g42.c * g42.a - g42.d * g42.b);
        this.d = 1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b;
        this.b = 2.0 * (g42.a * g42.b + g42.d * g42.c);
        this.i = 2.0 * (g42.c * g42.b + g42.d * g42.a);
        this.c = 2.0 * (g42.a * g42.b - g42.d * g42.c);
        this.e = 1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a;
    }

    public final void j(gY gY2) {
        double d10 = 1.0 / Math.sqrt(gY2.h * gY2.h + gY2.f * gY2.f + gY2.g * gY2.g);
        this.h = gY2.h * d10;
        this.f = gY2.f * d10;
        this.g = gY2.g * d10;
        d10 = 1.0 / Math.sqrt(gY2.j * gY2.j + gY2.d * gY2.d + gY2.b * gY2.b);
        this.j = gY2.j * d10;
        this.d = gY2.d * d10;
        this.b = gY2.b * d10;
        this.i = this.f * this.b - this.d * this.g;
        this.c = this.j * this.g - this.h * this.b;
        this.e = this.h * this.d - this.j * this.f;
    }

    public final void c(int n2, q q2) {
        block4: {
            block7: {
                int n3;
                int n4;
                int n5;
                block5: {
                    block6: {
                        block2: {
                            block3: {
                                n5 = ae.f();
                                n4 = n2;
                                if (n5 == 0) break block2;
                                if (n4 != 0) break block3;
                                q2.c = this.h;
                                q2.b = this.j;
                                q2.a = this.i;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 == 0) break block5;
                        if (n4 != n3) break block6;
                        q2.c = this.f;
                        q2.b = this.d;
                        q2.a = this.c;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                q2.c = this.g;
                q2.b = this.b;
                q2.a = this.e;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d2"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static double a(double var0, double var2_1, double[] var4_2, double[] var5_3, int var6_4, int var7_5) {
        block11: {
            block15: {
                block10: {
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    var28_6 = 2.002083095183101E-146;
                                    var30_7 = 4.9947976805055876E145;
                                    var8_8 = ae.f();
                                    cfr_temp_0 = var2_1 - 0.0;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var8_8 == 0) break block13;
                                    if (v0 != false) break block14;
                                    var14_9 = 1.0;
                                    var16_10 = 0.0;
                                    var26_11 = var0;
                                    if (var8_8 != 0) break block15;
                                }
                                v1 = var0;
                                if (var8_8 == 0) break block16;
                                cfr_temp_1 = v1 - 0.0;
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                            }
                            if (v0 != false) break block17;
                            var14_9 = 0.0;
                            var16_10 = 1.0;
                            var26_11 = var2_1;
                            if (var8_8 != 0) break block15;
                        }
                        v1 = var0;
                    }
                    var22_12 = v1;
                    var24_13 = var2_1;
                    var19_14 = gY.d(Math.abs(var22_12), Math.abs(var24_13));
                    cfr_temp_2 = var19_14 - 4.9947976805055876E145;
                    v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    if (var8_8 == 0) ** GOTO lbl56
                    if (v2 < 0) ** GOTO lbl51
                    var21_15 = 0;
                    while (var19_14 >= 4.9947976805055876E145) {
                        ++var21_15;
                        v3 = gY.d(Math.abs(var22_12 *= 2.002083095183101E-146), Math.abs(var24_13 *= 2.002083095183101E-146));
                        if (var8_8 != 0) {
                            var19_14 = v3;
                            if (var8_8 != 0) continue;
                        }
                        break block10;
                    }
                    v3 = Math.sqrt(var22_12 * var22_12 + var24_13 * var24_13);
                }
                var26_11 = v3;
                var14_9 = var22_12 / var26_11;
                var16_10 = var24_13 / var26_11;
                var9_16 = var21_15;
                for (var18_17 = 1; var18_17 <= var21_15; var26_11 *= 4.9947976805055876E145, ++var18_17) {
                    block12: {
                        if (var8_8 != 0) {
                            if (var8_8 != 0) continue;
                        }
                        break block11;
lbl51:
                        // 2 sources

                        v4 = var19_14;
                        v5 = 2.002083095183101E-146;
                        if (var8_8 == 0) ** GOTO lbl77
                        cfr_temp_3 = v4 - v5;
                        v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
lbl56:
                        // 2 sources

                        if (v2 > 0) ** GOTO lbl75
                        var21_15 = 0;
                        while (var19_14 <= 2.002083095183101E-146) {
                            ++var21_15;
                            v6 = gY.d(Math.abs(var22_12 *= 4.9947976805055876E145), Math.abs(var24_13 *= 4.9947976805055876E145));
                            if (var8_8 != 0) {
                                var19_14 = v6;
                                if (var8_8 != 0) continue;
                            }
                            break block12;
                        }
                        v6 = Math.sqrt(var22_12 * var22_12 + var24_13 * var24_13);
                    }
                    var26_11 = v6;
                    var14_9 = var22_12 / var26_11;
                    var16_10 = var24_13 / var26_11;
                    var9_16 = var21_15;
                    for (var18_17 = 1; var18_17 <= var21_15; var26_11 *= 2.002083095183101E-146, ++var18_17) {
                        if (var8_8 != 0) {
                            if (var8_8 != 0) continue;
                        }
                        break block11;
lbl75:
                        // 2 sources

                        v4 = var22_12 * var22_12;
                        v5 = var24_13 * var24_13;
lbl77:
                        // 2 sources

                        var26_11 = Math.sqrt(v4 + v5);
                        var14_9 = var22_12 / var26_11;
                        var16_10 = var24_13 / var26_11;
                        break;
                    }
                    break;
                }
                v7 = Math.abs(var0);
                if (var8_8 == 0) return v7;
                if (v7 > Math.abs(var2_1)) {
                    v7 = var14_9;
                    if (var8_8 == 0) return v7;
                    if (v7 < 0.0) {
                        var14_9 = -var14_9;
                        var16_10 = -var16_10;
                        var26_11 = -var26_11;
                    }
                }
            }
            var4_2[var6_4] = var16_10;
            var5_3[var6_4] = var14_9;
        }
        v7 = var26_11;
        return v7;
    }

    public final void l(gY gY2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = gY2.h;
        arrd[1] = gY2.j;
        arrd[2] = gY2.i;
        arrd[3] = gY2.f;
        arrd[4] = gY2.d;
        arrd[5] = gY2.c;
        arrd[6] = gY2.g;
        arrd[7] = gY2.b;
        arrd[8] = gY2.e;
        gY.b(arrd, arrd3, arrd2);
        this.h = arrd2[0];
        this.j = arrd2[1];
        this.i = arrd2[2];
        this.f = arrd2[3];
        this.d = arrd2[4];
        this.c = arrd2[5];
        this.g = arrd2[6];
        this.b = arrd2[7];
        this.e = arrd2[8];
    }

    public final void i(double d10) {
        double d11;
        double d12 = Math.sin(d10);
        this.h = d11 = Math.cos(d10);
        this.j = -d12;
        this.i = 0.0;
        this.f = d12;
        this.d = d11;
        this.c = 0.0;
        this.g = 0.0;
        this.b = 0.0;
        this.e = 1.0;
    }

    public final double g() {
        return this.f;
    }

    public final void m(double d10) {
        this.h = d10;
        this.j = 0.0;
        this.i = 0.0;
        this.f = 0.0;
        this.d = d10;
        this.c = 0.0;
        this.g = 0.0;
        this.b = 0.0;
        this.e = d10;
    }

    public final double r() {
        return this.i;
    }

    public final double i() {
        return this.j;
    }

    public final void n(double d10) {
        this.i = d10;
    }

    public final void f() {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.b(arrd2, arrd);
        this.h = arrd[0];
        this.j = arrd[1];
        this.i = arrd[2];
        this.f = arrd[3];
        this.d = arrd[4];
        this.c = arrd[5];
        this.g = arrd[6];
        this.b = arrd[7];
        this.e = arrd[8];
    }

    public final double q() {
        return this.g;
    }

    public final void f(gY gY2) {
        double d10 = this.h * gY2.h + this.j * gY2.f + this.i * gY2.g;
        double d11 = this.h * gY2.j + this.j * gY2.d + this.i * gY2.b;
        double d12 = this.h * gY2.i + this.j * gY2.c + this.i * gY2.e;
        double d13 = this.f * gY2.h + this.d * gY2.f + this.c * gY2.g;
        double d14 = this.f * gY2.j + this.d * gY2.d + this.c * gY2.b;
        double d15 = this.f * gY2.i + this.d * gY2.c + this.c * gY2.e;
        double d16 = this.g * gY2.h + this.b * gY2.f + this.e * gY2.g;
        double d17 = this.g * gY2.j + this.b * gY2.d + this.e * gY2.b;
        double d18 = this.g * gY2.i + this.b * gY2.c + this.e * gY2.e;
        this.h = d10;
        this.j = d11;
        this.i = d12;
        this.f = d13;
        this.d = d14;
        this.c = d15;
        this.g = d16;
        this.b = d17;
        this.e = d18;
    }

    public final double e() {
        double[] arrd = new double[3];
        double[] arrd2 = new double[9];
        this.b(arrd, arrd2);
        return gY.d(arrd);
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
                                        d22 = gY.b(d29, d30);
                                        d21 = gY.d(d29, d30);
                                        n2 = ae.f();
                                        double d31 = d22 - 0.0;
                                        d26 = d31 == 0.0 ? 0 : (d31 > 0.0 ? 1 : -1);
                                        if (n2 == 0) break block2;
                                        if (d26 != false) break block3;
                                        d13 = 0.0;
                                        d28 = d21;
                                        d27 = 0.0;
                                        if (n2 == 0) break block4;
                                        if (d28 == d27) break block5;
                                        d28 = gY.b(d21, d25);
                                        d27 = gY.d(d21, d25);
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

    static double d(double[] arrd) {
        double d10;
        block8: {
            double d11;
            block7: {
                int n2 = ae.f();
                double d12 = arrd[0] - arrd[1];
                d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                if (n2 == 0) break block7;
                if (d11 > 0) {
                    double d13 = arrd[0];
                    if (n2 != 0) {
                        if (d13 > arrd[2]) {
                            return arrd[0];
                        }
                        d13 = arrd[2];
                    }
                    return d13;
                }
                d10 = arrd[1];
                if (n2 == 0) break block8;
                double d14 = d10 - arrd[2];
                d11 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            }
            if (d11 > 0) {
                return arrd[1];
            }
            d10 = arrd[2];
        }
        return d10;
    }

    public final void h() {
        this.h = 0.0;
        this.j = 0.0;
        this.i = 0.0;
        this.f = 0.0;
        this.d = 0.0;
        this.c = 0.0;
        this.g = 0.0;
        this.b = 0.0;
        this.e = 0.0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final double a(int var1_1, int var2_2) {
        var3_3 = ae.g();
        v0 = var1_1;
        if (var3_3 != 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        return this.h;
                    }
                    case 1: {
                        return this.j;
                    }
                    case 2: {
                        return this.i;
                    }
                }
                if (var3_3 == 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d1"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        return this.f;
                    }
                    case 1: {
                        return this.d;
                    }
                    case 2: {
                        return this.c;
                    }
                }
                if (var3_3 == 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d1"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        return this.g;
                    }
                    case 1: {
                        return this.b;
                    }
                    case 2: {
                        return this.e;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d1"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d1"));
    }

    static int a(double[] arrd, double[] arrd2, double[] arrd3, double[] arrd4) {
        block17: {
            double d10;
            double d11;
            double[] arrd5;
            double[] arrd6;
            double[] arrd7;
            double[] arrd8;
            block15: {
                int n2;
                block16: {
                    int n3;
                    block7: {
                        double d12;
                        int n4;
                        int n5;
                        int n6;
                        double d13;
                        block10: {
                            int n7;
                            block11: {
                                double d14;
                                block8: {
                                    block9: {
                                        arrd8 = new double[2];
                                        arrd7 = new double[2];
                                        arrd6 = new double[2];
                                        arrd5 = new double[2];
                                        double[] arrd9 = new double[9];
                                        int n8 = 10;
                                        double d15 = 4.89E-15;
                                        d13 = 1.0;
                                        double d16 = -1.0;
                                        n6 = 0;
                                        n5 = 1;
                                        n3 = ae.g();
                                        double d17 = Math.abs(arrd2[1]) - 4.89E-15;
                                        d14 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                        if (n3 != 0) break block8;
                                        if (d14 < 0) break block9;
                                        double d18 = Math.abs(arrd2[0]) - 4.89E-15;
                                        n7 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                        if (n3 != 0) break block10;
                                        if (n7 >= 0) break block11;
                                    }
                                    d14 = 1.0;
                                }
                                n6 = d14;
                            }
                            n7 = n4 = 0;
                        }
                        while (n4 < 10) {
                            block14: {
                                double d19;
                                block12: {
                                    block13: {
                                        n2 = n6;
                                        if (n3 != 0 || n3 != 0) break block7;
                                        if (n2 != 0) break;
                                        double d20 = gY.a(arrd[1], arrd2[1], arrd[2]);
                                        double d21 = (Math.abs(arrd[0]) - d20) * (gY.c(d13, arrd[0]) + d20 / arrd[0]);
                                        double d22 = arrd2[0];
                                        double d23 = gY.a(d21, d22, arrd5, arrd7, 0, n5);
                                        d21 = arrd7[0] * arrd[0] + arrd5[0] * arrd2[0];
                                        arrd2[0] = arrd7[0] * arrd2[0] - arrd5[0] * arrd[0];
                                        d22 = arrd5[0] * arrd[1];
                                        arrd[1] = arrd7[0] * arrd[1];
                                        d23 = gY.a(d21, d22, arrd6, arrd8, 0, n5);
                                        n5 = 0;
                                        arrd[0] = d23;
                                        d21 = arrd8[0] * arrd2[0] + arrd6[0] * arrd[1];
                                        arrd[1] = arrd8[0] * arrd[1] - arrd6[0] * arrd2[0];
                                        d22 = arrd6[0] * arrd2[1];
                                        arrd2[1] = arrd8[0] * arrd2[1];
                                        arrd2[0] = d23 = gY.a(d21, d22, arrd5, arrd7, 1, n5);
                                        d21 = arrd7[1] * arrd[1] + arrd5[1] * arrd2[1];
                                        arrd2[1] = arrd7[1] * arrd2[1] - arrd5[1] * arrd[1];
                                        d22 = arrd5[1] * arrd[2];
                                        arrd[2] = arrd7[1] * arrd[2];
                                        arrd[1] = d23 = gY.a(d21, d22, arrd6, arrd8, 1, n5);
                                        d21 = arrd8[1] * arrd2[1] + arrd6[1] * arrd[2];
                                        arrd[2] = arrd8[1] * arrd[2] - arrd6[1] * arrd2[1];
                                        arrd2[1] = d21;
                                        d11 = arrd3[0];
                                        arrd3[0] = arrd8[0] * d11 + arrd6[0] * arrd3[3];
                                        arrd3[3] = -arrd6[0] * d11 + arrd8[0] * arrd3[3];
                                        d11 = arrd3[1];
                                        arrd3[1] = arrd8[0] * d11 + arrd6[0] * arrd3[4];
                                        arrd3[4] = -arrd6[0] * d11 + arrd8[0] * arrd3[4];
                                        d11 = arrd3[2];
                                        arrd3[2] = arrd8[0] * d11 + arrd6[0] * arrd3[5];
                                        arrd3[5] = -arrd6[0] * d11 + arrd8[0] * arrd3[5];
                                        d11 = arrd3[3];
                                        arrd3[3] = arrd8[1] * d11 + arrd6[1] * arrd3[6];
                                        arrd3[6] = -arrd6[1] * d11 + arrd8[1] * arrd3[6];
                                        d11 = arrd3[4];
                                        arrd3[4] = arrd8[1] * d11 + arrd6[1] * arrd3[7];
                                        arrd3[7] = -arrd6[1] * d11 + arrd8[1] * arrd3[7];
                                        d11 = arrd3[5];
                                        arrd3[5] = arrd8[1] * d11 + arrd6[1] * arrd3[8];
                                        arrd3[8] = -arrd6[1] * d11 + arrd8[1] * arrd3[8];
                                        d10 = arrd4[0];
                                        arrd4[0] = arrd7[0] * d10 + arrd5[0] * arrd4[1];
                                        arrd4[1] = -arrd5[0] * d10 + arrd7[0] * arrd4[1];
                                        d10 = arrd4[3];
                                        arrd4[3] = arrd7[0] * d10 + arrd5[0] * arrd4[4];
                                        arrd4[4] = -arrd5[0] * d10 + arrd7[0] * arrd4[4];
                                        d10 = arrd4[6];
                                        arrd4[6] = arrd7[0] * d10 + arrd5[0] * arrd4[7];
                                        arrd4[7] = -arrd5[0] * d10 + arrd7[0] * arrd4[7];
                                        d10 = arrd4[1];
                                        arrd4[1] = arrd7[1] * d10 + arrd5[1] * arrd4[2];
                                        arrd4[2] = -arrd5[1] * d10 + arrd7[1] * arrd4[2];
                                        d10 = arrd4[4];
                                        arrd4[4] = arrd7[1] * d10 + arrd5[1] * arrd4[5];
                                        arrd4[5] = -arrd5[1] * d10 + arrd7[1] * arrd4[5];
                                        d10 = arrd4[7];
                                        arrd4[7] = arrd7[1] * d10 + arrd5[1] * arrd4[8];
                                        arrd4[8] = -arrd5[1] * d10 + arrd7[1] * arrd4[8];
                                        arrd9[0] = arrd[0];
                                        arrd9[1] = arrd2[0];
                                        arrd9[2] = 0.0;
                                        arrd9[3] = 0.0;
                                        arrd9[4] = arrd[1];
                                        arrd9[5] = arrd2[1];
                                        arrd9[6] = 0.0;
                                        arrd9[7] = 0.0;
                                        arrd9[8] = arrd[2];
                                        double d24 = Math.abs(arrd2[1]) - 4.89E-15;
                                        d19 = d24 == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                                        if (n3 != 0) break block12;
                                        if (d19 < 0) break block13;
                                        double d25 = Math.abs(arrd2[0]) - 4.89E-15;
                                        d19 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                                        if (n3 != 0) break block12;
                                        if (d19 >= 0) break block14;
                                    }
                                    d19 = 1.0;
                                }
                                n6 = (int)d19;
                            }
                            ++n4;
                            if (n3 == 0) continue;
                        }
                        n2 = (d12 = Math.abs(arrd2[1]) - 4.89E-15) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (n3 != 0) break block15;
                    if (n2 >= 0) break block16;
                    gY.a(arrd[0], arrd2[0], arrd[1], arrd, arrd6, arrd8, arrd5, arrd7, 0);
                    d11 = arrd3[0];
                    arrd3[0] = arrd8[0] * d11 + arrd6[0] * arrd3[3];
                    arrd3[3] = -arrd6[0] * d11 + arrd8[0] * arrd3[3];
                    d11 = arrd3[1];
                    arrd3[1] = arrd8[0] * d11 + arrd6[0] * arrd3[4];
                    arrd3[4] = -arrd6[0] * d11 + arrd8[0] * arrd3[4];
                    d11 = arrd3[2];
                    arrd3[2] = arrd8[0] * d11 + arrd6[0] * arrd3[5];
                    arrd3[5] = -arrd6[0] * d11 + arrd8[0] * arrd3[5];
                    d10 = arrd4[0];
                    arrd4[0] = arrd7[0] * d10 + arrd5[0] * arrd4[1];
                    arrd4[1] = -arrd5[0] * d10 + arrd7[0] * arrd4[1];
                    d10 = arrd4[3];
                    arrd4[3] = arrd7[0] * d10 + arrd5[0] * arrd4[4];
                    arrd4[4] = -arrd5[0] * d10 + arrd7[0] * arrd4[4];
                    d10 = arrd4[6];
                    arrd4[6] = arrd7[0] * d10 + arrd5[0] * arrd4[7];
                    arrd4[7] = -arrd5[0] * d10 + arrd7[0] * arrd4[7];
                    if (n3 == 0) break block17;
                }
                n2 = gY.a(arrd[1], arrd2[1], arrd[2], arrd, arrd6, arrd8, arrd5, arrd7, 1);
            }
            d11 = arrd3[3];
            arrd3[3] = arrd8[0] * d11 + arrd6[0] * arrd3[6];
            arrd3[6] = -arrd6[0] * d11 + arrd8[0] * arrd3[6];
            d11 = arrd3[4];
            arrd3[4] = arrd8[0] * d11 + arrd6[0] * arrd3[7];
            arrd3[7] = -arrd6[0] * d11 + arrd8[0] * arrd3[7];
            d11 = arrd3[5];
            arrd3[5] = arrd8[0] * d11 + arrd6[0] * arrd3[8];
            arrd3[8] = -arrd6[0] * d11 + arrd8[0] * arrd3[8];
            d10 = arrd4[1];
            arrd4[1] = arrd7[0] * d10 + arrd5[0] * arrd4[2];
            arrd4[2] = -arrd5[0] * d10 + arrd7[0] * arrd4[2];
            d10 = arrd4[4];
            arrd4[4] = arrd7[0] * d10 + arrd5[0] * arrd4[5];
            arrd4[5] = -arrd5[0] * d10 + arrd7[0] * arrd4[5];
            d10 = arrd4[7];
            arrd4[7] = arrd7[0] * d10 + arrd5[0] * arrd4[8];
            arrd4[8] = -arrd5[0] * d10 + arrd7[0] * arrd4[8];
        }
        return 0;
    }

    static void b(double[] arrd) {
        int n2 = ae.f();
        for (int i2 = 0; i2 < 3; ++i2) {
            System.out.println(arrd[i2 * 3 + 0] + " " + arrd[i2 * 3 + 1] + " " + arrd[i2 * 3 + 2] + "\n");
            if (n2 != 0) continue;
        }
    }

    public final void f(gY gY2, gY gY3) {
        block4: {
            gY gY4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    gY4 = this;
                    if (n2 == 0) break block2;
                    if (gY4 == gY2) break block3;
                    gY4 = this;
                    if (n2 == 0) break block2;
                    if (gY4 == gY3) break block3;
                    this.h = gY2.h * gY3.h + gY2.f * gY3.j + gY2.g * gY3.i;
                    this.j = gY2.h * gY3.f + gY2.f * gY3.d + gY2.g * gY3.c;
                    this.i = gY2.h * gY3.g + gY2.f * gY3.b + gY2.g * gY3.e;
                    this.f = gY2.j * gY3.h + gY2.d * gY3.j + gY2.b * gY3.i;
                    this.d = gY2.j * gY3.f + gY2.d * gY3.d + gY2.b * gY3.c;
                    this.c = gY2.j * gY3.g + gY2.d * gY3.b + gY2.b * gY3.e;
                    this.g = gY2.i * gY3.h + gY2.c * gY3.j + gY2.e * gY3.i;
                    this.b = gY2.i * gY3.f + gY2.c * gY3.d + gY2.e * gY3.c;
                    this.e = gY2.i * gY3.g + gY2.c * gY3.b + gY2.e * gY3.e;
                    if (n2 != 0) break block4;
                }
                gY4 = gY2;
            }
            double d10 = gY4.h * gY3.h + gY2.f * gY3.j + gY2.g * gY3.i;
            double d11 = gY2.h * gY3.f + gY2.f * gY3.d + gY2.g * gY3.c;
            double d12 = gY2.h * gY3.g + gY2.f * gY3.b + gY2.g * gY3.e;
            double d13 = gY2.j * gY3.h + gY2.d * gY3.j + gY2.b * gY3.i;
            double d14 = gY2.j * gY3.f + gY2.d * gY3.d + gY2.b * gY3.c;
            double d15 = gY2.j * gY3.g + gY2.d * gY3.b + gY2.b * gY3.e;
            double d16 = gY2.i * gY3.h + gY2.c * gY3.j + gY2.e * gY3.i;
            double d17 = gY2.i * gY3.f + gY2.c * gY3.d + gY2.e * gY3.c;
            double d18 = gY2.i * gY3.g + gY2.c * gY3.b + gY2.e * gY3.e;
            this.h = d10;
            this.j = d11;
            this.i = d12;
            this.f = d13;
            this.d = d14;
            this.c = d15;
            this.g = d16;
            this.b = d17;
            this.e = d18;
        }
    }

    public final void k(gY gY2) {
        this.b(gY2);
    }

    public final void a(int n2, double[] arrd) {
        block4: {
            block7: {
                int n3;
                int n4;
                int n5;
                block5: {
                    block6: {
                        block2: {
                            block3: {
                                n5 = ae.f();
                                n4 = n2;
                                if (n5 == 0) break block2;
                                if (n4 != 0) break block3;
                                arrd[0] = this.h;
                                arrd[1] = this.f;
                                arrd[2] = this.g;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 == 0) break block5;
                        if (n4 != n3) break block6;
                        arrd[0] = this.j;
                        arrd[1] = this.d;
                        arrd[2] = this.b;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                arrd[0] = this.i;
                arrd[1] = this.c;
                arrd[2] = this.e;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d4"));
        }
    }

    public final void f(double d10) {
        this.h *= d10;
        this.j *= d10;
        this.i *= d10;
        this.f *= d10;
        this.d *= d10;
        this.c *= d10;
        this.g *= d10;
        this.b *= d10;
        this.e *= d10;
    }

    public final void b(gY gY2, gY gY3) {
        this.h = gY2.h - gY3.h;
        this.j = gY2.j - gY3.j;
        this.i = gY2.i - gY3.i;
        this.f = gY2.f - gY3.f;
        this.d = gY2.d - gY3.d;
        this.c = gY2.c - gY3.c;
        this.g = gY2.g - gY3.g;
        this.b = gY2.b - gY3.b;
        this.e = gY2.e - gY3.e;
    }

    /*
     * Exception decompiling
     */
    static void a(double[] var0, int[] var1_1, double[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[SIMPLE_IF_TAKEN]], but top level block is 2[FORLOOP]
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(int var1_1, q var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2.c;
                this.f = var2_2.b;
                this.g = var2_2.a;
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.j = var2_2.c;
                this.d = var2_2.b;
                this.b = var2_2.a;
                if (var3_3 != 0) return;
            }
            case 2: {
                this.i = var2_2.c;
                this.c = var2_2.b;
                this.e = var2_2.a;
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d9"));
    }

    public final void b(int n2, double[] arrd) {
        block4: {
            block7: {
                int n3;
                int n4;
                int n5;
                block5: {
                    block6: {
                        block2: {
                            block3: {
                                n5 = ae.f();
                                n4 = n2;
                                if (n5 == 0) break block2;
                                if (n4 != 0) break block3;
                                arrd[0] = this.h;
                                arrd[1] = this.j;
                                arrd[2] = this.i;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 == 0) break block5;
                        if (n4 != n3) break block6;
                        arrd[0] = this.f;
                        arrd[1] = this.d;
                        arrd[2] = this.c;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                arrd[0] = this.g;
                arrd[1] = this.b;
                arrd[2] = this.e;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d2"));
        }
    }

    static void a(double[] arrd, double[] arrd2, double[] arrd3) {
        double[] arrd4 = new double[9];
        arrd4[0] = arrd[0] * arrd2[0] + arrd[1] * arrd2[3] + arrd[2] * arrd2[6];
        arrd4[1] = arrd[0] * arrd2[1] + arrd[1] * arrd2[4] + arrd[2] * arrd2[7];
        arrd4[2] = arrd[0] * arrd2[2] + arrd[1] * arrd2[5] + arrd[2] * arrd2[8];
        arrd4[3] = arrd[3] * arrd2[0] + arrd[4] * arrd2[3] + arrd[5] * arrd2[6];
        arrd4[4] = arrd[3] * arrd2[1] + arrd[4] * arrd2[4] + arrd[5] * arrd2[7];
        int n2 = ae.f();
        arrd4[5] = arrd[3] * arrd2[2] + arrd[4] * arrd2[5] + arrd[5] * arrd2[8];
        arrd4[6] = arrd[6] * arrd2[0] + arrd[7] * arrd2[3] + arrd[8] * arrd2[6];
        arrd4[7] = arrd[6] * arrd2[1] + arrd[7] * arrd2[4] + arrd[8] * arrd2[7];
        arrd4[8] = arrd[6] * arrd2[2] + arrd[7] * arrd2[5] + arrd[8] * arrd2[8];
        for (int i2 = 0; i2 < 9; ++i2) {
            arrd3[i2] = arrd4[i2];
            if (n2 != 0) continue;
        }
    }

    public final double k() {
        return this.b;
    }

    static void a(double[] arrd, double[] arrd2) {
        arrd2[0] = arrd[0];
        arrd2[1] = arrd[3];
        arrd2[2] = arrd[6];
        arrd2[3] = arrd[1];
        arrd2[4] = arrd[4];
        arrd2[5] = arrd[7];
        arrd2[6] = arrd[2];
        arrd2[7] = arrd[5];
        arrd2[8] = arrd[8];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, double var2_2, double var4_3, double var6_4) {
        var8_5 = ae.g();
        if (var8_5 != 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2;
                this.f = var4_3;
                this.g = var6_4;
lbl8:
                // 2 sources

                if (var8_5 == 0) return;
            }
            case 1: {
                this.j = var2_2;
                this.d = var4_3;
                this.b = var6_4;
                if (var8_5 == 0) return;
            }
            case 2: {
                this.i = var2_2;
                this.c = var4_3;
                this.e = var6_4;
                if (var8_5 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d9"));
    }

    public Object clone() {
        gY gY2 = null;
        try {
            gY2 = (gY)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        return gY2;
    }

    public final void e(double d10) {
        this.f = d10;
    }

    static double d(double d10, double d11) {
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

    static void b(double[] arrd, double[] arrd2, double[] arrd3) {
        double[] arrd4;
        double[] arrd5;
        double[] arrd6;
        double[] arrd7;
        block50: {
            double[] arrd8;
            double[] arrd9;
            block51: {
                int n2;
                double[] arrd10;
                int n3;
                block52: {
                    int n4;
                    block53: {
                        int n5;
                        block30: {
                            double[] arrd11;
                            block48: {
                                double d10;
                                double[] arrd12;
                                block49: {
                                    block45: {
                                        double d11;
                                        double d12;
                                        double d13;
                                        double[] arrd13;
                                        block46: {
                                            block47: {
                                                double d14;
                                                block44: {
                                                    double d15;
                                                    block41: {
                                                        double d16;
                                                        double d17;
                                                        block42: {
                                                            block43: {
                                                                double d18;
                                                                block39: {
                                                                    block40: {
                                                                        double d19;
                                                                        block36: {
                                                                            double d20;
                                                                            double d21;
                                                                            block37: {
                                                                                block38: {
                                                                                    double d22;
                                                                                    block35: {
                                                                                        double d23;
                                                                                        block32: {
                                                                                            double d24;
                                                                                            double d25;
                                                                                            block33: {
                                                                                                block34: {
                                                                                                    double d26;
                                                                                                    block31: {
                                                                                                        block29: {
                                                                                                            double d27;
                                                                                                            arrd9 = new double[9];
                                                                                                            arrd8 = new double[9];
                                                                                                            arrd7 = new double[9];
                                                                                                            n3 = ae.f();
                                                                                                            arrd6 = new double[9];
                                                                                                            arrd13 = arrd7;
                                                                                                            arrd11 = arrd6;
                                                                                                            arrd10 = new double[9];
                                                                                                            arrd12 = new double[3];
                                                                                                            arrd5 = new double[3];
                                                                                                            n5 = 0;
                                                                                                            for (n2 = 0; n2 < 9; ++n2) {
                                                                                                                arrd10[n2] = arrd[n2];
                                                                                                                if (n3 != 0) {
                                                                                                                    if (n3 != 0) continue;
                                                                                                                }
                                                                                                                break block29;
                                                                                                            }
                                                                                                            d26 = (d27 = arrd[3] * arrd[3] - 1.110223024E-16) == 0.0 ? 0 : (d27 < 0.0 ? -1 : 1);
                                                                                                            if (n3 == 0) break block31;
                                                                                                            if (d26 >= 0) break block29;
                                                                                                            arrd9[0] = 1.0;
                                                                                                            arrd9[1] = 0.0;
                                                                                                            arrd9[2] = 0.0;
                                                                                                            arrd9[3] = 0.0;
                                                                                                            arrd9[4] = 1.0;
                                                                                                            arrd9[5] = 0.0;
                                                                                                            arrd9[6] = 0.0;
                                                                                                            arrd9[7] = 0.0;
                                                                                                            arrd9[8] = 1.0;
                                                                                                            if (n3 != 0) break block32;
                                                                                                        }
                                                                                                        d25 = arrd[0] * arrd[0];
                                                                                                        d24 = 1.110223024E-16;
                                                                                                        if (n3 == 0) break block33;
                                                                                                        double d28 = d25 - d24;
                                                                                                        d26 = d28 == 0.0 ? 0 : (d28 < 0.0 ? -1 : 1);
                                                                                                    }
                                                                                                    if (d26 >= 0) break block34;
                                                                                                    arrd13[0] = arrd[0];
                                                                                                    arrd13[1] = arrd[1];
                                                                                                    arrd13[2] = arrd[2];
                                                                                                    arrd[0] = arrd[3];
                                                                                                    arrd[1] = arrd[4];
                                                                                                    arrd[2] = arrd[5];
                                                                                                    arrd[3] = -arrd13[0];
                                                                                                    arrd[4] = -arrd13[1];
                                                                                                    arrd[5] = -arrd13[2];
                                                                                                    arrd9[0] = 0.0;
                                                                                                    arrd9[1] = 1.0;
                                                                                                    arrd9[2] = 0.0;
                                                                                                    arrd9[3] = -1.0;
                                                                                                    arrd9[4] = 0.0;
                                                                                                    arrd9[5] = 0.0;
                                                                                                    arrd9[6] = 0.0;
                                                                                                    arrd9[7] = 0.0;
                                                                                                    arrd9[8] = 1.0;
                                                                                                    if (n3 != 0) break block32;
                                                                                                }
                                                                                                d25 = 1.0;
                                                                                                d24 = Math.sqrt(arrd[0] * arrd[0] + arrd[3] * arrd[3]);
                                                                                            }
                                                                                            d13 = d25 / d24;
                                                                                            double d29 = arrd[0] * d13;
                                                                                            double d30 = arrd[3] * d13;
                                                                                            arrd13[0] = d29 * arrd[0] + d30 * arrd[3];
                                                                                            arrd13[1] = d29 * arrd[1] + d30 * arrd[4];
                                                                                            arrd13[2] = d29 * arrd[2] + d30 * arrd[5];
                                                                                            arrd[3] = -d30 * arrd[0] + d29 * arrd[3];
                                                                                            arrd[4] = -d30 * arrd[1] + d29 * arrd[4];
                                                                                            arrd[5] = -d30 * arrd[2] + d29 * arrd[5];
                                                                                            arrd[0] = arrd13[0];
                                                                                            arrd[1] = arrd13[1];
                                                                                            arrd[2] = arrd13[2];
                                                                                            arrd9[0] = d29;
                                                                                            arrd9[1] = d30;
                                                                                            arrd9[2] = 0.0;
                                                                                            arrd9[3] = -d30;
                                                                                            arrd9[4] = d29;
                                                                                            arrd9[5] = 0.0;
                                                                                            arrd9[6] = 0.0;
                                                                                            arrd9[7] = 0.0;
                                                                                            arrd9[8] = 1.0;
                                                                                        }
                                                                                        d22 = (d23 = arrd[6] * arrd[6] - 1.110223024E-16) == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                                                                                        if (n3 == 0) break block35;
                                                                                        if (d22 < 0) break block36;
                                                                                        d21 = arrd[0] * arrd[0];
                                                                                        d20 = 1.110223024E-16;
                                                                                        if (n3 == 0) break block37;
                                                                                        double d31 = d21 - d20;
                                                                                        d22 = d31 == 0.0 ? 0 : (d31 < 0.0 ? -1 : 1);
                                                                                    }
                                                                                    if (d22 >= 0) break block38;
                                                                                    arrd13[0] = arrd[0];
                                                                                    arrd13[1] = arrd[1];
                                                                                    arrd13[2] = arrd[2];
                                                                                    arrd[0] = arrd[6];
                                                                                    arrd[1] = arrd[7];
                                                                                    arrd[2] = arrd[8];
                                                                                    arrd[6] = -arrd13[0];
                                                                                    arrd[7] = -arrd13[1];
                                                                                    arrd[8] = -arrd13[2];
                                                                                    arrd13[0] = arrd9[0];
                                                                                    arrd13[1] = arrd9[1];
                                                                                    arrd13[2] = arrd9[2];
                                                                                    arrd9[0] = arrd9[6];
                                                                                    arrd9[1] = arrd9[7];
                                                                                    arrd9[2] = arrd9[8];
                                                                                    arrd9[6] = -arrd13[0];
                                                                                    arrd9[7] = -arrd13[1];
                                                                                    arrd9[8] = -arrd13[2];
                                                                                    if (n3 != 0) break block36;
                                                                                }
                                                                                d21 = 1.0;
                                                                                d20 = Math.sqrt(arrd[0] * arrd[0] + arrd[6] * arrd[6]);
                                                                            }
                                                                            d13 = d21 / d20;
                                                                            double d32 = arrd[0] * d13;
                                                                            double d33 = arrd[6] * d13;
                                                                            arrd13[0] = d32 * arrd[0] + d33 * arrd[6];
                                                                            arrd13[1] = d32 * arrd[1] + d33 * arrd[7];
                                                                            arrd13[2] = d32 * arrd[2] + d33 * arrd[8];
                                                                            arrd[6] = -d33 * arrd[0] + d32 * arrd[6];
                                                                            arrd[7] = -d33 * arrd[1] + d32 * arrd[7];
                                                                            arrd[8] = -d33 * arrd[2] + d32 * arrd[8];
                                                                            arrd[0] = arrd13[0];
                                                                            arrd[1] = arrd13[1];
                                                                            arrd[2] = arrd13[2];
                                                                            arrd13[0] = d32 * arrd9[0];
                                                                            arrd13[1] = d32 * arrd9[1];
                                                                            arrd9[2] = d33;
                                                                            arrd13[6] = -arrd9[0] * d33;
                                                                            arrd13[7] = -arrd9[1] * d33;
                                                                            arrd9[8] = d32;
                                                                            arrd9[0] = arrd13[0];
                                                                            arrd9[1] = arrd13[1];
                                                                            arrd9[6] = arrd13[6];
                                                                            arrd9[7] = arrd13[7];
                                                                        }
                                                                        d18 = (d19 = arrd[2] * arrd[2] - 1.110223024E-16) == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                                                        if (n3 == 0) break block39;
                                                                        if (d18 >= 0) break block40;
                                                                        arrd8[0] = 1.0;
                                                                        arrd8[1] = 0.0;
                                                                        arrd8[2] = 0.0;
                                                                        arrd8[3] = 0.0;
                                                                        arrd8[4] = 1.0;
                                                                        arrd8[5] = 0.0;
                                                                        arrd8[6] = 0.0;
                                                                        arrd8[7] = 0.0;
                                                                        arrd8[8] = 1.0;
                                                                        if (n3 != 0) break block41;
                                                                    }
                                                                    d17 = arrd[1] * arrd[1];
                                                                    d16 = 1.110223024E-16;
                                                                    if (n3 == 0) break block42;
                                                                    double d34 = d17 - d16;
                                                                    d18 = d34 == 0.0 ? 0 : (d34 < 0.0 ? -1 : 1);
                                                                }
                                                                if (d18 >= 0) break block43;
                                                                arrd13[2] = arrd[2];
                                                                arrd13[5] = arrd[5];
                                                                arrd13[8] = arrd[8];
                                                                arrd[2] = -arrd[1];
                                                                arrd[5] = -arrd[4];
                                                                arrd[8] = -arrd[7];
                                                                arrd[1] = arrd13[2];
                                                                arrd[4] = arrd13[5];
                                                                arrd[7] = arrd13[8];
                                                                arrd8[0] = 1.0;
                                                                arrd8[1] = 0.0;
                                                                arrd8[2] = 0.0;
                                                                arrd8[3] = 0.0;
                                                                arrd8[4] = 0.0;
                                                                arrd8[5] = -1.0;
                                                                arrd8[6] = 0.0;
                                                                arrd8[7] = 1.0;
                                                                arrd8[8] = 0.0;
                                                                if (n3 != 0) break block41;
                                                            }
                                                            d17 = 1.0;
                                                            d16 = Math.sqrt(arrd[1] * arrd[1] + arrd[2] * arrd[2]);
                                                        }
                                                        d13 = d17 / d16;
                                                        double d35 = arrd[1] * d13;
                                                        double d36 = arrd[2] * d13;
                                                        arrd13[1] = d35 * arrd[1] + d36 * arrd[2];
                                                        arrd[2] = -d36 * arrd[1] + d35 * arrd[2];
                                                        arrd[1] = arrd13[1];
                                                        arrd13[4] = d35 * arrd[4] + d36 * arrd[5];
                                                        arrd[5] = -d36 * arrd[4] + d35 * arrd[5];
                                                        arrd[4] = arrd13[4];
                                                        arrd13[7] = d35 * arrd[7] + d36 * arrd[8];
                                                        arrd[8] = -d36 * arrd[7] + d35 * arrd[8];
                                                        arrd[7] = arrd13[7];
                                                        arrd8[0] = 1.0;
                                                        arrd8[1] = 0.0;
                                                        arrd8[2] = 0.0;
                                                        arrd8[3] = 0.0;
                                                        arrd8[4] = d35;
                                                        arrd8[5] = -d36;
                                                        arrd8[6] = 0.0;
                                                        arrd8[7] = d36;
                                                        arrd8[8] = d35;
                                                    }
                                                    d14 = (d15 = arrd[7] * arrd[7] - 1.110223024E-16) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                                    if (n3 == 0) break block44;
                                                    if (d14 < 0) break block45;
                                                    d12 = arrd[4] * arrd[4];
                                                    d11 = 1.110223024E-16;
                                                    if (n3 == 0) break block46;
                                                    double d37 = d12 - d11;
                                                    d14 = d37 == 0.0 ? 0 : (d37 < 0.0 ? -1 : 1);
                                                }
                                                if (d14 >= 0) break block47;
                                                arrd13[3] = arrd[3];
                                                arrd13[4] = arrd[4];
                                                arrd13[5] = arrd[5];
                                                arrd[3] = arrd[6];
                                                arrd[4] = arrd[7];
                                                arrd[5] = arrd[8];
                                                arrd[6] = -arrd13[3];
                                                arrd[7] = -arrd13[4];
                                                arrd[8] = -arrd13[5];
                                                arrd13[3] = arrd9[3];
                                                arrd13[4] = arrd9[4];
                                                arrd13[5] = arrd9[5];
                                                arrd9[3] = arrd9[6];
                                                arrd9[4] = arrd9[7];
                                                arrd9[5] = arrd9[8];
                                                arrd9[6] = -arrd13[3];
                                                arrd9[7] = -arrd13[4];
                                                arrd9[8] = -arrd13[5];
                                                if (n3 != 0) break block45;
                                            }
                                            d12 = 1.0;
                                            d11 = Math.sqrt(arrd[4] * arrd[4] + arrd[7] * arrd[7]);
                                        }
                                        d13 = d12 / d11;
                                        double d38 = arrd[4] * d13;
                                        double d39 = arrd[7] * d13;
                                        arrd13[3] = d38 * arrd[3] + d39 * arrd[6];
                                        arrd[6] = -d39 * arrd[3] + d38 * arrd[6];
                                        arrd[3] = arrd13[3];
                                        arrd13[4] = d38 * arrd[4] + d39 * arrd[7];
                                        arrd[7] = -d39 * arrd[4] + d38 * arrd[7];
                                        arrd[4] = arrd13[4];
                                        arrd13[5] = d38 * arrd[5] + d39 * arrd[8];
                                        arrd[8] = -d39 * arrd[5] + d38 * arrd[8];
                                        arrd[5] = arrd13[5];
                                        arrd13[3] = d38 * arrd9[3] + d39 * arrd9[6];
                                        arrd9[6] = -d39 * arrd9[3] + d38 * arrd9[6];
                                        arrd9[3] = arrd13[3];
                                        arrd13[4] = d38 * arrd9[4] + d39 * arrd9[7];
                                        arrd9[7] = -d39 * arrd9[4] + d38 * arrd9[7];
                                        arrd9[4] = arrd13[4];
                                        arrd13[5] = d38 * arrd9[5] + d39 * arrd9[8];
                                        arrd9[8] = -d39 * arrd9[5] + d38 * arrd9[8];
                                        arrd9[5] = arrd13[5];
                                    }
                                    arrd11[0] = arrd[0];
                                    arrd11[1] = arrd[4];
                                    arrd11[2] = arrd[8];
                                    arrd12[0] = arrd[1];
                                    arrd12[1] = arrd[5];
                                    double d40 = arrd12[0] * arrd12[0] - 1.110223024E-16;
                                    d10 = d40 == 0.0 ? 0 : (d40 < 0.0 ? -1 : 1);
                                    if (n3 == 0) break block48;
                                    if (d10 >= 0) break block49;
                                    double d41 = arrd12[1] * arrd12[1] - 1.110223024E-16;
                                    d10 = d41 == 0.0 ? 0 : (d41 < 0.0 ? -1 : 1);
                                    if (n3 == 0 || d10 < 0) break block48;
                                }
                                d10 = gY.a(arrd11, arrd12, arrd9, arrd8);
                            }
                            arrd5[0] = arrd11[0];
                            arrd5[1] = arrd11[1];
                            arrd5[2] = arrd11[2];
                            arrd4 = arrd5;
                            if (n3 == 0) break block50;
                            if (!gY.a(Math.abs(arrd4[0]), 1.0)) break block51;
                            arrd4 = arrd5;
                            if (n3 == 0) break block50;
                            if (!gY.a(Math.abs(arrd4[1]), 1.0)) break block51;
                            arrd4 = arrd5;
                            if (n3 == 0) break block50;
                            if (!gY.a(Math.abs(arrd4[2]), 1.0)) break block51;
                            for (n2 = 0; n2 < 3; ++n2) {
                                double d42 = arrd5[n2] - 0.0;
                                n4 = d42 == 0.0 ? 0 : (d42 < 0.0 ? -1 : 1);
                                if (n3 != 0) {
                                    if (n4 >= 0) continue;
                                    ++n5;
                                    if (n3 != 0) continue;
                                }
                                break block30;
                            }
                            n4 = n5;
                        }
                        if (n3 == 0) break block52;
                        if (n4 == 0) break block53;
                        n4 = n5;
                        if (n3 == 0) break block52;
                        if (n4 != 2) break block51;
                    }
                    arrd2[2] = 1.0;
                    arrd2[1] = 1.0;
                    arrd2[0] = 1.0;
                    n4 = n2 = 0;
                }
                while (n2 < 9) {
                    arrd3[n2] = arrd10[n2];
                    ++n2;
                    if (n3 != 0) continue;
                }
                return;
            }
            gY.a(arrd9, arrd7);
            gY.a(arrd8, arrd6);
            arrd4 = arrd;
        }
        gY.a(arrd4, arrd7, arrd6, arrd5, arrd3, arrd2);
    }

    static double b(double d10, double d11) {
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

    public final void b(double d10) {
        double d11;
        double d12 = Math.sin(d10);
        this.h = d11 = Math.cos(d10);
        this.j = 0.0;
        this.i = d12;
        this.f = 0.0;
        this.d = 1.0;
        this.c = 0.0;
        this.g = -d12;
        this.b = 0.0;
        this.e = d11;
    }

    public final void a(o o2) {
        double d10 = this.h * o2.c + this.j * o2.b + this.i * o2.a;
        double d11 = this.f * o2.c + this.d * o2.b + this.c * o2.a;
        double d12 = this.g * o2.c + this.b * o2.b + this.e * o2.a;
        o2.a(d10, d11, d12);
    }

    public final void c(gY gY2, gY gY3) {
        block4: {
            gY gY4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY2) break block3;
                    gY4 = this;
                    if (n2 != 0) break block2;
                    if (gY4 == gY3) break block3;
                    this.h = gY2.h * gY3.h + gY2.j * gY3.f + gY2.i * gY3.g;
                    this.j = gY2.h * gY3.j + gY2.j * gY3.d + gY2.i * gY3.b;
                    this.i = gY2.h * gY3.i + gY2.j * gY3.c + gY2.i * gY3.e;
                    this.f = gY2.f * gY3.h + gY2.d * gY3.f + gY2.c * gY3.g;
                    this.d = gY2.f * gY3.j + gY2.d * gY3.d + gY2.c * gY3.b;
                    this.c = gY2.f * gY3.i + gY2.d * gY3.c + gY2.c * gY3.e;
                    this.g = gY2.g * gY3.h + gY2.b * gY3.f + gY2.e * gY3.g;
                    this.b = gY2.g * gY3.j + gY2.b * gY3.d + gY2.e * gY3.b;
                    this.e = gY2.g * gY3.i + gY2.b * gY3.c + gY2.e * gY3.e;
                    if (n2 == 0) break block4;
                }
                gY4 = gY2;
            }
            double d10 = gY4.h * gY3.h + gY2.j * gY3.f + gY2.i * gY3.g;
            double d11 = gY2.h * gY3.j + gY2.j * gY3.d + gY2.i * gY3.b;
            double d12 = gY2.h * gY3.i + gY2.j * gY3.c + gY2.i * gY3.e;
            double d13 = gY2.f * gY3.h + gY2.d * gY3.f + gY2.c * gY3.g;
            double d14 = gY2.f * gY3.j + gY2.d * gY3.d + gY2.c * gY3.b;
            double d15 = gY2.f * gY3.i + gY2.d * gY3.c + gY2.c * gY3.e;
            double d16 = gY2.g * gY3.h + gY2.b * gY3.f + gY2.e * gY3.g;
            double d17 = gY2.g * gY3.j + gY2.b * gY3.d + gY2.e * gY3.b;
            double d18 = gY2.g * gY3.i + gY2.b * gY3.c + gY2.e * gY3.e;
            this.h = d10;
            this.j = d11;
            this.i = d12;
            this.f = d13;
            this.d = d14;
            this.c = d15;
            this.g = d16;
            this.b = d17;
            this.e = d18;
        }
    }

    public String toString() {
        return this.h + ", " + this.j + ", " + this.i + "\n" + this.f + ", " + this.d + ", " + this.c + "\n" + this.g + ", " + this.b + ", " + this.e + "\n";
    }

    public final double o() {
        return this.d;
    }

    public gY(double[] arrd) {
        this.h = arrd[0];
        this.j = arrd[1];
        this.i = arrd[2];
        this.f = arrd[3];
        this.d = arrd[4];
        this.c = arrd[5];
        this.g = arrd[6];
        this.b = arrd[7];
        this.e = arrd[8];
    }

    public final void a(o o2, o o3) {
        double d10 = this.h * o2.c + this.j * o2.b + this.i * o2.a;
        double d11 = this.f * o2.c + this.d * o2.b + this.c * o2.a;
        o3.a = this.g * o2.c + this.b * o2.b + this.e * o2.a;
        o3.c = d10;
        o3.b = d11;
    }

    public final void b() {
        double d10 = this.f;
        this.f = this.j;
        this.j = d10;
        d10 = this.g;
        this.g = this.i;
        this.i = d10;
        d10 = this.b;
        this.b = this.c;
        this.c = d10;
    }

    public final double n() {
        return this.e;
    }

    public final double d() {
        double d10 = this.h * (this.d * this.e - this.c * this.b) + this.j * (this.c * this.g - this.f * this.e) + this.i * (this.f * this.b - this.d * this.g);
        return d10;
    }

    static boolean a(double[] arrd, int[] arrn) {
        int n2;
        block31: {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            double[] arrd2;
            block29: {
                arrd2 = new double[3];
                n8 = 0;
                n7 = ae.g();
                n6 = 0;
                n5 = 3;
                while (n5-- != 0) {
                    double d10;
                    block37: {
                        double d11;
                        block36: {
                            block30: {
                                double d12;
                                d10 = 0.0;
                                n4 = 3;
                                if (n7 != 0) break block29;
                                n3 = n4;
                                while (n3-- != 0) {
                                    double d13 = arrd[n8++];
                                    double d14 = d13 = Math.abs(d13);
                                    if (n7 == 0) {
                                        double d15 = d14 - d10;
                                        d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        if (n7 != 0) break block30;
                                        if (d11 <= 0) continue;
                                        d14 = d10 = d13;
                                    }
                                    if (n7 == 0) continue;
                                }
                                d11 = (d12 = d10 - 0.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (n7 != 0) break block36;
                            if (d11 != false) break block37;
                            d11 = 0.0;
                        }
                        return (boolean)d11;
                    }
                    arrd2[n6++] = 1.0 / d10;
                    if (n7 == 0) continue;
                }
                n4 = 0;
            }
            n3 = n4;
            n5 = 0;
            block2: while (true) {
                int n9 = n5;
                block3: while (n9 < 3) {
                    double d16;
                    int n10;
                    int n11;
                    int n12;
                    block33: {
                        double d17;
                        n2 = 0;
                        if (n7 != 0) break block31;
                        n8 = n2;
                        while (n8 < n5) {
                            block32: {
                                n12 = n3 + 3 * n8 + n5;
                                d17 = arrd[n12];
                                int n13 = n8;
                                int n14 = n3 + 3 * n8;
                                n9 = n3 + n5;
                                if (n7 != 0) continue block3;
                                n11 = n9;
                                while (n13-- != 0) {
                                    d17 -= arrd[n14] * arrd[n11];
                                    ++n14;
                                    n11 += 3;
                                    if (n7 == 0) {
                                        if (n7 == 0) continue;
                                    }
                                    break block32;
                                }
                                arrd[n12] = d17;
                                ++n8;
                            }
                            if (n7 == 0) continue;
                        }
                        double d18 = 0.0;
                        n6 = -1;
                        for (n8 = n5; n8 < 3; ++n8) {
                            block34: {
                                n12 = n3 + 3 * n8 + n5;
                                d17 = arrd[n12];
                                int n15 = n5;
                                int n16 = n3 + 3 * n8;
                                n10 = n3 + n5;
                                if (n7 != 0) break block33;
                                n11 = n10;
                                while (n15-- != 0) {
                                    d17 -= arrd[n16] * arrd[n11];
                                    ++n16;
                                    n11 += 3;
                                    if (n7 == 0) {
                                        if (n7 == 0) continue;
                                    }
                                    break block34;
                                }
                                arrd[n12] = d17;
                            }
                            d16 = arrd2[n8] * Math.abs(d17);
                            double d19 = d16 == d18 ? 0 : (d16 > d18 ? 1 : -1);
                            if (n7 == 0) {
                                if (d19 < 0) continue;
                                d18 = d16;
                                d19 = n8;
                            }
                            n6 = (int)d19;
                            if (n7 == 0) continue;
                        }
                        n10 = n6;
                    }
                    if (n7 == 0) {
                        if (n10 < 0) {
                            throw new RuntimeException(cK.a("Matrix3d13"));
                        }
                        n10 = n5;
                    }
                    if (n7 == 0) {
                        double d20;
                        block35: {
                            if (n10 != n6) {
                                int n17 = 3;
                                int n18 = n3 + 3 * n6;
                                n11 = n3 + 3 * n5;
                                while (n17-- != 0) {
                                    d16 = arrd[n18];
                                    arrd[n18++] = arrd[n11];
                                    arrd[n11++] = d16;
                                    if (n7 == 0) {
                                        if (n7 == 0) continue;
                                    }
                                    break block35;
                                }
                                arrd2[n6] = arrd2[n5];
                            }
                            arrn[n5] = n6;
                        }
                        n10 = (d20 = arrd[n3 + 3 * n5 + n5] - 0.0) == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (n7 == 0) {
                        if (n10 == 0) {
                            return false;
                        }
                        n10 = n5;
                    }
                    if (n10 != 2) {
                        d16 = 1.0 / arrd[n3 + 3 * n5 + n5];
                        n12 = n3 + 3 * (n5 + 1) + n5;
                        n8 = 2 - n5;
                        while (n8-- != 0) {
                            int n19 = n12;
                            arrd[n19] = arrd[n19] * d16;
                            n12 += 3;
                            if (n7 != 0) continue block2;
                            if (n7 == 0) continue;
                        }
                    }
                    ++n5;
                    if (n7 == 0) continue block2;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public gY() {
        this.h = 0.0;
        this.j = 0.0;
        this.i = 0.0;
        this.f = 0.0;
        this.d = 0.0;
        this.c = 0.0;
        this.g = 0.0;
        this.b = 0.0;
        this.e = 0.0;
    }

    public final void c(double d10) {
        this.g = d10;
    }

    private static final boolean a(double d10, double d11) {
        int n2 = ae.g();
        double d12 = d10;
        if (n2 == 0) {
            if (d12 == d11) {
                return true;
            }
            d12 = 1.0E-6;
        }
        double d13 = d12;
        double d14 = 1.0E-4;
        double d15 = Math.abs(d10 - d11);
        double d16 = Math.abs(d10);
        double d17 = Math.abs(d11);
        double d18 = d16;
        if (n2 == 0) {
            d18 = d18 >= d17 ? d16 : d17;
        }
        double d19 = d18;
        double d20 = d15 - 1.0E-6;
        double d21 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
        if (n2 == 0) {
            if (d21 < 0) {
                return true;
            }
            double d22 = d15 / d19 - 1.0E-4;
            d21 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
        }
        if (n2 == 0) {
            d21 = d21 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d21;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, q var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2.c;
                this.j = var2_2.b;
                this.i = var2_2.a;
lbl8:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.f = var2_2.c;
                this.d = var2_2.b;
                this.c = var2_2.a;
                if (var3_3 == 0) return;
            }
            case 2: {
                this.g = var2_2.c;
                this.b = var2_2.b;
                this.e = var2_2.a;
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d6"));
    }

    public final void p() {
        double d10 = 1.0 / Math.sqrt(this.h * this.h + this.f * this.f + this.g * this.g);
        this.h *= d10;
        this.f *= d10;
        this.g *= d10;
        d10 = 1.0 / Math.sqrt(this.j * this.j + this.d * this.d + this.b * this.b);
        this.j *= d10;
        this.d *= d10;
        this.b *= d10;
        this.i = this.f * this.b - this.d * this.g;
        this.c = this.j * this.g - this.h * this.b;
        this.e = this.h * this.d - this.j * this.f;
    }

    final void b(double[] arrd, double[] arrd2) {
        double[] arrd3 = new double[]{this.h, this.j, this.i, this.f, this.d, this.c, this.g, this.b, this.e};
        gY.b(arrd3, arrd, arrd2);
    }

    public final void l() {
        this.b(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, int var2_2, double var3_3) {
        var5_4 = ae.g();
        v0 = var1_1;
        if (var5_4 != 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        this.h = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 1: {
                        this.j = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 2: {
                        this.i = var3_3;
                        if (var5_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d0"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        this.f = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 1: {
                        this.d = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 2: {
                        this.c = var3_3;
                        if (var5_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d0"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        this.g = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 1: {
                        this.b = var3_3;
                        if (var5_4 == 0) return;
                    }
                    case 2: {
                        this.e = var3_3;
                        if (var5_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d0"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d0"));
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.h);
        l2 = gW.a(l2, this.j);
        l2 = gW.a(l2, this.i);
        l2 = gW.a(l2, this.f);
        l2 = gW.a(l2, this.d);
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.g);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.e);
        return gW.a(l2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, double[] var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.h = var2_2[0];
                this.j = var2_2[1];
                this.i = var2_2[2];
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.f = var2_2[0];
                this.d = var2_2[1];
                this.c = var2_2[2];
                if (var3_3 != 0) return;
            }
            case 2: {
                this.g = var2_2[0];
                this.b = var2_2[1];
                this.e = var2_2[2];
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3d6"));
    }

    public final void e(gY gY2) {
        this.h = gY2.h;
        this.j = gY2.j;
        this.i = gY2.i;
        this.f = gY2.f;
        this.d = gY2.d;
        this.c = gY2.c;
        this.g = gY2.g;
        this.b = gY2.b;
        this.e = gY2.e;
    }
}

