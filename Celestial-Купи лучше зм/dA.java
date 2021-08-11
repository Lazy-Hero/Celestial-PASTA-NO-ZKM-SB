/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;
import net.minecraft.k.m;

public class dA
implements Cloneable,
Serializable {
    public /* synthetic */ double h;
    public /* synthetic */ double e;
    public /* synthetic */ double j;
    public /* synthetic */ double i;
    static final /* synthetic */ long serialVersionUID = 8223903484171633710L;
    public /* synthetic */ double f;
    public /* synthetic */ double a;
    private static final /* synthetic */ double c = 1.0E-10;
    public /* synthetic */ double o;
    public /* synthetic */ double g;
    public /* synthetic */ double d;
    public /* synthetic */ double k;
    public /* synthetic */ double m;
    public /* synthetic */ double l;
    public /* synthetic */ double q;
    public /* synthetic */ double p;
    public /* synthetic */ double n;
    public /* synthetic */ double b;

    public final void a(au au2, au au3) {
        float f10 = (float)(this.o * (double)au2.c + this.f * (double)au2.a + this.m * (double)au2.b);
        float f11 = (float)(this.b * (double)au2.c + this.l * (double)au2.a + this.g * (double)au2.b);
        au3.b = (float)(this.k * (double)au2.c + this.i * (double)au2.a + this.h * (double)au2.b);
        au3.c = f10;
        au3.a = f11;
    }

    public final void e(gY gY2) {
        gY2.h = this.o;
        gY2.j = this.f;
        gY2.i = this.m;
        gY2.f = this.b;
        gY2.d = this.l;
        gY2.c = this.g;
        gY2.g = this.k;
        gY2.b = this.i;
        gY2.e = this.h;
    }

    public final void s(double d10) {
        this.l = d10;
    }

    public final void b(dA dA2, dA dA3) {
        block4: {
            dA dA4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA2) break block3;
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA3) break block3;
                    this.o = dA2.o * dA3.o + dA2.b * dA3.f + dA2.k * dA3.m + dA2.a * dA3.p;
                    this.f = dA2.o * dA3.b + dA2.b * dA3.l + dA2.k * dA3.g + dA2.a * dA3.q;
                    this.m = dA2.o * dA3.k + dA2.b * dA3.i + dA2.k * dA3.h + dA2.a * dA3.e;
                    this.p = dA2.o * dA3.a + dA2.b * dA3.j + dA2.k * dA3.n + dA2.a * dA3.d;
                    this.b = dA2.f * dA3.o + dA2.l * dA3.f + dA2.i * dA3.m + dA2.j * dA3.p;
                    this.l = dA2.f * dA3.b + dA2.l * dA3.l + dA2.i * dA3.g + dA2.j * dA3.q;
                    this.g = dA2.f * dA3.k + dA2.l * dA3.i + dA2.i * dA3.h + dA2.j * dA3.e;
                    this.q = dA2.f * dA3.a + dA2.l * dA3.j + dA2.i * dA3.n + dA2.j * dA3.d;
                    this.k = dA2.m * dA3.o + dA2.g * dA3.f + dA2.h * dA3.m + dA2.n * dA3.p;
                    this.i = dA2.m * dA3.b + dA2.g * dA3.l + dA2.h * dA3.g + dA2.n * dA3.q;
                    this.h = dA2.m * dA3.k + dA2.g * dA3.i + dA2.h * dA3.h + dA2.n * dA3.e;
                    this.e = dA2.m * dA3.a + dA2.g * dA3.j + dA2.h * dA3.n + dA2.n * dA3.d;
                    this.a = dA2.p * dA3.o + dA2.q * dA3.f + dA2.e * dA3.m + dA2.d * dA3.p;
                    this.j = dA2.p * dA3.b + dA2.q * dA3.l + dA2.e * dA3.g + dA2.d * dA3.q;
                    this.n = dA2.p * dA3.k + dA2.q * dA3.i + dA2.e * dA3.h + dA2.d * dA3.e;
                    this.d = dA2.p * dA3.a + dA2.q * dA3.j + dA2.e * dA3.n + dA2.d * dA3.d;
                    if (n2 != 0) break block4;
                }
                dA4 = dA2;
            }
            double d10 = dA4.o * dA3.o + dA2.b * dA3.f + dA2.k * dA3.m + dA2.a * dA3.p;
            double d11 = dA2.o * dA3.b + dA2.b * dA3.l + dA2.k * dA3.g + dA2.a * dA3.q;
            double d12 = dA2.o * dA3.k + dA2.b * dA3.i + dA2.k * dA3.h + dA2.a * dA3.e;
            double d13 = dA2.o * dA3.a + dA2.b * dA3.j + dA2.k * dA3.n + dA2.a * dA3.d;
            double d14 = dA2.f * dA3.o + dA2.l * dA3.f + dA2.i * dA3.m + dA2.j * dA3.p;
            double d15 = dA2.f * dA3.b + dA2.l * dA3.l + dA2.i * dA3.g + dA2.j * dA3.q;
            double d16 = dA2.f * dA3.k + dA2.l * dA3.i + dA2.i * dA3.h + dA2.j * dA3.e;
            double d17 = dA2.f * dA3.a + dA2.l * dA3.j + dA2.i * dA3.n + dA2.j * dA3.d;
            double d18 = dA2.m * dA3.o + dA2.g * dA3.f + dA2.h * dA3.m + dA2.n * dA3.p;
            double d19 = dA2.m * dA3.b + dA2.g * dA3.l + dA2.h * dA3.g + dA2.n * dA3.q;
            double d20 = dA2.m * dA3.k + dA2.g * dA3.i + dA2.h * dA3.h + dA2.n * dA3.e;
            double d21 = dA2.m * dA3.a + dA2.g * dA3.j + dA2.h * dA3.n + dA2.n * dA3.d;
            double d22 = dA2.p * dA3.o + dA2.q * dA3.f + dA2.e * dA3.m + dA2.d * dA3.p;
            double d23 = dA2.p * dA3.b + dA2.q * dA3.l + dA2.e * dA3.g + dA2.d * dA3.q;
            double d24 = dA2.p * dA3.k + dA2.q * dA3.i + dA2.e * dA3.h + dA2.d * dA3.e;
            double d25 = dA2.p * dA3.a + dA2.q * dA3.j + dA2.e * dA3.n + dA2.d * dA3.d;
            this.o = d10;
            this.f = d11;
            this.m = d12;
            this.p = d13;
            this.b = d14;
            this.l = d15;
            this.g = d16;
            this.q = d17;
            this.k = d18;
            this.i = d19;
            this.h = d20;
            this.e = d21;
            this.a = d22;
            this.j = d23;
            this.n = d24;
            this.d = d25;
        }
    }

    public final void c(q q2) {
        this.o = 1.0;
        this.f = 0.0;
        this.m = 0.0;
        this.p = q2.c;
        this.b = 0.0;
        this.l = 1.0;
        this.g = 0.0;
        this.q = q2.b;
        this.k = 0.0;
        this.i = 0.0;
        this.h = 1.0;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final double d() {
        return this.l;
    }

    public final void c(g4 g42) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.o = (1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b) * arrd2[0];
        this.b = 2.0 * (g42.c * g42.a + g42.d * g42.b) * arrd2[0];
        this.k = 2.0 * (g42.c * g42.b - g42.d * g42.a) * arrd2[0];
        this.f = 2.0 * (g42.c * g42.a - g42.d * g42.b) * arrd2[1];
        this.l = (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b) * arrd2[1];
        this.i = 2.0 * (g42.a * g42.b + g42.d * g42.c) * arrd2[1];
        this.m = 2.0 * (g42.c * g42.b + g42.d * g42.a) * arrd2[2];
        this.g = 2.0 * (g42.a * g42.b - g42.d * g42.c) * arrd2[2];
        this.h = (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a) * arrd2[2];
    }

    public final void o() {
        double d10 = this.b;
        this.b = this.f;
        this.f = d10;
        d10 = this.k;
        this.k = this.m;
        this.m = d10;
        d10 = this.a;
        this.a = this.p;
        this.p = d10;
        d10 = this.i;
        this.i = this.g;
        this.g = d10;
        d10 = this.j;
        this.j = this.q;
        this.q = d10;
        d10 = this.n;
        this.n = this.e;
        this.e = d10;
    }

    public final void a(ae ae2, ae ae3) {
        float f10 = (float)(this.o * (double)ae2.c + this.f * (double)ae2.a + this.m * (double)ae2.b + this.p * (double)ae2.d);
        float f11 = (float)(this.b * (double)ae2.c + this.l * (double)ae2.a + this.g * (double)ae2.b + this.q * (double)ae2.d);
        float f12 = (float)(this.k * (double)ae2.c + this.i * (double)ae2.a + this.h * (double)ae2.b + this.e * (double)ae2.d);
        ae3.d = (float)(this.a * (double)ae2.c + this.j * (double)ae2.a + this.n * (double)ae2.b + this.d * (double)ae2.d);
        ae3.c = f10;
        ae3.a = f11;
        ae3.b = f12;
    }

    public dA() {
        this.o = 0.0;
        this.f = 0.0;
        this.m = 0.0;
        this.p = 0.0;
        this.b = 0.0;
        this.l = 0.0;
        this.g = 0.0;
        this.q = 0.0;
        this.k = 0.0;
        this.i = 0.0;
        this.h = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 0.0;
    }

    public final void r(double d10) {
        this.n = d10;
    }

    public final void a(double d10, q q2) {
        this.o = d10;
        this.f = 0.0;
        this.m = 0.0;
        this.p = q2.c;
        this.b = 0.0;
        this.l = d10;
        this.g = 0.0;
        this.q = q2.b;
        this.k = 0.0;
        this.i = 0.0;
        this.h = d10;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void f(dA dA2) {
        this.o += dA2.o;
        this.f += dA2.f;
        this.m += dA2.m;
        this.p += dA2.p;
        this.b += dA2.b;
        this.l += dA2.l;
        this.g += dA2.g;
        this.q += dA2.q;
        this.k += dA2.k;
        this.i += dA2.i;
        this.h += dA2.h;
        this.e += dA2.e;
        this.a += dA2.a;
        this.j += dA2.j;
        this.n += dA2.n;
        this.d += dA2.d;
    }

    public final void a(gY gY2) {
        this.o = gY2.h;
        this.f = gY2.j;
        this.m = gY2.i;
        this.p = 0.0;
        this.b = gY2.f;
        this.l = gY2.d;
        this.g = gY2.c;
        this.q = 0.0;
        this.k = gY2.g;
        this.i = gY2.b;
        this.h = gY2.e;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final double w() {
        return this.d;
    }

    public final void f(double d10) {
        this.j = d10;
    }

    public final double m() {
        return this.i;
    }

    public final void b() {
        this.o = 1.0;
        this.f = 0.0;
        this.m = 0.0;
        this.p = 0.0;
        this.b = 0.0;
        this.l = 1.0;
        this.g = 0.0;
        this.q = 0.0;
        this.k = 0.0;
        this.i = 0.0;
        this.h = 1.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void b(int n2, double[] arrd) {
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
                                        arrd[0] = this.o;
                                        arrd[1] = this.f;
                                        arrd[2] = this.m;
                                        arrd[3] = this.p;
                                        if (n5 == 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 != 0) break block5;
                                if (n4 != n3) break block6;
                                arrd[0] = this.b;
                                arrd[1] = this.l;
                                arrd[2] = this.g;
                                arrd[3] = this.q;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 != 0) break block7;
                        if (n4 != n3) break block8;
                        arrd[0] = this.k;
                        arrd[1] = this.i;
                        arrd[2] = this.h;
                        arrd[3] = this.e;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                arrd[0] = this.a;
                arrd[1] = this.j;
                arrd[2] = this.n;
                arrd[3] = this.d;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d2"));
        }
    }

    public final void e(double d10) {
        this.g = d10;
    }

    public final double r() {
        return this.p;
    }

    public final void n(double d10) {
        double d11;
        double d12 = Math.sin(d10);
        this.o = d11 = Math.cos(d10);
        this.f = -d12;
        this.m = 0.0;
        this.p = 0.0;
        this.b = d12;
        this.l = d11;
        this.g = 0.0;
        this.q = 0.0;
        this.k = 0.0;
        this.i = 0.0;
        this.h = 1.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(dA dA2, dA dA3) {
        this.o = dA2.o + dA3.o;
        this.f = dA2.f + dA3.f;
        this.m = dA2.m + dA3.m;
        this.p = dA2.p + dA3.p;
        this.b = dA2.b + dA3.b;
        this.l = dA2.l + dA3.l;
        this.g = dA2.g + dA3.g;
        this.q = dA2.q + dA3.q;
        this.k = dA2.k + dA3.k;
        this.i = dA2.i + dA3.i;
        this.h = dA2.h + dA3.h;
        this.e = dA2.e + dA3.e;
        this.a = dA2.a + dA3.a;
        this.j = dA2.j + dA3.j;
        this.n = dA2.n + dA3.n;
        this.d = dA2.d + dA3.d;
    }

    public final double s() {
        double d10 = this.o * (this.l * this.h * this.d + this.g * this.e * this.j + this.q * this.i * this.n - this.q * this.h * this.j - this.l * this.e * this.n - this.g * this.i * this.d);
        d10 -= this.f * (this.b * this.h * this.d + this.g * this.e * this.a + this.q * this.k * this.n - this.q * this.h * this.a - this.b * this.e * this.n - this.g * this.k * this.d);
        d10 += this.m * (this.b * this.i * this.d + this.l * this.e * this.a + this.q * this.k * this.j - this.q * this.i * this.a - this.b * this.e * this.j - this.l * this.k * this.d);
        return d10 -= this.p * (this.b * this.i * this.n + this.l * this.h * this.a + this.g * this.k * this.j - this.g * this.i * this.a - this.b * this.h * this.j - this.l * this.k * this.n);
    }

    public final void c(dc dc2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.o = (double)dc2.j * arrd2[0];
        this.f = (double)dc2.d * arrd2[1];
        this.m = (double)dc2.a * arrd2[2];
        this.b = (double)dc2.c * arrd2[0];
        this.l = (double)dc2.g * arrd2[1];
        this.g = (double)dc2.h * arrd2[2];
        this.k = (double)dc2.f * arrd2[0];
        this.i = (double)dc2.e * arrd2[1];
        this.h = (double)dc2.i * arrd2[2];
    }

    public dA(g4 g42, q q2, double d10) {
        this.o = d10 * (1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b);
        this.b = d10 * (2.0 * (g42.c * g42.a + g42.d * g42.b));
        this.k = d10 * (2.0 * (g42.c * g42.b - g42.d * g42.a));
        this.f = d10 * (2.0 * (g42.c * g42.a - g42.d * g42.b));
        this.l = d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b);
        this.i = d10 * (2.0 * (g42.a * g42.b + g42.d * g42.c));
        this.m = d10 * (2.0 * (g42.c * g42.b + g42.d * g42.a));
        this.g = d10 * (2.0 * (g42.a * g42.b - g42.d * g42.c));
        this.h = d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a);
        this.p = q2.c;
        this.q = q2.b;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, double[] var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2[0];
                this.f = var2_2[1];
                this.m = var2_2[2];
                this.p = var2_2[3];
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.b = var2_2[0];
                this.l = var2_2[1];
                this.g = var2_2[2];
                this.q = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 2: {
                this.k = var2_2[0];
                this.i = var2_2[1];
                this.h = var2_2[2];
                this.e = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 3: {
                this.a = var2_2[0];
                this.j = var2_2[1];
                this.n = var2_2[2];
                this.d = var2_2[3];
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d4"));
    }

    public final void p(double d10) {
        double d11 = Math.sin(d10);
        double d12 = Math.cos(d10);
        this.o = 1.0;
        this.f = 0.0;
        this.m = 0.0;
        this.p = 0.0;
        this.b = 0.0;
        this.l = d12;
        this.g = -d11;
        this.q = 0.0;
        this.k = 0.0;
        this.i = d11;
        this.h = d12;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final double u() {
        return this.m;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, double var2_2, double var4_3, double var6_4, double var8_5) {
        var10_6 = ae.f();
        if (var10_6 == 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2;
                this.b = var4_3;
                this.k = var6_4;
                this.a = var8_5;
lbl9:
                // 2 sources

                if (var10_6 != 0) return;
            }
            case 1: {
                this.f = var2_2;
                this.l = var4_3;
                this.i = var6_4;
                this.j = var8_5;
                if (var10_6 != 0) return;
            }
            case 2: {
                this.m = var2_2;
                this.g = var4_3;
                this.h = var6_4;
                this.n = var8_5;
                if (var10_6 != 0) return;
            }
            case 3: {
                this.p = var2_2;
                this.q = var4_3;
                this.e = var6_4;
                this.d = var8_5;
                if (var10_6 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d7"));
    }

    public final void b(dc dc2) {
        this.o = dc2.j;
        this.f = dc2.d;
        this.m = dc2.a;
        this.p = 0.0;
        this.b = dc2.c;
        this.l = dc2.g;
        this.g = dc2.h;
        this.q = 0.0;
        this.k = dc2.f;
        this.i = dc2.e;
        this.h = dc2.i;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(gS gS2, gS gS3) {
        double d10 = this.o * gS2.c + this.f * gS2.a + this.m * gS2.b + this.p * gS2.d;
        double d11 = this.b * gS2.c + this.l * gS2.a + this.g * gS2.b + this.q * gS2.d;
        double d12 = this.k * gS2.c + this.i * gS2.a + this.h * gS2.b + this.e * gS2.d;
        gS3.d = this.a * gS2.c + this.j * gS2.a + this.n * gS2.b + this.d * gS2.d;
        gS3.c = d10;
        gS3.a = d11;
        gS3.b = d12;
    }

    public final void c(gY gY2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.o = gY2.h * arrd2[0];
        this.f = gY2.j * arrd2[1];
        this.m = gY2.i * arrd2[2];
        this.b = gY2.f * arrd2[0];
        this.l = gY2.d * arrd2[1];
        this.g = gY2.c * arrd2[2];
        this.k = gY2.g * arrd2[0];
        this.i = gY2.b * arrd2[1];
        this.h = gY2.e * arrd2[2];
    }

    public final void b(g4 g42) {
        this.o = 1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b;
        this.b = 2.0 * (g42.c * g42.a + g42.d * g42.b);
        this.k = 2.0 * (g42.c * g42.b - g42.d * g42.a);
        this.f = 2.0 * (g42.c * g42.a - g42.d * g42.b);
        this.l = 1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b;
        this.i = 2.0 * (g42.a * g42.b + g42.d * g42.c);
        this.m = 2.0 * (g42.c * g42.b + g42.d * g42.a);
        this.g = 2.0 * (g42.a * g42.b - g42.d * g42.c);
        this.h = 1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a;
        this.p = 0.0;
        this.q = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(ao ao2, au au2, float f10) {
        this.o = (double)f10 * (1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b);
        this.b = (double)f10 * (2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b));
        this.k = (double)f10 * (2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a));
        this.f = (double)f10 * (2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b));
        this.l = (double)f10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b);
        this.i = (double)f10 * (2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c));
        this.m = (double)f10 * (2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a));
        this.g = (double)f10 * (2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c));
        this.h = (double)f10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a);
        this.p = au2.c;
        this.q = au2.a;
        this.e = au2.b;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
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
                                                                    var2_2 = ae.g();
                                                                    var3_3 = (dA)var1_1;
                                                                    cfr_temp_0 = this.o - var3_3.o;
                                                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                    if (var2_2 != 0) break block48;
                                                                    if (v0 != false) ** GOTO lbl114
                                                                    cfr_temp_1 = this.f - var3_3.f;
                                                                    v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                }
                                                                if (var2_2 != 0) break block34;
                                                                if (v0 != false) ** GOTO lbl114
                                                                cfr_temp_2 = this.m - var3_3.m;
                                                                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            }
                                                            if (var2_2 != 0) break block35;
                                                            if (v0 != false) ** GOTO lbl114
                                                            cfr_temp_3 = this.p - var3_3.p;
                                                            v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                        }
                                                        if (var2_2 != 0) break block36;
                                                        if (v0 != false) ** GOTO lbl114
                                                        cfr_temp_4 = this.b - var3_3.b;
                                                        v0 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                    }
                                                    if (var2_2 != 0) break block37;
                                                    if (v0 != false) ** GOTO lbl114
                                                    cfr_temp_5 = this.l - var3_3.l;
                                                    v0 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                }
                                                if (var2_2 != 0) break block38;
                                                if (v0 != false) ** GOTO lbl114
                                                cfr_temp_6 = this.g - var3_3.g;
                                                v0 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                            }
                                            if (var2_2 != 0) break block39;
                                            if (v0 != false) ** GOTO lbl114
                                            cfr_temp_7 = this.q - var3_3.q;
                                            v0 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                        }
                                        if (var2_2 != 0) break block40;
                                        if (v0 != false) ** GOTO lbl114
                                        cfr_temp_8 = this.k - var3_3.k;
                                        v0 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                    }
                                    if (var2_2 != 0) break block41;
                                    if (v0 != false) ** GOTO lbl114
                                    cfr_temp_9 = this.i - var3_3.i;
                                    v0 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                }
                                if (var2_2 != 0) break block42;
                                if (v0 != false) ** GOTO lbl114
                                cfr_temp_10 = this.h - var3_3.h;
                                v0 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 > 0.0 ? 1 : -1);
                            }
                            if (var2_2 != 0) break block43;
                            if (v0 != false) ** GOTO lbl114
                            cfr_temp_11 = this.e - var3_3.e;
                            v0 = cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1);
                        }
                        if (var2_2 != 0) break block44;
                        if (v0 != false) ** GOTO lbl114
                        cfr_temp_12 = this.a - var3_3.a;
                        v0 = cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 != 0) break block45;
                    if (v0 != false) ** GOTO lbl114
                    cfr_temp_13 = this.j - var3_3.j;
                    v0 = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1);
                }
                if (var2_2 != 0) break block46;
                if (v0 != false) ** GOTO lbl114
                cfr_temp_14 = this.n - var3_3.n;
                v0 = cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block47;
            if (v0 != false) ** GOTO lbl114
            cfr_temp_15 = this.d - var3_3.d;
            v0 = cfr_temp_15 == 0.0 ? 0 : (cfr_temp_15 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl114
        try {
            v0 = (double)true;
            return (boolean)v0;
lbl114:
            // 16 sources

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

    public final void a(gY gY2, q q2, double d10) {
        this.o = gY2.h * d10;
        this.f = gY2.j * d10;
        this.m = gY2.i * d10;
        this.p = q2.c;
        this.b = gY2.f * d10;
        this.l = gY2.d * d10;
        this.g = gY2.c * d10;
        this.q = q2.b;
        this.k = gY2.g * d10;
        this.i = gY2.b * d10;
        this.h = gY2.e * d10;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void t(double d10) {
        this.k = d10;
    }

    public final double j() {
        return this.g;
    }

    public final void b(em em2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        double d10 = 1.0 / Math.sqrt(em2.d * em2.d + em2.b * em2.b + em2.e * em2.e);
        double d11 = em2.d * d10;
        double d12 = em2.b * d10;
        double d13 = em2.e * d10;
        double d14 = Math.sin(em2.a);
        double d15 = Math.cos(em2.a);
        double d16 = 1.0 - d15;
        double d17 = em2.d * em2.e;
        double d18 = em2.d * em2.b;
        double d19 = em2.b * em2.e;
        this.o = (d16 * d11 * d11 + d15) * arrd2[0];
        this.f = (d16 * d18 - d14 * d13) * arrd2[1];
        this.m = (d16 * d17 + d14 * d12) * arrd2[2];
        this.b = (d16 * d18 + d14 * d13) * arrd2[0];
        this.l = (d16 * d12 * d12 + d15) * arrd2[1];
        this.g = (d16 * d19 - d14 * d11) * arrd2[2];
        this.k = (d16 * d17 - d14 * d12) * arrd2[0];
        this.i = (d16 * d19 + d14 * d11) * arrd2[1];
        this.h = (d16 * d13 * d13 + d15) * arrd2[2];
    }

    public boolean a(dA dA2, double d10) {
        double d11;
        double d12;
        int n2;
        block91: {
            double d13;
            double d14;
            block90: {
                double d15;
                double d16;
                block89: {
                    double d17;
                    block88: {
                        double d18;
                        double d19;
                        block87: {
                            double d20;
                            block86: {
                                double d21;
                                double d22;
                                block85: {
                                    double d23;
                                    block84: {
                                        double d24;
                                        double d25;
                                        block83: {
                                            double d26;
                                            block82: {
                                                double d27;
                                                double d28;
                                                block81: {
                                                    double d29;
                                                    block80: {
                                                        double d30;
                                                        double d31;
                                                        block79: {
                                                            double d32;
                                                            block78: {
                                                                double d33;
                                                                double d34;
                                                                block77: {
                                                                    double d35;
                                                                    block76: {
                                                                        double d36;
                                                                        double d37;
                                                                        block75: {
                                                                            double d38;
                                                                            block74: {
                                                                                double d39;
                                                                                double d40;
                                                                                block73: {
                                                                                    double d41;
                                                                                    block72: {
                                                                                        double d42;
                                                                                        double d43;
                                                                                        block71: {
                                                                                            double d44;
                                                                                            block70: {
                                                                                                double d45;
                                                                                                double d46;
                                                                                                block69: {
                                                                                                    double d47;
                                                                                                    block68: {
                                                                                                        double d48;
                                                                                                        double d49;
                                                                                                        block67: {
                                                                                                            double d50;
                                                                                                            block66: {
                                                                                                                double d51;
                                                                                                                double d52;
                                                                                                                block65: {
                                                                                                                    double d53;
                                                                                                                    block64: {
                                                                                                                        double d54;
                                                                                                                        double d55;
                                                                                                                        block63: {
                                                                                                                            double d56;
                                                                                                                            block62: {
                                                                                                                                double d57;
                                                                                                                                d14 = this.o - dA2.o;
                                                                                                                                n2 = ae.f();
                                                                                                                                double d58 = d14;
                                                                                                                                if (n2 != 0) {
                                                                                                                                    d58 = d58 < 0.0 ? -d14 : d14;
                                                                                                                                }
                                                                                                                                d56 = (d57 = d58 - d10) == 0.0 ? 0 : (d57 > 0.0 ? 1 : -1);
                                                                                                                                if (n2 == 0) break block62;
                                                                                                                                if (d56 > 0) {
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                d55 = d14 = this.f - dA2.f;
                                                                                                                                if (n2 == 0) break block63;
                                                                                                                                double d59 = d55 - 0.0;
                                                                                                                                d56 = d59 == 0.0 ? 0 : (d59 < 0.0 ? -1 : 1);
                                                                                                                            }
                                                                                                                            d55 = d56 < 0 ? -d14 : d14;
                                                                                                                        }
                                                                                                                        d53 = (d54 = d55 - d10) == 0.0 ? 0 : (d54 > 0.0 ? 1 : -1);
                                                                                                                        if (n2 == 0) break block64;
                                                                                                                        if (d53 > 0) {
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        d52 = d14 = this.m - dA2.m;
                                                                                                                        if (n2 == 0) break block65;
                                                                                                                        double d60 = d52 - 0.0;
                                                                                                                        d53 = d60 == 0.0 ? 0 : (d60 < 0.0 ? -1 : 1);
                                                                                                                    }
                                                                                                                    d52 = d53 < 0 ? -d14 : d14;
                                                                                                                }
                                                                                                                d50 = (d51 = d52 - d10) == 0.0 ? 0 : (d51 > 0.0 ? 1 : -1);
                                                                                                                if (n2 == 0) break block66;
                                                                                                                if (d50 > 0) {
                                                                                                                    return false;
                                                                                                                }
                                                                                                                d49 = d14 = this.p - dA2.p;
                                                                                                                if (n2 == 0) break block67;
                                                                                                                double d61 = d49 - 0.0;
                                                                                                                d50 = d61 == 0.0 ? 0 : (d61 < 0.0 ? -1 : 1);
                                                                                                            }
                                                                                                            d49 = d50 < 0 ? -d14 : d14;
                                                                                                        }
                                                                                                        d47 = (d48 = d49 - d10) == 0.0 ? 0 : (d48 > 0.0 ? 1 : -1);
                                                                                                        if (n2 == 0) break block68;
                                                                                                        if (d47 > 0) {
                                                                                                            return false;
                                                                                                        }
                                                                                                        d46 = d14 = this.b - dA2.b;
                                                                                                        if (n2 == 0) break block69;
                                                                                                        double d62 = d46 - 0.0;
                                                                                                        d47 = d62 == 0.0 ? 0 : (d62 < 0.0 ? -1 : 1);
                                                                                                    }
                                                                                                    d46 = d47 < 0 ? -d14 : d14;
                                                                                                }
                                                                                                d44 = (d45 = d46 - d10) == 0.0 ? 0 : (d45 > 0.0 ? 1 : -1);
                                                                                                if (n2 == 0) break block70;
                                                                                                if (d44 > 0) {
                                                                                                    return false;
                                                                                                }
                                                                                                d43 = d14 = this.l - dA2.l;
                                                                                                if (n2 == 0) break block71;
                                                                                                double d63 = d43 - 0.0;
                                                                                                d44 = d63 == 0.0 ? 0 : (d63 < 0.0 ? -1 : 1);
                                                                                            }
                                                                                            d43 = d44 < 0 ? -d14 : d14;
                                                                                        }
                                                                                        d41 = (d42 = d43 - d10) == 0.0 ? 0 : (d42 > 0.0 ? 1 : -1);
                                                                                        if (n2 == 0) break block72;
                                                                                        if (d41 > 0) {
                                                                                            return false;
                                                                                        }
                                                                                        d40 = d14 = this.g - dA2.g;
                                                                                        if (n2 == 0) break block73;
                                                                                        double d64 = d40 - 0.0;
                                                                                        d41 = d64 == 0.0 ? 0 : (d64 < 0.0 ? -1 : 1);
                                                                                    }
                                                                                    d40 = d41 < 0 ? -d14 : d14;
                                                                                }
                                                                                d38 = (d39 = d40 - d10) == 0.0 ? 0 : (d39 > 0.0 ? 1 : -1);
                                                                                if (n2 == 0) break block74;
                                                                                if (d38 > 0) {
                                                                                    return false;
                                                                                }
                                                                                d37 = d14 = this.q - dA2.q;
                                                                                if (n2 == 0) break block75;
                                                                                double d65 = d37 - 0.0;
                                                                                d38 = d65 == 0.0 ? 0 : (d65 < 0.0 ? -1 : 1);
                                                                            }
                                                                            d37 = d38 < 0 ? -d14 : d14;
                                                                        }
                                                                        d35 = (d36 = d37 - d10) == 0.0 ? 0 : (d36 > 0.0 ? 1 : -1);
                                                                        if (n2 == 0) break block76;
                                                                        if (d35 > 0) {
                                                                            return false;
                                                                        }
                                                                        d34 = d14 = this.k - dA2.k;
                                                                        if (n2 == 0) break block77;
                                                                        double d66 = d34 - 0.0;
                                                                        d35 = d66 == 0.0 ? 0 : (d66 < 0.0 ? -1 : 1);
                                                                    }
                                                                    d34 = d35 < 0 ? -d14 : d14;
                                                                }
                                                                d32 = (d33 = d34 - d10) == 0.0 ? 0 : (d33 > 0.0 ? 1 : -1);
                                                                if (n2 == 0) break block78;
                                                                if (d32 > 0) {
                                                                    return false;
                                                                }
                                                                d31 = d14 = this.i - dA2.i;
                                                                if (n2 == 0) break block79;
                                                                double d67 = d31 - 0.0;
                                                                d32 = d67 == 0.0 ? 0 : (d67 < 0.0 ? -1 : 1);
                                                            }
                                                            d31 = d32 < 0 ? -d14 : d14;
                                                        }
                                                        d29 = (d30 = d31 - d10) == 0.0 ? 0 : (d30 > 0.0 ? 1 : -1);
                                                        if (n2 == 0) break block80;
                                                        if (d29 > 0) {
                                                            return false;
                                                        }
                                                        d28 = d14 = this.h - dA2.h;
                                                        if (n2 == 0) break block81;
                                                        double d68 = d28 - 0.0;
                                                        d29 = d68 == 0.0 ? 0 : (d68 < 0.0 ? -1 : 1);
                                                    }
                                                    d28 = d29 < 0 ? -d14 : d14;
                                                }
                                                d26 = (d27 = d28 - d10) == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                                                if (n2 == 0) break block82;
                                                if (d26 > 0) {
                                                    return false;
                                                }
                                                d25 = d14 = this.e - dA2.e;
                                                if (n2 == 0) break block83;
                                                double d69 = d25 - 0.0;
                                                d26 = d69 == 0.0 ? 0 : (d69 < 0.0 ? -1 : 1);
                                            }
                                            d25 = d26 < 0 ? -d14 : d14;
                                        }
                                        d23 = (d24 = d25 - d10) == 0.0 ? 0 : (d24 > 0.0 ? 1 : -1);
                                        if (n2 == 0) break block84;
                                        if (d23 > 0) {
                                            return false;
                                        }
                                        d22 = d14 = this.a - dA2.a;
                                        if (n2 == 0) break block85;
                                        double d70 = d22 - 0.0;
                                        d23 = d70 == 0.0 ? 0 : (d70 < 0.0 ? -1 : 1);
                                    }
                                    d22 = d23 < 0 ? -d14 : d14;
                                }
                                d20 = (d21 = d22 - d10) == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                                if (n2 == 0) break block86;
                                if (d20 > 0) {
                                    return false;
                                }
                                d19 = d14 = this.j - dA2.j;
                                if (n2 == 0) break block87;
                                double d71 = d19 - 0.0;
                                d20 = d71 == 0.0 ? 0 : (d71 < 0.0 ? -1 : 1);
                            }
                            d19 = d20 < 0 ? -d14 : d14;
                        }
                        d17 = (d18 = d19 - d10) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        if (n2 == 0) break block88;
                        if (d17 > 0) {
                            return false;
                        }
                        d16 = d14 = this.n - dA2.n;
                        if (n2 == 0) break block89;
                        double d72 = d16 - 0.0;
                        d17 = d72 == 0.0 ? 0 : (d72 < 0.0 ? -1 : 1);
                    }
                    d16 = d17 < 0 ? -d14 : d14;
                }
                d13 = (d15 = d16 - d10) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                if (n2 == 0) break block90;
                if (d13 > 0) {
                    return false;
                }
                d12 = d14 = this.d - dA2.d;
                if (n2 == 0) break block91;
                double d73 = d12 - 0.0;
                d13 = d73 == 0.0 ? 0 : (d73 < 0.0 ? -1 : 1);
            }
            d12 = d13 < 0 ? -d14 : d14;
        }
        double d74 = (d11 = d12 - d10) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (n2 != 0) {
            d74 = d74 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d74;
    }

    public final void b(double d10) {
        this.o = d10;
    }

    public final void g(dA dA2) {
        this.o = dA2.o;
        this.f = dA2.f;
        this.m = dA2.m;
        this.p = dA2.p;
        this.b = dA2.b;
        this.l = dA2.l;
        this.g = dA2.g;
        this.q = dA2.q;
        this.k = dA2.k;
        this.i = dA2.i;
        this.h = dA2.h;
        this.e = dA2.e;
        this.a = dA2.a;
        this.j = dA2.j;
        this.n = dA2.n;
        this.d = dA2.d;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.o);
        l2 = gW.a(l2, this.f);
        l2 = gW.a(l2, this.m);
        l2 = gW.a(l2, this.p);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.l);
        l2 = gW.a(l2, this.g);
        l2 = gW.a(l2, this.q);
        l2 = gW.a(l2, this.k);
        l2 = gW.a(l2, this.i);
        l2 = gW.a(l2, this.h);
        l2 = gW.a(l2, this.e);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.j);
        l2 = gW.a(l2, this.n);
        l2 = gW.a(l2, this.d);
        return gW.a(l2);
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
                n8 = ae.g();
                n7 = 0;
                n6 = 0;
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
                                if (n8 != 0) break block29;
                                n3 = n4;
                                while (n3-- != 0) {
                                    double d13 = arrd[n7++];
                                    double d14 = d13 = Math.abs(d13);
                                    if (n8 == 0) {
                                        double d15 = d14 - d10;
                                        d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                        if (n8 != 0) break block30;
                                        if (d11 <= 0) continue;
                                        d14 = d10 = d13;
                                    }
                                    if (n8 == 0) continue;
                                }
                                d11 = (d12 = d10 - 0.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (n8 != 0) break block36;
                            if (d11 != false) break block37;
                            d11 = 0.0;
                        }
                        return (boolean)d11;
                    }
                    arrd2[n6++] = 1.0 / d10;
                    if (n8 == 0) continue;
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
                        if (n8 != 0) break block31;
                        n7 = n2;
                        while (n7 < n5) {
                            block32: {
                                n12 = n3 + 4 * n7 + n5;
                                d17 = arrd[n12];
                                int n13 = n7;
                                int n14 = n3 + 4 * n7;
                                n9 = n3 + n5;
                                if (n8 != 0) continue block3;
                                n11 = n9;
                                while (n13-- != 0) {
                                    d17 -= arrd[n14] * arrd[n11];
                                    ++n14;
                                    n11 += 4;
                                    if (n8 == 0) {
                                        if (n8 == 0) continue;
                                    }
                                    break block32;
                                }
                                arrd[n12] = d17;
                                ++n7;
                            }
                            if (n8 == 0) continue;
                        }
                        double d18 = 0.0;
                        n6 = -1;
                        for (n7 = n5; n7 < 4; ++n7) {
                            block34: {
                                n12 = n3 + 4 * n7 + n5;
                                d17 = arrd[n12];
                                int n15 = n5;
                                int n16 = n3 + 4 * n7;
                                n10 = n3 + n5;
                                if (n8 != 0) break block33;
                                n11 = n10;
                                while (n15-- != 0) {
                                    d17 -= arrd[n16] * arrd[n11];
                                    ++n16;
                                    n11 += 4;
                                    if (n8 == 0) {
                                        if (n8 == 0) continue;
                                    }
                                    break block34;
                                }
                                arrd[n12] = d17;
                            }
                            d16 = arrd2[n7] * Math.abs(d17);
                            double d19 = d16 == d18 ? 0 : (d16 > d18 ? 1 : -1);
                            if (n8 == 0) {
                                if (d19 < 0) continue;
                                d18 = d16;
                                d19 = n7;
                            }
                            n6 = (int)d19;
                            if (n8 == 0) continue;
                        }
                        n10 = n6;
                    }
                    if (n8 == 0) {
                        if (n10 < 0) {
                            throw new RuntimeException(cK.a("Matrix4d11"));
                        }
                        n10 = n5;
                    }
                    if (n8 == 0) {
                        double d20;
                        block35: {
                            if (n10 != n6) {
                                int n17 = 4;
                                int n18 = n3 + 4 * n6;
                                n11 = n3 + 4 * n5;
                                while (n17-- != 0) {
                                    d16 = arrd[n18];
                                    arrd[n18++] = arrd[n11];
                                    arrd[n11++] = d16;
                                    if (n8 == 0) {
                                        if (n8 == 0) continue;
                                    }
                                    break block35;
                                }
                                arrd2[n6] = arrd2[n5];
                            }
                            arrn[n5] = n6;
                        }
                        n10 = (d20 = arrd[n3 + 4 * n5 + n5] - 0.0) == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (n8 == 0) {
                        if (n10 == 0) {
                            return false;
                        }
                        n10 = n5;
                    }
                    if (n10 != 3) {
                        d16 = 1.0 / arrd[n3 + 4 * n5 + n5];
                        n12 = n3 + 4 * (n5 + 1) + n5;
                        n7 = 3 - n5;
                        while (n7-- != 0) {
                            int n19 = n12;
                            arrd[n19] = arrd[n19] * d16;
                            n12 += 4;
                            if (n8 != 0) continue block2;
                            if (n8 == 0) continue;
                        }
                    }
                    ++n5;
                    if (n8 == 0) continue block2;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
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
                    d10 = 1.0E-10;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.o = 1.0;
                    this.f = 0.0;
                    this.m = 0.0;
                    this.b = 0.0;
                    this.l = 1.0;
                    this.g = 0.0;
                    this.k = 0.0;
                    this.i = 0.0;
                    this.h = 1.0;
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
            this.o = d18 * d13 * d13 + d17;
            this.f = d18 * d20 - d16 * d15;
            this.m = d18 * d19 + d16 * d14;
            this.b = d18 * d20 + d16 * d15;
            this.l = d18 * d14 * d14 + d17;
            this.g = d18 * d21 - d16 * d13;
            this.k = d18 * d19 - d16 * d14;
            this.i = d18 * d21 + d16 * d13;
            this.h = d18 * d15 * d15 + d17;
        }
        this.p = 0.0;
        this.q = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void d(dA dA2) {
        this.o -= dA2.o;
        this.f -= dA2.f;
        this.m -= dA2.m;
        this.p -= dA2.p;
        this.b -= dA2.b;
        this.l -= dA2.l;
        this.g -= dA2.g;
        this.q -= dA2.q;
        this.k -= dA2.k;
        this.i -= dA2.i;
        this.h -= dA2.h;
        this.e -= dA2.e;
        this.a -= dA2.a;
        this.j -= dA2.j;
        this.n -= dA2.n;
        this.d -= dA2.d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, int var2_2, double var3_3) {
        var5_4 = ae.f();
        v0 = var1_1;
        if (var5_4 == 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        this.o = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 1: {
                        this.f = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 2: {
                        this.m = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 3: {
                        this.p = var3_3;
                        if (var5_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d0"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        this.b = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 1: {
                        this.l = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 2: {
                        this.g = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 3: {
                        this.q = var3_3;
                        if (var5_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d0"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        this.k = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 1: {
                        this.i = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 2: {
                        this.h = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 3: {
                        this.e = var3_3;
                        if (var5_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d0"));
            }
            case 3: {
                switch (var2_2) {
                    case 0: {
                        this.a = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 1: {
                        this.j = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 2: {
                        this.n = var3_3;
                        if (var5_4 != 0) return;
                    }
                    case 3: {
                        this.d = var3_3;
                        if (var5_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d0"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d0"));
    }

    public final void a(X x2) {
        float f10 = (float)(this.o * (double)x2.c + this.f * (double)x2.a + this.m * (double)x2.b + this.p);
        float f11 = (float)(this.b * (double)x2.c + this.l * (double)x2.a + this.g * (double)x2.b + this.q);
        x2.b = (float)(this.k * (double)x2.c + this.i * (double)x2.a + this.h * (double)x2.b + this.e);
        x2.c = f10;
        x2.a = f11;
    }

    public final double i() {
        return this.o;
    }

    public final void k(double d10) {
        this.m = d10;
    }

    private final void a(double[] arrd, double[] arrd2) {
        double[] arrd3 = new double[]{this.o, this.f, this.m, this.b, this.l, this.g, this.k, this.i, this.h};
        gY.b(arrd3, arrd, arrd2);
    }

    public final void w(double d10) {
        this.o += d10;
        this.f += d10;
        this.m += d10;
        this.p += d10;
        this.b += d10;
        this.l += d10;
        this.g += d10;
        this.q += d10;
        this.k += d10;
        this.i += d10;
        this.h += d10;
        this.e += d10;
        this.a += d10;
        this.j += d10;
        this.n += d10;
        this.d += d10;
    }

    public final void i(dA dA2) {
        block4: {
            dA dA3;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dA3 = this;
                    if (n2 == 0) break block2;
                    if (dA3 == dA2) break block3;
                    this.o = dA2.o;
                    this.f = dA2.b;
                    this.m = dA2.k;
                    this.p = dA2.a;
                    this.b = dA2.f;
                    this.l = dA2.l;
                    this.g = dA2.i;
                    this.q = dA2.j;
                    this.k = dA2.m;
                    this.i = dA2.g;
                    this.h = dA2.h;
                    this.e = dA2.n;
                    this.a = dA2.p;
                    this.j = dA2.q;
                    this.n = dA2.e;
                    this.d = dA2.d;
                    if (n2 != 0) break block4;
                }
                dA3 = this;
            }
            dA3.o();
        }
    }

    public final double a(dc dc2, q q2) {
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
        q2.c = this.p;
        q2.b = this.q;
        q2.a = this.e;
        return gY.d(arrd2);
    }

    public final void c(ao ao2) {
        this.o = 1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b;
        this.b = 2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b);
        this.k = 2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a);
        this.f = 2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b);
        this.l = 1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b;
        this.i = 2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c);
        this.m = 2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a);
        this.g = 2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c);
        this.h = 1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a;
        this.p = 0.0;
        this.q = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(q q2, q q3) {
        double d10 = this.o * q2.c + this.f * q2.b + this.m * q2.a;
        double d11 = this.b * q2.c + this.l * q2.b + this.g * q2.a;
        q3.a = this.k * q2.c + this.i * q2.b + this.h * q2.a;
        q3.c = d10;
        q3.b = d11;
    }

    public final double a(gY gY2, q q2) {
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
        q2.c = this.p;
        q2.b = this.q;
        q2.a = this.e;
        return gY.d(arrd2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean h(dA var1_1) {
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
                                                                        cfr_temp_0 = this.o - var1_1.o;
                                                                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                        if (var2_2 != 0) break block47;
                                                                        if (v0 != false) ** GOTO lbl115
                                                                        cfr_temp_1 = this.f - var1_1.f;
                                                                        v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                    }
                                                                    if (var2_2 != 0) break block33;
                                                                    if (v0 != false) ** GOTO lbl115
                                                                }
                                                                catch (NullPointerException var3_3) {
                                                                    return false;
                                                                }
                                                                cfr_temp_2 = this.m - var1_1.m;
                                                                v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                            }
                                                            if (var2_2 != 0) break block34;
                                                            if (v0 != false) ** GOTO lbl115
                                                            cfr_temp_3 = this.p - var1_1.p;
                                                            v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                        }
                                                        if (var2_2 != 0) break block35;
                                                        if (v0 != false) ** GOTO lbl115
                                                        cfr_temp_4 = this.b - var1_1.b;
                                                        v0 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                    }
                                                    if (var2_2 != 0) break block36;
                                                    if (v0 != false) ** GOTO lbl115
                                                    cfr_temp_5 = this.l - var1_1.l;
                                                    v0 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                }
                                                if (var2_2 != 0) break block37;
                                                if (v0 != false) ** GOTO lbl115
                                                cfr_temp_6 = this.g - var1_1.g;
                                                v0 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                            }
                                            if (var2_2 != 0) break block38;
                                            if (v0 != false) ** GOTO lbl115
                                            cfr_temp_7 = this.q - var1_1.q;
                                            v0 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                        }
                                        if (var2_2 != 0) break block39;
                                        if (v0 != false) ** GOTO lbl115
                                        cfr_temp_8 = this.k - var1_1.k;
                                        v0 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                    }
                                    if (var2_2 != 0) break block40;
                                    if (v0 != false) ** GOTO lbl115
                                    cfr_temp_9 = this.i - var1_1.i;
                                    v0 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                }
                                if (var2_2 != 0) break block41;
                                if (v0 != false) ** GOTO lbl115
                                cfr_temp_10 = this.h - var1_1.h;
                                v0 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 > 0.0 ? 1 : -1);
                            }
                            if (var2_2 != 0) break block42;
                            if (v0 != false) ** GOTO lbl115
                            cfr_temp_11 = this.e - var1_1.e;
                            v0 = cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1);
                        }
                        if (var2_2 != 0) break block43;
                        if (v0 != false) ** GOTO lbl115
                        cfr_temp_12 = this.a - var1_1.a;
                        v0 = cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                    }
                    if (var2_2 != 0) break block44;
                    if (v0 != false) ** GOTO lbl115
                    cfr_temp_13 = this.j - var1_1.j;
                    v0 = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1);
                }
                if (var2_2 != 0) break block45;
                if (v0 != false) ** GOTO lbl115
                cfr_temp_14 = this.n - var1_1.n;
                v0 = cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1);
            }
            if (var2_2 != 0) break block46;
            if (v0 != false) ** GOTO lbl115
            cfr_temp_15 = this.d - var1_1.d;
            v0 = cfr_temp_15 == 0.0 ? 0 : (cfr_temp_15 > 0.0 ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl115
        v0 = (double)true;
        return (boolean)v0;
lbl115:
        // 16 sources

        v0 = (double)false;
        return (boolean)v0;
    }

    public final void a(eG eG2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(eG2.e * eG2.e + eG2.d * eG2.d + eG2.c * eG2.c);
                    int n2 = ae.f();
                    d11 = d12;
                    d10 = 1.0E-10;
                    if (n2 == 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.o = 1.0;
                    this.f = 0.0;
                    this.m = 0.0;
                    this.b = 0.0;
                    this.l = 1.0;
                    this.g = 0.0;
                    this.k = 0.0;
                    this.i = 0.0;
                    this.h = 1.0;
                    if (n2 != 0) break block4;
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
            this.o = d18 * d13 * d13 + d17;
            this.f = d18 * d20 - d16 * d15;
            this.m = d18 * d19 + d16 * d14;
            this.b = d18 * d20 + d16 * d15;
            this.l = d18 * d14 * d14 + d17;
            this.g = d18 * d21 - d16 * d13;
            this.k = d18 * d19 - d16 * d14;
            this.i = d18 * d21 + d16 * d13;
            this.h = d18 * d15 * d15 + d17;
        }
        this.p = 0.0;
        this.q = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(ao ao2, q q2, double d10) {
        this.o = d10 * (1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b);
        this.b = d10 * (2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b));
        this.k = d10 * (2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a));
        this.f = d10 * (2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b));
        this.l = d10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b);
        this.i = d10 * (2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c));
        this.m = d10 * (2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a));
        this.g = d10 * (2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c));
        this.h = d10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a);
        this.p = q2.c;
        this.q = q2.b;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final double f() {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        return gY.d(arrd2);
    }

    public boolean a(dA dA2, float f10) {
        return this.a(dA2, (double)f10);
    }

    public final void m(double d10) {
        this.i = d10;
    }

    public final void a() {
        this.a(this);
    }

    public dA(dU dU2) {
        this.o = dU2.l;
        this.f = dU2.i;
        this.m = dU2.g;
        this.p = dU2.c;
        this.b = dU2.a;
        this.l = dU2.d;
        this.g = dU2.f;
        this.q = dU2.o;
        this.k = dU2.e;
        this.i = dU2.k;
        this.h = dU2.m;
        this.e = dU2.n;
        this.a = dU2.q;
        this.j = dU2.b;
        this.n = dU2.j;
        this.d = dU2.h;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, double var2_2, double var4_3, double var6_4, double var8_5) {
        var10_6 = ae.f();
        if (var10_6 == 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2;
                this.f = var4_3;
                this.m = var6_4;
                this.p = var8_5;
lbl9:
                // 2 sources

                if (var10_6 != 0) return;
            }
            case 1: {
                this.b = var2_2;
                this.l = var4_3;
                this.g = var6_4;
                this.q = var8_5;
                if (var10_6 != 0) return;
            }
            case 2: {
                this.k = var2_2;
                this.i = var4_3;
                this.h = var6_4;
                this.e = var8_5;
                if (var10_6 != 0) return;
            }
            case 3: {
                this.a = var2_2;
                this.j = var4_3;
                this.n = var6_4;
                this.d = var8_5;
                if (var10_6 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d4"));
    }

    public final void b(gY gY2) {
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

    public final void a(gS gS2) {
        double d10 = this.o * gS2.c + this.f * gS2.a + this.m * gS2.b + this.p * gS2.d;
        double d11 = this.b * gS2.c + this.l * gS2.a + this.g * gS2.b + this.q * gS2.d;
        double d12 = this.k * gS2.c + this.i * gS2.a + this.h * gS2.b + this.e * gS2.d;
        gS2.d = this.a * gS2.c + this.j * gS2.a + this.n * gS2.b + this.d * gS2.d;
        gS2.c = d10;
        gS2.a = d11;
        gS2.b = d12;
    }

    public final void o(double d10) {
        this.f = d10;
    }

    public final double g() {
        return this.n;
    }

    final void a(dA dA2) {
        block4: {
            int n2;
            double[] arrd = new double[16];
            int[] arrn = new int[4];
            double[] arrd2 = new double[16];
            arrd2[0] = dA2.o;
            arrd2[1] = dA2.f;
            arrd2[2] = dA2.m;
            arrd2[3] = dA2.p;
            arrd2[4] = dA2.b;
            arrd2[5] = dA2.l;
            arrd2[6] = dA2.g;
            arrd2[7] = dA2.q;
            arrd2[8] = dA2.k;
            arrd2[9] = dA2.i;
            arrd2[10] = dA2.h;
            arrd2[11] = dA2.e;
            int n3 = ae.g();
            arrd2[12] = dA2.a;
            arrd2[13] = dA2.j;
            arrd2[14] = dA2.n;
            arrd2[15] = dA2.d;
            int n4 = dA.a(arrd2, arrn);
            if (n3 == 0) {
                if (n4 == 0) {
                    throw new gP(cK.a("Matrix4d10"));
                }
                n4 = n2 = 0;
            }
            while (n2 < 16) {
                arrd[n2] = 0.0;
                ++n2;
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block4;
            }
            arrd[0] = 1.0;
            arrd[5] = 1.0;
            arrd[10] = 1.0;
            arrd[15] = 1.0;
            dA.a(arrd2, arrn, arrd);
            this.o = arrd[0];
            this.f = arrd[1];
            this.m = arrd[2];
            this.p = arrd[3];
            this.b = arrd[4];
            this.l = arrd[5];
            this.g = arrd[6];
            this.q = arrd[7];
            this.k = arrd[8];
            this.i = arrd[9];
            this.h = arrd[10];
            this.e = arrd[11];
            this.a = arrd[12];
            this.j = arrd[13];
            this.n = arrd[14];
            this.d = arrd[15];
        }
    }

    public final double k() {
        return this.a;
    }

    public final void e(dc dc2) {
        dc2.j = (float)this.o;
        dc2.d = (float)this.f;
        dc2.a = (float)this.m;
        dc2.c = (float)this.b;
        dc2.g = (float)this.l;
        dc2.h = (float)this.g;
        dc2.f = (float)this.k;
        dc2.e = (float)this.i;
        dc2.i = (float)this.h;
    }

    public final double q() {
        return this.h;
    }

    public final void c(dA dA2) {
        this.o = -dA2.o;
        this.f = -dA2.f;
        this.m = -dA2.m;
        this.p = -dA2.p;
        this.b = -dA2.b;
        this.l = -dA2.l;
        this.g = -dA2.g;
        this.q = -dA2.q;
        this.k = -dA2.k;
        this.i = -dA2.i;
        this.h = -dA2.h;
        this.e = -dA2.e;
        this.a = -dA2.a;
        this.j = -dA2.j;
        this.n = -dA2.n;
        this.d = -dA2.d;
    }

    public final void b(dA dA2) {
        block0: {
            double d10 = this.o * dA2.o + this.f * dA2.b + this.m * dA2.k + this.p * dA2.a;
            double d11 = this.o * dA2.f + this.f * dA2.l + this.m * dA2.i + this.p * dA2.j;
            double d12 = this.o * dA2.m + this.f * dA2.g + this.m * dA2.h + this.p * dA2.n;
            double d13 = this.o * dA2.p + this.f * dA2.q + this.m * dA2.e + this.p * dA2.d;
            double d14 = this.b * dA2.o + this.l * dA2.b + this.g * dA2.k + this.q * dA2.a;
            double d15 = this.b * dA2.f + this.l * dA2.l + this.g * dA2.i + this.q * dA2.j;
            double d16 = this.b * dA2.m + this.l * dA2.g + this.g * dA2.h + this.q * dA2.n;
            double d17 = this.b * dA2.p + this.l * dA2.q + this.g * dA2.e + this.q * dA2.d;
            double d18 = this.k * dA2.o + this.i * dA2.b + this.h * dA2.k + this.e * dA2.a;
            double d19 = this.k * dA2.f + this.i * dA2.l + this.h * dA2.i + this.e * dA2.j;
            double d20 = this.k * dA2.m + this.i * dA2.g + this.h * dA2.h + this.e * dA2.n;
            double d21 = this.k * dA2.p + this.i * dA2.q + this.h * dA2.e + this.e * dA2.d;
            double d22 = this.a * dA2.o + this.j * dA2.b + this.n * dA2.k + this.d * dA2.a;
            double d23 = this.a * dA2.f + this.j * dA2.l + this.n * dA2.i + this.d * dA2.j;
            double d24 = this.a * dA2.m + this.j * dA2.g + this.n * dA2.h + this.d * dA2.n;
            double d25 = this.a * dA2.p + this.j * dA2.q + this.n * dA2.e + this.d * dA2.d;
            this.o = d10;
            this.f = d11;
            this.m = d12;
            this.p = d13;
            this.b = d14;
            int n2 = ae.f();
            this.l = d15;
            this.g = d16;
            this.q = d17;
            this.k = d18;
            this.i = d19;
            this.h = d20;
            this.e = d21;
            this.a = d22;
            this.j = d23;
            this.n = d24;
            this.d = d25;
            if (net.minecraft.k.m.d()) break block0;
            ae.b(++n2);
        }
    }

    public final void a(int n2, gO gO2) {
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
                                        gO2.c = this.o;
                                        gO2.a = this.f;
                                        gO2.b = this.m;
                                        gO2.d = this.p;
                                        if (n5 != 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 == 0) break block5;
                                if (n4 != n3) break block6;
                                gO2.c = this.b;
                                gO2.a = this.l;
                                gO2.b = this.g;
                                gO2.d = this.q;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 == 0) break block7;
                        if (n4 != n3) break block8;
                        gO2.c = this.k;
                        gO2.a = this.i;
                        gO2.b = this.h;
                        gO2.d = this.e;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                gO2.c = this.a;
                gO2.a = this.j;
                gO2.b = this.n;
                gO2.d = this.d;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d2"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, gO var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2.c;
                this.b = var2_2.a;
                this.k = var2_2.b;
                this.a = var2_2.d;
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.f = var2_2.c;
                this.l = var2_2.a;
                this.i = var2_2.b;
                this.j = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 2: {
                this.m = var2_2.c;
                this.g = var2_2.a;
                this.h = var2_2.b;
                this.n = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 3: {
                this.p = var2_2.c;
                this.q = var2_2.a;
                this.e = var2_2.b;
                this.d = var2_2.d;
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d7"));
    }

    public final void a(q q2, double d10) {
        this.o = d10;
        this.f = 0.0;
        this.m = 0.0;
        this.p = d10 * q2.c;
        this.b = 0.0;
        this.l = d10;
        this.g = 0.0;
        this.q = d10 * q2.b;
        this.k = 0.0;
        this.i = 0.0;
        this.h = d10;
        this.e = d10 * q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public dA(dc dc2, q q2, double d10) {
        this.o = (double)dc2.j * d10;
        this.f = (double)dc2.d * d10;
        this.m = (double)dc2.a * d10;
        this.p = q2.c;
        this.b = (double)dc2.c * d10;
        this.l = (double)dc2.g * d10;
        this.g = (double)dc2.h * d10;
        this.q = q2.b;
        this.k = (double)dc2.f * d10;
        this.i = (double)dc2.e * d10;
        this.h = (double)dc2.i * d10;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final double t() {
        return this.e;
    }

    public final double l() {
        return this.k;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public final void d(q q2) {
        this.p = q2.c;
        this.q = q2.b;
        this.e = q2.a;
    }

    public final void a(p p2, p p3) {
        double d10 = this.o * p2.c + this.f * p2.b + this.m * p2.a + this.p;
        double d11 = this.b * p2.c + this.l * p2.b + this.g * p2.a + this.q;
        p3.a = this.k * p2.c + this.i * p2.b + this.h * p2.a + this.e;
        p3.c = d10;
        p3.b = d11;
    }

    public dA(gY gY2, q q2, double d10) {
        this.o = gY2.h * d10;
        this.f = gY2.j * d10;
        this.m = gY2.i * d10;
        this.p = q2.c;
        this.b = gY2.f * d10;
        this.l = gY2.d * d10;
        this.g = gY2.c * d10;
        this.q = q2.b;
        this.k = gY2.g * d10;
        this.i = gY2.b * d10;
        this.h = gY2.e * d10;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, gO var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2.c;
                this.f = var2_2.a;
                this.m = var2_2.b;
                this.p = var2_2.d;
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.b = var2_2.c;
                this.l = var2_2.a;
                this.g = var2_2.b;
                this.q = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 2: {
                this.k = var2_2.c;
                this.i = var2_2.a;
                this.h = var2_2.b;
                this.e = var2_2.d;
                if (var3_3 == 0) return;
            }
            case 3: {
                this.a = var2_2.c;
                this.j = var2_2.a;
                this.n = var2_2.b;
                this.d = var2_2.d;
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d4"));
    }

    public final void a(dU dU2) {
        this.o = dU2.l;
        this.f = dU2.i;
        this.m = dU2.g;
        this.p = dU2.c;
        this.b = dU2.a;
        this.l = dU2.d;
        this.g = dU2.f;
        this.q = dU2.o;
        this.k = dU2.e;
        this.i = dU2.k;
        this.h = dU2.m;
        this.e = dU2.n;
        this.a = dU2.q;
        this.j = dU2.b;
        this.n = dU2.j;
        this.d = dU2.h;
    }

    public dA(ao ao2, q q2, double d10) {
        this.o = d10 * (1.0 - 2.0 * (double)ao2.a * (double)ao2.a - 2.0 * (double)ao2.b * (double)ao2.b);
        this.b = d10 * (2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b));
        this.k = d10 * (2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a));
        this.f = d10 * (2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b));
        this.l = d10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.b * (double)ao2.b);
        this.i = d10 * (2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c));
        this.m = d10 * (2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a));
        this.g = d10 * (2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c));
        this.h = d10 * (1.0 - 2.0 * (double)ao2.c * (double)ao2.c - 2.0 * (double)ao2.a * (double)ao2.a);
        this.p = q2.c;
        this.q = q2.b;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void g(double d10) {
        this.h = d10;
    }

    public dA(double[] arrd) {
        this.o = arrd[0];
        this.f = arrd[1];
        this.m = arrd[2];
        this.p = arrd[3];
        this.b = arrd[4];
        this.l = arrd[5];
        this.g = arrd[6];
        this.q = arrd[7];
        this.k = arrd[8];
        this.i = arrd[9];
        this.h = arrd[10];
        this.e = arrd[11];
        this.a = arrd[12];
        this.j = arrd[13];
        this.n = arrd[14];
        this.d = arrd[15];
    }

    public final void e(dA dA2) {
        this.a(dA2);
    }

    public final void a(g4 g42, q q2, double d10) {
        this.o = d10 * (1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b);
        this.b = d10 * (2.0 * (g42.c * g42.a + g42.d * g42.b));
        this.k = d10 * (2.0 * (g42.c * g42.b - g42.d * g42.a));
        this.f = d10 * (2.0 * (g42.c * g42.a - g42.d * g42.b));
        this.l = d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b);
        this.i = d10 * (2.0 * (g42.a * g42.b + g42.d * g42.c));
        this.m = d10 * (2.0 * (g42.c * g42.b + g42.d * g42.a));
        this.g = d10 * (2.0 * (g42.a * g42.b - g42.d * g42.c));
        this.h = d10 * (1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a);
        this.p = q2.c;
        this.q = q2.b;
        this.e = q2.a;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void d(double d10) {
        this.o *= d10;
        this.f *= d10;
        this.m *= d10;
        this.p *= d10;
        this.b *= d10;
        this.l *= d10;
        this.g *= d10;
        this.q *= d10;
        this.k *= d10;
        this.i *= d10;
        this.h *= d10;
        this.e *= d10;
        this.a *= d10;
        this.j *= d10;
        this.n *= d10;
        this.d *= d10;
    }

    public final void v(double d10) {
        this.p = d10;
    }

    public Object clone() {
        dA dA2 = null;
        try {
            dA2 = (dA)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        return dA2;
    }

    public final void c(double d10) {
        this.b = d10;
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

    public final void p() {
        this.o = -this.o;
        this.f = -this.f;
        this.m = -this.m;
        this.p = -this.p;
        this.b = -this.b;
        this.l = -this.l;
        this.g = -this.g;
        this.q = -this.q;
        this.k = -this.k;
        this.i = -this.i;
        this.h = -this.h;
        this.e = -this.e;
        this.a = -this.a;
        this.j = -this.j;
        this.n = -this.n;
        this.d = -this.d;
    }

    public final void j(double d10) {
        double d11;
        double d12 = Math.sin(d10);
        this.o = d11 = Math.cos(d10);
        this.f = 0.0;
        this.m = d12;
        this.p = 0.0;
        this.b = 0.0;
        this.l = 1.0;
        this.g = 0.0;
        this.q = 0.0;
        this.k = -d12;
        this.i = 0.0;
        this.h = d11;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void v() {
        this.o = 0.0;
        this.f = 0.0;
        this.m = 0.0;
        this.p = 0.0;
        this.b = 0.0;
        this.l = 0.0;
        this.g = 0.0;
        this.q = 0.0;
        this.k = 0.0;
        this.i = 0.0;
        this.h = 0.0;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 0.0;
    }

    public final void b(double d10, dA dA2) {
        this.o = dA2.o * d10;
        this.f = dA2.f * d10;
        this.m = dA2.m * d10;
        this.p = dA2.p * d10;
        this.b = dA2.b * d10;
        this.l = dA2.l * d10;
        this.g = dA2.g * d10;
        this.q = dA2.q * d10;
        this.k = dA2.k * d10;
        this.i = dA2.i * d10;
        this.h = dA2.h * d10;
        this.e = dA2.e * d10;
        this.a = dA2.a * d10;
        this.j = dA2.j * d10;
        this.n = dA2.n * d10;
        this.d = dA2.d * d10;
    }

    public final void a(g4 g42) {
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
                        n2 = ae.g();
                        double[] arrd2 = new double[3];
                        this.a(arrd2, arrd);
                        double d17 = d11 = 0.25 * (1.0 + arrd[0] + arrd[4] + arrd[8]);
                        if (n2 == 0) {
                            d17 = d17 < 0.0 ? -d11 : d11;
                        }
                        d15 = (d16 = d17 - 1.0E-30) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (n2 != 0) break block10;
                        if (d15 >= 0) {
                            g42.d = Math.sqrt(d11);
                            d11 = 0.25 / g42.d;
                            g42.c = (arrd[7] - arrd[5]) * d11;
                            g42.a = (arrd[2] - arrd[6]) * d11;
                            g42.b = (arrd[3] - arrd[1]) * d11;
                            return;
                        }
                        g42.d = 0.0;
                        d14 = d11 = -0.5 * (arrd[4] + arrd[8]);
                        if (n2 != 0) break block11;
                        double d18 = d14 - 0.0;
                        d15 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    d14 = d15 < 0 ? -d11 : d11;
                }
                d12 = (d13 = d14 - 1.0E-30) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                if (n2 != 0) break block12;
                if (d12 >= 0) {
                    g42.c = Math.sqrt(d11);
                    d11 = 0.5 / g42.c;
                    g42.a = arrd[3] * d11;
                    g42.b = arrd[6] * d11;
                    return;
                }
                g42.c = 0.0;
                d10 = d11 = 0.5 * (1.0 - arrd[8]);
                if (n2 != 0) break block13;
                double d19 = d10 - 0.0;
                d12 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
            }
            d10 = d12 < 0 ? -d11 : d11;
        }
        if (!(d10 < 1.0E-30)) {
            g42.a = Math.sqrt(d11);
            g42.b = arrd[7] / (2.0 * g42.a);
            return;
        }
        g42.a = 0.0;
        g42.b = 1.0;
    }

    public final void d(int n2, gO gO2) {
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
                                        gO2.c = this.o;
                                        gO2.a = this.b;
                                        gO2.b = this.k;
                                        gO2.d = this.a;
                                        if (n5 != 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 == 0) break block5;
                                if (n4 != n3) break block6;
                                gO2.c = this.f;
                                gO2.a = this.l;
                                gO2.b = this.i;
                                gO2.d = this.j;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 == 0) break block7;
                        if (n4 != n3) break block8;
                        gO2.c = this.m;
                        gO2.a = this.g;
                        gO2.b = this.h;
                        gO2.d = this.n;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                gO2.c = this.p;
                gO2.a = this.q;
                gO2.b = this.e;
                gO2.d = this.d;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d3"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, double[] var2_2) {
        var3_3 = ae.g();
        if (var3_3 != 0) ** GOTO lbl9
        switch (var1_1) {
            case 0: {
                this.o = var2_2[0];
                this.b = var2_2[1];
                this.k = var2_2[2];
                this.a = var2_2[3];
lbl9:
                // 2 sources

                if (var3_3 == 0) return;
            }
            case 1: {
                this.f = var2_2[0];
                this.l = var2_2[1];
                this.i = var2_2[2];
                this.j = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 2: {
                this.m = var2_2[0];
                this.g = var2_2[1];
                this.h = var2_2[2];
                this.n = var2_2[3];
                if (var3_3 == 0) return;
            }
            case 3: {
                this.p = var2_2[0];
                this.q = var2_2[1];
                this.e = var2_2[2];
                this.d = var2_2[3];
                if (var3_3 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d7"));
    }

    public dA(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25) {
        this.o = d10;
        this.f = d11;
        this.m = d12;
        this.p = d13;
        this.b = d14;
        this.l = d15;
        this.g = d16;
        this.q = d17;
        this.k = d18;
        this.i = d19;
        this.h = d20;
        this.e = d21;
        this.a = d22;
        this.j = d23;
        this.n = d24;
        this.d = d25;
    }

    public final void a(ao ao2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.o = (1.0 - (double)(2.0f * ao2.a * ao2.a) - (double)(2.0f * ao2.b * ao2.b)) * arrd2[0];
        this.b = 2.0 * (double)(ao2.c * ao2.a + ao2.d * ao2.b) * arrd2[0];
        this.k = 2.0 * (double)(ao2.c * ao2.b - ao2.d * ao2.a) * arrd2[0];
        this.f = 2.0 * (double)(ao2.c * ao2.a - ao2.d * ao2.b) * arrd2[1];
        this.l = (1.0 - (double)(2.0f * ao2.c * ao2.c) - (double)(2.0f * ao2.b * ao2.b)) * arrd2[1];
        this.i = 2.0 * (double)(ao2.a * ao2.b + ao2.d * ao2.c) * arrd2[1];
        this.m = 2.0 * (double)(ao2.c * ao2.b + ao2.d * ao2.a) * arrd2[2];
        this.g = 2.0 * (double)(ao2.a * ao2.b - ao2.d * ao2.c) * arrd2[2];
        this.h = (1.0 - (double)(2.0f * ao2.c * ao2.c) - (double)(2.0f * ao2.a * ao2.a)) * arrd2[2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final double a(int var1_1, int var2_2) {
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
                        return this.o;
                    }
                    case 1: {
                        return this.f;
                    }
                    case 2: {
                        return this.m;
                    }
                    case 3: {
                        return this.p;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d1"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        return this.b;
                    }
                    case 1: {
                        return this.l;
                    }
                    case 2: {
                        return this.g;
                    }
                    case 3: {
                        return this.q;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d1"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        return this.k;
                    }
                    case 1: {
                        return this.i;
                    }
                    case 2: {
                        return this.h;
                    }
                    case 3: {
                        return this.e;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d1"));
            }
            case 3: {
                switch (var2_2) {
                    case 0: {
                        return this.a;
                    }
                    case 1: {
                        return this.j;
                    }
                    case 2: {
                        return this.n;
                    }
                    case 3: {
                        return this.d;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d1"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d1"));
    }

    public final void a(p p2) {
        double d10 = this.o * p2.c + this.f * p2.b + this.m * p2.a + this.p;
        double d11 = this.b * p2.c + this.l * p2.b + this.g * p2.a + this.q;
        p2.a = this.k * p2.c + this.i * p2.b + this.h * p2.a + this.e;
        p2.c = d10;
        p2.b = d11;
    }

    public final void d(int n2, double[] arrd) {
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
                                        arrd[0] = this.o;
                                        arrd[1] = this.b;
                                        arrd[2] = this.k;
                                        arrd[3] = this.a;
                                        if (n5 == 0) break block4;
                                    }
                                    n4 = n2;
                                }
                                n3 = 1;
                                if (n5 != 0) break block5;
                                if (n4 != n3) break block6;
                                arrd[0] = this.f;
                                arrd[1] = this.l;
                                arrd[2] = this.i;
                                arrd[3] = this.j;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                            n3 = 2;
                        }
                        if (n5 != 0) break block7;
                        if (n4 != n3) break block8;
                        arrd[0] = this.m;
                        arrd[1] = this.g;
                        arrd[2] = this.h;
                        arrd[3] = this.n;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 3;
                }
                if (n4 != n3) break block9;
                arrd[0] = this.p;
                arrd[1] = this.q;
                arrd[2] = this.e;
                arrd[3] = this.d;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix4d3"));
        }
    }

    public final void a(q q2) {
        q2.c = this.p;
        q2.b = this.q;
        q2.a = this.e;
    }

    public final void d(dA dA2, dA dA3) {
        block4: {
            dA dA4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA2) break block3;
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA3) break block3;
                    this.o = dA2.o * dA3.o + dA2.f * dA3.f + dA2.m * dA3.m + dA2.p * dA3.p;
                    this.f = dA2.o * dA3.b + dA2.f * dA3.l + dA2.m * dA3.g + dA2.p * dA3.q;
                    this.m = dA2.o * dA3.k + dA2.f * dA3.i + dA2.m * dA3.h + dA2.p * dA3.e;
                    this.p = dA2.o * dA3.a + dA2.f * dA3.j + dA2.m * dA3.n + dA2.p * dA3.d;
                    this.b = dA2.b * dA3.o + dA2.l * dA3.f + dA2.g * dA3.m + dA2.q * dA3.p;
                    this.l = dA2.b * dA3.b + dA2.l * dA3.l + dA2.g * dA3.g + dA2.q * dA3.q;
                    this.g = dA2.b * dA3.k + dA2.l * dA3.i + dA2.g * dA3.h + dA2.q * dA3.e;
                    this.q = dA2.b * dA3.a + dA2.l * dA3.j + dA2.g * dA3.n + dA2.q * dA3.d;
                    this.k = dA2.k * dA3.o + dA2.i * dA3.f + dA2.h * dA3.m + dA2.e * dA3.p;
                    this.i = dA2.k * dA3.b + dA2.i * dA3.l + dA2.h * dA3.g + dA2.e * dA3.q;
                    this.h = dA2.k * dA3.k + dA2.i * dA3.i + dA2.h * dA3.h + dA2.e * dA3.e;
                    this.e = dA2.k * dA3.a + dA2.i * dA3.j + dA2.h * dA3.n + dA2.e * dA3.d;
                    this.a = dA2.a * dA3.o + dA2.j * dA3.f + dA2.n * dA3.m + dA2.d * dA3.p;
                    this.j = dA2.a * dA3.b + dA2.j * dA3.l + dA2.n * dA3.g + dA2.d * dA3.q;
                    this.n = dA2.a * dA3.k + dA2.j * dA3.i + dA2.n * dA3.h + dA2.d * dA3.e;
                    this.d = dA2.a * dA3.a + dA2.j * dA3.j + dA2.n * dA3.n + dA2.d * dA3.d;
                    if (n2 != 0) break block4;
                }
                dA4 = dA2;
            }
            double d10 = dA4.o * dA3.o + dA2.f * dA3.f + dA2.m * dA3.m + dA2.p * dA3.p;
            double d11 = dA2.o * dA3.b + dA2.f * dA3.l + dA2.m * dA3.g + dA2.p * dA3.q;
            double d12 = dA2.o * dA3.k + dA2.f * dA3.i + dA2.m * dA3.h + dA2.p * dA3.e;
            double d13 = dA2.o * dA3.a + dA2.f * dA3.j + dA2.m * dA3.n + dA2.p * dA3.d;
            double d14 = dA2.b * dA3.o + dA2.l * dA3.f + dA2.g * dA3.m + dA2.q * dA3.p;
            double d15 = dA2.b * dA3.b + dA2.l * dA3.l + dA2.g * dA3.g + dA2.q * dA3.q;
            double d16 = dA2.b * dA3.k + dA2.l * dA3.i + dA2.g * dA3.h + dA2.q * dA3.e;
            double d17 = dA2.b * dA3.a + dA2.l * dA3.j + dA2.g * dA3.n + dA2.q * dA3.d;
            double d18 = dA2.k * dA3.o + dA2.i * dA3.f + dA2.h * dA3.m + dA2.e * dA3.p;
            double d19 = dA2.k * dA3.b + dA2.i * dA3.l + dA2.h * dA3.g + dA2.e * dA3.q;
            double d20 = dA2.k * dA3.k + dA2.i * dA3.i + dA2.h * dA3.h + dA2.e * dA3.e;
            double d21 = dA2.k * dA3.a + dA2.i * dA3.j + dA2.h * dA3.n + dA2.e * dA3.d;
            double d22 = dA2.a * dA3.o + dA2.j * dA3.f + dA2.n * dA3.m + dA2.d * dA3.p;
            double d23 = dA2.a * dA3.b + dA2.j * dA3.l + dA2.n * dA3.g + dA2.d * dA3.q;
            double d24 = dA2.a * dA3.k + dA2.j * dA3.i + dA2.n * dA3.h + dA2.d * dA3.e;
            double d25 = dA2.a * dA3.a + dA2.j * dA3.j + dA2.n * dA3.n + dA2.d * dA3.d;
            this.o = d10;
            this.f = d11;
            this.m = d12;
            this.p = d13;
            this.b = d14;
            this.l = d15;
            this.g = d16;
            this.q = d17;
            this.k = d18;
            this.i = d19;
            this.h = d20;
            this.e = d21;
            this.a = d22;
            this.j = d23;
            this.n = d24;
            this.d = d25;
        }
    }

    public final void a(X x2, X x3) {
        float f10 = (float)(this.o * (double)x2.c + this.f * (double)x2.a + this.m * (double)x2.b + this.p);
        float f11 = (float)(this.b * (double)x2.c + this.l * (double)x2.a + this.g * (double)x2.b + this.q);
        x3.b = (float)(this.k * (double)x2.c + this.i * (double)x2.a + this.h * (double)x2.b + this.e);
        x3.c = f10;
        x3.a = f11;
    }

    public final double c() {
        return this.q;
    }

    public dA(dA dA2) {
        this.o = dA2.o;
        this.f = dA2.f;
        this.m = dA2.m;
        this.p = dA2.p;
        this.b = dA2.b;
        this.l = dA2.l;
        this.g = dA2.g;
        this.q = dA2.q;
        this.k = dA2.k;
        this.i = dA2.i;
        this.h = dA2.h;
        this.e = dA2.e;
        this.a = dA2.a;
        this.j = dA2.j;
        this.n = dA2.n;
        this.d = dA2.d;
    }

    public final void i(double d10) {
        this.d = d10;
    }

    public final void e(dA dA2, dA dA3) {
        block4: {
            dA dA4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    dA4 = this;
                    if (n2 != 0) break block2;
                    if (dA4 == dA2) break block3;
                    dA4 = this;
                    if (n2 != 0) break block2;
                    if (dA4 == dA3) break block3;
                    this.o = dA2.o * dA3.o + dA2.f * dA3.b + dA2.m * dA3.k + dA2.p * dA3.a;
                    this.f = dA2.o * dA3.f + dA2.f * dA3.l + dA2.m * dA3.i + dA2.p * dA3.j;
                    this.m = dA2.o * dA3.m + dA2.f * dA3.g + dA2.m * dA3.h + dA2.p * dA3.n;
                    this.p = dA2.o * dA3.p + dA2.f * dA3.q + dA2.m * dA3.e + dA2.p * dA3.d;
                    this.b = dA2.b * dA3.o + dA2.l * dA3.b + dA2.g * dA3.k + dA2.q * dA3.a;
                    this.l = dA2.b * dA3.f + dA2.l * dA3.l + dA2.g * dA3.i + dA2.q * dA3.j;
                    this.g = dA2.b * dA3.m + dA2.l * dA3.g + dA2.g * dA3.h + dA2.q * dA3.n;
                    this.q = dA2.b * dA3.p + dA2.l * dA3.q + dA2.g * dA3.e + dA2.q * dA3.d;
                    this.k = dA2.k * dA3.o + dA2.i * dA3.b + dA2.h * dA3.k + dA2.e * dA3.a;
                    this.i = dA2.k * dA3.f + dA2.i * dA3.l + dA2.h * dA3.i + dA2.e * dA3.j;
                    this.h = dA2.k * dA3.m + dA2.i * dA3.g + dA2.h * dA3.h + dA2.e * dA3.n;
                    this.e = dA2.k * dA3.p + dA2.i * dA3.q + dA2.h * dA3.e + dA2.e * dA3.d;
                    this.a = dA2.a * dA3.o + dA2.j * dA3.b + dA2.n * dA3.k + dA2.d * dA3.a;
                    this.j = dA2.a * dA3.f + dA2.j * dA3.l + dA2.n * dA3.i + dA2.d * dA3.j;
                    this.n = dA2.a * dA3.m + dA2.j * dA3.g + dA2.n * dA3.h + dA2.d * dA3.n;
                    this.d = dA2.a * dA3.p + dA2.j * dA3.q + dA2.n * dA3.e + dA2.d * dA3.d;
                    if (n2 == 0) break block4;
                }
                dA4 = dA2;
            }
            double d10 = dA4.o * dA3.o + dA2.f * dA3.b + dA2.m * dA3.k + dA2.p * dA3.a;
            double d11 = dA2.o * dA3.f + dA2.f * dA3.l + dA2.m * dA3.i + dA2.p * dA3.j;
            double d12 = dA2.o * dA3.m + dA2.f * dA3.g + dA2.m * dA3.h + dA2.p * dA3.n;
            double d13 = dA2.o * dA3.p + dA2.f * dA3.q + dA2.m * dA3.e + dA2.p * dA3.d;
            double d14 = dA2.b * dA3.o + dA2.l * dA3.b + dA2.g * dA3.k + dA2.q * dA3.a;
            double d15 = dA2.b * dA3.f + dA2.l * dA3.l + dA2.g * dA3.i + dA2.q * dA3.j;
            double d16 = dA2.b * dA3.m + dA2.l * dA3.g + dA2.g * dA3.h + dA2.q * dA3.n;
            double d17 = dA2.b * dA3.p + dA2.l * dA3.q + dA2.g * dA3.e + dA2.q * dA3.d;
            double d18 = dA2.k * dA3.o + dA2.i * dA3.b + dA2.h * dA3.k + dA2.e * dA3.a;
            double d19 = dA2.k * dA3.f + dA2.i * dA3.l + dA2.h * dA3.i + dA2.e * dA3.j;
            double d20 = dA2.k * dA3.m + dA2.i * dA3.g + dA2.h * dA3.h + dA2.e * dA3.n;
            double d21 = dA2.k * dA3.p + dA2.i * dA3.q + dA2.h * dA3.e + dA2.e * dA3.d;
            double d22 = dA2.a * dA3.o + dA2.j * dA3.b + dA2.n * dA3.k + dA2.d * dA3.a;
            double d23 = dA2.a * dA3.f + dA2.j * dA3.l + dA2.n * dA3.i + dA2.d * dA3.j;
            double d24 = dA2.a * dA3.m + dA2.j * dA3.g + dA2.n * dA3.h + dA2.d * dA3.n;
            double d25 = dA2.a * dA3.p + dA2.j * dA3.q + dA2.n * dA3.e + dA2.d * dA3.d;
            this.o = d10;
            this.f = d11;
            this.m = d12;
            this.p = d13;
            this.b = d14;
            this.l = d15;
            this.g = d16;
            this.q = d17;
            this.k = d18;
            this.i = d19;
            this.h = d20;
            this.e = d21;
            this.a = d22;
            this.j = d23;
            this.n = d24;
            this.d = d25;
        }
    }

    public final void d(gY gY2) {
        this.o = gY2.h;
        this.f = gY2.j;
        this.m = gY2.i;
        this.b = gY2.f;
        this.l = gY2.d;
        this.g = gY2.c;
        this.k = gY2.g;
        this.i = gY2.b;
        this.h = gY2.e;
    }

    public final void c(dA dA2, dA dA3) {
        block4: {
            dA dA4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA2) break block3;
                    dA4 = this;
                    if (n2 == 0) break block2;
                    if (dA4 == dA3) break block3;
                    this.o = dA2.o * dA3.o + dA2.b * dA3.b + dA2.k * dA3.k + dA2.a * dA3.a;
                    this.f = dA2.o * dA3.f + dA2.b * dA3.l + dA2.k * dA3.i + dA2.a * dA3.j;
                    this.m = dA2.o * dA3.m + dA2.b * dA3.g + dA2.k * dA3.h + dA2.a * dA3.n;
                    this.p = dA2.o * dA3.p + dA2.b * dA3.q + dA2.k * dA3.e + dA2.a * dA3.d;
                    this.b = dA2.f * dA3.o + dA2.l * dA3.b + dA2.i * dA3.k + dA2.j * dA3.a;
                    this.l = dA2.f * dA3.f + dA2.l * dA3.l + dA2.i * dA3.i + dA2.j * dA3.j;
                    this.g = dA2.f * dA3.m + dA2.l * dA3.g + dA2.i * dA3.h + dA2.j * dA3.n;
                    this.q = dA2.f * dA3.p + dA2.l * dA3.q + dA2.i * dA3.e + dA2.j * dA3.d;
                    this.k = dA2.m * dA3.o + dA2.g * dA3.b + dA2.h * dA3.k + dA2.n * dA3.a;
                    this.i = dA2.m * dA3.f + dA2.g * dA3.l + dA2.h * dA3.i + dA2.n * dA3.j;
                    this.h = dA2.m * dA3.m + dA2.g * dA3.g + dA2.h * dA3.h + dA2.n * dA3.n;
                    this.e = dA2.m * dA3.p + dA2.g * dA3.q + dA2.h * dA3.e + dA2.n * dA3.d;
                    this.a = dA2.p * dA3.o + dA2.q * dA3.b + dA2.e * dA3.k + dA2.d * dA3.a;
                    this.j = dA2.p * dA3.f + dA2.q * dA3.l + dA2.e * dA3.i + dA2.d * dA3.j;
                    this.n = dA2.p * dA3.m + dA2.q * dA3.g + dA2.e * dA3.h + dA2.d * dA3.n;
                    this.d = dA2.p * dA3.p + dA2.q * dA3.q + dA2.e * dA3.e + dA2.d * dA3.d;
                    if (n2 != 0) break block4;
                }
                dA4 = dA2;
            }
            double d10 = dA4.o * dA3.o + dA2.b * dA3.b + dA2.k * dA3.k + dA2.a * dA3.a;
            double d11 = dA2.o * dA3.f + dA2.b * dA3.l + dA2.k * dA3.i + dA2.a * dA3.j;
            double d12 = dA2.o * dA3.m + dA2.b * dA3.g + dA2.k * dA3.h + dA2.a * dA3.n;
            double d13 = dA2.o * dA3.p + dA2.b * dA3.q + dA2.k * dA3.e + dA2.a * dA3.d;
            double d14 = dA2.f * dA3.o + dA2.l * dA3.b + dA2.i * dA3.k + dA2.j * dA3.a;
            double d15 = dA2.f * dA3.f + dA2.l * dA3.l + dA2.i * dA3.i + dA2.j * dA3.j;
            double d16 = dA2.f * dA3.m + dA2.l * dA3.g + dA2.i * dA3.h + dA2.j * dA3.n;
            double d17 = dA2.f * dA3.p + dA2.l * dA3.q + dA2.i * dA3.e + dA2.j * dA3.d;
            double d18 = dA2.m * dA3.o + dA2.g * dA3.b + dA2.h * dA3.k + dA2.n * dA3.a;
            double d19 = dA2.m * dA3.f + dA2.g * dA3.l + dA2.h * dA3.i + dA2.n * dA3.j;
            double d20 = dA2.m * dA3.m + dA2.g * dA3.g + dA2.h * dA3.h + dA2.n * dA3.n;
            double d21 = dA2.m * dA3.p + dA2.g * dA3.q + dA2.h * dA3.e + dA2.n * dA3.d;
            double d22 = dA2.p * dA3.o + dA2.q * dA3.b + dA2.e * dA3.k + dA2.d * dA3.a;
            double d23 = dA2.p * dA3.f + dA2.q * dA3.l + dA2.e * dA3.i + dA2.d * dA3.j;
            double d24 = dA2.p * dA3.m + dA2.q * dA3.g + dA2.e * dA3.h + dA2.d * dA3.n;
            double d25 = dA2.p * dA3.p + dA2.q * dA3.q + dA2.e * dA3.e + dA2.d * dA3.d;
            this.o = d10;
            this.f = d11;
            this.m = d12;
            this.p = d13;
            this.b = d14;
            this.l = d15;
            this.g = d16;
            this.q = d17;
            this.k = d18;
            this.i = d19;
            this.h = d20;
            this.e = d21;
            this.a = d22;
            this.j = d23;
            this.n = d24;
            this.d = d25;
        }
    }

    public final void l(double d10) {
        this.a = d10;
    }

    public final void a(double d10) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.o = arrd[0] * d10;
        this.f = arrd[1] * d10;
        this.m = arrd[2] * d10;
        this.b = arrd[3] * d10;
        this.l = arrd[4] * d10;
        this.g = arrd[5] * d10;
        this.k = arrd[6] * d10;
        this.i = arrd[7] * d10;
        this.h = arrd[8] * d10;
    }

    public final void a(au au2) {
        float f10 = (float)(this.o * (double)au2.c + this.f * (double)au2.a + this.m * (double)au2.b);
        float f11 = (float)(this.b * (double)au2.c + this.l * (double)au2.a + this.g * (double)au2.b);
        au2.b = (float)(this.k * (double)au2.c + this.i * (double)au2.a + this.h * (double)au2.b);
        au2.c = f10;
        au2.a = f11;
    }

    public final double n() {
        return this.j;
    }

    public final void h(double d10) {
        this.q = d10;
    }

    public final void a(double d10, dA dA2) {
        this.o = dA2.o + d10;
        this.f = dA2.f + d10;
        this.m = dA2.m + d10;
        this.p = dA2.p + d10;
        this.b = dA2.b + d10;
        this.l = dA2.l + d10;
        this.g = dA2.g + d10;
        this.q = dA2.q + d10;
        this.k = dA2.k + d10;
        this.i = dA2.i + d10;
        this.h = dA2.h + d10;
        this.e = dA2.e + d10;
        this.a = dA2.a + d10;
        this.j = dA2.j + d10;
        this.n = dA2.n + d10;
        this.d = dA2.d + d10;
    }

    public final void a(dc dc2, au au2, float f10) {
        this.o = dc2.j * f10;
        this.f = dc2.d * f10;
        this.m = dc2.a * f10;
        this.p = au2.c;
        this.b = dc2.c * f10;
        this.l = dc2.g * f10;
        this.g = dc2.h * f10;
        this.q = au2.a;
        this.k = dc2.f * f10;
        this.i = dc2.e * f10;
        this.h = dc2.i * f10;
        this.e = au2.b;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }

    public final void a(double[] arrd) {
        this.o = arrd[0];
        this.f = arrd[1];
        this.m = arrd[2];
        this.p = arrd[3];
        this.b = arrd[4];
        this.l = arrd[5];
        this.g = arrd[6];
        this.q = arrd[7];
        this.k = arrd[8];
        this.i = arrd[9];
        this.h = arrd[10];
        this.e = arrd[11];
        this.a = arrd[12];
        this.j = arrd[13];
        this.n = arrd[14];
        this.d = arrd[15];
    }

    public final double e() {
        return this.b;
    }

    public final void f(dA dA2, dA dA3) {
        this.o = dA2.o - dA3.o;
        this.f = dA2.f - dA3.f;
        this.m = dA2.m - dA3.m;
        this.p = dA2.p - dA3.p;
        this.b = dA2.b - dA3.b;
        this.l = dA2.l - dA3.l;
        this.g = dA2.g - dA3.g;
        this.q = dA2.q - dA3.q;
        this.k = dA2.k - dA3.k;
        this.i = dA2.i - dA3.i;
        this.h = dA2.h - dA3.h;
        this.e = dA2.e - dA3.e;
        this.a = dA2.a - dA3.a;
        this.j = dA2.j - dA3.j;
        this.n = dA2.n - dA3.n;
        this.d = dA2.d - dA3.d;
    }

    public String toString() {
        return this.o + ", " + this.f + ", " + this.m + ", " + this.p + "\n" + this.b + ", " + this.l + ", " + this.g + ", " + this.q + "\n" + this.k + ", " + this.i + ", " + this.h + ", " + this.e + "\n" + this.a + ", " + this.j + ", " + this.n + ", " + this.d + "\n";
    }

    public final void a(ae ae2) {
        float f10 = (float)(this.o * (double)ae2.c + this.f * (double)ae2.a + this.m * (double)ae2.b + this.p * (double)ae2.d);
        float f11 = (float)(this.b * (double)ae2.c + this.l * (double)ae2.a + this.g * (double)ae2.b + this.q * (double)ae2.d);
        float f12 = (float)(this.k * (double)ae2.c + this.i * (double)ae2.a + this.h * (double)ae2.b + this.e * (double)ae2.d);
        ae2.d = (float)(this.a * (double)ae2.c + this.j * (double)ae2.a + this.n * (double)ae2.b + this.d * (double)ae2.d);
        ae2.c = f10;
        ae2.a = f11;
        ae2.b = f12;
    }

    public final void d(dc dc2) {
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

    public final double h() {
        return this.f;
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
                        n2 = ae.f();
                        double[] arrd2 = new double[3];
                        this.a(arrd2, arrd);
                        double d17 = d11 = 0.25 * (1.0 + arrd[0] + arrd[4] + arrd[8]);
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

    public final void q(double d10) {
        this.e = d10;
    }

    public final void a(dc dc2) {
        this.o = dc2.j;
        this.f = dc2.d;
        this.m = dc2.a;
        this.b = dc2.c;
        this.l = dc2.g;
        this.g = dc2.h;
        this.k = dc2.f;
        this.i = dc2.e;
        this.h = dc2.i;
    }

    public final void b(q q2) {
        double d10 = this.o * q2.c + this.f * q2.b + this.m * q2.a;
        double d11 = this.b * q2.c + this.l * q2.b + this.g * q2.a;
        q2.a = this.k * q2.c + this.i * q2.b + this.h * q2.a;
        q2.c = d10;
        q2.b = d11;
    }

    public final void u(double d10) {
        this.o = d10;
        this.f = 0.0;
        this.m = 0.0;
        this.p = 0.0;
        this.b = 0.0;
        this.l = d10;
        this.g = 0.0;
        this.q = 0.0;
        this.k = 0.0;
        this.i = 0.0;
        this.h = d10;
        this.e = 0.0;
        this.a = 0.0;
        this.j = 0.0;
        this.n = 0.0;
        this.d = 1.0;
    }
}

