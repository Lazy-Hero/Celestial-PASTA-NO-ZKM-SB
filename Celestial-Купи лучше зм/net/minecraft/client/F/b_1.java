/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.W.bq;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class b
implements g {
    private final /* synthetic */ Q b;
    private /* synthetic */ double d;
    private /* synthetic */ double e;
    private /* synthetic */ j a;
    private /* synthetic */ double c;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(float var1_1, long var2_2) {
        block6: {
            this.a = this.b.s;
            this.c = this.a.am + (this.a.a - this.a.am) * (double)var1_1;
            this.e = this.a.af + (this.a.aF - this.a.af) * (double)var1_1;
            this.d = this.a.n + (this.a.ax - this.a.n) * (double)var1_1;
            var5_3 = this.b.s.f();
            var6_4 = this.b.s.aG;
            v0 = f.c();
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            v.b(0.0f, 1.0f, 0.0f, 0.75f);
            var4_5 = v0;
            v.L();
            v.d(6.0f);
            var7_6 = n.b(var5_3.a(-10, -10, -10), var5_3.a(10, 10, 10)).iterator();
            while (var7_6.hasNext()) {
                block9: {
                    block7: {
                        block8: {
                            var8_7 = var7_6.next();
                            v1 = var9_8 = var6_4.d(var8_7);
                            if (var4_5 == 0) break block7;
                            v2 = v1.b();
                            v3 = net.minecraft.u.g.bQ;
                            if (var4_5 == 0) ** GOTO lbl40
                            if (v2 == v3) break block8;
                            v1 = var9_8;
                            if (var4_5 == 0) break block7;
                            if (v1.b() != net.minecraft.u.g.cL) break block9;
                        }
                        v1 = var9_8;
                    }
                    var10_9 = bq.b(v1, var6_4, var8_7);
                    aF.a(new k((float)var8_7.e() + 0.01f, (float)var8_7.b() + 0.01f, (float)var8_7.a() + 0.01f, (float)var8_7.e() + 0.99f, var10_9, (float)var8_7.a() + 0.99f).c(-this.c, -this.e, -this.d), 1.0f, 1.0f, 1.0f, 0.2f);
                }
                if (var4_5 != 0) continue;
            }
            for (n var8_7 : n.b(var5_3.a(-10, -10, -10), var5_3.a(10, 10, 10))) {
                block12: {
                    block10: {
                        block11: {
                            var9_8 = var6_4.d(var8_7);
                            if (var4_5 == 0) break block6;
                            v4 = var9_8;
                            if (var4_5 == 0) break block10;
                            v2 = v4.b();
                            v3 = net.minecraft.u.g.bQ;
lbl40:
                            // 2 sources

                            if (v2 == v3) break block11;
                            v4 = var9_8;
                            if (var4_5 == 0) break block10;
                            if (v4.b() != net.minecraft.u.g.cL) break block12;
                        }
                        v4 = var9_8;
                    }
                    var11_11 = (var10_10 = v4.b(bq.z)) > 7 ? 0.9 : 1.0 - 0.11 * (double)var10_10.intValue();
                    var13_12 = var9_8.b() == net.minecraft.u.g.cL ? "f" : "s";
                    f.a(var13_12 + " " + var10_10, (double)var8_7.e() + 0.5, (double)var8_7.b() + var11_11, (double)var8_7.a() + 0.5, var1_1, -16777216);
                }
                if (var4_5 != 0) continue;
            }
            v.x();
            v.f();
        }
        if (m.c() == false) return;
        f.b(++var4_5);
    }

    public b(Q q2) {
        this.b = q2;
    }
}

