/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.j;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import net.minecraft.ar.Z;
import net.minecraft.ar.v;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.D.t;
import net.minecraft.client.j.n;
import net.minecraft.client.j.p;
import net.minecraft.client.j.q;
import net.minecraft.client.j.u;
import net.minecraft.client.v.h;
import net.minecraft.client.v.i;
import net.minecraft.k.m;

public class c {
    public /* synthetic */ boolean d;
    public /* synthetic */ int x;
    protected /* synthetic */ int[][] B;
    protected /* synthetic */ int j;
    private /* synthetic */ float n;
    public /* synthetic */ boolean g;
    public /* synthetic */ int s;
    public /* synthetic */ int z;
    protected /* synthetic */ int k;
    public /* synthetic */ int h;
    private /* synthetic */ h r;
    protected /* synthetic */ int u;
    public /* synthetic */ c b;
    private final /* synthetic */ String A;
    protected /* synthetic */ boolean q;
    protected /* synthetic */ int f;
    protected /* synthetic */ int y;
    private /* synthetic */ float l;
    public /* synthetic */ boolean v;
    private /* synthetic */ int e;
    public /* synthetic */ c i;
    protected /* synthetic */ List<int[][]> o;
    public /* synthetic */ float c;
    private /* synthetic */ float w;
    private /* synthetic */ float t;
    public /* synthetic */ float a;
    protected /* synthetic */ int m;
    public /* synthetic */ c p;

    public float u() {
        return this.t;
    }

    private void g() {
        block3: {
            c c10;
            block2: {
                this.r = null;
                this.a(Lists.newArrayList());
                this.m = 0;
                boolean bl2 = net.minecraft.client.j.u.c();
                this.k = 0;
                c10 = this.p;
                if (bl2) break block2;
                if (c10 == null) break block3;
                c10 = this.p;
            }
            c10.g();
        }
    }

    public int h() {
        return this.e;
    }

    public void a(h h2) {
        this.r = h2;
    }

    public float i() {
        return this.w;
    }

    public float a(double d10) {
        float f10 = this.l - this.w;
        return this.w + f10 * (float)d10 / 16.0f;
    }

    public String e() {
        return this.A;
    }

    public int q() {
        return this.u;
    }

    public void e(int n2) {
        block11: {
            c c10;
            block10: {
                boolean bl2;
                block9: {
                    ArrayList arrayList = Lists.newArrayList();
                    int n3 = 0;
                    bl2 = net.minecraft.client.j.u.c();
                    while (n3 < this.o.size()) {
                        int[][] arrn = this.o.get(n3);
                        if (bl2) break block9;
                        if (!bl2) {
                            if (arrn != null) {
                                try {
                                    arrayList.add(net.minecraft.client.j.p.a(n2, this.j, arrn));
                                }
                                catch (Throwable throwable) {
                                    f f10 = net.minecraft.c.f.a(throwable, "Generating mipmaps for frame");
                                    l l2 = f10.a("Frame being iterated");
                                    l2.a("Frame index", n3);
                                    l2.a("Frame sizes", new q(this, arrn));
                                    throw new Z(f10);
                                }
                            }
                            ++n3;
                        }
                        if (!bl2) continue;
                    }
                    this.a(arrayList);
                }
                c10 = this.p;
                if (bl2) break block10;
                if (c10 == null) break block11;
                c10 = this.p;
            }
            c10.e(n2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void j() {
        block15: {
            block10: {
                block11: {
                    block13: {
                        block14: {
                            block12: {
                                var1_1 = net.minecraft.client.j.u.c();
                                v0 = this;
                                if (!var1_1) {
                                    if (v0.r == null) return;
                                    ++this.k;
                                    v0 = this;
                                }
                                v1 = v0.k;
                                if (var1_1) break block10;
                                if (v1 < this.r.a(this.m)) break block11;
                                var2_2 = this.r.c(this.m);
                                v2 = this.r;
                                if (var1_1) ** GOTO lbl17
                                if (v2.f() == 0) {
                                    v3 = this.o.size();
                                } else {
                                    v2 = this.r;
lbl17:
                                    // 2 sources

                                    v3 = v2.f();
                                }
                                var3_3 = v3;
                                this.m = (this.m + 1) % var3_3;
                                this.k = 0;
                                var4_4 = this.r.c(this.m);
                                var5_5 = false;
                                var6_6 = this.d;
                                v4 = var2_2;
                                if (var1_1) break block12;
                                if (v4 == var4_4) break block13;
                                v4 = var4_4;
                            }
                            if (var1_1) break block14;
                            if (v4 < 0) break block13;
                            v4 = var4_4;
                        }
                        if (v4 < this.o.size()) {
                            net.minecraft.client.j.p.a(this.o.get(var4_4), this.j, this.f, this.y, this.u, var5_5, var6_6);
                        }
                    }
                    if (var1_1 == false) return;
                }
                v5 = this;
                if (var1_1) break block15;
                v1 = v5.r.c() ? 1 : 0;
            }
            if (v1 == 0) return;
            v5 = this;
        }
        v5.r();
    }

    public float e(float f10) {
        f10 -= this.c;
        float f11 = (float)this.s / (float)this.j;
        return f10 *= f11;
    }

    public List<int[][]> k() {
        ArrayList<int[][]> arrayList = new ArrayList<int[][]>();
        arrayList.addAll(this.o);
        return arrayList;
    }

    public int o() {
        return this.o.size();
    }

    public float c(float f10) {
        f10 -= this.a;
        float f11 = (float)this.z / (float)this.f;
        return f10 *= f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void r() {
        block17: {
            block20: {
                block21: {
                    block18: {
                        block19: {
                            var2_1 = 1.0 - (double)this.k / (double)this.r.a(this.m);
                            var1_2 = net.minecraft.client.j.u.d();
                            var4_3 = this.r.c(this.m);
                            v0 = this.r;
                            if (!var1_2) ** GOTO lbl10
                            if (v0.f() == 0) {
                                v1 = this.o.size();
                            } else {
                                v0 = this.r;
lbl10:
                                // 2 sources

                                v1 = v0.f();
                            }
                            var5_4 = v1;
                            var6_5 = this.r.c((this.m + 1) % var5_4);
                            v2 = var4_3;
                            if (var1_2) {
                                if (v2 == var6_5) return;
                                v2 = var6_5;
                            }
                            if (var1_2) {
                                if (v2 < 0) return;
                                v2 = var6_5;
                            }
                            if (v2 >= this.o.size()) return;
                            var7_6 = this.o.get(var4_3);
                            var8_7 = this.o.get(var6_5);
                            v3 = this;
                            if (!var1_2) break block18;
                            if (v3.B == null) break block19;
                            v4 = this.B.length;
                            if (!var1_2) break block20;
                            if (v4 == var7_6.length) break block21;
                        }
                        v3 = this;
                    }
                    v3.B = new int[var7_6.length][];
                }
                v4 = var9_8 = 0;
            }
            while (var9_8 < var7_6.length) {
                block24: {
                    block23: {
                        block22: {
                            v5 = this.B;
                            v6 = var9_8;
                            if (!var1_2) break block17;
                            if (!var1_2) break block22;
                            if (v5[v6] != null) break block23;
                            v7 = this.B;
                            v8 = var9_8;
                        }
                        v7[v8] = new int[var7_6[var9_8].length];
                    }
                    v9 = var9_8;
                    v10 = var8_7.length;
                    if (!var1_2) break block24;
                    if (v9 >= v10) ** GOTO lbl-1000
                    v9 = var8_7[var9_8].length;
                    if (!var1_2) ** GOTO lbl57
                    v10 = var7_6[var9_8].length;
                }
                if (v9 == v10) {
                    v9 = var10_9 = 0;
lbl57:
                    // 3 sources

                    while (var10_9 < var7_6[var9_8].length) {
                        var11_10 = var7_6[var9_8][var10_9];
                        var12_11 = var8_7[var9_8][var10_9];
                        var13_12 = this.a(var2_1, var11_10 >> 16 & 255, var12_11 >> 16 & 255);
                        var14_13 = this.a(var2_1, var11_10 >> 8 & 255, var12_11 >> 8 & 255);
                        var15_14 = this.a(var2_1, var11_10 & 255, var12_11 & 255);
                        this.B[var9_8][var10_9] = var11_10 & -16777216 | var13_12 << 16 | var14_13 << 8 | var15_14;
                        ++var10_9;
                        if (var1_2) {
                            if (var1_2) continue;
                        }
                        break;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    ++var9_8;
                }
                if (var1_2) continue;
            }
            v5 = this.B;
            v6 = this.j;
        }
        net.minecraft.client.j.p.a(v5, v6, this.f, this.y, this.u, false, false);
    }

    private void a(int n2) {
        block9: {
            c c10;
            block10: {
                boolean bl2 = net.minecraft.client.j.u.d();
                c10 = this;
                if (bl2) {
                    if (c10.o.size() <= n2) {
                        for (int i2 = this.o.size(); i2 <= n2; ++i2) {
                            this.o.add(null);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block9;
                        }
                    }
                    c10 = this.p;
                }
                if (!bl2) break block10;
                if (c10 == null) break block9;
                c10 = this.p;
            }
            c10.a(n2);
        }
    }

    public void s() {
        boolean bl2 = net.minecraft.client.j.u.c();
        int n2 = this.x;
        if (!bl2) {
            if (n2 < 0) {
                this.x = net.minecraft.client.j.p.a();
                net.minecraft.client.j.p.a(this.x, this.h, this.j, this.f);
                fp.d();
            }
            n2 = this.x;
        }
        fp.b(n2);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private int a(double d10, int n2, int n3) {
        return (int)(d10 * (double)n2 + (1.0 - d10) * (double)n3);
    }

    private c(c c10) {
        this.o = Lists.newArrayList();
        this.e = -1;
        this.x = -1;
        this.p = null;
        this.d = false;
        this.h = 0;
        this.i = null;
        this.b = null;
        this.v = false;
        this.g = false;
        this.A = c10.A;
        this.d = true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(net.minecraft.client.D.v var1_1, int var2_2) throws IOException {
        block22: {
            block26: {
                block25: {
                    block23: {
                        block24: {
                            var4_3 = net.minecraft.client.j.p.a(var1_1.c());
                            var3_4 = net.minecraft.client.j.u.d();
                            if (this.j != var4_3.getWidth()) {
                                var4_3 = fp.b(var4_3, this.j);
                            }
                            var5_5 = (h)var1_1.a("animation");
                            var6_6 = new int[var2_2][];
                            var6_6[0] = new int[var4_3.getWidth() * var4_3.getHeight()];
                            v0 = var4_3;
                            if (!var3_4) break block23;
                            v0.getRGB(0, 0, var4_3.getWidth(), var4_3.getHeight(), var6_6[0], 0, var4_3.getWidth());
                            if (var5_5 != null) break block24;
                            this.o.add(var6_6);
                            if (var3_4) break block22;
                        }
                        v0 = var4_3;
                    }
                    var7_7 = v0.getHeight() / this.j;
                    v1 = var5_5;
                    if (!var3_4) break block25;
                    if (v1.f() <= 0) break block26;
                    v1 = var5_5;
                }
                var8_9 = v1.d().iterator();
                while (var8_9.hasNext()) {
                    block27: {
                        var9_10 = (Integer)var8_9.next();
                        if (!var3_4) break block27;
                        v2 = var9_10;
                        v3 = var7_7;
                        if (!var3_4) ** GOTO lbl66
                        if (v2 >= v3) {
                            throw new RuntimeException("invalid frameindex " + var9_10);
                        }
                        this.a(var9_10);
                        this.o.set(var9_10, net.minecraft.client.j.c.a(var6_6, this.j, this.j, var9_10));
                    }
                    if (var3_4) continue;
                }
                this.r = var5_5;
                if (var3_4) break block22;
            }
            var8_9 = Lists.newArrayList();
            for (var9_10 = 0; var9_10 < var7_7; ++var9_10) {
                this.o.add(net.minecraft.client.j.c.a(var6_6, this.j, this.j, var9_10));
                var8_9.add(new i(var9_10, -1));
                if (var3_4) {
                    if (var3_4) continue;
                }
                break block22;
            }
            this.r = new h((List<i>)var8_9, this.j, this.f, var5_5.a(), var5_5.c());
        }
        v4 = this.v;
        if (var3_4) {
            if (v4 != false) return;
            v4 = fU.ag();
        }
        if (var3_4) {
            if (v4) {
                this.v();
            }
            v4 = false;
        }
        var7_7 = v4 ? 1 : 0;
        block2: do {
            block28: {
                block29: {
                    v2 = var7_7;
                    v3 = this.o.size();
lbl66:
                    // 2 sources

                    if (v2 >= v3) break;
                    var8_9 = this.o.get(var7_7);
                    if (var3_4 == false) return;
                    if (!var3_4) continue;
                    if (var8_9 == null) break block28;
                    v5 = this.A.startsWith("minecraft:blocks/leaves_");
                    if (!var3_4) break block29;
                    if (v5) break block28;
                    v5 = false;
                }
                for (var9_10 = (int)((v2020950) ? 1 : 0); var9_10 < ((Object)var8_9).length; ++var9_10) {
                    var10_11 = var8_9[var9_10];
                    this.a((int[])var10_11);
                    if (!var3_4) continue block2;
                    if (var3_4) continue;
                }
            }
            ++var7_7;
        } while (var3_4);
        if (this.p == null) return;
        var7_8 = fU.ba().a(var1_1.b());
        this.p.a(var7_8, var2_2);
    }

    public double f(float f10) {
        float f11 = this.l - this.w;
        return (f10 - this.w) / f11 * 16.0f;
    }

    public void d(int n2) {
        this.e = n2;
    }

    public float a(float f10) {
        float f11 = this.l - this.w;
        return (f10 - this.w) / f11 * 16.0f;
    }

    public float l() {
        return this.l;
    }

    protected c(String string) {
        block3: {
            block2: {
                this.o = Lists.newArrayList();
                this.e = -1;
                this.x = -1;
                this.p = null;
                this.d = false;
                this.h = 0;
                this.i = null;
                this.b = null;
                this.v = false;
                boolean bl2 = net.minecraft.client.j.u.d();
                this.g = false;
                c c10 = this;
                if (!bl2) break block2;
                c10.A = string;
                if (!fU.aR()) break block3;
                c10 = this;
            }
            c10.p = new c(this);
        }
    }

    public int n() {
        return this.y;
    }

    public h t() {
        return this.r;
    }

    public void a(n n2, boolean n3) throws IOException {
        block11: {
            block10: {
                boolean bl2;
                block9: {
                    int n4;
                    block7: {
                        block8: {
                            this.g();
                            this.j = n2.b;
                            bl2 = net.minecraft.client.j.u.c();
                            this.f = n2.a;
                            n4 = n3;
                            if (bl2) break block7;
                            if (n4 == 0) break block8;
                            this.f = this.j;
                            if (!bl2) break block9;
                        }
                        n4 = n2.a;
                    }
                    if (n4 != n2.b) {
                        throw new RuntimeException("broken aspect ratio and not an animation");
                    }
                }
                c c10 = this.p;
                if (bl2) break block10;
                if (c10 == null) break block11;
                this.p.j = this.j;
                c10 = this.p;
            }
            c10.f = this.f;
        }
    }

    public int f() {
        return this.j;
    }

    private static int[][] a(int[][] arrn, int n2, int n3, int n4) {
        Object object;
        block4: {
            int[][] arrarrn = new int[arrn.length][];
            boolean bl2 = net.minecraft.client.j.u.c();
            int n5 = 0;
            while (n5 < arrn.length) {
                object = arrn;
                if (!bl2) {
                    int[] arrn2 = object[n5];
                    if (!bl2) {
                        if (arrn2 != null) {
                            arrarrn[n5] = new int[(n2 >> n5) * (n3 >> n5)];
                            System.arraycopy(arrn2, n4 * arrarrn[n5].length, arrarrn[n5], 0, arrarrn[n5].length);
                        }
                        ++n5;
                    }
                    if (!bl2) continue;
                }
                break block4;
            }
            object = arrarrn;
        }
        return object;
    }

    public void a(c c10) {
        block3: {
            c c11;
            block2: {
                this.y = c10.y;
                boolean bl2 = net.minecraft.client.j.u.c();
                this.u = c10.u;
                this.j = c10.j;
                this.f = c10.f;
                this.q = c10.q;
                this.w = c10.w;
                this.l = c10.l;
                this.t = c10.t;
                this.n = c10.n;
                c11 = this.p;
                if (bl2) break block2;
                if (c11 == null) break block3;
                c11 = this.p;
            }
            c11.a(this.j, this.f, 0, 0, false);
        }
    }

    private void a(int[] arrn) {
        block12: {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            boolean bl2;
            block11: {
                int n7;
                int n8;
                int n9;
                int n10;
                long l2;
                long l3;
                block13: {
                    long l4;
                    bl2 = net.minecraft.client.j.u.d();
                    if (arrn == null) break block12;
                    long l5 = 0L;
                    long l6 = 0L;
                    l3 = 0L;
                    l2 = 0L;
                    n10 = 0;
                    while (n10 < arrn.length) {
                        n9 = arrn[n10];
                        n8 = n9 >> 24 & 0xFF;
                        if (bl2) {
                            n6 = n8;
                            n5 = 16;
                            if (!bl2) break block11;
                            if (n6 >= n5) {
                                n4 = n9 >> 16 & 0xFF;
                                n3 = n9 >> 8 & 0xFF;
                                n2 = n9 & 0xFF;
                                l5 += (long)n4;
                                l6 += (long)n3;
                                l3 += (long)n2;
                                ++l2;
                            }
                            ++n10;
                        }
                        if (bl2) continue;
                    }
                    n7 = (l4 = l2 - 0L) == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (!bl2) break block13;
                    if (n7 <= 0) break block12;
                    n10 = (int)(l5 / l2);
                    n7 = (int)(l6 / l2);
                }
                n9 = n7;
                n8 = (int)(l3 / l2);
                n6 = n10 << 16 | n9 << 8;
                n5 = n8;
            }
            n4 = n6 | n5;
            n3 = 0;
            while (n3 < arrn.length) {
                n2 = arrn[n3];
                int n11 = n2 >> 24 & 0xFF;
                if (bl2) {
                    if (n11 <= 16) {
                        arrn[n3] = n4;
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
        }
    }

    private void v() {
        v v2;
        String string;
        boolean bl2;
        boolean bl3;
        block6: {
            block7: {
                bl3 = net.minecraft.client.j.u.c();
                bl2 = cS.o;
                if (bl3) break block6;
                if (!bl2) break block7;
                string = this.A + "_n";
                v2 = new v(string);
                v2 = fU.ax().b(v2);
                bl2 = fU.b(v2);
                if (bl3) break block6;
                if (bl2) {
                    this.i = new c(string);
                    this.i.v = true;
                    this.i.a(this);
                    fU.ax().a(fU.ba(), this.i);
                }
            }
            bl2 = cS.aT;
        }
        if (bl2) {
            string = this.A + "_s";
            v2 = new v(string);
            v2 = fU.ax().b(v2);
            boolean bl4 = fU.b(v2);
            if (!bl3 && bl4) {
                this.b = new c(string);
                this.b.v = true;
                this.b.a(this);
                bl4 = fU.ax().a(fU.ba(), this.b);
            }
        }
    }

    public float b(double d10) {
        float f10 = this.n - this.t;
        return this.t + f10 * (float)d10 / 16.0f;
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2) {
        boolean bl3;
        block5: {
            c c10;
            block4: {
                this.y = n4;
                this.u = n5;
                this.q = bl2;
                bl3 = net.minecraft.client.j.u.d();
                float f10 = (float)((double)0.01f / (double)n2);
                float f11 = (float)((double)0.01f / (double)n3);
                this.w = (float)n4 / (float)((double)n2) + f10;
                this.l = (float)(n4 + this.j) / (float)((double)n2) - f10;
                this.t = (float)n5 / (float)n3 + f11;
                this.n = (float)(n5 + this.f) / (float)n3 - f11;
                this.c = Math.min(this.w, this.l);
                this.a = Math.min(this.t, this.n);
                c10 = this.p;
                if (!bl3) break block4;
                if (c10 == null) break block5;
                c10 = this.p;
            }
            c10.a(this.j, this.f, 0, 0, false);
        }
        if (net.minecraft.k.m.c()) {
            net.minecraft.client.j.u.b(!bl3);
        }
    }

    public double d(float f10) {
        float f11 = this.n - this.t;
        return (f10 - this.t) / f11 * 16.0f;
    }

    public void p() {
        block3: {
            c c10;
            block2: {
                boolean bl2 = net.minecraft.client.j.u.d();
                this.o.clear();
                boolean bl3 = bl2;
                c10 = this.p;
                if (!bl3) break block2;
                if (c10 == null) break block3;
                c10 = this.p;
            }
            c10.p();
        }
    }

    public int b() {
        return this.f;
    }

    public boolean a(t t2, v v2) {
        return false;
    }

    public float b(float f10) {
        float f11 = this.n - this.t;
        return (f10 - this.t) / f11 * 16.0f;
    }

    public void a(List<int[][]> list) {
        block3: {
            c c10;
            block2: {
                this.o = list;
                boolean bl2 = net.minecraft.client.j.u.d();
                c10 = this.p;
                if (!bl2) break block2;
                if (c10 == null) break block3;
                c10 = this.p;
            }
            c10.a(list);
        }
    }

    public void c(int n2) {
        block3: {
            c c10;
            block2: {
                this.j = n2;
                boolean bl2 = net.minecraft.client.j.u.c();
                c10 = this.p;
                if (bl2) break block2;
                if (c10 == null) break block3;
                c10 = this.p;
            }
            c10.c(this.j);
        }
    }

    public void b(int n2) {
        block3: {
            c c10;
            block2: {
                this.f = n2;
                boolean bl2 = net.minecraft.client.j.u.d();
                c10 = this.p;
                if (!bl2) break block2;
                if (c10 == null) break block3;
                c10 = this.p;
            }
            c10.b(this.f);
        }
    }

    public boolean d() {
        return this.r != null;
    }

    public boolean a(t t2, v v2, Function<v, c> function) {
        return true;
    }

    public int[][] f(int n2) {
        return this.o.get(n2);
    }

    public float m() {
        return this.n;
    }

    protected static c a(v v2) {
        return new c(v2.toString());
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.A + '\'' + ", frameCount=" + this.o.size() + ", rotated=" + this.q + ", x=" + this.y + ", y=" + this.u + ", height=" + this.f + ", width=" + this.j + ", u0=" + this.w + ", u1=" + this.l + ", v0=" + this.t + ", v1=" + this.n + '}';
    }

    public void c() {
        block3: {
            int n2;
            block2: {
                boolean bl2 = net.minecraft.client.j.u.c();
                n2 = this.x;
                if (bl2) break block2;
                if (n2 < 0) break block3;
                n2 = this.x;
            }
            net.minecraft.client.j.p.c(n2);
            this.x = -1;
        }
    }

    public Collection<v> a() {
        return ImmutableList.of();
    }
}

