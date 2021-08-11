/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.w;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.B;
import net.minecraft.ar.v;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.aZ;
import net.minecraft.client.w.g;
import net.minecraft.client.w.h;
import net.minecraft.client.w.j;
import net.minecraft.k.m;

public class c {
    public /* synthetic */ float B;
    public /* synthetic */ boolean A;
    public /* synthetic */ boolean q;
    public /* synthetic */ float v;
    public /* synthetic */ List<g> p;
    private /* synthetic */ String j;
    private /* synthetic */ int n;
    public final /* synthetic */ String w;
    public /* synthetic */ float F;
    public /* synthetic */ float m;
    private static /* synthetic */ m[] x;
    public /* synthetic */ float c;
    private /* synthetic */ B G;
    public /* synthetic */ boolean k;
    private /* synthetic */ float s;
    public /* synthetic */ float i;
    public /* synthetic */ float h;
    public /* synthetic */ float E;
    public /* synthetic */ float e;
    public /* synthetic */ float d;
    public /* synthetic */ float b;
    public /* synthetic */ float u;
    public /* synthetic */ List<c> D;
    private /* synthetic */ int f;
    public /* synthetic */ float r;
    private final /* synthetic */ j l;
    public /* synthetic */ boolean a;
    private /* synthetic */ int t;
    private final /* synthetic */ aF z;
    private /* synthetic */ v C;
    public /* synthetic */ float y;
    public /* synthetic */ List o;
    private /* synthetic */ boolean g;

    public String b() {
        return this.j;
    }

    public c(j j2) {
        this(j2, null);
    }

    public void a(float f10, float f11, float f12, int n2, int n3, int n4, float f13) {
        this.o.add(new gq(this, this.n, this.t, f10, f11, f12, n2, n3, n4, f13));
    }

    public boolean a() {
        return this.g;
    }

    public void a(v v2) {
        this.C = v2;
    }

    public static m[] c() {
        return x;
    }

    public v f() {
        return this.C;
    }

    public c(j j2, int n2, int n3) {
        this(j2);
        this.b(n2, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        var2_1 = new StringBuffer();
        var1_2 = net.minecraft.client.w.j.b();
        v0 = new StringBuilder().append("id: ").append(this.j).append(", boxes: ");
        v1 = this.p;
        if (var1_2 != null) ** GOTO lbl8
        if (v1 != null) {
            v1 = this.p;
lbl8:
            // 2 sources

            v2 = v1.size();
        } else {
            v2 = null;
        }
        v3 = v0.append(v2).append(", submodels: ");
        v4 = this.D;
        if (var1_2 != null) ** GOTO lbl16
        if (v4 != null) {
            v4 = this.D;
lbl16:
            // 2 sources

            v5 = v4.size();
        } else {
            v5 = null;
        }
        var2_1.append(v3.append(v5).toString());
        return var2_1.toString();
    }

    public void a(float f10) {
        block9: {
            float f11;
            float f12;
            block16: {
                boolean bl2;
                block15: {
                    int[] arrn;
                    block11: {
                        block12: {
                            float f13;
                            float f14;
                            block13: {
                                block14: {
                                    block10: {
                                        block8: {
                                            arrn = net.minecraft.client.w.j.b();
                                            bl2 = this.k;
                                            if (arrn != null) break block8;
                                            if (bl2) break block9;
                                            bl2 = this.q;
                                        }
                                        if (arrn != null) break block10;
                                        if (!bl2) break block9;
                                        bl2 = this.g;
                                    }
                                    if (arrn == null) {
                                        float f15;
                                        if (!bl2) {
                                            this.c(f10);
                                        }
                                        bl2 = (f15 = this.y - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                    }
                                    if (arrn != null) break block11;
                                    if (bl2) break block12;
                                    float f16 = this.e - 0.0f;
                                    bl2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                    if (arrn != null) break block11;
                                    if (bl2) break block12;
                                    float f17 = this.r - 0.0f;
                                    bl2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                    if (arrn != null) break block11;
                                    if (bl2) break block12;
                                    float f13 = this.v;
                                    f13 = 0.0f;
                                    if (arrn != null) break block13;
                                    if (f14 != f13) break block14;
                                    float f13 = this.h;
                                    f13 = 0.0f;
                                    if (arrn != null) break block13;
                                    if (f14 != f13) break block14;
                                    float f13 = this.u;
                                    f13 = 0.0f;
                                    if (arrn != null) break block13;
                                    if (f14 == f13) break block9;
                                }
                                float f13 = this.v * f10;
                                f13 = this.h * f10;
                            }
                            net.minecraft.client.a.v.b(f14, f13, this.u * f10);
                            if (arrn == null) break block9;
                        }
                        net.minecraft.client.a.v.b(this.v * f10, this.h * f10, this.u * f10);
                        float f18 = this.r - 0.0f;
                        bl2 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    }
                    if (arrn == null) {
                        float f19;
                        if (bl2) {
                            net.minecraft.client.a.v.a(this.r * 57.295776f, 0.0f, 0.0f, 1.0f);
                        }
                        bl2 = (f19 = this.e - 0.0f) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                    }
                    if (arrn != null) break block15;
                    if (bl2) {
                        net.minecraft.client.a.v.a(this.e * 57.295776f, 0.0f, 1.0f, 0.0f);
                    }
                    float f11 = this.y;
                    f11 = 0.0f;
                    if (arrn != null) break block16;
                    float f20 = f12 - f11;
                    bl2 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                }
                if (!bl2) break block9;
                float f11 = this.y * 57.295776f;
                f11 = 1.0f;
            }
            net.minecraft.client.a.v.a(f12, f11, 0.0f, 0.0f);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(float var1_1) {
        block53: {
            block45: {
                block49: {
                    block50: {
                        block51: {
                            block52: {
                                block48: {
                                    block46: {
                                        block47: {
                                            var2_2 = net.minecraft.client.w.j.b();
                                            v0 = this.k;
                                            if (var2_2 == null) {
                                                if (v0 != 0) return;
                                                v0 = this.q;
                                            }
                                            if (var2_2 == null) {
                                                if (v0 == 0) return;
                                                v0 = this.g;
                                            }
                                            if (var2_2 == null) {
                                                if (v0 == 0) {
                                                    this.c(var1_1);
                                                }
                                                v0 = 0;
                                            }
                                            var3_3 = v0;
                                            v1 = this;
                                            if (var2_2 != null) break block46;
                                            if (v1.C == null) break block47;
                                            v1 = this;
                                            if (var2_2 != null) break block46;
                                            if (!v1.z.a) {
                                                v2 = this.z.aB;
                                                if (var2_2 == null) {
                                                    if (v2 != 0) {
                                                        return;
                                                    }
                                                    v2 = net.minecraft.client.a.v.N();
                                                }
                                                var3_3 = v2;
                                                fU.o().b(this.C);
                                            }
                                        }
                                        v1 = this;
                                    }
                                    if (var2_2 == null) {
                                        if (v1.G != null) {
                                            this.G.a();
                                        }
                                        v1 = this;
                                    }
                                    v3 = (cfr_temp_0 = v1.m - 1.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    if (var2_2 != null) break block48;
                                    if (v3 != false) ** GOTO lbl-1000
                                    cfr_temp_1 = this.c - 1.0f;
                                    v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                    if (var2_2 != null) break block48;
                                    if (v3 == false) {
                                        cfr_temp_2 = this.b - 1.0f;
                                        v3 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                        if (var2_2 == null) {
                                            ** if (v3 == false) goto lbl-1000
                                        } else {
                                            ** GOTO lbl46
                                        }
                                    }
                                    ** GOTO lbl-1000
lbl46:
                                    // 2 sources

                                    break block48;
lbl-1000:
                                    // 3 sources

                                    {
                                        v3 = (float)true;
                                        ** GOTO lbl50
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        v3 = (float)false;
                                    }
                                }
                                var4_4 = v3;
                                net.minecraft.client.a.v.b(this.i, this.F, this.E);
                                cfr_temp_3 = this.y - 0.0f;
                                v4 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block49;
                                if (v4 != false) break block50;
                                cfr_temp_4 = this.e - 0.0f;
                                v4 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block49;
                                if (v4 != false) break block50;
                                cfr_temp_5 = this.r - 0.0f;
                                v4 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block49;
                                if (v4 != false) break block50;
                                cfr_temp_6 = this.v - 0.0f;
                                v5 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block51;
                                if (v5 != false) break block52;
                                cfr_temp_7 = this.h - 0.0f;
                                v5 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block51;
                                if (v5 != false) break block52;
                                cfr_temp_8 = this.u - 0.0f;
                                v5 = cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
                                if (var2_2 != null) break block51;
                                if (v5 != false) break block52;
                                v6 = (int)var4_4;
                                if (var2_2 == null) {
                                    if (v6 != 0) {
                                        net.minecraft.client.a.v.d(this.m, this.c, this.b);
                                    }
                                    v6 = this.f;
                                }
                                if (var2_2 == null) {
                                    net.minecraft.client.a.v.s(v6);
                                    if (this.D != null) {
                                        for (var5_5 = (float)false; var5_5 < this.D.size(); ++var5_5) {
                                            this.D.get((int)var5_5).b(var1_1);
                                            if (var2_2 == null) {
                                                if (var2_2 == null) continue;
                                            }
                                            break block45;
                                        }
                                    }
                                    v6 = (int)var4_4;
                                }
                                if (var2_2 != null) break block53;
                                if (v6 == 0) ** GOTO lbl149
                                net.minecraft.client.a.v.d(1.0f / this.m, 1.0f / this.c, 1.0f / this.b);
                                if (var2_2 == null) ** GOTO lbl149
                            }
                            net.minecraft.client.a.v.b(this.v * var1_1, this.h * var1_1, this.u * var1_1);
                            v5 = var4_4;
                        }
                        if (var2_2 == null) {
                            if (v5 != false) {
                                net.minecraft.client.a.v.d(this.m, this.c, this.b);
                            }
                            v5 = this.f;
                        }
                        if (var2_2 != null) ** GOTO lbl112
                        net.minecraft.client.a.v.s((int)v5);
                        if (this.D != null) {
                            for (var5_5 = (float)false; var5_5 < this.D.size(); ++var5_5) {
                                this.D.get((int)var5_5).b(var1_1);
                                if (var2_2 == null) {
                                    if (var2_2 == null) continue;
                                }
                                break;
                            }
                        } else {
                            v5 = var4_4;
lbl112:
                            // 2 sources

                            if (v5 != false) {
                                net.minecraft.client.a.v.d(1.0f / this.m, 1.0f / this.c, 1.0f / this.b);
                            }
                            net.minecraft.client.a.v.b(-this.v * var1_1, -this.h * var1_1, -this.u * var1_1);
                        }
                        if (var2_2 == null) ** GOTO lbl149
                    }
                    net.minecraft.client.a.v.M();
                    net.minecraft.client.a.v.b(this.v * var1_1, this.h * var1_1, this.u * var1_1);
                    cfr_temp_9 = this.r - 0.0f;
                    v4 = cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1);
                }
                if (var2_2 == null) {
                    if (v4 != false) {
                        net.minecraft.client.a.v.a(this.r * 57.295776f, 0.0f, 0.0f, 1.0f);
                    }
                    v4 = (cfr_temp_10 = this.e - 0.0f) == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                }
                if (var2_2 == null) {
                    if (v4 != false) {
                        net.minecraft.client.a.v.a(this.e * 57.295776f, 0.0f, 1.0f, 0.0f);
                    }
                    v4 = (cfr_temp_11 = this.y - 0.0f) == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1);
                }
                if (var2_2 == null) {
                    if (v4 != false) {
                        net.minecraft.client.a.v.a(this.y * 57.295776f, 1.0f, 0.0f, 0.0f);
                    }
                    v4 = var4_4;
                }
                if (var2_2 == null) {
                    if (v4 != false) {
                        net.minecraft.client.a.v.d(this.m, this.c, this.b);
                    }
                    v4 = this.f;
                }
                if (var2_2 != null) ** GOTO lbl142
                net.minecraft.client.a.v.s((int)v4);
                if (this.D != null) {
                    v4 = var5_5 = (float)false;
lbl142:
                    // 3 sources

                    while (var5_5 < this.D.size()) {
                        this.D.get((int)var5_5).b(var1_1);
                        ++var5_5;
                        if (var2_2 == null) {
                            if (var2_2 == null) continue;
                        }
                        break;
                    }
                } else {
                    net.minecraft.client.a.v.B();
lbl149:
                    // 4 sources

                    net.minecraft.client.a.v.b(-this.i, -this.F, -this.E);
                }
            }
            v6 = var3_3;
        }
        if (var2_2 == null) {
            if (v6 == 0) return;
            v6 = var3_3;
        }
        net.minecraft.client.a.v.t(v6);
    }

    public c b(String string) {
        int[] arrn = net.minecraft.client.w.j.b();
        if (string == null) {
            return null;
        }
        if (this.D != null) {
            int n2 = 0;
            while (n2 < this.D.size()) {
                c c10 = this.D.get(n2);
                if (arrn == null) {
                    if (string.equals(c10.b())) {
                        return c10;
                    }
                    ++n2;
                }
                if (arrn == null) continue;
            }
        }
        return null;
    }

    static {
        if (net.minecraft.client.w.c.c() == null) {
            net.minecraft.client.w.c.b(new m[3]);
        }
    }

    private void c(float f10) {
        block7: {
            int n2;
            int[] arrn;
            block6: {
                arrn = net.minecraft.client.w.j.b();
                int n3 = this.f;
                if (arrn == null) {
                    if (n3 == 0) {
                        this.s = f10;
                        this.f = aZ.c(1);
                    }
                    n3 = this.f;
                }
                net.minecraft.client.a.v.d(n3, 4864);
                I i2 = W.c().b();
                for (n2 = 0; n2 < this.p.size(); ++n2) {
                    this.p.get(n2).a(i2, f10);
                    if (arrn == null) {
                        if (arrn == null) continue;
                    }
                    break block6;
                }
                n2 = 0;
            }
            while (n2 < this.o.size()) {
                gq gq2 = (gq)this.o.get(n2);
                gq2.a(W.c(), f10);
                ++n2;
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block7;
            }
            net.minecraft.client.a.v.w();
            this.g = true;
        }
    }

    public void a(c c10) {
        if (this.D == null) {
            this.D = Lists.newArrayList();
        }
        this.D.add(c10);
    }

    public c a(float f10, float f11, float f12, int n2, int n3, int n4) {
        this.p.add(new g(this, this.n, this.t, f10, f11, f12, n2, n3, n4, 0.0f));
        return this;
    }

    public c a(int n2, int n3) {
        this.B = n2;
        this.d = n3;
        return this;
    }

    public void c(String string) {
        this.j = string;
    }

    public void a(float f10, float f11, float f12) {
        this.v = f10;
        this.h = f11;
        this.u = f12;
    }

    public c b(int n2, int n3) {
        this.n = n2;
        this.t = n3;
        return this;
    }

    public void a(B b10) {
        this.G = b10;
    }

    public static void b(m[] arrm) {
        x = arrm;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void d(float var1_1) {
        block35: {
            block33: {
                block34: {
                    var2_2 = net.minecraft.client.w.j.b();
                    v0 = this.k;
                    if (var2_2 == null) {
                        if (v0 != 0) return;
                        v0 = this.q;
                    }
                    if (var2_2 == null) {
                        if (v0 == 0) return;
                        v0 = this.g;
                    }
                    if (var2_2 == null) {
                        if (v0 == 0) {
                            this.c(var1_1);
                        }
                        v0 = 0;
                    }
                    var3_3 = v0;
                    v1 = this;
                    if (var2_2 != null) break block33;
                    if (v1.C == null) break block34;
                    v1 = this;
                    if (var2_2 != null) break block33;
                    if (!v1.z.a) {
                        v2 = this.z.aB;
                        if (var2_2 == null) {
                            if (v2 != 0) {
                                return;
                            }
                            v2 = net.minecraft.client.a.v.N();
                        }
                        var3_3 = v2;
                        fU.o().b(this.C);
                    }
                }
                v1 = this;
            }
            if (var2_2 == null) {
                if (v1.G != null) {
                    this.G.a();
                }
                v1 = this;
            }
            v3 = (cfr_temp_0 = v1.m - 1.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var2_2 != null) break block35;
            if (v3 != false) ** GOTO lbl-1000
            cfr_temp_1 = this.c - 1.0f;
            v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var2_2 != null) break block35;
            if (v3 == false) {
                cfr_temp_2 = this.b - 1.0f;
                v3 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                if (var2_2 == null) {
                    ** if (v3 == false) goto lbl-1000
                } else {
                    ** GOTO lbl46
                }
            }
            ** GOTO lbl-1000
lbl46:
            // 2 sources

            break block35;
lbl-1000:
            // 3 sources

            {
                v3 = (float)true;
                ** GOTO lbl50
            }
lbl-1000:
            // 1 sources

            {
                v3 = (float)false;
            }
        }
        var4_4 = v3;
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.b(this.v * var1_1, this.h * var1_1, this.u * var1_1);
        cfr_temp_3 = this.e - 0.0f;
        v4 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
        if (var2_2 == null) {
            if (v4 != false) {
                net.minecraft.client.a.v.a(this.e * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            v4 = (cfr_temp_4 = this.y - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
        }
        if (var2_2 == null) {
            if (v4 != false) {
                net.minecraft.client.a.v.a(this.y * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            v4 = (cfr_temp_5 = this.r - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
        }
        if (var2_2 == null) {
            if (v4 != false) {
                net.minecraft.client.a.v.a(this.r * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            v4 = var4_4;
        }
        if (var2_2 == null) {
            if (v4 != false) {
                net.minecraft.client.a.v.d(this.m, this.c, this.b);
            }
            v4 = this.f;
        }
        net.minecraft.client.a.v.s((int)v4);
        if (var2_2 == null) {
            if (this.D != null) {
                for (var5_5 = 0; var5_5 < this.D.size(); ++var5_5) {
                    this.D.get(var5_5).b(var1_1);
                    if (var2_2 == null) {
                        if (var2_2 == null) continue;
                    }
                    break;
                }
            } else {
                net.minecraft.client.a.v.B();
            }
        }
        v5 = var3_3;
        if (var2_2 == null) {
            if (v5 == 0) return;
            v5 = var3_3;
        }
        net.minecraft.client.a.v.t(v5);
    }

    public c a(String string) {
        c c10;
        int[] arrn = net.minecraft.client.w.j.b();
        if (string == null) {
            return null;
        }
        c c11 = c10 = this.b(string);
        if (arrn == null) {
            if (c11 != null) {
                return c10;
            }
            c11 = this;
        }
        if (c11.D != null) {
            int n2 = 0;
            while (n2 < this.D.size()) {
                c c12 = this.D.get(n2);
                c c13 = c12.a(string);
                if (arrn == null) {
                    if (c13 != null) {
                        return c13;
                    }
                    ++n2;
                }
                if (arrn == null) continue;
            }
        }
        return null;
    }

    public c a(String string, float f10, float f11, float f12, int n2, int n3, int n4) {
        string = this.w + "." + string;
        h h2 = this.l.a(string);
        this.b(h2.b, h2.a);
        this.p.add(new g(this, this.n, this.t, f10, f11, f12, n2, n3, n4, 0.0f).a(string));
        return this;
    }

    public void e() {
        block3: {
            c c10;
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                c10 = this;
                if (arrn != null) break block2;
                if (!c10.g) break block3;
                this.g = false;
                c10 = this;
            }
            c10.c(this.s);
        }
    }

    public void a(int[][] arrn, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.p.add(new g(this, arrn, f10, f11, f12, f13, f14, f15, f16, this.A));
    }

    public c(j j2, String string) {
        this.o = new ArrayList();
        this.a = false;
        this.m = 1.0f;
        this.c = 1.0f;
        this.b = 1.0f;
        this.C = null;
        this.j = null;
        this.z = fU.ao();
        this.B = 64.0f;
        this.d = 32.0f;
        this.q = true;
        this.p = Lists.newArrayList();
        this.l = j2;
        j2.b.add(this);
        this.w = string;
        this.a(j2.g, j2.f);
    }

    public c a(float f10, float f11, float f12, int n2, int n3, int n4, boolean bl2) {
        this.p.add(new g(this, this.n, this.t, f10, f11, f12, n2, n3, n4, 0.0f, bl2));
        return this;
    }

    public void b(float f10, float f11, float f12, int n2, int n3, int n4, float f13) {
        this.p.add(new g(this, this.n, this.t, f10, f11, f12, n2, n3, n4, f13));
    }

    public int d() {
        return this.f;
    }
}

