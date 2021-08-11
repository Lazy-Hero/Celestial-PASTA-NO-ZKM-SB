/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.am;
import net.minecraft.U.x;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.r.aA;

public class A<T extends am>
implements w<T> {
    private final /* synthetic */ aA<T> b;
    private static final /* synthetic */ v a;

    static {
        a = new v("textures/entity/spider_eyes.png");
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public A(aA<T> aA2) {
        this.b = aA2;
    }

    @Override
    public void a(T t2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean bl2 = m.d();
        this.b.b(a);
        boolean bl3 = bl2;
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.v();
        net.minecraft.client.a.v.a(o.ONE, G.ONE);
        boolean bl4 = ((x)t2).a3();
        if (!bl3) {
            bl4 = !bl4;
        }
        net.minecraft.client.a.v.a(bl4);
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        as.a(as.p, n3, (float)n4);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        Q.P().Y.a(true);
        int n5 = fU.ag();
        if (!bl3) {
            if (n5 != 0) {
                cS.ar();
            }
            fU.ao().aB = true;
            this.b.b().b((x)t2, f10, f11, f13, f14, f15, f16);
            fU.ao().aB = false;
            n5 = fU.ag() ? 1 : 0;
        }
        if (!bl3) {
            if (n5 != 0) {
                cS.aT();
            }
            Q.P().Y.a(false);
            n2 = ((x)t2).aS();
            n3 = n2 % 65536;
            n4 = n2 / 65536;
            n5 = as.p;
        }
        as.a(n5, n3, (float)n4);
        this.b.b(t2);
        net.minecraft.client.a.v.f();
        net.minecraft.client.a.v.e();
        if (bl3) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }
}

