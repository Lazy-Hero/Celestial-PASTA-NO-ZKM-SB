/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.List;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.N;
import net.minecraft.W.cL;
import net.minecraft.W.dz;
import net.minecraft.W.w;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;

public class O
extends N {
    private final /* synthetic */ w D;
    public static final /* synthetic */ c C;

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C);
    }

    @Override
    public int d(i i2) {
        boolean bl2 = cL.b();
        int n2 = i2.b(C).booleanValue();
        if (!bl2) {
            n2 = n2 != 0 ? 1 : 0;
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected i a(i i2, int n2) {
        boolean bl2 = cL.e();
        boolean bl3 = n2;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(C, bl3);
    }

    @Override
    protected void c(z z2, n n2) {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    bl2 = cL.e();
                    if (!bl2) break block0;
                    if (this.y != net.minecraft.ac.c.k) break block1;
                    z2.a(null, n2, E.d0, ay.BLOCKS, 0.3f, 0.7f);
                }
                if (bl2) break block2;
            }
            z2.a(null, n2, E.hY, ay.BLOCKS, 0.3f, 0.5f);
        }
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d();
        boolean bl3 = n2;
        if (!bl2) {
            bl3 = bl3;
        }
        return i2.a(C, bl3);
    }

    protected O(net.minecraft.ac.c c10, w w2) {
        super(c10);
        this.h(this.e.a().a(C, false));
        this.D = w2;
    }

    @Override
    protected int a(i i2) {
        boolean bl2 = cL.e();
        int n2 = i2.b(C).booleanValue();
        if (bl2) {
            n2 = n2 != 0 ? 15 : 0;
        }
        return n2;
    }

    static {
        C = net.minecraft.ae.c.a("powered");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int e(z z2, n n2) {
        List<x> list;
        k k2 = B.a(n2);
        boolean bl2 = cL.e();
        int n3 = dz.a[this.D.ordinal()];
        if (!bl2) return n3;
        switch (n3) {
            case 1: {
                list = z2.b(null, k2);
                if (bl2) break;
            }
            case 2: {
                list = z2.a(B.class, k2);
                if (bl2) break;
            }
            default: {
                return 0;
            }
        }
        int n4 = list.isEmpty();
        if (!bl2) return n4;
        if (n4 != 0) return 0;
        Iterator<x> iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return 0;
            x x2 = iterator.next();
            n4 = x2.aC() ? 1 : 0;
            if (!bl2) return n4;
            if (!bl2) int n5;
            return n5;
            if (n4 != 0) continue;
            return 15;
        } while (bl2);
        return 0;
    }

    @Override
    protected void a(z z2, n n2) {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    bl2 = cL.b();
                    if (bl2) break block0;
                    if (this.y != net.minecraft.ac.c.k) break block1;
                    z2.a(null, n2, E.fA, ay.BLOCKS, 0.3f, 0.8f);
                }
                if (!bl2) break block2;
            }
            z2.a(null, n2, E.ct, ay.BLOCKS, 0.3f, 0.6f);
        }
    }
}

