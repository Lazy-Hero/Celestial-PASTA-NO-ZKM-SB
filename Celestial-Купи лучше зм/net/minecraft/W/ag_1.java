/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.V;
import net.minecraft.N.R;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.dN;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.d;

public class ag
extends ak {
    public static final /* synthetic */ e C;
    public static final /* synthetic */ c A;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k F;
    protected static final /* synthetic */ k B;

    @Override
    public aC p() {
        return aC.CUTOUT_MIPPED;
    }

    @Override
    public boolean i(i i2) {
        return true;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        aA aA3;
        block3: {
            aA aA4;
            block2: {
                aA3 = aA2.h();
                boolean bl2 = cL.e();
                aA4 = aA3;
                if (!bl2) break block2;
                if (aA4 != aA.UP) break block3;
                aA4 = aA.DOWN;
            }
            aA3 = aA4;
        }
        return this.d().a(C, aA3).a(A, true);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, A);
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return true;
    }

    public static boolean a(int n2) {
        boolean bl2 = cL.e();
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(C, ae2.a(i2.b(C)));
    }

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
                if (!(y2 instanceof R)) break block2;
                y2 = y3;
            }
            ((R)y2).a(d10.g());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        this.c(z2, n2, i2);
    }

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.a(z2.b(n2));
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(C)));
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        if (bl2) {
            if (y2 instanceof R) {
                V.a(z2, n2, (net.minecraft.B.a)((R)y2));
                z2.b(n2, this);
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, ag.b(n2)).a(A, ag.a(n2));
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(C).f();
        boolean bl2 = cL.b();
        int n3 = i2.b(A).booleanValue();
        if (!bl2) {
            if (n3 == 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    static {
        C = net.minecraft.ae.e.a("facing", new dN());
        A = net.minecraft.ae.c.a("enabled");
        F = new k(0.0, 0.0, 0.0, 1.0, 0.625, 1.0);
        B = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
        E = new k(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
        z = new k(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
        D = new k(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);
    }

    @Override
    public y a(z z2, int n2) {
        return new R();
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.c(z2, n2, i2);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return k;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        z z3 = z2;
        if (!bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof R;
        if (!bl2) {
            if (bl3) {
                j2.a((R)y2);
                j2.b(net.minecraft.l.m.d);
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.UP ? net.minecraft.Z.d.BOWL : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        ag.a(n2, k2, list, F);
        ag.a(n2, k2, list, D);
        ag.a(n2, k2, list, z);
        ag.a(n2, k2, list, B);
        ag.a(n2, k2, list, E);
    }

    private void c(z z2, n n2, i i2) {
        boolean bl2;
        boolean bl3 = cL.e();
        boolean bl4 = z2.x(n2);
        if (bl3) {
            bl4 = !bl4;
        }
        boolean bl5 = bl2 = bl4;
        if (bl3 && bl5 != i2.b(A)) {
            bl5 = z2.a(n2, i2.a(A, bl2), 4);
        }
    }

    public static aA b(int n2) {
        return aA.a(n2 & 7);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    public ag() {
        super(net.minecraft.ac.c.D, net.minecraft.ac.a.T);
        this.h(this.e.a().a(C, aA.DOWN).a(A, true));
        this.a(net.minecraft.ad.a.p);
    }
}

