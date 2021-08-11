/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.K.b;
import net.minecraft.N.J;
import net.minecraft.N.j;
import net.minecraft.N.u;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.W.X;
import net.minecraft.W.bg;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.i.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.c;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K
extends J
implements ao,
net.minecraft.B.k {
    @Nullable
    private /* synthetic */ b m;
    private /* synthetic */ String t;
    private static final /* synthetic */ Set<b> k;
    private /* synthetic */ boolean o;
    private /* synthetic */ d s;
    @Nullable
    private /* synthetic */ b j;
    private /* synthetic */ long n;
    private final /* synthetic */ List<u> q;
    private /* synthetic */ int l;
    public static final /* synthetic */ b[][] p;
    private /* synthetic */ float r;

    public void h() {
        block3: {
            K k2;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                k2 = this;
                if (arrm != null) break block2;
                if (k2.a == null) break block3;
                this.e();
                k2 = this;
            }
            k2.f();
        }
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        r2.b("Primary", b.a(this.j));
        r2.b("Secondary", b.a(this.m));
        r2.b("Levels", this.l);
        return r2;
    }

    @Override
    public String a() {
        return "minecraft:beacon";
    }

    @Override
    public int e() {
        return 1;
    }

    private void f() {
        block10: {
            b b10;
            List<net.minecraft.i.j> list;
            int n2;
            m[] arrm;
            block16: {
                K k2;
                block15: {
                    K k3;
                    block14: {
                        block13: {
                            int n3;
                            block12: {
                                block11: {
                                    arrm = net.minecraft.N.j.f();
                                    n3 = this.o;
                                    if (arrm != null) break block11;
                                    if (n3 == 0) break block10;
                                    n3 = this.l;
                                }
                                if (arrm != null) break block12;
                                if (n3 <= 0) break block10;
                                k3 = this;
                                if (arrm != null) break block13;
                                n3 = k3.a.C ? 1 : 0;
                            }
                            if (n3 != 0) break block10;
                            k3 = this;
                        }
                        if (arrm != null) break block14;
                        if (k3.j == null) break block10;
                        k3 = this;
                    }
                    double d10 = k3.l * 10 + 10;
                    int n4 = 0;
                    int n5 = this.l;
                    int n6 = 4;
                    if (arrm == null) {
                        if (n5 >= n6 && this.j == this.m) {
                            n4 = 1;
                        }
                        n5 = 9 + this.l * 2;
                        n6 = 20;
                    }
                    n2 = n5 * n6;
                    int n7 = this.d.e();
                    int n8 = this.d.b();
                    int n9 = this.d.a();
                    k k4 = new k(n7, n8, n9, n7 + 1, n8 + 1, n9 + 1).a(d10).d(0.0, this.a.i(), 0.0);
                    list = this.a.a(net.minecraft.i.j.class, k4);
                    for (net.minecraft.i.j j2 : list) {
                        j2.b(new net.minecraft.K.j(this.j, n2, n4, true, true));
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block10;
                    }
                    k2 = this;
                    if (arrm != null) break block15;
                    if (k2.l < 4) break block10;
                    k2 = this;
                }
                b10 = k2.j;
                if (arrm != null) break block16;
                if (b10 == this.m) break block10;
                b10 = this.m;
            }
            if (b10 != null) {
                for (net.minecraft.i.j j2 : list) {
                    j2.b(new net.minecraft.K.j(this.m, n2, 0, true, true));
                    if (arrm == null) continue;
                }
            }
        }
    }

    public int b() {
        return this.l;
    }

    public void a(String string) {
        this.t = string;
    }

    @Override
    public boolean f() {
        return this.s.G();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        K k2 = this;
        if (arrm == null) {
            if (!k2.g()) return "container.beacon";
            k2 = this;
        }
        String string = k2.t;
        return string;
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        if (this.a.b(this.d) != this) {
            return false;
        }
        double d10 = j2.a((double)this.d.e() + 0.5, (double)this.d.b() + 0.5, (double)this.d.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (arrm == null) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.t;
        if (arrm == null) {
            if (string == null) return false;
            string = this.t;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public double q() {
        return 65536.0;
    }

    @Override
    public net.minecraft.B.n a(h h2, net.minecraft.i.j j2) {
        return new net.minecraft.B.o(h2, this);
    }

    @Override
    public void d(net.minecraft.i.j j2) {
    }

    @Override
    public void c() {
        block3: {
            K k2;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                k2 = this;
                if (arrm != null) break block2;
                if (k2.a.r() % 80L != 0L) break block3;
                k2 = this;
            }
            k2.h();
        }
    }

    @Override
    public int c(int n2) {
        m[] arrm = net.minecraft.N.j.f();
        int n3 = n2;
        if (arrm == null) {
            switch (n3) {
                case 0: {
                    return this.l;
                }
                case 1: {
                    return b.a(this.j);
                }
                case 2: {
                    return b.a(this.m);
                }
            }
            n3 = 0;
        }
        return n3;
    }

    @Override
    public boolean a(int n2, d d10, aA aA2) {
        return false;
    }

    @Override
    public d b(int n2) {
        if (n2 == 0) {
            d d10 = this.s;
            this.s = net.minecraft.w.d.m;
            return d10;
        }
        return net.minecraft.w.d.m;
    }

    @Override
    public boolean b(int n2, d d10, aA aA2) {
        return false;
    }

    @Override
    public int c() {
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    private void e() {
        block46: {
            int n2;
            m[] arrm;
            int n3;
            int n4;
            int n5;
            block45: {
                int n6;
                block40: {
                    block27: {
                        block28: {
                            int n7;
                            n5 = this.d.e();
                            n4 = this.d.b();
                            n3 = this.d.a();
                            n6 = this.l;
                            m[] arrm2 = net.minecraft.N.j.f();
                            this.l = 0;
                            this.q.clear();
                            this.o = true;
                            u u2 = new u(bl.WHITE.f());
                            arrm = arrm2;
                            this.q.add(u2);
                            boolean bl2 = true;
                            o o2 = new o();
                            for (n7 = n4 + 1; n7 < 256; ++n7) {
                                block38: {
                                    boolean bl3;
                                    float[] bl5;
                                    block39: {
                                        block33: {
                                            i i2;
                                            block34: {
                                                i object;
                                                block35: {
                                                    block37: {
                                                        i i3;
                                                        block36: {
                                                            net.minecraft.W.K k2;
                                                            block31: {
                                                                block32: {
                                                                    object = this.a.d(o2.a(n5, n7, n3));
                                                                    if (arrm != null) break block27;
                                                                    k2 = object.b();
                                                                    if (arrm != null) break block31;
                                                                    if (k2 != g.a5) break block32;
                                                                    bl5 = object.b(X.A).f();
                                                                    if (arrm == null) break block33;
                                                                }
                                                                i2 = object;
                                                                if (arrm != null) break block34;
                                                                k2 = i2.b();
                                                            }
                                                            if (k2 == g.cv) break block35;
                                                            i3 = object;
                                                            if (arrm != null) break block36;
                                                            if (i3.j() < 15) break block37;
                                                            i3 = object;
                                                        }
                                                        if (i3.b() != g.g) {
                                                            this.o = false;
                                                            this.q.clear();
                                                            if (arrm == null) break;
                                                        }
                                                    }
                                                    u2.a();
                                                    if (arrm == null) continue;
                                                }
                                                i2 = object;
                                            }
                                            bl5 = i2.b(bg.F).f();
                                        }
                                        bl3 = bl2;
                                        if (arrm == null) {
                                            if (!bl3) {
                                                bl5 = new float[]{(u2.c()[0] + bl5[0]) / 2.0f, (u2.c()[1] + bl5[1]) / 2.0f, (u2.c()[2] + bl5[2]) / 2.0f};
                                            }
                                            bl3 = Arrays.equals(bl5, u2.c());
                                        }
                                        if (arrm != null) break block38;
                                        if (!bl3) break block39;
                                        u2.a();
                                        if (arrm == null) break block38;
                                    }
                                    u2 = new u(bl5);
                                    bl3 = this.q.add(u2);
                                }
                                bl2 = false;
                                if (arrm == null) continue;
                            }
                            n2 = this.o;
                            if (arrm != null) break block40;
                            if (n2 == 0) break block27;
                            n7 = 1;
                            while (n7 <= 4) {
                                void v7;
                                block29: {
                                    boolean bl4;
                                    int n8;
                                    n2 = n8 = n4 - n7;
                                    if (arrm != null) break block28;
                                    if (arrm == null) {
                                        if (n2 < 0 && arrm == null) break;
                                        bl4 = true;
                                    }
                                    boolean bl5 = bl4;
                                    int n9 = n5 - n7;
                                    while (n9 <= n5 + n7) {
                                        block30: {
                                            v7 = bl5;
                                            if (arrm != null || arrm != null) break block29;
                                            if (v7 == false) break;
                                            int n10 = n3 - n7;
                                            while (n10 <= n3 + n7) {
                                                block41: {
                                                    block42: {
                                                        net.minecraft.W.K k3;
                                                        net.minecraft.W.K k4;
                                                        block44: {
                                                            net.minecraft.W.K k5;
                                                            block43: {
                                                                k5 = this.a.d(new n(n9, n8, n10)).b();
                                                                if (arrm != null) break block30;
                                                                if (arrm != null) break block41;
                                                                if (k5 == g.cs) break block42;
                                                                net.minecraft.W.K k3 = k5;
                                                                k3 = g.a7;
                                                                if (arrm != null) break block43;
                                                                if (k4 == k3) break block42;
                                                                net.minecraft.W.K k3 = k5;
                                                                k3 = g.bF;
                                                            }
                                                            if (arrm != null) break block44;
                                                            if (k4 == k3) break block42;
                                                            net.minecraft.W.K k3 = k5;
                                                            k3 = g.E;
                                                        }
                                                        if (k4 != k3) {
                                                            bl5 = false;
                                                            if (arrm == null) break;
                                                        }
                                                    }
                                                    ++n10;
                                                }
                                                if (arrm == null) continue;
                                            }
                                            ++n9;
                                        }
                                        if (arrm == null) continue;
                                    }
                                    v7 = bl5;
                                }
                                if (v7 == false && arrm == null) break;
                                this.l = n7++;
                                if (arrm == null) continue;
                            }
                            n2 = this.l;
                        }
                        if (arrm != null) break block40;
                        if (n2 == 0) {
                            this.o = false;
                        }
                    }
                    n2 = this.a.C;
                }
                if (arrm != null) break block45;
                if (n2 != 0) break block46;
                n2 = n6;
            }
            if (n2 < this.l) {
                for (net.minecraft.i.k k6 : this.a.a(net.minecraft.i.k.class, new k(n5, n4, n3, n5, n4 - 4, n3).a(10.0, 5.0, 10.0))) {
                    a6.y.a(k6, this);
                    if (arrm == null) continue;
                }
            }
        }
    }

    @Override
    public int[] a(aA aA2) {
        return new int[0];
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    public List<u> a() {
        return this.q;
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            if (bl2) {
                this.h();
                return true;
            }
            bl2 = super.a(n2, n3);
        }
        return bl2;
    }

    @Nullable
    private static b a(int n2) {
        b b10 = b.a(n2);
        return k.contains(b10) ? b10 : null;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.j = K.a(r2.m("Primary"));
        this.m = K.a(r2.m("Secondary"));
        this.l = r2.m("Levels");
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 3, this.r());
    }

    @Override
    public d a(int n2, int n3) {
        d d10;
        block6: {
            block5: {
                int n4;
                block4: {
                    m[] arrm = net.minecraft.N.j.f();
                    n4 = n2;
                    if (arrm != null) break block4;
                    if (n4 != 0) break block5;
                    d10 = this.s;
                    if (arrm != null) break block6;
                    n4 = d10.G() ? 1 : 0;
                }
                if (n4 == 0) {
                    if (n3 >= this.s.t()) {
                        d d11 = this.s;
                        this.s = net.minecraft.w.d.m;
                        return d11;
                    }
                    return this.s.d(n3);
                }
            }
            d10 = net.minecraft.w.d.m;
        }
        return d10;
    }

    static {
        p = new b[][]{{net.minecraft.u.c.l, net.minecraft.u.c.u}, {net.minecraft.u.c.b, net.minecraft.u.c.n}, {net.minecraft.u.c.e}, {net.minecraft.u.c.t}};
        k = Sets.newHashSet();
        for (b[] arrb : p) {
            Collections.addAll(k, arrb);
        }
    }

    @Override
    public void c(net.minecraft.i.j j2) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(int var1_1, int var2_2) {
        var3_3 = net.minecraft.N.j.f();
        if (var3_3 != null) ** GOTO lbl6
        switch (var1_1) {
            case 0: {
                this.l = var2_2;
lbl6:
                // 2 sources

                if (var3_3 == null) return;
            }
            case 1: {
                this.j = K.a(var2_2);
                if (var3_3 == null) return;
            }
            case 2: {
                this.m = K.a(var2_2);
                return;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, d d10) {
        m[] arrm = net.minecraft.N.j.f();
        net.minecraft.w.k k2 = d10.w();
        net.minecraft.w.k k3 = net.minecraft.u.h.aO;
        if (arrm == null) {
            if (k2 == k3) return true;
            k2 = d10.w();
            k3 = net.minecraft.u.h.ag;
        }
        if (arrm == null) {
            if (k2 == k3) return true;
            k2 = d10.w();
            k3 = net.minecraft.u.h.I;
        }
        if (arrm == null) {
            if (k2 == k3) return true;
            k2 = d10.w();
            k3 = net.minecraft.u.h.ad;
        }
        if (k2 != k3) return false;
        return true;
    }

    @Override
    public d a(int n2) {
        return n2 == 0 ? this.s : net.minecraft.w.d.m;
    }

    public K() {
        this.q = Lists.newArrayList();
        this.l = -1;
        this.s = net.minecraft.w.d.m;
    }

    public float g() {
        float f10;
        block9: {
            int n2;
            block7: {
                m[] arrm;
                block8: {
                    arrm = net.minecraft.N.j.f();
                    int n3 = this.o;
                    if (arrm == null) {
                        if (n3 == 0) {
                            return 0.0f;
                        }
                        n3 = (int)(this.a.r() - this.n);
                    }
                    int n4 = n3;
                    this.n = this.a.r();
                    n2 = n4;
                    if (arrm != null) break block7;
                    if (n2 <= 1) break block8;
                    this.r -= (float)n4 / 40.0f;
                    float f11 = this.r - 0.0f;
                    n2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (arrm != null) break block7;
                    if (n2 < 0) {
                        this.r = 0.0f;
                    }
                }
                this.r += 0.025f;
                f10 = this.r;
                if (arrm != null) break block9;
                float f12 = f10 - 1.0f;
                n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            }
            if (n2 > 0) {
                this.r = 1.0f;
            }
            f10 = this.r;
        }
        return f10;
    }

    @Override
    public void a(int n2, d d10) {
        block0: {
            if (n2 != 0) break block0;
            this.s = d10;
        }
    }

    @Override
    public void d() {
        this.s = net.minecraft.w.d.m;
    }
}

