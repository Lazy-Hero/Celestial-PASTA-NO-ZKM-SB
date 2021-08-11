/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import java.util.Iterator;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.U.e;
import net.minecraft.ar.a2;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.w.d;
import net.minecraft.y.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class C
implements a {
    private /* synthetic */ b d;
    private final /* synthetic */ e e;
    private final /* synthetic */ a2<d> c;
    private /* synthetic */ int b;
    private final /* synthetic */ j a;

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new h(this.g(), new Object[0]);
    }

    @Override
    public int c() {
        return 64;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2) {
        int n3 = n.b();
        int n4 = n2;
        if (n3 == 0) return n4 != 0;
        if (n4 == 0) return 1 != 0;
        n4 = n2;
        if (n3 == 0) return n4 != 0;
        if (n4 != 1) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public void d() {
        this.c.clear();
    }

    @Override
    public void b() {
        this.a();
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.c.iterator();
            int n2 = n.c();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (n2 != 0) break block3;
                        if (n2 != 0) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (n2 == 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }

    @Override
    public void d(j j2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public C(j j2, e e10) {
        this.c = a2.a(3, net.minecraft.w.d.m);
        this.a = j2;
        this.e = e10;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    public void a() {
        block6: {
            block8: {
                block12: {
                    int n2;
                    block13: {
                        block14: {
                            boolean bl2;
                            b b10;
                            net.minecraft.y.a a10;
                            d d10;
                            d d11;
                            block11: {
                                block10: {
                                    b b11;
                                    block9: {
                                        net.minecraft.y.a a11;
                                        block7: {
                                            block5: {
                                                this.d = null;
                                                d11 = this.c.get(0);
                                                d10 = this.c.get(1);
                                                n2 = n.b();
                                                boolean bl3 = d11.G();
                                                if (n2 != 0) {
                                                    if (bl3) {
                                                        d11 = d10;
                                                        d10 = net.minecraft.w.d.m;
                                                    }
                                                    bl3 = d11.G();
                                                }
                                                if (!bl3) break block5;
                                                this.a(2, net.minecraft.w.d.m);
                                                if (n2 != 0) break block6;
                                            }
                                            a11 = a10 = this.e.a(this.a);
                                            if (n2 == 0) break block7;
                                            if (a11 == null) break block8;
                                            a11 = a10;
                                        }
                                        b11 = b10 = a11.a(d11, d10, this.b);
                                        if (n2 == 0) break block9;
                                        if (b11 == null) break block10;
                                        b11 = b10;
                                    }
                                    bl2 = b11.j();
                                    if (n2 == 0) break block11;
                                    if (bl2) break block10;
                                    this.d = b10;
                                    this.a(2, b10.l().C());
                                    if (n2 != 0) break block8;
                                }
                                bl2 = d10.G();
                            }
                            if (bl2) break block12;
                            b10 = a10.a(d10, d11, this.b);
                            if (n2 == 0) break block13;
                            if (b10 == null || b10.j()) break block14;
                            this.d = b10;
                            this.a(2, b10.l().C());
                            if (n2 != 0) break block8;
                        }
                        this.a(2, net.minecraft.w.d.m);
                    }
                    if (n2 != 0) break block8;
                }
                this.a(2, net.minecraft.w.d.m);
            }
            this.e.a(this.a(2));
        }
    }

    @Override
    public d b(int n2) {
        return W.a(this.c, n2);
    }

    @Override
    public d a(int n2) {
        return this.c.get(n2);
    }

    @Override
    public void a(int n2, d d10) {
        block7: {
            C c10;
            block6: {
                int n3;
                block4: {
                    int n4;
                    block5: {
                        int n5 = n.c();
                        this.c.set(n2, d10);
                        n4 = n5;
                        n3 = d10.G();
                        if (n4 != 0) break block4;
                        if (n3 != 0) break block5;
                        n3 = d10.t();
                        if (n4 != 0) break block4;
                        if (n3 > this.c()) {
                            d10.c(this.c());
                        }
                    }
                    c10 = this;
                    if (n4 != 0) break block6;
                    n3 = c10.a(n2) ? 1 : 0;
                }
                if (n3 == 0) break block7;
                c10 = this;
            }
            c10.a();
        }
    }

    public void b(int n2) {
        this.b = n2;
        this.a();
    }

    @Override
    public String g() {
        return "mob.villager";
    }

    @Override
    public int e() {
        return this.c.size();
    }

    @Override
    public boolean a(j j2) {
        return this.e.b() == j2;
    }

    public b b() {
        return this.d;
    }

    @Override
    public void c(j j2) {
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public d a(int n2, int n3) {
        d d10;
        block10: {
            d d11;
            block11: {
                C c10;
                block12: {
                    d d12;
                    int n4;
                    block9: {
                        block8: {
                            int n5;
                            d d13;
                            block7: {
                                d13 = this.c.get(n2);
                                n4 = n.b();
                                n5 = n2;
                                if (n4 == 0) break block7;
                                if (n5 != 2) break block8;
                                d12 = d13;
                                if (n4 == 0) break block9;
                                n5 = d12.G() ? 1 : 0;
                            }
                            if (n5 == 0) {
                                return W.a(this.c, n2, d13.t());
                            }
                        }
                        d12 = W.a(this.c, n2, n3);
                    }
                    d10 = d11 = d12;
                    if (n4 == 0) break block10;
                    if (d10.G()) break block11;
                    c10 = this;
                    if (n4 == 0) break block12;
                    if (!c10.a(n2)) break block11;
                    c10 = this;
                }
                c10.a();
            }
            d10 = d11;
        }
        return d10;
    }

    @Override
    public int a() {
        return 0;
    }
}

