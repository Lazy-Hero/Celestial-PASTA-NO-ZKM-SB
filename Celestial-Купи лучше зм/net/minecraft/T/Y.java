/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aS;
import net.minecraft.U.B;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.u.E;

class Y
extends h {
    final /* synthetic */ aS c;

    public Y(aS aS2) {
        this.c = aS2;
        this.a(1);
    }

    @Override
    public void a() {
        B b10 = this.c.J();
        l l2 = b10.c(1.0f);
        aS.e(this.c).a(l2.e, l2.d, l2.b, 1.0);
        this.c.a(true);
        this.c.a(E.ce, 1.0f, 1.0f);
    }

    @Override
    public void g() {
        this.c.a(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        B b10;
        int[] arrn;
        block5: {
            boolean bl2;
            block4: {
                arrn = S.f();
                bl2 = this.c.w().c();
                if (arrn == null) break block4;
                if (!bl2) return false;
                b10 = this.c;
                if (arrn == null) break block5;
                bl2 = ((aS)b10).f();
            }
            if (!bl2) return false;
            b10 = this.c.J();
        }
        if (arrn != null) {
            if (b10 == null) return false;
            b10 = this.c.J();
        }
        boolean bl3 = b10.aL();
        if (arrn == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        aS aS2 = this.c;
        if (arrn != null) {
            if (aS2.J() == null) return 0 != 0;
            aS2 = this.c;
        }
        int n2 = aS2.w().c();
        if (arrn == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        n2 = aS.a(this.c).nextInt(7);
        if (arrn == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        double d10 = this.c.s(this.c.J()) - 4.0;
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (arrn == null) return (boolean)d11;
        d11 = d11 > 0 ? 1.0 : 0.0;
        return (boolean)d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block6: {
            double d10;
            aS aS2;
            B b10;
            block4: {
                block5: {
                    b10 = this.c.J();
                    int[] arrn = S.f();
                    aS2 = this.c;
                    if (arrn == null) break block4;
                    if (!aS2.m().c(b10.m())) break block5;
                    this.c.j(b10);
                    this.c.a(false);
                    if (arrn != null) break block6;
                }
                aS2 = this.c;
            }
            if ((d10 = aS2.s(b10)) < 9.0) {
                l l2 = b10.c(1.0f);
                aS.b(this.c).a(l2.e, l2.d, l2.b, 1.0);
            }
        }
    }
}

