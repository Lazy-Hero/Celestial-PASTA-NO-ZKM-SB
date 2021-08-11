/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class ax
extends K {
    public static final /* synthetic */ c z;
    public static final /* synthetic */ d<da> A;

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(A).b();
    }

    static {
        A = d.a("variant", da.class);
        z = net.minecraft.ae.c.a("snowy");
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this, 1, i2.b(A).a());
    }

    protected ax() {
        super(net.minecraft.ac.c.q);
        this.h(this.e.a().a(A, da.DIRT).a(z, false));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, da.a(n2));
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, da.DIRT.a()));
        a22.add(new net.minecraft.w.d(this, 1, da.COARSE_DIRT.a()));
        a22.add(new net.minecraft.w.d(this, 1, da.PODZOL.a()));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A, z);
    }

    @Override
    public int d(i i2) {
        return i2.b(A).a();
    }

    @Override
    public int g(i i2) {
        da da2 = i2.b(A);
        boolean bl2 = cL.e();
        da da3 = da2;
        if (bl2) {
            if (da3 == da.PODZOL) {
                da2 = da.DIRT;
            }
            da3 = da2;
        }
        return da3.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i e(i var1_1, t var2_2, n var3_3) {
        block2: {
            block3: {
                var4_4 = cL.b();
                v0 = var1_1;
                if (var4_4 != false) return v0;
                if (v0.b(ax.A) != da.PODZOL) break block2;
                v1 = var5_5 = var2_2.d(var3_3.a()).b();
                v2 = g.da;
                if (var4_4) break block3;
                if (v1 == v2) ** GOTO lbl-1000
                v1 = var5_5;
                v2 = g.o;
            }
            if (v1 == v2) lbl-1000:
            // 2 sources

            {
                v3 = true;
            } else {
                v3 = false;
            }
            var1_1 = var1_1.a(ax.z, v3);
        }
        v0 = var1_1;
        return v0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

