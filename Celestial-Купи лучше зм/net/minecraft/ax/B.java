/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.w.d;

public class B
extends u {
    protected B(a a10, X ... arrx) {
        super(a10, h.DIGGER, arrx);
        this.b("digging");
    }

    @Override
    public int f() {
        return 5;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a(int n2) {
        return 1 + 10 * (n2 - 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10) {
        String[] arrstring = T.b();
        if (d10.w() == net.minecraft.u.h.aT) return true;
        boolean bl2 = super.a(d10);
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

