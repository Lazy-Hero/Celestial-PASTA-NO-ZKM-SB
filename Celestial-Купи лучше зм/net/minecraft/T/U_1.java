/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aC;
import net.minecraft.T.aS;
import net.minecraft.T.aa;
import net.minecraft.T.ao;
import net.minecraft.ar.d;
import net.minecraft.k.n;
import net.minecraft.u.E;

class U
extends S {
    final /* synthetic */ ao g;

    @Override
    protected int a() {
        return 100;
    }

    @Override
    protected aC b() {
        return aC.SUMMON_VEX;
    }

    private U(ao ao2) {
        this.g = ao2;
        super(ao2);
    }

    @Override
    protected void e() {
        int[] arrn = S.f();
        for (int i2 = 0; i2 < 3; ++i2) {
            n n2 = new n(this.g).a(-2 + ao.f(this.g).nextInt(5), 1, -2 + ao.c(this.g).nextInt(5));
            aS aS2 = new aS(this.g.aG);
            aS2.a(n2, 0.0f, 0.0f);
            aS2.a(this.g.aG.h(n2), null);
            aS2.a(this.g);
            aS2.c(n2);
            aS2.a(20 * (30 + ao.b(this.g).nextInt(90)));
            this.g.aG.f(aS2);
            if (arrn != null) continue;
        }
    }

    U(ao ao2, aa aa2) {
        this(ao2);
    }

    @Override
    protected int d() {
        return 340;
    }

    @Override
    public boolean c() {
        int[] arrn = S.f();
        int n2 = super.c();
        if (arrn != null) {
            if (n2 == 0) {
                return false;
            }
            n2 = this.g.aG.a(aS.class, this.g.m().a(16.0)).size();
        }
        int n3 = n2;
        int n4 = ao.a(this.g).nextInt(8) + 1;
        if (arrn != null) {
            n4 = n4 > n3 ? 1 : 0;
        }
        return n4 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d g() {
        return E.fC;
    }
}

