/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.P.r;
import net.minecraft.W.bZ;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.aQ;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.u.g;

abstract class D
extends u {
    protected /* synthetic */ aQ g;

    @Override
    protected void a(r r2) {
        r2.b("MST", this.g.ordinal());
    }

    protected i b() {
        switch (this.g) {
            default: {
                return net.minecraft.u.g.bt.d();
            }
            case MESA: 
        }
        return net.minecraft.u.g.bs.d();
    }

    public D(int n2, aQ aQ2) {
        super(n2);
        this.g = aQ2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected i a() {
        switch (this.g) {
            default: {
                return net.minecraft.u.g.cB.d();
            }
            case MESA: 
        }
        return net.minecraft.u.g.cB.d().a(bZ.z, net.minecraft.W.D.DARK_OAK);
    }

    @Override
    protected void a(r r2, j j2) {
        this.g = aQ.a(r2.m("MST"));
    }

    protected boolean a(z z2, b b10, int n2, int n3, int n4, int n5) {
        String[] arrstring = u.b();
        for (int i2 = n2; i2 <= n3; ++i2) {
            if (this.b(z2, i2, n4 + 1, n5, b10).o() != net.minecraft.ac.c.A) continue;
            return false;
        }
        return true;
    }

    public D() {
    }
}

