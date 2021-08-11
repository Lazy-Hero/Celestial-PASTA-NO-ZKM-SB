/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.bD;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ae.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bV
extends bD {
    public static final /* synthetic */ f D;
    public static final /* synthetic */ c C;

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(z).k();
        return n2 |= i2.b(D) - 1 << 2;
    }

    @Override
    protected i e(i i2) {
        Integer n2 = i2.b(D);
        Boolean bl2 = i2.b(C);
        aA aA2 = i2.b(z);
        return g.ar.d().a(z, aA2).a(D, n2).a(C, bl2);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, aA.b(n2)).a(C, false).a(D, 1 + (n2 >> 2));
    }

    static {
        C = net.minecraft.ae.c.a("locked");
        D = f.a("delay", 1, 4);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        super.a(z2, n2, i2);
        this.c(z2, n2, i2);
    }

    @Override
    protected i i(i i2) {
        Integer n2 = i2.b(D);
        Boolean bl2 = i2.b(C);
        aA aA2 = i2.b(z);
        return g.bB.d().a(z, aA2).a(D, n2).a(C, bl2);
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        boolean bl2 = cL.b();
        if (this.A) {
            aA aA2 = i2.b(z);
            double d10 = (double)((float)n2.e() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d11 = (double)((float)n2.b() + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d12 = (double)((float)n2.a() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            float f10 = -5.0f;
            if (!bl2) {
                if (random.nextBoolean()) {
                    f10 = i2.b(D) * 2 - 1;
                }
                f10 /= 16.0f;
            }
            double d13 = f10 * (float)aA2.r();
            double d14 = f10 * (float)aA2.i();
            z2.a(aH.REDSTONE, d10 + d13, d11, d12 + d14, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected boolean d(i i2) {
        return bV.h(i2);
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.aY);
    }

    @Override
    public boolean a(t t2, n n2, i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(t2, n2, i2);
        if (!bl2) {
            bl3 = bl3 > false;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        boolean bl3 = j2.cw.c;
        if (bl2) {
            if (!bl3) {
                return false;
            }
            z2.a(n2, i2.a(D), 3);
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        return i2.a(C, this.a(t2, n2, i2));
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aY;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, D, C);
    }

    protected bV(boolean bl2) {
        super(bl2);
        this.h(this.e.a().a(z, aA.NORTH).a(D, 1).a(C, false));
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a("item.diode.name");
    }

    @Override
    protected int c(i i2) {
        return i2.b(D) * 2;
    }
}

