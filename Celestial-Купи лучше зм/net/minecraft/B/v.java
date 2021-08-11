/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.K;
import net.minecraft.B.L;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.ag.E;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class v
extends n {
    private final /* synthetic */ net.minecraft.ag.D k;
    private final /* synthetic */ a l;

    @Override
    public d b(j j2, int n2) {
        d d10;
        block8: {
            D d11;
            block20: {
                int n3;
                int n4;
                block12: {
                    d d12;
                    block13: {
                        block19: {
                            block18: {
                                block16: {
                                    block17: {
                                        block14: {
                                            block15: {
                                                block10: {
                                                    block11: {
                                                        D d13;
                                                        block9: {
                                                            block7: {
                                                                d10 = net.minecraft.w.d.m;
                                                                n4 = n.b();
                                                                d13 = d11 = (D)this.f.get(n2);
                                                                if (n4 == 0) break block7;
                                                                if (d13 == null) break block8;
                                                                d13 = d11;
                                                            }
                                                            if (n4 == 0) break block9;
                                                            if (!d13.b()) break block8;
                                                            d13 = d11;
                                                        }
                                                        d12 = d13.d();
                                                        d10 = d12.C();
                                                        n3 = n2;
                                                        if (n4 == 0) break block10;
                                                        if (n3 >= this.l.e()) break block11;
                                                        n3 = this.a(d12, this.l.e(), this.f.size(), true) ? 1 : 0;
                                                        if (n4 == 0) break block12;
                                                        if (n3 == 0) {
                                                            return net.minecraft.w.d.m;
                                                        }
                                                        break block13;
                                                    }
                                                    n3 = this.a(1).d(d12) ? 1 : 0;
                                                }
                                                if (n4 == 0) break block14;
                                                if (n3 == 0) break block15;
                                                n3 = this.a(1).b() ? 1 : 0;
                                                if (n4 == 0) break block14;
                                                if (n3 != 0) break block15;
                                                n3 = this.a(d12, 1, 2, false) ? 1 : 0;
                                                if (n4 == 0) break block12;
                                                if (n3 == 0) {
                                                    return net.minecraft.w.d.m;
                                                }
                                                break block13;
                                            }
                                            n3 = this.a(0).d(d12) ? 1 : 0;
                                        }
                                        if (n4 == 0) break block16;
                                        if (n3 == 0) break block17;
                                        n3 = this.a(d12, 0, 1, false) ? 1 : 0;
                                        if (n4 == 0) break block12;
                                        if (n3 == 0) {
                                            return net.minecraft.w.d.m;
                                        }
                                        break block13;
                                    }
                                    n3 = this.l.e();
                                }
                                if (n4 == 0) break block18;
                                if (n3 <= 2) break block19;
                                n3 = this.a(d12, 2, this.l.e(), false) ? 1 : 0;
                            }
                            if (n4 == 0) break block12;
                            if (n3 != 0) break block13;
                        }
                        return net.minecraft.w.d.m;
                    }
                    n3 = d12.G() ? 1 : 0;
                }
                if (n3 == 0) break block20;
                d11.a(net.minecraft.w.d.m);
                if (n4 != 0) break block8;
            }
            d11.f();
        }
        return d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public v(a var1_1, a var2_2, net.minecraft.ag.D var3_3, j var4_4) {
        block14: {
            block12: {
                super();
                this.l = var2_2;
                this.k = var3_3;
                var5_5 = n.c();
                var6_6 = 3;
                var2_2.c(var4_4);
                var7_7 = -18;
                this.a(new K(this, var2_2, 0, 8, 18, var3_3));
                this.a(new L(this, var2_2, 1, 8, 36, var3_3));
                v0 = var3_3 instanceof E;
                if (var5_5 == 0) {
                    if (v0 != 0) {
                        v0 = ((E)var3_3).F() ? 1 : 0;
                        if (var5_5 == 0) {
                            if (v0 != 0) {
                                var8_8 = 0;
                                while (var8_8 < 3) {
                                    block13: {
                                        v0 = 0;
                                        if (var5_5 != 0) break block12;
                                        for (var9_9 = v1409927; var9_9 < ((E)var3_3).a(); ++var9_9) {
                                            this.a(new D(var2_2, 2 + var9_9 + var8_8 * ((E)var3_3).a(), 80 + var9_9 * 18, 18 + var8_8 * 18));
                                            if (var5_5 == 0) {
                                                if (var5_5 == 0) continue;
                                            }
                                            break block13;
                                        }
                                        ++var8_8;
                                    }
                                    if (var5_5 == 0) continue;
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 5 sources

                    {
                        v0 = var8_8 = 0;
                    }
                }
            }
            while (var8_8 < 3) {
                block15: {
                    v1 = 0;
                    if (var5_5 != 0) break block14;
                    for (var9_9 = v1409962; var9_9 < 9; ++var9_9) {
                        this.a(new D(var1_1, var9_9 + var8_8 * 9 + 9, 8 + var9_9 * 18, 102 + var8_8 * 18 + -18));
                        if (var5_5 == 0) {
                            if (var5_5 == 0) continue;
                        }
                        break block15;
                    }
                    ++var8_8;
                }
                if (var5_5 == 0) continue;
            }
            v1 = 0;
        }
        var8_8 = v1;
        do {
            if (var8_8 >= 9) return;
            this.a(new D(var1_1, var8_8, 8 + var8_8 * 18, 142));
            ++var8_8;
        } while (var5_5 == 0);
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        this.l.d(j2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        int n2 = n.b();
        int n3 = this.l.a(j2);
        if (n2 != 0) {
            if (n3 == 0) return 0 != 0;
            n3 = this.k.aL();
        }
        if (n2 != 0) {
            if (n3 == 0) return 0 != 0;
            float f10 = this.k.o(j2) - 8.0f;
            n3 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        }
        if (n2 == 0) return n3 != 0;
        if (n3 >= 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

