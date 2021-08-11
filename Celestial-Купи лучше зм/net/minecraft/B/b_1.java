/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.B;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.g;
import net.minecraft.B.n;
import net.minecraft.ar.a2;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
implements a {
    private /* synthetic */ boolean b;
    private final /* synthetic */ a2<d> a;
    private /* synthetic */ List<g> d;
    private /* synthetic */ String c;
    private final /* synthetic */ int e;

    public b(String string, boolean bl2, int n2) {
        this.c = string;
        this.b = bl2;
        this.e = n2;
        this.a = a2.a(n2, net.minecraft.w.d.m);
    }

    @Override
    public String g() {
        return this.c;
    }

    public void a(g g10) {
        this.d.remove(g10);
    }

    public void a(String string) {
        this.b = true;
        this.c = string;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public k d() {
        return this.g() ? new net.minecraft.at.g(this.g()) : new h(this.g(), new Object[0]);
    }

    @Override
    public d b(int n2) {
        d d10 = this.a.get(n2);
        int n3 = n.b();
        d d11 = d10;
        if (n3 != 0) {
            if (d11.G()) {
                return net.minecraft.w.d.m;
            }
            this.a.set(n2, net.minecraft.w.d.m);
            d11 = d10;
        }
        return d11;
    }

    @Override
    public boolean g() {
        return this.b;
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
                int n4 = n.c();
                n3 = n2;
                if (n4 != 0) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.a.size()) {
                d10 = this.a.get(n2);
                return d10;
            }
        }
        d10 = net.minecraft.w.d.m;
        return d10;
    }

    @Override
    public boolean a(j j2) {
        return true;
    }

    @Override
    public int e() {
        return this.e;
    }

    @Override
    public void d() {
        this.a.clear();
    }

    @Override
    public int c() {
        return 64;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public d a(d var1_1) {
        block7: {
            var3_2 = var1_1.C();
            var4_3 = 0;
            var2_4 = n.c();
            while (var4_3 < this.e) {
                block10: {
                    block9: {
                        block8: {
                            var5_5 = this.a(var4_3);
                            v0 = var5_5.G() ? 1 : 0;
                            if (var2_4 != 0) break block7;
                            if (var2_4 == 0) {
                                if (v0 != 0) {
                                    this.a(var4_3, var3_2);
                                    this.b();
                                    return net.minecraft.w.d.m;
                                }
                                v1 = net.minecraft.w.d.c(var5_5, var3_2);
                            }
                            if (var2_4 != 0) break block8;
                            if (v1 == false) break block9;
                            v1 = Math.min(this.c(), var5_5.f());
                        }
                        var6_6 = v1;
                        var7_7 = Math.min(var3_2.t(), (int)(var6_6 - var5_5.t()));
                        if (var2_4 != 0) break block10;
                        if (var7_7 > 0) {
                            var5_5.g(var7_7);
                            var3_2.b(var7_7);
                            if (var2_4 == 0) {
                                if (var3_2.G()) {
                                    this.b();
                                    return net.minecraft.w.d.m;
                                } else {
                                    ** GOTO lbl30
                                }
                            } else {
                                ** GOTO lbl29
                            }
                        }
                        break block9;
lbl29:
                        // 2 sources

                        break block10;
                    }
                    ++var4_3;
                }
                if (var2_4 == 0) continue;
            }
            v2 = var3_2;
            if (var2_4 != 0) return v2;
            v0 = v2.t();
        }
        if (v0 != var1_1.t()) {
            this.b();
        }
        v2 = var3_2;
        return v2;
    }

    @Override
    public void b() {
        int n2 = n.c();
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                this.d.get(i2).a(this);
                if (n2 == 0) continue;
            }
        }
    }

    @Override
    public int a() {
        return 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c(j j2) {
    }

    @Override
    public void a(int n2, d d10) {
        block2: {
            block3: {
                d d11;
                block4: {
                    int n3 = n.b();
                    this.a.set(n2, d10);
                    int n4 = n3;
                    if (n4 == 0) break block2;
                    if (d10.G()) break block3;
                    d11 = d10;
                    if (n4 == 0) break block4;
                    if (d11.t() <= this.c()) break block3;
                    d11 = d10;
                }
                d11.c(this.c());
            }
            this.b();
        }
    }

    public void b(g g10) {
        int n2 = n.b();
        List<g> list = this.d;
        if (n2 != 0) {
            if (list == null) {
                this.d = Lists.newArrayList();
            }
            list = this.d;
        }
        list.add(g10);
    }

    @Override
    public d a(int n2, int n3) {
        d d10 = W.a(this.a, n2, n3);
        int n4 = n.c();
        d d11 = d10;
        if (n4 == 0) {
            if (!d11.G()) {
                this.b();
            }
            d11 = d10;
        }
        return d11;
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.a.iterator();
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

    public b(k k2, int n2) {
        this(k2.f(), true, n2);
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }

    @Override
    public void d(j j2) {
    }
}

