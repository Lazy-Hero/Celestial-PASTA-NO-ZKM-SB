/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.ai;
import net.minecraft.T.f;
import net.minecraft.ak.h;
import net.minecraft.e.k;

class O
extends h {
    private final /* synthetic */ ai c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = this.c.aj();
        if (arrn == null) return bl2;
        if (bl2) return true;
        bl2 = this.c.av();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void b() {
        int[] arrn = S.f();
        ai ai2 = this.c;
        if (arrn != null) {
            if (ai2.f().nextFloat() < 0.8f) {
                this.c.V().b();
            }
            ai2 = this.c;
        }
        ((f)ai2.w()).a(1.2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public O(ai ai2) {
        this.c = ai2;
        this.a(5);
        ((k)ai2.l()).a(true);
    }
}

