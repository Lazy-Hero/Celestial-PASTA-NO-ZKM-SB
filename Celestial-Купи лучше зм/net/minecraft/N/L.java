/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.B.V;
import net.minecraft.B.W;
import net.minecraft.B.p;
import net.minecraft.N.J;
import net.minecraft.N.j;
import net.minecraft.P.r;
import net.minecraft.W.aq;
import net.minecraft.Z.i;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.i.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L
extends J
implements net.minecraft.B.k,
ao {
    private /* synthetic */ int l;
    private /* synthetic */ a2<d> n;
    private /* synthetic */ String q;
    private static final /* synthetic */ int[] o;
    private static final /* synthetic */ int[] m;
    private /* synthetic */ k r;
    private static final /* synthetic */ int[] p;
    private /* synthetic */ int j;
    private /* synthetic */ boolean[] k;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        L l2 = this;
        if (arrm == null) {
            if (!l2.g()) return "container.brewing";
            l2 = this;
        }
        String string = l2.q;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d a(int n2) {
        d d10;
        block5: {
            int n3;
            block4: {
                m[] arrm = net.minecraft.N.j.f();
                n3 = n2;
                if (arrm != null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.n.size()) {
                d10 = this.n.get(n2);
                return d10;
            }
        }
        d10 = net.minecraft.w.d.m;
        return d10;
    }

    @Override
    public d a(int n2, int n3) {
        return W.a(this.n, n2, n3);
    }

    @Override
    public int c(int n2) {
        m[] arrm = net.minecraft.N.j.f();
        int n3 = n2;
        if (arrm == null) {
            switch (n3) {
                case 0: {
                    return this.j;
                }
                case 1: {
                    return this.l;
                }
            }
            n3 = 0;
        }
        return n3;
    }

    @Override
    public net.minecraft.B.n a(h h2, net.minecraft.i.j j2) {
        return new p(h2, this);
    }

    @Override
    public int e() {
        return this.n.size();
    }

    @Override
    public void a(int n2, d d10) {
        block2: {
            int n3;
            block1: {
                m[] arrm = net.minecraft.N.j.f();
                n3 = n2;
                if (arrm != null) break block1;
                if (n3 < 0) break block2;
                n3 = n2;
            }
            if (n3 < this.n.size()) {
                this.n.set(n2, d10);
            }
        }
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public int[] a(aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        aA aA3 = aA2;
        aA aA4 = aA.UP;
        if (arrm == null) {
            if (aA3 == aA4) {
                return o;
            }
            aA3 = aA2;
            aA4 = aA.DOWN;
        }
        return aA3 == aA4 ? p : m;
    }

    @Override
    public String a() {
        return "minecraft:brewing_stand";
    }

    @Override
    public void c() {
        block18: {
            int n2;
            boolean[] arrbl;
            m[] arrm;
            block32: {
                L l2;
                block31: {
                    int n3;
                    block30: {
                        block29: {
                            d d10;
                            block22: {
                                int n4;
                                block23: {
                                    block26: {
                                        L l3;
                                        block28: {
                                            block27: {
                                                int n5;
                                                block24: {
                                                    block25: {
                                                        int n6;
                                                        int n7;
                                                        block19: {
                                                            block20: {
                                                                d d11;
                                                                block21: {
                                                                    d d12 = this.n.get(4);
                                                                    arrm = net.minecraft.N.j.f();
                                                                    n7 = this.l;
                                                                    if (arrm != null) break block19;
                                                                    if (n7 > 0) break block20;
                                                                    d11 = d12;
                                                                    if (arrm != null) break block21;
                                                                    if (d11.w() != net.minecraft.u.h.cC) break block20;
                                                                    this.l = 20;
                                                                    d11 = d12;
                                                                }
                                                                d11.b(1);
                                                                this.b();
                                                            }
                                                            n7 = this.i() ? 1 : 0;
                                                        }
                                                        n4 = n7;
                                                        int n8 = this.j;
                                                        if (arrm == null) {
                                                            n8 = n8 > 0 ? 1 : 0;
                                                        }
                                                        int n9 = n8;
                                                        d10 = this.n.get(3);
                                                        n3 = n9;
                                                        if (arrm != null) break block22;
                                                        if (n3 == 0) break block23;
                                                        int n10 = --this.j;
                                                        if (arrm == null) {
                                                            n10 = n10 == 0 ? 1 : 0;
                                                        }
                                                        n5 = n6 = n10;
                                                        if (arrm != null) break block24;
                                                        if (n5 == 0) break block25;
                                                        n5 = n4;
                                                        if (arrm != null) break block24;
                                                        if (n5 == 0) break block25;
                                                        this.j();
                                                        this.b();
                                                        if (arrm == null) break block26;
                                                    }
                                                    n5 = n4;
                                                }
                                                if (n5 != 0) break block27;
                                                this.j = 0;
                                                this.b();
                                                if (arrm == null) break block26;
                                            }
                                            l3 = this;
                                            if (arrm != null) break block28;
                                            if (l3.r == d10.w()) break block26;
                                            this.j = 0;
                                            l3 = this;
                                        }
                                        l3.b();
                                    }
                                    if (arrm == null) break block29;
                                }
                                n3 = n4;
                            }
                            if (arrm != null) break block30;
                            if (n3 == 0) break block29;
                            n3 = this.l--;
                            if (arrm != null) break block30;
                            if (n3 > 0) {
                                this.j = 400;
                                this.r = d10.w();
                                this.b();
                            }
                        }
                        l2 = this;
                        if (arrm != null) break block31;
                        n3 = l2.a.C ? 1 : 0;
                    }
                    if (n3 != 0) break block18;
                    l2 = this;
                }
                arrbl = l2.a();
                if (arrm != null) break block32;
                if (Arrays.equals(arrbl, this.k)) break block18;
                this.k = arrbl;
            }
            i i2 = this.a.d(this.j());
            int n11 = i2.b() instanceof aq;
            if (arrm == null) {
                if (n11 == 0) {
                    return;
                }
                n11 = n2 = 0;
            }
            while (n2 < aq.z.length) {
                i2 = i2.a(aq.z[n2], arrbl[n2]);
                ++n2;
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block18;
            }
            this.a.a(this.d, i2, 2);
        }
    }

    @Override
    public void d(net.minecraft.i.j j2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.q;
        if (arrm == null) {
            if (string == null) return false;
            string = this.q;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
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
                this.j = var2_2;
lbl6:
                // 2 sources

                if (var3_3 == null) return;
            }
            case 1: {
                this.l = var2_2;
                return;
            }
        }
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new net.minecraft.x.d(L.class, "Items"));
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.n.iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (arrm != null) break block3;
                        if (arrm != null) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrm == null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void c(net.minecraft.i.j j2) {
    }

    public boolean[] a() {
        boolean[] arrbl = new boolean[3];
        m[] arrm = net.minecraft.N.j.f();
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.n.get(i2).G()) continue;
            arrbl[i2] = true;
            if (arrm == null) continue;
        }
        return arrbl;
    }

    @Override
    public boolean b(int n2, d d10, aA aA2) {
        return this.b(n2, d10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, d d10) {
        m[] arrm;
        block6: {
            k k2;
            k k3;
            block8: {
                k k4;
                block7: {
                    block5: {
                        arrm = net.minecraft.N.j.f();
                        int n3 = n2;
                        if (arrm != null) return n3 != 0;
                        if (n3 == 3) {
                            n3 = net.minecraft.K.g.c(d10) ? 1 : 0;
                            return n3 != 0;
                        }
                        k4 = d10.w();
                        if (n2 == 4) {
                            if (k4 != net.minecraft.u.h.cC) return false;
                            return true;
                        }
                        k3 = k4;
                        k2 = net.minecraft.u.h.V;
                        if (arrm != null) break block5;
                        if (k3 == k2) break block6;
                        k3 = k4;
                        k2 = net.minecraft.u.h.b3;
                    }
                    if (arrm != null) break block7;
                    if (k3 == k2) break block6;
                    k3 = k4;
                    k2 = net.minecraft.u.h.W;
                }
                if (arrm != null) break block8;
                if (k3 == k2) break block6;
                k3 = k4;
                k2 = net.minecraft.u.h.ch;
            }
            if (k3 != k2) return false;
        }
        boolean bl2 = this.a(n2).G();
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void d() {
        this.n.clear();
    }

    public L() {
        this.n = a2.a(5, net.minecraft.w.d.m);
    }

    @Override
    public boolean a(int n2, d d10, aA aA2) {
        m[] arrm = net.minecraft.N.j.f();
        int n3 = n2;
        if (arrm == null) {
            if (n3 == 3) {
                return d10.w() == net.minecraft.u.h.ch;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    @Override
    public d b(int n2) {
        return W.a(this.n, n2);
    }

    public void a(String string) {
        this.q = string;
    }

    private boolean i() {
        boolean bl2;
        block8: {
            int n2;
            d d10 = this.n.get(3);
            m[] arrm = net.minecraft.N.j.f();
            int n3 = d10.G();
            if (arrm == null) {
                if (n3 != 0) {
                    return false;
                }
                n3 = net.minecraft.K.g.c(d10);
            }
            if (arrm == null) {
                if (n3 == 0) {
                    return false;
                }
                n3 = n2 = 0;
            }
            while (n2 < 3) {
                block9: {
                    block10: {
                        boolean bl3;
                        block11: {
                            d d11 = this.n.get(n2);
                            if (arrm != null) break block9;
                            bl2 = d11.G();
                            if (arrm != null) break block8;
                            if (bl2) break block10;
                            bl3 = net.minecraft.K.g.d(d11, d10);
                            if (arrm != null) break block11;
                            if (!bl3) break block10;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.c(r2);
        this.n = a2.a(this.e(), net.minecraft.w.d.m);
        m[] arrm2 = arrm;
        W.a(r2, this.n);
        this.j = r2.q("BrewTime");
        if (arrm2 == null) {
            if (r2.a("CustomName", 8)) {
                this.q = r2.j("CustomName");
            }
            this.l = r2.r("Fuel");
        }
    }

    @Override
    public r a(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.a(r2);
        r2.a("BrewTime", (short)this.j);
        m[] arrm2 = arrm;
        W.b(r2, this.n);
        if (arrm2 == null) {
            if (this.g()) {
                r2.a("CustomName", this.q);
            }
            r2.a("Fuel", (byte)this.l);
        }
        return r2;
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

    private void j() {
        n n2;
        block7: {
            Object object;
            d d10;
            block8: {
                d d11;
                block10: {
                    m[] arrm;
                    block9: {
                        block6: {
                            d10 = this.n.get(3);
                            arrm = net.minecraft.N.j.f();
                            for (int i2 = 0; i2 < 3; ++i2) {
                                this.n.set(i2, net.minecraft.K.g.a(d10, this.n.get(i2)));
                                if (arrm == null) {
                                    if (arrm == null) continue;
                                }
                                break block6;
                            }
                            d10.b(1);
                        }
                        n2 = this.j();
                        object = d10.w();
                        if (arrm != null) break block7;
                        if (!((k)object).t()) break block8;
                        d11 = new d(d10.w().s());
                        d d12 = d10;
                        if (arrm != null) break block9;
                        if (!d12.G()) break block10;
                        d12 = d10 = d11;
                    }
                    if (arrm == null) break block8;
                }
                V.a(this.a, (double)n2.e(), (double)n2.b(), (double)n2.a(), d11);
            }
            object = this.n.set(3, d10);
        }
        this.a.b(1035, n2, 0);
    }

    static {
        o = new int[]{3};
        p = new int[]{0, 1, 2, 3};
        m = new int[]{0, 1, 2, 4};
    }
}

