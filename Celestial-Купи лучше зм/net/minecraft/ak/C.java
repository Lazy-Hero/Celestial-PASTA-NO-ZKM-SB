/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.ak.h;

public class C
extends h {
    /* synthetic */ float d;
    /* synthetic */ net.minecraft.U.C e;
    /* synthetic */ B c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        this.c = this.e.J();
        String string = h.h();
        C c10 = this;
        if (string == null) {
            if (c10.c == null) {
                return false;
            }
            c10 = this;
        }
        double d10 = c10.e.s(this.c);
        double d11 = d10 - 4.0;
        double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (string != null) return (boolean)d12;
        if (d12 >= 0) {
            double d13 = d10 - 16.0;
            d12 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (string != null) return (boolean)d12;
            if (d12 <= 0) {
                int n2 = this.e.A;
                if (string == null) {
                    if (n2 == 0) {
                        return false;
                    }
                    n2 = this.e.f().nextInt(5);
                }
                if (string != null) return n2 != 0;
                if (n2 != 0) return 0 != 0;
                return 1 != 0;
            }
        }
        d12 = 0.0;
        return (boolean)d12;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.e.A;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public C(net.minecraft.U.C c10, float f10) {
        this.e = c10;
        this.d = f10;
        this.a(5);
    }

    @Override
    public void a() {
        double d10 = this.c.a - this.e.a;
        double d11 = this.c.ax - this.e.ax;
        float f10 = net.minecraft.k.h.e(d10 * d10 + d11 * d11);
        String string = h.h();
        if (string == null) {
            if ((double)f10 >= 1.0E-4) {
                this.e.aq += d10 / (double)f10 * 0.5 * (double)0.8f + this.e.aq * (double)0.2f;
                this.e.d += d11 / (double)f10 * 0.5 * (double)0.8f + this.e.d * (double)0.2f;
            }
            this.e.G = this.d;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

