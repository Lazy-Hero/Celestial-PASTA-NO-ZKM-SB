/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.J.t;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.d4;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aZ
extends ak {
    public static final /* synthetic */ c z;

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block0: {
            if (z2.C) break block0;
            super.a(z2, n2, i2, f10, 0);
        }
    }

    @Override
    public void a(z z2, n n2, i i2) {
        this.c(z2, n2, i2);
        super.a(z2, n2, i2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d();
        boolean bl3 = n2;
        if (!bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(z, bl3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int b(i i2, z z2, n n2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        int n3 = y2 instanceof d4;
        if (!bl2) return n3;
        if (n3 == 0) return 0;
        d d10 = ((d4)y2).a();
        n3 = d10.G() ? 1 : 0;
        if (!bl2) return n3;
        if (n3 != 0) return 0;
        return net.minecraft.w.k.a(d10.w()) + 1 - net.minecraft.w.k.a(net.minecraft.u.h.a3);
    }

    public void a(z z2, n n2, i i2, d d10) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        boolean bl3 = y2 instanceof d4;
        if (bl2 && bl3) {
            ((d4)y2).a(d10.C());
            bl3 = z2.a(n2, i2.a(z, true), 2);
        }
    }

    @Override
    public y a(z z2, int n2) {
        return new d4();
    }

    protected aZ() {
        super(net.minecraft.ac.c.k, net.minecraft.ac.a.ad);
        this.h(this.e.a().a(z, false));
        this.a(net.minecraft.ad.a.j);
    }

    static {
        z = net.minecraft.ae.c.a("has_record");
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        boolean bl3 = i2.b(z);
        if (bl2) {
            if (bl3) {
                this.c(z2, n2, i2);
                i2 = i2.a(z, false);
                z2.a(n2, i2, 2);
                return true;
            }
            bl3 = false;
        }
        return bl3;
    }

    public static void a(b b10) {
        b10.a(f.BLOCK_ENTITY, (g)new net.minecraft.x.c(d4.class, "RecordItem"));
    }

    private void c(z z2, n n2, i i2) {
        block3: {
            d d10;
            block5: {
                y y2;
                boolean bl2;
                block4: {
                    y y3;
                    z z3;
                    block2: {
                        bl2 = cL.b();
                        z3 = z2;
                        if (bl2) break block2;
                        if (z3.C) break block3;
                        z3 = z2;
                    }
                    y2 = y3 = z3.b(n2);
                    if (bl2) break block4;
                    if (!(y2 instanceof d4)) break block3;
                    y2 = y3;
                }
                d4 d42 = (d4)y2;
                d10 = d42.a();
                if (bl2) break block5;
                if (d10.G()) break block3;
                z2.b(1010, n2, 0);
                z2.a(n2, (net.minecraft.ar.d)null);
                d42.a(d.m);
            }
            float f10 = 0.7f;
            double d11 = (double)(z2.J.nextFloat() * 0.7f) + (double)0.15f;
            double d12 = (double)(z2.J.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
            double d13 = (double)(z2.J.nextFloat() * 0.7f) + (double)0.15f;
            d d14 = d10.C();
            t t2 = new t(z2, (double)n2.e() + d11, (double)n2.b() + d12, (double)n2.a() + d13, d14);
            t2.b();
            z2.f(t2);
        }
    }

    @Override
    public int d(i i2) {
        boolean bl2 = cL.e();
        int n2 = i2.b(z).booleanValue();
        if (bl2) {
            n2 = n2 != 0 ? 1 : 0;
        }
        return n2;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }
}

