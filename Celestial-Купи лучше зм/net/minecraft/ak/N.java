/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;

public class N
extends h {
    private /* synthetic */ B g;
    private /* synthetic */ double f;
    private final /* synthetic */ float h;
    private /* synthetic */ double i;
    private final /* synthetic */ D c;
    private final /* synthetic */ double d;
    private /* synthetic */ double e;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.g = null;
    }

    public N(D d10, double d11, float f10) {
        this.c = d10;
        this.d = d11;
        this.h = f10;
        this.a(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        int n2 = this.c.l().o();
        if (string == null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.g.aL();
        }
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            double d10 = this.g.s(this.c) - (double)(this.h * this.h);
            n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        }
        if (string != null) return n2 != 0;
        if (n2 >= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void a() {
        this.c.l().a(this.e, this.f, this.i, this.d);
    }

    @Override
    public boolean c() {
        N n2;
        String string;
        block8: {
            B b10;
            block7: {
                this.g = this.c.J();
                string = net.minecraft.ak.h.h();
                b10 = this.g;
                if (string != null) break block7;
                if (b10 == null) {
                    return false;
                }
                n2 = this;
                if (string != null) break block8;
                b10 = n2.g;
            }
            if (b10.s(this.c) > (double)(this.h * this.h)) {
                return false;
            }
            n2 = this;
        }
        l l2 = net.minecraft.ak.g.b(n2.c, 16, 7, new l(this.g.a, this.g.aF, this.g.ax));
        if (string == null) {
            if (l2 == null) {
                return false;
            }
            this.e = l2.e;
            this.f = l2.d;
            this.i = l2.b;
        }
        return true;
    }
}

