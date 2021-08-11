/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.u.b;

public class H
extends u {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(u u2) {
        String[] arrstring = T.b();
        u u4 = this;
        u4 = u2;
        if (arrstring == null) {
            if (!super.a(u4)) return false;
            u u4 = u2;
            u4 = net.minecraft.u.b.v;
        }
        if (u3 == u4) return false;
        return true;
    }

    @Override
    public int f() {
        return 3;
    }

    protected H(a a10, h h2, X ... arrx) {
        block2: {
            block3: {
                h h3;
                h h4;
                String[] arrstring;
                block0: {
                    block1: {
                        String[] arrstring2 = T.b();
                        super(a10, h2, arrx);
                        arrstring = arrstring2;
                        h4 = h2;
                        h3 = h.DIGGER;
                        if (arrstring != null) break block0;
                        if (h4 != h3) break block1;
                        this.b("lootBonusDigger");
                        if (arrstring == null) break block2;
                    }
                    h4 = h2;
                    h3 = h.FISHING_ROD;
                }
                if (h4 != h3) break block3;
                this.b("lootBonusFishing");
                if (arrstring == null) break block2;
            }
            this.b("lootBonus");
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }
}

