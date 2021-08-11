/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.av;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aF
extends K {
    protected static final /* synthetic */ k z;
    public static final /* synthetic */ f B;
    protected static final /* synthetic */ k A;

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block6: {
            int n3;
            int n4;
            block9: {
                int n5;
                boolean bl2;
                n n6;
                block8: {
                    int n7;
                    block7: {
                        n6 = n2.a();
                        bl2 = cL.b();
                        int n8 = z2.a(n6);
                        if (bl2) break block7;
                        if (n8 == 0) break block6;
                        n8 = n7 = 1;
                    }
                    while (z2.d(n2.a(n7)).b() == this) {
                        ++n7;
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block6;
                    }
                    n5 = n7;
                    if (bl2) break block8;
                    if (n5 >= 3) break block6;
                    n5 = i2.b(B);
                }
                n3 = n4 = n5;
                if (bl2) break block6;
                if (n3 != 15) break block9;
                z2.a(n6, this.d());
                i i3 = i2.a(B, 0);
                z2.a(n2, i3, 4);
                i3.a(z2, n6, this, n2);
                if (!bl2) break block6;
            }
            n3 = (int)((z2.a(n2, i2.a(B, n4 + 1), 4) ? true : false) ? true : false);
        }
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        x2.a(G.p, 1.0f);
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(B, n2);
    }

    protected aF() {
        super(net.minecraft.ac.c.m);
        this.h(this.e.a().a(B, 0));
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    static {
        B = f.a("age", 0, 15);
        A = new k(0.0625, 0.0, 0.0625, 0.9375, 0.9375, 0.9375);
        z = new k(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);
    }

    @Override
    public int d(i i2) {
        return i2.b(B);
    }

    @Override
    public k a(i i2, z z2, n n2) {
        return z.a(n2);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2);
        if (!bl2 && !bl3) {
            bl3 = z2.a(n2, true);
        }
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
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
    public k c(i i2, t t2, n n2) {
        return A;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(z z2, n n2) {
        i i2;
        boolean bl2;
        Object object;
        block4: {
            object = av.HORIZONTAL.iterator();
            bl2 = cL.b();
            while (object.hasNext()) {
                aA aA2 = object.next();
                i2 = z2.d(n2.a(aA2));
                if (!bl2) {
                    c c10 = i2.o();
                    boolean bl3 = c10.d();
                    if (bl2) return bl3;
                    if (bl3) return false;
                    if (c10 == net.minecraft.ac.c.g) {
                        return false;
                    }
                    if (!bl2) continue;
                }
                break block4;
            }
            i2 = z2.d(n2.k());
        }
        Object object2 = object = i2.b();
        if (!bl2) {
            if (object2 == g.aA) return true;
            object2 = object;
        }
        if (object2 != g.aO) return false;
        boolean bl4 = z2.d(n2.a()).o().b();
        if (bl2) return bl4;
        if (bl4) return false;
        return true;
    }
}

