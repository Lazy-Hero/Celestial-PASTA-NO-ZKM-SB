/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.B.X;
import net.minecraft.U.D;
import net.minecraft.ak.h;
import net.minecraft.e.k;

public class S
extends h {
    private final /* synthetic */ D c;

    @Override
    public void a() {
        ((k)this.c.l()).b(true);
    }

    public S(D d10) {
        this.c = d10;
    }

    @Override
    public void g() {
        ((k)this.c.l()).b(false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = h.h();
        boolean bl2 = this.c.aG.R();
        if (string == null) {
            if (!bl2) return false;
            bl2 = this.c.b(X.HEAD).G();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

