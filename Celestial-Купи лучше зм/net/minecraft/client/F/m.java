/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.F;
import net.minecraft.N.G;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.F.h;
import net.minecraft.client.F.l;
import net.minecraft.w.bl;

public class m
extends l {
    private static final /* synthetic */ v l;

    @Override
    protected int a(double d10) {
        return super.a(d10) + 1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        l = new v("textures/entity/end_gateway_beam.png");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(F var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
        block4: {
            block2: {
                block3: {
                    v0 = net.minecraft.client.F.f.b();
                    net.minecraft.client.a.v.C();
                    var11_8 = v0;
                    var12_9 = (G)var1_1;
                    v1 = var12_9.g();
                    if (var11_8 == null) break block2;
                    if (v1) break block3;
                    v1 = var12_9.e();
                    if (var11_8 == null) break block2;
                    if (!v1) break block4;
                }
                net.minecraft.client.a.v.a(516, 0.1f);
                this.b(m.l);
                v2 = var12_9;
                if (var11_8 == null) ** GOTO lbl22
                v1 = v2.g();
            }
            if (v1) {
                v3 = var12_9.a(var8_5);
            } else {
                v2 = var12_9;
lbl22:
                // 2 sources

                v3 = v2.b(var8_5);
            }
            var13_10 = v3;
            var14_11 = var12_9.g() != false ? 256.0 - var4_3 : 50.0;
            var13_10 = net.minecraft.k.h.g(var13_10 * 3.1415927f);
            var16_12 = net.minecraft.k.h.f((double)var13_10 * var14_11);
            var17_13 = var12_9.g() != false ? bl.MAGENTA.f() : bl.PURPLE.f();
            h.a(var2_2, var4_3, var6_4, var8_5, var13_10, var12_9.d().r(), 0, var16_12, var17_13, 0.15, 0.175);
            h.a(var2_2, var4_3, var6_4, var8_5, var13_10, var12_9.d().r(), 0, -var16_12, var17_13, 0.15, 0.175);
        }
        super.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6, var10_7);
        net.minecraft.client.a.v.o();
    }

    @Override
    protected float a() {
        return 1.0f;
    }
}

