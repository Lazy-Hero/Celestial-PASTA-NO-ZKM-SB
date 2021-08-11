/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aP
extends aQ {
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k C;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.NORMAL;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public i c(int n2) {
        i i2 = this.d();
        i2 = i2.a(z, aA.a(n2));
        return i2;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    protected aP() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(z, aA.UP));
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(z var1_1, n var2_2, aA var3_3, float var4_4, float var5_5, float var6_6, int var7_7, B var8_8) {
        var10_9 = var1_1.d(var2_2.a(var3_3.h()));
        var9_10 = cL.e();
        v0 = var10_9;
        if (var9_10 == false) return v0;
        if (v0.b() == g.aD) {
            v1 = var10_9;
            v2 = aP.z;
            if (var9_10) {
                var11_11 = v1.b(v2);
                if (var11_11 == var3_3) {
                    return this.d().a(aP.z, var3_3.h());
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = this.d();
            v2 = aP.z;
        }
        v0 = v1.a(v2, var3_3);
        return v0;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        switch (i2.b(z).g()) {
            default: {
                return A;
            }
            case Z: {
                return B;
            }
            case Y: 
        }
        return C;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block0: {
            aA aA2 = i2.b(z);
            double d10 = (double)n2.e() + 0.55 - (double)(random.nextFloat() * 0.1f);
            double d11 = (double)n2.b() + 0.55 - (double)(random.nextFloat() * 0.1f);
            double d12 = (double)n2.a() + 0.55 - (double)(random.nextFloat() * 0.1f);
            double d13 = 0.4f - (random.nextFloat() + random.nextFloat()) * 0.4f;
            if (random.nextInt(5) != 0) break block0;
            z2.a(aH.END_ROD, d10 + (double)aA2.r() * d13, d11 + (double)aA2.p() * d13, d12 + (double)aA2.i() * d13, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, new int[0]);
        }
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public int d(i i2) {
        return i2.b(z).f();
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(z, h2.a(i2.b(z)));
    }

    static {
        C = new k(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
        B = new k(0.375, 0.375, 0.0, 0.625, 0.625, 1.0);
        A = new k(0.0, 0.375, 0.375, 1.0, 0.625, 0.625);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public boolean a(z z2, n n2) {
        return true;
    }
}

