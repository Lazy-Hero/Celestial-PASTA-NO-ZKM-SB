/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.av;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;

public class bI
extends K {
    public static final /* synthetic */ f z;
    protected static final /* synthetic */ k A;

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(net.minecraft.u.h.co);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block6: {
            int n3;
            int n4;
            block12: {
                int n5;
                boolean bl2;
                block11: {
                    int n6;
                    block10: {
                        int n7;
                        block9: {
                            n n8;
                            z z3;
                            block7: {
                                block8: {
                                    bl2 = cL.e();
                                    z3 = z2;
                                    n8 = n2.k();
                                    if (!bl2) break block7;
                                    if (z3.d(n8).b() == g.aZ) break block8;
                                    n7 = this.a(z2, n2, i2) ? 1 : 0;
                                    if (!bl2) break block9;
                                    if (n7 == 0) break block6;
                                }
                                z3 = z2;
                                n8 = n2.a();
                            }
                            n7 = z3.a(n8);
                        }
                        if (!bl2) break block10;
                        if (n7 == 0) break block6;
                        n7 = n6 = 1;
                    }
                    while (z2.d(n2.a(n6)).b() == this) {
                        ++n6;
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block6;
                    }
                    n5 = n6;
                    if (!bl2) break block11;
                    if (n5 >= 3) break block6;
                    n5 = i2.b(z);
                }
                n3 = n4 = n5;
                if (!bl2) break block6;
                if (n3 != 15) break block12;
                z2.a(n2.a(), this.d());
                z2.a(n2, i2.a(z, 0), 4);
                if (bl2) break block6;
            }
            n3 = z2.a(n2, i2.a(z, n4 + 1), 4) ? 1 : 0;
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        this.a(z2, n2, i2);
    }

    static {
        z = f.a("age", 0, 15);
        A = new k(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);
    }

    protected final boolean a(z z2, n n2, i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.b(z2, n2);
        if (bl2) {
            if (bl3) {
                return true;
            }
            this.a(z2, n2, i2, 0);
            z2.v(n2);
            bl3 = false;
        }
        return bl3;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.co;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    public boolean b(z z2, n n2) {
        return this.a(z2, n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    protected bI() {
        super(net.minecraft.ac.c.f);
        this.h(this.e.a().a(z, 0));
        this.a(true);
    }

    @Override
    public boolean a(z z2, n n2) {
        boolean bl2;
        block11: {
            K k2;
            block12: {
                K k3;
                K k4;
                block10: {
                    k4 = z2.d(n2.k()).b();
                    bl2 = cL.e();
                    k2 = k4;
                    if (bl2) {
                        if (k2 == this) {
                            return true;
                        }
                        k2 = k4;
                    }
                    k3 = g.aU;
                    if (!bl2) break block10;
                    if (k2 == k3) break block11;
                    k2 = k4;
                    if (!bl2) break block12;
                    k3 = g.bv;
                }
                if (k2 == k3) break block11;
                k2 = k4;
            }
            if (k2 != g.aO) {
                return false;
            }
        }
        n n3 = n2.k();
        for (aA aA2 : av.HORIZONTAL) {
            block15: {
                block14: {
                    i i2;
                    block13: {
                        i i3;
                        i2 = i3 = z2.d(n3.a(aA2));
                        if (!bl2) break block13;
                        if (i2.o() == net.minecraft.ac.c.L) break block14;
                        i2 = i3;
                    }
                    if (i2.b() != g.bj) break block15;
                }
                return true;
            }
            if (bl2) continue;
        }
        return false;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }
}

