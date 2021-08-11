/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.aK;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class aM
extends aK {
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ e D;

    static {
        D = bF.z;
        E = new k(0.0, 0.28125, 0.0, 0.125, 0.78125, 1.0);
        B = new k(0.875, 0.28125, 0.0, 1.0, 0.78125, 1.0);
        C = new k(0.0, 0.28125, 0.0, 1.0, 0.78125, 0.125);
        A = new k(0.0, 0.28125, 0.875, 1.0, 0.78125, 1.0);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(D)) {
            default: {
                return A;
            }
            case SOUTH: {
                return C;
            }
            case WEST: {
                return B;
            }
            case EAST: 
        }
        return E;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        aA aA2 = i2.b(D);
        boolean bl2 = cL.b();
        if (!bl2) {
            if (!z2.d(n2.a(aA2.h())).o().d()) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
            }
            super.a(i2, z2, n2, k2, n3);
        }
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(D)));
    }

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
        return this.d().a(D, aA2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public aM() {
        this.h(this.e.a().a(D, aA.NORTH));
    }

    @Override
    protected c f() {
        return new c((K)this, D);
    }

    @Override
    public int d(i i2) {
        return i2.b(D).f();
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(D, ae2.a(i2.b(D)));
    }
}

