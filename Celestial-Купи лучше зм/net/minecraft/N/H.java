/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.ar.ao;
import net.minecraft.ar.ay;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.u.g;

public class H
extends y
implements ao {
    public /* synthetic */ float k;
    public /* synthetic */ int j;
    private /* synthetic */ int i;
    public /* synthetic */ float l;

    public void e() {
        ++this.j;
        this.a.a(this.d, g.ba, 1, this.j);
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            if (bl2) {
                this.j = n3;
                return true;
            }
            bl2 = super.a(n2, n3);
        }
        return bl2;
    }

    @Override
    public void c() {
        block22: {
            block28: {
                H h2;
                float f10;
                block26: {
                    m[] arrm;
                    block27: {
                        float f11;
                        double d10;
                        int n2;
                        int n3;
                        int n4;
                        block25: {
                            block23: {
                                H h3;
                                block24: {
                                    float f12;
                                    block19: {
                                        block20: {
                                            int n5;
                                            block21: {
                                                block17: {
                                                    block18: {
                                                        block15: {
                                                            block16: {
                                                                arrm = net.minecraft.N.j.f();
                                                                int n6 = ++this.i % 20 * 4;
                                                                if (arrm == null) {
                                                                    if (n6 == 0) {
                                                                        this.a.a(this.d, g.ba, 1, this.j);
                                                                    }
                                                                    this.l = this.k;
                                                                    n6 = this.d.e();
                                                                }
                                                                n4 = n6;
                                                                n3 = this.d.b();
                                                                n2 = this.d.a();
                                                                float f13 = 0.1f;
                                                                n5 = this.j;
                                                                if (arrm != null) break block15;
                                                                if (n5 <= 0) break block16;
                                                                float f14 = this.k - 0.0f;
                                                                n5 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                if (arrm != null) break block15;
                                                                if (n5 == 0) {
                                                                    double d11 = (double)n4 + 0.5;
                                                                    d10 = (double)n2 + 0.5;
                                                                    this.a.a(null, d11, (double)n3 + 0.5, d10, E.cc, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
                                                                }
                                                            }
                                                            n5 = this.j;
                                                        }
                                                        if (arrm != null) break block17;
                                                        if (n5 != 0) break block18;
                                                        f12 = this.k;
                                                        if (arrm != null) break block19;
                                                        if (f12 > 0.0f) break block20;
                                                    }
                                                    n5 = this.j;
                                                }
                                                if (arrm != null) break block21;
                                                if (n5 <= 0) break block22;
                                                f12 = this.k;
                                                if (arrm != null) break block19;
                                                float f15 = f12 - 1.0f;
                                                n5 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                            }
                                            if (n5 >= 0) break block22;
                                        }
                                        f12 = this.k;
                                    }
                                    f11 = f12;
                                    h3 = this;
                                    if (arrm != null) break block23;
                                    if (h3.j <= 0) break block24;
                                    this.k += 0.1f;
                                    if (arrm == null) break block25;
                                }
                                h3 = this;
                            }
                            h3.k -= 0.1f;
                        }
                        float f16 = this.k;
                        if (arrm == null) {
                            if (f16 > 1.0f) {
                                this.k = 1.0f;
                            }
                            f16 = 0.5f;
                        }
                        float f17 = f16;
                        float f18 = this.k - 0.5f;
                        f10 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                        if (arrm != null) break block26;
                        if (f10 >= 0) break block27;
                        float f19 = f11 - 0.5f;
                        f10 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                        if (arrm != null) break block26;
                        if (f10 >= 0) {
                            d10 = (double)n4 + 0.5;
                            double d12 = (double)n2 + 0.5;
                            this.a.a(null, d10, (double)n3 + 0.5, d12, E.cd, ay.BLOCKS, 0.5f, this.a.J.nextFloat() * 0.1f + 0.9f);
                        }
                    }
                    h2 = this;
                    if (arrm != null) break block28;
                    float f20 = h2.k - 0.0f;
                    f10 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                }
                if (f10 >= 0) break block22;
                h2 = this;
            }
            h2.k = 0.0f;
        }
    }

    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        if (this.a.b(this.d) != this) {
            return false;
        }
        double d10 = j2.a((double)this.d.e() + 0.5, (double)this.d.b() + 0.5, (double)this.d.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void i() {
        this.t();
        super.i();
    }

    public void d() {
        --this.j;
        this.a.a(this.d, g.ba, 1, this.j);
    }
}

