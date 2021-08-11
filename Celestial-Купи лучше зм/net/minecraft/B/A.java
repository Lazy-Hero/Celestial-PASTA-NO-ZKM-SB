/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.P;
import net.minecraft.B.a;
import net.minecraft.B.l;
import net.minecraft.B.m;
import net.minecraft.B.n;
import net.minecraft.ah.z;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class A
extends n {
    private final /* synthetic */ net.minecraft.k.n o;
    private final /* synthetic */ z n;
    private final /* synthetic */ j k;
    public /* synthetic */ l m;
    public /* synthetic */ m l;

    public A(h h2, z z2, net.minecraft.k.n n2) {
        int n3;
        int n4;
        block9: {
            int n5;
            int n6;
            block7: {
                int n7;
                this.l = new m(this, 3, 3);
                n4 = net.minecraft.B.n.c();
                this.m = new l();
                this.n = z2;
                this.o = n2;
                this.k = h2.g;
                this.a(new P(h2.g, this.l, this.m, 0, 124, 35));
                n3 = 0;
                while (n3 < 3) {
                    block8: {
                        n7 = 0;
                        if (n4 != 0) break block7;
                        for (n6 = v1387573; n6 < 3; ++n6) {
                            this.a(new D(this.l, n6 + n3 * 3, 30 + n6 * 18, 17 + n3 * 18));
                            if (n4 == 0) {
                                if (n4 == 0) continue;
                            }
                            break block8;
                        }
                        ++n3;
                    }
                    if (n4 == 0) continue;
                }
                n7 = n3 = 0;
            }
            while (n3 < 3) {
                block10: {
                    n5 = 0;
                    if (n4 != 0) break block9;
                    for (n6 = v1387606; n6 < 9; ++n6) {
                        this.a(new D(h2, n6 + n3 * 9 + 9, 8 + n6 * 18, 84 + n3 * 18));
                        if (n4 == 0) {
                            if (n4 == 0) continue;
                        }
                        break block10;
                    }
                    ++n3;
                }
                if (n4 == 0) continue;
            }
            n5 = n3 = 0;
        }
        while (n3 < 9) {
            this.a(new D(h2, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n4 == 0) continue;
        }
    }

    @Override
    public void a(a a10) {
        this.a(this.n, this.k, this.l, this.m);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(j var1_1, int var2_2) {
        block14: {
            block25: {
                block24: {
                    block21: {
                        block18: {
                            block22: {
                                block23: {
                                    block19: {
                                        block20: {
                                            block16: {
                                                block17: {
                                                    block15: {
                                                        block13: {
                                                            var4_3 = net.minecraft.w.d.m;
                                                            var3_4 = net.minecraft.B.n.b();
                                                            v0 = var5_5 = (D)this.f.get(var2_2);
                                                            if (var3_4 == 0) break block13;
                                                            if (v0 == null) break block14;
                                                            v0 = var5_5;
                                                        }
                                                        if (var3_4 == 0) break block15;
                                                        if (!v0.b()) break block14;
                                                        v0 = var5_5;
                                                    }
                                                    var6_6 = v0.d();
                                                    var4_3 = var6_6.C();
                                                    v1 = var2_2;
                                                    if (var3_4 == 0) break block16;
                                                    if (v1 != 0) break block17;
                                                    var6_6.w().a(var6_6, this.n, var1_1);
                                                    if (var3_4 != 0) {
                                                        if (!this.a(var6_6, 10, 46, true)) {
                                                            return net.minecraft.w.d.m;
                                                        }
                                                        var5_5.a(var6_6, var4_3);
                                                    }
                                                    if (var3_4 != 0) break block18;
                                                }
                                                v1 = var2_2;
                                            }
                                            v2 = 10;
                                            if (var3_4 == 0) break block19;
                                            if (v1 < v2) break block20;
                                            v1 = var2_2;
                                            v2 = 37;
                                            if (var3_4 == 0) break block19;
                                            if (v1 >= v2) break block20;
                                            v1 = this.a(var6_6, 37, 46, false) ? 1 : 0;
                                            if (var3_4 == 0) break block21;
                                            if (v1 == 0) {
                                                return net.minecraft.w.d.m;
                                            }
                                            break block18;
                                        }
                                        v1 = var2_2;
                                        if (var3_4 == 0) break block22;
                                        v2 = 37;
                                    }
                                    if (v1 < v2) break block23;
                                    v1 = var2_2;
                                    if (var3_4 == 0) break block22;
                                    if (v1 >= 46) break block23;
                                    v1 = this.a(var6_6, 10, 37, false) ? 1 : 0;
                                    if (var3_4 == 0) break block21;
                                    if (v1 == 0) {
                                        return net.minecraft.w.d.m;
                                    }
                                    break block18;
                                }
                                v1 = this.a(var6_6, 10, 46, false) ? 1 : 0;
                            }
                            if (var3_4 != 0) {
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                } else {
                                    ** GOTO lbl59
                                }
                            }
                            break block21;
                        }
                        v1 = var6_6.G() ? 1 : 0;
                    }
                    if (v1 == 0) break block24;
                    var5_5.a(net.minecraft.w.d.m);
                    if (var3_4 != 0) break block25;
                }
                var5_5.f();
            }
            v3 = var6_6;
            if (var3_4 != 0) {
                if (v3.t() == var4_3.t()) {
                    return net.minecraft.w.d.m;
                }
                v3 = var5_5.a(var1_1, var6_6);
            }
            if (var3_4 == 0) return v3;
            var7_7 = v3;
            if (var2_2 == 0) {
                var1_1.a(var7_7, false);
            }
        }
        v3 = var4_3;
        return v3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, D d11) {
        int n2 = net.minecraft.B.n.b();
        if (d11.c == this.m) return false;
        boolean bl2 = super.a(d10, d11);
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public boolean a(j j2) {
        int n2 = net.minecraft.B.n.c();
        if (this.n.d(this.o).b() != g.aj) {
            return false;
        }
        double d10 = j2.a((double)this.o.e() + 0.5, (double)this.o.b() + 0.5, (double)this.o.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (n2 == 0) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(j j2) {
        block3: {
            A a10;
            block2: {
                int n2 = net.minecraft.B.n.c();
                super.b(j2);
                int n3 = n2;
                a10 = this;
                if (n3 != 0) break block2;
                if (a10.n.C) break block3;
                a10 = this;
            }
            a10.a(j2, this.n, this.l);
        }
    }
}

