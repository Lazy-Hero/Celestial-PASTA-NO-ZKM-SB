/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.J.o;
import net.minecraft.U.x;
import net.minecraft.W.Y;
import net.minecraft.W.bq;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aA
extends Y {
    protected static final /* synthetic */ k A;

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block0: {
            if (x2 instanceof o) break block0;
            aA.a(n2, k2, list, A);
        }
    }

    protected aA() {
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        boolean bl2 = cL.b();
        super.a(z2, n2, i2, x2);
        boolean bl3 = bl2;
        boolean bl4 = x2 instanceof o;
        if (!bl3 && bl4) {
            bl4 = z2.a(new n(n2), true);
        }
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(i i2) {
        boolean bl2 = cL.b();
        i i3 = i2;
        if (!bl2) {
            if (i3.b() == g.bQ) return true;
            i3 = i2;
        }
        if (i3.o() != net.minecraft.ac.c.O) return false;
        return true;
    }

    static {
        A = new k(0.0625, 0.0, 0.0625, 0.9375, 0.09375, 0.9375);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2) {
        c c10;
        boolean bl2 = cL.e();
        int n3 = n2.b();
        if (!bl2) return n3 != 0;
        if (n3 < 0) return 0 != 0;
        n3 = n2.b();
        if (!bl2) return n3 != 0;
        if (n3 >= 256) return 0 != 0;
        i i3 = z2.d(n2.k());
        c c11 = c10 = i3.o();
        c c12 = net.minecraft.ac.c.L;
        if (bl2) {
            if (c11 == c12) {
                int n4 = i3.b(bq.z);
                if (!bl2) return n4 != 0;
                if (n4 == 0) return 1 != 0;
            }
            c11 = c10;
            c12 = net.minecraft.ac.c.O;
        }
        if (c11 != c12) return 0 != 0;
        return 1 != 0;
    }
}

