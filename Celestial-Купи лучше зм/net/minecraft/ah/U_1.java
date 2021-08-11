/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.J.D;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.ax.K;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;

public class U {
    private final /* synthetic */ z c;
    private final /* synthetic */ List<n> a;
    private final /* synthetic */ x f;
    private final /* synthetic */ double d;
    private final /* synthetic */ Map<j, l> i;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ float g;
    private final /* synthetic */ double j;
    private final /* synthetic */ double e;
    private final /* synthetic */ Random b;
    private final /* synthetic */ boolean k;

    public U(z z2, x x2, double d10, double d11, double d12, float f10, List<n> list) {
        this(z2, x2, d10, d11, d12, f10, false, true, list);
    }

    public List<n> c() {
        return this.a;
    }

    public void a(boolean bl2) {
        block23: {
            U u2;
            String string;
            block22: {
                boolean bl3;
                block15: {
                    block19: {
                        block18: {
                            U u3;
                            block16: {
                                block17: {
                                    String string2 = z.I();
                                    this.c.a(null, this.e, this.j, this.d, E.bB, ay.BLOCKS, 4.0f, (1.0f + (this.c.J.nextFloat() - this.c.J.nextFloat()) * 0.2f) * 0.7f);
                                    string = string2;
                                    u3 = this;
                                    if (string == null) break block16;
                                    if (!(u3.g >= 2.0f)) break block17;
                                    u3 = this;
                                    if (string == null) break block16;
                                    if (!u3.h) break block17;
                                    this.c.a(aH.EXPLOSION_HUGE, this.e, this.j, this.d, 1.0, 0.0, 0.0, new int[0]);
                                    if (string != null) break block18;
                                }
                                u3 = this;
                            }
                            u3.c.a(aH.EXPLOSION_LARGE, this.e, this.j, this.d, 1.0, 0.0, 0.0, new int[0]);
                        }
                        bl3 = this.h;
                        if (string == null) break block15;
                        if (!bl3) break block19;
                        for (n n2 : this.a) {
                            net.minecraft.W.K k2;
                            i i2;
                            block21: {
                                int n3;
                                block20: {
                                    i2 = this.c.d(n2);
                                    k2 = i2.b();
                                    bl3 = bl2;
                                    if (string == null) break block15;
                                    if (string == null) break block20;
                                    if (!bl3) break block21;
                                    n3 = n2.e();
                                }
                                double d10 = (float)n3 + this.c.J.nextFloat();
                                double d11 = (float)n2.b() + this.c.J.nextFloat();
                                double d12 = (float)n2.a() + this.c.J.nextFloat();
                                double d13 = d10 - this.e;
                                double d14 = d11 - this.j;
                                double d15 = d12 - this.d;
                                double d16 = net.minecraft.k.h.e(d13 * d13 + d14 * d14 + d15 * d15);
                                d13 /= d16;
                                d14 /= d16;
                                d15 /= d16;
                                double d17 = 0.5 / (d16 / (double)this.g + 0.1);
                                this.c.a(aH.EXPLOSION_NORMAL, (d10 + this.e) / 2.0, (d11 + this.j) / 2.0, (d12 + this.d) / 2.0, d13 *= (d17 *= (double)(this.c.J.nextFloat() * this.c.J.nextFloat() + 0.3f)), d14 *= d17, d15 *= d17, new int[0]);
                                this.c.a(aH.SMOKE_NORMAL, d10, d11, d12, d13, d14, d15, new int[0]);
                            }
                            if (i2.o() != net.minecraft.ac.c.A) {
                                boolean bl4 = k2.a(this);
                                if (string != null) {
                                    if (bl4) {
                                        k2.a(this.c, n2, this.c.d(n2), 1.0f / this.g, 0);
                                    }
                                    bl4 = this.c.a(n2, net.minecraft.u.g.bf.d(), 3);
                                }
                                k2.a(this.c, n2, this);
                            }
                            if (string != null) continue;
                        }
                    }
                    u2 = this;
                    if (string == null) break block22;
                    bl3 = u2.k;
                }
                if (!bl3) break block23;
                u2 = this;
            }
            for (n n2 : u2.a) {
                block25: {
                    int n4;
                    block26: {
                        i i3;
                        block24: {
                            i3 = this.c.d(n2);
                            if (string == null) break block24;
                            if (i3.o() != net.minecraft.ac.c.A) break block25;
                            i3 = this.c.d(n2.k());
                        }
                        n4 = i3.m();
                        if (string == null) break block26;
                        if (n4 == 0) break block25;
                        n4 = this.b.nextInt(3);
                    }
                    if (string != null && n4 == 0) {
                        n4 = this.c.a(n2, net.minecraft.u.g.C.d()) ? 1 : 0;
                    }
                }
                if (string != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public U(z z2, x x2, double d10, double d11, double d12, float f10, boolean bl2, boolean bl3) {
        this.b = new Random();
        this.a = Lists.newArrayList();
        this.i = Maps.newHashMap();
        this.c = z2;
        this.f = x2;
        this.g = f10;
        this.e = d10;
        this.j = d11;
        this.d = d12;
        this.k = bl2;
        this.h = bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void e() {
        block17: {
            var2_1 = Sets.newHashSet();
            var3_2 = 16;
            var4_3 = 0;
            var1_5 = z.I();
            block0: while (true) {
                v0 = var4_3;
                block1: while (v0 < 16) {
                    v1 = 0;
                    if (var1_5 == null) break block17;
                    var5_6 = v1;
                    block2: while (true) {
                        v2 = var5_6;
                        block3: while (v2 < 16) {
                            v0 = 0;
                            if (var1_5 == null) continue block1;
                            var6_7 = v0;
                            while (var6_7 < 16) {
                                block18: {
                                    block21: {
                                        block19: {
                                            block20: {
                                                v2 = var4_3;
                                                if (var1_5 == null) continue block3;
                                                if (var1_5 == null) break block19;
                                                if (v2 == 0) break block20;
                                                v3 = var4_3;
                                                if (var1_5 == null) break block19;
                                                if (v3 == 15) break block20;
                                                v3 = var5_6;
                                                if (var1_5 == null) break block19;
                                                if (v3 == 0) break block20;
                                                v3 = var5_6;
                                                if (var1_5 == null) break block19;
                                                if (v3 == 15) break block20;
                                                v3 = var6_7;
                                                if (var1_5 == null) break block19;
                                                if (v3 == 0) break block20;
                                                v3 = var6_7;
                                                if (var1_5 == null) break block19;
                                                if (v3 != 15) break block21;
                                            }
                                            v3 = var4_3;
                                        }
                                        var7_8 = (float)v3 / 15.0f * 2.0f - 1.0f;
                                        var9_10 = (float)var5_6 / 15.0f * 2.0f - 1.0f;
                                        var11_12 = (float)var6_7 / 15.0f * 2.0f - 1.0f;
                                        var13_14 = Math.sqrt(var7_8 * var7_8 + var9_10 * var9_10 + var11_12 * var11_12);
                                        var7_8 /= var13_14;
                                        var9_10 /= var13_14;
                                        var11_12 /= var13_14;
                                        var15_16 = this.g * (0.7f + this.c.J.nextFloat() * 0.6f);
                                        var16_19 = this.e;
                                        var18_20 = this.j;
                                        var20_21 = this.d;
                                        var22_22 = 0.3f;
                                        while (var15_16 > 0.0f) {
                                            block23: {
                                                block24: {
                                                    block26: {
                                                        block25: {
                                                            block22: {
                                                                var23_23 = new n(var16_19, var18_20, var20_21);
                                                                var24_25 = this.c.d(var23_23);
                                                                if (var1_5 == null) break block18;
                                                                if (var24_25.o() == net.minecraft.ac.c.A) break block22;
                                                                v4 = this.f;
                                                                if (var1_5 == null) ** GOTO lbl61
                                                                if (v4 != null) {
                                                                    v4 = this.f;
lbl61:
                                                                    // 2 sources

                                                                    v5 = v4.a(this, this.c, var23_23, var24_25);
                                                                } else {
                                                                    v5 = var24_25.b().a((x)null);
                                                                }
                                                                var25_26 = v5;
                                                                var15_16 -= (var25_26 + 0.3f) * 0.3f;
                                                            }
                                                            v6 = var15_16;
                                                            v7 = 0.0f;
                                                            if (var1_5 == null) break block23;
                                                            if (!(v6 > v7)) break block24;
                                                            v8 = this.f;
                                                            if (var1_5 == null) break block25;
                                                            if (v8 == null) break block26;
                                                            v8 = this.f;
                                                        }
                                                        v9 = v8.a(this, this.c, var23_23, var24_25, var15_16);
                                                        if (var1_5 == null || !v9) break block24;
                                                    }
                                                    v9 = var2_1.add(var23_23);
                                                }
                                                var16_19 += var7_8 * 0.30000001192092896;
                                                var18_20 += var9_10 * 0.30000001192092896;
                                                var20_21 += var11_12 * 0.30000001192092896;
                                                v6 = var15_16;
                                                v7 = 0.22500001f;
                                            }
                                            var15_16 = v6 - v7;
                                            if (var1_5 != null) continue;
                                        }
                                    }
                                    ++var6_7;
                                }
                                if (var1_5 != null) continue;
                            }
                            ++var5_6;
                            if (var1_5 != null) continue block2;
                        }
                        break;
                    }
                    ++var4_3;
                    if (var1_5 != null) continue block0;
                }
                break;
            }
            v1 = this.a.addAll(var2_1);
        }
        var4_4 = this.g * 2.0f;
        var5_6 = net.minecraft.k.h.f(this.e - (double)var4_4 - 1.0);
        var6_7 = net.minecraft.k.h.f(this.e + (double)var4_4 + 1.0);
        var7_9 = net.minecraft.k.h.f(this.j - (double)var4_4 - 1.0);
        var8_28 = net.minecraft.k.h.f(this.j + (double)var4_4 + 1.0);
        var9_11 = net.minecraft.k.h.f(this.d - (double)var4_4 - 1.0);
        var10_29 = net.minecraft.k.h.f(this.d + (double)var4_4 + 1.0);
        var11_13 = this.c.b(this.f, new k(var5_6, var7_9, var9_11, var6_7, var8_28, var10_29));
        var12_30 = new l(this.e, this.j, this.d);
        var13_15 = 0;
        do {
            block27: {
                block28: {
                    if (var13_15 >= var11_13.size()) return;
                    var14_31 = var11_13.get(var13_15);
                    if (var1_5 == null) continue;
                    if (var14_31.aA()) break block27;
                    var15_18 = var14_31.f(this.e, this.j, this.d) / (double)var4_4;
                    if (var1_5 == null) continue;
                    if (!(var15_18 <= 1.0)) break block27;
                    var17_32 = var14_31.a - this.e;
                    var19_33 = var14_31.aF + (double)var14_31.l() - this.j;
                    var21_34 = var14_31.ax - this.d;
                    var23_24 = net.minecraft.k.h.e(var17_32 * var17_32 + var19_33 * var19_33 + var21_34 * var21_34);
                    if (var1_5 == null) continue;
                    if (var23_24 == 0.0) break block27;
                    var17_32 /= var23_24;
                    var19_33 /= var23_24;
                    var21_34 /= var23_24;
                    var25_27 = this.c.a(var12_30, var14_31.m());
                    var27_35 = (1.0 - var15_18) * var25_27;
                    var14_31.a(G.a(this), (float)((int)((var27_35 * var27_35 + var27_35) / 2.0 * 7.0 * (double)var4_4 + 1.0)));
                    var29_36 = var27_35;
                    v10 = var14_31 instanceof B;
                    if (var1_5 != null) {
                        if (v10) {
                            var29_36 = K.a((B)var14_31, var27_35);
                        }
                        var14_31.aq += var17_32 * var29_36;
                        var14_31.G += var19_33 * var29_36;
                        var14_31.d += var21_34 * var29_36;
                        if (var1_5 == null) continue;
                        v10 = var14_31 instanceof j;
                    }
                    if (!v10) break block27;
                    var31_37 = (j)var14_31;
                    if (var1_5 == null) continue;
                    if (var31_37.ae()) break block27;
                    v11 = var31_37;
                    if (var1_5 == null) break block27;
                    if (!v11.C()) break block28;
                    v11 = var31_37.cw;
                    if (var1_5 == null || v11.e) break block27;
                }
                v11 = this.i.put(var31_37, new l(var17_32 * var27_35, var19_33 * var27_35, var21_34 * var27_35));
            }
            ++var13_15;
        } while (var1_5 != null);
    }

    public Map<j, l> a() {
        return this.i;
    }

    public U(z z2, x x2, double d10, double d11, double d12, float f10, boolean bl2, boolean bl3, List<n> list) {
        this(z2, x2, d10, d11, d12, f10, bl2, bl3);
        this.a.addAll(list);
    }

    public void b() {
        this.a.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public B d() {
        x x2;
        block7: {
            boolean bl2;
            block6: {
                String string = z.I();
                x x3 = this.f;
                if (string != null) {
                    if (x3 == null) {
                        return null;
                    }
                    x3 = this.f;
                }
                bl2 = x3 instanceof D;
                if (string == null) break block6;
                if (bl2) {
                    return ((D)this.f).c();
                }
                x2 = this.f;
                if (string == null) break block7;
                bl2 = x2 instanceof B;
            }
            if (!bl2) return null;
            x2 = this.f;
        }
        B b10 = (B)x2;
        return b10;
    }
}

