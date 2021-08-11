/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class gS
implements Serializable,
Cloneable {
    static final /* synthetic */ long serialVersionUID = -4748953690425311052L;
    public /* synthetic */ double d;
    public /* synthetic */ double c;
    public /* synthetic */ double a;
    public /* synthetic */ double b;

    public final void f(gS gS2) {
        this.c = -gS2.c;
        this.a = -gS2.a;
        this.b = -gS2.b;
        this.d = -gS2.d;
    }

    public final void c(double d10, gS gS2) {
        block19: {
            block17: {
                gS gS3;
                block18: {
                    int n2;
                    block16: {
                        block14: {
                            gS gS4;
                            block15: {
                                block13: {
                                    block11: {
                                        gS gS5;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    gS gS6;
                                                    block9: {
                                                        n2 = ae.f();
                                                        gS6 = gS2;
                                                        if (n2 == 0) break block8;
                                                        if (!(gS6.c < d10)) break block9;
                                                        this.c = d10;
                                                        if (n2 != 0) break block10;
                                                    }
                                                    gS6 = this;
                                                }
                                                gS6.c = gS2.c;
                                            }
                                            gS5 = gS2;
                                            if (n2 == 0) break block11;
                                            if (!(gS5.a < d10)) break block12;
                                            this.a = d10;
                                            if (n2 != 0) break block13;
                                        }
                                        gS5 = this;
                                    }
                                    gS5.a = gS2.a;
                                }
                                gS4 = gS2;
                                if (n2 == 0) break block14;
                                if (!(gS4.b < d10)) break block15;
                                this.b = d10;
                                if (n2 != 0) break block16;
                            }
                            gS4 = this;
                        }
                        gS4.b = gS2.b;
                    }
                    gS3 = gS2;
                    if (n2 == 0) break block17;
                    if (!(gS3.d < d10)) break block18;
                    this.d = d10;
                    if (n2 != 0) break block19;
                }
                gS3 = this;
            }
            gS3.d = gS2.d;
        }
    }

    public final void a(gS gS2) {
        this.c -= gS2.c;
        this.a -= gS2.a;
        this.b -= gS2.b;
        this.d -= gS2.d;
    }

    public final void a(float f10) {
        this.f(f10);
    }

    public gS(ae ae2) {
        this.c = ae2.c;
        this.a = ae2.a;
        this.b = ae2.b;
        this.d = ae2.d;
    }

    public final void e() {
        this.c = Math.abs(this.c);
        this.a = Math.abs(this.a);
        this.b = Math.abs(this.b);
        this.d = Math.abs(this.d);
    }

    public final void c(double d10) {
        this.c *= d10;
        this.a *= d10;
        this.b *= d10;
        this.d *= d10;
    }

    public final void a(gS gS2, gS gS3) {
        this.c = gS2.c - gS3.c;
        this.a = gS2.a - gS3.a;
        this.b = gS2.b - gS3.b;
        this.d = gS2.d - gS3.d;
    }

    public boolean a(gS gS2, double d10) {
        double d11;
        double d12;
        int n2;
        block30: {
            double d13;
            double d14;
            block29: {
                double d15;
                double d16;
                block28: {
                    double d17;
                    block27: {
                        double d18;
                        double d19;
                        block26: {
                            double d20;
                            block25: {
                                double d21;
                                double d22;
                                block24: {
                                    int n3;
                                    block23: {
                                        d14 = this.c - gS2.c;
                                        n2 = ae.f();
                                        n3 = Double.isNaN(d14);
                                        if (n2 == 0) break block23;
                                        if (n3 != 0) {
                                            return false;
                                        }
                                        d22 = d14;
                                        if (n2 == 0) break block24;
                                        double d23 = d22 - 0.0;
                                        n3 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                                    }
                                    d22 = n3 < 0 ? -d14 : d14;
                                }
                                d20 = (d21 = d22 - d10) == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                if (n2 != 0) {
                                    if (d20 > 0) {
                                        return false;
                                    }
                                    d14 = this.a - gS2.a;
                                    d20 = (double)Double.isNaN(d14);
                                }
                                if (n2 == 0) break block25;
                                if (d20 != false) {
                                    return false;
                                }
                                d19 = d14;
                                if (n2 == 0) break block26;
                                double d24 = d19 - 0.0;
                                d20 = d24 == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                            }
                            d19 = d20 < 0 ? -d14 : d14;
                        }
                        d17 = (d18 = d19 - d10) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        if (n2 != 0) {
                            if (d17 > 0) {
                                return false;
                            }
                            d14 = this.b - gS2.b;
                            d17 = (double)Double.isNaN(d14);
                        }
                        if (n2 == 0) break block27;
                        if (d17 != false) {
                            return false;
                        }
                        d16 = d14;
                        if (n2 == 0) break block28;
                        double d25 = d16 - 0.0;
                        d17 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                    }
                    d16 = d17 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 != 0) {
                    if (d13 > 0) {
                        return false;
                    }
                    d14 = this.d - gS2.d;
                    d13 = (double)Double.isNaN(d14);
                }
                if (n2 == 0) break block29;
                if (d13 != false) {
                    return false;
                }
                d12 = d14;
                if (n2 == 0) break block30;
                double d26 = d12 - 0.0;
                d13 = d26 == 0.0 ? 0 : (d26 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d27 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 != 0) {
            d27 = d27 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d27;
    }

    public gS(double d10, double d11, double d12, double d13) {
        this.c = d10;
        this.a = d11;
        this.b = d12;
        this.d = d13;
    }

    public final void a(float f10, gS gS2) {
        this.c((double)f10, gS2);
    }

    public final void d(double d10, gS gS2) {
        this.c = d10 * gS2.c;
        this.a = d10 * gS2.a;
        this.b = d10 * gS2.b;
        this.d = d10 * gS2.d;
    }

    public void a(gS gS2, gS gS3, double d10) {
        this.c = (1.0 - d10) * gS2.c + d10 * gS3.c;
        this.a = (1.0 - d10) * gS2.a + d10 * gS3.a;
        this.b = (1.0 - d10) * gS2.b + d10 * gS3.b;
        this.d = (1.0 - d10) * gS2.d + d10 * gS3.d;
    }

    public final void e(double d10) {
        this.b = d10;
    }

    public final void a(ae ae2) {
        this.c = ae2.c;
        this.a = ae2.a;
        this.b = ae2.b;
        this.d = ae2.d;
    }

    public gS(gS gS2) {
        this.c = gS2.c;
        this.a = gS2.a;
        this.b = gS2.b;
        this.d = gS2.d;
    }

    public final void f() {
        this.c = -this.c;
        this.a = -this.a;
        this.b = -this.b;
        this.d = -this.d;
    }

    public void a(gS gS2, gS gS3, float f10) {
        this.a(gS2, gS3, (double)f10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean e(gS var1_1) {
        block10: {
            block9: {
                var2_2 = ae.g();
                try {
                    block11: {
                        cfr_temp_0 = this.c - var1_1.c;
                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (var2_2 != 0) break block11;
                        if (v0 != false) ** GOTO lbl31
                        cfr_temp_1 = this.a - var1_1.a;
                        v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 != 0) break block9;
                    if (v0 != false) ** GOTO lbl31
                }
                catch (NullPointerException var3_3) {
                    return false;
                }
                cfr_temp_2 = this.b - var1_1.b;
                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block10;
            if (v0 != false) ** GOTO lbl31
            cfr_temp_3 = this.d - var1_1.d;
            v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl31
        v0 = (double)true;
        return (boolean)v0;
lbl31:
        // 4 sources

        v0 = (double)false;
        return (boolean)v0;
    }

    public final void a(double d10) {
        this.c = d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean equals(Object var1_1) {
        block11: {
            block10: {
                block12: {
                    var2_2 = ae.f();
                    var3_3 = (gS)var1_1;
                    cfr_temp_0 = this.c - var3_3.c;
                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    if (var2_2 == 0) break block12;
                    if (v0 != false) ** GOTO lbl30
                    cfr_temp_1 = this.a - var3_3.a;
                    v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                }
                if (var2_2 == 0) break block10;
                if (v0 != false) ** GOTO lbl30
                cfr_temp_2 = this.b - var3_3.b;
                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
            }
            if (var2_2 == 0) break block11;
            if (v0 != false) ** GOTO lbl30
            cfr_temp_3 = this.d - var3_3.d;
            v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl30
        try {
            v0 = (double)true;
            return (boolean)v0;
lbl30:
            // 4 sources

            v0 = (double)false;
            return (boolean)v0;
        }
        catch (NullPointerException var3_4) {
            return false;
        }
        catch (ClassCastException var3_5) {
            return false;
        }
    }

    public final void a(double d10, gS gS2, gS gS3) {
        this.c = d10 * gS2.c + gS3.c;
        this.a = d10 * gS2.a + gS3.a;
        this.b = d10 * gS2.b + gS3.b;
        this.d = d10 * gS2.d + gS3.d;
    }

    public final double c() {
        return this.d;
    }

    public final void a(double d10, double d11, double d12, double d13) {
        this.c = d10;
        this.a = d11;
        this.b = d12;
        this.d = d13;
    }

    public final void b(double d10, gS gS2) {
        this.c = d10 * this.c + gS2.c;
        this.a = d10 * this.a + gS2.a;
        this.b = d10 * this.b + gS2.b;
        this.d = d10 * this.d + gS2.d;
    }

    public final double b() {
        return this.b;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void b(float f10, gS gS2) {
        this.a((double)f10, gS2);
    }

    public final void b(float f10) {
        this.g(f10);
    }

    public final void b(double d10) {
        this.d = d10;
    }

    public final double a() {
        return this.c;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void a(double d10, double d11, gS gS2) {
        block25: {
            block26: {
                gS gS3;
                block27: {
                    double d12;
                    int n2;
                    block23: {
                        block24: {
                            double d13;
                            block20: {
                                block21: {
                                    gS gS4;
                                    block22: {
                                        double d14;
                                        block18: {
                                            block19: {
                                                double d15;
                                                block15: {
                                                    block16: {
                                                        gS gS5;
                                                        block17: {
                                                            double d16;
                                                            block13: {
                                                                block14: {
                                                                    double d17;
                                                                    block10: {
                                                                        block11: {
                                                                            gS gS6;
                                                                            block12: {
                                                                                double d18;
                                                                                block8: {
                                                                                    block9: {
                                                                                        n2 = ae.g();
                                                                                        double d19 = gS2.c - d11;
                                                                                        d18 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                                                        if (n2 != 0) break block8;
                                                                                        if (d18 <= 0) break block9;
                                                                                        this.c = d11;
                                                                                        if (n2 == 0) break block10;
                                                                                    }
                                                                                    gS6 = gS2;
                                                                                    if (n2 != 0) break block11;
                                                                                    double d20 = gS6.c - d10;
                                                                                    d18 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                                                                                }
                                                                                if (d18 >= 0) break block12;
                                                                                this.c = d10;
                                                                                if (n2 == 0) break block10;
                                                                            }
                                                                            gS6 = this;
                                                                        }
                                                                        gS6.c = gS2.c;
                                                                    }
                                                                    d16 = (d17 = gS2.a - d11) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                                    if (n2 != 0) break block13;
                                                                    if (d16 <= 0) break block14;
                                                                    this.a = d11;
                                                                    if (n2 == 0) break block15;
                                                                }
                                                                gS5 = gS2;
                                                                if (n2 != 0) break block16;
                                                                double d21 = gS5.a - d10;
                                                                d16 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                                                            }
                                                            if (d16 >= 0) break block17;
                                                            this.a = d10;
                                                            if (n2 == 0) break block15;
                                                        }
                                                        gS5 = this;
                                                    }
                                                    gS5.a = gS2.a;
                                                }
                                                d14 = (d15 = gS2.b - d11) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                                if (n2 != 0) break block18;
                                                if (d14 <= 0) break block19;
                                                this.b = d11;
                                                if (n2 == 0) break block20;
                                            }
                                            gS4 = gS2;
                                            if (n2 != 0) break block21;
                                            double d22 = gS4.b - d10;
                                            d14 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                                        }
                                        if (d14 >= 0) break block22;
                                        this.b = d10;
                                        if (n2 == 0) break block20;
                                    }
                                    gS4 = this;
                                }
                                gS4.b = gS2.b;
                            }
                            d12 = (d13 = gS2.d - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block23;
                            if (d12 <= 0) break block24;
                            this.d = d11;
                            if (n2 == 0) break block25;
                        }
                        gS3 = gS2;
                        if (n2 != 0) break block26;
                        double d23 = gS3.d - d10;
                        d12 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                    }
                    if (d12 >= 0) break block27;
                    this.d = d10;
                    if (n2 == 0) break block25;
                }
                gS3 = this;
            }
            gS3.d = gS2.d;
        }
    }

    public final void a(double d10, double d11) {
        block29: {
            block30: {
                gS gS2;
                double d12;
                block27: {
                    int n2;
                    block28: {
                        block26: {
                            double d13;
                            block25: {
                                block23: {
                                    double d14;
                                    block24: {
                                        block22: {
                                            double d15;
                                            block21: {
                                                block19: {
                                                    double d16;
                                                    block20: {
                                                        block18: {
                                                            double d17;
                                                            block17: {
                                                                block15: {
                                                                    double d18;
                                                                    block16: {
                                                                        n2 = ae.g();
                                                                        double d19 = this.c - d11;
                                                                        d12 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                                        if (n2 != 0) break block15;
                                                                        if (d12 <= 0) break block16;
                                                                        this.c = d11;
                                                                        if (n2 == 0) break block17;
                                                                    }
                                                                    d12 = (d18 = this.c - d10) == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                                                }
                                                                if (n2 != 0) break block18;
                                                                if (d12 < 0) {
                                                                    this.c = d10;
                                                                }
                                                            }
                                                            d12 = (d17 = this.a - d11) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                        }
                                                        if (n2 != 0) break block19;
                                                        if (d12 <= 0) break block20;
                                                        this.a = d11;
                                                        if (n2 == 0) break block21;
                                                    }
                                                    d12 = (d16 = this.a - d10) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                                }
                                                if (n2 != 0) break block22;
                                                if (d12 < 0) {
                                                    this.a = d10;
                                                }
                                            }
                                            d12 = (d15 = this.b - d11) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        }
                                        if (n2 != 0) break block23;
                                        if (d12 <= 0) break block24;
                                        this.b = d11;
                                        if (n2 == 0) break block25;
                                    }
                                    d12 = (d14 = this.b - d10) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                }
                                if (n2 != 0) break block26;
                                if (d12 < 0) {
                                    this.b = d10;
                                }
                            }
                            d12 = (d13 = this.d - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (n2 != 0) break block27;
                        if (d12 <= 0) break block28;
                        this.d = d11;
                        if (n2 == 0) break block29;
                    }
                    gS2 = this;
                    if (n2 != 0) break block30;
                    double d20 = gS2.d - d10;
                    d12 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                }
                if (d12 >= 0) break block29;
                gS2 = this;
            }
            gS2.d = d10;
        }
    }

    public final void d(gS gS2) {
        this.c += gS2.c;
        this.a += gS2.a;
        this.b += gS2.b;
        this.d += gS2.d;
    }

    public final void b(gS gS2, gS gS3) {
        this.c = gS2.c + gS3.c;
        this.a = gS2.a + gS3.a;
        this.b = gS2.b + gS3.b;
        this.d = gS2.d + gS3.d;
    }

    public final void a(double d10, gS gS2) {
        block19: {
            block17: {
                gS gS3;
                block18: {
                    int n2;
                    block16: {
                        block14: {
                            gS gS4;
                            block15: {
                                block13: {
                                    block11: {
                                        gS gS5;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    gS gS6;
                                                    block9: {
                                                        n2 = ae.f();
                                                        gS6 = gS2;
                                                        if (n2 == 0) break block8;
                                                        if (!(gS6.c > d10)) break block9;
                                                        this.c = d10;
                                                        if (n2 != 0) break block10;
                                                    }
                                                    gS6 = this;
                                                }
                                                gS6.c = gS2.c;
                                            }
                                            gS5 = gS2;
                                            if (n2 == 0) break block11;
                                            if (!(gS5.a > d10)) break block12;
                                            this.a = d10;
                                            if (n2 != 0) break block13;
                                        }
                                        gS5 = this;
                                    }
                                    gS5.a = gS2.a;
                                }
                                gS4 = gS2;
                                if (n2 == 0) break block14;
                                if (!(gS4.b > d10)) break block15;
                                this.b = d10;
                                if (n2 != 0) break block16;
                            }
                            gS4 = this;
                        }
                        gS4.b = gS2.b;
                    }
                    gS3 = gS2;
                    if (n2 == 0) break block17;
                    if (!(gS3.d > d10)) break block18;
                    this.d = d10;
                    if (n2 != 0) break block19;
                }
                gS3 = this;
            }
            gS3.d = gS2.b;
        }
    }

    public void b(gS gS2, double d10) {
        this.c = (1.0 - d10) * this.c + d10 * gS2.c;
        this.a = (1.0 - d10) * this.a + d10 * gS2.a;
        this.b = (1.0 - d10) * this.b + d10 * gS2.b;
        this.d = (1.0 - d10) * this.d + d10 * gS2.d;
    }

    public final void g(gS gS2) {
        this.c = gS2.c;
        this.a = gS2.a;
        this.b = gS2.b;
        this.d = gS2.d;
    }

    public final void b(gS gS2) {
        gS2.c = this.c;
        gS2.a = this.a;
        gS2.b = this.b;
        gS2.d = this.d;
    }

    public final void b(double[] arrd) {
        arrd[0] = this.c;
        arrd[1] = this.a;
        arrd[2] = this.b;
        arrd[3] = this.d;
    }

    public gS(double[] arrd) {
        this.c = arrd[0];
        this.a = arrd[1];
        this.b = arrd[2];
        this.d = arrd[3];
    }

    public final void g(double d10) {
        block10: {
            block9: {
                gS gS2;
                double d11;
                block8: {
                    int n2 = ae.f();
                    double d12 = this.c - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    if (n2 != 0) {
                        double d13;
                        if (d11 < 0) {
                            this.c = d10;
                        }
                        d11 = (d13 = this.a - d10) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                    }
                    if (n2 != 0) {
                        double d14;
                        if (d11 < 0) {
                            this.a = d10;
                        }
                        d11 = (d14 = this.b - d10) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                    }
                    if (n2 == 0) break block8;
                    if (d11 < 0) {
                        this.b = d10;
                    }
                    gS2 = this;
                    if (n2 == 0) break block9;
                    double d15 = gS2.d - d10;
                    d11 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                }
                if (d11 >= 0) break block10;
                gS2 = this;
            }
            gS2.d = d10;
        }
    }

    public final void a(float f10, float f11, gS gS2) {
        this.a((double)f10, (double)f11, gS2);
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.d);
        return gW.a(l2);
    }

    public gS() {
        this.c = 0.0;
        this.a = 0.0;
        this.b = 0.0;
        this.d = 0.0;
    }

    public String toString() {
        return "(" + this.c + ", " + this.a + ", " + this.b + ", " + this.d + ")";
    }

    public final void c(float f10, gS gS2) {
        this.b((double)f10, gS2);
    }

    public void a(gS gS2, float f10) {
        this.b(gS2, f10);
    }

    public final void d(double d10) {
        this.a = d10;
    }

    public final void c(gS gS2) {
        this.c = Math.abs(gS2.c);
        this.a = Math.abs(gS2.a);
        this.b = Math.abs(gS2.b);
        this.d = Math.abs(gS2.d);
    }

    public final void a(float f10, float f11) {
        this.a((double)f10, (double)f11);
    }

    public final void a(double[] arrd) {
        this.c = arrd[0];
        this.a = arrd[1];
        this.b = arrd[2];
        this.d = arrd[3];
    }

    public final void f(double d10) {
        block10: {
            block9: {
                gS gS2;
                double d11;
                block8: {
                    int n2 = ae.g();
                    double d12 = this.c - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                    if (n2 == 0) {
                        double d13;
                        if (d11 > 0) {
                            this.c = d10;
                        }
                        d11 = (d13 = this.a - d10) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                    }
                    if (n2 == 0) {
                        double d14;
                        if (d11 > 0) {
                            this.a = d10;
                        }
                        d11 = (d14 = this.b - d10) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    }
                    if (n2 != 0) break block8;
                    if (d11 > 0) {
                        this.b = d10;
                    }
                    gS2 = this;
                    if (n2 != 0) break block9;
                    double d15 = gS2.d - d10;
                    d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                }
                if (d11 <= 0) break block10;
                gS2 = this;
            }
            gS2.d = d10;
        }
    }

    public final double d() {
        return this.a;
    }
}

