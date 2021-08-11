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
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class av
extends Y {
    protected static final /* synthetic */ k A;

    protected av() {
        super(net.minecraft.ac.c.z);
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.e();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                av.a(z2, n2, new d(g.b9, 1, 0));
                if (bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    static {
        A = new k(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(3);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.bz;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(i i2) {
        boolean bl2 = cL.b();
        K k3 = i2.b();
        k3 = g.aO;
        if (!bl2) {
            if (k2 == k3) return true;
            K k3 = i2.b();
            k3 = g.an;
        }
        if (!bl2) {
            if (k2 == k3) return true;
            K k3 = i2.b();
            k3 = g.ck;
        }
        if (!bl2) {
            if (k2 == k3) return true;
            K k3 = i2.b();
            k3 = g.bv;
        }
        if (k2 != k3) return false;
        return true;
    }

    @Override
    public boolean b(t t2, n n2) {
        return true;
    }

    @Override
    public a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.E;
    }
}

