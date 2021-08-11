/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.R;
import net.minecraft.ak.X;
import net.minecraft.ak.h;

public class aw
extends X {
    private /* synthetic */ int m;
    /* synthetic */ B k;
    /* synthetic */ R l;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        boolean bl2;
        R r2;
        String string = net.minecraft.ak.h.h();
        x x2 = this.l;
        if (string == null) {
            if (!x2.U()) {
                return false;
            }
            x2 = this.l.a();
        }
        R r3 = r2 = x2;
        if (string == null) {
            if (r3 == null) {
                return false;
            }
            this.k = r2.aA();
            r3 = r2;
        }
        boolean bl3 = bl2 = r3.Z();
        if (string == null) {
            if (bl3 == this.m) return false;
            bl3 = this.a(this.k, false);
        }
        if (string == null) {
            if (!bl3) return false;
            bl3 = this.l.a(this.k, r2);
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public aw(R r2) {
        super(r2, false);
        this.l = r2;
        this.a(1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        String string = net.minecraft.ak.h.h();
        this.e.d(this.k);
        String string2 = string;
        x x2 = this.l.a();
        if (string2 == null) {
            if (x2 != null) {
                this.m = ((B)x2).Z();
            }
            super.a();
        }
    }
}

