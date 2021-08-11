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

public class N
extends u {
    @Override
    public int a(int n2) {
        return 15;
    }

    protected N(a a10, X ... arrx) {
        super(a10, h.DIGGER, arrx);
        this.b("untouching");
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
            u4 = net.minecraft.u.b.B;
        }
        if (u3 == u4) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int f() {
        return 1;
    }
}

