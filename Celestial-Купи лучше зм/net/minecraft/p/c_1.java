/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.p;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.bf;
import net.minecraft.W.o;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.p.W;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class c
extends b {
    /* synthetic */ double j;
    /* synthetic */ double l;
    /* synthetic */ int e;
    private /* synthetic */ Random m;
    /* synthetic */ int i;
    private /* synthetic */ n n;
    /* synthetic */ List<W> d;
    private /* synthetic */ z h;
    /* synthetic */ int o;
    /* synthetic */ int a;
    /* synthetic */ int g;
    /* synthetic */ double f;
    /* synthetic */ double k;

    boolean c(int n2) {
        boolean bl2 = net.minecraft.p.a.d();
        double d10 = (double)n2 - (double)this.i * 0.2;
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (!bl2) {
            d11 = d11 >= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    int a(n n2, n n3) {
        int n4;
        block6: {
            int n5;
            n n6 = n3.a(-n2.e(), -n2.b(), -n2.a());
            int n7 = this.b(n6);
            float f10 = (float)n6.e() / (float)n7;
            boolean bl2 = net.minecraft.p.a.d();
            float f11 = (float)n6.b() / (float)n7;
            float f12 = (float)n6.a() / (float)n7;
            int n8 = n7;
            if (!bl2) {
                if (n8 == 0) {
                    return -1;
                }
                n8 = n5 = 0;
            }
            while (n5 <= n7) {
                n n9 = n2.a(0.5f + (float)n5 * f10, 0.5f + (float)n5 * f11, 0.5f + (float)n5 * f12);
                if (!bl2) {
                    n4 = this.a(this.h.d(n9).b()) ? 1 : 0;
                    if (bl2) break block6;
                    if (n4 == 0) {
                        return n5;
                    }
                    ++n5;
                }
                if (!bl2) continue;
            }
            n4 = -1;
        }
        return n4;
    }

    void a(n n2, float f10, i i2) {
        int n3 = (int)((double)f10 + 0.618);
        boolean bl2 = net.minecraft.p.a.c();
        int n4 = -n3;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 <= n3) {
                for (int i3 = -n3; i3 <= n3; ++i3) {
                    n n6;
                    block6: {
                        net.minecraft.ac.c c10;
                        net.minecraft.ac.c c11;
                        block5: {
                            net.minecraft.ac.c c12;
                            double d10 = Math.pow((double)Math.abs(n4) + 0.5, 2.0) + Math.pow((double)Math.abs(i3) + 0.5, 2.0) - (double)(f10 * f10);
                            n5 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                            if (!bl2) continue block1;
                            if (n5 > 0) continue;
                            n6 = n2.a(n4, 0, i3);
                            c11 = c12 = this.h.d(n6).o();
                            c10 = net.minecraft.ac.c.A;
                            if (!bl2) break block5;
                            if (c11 == c10) break block6;
                            c11 = c12;
                            c10 = net.minecraft.ac.c.J;
                        }
                        if (c11 != c10) continue;
                    }
                    this.a(this.h, n6, i2);
                    if (bl2) continue;
                }
                ++n4;
                if (bl2) continue block0;
            }
            break;
        }
    }

    @Override
    public void a() {
        this.e = 5;
    }

    public c(boolean bl2) {
        super(bl2);
        this.n = net.minecraft.k.n.o;
        this.l = 0.618;
        this.j = 0.381;
        this.f = 1.0;
        this.k = 1.0;
        this.g = 1;
        this.o = 12;
        this.e = 4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(n var1_1) {
        var3_2 = net.minecraft.k.h.g(var1_1.e());
        var2_3 = net.minecraft.p.a.d();
        var4_4 = net.minecraft.k.h.g(var1_1.b());
        v0 = var5_5 = net.minecraft.k.h.g(var1_1.a());
        v1 = var3_2;
        if (!var2_3) {
            if (v0 > v1) {
                v0 = var5_5;
                v1 = var4_4;
                if (!var2_3) {
                    if (v0 > v1) {
                        return var5_5;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var4_4;
                if (var2_3 != false) return v0;
                v1 = var3_2;
            }
        }
        if (v0 > v1) {
            v0 = var4_4;
            return v0;
        }
        v0 = var3_2;
        return v0;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        this.h = z2;
        boolean bl2 = net.minecraft.p.a.c();
        this.n = n2;
        this.m = new Random(random.nextLong());
        boolean bl3 = this.i;
        if (bl2) {
            if (!bl3) {
                this.i = 5 + this.m.nextInt(this.o);
            }
            bl3 = (this.f() ? 1 : 0) != 0;
        }
        if (bl2) {
            if (!bl3) {
                return false;
            }
            this.b();
            this.d();
            this.c();
            this.e();
            bl3 = true;
        }
        return bl3;
    }

    void a(n n2) {
        boolean bl2 = net.minecraft.p.a.c();
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.a(n2.c(i2), this.b(i2), net.minecraft.u.g.bU.d().a(b2.A, false));
            if (bl2) continue;
        }
    }

    void e() {
        Iterator<W> iterator = this.d.iterator();
        boolean bl2 = net.minecraft.p.a.c();
        while (iterator.hasNext()) {
            block4: {
                c c10;
                n n2;
                W w2;
                block5: {
                    boolean bl3;
                    block3: {
                        w2 = iterator.next();
                        int n3 = w2.c();
                        n2 = new n(this.n.e(), n3, this.n.a());
                        bl3 = n2.equals(w2);
                        if (!bl2) break block3;
                        if (bl3) break block4;
                        c10 = this;
                        if (!bl2) break block5;
                        bl3 = c10.c(n3 - this.n.b());
                    }
                    if (!bl3) break block4;
                    c10 = this;
                }
                c10.a(n2, (n)w2, net.minecraft.u.g.bu);
            }
            if (bl2) continue;
        }
    }

    void c() {
        block3: {
            c c10;
            K k2;
            n n2;
            n n3;
            block2: {
                n3 = this.n;
                n2 = this.n.c(this.a);
                k2 = net.minecraft.u.g.bu;
                boolean bl2 = net.minecraft.p.a.d();
                this.a(n3, n2, k2);
                c10 = this;
                if (bl2) break block2;
                if (c10.g != 2) break block3;
                this.a(n3.m(), n2.m(), k2);
                this.a(n3.m().j(), n2.m().j(), k2);
                c10 = this;
            }
            c10.a(n3.j(), n2.j(), k2);
        }
    }

    void d() {
        Iterator<W> iterator = this.d.iterator();
        boolean bl2 = net.minecraft.p.a.c();
        while (iterator.hasNext()) {
            W w2 = iterator.next();
            this.a(w2);
            if (bl2) continue;
        }
    }

    private boolean f() {
        boolean bl2;
        block13: {
            boolean bl3;
            boolean bl4;
            block12: {
                boolean bl5;
                block10: {
                    K k2;
                    K k3;
                    block11: {
                        K k4;
                        block9: {
                            k4 = this.h.d(this.n.k()).b();
                            bl5 = net.minecraft.p.a.c();
                            k3 = k4;
                            if (!bl5) break block9;
                            if (k3 == net.minecraft.u.g.bv) break block10;
                            k3 = k4;
                        }
                        k2 = net.minecraft.u.g.aU;
                        if (!bl5) break block11;
                        if (k3 == k2) break block10;
                        K k2 = k4;
                        k2 = net.minecraft.u.g.cU;
                    }
                    if (k3 != k2) {
                        return false;
                    }
                }
                boolean bl3 = bl4 = this.a(this.n, this.n.c(this.i - 1));
                bl3 = BADBOOL -1;
                if (!bl5) break block12;
                if (bl2 == bl3) {
                    return true;
                }
                bl2 = bl4;
                if (!bl5) break block13;
                bl3 = BADBOOL 6;
            }
            if (bl2 < bl3) {
                return false;
            }
            this.i = bl4;
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    float b(int n2) {
        boolean bl2 = net.minecraft.p.a.c();
        int n3 = n2;
        if (bl2) {
            if (n3 < 0) return -1.0f;
            n3 = n2;
        }
        if (bl2) {
            if (n3 >= this.e) return -1.0f;
            n3 = n2;
        }
        if (bl2) {
            if (n3 == 0) return 2.0f;
            n3 = n2;
        }
        if (n3 == this.e - 1) return 2.0f;
        return 3.0f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    void b() {
        this.a = (int)((double)this.i * this.l);
        var1_1 = net.minecraft.p.a.c();
        v0 = this.a;
        if (var1_1) {
            if (v0 >= this.i) {
                this.a = this.i - 1;
            }
            v0 = (int)(1.382 + Math.pow(this.k * (double)this.i / 13.0, 2.0));
        }
        v1 = var2_2 = v0;
        v2 = 1;
        if (var1_1) {
            if (v1 < v2) {
                var2_2 = 1;
            }
            v1 = this.n.b();
            v2 = this.a;
        }
        var3_3 = v1 + v2;
        var4_4 = this.i - this.e;
        this.d = Lists.newArrayList();
        this.d.add(new W(this.n.c(var4_4), var3_3));
        do {
            block10: {
                if (var4_4 < 0) return;
                var5_5 = this.a(var4_4);
                if (!var1_1) continue;
                if (!(var5_5 >= 0.0f)) break block10;
                var6_6 = 0;
                block1: while (true) {
                    v3 = var6_6;
                    v4 = var2_2;
                    while (v3 < v4) {
                        block11: {
                            var7_7 = this.f * (double)var5_5 * ((double)this.m.nextFloat() + 0.328);
                            var9_8 = (double)(this.m.nextFloat() * 2.0f) * 3.141592653589793;
                            var11_9 = var7_7 * Math.sin(var9_8) + 0.5;
                            var13_10 = var7_7 * Math.cos(var9_8) + 0.5;
                            var15_11 = this.n.a(var11_9, (double)(var4_4 - 1), var13_10);
                            var16_12 = var15_11.c(this.e);
                            if (!var1_1) continue block1;
                            v3 = this.a(var15_11, var16_12);
                            v4 = -1;
                            if (!var1_1) continue;
                            if (v3 != v4) break block11;
                            var17_13 = this.n.e() - var15_11.e();
                            var18_14 = this.n.a() - var15_11.a();
                            v5 = var19_15 = (double)var15_11.b() - Math.sqrt(var17_13 * var17_13 + var18_14 * var18_14) * this.j;
                            if (!var1_1) ** GOTO lbl49
                            if (v5 > (double)var3_3) {
                                v6 = var3_3;
                            } else {
                                v5 = var19_15;
lbl49:
                                // 2 sources

                                v6 = (int)v5;
                            }
                            var21_16 = v6;
                            var22_17 = new n(this.n.e(), var21_16, this.n.a());
                            if (!var1_1) continue block1;
                            if (this.a(var22_17, var15_11) == -1) {
                                this.d.add(new W(var15_11, var22_17.b()));
                            }
                        }
                        ++var6_6;
                        if (var1_1) continue block1;
                    }
                    break;
                }
            }
            --var4_4;
        } while (var1_1);
    }

    void a(n n2, n n3, K k2) {
        n n4 = n3.a(-n2.e(), -n2.b(), -n2.a());
        int n5 = this.b(n4);
        float f10 = (float)n4.e() / (float)n5;
        float f11 = (float)n4.b() / (float)n5;
        float f12 = (float)n4.a() / (float)n5;
        boolean bl2 = net.minecraft.p.a.d();
        for (int i2 = 0; i2 <= n5; ++i2) {
            n n6 = n2.a(0.5f + (float)i2 * f10, 0.5f + (float)i2 * f11, 0.5f + (float)i2 * f12);
            o o2 = this.b(n2, n6);
            this.a(this.h, n6, k2.d().a(bf.A, o2));
            if (!bl2) continue;
        }
    }

    private o b(n n2, n n3) {
        o o2;
        block5: {
            int n4;
            int n5;
            block6: {
                int n6;
                int n7;
                block7: {
                    boolean bl2;
                    block4: {
                        o2 = net.minecraft.W.o.Y;
                        int n8 = Math.abs(n3.e() - n2.e());
                        n7 = Math.abs(n3.a() - n2.a());
                        bl2 = net.minecraft.p.a.d();
                        n5 = n6 = Math.max(n8, n7);
                        if (bl2) break block4;
                        if (n5 <= 0) break block5;
                        n5 = n8;
                    }
                    n4 = n6;
                    if (bl2) break block6;
                    if (n5 != n4) break block7;
                    o2 = net.minecraft.W.o.X;
                    if (!bl2) break block5;
                }
                n5 = n7;
                n4 = n6;
            }
            if (n5 == n4) {
                o2 = net.minecraft.W.o.Z;
            }
        }
        return o2;
    }

    float a(int n2) {
        float f10;
        float f11;
        block8: {
            float f12;
            block7: {
                float f13;
                block5: {
                    float f14;
                    float f15;
                    boolean bl2;
                    block6: {
                        bl2 = net.minecraft.p.a.c();
                        float f16 = (float)n2 - (float)this.i * 0.3f;
                        float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        if (bl2) {
                            if (f17 < 0) {
                                return -1.0f;
                            }
                            f17 = this.i;
                        }
                        f15 = (float)f17 / 2.0f;
                        f14 = f15 - (float)n2;
                        f12 = net.minecraft.k.h.a(f15 * f15 - f14 * f14);
                        float f18 = f14 - 0.0f;
                        f13 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                        if (!bl2) break block5;
                        if (f13 != false) break block6;
                        f12 = f15;
                        if (bl2) break block7;
                    }
                    f11 = Math.abs(f14);
                    f10 = f15;
                    if (!bl2) break block8;
                    float f19 = f11 - f10;
                    f13 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                }
                if (f13 >= 0) {
                    return 0.0f;
                }
            }
            f11 = f12;
            f10 = 0.5f;
        }
        return f11 * f10;
    }
}

