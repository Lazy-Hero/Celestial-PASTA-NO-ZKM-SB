/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class cq
extends K {
    @Override
    protected boolean r() {
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.b();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                cq.a(z2, n2, new d(net.minecraft.w.k.b(this), 1));
                if (!bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    public cq() {
        super(net.minecraft.ac.c.I);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aC;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        x2.ax();
    }
}

