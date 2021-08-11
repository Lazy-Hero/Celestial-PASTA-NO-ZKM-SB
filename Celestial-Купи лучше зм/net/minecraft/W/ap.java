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
import net.minecraft.N.V;
import net.minecraft.N.y;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.W.ac;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.cU;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.h;

public class ap
extends ak {
    public static final /* synthetic */ e z;
    public static final /* synthetic */ d<cU> A;

    @Override
    public net.minecraft.w.k a(net.minecraft.Z.i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public boolean p(net.minecraft.Z.i i2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public k c(net.minecraft.Z.i i2, t t2, n n2) {
        V v2 = this.a(t2, n2);
        boolean bl2 = cL.b();
        V v3 = v2;
        if (!bl2) {
            if (v3 == null) {
                return null;
            }
            v3 = v2;
        }
        k k2 = v3.a(t2, n2);
        return k2;
    }

    @Override
    public boolean w(net.minecraft.Z.i i2) {
        return false;
    }

    public ap() {
        super(net.minecraft.ac.c.y);
        this.h(this.e.a().a(z, aA.NORTH).a(A, cU.DEFAULT));
        this.c(-1.0f);
    }

    @Override
    public net.minecraft.Z.i a(net.minecraft.Z.i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    @Nullable
    public i a(net.minecraft.Z.i i2, z z2, n n2, l l2, l l3) {
        return null;
    }

    @Override
    public net.minecraft.Z.i a(net.minecraft.Z.i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    public static y a(net.minecraft.Z.i i2, aA aA2, boolean bl2, boolean bl3) {
        return new V(i2, aA2, bl2, bl3);
    }

    @Override
    public net.minecraft.Z.d a(t t2, net.minecraft.Z.i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2) {
        block2: {
            block1: {
                y y2;
                boolean bl2;
                block0: {
                    y y3 = z2.b(n2);
                    bl2 = cL.e();
                    y2 = y3;
                    if (!bl2) break block0;
                    if (!(y2 instanceof V)) break block1;
                    y2 = y3;
                }
                ((V)y2).d();
                if (bl2) break block2;
            }
            super.a(z2, n2, i2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private V a(t t2, n n2) {
        y y2 = t2.b(n2);
        boolean bl2 = cL.e();
        y y3 = y2;
        if (bl2) {
            if (!(y3 instanceof V)) return null;
            y3 = y2;
        }
        V v2 = (V)y3;
        return v2;
    }

    @Override
    public int d(net.minecraft.Z.i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        int n3 = n2 | i2.b(z).f();
        if (!bl2) {
            n2 = n3;
            if (i2.b(A) == cU.STICKY) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public boolean a(z z2, n n2, aA aA2) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public k a(net.minecraft.Z.i i2, t t2, n n2) {
        k k2;
        V v2 = this.a(t2, n2);
        boolean bl2 = cL.e();
        V v3 = v2;
        if (bl2) {
            if (v3 == null) {
                k2 = k;
                return k2;
            }
            v3 = v2;
        }
        k2 = v3.a(t2, n2);
        return k2;
    }

    @Override
    public boolean a(z z2, n n2) {
        return false;
    }

    @Override
    @Nullable
    public y a(z z2, int n2) {
        return null;
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, K k2, n n3) {
        block3: {
            z z3;
            block2: {
                boolean bl2 = cL.b();
                z3 = z2;
                if (bl2) break block2;
                if (z3.C) break block3;
                z3 = z2;
            }
            z3.b(n2);
        }
    }

    @Override
    public void d(z z2, n n2, net.minecraft.Z.i i2) {
        block5: {
            boolean bl2;
            boolean bl3;
            n n3;
            block4: {
                n3 = n2.a(i2.b(z).h());
                net.minecraft.Z.i i3 = z2.d(n3);
                bl3 = cL.e();
                bl2 = i3.b() instanceof aL;
                if (!bl3) break block4;
                if (!bl2) break block5;
                bl2 = i3.b(aL.A);
            }
            if (bl3 && bl2) {
                bl2 = z2.v(n3);
            }
        }
    }

    static {
        z = ac.z;
        A = ac.B;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, A);
    }

    @Override
    public void a(net.minecraft.Z.i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block3: {
            V v2;
            block2: {
                V v3 = this.a((t)z2, n2);
                boolean bl3 = cL.b();
                v2 = v3;
                if (bl3) break block2;
                if (v2 == null) break block3;
                v2 = v3;
            }
            v2.a(z2, n2, k2, list, x2);
        }
    }

    @Override
    public net.minecraft.Z.i c(int n2) {
        return this.d().a(z, ac.a(n2)).a(A, (n2 & 8) > 0 ? cU.STICKY : cU.DEFAULT);
    }

    @Override
    public boolean a(z z2, n n2, net.minecraft.Z.i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block2: {
            block3: {
                n n3;
                z z3;
                block4: {
                    boolean bl3 = cL.b();
                    bl2 = z2.C;
                    if (bl3) break block2;
                    if (bl2) break block3;
                    z3 = z2;
                    n3 = n2;
                    if (bl3) break block4;
                    if (z3.b(n3) != null) break block3;
                    z3 = z2;
                    n3 = n2;
                }
                z3.v(n3);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, net.minecraft.Z.i i2) {
        return net.minecraft.w.d.m;
    }

    @Override
    public void a(z z2, n n2, net.minecraft.Z.i i2, float f10, int n3) {
        block2: {
            V v2;
            block3: {
                V v3;
                boolean bl2 = cL.e();
                if (z2.C) break block2;
                v2 = v3 = this.a((t)z2, n2);
                if (!bl2) break block3;
                if (v2 == null) break block2;
                v2 = v3;
            }
            net.minecraft.Z.i i3 = v2.e();
            i3.b().a(z2, n2, i3, 0);
        }
    }
}

