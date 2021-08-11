/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class aR
implements Cloneable,
Serializable {
    public /* synthetic */ double b;
    static final /* synthetic */ long serialVersionUID = 6205762482756093838L;
    public /* synthetic */ double a;

    public final void d(double d10) {
        this.b *= d10;
        this.a *= d10;
    }

    public final void a(double d10, aR aR2, aR aR3) {
        this.b = d10 * aR2.b + aR3.b;
        this.a = d10 * aR2.a + aR3.a;
    }

    public final void a(aR aR2) {
        this.b -= aR2.b;
        this.a -= aR2.a;
    }

    public aR() {
        this.b = 0.0;
        this.a = 0.0;
    }

    public final void b(double d10) {
        this.b = d10;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void b(aR aR2, aR aR3) {
        this.b = aR2.b - aR3.b;
        this.a = aR2.a - aR3.a;
    }

    public final void c() {
        this.b = Math.abs(this.b);
        this.a = Math.abs(this.a);
    }

    public final void d() {
        this.b = -this.b;
        this.a = -this.a;
    }

    public final void a(x x2) {
        this.b = x2.b;
        this.a = x2.a;
    }

    public aR(double[] arrd) {
        this.b = arrd[0];
        this.a = arrd[1];
    }

    public final void a(double d10, aR aR2) {
        block9: {
            block7: {
                aR aR3;
                block8: {
                    int n2;
                    block6: {
                        block4: {
                            aR aR4;
                            block5: {
                                n2 = ae.g();
                                aR4 = aR2;
                                if (n2 != 0) break block4;
                                if (!(aR4.b > d10)) break block5;
                                this.b = d10;
                                if (n2 == 0) break block6;
                            }
                            aR4 = this;
                        }
                        aR4.b = aR2.b;
                    }
                    aR3 = aR2;
                    if (n2 != 0) break block7;
                    if (!(aR3.a > d10)) break block8;
                    this.a = d10;
                    if (n2 == 0) break block9;
                }
                aR3 = this;
            }
            aR3.a = aR2.a;
        }
    }

    public final void d(aR aR2) {
        this.b = aR2.b;
        this.a = aR2.a;
    }

    public final void f(aR aR2) {
        this.b += aR2.b;
        this.a += aR2.a;
    }

    public String toString() {
        return "(" + this.b + ", " + this.a + ")";
    }

    public final void b(aR aR2, double d10) {
        this.b = (1.0 - d10) * this.b + d10 * aR2.b;
        this.a = (1.0 - d10) * this.a + d10 * aR2.a;
    }

    public aR(aR aR2) {
        this.b = aR2.b;
        this.a = aR2.a;
    }

    public final void a(double d10) {
        this.a = d10;
    }

    public final void d(double d10, aR aR2) {
        this.b = d10 * this.b + aR2.b;
        this.a = d10 * this.a + aR2.a;
    }

    public final void a(aR aR2, aR aR3) {
        this.b = aR2.b + aR3.b;
        this.a = aR2.a + aR3.a;
    }

    public aR(double d10, double d11) {
        this.b = d10;
        this.a = d11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean equals(Object var1_1) {
        block6: {
            var2_2 = ae.f();
            var3_3 = (aR)var1_1;
            cfr_temp_0 = this.b - var3_3.b;
            v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
            if (var2_2 == 0) break block6;
            if (v0 != false) ** GOTO lbl16
            cfr_temp_1 = this.a - var3_3.a;
            v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl16
        try {
            v0 = (double)true;
            return (boolean)v0;
lbl16:
            // 2 sources

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

    public final void c(double d10, aR aR2) {
        this.b = d10 * aR2.b;
        this.a = d10 * aR2.a;
    }

    public final void a(double[] arrd) {
        this.b = arrd[0];
        this.a = arrd[1];
    }

    public boolean a(aR aR2, double d10) {
        double d11;
        double d12;
        int n2;
        block14: {
            double d13;
            double d14;
            block13: {
                double d15;
                double d16;
                block12: {
                    int n3;
                    block11: {
                        d14 = this.b - aR2.b;
                        n2 = ae.g();
                        n3 = Double.isNaN(d14);
                        if (n2 != 0) break block11;
                        if (n3 != 0) {
                            return false;
                        }
                        d16 = d14;
                        if (n2 != 0) break block12;
                        double d17 = d16 - 0.0;
                        n3 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                    }
                    d16 = n3 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 == 0) {
                    if (d13 > 0) {
                        return false;
                    }
                    d14 = this.a - aR2.a;
                    d13 = (double)Double.isNaN(d14);
                }
                if (n2 != 0) break block13;
                if (d13 != false) {
                    return false;
                }
                d12 = d14;
                if (n2 != 0) break block14;
                double d18 = d12 - 0.0;
                d13 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d19 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 == 0) {
            d19 = d19 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d19;
    }

    public final void e(double d10) {
        block6: {
            block5: {
                aR aR2;
                double d11;
                block4: {
                    int n2 = ae.g();
                    double d12 = this.b - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                    if (n2 != 0) break block4;
                    if (d11 > 0) {
                        this.b = d10;
                    }
                    aR2 = this;
                    if (n2 != 0) break block5;
                    double d13 = aR2.a - d10;
                    d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (d11 <= 0) break block6;
                aR2 = this;
            }
            aR2.a = d10;
        }
    }

    public final void b(double[] arrd) {
        arrd[0] = this.b;
        arrd[1] = this.a;
    }

    public final void a(double d10, double d11) {
        this.b = d10;
        this.a = d11;
    }

    public final double a() {
        return this.b;
    }

    public final void b(double d10, double d11) {
        block13: {
            block14: {
                aR aR2;
                double d12;
                block11: {
                    int n2;
                    block12: {
                        block10: {
                            double d13;
                            block9: {
                                block7: {
                                    double d14;
                                    block8: {
                                        n2 = ae.f();
                                        double d15 = this.b - d11;
                                        d12 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        if (n2 == 0) break block7;
                                        if (d12 <= 0) break block8;
                                        this.b = d11;
                                        if (n2 != 0) break block9;
                                    }
                                    d12 = (d14 = this.b - d10) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                }
                                if (n2 == 0) break block10;
                                if (d12 < 0) {
                                    this.b = d10;
                                }
                            }
                            d12 = (d13 = this.a - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (n2 == 0) break block11;
                        if (d12 <= 0) break block12;
                        this.a = d11;
                        if (n2 != 0) break block13;
                    }
                    aR2 = this;
                    if (n2 == 0) break block14;
                    double d16 = aR2.a - d10;
                    d12 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                }
                if (d12 >= 0) break block13;
                aR2 = this;
            }
            aR2.a = d10;
        }
    }

    public aR(x x2) {
        this.b = x2.b;
        this.a = x2.a;
    }

    public final double b() {
        return this.a;
    }

    public final void b(aR aR2) {
        this.b = -aR2.b;
        this.a = -aR2.a;
    }

    public final void e(aR aR2) {
        this.b = Math.abs(aR2.b);
        this.a = Math.abs(aR2.a);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean c(aR var1_1) {
        var2_2 = ae.g();
        try {
            block5: {
                cfr_temp_0 = this.b - var1_1.b;
                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_2 != 0) break block5;
                if (v0 != false) ** GOTO lbl17
                cfr_temp_1 = this.a - var1_1.a;
                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) return (boolean)v0;
            if (v0 != false) ** GOTO lbl17
        }
        catch (NullPointerException var3_3) {
            return false;
        }
        v0 = (double)true;
        return (boolean)v0;
lbl17:
        // 2 sources

        v0 = (double)false;
        return (boolean)v0;
    }

    public final void a(double d10, double d11, aR aR2) {
        block11: {
            block12: {
                aR aR3;
                block13: {
                    double d12;
                    int n2;
                    block9: {
                        block10: {
                            double d13;
                            block6: {
                                block7: {
                                    aR aR4;
                                    block8: {
                                        double d14;
                                        block4: {
                                            block5: {
                                                n2 = ae.f();
                                                double d15 = aR2.b - d11;
                                                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                                if (n2 == 0) break block4;
                                                if (d14 <= 0) break block5;
                                                this.b = d11;
                                                if (n2 != 0) break block6;
                                            }
                                            aR4 = aR2;
                                            if (n2 == 0) break block7;
                                            double d16 = aR4.b - d10;
                                            d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                        }
                                        if (d14 >= 0) break block8;
                                        this.b = d10;
                                        if (n2 != 0) break block6;
                                    }
                                    aR4 = this;
                                }
                                aR4.b = aR2.b;
                            }
                            d12 = (d13 = aR2.a - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (n2 == 0) break block9;
                            if (d12 <= 0) break block10;
                            this.a = d11;
                            if (n2 != 0) break block11;
                        }
                        aR3 = aR2;
                        if (n2 == 0) break block12;
                        double d17 = aR3.a - d10;
                        d12 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                    }
                    if (d12 >= 0) break block13;
                    this.a = d10;
                    if (n2 != 0) break block11;
                }
                aR3 = this;
            }
            aR3.a = aR2.a;
        }
    }

    public final void c(double d10) {
        block6: {
            block5: {
                aR aR2;
                double d11;
                block4: {
                    int n2 = ae.g();
                    double d12 = this.b - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    if (n2 != 0) break block4;
                    if (d11 < 0) {
                        this.b = d10;
                    }
                    aR2 = this;
                    if (n2 != 0) break block5;
                    double d13 = aR2.a - d10;
                    d11 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                }
                if (d11 >= 0) break block6;
                aR2 = this;
            }
            aR2.a = d10;
        }
    }

    public final void b(double d10, aR aR2) {
        block9: {
            block7: {
                aR aR3;
                block8: {
                    int n2;
                    block6: {
                        block4: {
                            aR aR4;
                            block5: {
                                n2 = ae.g();
                                aR4 = aR2;
                                if (n2 != 0) break block4;
                                if (!(aR4.b < d10)) break block5;
                                this.b = d10;
                                if (n2 == 0) break block6;
                            }
                            aR4 = this;
                        }
                        aR4.b = aR2.b;
                    }
                    aR3 = aR2;
                    if (n2 != 0) break block7;
                    if (!(aR3.a < d10)) break block8;
                    this.a = d10;
                    if (n2 == 0) break block9;
                }
                aR3 = this;
            }
            aR3.a = aR2.a;
        }
    }

    public final void a(aR aR2, aR aR3, double d10) {
        this.b = (1.0 - d10) * aR2.b + d10 * aR3.b;
        this.a = (1.0 - d10) * aR2.a + d10 * aR3.a;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.a);
        return gW.a(l2);
    }
}

