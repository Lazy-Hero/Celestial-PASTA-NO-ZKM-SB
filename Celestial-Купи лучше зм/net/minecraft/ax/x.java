/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.I;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class x
extends u {
    public x(a a10, X ... arrx) {
        super(a10, h.BOW, arrx);
        this.b("arrowInfinite");
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public int b(int n2) {
        return 50;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(u u2) {
        String[] arrstring = T.b();
        boolean bl2 = u2 instanceof I;
        if (arrstring == null) {
            if (bl2) return false;
            bl2 = super.a(u2);
        }
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public int a(int n2) {
        return 20;
    }

    @Override
    public int f() {
        return 1;
    }
}

