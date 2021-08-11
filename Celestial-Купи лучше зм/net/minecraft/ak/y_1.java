/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ag.R;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.ar.aA;
import net.minecraft.e.a;
import net.minecraft.e.k;
import net.minecraft.i.j;
import net.minecraft.k.n;

public class y
extends h {
    /* synthetic */ z h;
    private final /* synthetic */ double g;
    /* synthetic */ float k;
    private /* synthetic */ float e;
    private /* synthetic */ B f;
    private /* synthetic */ int d;
    /* synthetic */ float j;
    private final /* synthetic */ net.minecraft.e.i i;
    private final /* synthetic */ R c;

    @Override
    public void a() {
        this.d = 0;
        this.e = this.c.a(a.WATER);
        this.c.a(a.WATER, 0.0f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        v0 = net.minecraft.ak.h.h();
        this.c.I().a(this.f, 10.0f, (float)this.c.j());
        var1_1 = v0;
        v1 = this.c.D();
        if (var1_1 == null) {
            if (v1 != 0) return;
            v1 = this.d = this.d - 1;
        }
        if (var1_1 == null) {
            if (v1 > 0) return;
            this.d = 10;
            v1 = this.i.a(this.f, this.g) ? 1 : 0;
        }
        if (var1_1 == null) {
            if (v1 != 0) return;
            v1 = this.c.O() ? 1 : 0;
        }
        if (var1_1 == null) {
            if (v1 != 0) return;
            v1 = this.c.N() ? 1 : 0;
        }
        if (var1_1 == null) {
            if (v1 != 0) return;
            cfr_temp_0 = this.c.s(this.f) - 144.0;
            v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        }
        if (var1_1 == null) {
            if (v1 < 0) return;
            v1 = net.minecraft.k.h.f(this.f.a) - 2;
        }
        var2_2 = v1;
        var3_3 = net.minecraft.k.h.f(this.f.ax) - 2;
        var4_4 = net.minecraft.k.h.f(this.f.m().b);
        var5_5 = 0;
        do {
            v2 = var5_5;
            v3 = 4;
            block1: while (true) {
                if (v2 > v3) return;
                for (var6_6 = 0; var6_6 <= 4; ++var6_6) {
                    block22: {
                        block20: {
                            block21: {
                                v4 = var5_5;
                                if (var1_1 != null) break block20;
                                v3 = 1;
                                if (var1_1 != null) continue block1;
                                if (v4 < v3) break block21;
                                v4 = var6_6;
                                if (var1_1 != null) break block20;
                                if (v4 < 1) break block21;
                                v4 = var5_5;
                                if (var1_1 == null) {
                                    if (v4 <= 3) {
                                        v4 = var6_6;
                                        if (var1_1 == null) {
                                            if (v4 <= 3) continue;
                                        } else {
                                            ** GOTO lbl51
                                        }
                                    } else {
                                        ** GOTO lbl50
                                    }
                                }
                                break block20;
lbl50:
                                // 2 sources

                                break block21;
lbl51:
                                // 2 sources

                                break block20;
                            }
                            v5 = this;
                            if (var1_1 != null) break block22;
                            v4 = v5.a(var2_2, var3_3, var4_4, var5_5, var6_6) ? 1 : 0;
                        }
                        if (v4 == 0) continue;
                        this.c.c((float)(var2_2 + var5_5) + 0.5f, var4_4, (float)(var3_3 + var6_6) + 0.5f, this.c.e, this.c.at);
                        v5 = this;
                    }
                    v5.i.f();
                    return;
                }
                break;
            }
            ++var5_5;
        } while (var1_1 == null);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        int n2 = this.i.o();
        if (string == null) {
            if (n2 != 0) return 0 != 0;
            double d10 = this.c.s(this.f) - (double)(this.j * this.j);
            n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (n2 <= 0) return 0 != 0;
            n2 = this.c.D() ? 1 : 0;
        }
        if (string != null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        return 1 != 0;
    }

    public y(R r2, double d10, float f10, float f11) {
        block5: {
            boolean bl2;
            block4: {
                this.c = r2;
                this.h = r2.aG;
                this.g = d10;
                this.i = r2.l();
                this.k = f10;
                String string = net.minecraft.ak.h.h();
                this.j = f11;
                this.a(3);
                bl2 = r2.l() instanceof k;
                if (string != null) break block4;
                if (bl2) break block5;
                bl2 = r2.l() instanceof net.minecraft.e.j;
            }
            if (!bl2) {
                throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        var2_1 = this.c.a();
        var1_2 = net.minecraft.ak.h.h();
        v0 = var2_1;
        if (var1_2 == null) {
            if (v0 == null) {
                return false;
            }
            v0 = var2_1;
        }
        v1 = v0 instanceof j;
        if (var1_2 == null) {
            if (v1) {
                v1 = ((j)var2_1).ae();
                if (var1_2 == null) {
                    if (v1) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.c.D();
            }
        }
        if (var1_2 == null) {
            if (v1) {
                return false;
            }
            cfr_temp_0 = this.c.s(var2_1) - (double)(this.k * this.k);
            v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
        }
        if (var1_2 != null) return v1;
        if (v1 < false) {
            return false;
        }
        this.f = var2_1;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(int n2, int n3, int n4, int n5, int n6) {
        i i2;
        n n7 = new n(n2 + n5, n4 - 1, n3 + n6);
        String string = net.minecraft.ak.h.h();
        i i3 = i2 = this.h.d(n7);
        y y2 = this;
        if (string == null) {
            if (i3.c(y2.h, n7, aA.DOWN) != net.minecraft.Z.d.SOLID) return false;
            i3 = i2;
            y2 = this;
        }
        boolean bl2 = i3.a(y2.c);
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.h.a(n7.a());
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.h.a(n7.c(2));
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void g() {
        this.f = null;
        this.i.f();
        this.c.a(a.WATER, this.e);
    }
}

