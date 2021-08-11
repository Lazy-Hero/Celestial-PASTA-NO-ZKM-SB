/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cu;
import net.minecraft.W.dm;
import net.minecraft.W.i;
import net.minecraft.ac.c;
import net.minecraft.ae.a;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public abstract class c1
extends cu {
    public static final /* synthetic */ d<i> C;

    static {
        C = d.a("variant", i.class);
    }

    @Override
    public k a(net.minecraft.Z.i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.F);
    }

    @Override
    public int d(net.minecraft.Z.i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        int n3 = this.b();
        if (!bl2) {
            if (n3 == 0 && i2.b(B) == dm.TOP) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    public c1() {
        boolean bl2 = cL.b();
        super(net.minecraft.ac.c.H, net.minecraft.ac.a.d);
        boolean bl3 = bl2;
        net.minecraft.Z.i i2 = this.e.a();
        K k2 = this;
        if (!bl3) {
            if (!k2.b()) {
                i2 = i2.a(B, dm.BOTTOM);
            }
            this.h(i2.a(C, net.minecraft.W.i.DEFAULT));
            k2 = this.a(net.minecraft.ad.a.r);
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return this.b() ? new net.minecraft.Z.c((K)this, C) : new net.minecraft.Z.c((K)this, B, C);
    }

    @Override
    public Comparable<?> a(net.minecraft.w.d d10) {
        return net.minecraft.W.i.DEFAULT;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, net.minecraft.Z.i i2) {
        return new net.minecraft.w.d(g.F);
    }

    @Override
    public a<?> a() {
        return C;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(int n2) {
        return super.k();
    }

    @Override
    public net.minecraft.Z.i c(int n2) {
        net.minecraft.Z.i i2 = this.d().a(C, net.minecraft.W.i.DEFAULT);
        if (!this.b()) {
            i2 = i2.a(B, (n2 & 8) == 0 ? dm.BOTTOM : dm.TOP);
        }
        return i2;
    }
}

