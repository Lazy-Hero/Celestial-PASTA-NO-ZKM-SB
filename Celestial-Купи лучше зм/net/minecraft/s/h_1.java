/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.aA.n;
import net.minecraft.ah.L;
import net.minecraft.k.m;

public class h
extends d {
    private final /* synthetic */ net.minecraft.A.h[] j;
    private final /* synthetic */ net.minecraft.A.h[] g;
    private /* synthetic */ net.minecraft.A.h[] i;
    private final /* synthetic */ n a;
    private final /* synthetic */ net.minecraft.A.h[] h;

    public h(long l2, d d10, L l3, n n2) {
        block5: {
            block4: {
                block2: {
                    h h2;
                    block3: {
                        m[] arrm = d.b();
                        super(l2);
                        m[] arrm2 = arrm;
                        this.i = new net.minecraft.A.h[]{net.minecraft.u.d.ab, net.minecraft.u.d.ab, net.minecraft.u.d.ab, net.minecraft.u.d.q, net.minecraft.u.d.q, net.minecraft.u.d.s};
                        this.j = new net.minecraft.A.h[]{net.minecraft.u.d.L, net.minecraft.u.d.Y, net.minecraft.u.d.W, net.minecraft.u.d.s, net.minecraft.u.d.k, net.minecraft.u.d.n};
                        this.g = new net.minecraft.A.h[]{net.minecraft.u.d.L, net.minecraft.u.d.W, net.minecraft.u.d.Z, net.minecraft.u.d.s};
                        this.h = new net.minecraft.A.h[]{net.minecraft.u.d.S, net.minecraft.u.d.S, net.minecraft.u.d.S, net.minecraft.u.d.aa};
                        h2 = this;
                        if (arrm2 == null) break block2;
                        h2.f = d10;
                        if (l3 != L.j) break block3;
                        this.i = new net.minecraft.A.h[]{net.minecraft.u.d.ab, net.minecraft.u.d.L, net.minecraft.u.d.W, net.minecraft.u.d.n, net.minecraft.u.d.s, net.minecraft.u.d.Z};
                        this.a = null;
                        if (arrm2 != null) break block4;
                    }
                    h2 = this;
                }
                h2.a = n2;
            }
            if (!m.c()) break block5;
            d.b(new m[3]);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int[] a(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = this.f.a(var1_1, var2_2, var3_3, var4_4);
        var7_6 = b.a(var3_3 * var4_4);
        var8_7 = 0;
        var5_8 = d.b();
        block0: do {
            if (var8_7 >= var4_4) return var7_6;
            for (var9_9 = 0; var9_9 < var3_3; ++var9_9) {
                block23: {
                    block24: {
                        block26: {
                            block25: {
                                this.a((long)(var9_9 + var1_1), (long)(var8_7 + var2_2));
                                var10_10 = var6_5[var9_9 + var8_7 * var3_3];
                                var11_11 = (var10_10 & 3840) >> 8;
                                v0 = var10_10 & -3841;
                                if (var5_8 != null) {
                                    var10_10 = v0;
                                    if (var5_8 == null) continue block0;
                                    if (this.a != null) {
                                        v0 = this.a.d;
                                        if (var5_8 != null) {
                                            if (v0 >= 0) {
                                                var7_6[var9_9 + var8_7 * var3_3] = this.a.d;
                                                if (var5_8 != null) continue;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 4 sources

                                    {
                                        v0 = net.minecraft.S.h.b(var10_10) ? 1 : 0;
                                    }
                                }
                                if (var5_8 != null) {
                                    if (v0 != 0) {
                                        var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                        if (var5_8 != null) continue;
                                    }
                                    v0 = var10_10;
                                }
                                v1 = net.minecraft.A.h.b(net.minecraft.u.d.v);
                                if (var5_8 != null) {
                                    if (v0 == v1) {
                                        var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                        if (var5_8 != null) continue;
                                    }
                                    v0 = var10_10;
                                    v1 = 1;
                                }
                                if (var5_8 == null) break block23;
                                if (v0 != v1) break block24;
                                v2 = var11_11;
                                if (var5_8 == null) break block25;
                                if (v2 <= 0) break block26;
                                v2 = this.a(3);
                            }
                            if (v2 == 0) {
                                var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(net.minecraft.u.d.b);
                                if (var5_8 != null) continue;
                            }
                            var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(net.minecraft.u.d.t);
                            if (var5_8 != null) continue;
                        }
                        var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(this.i[this.a(this.i.length)]);
                        if (var5_8 != null) continue;
                    }
                    v0 = var10_10;
                    v1 = 2;
                }
                if (var5_8 != null) {
                    if (v0 == v1) {
                        if (var11_11 > 0) {
                            var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(net.minecraft.u.d.l);
                            if (var5_8 != null) continue;
                        }
                        var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(this.j[this.a(this.j.length)]);
                        if (var5_8 != null) continue;
                    }
                    v0 = var10_10;
                    v1 = 3;
                }
                if (var5_8 != null) {
                    if (v0 == v1) {
                        if (var11_11 > 0) {
                            var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(net.minecraft.u.d.B);
                            if (var5_8 != null) continue;
                        }
                        var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(this.g[this.a(this.g.length)]);
                        if (var5_8 != null) continue;
                    }
                    v0 = var10_10;
                    v1 = 4;
                }
                if (v0 == v1) {
                    var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(this.h[this.a(this.h.length)]);
                    if (var5_8 != null) continue;
                }
                var7_6[var9_9 + var8_7 * var3_3] = net.minecraft.A.h.b(net.minecraft.u.d.v);
                if (var5_8 != null) continue;
            }
            ++var8_7;
        } while (var5_8 != null);
        return var7_6;
    }
}

