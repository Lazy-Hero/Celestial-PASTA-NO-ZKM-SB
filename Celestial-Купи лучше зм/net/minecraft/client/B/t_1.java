/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class t
extends s {
    private final /* synthetic */ int s;
    private final /* synthetic */ int u;
    private final /* synthetic */ int v;
    private final /* synthetic */ net.minecraft.ar.v t;

    public void c(int n2, int n3) {
        this.o = n2;
        this.r = n3;
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
        block10: {
            block9: {
                block8: {
                    block7: {
                        var5_5 = q.b();
                        v0 = this;
                        if (var5_5 != null) {
                            if (v0.l == false) return;
                            v0 = this;
                        }
                        v1 = var2_2;
                        v2 = this.o;
                        if (var5_5 == null) break block7;
                        if (v1 < v2) ** GOTO lbl-1000
                        v1 = var3_3;
                        v2 = this.r;
                    }
                    if (var5_5 == null) break block8;
                    if (v1 < v2) ** GOTO lbl-1000
                    v1 = var2_2;
                    v2 = this.o + this.i;
                }
                if (var5_5 == null) break block9;
                if (v1 >= v2) ** GOTO lbl-1000
                v1 = var3_3;
                if (var5_5 == null) break block10;
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
        var1_1.aN().b(this.t);
        net.minecraft.client.a.v.n();
        var6_6 = this.u;
        var7_7 = this.v;
        v3 = this;
        if (var5_5 != null) {
            if (v3.a) {
                var7_7 += this.s;
            }
            v3 = this;
        }
        v3.a(this.o, this.r, var6_6, var7_7, this.i, this.n);
        net.minecraft.client.a.v.t();
    }

    public t(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, net.minecraft.ar.v v2) {
        super(n2, n3, n4, n5, n6, "");
        this.u = n7;
        this.v = n8;
        this.s = n9;
        this.t = v2;
    }
}

