/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.T.a3;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cM;
import net.minecraft.W.ct;
import net.minecraft.W.d1;
import net.minecraft.W.dO;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class b8
extends K {
    public static final /* synthetic */ d<d1> z;

    @Override
    public int d(i i2) {
        return i2.b(z).c();
    }

    @Override
    protected net.minecraft.w.d q(i i2) {
        switch (i2.b(z)) {
            case COBBLESTONE: {
                return new net.minecraft.w.d(g.cW);
            }
            case STONEBRICK: {
                return new net.minecraft.w.d(g.ay);
            }
            case MOSSY_STONEBRICK: {
                return new net.minecraft.w.d(g.ay, 1, dO.MOSSY.a());
            }
            case CRACKED_STONEBRICK: {
                return new net.minecraft.w.d(g.ay, 1, dO.CRACKED.a());
            }
            case CHISELED_STONEBRICK: {
                return new net.minecraft.w.d(g.ay, 1, dO.CHISELED.a());
            }
        }
        return new net.minecraft.w.d(g.bx);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public b8() {
        super(net.minecraft.ac.c.N);
        this.h(this.e.a().a(z, d1.STONE));
        this.c(0.0f);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, d1.a(n2));
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this, 1, i2.b().d(i2));
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        d1[] arrd1 = d1.values();
        int n2 = arrd1.length;
        boolean bl2 = cL.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            d1 d12 = arrd1[i2];
            a22.add(new net.minecraft.w.d(this, 1, d12.c()));
            if (bl2) continue;
        }
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block5: {
            boolean bl2;
            block4: {
                boolean bl3 = cL.e();
                bl2 = z2.C;
                if (!bl3) break block4;
                if (bl2) break block5;
                bl2 = z2.M().c("doTileDrops");
            }
            if (bl2) {
                a3 a32 = new a3(z2);
                a32.c((double)n2.e() + 0.5, n2.b(), (double)n2.a() + 0.5, 0.0f, 0.0f);
                z2.f(a32);
                a32.Z();
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(i i2) {
        K k2 = i2.b();
        boolean bl2 = cL.b();
        if (i2 == g.bx.d().a(ct.z, cM.STONE)) return true;
        K k3 = k2;
        K k4 = g.cW;
        if (!bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.ay;
        }
        if (k3 != k4) return false;
        return true;
    }

    static {
        z = d.a("variant", d1.class);
    }
}

