/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.ag.W;
import net.minecraft.ak.aa;
import net.minecraft.ak.h;
import net.minecraft.i.j;

public class aH
extends aa {
    private final /* synthetic */ W i;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.i.H();
        if (string == null) {
            if (bl2) {
                this.c = this.i.b();
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public aH(W w2) {
        super(w2, j.class, 8.0f);
        this.i = w2;
    }
}

