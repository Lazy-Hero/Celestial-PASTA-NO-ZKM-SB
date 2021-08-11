/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.f;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.client.y.b;
import net.minecraft.i.j;
import net.minecraft.k.k;

public class h
implements g {
    private final /* synthetic */ Map<Integer, net.minecraft.e.h> a;
    private final /* synthetic */ Q b;
    private /* synthetic */ j h;
    private /* synthetic */ double c;
    private final /* synthetic */ Map<Integer, Long> d;
    private final /* synthetic */ Map<Integer, Float> g;
    private /* synthetic */ double f;
    private /* synthetic */ double e;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(float var1_1, long var2_2) {
        block27: {
            var4_3 = net.minecraft.client.f.f.c();
            if (this.a.isEmpty() != false) return;
            var5_4 = System.currentTimeMillis();
            this.h = this.b.s;
            this.f = this.h.am + (this.h.a - this.h.am) * (double)var1_1;
            this.c = this.h.af + (this.h.aF - this.h.af) * (double)var1_1;
            this.e = this.h.n + (this.h.ax - this.h.n) * (double)var1_1;
            v.M();
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            v.b(0.0f, 1.0f, 0.0f, 0.75f);
            v.L();
            v.d(6.0f);
            var7_5 = this.a.keySet().iterator();
            block0: while (true) {
                v0 = var7_5.hasNext();
                block1: while (v0 != 0) {
                    var8_6 = var7_5.next();
                    var9_8 = this.a.get(var8_6);
                    var10_10 = this.g.get(var8_6).floatValue();
                    this.a(var1_1, var9_8);
                    var11_14 = var9_8.g();
                    cfr_temp_0 = this.a(var11_14) - 40.0f;
                    v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                    if (var4_3 == 0) ** GOTO lbl46
                    if (var4_3 != 0) {
                        if (v1 > 0) continue block0;
                        aF.a(new k((float)var11_14.g + 0.25f, (float)var11_14.m + 0.25f, (double)var11_14.f + 0.25, (float)var11_14.g + 0.75f, (float)var11_14.m + 0.75f, (float)var11_14.f + 0.75f).c(-this.f, -this.c, -this.e), 0.0f, 1.0f, 0.0f, 0.5f);
                        v2 = var12_16 = 0;
                    }
                    while (var12_16 < var9_8.f()) {
                        var13_17 = var9_8.b(var12_16);
                        if (var4_3 != 0) {
                            cfr_temp_1 = this.a(var13_17) - 40.0f;
                            v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                            if (var4_3 == 0) continue block1;
                            if (v0 <= 0) {
                                var14_18 = var12_16 == var9_8.a() ? 1.0f : 0.0f;
                                var15_19 = var12_16 == var9_8.a() ? 0.0f : 1.0f;
                                aF.a(new k((float)var13_17.g + 0.5f - var10_10, (float)var13_17.m + 0.01f * (float)var12_16, (float)var13_17.f + 0.5f - var10_10, (float)var13_17.g + 0.5f + var10_10, (float)var13_17.m + 0.25f + 0.01f * (float)var12_16, (float)var13_17.f + 0.5f + var10_10).c(-this.f, -this.c, -this.e), var14_18, 0.0f, var15_19, 0.5f);
                            }
                            ++var12_16;
                        }
                        if (var4_3 != 0) continue;
                    }
                    if (var4_3 != 0) continue block0;
                }
                break;
            }
            var7_5 = this.a.keySet().iterator();
            block3: while (true) {
                v1 = var7_5.hasNext();
                block4: while (v1 != 0) {
                    block26: {
                        block25: {
                            var8_6 = var7_5.next();
                            var9_8 = this.a.get(var8_6);
                            var10_11 = var9_8.b();
                            var11_15 = var10_11.length;
                            if (var4_3 == 0) return;
                            var12_16 = 0;
                            while (var12_16 < var11_15) {
                                var13_17 = var10_11[var12_16];
                                if (var4_3 != 0) {
                                    cfr_temp_2 = this.a(var13_17) - 40.0f;
                                    v3 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                    if (var4_3 == 0) break block25;
                                    if (v3 <= 0) {
                                        net.minecraft.client.f.f.a(String.format("%s", new Object[]{var13_17.b}), (double)var13_17.g + 0.5, (double)var13_17.m + 0.75, (double)var13_17.f + 0.5, var1_1, -65536);
                                        net.minecraft.client.f.f.a(String.format("%.2f", new Object[]{Float.valueOf(var13_17.e)}), (double)var13_17.g + 0.5, (double)var13_17.m + 0.25, (double)var13_17.f + 0.5, var1_1, -65536);
                                    }
                                    ++var12_16;
                                }
                                if (var4_3 != 0) continue;
                            }
                            var10_11 = var9_8.e();
                            var11_15 = var10_11.length;
                            v3 = var12_16 = 0;
                        }
                        while (var12_16 < var11_15) {
                            var13_17 = var10_11[var12_16];
                            if (var4_3 != 0) {
                                cfr_temp_3 = this.a(var13_17) - 40.0f;
                                v4 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                if (var4_3 == 0) break block26;
                                if (v4 <= 0) {
                                    net.minecraft.client.f.f.a(String.format("%s", new Object[]{var13_17.b}), (double)var13_17.g + 0.5, (double)var13_17.m + 0.75, (double)var13_17.f + 0.5, var1_1, -16776961);
                                    net.minecraft.client.f.f.a(String.format("%.2f", new Object[]{Float.valueOf(var13_17.e)}), (double)var13_17.g + 0.5, (double)var13_17.m + 0.25, (double)var13_17.f + 0.5, var1_1, -16776961);
                                }
                                ++var12_16;
                            }
                            if (var4_3 != 0) continue;
                        }
                        v4 = var10_12 = 0;
                    }
                    while (var10_12 < var9_8.f()) {
                        var11_14 = var9_8.b(var10_12);
                        if (var4_3 != 0) {
                            cfr_temp_4 = this.a(var11_14) - 40.0f;
                            v1 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                            if (var4_3 == 0) continue block4;
                            if (v1 <= 0) {
                                net.minecraft.client.f.f.a(String.format("%s", new Object[]{var11_14.b}), (double)var11_14.g + 0.5, (double)var11_14.m + 0.75, (double)var11_14.f + 0.5, var1_1, -1);
                                net.minecraft.client.f.f.a(String.format("%.2f", new Object[]{Float.valueOf(var11_14.e)}), (double)var11_14.g + 0.5, (double)var11_14.m + 0.25, (double)var11_14.f + 0.5, var1_1, -1);
                            }
                            ++var10_12;
                        }
                        if (var4_3 != 0) continue;
                    }
                    if (var4_3 != 0) continue block3;
                }
                break;
            }
            var7_5 = this.d.keySet().toArray(new Integer[0]);
            var8_7 = var7_5.length;
            var9_9 = 0;
            while (var9_9 < var8_7) {
                var10_13 = var7_5[var9_9];
                if (var4_3 != 0) {
                    if (var4_3 != 0) {
                        if (var5_4 - this.d.get(var10_13) > 20000L) {
                            this.a.remove(var10_13);
                            this.d.remove(var10_13);
                        }
                        ++var9_9;
                    }
                    if (var4_3 != 0) continue;
                }
                break block27;
            }
            v.x();
            v.f();
        }
        v.B();
    }

    public void a(float f10, net.minecraft.e.h h2) {
        block5: {
            W w2 = W.c();
            I i2 = w2.b();
            int n2 = net.minecraft.client.f.f.c();
            i2.a(3, net.minecraft.client.y.b.i);
            int n3 = 0;
            int n4 = n2;
            while (n3 < h2.f()) {
                net.minecraft.e.f f11 = h2.b(n3);
                if (n4 != 0) {
                    if (n4 != 0) {
                        if (this.a(f11) <= 40.0f) {
                            float f12 = (float)n3 / (float)h2.f() * 0.33f;
                            int n5 = n3;
                            if (n4 != 0) {
                                n5 = n5 == 0 ? 0 : net.minecraft.k.h.b(f12, 0.9f, 0.9f);
                            }
                            int n6 = n5;
                            int n7 = n6 >> 16 & 0xFF;
                            int n8 = n6 >> 8 & 0xFF;
                            int n9 = n6 & 0xFF;
                            i2.c((double)f11.g - this.f + 0.5, (double)f11.m - this.c + 0.5, (double)f11.f - this.e + 0.5).b(n7, n8, n9, 255).d();
                        }
                        ++n3;
                    }
                    if (n4 != 0) continue;
                }
                break block5;
            }
            w2.a();
        }
    }

    private float a(net.minecraft.e.f f10) {
        return (float)(Math.abs((double)f10.g - this.h.a) + Math.abs((double)f10.m - this.h.aF) + Math.abs((double)f10.f - this.h.ax));
    }

    public void a(int n2, net.minecraft.e.h h2, float f10) {
        this.a.put(n2, h2);
        this.d.put(n2, System.currentTimeMillis());
        this.g.put(n2, Float.valueOf(f10));
    }

    public h(Q q2) {
        this.a = Maps.newHashMap();
        this.g = Maps.newHashMap();
        this.d = Maps.newHashMap();
        this.b = q2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

