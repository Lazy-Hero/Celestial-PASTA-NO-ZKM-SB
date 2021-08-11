/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class em
implements Serializable,
Cloneable {
    public /* synthetic */ double d;
    public /* synthetic */ double b;
    public /* synthetic */ double a;
    static final /* synthetic */ long serialVersionUID = 3644296204459140589L;
    public /* synthetic */ double e;
    static final /* synthetic */ double c = 1.0E-12;

    public final void d(double d10) {
        this.b = d10;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.d);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.e);
        l2 = gW.a(l2, this.a);
        return gW.a(l2);
    }

    public final void b(double[] arrd) {
        this.d = arrd[0];
        this.b = arrd[1];
        this.e = arrd[2];
        this.a = arrd[3];
    }

    public final void a(double d10, double d11, double d12, double d13) {
        this.d = d10;
        this.b = d11;
        this.e = d12;
        this.a = d13;
    }

    public final void a(dc dc2) {
        block4: {
            block2: {
                block3: {
                    this.d = dc2.e - dc2.h;
                    this.b = dc2.a - dc2.f;
                    int n2 = ae.g();
                    this.e = dc2.c - dc2.d;
                    double d10 = this.d * this.d + this.b * this.b + this.e * this.e;
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * ((double)(dc2.j + dc2.g + dc2.i) - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.d *= d13;
                    this.b *= d13;
                    this.e *= d13;
                    if (n2 == 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
    }

    public em(eG eG2) {
        this.d = eG2.e;
        this.b = eG2.d;
        this.e = eG2.c;
        this.a = eG2.a;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void a(dA dA2) {
        block4: {
            block2: {
                block3: {
                    gY gY2 = new gY();
                    int n2 = ae.f();
                    dA2.b(gY2);
                    this.d = (float)(gY2.b - gY2.c);
                    this.b = (float)(gY2.i - gY2.g);
                    this.e = (float)(gY2.f - gY2.j);
                    double d10 = this.d * this.d + this.b * this.b + this.e * this.e;
                    if (n2 == 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * (gY2.h + gY2.d + gY2.e - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.d *= d13;
                    this.b *= d13;
                    this.e *= d13;
                    if (n2 != 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
    }

    public final void a(eG eG2) {
        this.d = eG2.e;
        this.b = eG2.d;
        this.e = eG2.c;
        this.a = eG2.a;
    }

    public em(q q2, double d10) {
        this.d = q2.c;
        this.b = q2.b;
        this.e = q2.a;
        this.a = d10;
    }

    public final double d() {
        return this.a;
    }

    public final void c(double d10) {
        this.a = d10;
    }

    public final void a(q q2, double d10) {
        this.d = q2.c;
        this.b = q2.b;
        this.e = q2.a;
        this.a = d10;
    }

    public final void a(dU dU2) {
        block4: {
            block2: {
                block3: {
                    gY gY2 = new gY();
                    int n2 = ae.g();
                    dU2.c(gY2);
                    this.d = (float)(gY2.b - gY2.c);
                    this.b = (float)(gY2.i - gY2.g);
                    this.e = (float)(gY2.f - gY2.j);
                    double d10 = this.d * this.d + this.b * this.b + this.e * this.e;
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * (gY2.h + gY2.d + gY2.e - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.d *= d13;
                    this.b *= d13;
                    this.e *= d13;
                    if (n2 == 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
    }

    public final void a(gY gY2) {
        block4: {
            block2: {
                block3: {
                    this.d = (float)(gY2.b - gY2.c);
                    this.b = (float)(gY2.i - gY2.g);
                    int n2 = ae.g();
                    this.e = (float)(gY2.f - gY2.j);
                    double d10 = this.d * this.d + this.b * this.b + this.e * this.e;
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * (gY2.h + gY2.d + gY2.e - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.d *= d13;
                    this.b *= d13;
                    this.e *= d13;
                    if (n2 == 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void a(ao ao2) {
        block4: {
            block2: {
                block3: {
                    double d10 = ao2.c * ao2.c + ao2.a * ao2.a + ao2.b * ao2.b;
                    int n2 = ae.g();
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 1.0 / d10;
                    this.d = (double)ao2.c * d11;
                    this.b = (double)ao2.a * d11;
                    this.e = (double)ao2.b * d11;
                    this.a = 2.0 * Math.atan2(d10, ao2.d);
                    if (n2 == 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
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
                    var3_3 = (em)var1_1;
                    cfr_temp_0 = this.d - var3_3.d;
                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    if (var2_2 == 0) break block12;
                    if (v0 != false) ** GOTO lbl30
                    cfr_temp_1 = this.b - var3_3.b;
                    v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                }
                if (var2_2 == 0) break block10;
                if (v0 != false) ** GOTO lbl30
                cfr_temp_2 = this.e - var3_3.e;
                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
            }
            if (var2_2 == 0) break block11;
            if (v0 != false) ** GOTO lbl30
            cfr_temp_3 = this.a - var3_3.a;
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

    public final void a(double d10) {
        this.d = d10;
    }

    public final void b(double d10) {
        this.e = d10;
    }

    public String toString() {
        return "(" + this.d + ", " + this.b + ", " + this.e + ", " + this.a + ")";
    }

    public em(double[] arrd) {
        this.d = arrd[0];
        this.b = arrd[1];
        this.e = arrd[2];
        this.a = arrd[3];
    }

    public double b() {
        return this.e;
    }

    public boolean a(em em2, double d10) {
        double d11;
        double d12;
        int n2;
        block19: {
            double d13;
            double d14;
            block18: {
                double d15;
                double d16;
                block17: {
                    double d17;
                    block16: {
                        double d18;
                        double d19;
                        block15: {
                            double d20;
                            block14: {
                                double d21;
                                d14 = this.d - em2.d;
                                n2 = ae.g();
                                double d22 = d14;
                                if (n2 == 0) {
                                    d22 = d22 < 0.0 ? -d14 : d14;
                                }
                                d20 = (d21 = d22 - d10) == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                if (n2 != 0) break block14;
                                if (d20 > 0) {
                                    return false;
                                }
                                d19 = d14 = this.b - em2.b;
                                if (n2 != 0) break block15;
                                double d23 = d19 - 0.0;
                                d20 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                            }
                            d19 = d20 < 0 ? -d14 : d14;
                        }
                        d17 = (d18 = d19 - d10) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        if (n2 != 0) break block16;
                        if (d17 > 0) {
                            return false;
                        }
                        d16 = d14 = this.e - em2.e;
                        if (n2 != 0) break block17;
                        double d24 = d16 - 0.0;
                        d17 = d24 == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                    }
                    d16 = d17 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 != 0) break block18;
                if (d13 > 0) {
                    return false;
                }
                d12 = d14 = this.a - em2.a;
                if (n2 != 0) break block19;
                double d25 = d12 - 0.0;
                d13 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d26 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 == 0) {
            d26 = d26 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d26;
    }

    public final void b(em em2) {
        this.d = em2.d;
        this.b = em2.b;
        this.e = em2.e;
        this.a = em2.a;
    }

    public em(double d10, double d11, double d12, double d13) {
        this.d = d10;
        this.b = d11;
        this.e = d12;
        this.a = d13;
    }

    public em() {
        this.d = 0.0;
        this.b = 0.0;
        this.e = 1.0;
        this.a = 0.0;
    }

    public em(em em2) {
        this.d = em2.d;
        this.b = em2.b;
        this.e = em2.e;
        this.a = em2.a;
    }

    public double c() {
        return this.d;
    }

    public final void a(g4 g42) {
        block4: {
            block2: {
                block3: {
                    double d10 = g42.c * g42.c + g42.a * g42.a + g42.b * g42.b;
                    int n2 = ae.g();
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-12)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 1.0 / d10;
                    this.d = g42.c * d11;
                    this.b = g42.a * d11;
                    this.e = g42.b * d11;
                    this.a = 2.0 * Math.atan2(d10, g42.d);
                    if (n2 == 0) break block4;
                }
                this.d = 0.0;
                this.b = 1.0;
                this.e = 0.0;
            }
            this.a = 0.0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean a(em var1_1) {
        block10: {
            block9: {
                var2_2 = ae.g();
                try {
                    block11: {
                        cfr_temp_0 = this.d - var1_1.d;
                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (var2_2 != 0) break block11;
                        if (v0 != false) ** GOTO lbl31
                        cfr_temp_1 = this.b - var1_1.b;
                        v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 != 0) break block9;
                    if (v0 != false) ** GOTO lbl31
                }
                catch (NullPointerException var3_3) {
                    return false;
                }
                cfr_temp_2 = this.e - var1_1.e;
                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block10;
            if (v0 != false) ** GOTO lbl31
            cfr_temp_3 = this.a - var1_1.a;
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

    public final void a(double[] arrd) {
        arrd[0] = this.d;
        arrd[1] = this.b;
        arrd[2] = this.e;
        arrd[3] = this.a;
    }

    public final double a() {
        return this.b;
    }
}

