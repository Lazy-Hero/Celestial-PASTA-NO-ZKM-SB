/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.r.aF;
import net.minecraft.client.w.an;
import net.minecraft.h.c;
import net.minecraft.k.h;

public class t
implements w<c> {
    private final /* synthetic */ an a;
    private final /* synthetic */ aF b;
    private static final /* synthetic */ v c;

    public t(aF aF2) {
        this.a = new an(0.5f);
        this.b = aF2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(c c10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block5: {
            boolean bl2;
            boolean bl3;
            block4: {
                bl3 = m.d();
                bl2 = c10.f();
                if (bl3) break block4;
                if (!bl2) break block5;
                bl2 = c10.a3();
            }
            if (!bl3) {
                bl2 = !bl2;
            }
            net.minecraft.client.a.v.a(bl2);
            this.b.b(c);
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.l();
            float f17 = (float)c10.H + f12;
            float f18 = h.c(f17 * 0.02f) * 3.0f;
            float f19 = f17 * 0.01f;
            net.minecraft.client.a.v.b(f18, f19, 0.0f);
            net.minecraft.client.a.v.q(5888);
            net.minecraft.client.a.v.a();
            float f20 = 0.5f;
            net.minecraft.client.a.v.b(0.5f, 0.5f, 0.5f, 1.0f);
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.a(o.ONE, G.ONE);
            this.a.a(c10, f10, f11, f12);
            this.a.a(this.b.b());
            Q.P().Y.a(true);
            this.a.b(c10, f10, f11, f13, f14, f15, f16);
            Q.P().Y.a(false);
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.l();
            net.minecraft.client.a.v.q(5888);
            net.minecraft.client.a.v.j();
            net.minecraft.client.a.v.f();
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    static {
        c = new v("textures/entity/wither/wither_armor.png");
    }
}

