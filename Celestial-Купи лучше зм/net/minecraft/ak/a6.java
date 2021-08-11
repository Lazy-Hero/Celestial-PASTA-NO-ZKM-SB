/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.E;
import net.minecraft.U.x;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.n;
import net.minecraft.y.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a6
extends h {
    private final /* synthetic */ z e;
    private final /* synthetic */ W d;
    private /* synthetic */ W c;
    private /* synthetic */ int g;
    /* synthetic */ g f;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = h.h();
        int n2 = this.g;
        if (string == null) {
            if (n2 < 0) return 0 != 0;
            n2 = this.f();
        }
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.d.z();
        }
        if (string == null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.d.s(false) ? 1 : 0;
        }
        if (string != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    public a6(W w2) {
        this.d = w2;
        this.e = w2.aG;
        this.a(3);
    }

    private void c() {
        E e10 = this.d.a(this.c);
        this.c.l(6000);
        this.d.l(6000);
        this.c.a(false);
        this.d.a(false);
        e10.l(-24000);
        e10.c(this.d.a, this.d.aF, this.d.ax, 0.0f, 0.0f);
        this.e.f(e10);
        this.e.a((x)e10, (byte)12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block9: {
            a6 a62;
            block8: {
                double d10;
                block7: {
                    String string;
                    block6: {
                        block4: {
                            block5: {
                                --this.g;
                                String string2 = h.h();
                                this.d.I().a(this.c, 10.0f, 30.0f);
                                string = string2;
                                double d11 = this.d.s(this.c) - 2.25;
                                d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                if (string != null) break block4;
                                if (d10 <= 0) break block5;
                                this.d.l().a(this.c, 0.25);
                                if (string == null) break block6;
                            }
                            d10 = this.g;
                        }
                        if (string != null) break block7;
                        if (d10 != false) break block6;
                        d10 = (double)this.c.Y();
                        if (string != null) break block7;
                        if (d10 != false) {
                            this.c();
                        }
                    }
                    a62 = this;
                    if (string != null) break block8;
                    d10 = a62.d.f().nextInt(35);
                }
                if (d10 != false) break block9;
                a62 = this;
            }
            a62.e.a((x)this.d, (byte)12);
        }
    }

    private boolean f() {
        String string = h.h();
        int n2 = this.f.l();
        if (string == null) {
            if (n2 == 0) {
                return false;
            }
            n2 = (int)((double)this.f.n() * 0.35);
        }
        int n3 = n2;
        int n4 = this.f.m();
        if (string == null) {
            n4 = n4 < n3;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        a6 a62;
        String string;
        block11: {
            int n2;
            block10: {
                string = h.h();
                n2 = this.d.z();
                if (string != null) break block10;
                if (n2 != 0) {
                    return false;
                }
                a62 = this;
                if (string != null) break block11;
                n2 = a62.d.f().nextInt(500);
            }
            if (n2 != 0) {
                return false;
            }
            this.f = this.e.n().a(new n(this.d), 0);
            a62 = this;
        }
        if (string == null) {
            if (a62.f == null) {
                return false;
            }
            a62 = this;
        }
        boolean bl2 = a62.f();
        if (string != null) return bl2;
        if (!bl2) return false;
        bl2 = this.d.s(true);
        if (string != null) return bl2;
        if (!bl2) return false;
        W w2 = this.e.a(W.class, this.d.m().a(8.0, 3.0, 8.0), this.d);
        if (string == null) {
            if (w2 == null) {
                return false;
            }
            this.c = w2;
        }
        boolean bl3 = this.c.z();
        if (string == null) {
            if (bl3) return false;
            bl3 = this.c.s(true);
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void a() {
        this.g = 300;
        this.d.r(true);
    }

    @Override
    public void g() {
        this.f = null;
        this.c = null;
        this.d.r(false);
    }
}

