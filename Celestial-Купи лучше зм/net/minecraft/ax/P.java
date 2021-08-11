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

public class P
extends u {
    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    public P(a a10, X ... arrx) {
        super(a10, h.ARMOR_FEET, arrx);
        this.b("waterWalker");
    }

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
            u4 = net.minecraft.u.b.h;
        }
        if (u3 == u4) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

