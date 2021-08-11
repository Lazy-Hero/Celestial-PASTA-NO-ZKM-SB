/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.Q;
import net.minecraft.B.R;
import net.minecraft.B.a;
import net.minecraft.B.j;
import net.minecraft.B.n;
import net.minecraft.N.M;
import net.minecraft.az.g;
import net.minecraft.i.h;
import net.minecraft.w.d;

public class t
extends n {
    private /* synthetic */ int k;
    private /* synthetic */ int n;
    private final /* synthetic */ a m;
    private /* synthetic */ int o;
    private /* synthetic */ int l;

    public t(h h2, a a10) {
        int n2;
        int n3;
        block4: {
            int n4;
            int n5 = net.minecraft.B.n.c();
            this.m = a10;
            this.a(new D(a10, 0, 56, 17));
            n3 = n5;
            this.a(new Q(a10, 1, 56, 53));
            this.a(new R(h2.g, a10, 2, 116, 35));
            n2 = 0;
            while (n2 < 3) {
                block5: {
                    n4 = 0;
                    if (n3 != 0) break block4;
                    for (int i2 = v1397893; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                        }
                        break block5;
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            n4 = n2 = 0;
        }
        while (n2 < 9) {
            this.a(new D(h2, n2, 8 + n2 * 18, 142));
            ++n2;
            if (n3 == 0) continue;
        }
    }

    @Override
    public void a() {
        block8: {
            t t2;
            super.a();
            int n2 = net.minecraft.B.n.b();
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                j j2 = (j)this.d.get(i2);
                t2 = this;
                if (n2 != 0) {
                    int n3 = t2.n;
                    int n4 = this.m.c(2);
                    if (n2 != 0) {
                        if (n3 != n4) {
                            j2.a((n)this, 2, this.m.c(2));
                        }
                        n3 = this.o;
                        n4 = this.m.c(0);
                    }
                    if (n2 != 0) {
                        if (n3 != n4) {
                            j2.a((n)this, 0, this.m.c(0));
                        }
                        n3 = this.k;
                        n4 = this.m.c(1);
                    }
                    if (n2 != 0) {
                        if (n3 != n4) {
                            j2.a((n)this, 1, this.m.c(1));
                        }
                        n3 = this.l;
                        n4 = this.m.c(3);
                    }
                    if (n3 == n4) continue;
                    j2.a((n)this, 3, this.m.c(3));
                    if (n2 != 0) continue;
                }
                break block8;
            }
            this.n = this.m.c(2);
            this.o = this.m.c(0);
            this.k = this.m.c(1);
            t2 = this;
        }
        t2.l = this.m.c(3);
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        return this.m.a(j2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(net.minecraft.i.j var1_1, int var2_2) {
        block28: {
            block27: {
                block22: {
                    block17: {
                        block18: {
                            block19: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block24: {
                                                block20: {
                                                    block21: {
                                                        block15: {
                                                            block16: {
                                                                var4_3 = net.minecraft.w.d.m;
                                                                var5_4 = (D)this.f.get(var2_2);
                                                                var3_5 = net.minecraft.B.n.c();
                                                                v0 = var5_4;
                                                                if (var3_5 == 0) {
                                                                    if (v0 == null) return var4_3;
                                                                    v0 = var5_4;
                                                                }
                                                                if (var3_5 == 0) {
                                                                    if (v0.b() == false) return var4_3;
                                                                    v0 = var5_4;
                                                                }
                                                                var6_6 = v0.d();
                                                                var4_3 = var6_6.C();
                                                                v1 = var2_2;
                                                                v2 = 2;
                                                                if (var3_5 != 0) break block15;
                                                                if (v1 != v2) break block16;
                                                                if (!this.a(var6_6, 3, 39, true)) {
                                                                    return net.minecraft.w.d.m;
                                                                }
                                                                var5_4.a(var6_6, var4_3);
                                                                if (var3_5 == 0) break block17;
                                                            }
                                                            v1 = var2_2;
                                                            if (var3_5 != 0) break block18;
                                                            v2 = 1;
                                                        }
                                                        if (v1 == v2) break block19;
                                                        v1 = var2_2;
                                                        if (var3_5 != 0) break block18;
                                                        if (v1 == 0) break block19;
                                                        v1 = g.a().b(var6_6).G() ? 1 : 0;
                                                        if (var3_5 != 0) break block20;
                                                        if (v1 != 0) break block21;
                                                        v1 = this.a(var6_6, 0, 1, false) ? 1 : 0;
                                                        if (var3_5 != 0) break block22;
                                                        if (v1 == 0) {
                                                            return net.minecraft.w.d.m;
                                                        }
                                                        break block17;
                                                    }
                                                    v1 = M.c(var6_6) ? 1 : 0;
                                                }
                                                if (var3_5 != 0) break block23;
                                                if (v1 == 0) break block24;
                                                v1 = this.a(var6_6, 1, 2, false) ? 1 : 0;
                                                if (var3_5 != 0) break block22;
                                                if (v1 == 0) {
                                                    return net.minecraft.w.d.m;
                                                }
                                                break block17;
                                            }
                                            v1 = var2_2;
                                        }
                                        v3 = 3;
                                        if (var3_5 != 0) break block25;
                                        if (v1 < v3) break block26;
                                        v1 = var2_2;
                                        v3 = 30;
                                        if (var3_5 != 0) break block25;
                                        if (v1 >= v3) break block26;
                                        v1 = this.a(var6_6, 30, 39, false) ? 1 : 0;
                                        if (var3_5 != 0) break block22;
                                        if (v1 == 0) {
                                            return net.minecraft.w.d.m;
                                        }
                                        break block17;
                                    }
                                    v1 = var2_2;
                                    if (var3_5 != 0) break block22;
                                    v3 = 30;
                                }
                                if (v1 < v3) break block17;
                                v1 = var2_2;
                                if (var3_5 != 0) break block22;
                                if (v1 >= 39) break block17;
                                v1 = this.a(var6_6, 3, 30, false) ? 1 : 0;
                                if (var3_5 != 0) break block22;
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                }
                                break block17;
                            }
                            v1 = this.a(var6_6, 3, 39, false) ? 1 : 0;
                        }
                        if (var3_5 == 0) {
                            if (v1 == 0) {
                                return net.minecraft.w.d.m;
                            } else {
                                ** GOTO lbl84
                            }
                        }
                        break block22;
                    }
                    v1 = var6_6.G() ? 1 : 0;
                }
                if (v1 == 0) break block27;
                var5_4.a(net.minecraft.w.d.m);
                if (var3_5 == 0) break block28;
            }
            var5_4.f();
        }
        v4 = var6_6;
        if (var3_5 != 0) return var4_3;
        if (v4.t() == var4_3.t()) {
            return net.minecraft.w.d.m;
        }
        v4 = var5_4.a(var1_1, var6_6);
        return var4_3;
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        j2.a((n)this, this.m);
    }

    @Override
    public void a(int n2, int n3) {
        this.m.b(n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

