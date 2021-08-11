/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import java.util.UUID;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ag.R;
import net.minecraft.ah.z;
import net.minecraft.e.a;
import net.minecraft.j.f;
import net.minecraft.k.l;
import net.minecraft.k.n;

public abstract class D
extends C {
    private /* synthetic */ float cq;
    private final /* synthetic */ float cs;
    public static final /* synthetic */ UUID cr;
    private static /* synthetic */ int cv;
    private /* synthetic */ n cu;
    public static final /* synthetic */ f ct;

    public D(z z2) {
        super(z2);
        this.cu = net.minecraft.k.n.o;
        this.cq = -1.0f;
        this.cs = net.minecraft.e.a.WATER.a();
    }

    public float q() {
        return this.cq;
    }

    public static int g() {
        return cv;
    }

    protected double h() {
        return 1.0;
    }

    private static gP f(gP gP2) {
        return gP2;
    }

    public static int i() {
        int n2 = net.minecraft.U.D.g();
        if (n2 == 0) {
            return 53;
        }
        return 0;
    }

    protected void l(float f10) {
    }

    public boolean a(n n2) {
        int[] arrn = net.minecraft.U.M.b();
        float f10 = this.cq - -1.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (arrn != null) {
            if (f11 == false) {
                return true;
            }
            double d10 = this.cu.b(n2) - (double)(this.cq * this.cq);
            f11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        }
        if (arrn != null) {
            f11 = f11 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    public static void f(int n2) {
        cv = n2;
    }

    public boolean m() {
        int[] arrn = net.minecraft.U.M.b();
        float f10 = this.cq - -1.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (arrn != null) {
            f11 = f11 != false ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = super.C();
        if (arrn != null) {
            if (n2 == 0) return 0 != 0;
            float f10 = this.b(new n(this.a, this.m().b, this.ax)) - 0.0f;
            n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        }
        if (arrn == null) return n2 != 0;
        if (n2 < 0) return 0 != 0;
        return 1 != 0;
    }

    public float b(n n2) {
        return 0.0f;
    }

    public void j() {
        this.cq = -1.0f;
    }

    public boolean e() {
        return this.a(new n(this));
    }

    public n n() {
        return this.cu;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void W() {
        block15: {
            block14: {
                v0 = net.minecraft.U.M.b();
                super.W();
                var1_1 = v0;
                v1 /* !! */  = this;
                if (var1_1 != null) {
                    if (v1 /* !! */ .O() == false) return;
                    v1 /* !! */  = this.e();
                }
                if (var1_1 != null) {
                    if (v1 /* !! */  == null) return;
                    v1 /* !! */  = this.e();
                }
                if (var1_1 != null) {
                    if (v1 /* !! */ .aG != this.aG) return;
                    v1 /* !! */  = this.e();
                }
                var2_2 /* !! */  = v1 /* !! */ ;
                this.a(new n((int)var2_2 /* !! */ .a, (int)var2_2 /* !! */ .aF, (int)var2_2 /* !! */ .ax), 5);
                var3_3 = this.o(var2_2 /* !! */ );
                v2 = this instanceof R;
                if (var1_1 != null) {
                    if (v2 != 0) {
                        v2 = ((R)this).D() ? 1 : 0;
                        if (var1_1 != null) {
                            if (v2 != 0) {
                                if (!(var3_3 > 10.0f)) return;
                                this.a(true, true);
                                return;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        this.l(var3_3);
                        cfr_temp_0 = var3_3 - 10.0f;
                        v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    }
                }
                if (var1_1 == null) break block14;
                if (v2 > 0) {
                    this.a(true, true);
                    this.b5.a(1);
                    if (var1_1 != null) return;
                }
                v3 = var3_3;
                if (var1_1 == null) break block15;
                cfr_temp_1 = v3 - 6.0f;
                v2 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            }
            if (v2 > 0) {
                var4_4 = (var2_2 /* !! */ .a - this.a) / (double)var3_3;
                var6_6 = (var2_2 /* !! */ .aF - this.aF) / (double)var3_3;
                var8_7 = (var2_2 /* !! */ .ax - this.ax) / (double)var3_3;
                this.aq += var4_4 * Math.abs(var4_4) * 0.4;
                this.G += var6_6 * Math.abs(var6_6) * 0.4;
                this.d += var8_7 * Math.abs(var8_7) * 0.4;
                if (var1_1 != null) return;
            }
            this.b5.c(1);
            v3 = 2.0f;
        }
        var4_5 = v3;
        var5_8 = new l(var2_2 /* !! */ .a - this.a, var2_2 /* !! */ .aF - this.aF, var2_2 /* !! */ .ax - this.ax).d().a((double)Math.max(var3_3 - 2.0f, 0.0f));
        this.l().a(this.a + var5_8.e, this.aF + var5_8.d, this.ax + var5_8.b, this.h());
    }

    public boolean w() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.b7.o();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        cr = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
        ct = new f(cr, "Fleeing speed bonus", 2.0, 2).a(false);
        net.minecraft.U.D.f(12);
    }

    public void a(n n2, int n3) {
        this.cu = n2;
        this.cq = n3;
    }
}

