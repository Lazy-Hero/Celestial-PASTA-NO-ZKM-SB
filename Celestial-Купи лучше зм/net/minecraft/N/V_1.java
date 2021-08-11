/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.N.i;
import net.minecraft.N.j;
import net.minecraft.N.n;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.c;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.W.ac;
import net.minecraft.W.cU;
import net.minecraft.ac.b;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.R;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class V
extends y
implements ao {
    private /* synthetic */ net.minecraft.Z.i i;
    private /* synthetic */ boolean k;
    private /* synthetic */ aA j;
    private /* synthetic */ float o;
    private /* synthetic */ float n;
    private /* synthetic */ boolean l;
    private static final /* synthetic */ ThreadLocal<aA> m;

    public V() {
    }

    private static double c(k k2, aA aA2, k k3) {
        return aA2.o() == R.POSITIVE ? k2.a - k3.b : k3.a - k2.b;
    }

    static {
        m = new i();
    }

    private static double d(k k2, aA aA2, k k3) {
        return aA2.o() == R.POSITIVE ? k2.f - k3.e : k3.f - k2.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private net.minecraft.Z.i g() {
        var1_1 = net.minecraft.N.j.f();
        v0 = this;
        if (var1_1 == null) {
            if (!v0.c()) {
                v0 = this;
                if (var1_1 == null) {
                    if (v0.b()) {
                        v1 = g.bi.d().a(ac.B, this.i.b() == g.M ? cU.STICKY : cU.DEFAULT).a(ac.z, this.i.b(aL.z));
                        return v1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this;
            }
        }
        v1 = v0.i;
        return v1;
    }

    public float a(float f10) {
        return (float)this.j.p() * this.e(this.d(f10));
    }

    public boolean c() {
        return this.l;
    }

    private k a(k k2) {
        double d10 = this.e(this.o);
        return k2.c((double)this.d.e() + d10 * (double)this.j.r(), (double)this.d.b() + d10 * (double)this.j.p(), (double)this.d.a() + d10 * (double)this.j.i());
    }

    public k a(t t2, net.minecraft.k.n n2) {
        return this.a(t2, n2, this.o).a(this.a(t2, n2, this.n));
    }

    private void a(x x2, aA aA2, double d10) {
        block2: {
            double d11;
            double d12;
            double d13;
            aA aA3;
            block3: {
                k k2 = x2.m();
                k k3 = K.k.a(this.d);
                m[] arrm = net.minecraft.N.j.f();
                if (!k2.c(k3)) break block2;
                aA3 = aA2.h();
                d13 = this.b(k3, aA3, k2) + 0.01;
                double d14 = this.b(k3, aA3, k2.b(k3)) + 0.01;
                d12 = Math.abs(d13 - d14);
                d11 = 0.01;
                if (arrm != null) break block3;
                if (!(d12 < d11)) break block2;
                d12 = Math.min(d13, d10);
                d11 = 0.01;
            }
            d13 = d12 + d11;
            m.set(aA2);
            x2.a(net.minecraft.U.c.PISTON, d13 * (double)aA3.r(), d13 * (double)aA3.p(), d13 * (double)aA3.i());
            m.set(null);
        }
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        r2.b("blockId", K.b(this.i.b()));
        r2.b("blockData", this.i.b().d(this.i));
        r2.b("facing", this.j.f());
        r2.a("progress", this.n);
        r2.a("extending", this.l);
        r2.a("source", this.k);
        return r2;
    }

    public aA f() {
        return this.j;
    }

    private k a(List<k> list) {
        k k2;
        block2: {
            double d10 = 0.0;
            m[] arrm = net.minecraft.N.j.f();
            double d11 = 0.0;
            double d12 = 0.0;
            double d13 = 1.0;
            double d14 = 1.0;
            double d15 = 1.0;
            for (k k3 : list) {
                d10 = Math.min(k3.e, d10);
                d11 = Math.min(k3.b, d11);
                d12 = Math.min(k3.d, d12);
                d13 = Math.max(k3.f, d13);
                d14 = Math.max(k3.a, d14);
                k2 = k3;
                if (arrm == null) {
                    d15 = Math.max(k2.g, d15);
                    if (arrm == null) continue;
                }
                break block2;
            }
            k2 = new k(d10, d11, d12, d13, d14, d15);
        }
        return k2;
    }

    public static void a(net.minecraft.av.b b10) {
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.i = K.b(r2.m("blockId")).c(r2.m("blockData"));
        this.j = aA.a(r2.m("facing"));
        this.n = this.o = r2.d("progress");
        this.l = r2.f("extending");
        this.k = r2.f("source");
    }

    private static double a(k k2, aA aA2, k k3) {
        return aA2.o() == R.POSITIVE ? k2.g - k3.d : k3.g - k2.d;
    }

    @Override
    public int m() {
        return 0;
    }

    public void d() {
        block3: {
            net.minecraft.k.n n2;
            z z2;
            block5: {
                m[] arrm;
                block4: {
                    V v2;
                    block2: {
                        arrm = net.minecraft.N.j.f();
                        v2 = this;
                        if (arrm != null) break block2;
                        if (!(v2.n < 1.0f)) break block3;
                        v2 = this;
                    }
                    z2 = v2.a;
                    if (arrm != null) break block4;
                    if (z2 == null) break block3;
                    this.n = this.o = 1.0f;
                    this.a.z(this.d);
                    this.i();
                    z2 = this.a;
                }
                n2 = this.d;
                if (arrm != null) break block5;
                if (z2.d(n2).b() != g.cS) break block3;
                this.a.a(this.d, this.i, 3);
                z2 = this.a;
                n2 = this.d;
            }
            z2.a(n2, this.i.b(), this.d);
        }
    }

    public net.minecraft.Z.i e() {
        return this.i;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(z var1_1, net.minecraft.k.n var2_2, k var3_3, List<k> var4_4, @Nullable x var5_5) {
        block17: {
            block15: {
                block16: {
                    block13: {
                        block14: {
                            block11: {
                                block12: {
                                    var6_6 = net.minecraft.N.j.f();
                                    v0 = this;
                                    if (var6_6 != null) break block11;
                                    if (v0.l) break block12;
                                    v0 = this;
                                    if (var6_6 != null) break block11;
                                    if (v0.k) {
                                        this.i.a(aL.A, true).a(var1_1, var2_2, var3_3, var4_4, var5_5, false);
                                    }
                                }
                                v0 = V.m.get();
                            }
                            var7_7 = (aA)v0;
                            cfr_temp_0 = (double)this.o - 1.0;
                            v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                            if (var6_6 != null) break block13;
                            if (v1 >= 0) break block14;
                            v2 = this;
                            if (var6_6 != null) ** GOTO lbl23
                            if (v2.l) {
                                v3 = this.j;
                            } else {
                                v2 = this;
lbl23:
                                // 2 sources

                                v3 = v2.j.h();
                            }
                            if (var7_7 == v3) return;
                        }
                        v1 = var4_4.size();
                    }
                    var8_8 = v1;
                    v4 = this;
                    if (var6_6 != null) break block15;
                    if (!v4.b()) break block16;
                    v5 = g.bi.d().a(ac.z, this.j);
                    cfr_temp_1 = 1.0f - this.o - 0.25f;
                    v6 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    if (var6_6 == null) {
                        v6 = v6 < 0 ? (float)true : (float)false;
                    }
                    var9_9 = v5.a(ac.M, this.l != v6);
                    if (var6_6 == null) break block17;
                }
                v4 = this;
            }
            var9_9 = v4.i;
        }
        var10_10 = this.e(this.o);
        var11_11 = (float)this.j.r() * var10_10;
        var13_12 = (float)this.j.p() * var10_10;
        var15_13 = (float)this.j.i() * var10_10;
        var9_9.a(var1_1, var2_2, var3_3.c(-var11_11, -var13_12, -var15_13), var4_4, var5_5, true);
        var17_14 = var8_8;
        do {
            if (var17_14 >= var4_4.size()) return;
            var4_4.set((int)var17_14, var4_4.get((int)var17_14).c(var11_11, var13_12, var15_13));
            ++var17_14;
        } while (var6_6 == null);
    }

    public boolean b() {
        return this.k;
    }

    private float e(float f10) {
        return this.l ? f10 - 1.0f : 1.0f - f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void f(float var1_1) {
        var2_2 = net.minecraft.N.j.f();
        v0 = this;
        if (var2_2 != null) ** GOTO lbl8
        if (v0.l) {
            v1 = this.j;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.j.h();
        }
        var3_3 = v1;
        var4_4 = var1_1 - this.o;
        var6_5 = Lists.newArrayList();
        v2 = this;
        if (var2_2 == null) {
            v2.g().a(this.a, net.minecraft.k.n.o, new k(net.minecraft.k.n.o), var6_5, null, true);
            if (var6_5.isEmpty() != false) return;
            v2 = this;
        }
        if ((var8_7 = this.a.b(null, this.a(var7_6 = v2.a(this.a(var6_5)), var3_3, var4_4).a(var7_6))).isEmpty() != false) return;
        var9_8 = this.i.b() == g.t ? 1 : 0;
        var10_9 = 0;
        do {
            block26: {
                block30: {
                    block29: {
                        block25: {
                            block28: {
                                block27: {
                                    if (var10_9 >= var8_7.size()) return;
                                    var11_10 = var8_7.get(var10_9);
                                    if (var2_2 != null) continue;
                                    if (var11_10.z() == b.IGNORE) break block26;
                                    v3 = var9_8;
                                    if (var2_2 != null) break block27;
                                    if (v3 == 0) break block28;
                                    v3 = net.minecraft.N.n.a[var3_3.g().ordinal()];
                                }
                                switch (v3) {
                                    case 1: {
                                        var11_10.aq = var3_3.r();
                                        if (var2_2 == null) break;
                                    }
                                    case 2: {
                                        var11_10.G = var3_3.p();
                                        if (var2_2 == null) break;
                                    }
                                    case 3: {
                                        var11_10.d = var3_3.i();
                                        break;
                                    }
                                }
                            }
                            var12_11 = 0.0;
                            var14_12 = 0;
                            while (var14_12 < var6_5.size()) {
                                var15_13 = this.a(this.a((k)var6_5.get(var14_12)), var3_3, var4_4);
                                var16_14 = var11_10.m();
                                if (var2_2 == null) {
                                    v4 = (double)var15_13.c(var16_14);
                                    if (var2_2 != null) break block25;
                                    if (v4 != false) {
                                        var12_11 = Math.max(var12_11, this.b(var15_13, var3_3, var16_14));
                                        if (var2_2 == null) {
                                            if (var12_11 >= var4_4 && var2_2 == null) break;
                                        }
                                    } else {
                                        ++var14_12;
                                    }
                                }
                                if (var2_2 == null) continue;
                            }
                            v4 = (cfr_temp_0 = var12_11 - 0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        }
                        if (var2_2 != null) break block29;
                        if (v4 <= 0) break block26;
                        var12_11 = Math.min(var12_11, var4_4) + 0.01;
                        V.m.set(var3_3);
                        var11_10.a(net.minecraft.U.c.PISTON, var12_11 * (double)var3_3.r(), var12_11 * (double)var3_3.p(), var12_11 * (double)var3_3.i());
                        V.m.set(null);
                        if (var2_2 != null) continue;
                        v4 = (double)this.l;
                    }
                    if (v4 != false) break block26;
                    v5 = this;
                    if (var2_2 != null) break block30;
                    if (!v5.k) break block26;
                    v5 = this;
                }
                v5.a(var11_10, var3_3, var4_4);
            }
            ++var10_9;
        } while (var2_2 == null);
    }

    public float b(float f10) {
        return (float)this.j.r() * this.e(this.d(f10));
    }

    @Override
    public void c() {
        block5: {
            block6: {
                float f10;
                float f11;
                m[] arrm;
                block2: {
                    block3: {
                        net.minecraft.k.n n2;
                        z z2;
                        block4: {
                            this.n = this.o;
                            arrm = net.minecraft.N.j.f();
                            f11 = this.n;
                            f10 = 1.0f;
                            if (arrm != null) break block2;
                            if (!(f11 >= f10)) break block3;
                            this.a.z(this.d);
                            this.i();
                            z2 = this.a;
                            n2 = this.d;
                            if (arrm != null) break block4;
                            if (z2.d(n2).b() != g.cS) break block5;
                            this.a.a(this.d, this.i, 3);
                            z2 = this.a;
                            n2 = this.d;
                        }
                        z2.a(n2, this.i.b(), this.d);
                        if (arrm == null) break block5;
                    }
                    f11 = this.o;
                    f10 = 0.5f;
                }
                float f12 = f11 + f10;
                this.f(f12);
                this.o = f12;
                V v2 = this;
                if (arrm != null) break block6;
                if (!(v2.o >= 1.0f)) break block5;
                v2 = this;
            }
            v2.o = 1.0f;
        }
    }

    public V(net.minecraft.Z.i i2, aA aA2, boolean bl2, boolean bl3) {
        this.i = i2;
        this.j = aA2;
        this.l = bl2;
        this.k = bl3;
    }

    private k a(k k2, aA aA2, double d10) {
        double d11 = d10 * (double)aA2.o().a();
        double d12 = Math.min(d11, 0.0);
        double d13 = Math.max(d11, 0.0);
        switch (aA2) {
            case WEST: {
                return new k(k2.e + d12, k2.b, k2.d, k2.e + d13, k2.a, k2.g);
            }
            case EAST: {
                return new k(k2.f + d12, k2.b, k2.d, k2.f + d13, k2.a, k2.g);
            }
            case DOWN: {
                return new k(k2.e, k2.b + d12, k2.d, k2.f, k2.b + d13, k2.g);
            }
            default: {
                return new k(k2.e, k2.a + d12, k2.d, k2.f, k2.a + d13, k2.g);
            }
            case NORTH: {
                return new k(k2.e, k2.b, k2.d + d12, k2.f, k2.a, k2.d + d13);
            }
            case SOUTH: 
        }
        return new k(k2.e, k2.b, k2.g + d12, k2.f, k2.a, k2.g + d13);
    }

    private double b(k k2, aA aA2, k k3) {
        switch (aA2.g()) {
            case X: {
                return V.d(k2, aA2, k3);
            }
            default: {
                return V.c(k2, aA2, k3);
            }
            case Z: 
        }
        return V.a(k2, aA2, k3);
    }

    public float c(float f10) {
        return (float)this.j.i() * this.e(this.d(f10));
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public float d(float f10) {
        m[] arrm = net.minecraft.N.j.f();
        float f11 = f10;
        float f12 = 1.0f;
        if (arrm == null) {
            if (f11 > f12) {
                f10 = 1.0f;
            }
            f11 = this.n;
            f12 = (this.o - this.n) * f10;
        }
        return f11 + f12;
    }

    public k a(t t2, net.minecraft.k.n n2, float f10) {
        f10 = this.e(f10);
        net.minecraft.Z.i i2 = this.g();
        return i2.f(t2, n2).c((double)(f10 * (float)this.j.r()), f10 * (float)this.j.p(), f10 * (float)this.j.i());
    }
}

