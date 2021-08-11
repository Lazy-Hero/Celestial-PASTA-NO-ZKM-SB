/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.bc;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class be
extends bF
implements cs {
    protected static final /* synthetic */ k[] E;
    protected static final /* synthetic */ k[] B;
    public static final /* synthetic */ f C;
    protected static final /* synthetic */ k[] A;
    protected static final /* synthetic */ k[] D;

    public be() {
        super(net.minecraft.ac.c.f);
        this.h(this.e.a().a(z, aA.NORTH).a(C, 0));
        this.a(true);
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        boolean bl3 = cL.e();
        boolean bl4 = i2.b(C).intValue();
        if (bl3) {
            bl4 = bl4 < BADBOOL 2;
        }
        return bl4;
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        z2.a(n2, i2.a(C, i2.b(C) + 1), 2);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, C);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            i i3;
            n n4;
            z z3;
            be be2;
            block2: {
                boolean bl2 = cL.e();
                be2 = this;
                z3 = z2;
                n4 = n2;
                i3 = i2;
                if (!bl2) break block2;
                if (be2.d(z3, n4, i3)) break block3;
                be2 = this;
                z3 = z2;
                n4 = n2;
                i3 = i2;
            }
            be2.c(z3, n4, i3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d(z z2, n n2, i i2) {
        i i3;
        n2 = n2.a(i2.b(z));
        boolean bl2 = cL.e();
        i i4 = i3 = z2.d(n2);
        if (bl2) {
            if (i4.b() != g.bu) return false;
            i4 = i3;
        }
        if (i4.b(bc.B) != net.minecraft.W.D.JUNGLE) return false;
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block6: {
            int n3;
            int n4;
            boolean bl2;
            block7: {
                block4: {
                    block5: {
                        bl2 = cL.e();
                        n4 = this.d(z2, n2, i2);
                        if (!bl2) break block4;
                        if (n4 != 0) break block5;
                        this.c(z2, n2, i2);
                        if (bl2) break block6;
                    }
                    n4 = z2.J.nextInt(5);
                }
                if (!bl2) break block7;
                if (n4 != 0) break block6;
                n4 = i2.b(C);
            }
            int n5 = n3 = n4;
            if (bl2 && n5 < 2) {
                n5 = z2.a(n2, i2.a(C, n3 + 1), 2) ? 1 : 0;
            }
        }
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(z).k();
        return n2 |= i2.b(C) << 2;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        aA aA2 = aA.a(b10.e);
        z2.a(n2, i2.a(z, aA2), 2);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    static {
        C = f.a("age", 0, 2);
        A = new k[]{new k(0.6875, 0.4375, 0.375, 0.9375, 0.75, 0.625), new k(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875), new k(0.4375, 0.1875, 0.25, 0.9375, 0.75, 0.75)};
        D = new k[]{new k(0.0625, 0.4375, 0.375, 0.3125, 0.75, 0.625), new k(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875), new k(0.0625, 0.1875, 0.25, 0.5625, 0.75, 0.75)};
        E = new k[]{new k(0.375, 0.4375, 0.0625, 0.625, 0.75, 0.3125), new k(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375), new k(0.25, 0.1875, 0.0625, 0.75, 0.75, 0.5625)};
        B = new k[]{new k(0.375, 0.4375, 0.6875, 0.625, 0.75, 0.9375), new k(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375), new k(0.25, 0.1875, 0.4375, 0.75, 0.75, 0.9375)};
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        block3: {
            aA aA3;
            block2: {
                boolean bl2 = cL.b();
                aA3 = aA2;
                if (bl2) break block2;
                if (aA3.g().d()) break block3;
                aA3 = aA.NORTH;
            }
            aA2 = aA3;
        }
        return this.d().a(z, aA2.h()).a(C, 0);
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, aA.b(n2)).a(C, (n2 & 0xF) >> 2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        int n3 = i2.b(C);
        switch (i2.b(z)) {
            case SOUTH: {
                return B[n3];
            }
            default: {
                return E[n3];
            }
            case WEST: {
                return D[n3];
            }
            case EAST: 
        }
        return A[n3];
    }

    private void c(z z2, n n2, i i2) {
        z2.a(n2, g.bf.d(), 3);
        this.a(z2, n2, i2, 0);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        int n4;
        int n5 = i2.b(C);
        boolean bl2 = cL.b();
        int n6 = 1;
        int n7 = n5;
        if (!bl2) {
            if (n7 >= 2) {
                n6 = 3;
            }
            n7 = n4 = 0;
        }
        while (n4 < n6) {
            be.a(z2, n2, new d(net.minecraft.u.h.aL, 1, bl.BROWN.a()));
            ++n4;
            if (!bl2) continue;
        }
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.aL, 1, bl.BROWN.a());
    }
}

