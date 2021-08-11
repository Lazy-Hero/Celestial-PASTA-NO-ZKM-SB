/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.m;

public class O
extends h {
    /* synthetic */ B d;
    /* synthetic */ C f;
    /* synthetic */ int e;
    /* synthetic */ z c;

    @Override
    public boolean c() {
        B b10 = this.f.J();
        String string = h.h();
        if (string == null) {
            if (b10 == null) {
                return false;
            }
            this.d = b10;
        }
        return true;
    }

    public O(C c10) {
        this.f = c10;
        this.c = c10.aG;
        this.a(3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.d.aL();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            double d10 = this.f.s(this.d) - 225.0;
            bl2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (bl2 > false) {
                return false;
            }
            bl2 = this.f.l().o();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = this.c();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void b() {
        block13: {
            double d10;
            String string;
            block12: {
                block11: {
                    double d11;
                    double d12;
                    double d13;
                    block10: {
                        block8: {
                            double d14;
                            block9: {
                                String string2 = h.h();
                                this.f.I().a(this.d, 30.0f, 30.0f);
                                string = string2;
                                d13 = this.f.ad * 2.0f * this.f.ad * 2.0f;
                                d12 = this.f.a(this.d.a, this.d.m().b, this.d.ax);
                                d11 = 0.8;
                                d10 = d12 == d13 ? 0 : (d12 > d13 ? 1 : -1);
                                if (string != null) break block8;
                                if (d10 <= 0) break block9;
                                double d15 = d12 - 16.0;
                                d10 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                if (string != null) break block8;
                                if (d10 >= 0) break block9;
                                d11 = 1.33;
                                if (string == null) break block10;
                                m.b(!m.c());
                            }
                            d10 = (d14 = d12 - 225.0) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        }
                        if (string != null) break block11;
                        if (d10 < 0) {
                            d11 = 0.6;
                        }
                    }
                    this.f.l().a(this.d, d11);
                    this.e = Math.max(this.e - 1, 0);
                    d10 = d12 == d13 ? 0 : (d12 < d13 ? -1 : 1);
                }
                if (string != null) break block12;
                if (d10 > 0) break block13;
                d10 = this.e;
            }
            if (string == null && d10 <= 0) {
                this.e = 20;
                d10 = (double)this.f.j(this.d);
            }
        }
    }

    @Override
    public void g() {
        this.d = null;
        this.f.l().f();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

