/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;

public class af
extends aQ {
    public static final /* synthetic */ c A;

    @Override
    public void b(z z2, n n2, i i2) {
        block5: {
            boolean bl2;
            block4: {
                boolean bl3 = cL.b();
                bl2 = z2.C;
                if (bl3) break block4;
                if (bl2) break block5;
                bl2 = i2.b(A);
            }
            if (bl2) {
                this.a(z2, n2, i2, z2.J);
            }
            this.a(i2, z2, n2);
        }
    }

    protected void c(z z2, n n2, i i2) {
        aA aA2 = i2.b(z);
        n n3 = n2.a(aA2.h());
        z2.a(n3, (K)this, n2);
        z2.a(n3, (K)this, aA2);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    private void a(i i2, z z2, n n2) {
        block3: {
            af af2;
            n n3;
            z z3;
            block4: {
                boolean bl2;
                block2: {
                    boolean bl3 = cL.b();
                    bl2 = i2.b(A);
                    if (bl3) break block2;
                    if (bl2) break block3;
                    z3 = z2;
                    n3 = n2;
                    af2 = this;
                    if (bl3) break block4;
                    bl2 = z3.a(n3, af2);
                }
                if (bl2) break block3;
                z3 = z2;
                n3 = n2;
                af2 = this;
            }
            z3.a(n3, (K)af2, 2);
        }
    }

    @Override
    public int c(i i2, t t2, n n2, aA aA2) {
        return i2.a(t2, n2, aA2);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, aA.a(n2 & 7));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        Object object = i2.b(A);
        if (!bl2) {
            if (!((Boolean)object).booleanValue()) return 0;
            object = i2.b(z);
        }
        if (object != aA2) return 0;
        return 15;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    boolean bl3 = cL.b();
                    bl2 = i2.b(A);
                    if (bl3) break block2;
                    if (!bl2) break block3;
                    z2.a(n2, i2.a(A, false), 2);
                    if (!bl3) break block4;
                }
                bl2 = z2.a(n2, i2.a(A, true), 2);
            }
            z2.a(n2, (K)this, 2);
        }
        this.c(z2, n2, i2);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, A);
    }

    public af() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(z, aA.SOUTH).a(A, false));
        this.a(net.minecraft.ad.a.p);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        n2 |= i2.b(z).f();
        int n3 = i2.b(A).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    public void b(i i2, z z2, n n2, K k2, n n3) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.e();
                bl2 = z2.C;
                if (!bl3) break block1;
                if (bl2) break block2;
                bl2 = n2.a(i2.b(z)).equals(n3);
            }
            if (bl2) {
                this.a(i2, z2, n2);
            }
        }
    }

    static {
        A = net.minecraft.ae.c.a("powered");
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, aA.a(n2, b10).h());
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block2: {
            boolean bl2;
            block1: {
                boolean bl3 = cL.e();
                bl2 = i2.b(A);
                if (!bl3) break block1;
                if (!bl2) break block2;
                bl2 = z2.a(n2, this);
            }
            if (bl2) {
                this.c(z2, n2, i2.a(A, false));
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

