/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class bt
extends bF {
    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        return n2 |= i2.b(z).k();
    }

    public bt(bl bl2) {
        boolean bl3 = cL.b();
        super(net.minecraft.ac.c.H, net.minecraft.ac.a.a(bl2));
        boolean bl4 = bl3;
        this.c(1.4f);
        this.a(d_.i);
        String string = bl2.d();
        if (!bl4) {
            if (string.length() > 1) {
                String string2 = string.substring(0, 1).toUpperCase() + string.substring(1);
                this.c("glazedTerracotta" + string2);
            }
            this.a(net.minecraft.ad.a.j);
        }
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.PUSH_ONLY;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, aA.b(n2));
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, b10.K().h());
    }
}

