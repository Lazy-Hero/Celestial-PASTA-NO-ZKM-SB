/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.ah;
import net.minecraft.T.j;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.ak.au;

class t
extends au<net.minecraft.i.j> {
    private final /* synthetic */ ah r;
    private /* synthetic */ int q;
    private /* synthetic */ int s;
    private /* synthetic */ net.minecraft.i.j p;

    @Override
    public boolean c() {
        double d10 = this.a();
        this.p = this.r.aG.a(this.r.a, this.r.aF, this.r.ax, d10, d10, null, new j(this));
        return this.p != null;
    }

    static ah a(t t2) {
        return t2.r;
    }

    @Override
    public void g() {
        this.p = null;
        super.g();
    }

    @Override
    public void a() {
        this.s = 5;
        this.q = 0;
    }

    @Override
    public void b() {
        block9: {
            t t2;
            block10: {
                block11: {
                    int n2;
                    int[] arrn;
                    block12: {
                        block13: {
                            B b10;
                            block6: {
                                block7: {
                                    t t3;
                                    block8: {
                                        arrn = S.f();
                                        b10 = this.p;
                                        if (arrn == null) break block6;
                                        if (b10 == null) break block7;
                                        t t4 = this;
                                        t3 = t4;
                                        t t5 = t4;
                                        if (arrn == null) break block8;
                                        t5.s = t3.s - 1;
                                        if (t5.s > 0) break block9;
                                        t5 = this;
                                        t3 = this;
                                    }
                                    t5.l = t3.p;
                                    this.p = null;
                                    super.a();
                                    if (arrn != null) break block9;
                                }
                                t2 = this;
                                if (arrn == null) break block10;
                                b10 = t2.l;
                            }
                            if (b10 == null) break block11;
                            n2 = ah.a(this.r, (net.minecraft.i.j)this.l);
                            if (arrn == null) break block12;
                            if (n2 == 0) break block13;
                            t t6 = this;
                            if (arrn != null) {
                                if (((net.minecraft.i.j)t6.l).s(this.r) < 16.0) {
                                    this.r.y();
                                }
                                t6 = this;
                            }
                            t6.q = 0;
                            if (arrn != null) break block11;
                        }
                        t2 = this;
                        if (arrn == null) break block10;
                        double d10 = ((net.minecraft.i.j)t2.l).s(this.r) - 256.0;
                        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (n2 <= 0) break block11;
                    t2 = this;
                    if (arrn == null) break block10;
                    if (t2.q++ < 30) break block11;
                    t2 = this;
                    if (arrn == null) break block10;
                    if (t2.r.k(this.l)) {
                        this.q = 0;
                    }
                }
                t2 = this;
            }
            super.b();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        boolean bl2;
        t t2;
        int[] arrn;
        block7: {
            B b10;
            block6: {
                arrn = S.f();
                b10 = this.p;
                if (arrn == null) break block6;
                if (b10 != null) {
                    boolean bl3 = ah.a(this.r, this.p);
                    if (arrn == null) return bl3;
                    if (!bl3) {
                        return false;
                    }
                    this.r.a((x)this.p, 10.0f, 10.0f);
                    return true;
                }
                t2 = this;
                if (arrn == null) break block7;
                b10 = t2.l;
            }
            if (b10 != null) {
                bl2 = ((net.minecraft.i.j)this.l).aL();
                if (arrn == null) return bl2;
                if (bl2) return true;
            }
            t2 = this;
        }
        bl2 = super.e();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public t(ah ah2) {
        super((D)ah2, net.minecraft.i.j.class, false);
        this.r = ah2;
    }
}

