/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.R;
import net.minecraft.ak.X;
import net.minecraft.ak.h;

public class av
extends X {
    /* synthetic */ R l;
    private /* synthetic */ int k;
    /* synthetic */ B m;

    @Override
    public void a() {
        String string = net.minecraft.ak.h.h();
        this.e.d(this.m);
        String string2 = string;
        x x2 = this.l.a();
        if (string2 == null) {
            if (x2 != null) {
                this.k = ((B)x2).aO();
            }
            super.a();
        }
    }

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
            this.m = r2.aM();
            r3 = r2;
        }
        boolean bl3 = bl2 = r3.aO();
        if (string == null) {
            if (bl3 == this.k) return false;
            bl3 = this.a(this.m, false);
        }
        if (string == null) {
            if (!bl3) return false;
            bl3 = this.l.a(this.m, r2);
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public av(R r2) {
        super(r2, false);
        this.l = r2;
        this.a(1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

