/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class w
extends s {
    protected /* synthetic */ int u;
    protected /* synthetic */ int v;
    protected /* synthetic */ int w;
    protected /* synthetic */ net.minecraft.ar.v x;
    protected /* synthetic */ boolean s;
    protected /* synthetic */ int t;

    public boolean a() {
        return this.s;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a(int n2, int n3, int n4, int n5, net.minecraft.ar.v v2) {
        this.v = n2;
        this.w = n3;
        this.t = n4;
        this.u = n5;
        this.x = v2;
    }

    public w(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        super(n2, n3, n4, n5, n6, "");
        this.s = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                var5_5 = q.b();
                                v0 = this;
                                if (var5_5 != null) {
                                    if (v0.l == false) return;
                                    v0 = this;
                                }
                                v1 = var2_2;
                                v2 = this.o;
                                if (var5_5 == null) break block11;
                                if (v1 < v2) ** GOTO lbl-1000
                                v1 = var3_3;
                                v2 = this.r;
                            }
                            if (var5_5 == null) break block12;
                            if (v1 < v2) ** GOTO lbl-1000
                            v1 = var2_2;
                            v2 = this.o + this.i;
                        }
                        if (var5_5 == null) break block13;
                        if (v1 >= v2) ** GOTO lbl-1000
                        v1 = var3_3;
                        if (var5_5 == null) break block14;
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
                v0.a = v1;
                var1_1.aN().b(this.x);
                net.minecraft.client.a.v.n();
                var6_6 = this.v;
                var7_7 = this.w;
                v3 = this.s;
                if (var5_5 == null) break block15;
                if (v3) {
                    var6_6 += this.t;
                }
                v4 = this;
                if (var5_5 == null) break block16;
                v3 = v4.a;
            }
            if (v3) {
                var7_7 += this.u;
            }
            v4 = this;
        }
        v4.a(this.o, this.r, var6_6, var7_7, this.i, this.n);
        net.minecraft.client.a.v.t();
    }

    public void a(boolean bl2) {
        this.s = bl2;
    }

    public void c(int n2, int n3) {
        this.o = n2;
        this.r = n3;
    }
}

