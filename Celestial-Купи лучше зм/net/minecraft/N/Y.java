/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.N.a;
import net.minecraft.N.j;
import net.minecraft.N.r;
import net.minecraft.N.x;
import net.minecraft.N.y;
import net.minecraft.Q.ag;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aj;
import net.minecraft.Z.i;
import net.minecraft.ah.A;
import net.minecraft.ao.b;
import net.minecraft.ap.k;
import net.minecraft.ar.X;
import net.minecraft.ar.aD;
import net.minecraft.ar.ae;
import net.minecraft.ar.v;
import net.minecraft.k.f;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Y
extends y {
    private /* synthetic */ float m;
    private /* synthetic */ String p;
    private /* synthetic */ boolean i;
    private /* synthetic */ net.minecraft.ar.h l;
    private /* synthetic */ String t;
    private /* synthetic */ long r;
    private /* synthetic */ boolean u;
    private /* synthetic */ n q;
    private /* synthetic */ n o;
    private /* synthetic */ String j;
    private /* synthetic */ ae s;
    private /* synthetic */ r n;
    private /* synthetic */ boolean k;
    private /* synthetic */ boolean v;

    public boolean d(boolean bl2) {
        boolean bl3;
        block13: {
            block12: {
                Object object;
                net.minecraft.ap.g g10;
                n n2;
                m[] arrm;
                block15: {
                    boolean bl4;
                    block16: {
                        block14: {
                            boolean bl5;
                            Y y2;
                            block11: {
                                arrm = net.minecraft.N.j.f();
                                y2 = this;
                                if (arrm != null) break block11;
                                if (y2.n != net.minecraft.N.r.LOAD) break block12;
                                y2 = this;
                            }
                            bl3 = y2.a.C;
                            if (arrm != null) break block13;
                            if (bl3) break block12;
                            bl3 = aD.a(this.t);
                            if (arrm != null) break block13;
                            if (bl3) break block12;
                            n n3 = this.j();
                            n2 = n3.b(this.q);
                            A a10 = (A)this.a;
                            net.minecraft.R.b b10 = this.a.H();
                            net.minecraft.ap.j j2 = a10.s();
                            net.minecraft.ap.g g11 = g10 = j2.b(b10, new v(this.t));
                            if (arrm == null) {
                                if (g11 == null) {
                                    return false;
                                }
                                g11 = g10;
                            }
                            if (arrm == null) {
                                if (!aD.a(g11.a())) {
                                    this.j = g10.a();
                                }
                                g11 = g10;
                            }
                            n n4 = g11.b();
                            bl4 = bl5 = this.o.equals(n4);
                            if (arrm == null) {
                                if (!bl4) {
                                    this.o = n4;
                                    this.b();
                                    object = this.a.d(n3);
                                    this.a.a(n3, (i)object, (i)object, 3);
                                }
                                bl4 = bl2;
                            }
                            if (arrm != null) break block14;
                            if (!bl4) break block15;
                            bl4 = bl5;
                        }
                        if (arrm != null) break block16;
                        if (bl4) break block15;
                        bl4 = false;
                    }
                    return bl4;
                }
                object = new k().a(this.l).a(this.s).b(this.i).a((f)null).a((K)null).a(false);
                float f10 = this.m - 1.0f;
                float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (arrm == null) {
                    if (f11 < 0) {
                        ((k)object).a(h.c(this.m, 0.0f, 1.0f)).a((Long)this.r);
                    }
                    g10.a(this.a, n2, (k)object);
                    f11 = 1.0f;
                }
                return (boolean)f11;
            }
            bl3 = false;
        }
        return bl3;
    }

    public void b(n n2) {
        this.o = n2;
    }

    private List<Y> a(List<Y> list) {
        Iterable iterable = Iterables.filter(list, (Predicate)new x(this));
        return Lists.newArrayList((Iterable)iterable);
    }

    public n d() {
        return this.q;
    }

    public boolean v() {
        return this.k;
    }

    private void m() {
        block2: {
            n n2;
            i i2;
            Y y2;
            block1: {
                m[] arrm = net.minecraft.N.j.f();
                y2 = this;
                if (arrm != null) break block1;
                if (y2.a == null) break block2;
                y2 = this;
            }
            if ((i2 = this.a.d(n2 = y2.j())).b() == g.bD) {
                this.a.a(n2, i2.a(aj.z, this.n), 2);
            }
        }
    }

    public String f() {
        return this.t;
    }

    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(this.d.e());
        byteBuf.writeInt(this.d.b());
        byteBuf.writeInt(this.d.a());
    }

    public n k() {
        return this.o;
    }

    public void u() {
        A a10 = (A)this.a;
        net.minecraft.ap.j j2 = a10.s();
        j2.b(new v(this.t));
    }

    static String b(Y y2) {
        return y2.t;
    }

    public net.minecraft.ar.h s() {
        return this.l;
    }

    public long n() {
        return this.r;
    }

    public void c(n n2) {
        this.q = n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void r() {
        var1_1 = net.minecraft.N.j.f();
        if (var1_1 != null) ** GOTO lbl6
        switch (net.minecraft.N.a.a[this.o().ordinal()]) {
            case 1: {
                this.a(net.minecraft.N.r.LOAD);
lbl6:
                // 2 sources

                if (var1_1 == null) return;
            }
            case 2: {
                this.a(net.minecraft.N.r.CORNER);
                if (var1_1 == null) return;
            }
            case 3: {
                this.a(net.minecraft.N.r.DATA);
                if (var1_1 == null) return;
            }
            case 4: {
                this.a(net.minecraft.N.r.SAVE);
                return;
            }
        }
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        block0: {
            super.a(r2);
            r2.a("name", this.t);
            r2.a("author", this.j);
            r2.a("metadata", this.p);
            r2.b("posX", this.q.e());
            r2.b("posY", this.q.b());
            r2.b("posZ", this.q.a());
            m[] arrm = net.minecraft.N.j.f();
            r2.b("sizeX", this.o.e());
            r2.b("sizeY", this.o.b());
            r2.b("sizeZ", this.o.a());
            r2.a("rotation", this.s.toString());
            r2.a("mirror", this.l.toString());
            r2.a("mode", this.n.toString());
            r2.a("ignoreEntities", this.i);
            r2.a("powered", this.u);
            r2.a("showair", this.v);
            r2.a("showboundingbox", this.k);
            r2.a("integrity", this.m);
            r2.a("seed", this.r);
            m[] arrm2 = arrm;
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.N.j.b(new m[3]);
        }
        return r2;
    }

    private List<Y> a(n n2, n n3) {
        ArrayList arrayList = Lists.newArrayList();
        m[] arrm = net.minecraft.N.j.f();
        for (o o2 : net.minecraft.k.n.a(n2, n3)) {
            block5: {
                y y2;
                y y3;
                block6: {
                    i i2 = this.a.d(o2);
                    if (i2.b() != g.bD) break block5;
                    y2 = y3 = this.a.b(o2);
                    if (arrm != null) break block6;
                    if (y2 == null) break block5;
                    y2 = y3;
                }
                boolean bl2 = y2 instanceof Y;
                if (arrm == null && bl2) {
                    bl2 = arrayList.add((Y)y3);
                }
            }
            if (arrm == null) continue;
        }
        return arrayList;
    }

    public String h() {
        return this.p;
    }

    public float c() {
        return this.m;
    }

    public boolean a(net.minecraft.i.j j2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = j2.b();
        if (arrm == null) {
            if (!bl2) {
                return false;
            }
            bl2 = j2.b().C;
        }
        if (arrm == null) {
            if (bl2) {
                j2.a(this);
            }
            bl2 = true;
        }
        return bl2;
    }

    public boolean l() {
        return this.v;
    }

    @Override
    public net.minecraft.P.r r() {
        return this.a(new net.minecraft.P.r());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean q() {
        m[] arrm = net.minecraft.N.j.f();
        Y y2 = this;
        if (arrm == null) {
            if (y2.n != net.minecraft.N.r.LOAD) return false;
            y2 = this;
        }
        boolean bl2 = y2.a.C;
        if (arrm != null) return bl2;
        if (bl2) return false;
        A a10 = (A)this.a;
        net.minecraft.R.b b10 = this.a.H();
        net.minecraft.ap.j j2 = a10.s();
        if (j2.b(b10, new v(this.t)) == null) return false;
        return true;
    }

    public Y() {
        this.t = "";
        this.j = "";
        this.p = "";
        this.q = new n(0, 1, 0);
        this.o = net.minecraft.k.n.o;
        this.l = net.minecraft.ar.h.NONE;
        this.s = ae.NONE;
        this.n = net.minecraft.N.r.DATA;
        this.i = true;
        this.k = true;
        this.m = 1.0f;
    }

    public void b(net.minecraft.ar.h h2) {
        this.l = h2;
    }

    public void f(boolean bl2) {
        this.v = bl2;
    }

    public boolean g() {
        return this.u;
    }

    public void b(String string) {
        block2: {
            String string2 = string;
            char[] arrc = X.a;
            int n2 = arrc.length;
            m[] arrm = net.minecraft.N.j.f();
            for (int i2 = 0; i2 < n2; ++i2) {
                char c10 = arrc[i2];
                string2 = string2.replace(c10, '_');
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block2;
            }
            this.t = string2;
        }
    }

    public void a(r r2) {
        block0: {
            this.n = r2;
            i i2 = this.a.d(this.j());
            if (i2.b() != g.bD) break block0;
            this.a.a(this.j(), i2.a(aj.z, r2), 2);
        }
    }

    @Override
    public void c(net.minecraft.P.r r2) {
        block10: {
            block8: {
                Y y2;
                block9: {
                    super.c(r2);
                    m[] arrm = net.minecraft.N.j.f();
                    this.b(r2.j("name"));
                    this.j = r2.j("author");
                    this.p = r2.j("metadata");
                    int n2 = h.c(r2.m("posX"), -32, 32);
                    int n3 = h.c(r2.m("posY"), -32, 32);
                    int n4 = h.c(r2.m("posZ"), -32, 32);
                    this.q = new n(n2, n3, n4);
                    int n5 = h.c(r2.m("sizeX"), 0, 32);
                    int n6 = h.c(r2.m("sizeY"), 0, 32);
                    m[] arrm2 = arrm;
                    int n7 = h.c(r2.m("sizeZ"), 0, 32);
                    this.o = new n(n5, n6, n7);
                    try {
                        this.s = ae.valueOf(r2.j("rotation"));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        this.s = ae.NONE;
                    }
                    try {
                        this.l = net.minecraft.ar.h.valueOf(r2.j("mirror"));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        this.l = net.minecraft.ar.h.NONE;
                    }
                    try {
                        this.n = net.minecraft.N.r.valueOf(r2.j("mode"));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        this.n = net.minecraft.N.r.DATA;
                    }
                    this.i = r2.f("ignoreEntities");
                    this.u = r2.f("powered");
                    this.v = r2.f("showair");
                    y2 = this;
                    if (arrm2 != null) break block8;
                    y2.k = r2.f("showboundingbox");
                    if (!r2.b("integrity")) break block9;
                    this.m = r2.d("integrity");
                    if (arrm2 == null) break block10;
                }
                y2 = this;
            }
            y2.m = 1.0f;
        }
        this.r = r2.o("seed");
        this.m();
    }

    public void b(boolean bl2) {
        this.u = bl2;
    }

    public boolean b() {
        return this.i;
    }

    public boolean p() {
        return this.c(true);
    }

    public void a(float f10) {
        this.m = f10;
    }

    public void a(B b10) {
        block0: {
            if (aD.a(b10.g())) break block0;
            this.j = b10.g();
        }
    }

    static r a(Y y2) {
        return y2.n;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(boolean bl2) {
        m[] arrm = net.minecraft.N.j.f();
        Y y2 = this;
        if (arrm == null) {
            if (y2.n != net.minecraft.N.r.SAVE) return false;
            y2 = this;
        }
        boolean bl3 = y2.a.C;
        if (arrm != null) return bl3;
        if (bl3) return false;
        bl3 = aD.a(this.t);
        if (arrm != null) return bl3;
        if (bl3) return false;
        n n2 = this.j().b(this.q);
        A a10 = (A)this.a;
        net.minecraft.R.b b10 = this.a.H();
        net.minecraft.ap.j j2 = a10.s();
        net.minecraft.ap.g g10 = j2.a(b10, new v(this.t));
        boolean bl4 = this.i;
        if (arrm == null) {
            bl4 = !bl4;
        }
        g10.a(this.a, n2, this.o, bl4, g.Y);
        g10.a(this.j);
        boolean bl5 = bl2;
        if (arrm != null) return bl5;
        if (!bl5) return true;
        bl5 = j2.c(b10, new v(this.t));
        if (arrm != null) return bl5;
        if (!bl5) return false;
        return true;
    }

    public boolean j() {
        return this.d(true);
    }

    public void e(boolean bl2) {
        this.k = bl2;
    }

    public r o() {
        return this.n;
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 7, this.r());
    }

    public ae e() {
        return this.s;
    }

    private b a(n n2, List<Y> list) {
        b b10;
        m[] arrm;
        block18: {
            block17: {
                Object object;
                block16: {
                    arrm = net.minecraft.N.j.f();
                    object = list;
                    if (arrm != null) break block16;
                    if (object.size() <= 1) break block17;
                    object = list.get(0);
                }
                n n3 = ((Y)object).j();
                b10 = new b(n3, n3);
                if (arrm == null) break block18;
            }
            b10 = new b(n2, n2);
        }
        for (Y y2 : list) {
            block29: {
                int n4;
                int n5;
                n n6;
                block27: {
                    block28: {
                        block26: {
                            block25: {
                                block23: {
                                    block24: {
                                        block22: {
                                            block21: {
                                                block19: {
                                                    block20: {
                                                        n6 = y2.j();
                                                        n5 = n6.e();
                                                        n4 = b10.c;
                                                        if (arrm != null) break block19;
                                                        if (n5 >= n4) break block20;
                                                        b10.c = n6.e();
                                                        if (arrm == null) break block21;
                                                    }
                                                    n5 = n6.e();
                                                    n4 = b10.a;
                                                }
                                                if (arrm != null) break block22;
                                                if (n5 > n4) {
                                                    b10.a = n6.e();
                                                }
                                            }
                                            n5 = n6.b();
                                            n4 = b10.e;
                                        }
                                        if (arrm != null) break block23;
                                        if (n5 >= n4) break block24;
                                        b10.e = n6.b();
                                        if (arrm == null) break block25;
                                    }
                                    n5 = n6.b();
                                    n4 = b10.b;
                                }
                                if (arrm != null) break block26;
                                if (n5 > n4) {
                                    b10.b = n6.b();
                                }
                            }
                            n5 = n6.a();
                            n4 = b10.f;
                        }
                        if (arrm != null) break block27;
                        if (n5 >= n4) break block28;
                        b10.f = n6.a();
                        if (arrm == null) break block29;
                    }
                    n5 = n6.a();
                    n4 = b10.d;
                }
                if (n5 > n4) {
                    b10.d = n6.a();
                }
            }
            if (arrm == null) continue;
        }
        return b10;
    }

    @Override
    @Nullable
    public net.minecraft.at.k d() {
        return new net.minecraft.at.h("structure_block.hover." + net.minecraft.N.r.a(this.n), this.n == net.minecraft.N.r.DATA ? this.p : this.t);
    }

    public void a(long l2) {
        this.r = l2;
    }

    public void b(ae ae2) {
        this.s = ae2;
    }

    public void a(boolean bl2) {
        this.i = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i() {
        m[] arrm = net.minecraft.N.j.f();
        Y y2 = this;
        if (arrm == null) {
            if (y2.n != net.minecraft.N.r.SAVE) {
                return false;
            }
            y2 = this;
        }
        n n2 = y2.j();
        int n3 = 80;
        n n4 = new n(n2.e() - 80, 0, n2.a() - 80);
        n n5 = new n(n2.e() + 80, 255, n2.a() + 80);
        List<Y> list = this.a(n4, n5);
        List<Y> list2 = this.a(list);
        boolean bl2 = list2.size();
        if (arrm != null) return bl2;
        if (bl2 < true) {
            return false;
        }
        b b10 = this.a(n2, list2);
        int n6 = b10.a - b10.c;
        if (arrm != null) return n6 != 0;
        if (n6 <= 1) return 0 != 0;
        n6 = b10.b - b10.e;
        if (arrm != null) return n6 != 0;
        if (n6 <= 1) return 0 != 0;
        n6 = b10.d - b10.f;
        if (arrm != null) return n6 != 0;
        if (n6 <= 1) return 0 != 0;
        this.q = new n(b10.c - n2.e() + 1, b10.e - n2.b() + 1, b10.f - n2.a() + 1);
        this.o = new n(b10.a - b10.c - 1, b10.b - b10.e - 1, b10.d - b10.f - 1);
        this.b();
        i i2 = this.a.d(n2);
        this.a.a(n2, i2, i2, 3);
        return true;
    }

    public void a(String string) {
        this.p = string;
    }
}

