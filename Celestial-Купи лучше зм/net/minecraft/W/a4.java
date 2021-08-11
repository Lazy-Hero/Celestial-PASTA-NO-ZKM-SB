/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.B.f;
import net.minecraft.N.H;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class a4
extends ak {
    public static final /* synthetic */ e A;
    protected static final /* synthetic */ k z;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        f f13 = j2.D();
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        if (f13 == null) return true;
        boolean bl3 = y2 instanceof H;
        if (!bl2) return bl3;
        if (!bl3) return true;
        boolean bl4 = z2.d(n2.a()).r();
        if (bl2) {
            if (bl4) {
                return true;
            }
            bl4 = z2.C;
        }
        if (!bl2) return bl4;
        if (bl4) {
            return true;
        }
        f13.a((H)y2);
        j2.a(f13);
        j2.b(net.minecraft.l.m.i);
        return true;
    }

    protected a4() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(A, aA.NORTH));
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected boolean r() {
        return true;
    }

    @Override
    public boolean r(i i2) {
        return true;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(A)));
    }

    static {
        A = bF.z;
        z = new k(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        boolean bl2 = cL.b();
        for (int i3 = 0; i3 < 3; ++i3) {
            int n3 = random.nextInt(2) * 2 - 1;
            int n4 = random.nextInt(2) * 2 - 1;
            double d10 = (double)n2.e() + 0.5 + 0.25 * (double)n3;
            double d11 = (float)n2.b() + random.nextFloat();
            double d12 = (double)n2.a() + 0.5 + 0.25 * (double)n4;
            double d13 = random.nextFloat() * (float)n3;
            double d14 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d15 = random.nextFloat() * (float)n4;
            z2.a(aH.PORTAL, d10, d11, d12, d13, d14, d15, new int[0]);
            if (!bl2) continue;
        }
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.bP);
    }

    @Override
    public y a(z z2, int n2) {
        return new H();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        z2.a(n2, i2.a(A, b10.K().h()), 2);
    }

    @Override
    public aW b(i i2) {
        return aW.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public int d(i i2) {
        return i2.b(A).f();
    }

    @Override
    public i c(int n2) {
        aA aA2;
        block3: {
            aA aA3;
            block2: {
                aA2 = aA.a(n2);
                boolean bl2 = cL.b();
                aA3 = aA2;
                if (bl2) break block2;
                if (aA3.g() != Q.Y) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(A, aA2);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(A, ae2.a(i2.b(A)));
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(A, b10.K().h());
    }
}

