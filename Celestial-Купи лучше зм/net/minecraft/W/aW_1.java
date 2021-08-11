/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.a2;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class aW
extends a2 {
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k C;
    protected static final /* synthetic */ k F;

    @Override
    public i c(int n2) {
        aA aA2;
        block3: {
            aA aA3;
            block2: {
                aA2 = aA.a(n2);
                boolean bl2 = cL.e();
                aA3 = aA2;
                if (!bl2) break block2;
                if (aA3.g() != Q.Y) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(B, aA2);
    }

    @Override
    public int d(i i2) {
        return i2.b(B).f();
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        aA aA2 = i2.b(B);
        boolean bl2 = cL.b();
        if (!bl2) {
            if (!z2.d(n2.a(aA2.h())).o().d()) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
            }
            super.a(i2, z2, n2, k2, n3);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    static {
        C = new k(0.0, 0.0, 0.875, 1.0, 0.78125, 1.0);
        E = new k(0.0, 0.0, 0.0, 1.0, 0.78125, 0.125);
        F = new k(0.875, 0.0, 0.0, 1.0, 0.78125, 1.0);
        D = new k(0.0, 0.0, 0.0, 0.125, 0.78125, 1.0);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(B, ae2.a(i2.b(B)));
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(B)) {
            default: {
                return C;
            }
            case SOUTH: {
                return E;
            }
            case WEST: {
                return F;
            }
            case EAST: 
        }
        return D;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(B)));
    }

    public aW() {
        this.h(this.e.a().a(B, aA.NORTH));
    }

    @Override
    protected c f() {
        return new c((K)this, B);
    }
}

