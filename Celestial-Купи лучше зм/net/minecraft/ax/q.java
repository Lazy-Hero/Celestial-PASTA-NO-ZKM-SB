/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.T;
import net.minecraft.ax.h;
import net.minecraft.w.k;
import net.minecraft.w.m;

final class q
extends h {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(k k2) {
        String[] arrstring = T.b();
        k k3 = k2;
        if (arrstring == null) {
            if (!(k3 instanceof m)) return false;
            k3 = k2;
        }
        if (((m)k3).A != X.HEAD) return false;
        return true;
    }
}

