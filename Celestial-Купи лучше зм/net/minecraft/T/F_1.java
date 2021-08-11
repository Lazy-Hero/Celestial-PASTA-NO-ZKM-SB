/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aZ;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;

class F
extends h {
    private final /* synthetic */ aZ d;
    public /* synthetic */ int c;

    @Override
    public boolean c() {
        return this.d.J() != null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        this.c = 0;
    }

    @Override
    public void g() {
        this.d.a(false);
    }

    public F(aZ aZ2) {
        this.d = aZ2;
    }

    @Override
    public void b() {
        F f10;
        int[] arrn;
        block11: {
            block10: {
                double d10;
                block8: {
                    block9: {
                        B b10 = this.d.J();
                        double d11 = 64.0;
                        arrn = S.f();
                        double d12 = b10.s(this.d) - 4096.0;
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                        if (arrn == null) break block8;
                        if (d10 >= 0) break block9;
                        d10 = (double)this.d.c((x)b10);
                        if (arrn == null) break block8;
                        if (d10 == false) break block9;
                        z z2 = this.d.aG;
                        int n2 = ++this.c;
                        int n3 = 10;
                        if (arrn != null) {
                            if (n2 == n3) {
                                z2.a(null, 1015, new n(this.d), 0);
                            }
                            n2 = this.c;
                            n3 = 20;
                        }
                        if (n2 == n3) {
                            double d13 = 4.0;
                            l l2 = this.d.b(1.0f);
                            double d14 = b10.a - (this.d.a + l2.e * 4.0);
                            double d15 = b10.m().b + (double)(b10.aD / 2.0f) - (0.5 + this.d.aF + (double)(this.d.aD / 2.0f));
                            double d16 = b10.ax - (this.d.ax + l2.b * 4.0);
                            z2.a(null, 1016, new n(this.d), 0);
                            net.minecraft.z.l l3 = new net.minecraft.z.l(z2, this.d, d14, d15, d16);
                            l3.aQ = this.d.a();
                            l3.a = this.d.a + l2.e * 4.0;
                            l3.aF = this.d.aF + (double)(this.d.aD / 2.0f) + 0.5;
                            l3.ax = this.d.ax + l2.b * 4.0;
                            z2.f(l3);
                            this.c = -40;
                        }
                        if (arrn != null) break block10;
                    }
                    f10 = this;
                    if (arrn == null) break block11;
                    d10 = f10.c;
                }
                if (d10 > 0) {
                    // empty if block
                }
            }
            f10 = this;
        }
        int n4 = --this.c;
        if (arrn != null) {
            n4 = n4 > 10 ? 1 : 0;
        }
        f10.d.a(n4 != 0);
    }
}

