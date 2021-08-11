/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class eG
implements Cloneable,
Serializable {
    public /* synthetic */ float d;
    static final /* synthetic */ double b = 1.0E-6;
    public /* synthetic */ float a;
    static final /* synthetic */ long serialVersionUID = -163246355858070601L;
    public /* synthetic */ float e;
    public /* synthetic */ float c;

    public final float b() {
        return this.e;
    }

    public final void a(g4 g42) {
        block4: {
            block2: {
                block3: {
                    double d10 = g42.c * g42.c + g42.a * g42.a + g42.b * g42.b;
                    int n2 = ae.g();
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 1.0 / d10;
                    this.e = (float)(g42.c * d11);
                    this.d = (float)(g42.a * d11);
                    this.c = (float)(g42.b * d11);
                    this.a = (float)(2.0 * Math.atan2(d10, g42.d));
                    if (n2 == 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public boolean a(eG eG2, float f10) {
        float f11;
        float f12;
        int n2;
        block19: {
            float f13;
            float f14;
            block18: {
                float f15;
                float f16;
                block17: {
                    float f17;
                    block16: {
                        float f18;
                        float f19;
                        block15: {
                            float f20;
                            block14: {
                                float f21;
                                f14 = this.e - eG2.e;
                                n2 = ae.g();
                                float f22 = f14;
                                if (n2 == 0) {
                                    f22 = f22 < 0.0f ? -f14 : f14;
                                }
                                f20 = (f21 = f22 - f10) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                if (n2 != 0) break block14;
                                if (f20 > 0) {
                                    return false;
                                }
                                f19 = f14 = this.d - eG2.d;
                                if (n2 != 0) break block15;
                                float f23 = f19 - 0.0f;
                                f20 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                            }
                            f19 = f20 < 0 ? -f14 : f14;
                        }
                        f17 = (f18 = f19 - f10) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (n2 != 0) break block16;
                        if (f17 > 0) {
                            return false;
                        }
                        f16 = f14 = this.c - eG2.c;
                        if (n2 != 0) break block17;
                        float f24 = f16 - 0.0f;
                        f17 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                    }
                    f16 = f17 < 0 ? -f14 : f14;
                }
                f13 = (f15 = f16 - f10) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (n2 != 0) break block18;
                if (f13 > 0) {
                    return false;
                }
                f12 = f14 = this.a - eG2.a;
                if (n2 != 0) break block19;
                float f25 = f12 - 0.0f;
                f13 = f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
            }
            f12 = f13 < 0 ? -f14 : f14;
        }
        float f26 = (f11 = f12 - f10) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 == 0) {
            f26 = f26 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f26;
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

    public final void a(eG eG2) {
        this.e = eG2.e;
        this.d = eG2.d;
        this.c = eG2.c;
        this.a = eG2.a;
    }

    public final void a(dA dA2) {
        block4: {
            block2: {
                block3: {
                    gY gY2 = new gY();
                    dA2.b(gY2);
                    this.e = (float)(gY2.b - gY2.c);
                    this.d = (float)(gY2.i - gY2.g);
                    this.c = (float)(gY2.f - gY2.j);
                    double d10 = this.e * this.e + this.d * this.d + this.c * this.c;
                    int n2 = ae.g();
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * (gY2.h + gY2.d + gY2.e - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.e = (float)((double)this.e * d13);
                    this.d = (float)((double)this.d * d13);
                    this.c = (float)((double)this.c * d13);
                    if (n2 == 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public eG(eG eG2) {
        this.e = eG2.e;
        this.d = eG2.d;
        this.c = eG2.c;
        this.a = eG2.a;
    }

    public final void a(gY gY2) {
        block4: {
            block2: {
                block3: {
                    this.e = (float)(gY2.b - gY2.c);
                    this.d = (float)(gY2.i - gY2.g);
                    this.c = (float)(gY2.f - gY2.j);
                    int n2 = ae.g();
                    double d10 = this.e * this.e + this.d * this.d + this.c * this.c;
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * (gY2.h + gY2.d + gY2.e - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.e = (float)((double)this.e * d13);
                    this.d = (float)((double)this.d * d13);
                    this.c = (float)((double)this.c * d13);
                    if (n2 == 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public eG(em em2) {
        this.e = (float)em2.d;
        this.d = (float)em2.b;
        this.c = (float)em2.e;
        this.a = (float)em2.a;
    }

    public final void b(float f10) {
        this.a = f10;
    }

    public final void a(au au2, float f10) {
        this.e = au2.c;
        this.d = au2.a;
        this.c = au2.b;
        this.a = f10;
    }

    public final void b(float[] arrf) {
        arrf[0] = this.e;
        arrf[1] = this.d;
        arrf[2] = this.c;
        arrf[3] = this.a;
    }

    public final void d(float f10) {
        this.e = f10;
    }

    public eG() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 1.0f;
        this.a = 0.0f;
    }

    public eG(float[] arrf) {
        this.e = arrf[0];
        this.d = arrf[1];
        this.c = arrf[2];
        this.a = arrf[3];
    }

    public final void a(ao ao2) {
        block4: {
            block2: {
                block3: {
                    double d10 = ao2.c * ao2.c + ao2.a * ao2.a + ao2.b * ao2.b;
                    int n2 = ae.g();
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 1.0 / d10;
                    this.e = (float)((double)ao2.c * d11);
                    this.d = (float)((double)ao2.a * d11);
                    this.c = (float)((double)ao2.b * d11);
                    this.a = (float)(2.0 * Math.atan2(d10, ao2.d));
                    if (n2 == 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public eG(au au2, float f10) {
        this.e = au2.c;
        this.d = au2.a;
        this.c = au2.b;
        this.a = f10;
    }

    public final float c() {
        return this.a;
    }

    public final float a() {
        return this.c;
    }

    public final void a(float[] arrf) {
        this.e = arrf[0];
        this.d = arrf[1];
        this.c = arrf[2];
        this.a = arrf[3];
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
                    var3_3 = (eG)var1_1;
                    cfr_temp_0 = this.e - var3_3.e;
                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    if (var2_2 == 0) break block12;
                    if (v0 != false) ** GOTO lbl30
                    cfr_temp_1 = this.d - var3_3.d;
                    v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                }
                if (var2_2 == 0) break block10;
                if (v0 != false) ** GOTO lbl30
                cfr_temp_2 = this.c - var3_3.c;
                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
            }
            if (var2_2 == 0) break block11;
            if (v0 != false) ** GOTO lbl30
            cfr_temp_3 = this.a - var3_3.a;
            v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl30
        try {
            v0 = (float)true;
            return (boolean)v0;
lbl30:
            // 4 sources

            v0 = (float)false;
            return (boolean)v0;
        }
        catch (NullPointerException var3_4) {
            return false;
        }
        catch (ClassCastException var3_5) {
            return false;
        }
    }

    public final float d() {
        return this.d;
    }

    public final void c(float f10) {
        this.d = f10;
    }

    public eG(float f10, float f11, float f12, float f13) {
        this.e = f10;
        this.d = f11;
        this.c = f12;
        this.a = f13;
    }

    public final void a(float f10) {
        this.c = f10;
    }

    public String toString() {
        return "(" + this.e + ", " + this.d + ", " + this.c + ", " + this.a + ")";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean b(eG var1_1) {
        block10: {
            block9: {
                var2_2 = ae.g();
                try {
                    block11: {
                        cfr_temp_0 = this.e - var1_1.e;
                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var2_2 != 0) break block11;
                        if (v0 != false) ** GOTO lbl31
                        cfr_temp_1 = this.d - var1_1.d;
                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 != 0) break block9;
                    if (v0 != false) ** GOTO lbl31
                }
                catch (NullPointerException var3_3) {
                    return false;
                }
                cfr_temp_2 = this.c - var1_1.c;
                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) break block10;
            if (v0 != false) ** GOTO lbl31
            cfr_temp_3 = this.a - var1_1.a;
            v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl31
        v0 = (float)true;
        return (boolean)v0;
lbl31:
        // 4 sources

        v0 = (float)false;
        return (boolean)v0;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.e = f10;
        this.d = f11;
        this.c = f12;
        this.a = f13;
    }

    public final void a(em em2) {
        this.e = (float)em2.d;
        this.d = (float)em2.b;
        this.c = (float)em2.e;
        this.a = (float)em2.a;
    }

    public final void a(dU dU2) {
        block4: {
            block2: {
                block3: {
                    dc dc2 = new dc();
                    dU2.c(dc2);
                    this.e = dc2.e - dc2.h;
                    this.d = dc2.a - dc2.f;
                    int n2 = ae.f();
                    this.c = dc2.c - dc2.d;
                    double d10 = this.e * this.e + this.d * this.d + this.c * this.c;
                    if (n2 == 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * ((double)(dc2.j + dc2.g + dc2.i) - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.e = (float)((double)this.e * d13);
                    this.d = (float)((double)this.d * d13);
                    this.c = (float)((double)this.c * d13);
                    if (n2 != 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public final void a(dc dc2) {
        block4: {
            block2: {
                block3: {
                    this.e = dc2.e - dc2.h;
                    this.d = dc2.a - dc2.f;
                    this.c = dc2.c - dc2.d;
                    int n2 = ae.g();
                    double d10 = this.e * this.e + this.d * this.d + this.c * this.c;
                    if (n2 != 0) break block2;
                    if (!(d10 > 1.0E-6)) break block3;
                    d10 = Math.sqrt(d10);
                    double d11 = 0.5 * d10;
                    double d12 = 0.5 * ((double)(dc2.j + dc2.g + dc2.i) - 1.0);
                    this.a = (float)Math.atan2(d11, d12);
                    double d13 = 1.0 / d10;
                    this.e = (float)((double)this.e * d13);
                    this.d = (float)((double)this.d * d13);
                    this.c = (float)((double)this.c * d13);
                    if (n2 == 0) break block4;
                }
                this.e = 0.0f;
                this.d = 1.0f;
                this.c = 0.0f;
            }
            this.a = 0.0f;
        }
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.e);
        l2 = gW.a(l2, this.d);
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.a);
        return gW.a(l2);
    }
}

