/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class x
implements Serializable,
Cloneable {
    public /* synthetic */ float b;
    public /* synthetic */ float a;
    static final /* synthetic */ long serialVersionUID = 9011180388985266884L;

    public final void b(float f10, x x2) {
        block9: {
            block7: {
                x x3;
                block8: {
                    int n2;
                    block6: {
                        block4: {
                            x x4;
                            block5: {
                                n2 = ae.f();
                                x4 = x2;
                                if (n2 == 0) break block4;
                                if (!(x4.b < f10)) break block5;
                                this.b = f10;
                                if (n2 != 0) break block6;
                            }
                            x4 = this;
                        }
                        x4.b = x2.b;
                    }
                    x3 = x2;
                    if (n2 == 0) break block7;
                    if (!(x3.a < f10)) break block8;
                    this.a = f10;
                    if (n2 != 0) break block9;
                }
                x3 = this;
            }
            x3.a = x2.a;
        }
    }

    public final void a(aR aR2) {
        this.b = (float)aR2.b;
        this.a = (float)aR2.a;
    }

    public final void d() {
        this.b = -this.b;
        this.a = -this.a;
    }

    public final void d(float f10) {
        this.b = f10;
    }

    public final void c(float f10) {
        this.b *= f10;
        this.a *= f10;
    }

    public final void c() {
        this.b = Math.abs(this.b);
        this.a = Math.abs(this.a);
    }

    public final void a(float f10, x x2) {
        block9: {
            block7: {
                x x3;
                block8: {
                    int n2;
                    block6: {
                        block4: {
                            x x4;
                            block5: {
                                n2 = ae.f();
                                x4 = x2;
                                if (n2 == 0) break block4;
                                if (!(x4.b > f10)) break block5;
                                this.b = f10;
                                if (n2 != 0) break block6;
                            }
                            x4 = this;
                        }
                        x4.b = x2.b;
                    }
                    x3 = x2;
                    if (n2 == 0) break block7;
                    if (!(x3.a > f10)) break block8;
                    this.a = f10;
                    if (n2 != 0) break block9;
                }
                x3 = this;
            }
            x3.a = x2.a;
        }
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.a);
        return gW.a(l2);
    }

    public final void a(x x2, x x3, float f10) {
        this.b = (1.0f - f10) * x2.b + f10 * x3.b;
        this.a = (1.0f - f10) * x2.a + f10 * x3.a;
    }

    public x(aR aR2) {
        this.b = (float)aR2.b;
        this.a = (float)aR2.a;
    }

    public final void d(float f10, x x2) {
        this.b = f10 * x2.b;
        this.a = f10 * x2.a;
    }

    public final void a(x x2) {
        this.b = -x2.b;
        this.a = -x2.a;
    }

    public x() {
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public final void a(x x2, float f10) {
        this.b = (1.0f - f10) * this.b + f10 * x2.b;
        this.a = (1.0f - f10) * this.a + f10 * x2.a;
    }

    public final void b(float f10) {
        block6: {
            block5: {
                x x2;
                float f11;
                block4: {
                    int n2 = ae.g();
                    float f12 = this.b - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (n2 != 0) break block4;
                    if (f11 < 0) {
                        this.b = f10;
                    }
                    x2 = this;
                    if (n2 != 0) break block5;
                    float f13 = x2.a - f10;
                    f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                }
                if (f11 >= 0) break block6;
                x2 = this;
            }
            x2.a = f10;
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
        block6: {
            var2_2 = ae.f();
            var3_3 = (x)var1_1;
            cfr_temp_0 = this.b - var3_3.b;
            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var2_2 == 0) break block6;
            if (v0 != false) ** GOTO lbl16
            cfr_temp_1 = this.a - var3_3.a;
            v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl16
        try {
            v0 = (float)true;
            return (boolean)v0;
lbl16:
            // 2 sources

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

    public final void a(float f10, float f11) {
        this.b = f10;
        this.a = f11;
    }

    public final void d(x x2) {
        this.b += x2.b;
        this.a += x2.a;
    }

    public final void b(x x2) {
        this.b -= x2.b;
        this.a -= x2.a;
    }

    public x(float[] arrf) {
        this.b = arrf[0];
        this.a = arrf[1];
    }

    public final void a(float[] arrf) {
        this.b = arrf[0];
        this.a = arrf[1];
    }

    public final void a(float f10) {
        block6: {
            block5: {
                x x2;
                float f11;
                block4: {
                    int n2 = ae.g();
                    float f12 = this.b - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (n2 != 0) break block4;
                    if (f11 > 0) {
                        this.b = f10;
                    }
                    x2 = this;
                    if (n2 != 0) break block5;
                    float f13 = x2.a - f10;
                    f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f11 <= 0) break block6;
                x2 = this;
            }
            x2.a = f10;
        }
    }

    public final void a(x x2, x x3) {
        this.b = x2.b - x3.b;
        this.a = x2.a - x3.a;
    }

    public final void a(float f10, x x2, x x3) {
        this.b = f10 * x2.b + x3.b;
        this.a = f10 * x2.a + x3.a;
    }

    public final void e(float f10) {
        this.a = f10;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public String toString() {
        return "(" + this.b + ", " + this.a + ")";
    }

    public x(x x2) {
        this.b = x2.b;
        this.a = x2.a;
    }

    public final void b(x x2, x x3) {
        this.b = x2.b + x3.b;
        this.a = x2.a + x3.a;
    }

    public final void c(float f10, x x2) {
        this.b = f10 * this.b + x2.b;
        this.a = f10 * this.a + x2.a;
    }

    public x(float f10, float f11) {
        this.b = f10;
        this.a = f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean c(x var1_1) {
        var2_2 = ae.g();
        try {
            block5: {
                cfr_temp_0 = this.b - var1_1.b;
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var2_2 != 0) break block5;
                if (v0 != false) ** GOTO lbl17
                cfr_temp_1 = this.a - var1_1.a;
                v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) return (boolean)v0;
            if (v0 != false) ** GOTO lbl17
        }
        catch (NullPointerException var3_3) {
            return false;
        }
        v0 = (float)true;
        return (boolean)v0;
lbl17:
        // 2 sources

        v0 = (float)false;
        return (boolean)v0;
    }

    public final float b() {
        return this.a;
    }

    public final void f(x x2) {
        this.b = x2.b;
        this.a = x2.a;
    }

    public final void b(float[] arrf) {
        arrf[0] = this.b;
        arrf[1] = this.a;
    }

    public final void b(float f10, float f11) {
        block13: {
            block14: {
                x x2;
                float f12;
                block11: {
                    int n2;
                    block12: {
                        block10: {
                            float f13;
                            block9: {
                                block7: {
                                    float f14;
                                    block8: {
                                        n2 = ae.f();
                                        float f15 = this.b - f11;
                                        f12 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                        if (n2 == 0) break block7;
                                        if (f12 <= 0) break block8;
                                        this.b = f11;
                                        if (n2 != 0) break block9;
                                    }
                                    f12 = (f14 = this.b - f10) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                }
                                if (n2 == 0) break block10;
                                if (f12 < 0) {
                                    this.b = f10;
                                }
                            }
                            f12 = (f13 = this.a - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        }
                        if (n2 == 0) break block11;
                        if (f12 <= 0) break block12;
                        this.a = f11;
                        if (n2 != 0) break block13;
                    }
                    x2 = this;
                    if (n2 == 0) break block14;
                    float f16 = x2.a - f10;
                    f12 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                }
                if (f12 >= 0) break block13;
                x2 = this;
            }
            x2.a = f10;
        }
    }

    public final void e(x x2) {
        this.b = Math.abs(x2.b);
        this.a = Math.abs(x2.a);
    }

    public final float a() {
        return this.b;
    }

    public final void a(float f10, float f11, x x2) {
        block11: {
            block12: {
                x x3;
                block13: {
                    float f12;
                    int n2;
                    block9: {
                        block10: {
                            float f13;
                            block6: {
                                block7: {
                                    x x4;
                                    block8: {
                                        float f14;
                                        block4: {
                                            block5: {
                                                n2 = ae.g();
                                                float f15 = x2.b - f11;
                                                f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                if (n2 != 0) break block4;
                                                if (f14 <= 0) break block5;
                                                this.b = f11;
                                                if (n2 == 0) break block6;
                                            }
                                            x4 = x2;
                                            if (n2 != 0) break block7;
                                            float f16 = x4.b - f10;
                                            f14 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                        }
                                        if (f14 >= 0) break block8;
                                        this.b = f10;
                                        if (n2 == 0) break block6;
                                    }
                                    x4 = this;
                                }
                                x4.b = x2.b;
                            }
                            f12 = (f13 = x2.a - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            if (n2 != 0) break block9;
                            if (f12 <= 0) break block10;
                            this.a = f11;
                            if (n2 == 0) break block11;
                        }
                        x3 = x2;
                        if (n2 != 0) break block12;
                        float f17 = x3.a - f10;
                        f12 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    }
                    if (f12 >= 0) break block13;
                    this.a = f10;
                    if (n2 == 0) break block11;
                }
                x3 = this;
            }
            x3.a = x2.a;
        }
    }

    public boolean b(x x2, float f10) {
        float f11;
        float f12;
        int n2;
        block14: {
            float f13;
            float f14;
            block13: {
                float f15;
                float f16;
                block12: {
                    int n3;
                    block11: {
                        f14 = this.b - x2.b;
                        n2 = ae.g();
                        n3 = Float.isNaN(f14);
                        if (n2 != 0) break block11;
                        if (n3 != 0) {
                            return false;
                        }
                        f16 = f14;
                        if (n2 != 0) break block12;
                        float f17 = f16 - 0.0f;
                        n3 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    }
                    f16 = n3 < 0 ? -f14 : f14;
                }
                f13 = (f15 = f16 - f10) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (n2 == 0) {
                    if (f13 > 0) {
                        return false;
                    }
                    f14 = this.a - x2.a;
                    f13 = (float)Float.isNaN(f14);
                }
                if (n2 != 0) break block13;
                if (f13 != false) {
                    return false;
                }
                f12 = f14;
                if (n2 != 0) break block14;
                float f18 = f12 - 0.0f;
                f13 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
            }
            f12 = f13 < 0 ? -f14 : f14;
        }
        float f19 = (f11 = f12 - f10) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 == 0) {
            f19 = f19 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f19;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }
}

