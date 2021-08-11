/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.A;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.a2;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.client.A.b;
import net.minecraft.client.A.d;
import net.minecraft.client.A.e;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class c
extends q {
    private final /* synthetic */ d n;
    private /* synthetic */ c a;
    private /* synthetic */ aS l;
    private final /* synthetic */ Q j;
    private final /* synthetic */ List<c> h;
    private final /* synthetic */ List<String> o;
    private static final /* synthetic */ Pattern q;
    private final /* synthetic */ int g;
    private static final /* synthetic */ net.minecraft.ar.v k;
    private final /* synthetic */ String r;
    private final /* synthetic */ int i;
    private final /* synthetic */ aN m;
    private final /* synthetic */ a2 s;
    private final /* synthetic */ int p;

    public int c() {
        return this.g;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1, int var2_2) {
        block8: {
            block9: {
                block11: {
                    block10: {
                        block6: {
                            block7: {
                                var3_3 = net.minecraft.client.A.e.b();
                                v0 = this;
                                if (var3_3 == null) break block6;
                                if (!v0.s.e()) break block7;
                                v1 = this;
                                if (var3_3 == null) break block8;
                                if (v1.l == null) break block9;
                                v1 = this;
                                if (var3_3 == null) break block8;
                                if (!v1.l.d()) break block9;
                            }
                            v0 = this;
                        }
                        v2 = v0.l;
                        if (var3_3 == null) ** GOTO lbl20
                        if (v2 == null) {
                            v3 = 0.0f;
                        } else {
                            v2 = this.l;
lbl20:
                            // 2 sources

                            v3 = var4_4 = v2.a();
                        }
                        if (!(var4_4 >= 1.0f)) break block10;
                        var5_6 = net.minecraft.client.A.e.OBTAINED;
                        if (var3_3 != null) break block11;
                    }
                    var5_7 = net.minecraft.client.A.e.UNOBTAINED;
                }
                this.j.aN().b(net.minecraft.client.A.c.k);
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.a();
                this.a(var1_1 + this.p + 3, var2_2 + this.g, this.s.j().b(), 128 + var5_8.a() * 26, 26, 26);
                a0.b();
                this.j.Y().a((B)null, this.s.f(), var1_1 + this.p + 8, var2_2 + this.g + 5);
            }
            v1 = this;
        }
        var4_5 = v1.h.iterator();
        do {
            if (var4_5.hasNext() == false) return;
            var5_10 = var4_5.next();
            var5_10.a(var1_1, var2_2);
        } while (var3_3 != null);
    }

    public int a() {
        return this.p;
    }

    public void a(aS aS2) {
        this.l = aS2;
    }

    private List<String> a(String string, int n2) {
        List<String> list;
        block9: {
            int n3;
            int n4;
            block8: {
                m[] arrm = net.minecraft.client.A.e.b();
                if (string.isEmpty()) {
                    return Collections.emptyList();
                }
                list = this.j.a6.c(string, n2);
                Object object = list;
                if (arrm != null) {
                    if (object.size() < 2) {
                        return list;
                    }
                    object = list.get(0);
                }
                String string2 = (String)object;
                String string3 = list.get(1);
                int n5 = this.j.a6.e(string2 + ' ' + string3.split(" ")[0]);
                if (n5 - n2 <= 10) {
                    return this.j.a6.c(string, n5);
                }
                Matcher matcher = q.matcher(string2);
                n4 = matcher.matches();
                if (arrm == null) break block8;
                if (n4 == 0) break block9;
                n4 = this.j.a6.e(matcher.group(1));
            }
            if (n2 - (n3 = n4) <= 10) {
                return this.j.a6.c(string, n3);
            }
        }
        return list;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public c(d var1_1, Q var2_2, aN var3_3, a2 var4_4) {
        super();
        this.h = Lists.newArrayList();
        this.n = var1_1;
        var5_5 = net.minecraft.client.A.e.b();
        this.m = var3_3;
        this.s = var4_4;
        this.j = var2_2;
        this.r = var2_2.a6.e(var4_4.i().a(), 163);
        this.p = net.minecraft.k.h.d(var4_4.b() * 28.0f);
        this.g = net.minecraft.k.h.d(var4_4.d() * 27.0f);
        var6_6 = var3_3.a();
        var7_7 = String.valueOf(var6_6).length();
        v0 = var6_6;
        v1 = 1;
        if (var5_5 == null) ** GOTO lbl19
        if (v0 > v1) {
            v0 = var2_2.a6.e("  ") + var2_2.a6.e("0") * var7_7 * 2;
            v1 = var2_2.a6.e("/");
lbl19:
            // 2 sources

            v2 = v0 + v1;
        } else {
            v2 = 0;
        }
        var8_8 = v2;
        var9_9 = 29 + var2_2.a6.e(this.r) + var8_8;
        var10_10 = var4_4.h().a();
        this.o = this.a(var10_10, var9_9);
        for (String var12_12 : this.o) {
            var9_9 = Math.max(var9_9, var2_2.a6.e(var12_12));
            if (var5_5 == null) return;
            if (var5_5 != null) continue;
        }
        this.i = var9_9 + 3 + 5;
    }

    public void a(int n2, int n3, boolean n4) {
        c c10;
        m[] arrm;
        block5: {
            block6: {
                int n5;
                int n6;
                int n7;
                int n8;
                block7: {
                    int n9;
                    int n10;
                    block8: {
                        arrm = net.minecraft.client.A.e.b();
                        c10 = this.a;
                        if (arrm == null) break block5;
                        if (c10 == null) break block6;
                        n10 = n2 + this.a.p + 13;
                        n8 = n2 + this.a.p + 26 + 4;
                        n7 = n3 + this.a.g + 13;
                        n9 = n2 + this.p + 13;
                        n6 = n3 + this.g + 13;
                        int n11 = n4;
                        if (arrm != null) {
                            n11 = n5 = n11 != 0 ? -16777216 : -1;
                        }
                        if (arrm == null) break block7;
                        if (n4 == 0) break block8;
                        this.a(n8, n10, n7 - 1, n5);
                        this.a(n8 + 1, n10, n7, n5);
                        this.a(n8, n10, n7 + 1, n5);
                        this.a(n9, n8 - 1, n6 - 1, n5);
                        this.a(n9, n8 - 1, n6, n5);
                        this.a(n9, n8 - 1, n6 + 1, n5);
                        this.b(n8 - 1, n6, n7, n5);
                        this.b(n8 + 1, n6, n7, n5);
                        if (arrm != null) break block6;
                    }
                    this.a(n8, n10, n7, n5);
                    this.a(n9, n8, n6, n5);
                }
                this.b(n8, n6, n7, n5);
            }
            c10 = this;
        }
        for (c c11 : c10.h) {
            c11.a(n2, n3, n4 != 0);
            if (arrm != null) continue;
        }
    }

    @Nullable
    private c a(aN aN2) {
        block6: {
            aN aN3;
            block5: {
                m[] arrm = net.minecraft.client.A.e.b();
                while ((aN2 = aN2.b()) != null && aN2.d() == null) {
                }
                aN3 = aN2;
                if (arrm == null) break block5;
                if (aN3 == null) break block6;
                aN3 = aN2;
            }
            if (aN3.d() != null) {
                return this.n.b(aN2);
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1, int var2_2, float var3_3, int var4_4, int var5_5) {
        block43: {
            block41: {
                block42: {
                    block39: {
                        block40: {
                            block37: {
                                block38: {
                                    block34: {
                                        block35: {
                                            block36: {
                                                block33: {
                                                    block31: {
                                                        block32: {
                                                            block26: {
                                                                block30: {
                                                                    block29: {
                                                                        block27: {
                                                                            block28: {
                                                                                block24: {
                                                                                    block25: {
                                                                                        var6_6 = net.minecraft.client.A.e.b();
                                                                                        v0 = var4_4 + var1_1 + this.p + this.i + 26;
                                                                                        this.n.b();
                                                                                        if (var6_6 != null) {
                                                                                            v0 = v0 >= b.h ? 1 : 0;
                                                                                        }
                                                                                        var7_7 = v0;
                                                                                        v1 = this.l;
                                                                                        if (var6_6 == null) ** GOTO lbl14
                                                                                        if (v1 == null) {
                                                                                            v2 = null;
                                                                                        } else {
                                                                                            v1 = this.l;
lbl14:
                                                                                            // 2 sources

                                                                                            v2 = v1.f();
                                                                                        }
                                                                                        var8_8 = v2;
                                                                                        var9_9 = var8_8 == null ? 0 : this.j.a6.e(var8_8);
                                                                                        v3 = 113 - var2_2 - this.g - 26;
                                                                                        if (var6_6 != null) {
                                                                                            v3 = v3 <= 6 + this.o.size() * this.j.a6.p ? 1 : 0;
                                                                                        }
                                                                                        var10_10 = v3;
                                                                                        v4 = this.l;
                                                                                        if (var6_6 == null) ** GOTO lbl27
                                                                                        if (v4 == null) {
                                                                                            v5 = 0.0f;
                                                                                        } else {
                                                                                            v4 = this.l;
lbl27:
                                                                                            // 2 sources

                                                                                            v5 = v4.a();
                                                                                        }
                                                                                        var11_11 = v5;
                                                                                        var12_12 = net.minecraft.k.h.d(var11_11 * (float)this.i);
                                                                                        cfr_temp_0 = var11_11 - 1.0f;
                                                                                        v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                                        if (var6_6 == null) break block24;
                                                                                        if (v6 < 0) break block25;
                                                                                        var12_12 = this.i / 2;
                                                                                        var13_13 = net.minecraft.client.A.e.OBTAINED;
                                                                                        var14_14 = net.minecraft.client.A.e.OBTAINED;
                                                                                        var15_15 = net.minecraft.client.A.e.OBTAINED;
                                                                                        if (var6_6 != null) break block26;
                                                                                        net.minecraft.k.m.b(net.minecraft.k.m.d() == false);
                                                                                    }
                                                                                    v6 = var12_12;
                                                                                }
                                                                                v7 = 2;
                                                                                if (var6_6 == null) break block27;
                                                                                if (v6 >= v7) break block28;
                                                                                var12_12 = this.i / 2;
                                                                                var13_13 = net.minecraft.client.A.e.UNOBTAINED;
                                                                                var14_14 = net.minecraft.client.A.e.UNOBTAINED;
                                                                                var15_15 = net.minecraft.client.A.e.UNOBTAINED;
                                                                                if (var6_6 != null) break block26;
                                                                            }
                                                                            v6 = var12_12;
                                                                            v7 = this.i - 2;
                                                                        }
                                                                        if (var6_6 == null) break block29;
                                                                        if (v6 <= v7) break block30;
                                                                        v6 = this.i;
                                                                        v7 = 2;
                                                                    }
                                                                    var12_12 = (int)(v6 / v7);
                                                                    var13_13 = net.minecraft.client.A.e.OBTAINED;
                                                                    var14_14 = net.minecraft.client.A.e.OBTAINED;
                                                                    var15_15 = net.minecraft.client.A.e.UNOBTAINED;
                                                                    if (var6_6 != null) break block26;
                                                                }
                                                                var13_13 = net.minecraft.client.A.e.OBTAINED;
                                                                var14_14 = net.minecraft.client.A.e.UNOBTAINED;
                                                                var15_15 = net.minecraft.client.A.e.UNOBTAINED;
                                                            }
                                                            var16_16 = this.i - var12_12;
                                                            this.j.aN().b(net.minecraft.client.A.c.k);
                                                            v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                            v.a();
                                                            var17_17 = var2_2 + this.g;
                                                            v8 = var7_7;
                                                            if (var6_6 == null) break block31;
                                                            if (v8 == 0) break block32;
                                                            var18_18 = var1_1 + this.p - this.i + 26 + 6;
                                                            if (var6_6 != null) break block33;
                                                        }
                                                        v8 = var1_1 + this.p;
                                                    }
                                                    var18_18 = v8;
                                                }
                                                var19_19 = 32 + this.o.size() * this.j.a6.p;
                                                v9 = this.o.isEmpty();
                                                if (var6_6 == null) break block34;
                                                if (v9 != 0) break block35;
                                                if (var10_10 == 0) break block36;
                                                this.a(var18_18, var17_17 + 26 - var19_19, this.i, var19_19, 10, 200, 26, 0, 52);
                                                if (var6_6 != null) break block35;
                                            }
                                            this.a(var18_18, var17_17, this.i, var19_19, 10, 200, 26, 0, 52);
                                        }
                                        this.a(var18_18, var17_17, 0, var13_13.a() * 26, var12_12, 26);
                                        this.a(var18_18 + var12_12, var17_17, 200 - var16_16, var14_14.a() * 26, var16_16, 26);
                                        this.a(var1_1 + this.p + 3, var2_2 + this.g, this.s.j().b(), 128 + var15_15.a() * 26, 26, 26);
                                        v9 = var7_7;
                                    }
                                    if (var6_6 == null) break block37;
                                    if (v9 == 0) break block38;
                                    v9 = this.j.a6.b(this.r, var18_18 + 5, var2_2 + this.g + 9, -1, true);
                                    if (var6_6 == null) break block39;
                                    if (var8_8 == null) break block40;
                                    this.j.a6.b(var8_8, var1_1 + this.p - var9_9, var2_2 + this.g + 9, -1, true);
                                    if (var6_6 != null) break block40;
                                }
                                v9 = this.j.a6.b(this.r, var1_1 + this.p + 32, var2_2 + this.g + 9, -1, true);
                            }
                            if (var6_6 == null) break block39;
                            if (var8_8 != null) {
                                this.j.a6.b(var8_8, var1_1 + this.p + this.i - var9_9 - 5, var2_2 + this.g + 9, -1, true);
                            }
                        }
                        v9 = var10_10;
                    }
                    if (var6_6 == null) break block41;
                    if (v9 == 0) break block42;
                    for (var20_20 = 0; var20_20 < this.o.size(); ++var20_20) {
                        this.j.a6.b(this.o.get(var20_20), var18_18 + 5, var17_17 + 26 - var19_19 + 7 + var20_20 * this.j.a6.p, -5592406, false);
                        if (var6_6 == null) return;
                        if (var6_6 != null) continue;
                    }
                    if (var6_6 != null) break block43;
                }
                v9 = var20_20 = 0;
            }
            while (var20_20 < this.o.size()) {
                this.j.a6.b(this.o.get(var20_20), var18_18 + 5, var2_2 + this.g + 9 + 17 + var20_20 * this.j.a6.p, -5592406, false);
                ++var20_20;
                if (var6_6 == null) return;
                if (var6_6 != null) continue;
            }
        }
        a0.b();
        this.j.Y().a((B)null, this.s.f(), var1_1 + this.p + 8, var2_2 + this.g + 5);
    }

    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        block0: {
            this.a(n2, n3, n9, n10, n6, n6);
            m[] arrm = net.minecraft.client.A.e.b();
            this.a(n2 + n6, n3, n4 - n6 - n6, n6, n9 + n6, n10, n7 - n6 - n6, n8);
            this.a(n2 + n4 - n6, n3, n9 + n7 - n6, n10, n6, n6);
            this.a(n2, n3 + n5 - n6, n9, n10 + n8 - n6, n6, n6);
            this.a(n2 + n6, n3 + n5 - n6, n4 - n6 - n6, n6, n9 + n6, n10 + n8 - n6, n7 - n6 - n6, n8);
            this.a(n2 + n4 - n6, n3 + n5 - n6, n9 + n7 - n6, n10 + n8 - n6, n6, n6);
            m[] arrm2 = arrm;
            this.a(n2, n3 + n6, n6, n5 - n6 - n6, n9, n10 + n6, n7, n8 - n6 - n6);
            this.a(n2 + n6, n3 + n6, n4 - n6 - n6, n5 - n6 - n6, n9 + n6, n10 + n6, n7 - n6 - n6, n8 - n6 - n6);
            this.a(n2 + n4 - n6, n3 + n6, n6, n5 - n6 - n6, n9 + n7 - n6, n10 + n6, n7, n8 - n6 - n6);
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.client.A.e.b(new m[4]);
        }
    }

    public void b() {
        block3: {
            c c10;
            block5: {
                m[] arrm;
                block4: {
                    block2: {
                        arrm = net.minecraft.client.A.e.b();
                        c10 = this.a;
                        if (arrm == null) break block2;
                        if (c10 != null) break block3;
                        c10 = this;
                    }
                    if (arrm == null) break block4;
                    if (c10.m.b() == null) break block3;
                    c10 = this.a = this.a(this.m);
                }
                if (arrm == null) break block5;
                if (c10 == null) break block3;
                c10 = this.a;
            }
            c10.a(this);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3, int n4, int n5) {
        m[] arrm = net.minecraft.client.A.e.b();
        int n6 = this.s.e();
        if (arrm != null) {
            if (n6 != 0) {
                aS aS2 = this.l;
                if (arrm != null) {
                    if (aS2 == null) return false;
                    aS2 = this.l;
                }
                boolean bl2 = aS2.d();
                if (arrm == null) return bl2;
                if (!bl2) return false;
            }
            n6 = n2 + this.p;
        }
        int n7 = n6;
        int n8 = n7 + 26;
        int n9 = n3 + this.g;
        int n10 = n9 + 26;
        int n12 = n4;
        n12 = n7;
        if (arrm != null) {
            if (n11 < n12) return 0 != 0;
            int n12 = n4;
            n12 = n8;
        }
        if (arrm != null) {
            if (n11 > n12) return 0 != 0;
            int n12 = n5;
            n12 = n9;
        }
        if (arrm != null) {
            if (n11 < n12) return 0 != 0;
            n11 = n5;
            if (arrm == null) return n11 != 0;
            n12 = n10;
        }
        if (n11 > n12) return 0 != 0;
        return 1 != 0;
    }

    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 0;
        m[] arrm = net.minecraft.client.A.e.b();
        while (n10 < n4) {
            block3: {
                int n11 = n2 + n10;
                int n12 = Math.min(n8, n4 - n10);
                for (int i2 = 0; i2 < n5; i2 += n9) {
                    int n13 = n3 + i2;
                    int n14 = Math.min(n9, n5 - i2);
                    this.a(n11, n13, n6, n7, n12, n14);
                    if (arrm != null) {
                        if (arrm != null) continue;
                    }
                    break block3;
                }
                n10 += n8;
            }
            if (arrm != null) continue;
        }
    }

    static {
        k = new net.minecraft.ar.v("textures/gui/advancements/widgets.png");
        q = Pattern.compile("(.+) \\S+");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(c c10) {
        this.h.add(c10);
    }
}

