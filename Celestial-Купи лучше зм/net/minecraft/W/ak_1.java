/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dA;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.f;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.ax.T;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.b;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public abstract class ak
extends K
implements dA {
    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block6: {
            block4: {
                int n3;
                k k2;
                int n4;
                boolean bl2;
                block5: {
                    block3: {
                        bl2 = cL.e();
                        n4 = y2 instanceof f;
                        if (!bl2) break block3;
                        if (n4 == 0) break block4;
                        n4 = ((f)((Object)y2)).g();
                    }
                    if (!bl2) break block5;
                    if (n4 == 0) break block4;
                    j2.b(net.minecraft.l.m.a(this));
                    j2.c(0.005f);
                    n4 = z2.C ? 1 : 0;
                }
                if (bl2) {
                    if (n4 != 0) {
                        return;
                    }
                    n4 = T.a(net.minecraft.u.b.B, d10);
                }
                if ((k2 = this.a(i2, z2.J, n3 = n4)) == net.minecraft.u.h.v) {
                    return;
                }
                d d11 = new d(k2, this.a(z2.J));
                d11.d(((f)((Object)y2)).g());
                ak.a(z2, n2, d11);
                if (bl2) break block6;
            }
            super.a(z2, j2, n2, i2, null, d10);
        }
    }

    protected ak(c c10, a a10) {
        super(c10, a10);
        this.n = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(i i2, z z2, n n2, int n3, int n4) {
        y y2;
        boolean bl2 = cL.e();
        super.a(i2, z2, n2, n3, n4);
        boolean bl3 = bl2;
        y y3 = y2 = z2.b(n2);
        if (bl3) {
            if (y3 == null) return false;
            y3 = y2;
        }
        boolean bl4 = y3.a(n3, n4);
        if (!bl3) return bl4;
        if (!bl4) return false;
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        super.a(z2, n2, i2);
        z2.z(n2);
    }

    @Override
    public aW b(i i2) {
        return aW.INVISIBLE;
    }

    protected boolean b(z z2, n n2, aA aA2) {
        return z2.d(n2.a(aA2)).o() == net.minecraft.ac.c.m;
    }

    protected ak(c c10) {
        this(c10, c10.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean b(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2, aA.NORTH);
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.b(z2, n2, aA.SOUTH);
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.b(z2, n2, aA.WEST);
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.b(z2, n2, aA.EAST);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

