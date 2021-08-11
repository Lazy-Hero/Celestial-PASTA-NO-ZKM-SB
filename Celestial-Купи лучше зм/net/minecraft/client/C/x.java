/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.aR;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.r.J;
import net.minecraft.client.w.C;

public class x
implements w<aR> {
    private final /* synthetic */ C c;
    private static final /* synthetic */ v a;
    private final /* synthetic */ J b;

    @Override
    public boolean a() {
        return false;
    }

    static {
        a = new v("textures/entity/creeper/creeper_armor.png");
    }

    @Override
    public void a(aR aR2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block5: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            block4: {
                bl4 = m.d();
                bl3 = aR2.y();
                if (bl4) break block4;
                if (!bl3) break block5;
                bl3 = aR2.a3();
            }
            boolean bl5 = bl2 = bl3;
            if (!bl4) {
                bl5 = !bl5;
            }
            net.minecraft.client.a.v.a(bl5);
            this.b.b(a);
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.l();
            float f17 = (float)aR2.H + f12;
            net.minecraft.client.a.v.b(f17 * 0.01f, f17 * 0.01f, 0.0f);
            net.minecraft.client.a.v.q(5888);
            net.minecraft.client.a.v.a();
            float f18 = 0.5f;
            net.minecraft.client.a.v.b(0.5f, 0.5f, 0.5f, 1.0f);
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.a(o.ONE, G.ONE);
            this.c.a(this.b.b());
            Q.P().Y.a(true);
            this.c.b(aR2, f10, f11, f13, f14, f15, f16);
            Q.P().Y.a(false);
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.l();
            net.minecraft.client.a.v.q(5888);
            net.minecraft.client.a.v.j();
            net.minecraft.client.a.v.f();
            net.minecraft.client.a.v.a(bl2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public x(J j2) {
        this.c = new C(2.0f);
        this.b = j2;
    }
}

