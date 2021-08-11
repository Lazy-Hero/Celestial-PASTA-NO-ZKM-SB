/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.U.B;
import net.minecraft.a6;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.a;
import net.minecraft.u.h;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class ao
extends k {
    @Override
    public d b() {
        return net.minecraft.K.k.a(super.b(), net.minecraft.u.a.u);
    }

    public ao() {
        this.b(1);
        this.a(net.minecraft.ad.a.q);
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        j2.a(a32);
        return new t<d>(aX.SUCCESS, j2.c(a32));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        net.minecraft.K.k.a(d10, list, 1.0f);
    }

    public static boolean a(int n2) {
        int n3 = bl.g();
        boolean bl2 = n2 & 0x4000;
        if (n3 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public bE b(d d10) {
        return bE.DRINK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(d d10) {
        int n2 = bl.c();
        boolean bl2 = super.e(d10);
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = net.minecraft.K.k.a(d10).isEmpty();
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public String h(d d10) {
        return net.minecraft.ab.a.a(net.minecraft.K.k.d(d10).b("potion.effect."));
    }

    @Override
    public void a(net.minecraft.ad.a a10, a2<d> a22) {
        int n2 = bl.c();
        if (this.b(a10)) {
            for (i i2 : i.d) {
                if (i2 != net.minecraft.u.a.l) {
                    a22.add(net.minecraft.K.k.a(new d(this), i2));
                }
                if (n2 == 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d a(d var1_1, z var2_2, B var3_3) {
        block18: {
            block28: {
                block27: {
                    block23: {
                        block21: {
                            block22: {
                                block20: {
                                    block19: {
                                        var4_4 = bl.c();
                                        v0 = var3_3;
                                        if (var4_4 != 0) ** GOTO lbl6
                                        if (v0 instanceof j) {
                                            v0 = var3_3;
lbl6:
                                            // 2 sources

                                            v1 = (j)v0;
                                        } else {
                                            v1 = null;
                                        }
                                        v2 = var5_5 = v1;
                                        if (var4_4 != 0) break block19;
                                        if (v2 == null) break block20;
                                        v2 = var5_5;
                                    }
                                    v3 = v2.cw.g;
                                    if (var4_4 != 0) break block21;
                                    if (v3) break block22;
                                }
                                var1_1.b(1);
                            }
                            v3 = var5_5 instanceof net.minecraft.i.k;
                        }
                        if (var4_4 == 0) {
                            if (v3) {
                                a6.C.a((net.minecraft.i.k)var5_5, var1_1);
                            }
                            v3 = var2_2.C;
                        }
                        if (v3) break block23;
                        for (net.minecraft.K.j var7_7 : net.minecraft.K.k.a(var1_1)) {
                            block26: {
                                block25: {
                                    block24: {
                                        v4 = var7_7.g();
                                        if (var4_4 != 0) break block24;
                                        v5 = v4.g();
                                        if (var4_4 != 0) break block18;
                                        if (!v5) break block25;
                                        v4 = var7_7.g();
                                    }
                                    v4.a(var5_5, var5_5, var3_3, var7_7.h(), 1.0);
                                    if (var4_4 == 0) break block26;
                                }
                                var3_3.b(new net.minecraft.K.j(var7_7));
                            }
                            if (var4_4 == 0) continue;
                        }
                    }
                    v6 = var5_5;
                    if (var4_4 == 0) {
                        if (v6 != null) {
                            var5_5.b(m.b(this));
                        }
                        v6 = var5_5;
                    }
                    if (var4_4 != 0) break block27;
                    if (v6 == null) break block28;
                    v6 = var5_5;
                }
                v5 = v6.cw.g;
                if (var4_4 != 0) break block18;
                if (v5 != false) return var1_1;
            }
            v7 = var1_1;
            if (var4_4 != 0) return v7;
            v5 = v7.G();
        }
        if (v5) {
            v7 = new d(net.minecraft.u.h.ch);
            return v7;
        }
        v8 = var5_5;
        if (var4_4 == 0) {
            if (v8 == null) return var1_1;
            v8 = var5_5;
        }
        v8.cB.b(new d(net.minecraft.u.h.ch));
        return var1_1;
    }

    @Override
    public int g(d d10) {
        return 32;
    }
}

