/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.an;

import java.util.List;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.an.a;
import net.minecraft.ar.ay;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class b
extends a {
    private /* synthetic */ int aL;
    public /* synthetic */ long aK;
    private final /* synthetic */ boolean aN;
    private /* synthetic */ int aM;

    public b(z z2, double d10, double d11, double d12, boolean bl2) {
        block9: {
            int n2;
            String string;
            n n3;
            block16: {
                int n4;
                block15: {
                    n n5;
                    z z3;
                    block14: {
                        block12: {
                            block13: {
                                block11: {
                                    boolean bl3;
                                    block10: {
                                        block8: {
                                            super(z2);
                                            this.c(d10, d11, d12, 0.0f, 0.0f);
                                            this.aM = 2;
                                            this.aK = this.g.nextLong();
                                            this.aL = this.g.nextInt(3) + 1;
                                            this.aN = bl2;
                                            n3 = new n(this);
                                            string = net.minecraft.w.d.y();
                                            bl3 = bl2;
                                            if (string == null) break block8;
                                            if (bl3) break block9;
                                            bl3 = z2.C;
                                        }
                                        if (string == null) break block10;
                                        if (bl3) break block9;
                                        z3 = z2;
                                        if (string == null) break block11;
                                        bl3 = z3.M().c("doFireTick");
                                    }
                                    if (!bl3) break block9;
                                    z3 = z2;
                                }
                                if (string == null) break block12;
                                if (z3.g() == net.minecraft.ah.e.NORMAL) break block13;
                                z3 = z2;
                                if (string == null) break block12;
                                if (z3.g() != net.minecraft.ah.e.HARD) break block9;
                            }
                            z3 = z2;
                        }
                        n5 = n3;
                        if (string == null) break block14;
                        if (!z3.a(n5, 10)) break block9;
                        z3 = z2;
                        n5 = n3;
                    }
                    if (z3.d(n5).o() != c.A) break block15;
                    n4 = net.minecraft.u.g.C.a(z2, n3);
                    if (string == null) break block16;
                    if (n4 != 0) {
                        z2.a(n3, net.minecraft.u.g.C.d());
                    }
                }
                n4 = n2 = 0;
            }
            while (n2 < 4) {
                n n6 = n3.a(this.g.nextInt(3) - 1, this.g.nextInt(3) - 1, this.g.nextInt(3) - 1);
                if (string != null) {
                    if (z2.d(n6).o() == c.A) {
                        boolean bl4 = net.minecraft.u.g.C.a(z2, n6);
                        if (string != null && bl4) {
                            bl4 = z2.a(n6, net.minecraft.u.g.C.d());
                        }
                    }
                    ++n2;
                }
                if (string != null) continue;
                net.minecraft.k.m.b(!net.minecraft.k.m.d());
                break;
            }
        }
    }

    @Override
    public ay ad() {
        return ay.WEATHER;
    }

    @Override
    protected void f(r r2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
    }

    @Override
    public void ae() {
        block20: {
            block17: {
                int n2;
                String string;
                block18: {
                    block19: {
                        block16: {
                            block11: {
                                b b10;
                                block15: {
                                    block12: {
                                        block13: {
                                            block14: {
                                                String string2 = net.minecraft.w.d.y();
                                                super.ae();
                                                string = string2;
                                                n2 = this.aM;
                                                if (string != null) {
                                                    if (n2 == 2) {
                                                        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.hs, ay.WEATHER, 10000.0f, 0.8f + this.g.nextFloat() * 0.2f);
                                                        this.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.go, ay.WEATHER, 2.0f, 0.5f + this.g.nextFloat() * 0.2f);
                                                    }
                                                    n2 = --this.aM;
                                                }
                                                if (string == null) break block11;
                                                if (n2 >= 0) break block12;
                                                n2 = this.aL;
                                                if (string == null) break block13;
                                                if (n2 != 0) break block14;
                                                this.a();
                                                if (string != null) break block12;
                                            }
                                            n2 = this.aM;
                                        }
                                        if (string == null) break block11;
                                        if (n2 >= -this.g.nextInt(10)) break block12;
                                        --this.aL;
                                        this.aM = 1;
                                        n2 = this.aN ? 1 : 0;
                                        if (string == null) break block11;
                                        if (n2 != 0) break block12;
                                        n2 = this.aG.C ? 1 : 0;
                                        if (string == null) break block11;
                                        if (n2 != 0) break block12;
                                        this.aK = this.g.nextLong();
                                        n n3 = new n(this);
                                        n2 = this.aG.M().c("doFireTick") ? 1 : 0;
                                        if (string == null) break block11;
                                        if (n2 == 0) break block12;
                                        n2 = this.aG.a(n3, 10) ? 1 : 0;
                                        if (string == null) break block11;
                                        if (n2 == 0) break block12;
                                        b10 = this;
                                        if (string == null) break block15;
                                        if (b10.aG.d(n3).o() != c.A) break block12;
                                        n2 = net.minecraft.u.g.C.a(this.aG, n3) ? 1 : 0;
                                        if (string == null) break block11;
                                        if (n2 != 0) {
                                            this.aG.a(n3, net.minecraft.u.g.C.d());
                                        }
                                    }
                                    b10 = this;
                                }
                                n2 = b10.aM;
                            }
                            if (string == null) break block16;
                            if (n2 < 0) break block17;
                            n2 = this.aG.C ? 1 : 0;
                        }
                        if (string == null) break block18;
                        if (n2 == 0) break block19;
                        this.aG.c(2);
                        if (string != null) break block17;
                    }
                    n2 = this.aN ? 1 : 0;
                }
                if (n2 == 0) {
                    double d10 = 3.0;
                    List<x> list = this.aG.b((x)this, new k(this.a - 3.0, this.aF - 3.0, this.ax - 3.0, this.a + 3.0, this.aF + 6.0 + 3.0, this.ax + 3.0));
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        x x2 = list.get(i2);
                        x2.a(this);
                        if (string != null) continue;
                    }
                }
            }
            if (net.minecraft.k.m.d()) break block20;
            net.minecraft.w.d.e("By6wjc");
        }
    }

    @Override
    protected void a(r r2) {
    }
}

