/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class o
implements Cloneable,
Serializable {
    static final /* synthetic */ long serialVersionUID = 5542096614926168415L;
    public /* synthetic */ double b;
    public /* synthetic */ double a;
    public /* synthetic */ double c;

    public final void b(float f10) {
        this.f(f10);
    }

    public final void e(double d10) {
        this.c = d10;
    }

    public final void e() {
        this.c = Math.abs(this.c);
        this.b = Math.abs(this.b);
        this.a = Math.abs(this.a);
    }

    public o(double[] arrd) {
        this.c = arrd[0];
        this.b = arrd[1];
        this.a = arrd[2];
    }

    public o(o o2) {
        this.c = o2.c;
        this.b = o2.b;
        this.a = o2.a;
    }

    public final double b() {
        return this.c;
    }

    public final void a(double d10) {
        this.b = d10;
    }

    public final void a(o o2, float f10) {
        this.b(o2, f10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean equals(Object var1_1) {
        block8: {
            block9: {
                var2_2 = ae.g();
                var3_3 = (o)var1_1;
                cfr_temp_0 = this.c - var3_3.c;
                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_2 != 0) break block9;
                if (v0 != false) ** GOTO lbl23
                cfr_temp_1 = this.b - var3_3.b;
                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block8;
            if (v0 != false) ** GOTO lbl23
            cfr_temp_2 = this.a - var3_3.a;
            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl23
        try {
            v0 = (double)true;
            return (boolean)v0;
lbl23:
            // 3 sources

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

    public final void a(o o2, o o3, double d10) {
        this.c = (1.0 - d10) * o2.c + d10 * o3.c;
        this.b = (1.0 - d10) * o2.b + d10 * o3.b;
        this.a = (1.0 - d10) * o2.a + d10 * o3.a;
    }

    public final void a(o o2, o o3) {
        this.c = o2.c + o3.c;
        this.b = o2.b + o3.b;
        this.a = o2.a + o3.a;
    }

    public final void a(double d10, double d11, o o2) {
        block18: {
            block19: {
                o o3;
                block20: {
                    double d12;
                    int n2;
                    block16: {
                        block17: {
                            double d13;
                            block13: {
                                block14: {
                                    o o4;
                                    block15: {
                                        double d14;
                                        block11: {
                                            block12: {
                                                double d15;
                                                block8: {
                                                    block9: {
                                                        o o5;
                                                        block10: {
                                                            double d16;
                                                            block6: {
                                                                block7: {
                                                                    n2 = ae.g();
                                                                    double d17 = o2.c - d11;
                                                                    d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                                    if (n2 != 0) break block6;
                                                                    if (d16 <= 0) break block7;
                                                                    this.c = d11;
                                                                    if (n2 == 0) break block8;
                                                                }
                                                                o5 = o2;
                                                                if (n2 != 0) break block9;
                                                                double d18 = o5.c - d10;
                                                                d16 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                                            }
                                                            if (d16 >= 0) break block10;
                                                            this.c = d10;
                                                            if (n2 == 0) break block8;
                                                        }
                                                        o5 = this;
                                                    }
                                                    o5.c = o2.c;
                                                }
                                                d14 = (d15 = o2.b - d11) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                                if (n2 != 0) break block11;
                                                if (d14 <= 0) break block12;
                                                this.b = d11;
                                                if (n2 == 0) break block13;
                                            }
                                            o4 = o2;
                                            if (n2 != 0) break block14;
                                            double d19 = o4.b - d10;
                                            d14 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                                        }
                                        if (d14 >= 0) break block15;
                                        this.b = d10;
                                        if (n2 == 0) break block13;
                                    }
                                    o4 = this;
                                }
                                o4.b = o2.b;
                            }
                            d12 = (d13 = o2.a - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            if (n2 != 0) break block16;
                            if (d12 <= 0) break block17;
                            this.a = d11;
                            if (n2 == 0) break block18;
                        }
                        o3 = o2;
                        if (n2 != 0) break block19;
                        double d20 = o3.a - d10;
                        d12 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                    }
                    if (d12 >= 0) break block20;
                    this.a = d10;
                    if (n2 == 0) break block18;
                }
                o3 = this;
            }
            o3.a = o2.a;
        }
    }

    public final void a(double d10, U u2) {
        this.b(d10, (o)new p(u2));
    }

    public String toString() {
        return "(" + this.c + ", " + this.b + ", " + this.a + ")";
    }

    public final void a(double d10, o o2) {
        this.c = d10 * o2.c;
        this.b = d10 * o2.b;
        this.a = d10 * o2.a;
    }

    public final void a(float f10, float f11, o o2) {
        this.a((double)f10, (double)f11, o2);
    }

    public boolean a(o o2, double d10) {
        double d11;
        double d12;
        int n2;
        block22: {
            double d13;
            double d14;
            block21: {
                double d15;
                double d16;
                block20: {
                    double d17;
                    block19: {
                        double d18;
                        double d19;
                        block18: {
                            int n3;
                            block17: {
                                d14 = this.c - o2.c;
                                n2 = ae.f();
                                n3 = Double.isNaN(d14);
                                if (n2 == 0) break block17;
                                if (n3 != 0) {
                                    return false;
                                }
                                d19 = d14;
                                if (n2 == 0) break block18;
                                double d20 = d19 - 0.0;
                                n3 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
                            }
                            d19 = n3 < 0 ? -d14 : d14;
                        }
                        d17 = (d18 = d19 - d10) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        if (n2 != 0) {
                            if (d17 > 0) {
                                return false;
                            }
                            d14 = this.b - o2.b;
                            d17 = (double)Double.isNaN(d14);
                        }
                        if (n2 == 0) break block19;
                        if (d17 != false) {
                            return false;
                        }
                        d16 = d14;
                        if (n2 == 0) break block20;
                        double d21 = d16 - 0.0;
                        d17 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                    }
                    d16 = d17 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 != 0) {
                    if (d13 > 0) {
                        return false;
                    }
                    d14 = this.a - o2.a;
                    d13 = (double)Double.isNaN(d14);
                }
                if (n2 == 0) break block21;
                if (d13 != false) {
                    return false;
                }
                d12 = d14;
                if (n2 == 0) break block22;
                double d22 = d12 - 0.0;
                d13 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d23 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 != 0) {
            d23 = d23 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d23;
    }

    public final void a(float f10) {
        this.c(f10);
    }

    public final void d(o o2) {
        this.c -= o2.c;
        this.b -= o2.b;
        this.a -= o2.a;
    }

    public final void c(o o2) {
        this.c += o2.c;
        this.b += o2.b;
        this.a += o2.a;
    }

    public final void a(U u2) {
        this.c = u2.c;
        this.b = u2.a;
        this.a = u2.b;
    }

    public final double c() {
        return this.b;
    }

    public final void a(o o2, o o3, float f10) {
        this.a(o2, o3, (double)f10);
    }

    public final void b(double d10, o o2) {
        this.c = d10 * this.c + o2.c;
        this.b = d10 * this.b + o2.b;
        this.a = d10 * this.a + o2.a;
    }

    public final void d(double d10, o o2) {
        block14: {
            block12: {
                o o3;
                block13: {
                    int n2;
                    block11: {
                        block9: {
                            o o4;
                            block10: {
                                block8: {
                                    block6: {
                                        o o5;
                                        block7: {
                                            n2 = ae.g();
                                            o5 = o2;
                                            if (n2 != 0) break block6;
                                            if (!(o5.c < d10)) break block7;
                                            this.c = d10;
                                            if (n2 == 0) break block8;
                                        }
                                        o5 = this;
                                    }
                                    o5.c = o2.c;
                                }
                                o4 = o2;
                                if (n2 != 0) break block9;
                                if (!(o4.b < d10)) break block10;
                                this.b = d10;
                                if (n2 == 0) break block11;
                            }
                            o4 = this;
                        }
                        o4.b = o2.b;
                    }
                    o3 = o2;
                    if (n2 != 0) break block12;
                    if (!(o3.a < d10)) break block13;
                    this.a = d10;
                    if (n2 == 0) break block14;
                }
                o3 = this;
            }
            o3.a = o2.a;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean b(o var1_1) {
        block7: {
            var2_2 = ae.g();
            try {
                block8: {
                    cfr_temp_0 = this.c - var1_1.c;
                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    if (var2_2 != 0) break block8;
                    if (v0 != false) ** GOTO lbl24
                    cfr_temp_1 = this.b - var1_1.b;
                    v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                }
                if (var2_2 != 0) break block7;
                if (v0 != false) ** GOTO lbl24
            }
            catch (NullPointerException var3_3) {
                return false;
            }
            cfr_temp_2 = this.a - var1_1.a;
            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl24
        v0 = (double)true;
        return (boolean)v0;
lbl24:
        // 3 sources

        v0 = (double)false;
        return (boolean)v0;
    }

    public o(U u2) {
        this.c = u2.c;
        this.b = u2.a;
        this.a = u2.b;
    }

    public final void b(float f10, o o2) {
        this.d(f10, o2);
    }

    public final double d() {
        return this.a;
    }

    public final void c(double d10) {
        block8: {
            block7: {
                o o2;
                double d11;
                block6: {
                    int n2 = ae.f();
                    double d12 = this.c - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    if (n2 != 0) {
                        double d13;
                        if (d11 < 0) {
                            this.c = d10;
                        }
                        d11 = (d13 = this.b - d10) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                    }
                    if (n2 == 0) break block6;
                    if (d11 < 0) {
                        this.b = d10;
                    }
                    o2 = this;
                    if (n2 == 0) break block7;
                    double d14 = o2.a - d10;
                    d11 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                }
                if (d11 >= 0) break block8;
                o2 = this;
            }
            o2.a = d10;
        }
    }

    public final void b(double d10) {
        this.a = d10;
    }

    public final void a(float f10, o o2) {
        this.c(f10, o2);
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void g(o o2) {
        this.c = -o2.c;
        this.b = -o2.b;
        this.a = -o2.a;
    }

    public final void d(double d10) {
        this.c *= d10;
        this.b *= d10;
        this.a *= d10;
    }

    public o(double d10, double d11, double d12) {
        this.c = d10;
        this.b = d11;
        this.a = d12;
    }

    public final void a() {
        this.c = -this.c;
        this.b = -this.b;
        this.a = -this.a;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.a);
        return gW.a(l2);
    }

    public final void f(double d10) {
        block8: {
            block7: {
                o o2;
                double d11;
                block6: {
                    int n2 = ae.f();
                    double d12 = this.c - d10;
                    d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                    if (n2 != 0) {
                        double d13;
                        if (d11 > 0) {
                            this.c = d10;
                        }
                        d11 = (d13 = this.b - d10) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                    }
                    if (n2 == 0) break block6;
                    if (d11 > 0) {
                        this.b = d10;
                    }
                    o2 = this;
                    if (n2 == 0) break block7;
                    double d14 = o2.a - d10;
                    d11 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                }
                if (d11 <= 0) break block8;
                o2 = this;
            }
            o2.a = d10;
        }
    }

    public final void b(o o2, o o3) {
        this.c = o2.c - o3.c;
        this.b = o2.b - o3.b;
        this.a = o2.a - o3.a;
    }

    public final void b(double[] arrd) {
        this.c = arrd[0];
        this.b = arrd[1];
        this.a = arrd[2];
    }

    public final void e(o o2) {
        this.c = Math.abs(o2.c);
        this.b = Math.abs(o2.b);
        this.a = Math.abs(o2.a);
    }

    public final void c(double d10, o o2) {
        block14: {
            block12: {
                o o3;
                block13: {
                    int n2;
                    block11: {
                        block9: {
                            o o4;
                            block10: {
                                block8: {
                                    block6: {
                                        o o5;
                                        block7: {
                                            n2 = ae.g();
                                            o5 = o2;
                                            if (n2 != 0) break block6;
                                            if (!(o5.c > d10)) break block7;
                                            this.c = d10;
                                            if (n2 == 0) break block8;
                                        }
                                        o5 = this;
                                    }
                                    o5.c = o2.c;
                                }
                                o4 = o2;
                                if (n2 != 0) break block9;
                                if (!(o4.b > d10)) break block10;
                                this.b = d10;
                                if (n2 == 0) break block11;
                            }
                            o4 = this;
                        }
                        o4.b = o2.b;
                    }
                    o3 = o2;
                    if (n2 != 0) break block12;
                    if (!(o3.a > d10)) break block13;
                    this.a = d10;
                    if (n2 == 0) break block14;
                }
                o3 = this;
            }
            o3.a = o2.a;
        }
    }

    public final void a(float f10, float f11) {
        this.a((double)f10, (double)f11);
    }

    public final void a(double d10, double d11, double d12) {
        this.c = d10;
        this.b = d11;
        this.a = d12;
    }

    public o() {
        this.c = 0.0;
        this.b = 0.0;
        this.a = 0.0;
    }

    public final void a(o o2) {
        this.c = o2.c;
        this.b = o2.b;
        this.a = o2.a;
    }

    public final void a(double d10, o o2, o o3) {
        this.c = d10 * o2.c + o3.c;
        this.b = d10 * o2.b + o3.b;
        this.a = d10 * o2.a + o3.a;
    }

    public final void f(o o2) {
        o2.c = this.c;
        o2.b = this.b;
        o2.a = this.a;
    }

    public final void b(o o2, double d10) {
        this.c = (1.0 - d10) * this.c + d10 * o2.c;
        this.b = (1.0 - d10) * this.b + d10 * o2.b;
        this.a = (1.0 - d10) * this.a + d10 * o2.a;
    }

    public final void a(double[] arrd) {
        arrd[0] = this.c;
        arrd[1] = this.b;
        arrd[2] = this.a;
    }

    public final void a(double d10, double d11) {
        block21: {
            block22: {
                o o2;
                double d12;
                block19: {
                    int n2;
                    block20: {
                        block18: {
                            double d13;
                            block17: {
                                block15: {
                                    double d14;
                                    block16: {
                                        block14: {
                                            double d15;
                                            block13: {
                                                block11: {
                                                    double d16;
                                                    block12: {
                                                        n2 = ae.g();
                                                        double d17 = this.c - d11;
                                                        d12 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                        if (n2 != 0) break block11;
                                                        if (d12 <= 0) break block12;
                                                        this.c = d11;
                                                        if (n2 == 0) break block13;
                                                    }
                                                    d12 = (d16 = this.c - d10) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                                }
                                                if (n2 != 0) break block14;
                                                if (d12 < 0) {
                                                    this.c = d10;
                                                }
                                            }
                                            d12 = (d15 = this.b - d11) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        }
                                        if (n2 != 0) break block15;
                                        if (d12 <= 0) break block16;
                                        this.b = d11;
                                        if (n2 == 0) break block17;
                                    }
                                    d12 = (d14 = this.b - d10) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                }
                                if (n2 != 0) break block18;
                                if (d12 < 0) {
                                    this.b = d10;
                                }
                            }
                            d12 = (d13 = this.a - d11) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (n2 != 0) break block19;
                        if (d12 <= 0) break block20;
                        this.a = d11;
                        if (n2 == 0) break block21;
                    }
                    o2 = this;
                    if (n2 != 0) break block22;
                    double d18 = o2.a - d10;
                    d12 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                }
                if (d12 >= 0) break block21;
                o2 = this;
            }
            o2.a = d10;
        }
    }
}

