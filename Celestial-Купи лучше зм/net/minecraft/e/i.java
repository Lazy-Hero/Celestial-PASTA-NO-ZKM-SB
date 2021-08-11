/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.T;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.e.b;
import net.minecraft.e.f;
import net.minecraft.e.h;
import net.minecraft.e.o;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.g;

public abstract class i {
    protected /* synthetic */ C j;
    private /* synthetic */ n n;
    private /* synthetic */ l g;
    private final /* synthetic */ net.minecraft.j.b e;
    protected /* synthetic */ double s;
    protected /* synthetic */ float o;
    private final /* synthetic */ o h;
    protected /* synthetic */ z r;
    private /* synthetic */ long d;
    protected /* synthetic */ int a;
    protected /* synthetic */ boolean l;
    protected /* synthetic */ b b;
    private /* synthetic */ long k;
    private /* synthetic */ double i;
    private /* synthetic */ long f;
    private /* synthetic */ int q;
    @Nullable
    protected /* synthetic */ h c;
    private /* synthetic */ l m;
    private static /* synthetic */ int p;

    protected void a() {
        block5: {
            int n2 = net.minecraft.e.i.n();
            if (this.c == null) break block5;
            int n3 = 0;
            while (n3 < this.c.f()) {
                block6: {
                    block7: {
                        f f10 = this.c.b(n3);
                        f f11 = n3 + 1 < this.c.f() ? this.c.b(n3 + 1) : null;
                        net.minecraft.Z.i i2 = this.r.d(new n(f10.g, f10.m, f10.f));
                        K k2 = i2.b();
                        if (n2 == 0) break block6;
                        if (k2 != net.minecraft.u.g.aH) break block7;
                        this.c.a(n3, f10.a(f10.g, f10.m + 1, f10.f));
                        if (n2 == 0) break block6;
                        if (f11 != null && f10.m >= f11.m) {
                            this.c.a(n3 + 1, f11.a(f11.g, f10.m + 1, f11.f));
                        }
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
        }
    }

    public static int g() {
        int n2 = net.minecraft.e.i.n();
        if (n2 == 0) {
            return 95;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(x x2, double d10) {
        h h2 = this.a(x2);
        int n2 = net.minecraft.e.i.g();
        if (h2 == null) return false;
        boolean bl2 = this.a(h2, d10);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public h b(n var1_1) {
        var2_2 = net.minecraft.e.i.g();
        v0 = this;
        if (var2_2 == 0) {
            if (!v0.h()) {
                return null;
            }
            v0 = this;
        }
        if (var2_2 == 0) {
            if (v0.c != null) {
                v0 = this;
                if (var2_2 == 0) {
                    if (!v0.c.h() && var1_1.equals(this.n)) {
                        return this.c;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                this.n = var1_1;
                v0 = this;
            }
        }
        var3_3 = v0.i();
        this.r.H.b("pathfind");
        var4_4 = new n(this.j);
        var5_5 = (int)(var3_3 + 8.0f);
        var6_6 = new T(this.r, var4_4.a(-var5_5, -var5_5, -var5_5), var4_4.a(var5_5, var5_5, var5_5), 0);
        var7_7 = this.h.a((t)var6_6, this.j, this.n, var3_3);
        this.r.H.c();
        return var7_7;
    }

    public i(C c10, z z2) {
        this.g = net.minecraft.k.l.a;
        this.m = net.minecraft.k.l.a;
        this.o = 0.5f;
        this.j = c10;
        this.r = z2;
        this.e = c10.a(M.b);
        this.h = this.l();
    }

    protected abstract o l();

    public boolean a(@Nullable h h2, double d10) {
        i i2;
        block8: {
            int n2;
            block7: {
                int n3 = net.minecraft.e.i.n();
                h h3 = h2;
                if (n3 != 0) {
                    if (h3 == null) {
                        this.c = null;
                        return false;
                    }
                    h3 = h2;
                }
                n2 = h3.a(this.c);
                if (n3 == 0) break block7;
                if (n2 == 0) {
                    this.c = h2;
                }
                this.a();
                i2 = this;
                if (n3 == 0) break block8;
                n2 = i2.c.f();
            }
            if (n2 <= 0) {
                return false;
            }
            this.s = d10;
            i2 = this;
        }
        l l2 = i2.q();
        this.q = this.a;
        this.g = l2;
        return true;
    }

    @Nullable
    public final h a(double d10, double d11, double d12) {
        return this.b(new n(d10, d11, d12));
    }

    public void a(double d10) {
        this.s = d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void e() {
        block16: {
            block17: {
                block18: {
                    block15: {
                        var2_1 = this.q();
                        var1_2 = net.minecraft.e.i.n();
                        var3_3 = this.c.f();
                        for (var4_4 = this.c.a(); var4_4 < this.c.f(); ++var4_4) {
                            v0 = this.c;
                            if (var1_2 != 0) {
                                cfr_temp_0 = (double)v0.b((int)var4_4).m - Math.floor(var2_1.d);
                                v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                if (var1_2 != 0) {
                                    if (v1 == false) continue;
                                    v1 = var4_4;
                                }
                                var3_3 = (int)v1;
                                if (var1_2 != 0) break;
                                if (var1_2 != 0) continue;
                            }
                            break block15;
                        }
                        v2 = this.j.ad;
                        v3 = 0.75f;
                        if (var1_2 == 0) ** GOTO lbl24
                        if (v2 > v3) {
                            v4 = this.j.ad / 2.0f;
                        } else {
                            v2 = 0.75f;
                            v3 = this.j.ad / 2.0f;
lbl24:
                            // 2 sources

                            v4 = v2 - v3;
                        }
                        this.o = v4;
                        v0 = this.c;
                    }
                    var4_5 = v0.i();
                    cfr_temp_1 = net.minecraft.k.h.e((float)(this.j.a - (var4_5.e + 0.5))) - this.o;
                    v5 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    if (var1_2 == 0) break block17;
                    if (v5 >= 0) break block18;
                    cfr_temp_2 = net.minecraft.k.h.e((float)(this.j.ax - (var4_5.b + 0.5))) - this.o;
                    v5 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                    if (var1_2 == 0) break block17;
                    if (v5 >= 0) break block18;
                    cfr_temp_3 = Math.abs(this.j.aF - var4_5.d) - 1.0;
                    v5 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    if (var1_2 == 0) break block17;
                    if (v5 < 0) {
                        this.c.a(this.c.a() + 1);
                    }
                }
                v5 = net.minecraft.k.h.f(this.j.ad);
            }
            var5_6 = v5;
            var6_7 = net.minecraft.k.h.f(this.j.aD);
            var7_8 = var5_6;
            for (var8_9 = var3_3 - 1; var8_9 >= this.c.a(); --var8_9) {
                v6 = this;
                if (var1_2 != 0) {
                    v7 = var2_1;
                    if (var1_2 == 0) break block16;
                    if (!v6.a(v7, this.c.a(this.j, var8_9), (int)var5_6, var6_7, (int)var7_8)) continue;
                    v6 = this;
                }
                v6.c.a(var8_9);
                if (var1_2 != 0) break;
                if (var1_2 != 0) continue;
            }
            v8 = this;
            v7 = var2_1;
        }
        v8.a(v7);
    }

    protected abstract boolean a(l var1, l var2, int var3, int var4, int var5);

    public void d() {
        block7: {
            Object object;
            l l2;
            i i2;
            block13: {
                int n2;
                block12: {
                    int n3;
                    block11: {
                        block10: {
                            block8: {
                                block9: {
                                    boolean bl2;
                                    block6: {
                                        ++this.a;
                                        n3 = net.minecraft.e.i.n();
                                        bl2 = this.l;
                                        if (n3 != 0) {
                                            if (bl2) {
                                                this.m();
                                            }
                                            bl2 = this.o();
                                        }
                                        if (n3 == 0) break block6;
                                        if (bl2) break block7;
                                        i2 = this;
                                        if (n3 == 0) break block8;
                                        bl2 = i2.h();
                                    }
                                    if (!bl2) break block9;
                                    this.e();
                                    if (n3 != 0) break block10;
                                }
                                i2 = this;
                            }
                            if (n3 == 0) break block11;
                            if (i2.c == null) break block10;
                            n2 = this.c.a();
                            if (n3 == 0) break block12;
                            if (n2 >= this.c.f()) break block10;
                            l2 = this.q();
                            object = this.c.a(this.j, this.c.a());
                            double d10 = l2.d - ((l)object).d;
                            n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                            if (n3 == 0) break block12;
                            if (n2 <= 0) break block10;
                            n2 = this.j.A ? 1 : 0;
                            if (n3 == 0) break block12;
                            if (n2 != 0) break block10;
                            n2 = net.minecraft.k.h.f(l2.e);
                            if (n3 == 0) break block12;
                            if (n2 != net.minecraft.k.h.f(((l)object).e)) break block10;
                            n2 = net.minecraft.k.h.f(l2.b);
                            if (n3 == 0) break block12;
                            if (n2 == net.minecraft.k.h.f(((l)object).b)) {
                                this.c.a(this.c.a() + 1);
                            }
                        }
                        this.c();
                        i2 = this;
                    }
                    if (n3 == 0) break block13;
                    n2 = i2.o();
                }
                if (n2 != 0) break block7;
                i2 = this;
            }
            l2 = i2.c.a(this.j);
            object = new n(l2).k();
            k k2 = this.r.d((n)object).f(this.r, (n)object);
            l2 = l2.a(0.0, 1.0 - k2.a, 0.0);
            this.j.w().a(l2.e, l2.d, l2.b, this.s);
        }
    }

    static {
        if (net.minecraft.e.i.g() != 0) {
            net.minecraft.e.i.b(105);
        }
    }

    public boolean a(n n2) {
        return this.r.d(n2.k()).m();
    }

    public float i() {
        return (float)this.e.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public h a(x var1_1) {
        var2_2 = net.minecraft.e.i.g();
        if (!this.h()) {
            return null;
        }
        var3_3 = new n(var1_1);
        v0 = this;
        if (var2_2 == 0) {
            if (v0.c != null) {
                v0 = this;
                if (var2_2 == 0) {
                    if (!v0.c.h() && var3_3.equals(this.n)) {
                        return this.c;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                this.n = var3_3;
                v0 = this;
            }
        }
        var4_4 = v0.i();
        this.r.H.b("pathfind");
        var5_5 = new n(this.j).a();
        var6_6 = (int)(var4_4 + 16.0f);
        var7_7 = new T(this.r, var5_5.a(-var6_6, -var6_6, -var6_6), var5_5.a(var6_6, var6_6, var6_6), 0);
        var8_8 = this.h.a((t)var7_7, this.j, var1_1, var4_4);
        this.r.H.c();
        return var8_8;
    }

    protected void c() {
    }

    protected abstract boolean h();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean o() {
        int n2 = net.minecraft.e.i.g();
        h h2 = this.c;
        if (n2 == 0) {
            if (h2 == null) return true;
            h2 = this.c;
        }
        boolean bl2 = h2.h();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean j() {
        int n2 = net.minecraft.e.i.g();
        boolean bl2 = this.j.aj();
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.j.av();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected abstract l q();

    public b b() {
        return this.b;
    }

    public boolean p() {
        return this.l;
    }

    @Nullable
    public h k() {
        return this.c;
    }

    public static void b(int n2) {
        p = n2;
    }

    public boolean a(double d10, double d11, double d12, double d13) {
        return this.a(this.a(d10, d11, d12), d13);
    }

    public static int n() {
        return p;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void m() {
        block5: {
            block2: {
                i i2;
                block3: {
                    int n2;
                    block4: {
                        n2 = net.minecraft.e.i.n();
                        i2 = this;
                        if (n2 == 0) break block2;
                        if (i2.r.r() - this.f <= 20L) break block3;
                        i i3 = this;
                        if (n2 == 0) break block4;
                        if (i3.n == null) break block5;
                        this.c = null;
                        this.c = this.b(this.n);
                        this.f = this.r.r();
                        i3 = this;
                    }
                    i3.l = false;
                    if (n2 != 0) break block5;
                }
                i2 = this;
            }
            i2.l = true;
        }
    }

    public void f() {
        this.c = null;
    }

    protected void a(l l2) {
        block11: {
            block16: {
                i i2;
                block17: {
                    int n2;
                    block15: {
                        l l3;
                        l l4;
                        block13: {
                            l l5;
                            block14: {
                                h h2;
                                block12: {
                                    block10: {
                                        n2 = net.minecraft.e.i.n();
                                        i i3 = this;
                                        if (n2 != 0) {
                                            if (i3.a - this.q > 100) {
                                                if (l2.f(this.g) < 2.25) {
                                                    this.f();
                                                }
                                                this.q = this.a;
                                                this.g = l2;
                                            }
                                            i3 = this;
                                        }
                                        h2 = i3.c;
                                        if (n2 == 0) break block10;
                                        if (h2 == null) break block11;
                                        h2 = this.c;
                                    }
                                    if (n2 == 0) break block12;
                                    if (h2.h()) break block11;
                                    h2 = this.c;
                                }
                                l4 = l5 = h2.i();
                                l3 = this.m;
                                if (n2 == 0) break block13;
                                if (!l4.equals(l3)) break block14;
                                this.d += System.currentTimeMillis() - this.k;
                                if (n2 != 0) break block15;
                            }
                            this.m = l5;
                            l4 = l2;
                            l3 = this.m;
                        }
                        double d10 = l4.d(l3);
                        this.i = this.j.aa() > 0.0f ? d10 / (double)this.j.aa() * 1000.0 : 0.0;
                    }
                    i2 = this;
                    if (n2 == 0) break block16;
                    if (!(i2.i > 0.0)) break block17;
                    i2 = this;
                    if (n2 == 0) break block16;
                    if ((double)i2.d > this.i * 3.0) {
                        this.m = net.minecraft.k.l.a;
                        this.d = 0L;
                        this.i = 0.0;
                        this.f();
                    }
                }
                i2 = this;
            }
            i2.k = System.currentTimeMillis();
        }
    }
}

