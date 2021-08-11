/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cB;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.O;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.d;

public class ah
extends ak {
    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block2: {
            y y2;
            block3: {
                y y3;
                boolean bl2 = cL.b();
                super.a(z2, n2, i2, b10, d10);
                boolean bl3 = bl2;
                if (!d10.c()) break block2;
                y2 = y3 = z2.b(n2);
                if (bl3) break block3;
                if (!(y2 instanceof net.minecraft.N.K)) break block2;
                y2 = y3;
            }
            ((net.minecraft.N.K)y2).a(d10.g());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        z z3 = z2;
        if (bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof net.minecraft.N.K;
        if (bl2) {
            if (bl3) {
                j2.a((net.minecraft.N.K)y2);
                j2.b(net.minecraft.l.m.K);
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            y y2;
            block2: {
                y y3 = z2.b(n2);
                boolean bl2 = cL.e();
                y2 = y3;
                if (!bl2) break block2;
                if (!(y2 instanceof net.minecraft.N.K)) break block3;
                y2 = y3;
            }
            ((net.minecraft.N.K)y2).h();
            z2.a(n2, this, 1, 0);
        }
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public y a(z z2, int n2) {
        return new net.minecraft.N.K();
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    public static void a(z z2, n n2) {
        O.a.submit((Runnable)new cB(z2, n2));
    }

    public ah() {
        super(net.minecraft.ac.c.M, net.minecraft.ac.a.G);
        this.c(3.0f);
        this.a(net.minecraft.ad.a.n);
    }
}

