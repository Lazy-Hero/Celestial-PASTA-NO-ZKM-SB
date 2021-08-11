/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import net.minecraft.az.i;
import net.minecraft.az.r;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.s;
import net.minecraft.client.h.f;
import net.minecraft.client.h.k;
import net.minecraft.k.h;

class d
extends s {
    private final /* synthetic */ net.minecraft.az.k u;
    private final /* synthetic */ boolean s;
    final /* synthetic */ f t;

    static net.minecraft.az.k a(d d10) {
        return d10.u;
    }

    public d(f f10, int n2, int n3, net.minecraft.az.k k2, boolean bl2) {
        this.t = f10;
        super(0, n2, n3, "");
        this.i = 24;
        this.n = 24;
        this.u = k2;
        this.s = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a0.b();
                        v0 = net.minecraft.client.h.k.d();
                        v.e();
                        var5_5 = v0;
                        var1_1.aN().b(net.minecraft.client.h.f.c());
                        v1 = var2_2;
                        v2 = this.o;
                        if (var5_5 == null) break block18;
                        if (v1 < v2) ** GOTO lbl-1000
                        v1 = var3_3;
                        v2 = this.r;
                    }
                    if (var5_5 == null) break block19;
                    if (v1 < v2) ** GOTO lbl-1000
                    v1 = var2_2;
                    v2 = this.o + this.i;
                }
                if (var5_5 == null) break block20;
                if (v1 >= v2) ** GOTO lbl-1000
                v1 = var3_3;
                if (var5_5 == null) break block21;
                v2 = this.r + this.n;
            }
            ** if (v1 >= v2) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = 1;
                ** GOTO lbl29
            }
lbl-1000:
            // 4 sources

            {
                v1 = 0;
            }
        }
        this.a = v1;
        var6_6 = 152;
        v3 = this.s;
        if (var5_5 != null) {
            if (v3 == 0) {
                var6_6 += 26;
            }
            v3 = 78;
        }
        var7_7 = v3;
        v4 = this.a;
        if (var5_5 != null) {
            if (v4 != 0) {
                var7_7 += 26;
            }
            this.a(this.o, this.r, var6_6, var7_7, this.i, this.n);
            v4 = 3;
        }
        var8_8 = v4;
        var9_9 = 3;
        v5 = this.u;
        if (var5_5 != null) {
            if (v5 instanceof i) {
                var10_10 = (i)this.u;
                var8_8 = var10_10.c();
                var9_9 = var10_10.a();
            }
            v5 = this.u;
        }
        var10_10 = v5.c().iterator();
        var11_11 = 0;
        block0: while (true) {
            v6 = var11_11;
            block1: while (v6 < var9_9) {
                var12_12 = 3 + var11_11 * 7;
                if (var5_5 == null) return;
                var13_13 = 0;
                while (var13_13 < var8_8) {
                    block24: {
                        block23: {
                            block22: {
                                v7 = var10_10;
                                if (var5_5 == null) break block22;
                                v6 = v7.hasNext() ? 1 : 0;
                                if (var5_5 == null) continue block1;
                                if (v6 == 0) break block23;
                                v7 = var10_10.next();
                            }
                            var14_14 = ((r)v7).b();
                            if (var5_5 == null) break block24;
                            if (var14_14.length != 0) {
                                var15_15 = 3 + var13_13 * 7;
                                v.M();
                                var16_16 = 0.42f;
                                var17_17 = (int)((float)(this.o + var15_15) / 0.42f - 3.0f);
                                var18_18 = (int)((float)(this.r + var12_12) / 0.42f - 3.0f);
                                v.d(0.42f, 0.42f, 1.0f);
                                v.j();
                                var1_1.Y().a(var14_14[net.minecraft.k.h.d(net.minecraft.client.h.f.a(this.t) / 30.0f) % var14_14.length], var17_17, var18_18);
                                v.y();
                                v.B();
                            }
                        }
                        ++var13_13;
                    }
                    if (var5_5 != null) continue;
                }
                ++var11_11;
                if (var5_5 != null) continue block0;
            }
            break;
        }
        v.v();
        a0.a();
    }
}

