/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.ar.a3;
import net.minecraft.i.j;
import net.minecraft.k.n;

public class i
extends h {
    /* synthetic */ z h;
    protected /* synthetic */ int g;
    private /* synthetic */ int d;
    private /* synthetic */ double m;
    private /* synthetic */ double j;
    private /* synthetic */ double f;
    protected final /* synthetic */ int i = 20;
    /* synthetic */ net.minecraft.e.h l;
    protected /* synthetic */ D k;
    /* synthetic */ boolean e;
    /* synthetic */ double c;

    protected double a(B b10) {
        return this.k.ad * 2.0f * this.k.ad * 2.0f + b10.ad;
    }

    @Override
    public void g() {
        block2: {
            block3: {
                block5: {
                    boolean bl2;
                    block4: {
                        B b10 = this.k.J();
                        String string = net.minecraft.ak.h.h();
                        if (string != null) break block2;
                        if (!(b10 instanceof j)) break block3;
                        bl2 = ((j)b10).ae();
                        if (string != null) break block4;
                        if (bl2) break block5;
                        bl2 = ((j)b10).C();
                    }
                    if (!bl2) break block3;
                }
                this.k.d((B)null);
            }
            this.k.l().f();
        }
    }

    @Override
    public void a() {
        this.k.l().a(this.l, this.c);
        this.d = 0;
    }

    @Override
    public void b() {
        i i2;
        double d10;
        B b10;
        block7: {
            block8: {
                double d11;
                block16: {
                    String string;
                    block15: {
                        block13: {
                            double d12;
                            block14: {
                                block11: {
                                    block12: {
                                        block9: {
                                            double d13;
                                            block10: {
                                                int n2;
                                                block5: {
                                                    block6: {
                                                        String string2 = net.minecraft.ak.h.h();
                                                        b10 = this.k.J();
                                                        this.k.I().a(b10, 30.0f, 30.0f);
                                                        d10 = this.k.a(b10.a, b10.m().b, b10.ax);
                                                        string = string2;
                                                        --this.d;
                                                        n2 = this.e;
                                                        if (string != null) break block5;
                                                        if (n2 != 0) break block6;
                                                        i2 = this;
                                                        if (string != null) break block7;
                                                        if (!i2.k.v().a(b10)) break block8;
                                                    }
                                                    i2 = this;
                                                    if (string != null) break block7;
                                                    n2 = i2.d;
                                                }
                                                if (n2 > 0) break block8;
                                                double d14 = this.m - 0.0;
                                                d11 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                                if (string != null) break block9;
                                                if (d11 != false) break block10;
                                                double d15 = this.f - 0.0;
                                                d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                                if (string != null) break block9;
                                                if (d11 != false) break block10;
                                                double d16 = this.j - 0.0;
                                                d11 = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                                                if (string != null) break block11;
                                                if (d11 == false) break block12;
                                            }
                                            d11 = (d13 = b10.a(this.m, this.f, this.j) - 1.0) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                        }
                                        if (string != null) break block11;
                                        if (d11 >= 0) break block12;
                                        i2 = this;
                                        if (string != null) break block7;
                                        if (!(i2.k.f().nextFloat() < 0.05f)) break block8;
                                    }
                                    this.m = b10.a;
                                    this.f = b10.m().b;
                                    this.j = b10.ax;
                                    this.d = 4 + this.k.f().nextInt(7);
                                    double d17 = d10 - 1024.0;
                                    d11 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                }
                                if (string != null) break block13;
                                if (d11 <= 0) break block14;
                                this.d += 10;
                                if (string == null) break block15;
                            }
                            d11 = (d12 = d10 - 256.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                        }
                        if (string != null) break block16;
                        if (d11 > 0) {
                            this.d += 5;
                        }
                    }
                    i2 = this;
                    if (string != null) break block7;
                    d11 = (double)i2.k.l().a(b10, this.c);
                }
                if (d11 == false) {
                    this.d += 15;
                }
            }
            this.g = Math.max(this.g - 1, 0);
            i2 = this;
        }
        i2.a(b10, d10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        B b10 = this.k.J();
        String string = net.minecraft.ak.h.h();
        B b11 = b10;
        if (string == null) {
            if (b11 == null) {
                return false;
            }
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = this.e;
        }
        if (string == null) {
            if (!bl2) {
                boolean bl3 = this.k.l().o();
                if (string != null) return bl3;
                if (bl3) return false;
                return true;
            }
            bl2 = this.k.a(new n(b10));
        }
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = b10 instanceof j;
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = ((j)b10).ae();
        if (string == null) {
            if (bl2) return false;
            bl2 = ((j)b10).C();
        }
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }

    public i(D d10, double d11, boolean bl2) {
        this.i = 20;
        this.k = d10;
        this.h = d10.aG;
        this.c = d11;
        this.e = bl2;
        this.a(3);
    }

    protected void a(B b10, double d10) {
        block5: {
            double d11;
            String string;
            block4: {
                double d12 = this.a(b10);
                string = net.minecraft.ak.h.h();
                d11 = d10 == d12 ? 0 : (d10 < d12 ? -1 : 1);
                if (string != null) break block4;
                if (d11 > 0) break block5;
                d11 = this.g;
            }
            if (string == null && d11 <= 0) {
                this.g = 20;
                this.k.b(a3.MAIN_HAND);
                d11 = (double)this.k.j(b10);
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        double d10;
        String string;
        B b10;
        block9: {
            boolean bl2;
            block8: {
                b10 = this.k.J();
                string = net.minecraft.ak.h.h();
                B b11 = b10;
                if (string == null) {
                    if (b11 == null) {
                        return false;
                    }
                    b11 = b10;
                }
                bl2 = b11.aL();
                if (string != null) break block8;
                if (bl2) break block9;
                bl2 = false;
            }
            return bl2;
        }
        this.l = this.k.l().a(b10);
        i i2 = this;
        if (string == null) {
            if (i2.l != null) {
                return true;
            }
            i2 = this;
        }
        double d11 = (d10 = i2.a(b10) - this.k.a(b10.a, b10.m().b, b10.ax)) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (string == null) {
            d11 = d11 >= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }
}

