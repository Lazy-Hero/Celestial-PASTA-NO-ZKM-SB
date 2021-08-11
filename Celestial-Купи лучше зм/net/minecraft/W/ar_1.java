/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.aK;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.f;
import net.minecraft.ah.z;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;

public class ar
extends aK {
    public static final /* synthetic */ f A;

    @Override
    public int d(i i2) {
        return i2.b(A);
    }

    public ar() {
        this.h(this.e.a().a(A, 0));
    }

    static {
        A = f.a("rotation", 0, 15);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (!z2.d(n2.k()).o().d()) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
            }
            super.a(i2, z2, n2, k2, n3);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, n2);
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(A, h2.a(i2.b(A), 16));
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(A, ae2.a(i2.b(A), 16));
    }

    @Override
    protected c f() {
        return new c((K)this, A);
    }
}

