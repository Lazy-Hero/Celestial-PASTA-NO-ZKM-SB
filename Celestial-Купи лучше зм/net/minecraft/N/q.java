/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.T;
import net.minecraft.N.j;
import net.minecraft.N.p;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.x;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

class q
extends p {
    final /* synthetic */ T m;

    @Override
    public n h() {
        return this.m.d;
    }

    q(T t2) {
        this.m = t2;
    }

    @Override
    public void a(x x2) {
        block3: {
            z z2;
            block2: {
                m[] arrm = j.f();
                super.a(x2);
                m[] arrm2 = arrm;
                z2 = this.c();
                if (arrm2 != null) break block2;
                if (z2 == null) break block3;
                z2 = this.c();
            }
            i i2 = z2.d(this.h());
            this.c().a(this.m.d, i2, i2, 4);
        }
    }

    @Override
    public void a(int n2) {
        this.m.a.a(this.m.d, g.i, n2, 0);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public z c() {
        return this.m.a;
    }
}

