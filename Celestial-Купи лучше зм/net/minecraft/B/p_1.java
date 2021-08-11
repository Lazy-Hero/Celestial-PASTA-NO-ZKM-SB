/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.F;
import net.minecraft.B.G;
import net.minecraft.B.H;
import net.minecraft.B.a;
import net.minecraft.B.j;
import net.minecraft.B.n;
import net.minecraft.i.h;
import net.minecraft.w.d;

public class p
extends n {
    private final /* synthetic */ a l;
    private /* synthetic */ int m;
    private final /* synthetic */ D n;
    private /* synthetic */ int k;

    @Override
    public void b(j j2) {
        super.b(j2);
        j2.a((n)this, this.l);
    }

    @Override
    public void a() {
        block4: {
            p p2;
            int n2 = net.minecraft.B.n.c();
            super.a();
            int n3 = n2;
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                j j2 = (j)this.d.get(i2);
                p2 = this;
                if (n3 == 0) {
                    int n4 = p2.k;
                    int n5 = this.l.c(0);
                    if (n3 == 0) {
                        if (n4 != n5) {
                            j2.a((n)this, 0, this.l.c(0));
                        }
                        n4 = this.m;
                        n5 = this.l.c(1);
                    }
                    if (n4 == n5) continue;
                    j2.a((n)this, 1, this.l.c(1));
                    if (n3 == 0) continue;
                }
                break block4;
            }
            this.k = this.l.c(0);
            p2 = this;
        }
        p2.m = this.l.c(1);
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        return this.l.a(j2);
    }

    @Override
    public void a(int n2, int n3) {
        this.l.b(n2, n3);
    }

    public p(h h2, a a10) {
        int n2;
        int n3;
        block4: {
            int n4;
            this.l = a10;
            this.a(new H(a10, 0, 56, 51));
            this.a(new H(a10, 1, 79, 58));
            int n5 = net.minecraft.B.n.c();
            this.a(new H(a10, 2, 102, 51));
            this.n = this.a(new G(a10, 3, 79, 17));
            this.a(new F(a10, 4, 17, 17));
            n3 = 0;
            n2 = n5;
            while (n3 < 3) {
                block5: {
                    n4 = 0;
                    if (n2 != 0) break block4;
                    for (int i2 = v1418403; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n3 * 9 + 9, 8 + i2 * 18, 84 + n3 * 18));
                        if (n2 == 0) {
                            if (n2 == 0) continue;
                        }
                        break block5;
                    }
                    ++n3;
                }
                if (n2 == 0) continue;
            }
            n4 = n3 = 0;
        }
        while (n3 < 9) {
            this.a(new D(h2, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n2 == 0) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public d b(net.minecraft.i.j j2, int n2) {
        d d10;
        block14: {
            d d11;
            int n3;
            D d12;
            block33: {
                block32: {
                    int n4;
                    block22: {
                        block23: {
                            int n5;
                            block18: {
                                block19: {
                                    block30: {
                                        block31: {
                                            int n6;
                                            block28: {
                                                block29: {
                                                    block26: {
                                                        block27: {
                                                            block24: {
                                                                block25: {
                                                                    block20: {
                                                                        block21: {
                                                                            block16: {
                                                                                block17: {
                                                                                    D d13;
                                                                                    block15: {
                                                                                        block13: {
                                                                                            d10 = net.minecraft.w.d.m;
                                                                                            d12 = (D)this.f.get(n2);
                                                                                            n3 = net.minecraft.B.n.c();
                                                                                            d13 = d12;
                                                                                            if (n3 != 0) break block13;
                                                                                            if (d13 == null) break block14;
                                                                                            d13 = d12;
                                                                                        }
                                                                                        if (n3 != 0) break block15;
                                                                                        if (!d13.b()) break block14;
                                                                                        d13 = d12;
                                                                                    }
                                                                                    d11 = d13.d();
                                                                                    d10 = d11.C();
                                                                                    n5 = n2;
                                                                                    if (n3 != 0) break block16;
                                                                                    if (n5 < 0) break block17;
                                                                                    n5 = n2;
                                                                                    if (n3 != 0) break block18;
                                                                                    if (n5 <= 2) break block19;
                                                                                }
                                                                                n5 = n2;
                                                                            }
                                                                            if (n3 != 0) break block18;
                                                                            if (n5 == 3) break block19;
                                                                            n5 = n2;
                                                                            if (n3 != 0) break block18;
                                                                            if (n5 == 4) break block19;
                                                                            n4 = this.n.d(d11);
                                                                            if (n3 != 0) break block20;
                                                                            if (n4 == 0) break block21;
                                                                            n4 = this.a(d11, 3, 4, false) ? 1 : 0;
                                                                            if (n3 != 0) break block22;
                                                                            if (n4 == 0) {
                                                                                return net.minecraft.w.d.m;
                                                                            }
                                                                            break block23;
                                                                        }
                                                                        n4 = H.a(d10);
                                                                    }
                                                                    if (n3 != 0) break block24;
                                                                    if (n4 == 0) break block25;
                                                                    n4 = d10.t();
                                                                    if (n3 != 0) break block24;
                                                                    if (n4 != 1) break block25;
                                                                    n4 = this.a(d11, 0, 3, false) ? 1 : 0;
                                                                    if (n3 != 0) break block22;
                                                                    if (n4 == 0) {
                                                                        return net.minecraft.w.d.m;
                                                                    }
                                                                    break block23;
                                                                }
                                                                n4 = F.a(d10);
                                                            }
                                                            if (n3 != 0) break block26;
                                                            if (n4 == 0) break block27;
                                                            n4 = this.a(d11, 4, 5, false) ? 1 : 0;
                                                            if (n3 != 0) break block22;
                                                            if (n4 == 0) {
                                                                return net.minecraft.w.d.m;
                                                            }
                                                            break block23;
                                                        }
                                                        n4 = n2;
                                                    }
                                                    n6 = 5;
                                                    if (n3 != 0) break block28;
                                                    if (n4 < n6) break block29;
                                                    int n6 = n2;
                                                    n6 = 32;
                                                    if (n3 != 0) break block28;
                                                    if (n4 >= n6) break block29;
                                                    n4 = this.a(d11, 32, 41, false) ? 1 : 0;
                                                    if (n3 != 0) break block22;
                                                    if (n4 == 0) {
                                                        return net.minecraft.w.d.m;
                                                    }
                                                    break block23;
                                                }
                                                n4 = n2;
                                                if (n3 != 0) break block30;
                                                n6 = 32;
                                            }
                                            if (n4 < n6) break block31;
                                            n4 = n2;
                                            if (n3 != 0) break block30;
                                            if (n4 >= 41) break block31;
                                            n4 = this.a(d11, 5, 32, false) ? 1 : 0;
                                            if (n3 != 0) break block22;
                                            if (n4 == 0) {
                                                return net.minecraft.w.d.m;
                                            }
                                            break block23;
                                        }
                                        n4 = this.a(d11, 5, 41, false) ? 1 : 0;
                                    }
                                    if (n3 != 0) break block22;
                                    if (n4 == 0) {
                                        return net.minecraft.w.d.m;
                                    }
                                    break block23;
                                }
                                n5 = this.a(d11, 5, 41, true) ? 1 : 0;
                            }
                            if (n5 == 0) {
                                return net.minecraft.w.d.m;
                            }
                            d12.a(d11, d10);
                        }
                        n4 = d11.G();
                    }
                    if (n4 == 0) break block32;
                    d12.a(net.minecraft.w.d.m);
                    if (n3 == 0) break block33;
                }
                d12.f();
            }
            d d14 = d11;
            if (n3 == 0) {
                if (d14.t() == d10.t()) {
                    return net.minecraft.w.d.m;
                }
                d14 = d12.a(j2, d11);
            }
        }
        return d10;
    }
}

