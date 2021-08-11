/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import java.util.Random;
import net.minecraft.E.s;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

class A {
    /* synthetic */ double a;
    /* synthetic */ double b;

    float b() {
        return h.e(this.b * this.b + this.a * this.a);
    }

    A() {
    }

    public int a(z z2) {
        n n2 = new n(this.b, 256.0, this.a);
        m[] arrm = s.b();
        while (n2.b() > 0) {
            n n3 = n2.k();
            while (z2.d(n2 = n3).o() != c.A) {
                n3 = n2;
                if (arrm == null) continue;
                return n3.b() + 1;
            }
        }
        return 257;
    }

    public void a(Random random, double d10, double d11, double d12, double d13) {
        this.b = h.a(random, d10, d12);
        this.a = h.a(random, d11, d13);
    }

    public void b(A a10) {
        this.b -= a10.b;
        this.a -= a10.a;
    }

    double a(A a10) {
        double d10 = this.b - a10.b;
        double d11 = this.a - a10.a;
        return Math.sqrt(d10 * d10 + d11 * d11);
    }

    void a() {
        double d10 = this.b();
        this.b /= d10;
        this.a /= d10;
    }

    public boolean a(double d10, double d11, double d12, double d13) {
        double d14;
        block15: {
            boolean bl2;
            block14: {
                m[] arrm;
                block12: {
                    double d15;
                    block13: {
                        block11: {
                            double d16;
                            block10: {
                                block8: {
                                    double d17;
                                    block9: {
                                        bl2 = false;
                                        arrm = s.b();
                                        double d18 = this.b - d10;
                                        d14 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                                        if (arrm == null) break block8;
                                        if (d14 >= 0) break block9;
                                        this.b = d10;
                                        bl2 = true;
                                        if (arrm != null) break block10;
                                    }
                                    d14 = (d17 = this.b - d12) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                }
                                if (arrm == null) break block11;
                                if (d14 > 0) {
                                    this.b = d12;
                                    bl2 = true;
                                }
                            }
                            d14 = (d16 = this.a - d11) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        }
                        if (arrm == null) break block12;
                        if (d14 >= 0) break block13;
                        this.a = d11;
                        bl2 = true;
                        if (arrm != null) break block14;
                    }
                    d14 = (d15 = this.a - d13) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                }
                if (arrm == null) break block15;
                if (d14 > 0) {
                    this.a = d13;
                    bl2 = true;
                }
            }
            d14 = (double)bl2;
        }
        return (boolean)d14;
    }

    A(double d10, double d11) {
        this.b = d10;
        this.a = d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(z z2) {
        n n2 = new n(this.b, 256.0, this.a);
        m[] arrm = s.b();
        do {
            c c10;
            if (n2.b() <= 0) return false;
            n2 = n2.k();
            c c11 = c10 = z2.d(n2).o();
            if (arrm != null) {
                if (c11 == c.A) continue;
                c11 = c10;
            }
            if (arrm != null) {
                if (c11.b()) return false;
                c11 = c10;
            }
            if (c11 == c.w) return false;
            return true;
        } while (arrm != null);
        return false;
    }
}

