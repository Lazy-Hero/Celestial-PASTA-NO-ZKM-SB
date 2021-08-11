/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;
import net.minecraft.k.m;

public class dU
implements Serializable,
Cloneable {
    public /* synthetic */ float c;
    public /* synthetic */ float k;
    public /* synthetic */ float q;
    public /* synthetic */ float j;
    public /* synthetic */ float h;
    public /* synthetic */ float o;
    public /* synthetic */ float e;
    public /* synthetic */ float l;
    public /* synthetic */ float a;
    public /* synthetic */ float i;
    private static final /* synthetic */ double p = 1.0E-8;
    public /* synthetic */ float m;
    public /* synthetic */ float b;
    static final /* synthetic */ long serialVersionUID = -8405036035410109353L;
    public /* synthetic */ float f;
    public /* synthetic */ float g;
    public /* synthetic */ float n;
    public /* synthetic */ float d;

    public final void b(au au2) {
        au2.c = this.c;
        au2.a = this.o;
        au2.b = this.n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var6_6 = ae.g();
        if (var6_6 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2;
                this.a = var3_3;
                this.e = var4_4;
                this.q = var5_5;
lbl9:
                // 2 sources

                if (var6_6 == 0) return;
            }
            case 1: {
                this.i = var2_2;
                this.d = var3_3;
                this.k = var4_4;
                this.b = var5_5;
                if (var6_6 == 0) return;
            }
            case 2: {
                this.g = var2_2;
                this.f = var3_3;
                this.m = var4_4;
                this.j = var5_5;
                if (var6_6 == 0) return;
            }
            case 3: {
                this.c = var2_2;
                this.o = var3_3;
                this.n = var4_4;
                this.h = var5_5;
                if (var6_6 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f9"));
    }

    public final void a(gY gY2) {
        this.l = (float)gY2.h;
        this.i = (float)gY2.j;
        this.g = (float)gY2.i;
        this.c = 0.0f;
        this.a = (float)gY2.f;
        this.d = (float)gY2.d;
        this.f = (float)gY2.c;
        this.o = 0.0f;
        this.e = (float)gY2.g;
        this.k = (float)gY2.b;
        this.m = (float)gY2.e;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void f(dU dU2, dU dU3) {
        this.l = dU2.l - dU3.l;
        this.i = dU2.i - dU3.i;
        this.g = dU2.g - dU3.g;
        this.c = dU2.c - dU3.c;
        this.a = dU2.a - dU3.a;
        this.d = dU2.d - dU3.d;
        this.f = dU2.f - dU3.f;
        this.o = dU2.o - dU3.o;
        this.e = dU2.e - dU3.e;
        this.k = dU2.k - dU3.k;
        this.m = dU2.m - dU3.m;
        this.n = dU2.n - dU3.n;
        this.q = dU2.q - dU3.q;
        this.b = dU2.b - dU3.b;
        this.j = dU2.j - dU3.j;
        this.h = dU2.h - dU3.h;
    }

    public final void b(eG eG2) {
        block4: {
            float f10;
            float f11;
            block2: {
                block3: {
                    f11 = (float)Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n2 = ae.g();
                    f10 = f11;
                    if (n2 != 0) break block2;
                    if (!((double)f10 < 1.0E-8)) break block3;
                    this.l = 1.0f;
                    this.i = 0.0f;
                    this.g = 0.0f;
                    this.a = 0.0f;
                    this.d = 1.0f;
                    this.f = 0.0f;
                    this.e = 0.0f;
                    this.k = 0.0f;
                    this.m = 1.0f;
                    if (n2 == 0) break block4;
                }
                f11 = 1.0f / f11;
                f10 = eG2.e * f11;
            }
            float f12 = f10;
            float f13 = eG2.d * f11;
            float f14 = eG2.c * f11;
            float f15 = (float)Math.sin(eG2.a);
            float f16 = (float)Math.cos(eG2.a);
            float f17 = 1.0f - f16;
            float f18 = f12 * f14;
            float f19 = f12 * f13;
            float f20 = f13 * f14;
            this.l = f17 * f12 * f12 + f16;
            this.i = f17 * f19 - f15 * f14;
            this.g = f17 * f18 + f15 * f13;
            this.a = f17 * f19 + f15 * f14;
            this.d = f17 * f13 * f13 + f16;
            this.f = f17 * f20 - f15 * f12;
            this.e = f17 * f18 - f15 * f13;
            this.k = f17 * f20 + f15 * f12;
            this.m = f17 * f14 * f14 + f16;
        }
        this.c = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void g(dU dU2) {
        this.l += dU2.l;
        this.i += dU2.i;
        this.g += dU2.g;
        this.c += dU2.c;
        this.a += dU2.a;
        this.d += dU2.d;
        this.f += dU2.f;
        this.o += dU2.o;
        this.e += dU2.e;
        this.k += dU2.k;
        this.m += dU2.m;
        this.n += dU2.n;
        this.q += dU2.q;
        this.b += dU2.b;
        this.j += dU2.j;
        this.h += dU2.h;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean i(dU var1_1) {
        block46: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                var2_2 = ae.g();
                                                                try {
                                                                    block47: {
                                                                        cfr_temp_0 = this.l - var1_1.l;
                                                                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        if (var2_2 != 0) break block47;
                                                                        if (v0 != false) ** GOTO lbl115
                                                                        cfr_temp_1 = this.i - var1_1.i;
                                                                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                    }
                                                                    if (var2_2 != 0) break block33;
                                                                    if (v0 != false) ** GOTO lbl115
                                                                }
                                                                catch (NullPointerException var3_3) {
                                                                    return false;
                                                                }
                                                                cfr_temp_2 = this.g - var1_1.g;
                                                                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                            }
                                                            if (var2_2 != 0) break block34;
                                                            if (v0 != false) ** GOTO lbl115
                                                            cfr_temp_3 = this.c - var1_1.c;
                                                            v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                        }
                                                        if (var2_2 != 0) break block35;
                                                        if (v0 != false) ** GOTO lbl115
                                                        cfr_temp_4 = this.a - var1_1.a;
                                                        v0 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                                    }
                                                    if (var2_2 != 0) break block36;
                                                    if (v0 != false) ** GOTO lbl115
                                                    cfr_temp_5 = this.d - var1_1.d;
                                                    v0 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                                                }
                                                if (var2_2 != 0) break block37;
                                                if (v0 != false) ** GOTO lbl115
                                                cfr_temp_6 = this.f - var1_1.f;
                                                v0 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                                            }
                                            if (var2_2 != 0) break block38;
                                            if (v0 != false) ** GOTO lbl115
                                            cfr_temp_7 = this.o - var1_1.o;
                                            v0 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                        }
                                        if (var2_2 != 0) break block39;
                                        if (v0 != false) ** GOTO lbl115
                                        cfr_temp_8 = this.e - var1_1.e;
                                        v0 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
                                    }
                                    if (var2_2 != 0) break block40;
                                    if (v0 != false) ** GOTO lbl115
                                    cfr_temp_9 = this.k - var1_1.k;
                                    v0 = cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1);
                                }
                                if (var2_2 != 0) break block41;
                                if (v0 != false) ** GOTO lbl115
                                cfr_temp_10 = this.m - var1_1.m;
                                v0 = cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                            }
                            if (var2_2 != 0) break block42;
                            if (v0 != false) ** GOTO lbl115
                            cfr_temp_11 = this.n - var1_1.n;
                            v0 = cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1);
                        }
                        if (var2_2 != 0) break block43;
                        if (v0 != false) ** GOTO lbl115
                        cfr_temp_12 = this.q - var1_1.q;
                        v0 = cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 != 0) break block44;
                    if (v0 != false) ** GOTO lbl115
                    cfr_temp_13 = this.b - var1_1.b;
                    v0 = cfr_temp_13 == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1);
                }
                if (var2_2 != 0) break block45;
                if (v0 != false) ** GOTO lbl115
                cfr_temp_14 = this.j - var1_1.j;
                v0 = cfr_temp_14 == 0.0f ? 0 : (cfr_temp_14 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) break block46;
            if (v0 != false) ** GOTO lbl115
            cfr_temp_15 = this.h - var1_1.h;
            v0 = cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl115
        v0 = (float)true;
        return (boolean)v0;
lbl115:
        // 16 sources

        v0 = (float)false;
        return (boolean)v0;
    }

    public final void q(float f10) {
        this.q = f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, aT var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2.c;
                this.a = var2_2.a;
                this.e = var2_2.b;
                this.q = var2_2.d;
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.i = var2_2.c;
                this.d = var2_2.a;
                this.k = var2_2.b;
                this.b = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 2: {
                this.g = var2_2.c;
                this.f = var2_2.a;
                this.m = var2_2.b;
                this.j = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 3: {
                this.c = var2_2.c;
                this.o = var2_2.a;
                this.n = var2_2.b;
                this.h = var2_2.d;
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f9"));
    }

    public String toString() {
        return this.l + ", " + this.i + ", " + this.g + ", " + this.c + "\n" + this.a + ", " + this.d + ", " + this.f + ", " + this.o + "\n" + this.e + ", " + this.k + ", " + this.m + ", " + this.n + "\n" + this.q + ", " + this.b + ", " + this.j + ", " + this.h + "\n";
    }

    public final void b(float f10) {
        this.k = f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean equals(Object var1_1) {
        block47: {
            block46: {
                block45: {
                    block44: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block39: {
                                            block38: {
                                                block37: {
                                                    block36: {
                                                        block35: {
                                                            block34: {
                                                                block48: {
                                                                    var2_2 = ae.f();
                                                                    var3_3 = (dU)var1_1;
                                                                    cfr_temp_0 = this.l - var3_3.l;
                                                                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                    if (var2_2 == 0) break block48;
                                                                    if (v0 != false) ** GOTO lbl114
                                                                    cfr_temp_1 = this.i - var3_3.i;
                                                                    v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                }
                                                                if (var2_2 == 0) break block34;
                                                                if (v0 != false) ** GOTO lbl114
                                                                cfr_temp_2 = this.g - var3_3.g;
                                                                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                            }
                                                            if (var2_2 == 0) break block35;
                                                            if (v0 != false) ** GOTO lbl114
                                                            cfr_temp_3 = this.c - var3_3.c;
                                                            v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                        }
                                                        if (var2_2 == 0) break block36;
                                                        if (v0 != false) ** GOTO lbl114
                                                        cfr_temp_4 = this.a - var3_3.a;
                                                        v0 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                                    }
                                                    if (var2_2 == 0) break block37;
                                                    if (v0 != false) ** GOTO lbl114
                                                    cfr_temp_5 = this.d - var3_3.d;
                                                    v0 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                                                }
                                                if (var2_2 == 0) break block38;
                                                if (v0 != false) ** GOTO lbl114
                                                cfr_temp_6 = this.f - var3_3.f;
                                                v0 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                                            }
                                            if (var2_2 == 0) break block39;
                                            if (v0 != false) ** GOTO lbl114
                                            cfr_temp_7 = this.o - var3_3.o;
                                            v0 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                        }
                                        if (var2_2 == 0) break block40;
                                        if (v0 != false) ** GOTO lbl114
                                        cfr_temp_8 = this.e - var3_3.e;
                                        v0 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
                                    }
                                    if (var2_2 == 0) break block41;
                                    if (v0 != false) ** GOTO lbl114
                                    cfr_temp_9 = this.k - var3_3.k;
                                    v0 = cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1);
                                }
                                if (var2_2 == 0) break block42;
                                if (v0 != false) ** GOTO lbl114
                                cfr_temp_10 = this.m - var3_3.m;
                                v0 = cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                            }
                            if (var2_2 == 0) break block43;
                            if (v0 != false) ** GOTO lbl114
                            cfr_temp_11 = this.n - var3_3.n;
                            v0 = cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1);
                        }
                        if (var2_2 == 0) break block44;
                        if (v0 != false) ** GOTO lbl114
                        cfr_temp_12 = this.q - var3_3.q;
                        v0 = cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 == 0) break block45;
                    if (v0 != false) ** GOTO lbl114
                    cfr_temp_13 = this.b - var3_3.b;
                    v0 = cfr_temp_13 == 0.0f ? 0 : (cfr_temp_13 > 0.0f ? 1 : -1);
                }
                if (var2_2 == 0) break block46;
                if (v0 != false) ** GOTO lbl114
                cfr_temp_14 = this.j - var3_3.j;
                v0 = cfr_temp_14 == 0.0f ? 0 : (cfr_temp_14 > 0.0f ? 1 : -1);
            }
            if (var2_2 == 0) break block47;
            if (v0 != false) ** GOTO lbl114
            cfr_temp_15 = this.h - var3_3.h;
            v0 = cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl114
        try {
            v0 = (float)true;
            return (boolean)v0;
lbl114:
            // 16 sources

            v0 = (float)false;
            return (boolean)v0;
        }
        catch (ClassCastException var3_4) {
            return false;
        }
        catch (NullPointerException var3_5) {
            return false;
        }
    }

    public final float k() {
        return this.a;
    }

    public final void a(eG eG2) {
        block4: {
            double d10;
            double d11;
            double d12;
            double[] arrd;
            block2: {
                block3: {
                    double[] arrd2 = new double[9];
                    int n2 = ae.g();
                    arrd = new double[3];
                    this.a(arrd, arrd2);
                    d12 = Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n3 = n2;
                    d11 = d12;
                    d10 = 1.0E-8;
                    if (n3 != 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.l = 1.0f;
                    this.i = 0.0f;
                    this.g = 0.0f;
                    this.a = 0.0f;
                    this.d = 1.0f;
                    this.f = 0.0f;
                    this.e = 0.0f;
                    this.k = 0.0f;
                    this.m = 1.0f;
                    if (n3 == 0) break block4;
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
            double d19 = eG2.e * eG2.c;
            double d20 = eG2.e * eG2.d;
            double d21 = eG2.d * eG2.c;
            this.l = (float)((d18 * d13 * d13 + d17) * arrd[0]);
            this.i = (float)((d18 * d20 - d16 * d15) * arrd[1]);
            this.g = (float)((d18 * d19 + d16 * d14) * arrd[2]);
            this.a = (float)((d18 * d20 + d16 * d15) * arrd[0]);
            this.d = (float)((d18 * d14 * d14 + d17) * arrd[1]);
            this.f = (float)((d18 * d21 - d16 * d13) * arrd[2]);
            this.e = (float)((d18 * d19 - d16 * d14) * arrd[0]);
            this.k = (float)((d18 * d21 + d16 * d13) * arrd[1]);
            this.m = (float)((d18 * d15 * d15 + d17) * arrd[2]);
        }
    }

    public final void m() {
        float f10 = this.a;
        this.a = this.i;
        this.i = f10;
        f10 = this.e;
        this.e = this.g;
        this.g = f10;
        f10 = this.q;
        this.q = this.c;
        this.c = f10;
        f10 = this.k;
        this.k = this.f;
        this.f = f10;
        f10 = this.b;
        this.b = this.o;
        this.o = f10;
        f10 = this.j;
        this.j = this.n;
        this.n = f10;
    }

    public final void a(dc dc2, au au2, float f10) {
        this.l = dc2.j * f10;
        this.i = dc2.d * f10;
        this.g = dc2.a * f10;
        this.c = au2.c;
        this.a = dc2.c * f10;
        this.d = dc2.g * f10;
        this.f = dc2.h * f10;
        this.o = au2.a;
        this.e = dc2.f * f10;
        this.k = dc2.e * f10;
        this.m = dc2.i * f10;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void c(dc dc2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        dc2.j = (float)arrd[0];
        dc2.d = (float)arrd[1];
        dc2.a = (float)arrd[2];
        dc2.c = (float)arrd[3];
        dc2.g = (float)arrd[4];
        dc2.h = (float)arrd[5];
        dc2.f = (float)arrd[6];
        dc2.e = (float)arrd[7];
        dc2.i = (float)arrd[8];
    }

    public final float g() {
        return this.f;
    }

    public final void a(X x2) {
        float f10 = this.l * x2.c + this.i * x2.a + this.g * x2.b + this.c;
        float f11 = this.a * x2.c + this.d * x2.a + this.f * x2.b + this.o;
        x2.b = this.e * x2.c + this.k * x2.a + this.m * x2.b + this.n;
        x2.c = f10;
        x2.a = f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var6_6 = ae.f();
        if (var6_6 == 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2;
                this.i = var3_3;
                this.g = var4_4;
                this.c = var5_5;
lbl9:
                // 2 sources

                if (var6_6 != 0) return;
            }
            case 1: {
                this.a = var2_2;
                this.d = var3_3;
                this.f = var4_4;
                this.o = var5_5;
                if (var6_6 != 0) return;
            }
            case 2: {
                this.e = var2_2;
                this.k = var3_3;
                this.m = var4_4;
                this.n = var5_5;
                if (var6_6 != 0) return;
            }
            case 3: {
                this.q = var2_2;
                this.b = var3_3;
                this.j = var4_4;
                this.h = var5_5;
                if (var6_6 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f6"));
    }

    public final void t(float f10) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.l = (float)(arrd[0] * (double)f10);
        this.i = (float)(arrd[1] * (double)f10);
        this.g = (float)(arrd[2] * (double)f10);
        this.a = (float)(arrd[3] * (double)f10);
        this.d = (float)(arrd[4] * (double)f10);
        this.f = (float)(arrd[5] * (double)f10);
        this.e = (float)(arrd[6] * (double)f10);
        this.k = (float)(arrd[7] * (double)f10);
        this.m = (float)(arrd[8] * (double)f10);
    }

    public final void g(float f10) {
        this.f = f10;
    }

    public final void m(float f10) {
        this.o = f10;
    }

    public final void d(dc dc2) {
        this.l = dc2.j;
        this.i = dc2.d;
        this.g = dc2.a;
        this.c = 0.0f;
        this.a = dc2.c;
        this.d = dc2.g;
        this.f = dc2.h;
        this.o = 0.0f;
        this.e = dc2.f;
        this.k = dc2.e;
        this.m = dc2.i;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void a(float f10) {
        this.h = f10;
    }

    public final void a(ae ae2, ae ae3) {
        float f10 = this.l * ae2.c + this.i * ae2.a + this.g * ae2.b + this.c * ae2.d;
        float f11 = this.a * ae2.c + this.d * ae2.a + this.f * ae2.b + this.o * ae2.d;
        float f12 = this.e * ae2.c + this.k * ae2.a + this.m * ae2.b + this.n * ae2.d;
        ae3.d = this.q * ae2.c + this.b * ae2.a + this.j * ae2.b + this.h * ae2.d;
        ae3.c = f10;
        ae3.a = f11;
        ae3.b = f12;
    }

    public final void c(dU dU2, dU dU3) {
        block4: {
            dU dU4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU2) break block3;
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU3) break block3;
                    this.l = dU2.l * dU3.l + dU2.a * dU3.a + dU2.e * dU3.e + dU2.q * dU3.q;
                    this.i = dU2.l * dU3.i + dU2.a * dU3.d + dU2.e * dU3.k + dU2.q * dU3.b;
                    this.g = dU2.l * dU3.g + dU2.a * dU3.f + dU2.e * dU3.m + dU2.q * dU3.j;
                    this.c = dU2.l * dU3.c + dU2.a * dU3.o + dU2.e * dU3.n + dU2.q * dU3.h;
                    this.a = dU2.i * dU3.l + dU2.d * dU3.a + dU2.k * dU3.e + dU2.b * dU3.q;
                    this.d = dU2.i * dU3.i + dU2.d * dU3.d + dU2.k * dU3.k + dU2.b * dU3.b;
                    this.f = dU2.i * dU3.g + dU2.d * dU3.f + dU2.k * dU3.m + dU2.b * dU3.j;
                    this.o = dU2.i * dU3.c + dU2.d * dU3.o + dU2.k * dU3.n + dU2.b * dU3.h;
                    this.e = dU2.g * dU3.l + dU2.f * dU3.a + dU2.m * dU3.e + dU2.j * dU3.q;
                    this.k = dU2.g * dU3.i + dU2.f * dU3.d + dU2.m * dU3.k + dU2.j * dU3.b;
                    this.m = dU2.g * dU3.g + dU2.f * dU3.f + dU2.m * dU3.m + dU2.j * dU3.j;
                    this.n = dU2.g * dU3.c + dU2.f * dU3.o + dU2.m * dU3.n + dU2.j * dU3.h;
                    this.q = dU2.c * dU3.l + dU2.o * dU3.a + dU2.n * dU3.e + dU2.h * dU3.q;
                    this.b = dU2.c * dU3.i + dU2.o * dU3.d + dU2.n * dU3.k + dU2.h * dU3.b;
                    this.j = dU2.c * dU3.g + dU2.o * dU3.f + dU2.n * dU3.m + dU2.h * dU3.j;
                    this.h = dU2.c * dU3.c + dU2.o * dU3.o + dU2.n * dU3.n + dU2.h * dU3.h;
                    if (n2 != 0) break block4;
                }
                dU4 = dU2;
            }
            float f10 = dU4.l * dU3.l + dU2.a * dU3.a + dU2.e * dU3.e + dU2.q * dU3.q;
            float f11 = dU2.l * dU3.i + dU2.a * dU3.d + dU2.e * dU3.k + dU2.q * dU3.b;
            float f12 = dU2.l * dU3.g + dU2.a * dU3.f + dU2.e * dU3.m + dU2.q * dU3.j;
            float f13 = dU2.l * dU3.c + dU2.a * dU3.o + dU2.e * dU3.n + dU2.q * dU3.h;
            float f14 = dU2.i * dU3.l + dU2.d * dU3.a + dU2.k * dU3.e + dU2.b * dU3.q;
            float f15 = dU2.i * dU3.i + dU2.d * dU3.d + dU2.k * dU3.k + dU2.b * dU3.b;
            float f16 = dU2.i * dU3.g + dU2.d * dU3.f + dU2.k * dU3.m + dU2.b * dU3.j;
            float f17 = dU2.i * dU3.c + dU2.d * dU3.o + dU2.k * dU3.n + dU2.b * dU3.h;
            float f18 = dU2.g * dU3.l + dU2.f * dU3.a + dU2.m * dU3.e + dU2.j * dU3.q;
            float f19 = dU2.g * dU3.i + dU2.f * dU3.d + dU2.m * dU3.k + dU2.j * dU3.b;
            float f20 = dU2.g * dU3.g + dU2.f * dU3.f + dU2.m * dU3.m + dU2.j * dU3.j;
            float f21 = dU2.g * dU3.c + dU2.f * dU3.o + dU2.m * dU3.n + dU2.j * dU3.h;
            float f22 = dU2.c * dU3.l + dU2.o * dU3.a + dU2.n * dU3.e + dU2.h * dU3.q;
            float f23 = dU2.c * dU3.i + dU2.o * dU3.d + dU2.n * dU3.k + dU2.h * dU3.b;
            float f24 = dU2.c * dU3.g + dU2.o * dU3.f + dU2.n * dU3.m + dU2.h * dU3.j;
            float f25 = dU2.c * dU3.c + dU2.o * dU3.o + dU2.n * dU3.n + dU2.h * dU3.h;
            this.l = f10;
            this.i = f11;
            this.g = f12;
            this.c = f13;
            this.a = f14;
            this.d = f15;
            this.f = f16;
            this.o = f17;
            this.e = f18;
            this.k = f19;
            this.m = f20;
            this.n = f21;
            this.q = f22;
            this.b = f23;
            this.j = f24;
            this.h = f25;
        }
    }

    public final void a(ao ao2, au au2, float f10) {
        this.l = f10 * (1.0f - 2.0f * ao2.a * ao2.a - 2.0f * ao2.b * ao2.b);
        this.a = f10 * (2.0f * (ao2.c * ao2.a + ao2.d * ao2.b));
        this.e = f10 * (2.0f * (ao2.c * ao2.b - ao2.d * ao2.a));
        this.i = f10 * (2.0f * (ao2.c * ao2.a - ao2.d * ao2.b));
        this.d = f10 * (1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.b * ao2.b);
        this.k = f10 * (2.0f * (ao2.a * ao2.b + ao2.d * ao2.c));
        this.g = f10 * (2.0f * (ao2.c * ao2.b + ao2.d * ao2.a));
        this.f = f10 * (2.0f * (ao2.a * ao2.b - ao2.d * ao2.c));
        this.m = f10 * (1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.a * ao2.a);
        this.c = au2.c;
        this.o = au2.a;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, float[] var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2[0];
                this.a = var2_2[1];
                this.e = var2_2[2];
                this.q = var2_2[3];
lbl9:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.i = var2_2[0];
                this.d = var2_2[1];
                this.k = var2_2[2];
                this.b = var2_2[3];
                if (var3_3 != 0) return;
            }
            case 2: {
                this.g = var2_2[0];
                this.f = var2_2[1];
                this.m = var2_2[2];
                this.j = var2_2[3];
                if (var3_3 != 0) return;
            }
            case 3: {
                this.c = var2_2[0];
                this.o = var2_2[1];
                this.n = var2_2[2];
                this.h = var2_2[3];
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f9"));
    }

    public final void b(int n2, float[] arrf) {
        block4: {
            block9: {
                int n3;
                int n4;
                int n5;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                block2: {
                                    block3: {
                                        n5 = ae.f();
                                        n4 = n2;
                                        if (n5 == 0) break block2;
                                        if (n4 != 0) break block3;
                                        arrf[0] = this.l;
                                        arrf[1] = this.a;
                                        arrf[2] = this.e;
                                        arrf[3] = this.q;
                                        if (n5 != 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 == 0) break block5;
                                if (n4 != n3) break block6;
                                arrf[0] = this.i;
                                arrf[1] = this.d;
                                arrf[2] = this.k;
                                arrf[3] = this.b;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 == 0) break block7;
                        if (n4 != n3) break block8;
                        arrf[0] = this.g;
                        arrf[1] = this.f;
                        arrf[2] = this.m;
                        arrf[3] = this.j;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                arrf[0] = this.c;
                arrf[1] = this.o;
                arrf[2] = this.n;
                arrf[3] = this.h;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f4"));
        }
    }

    public final float h() {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        return (float)gY.d(arrd2);
    }

    public dU(dU dU2) {
        this.l = dU2.l;
        this.i = dU2.i;
        this.g = dU2.g;
        this.c = dU2.c;
        this.a = dU2.a;
        this.d = dU2.d;
        this.f = dU2.f;
        this.o = dU2.o;
        this.e = dU2.e;
        this.k = dU2.k;
        this.m = dU2.m;
        this.n = dU2.n;
        this.q = dU2.q;
        this.b = dU2.b;
        this.j = dU2.j;
        this.h = dU2.h;
    }

    public final void e(dc dc2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.l = (float)((double)dc2.j * arrd2[0]);
        this.i = (float)((double)dc2.d * arrd2[1]);
        this.g = (float)((double)dc2.a * arrd2[2]);
        this.a = (float)((double)dc2.c * arrd2[0]);
        this.d = (float)((double)dc2.g * arrd2[1]);
        this.f = (float)((double)dc2.h * arrd2[2]);
        this.e = (float)((double)dc2.f * arrd2[0]);
        this.k = (float)((double)dc2.e * arrd2[1]);
        this.m = (float)((double)dc2.i * arrd2[2]);
    }

    public final void a(ae ae2) {
        float f10 = this.l * ae2.c + this.i * ae2.a + this.g * ae2.b + this.c * ae2.d;
        float f11 = this.a * ae2.c + this.d * ae2.a + this.f * ae2.b + this.o * ae2.d;
        float f12 = this.e * ae2.c + this.k * ae2.a + this.m * ae2.b + this.n * ae2.d;
        ae2.d = this.q * ae2.c + this.b * ae2.a + this.j * ae2.b + this.h * ae2.d;
        ae2.c = f10;
        ae2.a = f11;
        ae2.b = f12;
    }

    public final float i() {
        return this.q;
    }

    public final void o(float f10) {
        this.i = f10;
    }

    public final void b(float f10, dU dU2) {
        this.l = dU2.l + f10;
        this.i = dU2.i + f10;
        this.g = dU2.g + f10;
        this.c = dU2.c + f10;
        this.a = dU2.a + f10;
        this.d = dU2.d + f10;
        this.f = dU2.f + f10;
        this.o = dU2.o + f10;
        this.e = dU2.e + f10;
        this.k = dU2.k + f10;
        this.m = dU2.m + f10;
        this.n = dU2.n + f10;
        this.q = dU2.q + f10;
        this.b = dU2.b + f10;
        this.j = dU2.j + f10;
        this.h = dU2.h + f10;
    }

    public final float t() {
        return this.n;
    }

    public final void b(dU dU2, dU dU3) {
        block4: {
            dU dU4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU2) break block3;
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU3) break block3;
                    this.l = dU2.l * dU3.l + dU2.i * dU3.i + dU2.g * dU3.g + dU2.c * dU3.c;
                    this.i = dU2.l * dU3.a + dU2.i * dU3.d + dU2.g * dU3.f + dU2.c * dU3.o;
                    this.g = dU2.l * dU3.e + dU2.i * dU3.k + dU2.g * dU3.m + dU2.c * dU3.n;
                    this.c = dU2.l * dU3.q + dU2.i * dU3.b + dU2.g * dU3.j + dU2.c * dU3.h;
                    this.a = dU2.a * dU3.l + dU2.d * dU3.i + dU2.f * dU3.g + dU2.o * dU3.c;
                    this.d = dU2.a * dU3.a + dU2.d * dU3.d + dU2.f * dU3.f + dU2.o * dU3.o;
                    this.f = dU2.a * dU3.e + dU2.d * dU3.k + dU2.f * dU3.m + dU2.o * dU3.n;
                    this.o = dU2.a * dU3.q + dU2.d * dU3.b + dU2.f * dU3.j + dU2.o * dU3.h;
                    this.e = dU2.e * dU3.l + dU2.k * dU3.i + dU2.m * dU3.g + dU2.n * dU3.c;
                    this.k = dU2.e * dU3.a + dU2.k * dU3.d + dU2.m * dU3.f + dU2.n * dU3.o;
                    this.m = dU2.e * dU3.e + dU2.k * dU3.k + dU2.m * dU3.m + dU2.n * dU3.n;
                    this.n = dU2.e * dU3.q + dU2.k * dU3.b + dU2.m * dU3.j + dU2.n * dU3.h;
                    this.q = dU2.q * dU3.l + dU2.b * dU3.i + dU2.j * dU3.g + dU2.h * dU3.c;
                    this.b = dU2.q * dU3.a + dU2.b * dU3.d + dU2.j * dU3.f + dU2.h * dU3.o;
                    this.j = dU2.q * dU3.e + dU2.b * dU3.k + dU2.j * dU3.m + dU2.h * dU3.n;
                    this.h = dU2.q * dU3.q + dU2.b * dU3.b + dU2.j * dU3.j + dU2.h * dU3.h;
                    if (n2 != 0) break block4;
                }
                dU4 = dU2;
            }
            float f10 = dU4.l * dU3.l + dU2.i * dU3.i + dU2.g * dU3.g + dU2.c * dU3.c;
            float f11 = dU2.l * dU3.a + dU2.i * dU3.d + dU2.g * dU3.f + dU2.c * dU3.o;
            float f12 = dU2.l * dU3.e + dU2.i * dU3.k + dU2.g * dU3.m + dU2.c * dU3.n;
            float f13 = dU2.l * dU3.q + dU2.i * dU3.b + dU2.g * dU3.j + dU2.c * dU3.h;
            float f14 = dU2.a * dU3.l + dU2.d * dU3.i + dU2.f * dU3.g + dU2.o * dU3.c;
            float f15 = dU2.a * dU3.a + dU2.d * dU3.d + dU2.f * dU3.f + dU2.o * dU3.o;
            float f16 = dU2.a * dU3.e + dU2.d * dU3.k + dU2.f * dU3.m + dU2.o * dU3.n;
            float f17 = dU2.a * dU3.q + dU2.d * dU3.b + dU2.f * dU3.j + dU2.o * dU3.h;
            float f18 = dU2.e * dU3.l + dU2.k * dU3.i + dU2.m * dU3.g + dU2.n * dU3.c;
            float f19 = dU2.e * dU3.a + dU2.k * dU3.d + dU2.m * dU3.f + dU2.n * dU3.o;
            float f20 = dU2.e * dU3.e + dU2.k * dU3.k + dU2.m * dU3.m + dU2.n * dU3.n;
            float f21 = dU2.e * dU3.q + dU2.k * dU3.b + dU2.m * dU3.j + dU2.n * dU3.h;
            float f22 = dU2.q * dU3.l + dU2.b * dU3.i + dU2.j * dU3.g + dU2.h * dU3.c;
            float f23 = dU2.q * dU3.a + dU2.b * dU3.d + dU2.j * dU3.f + dU2.h * dU3.o;
            float f24 = dU2.q * dU3.e + dU2.b * dU3.k + dU2.j * dU3.m + dU2.h * dU3.n;
            float f25 = dU2.q * dU3.q + dU2.b * dU3.b + dU2.j * dU3.j + dU2.h * dU3.h;
            this.l = f10;
            this.i = f11;
            this.g = f12;
            this.c = f13;
            this.a = f14;
            this.d = f15;
            this.f = f16;
            this.o = f17;
            this.e = f18;
            this.k = f19;
            this.m = f20;
            this.n = f21;
            this.q = f22;
            this.b = f23;
            this.j = f24;
            this.h = f25;
        }
    }

    public final void j(float f10) {
        this.e = f10;
    }

    public final void a(dU dU2, dU dU3) {
        this.l = dU2.l + dU3.l;
        this.i = dU2.i + dU3.i;
        this.g = dU2.g + dU3.g;
        this.c = dU2.c + dU3.c;
        this.a = dU2.a + dU3.a;
        this.d = dU2.d + dU3.d;
        this.f = dU2.f + dU3.f;
        this.o = dU2.o + dU3.o;
        this.e = dU2.e + dU3.e;
        this.k = dU2.k + dU3.k;
        this.m = dU2.m + dU3.m;
        this.n = dU2.n + dU3.n;
        this.q = dU2.q + dU3.q;
        this.b = dU2.b + dU3.b;
        this.j = dU2.j + dU3.j;
        this.h = dU2.h + dU3.h;
    }

    public final void a(au au2, float f10) {
        this.l = f10;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = f10 * au2.c;
        this.a = 0.0f;
        this.d = f10;
        this.f = 0.0f;
        this.o = f10 * au2.a;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = f10;
        this.n = f10 * au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public dU(dA dA2) {
        this.l = (float)dA2.o;
        this.i = (float)dA2.f;
        this.g = (float)dA2.m;
        this.c = (float)dA2.p;
        this.a = (float)dA2.b;
        this.d = (float)dA2.l;
        this.f = (float)dA2.g;
        this.o = (float)dA2.q;
        this.e = (float)dA2.k;
        this.k = (float)dA2.i;
        this.m = (float)dA2.h;
        this.n = (float)dA2.e;
        this.q = (float)dA2.a;
        this.b = (float)dA2.j;
        this.j = (float)dA2.n;
        this.h = (float)dA2.d;
    }

    public final void a(dA dA2) {
        this.l = (float)dA2.o;
        this.i = (float)dA2.f;
        this.g = (float)dA2.m;
        this.c = (float)dA2.p;
        this.a = (float)dA2.b;
        this.d = (float)dA2.l;
        this.f = (float)dA2.g;
        this.o = (float)dA2.q;
        this.e = (float)dA2.k;
        this.k = (float)dA2.i;
        this.m = (float)dA2.h;
        this.n = (float)dA2.e;
        this.q = (float)dA2.a;
        this.b = (float)dA2.j;
        this.j = (float)dA2.n;
        this.h = (float)dA2.d;
    }

    public final float f() {
        return this.i;
    }

    public final void c(gY gY2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        gY2.h = arrd[0];
        gY2.j = arrd[1];
        gY2.i = arrd[2];
        gY2.f = arrd[3];
        gY2.d = arrd[4];
        gY2.c = arrd[5];
        gY2.g = arrd[6];
        gY2.b = arrd[7];
        gY2.e = arrd[8];
    }

    public dU() {
        this.l = 0.0f;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = 0.0f;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 0.0f;
    }

    public final void a(dU dU2) {
        this.l = dU2.l;
        this.i = dU2.i;
        this.g = dU2.g;
        this.c = dU2.c;
        this.a = dU2.a;
        this.d = dU2.d;
        this.f = dU2.f;
        this.o = dU2.o;
        this.e = dU2.e;
        this.k = dU2.k;
        this.m = dU2.m;
        this.n = dU2.n;
        this.q = dU2.q;
        this.b = dU2.b;
        this.j = dU2.j;
        this.h = dU2.h;
    }

    public final void h(dU dU2) {
        this.l -= dU2.l;
        this.i -= dU2.i;
        this.g -= dU2.g;
        this.c -= dU2.c;
        this.a -= dU2.a;
        this.d -= dU2.d;
        this.f -= dU2.f;
        this.o -= dU2.o;
        this.e -= dU2.e;
        this.k -= dU2.k;
        this.m -= dU2.m;
        this.n -= dU2.n;
        this.q -= dU2.q;
        this.b -= dU2.b;
        this.j -= dU2.j;
        this.h -= dU2.h;
    }

    public final void l() {
        this.l = 1.0f;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = 1.0f;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = 1.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void a(int n2, aT aT2) {
        block4: {
            block9: {
                int n3;
                int n4;
                int n5;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                block2: {
                                    block3: {
                                        n5 = ae.g();
                                        n4 = n2;
                                        if (n5 != 0) break block2;
                                        if (n4 != 0) break block3;
                                        aT2.c = this.l;
                                        aT2.a = this.a;
                                        aT2.b = this.e;
                                        aT2.d = this.q;
                                        if (n5 == 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 != 0) break block5;
                                if (n4 != n3) break block6;
                                aT2.c = this.i;
                                aT2.a = this.d;
                                aT2.b = this.k;
                                aT2.d = this.b;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 != 0) break block7;
                        if (n4 != n3) break block8;
                        aT2.c = this.g;
                        aT2.a = this.f;
                        aT2.b = this.m;
                        aT2.d = this.j;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                aT2.c = this.c;
                aT2.a = this.o;
                aT2.b = this.n;
                aT2.d = this.h;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f4"));
        }
    }

    public final float r() {
        return this.h;
    }

    public dU(ao ao2, au au2, float f10) {
        this.l = (float)((double)f10 * (1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b));
        this.a = (float)((double)f10 * (2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b)));
        this.e = (float)((double)f10 * (2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a)));
        this.i = (float)((double)f10 * (2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b)));
        this.d = (float)((double)f10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b));
        this.k = (float)((double)f10 * (2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c)));
        this.g = (float)((double)f10 * (2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a)));
        this.f = (float)((double)f10 * (2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c)));
        this.m = (float)((double)f10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a));
        this.c = au2.c;
        this.o = au2.a;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final float w() {
        float f10 = this.l * (this.d * this.m * this.h + this.f * this.n * this.b + this.o * this.k * this.j - this.o * this.m * this.b - this.d * this.n * this.j - this.f * this.k * this.h);
        f10 -= this.i * (this.a * this.m * this.h + this.f * this.n * this.q + this.o * this.e * this.j - this.o * this.m * this.q - this.a * this.n * this.j - this.f * this.e * this.h);
        f10 += this.g * (this.a * this.k * this.h + this.d * this.n * this.q + this.o * this.e * this.b - this.o * this.k * this.q - this.a * this.n * this.b - this.d * this.e * this.h);
        return f10 -= this.c * (this.a * this.k * this.j + this.d * this.m * this.q + this.f * this.e * this.b - this.f * this.k * this.q - this.a * this.m * this.b - this.d * this.e * this.j);
    }

    public final void a() {
        this.l = 0.0f;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = 0.0f;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 0.0f;
    }

    public final void a(au au2) {
        this.l = 1.0f;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = au2.c;
        this.a = 0.0f;
        this.d = 1.0f;
        this.f = 0.0f;
        this.o = au2.a;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = 1.0f;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    private final void a(double[] arrd, double[] arrd2) {
        double[] arrd3 = new double[]{this.l, this.i, this.g, this.a, this.d, this.f, this.e, this.k, this.m};
        gY.b(arrd3, arrd, arrd2);
    }

    public final void c(au au2) {
        float f10 = this.l * au2.c + this.i * au2.a + this.g * au2.b;
        float f11 = this.a * au2.c + this.d * au2.a + this.f * au2.b;
        au2.b = this.e * au2.c + this.k * au2.a + this.m * au2.b;
        au2.c = f10;
        au2.a = f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, aT var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2.c;
                this.i = var2_2.a;
                this.g = var2_2.b;
                this.c = var2_2.d;
lbl9:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.a = var2_2.c;
                this.d = var2_2.a;
                this.f = var2_2.b;
                this.o = var2_2.d;
                if (var3_3 != 0) return;
            }
            case 2: {
                this.e = var2_2.c;
                this.k = var2_2.a;
                this.m = var2_2.b;
                this.n = var2_2.d;
                if (var3_3 != 0) return;
            }
            case 3: {
                this.q = var2_2.c;
                this.b = var2_2.a;
                this.j = var2_2.b;
                this.h = var2_2.d;
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f6"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, int var2_2, float var3_3) {
        var4_4 = ae.g();
        v0 = var1_1;
        if (var4_4 != 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        this.l = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 1: {
                        this.i = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 2: {
                        this.g = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 3: {
                        this.c = var3_3;
                        if (var4_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f0"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        this.a = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 1: {
                        this.d = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 2: {
                        this.f = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 3: {
                        this.o = var3_3;
                        if (var4_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f0"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        this.e = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 1: {
                        this.k = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 2: {
                        this.m = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 3: {
                        this.n = var3_3;
                        if (var4_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f0"));
            }
            case 3: {
                switch (var2_2) {
                    case 0: {
                        this.q = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 1: {
                        this.b = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 2: {
                        this.j = var3_3;
                        if (var4_4 == 0) return;
                    }
                    case 3: {
                        this.h = var3_3;
                        if (var4_4 == 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f0"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f0"));
    }

    public boolean a(dU dU2, float f10) {
        int n2 = ae.f();
        float f11 = Math.abs(this.l - dU2.l) - f10;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            f12 = f12 <= 0 ? 1.0f : 0.0f;
        }
        float f13 = f12;
        float f14 = Math.abs(this.i - dU2.i) - f10;
        float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            float f16;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f16 = Math.abs(this.g - dU2.g) - f10) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f17;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f17 = Math.abs(this.c - dU2.c) - f10) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f18;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f18 = Math.abs(this.a - dU2.a) - f10) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f19;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f19 = Math.abs(this.d - dU2.d) - f10) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f20;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f20 = Math.abs(this.f - dU2.f) - f10) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f21;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f21 = Math.abs(this.o - dU2.o) - f10) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f22;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f22 = Math.abs(this.e - dU2.e) - f10) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f23;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f23 = Math.abs(this.k - dU2.k) - f10) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f24;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f24 = Math.abs(this.m - dU2.m) - f10) == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f25;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f25 = Math.abs(this.n - dU2.n) - f10) == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f26;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f26 = Math.abs(this.q - dU2.q) - f10) == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f27;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f27 = Math.abs(this.b - dU2.b) - f10) == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f28;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f28 = Math.abs(this.j - dU2.j) - f10) == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f29;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f29 = Math.abs(this.h - dU2.h) - f10) == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = f13;
        }
        return (boolean)f15;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final float a(int var1_1, int var2_2) {
        var3_3 = ae.f();
        v0 = var1_1;
        if (var3_3 == 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        return this.l;
                    }
                    case 1: {
                        return this.i;
                    }
                    case 2: {
                        return this.g;
                    }
                    case 3: {
                        return this.c;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f1"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        return this.a;
                    }
                    case 1: {
                        return this.d;
                    }
                    case 2: {
                        return this.f;
                    }
                    case 3: {
                        return this.o;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f1"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        return this.e;
                    }
                    case 1: {
                        return this.k;
                    }
                    case 2: {
                        return this.m;
                    }
                    case 3: {
                        return this.n;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f1"));
            }
            case 3: {
                switch (var2_2) {
                    case 0: {
                        return this.q;
                    }
                    case 1: {
                        return this.b;
                    }
                    case 2: {
                        return this.j;
                    }
                    case 3: {
                        return this.h;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f1"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f1"));
    }

    public final void u(float f10) {
        this.l = f10;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = f10;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = f10;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void b(dc dc2) {
        this.l = dc2.j;
        this.i = dc2.d;
        this.g = dc2.a;
        this.a = dc2.c;
        this.d = dc2.g;
        this.f = dc2.h;
        this.e = dc2.f;
        this.k = dc2.e;
        this.m = dc2.i;
    }

    public final void d(dU dU2) {
        float f10 = this.l * dU2.l + this.i * dU2.a + this.g * dU2.e + this.c * dU2.q;
        float f11 = this.l * dU2.i + this.i * dU2.d + this.g * dU2.k + this.c * dU2.b;
        float f12 = this.l * dU2.g + this.i * dU2.f + this.g * dU2.m + this.c * dU2.j;
        float f13 = this.l * dU2.c + this.i * dU2.o + this.g * dU2.n + this.c * dU2.h;
        float f14 = this.a * dU2.l + this.d * dU2.a + this.f * dU2.e + this.o * dU2.q;
        float f15 = this.a * dU2.i + this.d * dU2.d + this.f * dU2.k + this.o * dU2.b;
        float f16 = this.a * dU2.g + this.d * dU2.f + this.f * dU2.m + this.o * dU2.j;
        float f17 = this.a * dU2.c + this.d * dU2.o + this.f * dU2.n + this.o * dU2.h;
        int n2 = ae.g();
        float f18 = this.e * dU2.l + this.k * dU2.a + this.m * dU2.e + this.n * dU2.q;
        float f19 = this.e * dU2.i + this.k * dU2.d + this.m * dU2.k + this.n * dU2.b;
        float f20 = this.e * dU2.g + this.k * dU2.f + this.m * dU2.m + this.n * dU2.j;
        float f21 = this.e * dU2.c + this.k * dU2.o + this.m * dU2.n + this.n * dU2.h;
        float f22 = this.q * dU2.l + this.b * dU2.a + this.j * dU2.e + this.h * dU2.q;
        float f23 = this.q * dU2.i + this.b * dU2.d + this.j * dU2.k + this.h * dU2.b;
        float f24 = this.q * dU2.g + this.b * dU2.f + this.j * dU2.m + this.h * dU2.j;
        float f25 = this.q * dU2.c + this.b * dU2.o + this.j * dU2.n + this.h * dU2.h;
        this.l = f10;
        this.i = f11;
        this.g = f12;
        this.c = f13;
        this.a = f14;
        this.d = f15;
        this.f = f16;
        this.o = f17;
        this.e = f18;
        this.k = f19;
        this.m = f20;
        this.n = f21;
        this.q = f22;
        this.b = f23;
        this.j = f24;
        this.h = f25;
        if (n2 != 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    public final void a(float f10, dU dU2) {
        this.l = dU2.l * f10;
        this.i = dU2.i * f10;
        this.g = dU2.g * f10;
        this.c = dU2.c * f10;
        this.a = dU2.a * f10;
        this.d = dU2.d * f10;
        this.f = dU2.f * f10;
        this.o = dU2.o * f10;
        this.e = dU2.e * f10;
        this.k = dU2.k * f10;
        this.m = dU2.m * f10;
        this.n = dU2.n * f10;
        this.q = dU2.q * f10;
        this.b = dU2.b * f10;
        this.j = dU2.j * f10;
        this.h = dU2.h * f10;
    }

    public final void k(float f10) {
        this.a = f10;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.l);
        l2 = gW.a(l2, this.i);
        l2 = gW.a(l2, this.g);
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.d);
        l2 = gW.a(l2, this.f);
        l2 = gW.a(l2, this.o);
        l2 = gW.a(l2, this.e);
        l2 = gW.a(l2, this.k);
        l2 = gW.a(l2, this.m);
        l2 = gW.a(l2, this.n);
        l2 = gW.a(l2, this.q);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.j);
        l2 = gW.a(l2, this.h);
        return gW.a(l2);
    }

    public final void l(float f10) {
        this.g = f10;
    }

    public final float o() {
        return this.o;
    }

    public dU(dc dc2, au au2, float f10) {
        this.l = dc2.j * f10;
        this.i = dc2.d * f10;
        this.g = dc2.a * f10;
        this.c = au2.c;
        this.a = dc2.c * f10;
        this.d = dc2.g * f10;
        this.f = dc2.h * f10;
        this.o = au2.a;
        this.e = dc2.f * f10;
        this.k = dc2.e * f10;
        this.m = dc2.i * f10;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public dU(float[] arrf) {
        this.l = arrf[0];
        this.i = arrf[1];
        this.g = arrf[2];
        this.c = arrf[3];
        this.a = arrf[4];
        this.d = arrf[5];
        this.f = arrf[6];
        this.o = arrf[7];
        this.e = arrf[8];
        this.k = arrf[9];
        this.m = arrf[10];
        this.n = arrf[11];
        this.q = arrf[12];
        this.b = arrf[13];
        this.j = arrf[14];
        this.h = arrf[15];
    }

    public final void e(float f10) {
        this.l *= f10;
        this.i *= f10;
        this.g *= f10;
        this.c *= f10;
        this.a *= f10;
        this.d *= f10;
        this.f *= f10;
        this.o *= f10;
        this.e *= f10;
        this.k *= f10;
        this.m *= f10;
        this.n *= f10;
        this.q *= f10;
        this.b *= f10;
        this.j *= f10;
        this.h *= f10;
    }

    public final void a(float[] arrf) {
        this.l = arrf[0];
        this.i = arrf[1];
        this.g = arrf[2];
        this.c = arrf[3];
        this.a = arrf[4];
        this.d = arrf[5];
        this.f = arrf[6];
        this.o = arrf[7];
        this.e = arrf[8];
        this.k = arrf[9];
        this.m = arrf[10];
        this.n = arrf[11];
        this.q = arrf[12];
        this.b = arrf[13];
        this.j = arrf[14];
        this.h = arrf[15];
    }

    public final float v() {
        return this.e;
    }

    public final void b(gY gY2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.l = (float)(gY2.h * arrd2[0]);
        this.i = (float)(gY2.j * arrd2[1]);
        this.g = (float)(gY2.i * arrd2[2]);
        this.a = (float)(gY2.f * arrd2[0]);
        this.d = (float)(gY2.d * arrd2[1]);
        this.f = (float)(gY2.c * arrd2[2]);
        this.e = (float)(gY2.g * arrd2[0]);
        this.k = (float)(gY2.b * arrd2[1]);
        this.m = (float)(gY2.e * arrd2[2]);
    }

    public final float p() {
        return this.l;
    }

    public final void b(ao ao2) {
        double d10;
        double d11;
        double[] arrd;
        block13: {
            double d12;
            block12: {
                double d13;
                double d14;
                int n2;
                block11: {
                    double d15;
                    block10: {
                        double d16;
                        arrd = new double[9];
                        double[] arrd2 = new double[3];
                        this.a(arrd2, arrd);
                        d11 = 0.25 * (1.0 + arrd[0] + arrd[4] + arrd[8]);
                        n2 = ae.f();
                        double d17 = d11;
                        if (n2 != 0) {
                            d17 = d17 < 0.0 ? -d11 : d11;
                        }
                        d15 = (d16 = d17 - 1.0E-30) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (n2 == 0) break block10;
                        if (d15 >= 0) {
                            ao2.d = (float)Math.sqrt(d11);
                            d11 = 0.25 / (double)ao2.d;
                            ao2.c = (float)((arrd[7] - arrd[5]) * d11);
                            ao2.a = (float)((arrd[2] - arrd[6]) * d11);
                            ao2.b = (float)((arrd[3] - arrd[1]) * d11);
                            return;
                        }
                        ao2.d = 0.0f;
                        d14 = d11 = -0.5 * (arrd[4] + arrd[8]);
                        if (n2 == 0) break block11;
                        double d18 = d14 - 0.0;
                        d15 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    d14 = d15 < 0 ? -d11 : d11;
                }
                d12 = (d13 = d14 - 1.0E-30) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                if (n2 == 0) break block12;
                if (d12 >= 0) {
                    ao2.c = (float)Math.sqrt(d11);
                    d11 = 0.5 / (double)ao2.c;
                    ao2.a = (float)(arrd[3] * d11);
                    ao2.b = (float)(arrd[6] * d11);
                    return;
                }
                ao2.c = 0.0f;
                d10 = d11 = 0.5 * (1.0 - arrd[8]);
                if (n2 == 0) break block13;
                double d19 = d10 - 0.0;
                d12 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
            }
            d10 = d12 < 0 ? -d11 : d11;
        }
        if (!(d10 < 1.0E-30)) {
            ao2.a = (float)Math.sqrt(d11);
            ao2.b = (float)(arrd[7] / (2.0 * (double)ao2.a));
            return;
        }
        ao2.a = 0.0f;
        ao2.b = 1.0f;
    }

    public final void a(float f10, au au2) {
        this.l = f10;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = au2.c;
        this.a = 0.0f;
        this.d = f10;
        this.f = 0.0f;
        this.o = au2.a;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = f10;
        this.n = au2.b;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
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
                arrd2 = new double[4];
                n8 = 0;
                n7 = 0;
                n6 = ae.g();
                n5 = 4;
                while (n5-- != 0) {
                    double d10;
                    block37: {
                        double d11;
                        block36: {
                            block30: {
                                double d12;
                                d10 = 0.0;
                                n4 = 4;
                                if (n6 != 0) break block29;
                                n3 = n4;
                                while (n3-- != 0) {
                                    double d13 = arrd[n8++];
                                    double d14 = d13 = Math.abs(d13);
                                    if (n6 == 0) {
                                        double d15 = d14 - d10;
                                        d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        if (n6 != 0) break block30;
                                        if (d11 <= 0) continue;
                                        d14 = d10 = d13;
                                    }
                                    if (n6 == 0) continue;
                                }
                                d11 = (d12 = d10 - 0.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (n6 != 0) break block36;
                            if (d11 != false) break block37;
                            d11 = 0.0;
                        }
                        return (boolean)d11;
                    }
                    arrd2[n7++] = 1.0 / d10;
                    if (n6 == 0) continue;
                }
                n4 = 0;
            }
            n3 = n4;
            n5 = 0;
            block2: while (true) {
                int n9 = n5;
                block3: while (n9 < 4) {
                    double d16;
                    int n10;
                    int n11;
                    int n12;
                    block33: {
                        double d17;
                        n2 = 0;
                        if (n6 != 0) break block31;
                        n8 = n2;
                        while (n8 < n5) {
                            block32: {
                                n12 = n3 + 4 * n8 + n5;
                                d17 = arrd[n12];
                                int n13 = n8;
                                int n14 = n3 + 4 * n8;
                                n9 = n3 + n5;
                                if (n6 != 0) continue block3;
                                n11 = n9;
                                while (n13-- != 0) {
                                    d17 -= arrd[n14] * arrd[n11];
                                    ++n14;
                                    n11 += 4;
                                    if (n6 == 0) {
                                        if (n6 == 0) continue;
                                    }
                                    break block32;
                                }
                                arrd[n12] = d17;
                                ++n8;
                            }
                            if (n6 == 0) continue;
                        }
                        double d18 = 0.0;
                        n7 = -1;
                        for (n8 = n5; n8 < 4; ++n8) {
                            block34: {
                                n12 = n3 + 4 * n8 + n5;
                                d17 = arrd[n12];
                                int n15 = n5;
                                int n16 = n3 + 4 * n8;
                                n10 = n3 + n5;
                                if (n6 != 0) break block33;
                                n11 = n10;
                                while (n15-- != 0) {
                                    d17 -= arrd[n16] * arrd[n11];
                                    ++n16;
                                    n11 += 4;
                                    if (n6 == 0) {
                                        if (n6 == 0) continue;
                                    }
                                    break block34;
                                }
                                arrd[n12] = d17;
                            }
                            d16 = arrd2[n8] * Math.abs(d17);
                            double d19 = d16 == d18 ? 0 : (d16 > d18 ? 1 : -1);
                            if (n6 == 0) {
                                if (d19 < 0) continue;
                                d18 = d16;
                                d19 = n8;
                            }
                            n7 = (int)d19;
                            if (n6 == 0) continue;
                        }
                        n10 = n7;
                    }
                    if (n6 == 0) {
                        if (n10 < 0) {
                            throw new RuntimeException(cK.a("Matrix4f13"));
                        }
                        n10 = n5;
                    }
                    if (n6 == 0) {
                        double d20;
                        block35: {
                            if (n10 != n7) {
                                int n17 = 4;
                                int n18 = n3 + 4 * n7;
                                n11 = n3 + 4 * n5;
                                while (n17-- != 0) {
                                    d16 = arrd[n18];
                                    arrd[n18++] = arrd[n11];
                                    arrd[n11++] = d16;
                                    if (n6 == 0) {
                                        if (n6 == 0) continue;
                                    }
                                    break block35;
                                }
                                arrd2[n7] = arrd2[n5];
                            }
                            arrn[n5] = n7;
                        }
                        n10 = (d20 = arrd[n3 + 4 * n5 + n5] - 0.0) == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (n6 == 0) {
                        if (n10 == 0) {
                            return false;
                        }
                        n10 = n5;
                    }
                    if (n10 != 3) {
                        d16 = 1.0 / arrd[n3 + 4 * n5 + n5];
                        n12 = n3 + 4 * (n5 + 1) + n5;
                        n8 = 3 - n5;
                        while (n8-- != 0) {
                            int n19 = n12;
                            arrd[n19] = arrd[n19] * d16;
                            n12 += 4;
                            if (n6 != 0) continue block2;
                            if (n6 == 0) continue;
                        }
                    }
                    ++n5;
                    if (n6 == 0) continue block2;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public final void a(ao ao2) {
        this.l = 1.0f - 2.0f * ao2.a * ao2.a - 2.0f * ao2.b * ao2.b;
        this.a = 2.0f * (ao2.c * ao2.a + ao2.d * ao2.b);
        this.e = 2.0f * (ao2.c * ao2.b - ao2.d * ao2.a);
        this.i = 2.0f * (ao2.c * ao2.a - ao2.d * ao2.b);
        this.d = 1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.b * ao2.b;
        this.k = 2.0f * (ao2.a * ao2.b + ao2.d * ao2.c);
        this.g = 2.0f * (ao2.c * ao2.b + ao2.d * ao2.a);
        this.f = 2.0f * (ao2.a * ao2.b - ao2.d * ao2.c);
        this.m = 1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.a * ao2.a;
        this.c = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void n(float f10) {
        float f11 = (float)Math.sin(f10);
        float f12 = (float)Math.cos(f10);
        this.l = 1.0f;
        this.i = 0.0f;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = f12;
        this.f = -f11;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = f11;
        this.m = f12;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final float q() {
        return this.k;
    }

    public final void a(X x2, X x3) {
        float f10 = this.l * x2.c + this.i * x2.a + this.g * x2.b + this.c;
        float f11 = this.a * x2.c + this.d * x2.a + this.f * x2.b + this.o;
        x3.b = this.e * x2.c + this.k * x2.a + this.m * x2.b + this.n;
        x3.c = f10;
        x3.a = f11;
    }

    public final void e(dU dU2) {
        this.l = -dU2.l;
        this.i = -dU2.i;
        this.g = -dU2.g;
        this.c = -dU2.c;
        this.a = -dU2.a;
        this.d = -dU2.d;
        this.f = -dU2.f;
        this.o = -dU2.o;
        this.e = -dU2.e;
        this.k = -dU2.k;
        this.m = -dU2.m;
        this.n = -dU2.n;
        this.q = -dU2.q;
        this.b = -dU2.b;
        this.j = -dU2.j;
        this.h = -dU2.h;
    }

    public final void u() {
        this.l = -this.l;
        this.i = -this.i;
        this.g = -this.g;
        this.c = -this.c;
        this.a = -this.a;
        this.d = -this.d;
        this.f = -this.f;
        this.o = -this.o;
        this.e = -this.e;
        this.k = -this.k;
        this.m = -this.m;
        this.n = -this.n;
        this.q = -this.q;
        this.b = -this.b;
        this.j = -this.j;
        this.h = -this.h;
    }

    public dU(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        this.l = f10;
        this.i = f11;
        this.g = f12;
        this.c = f13;
        this.a = f14;
        this.d = f15;
        this.f = f16;
        this.o = f17;
        this.e = f18;
        this.k = f19;
        this.m = f20;
        this.n = f21;
        this.q = f22;
        this.b = f23;
        this.j = f24;
        this.h = f25;
    }

    public final void d() {
        this.f(this);
    }

    public final void b(dU dU2) {
        this.f(dU2);
    }

    public final void s(float f10) {
        this.j = f10;
    }

    public final void p(float f10) {
        this.m = f10;
    }

    public final float a(dc dc2, au au2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        dc2.j = (float)arrd[0];
        dc2.d = (float)arrd[1];
        dc2.a = (float)arrd[2];
        dc2.c = (float)arrd[3];
        dc2.g = (float)arrd[4];
        dc2.h = (float)arrd[5];
        dc2.f = (float)arrd[6];
        dc2.e = (float)arrd[7];
        dc2.i = (float)arrd[8];
        au2.c = this.c;
        au2.a = this.o;
        au2.b = this.n;
        return (float)gY.d(arrd2);
    }

    public final void v(float f10) {
        this.n = f10;
    }

    public final void d(dU dU2, dU dU3) {
        block4: {
            dU dU4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU2) break block3;
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU3) break block3;
                    this.l = dU2.l * dU3.l + dU2.a * dU3.i + dU2.e * dU3.g + dU2.q * dU3.c;
                    this.i = dU2.l * dU3.a + dU2.a * dU3.d + dU2.e * dU3.f + dU2.q * dU3.o;
                    this.g = dU2.l * dU3.e + dU2.a * dU3.k + dU2.e * dU3.m + dU2.q * dU3.n;
                    this.c = dU2.l * dU3.q + dU2.a * dU3.b + dU2.e * dU3.j + dU2.q * dU3.h;
                    this.a = dU2.i * dU3.l + dU2.d * dU3.i + dU2.k * dU3.g + dU2.b * dU3.c;
                    this.d = dU2.i * dU3.a + dU2.d * dU3.d + dU2.k * dU3.f + dU2.b * dU3.o;
                    this.f = dU2.i * dU3.e + dU2.d * dU3.k + dU2.k * dU3.m + dU2.b * dU3.n;
                    this.o = dU2.i * dU3.q + dU2.d * dU3.b + dU2.k * dU3.j + dU2.b * dU3.h;
                    this.e = dU2.g * dU3.l + dU2.f * dU3.i + dU2.m * dU3.g + dU2.j * dU3.c;
                    this.k = dU2.g * dU3.a + dU2.f * dU3.d + dU2.m * dU3.f + dU2.j * dU3.o;
                    this.m = dU2.g * dU3.e + dU2.f * dU3.k + dU2.m * dU3.m + dU2.j * dU3.n;
                    this.n = dU2.g * dU3.q + dU2.f * dU3.b + dU2.m * dU3.j + dU2.j * dU3.h;
                    this.q = dU2.c * dU3.l + dU2.o * dU3.i + dU2.n * dU3.g + dU2.h * dU3.c;
                    this.b = dU2.c * dU3.a + dU2.o * dU3.d + dU2.n * dU3.f + dU2.h * dU3.o;
                    this.j = dU2.c * dU3.e + dU2.o * dU3.k + dU2.n * dU3.m + dU2.h * dU3.n;
                    this.h = dU2.c * dU3.q + dU2.o * dU3.b + dU2.n * dU3.j + dU2.h * dU3.h;
                    if (n2 != 0) break block4;
                }
                dU4 = dU2;
            }
            float f10 = dU4.l * dU3.l + dU2.a * dU3.i + dU2.e * dU3.g + dU2.q * dU3.c;
            float f11 = dU2.l * dU3.a + dU2.a * dU3.d + dU2.e * dU3.f + dU2.q * dU3.o;
            float f12 = dU2.l * dU3.e + dU2.a * dU3.k + dU2.e * dU3.m + dU2.q * dU3.n;
            float f13 = dU2.l * dU3.q + dU2.a * dU3.b + dU2.e * dU3.j + dU2.q * dU3.h;
            float f14 = dU2.i * dU3.l + dU2.d * dU3.i + dU2.k * dU3.g + dU2.b * dU3.c;
            float f15 = dU2.i * dU3.a + dU2.d * dU3.d + dU2.k * dU3.f + dU2.b * dU3.o;
            float f16 = dU2.i * dU3.e + dU2.d * dU3.k + dU2.k * dU3.m + dU2.b * dU3.n;
            float f17 = dU2.i * dU3.q + dU2.d * dU3.b + dU2.k * dU3.j + dU2.b * dU3.h;
            float f18 = dU2.g * dU3.l + dU2.f * dU3.i + dU2.m * dU3.g + dU2.j * dU3.c;
            float f19 = dU2.g * dU3.a + dU2.f * dU3.d + dU2.m * dU3.f + dU2.j * dU3.o;
            float f20 = dU2.g * dU3.e + dU2.f * dU3.k + dU2.m * dU3.m + dU2.j * dU3.n;
            float f21 = dU2.g * dU3.q + dU2.f * dU3.b + dU2.m * dU3.j + dU2.j * dU3.h;
            float f22 = dU2.c * dU3.l + dU2.o * dU3.i + dU2.n * dU3.g + dU2.h * dU3.c;
            float f23 = dU2.c * dU3.a + dU2.o * dU3.d + dU2.n * dU3.f + dU2.h * dU3.o;
            float f24 = dU2.c * dU3.e + dU2.o * dU3.k + dU2.n * dU3.m + dU2.h * dU3.n;
            float f25 = dU2.c * dU3.q + dU2.o * dU3.b + dU2.n * dU3.j + dU2.h * dU3.h;
            this.l = f10;
            this.i = f11;
            this.g = f12;
            this.c = f13;
            this.a = f14;
            this.d = f15;
            this.f = f16;
            this.o = f17;
            this.e = f18;
            this.k = f19;
            this.m = f20;
            this.n = f21;
            this.q = f22;
            this.b = f23;
            this.j = f24;
            this.h = f25;
        }
    }

    public final float c() {
        return this.m;
    }

    public final float j() {
        return this.j;
    }

    public final float e() {
        return this.g;
    }

    public final void c(ao ao2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.l = (float)((double)(1.0f - 2.0f * ao2.a * ao2.a - 2.0f * ao2.b * ao2.b) * arrd2[0]);
        this.a = (float)((double)(2.0f * (ao2.c * ao2.a + ao2.d * ao2.b)) * arrd2[0]);
        this.e = (float)((double)(2.0f * (ao2.c * ao2.b - ao2.d * ao2.a)) * arrd2[0]);
        this.i = (float)((double)(2.0f * (ao2.c * ao2.a - ao2.d * ao2.b)) * arrd2[1]);
        this.d = (float)((double)(1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.b * ao2.b) * arrd2[1]);
        this.k = (float)((double)(2.0f * (ao2.a * ao2.b + ao2.d * ao2.c)) * arrd2[1]);
        this.g = (float)((double)(2.0f * (ao2.c * ao2.b + ao2.d * ao2.a)) * arrd2[2]);
        this.f = (float)((double)(2.0f * (ao2.a * ao2.b - ao2.d * ao2.c)) * arrd2[2]);
        this.m = (float)((double)(1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.a * ao2.a) * arrd2[2]);
    }

    public final void b(g4 g42) {
        this.l = (float)(1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b);
        this.a = (float)(2.0 * (g42.c * g42.a + g42.d * g42.b));
        this.e = (float)(2.0 * (g42.c * g42.b - g42.d * g42.a));
        this.i = (float)(2.0 * (g42.c * g42.a - g42.d * g42.b));
        this.d = (float)(1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b);
        this.k = (float)(2.0 * (g42.a * g42.b + g42.d * g42.c));
        this.g = (float)(2.0 * (g42.c * g42.b + g42.d * g42.a));
        this.f = (float)(2.0 * (g42.a * g42.b - g42.d * g42.c));
        this.m = (float)(1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a);
        this.c = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public Object clone() {
        dU dU2 = null;
        try {
            dU2 = (dU)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        return dU2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(int var1_1, float[] var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.l = var2_2[0];
                this.i = var2_2[1];
                this.g = var2_2[2];
                this.c = var2_2[3];
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.a = var2_2[0];
                this.d = var2_2[1];
                this.f = var2_2[2];
                this.o = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 2: {
                this.e = var2_2[0];
                this.k = var2_2[1];
                this.m = var2_2[2];
                this.n = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 3: {
                this.q = var2_2[0];
                this.b = var2_2[1];
                this.j = var2_2[2];
                this.h = var2_2[3];
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f6"));
    }

    public final void a(g4 g42) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.l = (float)((1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b) * arrd2[0]);
        this.a = (float)(2.0 * (g42.c * g42.a + g42.d * g42.b) * arrd2[0]);
        this.e = (float)(2.0 * (g42.c * g42.b - g42.d * g42.a) * arrd2[0]);
        this.i = (float)(2.0 * (g42.c * g42.a - g42.d * g42.b) * arrd2[1]);
        this.d = (float)((1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b) * arrd2[1]);
        this.k = (float)(2.0 * (g42.a * g42.b + g42.d * g42.c) * arrd2[1]);
        this.g = (float)(2.0 * (g42.c * g42.b + g42.d * g42.a) * arrd2[2]);
        this.f = (float)(2.0 * (g42.a * g42.b - g42.d * g42.c) * arrd2[2]);
        this.m = (float)((1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a) * arrd2[2]);
    }

    public final void e(dU dU2, dU dU3) {
        block4: {
            dU dU4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU2) break block3;
                    dU4 = this;
                    if (n2 == 0) break block2;
                    if (dU4 == dU3) break block3;
                    this.l = dU2.l * dU3.l + dU2.i * dU3.a + dU2.g * dU3.e + dU2.c * dU3.q;
                    this.i = dU2.l * dU3.i + dU2.i * dU3.d + dU2.g * dU3.k + dU2.c * dU3.b;
                    this.g = dU2.l * dU3.g + dU2.i * dU3.f + dU2.g * dU3.m + dU2.c * dU3.j;
                    this.c = dU2.l * dU3.c + dU2.i * dU3.o + dU2.g * dU3.n + dU2.c * dU3.h;
                    this.a = dU2.a * dU3.l + dU2.d * dU3.a + dU2.f * dU3.e + dU2.o * dU3.q;
                    this.d = dU2.a * dU3.i + dU2.d * dU3.d + dU2.f * dU3.k + dU2.o * dU3.b;
                    this.f = dU2.a * dU3.g + dU2.d * dU3.f + dU2.f * dU3.m + dU2.o * dU3.j;
                    this.o = dU2.a * dU3.c + dU2.d * dU3.o + dU2.f * dU3.n + dU2.o * dU3.h;
                    this.e = dU2.e * dU3.l + dU2.k * dU3.a + dU2.m * dU3.e + dU2.n * dU3.q;
                    this.k = dU2.e * dU3.i + dU2.k * dU3.d + dU2.m * dU3.k + dU2.n * dU3.b;
                    this.m = dU2.e * dU3.g + dU2.k * dU3.f + dU2.m * dU3.m + dU2.n * dU3.j;
                    this.n = dU2.e * dU3.c + dU2.k * dU3.o + dU2.m * dU3.n + dU2.n * dU3.h;
                    this.q = dU2.q * dU3.l + dU2.b * dU3.a + dU2.j * dU3.e + dU2.h * dU3.q;
                    this.b = dU2.q * dU3.i + dU2.b * dU3.d + dU2.j * dU3.k + dU2.h * dU3.b;
                    this.j = dU2.q * dU3.g + dU2.b * dU3.f + dU2.j * dU3.m + dU2.h * dU3.j;
                    this.h = dU2.q * dU3.c + dU2.b * dU3.o + dU2.j * dU3.n + dU2.h * dU3.h;
                    if (n2 != 0) break block4;
                }
                dU4 = dU2;
            }
            float f10 = dU4.l * dU3.l + dU2.i * dU3.a + dU2.g * dU3.e + dU2.c * dU3.q;
            float f11 = dU2.l * dU3.i + dU2.i * dU3.d + dU2.g * dU3.k + dU2.c * dU3.b;
            float f12 = dU2.l * dU3.g + dU2.i * dU3.f + dU2.g * dU3.m + dU2.c * dU3.j;
            float f13 = dU2.l * dU3.c + dU2.i * dU3.o + dU2.g * dU3.n + dU2.c * dU3.h;
            float f14 = dU2.a * dU3.l + dU2.d * dU3.a + dU2.f * dU3.e + dU2.o * dU3.q;
            float f15 = dU2.a * dU3.i + dU2.d * dU3.d + dU2.f * dU3.k + dU2.o * dU3.b;
            float f16 = dU2.a * dU3.g + dU2.d * dU3.f + dU2.f * dU3.m + dU2.o * dU3.j;
            float f17 = dU2.a * dU3.c + dU2.d * dU3.o + dU2.f * dU3.n + dU2.o * dU3.h;
            float f18 = dU2.e * dU3.l + dU2.k * dU3.a + dU2.m * dU3.e + dU2.n * dU3.q;
            float f19 = dU2.e * dU3.i + dU2.k * dU3.d + dU2.m * dU3.k + dU2.n * dU3.b;
            float f20 = dU2.e * dU3.g + dU2.k * dU3.f + dU2.m * dU3.m + dU2.n * dU3.j;
            float f21 = dU2.e * dU3.c + dU2.k * dU3.o + dU2.m * dU3.n + dU2.n * dU3.h;
            float f22 = dU2.q * dU3.l + dU2.b * dU3.a + dU2.j * dU3.e + dU2.h * dU3.q;
            float f23 = dU2.q * dU3.i + dU2.b * dU3.d + dU2.j * dU3.k + dU2.h * dU3.b;
            float f24 = dU2.q * dU3.g + dU2.b * dU3.f + dU2.j * dU3.m + dU2.h * dU3.j;
            float f25 = dU2.q * dU3.c + dU2.b * dU3.o + dU2.j * dU3.n + dU2.h * dU3.h;
            this.l = f10;
            this.i = f11;
            this.g = f12;
            this.c = f13;
            this.a = f14;
            this.d = f15;
            this.f = f16;
            this.o = f17;
            this.e = f18;
            this.k = f19;
            this.m = f20;
            this.n = f21;
            this.q = f22;
            this.b = f23;
            this.j = f24;
            this.h = f25;
        }
    }

    public final void r(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.l = f11 = (float)Math.cos(f10);
        this.i = 0.0f;
        this.g = f12;
        this.c = 0.0f;
        this.a = 0.0f;
        this.d = 1.0f;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = -f12;
        this.k = 0.0f;
        this.m = f11;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void d(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.l = f11 = (float)Math.cos(f10);
        this.i = -f12;
        this.g = 0.0f;
        this.c = 0.0f;
        this.a = f12;
        this.d = f11;
        this.f = 0.0f;
        this.o = 0.0f;
        this.e = 0.0f;
        this.k = 0.0f;
        this.m = 1.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void a(g4 g42, q q2, double d10) {
        this.l = (float)(d10 * (1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b));
        this.a = (float)(d10 * (2.0 * (g42.c * g42.a + g42.d * g42.b)));
        this.e = (float)(d10 * (2.0 * (g42.c * g42.b - g42.d * g42.a)));
        this.i = (float)(d10 * (2.0 * (g42.c * g42.a - g42.d * g42.b)));
        this.d = (float)(d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b));
        this.k = (float)(d10 * (2.0 * (g42.a * g42.b + g42.d * g42.c)));
        this.g = (float)(d10 * (2.0 * (g42.c * g42.b + g42.d * g42.a)));
        this.f = (float)(d10 * (2.0 * (g42.a * g42.b - g42.d * g42.c)));
        this.m = (float)(d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a));
        this.c = (float)q2.c;
        this.o = (float)q2.b;
        this.n = (float)q2.a;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final void d(au au2) {
        this.c = au2.c;
        this.o = au2.a;
        this.n = au2.b;
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
                    d10 = 1.0E-8;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.l = 1.0f;
                    this.i = 0.0f;
                    this.g = 0.0f;
                    this.a = 0.0f;
                    this.d = 1.0f;
                    this.f = 0.0f;
                    this.e = 0.0f;
                    this.k = 0.0f;
                    this.m = 1.0f;
                    if (n2 != 0) break block4;
                }
                d12 = 1.0 / d12;
                d11 = em2.d;
                d10 = d12;
            }
            double d13 = d11 * d10;
            double d14 = em2.b * d12;
            double d15 = em2.e * d12;
            float f10 = (float)Math.sin(em2.a);
            float f11 = (float)Math.cos(em2.a);
            float f12 = 1.0f - f11;
            float f13 = (float)(d13 * d15);
            float f14 = (float)(d13 * d14);
            float f15 = (float)(d14 * d15);
            this.l = f12 * (float)(d13 * d13) + f11;
            this.i = f12 * f14 - f10 * (float)d15;
            this.g = f12 * f13 + f10 * (float)d14;
            this.a = f12 * f14 + f10 * (float)d15;
            this.d = f12 * (float)(d14 * d14) + f11;
            this.f = f12 * f15 - f10 * (float)d13;
            this.e = f12 * f13 - f10 * (float)d14;
            this.k = f12 * f15 + f10 * (float)d13;
            this.m = f12 * (float)(d15 * d15) + f11;
        }
        this.c = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public final float s() {
        return this.d;
    }

    public final void i(float f10) {
        this.d = f10;
    }

    final void f(dU dU2) {
        block4: {
            int n2;
            double[] arrd = new double[16];
            double[] arrd2 = new double[16];
            int[] arrn = new int[4];
            arrd[0] = dU2.l;
            arrd[1] = dU2.i;
            arrd[2] = dU2.g;
            arrd[3] = dU2.c;
            arrd[4] = dU2.a;
            arrd[5] = dU2.d;
            arrd[6] = dU2.f;
            arrd[7] = dU2.o;
            arrd[8] = dU2.e;
            int n3 = ae.f();
            arrd[9] = dU2.k;
            arrd[10] = dU2.m;
            arrd[11] = dU2.n;
            arrd[12] = dU2.q;
            arrd[13] = dU2.b;
            arrd[14] = dU2.j;
            arrd[15] = dU2.h;
            int n4 = dU.a(arrd, arrn);
            if (n3 != 0) {
                if (n4 == 0) {
                    throw new gP(cK.a("Matrix4f12"));
                }
                n4 = n2 = 0;
            }
            while (n2 < 16) {
                arrd2[n2] = 0.0;
                ++n2;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block4;
            }
            arrd2[0] = 1.0;
            arrd2[5] = 1.0;
            arrd2[10] = 1.0;
            arrd2[15] = 1.0;
            dU.a(arrd, arrn, arrd2);
            this.l = (float)arrd2[0];
            this.i = (float)arrd2[1];
            this.g = (float)arrd2[2];
            this.c = (float)arrd2[3];
            this.a = (float)arrd2[4];
            this.d = (float)arrd2[5];
            this.f = (float)arrd2[6];
            this.o = (float)arrd2[7];
            this.e = (float)arrd2[8];
            this.k = (float)arrd2[9];
            this.m = (float)arrd2[10];
            this.n = (float)arrd2[11];
            this.q = (float)arrd2[12];
            this.b = (float)arrd2[13];
            this.j = (float)arrd2[14];
            this.h = (float)arrd2[15];
        }
    }

    public final void d(int n2, aT aT2) {
        block4: {
            block9: {
                int n3;
                int n4;
                int n5;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                block2: {
                                    block3: {
                                        n5 = ae.g();
                                        n4 = n2;
                                        if (n5 != 0) break block2;
                                        if (n4 != 0) break block3;
                                        aT2.c = this.l;
                                        aT2.a = this.i;
                                        aT2.b = this.g;
                                        aT2.d = this.c;
                                        if (n5 == 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 != 0) break block5;
                                if (n4 != n3) break block6;
                                aT2.c = this.a;
                                aT2.a = this.d;
                                aT2.b = this.f;
                                aT2.d = this.o;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 != 0) break block7;
                        if (n4 != n3) break block8;
                        aT2.c = this.e;
                        aT2.a = this.k;
                        aT2.b = this.m;
                        aT2.d = this.n;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                aT2.c = this.q;
                aT2.a = this.b;
                aT2.b = this.j;
                aT2.d = this.h;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f2"));
        }
    }

    public final float n() {
        return this.c;
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

    public final void a(au au2, au au3) {
        float f10 = this.l * au2.c + this.i * au2.a + this.g * au2.b;
        float f11 = this.a * au2.c + this.d * au2.a + this.f * au2.b;
        au3.b = this.e * au2.c + this.k * au2.a + this.m * au2.b;
        au3.c = f10;
        au3.a = f11;
    }

    public final void c(float f10) {
        this.l = f10;
    }

    public final void c(dU dU2) {
        block4: {
            dU dU3;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dU3 = this;
                    if (n2 == 0) break block2;
                    if (dU3 == dU2) break block3;
                    this.l = dU2.l;
                    this.i = dU2.a;
                    this.g = dU2.e;
                    this.c = dU2.q;
                    this.a = dU2.i;
                    this.d = dU2.d;
                    this.f = dU2.k;
                    this.o = dU2.b;
                    this.e = dU2.g;
                    this.k = dU2.f;
                    this.m = dU2.m;
                    this.n = dU2.j;
                    this.q = dU2.c;
                    this.b = dU2.o;
                    this.j = dU2.n;
                    this.h = dU2.h;
                    if (n2 != 0) break block4;
                }
                dU3 = this;
            }
            dU3.m();
        }
    }

    public final void w(float f10) {
        this.b = f10;
    }

    public final void f(float f10) {
        this.l += f10;
        this.i += f10;
        this.g += f10;
        this.c += f10;
        this.a += f10;
        this.d += f10;
        this.f += f10;
        this.o += f10;
        this.e += f10;
        this.k += f10;
        this.m += f10;
        this.n += f10;
        this.q += f10;
        this.b += f10;
        this.j += f10;
        this.h += f10;
    }

    public final void a(dc dc2) {
        dc2.j = this.l;
        dc2.d = this.i;
        dc2.a = this.g;
        dc2.c = this.a;
        dc2.g = this.d;
        dc2.h = this.f;
        dc2.f = this.e;
        dc2.e = this.k;
        dc2.i = this.m;
    }

    public final void c(int n2, float[] arrf) {
        block4: {
            block9: {
                int n3;
                int n4;
                int n5;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                block2: {
                                    block3: {
                                        n5 = ae.g();
                                        n4 = n2;
                                        if (n5 != 0) break block2;
                                        if (n4 != 0) break block3;
                                        arrf[0] = this.l;
                                        arrf[1] = this.i;
                                        arrf[2] = this.g;
                                        arrf[3] = this.c;
                                        if (n5 == 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 != 0) break block5;
                                if (n4 != n3) break block6;
                                arrf[0] = this.a;
                                arrf[1] = this.d;
                                arrf[2] = this.f;
                                arrf[3] = this.o;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 != 0) break block7;
                        if (n4 != n3) break block8;
                        arrf[0] = this.e;
                        arrf[1] = this.k;
                        arrf[2] = this.m;
                        arrf[3] = this.n;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                arrf[0] = this.q;
                arrf[1] = this.b;
                arrf[2] = this.j;
                arrf[3] = this.h;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4f2"));
        }
    }

    public final void a(gY gY2, q q2, double d10) {
        this.l = (float)(gY2.h * d10);
        this.i = (float)(gY2.j * d10);
        this.g = (float)(gY2.i * d10);
        this.c = (float)q2.c;
        this.a = (float)(gY2.f * d10);
        this.d = (float)(gY2.d * d10);
        this.f = (float)(gY2.c * d10);
        this.o = (float)q2.b;
        this.e = (float)(gY2.g * d10);
        this.k = (float)(gY2.b * d10);
        this.m = (float)(gY2.e * d10);
        this.n = (float)q2.a;
        this.q = 0.0f;
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 1.0f;
    }

    public final float b() {
        return this.b;
    }

    public final void h(float f10) {
        this.c = f10;
    }
}

