/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.T.aR;
import net.minecraft.T.aX;
import net.minecraft.U.B;
import net.minecraft.ak.X;
import net.minecraft.ak.h;
import net.minecraft.y.g;

public class Y
extends X {
    /* synthetic */ B k;
    /* synthetic */ aX l;

    @Override
    public void a() {
        this.l.d(this.k);
        super.a();
    }

    public Y(aX aX2) {
        super(aX2, false, true);
        this.l = aX2;
        this.a(1);
    }

    @Override
    public boolean c() {
        g g10 = this.l.d();
        String string = net.minecraft.ak.h.h();
        if (string == null) {
            if (g10 == null) {
                return false;
            }
            this.k = g10.c(this.l);
        }
        int n2 = this.k instanceof aR;
        if (string == null) {
            if (n2 != 0) {
                return false;
            }
            n2 = this.a(this.k, false);
        }
        if (string == null) {
            if (n2 != 0) {
                return true;
            }
            n2 = this.e.f().nextInt(20);
        }
        if (string == null) {
            if (n2 == 0) {
                this.k = g10.a(this.l);
                return this.a(this.k, false);
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

