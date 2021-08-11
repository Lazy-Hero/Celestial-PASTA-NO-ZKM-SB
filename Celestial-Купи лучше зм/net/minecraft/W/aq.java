/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.V;
import net.minecraft.N.L;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class aq
extends ak {
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ c[] z;
    protected static final /* synthetic */ k A;

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        aq.a(n2, k2, list, A);
        aq.a(n2, k2, list, B);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public int d(i i2) {
        int n2;
        block3: {
            int n3 = 0;
            boolean bl2 = cL.b();
            for (int i3 = 0; i3 < 3; ++i3) {
                n2 = i2.b(z[i3]).booleanValue() ? 1 : 0;
                if (!bl2) {
                    int n4;
                    if (!bl2) {
                        if (n2 == 0) continue;
                        n4 = n3 | 1 << i3;
                    }
                    n3 = n4;
                    if (!bl2) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a("item.brewingStand.name");
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public y a(z z2, int n2) {
        return new L();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z[0], z[1], z[2]);
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block2: {
            y y2;
            block3: {
                y y3;
                boolean bl2 = cL.b();
                if (!d10.c()) break block2;
                y2 = y3 = z2.b(n2);
                if (bl2) break block3;
                if (!(y2 instanceof L)) break block2;
                y2 = y3;
            }
            ((L)y2).a(d10.g());
        }
    }

    public aq() {
        super(net.minecraft.ac.c.D);
        this.h(this.e.a().a(z[0], false).a(z[1], false).a(z[2], false));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        if (bl2) {
            if (y2 instanceof L) {
                V.a(z2, n2, (net.minecraft.B.a)((L)y2));
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.c);
    }

    @Override
    public int b(i i2, z z2, n n2) {
        return net.minecraft.B.n.a(z2.b(n2));
    }

    static {
        z = new c[]{net.minecraft.ae.c.a("has_bottle_0"), net.minecraft.ae.c.a("has_bottle_1"), net.minecraft.ae.c.a("has_bottle_2")};
        B = new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
        A = new k(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.c;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return B;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        double d10 = (float)n2.e() + 0.4f + random.nextFloat() * 0.2f;
        double d11 = (float)n2.b() + 0.7f + random.nextFloat() * 0.3f;
        double d12 = (float)n2.a() + 0.4f + random.nextFloat() * 0.2f;
        z2.a(aH.SMOKE_NORMAL, d10, d11, d12, 0.0, 0.0, 0.0, new int[0]);
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
        boolean bl3 = y2 instanceof L;
        if (!bl2) {
            if (bl3) {
                j2.a((L)y2);
                j2.b(net.minecraft.l.m.p);
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        i i2;
        block3: {
            i i3 = this.d();
            boolean bl2 = cL.b();
            for (int i4 = 0; i4 < 3; ++i4) {
                i2 = i3;
                if (!bl2) {
                    c c10 = z[i4];
                    boolean bl3 = n2 & 1 << i4;
                    if (!bl2) {
                        bl3 = bl3 > false;
                    }
                    i3 = i2.a(c10, bl3);
                    if (!bl2) continue;
                }
                break block3;
            }
            i2 = i3;
        }
        return i2;
    }
}

