/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.R;
import net.minecraft.W.ah;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aC;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class X
extends R {
    public static final /* synthetic */ d<bl> A;

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        bl[] arrbl = bl.values();
        int n2 = arrbl.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            bl bl3 = arrbl[i2];
            a22.add(new net.minecraft.w.d(this, 1, bl3.e()));
            if (!bl2) continue;
        }
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, bl.c(n2));
    }

    @Override
    public int g(i i2) {
        return i2.b(A).e();
    }

    @Override
    public int d(i i2) {
        return i2.b(A).e();
    }

    public X(c c10) {
        super(c10, false);
        this.h(this.e.a().a(A, bl.WHITE));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.a(i2.b(A));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    static {
        A = d.a("color", bl.class);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block3: {
            z z3;
            block2: {
                boolean bl2 = cL.e();
                z3 = z2;
                if (!bl2) break block2;
                if (z3.C) break block3;
                z3 = z2;
            }
            ah.a(z3, n2);
        }
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
    protected boolean r() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

