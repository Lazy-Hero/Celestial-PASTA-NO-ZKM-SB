/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ag.V;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.v;
import net.minecraft.client.r.an;

public class a
implements w<V> {
    private static final /* synthetic */ net.minecraft.ar.v b;
    private final /* synthetic */ an a;

    @Override
    public void a(V v2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block6: {
            V v3;
            boolean bl2;
            block7: {
                boolean bl3;
                block5: {
                    bl2 = m.c();
                    bl3 = v2.U();
                    if (!bl2) break block5;
                    if (!bl3) break block6;
                    v3 = v2;
                    if (!bl2) break block7;
                    bl3 = v3.a3();
                }
                if (bl3) break block6;
                this.a.b(b);
                v3 = v2;
            }
            float[] arrf = v3.F().f();
            if (bl2) {
                if (fU.g()) {
                    arrf = fa.b(v2.F(), arrf);
                }
                v.c(arrf[0], arrf[1], arrf[2]);
            }
            this.a.b().b(v2, f10, f11, f13, f14, f15, f16);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a() {
        return true;
    }

    public a(an an2) {
        this.a = an2;
    }

    static {
        b = new net.minecraft.ar.v("textures/entity/wolf/wolf_collar.png");
    }
}

