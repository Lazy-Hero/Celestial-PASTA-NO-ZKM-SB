/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.ai;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a6;
import net.minecraft.client.w.aC;
import net.minecraft.client.w.j;

public class k
implements w<ai> {
    private final /* synthetic */ a6 b;
    private final /* synthetic */ j a;

    @Override
    public boolean a() {
        return true;
    }

    public k(a6 a62) {
        this.a = new aC(0);
        this.b = a62;
    }

    @Override
    public void a(ai ai2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block3: {
            block2: {
                boolean bl2 = m.c();
                if (!bl2) break block2;
                if (ai2.a3()) break block3;
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.m();
                v.a();
                v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                this.a.a(this.b.b());
                this.a.b(ai2, f10, f11, f13, f14, f15, f16);
                v.f();
            }
            v.J();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

