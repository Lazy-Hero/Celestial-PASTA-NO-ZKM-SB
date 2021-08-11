/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.J.u;
import net.minecraft.O.c;
import net.minecraft.W.bp;
import net.minecraft.W.cL;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.aL;
import net.minecraft.w.bl;
import net.minecraft.w.k;

public class ae
extends k {
    private static final /* synthetic */ c t;
    private final /* synthetic */ net.minecraft.J.j s;

    static {
        t = new aL();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public ae(net.minecraft.J.j j2) {
        this.f = 1;
        this.s = j2;
        this.a(net.minecraft.ad.a.t);
        net.minecraft.W.a3.B.a(this, t);
    }

    static net.minecraft.J.j a(ae ae2) {
        return ae2.s;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public aX a(j var1_1, z var2_2, n var3_3, a3 var4_4, aA var5_5, float var6_6, float var7_7, float var8_8) {
        block6: {
            var10_9 = var2_2.d(var3_3);
            var9_10 = bl.c();
            if (!bp.a(var10_9)) {
                return aX.FAIL;
            }
            var11_11 = var1_1.c(var4_4);
            if (var9_10 != 0) return aX.SUCCESS;
            if (var2_2.C) break block6;
            v0 = var10_9;
            if (var9_10 != 0) ** GOTO lbl12
            if (v0.b() instanceof bp) {
                v0 = var10_9;
lbl12:
                // 2 sources

                v1 = v0.b(((bp)var10_9.b()).a());
            } else {
                v1 = cL.NORTH_SOUTH;
            }
            var12_12 = v1;
            var13_13 = 0.0;
            if (var12_12.c()) {
                var13_13 = 0.5;
            }
            var15_14 = u.a(var2_2, (double)var3_3.e() + 0.5, (double)var3_3.b() + 0.0625 + var13_13, (double)var3_3.a() + 0.5, this.s);
            v2 = var11_11.c();
            if (var9_10 == 0) {
                if (v2) {
                    var15_14.a(var11_11.g());
                }
                v2 = var2_2.f(var15_14);
            }
        }
        var11_11.b(1);
        return aX.SUCCESS;
    }
}

