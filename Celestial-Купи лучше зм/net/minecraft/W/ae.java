/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class ae
extends K {
    public static final /* synthetic */ d<bl> z;
    protected static final /* synthetic */ k A;

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = super.a(z2, n2);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.b(z2, n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < 16; ++i2) {
            a22.add(new net.minecraft.w.d(this, 1, i2));
            if (!bl2) continue;
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.a(z2, n2, i2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.e();
        if (aA2 == aA.UP) {
            return true;
        }
        if (t2.d(n2.a(aA2)).b() == this) return true;
        boolean bl3 = super.b(i2, t2, n2, aA2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public int g(i i2) {
        return i2.b(z).e();
    }

    private boolean a(z z2, n n2, i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2);
        if (!bl2) {
            if (!bl3) {
                this.a(z2, n2, i2, 0);
                z2.v(n2);
                return false;
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    protected ae() {
        super(net.minecraft.ac.c.e);
        this.h(this.e.a().a(z, bl.WHITE));
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    static {
        z = d.a("color", bl.class);
        A = new k(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, bl.c(n2));
    }

    @Override
    public int d(i i2) {
        return i2.b(z).e();
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.a(i2.b(z));
    }

    private boolean b(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.a(n2.k());
        if (!bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

