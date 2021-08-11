/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Ordering
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.D.e;
import net.minecraft.D.m;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ar.aD;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.p;
import net.minecraft.client.b.I;
import net.minecraft.client.b.J;
import net.minecraft.client.b.K;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aR;
import net.minecraft.client.b.ah;
import net.minecraft.client.b.b;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.r;
import net.minecraft.client.j.j;
import net.minecraft.client.l.c;
import net.minecraft.client.t.a;
import net.minecraft.client.t.d;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class G
extends q {
    private final /* synthetic */ Random I;
    private /* synthetic */ int n;
    private /* synthetic */ int i;
    private /* synthetic */ int o;
    private final /* synthetic */ r s;
    private /* synthetic */ int k;
    private static final /* synthetic */ v w;
    private final /* synthetic */ I r;
    private static final /* synthetic */ v l;
    private /* synthetic */ boolean p;
    private /* synthetic */ String A;
    private static final /* synthetic */ v h;
    /* synthetic */ float D;
    private final /* synthetic */ Map<net.minecraft.at.a, List<a>> H;
    private /* synthetic */ String u;
    private /* synthetic */ int G;
    private /* synthetic */ int q;
    private /* synthetic */ long g;
    private /* synthetic */ int C;
    private /* synthetic */ int z;
    private final /* synthetic */ p t;
    private final /* synthetic */ K J;
    private /* synthetic */ String y;
    private final /* synthetic */ J m;
    public /* synthetic */ float E;
    private /* synthetic */ int B;
    private final /* synthetic */ ah a;
    private final /* synthetic */ Q j;
    private final /* synthetic */ aR v;
    private /* synthetic */ long x;
    private /* synthetic */ net.minecraft.w.d F;

    private void c(float f10, l l2) {
        block6: {
            block12: {
                float f11;
                float f12;
                block10: {
                    block11: {
                        float f13;
                        String[] arrstring;
                        block9: {
                            float f14;
                            block7: {
                                block8: {
                                    block4: {
                                        block5: {
                                            arrstring = net.minecraft.client.b.q.b();
                                            if (arrstring == null) break block4;
                                            if (fU.b()) break block5;
                                            net.minecraft.client.a.v.t();
                                            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                            if (arrstring != null) break block6;
                                        }
                                        f10 = 1.0f - f10;
                                        f10 = net.minecraft.k.h.c(f10, 0.0f, 1.0f);
                                    }
                                    net.minecraft.V.a a10 = this.j.e.O();
                                    f13 = (float)a10.a(this.j.s);
                                    double d10 = Math.min(a10.h() * (double)a10.q() * 1000.0, Math.abs(a10.e() - a10.c()));
                                    double d11 = Math.max((double)a10.s(), d10);
                                    f14 = f13;
                                    if (arrstring == null) break block7;
                                    if (!((double)f14 < d11)) break block8;
                                    f13 = 1.0f - (float)((double)f13 / d11);
                                    if (arrstring != null) break block9;
                                }
                                f14 = 0.0f;
                            }
                            f13 = f14;
                        }
                        this.E = (float)((double)this.E + (double)(f10 - this.E) * 0.01);
                        net.minecraft.client.a.v.n();
                        net.minecraft.client.a.v.a(false);
                        net.minecraft.client.a.v.a(net.minecraft.client.a.o.ZERO, net.minecraft.client.a.G.ONE_MINUS_SRC_COLOR, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                        f12 = f13;
                        f11 = 0.0f;
                        if (arrstring == null) break block10;
                        if (!(f12 > f11)) break block11;
                        net.minecraft.client.a.v.b(0.0f, f13, f13, 1.0f);
                        if (arrstring != null) break block12;
                    }
                    f12 = this.E;
                    f11 = this.E;
                }
                net.minecraft.client.a.v.b(f12, f11, this.E, 1.0f);
            }
            this.j.aN().b(h);
            W w2 = W.c();
            net.minecraft.client.a.I i2 = w2.b();
            i2.a(7, net.minecraft.client.y.b.m);
            i2.c(0.0, (double)l2.a(), -90.0).a(0.0, 1.0).d();
            i2.c((double)l2.e(), (double)l2.a(), -90.0).a(1.0, 1.0).d();
            i2.c((double)l2.e(), 0.0, -90.0).a(1.0, 0.0).d();
            i2.c(0.0, 0.0, -90.0).a(0.0, 0.0).d();
            w2.a();
            net.minecraft.client.a.v.a(true);
            net.minecraft.client.a.v.t();
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
        }
    }

    public int b() {
        return this.C;
    }

    public void e() {
        block14: {
            net.minecraft.w.d d10;
            block24: {
                G g10;
                block17: {
                    block18: {
                        G g11;
                        block19: {
                            int n2;
                            String[] arrstring;
                            block22: {
                                block23: {
                                    block21: {
                                        net.minecraft.w.d d11;
                                        block20: {
                                            boolean bl2;
                                            block15: {
                                                block16: {
                                                    net.minecraft.client.q.c c10;
                                                    block13: {
                                                        G g12;
                                                        block11: {
                                                            block12: {
                                                                int n3;
                                                                block10: {
                                                                    arrstring = net.minecraft.client.b.q.b();
                                                                    G g13 = this;
                                                                    if (arrstring != null) {
                                                                        if (g13.j.e == null) {
                                                                            g8.a();
                                                                        }
                                                                        g13 = this;
                                                                    }
                                                                    n3 = g13.k;
                                                                    if (arrstring == null) break block10;
                                                                    if (n3 > 0) {
                                                                        --this.k;
                                                                    }
                                                                    g12 = this;
                                                                    if (arrstring == null) break block11;
                                                                    n3 = g12.i;
                                                                }
                                                                if (n3 <= 0) break block12;
                                                                --this.i;
                                                                g12 = this;
                                                                if (arrstring == null) break block11;
                                                                if (g12.i <= 0) {
                                                                    this.y = "";
                                                                    this.u = "";
                                                                }
                                                            }
                                                            ++this.C;
                                                            g12 = this;
                                                        }
                                                        c10 = g12.j.s;
                                                        if (arrstring == null) break block13;
                                                        if (c10 == null) break block14;
                                                        c10 = this.j.s;
                                                    }
                                                    d10 = c10.cB.k();
                                                    bl2 = d10.G();
                                                    if (arrstring == null) break block15;
                                                    if (!bl2) break block16;
                                                    this.G = 0;
                                                    if (arrstring != null) break block17;
                                                }
                                                g11 = this;
                                                if (arrstring == null) break block18;
                                                bl2 = g11.F.G();
                                            }
                                            if (bl2) break block19;
                                            d11 = d10;
                                            if (arrstring == null) break block20;
                                            if (d11.w() != this.F.w()) break block19;
                                            d11 = d10;
                                        }
                                        n2 = net.minecraft.w.d.b(d11, this.F);
                                        if (arrstring == null) break block21;
                                        if (n2 == 0) break block19;
                                        n2 = d10.j() ? 1 : 0;
                                    }
                                    if (arrstring == null) break block22;
                                    if (n2 != 0) break block23;
                                    n2 = d10.d();
                                    if (arrstring == null) break block22;
                                    if (n2 != this.F.d()) break block19;
                                }
                                g10 = this;
                                if (arrstring == null) break block24;
                                n2 = g10.G;
                            }
                            if (n2 <= 0) break block17;
                            --this.G;
                            if (arrstring != null) break block17;
                        }
                        g11 = this;
                    }
                    g11.G = 40;
                }
                g10 = this;
            }
            g10.F = d10;
        }
    }

    private void e(l l2) {
        block11: {
            int n2;
            x x2;
            String[] arrstring;
            block12: {
                x x3;
                x x4;
                block10: {
                    arrstring = net.minecraft.client.b.q.b();
                    x4 = this.j.Z();
                    if (arrstring == null) break block10;
                    if (!(x4 instanceof net.minecraft.i.j)) break block11;
                    x4 = this.j.Z();
                }
                net.minecraft.i.j j2 = (net.minecraft.i.j)x4;
                x2 = x3 = j2.as();
                if (arrstring == null) break block12;
                if (!(x2 instanceof B)) break block11;
                this.j.an.a("mountHealth");
                x2 = x3;
            }
            B b10 = (B)x2;
            int n3 = (int)Math.ceil(b10.V());
            float f10 = b10.H();
            int n4 = n2 = (int)(f10 + 0.5f) / 2;
            int n5 = 30;
            if (arrstring != null) {
                if (n4 > n5) {
                    n2 = 30;
                }
                n4 = l2.a();
                n5 = 39;
            }
            int n6 = n4 - n5;
            int n7 = l2.e() / 2 + 91;
            int n8 = n6;
            int n9 = 0;
            boolean bl2 = false;
            while (n2 > 0) {
                int n10 = Math.min(n2, 10);
                int n11 = n2;
                int n12 = n10;
                block1: while (true) {
                    n2 = n11 - n12;
                    for (int i2 = 0; i2 < n10; ++i2) {
                        int n13;
                        int n14;
                        int n15 = 52;
                        int n16 = 0;
                        int n17 = n7 - i2 * 8 - 9;
                        this.a(n17, n8, 52 + n16 * 9, 9, 9, 9);
                        n11 = i2 * 2 + 1 + n9;
                        n12 = n3;
                        if (arrstring == null) continue block1;
                        if (arrstring != null) {
                            if (n11 < n12) {
                                this.a(n17, n8, 88, 9, 9, 9);
                            }
                            n14 = i2 * 2 + 1 + n9;
                            n13 = n3;
                        }
                        if (n14 != n13) continue;
                        this.a(n17, n8, 97, 9, 9, 9);
                        if (arrstring != null) continue;
                    }
                    break;
                }
                n8 -= 10;
                n9 += 20;
                if (arrstring != null) continue;
            }
        }
    }

    public void a(String string, String string2, int n2, int n3, int n4) {
        block12: {
            block17: {
                G g10;
                int n5;
                block16: {
                    String[] arrstring;
                    block15: {
                        String string3;
                        block13: {
                            block14: {
                                block8: {
                                    block9: {
                                        int n6;
                                        block11: {
                                            block10: {
                                                arrstring = net.minecraft.client.b.q.b();
                                                string3 = string;
                                                if (arrstring == null) break block8;
                                                if (string3 != null) break block9;
                                                string3 = string2;
                                                if (arrstring == null) break block8;
                                                if (string3 != null) break block9;
                                                n6 = n2;
                                                if (arrstring == null) break block10;
                                                if (n6 >= 0) break block9;
                                                n6 = n3;
                                            }
                                            if (arrstring == null) break block11;
                                            if (n6 >= 0) break block9;
                                            n6 = n4;
                                        }
                                        if (n6 >= 0) break block9;
                                        this.y = "";
                                        this.u = "";
                                        this.i = 0;
                                        if (arrstring != null) break block12;
                                    }
                                    string3 = string;
                                }
                                if (arrstring == null) break block13;
                                if (string3 == null) break block14;
                                this.y = string;
                                this.i = this.B + this.n + this.z;
                                if (arrstring != null) break block12;
                            }
                            string3 = string2;
                        }
                        if (string3 == null) break block15;
                        this.u = string2;
                        if (arrstring != null) break block12;
                    }
                    n5 = n2;
                    if (arrstring != null) {
                        if (n5 >= 0) {
                            this.B = n2;
                        }
                        n5 = n3;
                    }
                    if (arrstring != null) {
                        if (n5 >= 0) {
                            this.n = n3;
                        }
                        n5 = n4;
                    }
                    if (arrstring == null) break block16;
                    if (n5 >= 0) {
                        this.z = n4;
                    }
                    g10 = this;
                    if (arrstring == null) break block17;
                    n5 = g10.i;
                }
                if (n5 <= 0) break block12;
                g10 = this;
            }
            g10.i = this.B + this.n + this.z;
        }
    }

    private void a(int n2, int n3, float f10, net.minecraft.i.j j2, net.minecraft.w.d d10) {
        block6: {
            p p2;
            block8: {
                float f11;
                block7: {
                    int n4;
                    String[] arrstring;
                    block5: {
                        arrstring = net.minecraft.client.b.q.b();
                        n4 = d10.G();
                        if (arrstring == null) break block5;
                        if (n4 != 0) break block6;
                        n4 = d10.n();
                    }
                    float f12 = (float)n4 - f10;
                    float f13 = f12 - 0.0f;
                    f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    if (arrstring == null) break block7;
                    if (f11 > 0) {
                        net.minecraft.client.a.v.M();
                        float f14 = 1.0f + f12 / 5.0f;
                        net.minecraft.client.a.v.b((float)(n2 + 8), (float)(n3 + 12), 0.0f);
                        net.minecraft.client.a.v.d(1.0f / f14, (f14 + 1.0f) / 2.0f, 1.0f);
                        net.minecraft.client.a.v.b((float)(-(n2 + 8)), (float)(-(n3 + 12)), 0.0f);
                    }
                    p2 = this.t;
                    if (arrstring == null) break block8;
                    p2.a(j2, d10, n2, n3);
                    float f15 = f12 - 0.0f;
                    f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                }
                if (f11 > 0) {
                    net.minecraft.client.a.v.B();
                }
                p2 = this.t;
            }
            p2.a(this.j.a6, d10, n2, n3);
        }
    }

    public void i() {
        this.B = 10;
        this.n = 70;
        this.z = 20;
    }

    public void a(l l2, int n2) {
        this.j.an.b("jumpBar");
        this.j.aN().b(net.minecraft.client.b.q.e);
        float f10 = this.j.s.U();
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = 182;
        int n4 = (int)(f10 * 183.0f);
        int n5 = l2.a() - 32 + 3;
        this.a(n2, n5, 0, 84, 182, 5);
        if (arrstring != null) {
            if (n4 > 0) {
                this.a(n2, n5, 0, 89, n4, 5);
            }
            this.j.an.c();
        }
    }

    public void a(String string, boolean bl2) {
        this.A = string;
        this.k = 60;
        this.p = bl2;
    }

    public void d(l l2) {
        G g10;
        block9: {
            block10: {
                block11: {
                    int n2;
                    String[] arrstring = net.minecraft.client.b.q.b();
                    this.j.an.b("selectedItemName");
                    String[] arrstring2 = arrstring;
                    g10 = this;
                    if (arrstring2 == null) break block9;
                    if (g10.G <= 0) break block10;
                    g10 = this;
                    if (arrstring2 == null) break block9;
                    if (g10.F.G()) break block10;
                    String string = this.F.g();
                    int n3 = this.F.c();
                    if (arrstring2 != null) {
                        if (n3 != 0) {
                            string = (Object)((Object)net.minecraft.at.l.ITALIC) + string;
                        }
                        n3 = (l2.e() - this.d().e(string)) / 2;
                    }
                    int n4 = n3;
                    int n5 = l2.a() - 59;
                    int n6 = this.j.aW.n();
                    if (arrstring2 != null) {
                        if (n6 == 0) {
                            n5 += 14;
                        }
                        n6 = (int)((float)this.G * 256.0f / 10.0f);
                    }
                    int n7 = n2 = n6;
                    if (arrstring2 != null) {
                        if (n7 > 255) {
                            n2 = 255;
                        }
                        n7 = n2;
                    }
                    if (arrstring2 == null) break block11;
                    if (n7 <= 0) break block10;
                    net.minecraft.client.a.v.M();
                    net.minecraft.client.a.v.a();
                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                    n7 = this.d().c(string, n4, n5, 0xFFFFFF + (n2 << 24));
                }
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.B();
            }
            g10 = this;
        }
        g10.j.an.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void c(l var1_1) {
        var3_2 = this.j.s.az();
        var2_3 = net.minecraft.client.b.q.b();
        v0 = var3_2.isEmpty();
        if (var2_3 != null) {
            if (v0 != 0) return;
            this.j.aN().b(net.minecraft.client.I.g.N);
            net.minecraft.client.a.v.a();
            v0 = 0;
        }
        var4_4 = v0;
        var5_5 = 0;
        var6_6 = Ordering.natural().reverse().sortedCopy(var3_2).iterator();
        do lbl-1000:
        // 4 sources

        {
            block29: {
                block30: {
                    block28: {
                        block27: {
                            block26: {
                                block24: {
                                    block25: {
                                        block23: {
                                            block21: {
                                                block22: {
                                                    block19: {
                                                        block20: {
                                                            block18: {
                                                                block17: {
                                                                    if (var6_6.hasNext()) break block17;
                                                                    if (var2_3 == null) ** GOTO lbl-1000
                                                                    return;
                                                                }
                                                                var7_7 = (net.minecraft.K.j)var6_6.next();
                                                                var8_8 = var7_7.g();
                                                                var9_9 = var8_8.d();
                                                                v1 = cq.bg.b();
                                                                if (var2_3 == null) break block18;
                                                                if (v1 == 0 && var2_3 != null) break block19;
                                                                v1 = cq.g(var8_8, cq.bg, new Object[]{var7_7});
                                                            }
                                                            if (var2_3 == null) break block20;
                                                            if (v1 == 0) ** GOTO lbl-1000
                                                            this.j.aN().b(net.minecraft.client.I.g.N);
                                                            v1 = 1;
                                                        }
                                                        var9_9 = v1;
                                                    }
                                                    v2 = var9_9;
                                                    if (var2_3 != null) {
                                                        if (v2 == 0) continue;
                                                        v2 = var7_7.f();
                                                    }
                                                    if (var2_3 != null) {
                                                        if (v2 == 0) continue;
                                                        v2 = var1_1.e();
                                                    }
                                                    var10_10 = v2;
                                                    var11_11 = 1;
                                                    v3 = this.j.q();
                                                    if (var2_3 != null) {
                                                        if (v3 != 0) {
                                                            var11_11 += 15;
                                                        }
                                                        v3 = var8_8.j();
                                                    }
                                                    var12_12 = v3;
                                                    v4 = var8_8.c();
                                                    if (var2_3 == null) break block21;
                                                    if (v4 == 0) break block22;
                                                    var10_10 -= 25 * ++var4_4;
                                                    if (var2_3 != null) break block23;
                                                }
                                                v4 = var10_10 - 25 * ++var5_5;
                                            }
                                            var10_10 = v4 ? 1 : 0;
                                            var11_11 += 26;
                                        }
                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        var13_13 = 1.0f;
                                        v5 = var7_7.c();
                                        if (var2_3 == null) break block24;
                                        if (v5 == 0) break block25;
                                        this.a(var10_10, var11_11, 165, 166, 24, 24);
                                        if (var2_3 != null) break block26;
                                    }
                                    this.a(var10_10, var11_11, 141, 166, 24, 24);
                                    v5 = var7_7.e();
                                }
                                if (var2_3 == null) break block27;
                                if (v5 <= 200) {
                                    var14_14 = 10 - var7_7.e() / 20;
                                    var13_13 = net.minecraft.k.h.c((float)var7_7.e() / 10.0f / 5.0f * 0.5f, 0.0f, 0.5f) + net.minecraft.k.h.c((float)var7_7.e() * 3.1415927f / 5.0f) * net.minecraft.k.h.c((float)var14_14 / 10.0f * 0.25f, 0.0f, 0.25f);
                                }
                            }
                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, var13_13);
                            v5 = cq.dU.b() ? 1 : 0;
                        }
                        if (var2_3 == null) break block28;
                        if (v5 == 0) break block29;
                        v6 = var8_8;
                        if (var2_3 == null) break block30;
                        v5 = v6.d() ? 1 : 0;
                    }
                    if (v5 != 0) {
                        this.a(var10_10 + 3, var11_11 + 3, var12_12 % 8 * 18, 198 + var12_12 / 8 * 18, 18, 18);
                    }
                    v6 = cq.d(var8_8, cq.dU, new Object[]{var10_10, var11_11, var7_7, this.j, Float.valueOf(var13_13)});
                }
                if (var2_3 != null) continue;
            }
            this.a(var10_10 + 3, var11_11 + 3, var12_12 % 8 * 18, 198 + var12_12 / 8 * 18, 18, 18);
        } while (var2_3 != null);
    }

    private void b(float f10, l l2) {
        block15: {
            int n2;
            int n3;
            int n4;
            block33: {
                float f11;
                String[] arrstring;
                block31: {
                    float f12;
                    block32: {
                        int n5;
                        int n6;
                        int n7;
                        block30: {
                            int n8;
                            block29: {
                                x x2;
                                block28: {
                                    Q q2;
                                    block27: {
                                        int n9;
                                        block25: {
                                            block26: {
                                                Object object;
                                                int n10;
                                                c c10;
                                                block16: {
                                                    block17: {
                                                        block24: {
                                                            block23: {
                                                                net.minecraft.k.i i2;
                                                                block21: {
                                                                    net.minecraft.k.i i3;
                                                                    block22: {
                                                                        block20: {
                                                                            block19: {
                                                                                Q q3;
                                                                                block18: {
                                                                                    block14: {
                                                                                        c10 = this.j.ac;
                                                                                        arrstring = net.minecraft.client.b.q.b();
                                                                                        n10 = c10.L;
                                                                                        if (arrstring == null) break block14;
                                                                                        if (n10 != 0) break block15;
                                                                                        n10 = this.j.aW.h() ? 1 : 0;
                                                                                    }
                                                                                    if (arrstring == null) break block16;
                                                                                    if (n10 == 0) break block17;
                                                                                    q3 = this.j;
                                                                                    if (arrstring == null) break block18;
                                                                                    if (q3.W != null) break block17;
                                                                                    q3 = this.j;
                                                                                }
                                                                                i2 = i3 = q3.ao;
                                                                                if (arrstring == null) break block19;
                                                                                if (i2 == null) break block20;
                                                                                i2 = i3;
                                                                            }
                                                                            if (arrstring == null) break block21;
                                                                            if (i2.d == net.minecraft.k.j.BLOCK) break block22;
                                                                        }
                                                                        return;
                                                                    }
                                                                    i2 = i3;
                                                                }
                                                                n n11 = i2.a();
                                                                object = this.j.e.d(n11);
                                                                n10 = ea.a((i)object) ? 1 : 0;
                                                                if (arrstring == null) break block23;
                                                                if (n10 == 0) break block24;
                                                                n10 = this.j.e.b(n11) instanceof net.minecraft.B.a;
                                                            }
                                                            if (arrstring == null) break block16;
                                                            if (n10 != 0) break block17;
                                                        }
                                                        return;
                                                    }
                                                    n10 = l2.e();
                                                }
                                                n7 = n10;
                                                n8 = l2.a();
                                                n9 = c10.bE;
                                                if (arrstring == null) break block25;
                                                if (n9 == 0) break block26;
                                                n9 = c10.cb;
                                                if (arrstring == null) break block25;
                                                if (n9 != 0) break block26;
                                                n9 = this.j.s.U();
                                                if (arrstring == null) break block25;
                                                if (n9 != 0) break block26;
                                                n9 = c10.aw;
                                                if (arrstring == null) break block25;
                                                if (n9 != 0) break block26;
                                                net.minecraft.client.a.v.M();
                                                net.minecraft.client.a.v.b((float)(n7 / 2), (float)(n8 / 2), c);
                                                object = this.j.Z();
                                                net.minecraft.client.a.v.a(((x)object).E + (((x)object).at - ((x)object).E) * f10, -1.0f, 0.0f, 0.0f);
                                                net.minecraft.client.a.v.a(((x)object).ak + (((x)object).e - ((x)object).ak) * f10, 0.0f, 1.0f, 0.0f);
                                                net.minecraft.client.a.v.d(-1.0f, -1.0f, -1.0f);
                                                as.l(10);
                                                net.minecraft.client.a.v.B();
                                                if (arrstring != null) break block15;
                                            }
                                            net.minecraft.client.a.v.a(net.minecraft.client.a.o.ONE_MINUS_DST_COLOR, net.minecraft.client.a.G.ONE_MINUS_SRC_COLOR, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                            net.minecraft.client.a.v.e();
                                            this.a(n7 / 2 - 7, n8 / 2 - 7, 0, 0, 16, 16);
                                            q2 = this.j;
                                            if (arrstring == null) break block27;
                                            n9 = q2.ac.bm;
                                        }
                                        if (n9 != 1) break block15;
                                        q2 = this.j;
                                    }
                                    f11 = q2.s.e(0.0f);
                                    n6 = 0;
                                    x2 = this.j.W;
                                    if (arrstring == null) break block28;
                                    if (x2 == null) break block29;
                                    x2 = this.j.W;
                                }
                                n5 = x2 instanceof B;
                                if (arrstring == null) break block30;
                                if (n5 == 0) break block29;
                                float f13 = f11 - 1.0f;
                                n5 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                if (arrstring == null) break block30;
                                if (n5 >= 0) {
                                    float f15 = this.j.s.z() - 5.0f;
                                    f15 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                    if (arrstring != null) {
                                        f15 = f15 > 0 ? 1.0f : 0.0f;
                                    }
                                    n6 = (int)f15;
                                    n6 &= this.j.W.aL();
                                }
                            }
                            n5 = n8 / 2 - 7 + 16;
                        }
                        n4 = n5;
                        n3 = n7 / 2 - 8;
                        n2 = n6;
                        if (arrstring == null) break block31;
                        if (n2 == 0) break block32;
                        this.a(n3, n4, 68, 94, 16, 16);
                        if (arrstring != null) break block15;
                    }
                    n2 = (f12 = f11 - 1.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                }
                if (arrstring == null) break block33;
                if (n2 >= 0) break block15;
                n2 = (int)(f11 * 17.0f);
            }
            int n12 = n2;
            this.a(n3, n4, 36, 94, 16, 4);
            this.a(n3, n4, 52, 94, n12, 4);
        }
    }

    protected void a(l l2, float f10) {
        block19: {
            block29: {
                block28: {
                    Q q2;
                    int n2;
                    int n3;
                    int n4;
                    net.minecraft.ar.b b10;
                    String[] arrstring;
                    block27: {
                        int n5;
                        block23: {
                            block17: {
                                block26: {
                                    int n6;
                                    net.minecraft.w.d d10;
                                    net.minecraft.i.j j2;
                                    block25: {
                                        block24: {
                                            block20: {
                                                int n7;
                                                float f11;
                                                block21: {
                                                    block22: {
                                                        x x2;
                                                        block18: {
                                                            arrstring = net.minecraft.client.b.q.b();
                                                            x2 = this.j.Z();
                                                            if (arrstring == null) break block18;
                                                            if (!(x2 instanceof net.minecraft.i.j)) break block19;
                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                            this.j.aN().b(l);
                                                            x2 = this.j.Z();
                                                        }
                                                        j2 = (net.minecraft.i.j)x2;
                                                        d10 = j2.b();
                                                        b10 = j2.al().a();
                                                        n4 = l2.e() / 2;
                                                        f11 = c;
                                                        int n8 = 182;
                                                        int n9 = 91;
                                                        c = -90.0f;
                                                        this.a(n4 - 91, l2.a() - 22, 0, 0, 182, 22);
                                                        this.a(n4 - 91 - 1 + j2.cB.a * 20, l2.a() - 22 - 1, 0, 22, 24, 22);
                                                        n7 = d10.G();
                                                        if (arrstring == null) break block20;
                                                        if (n7 != 0) break block21;
                                                        if (b10 != net.minecraft.ar.b.LEFT) break block22;
                                                        this.a(n4 - 91 - 29, l2.a() - 23, 24, 22, 29, 24);
                                                        if (arrstring != null) break block21;
                                                    }
                                                    this.a(n4 + 91, l2.a() - 23, 53, 22, 29, 24);
                                                }
                                                c = f11;
                                                net.minecraft.client.a.v.q();
                                                net.minecraft.client.a.v.a();
                                                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                net.minecraft.client.a.a0.b();
                                                b1.a(false);
                                                n7 = n6 = 0;
                                            }
                                            while (n6 < 9) {
                                                n3 = n4 - 90 + n6 * 20 + 2;
                                                n2 = l2.a() - 16 - 3;
                                                this.a(n3, n2, f10, j2, j2.cB.c.get(n6));
                                                ++n6;
                                                if (arrstring != null) {
                                                    if (arrstring != null) continue;
                                                }
                                                break block17;
                                            }
                                            n5 = d10.G();
                                            if (arrstring == null) break block23;
                                            if (n5 != 0) break block17;
                                            b1.a(true);
                                            n6 = l2.a() - 16 - 3;
                                            if (arrstring == null) break block24;
                                            if (b10 != net.minecraft.ar.b.LEFT) break block25;
                                            this.a(n4 - 91 - 26, n6, f10, j2, d10);
                                        }
                                        if (arrstring != null) break block26;
                                    }
                                    this.a(n4 + 91 + 10, n6, f10, j2, d10);
                                }
                                b1.a(false);
                            }
                            q2 = this.j;
                            if (arrstring == null) break block27;
                            n5 = q2.ac.bm;
                        }
                        if (n5 != 2) break block28;
                        q2 = this.j;
                    }
                    float f12 = q2.s.e(0.0f);
                    if (arrstring == null) break block29;
                    if (f12 < 1.0f) {
                        n3 = l2.a() - 20;
                        n2 = n4 + 91 + 6;
                        if (arrstring != null) {
                            if (b10 == net.minecraft.ar.b.RIGHT) {
                                n2 = n4 - 91 - 22;
                            }
                            this.j.aN().b(net.minecraft.client.b.q.e);
                        }
                        int n10 = (int)(f12 * 19.0f);
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        this.a(n2, n3, 0, 94, 18, 18);
                        this.a(n2, n3 + 18 - n10, 18, 112 - n10, 18, n10);
                    }
                }
                net.minecraft.client.a.a0.a();
                net.minecraft.client.a.v.u();
            }
            net.minecraft.client.a.v.f();
        }
    }

    public K c() {
        return this.J;
    }

    public void h() {
        this.J.a();
        this.s.c();
        this.j.ay().b();
    }

    public a5 d() {
        return this.j.a6;
    }

    public void a(float f10) {
        block86: {
            block85: {
                G g10;
                block81: {
                    block82: {
                        G g11;
                        net.minecraft.D.h h2;
                        net.minecraft.D.b b10;
                        int n2;
                        String[] arrstring;
                        block83: {
                            block84: {
                                net.minecraft.D.h h3;
                                block76: {
                                    int n3;
                                    block77: {
                                        block80: {
                                            l l2;
                                            block79: {
                                                boolean bl2;
                                                block78: {
                                                    net.minecraft.D.h h4;
                                                    block75: {
                                                        int n4;
                                                        m m2;
                                                        block74: {
                                                            m m3;
                                                            G g12;
                                                            block70: {
                                                                block71: {
                                                                    block73: {
                                                                        int n5;
                                                                        int n6;
                                                                        a5 a52;
                                                                        block72: {
                                                                            int n7;
                                                                            float f11;
                                                                            float f12;
                                                                            block66: {
                                                                                block67: {
                                                                                    block69: {
                                                                                        int n8;
                                                                                        float f13;
                                                                                        block68: {
                                                                                            block65: {
                                                                                                block64: {
                                                                                                    block62: {
                                                                                                        block63: {
                                                                                                            block61: {
                                                                                                                block60: {
                                                                                                                    int n9;
                                                                                                                    block58: {
                                                                                                                        block59: {
                                                                                                                            block57: {
                                                                                                                                G g13;
                                                                                                                                block55: {
                                                                                                                                    block56: {
                                                                                                                                        int n10;
                                                                                                                                        block53: {
                                                                                                                                            block54: {
                                                                                                                                                block52: {
                                                                                                                                                    block50: {
                                                                                                                                                        block51: {
                                                                                                                                                            l2 = new l(this.j);
                                                                                                                                                            arrstring = net.minecraft.client.b.q.b();
                                                                                                                                                            n2 = l2.e();
                                                                                                                                                            n3 = l2.a();
                                                                                                                                                            a52 = this.d();
                                                                                                                                                            gI gI2 = new gI(l2, f10);
                                                                                                                                                            af.a(gI2);
                                                                                                                                                            net.minecraft.client.a.v.a();
                                                                                                                                                            if (arrstring == null) break block50;
                                                                                                                                                            if (!fU.b()) break block51;
                                                                                                                                                            this.c(this.j.s.S(), l2);
                                                                                                                                                            if (arrstring != null) break block52;
                                                                                                                                                        }
                                                                                                                                                        net.minecraft.client.a.v.t();
                                                                                                                                                    }
                                                                                                                                                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                                                                                                }
                                                                                                                                                net.minecraft.w.d d10 = this.j.s.cB.c(3);
                                                                                                                                                n10 = this.j.ac.L;
                                                                                                                                                if (arrstring != null) {
                                                                                                                                                    if (n10 == 0 && d10.w() == net.minecraft.w.k.b(net.minecraft.u.g.G)) {
                                                                                                                                                        this.b(l2);
                                                                                                                                                    }
                                                                                                                                                    n10 = this.j.s.c(net.minecraft.u.c.s) ? 1 : 0;
                                                                                                                                                }
                                                                                                                                                if (arrstring == null) break block53;
                                                                                                                                                if (n10 != 0) break block54;
                                                                                                                                                float f14 = this.j.s.cO + (this.j.s.cK - this.j.s.cO) * f10;
                                                                                                                                                float f15 = f14 - 0.0f;
                                                                                                                                                n10 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                                                                                                if (arrstring == null) break block53;
                                                                                                                                                if (n10 > 0) {
                                                                                                                                                    this.a(f14, l2);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            g13 = this;
                                                                                                                                            if (arrstring == null) break block55;
                                                                                                                                            n10 = g13.j.aW.h() ? 1 : 0;
                                                                                                                                        }
                                                                                                                                        if (n10 == 0) break block56;
                                                                                                                                        this.v.a(l2, f10);
                                                                                                                                        if (arrstring != null) break block57;
                                                                                                                                    }
                                                                                                                                    g13 = this;
                                                                                                                                }
                                                                                                                                g13.a(l2, f10);
                                                                                                                            }
                                                                                                                            fn fn2 = new fn(l2);
                                                                                                                            af.a(fn2);
                                                                                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                                            this.j.aN().b(e);
                                                                                                                            net.minecraft.client.a.v.a();
                                                                                                                            this.b(f10, l2);
                                                                                                                            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                                                                            this.j.an.b("bossHealth");
                                                                                                                            this.s.d();
                                                                                                                            this.j.an.c();
                                                                                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                                            this.j.aN().b(e);
                                                                                                                            int n11 = this.j.aW.n();
                                                                                                                            if (arrstring != null) {
                                                                                                                                if (n11 != 0) {
                                                                                                                                    this.f(l2);
                                                                                                                                }
                                                                                                                                this.e(l2);
                                                                                                                                net.minecraft.client.a.v.f();
                                                                                                                                n11 = this.j.s.x();
                                                                                                                            }
                                                                                                                            if (arrstring != null) {
                                                                                                                                if (n11 > 0) {
                                                                                                                                    this.j.an.b("sleep");
                                                                                                                                    net.minecraft.client.a.v.n();
                                                                                                                                    net.minecraft.client.a.v.v();
                                                                                                                                    n9 = this.j.s.x();
                                                                                                                                    f12 = (float)n9 / 100.0f;
                                                                                                                                    float f17 = f12 - 1.0f;
                                                                                                                                    f17 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                                                                                    if (arrstring != null) {
                                                                                                                                        if (f17 > 0) {
                                                                                                                                            f12 = 1.0f - (float)(n9 - 100) / 10.0f;
                                                                                                                                        }
                                                                                                                                        f17 = (int)(220.0f * f12) << 24 | 0x101020;
                                                                                                                                    }
                                                                                                                                    f11 = f17;
                                                                                                                                    net.minecraft.client.b.G.a(0, 0, n2, n3, (int)f11);
                                                                                                                                    net.minecraft.client.a.v.e();
                                                                                                                                    net.minecraft.client.a.v.t();
                                                                                                                                    this.j.an.c();
                                                                                                                                }
                                                                                                                                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                                                n11 = n2 / 2 - 91;
                                                                                                                            }
                                                                                                                            n9 = n11;
                                                                                                                            n7 = this.j.s.y();
                                                                                                                            if (arrstring == null) break block58;
                                                                                                                            if (n7 == 0) break block59;
                                                                                                                            this.a(l2, n9);
                                                                                                                            if (arrstring != null) break block60;
                                                                                                                        }
                                                                                                                        n7 = this.j.aW.c();
                                                                                                                    }
                                                                                                                    if (arrstring == null) break block61;
                                                                                                                    if (n7 != 0) {
                                                                                                                        this.b(l2, n9);
                                                                                                                    }
                                                                                                                }
                                                                                                                n7 = this.j.ac.bP;
                                                                                                            }
                                                                                                            if (arrstring == null) break block62;
                                                                                                            if (n7 == 0) break block63;
                                                                                                            n7 = this.j.aW.h();
                                                                                                            if (arrstring == null) break block62;
                                                                                                            if (n7 != 0) break block63;
                                                                                                            this.d(l2);
                                                                                                            if (arrstring != null) break block64;
                                                                                                        }
                                                                                                        n7 = this.j.s.ae();
                                                                                                    }
                                                                                                    if (arrstring == null) break block65;
                                                                                                    if (n7 != 0) {
                                                                                                        this.v.a(l2);
                                                                                                    }
                                                                                                }
                                                                                                n7 = this.j.ac.bE;
                                                                                            }
                                                                                            if (arrstring != null) {
                                                                                                if (n7 != 0) {
                                                                                                    this.m.b(l2);
                                                                                                }
                                                                                                n7 = this.k;
                                                                                            }
                                                                                            if (arrstring == null) break block66;
                                                                                            if (n7 <= 0) break block67;
                                                                                            this.j.an.b("overlayMessage");
                                                                                            f12 = (float)this.k - f10;
                                                                                            f13 = f11 = (float)((int)(f12 * 255.0f / 20.0f));
                                                                                            n8 = 255;
                                                                                            if (arrstring != null) {
                                                                                                if (f13 > n8) {
                                                                                                    f11 = 255;
                                                                                                }
                                                                                                f13 = f11;
                                                                                                n8 = 8;
                                                                                            }
                                                                                            if (arrstring == null) break block68;
                                                                                            if (f13 <= n8) break block69;
                                                                                            net.minecraft.client.a.v.M();
                                                                                            f13 = n2;
                                                                                            n8 = 2;
                                                                                        }
                                                                                        net.minecraft.client.a.v.b(f13 / n8, (float)(n3 - 68), 0.0f);
                                                                                        net.minecraft.client.a.v.a();
                                                                                        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                                        int n12 = 0xFFFFFF;
                                                                                        int n13 = this.p;
                                                                                        if (arrstring != null) {
                                                                                            if (n13 != 0) {
                                                                                                n12 = net.minecraft.k.h.b(f12 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                                                                                            }
                                                                                            n13 = a52.b(this.A, -a52.e(this.A) / 2, -4.0f, n12 + (f11 << 24 & 0xFF000000));
                                                                                        }
                                                                                        net.minecraft.client.a.v.f();
                                                                                        net.minecraft.client.a.v.B();
                                                                                    }
                                                                                    this.j.an.c();
                                                                                }
                                                                                this.a.a(l2);
                                                                                g12 = this;
                                                                                if (arrstring == null) break block70;
                                                                                n7 = g12.i;
                                                                            }
                                                                            if (n7 <= 0) break block71;
                                                                            this.j.an.b("titleAndSubtitle");
                                                                            f12 = (float)this.i - f10;
                                                                            f11 = 255;
                                                                            int n5 = this.i;
                                                                            n5 = this.z + this.n;
                                                                            if (arrstring != null) {
                                                                                if (n6 > n5) {
                                                                                    float f18 = (float)(this.B + this.n + this.z) - f12;
                                                                                    f11 = (int)(f18 * 255.0f / (float)this.B);
                                                                                }
                                                                                int n5 = this.i;
                                                                                n5 = this.z;
                                                                            }
                                                                            if (arrstring != null) {
                                                                                if (n6 <= n5) {
                                                                                    f11 = (int)(f12 * 255.0f / (float)this.z);
                                                                                }
                                                                                f11 = net.minecraft.k.h.c((int)f11, 0, 255);
                                                                                int n5 = (int)f11;
                                                                                n5 = 8;
                                                                            }
                                                                            if (arrstring == null) break block72;
                                                                            if (n6 <= n5) break block73;
                                                                            net.minecraft.client.a.v.M();
                                                                            net.minecraft.client.a.v.b((float)(n2 / 2), (float)(n3 / 2), 0.0f);
                                                                            net.minecraft.client.a.v.a();
                                                                            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                                                            net.minecraft.client.a.v.M();
                                                                            net.minecraft.client.a.v.d(4.0f, 4.0f, 4.0f);
                                                                            int n5 = (int)(f11 << 24);
                                                                            n5 = -16777216;
                                                                        }
                                                                        int n14 = n6 & n5;
                                                                        a52.b(this.y, -a52.e(this.y) / 2, -10.0f, 0xFFFFFF | n14, true);
                                                                        net.minecraft.client.a.v.B();
                                                                        net.minecraft.client.a.v.M();
                                                                        net.minecraft.client.a.v.d(2.0f, 2.0f, 2.0f);
                                                                        a52.b(this.u, -a52.e(this.u) / 2, 5.0f, 0xFFFFFF | n14, true);
                                                                        net.minecraft.client.a.v.B();
                                                                        net.minecraft.client.a.v.f();
                                                                        net.minecraft.client.a.v.B();
                                                                    }
                                                                    this.j.an.c();
                                                                }
                                                                g12 = this;
                                                            }
                                                            b10 = g12.j.e.c();
                                                            h4 = null;
                                                            m2 = m3 = b10.a(this.j.s.g());
                                                            if (arrstring == null) break block74;
                                                            if (m2 == null) break block75;
                                                            m2 = m3;
                                                        }
                                                        if ((n4 = m2.e().d()) >= 0) {
                                                            h4 = b10.b(3 + n4);
                                                        }
                                                    }
                                                    net.minecraft.D.h h5 = h4;
                                                    if (arrstring != null) {
                                                        h5 = h5 != null ? h4 : b10.b(1);
                                                    }
                                                    h3 = h2 = h5;
                                                    if (arrstring == null) break block76;
                                                    if (h3 == null) break block77;
                                                    gm gm2 = new gm(gM.PRE);
                                                    af.a(gm2);
                                                    bl2 = cj.b.i.a(cX.class).i();
                                                    if (arrstring == null) break block78;
                                                    if (!bl2) break block79;
                                                    bl2 = cj.b.f.a("NoScoreBoard").l();
                                                }
                                                if (bl2) break block80;
                                            }
                                            this.a(h2, l2);
                                        }
                                        gm gm3 = new gm(gM.POST);
                                        af.a(gm3);
                                    }
                                    net.minecraft.client.a.v.a();
                                    net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
                                    net.minecraft.client.a.v.v();
                                    net.minecraft.client.a.v.M();
                                    net.minecraft.client.a.v.b(0.0f, (float)(n3 - 48), 0.0f);
                                    this.j.an.b("chat");
                                    this.r.a(this.C);
                                    this.j.an.c();
                                    net.minecraft.client.a.v.B();
                                    h3 = b10.b(0);
                                }
                                h2 = h3;
                                g10 = this;
                                if (arrstring == null) break block81;
                                if (!g10.j.ac.aK.b()) break block82;
                                g11 = this;
                                if (arrstring == null) break block83;
                                if (!g11.j.n()) break block84;
                                g11 = this;
                                if (arrstring == null) break block83;
                                if (g11.j.s.c9.c().size() <= 1 && h2 == null) break block82;
                            }
                            this.J.a(true);
                            g11 = this;
                        }
                        g11.J.a(n2, b10, h2);
                        if (arrstring != null) break block85;
                    }
                    g10 = this;
                }
                g10.J.a(false);
            }
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.e();
            if (net.minecraft.k.m.d()) break block86;
            net.minecraft.client.b.q.b(new String[2]);
        }
    }

    public void a(k k2, boolean bl2) {
        this.a(k2.f(), bl2);
    }

    public void b(l l2, int n2) {
        block10: {
            int n3;
            int n4;
            block12: {
                int n5;
                block11: {
                    int n6;
                    String[] arrstring;
                    block9: {
                        block7: {
                            block8: {
                                int n7;
                                this.j.an.b("expBar");
                                String[] arrstring2 = net.minecraft.client.b.q.b();
                                this.j.aN().b(net.minecraft.client.b.q.e);
                                arrstring = arrstring2;
                                n6 = n7 = this.j.s.R();
                                if (arrstring == null) break block7;
                                if (n6 <= 0) break block8;
                                n4 = 182;
                                int n8 = (int)(this.j.s.b7 * 183.0f);
                                n3 = l2.a() - 32 + 3;
                                this.a(n2, n3, 0, 64, 182, 5);
                                n6 = n8;
                                if (arrstring == null) break block7;
                                if (n6 > 0) {
                                    this.a(n2, n3, 0, 69, n8, 5);
                                }
                            }
                            this.j.an.c();
                            n6 = this.j.s.b4;
                        }
                        if (arrstring == null) break block9;
                        if (n6 <= 0) break block10;
                        this.j.an.b("expLevel");
                        n6 = 8453920;
                    }
                    n4 = n6;
                    n5 = fU.g();
                    if (arrstring == null) break block11;
                    if (n5 == 0) break block12;
                    n5 = fa.b(n4);
                }
                n4 = n5;
            }
            String string = "" + this.j.s.b4;
            n3 = (l2.e() - this.d().e(string)) / 2;
            int n9 = l2.a() - 31 - 4;
            this.d().b(string, n3 + 1, n9, 0);
            this.d().b(string, n3 - 1, n9, 0);
            this.d().b(string, n3, n9 + 1, 0);
            this.d().b(string, n3, n9 - 1, 0);
            this.d().b(string, n3, n9, n4);
            this.j.an.c();
        }
    }

    private void a(float f10, l l2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        float f11 = f10 - 1.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (arrstring != null) {
            if (f12 < 0) {
                f10 *= f10;
                f10 *= f10;
                f10 = f10 * 0.8f + 0.2f;
            }
            net.minecraft.client.a.v.v();
            net.minecraft.client.a.v.n();
            f12 = 0.0f;
        }
        net.minecraft.client.a.v.a((boolean)f12);
        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, f10);
        this.j.aN().b(net.minecraft.client.j.j.x);
        net.minecraft.client.j.c c10 = this.j.W().b().a(net.minecraft.u.g.aN.d());
        float f13 = c10.i();
        float f14 = c10.u();
        float f15 = c10.l();
        float f16 = c10.m();
        W w2 = W.c();
        net.minecraft.client.a.I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c(0.0, (double)l2.a(), -90.0).a(f13, f16).d();
        i2.c((double)l2.e(), (double)l2.a(), -90.0).a(f15, f16).d();
        i2.c((double)l2.e(), 0.0, -90.0).a(f15, f14).d();
        i2.c(0.0, 0.0, -90.0).a(f13, f14).d();
        w2.a();
        net.minecraft.client.a.v.a(true);
        net.minecraft.client.a.v.t();
        net.minecraft.client.a.v.e();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    static {
        h = new v("textures/misc/vignette.png");
        l = new v("textures/gui/widgets.png");
        w = new v("textures/misc/pumpkinblur.png");
    }

    public r g() {
        return this.s;
    }

    /*
     * Exception decompiling
     */
    private void f(l var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public I f() {
        return this.r;
    }

    public aR a() {
        return this.v;
    }

    public void a(net.minecraft.at.a a10, k k2) {
        Iterator<a> iterator = this.H.get((Object)a10).iterator();
        String[] arrstring = net.minecraft.client.b.q.b();
        while (iterator.hasNext()) {
            a a11 = iterator.next();
            a11.a(a10, k2);
            if (arrstring != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(net.minecraft.D.h h2, l l2) {
        int n2;
        int n3;
        String[] arrstring;
        ArrayList arrayList;
        net.minecraft.D.b b10;
        block8: {
            block11: {
                ArrayList arrayList2;
                block9: {
                    ArrayList arrayList3;
                    block10: {
                        b10 = h2.d();
                        arrayList = b10.d(h2);
                        arrayList3 = Lists.newArrayList((Iterable)Iterables.filter(arrayList, (Predicate)new b(this)));
                        arrstring = net.minecraft.client.b.q.b();
                        arrayList2 = arrayList3;
                        if (arrstring == null) break block9;
                        if (arrayList2.size() <= 15) break block10;
                        arrayList = Lists.newArrayList((Iterable)Iterables.skip((Iterable)arrayList3, (int)(arrayList.size() - 15)));
                        if (arrstring != null) break block11;
                    }
                    arrayList2 = arrayList3;
                }
                arrayList = arrayList2;
            }
            n3 = this.d().e(h2.b());
            for (e e10 : arrayList) {
                m m2 = b10.a(e10.d());
                String string = net.minecraft.D.m.a(m2, e10.d());
                n2 = Math.max(n3, this.d().e(string));
                if (arrstring != null) {
                    n3 = n2;
                    if (arrstring != null) continue;
                }
                break block8;
            }
            n2 = arrayList.size() * this.d().p;
        }
        int n4 = n2;
        int n5 = l2.a() / 2 + n4 / 3;
        int n6 = 3;
        int n7 = l2.e() - n3 - 3;
        int n8 = 0;
        for (e e11 : arrayList) {
            m m3 = b10.a(e11.d());
            String string = net.minecraft.D.m.a(m3, e11.d());
            String string2 = "vk.com/celestialclient";
            int n9 = n5 - ++n8 * this.d().p;
            int n10 = l2.e() - 3 + 2;
            dJ.b(n7 - 2, n9, n10, n9 + this.d().p, 0x60000000);
            this.j.a6.c(string, n7, n9, 0x20FFFFFF);
            if (n8 == arrayList.size()) {
                String string3 = h2.b();
                dJ.b(n7 - 2, n9 - this.d().p - 1, n10, n9 - 1, 0x60000000);
                dJ.b(n7 - 2, n9 - 1, n10, n9, 0x60000000);
                dJ.b(n7 - 2, n9 - 12, n10, n9 + -10, cj.h().getRGB(), a0.b(300, 1.0f, 1.0f));
                this.j.ax.c(string2, n7 + n3 / 2 - this.j.ax.b(string2) / 2, n9 - this.j.ax.c(), a0.b(Color.RED, cj.h(), 3.0).getRGB());
            }
            if (arrstring != null) continue;
        }
    }

    public void a(String string) {
        this.a(net.minecraft.client.D.h.a("record.nowPlaying", string), true);
    }

    public void a(l l2) {
        String string;
        block3: {
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                this.j.an.b("demo");
                String[] arrstring2 = arrstring;
                if (this.j.e.r() < 120500L) break block2;
                string = net.minecraft.client.D.h.a("demo.demoExpired", new Object[0]);
                if (arrstring2 != null) break block3;
            }
            string = net.minecraft.client.D.h.a("demo.remainingTime", aD.a((int)(120500L - this.j.e.r())));
        }
        int n2 = this.d().e(string);
        this.d().c(string, l2.e() - n2 - 10, 5.0f, 0xFFFFFF);
        this.j.an.c();
    }

    public G(Q q2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        this.I = new Random();
        this.A = "";
        String[] arrstring2 = arrstring;
        this.E = 1.0f;
        this.F = net.minecraft.w.d.m;
        this.y = "";
        this.u = "";
        this.H = Maps.newHashMap();
        this.D = 0.0f;
        this.j = q2;
        this.t = q2.Y();
        this.m = new J(q2);
        this.v = new aR(q2);
        this.r = new I(q2);
        this.J = new K(q2, this);
        this.s = new r(q2);
        this.a = new ah(q2);
        for (net.minecraft.at.a a10 : net.minecraft.at.a.values()) {
            this.H.put(a10, Lists.newArrayList());
            if (arrstring2 != null) continue;
        }
        d d10 = net.minecraft.client.t.d.c;
        this.H.get((Object)net.minecraft.at.a.CHAT).add(new net.minecraft.client.t.c(q2));
        this.H.get((Object)net.minecraft.at.a.CHAT).add(d10);
        this.H.get((Object)net.minecraft.at.a.SYSTEM).add(new net.minecraft.client.t.c(q2));
        this.H.get((Object)net.minecraft.at.a.SYSTEM).add(d10);
        this.H.get((Object)net.minecraft.at.a.GAME_INFO).add(new net.minecraft.client.t.b(q2));
        this.i();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(l var1_1) {
        var2_2 = net.minecraft.client.b.q.b();
        v0 = cj.b.i.a(c7.class).i();
        if (var2_2 != null) {
            if (v0) {
                v0 = c7.u.l();
                if (var2_2 != null) {
                    if (v0) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                net.minecraft.client.a.v.n();
                v0 = false;
            }
        }
        net.minecraft.client.a.v.a(v0);
        net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, net.minecraft.client.a.G.ZERO);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.a.v.v();
        this.j.aN().b(net.minecraft.client.b.G.w);
        var3_3 = W.c();
        var4_4 = var3_3.b();
        var4_4.a(7, net.minecraft.client.y.b.m);
        var4_4.c(0.0, (double)var1_1.a(), -90.0).a(0.0, 1.0).d();
        var4_4.c((double)var1_1.e(), (double)var1_1.a(), -90.0).a(1.0, 1.0).d();
        var4_4.c((double)var1_1.e(), 0.0, -90.0).a(1.0, 0.0).d();
        var4_4.c(0.0, 0.0, -90.0).a(0.0, 0.0).d();
        var3_3.a();
        net.minecraft.client.a.v.a(true);
        net.minecraft.client.a.v.t();
        net.minecraft.client.a.v.e();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

