/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.y;

import javax.annotation.Nullable;
import net.minecraft.T.a4;
import net.minecraft.U.a;
import net.minecraft.ah.E;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.y.b;
import net.minecraft.y.g;

public class e {
    private /* synthetic */ int e;
    private /* synthetic */ int g;
    private /* synthetic */ int i;
    private /* synthetic */ int f;
    private /* synthetic */ int a;
    private /* synthetic */ int d;
    private final /* synthetic */ z b;
    private /* synthetic */ boolean h;
    private /* synthetic */ g c;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void c() {
        block27: {
            block26: {
                block25: {
                    block24: {
                        block22: {
                            block23: {
                                var1_1 = net.minecraft.y.b.f();
                                v0 = this.b.R();
                                if (var1_1 == null) {
                                    if (v0 != 0) {
                                        this.g = 0;
                                        if (var1_1 == null) return;
                                    }
                                    v0 = this.g;
                                }
                                if (var1_1 == null) {
                                    if (v0 == 2) return;
                                    v0 = this.g;
                                }
                                if (var1_1 != null) break block22;
                                if (v0 != 0) break block23;
                                var2_2 = this.b.h(0.0f);
                                cfr_temp_0 = (double)var2_2 - 0.5;
                                v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                if (var1_1 == null) {
                                    if (v1 < 0) return;
                                    cfr_temp_1 = (double)var2_2 - 0.501;
                                    v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                }
                                if (v1 > 0) {
                                    return;
                                }
                                v2 = this.b.J.nextInt(10);
                                if (var1_1 == null) {
                                    v2 = v2 == 0 ? 1 : 2;
                                }
                                this.g = v2;
                                this.h = false;
                                v0 = this.g;
                                v3 = 2;
                                if (var1_1 == null) {
                                    if (v0 == v3) {
                                        return;
                                    } else {
                                        ** GOTO lbl33
                                    }
                                }
                                break block24;
                            }
                            v0 = this.g;
                        }
                        if (var1_1 != null) break block25;
                        v3 = -1;
                    }
                    if (v0 == v3) return;
                    v0 = this.h ? 1 : 0;
                }
                if (var1_1 == null) {
                    if (v0 == 0) {
                        v4 = this;
                        if (var1_1 == null) {
                            if (!v4.a()) {
                                return;
                            }
                            v4 = this;
                        }
                        v4.h = true;
                    }
                    v0 = this.a;
                }
                if (var1_1 != null) break block26;
                if (v0 > 0) {
                    --this.a;
                    if (var1_1 == null) return;
                }
                this.a = 2;
                v5 = this;
                if (var1_1 != null) break block27;
                v0 = v5.e;
            }
            if (v0 > 0) {
                this.b();
                --this.e;
                if (var1_1 == null) return;
            }
            v5 = this;
        }
        v5.g = 2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a() {
        var2_1 = this.b.k;
        var1_2 = net.minecraft.y.b.f();
        var3_3 = var2_1.iterator();
        do lbl-1000:
        // 7 sources

        {
            v0 = var3_3;
            block1: while (true) {
                if (!v0.hasNext()) {
                    return false;
                }
                v1 = var4_4 = var3_3.next();
                block2: while (true) {
                    block13: {
                        block12: {
                            block11: {
                                block10: {
                                    block9: {
                                        if (var1_2 != null) break block9;
                                        if (var4_4.ae()) ** GOTO lbl-1000
                                        this.c = this.b.n().a(new n(var4_4), 1);
                                    }
                                    v2 = this.c;
                                    if (var1_2 != null) break block10;
                                    if (v2 == null) ** GOTO lbl-1000
                                    v2 = this.c;
                                }
                                v3 = v2.n();
                                v4 = 10;
                                if (var1_2 != null) break block11;
                                if (v3 < v4) ** GOTO lbl-1000
                                v3 = this.c.k();
                                v4 = 20;
                            }
                            if (var1_2 != null) break block12;
                            if (v3 < v4) ** GOTO lbl-1000
                            v5 = this.c;
                            if (var1_2 != null) break block13;
                            v3 = v5.m();
                            v4 = 20;
                        }
                        if (v3 < v4) ** GOTO lbl-1000
                        v5 = this.c;
                    }
                    var5_5 = v5.b();
                    var6_6 = this.c.j();
                    var7_7 = false;
                    for (var8_8 = 0; var8_8 < 10; ++var8_8) {
                        var9_10 = this.b.J.nextFloat() * 6.2831855f;
                        this.f = var5_5.e() + (int)((double)(net.minecraft.k.h.c(var9_10) * var6_6) * 0.9);
                        this.d = var5_5.b();
                        this.i = var5_5.a() + (int)((double)(net.minecraft.k.h.g(var9_10) * var6_6) * 0.9);
                        var7_7 = false;
                        v0 = this.b.n().e().iterator();
                        if (var1_2 != null) continue block1;
                        var10_11 = v0;
                        while (var10_11.hasNext()) {
                            block15: {
                                block16: {
                                    block14: {
                                        var11_12 = (g)var10_11.next();
                                        v1 = var11_12;
                                        if (var1_2 != null) continue block2;
                                        if (var1_2 != null) break block14;
                                        if (v1 == this.c) break block15;
                                        v6 = var11_12;
                                    }
                                    v7 = v6.c(new n(this.f, this.d, this.i));
                                    if (var1_2 != null) break block16;
                                    if (!v7) break block15;
                                    v7 = var7_7 = true;
                                }
                                if (var1_2 == null) break;
                            }
                            if (var1_2 == null) continue;
                        }
                        if (!var7_7 && var1_2 == null) break block1;
                        if (var1_2 == null) continue;
                    }
                    break;
                }
                break;
            }
            v8 = var7_7;
            if (var1_2 != null) return v8;
            if (!v8) continue;
            return false;
        } while ((var8_9 = this.a(new n(this.f, this.d, this.i))) == null || var1_2 != null);
        this.a = 0;
        this.e = 20;
        return true;
    }

    @Nullable
    private l a(n n2) {
        int n3 = 0;
        String string = net.minecraft.y.b.f();
        while (n3 < 10) {
            n n4 = n2.a(this.b.J.nextInt(16) - 8, this.b.J.nextInt(6) - 3, this.b.J.nextInt(16) - 8);
            if (string == null) {
                if (this.c.c(n4) && E.a(net.minecraft.U.a.ON_GROUND, this.b, n4)) {
                    return new l(n4.e(), n4.b(), n4.a());
                }
                ++n3;
            }
            if (string == null) continue;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private boolean b() {
        a4 a42;
        l l2 = this.a(new n(this.f, this.d, this.i));
        if (l2 == null) {
            return false;
        }
        try {
            a42 = new a4(this.b);
            a42.a(this.b.h(new n(a42)), null);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        a42.c(l2.e, l2.d, l2.b, this.b.J.nextFloat() * 360.0f, 0.0f);
        this.b.f(a42);
        n n2 = this.c.b();
        a42.a(n2, this.c.j());
        return true;
    }

    public e(z z2) {
        this.g = -1;
        this.b = z2;
    }
}

