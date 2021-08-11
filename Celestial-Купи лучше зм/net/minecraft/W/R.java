/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class R
extends K {
    private final /* synthetic */ boolean z;

    private static gP c(gP gP2) {
        return gP2;
    }

    protected R(c c10, boolean bl2, a a10) {
        super(c10, a10);
        this.z = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        R r2;
        boolean bl2;
        K k2;
        block9: {
            block10: {
                i i3;
                block8: {
                    block7: {
                        i3 = t2.d(n2.a(aA2));
                        k2 = i3.b();
                        bl2 = cL.b();
                        r2 = this;
                        if (bl2) break block7;
                        if (r2 == g.a) break block8;
                        r2 = this;
                    }
                    if (bl2) break block9;
                    if (r2 != g.a5) break block10;
                }
                if (i2 != i3) {
                    return true;
                }
                if (k2 == this) {
                    return false;
                }
            }
            r2 = this;
        }
        boolean bl3 = r2.z;
        if (!bl2) {
            if (!bl3) {
                if (k2 == this) return false;
            }
            bl3 = super.b(i2, t2, n2, aA2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected R(c c10, boolean bl2) {
        this(c10, bl2, c10.a());
    }

    @Override
    public boolean p(i i2) {
        return false;
    }
}

