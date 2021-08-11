/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.S;
import net.minecraft.W.as;
import net.minecraft.ar.aA;
import net.minecraft.client.F.c;
import net.minecraft.client.F.f;
import net.minecraft.client.a.v;
import net.minecraft.client.r.al;
import net.minecraft.client.w.av;

public class q
extends f<S> {
    private final /* synthetic */ av a;

    public q(av av2) {
        this.a = av2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(S var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
        block21: {
            block20: {
                block19: {
                    block17: {
                        block18: {
                            var12_8 = aA.UP;
                            var11_9 = net.minecraft.client.F.f.b();
                            v0 = var1_1.h();
                            if (var11_9 == null) break block17;
                            if (v0 == 0) break block18;
                            var13_10 = this.c().d(var1_1.j());
                            v0 = var13_10.b() instanceof as;
                            if (var11_9 == null) break block17;
                            if (v0 != 0) {
                                var12_8 = var13_10.b(as.z);
                            }
                        }
                        v.t();
                        v.o(515);
                        v.a(true);
                        v.E();
                        v0 = var9_6;
                    }
                    if (var11_9 == null) break block19;
                    if (v0 < 0) break block20;
                    this.b(q.c[var9_6]);
                    v.q(5890);
                    v.M();
                    v.d(4.0f, 4.0f, 1.0f);
                    v.b(0.0625f, 0.0625f, 0.0625f);
                    v0 = 5888;
                }
                v.q(v0);
                if (var11_9 != null) break block21;
            }
            this.b(al.z[var1_1.l().e()]);
        }
        v.M();
        v.q();
        if (var11_9 != null) {
            if (var9_6 < 0) {
                v.b(1.0f, 1.0f, 1.0f, var10_7);
            }
            v.b((float)var2_2 + 0.5f, (float)var4_3 + 1.5f, (float)var6_4 + 0.5f);
            v.d(1.0f, -1.0f, -1.0f);
            v.b(0.0f, 1.0f, 0.0f);
        }
        var13_11 = 0.9995f;
        v.d(0.9995f, 0.9995f, 0.9995f);
        v.b(0.0f, -1.0f, 0.0f);
        if (var11_9 == null) ** GOTO lbl67
        switch (net.minecraft.client.F.c.a[var12_8.ordinal()]) {
            case 1: {
                v.b(0.0f, 2.0f, 0.0f);
                v.a(180.0f, 1.0f, 0.0f, 0.0f);
            }
            default: {
                if (var11_9 != null) break;
            }
            case 3: {
                v.b(0.0f, 1.0f, 1.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.a(180.0f, 0.0f, 0.0f, 1.0f);
                if (var11_9 != null) break;
            }
            case 4: {
                v.b(0.0f, 1.0f, -1.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                if (var11_9 != null) break;
            }
            case 5: {
                v.b(-1.0f, 1.0f, 0.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.a(-90.0f, 0.0f, 0.0f, 1.0f);
                if (var11_9 != null) break;
            }
            case 6: {
                v.b(1.0f, 1.0f, 0.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
lbl67:
                // 2 sources

                v.a(90.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        this.a.k.b(0.0625f);
        v.b(0.0f, -var1_1.a(var8_5) * 0.5f, 0.0f);
        v.a(270.0f * var1_1.a(var8_5), 0.0f, 1.0f, 0.0f);
        this.a.j.b(0.0625f);
        v.c();
        v.u();
        v.B();
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        v1 = var9_6;
        if (var11_9 != null) {
            if (v1 < 0) return;
            v.q(5890);
            v.B();
            v1 = 5888;
        }
        v.q(v1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

