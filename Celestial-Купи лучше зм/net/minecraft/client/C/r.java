/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.ah;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.r.L;

public class r
implements w<ah> {
    private final /* synthetic */ L b;
    private static final /* synthetic */ v a;

    static {
        a = new v("textures/entity/enderman/enderman_eyes.png");
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public r(L l2) {
        this.b = l2;
    }

    @Override
    public void a(ah ah2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean bl2 = m.d();
        this.b.b(a);
        boolean bl3 = bl2;
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.v();
        net.minecraft.client.a.v.a(o.ONE, G.ONE);
        net.minecraft.client.a.v.y();
        boolean bl4 = ah2.a3();
        if (!bl3) {
            bl4 = !bl4;
        }
        net.minecraft.client.a.v.a(bl4);
        int n2 = 61680;
        int n3 = 61680;
        boolean bl5 = false;
        as.a(as.p, 61680.0f, 0.0f);
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        Q.P().Y.a(true);
        boolean bl6 = fU.ag();
        if (!bl3) {
            if (bl6) {
                cS.ar();
            }
            fU.ao().aB = true;
            this.b.a().b(ah2, f10, f11, f13, f14, f15, f16);
            fU.ao().aB = false;
            bl6 = fU.ag();
        }
        if (!bl3) {
            if (bl6) {
                cS.aT();
            }
            Q.P().Y.a(false);
            this.b.b(ah2);
            bl6 = true;
        }
        net.minecraft.client.a.v.a(bl6);
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.e();
        if (net.minecraft.k.m.c()) {
            m.b(!bl3);
        }
    }
}

