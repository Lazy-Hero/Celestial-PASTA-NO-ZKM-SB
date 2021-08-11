/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.ah;
import net.minecraft.W.bN;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class bg
extends bN {
    public static final /* synthetic */ d<bl> F;

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < bl.values().length; ++i2) {
            a22.add(new net.minecraft.w.d(this, 1, i2));
            if (!bl2) continue;
        }
    }

    @Override
    public int d(i i2) {
        return i2.b(F).e();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, E, D, A, F);
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block3: {
            z z3;
            block2: {
                boolean bl2 = cL.b();
                z3 = z2;
                if (bl2) break block2;
                if (z3.C) break block3;
                z3 = z2;
            }
            ah.a(z3, n2);
        }
    }

    public bg() {
        super(net.minecraft.ac.c.M, false);
        this.h(this.e.a().a(z, false).a(E, false).a(A, false).a(D, false).a(F, bl.WHITE));
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(z, i2.b(A)).a(E, i2.b(D)).a(A, i2.b(z)).a(D, i2.b(E));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(z, i2.b(E)).a(E, i2.b(A)).a(A, i2.b(D)).a(D, i2.b(z));
            }
            case CLOCKWISE_90: {
                return i2.a(z, i2.b(D)).a(E, i2.b(z)).a(A, i2.b(E)).a(D, i2.b(A));
            }
        }
        return i2;
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block3: {
            z z3;
            block2: {
                boolean bl2 = cL.b();
                z3 = z2;
                if (bl2) break block2;
                if (z3.C) break block3;
                z3 = z2;
            }
            ah.a(z3, n2);
        }
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.a(i2.b(F));
    }

    @Override
    public i c(int n2) {
        return this.d().a(F, bl.c(n2));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public i a(i i2, h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(z, i2.b(A)).a(A, i2.b(z));
            }
            case FRONT_BACK: {
                return i2.a(E, i2.b(D)).a(D, i2.b(E));
            }
        }
        return super.a(i2, h2);
    }

    @Override
    public int g(i i2) {
        return i2.b(F).e();
    }

    static {
        F = d.a("color", bl.class);
    }
}

