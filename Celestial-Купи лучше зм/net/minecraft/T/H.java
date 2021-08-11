/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import java.util.Random;
import net.minecraft.T.S;
import net.minecraft.T.aZ;
import net.minecraft.ak.d;
import net.minecraft.ak.h;

class H
extends h {
    private final /* synthetic */ aZ c;

    public H(aZ aZ2) {
        this.c = aZ2;
        this.a(1);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void a() {
        Random random = this.c.f();
        double d10 = this.c.a + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d11 = this.c.aF + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d12 = this.c.ax + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.c.w().a(d10, d11, d12, 1.0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean c() {
        d d10 = this.c.w();
        int[] arrn = S.f();
        d d11 = d10;
        if (arrn != null) {
            if (!d11.c()) {
                return true;
            }
            d11 = d10;
        }
        double d12 = d11.b() - this.c.a;
        double d13 = d10.e() - this.c.aF;
        double d14 = d10.f() - this.c.ax;
        double d15 = d12 * d12 + d13 * d13 + d14 * d14;
        double d16 = d15 - 1.0;
        double d17 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
        if (arrn == null) return (boolean)d17;
        if (d17 >= 0) {
            double d18 = d15 - 3600.0;
            d17 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
            if (arrn == null) return (boolean)d17;
            if (d17 <= 0) {
                d17 = 0.0;
                return (boolean)d17;
            }
        }
        d17 = 1.0;
        return (boolean)d17;
    }
}

