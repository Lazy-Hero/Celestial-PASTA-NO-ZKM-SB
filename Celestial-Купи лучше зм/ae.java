/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class ae
implements Cloneable,
Serializable {
    public /* synthetic */ float a;
    private static /* synthetic */ int e;
    public /* synthetic */ float c;
    public /* synthetic */ float d;
    static final /* synthetic */ long serialVersionUID = 7068460319248845763L;
    public /* synthetic */ float b;

    public final void a(float f10, ae ae2) {
        this.c = f10 * this.c + ae2.c;
        this.a = f10 * this.a + ae2.a;
        this.b = f10 * this.b + ae2.b;
        this.d = f10 * this.d + ae2.d;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = gW.a(l2, this.c);
        l2 = gW.a(l2, this.a);
        l2 = gW.a(l2, this.b);
        l2 = gW.a(l2, this.d);
        return gW.a(l2);
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public boolean b(ae ae2, float f10) {
        float f11;
        float f12;
        int n2;
        block30: {
            float f13;
            float f14;
            block29: {
                float f15;
                float f16;
                block28: {
                    float f17;
                    block27: {
                        float f18;
                        float f19;
                        block26: {
                            float f20;
                            block25: {
                                float f21;
                                float f22;
                                block24: {
                                    int n3;
                                    block23: {
                                        f14 = this.c - ae2.c;
                                        n2 = ae.f();
                                        n3 = Float.isNaN(f14);
                                        if (n2 == 0) break block23;
                                        if (n3 != 0) {
                                            return false;
                                        }
                                        f22 = f14;
                                        if (n2 == 0) break block24;
                                        float f23 = f22 - 0.0f;
                                        n3 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                                    }
                                    f22 = n3 < 0 ? -f14 : f14;
                                }
                                f20 = (f21 = f22 - f10) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                if (n2 != 0) {
                                    if (f20 > 0) {
                                        return false;
                                    }
                                    f14 = this.a - ae2.a;
                                    f20 = (float)Float.isNaN(f14);
                                }
                                if (n2 == 0) break block25;
                                if (f20 != false) {
                                    return false;
                                }
                                f19 = f14;
                                if (n2 == 0) break block26;
                                float f24 = f19 - 0.0f;
                                f20 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                            }
                            f19 = f20 < 0 ? -f14 : f14;
                        }
                        f17 = (f18 = f19 - f10) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (n2 != 0) {
                            if (f17 > 0) {
                                return false;
                            }
                            f14 = this.b - ae2.b;
                            f17 = (float)Float.isNaN(f14);
                        }
                        if (n2 == 0) break block27;
                        if (f17 != false) {
                            return false;
                        }
                        f16 = f14;
                        if (n2 == 0) break block28;
                        float f25 = f16 - 0.0f;
                        f17 = f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                    }
                    f16 = f17 < 0 ? -f14 : f14;
                }
                f13 = (f15 = f16 - f10) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (n2 != 0) {
                    if (f13 > 0) {
                        return false;
                    }
                    f14 = this.d - ae2.d;
                    f13 = (float)Float.isNaN(f14);
                }
                if (n2 == 0) break block29;
                if (f13 != false) {
                    return false;
                }
                f12 = f14;
                if (n2 == 0) break block30;
                float f26 = f12 - 0.0f;
                f13 = f26 == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1);
            }
            f12 = f13 < 0 ? -f14 : f14;
        }
        float f27 = (f11 = f12 - f10) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (n2 != 0) {
            f27 = f27 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f27;
    }

    public ae(float f10, float f11, float f12, float f13) {
        this.c = f10;
        this.a = f11;
        this.b = f12;
        this.d = f13;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean d(ae var1_1) {
        block10: {
            block9: {
                var2_2 = ae.g();
                try {
                    block11: {
                        cfr_temp_0 = this.c - var1_1.c;
                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var2_2 != 0) break block11;
                        if (v0 != false) ** GOTO lbl31
                        cfr_temp_1 = this.a - var1_1.a;
                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    if (var2_2 != 0) break block9;
                    if (v0 != false) ** GOTO lbl31
                }
                catch (NullPointerException var3_3) {
                    return false;
                }
                cfr_temp_2 = this.b - var1_1.b;
                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
            }
            if (var2_2 != 0) break block10;
            if (v0 != false) ** GOTO lbl31
            cfr_temp_3 = this.d - var1_1.d;
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

    public void a(ae ae2, ae ae3, float f10) {
        this.c = (1.0f - f10) * ae2.c + f10 * ae3.c;
        this.a = (1.0f - f10) * ae2.a + f10 * ae3.a;
        this.b = (1.0f - f10) * ae2.b + f10 * ae3.b;
        this.d = (1.0f - f10) * ae2.d + f10 * ae3.d;
    }

    public void a(ae ae2, float f10) {
        this.c = (1.0f - f10) * this.c + f10 * ae2.c;
        this.a = (1.0f - f10) * this.a + f10 * ae2.a;
        this.b = (1.0f - f10) * this.b + f10 * ae2.b;
        this.d = (1.0f - f10) * this.d + f10 * ae2.d;
    }

    public final float b() {
        return this.c;
    }

    public final void a(ae ae2) {
        this.c += ae2.c;
        this.a += ae2.a;
        this.b += ae2.b;
        this.d += ae2.d;
    }

    public final void g(ae ae2) {
        this.c = Math.abs(ae2.c);
        this.a = Math.abs(ae2.a);
        this.b = Math.abs(ae2.b);
        this.d = Math.abs(ae2.d);
    }

    public final float d() {
        return this.d;
    }

    public final void a() {
        this.c = Math.abs(this.c);
        this.a = Math.abs(this.a);
        this.b = Math.abs(this.b);
        this.d = Math.abs(this.d);
    }

    public ae(ae ae2) {
        this.c = ae2.c;
        this.a = ae2.a;
        this.b = ae2.b;
        this.d = ae2.d;
    }

    public ae(float[] arrf) {
        this.c = arrf[0];
        this.a = arrf[1];
        this.b = arrf[2];
        this.d = arrf[3];
    }

    public final void c(float f10, ae ae2) {
        this.c = f10 * ae2.c;
        this.a = f10 * ae2.a;
        this.b = f10 * ae2.b;
        this.d = f10 * ae2.d;
    }

    public ae() {
        this.c = 0.0f;
        this.a = 0.0f;
        this.b = 0.0f;
        this.d = 0.0f;
    }

    public final void a(float f10, float f11, ae ae2) {
        block25: {
            block26: {
                ae ae3;
                block27: {
                    float f12;
                    int n2;
                    block23: {
                        block24: {
                            float f13;
                            block20: {
                                block21: {
                                    ae ae4;
                                    block22: {
                                        float f14;
                                        block18: {
                                            block19: {
                                                float f15;
                                                block15: {
                                                    block16: {
                                                        ae ae5;
                                                        block17: {
                                                            float f16;
                                                            block13: {
                                                                block14: {
                                                                    float f17;
                                                                    block10: {
                                                                        block11: {
                                                                            ae ae6;
                                                                            block12: {
                                                                                float f18;
                                                                                block8: {
                                                                                    block9: {
                                                                                        n2 = ae.g();
                                                                                        float f19 = ae2.c - f11;
                                                                                        f18 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                                                                        if (n2 != 0) break block8;
                                                                                        if (f18 <= 0) break block9;
                                                                                        this.c = f11;
                                                                                        if (n2 == 0) break block10;
                                                                                    }
                                                                                    ae6 = ae2;
                                                                                    if (n2 != 0) break block11;
                                                                                    float f20 = ae6.c - f10;
                                                                                    f18 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                                                                                }
                                                                                if (f18 >= 0) break block12;
                                                                                this.c = f10;
                                                                                if (n2 == 0) break block10;
                                                                            }
                                                                            ae6 = this;
                                                                        }
                                                                        ae6.c = ae2.c;
                                                                    }
                                                                    f16 = (f17 = ae2.a - f11) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                    if (n2 != 0) break block13;
                                                                    if (f16 <= 0) break block14;
                                                                    this.a = f11;
                                                                    if (n2 == 0) break block15;
                                                                }
                                                                ae5 = ae2;
                                                                if (n2 != 0) break block16;
                                                                float f21 = ae5.a - f10;
                                                                f16 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                                                            }
                                                            if (f16 >= 0) break block17;
                                                            this.a = f10;
                                                            if (n2 == 0) break block15;
                                                        }
                                                        ae5 = this;
                                                    }
                                                    ae5.a = ae2.a;
                                                }
                                                f14 = (f15 = ae2.b - f11) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                if (n2 != 0) break block18;
                                                if (f14 <= 0) break block19;
                                                this.b = f11;
                                                if (n2 == 0) break block20;
                                            }
                                            ae4 = ae2;
                                            if (n2 != 0) break block21;
                                            float f22 = ae4.b - f10;
                                            f14 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
                                        }
                                        if (f14 >= 0) break block22;
                                        this.b = f10;
                                        if (n2 == 0) break block20;
                                    }
                                    ae4 = this;
                                }
                                ae4.b = ae2.b;
                            }
                            f12 = (f13 = ae2.d - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            if (n2 != 0) break block23;
                            if (f12 <= 0) break block24;
                            this.d = f11;
                            if (n2 == 0) break block25;
                        }
                        ae3 = ae2;
                        if (n2 != 0) break block26;
                        float f23 = ae3.d - f10;
                        f12 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                    }
                    if (f12 >= 0) break block27;
                    this.d = f10;
                    if (n2 == 0) break block25;
                }
                ae3 = this;
            }
            ae3.d = ae2.d;
        }
    }

    public final void d(float f10) {
        this.b = f10;
    }

    public final float e() {
        return this.b;
    }

    public final void a(gS gS2) {
        this.c = (float)gS2.c;
        this.a = (float)gS2.a;
        this.b = (float)gS2.b;
        this.d = (float)gS2.d;
    }

    public static void b(int n2) {
        e = n2;
    }

    public final void d(float f10, ae ae2) {
        block19: {
            block17: {
                ae ae3;
                block18: {
                    int n2;
                    block16: {
                        block14: {
                            ae ae4;
                            block15: {
                                block13: {
                                    block11: {
                                        ae ae5;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    ae ae6;
                                                    block9: {
                                                        n2 = ae.f();
                                                        ae6 = ae2;
                                                        if (n2 == 0) break block8;
                                                        if (!(ae6.c > f10)) break block9;
                                                        this.c = f10;
                                                        if (n2 != 0) break block10;
                                                    }
                                                    ae6 = this;
                                                }
                                                ae6.c = ae2.c;
                                            }
                                            ae5 = ae2;
                                            if (n2 == 0) break block11;
                                            if (!(ae5.a > f10)) break block12;
                                            this.a = f10;
                                            if (n2 != 0) break block13;
                                        }
                                        ae5 = this;
                                    }
                                    ae5.a = ae2.a;
                                }
                                ae4 = ae2;
                                if (n2 == 0) break block14;
                                if (!(ae4.b > f10)) break block15;
                                this.b = f10;
                                if (n2 != 0) break block16;
                            }
                            ae4 = this;
                        }
                        ae4.b = ae2.b;
                    }
                    ae3 = ae2;
                    if (n2 == 0) break block17;
                    if (!(ae3.d > f10)) break block18;
                    this.d = f10;
                    if (n2 != 0) break block19;
                }
                ae3 = this;
            }
            ae3.d = ae2.b;
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
                    var3_3 = (ae)var1_1;
                    cfr_temp_0 = this.c - var3_3.c;
                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    if (var2_2 == 0) break block12;
                    if (v0 != false) ** GOTO lbl30
                    cfr_temp_1 = this.a - var3_3.a;
                    v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                }
                if (var2_2 == 0) break block10;
                if (v0 != false) ** GOTO lbl30
                cfr_temp_2 = this.b - var3_3.b;
                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
            }
            if (var2_2 == 0) break block11;
            if (v0 != false) ** GOTO lbl30
            cfr_temp_3 = this.d - var3_3.d;
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

    public final void a(ae ae2, ae ae3) {
        this.c = ae2.c - ae3.c;
        this.a = ae2.a - ae3.a;
        this.b = ae2.b - ae3.b;
        this.d = ae2.d - ae3.d;
    }

    public final void g(float f10) {
        block10: {
            block9: {
                ae ae2;
                float f11;
                block8: {
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
                    if (n2 == 0) {
                        float f14;
                        if (f11 < 0) {
                            this.a = f10;
                        }
                        f11 = (f14 = this.b - f10) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    }
                    if (n2 != 0) break block8;
                    if (f11 < 0) {
                        this.b = f10;
                    }
                    ae2 = this;
                    if (n2 != 0) break block9;
                    float f15 = ae2.d - f10;
                    f11 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                }
                if (f11 >= 0) break block10;
                ae2 = this;
            }
            ae2.d = f10;
        }
    }

    static {
        if (ae.g() != 0) {
            ae.b(78);
        }
    }

    public final void b(float[] arrf) {
        arrf[0] = this.c;
        arrf[1] = this.a;
        arrf[2] = this.b;
        arrf[3] = this.d;
    }

    public final void e(float f10) {
        this.c *= f10;
        this.a *= f10;
        this.b *= f10;
        this.d *= f10;
    }

    public ae(gS gS2) {
        this.c = (float)gS2.c;
        this.a = (float)gS2.a;
        this.b = (float)gS2.b;
        this.d = (float)gS2.d;
    }

    public final void a(float f10, ae ae2, ae ae3) {
        this.c = f10 * ae2.c + ae3.c;
        this.a = f10 * ae2.a + ae3.a;
        this.b = f10 * ae2.b + ae3.b;
        this.d = f10 * ae2.d + ae3.d;
    }

    public final void f(float f10) {
        this.d = f10;
    }

    public final void e(ae ae2) {
        ae2.c = this.c;
        ae2.a = this.a;
        ae2.b = this.b;
        ae2.d = this.d;
    }

    public final void b(float f10, ae ae2) {
        block19: {
            block17: {
                ae ae3;
                block18: {
                    int n2;
                    block16: {
                        block14: {
                            ae ae4;
                            block15: {
                                block13: {
                                    block11: {
                                        ae ae5;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    ae ae6;
                                                    block9: {
                                                        n2 = ae.f();
                                                        ae6 = ae2;
                                                        if (n2 == 0) break block8;
                                                        if (!(ae6.c < f10)) break block9;
                                                        this.c = f10;
                                                        if (n2 != 0) break block10;
                                                    }
                                                    ae6 = this;
                                                }
                                                ae6.c = ae2.c;
                                            }
                                            ae5 = ae2;
                                            if (n2 == 0) break block11;
                                            if (!(ae5.a < f10)) break block12;
                                            this.a = f10;
                                            if (n2 != 0) break block13;
                                        }
                                        ae5 = this;
                                    }
                                    ae5.a = ae2.a;
                                }
                                ae4 = ae2;
                                if (n2 == 0) break block14;
                                if (!(ae4.b < f10)) break block15;
                                this.b = f10;
                                if (n2 != 0) break block16;
                            }
                            ae4 = this;
                        }
                        ae4.b = ae2.b;
                    }
                    ae3 = ae2;
                    if (n2 == 0) break block17;
                    if (!(ae3.d < f10)) break block18;
                    this.d = f10;
                    if (n2 != 0) break block19;
                }
                ae3 = this;
            }
            ae3.d = ae2.d;
        }
    }

    public final void a(float[] arrf) {
        this.c = arrf[0];
        this.a = arrf[1];
        this.b = arrf[2];
        this.d = arrf[3];
    }

    public String toString() {
        return "(" + this.c + ", " + this.a + ", " + this.b + ", " + this.d + ")";
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.c = f10;
        this.a = f11;
        this.b = f12;
        this.d = f13;
    }

    public final void c(ae ae2) {
        this.c -= ae2.c;
        this.a -= ae2.a;
        this.b -= ae2.b;
        this.d -= ae2.d;
    }

    public final void b(ae ae2, ae ae3) {
        this.c = ae2.c + ae3.c;
        this.a = ae2.a + ae3.a;
        this.b = ae2.b + ae3.b;
        this.d = ae2.d + ae3.d;
    }

    public final void f(ae ae2) {
        this.c = -ae2.c;
        this.a = -ae2.a;
        this.b = -ae2.b;
        this.d = -ae2.d;
    }

    public final void c(float f10) {
        this.c = f10;
    }

    public static int f() {
        int n2 = ae.g();
        if (n2 == 0) {
            return 3;
        }
        return 0;
    }

    public final void h() {
        this.c = -this.c;
        this.a = -this.a;
        this.b = -this.b;
        this.d = -this.d;
    }

    public static int g() {
        return e;
    }

    public final void b(float f10) {
        this.a = f10;
    }

    public final void a(float f10) {
        block10: {
            block9: {
                ae ae2;
                float f11;
                block8: {
                    int n2 = ae.f();
                    float f12 = this.c - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (n2 != 0) {
                        float f13;
                        if (f11 > 0) {
                            this.c = f10;
                        }
                        f11 = (f13 = this.a - f10) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    }
                    if (n2 != 0) {
                        float f14;
                        if (f11 > 0) {
                            this.a = f10;
                        }
                        f11 = (f14 = this.b - f10) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    }
                    if (n2 == 0) break block8;
                    if (f11 > 0) {
                        this.b = f10;
                    }
                    ae2 = this;
                    if (n2 == 0) break block9;
                    float f15 = ae2.d - f10;
                    f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                }
                if (f11 <= 0) break block10;
                ae2 = this;
            }
            ae2.d = f10;
        }
    }

    public final float c() {
        return this.a;
    }

    public final void b(ae ae2) {
        this.c = ae2.c;
        this.a = ae2.a;
        this.b = ae2.b;
        this.d = ae2.d;
    }

    public final void a(float f10, float f11) {
        block29: {
            block30: {
                ae ae2;
                float f12;
                block27: {
                    int n2;
                    block28: {
                        block26: {
                            float f13;
                            block25: {
                                block23: {
                                    float f14;
                                    block24: {
                                        block22: {
                                            float f15;
                                            block21: {
                                                block19: {
                                                    float f16;
                                                    block20: {
                                                        block18: {
                                                            float f17;
                                                            block17: {
                                                                block15: {
                                                                    float f18;
                                                                    block16: {
                                                                        n2 = ae.g();
                                                                        float f19 = this.c - f11;
                                                                        f12 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                                                        if (n2 != 0) break block15;
                                                                        if (f12 <= 0) break block16;
                                                                        this.c = f11;
                                                                        if (n2 == 0) break block17;
                                                                    }
                                                                    f12 = (f18 = this.c - f10) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                                                }
                                                                if (n2 != 0) break block18;
                                                                if (f12 < 0) {
                                                                    this.c = f10;
                                                                }
                                                            }
                                                            f12 = (f17 = this.a - f11) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                        }
                                                        if (n2 != 0) break block19;
                                                        if (f12 <= 0) break block20;
                                                        this.a = f11;
                                                        if (n2 == 0) break block21;
                                                    }
                                                    f12 = (f16 = this.a - f10) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                }
                                                if (n2 != 0) break block22;
                                                if (f12 < 0) {
                                                    this.a = f10;
                                                }
                                            }
                                            f12 = (f15 = this.b - f11) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                        }
                                        if (n2 != 0) break block23;
                                        if (f12 <= 0) break block24;
                                        this.b = f11;
                                        if (n2 == 0) break block25;
                                    }
                                    f12 = (f14 = this.b - f10) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                }
                                if (n2 != 0) break block26;
                                if (f12 < 0) {
                                    this.b = f10;
                                }
                            }
                            f12 = (f13 = this.d - f11) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        }
                        if (n2 != 0) break block27;
                        if (f12 <= 0) break block28;
                        this.d = f11;
                        if (n2 == 0) break block29;
                    }
                    ae2 = this;
                    if (n2 != 0) break block30;
                    float f20 = ae2.d - f10;
                    f12 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                }
                if (f12 >= 0) break block29;
                ae2 = this;
            }
            ae2.d = f10;
        }
    }
}

