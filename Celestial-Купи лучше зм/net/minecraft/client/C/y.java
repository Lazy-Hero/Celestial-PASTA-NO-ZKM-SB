/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.an;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a9;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class y
implements w<an> {
    private final /* synthetic */ a9 a;

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(an an2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block5: {
            boolean bl2;
            block4: {
                boolean bl3 = m.d();
                bl2 = an2.a3();
                if (bl3) break block4;
                if (bl2) break block5;
                bl2 = an2.b();
            }
            if (bl2) {
                v.M();
                this.a.a().k.a(0.0625f);
                float f17 = 0.625f;
                v.b(0.0f, -0.34375f, 0.0f);
                v.a(180.0f, 0.0f, 1.0f, 0.0f);
                v.d(0.625f, -0.625f, -0.625f);
                Q.P().X().a(an2, new d(g.G, 1), net.minecraft.client.x.d.HEAD);
                v.B();
            }
        }
    }

    public y(a9 a92) {
        this.a = a92;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

