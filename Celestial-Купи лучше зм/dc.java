/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class dc
implements Serializable,
Cloneable {
    public /* synthetic */ float c;
    public /* synthetic */ float i;
    public /* synthetic */ float g;
    public /* synthetic */ float d;
    public /* synthetic */ float j;
    public /* synthetic */ float a;
    public /* synthetic */ float e;
    static final /* synthetic */ long serialVersionUID = 329697160112089834L;
    public /* synthetic */ float h;
    private static final /* synthetic */ double b = 1.0E-8;
    public /* synthetic */ float f;

    public final void a(dc dc2, dc dc3) {
        this.j = dc2.j + dc3.j;
        this.d = dc2.d + dc3.d;
        this.a = dc2.a + dc3.a;
        this.c = dc2.c + dc3.c;
        this.g = dc2.g + dc3.g;
        this.h = dc2.h + dc3.h;
        this.f = dc2.f + dc3.f;
        this.e = dc2.e + dc3.e;
        this.i = dc2.i + dc3.i;
    }

    public final void a(int n2, au au2) {
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
                                au2.c = this.j;
                                au2.a = this.c;
                                au2.b = this.f;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 != 0) break block5;
                        if (n4 != n3) break block6;
                        au2.c = this.d;
                        au2.a = this.g;
                        au2.b = this.e;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                au2.c = this.a;
                au2.a = this.h;
                au2.b = this.i;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f3"));
        }
    }

    public final void e(dc dc2, dc dc3) {
        block4: {
            dc dc4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc2) break block3;
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc3) break block3;
                    this.j = dc2.j * dc3.j + dc2.d * dc3.d + dc2.a * dc3.a;
                    this.d = dc2.j * dc3.c + dc2.d * dc3.g + dc2.a * dc3.h;
                    this.a = dc2.j * dc3.f + dc2.d * dc3.e + dc2.a * dc3.i;
                    this.c = dc2.c * dc3.j + dc2.g * dc3.d + dc2.h * dc3.a;
                    this.g = dc2.c * dc3.c + dc2.g * dc3.g + dc2.h * dc3.h;
                    this.h = dc2.c * dc3.f + dc2.g * dc3.e + dc2.h * dc3.i;
                    this.f = dc2.f * dc3.j + dc2.e * dc3.d + dc2.i * dc3.a;
                    this.e = dc2.f * dc3.c + dc2.e * dc3.g + dc2.i * dc3.h;
                    this.i = dc2.f * dc3.f + dc2.e * dc3.e + dc2.i * dc3.i;
                    if (n2 == 0) break block4;
                }
                dc4 = dc2;
            }
            float f10 = dc4.j * dc3.j + dc2.d * dc3.d + dc2.a * dc3.a;
            float f11 = dc2.j * dc3.c + dc2.d * dc3.g + dc2.a * dc3.h;
            float f12 = dc2.j * dc3.f + dc2.d * dc3.e + dc2.a * dc3.i;
            float f13 = dc2.c * dc3.j + dc2.g * dc3.d + dc2.h * dc3.a;
            float f14 = dc2.c * dc3.c + dc2.g * dc3.g + dc2.h * dc3.h;
            float f15 = dc2.c * dc3.f + dc2.g * dc3.e + dc2.h * dc3.i;
            float f16 = dc2.f * dc3.j + dc2.e * dc3.d + dc2.i * dc3.a;
            float f17 = dc2.f * dc3.c + dc2.e * dc3.g + dc2.i * dc3.h;
            float f18 = dc2.f * dc3.f + dc2.e * dc3.e + dc2.i * dc3.i;
            this.j = f10;
            this.d = f11;
            this.a = f12;
            this.c = f13;
            this.g = f14;
            this.h = f15;
            this.f = f16;
            this.e = f17;
            this.i = f18;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(int var1_1, au var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2.c;
                this.c = var2_2.a;
                this.f = var2_2.b;
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.d = var2_2.c;
                this.g = var2_2.a;
                this.e = var2_2.b;
                if (var3_3 != 0) return;
            }
            case 2: {
                this.a = var2_2.c;
                this.h = var2_2.a;
                this.i = var2_2.b;
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f9"));
    }

    public dc(dc dc2) {
        this.j = dc2.j;
        this.d = dc2.d;
        this.a = dc2.a;
        this.c = dc2.c;
        this.g = dc2.g;
        this.h = dc2.h;
        this.f = dc2.f;
        this.e = dc2.e;
        this.i = dc2.i;
    }

    public final void h(dc dc2) {
        this.j -= dc2.j;
        this.d -= dc2.d;
        this.a -= dc2.a;
        this.c -= dc2.c;
        this.g -= dc2.g;
        this.h -= dc2.h;
        this.f -= dc2.f;
        this.e -= dc2.e;
        this.i -= dc2.i;
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
                                        var3_3 = (dc)var1_1;
                                        cfr_temp_0 = this.j - var3_3.j;
                                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                        if (var2_2 != 0) break block27;
                                        if (v0 != false) ** GOTO lbl65
                                        cfr_temp_1 = this.d - var3_3.d;
                                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                    }
                                    if (var2_2 != 0) break block20;
                                    if (v0 != false) ** GOTO lbl65
                                    cfr_temp_2 = this.a - var3_3.a;
                                    v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                }
                                if (var2_2 != 0) break block21;
                                if (v0 != false) ** GOTO lbl65
                                cfr_temp_3 = this.c - var3_3.c;
                                v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                            }
                            if (var2_2 != 0) break block22;
                            if (v0 != false) ** GOTO lbl65
                            cfr_temp_4 = this.g - var3_3.g;
                            v0 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                        }
                        if (var2_2 != 0) break block23;
                        if (v0 != false) ** GOTO lbl65
                        cfr_temp_5 = this.h - var3_3.h;
                        v0 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 != 0) break block24;
                    if (v0 != false) ** GOTO lbl65
                    cfr_temp_6 = this.f - var3_3.f;
                    v0 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                }
                if (var2_2 != 0) break block25;
                if (v0 != false) ** GOTO lbl65
                cfr_temp_7 = this.e - var3_3.e;
                v0 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) break block26;
            if (v0 != false) ** GOTO lbl65
            cfr_temp_8 = this.i - var3_3.i;
            v0 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl65
        try {
            v0 = (float)true;
            return (boolean)v0;
lbl65:
            // 9 sources

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

    public final float r() {
        return this.h;
    }

    public final void e(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.j = f11 = (float)Math.cos(f10);
        this.d = 0.0f;
        this.a = f12;
        this.c = 0.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f = -f12;
        this.e = 0.0f;
        this.i = f11;
    }

    public final float g() {
        return this.e;
    }

    public final void k(float f10) {
        this.c = f10;
    }

    public final void j(float f10) {
        this.a = f10;
    }

    public dc(float[] arrf) {
        this.j = arrf[0];
        this.d = arrf[1];
        this.a = arrf[2];
        this.c = arrf[3];
        this.g = arrf[4];
        this.h = arrf[5];
        this.f = arrf[6];
        this.e = arrf[7];
        this.i = arrf[8];
    }

    public final void a(float f10, dc dc2) {
        this.j = dc2.j + f10;
        this.d = dc2.d + f10;
        this.a = dc2.a + f10;
        this.c = dc2.c + f10;
        this.g = dc2.g + f10;
        this.h = dc2.h + f10;
        this.f = dc2.f + f10;
        this.e = dc2.e + f10;
        this.i = dc2.i + f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(int var1_1, float[] var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2[0];
                this.d = var2_2[1];
                this.a = var2_2[2];
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.c = var2_2[0];
                this.g = var2_2[1];
                this.h = var2_2[2];
                if (var3_3 != 0) return;
            }
            case 2: {
                this.f = var2_2[0];
                this.e = var2_2[1];
                this.i = var2_2[2];
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f6"));
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.j);
        l2 = gW.a(l2, this.d);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.g);
        l2 = gW.a(l2, this.h);
        l2 = gW.a(l2, this.f);
        l2 = gW.a(l2, this.e);
        l2 = gW.a(l2, this.i);
        return gW.a(l2);
    }

    public final void g(dc dc2, dc dc3) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = dc2.j * dc3.j + dc2.d * dc3.c + dc2.a * dc3.f;
        arrd[1] = dc2.j * dc3.d + dc2.d * dc3.g + dc2.a * dc3.e;
        arrd[2] = dc2.j * dc3.a + dc2.d * dc3.h + dc2.a * dc3.i;
        arrd[3] = dc2.c * dc3.j + dc2.g * dc3.c + dc2.h * dc3.f;
        arrd[4] = dc2.c * dc3.d + dc2.g * dc3.g + dc2.h * dc3.e;
        arrd[5] = dc2.c * dc3.a + dc2.g * dc3.h + dc2.h * dc3.i;
        arrd[6] = dc2.f * dc3.j + dc2.e * dc3.c + dc2.i * dc3.f;
        arrd[7] = dc2.f * dc3.d + dc2.e * dc3.g + dc2.i * dc3.e;
        arrd[8] = dc2.f * dc3.a + dc2.e * dc3.h + dc2.i * dc3.i;
        gY.b(arrd, arrd3, arrd2);
        this.j = (float)arrd2[0];
        this.d = (float)arrd2[1];
        this.a = (float)arrd2[2];
        this.c = (float)arrd2[3];
        this.g = (float)arrd2[4];
        this.h = (float)arrd2[5];
        this.f = (float)arrd2[6];
        this.e = (float)arrd2[7];
        this.i = (float)arrd2[8];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, au var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2.c;
                this.d = var2_2.a;
                this.a = var2_2.b;
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.c = var2_2.c;
                this.g = var2_2.a;
                this.h = var2_2.b;
                if (var3_3 != 0) return;
            }
            case 2: {
                this.f = var2_2.c;
                this.e = var2_2.a;
                this.i = var2_2.b;
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f6"));
    }

    public final void d(dc dc2, dc dc3) {
        block4: {
            dc dc4;
            block2: {
                block3: {
                    int n2 = ae.f();
                    dc4 = this;
                    if (n2 == 0) break block2;
                    if (dc4 == dc2) break block3;
                    dc4 = this;
                    if (n2 == 0) break block2;
                    if (dc4 == dc3) break block3;
                    this.j = dc2.j * dc3.j + dc2.d * dc3.c + dc2.a * dc3.f;
                    this.d = dc2.j * dc3.d + dc2.d * dc3.g + dc2.a * dc3.e;
                    this.a = dc2.j * dc3.a + dc2.d * dc3.h + dc2.a * dc3.i;
                    this.c = dc2.c * dc3.j + dc2.g * dc3.c + dc2.h * dc3.f;
                    this.g = dc2.c * dc3.d + dc2.g * dc3.g + dc2.h * dc3.e;
                    this.h = dc2.c * dc3.a + dc2.g * dc3.h + dc2.h * dc3.i;
                    this.f = dc2.f * dc3.j + dc2.e * dc3.c + dc2.i * dc3.f;
                    this.e = dc2.f * dc3.d + dc2.e * dc3.g + dc2.i * dc3.e;
                    this.i = dc2.f * dc3.a + dc2.e * dc3.h + dc2.i * dc3.i;
                    if (n2 != 0) break block4;
                }
                dc4 = dc2;
            }
            float f10 = dc4.j * dc3.j + dc2.d * dc3.c + dc2.a * dc3.f;
            float f11 = dc2.j * dc3.d + dc2.d * dc3.g + dc2.a * dc3.e;
            float f12 = dc2.j * dc3.a + dc2.d * dc3.h + dc2.a * dc3.i;
            float f13 = dc2.c * dc3.j + dc2.g * dc3.c + dc2.h * dc3.f;
            float f14 = dc2.c * dc3.d + dc2.g * dc3.g + dc2.h * dc3.e;
            float f15 = dc2.c * dc3.a + dc2.g * dc3.h + dc2.h * dc3.i;
            float f16 = dc2.f * dc3.j + dc2.e * dc3.c + dc2.i * dc3.f;
            float f17 = dc2.f * dc3.d + dc2.e * dc3.g + dc2.i * dc3.e;
            float f18 = dc2.f * dc3.a + dc2.e * dc3.h + dc2.i * dc3.i;
            this.j = f10;
            this.d = f11;
            this.a = f12;
            this.c = f13;
            this.g = f14;
            this.h = f15;
            this.f = f16;
            this.e = f17;
            this.i = f18;
        }
    }

    public final void k() {
        this.a(this);
    }

    public final void k(dc dc2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = this.j * dc2.j + this.d * dc2.c + this.a * dc2.f;
        arrd[1] = this.j * dc2.d + this.d * dc2.g + this.a * dc2.e;
        arrd[2] = this.j * dc2.a + this.d * dc2.h + this.a * dc2.i;
        arrd[3] = this.c * dc2.j + this.g * dc2.c + this.h * dc2.f;
        arrd[4] = this.c * dc2.d + this.g * dc2.g + this.h * dc2.e;
        arrd[5] = this.c * dc2.a + this.g * dc2.h + this.h * dc2.i;
        arrd[6] = this.f * dc2.j + this.e * dc2.c + this.i * dc2.f;
        arrd[7] = this.f * dc2.d + this.e * dc2.g + this.i * dc2.e;
        arrd[8] = this.f * dc2.a + this.e * dc2.h + this.i * dc2.i;
        gY.b(arrd, arrd3, arrd2);
        this.j = (float)arrd2[0];
        this.d = (float)arrd2[1];
        this.a = (float)arrd2[2];
        this.c = (float)arrd2[3];
        this.g = (float)arrd2[4];
        this.h = (float)arrd2[5];
        this.f = (float)arrd2[6];
        this.e = (float)arrd2[7];
        this.i = (float)arrd2[8];
    }

    public final void g(float f10) {
        float f11 = (float)Math.sin(f10);
        float f12 = (float)Math.cos(f10);
        this.j = 1.0f;
        this.d = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.g = f12;
        this.h = -f11;
        this.f = 0.0f;
        this.e = f11;
        this.i = f12;
    }

    void a(double[] arrd, double[] arrd2) {
        double[] arrd3 = new double[]{this.j, this.d, this.a, this.c, this.g, this.h, this.f, this.e, this.i};
        gY.b(arrd3, arrd, arrd2);
    }

    public final float c() {
        return this.g;
    }

    public final void c(dc dc2) {
        this.j = dc2.j;
        this.d = dc2.d;
        this.a = dc2.a;
        this.c = dc2.c;
        this.g = dc2.g;
        this.h = dc2.h;
        this.f = dc2.f;
        this.e = dc2.e;
        this.i = dc2.i;
    }

    public final void h(float f10) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.j = (float)(arrd[0] * (double)f10);
        this.d = (float)(arrd[1] * (double)f10);
        this.a = (float)(arrd[2] * (double)f10);
        this.c = (float)(arrd[3] * (double)f10);
        this.g = (float)(arrd[4] * (double)f10);
        this.h = (float)(arrd[5] * (double)f10);
        this.f = (float)(arrd[6] * (double)f10);
        this.e = (float)(arrd[7] * (double)f10);
        this.i = (float)(arrd[8] * (double)f10);
    }

    public final void h() {
        float f10 = this.c;
        this.c = this.d;
        this.d = f10;
        f10 = this.f;
        this.f = this.a;
        this.a = f10;
        f10 = this.e;
        this.e = this.h;
        this.h = f10;
    }

    public final void d(float f10) {
        this.h = f10;
    }

    public final void i(float f10) {
        this.e = f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c(int var1_1, float[] var2_2) {
        var3_3 = ae.f();
        if (var3_3 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2[0];
                this.c = var2_2[1];
                this.f = var2_2[2];
lbl8:
                // 2 sources

                if (var3_3 != 0) return;
            }
            case 1: {
                this.d = var2_2[0];
                this.g = var2_2[1];
                this.e = var2_2[2];
                if (var3_3 != 0) return;
            }
            case 2: {
                this.a = var2_2[0];
                this.h = var2_2[1];
                this.i = var2_2[2];
                if (var3_3 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f9"));
    }

    public final void f(dc dc2, dc dc3) {
        block4: {
            dc dc4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc2) break block3;
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc3) break block3;
                    this.j = dc2.j * dc3.j + dc2.c * dc3.d + dc2.f * dc3.a;
                    this.d = dc2.j * dc3.c + dc2.c * dc3.g + dc2.f * dc3.h;
                    this.a = dc2.j * dc3.f + dc2.c * dc3.e + dc2.f * dc3.i;
                    this.c = dc2.d * dc3.j + dc2.g * dc3.d + dc2.e * dc3.a;
                    this.g = dc2.d * dc3.c + dc2.g * dc3.g + dc2.e * dc3.h;
                    this.h = dc2.d * dc3.f + dc2.g * dc3.e + dc2.e * dc3.i;
                    this.f = dc2.a * dc3.j + dc2.h * dc3.d + dc2.i * dc3.a;
                    this.e = dc2.a * dc3.c + dc2.h * dc3.g + dc2.i * dc3.h;
                    this.i = dc2.a * dc3.f + dc2.h * dc3.e + dc2.i * dc3.i;
                    if (n2 == 0) break block4;
                }
                dc4 = dc2;
            }
            float f10 = dc4.j * dc3.j + dc2.c * dc3.d + dc2.f * dc3.a;
            float f11 = dc2.j * dc3.c + dc2.c * dc3.g + dc2.f * dc3.h;
            float f12 = dc2.j * dc3.f + dc2.c * dc3.e + dc2.f * dc3.i;
            float f13 = dc2.d * dc3.j + dc2.g * dc3.d + dc2.e * dc3.a;
            float f14 = dc2.d * dc3.c + dc2.g * dc3.g + dc2.e * dc3.h;
            float f15 = dc2.d * dc3.f + dc2.g * dc3.e + dc2.e * dc3.i;
            float f16 = dc2.a * dc3.j + dc2.h * dc3.d + dc2.i * dc3.a;
            float f17 = dc2.a * dc3.c + dc2.h * dc3.g + dc2.i * dc3.h;
            float f18 = dc2.a * dc3.f + dc2.h * dc3.e + dc2.i * dc3.i;
            this.j = f10;
            this.d = f11;
            this.a = f12;
            this.c = f13;
            this.g = f14;
            this.h = f15;
            this.f = f16;
            this.e = f17;
            this.i = f18;
        }
    }

    public final void c(float f10) {
        this.g = f10;
    }

    public final void g(dc dc2) {
        this.j += dc2.j;
        this.d += dc2.d;
        this.a += dc2.a;
        this.c += dc2.c;
        this.g += dc2.g;
        this.h += dc2.h;
        this.f += dc2.f;
        this.e += dc2.e;
        this.i += dc2.i;
    }

    public final void a(gY gY2) {
        this.j = (float)gY2.h;
        this.d = (float)gY2.j;
        this.a = (float)gY2.i;
        this.c = (float)gY2.f;
        this.g = (float)gY2.d;
        this.h = (float)gY2.c;
        this.f = (float)gY2.g;
        this.e = (float)gY2.b;
        this.i = (float)gY2.e;
    }

    public final float j() {
        return this.c;
    }

    public final float b() {
        return this.f;
    }

    public final void a(eG eG2) {
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
                    this.j = 1.0f;
                    this.d = 0.0f;
                    this.a = 0.0f;
                    this.c = 0.0f;
                    this.g = 1.0f;
                    this.h = 0.0f;
                    this.f = 0.0f;
                    this.e = 0.0f;
                    this.i = 1.0f;
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
            this.j = f17 * f12 * f12 + f16;
            this.d = f17 * f19 - f15 * f14;
            this.a = f17 * f18 + f15 * f13;
            this.c = f17 * f19 + f15 * f14;
            this.g = f17 * f13 * f13 + f16;
            this.h = f17 * f20 - f15 * f12;
            this.f = f17 * f18 - f15 * f13;
            this.e = f17 * f20 + f15 * f12;
            this.i = f17 * f14 * f14 + f16;
        }
    }

    public final void a(U u2) {
        float f10 = this.j * u2.c + this.d * u2.a + this.a * u2.b;
        float f11 = this.c * u2.c + this.g * u2.a + this.h * u2.b;
        float f12 = this.f * u2.c + this.e * u2.a + this.i * u2.b;
        u2.a(f10, f11, f12);
    }

    public dc(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.j = f10;
        this.d = f11;
        this.a = f12;
        this.c = f13;
        this.g = f14;
        this.h = f15;
        this.f = f16;
        this.e = f17;
        this.i = f18;
    }

    public final void m(float f10) {
        this.i = f10;
    }

    public final float l() {
        return this.i;
    }

    public final void f() {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        this.j = (float)arrd[0];
        this.d = (float)arrd[1];
        this.a = (float)arrd[2];
        this.c = (float)arrd[3];
        this.g = (float)arrd[4];
        this.h = (float)arrd[5];
        this.f = (float)arrd[6];
        this.e = (float)arrd[7];
        this.i = (float)arrd[8];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, int var2_2, float var3_3) {
        var4_4 = ae.f();
        v0 = var1_1;
        if (var4_4 == 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = var2_2;
lbl7:
                // 2 sources

                switch (v0) {
                    case 0: {
                        this.j = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 1: {
                        this.d = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 2: {
                        this.a = var3_3;
                        if (var4_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f0"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        this.c = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 1: {
                        this.g = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 2: {
                        this.h = var3_3;
                        if (var4_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f0"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        this.f = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 1: {
                        this.e = var3_3;
                        if (var4_4 != 0) return;
                    }
                    case 2: {
                        this.i = var3_3;
                        if (var4_4 != 0) return;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f0"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f0"));
    }

    public final void a(ao ao2) {
        this.j = 1.0f - 2.0f * ao2.a * ao2.a - 2.0f * ao2.b * ao2.b;
        this.c = 2.0f * (ao2.c * ao2.a + ao2.d * ao2.b);
        this.f = 2.0f * (ao2.c * ao2.b - ao2.d * ao2.a);
        this.d = 2.0f * (ao2.c * ao2.a - ao2.d * ao2.b);
        this.g = 1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.b * ao2.b;
        this.e = 2.0f * (ao2.a * ao2.b + ao2.d * ao2.c);
        this.a = 2.0f * (ao2.c * ao2.b + ao2.d * ao2.a);
        this.h = 2.0f * (ao2.a * ao2.b - ao2.d * ao2.c);
        this.i = 1.0f - 2.0f * ao2.c * ao2.c - 2.0f * ao2.a * ao2.a;
    }

    public dc(gY gY2) {
        this.j = (float)gY2.h;
        this.d = (float)gY2.j;
        this.a = (float)gY2.i;
        this.c = (float)gY2.f;
        this.g = (float)gY2.d;
        this.h = (float)gY2.c;
        this.f = (float)gY2.g;
        this.e = (float)gY2.b;
        this.i = (float)gY2.e;
    }

    public Object clone() {
        dc dc2 = null;
        try {
            dc2 = (dc)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        return dc2;
    }

    public final void o(float f10) {
        this.j = f10;
        this.d = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.g = f10;
        this.h = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = f10;
    }

    public final void e(dc dc2) {
        block4: {
            dc dc3;
            block2: {
                block3: {
                    int n2 = ae.g();
                    dc3 = this;
                    if (n2 != 0) break block2;
                    if (dc3 == dc2) break block3;
                    this.j = dc2.j;
                    this.d = dc2.c;
                    this.a = dc2.f;
                    this.c = dc2.d;
                    this.g = dc2.g;
                    this.h = dc2.e;
                    this.f = dc2.a;
                    this.e = dc2.h;
                    this.i = dc2.i;
                    if (n2 == 0) break block4;
                }
                dc3 = this;
            }
            dc3.h();
        }
    }

    public final void c(dc dc2, dc dc3) {
        this.j = dc2.j - dc3.j;
        this.d = dc2.d - dc3.d;
        this.a = dc2.a - dc3.a;
        this.c = dc2.c - dc3.c;
        this.g = dc2.g - dc3.g;
        this.h = dc2.h - dc3.h;
        this.f = dc2.f - dc3.f;
        this.e = dc2.e - dc3.e;
        this.i = dc2.i - dc3.i;
    }

    public final void b(dc dc2, dc dc3) {
        block4: {
            dc dc4;
            block2: {
                block3: {
                    int n2 = ae.g();
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc2) break block3;
                    dc4 = this;
                    if (n2 != 0) break block2;
                    if (dc4 == dc3) break block3;
                    this.j = dc2.j * dc3.j + dc2.c * dc3.c + dc2.f * dc3.f;
                    this.d = dc2.j * dc3.d + dc2.c * dc3.g + dc2.f * dc3.e;
                    this.a = dc2.j * dc3.a + dc2.c * dc3.h + dc2.f * dc3.i;
                    this.c = dc2.d * dc3.j + dc2.g * dc3.c + dc2.e * dc3.f;
                    this.g = dc2.d * dc3.d + dc2.g * dc3.g + dc2.e * dc3.e;
                    this.h = dc2.d * dc3.a + dc2.g * dc3.h + dc2.e * dc3.i;
                    this.f = dc2.a * dc3.j + dc2.h * dc3.c + dc2.i * dc3.f;
                    this.e = dc2.a * dc3.d + dc2.h * dc3.g + dc2.i * dc3.e;
                    this.i = dc2.a * dc3.a + dc2.h * dc3.h + dc2.i * dc3.i;
                    if (n2 == 0) break block4;
                }
                dc4 = dc2;
            }
            float f10 = dc4.j * dc3.j + dc2.c * dc3.c + dc2.f * dc3.f;
            float f11 = dc2.j * dc3.d + dc2.c * dc3.g + dc2.f * dc3.e;
            float f12 = dc2.j * dc3.a + dc2.c * dc3.h + dc2.f * dc3.i;
            float f13 = dc2.d * dc3.j + dc2.g * dc3.c + dc2.e * dc3.f;
            float f14 = dc2.d * dc3.d + dc2.g * dc3.g + dc2.e * dc3.e;
            float f15 = dc2.d * dc3.a + dc2.g * dc3.h + dc2.e * dc3.i;
            float f16 = dc2.a * dc3.j + dc2.h * dc3.c + dc2.i * dc3.f;
            float f17 = dc2.a * dc3.d + dc2.h * dc3.g + dc2.i * dc3.e;
            float f18 = dc2.a * dc3.a + dc2.h * dc3.h + dc2.i * dc3.i;
            this.j = f10;
            this.d = f11;
            this.a = f12;
            this.c = f13;
            this.g = f14;
            this.h = f15;
            this.f = f16;
            this.e = f17;
            this.i = f18;
        }
    }

    public final float m() {
        return this.j;
    }

    public final void b(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.j = f11 = (float)Math.cos(f10);
        this.d = -f12;
        this.a = 0.0f;
        this.c = f12;
        this.g = f11;
        this.h = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = 1.0f;
    }

    public final float o() {
        double[] arrd = new double[9];
        double[] arrd2 = new double[3];
        this.a(arrd2, arrd);
        return (float)gY.d(arrd2);
    }

    public final void a(int n2, float[] arrf) {
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
                                arrf[0] = this.j;
                                arrf[1] = this.c;
                                arrf[2] = this.f;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 != 0) break block5;
                        if (n4 != n3) break block6;
                        arrf[0] = this.d;
                        arrf[1] = this.g;
                        arrf[2] = this.e;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                arrf[0] = this.a;
                arrf[1] = this.h;
                arrf[2] = this.i;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f3"));
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean d(dc var1_1) {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    var2_2 = ae.g();
                                    try {
                                        block26: {
                                            cfr_temp_0 = this.j - var1_1.j;
                                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var2_2 != 0) break block26;
                                            if (v0 != false) ** GOTO lbl66
                                            cfr_temp_1 = this.d - var1_1.d;
                                            v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                        }
                                        if (var2_2 != 0) break block19;
                                        if (v0 != false) ** GOTO lbl66
                                    }
                                    catch (NullPointerException var3_3) {
                                        return false;
                                    }
                                    cfr_temp_2 = this.a - var1_1.a;
                                    v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                }
                                if (var2_2 != 0) break block20;
                                if (v0 != false) ** GOTO lbl66
                                cfr_temp_3 = this.c - var1_1.c;
                                v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                            }
                            if (var2_2 != 0) break block21;
                            if (v0 != false) ** GOTO lbl66
                            cfr_temp_4 = this.g - var1_1.g;
                            v0 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                        }
                        if (var2_2 != 0) break block22;
                        if (v0 != false) ** GOTO lbl66
                        cfr_temp_5 = this.h - var1_1.h;
                        v0 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 != 0) break block23;
                    if (v0 != false) ** GOTO lbl66
                    cfr_temp_6 = this.f - var1_1.f;
                    v0 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                }
                if (var2_2 != 0) break block24;
                if (v0 != false) ** GOTO lbl66
                cfr_temp_7 = this.e - var1_1.e;
                v0 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) break block25;
            if (v0 != false) ** GOTO lbl66
            cfr_temp_8 = this.i - var1_1.i;
            v0 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl66
        v0 = (float)true;
        return (boolean)v0;
lbl66:
        // 9 sources

        v0 = (float)false;
        return (boolean)v0;
    }

    public final void f(dc dc2) {
        float f10 = 1.0f / (float)Math.sqrt(dc2.j * dc2.j + dc2.c * dc2.c + dc2.f * dc2.f);
        this.j = dc2.j * f10;
        this.c = dc2.c * f10;
        this.f = dc2.f * f10;
        f10 = 1.0f / (float)Math.sqrt(dc2.d * dc2.d + dc2.g * dc2.g + dc2.e * dc2.e);
        this.d = dc2.d * f10;
        this.g = dc2.g * f10;
        this.e = dc2.e * f10;
        this.a = this.c * this.e - this.g * this.f;
        this.h = this.d * this.f - this.j * this.e;
        this.i = this.j * this.g - this.d * this.c;
    }

    public final void n(float f10) {
        this.f = f10;
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
                        return this.j;
                    }
                    case 1: {
                        return this.d;
                    }
                    case 2: {
                        return this.a;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f5"));
            }
            case 1: {
                switch (var2_2) {
                    case 0: {
                        return this.c;
                    }
                    case 1: {
                        return this.g;
                    }
                    case 2: {
                        return this.h;
                    }
                }
                if (var3_3 != 0) throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f5"));
            }
            case 2: {
                switch (var2_2) {
                    case 0: {
                        return this.f;
                    }
                    case 1: {
                        return this.e;
                    }
                    case 2: {
                        return this.i;
                    }
                }
                throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f5"));
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f5"));
    }

    public final void a(g4 g42) {
        this.j = (float)(1.0 - 2.0 * g42.a * g42.a - 2.0 * g42.b * g42.b);
        this.c = (float)(2.0 * (g42.c * g42.a + g42.d * g42.b));
        this.f = (float)(2.0 * (g42.c * g42.b - g42.d * g42.a));
        this.d = (float)(2.0 * (g42.c * g42.a - g42.d * g42.b));
        this.g = (float)(1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.b * g42.b);
        this.e = (float)(2.0 * (g42.a * g42.b + g42.d * g42.c));
        this.a = (float)(2.0 * (g42.c * g42.b + g42.d * g42.a));
        this.h = (float)(2.0 * (g42.a * g42.b - g42.d * g42.c));
        this.i = (float)(1.0 - 2.0 * g42.c * g42.c - 2.0 * g42.a * g42.a);
    }

    public final void l(dc dc2) {
        float f10 = this.j * dc2.j + this.d * dc2.c + this.a * dc2.f;
        float f11 = this.j * dc2.d + this.d * dc2.g + this.a * dc2.e;
        float f12 = this.j * dc2.a + this.d * dc2.h + this.a * dc2.i;
        float f13 = this.c * dc2.j + this.g * dc2.c + this.h * dc2.f;
        float f14 = this.c * dc2.d + this.g * dc2.g + this.h * dc2.e;
        float f15 = this.c * dc2.a + this.g * dc2.h + this.h * dc2.i;
        float f16 = this.f * dc2.j + this.e * dc2.c + this.i * dc2.f;
        float f17 = this.f * dc2.d + this.e * dc2.g + this.i * dc2.e;
        float f18 = this.f * dc2.a + this.e * dc2.h + this.i * dc2.i;
        this.j = f10;
        this.d = f11;
        this.a = f12;
        this.c = f13;
        this.g = f14;
        this.h = f15;
        this.f = f16;
        this.e = f17;
        this.i = f18;
    }

    public final void b(float f10, dc dc2) {
        this.j = f10 * dc2.j;
        this.d = f10 * dc2.d;
        this.a = f10 * dc2.a;
        this.c = f10 * dc2.c;
        this.g = f10 * dc2.g;
        this.h = f10 * dc2.h;
        this.f = f10 * dc2.f;
        this.e = f10 * dc2.e;
        this.i = f10 * dc2.i;
    }

    public final void a(float[] arrf) {
        this.j = arrf[0];
        this.d = arrf[1];
        this.a = arrf[2];
        this.c = arrf[3];
        this.g = arrf[4];
        this.h = arrf[5];
        this.f = arrf[6];
        this.e = arrf[7];
        this.i = arrf[8];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, float var2_2, float var3_3, float var4_4) {
        var5_5 = ae.g();
        if (var5_5 != 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2;
                this.d = var3_3;
                this.a = var4_4;
lbl8:
                // 2 sources

                if (var5_5 == 0) return;
            }
            case 1: {
                this.c = var2_2;
                this.g = var3_3;
                this.h = var4_4;
                if (var5_5 == 0) return;
            }
            case 2: {
                this.f = var2_2;
                this.e = var3_3;
                this.i = var4_4;
                if (var5_5 == 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f6"));
    }

    private final void a(dc dc2) {
        block4: {
            int n2;
            double[] arrd = new double[9];
            double[] arrd2 = new double[9];
            int[] arrn = new int[3];
            arrd[0] = dc2.j;
            arrd[1] = dc2.d;
            arrd[2] = dc2.a;
            arrd[3] = dc2.c;
            arrd[4] = dc2.g;
            arrd[5] = dc2.h;
            arrd[6] = dc2.f;
            int n3 = ae.f();
            arrd[7] = dc2.e;
            arrd[8] = dc2.i;
            int n4 = dc.a(arrd, arrn);
            if (n3 != 0) {
                if (n4 == 0) {
                    throw new gP(cK.a("Matrix3f12"));
                }
                n4 = n2 = 0;
            }
            while (n2 < 9) {
                arrd2[n2] = 0.0;
                ++n2;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block4;
            }
            arrd2[0] = 1.0;
            arrd2[4] = 1.0;
            arrd2[8] = 1.0;
            dc.a(arrd, arrn, arrd2);
            this.j = (float)arrd2[0];
            this.d = (float)arrd2[1];
            this.a = (float)arrd2[2];
            this.c = (float)arrd2[3];
            this.g = (float)arrd2[4];
            this.h = (float)arrd2[5];
            this.f = (float)arrd2[6];
            this.e = (float)arrd2[7];
            this.i = (float)arrd2[8];
        }
    }

    public final void b(int n2, float[] arrf) {
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
                                arrf[0] = this.j;
                                arrf[1] = this.d;
                                arrf[2] = this.a;
                                if (n5 != 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 == 0) break block5;
                        if (n4 != n3) break block6;
                        arrf[0] = this.c;
                        arrf[1] = this.g;
                        arrf[2] = this.h;
                        if (n5 != 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                arrf[0] = this.f;
                arrf[1] = this.e;
                arrf[2] = this.i;
                if (n5 != 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f1"));
        }
    }

    public final void p() {
        this.j = 1.0f;
        this.d = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = 1.0f;
    }

    public dc() {
        this.j = 0.0f;
        this.d = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = 0.0f;
    }

    public final void i() {
        this.j = -this.j;
        this.d = -this.d;
        this.a = -this.a;
        this.c = -this.c;
        this.g = -this.g;
        this.h = -this.h;
        this.f = -this.f;
        this.e = -this.e;
        this.i = -this.i;
    }

    public final void b(dc dc2) {
        this.j = -dc2.j;
        this.d = -dc2.d;
        this.a = -dc2.a;
        this.c = -dc2.c;
        this.g = -dc2.g;
        this.h = -dc2.h;
        this.f = -dc2.f;
        this.e = -dc2.e;
        this.i = -dc2.i;
    }

    public final void a(float f10) {
        this.j += f10;
        this.d += f10;
        this.a += f10;
        this.c += f10;
        this.g += f10;
        this.h += f10;
        this.f += f10;
        this.e += f10;
        this.i += f10;
    }

    public final void d() {
        float f10 = 1.0f / (float)Math.sqrt(this.j * this.j + this.c * this.c + this.f * this.f);
        this.j *= f10;
        this.c *= f10;
        this.f *= f10;
        f10 = 1.0f / (float)Math.sqrt(this.d * this.d + this.g * this.g + this.e * this.e);
        this.d *= f10;
        this.g *= f10;
        this.e *= f10;
        this.a = this.c * this.e - this.g * this.f;
        this.h = this.d * this.f - this.j * this.e;
        this.i = this.j * this.g - this.d * this.c;
    }

    public final void a(U u2, U u3) {
        float f10 = this.j * u2.c + this.d * u2.a + this.a * u2.b;
        float f11 = this.c * u2.c + this.g * u2.a + this.h * u2.b;
        u3.b = this.f * u2.c + this.e * u2.a + this.i * u2.b;
        u3.c = f10;
        u3.a = f11;
    }

    public final void j(dc dc2) {
        double[] arrd = new double[9];
        double[] arrd2 = new double[9];
        double[] arrd3 = new double[3];
        arrd[0] = dc2.j;
        arrd[1] = dc2.d;
        arrd[2] = dc2.a;
        arrd[3] = dc2.c;
        arrd[4] = dc2.g;
        arrd[5] = dc2.h;
        arrd[6] = dc2.f;
        arrd[7] = dc2.e;
        arrd[8] = dc2.i;
        gY.b(arrd, arrd3, arrd2);
        this.j = (float)arrd2[0];
        this.d = (float)arrd2[1];
        this.a = (float)arrd2[2];
        this.c = (float)arrd2[3];
        this.g = (float)arrd2[4];
        this.h = (float)arrd2[5];
        this.f = (float)arrd2[6];
        this.e = (float)arrd2[7];
        this.i = (float)arrd2[8];
    }

    public final void b(int n2, au au2) {
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
                                au2.c = this.j;
                                au2.a = this.d;
                                au2.b = this.a;
                                if (n5 == 0) break block4;
                            }
                            n4 = n2;
                        }
                        n3 = 1;
                        if (n5 != 0) break block5;
                        if (n4 != n3) break block6;
                        au2.c = this.c;
                        au2.a = this.g;
                        au2.b = this.h;
                        if (n5 == 0) break block4;
                    }
                    n4 = n2;
                    n3 = 2;
                }
                if (n4 != n3) break block7;
                au2.c = this.f;
                au2.a = this.e;
                au2.b = this.i;
                if (n5 == 0) break block4;
            }
            throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f1"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, float var2_2, float var3_3, float var4_4) {
        var5_5 = ae.f();
        if (var5_5 == 0) ** GOTO lbl8
        switch (var1_1) {
            case 0: {
                this.j = var2_2;
                this.c = var3_3;
                this.f = var4_4;
lbl8:
                // 2 sources

                if (var5_5 != 0) return;
            }
            case 1: {
                this.d = var2_2;
                this.g = var3_3;
                this.e = var4_4;
                if (var5_5 != 0) return;
            }
            case 2: {
                this.a = var2_2;
                this.h = var3_3;
                this.i = var4_4;
                if (var5_5 != 0) return;
            }
        }
        throw new ArrayIndexOutOfBoundsException(cK.a("Matrix3f9"));
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
                n7 = ae.f();
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
                                if (n7 == 0) break block29;
                                n3 = n4;
                                while (n3-- != 0) {
                                    double d13 = arrd[n8++];
                                    double d14 = d13 = Math.abs(d13);
                                    if (n7 != 0) {
                                        double d15 = d14 - d10;
                                        d11 = d15 == 0.0 ? (int)0 : (d15 > 0.0 ? (int)1 : -1);
                                        if (n7 == 0) break block30;
                                        if (d11 <= 0) continue;
                                        d14 = d10 = d13;
                                    }
                                    if (n7 != 0) continue;
                                }
                                d11 = (d12 = d10 - 0.0) == 0.0 ? (int)0 : (d12 > 0.0 ? (int)1 : -1);
                            }
                            if (n7 == 0) break block36;
                            if (d11 != false) break block37;
                            d11 = 0.0;
                        }
                        return (boolean)d11;
                    }
                    arrd2[n6++] = 1.0 / d10;
                    if (n7 != 0) continue;
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
                        if (n7 == 0) break block31;
                        n8 = n2;
                        while (n8 < n5) {
                            block32: {
                                n12 = n3 + 3 * n8 + n5;
                                d17 = arrd[n12];
                                int n13 = n8;
                                int n14 = n3 + 3 * n8;
                                n9 = n3 + n5;
                                if (n7 == 0) continue block3;
                                n11 = n9;
                                while (n13-- != 0) {
                                    d17 -= arrd[n14] * arrd[n11];
                                    ++n14;
                                    n11 += 3;
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block32;
                                }
                                arrd[n12] = d17;
                                ++n8;
                            }
                            if (n7 != 0) continue;
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
                                if (n7 == 0) break block33;
                                n11 = n10;
                                while (n15-- != 0) {
                                    d17 -= arrd[n16] * arrd[n11];
                                    ++n16;
                                    n11 += 3;
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block34;
                                }
                                arrd[n12] = d17;
                            }
                            d16 = arrd2[n8] * Math.abs(d17);
                            double d19 = d16 == d18 ? (int)0 : (d16 > d18 ? (int)1 : -1);
                            if (n7 != 0) {
                                if (d19 < 0) continue;
                                d18 = d16;
                                d19 = n8;
                            }
                            n6 = (int)d19;
                            if (n7 != 0) continue;
                        }
                        n10 = n6;
                    }
                    if (n7 != 0) {
                        if (n10 < 0) {
                            throw new RuntimeException(cK.a("Matrix3f13"));
                        }
                        n10 = n5;
                    }
                    if (n7 != 0) {
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
                                    if (n7 != 0) {
                                        if (n7 != 0) continue;
                                    }
                                    break block35;
                                }
                                arrd2[n6] = arrd2[n5];
                            }
                            arrn[n5] = n6;
                        }
                        n10 = (d20 = arrd[n3 + 3 * n5 + n5] - 0.0) == 0.0 ? (int)0 : (d20 > 0.0 ? (int)1 : -1);
                    }
                    if (n7 != 0) {
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
                            if (n7 == 0) continue block2;
                            if (n7 != 0) continue;
                        }
                    }
                    ++n5;
                    if (n7 != 0) continue block2;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public boolean a(dc dc2, float f10) {
        int n2 = ae.f();
        float f11 = Math.abs(this.j - dc2.j) - f10;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            f12 = f12 <= 0 ? 1.0f : 0.0f;
        }
        float f13 = f12;
        float f14 = Math.abs(this.d - dc2.d) - f10;
        float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            float f16;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f16 = Math.abs(this.a - dc2.a) - f10) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f17;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f17 = Math.abs(this.c - dc2.c) - f10) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f18;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f18 = Math.abs(this.g - dc2.g) - f10) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f19;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f19 = Math.abs(this.h - dc2.h) - f10) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f20;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f20 = Math.abs(this.f - dc2.f) - f10) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f21;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f21 = Math.abs(this.e - dc2.e) - f10) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            float f22;
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = (f22 = Math.abs(this.i - dc2.i) - f10) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
        }
        if (n2 != 0) {
            if (f15 > 0) {
                f13 = 0.0f;
            }
            f15 = f13;
        }
        return (boolean)f15;
    }

    public final void i(dc dc2) {
        this.a(dc2);
    }

    public final void q() {
        this.j = 0.0f;
        this.d = 0.0f;
        this.a = 0.0f;
        this.c = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = 0.0f;
    }

    public final float a() {
        float f10 = this.j * (this.g * this.i - this.h * this.e) + this.d * (this.h * this.f - this.c * this.i) + this.a * (this.c * this.e - this.g * this.f);
        return f10;
    }

    public final void f(float f10) {
        this.j *= f10;
        this.d *= f10;
        this.a *= f10;
        this.c *= f10;
        this.g *= f10;
        this.h *= f10;
        this.f *= f10;
        this.e *= f10;
        this.i *= f10;
    }

    public final void l(float f10) {
        this.j = f10;
    }

    public String toString() {
        return this.j + ", " + this.d + ", " + this.a + "\n" + this.c + ", " + this.g + ", " + this.h + "\n" + this.f + ", " + this.e + ", " + this.i + "\n";
    }

    public final void a(em em2) {
        block4: {
            double d10;
            double d11;
            double d12;
            block2: {
                block3: {
                    d12 = Math.sqrt(em2.d * em2.d + em2.b * em2.b + em2.e * em2.e);
                    int n2 = ae.g();
                    d11 = d12;
                    d10 = 1.0E-8;
                    if (n2 != 0) break block2;
                    if (!(d11 < d10)) break block3;
                    this.j = 1.0f;
                    this.d = 0.0f;
                    this.a = 0.0f;
                    this.c = 0.0f;
                    this.g = 1.0f;
                    this.h = 0.0f;
                    this.f = 0.0f;
                    this.e = 0.0f;
                    this.i = 1.0f;
                    if (n2 == 0) break block4;
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
            this.j = (float)(d18 * d13 * d13 + d17);
            this.d = (float)(d18 * d20 - d16 * d15);
            this.a = (float)(d18 * d19 + d16 * d14);
            this.c = (float)(d18 * d20 + d16 * d15);
            this.g = (float)(d18 * d14 * d14 + d17);
            this.h = (float)(d18 * d21 - d16 * d13);
            this.f = (float)(d18 * d19 - d16 * d14);
            this.e = (float)(d18 * d21 + d16 * d13);
            this.i = (float)(d18 * d15 * d15 + d17);
        }
    }

    public final float n() {
        return this.d;
    }

    public final void p(float f10) {
        this.d = f10;
    }

    public final float e() {
        return this.a;
    }
}

