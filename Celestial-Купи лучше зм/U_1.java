/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class U
implements Serializable,
Cloneable {
    public /* synthetic */ float c;
    static final /* synthetic */ long serialVersionUID = 5019834619484343712L;
    public /* synthetic */ float a;
    public /* synthetic */ float b;

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void d() {
        this.c = Math.abs(this.c);
        this.a = Math.abs(this.a);
        this.b = Math.abs(this.b);
    }

    public final void d(float f10, U u2) {
        block14: {
            block12: {
                U u3;
                block13: {
                    int n2;
                    block11: {
                        block9: {
                            U u4;
                            block10: {
                                block8: {
                                    block6: {
                                        U u5;
                                        block7: {
                                            n2 = ae.g();
                                            u5 = u2;
                                            if (n2 != 0) break block6;
                                            if (!(u5.c < f10)) break block7;
                                            this.c = f10;
                                            if (n2 == 0) break block8;
                                        }
                                        u5 = this;
                                    }
                                    u5.c = u2.c;
                                }
                                u4 = u2;
                                if (n2 != 0) break block9;
                                if (!(u4.a < f10)) break block10;
                                this.a = f10;
                                if (n2 == 0) break block11;
                            }
                            u4 = this;
                        }
                        u4.a = u2.a;
                    }
                    u3 = u2;
                    if (n2 != 0) break block12;
                    if (!(u3.b < f10)) break block13;
                    this.b = f10;
                    if (n2 == 0) break block14;
                }
                u3 = this;
            }
            u3.b = u2.b;
        }
    }

    public final float b() {
        return this.b;
    }

    public final void d(float f10) {
        block8: {
            block7: {
                U u2;
                float f11;
                block6: {
                    int n2 = ae.g();
                    float f12 = this.c - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (n2 == 0) {
                        float f13;
                        if (f11 > 0) {
                            this.c = f10;
                        }
                        f11 = (f13 = this.a - f10) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    }
                    if (n2 != 0) break block6;
                    if (f11 > 0) {
                        this.a = f10;
                    }
                    u2 = this;
                    if (n2 != 0) break block7;
                    float f14 = u2.b - f10;
                    f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                if (f11 <= 0) break block8;
                u2 = this;
            }
            u2.b = f10;
        }
    }

    public final void e(float f10) {
        this.a = f10;
    }

    public final void b(float f10) {
        this.b = f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean e(U var1_1) {
        block7: {
            var2_2 = ae.g();
            try {
                block8: {
                    cfr_temp_0 = this.c - var1_1.c;
                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    if (var2_2 != 0) break block8;
                    if (v0 != false) ** GOTO lbl24
                    cfr_temp_1 = this.a - var1_1.a;
                    v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                }
                if (var2_2 != 0) break block7;
                if (v0 != false) ** GOTO lbl24
            }
            catch (NullPointerException var3_3) {
                return false;
            }
            cfr_temp_2 = this.b - var1_1.b;
            v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
        }
        if (var2_2 != 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl24
        v0 = (float)true;
        return (boolean)v0;
lbl24:
        // 3 sources

        v0 = (float)false;
        return (boolean)v0;
    }

    public String toString() {
        return "(" + this.c + ", " + this.a + ", " + this.b + ")";
    }

    public final void d(U u2) {
        this.c += u2.c;
        this.a += u2.a;
        this.b += u2.b;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void a(float f10, float f11) {
        block21: {
            block22: {
                U u2;
                float f12;
                block19: {
                    int n2;
                    block20: {
                        block18: {
                            float f13;
                            block17: {
                                block15: {
                                    float f14;
                                    block16: {
                                        block14: {
                                            float f15;
                                            block13: {
                                                block11: {
                                                    float f16;
                                                    block12: {
                                                        n2 = ae.f();
                                                        float f17 = this.c - f11;
                                                        f12 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                        if (n2 == 0) break block11;
                                                        if (f12 <= 0) break block12;
                                                        this.c = f11;
                                                        if (n2 != 0) break block13;
                                                    }
                                                    f12 = (f16 = this.c - f10) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                }
                                                if (n2 == 0) break block14;
                                                if (f12 < 0) {
                                                    this.c = f10;
                                                }
                                            }
                                            f12 = (f15 = this.a - f11) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                        }
                                        if (n2 == 0) break block15;
                                        if (f12 <= 0) break block16;
                                        this.a = f11;
                                        if (n2 != 0) break block17;
                                    }
                                    f12 = (f14 = this.a - f10) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                }
                                if (n2 == 0) break block18;
                                if (f12 < 0) {
                                    this.a = f10;
                                }
                            }
                            f12 = (f13 = this.b - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        }
                        if (n2 == 0) break block19;
                        if (f12 <= 0) break block20;
                        this.b = f11;
                        if (n2 != 0) break block21;
                    }
                    u2 = this;
                    if (n2 == 0) break block22;
                    float f18 = u2.b - f10;
                    f12 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                }
                if (f12 >= 0) break block21;
                u2 = this;
            }
            u2.b = f10;
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
        block8: {
            block9: {
                var2_2 = ae.f();
                var3_3 = (U)var1_1;
                cfr_temp_0 = this.c - var3_3.c;
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var2_2 == 0) break block9;
                if (v0 != false) ** GOTO lbl23
                cfr_temp_1 = this.a - var3_3.a;
                v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            }
            if (var2_2 == 0) break block8;
            if (v0 != false) ** GOTO lbl23
            cfr_temp_2 = this.b - var3_3.b;
            v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
        }
        if (var2_2 == 0) return (boolean)v0;
        if (v0 != false) ** GOTO lbl23
        try {
            v0 = (float)true;
            return (boolean)v0;
lbl23:
            // 3 sources

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

    public final void a(float f10) {
        this.c *= f10;
        this.a *= f10;
        this.b *= f10;
    }

    public final void a(U u2, U u3, float f10) {
        this.c = (1.0f - f10) * u2.c + f10 * u3.c;
        this.a = (1.0f - f10) * u2.a + f10 * u3.a;
        this.b = (1.0f - f10) * u2.b + f10 * u3.b;
    }

    public final void a(float f10, U u2, U u3) {
        this.c = f10 * u2.c + u3.c;
        this.a = f10 * u2.a + u3.a;
        this.b = f10 * u2.b + u3.b;
    }

    public final float c() {
        return this.a;
    }

    public final void a(float f10, float f11, U u2) {
        block18: {
            block19: {
                U u3;
                block20: {
                    float f12;
                    int n2;
                    block16: {
                        block17: {
                            float f13;
                            block13: {
                                block14: {
                                    U u4;
                                    block15: {
                                        float f14;
                                        block11: {
                                            block12: {
                                                float f15;
                                                block8: {
                                                    block9: {
                                                        U u5;
                                                        block10: {
                                                            float f16;
                                                            block6: {
                                                                block7: {
                                                                    n2 = ae.g();
                                                                    float f17 = u2.c - f11;
                                                                    f16 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                    if (n2 != 0) break block6;
                                                                    if (f16 <= 0) break block7;
                                                                    this.c = f11;
                                                                    if (n2 == 0) break block8;
                                                                }
                                                                u5 = u2;
                                                                if (n2 != 0) break block9;
                                                                float f18 = u5.c - f10;
                                                                f16 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                                            }
                                                            if (f16 >= 0) break block10;
                                                            this.c = f10;
                                                            if (n2 == 0) break block8;
                                                        }
                                                        u5 = this;
                                                    }
                                                    u5.c = u2.c;
                                                }
                                                f14 = (f15 = u2.a - f11) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                if (n2 != 0) break block11;
                                                if (f14 <= 0) break block12;
                                                this.a = f11;
                                                if (n2 == 0) break block13;
                                            }
                                            u4 = u2;
                                            if (n2 != 0) break block14;
                                            float f19 = u4.a - f10;
                                            f14 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                                        }
                                        if (f14 >= 0) break block15;
                                        this.a = f10;
                                        if (n2 == 0) break block13;
                                    }
                                    u4 = this;
                                }
                                u4.a = u2.a;
                            }
                            f12 = (f13 = u2.b - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            if (n2 != 0) break block16;
                            if (f12 <= 0) break block17;
                            this.b = f11;
                            if (n2 == 0) break block18;
                        }
                        u3 = u2;
                        if (n2 != 0) break block19;
                        float f20 = u3.b - f10;
                        f12 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                    }
                    if (f12 >= 0) break block20;
                    this.b = f10;
                    if (n2 == 0) break block18;
                }
                u3 = this;
            }
            u3.b = u2.b;
        }
    }

    public final void c(float f10) {
        block8: {
            block7: {
                U u2;
                float f11;
                block6: {
                    int n2 = ae.g();
                    float f12 = this.c - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (n2 == 0) {
                        float f13;
                        if (f11 < 0) {
                            this.c = f10;
                        }
                        f11 = (f13 = this.a - f10) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                    }
                    if (n2 != 0) break block6;
                    if (f11 < 0) {
                        this.a = f10;
                    }
                    u2 = this;
                    if (n2 != 0) break block7;
                    float f14 = u2.b - f10;
                    f11 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                }
                if (f11 >= 0) break block8;
                u2 = this;
            }
            u2.b = f10;
        }
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.b);
        return gW.a(l2);
    }

    public U(U u2) {
        this.c = u2.c;
        this.a = u2.a;
        this.b = u2.b;
    }

    public final void f(float f10) {
        this.c = f10;
    }

    public U() {
        this.c = 0.0f;
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public final float e() {
        return this.c;
    }

    public final void a(U u2, U u3) {
        this.c = u2.c + u3.c;
        this.a = u2.a + u3.a;
        this.b = u2.b + u3.b;
    }

    public final void a(float f10, U u2) {
        this.c = f10 * this.c + u2.c;
        this.a = f10 * this.a + u2.a;
        this.b = f10 * this.b + u2.b;
    }

    public final void a(U u2, float f10) {
        this.c = (1.0f - f10) * this.c + f10 * u2.c;
        this.a = (1.0f - f10) * this.a + f10 * u2.a;
        this.b = (1.0f - f10) * this.b + f10 * u2.b;
    }

    public U(o o2) {
        this.c = (float)o2.c;
        this.a = (float)o2.b;
        this.b = (float)o2.a;
    }

    public U(float[] arrf) {
        this.c = arrf[0];
        this.a = arrf[1];
        this.b = arrf[2];
    }

    public final void a(float f10, float f11, float f12) {
        this.c = f10;
        this.a = f11;
        this.b = f12;
    }

    public final void c(float f10, U u2) {
        block14: {
            block12: {
                U u3;
                block13: {
                    int n2;
                    block11: {
                        block9: {
                            U u4;
                            block10: {
                                block8: {
                                    block6: {
                                        U u5;
                                        block7: {
                                            n2 = ae.g();
                                            u5 = u2;
                                            if (n2 != 0) break block6;
                                            if (!(u5.c > f10)) break block7;
                                            this.c = f10;
                                            if (n2 == 0) break block8;
                                        }
                                        u5 = this;
                                    }
                                    u5.c = u2.c;
                                }
                                u4 = u2;
                                if (n2 != 0) break block9;
                                if (!(u4.a > f10)) break block10;
                                this.a = f10;
                                if (n2 == 0) break block11;
                            }
                            u4 = this;
                        }
                        u4.a = u2.a;
                    }
                    u3 = u2;
                    if (n2 != 0) break block12;
                    if (!(u3.b > f10)) break block13;
                    this.b = f10;
                    if (n2 == 0) break block14;
                }
                u3 = this;
            }
            u3.b = u2.b;
        }
    }

    public final void c(U u2) {
        u2.c = this.c;
        u2.a = this.a;
        u2.b = this.b;
    }

    public U(float f10, float f11, float f12) {
        this.c = f10;
        this.a = f11;
        this.b = f12;
    }

    public final void b(U u2) {
        this.c = u2.c;
        this.a = u2.a;
        this.b = u2.b;
    }

    public final void b(float[] arrf) {
        this.c = arrf[0];
        this.a = arrf[1];
        this.b = arrf[2];
    }

    public boolean b(U u2, float f10) {
        float f11;
        float f12;
        int n2;
        block22: {
            float f13;
            float f14;
            block21: {
                float f15;
                float f16;
                block20: {
                    float f17;
                    block19: {
                        float f18;
                        float f19;
                        block18: {
                            int n3;
                            block17: {
                                f14 = this.c - u2.c;
                                n2 = ae.f();
                                n3 = Float.isNaN(f14);
                                if (n2 == 0) break block17;
                                if (n3 != 0) {
                                    return false;
                                }
                                f19 = f14;
                                if (n2 == 0) break block18;
                                float f20 = f19 - 0.0f;
                                n3 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                            }
                            f19 = n3 < 0 ? -f14 : f14;
                        }
                        f17 = (f18 = f19 - f10) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (n2 != 0) {
                            if (f17 > 0) {
                                return false;
                            }
                            f14 = this.a - u2.a;
                            f17 = (float)Float.isNaN(f14);
                        }
                        if (n2 == 0) break block19;
                        if (f17 != false) {
                            return false;
                        }
                        f16 = f14;
                        if (n2 == 0) break block20;
                        float f21 = f16 - 0.0f;
                        f17 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                    }
                    f16 = f17 < 0 ? -f14 : f14;
                }
                f13 = (f15 = f16 - f10) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (n2 != 0) {
                    if (f13 > 0) {
                        return false;
                    }
                    f14 = this.b - u2.b;
                    f13 = (float)Float.isNaN(f14);
                }
                if (n2 == 0) break block21;
                if (f13 != false) {
                    return false;
                }
                f12 = f14;
                if (n2 == 0) break block22;
                float f22 = f12 - 0.0f;
                f13 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
            }
            f12 = f13 < 0 ? -f14 : f14;
        }
        float f23 = (f11 = f12 - f10) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            f23 = f23 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f23;
    }

    public final void g(U u2) {
        this.c = -u2.c;
        this.a = -u2.a;
        this.b = -u2.b;
    }

    public final void a(o o2) {
        this.c = (float)o2.c;
        this.a = (float)o2.b;
        this.b = (float)o2.a;
    }

    public final void b(U u2, U u3) {
        this.c = u2.c - u3.c;
        this.a = u2.a - u3.a;
        this.b = u2.b - u3.b;
    }

    public final void b(float f10, U u2) {
        this.c = f10 * u2.c;
        this.a = f10 * u2.a;
        this.b = f10 * u2.b;
    }

    public final void a() {
        this.c = -this.c;
        this.a = -this.a;
        this.b = -this.b;
    }

    public final void f(U u2) {
        this.c = Math.abs(u2.c);
        this.a = Math.abs(u2.a);
        this.b = Math.abs(u2.b);
    }

    public final void a(float[] arrf) {
        arrf[0] = this.c;
        arrf[1] = this.a;
        arrf[2] = this.b;
    }

    public final void a(U u2) {
        this.c -= u2.c;
        this.a -= u2.a;
        this.b -= u2.b;
    }
}

