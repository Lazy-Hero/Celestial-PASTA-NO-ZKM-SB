/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.y;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.u;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.Z.i;
import net.minecraft.ah.G;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.aw.r;
import net.minecraft.k.n;
import net.minecraft.y.b;
import net.minecraft.y.d;
import net.minecraft.y.g;

public class c
extends r {
    private /* synthetic */ z g;
    private final /* synthetic */ List<d> f;
    private final /* synthetic */ List<n> d;
    private final /* synthetic */ List<g> e;
    private /* synthetic */ int c;

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        block2: {
            String string = net.minecraft.y.b.f();
            r2.b("Tick", this.c);
            String string2 = string;
            u u2 = new u();
            for (g g10 : this.e) {
                net.minecraft.P.r r3 = new net.minecraft.P.r();
                g10.a(r3);
                u2.a(r3);
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block2;
            }
            r2.a("Villages", u2);
        }
        return r2;
    }

    private void d() {
        Iterator<g> iterator = this.e.iterator();
        String string = net.minecraft.y.b.f();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    g g10 = iterator.next();
                    if (string != null) break block3;
                    if (!g10.g()) break block4;
                    iterator.remove();
                }
                this.b();
            }
            if (string == null) continue;
        }
    }

    private void a(n n2) {
        int n3;
        aA aA2 = aB.a(this.g, n2);
        aA aA3 = aA2.h();
        int n4 = this.a(n2, aA2, 5);
        if (n4 != (n3 = this.a(n2, aA3, n4 + 1))) {
            this.f.add(new d(n2, n4 < n3 ? aA2 : aA3, this.c));
        }
    }

    public void b(n n2) {
        block5: {
            int n3;
            String string;
            block4: {
                string = net.minecraft.y.b.f();
                n3 = this.d.size();
                if (string != null) break block4;
                if (n3 > 64) break block5;
                n3 = this.f(n2) ? 1 : 0;
            }
            if (string == null && n3 == 0) {
                n3 = this.d.add(n2) ? 1 : 0;
            }
        }
    }

    private boolean f(n n2) {
        boolean bl2;
        block3: {
            Iterator<n> iterator = this.d.iterator();
            String string = net.minecraft.y.b.f();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        n n3 = iterator.next();
                        bl2 = n3.equals(n2);
                        if (string != null) break block3;
                        if (string != null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void a(z z2) {
        this.g = z2;
        Iterator<g> iterator = this.e.iterator();
        String string = net.minecraft.y.b.f();
        while (iterator.hasNext()) {
            g g10 = iterator.next();
            g10.a(z2);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    private d e(n var1_1) {
        var3_2 = this.f.iterator();
        var2_3 = net.minecraft.y.b.f();
        while (var3_2.hasNext()) {
            block7: {
                block8: {
                    block6: {
                        var4_4 = var3_2.next();
                        v0 = var4_4.i().e();
                        if (var2_3 != null) ** GOTO lbl28
                        v1 = var1_1.e();
                        if (var2_3 != null) break block6;
                        if (v0 != v1) break block7;
                        v2 = var4_4.i().a();
                        v1 = var1_1.a();
                    }
                    if (var2_3 != null) break block8;
                    if (v2 != v1) break block7;
                    v3 = var4_4;
                    if (var2_3 != null) return v3;
                    v2 = Math.abs(v3.i().b() - var1_1.b());
                    v1 = 1;
                }
                if (v2 <= v1) {
                    v3 = var4_4;
                    return v3;
                }
            }
            if (var2_3 == null) continue;
        }
        var3_2 = this.e.iterator();
        do {
            v0 = var3_2.hasNext();
lbl28:
            // 2 sources

            if (v0 == 0) return null;
            var4_4 = (g)var3_2.next();
            v4 = var5_5 = var4_4.e(var1_1);
            if (var2_3 != null) return v4;
            if (v4 == null) continue;
            v4 = var5_5;
            return v4;
        } while (var2_3 == null);
        return null;
    }

    public g a(n n2, int n3) {
        g g10;
        block5: {
            g g11 = null;
            double d10 = 3.4028234663852886E38;
            String string = net.minecraft.y.b.f();
            Iterator<g> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                block7: {
                    double d11;
                    double d12;
                    g g12;
                    block6: {
                        g10 = g12 = iterator.next();
                        if (string != null) break block5;
                        d12 = g10.b().b(n2);
                        d11 = d12 == d10 ? 0 : (d12 < d10 ? -1 : 1);
                        if (string != null) break block6;
                        if (d11 >= 0) break block7;
                        d11 = n3 + g12.j();
                    }
                    float f10 = (float)d11;
                    double d13 = d12;
                    if (string == null && d13 <= (double)(f10 * f10)) {
                        g11 = g12;
                        d13 = d10 = d12;
                    }
                }
                if (string == null) continue;
            }
            g10 = g11;
        }
        return g10;
    }

    private void f() {
        block3: {
            c c10;
            block2: {
                String string = net.minecraft.y.b.f();
                c10 = this;
                if (string != null) break block2;
                if (c10.d.isEmpty()) break block3;
                c10 = this;
            }
            c10.c(this.d.remove(0));
        }
    }

    public c(String string) {
        super(string);
        this.d = Lists.newArrayList();
        this.f = Lists.newArrayList();
        this.e = Lists.newArrayList();
    }

    private void c(n n2) {
        int n3 = 16;
        String string = net.minecraft.y.b.f();
        int n4 = 4;
        int n5 = 16;
        int n6 = -16;
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < 16) {
                int n8 = -4;
                block2: while (true) {
                    int n9 = n8;
                    block3: while (n9 < 4) {
                        n7 = -16;
                        if (string != null) continue block1;
                        int n10 = n7;
                        while (n10 < 16) {
                            block7: {
                                block8: {
                                    d d10;
                                    block9: {
                                        d d11;
                                        block10: {
                                            n n11 = n2.a(n6, n8, n10);
                                            if (string != null) break block7;
                                            n9 = this.d(n11) ? 1 : 0;
                                            if (string != null) continue block3;
                                            if (n9 == 0) break block8;
                                            d10 = d11 = this.e(n11);
                                            if (string != null) break block9;
                                            if (d10 != null) break block10;
                                            this.a(n11);
                                            if (string == null) break block8;
                                        }
                                        d10 = d11;
                                    }
                                    d10.a(this.c);
                                }
                                ++n10;
                            }
                            if (string == null) continue;
                        }
                        ++n8;
                        if (string == null) continue block2;
                    }
                    break;
                }
                ++n6;
                if (string == null) continue block0;
            }
            break;
        }
    }

    private int a(n n2, aA aA2, int n3) {
        int n4;
        block4: {
            int n5 = 0;
            String string = net.minecraft.y.b.f();
            int n6 = 1;
            while (n6 <= 5) {
                block7: {
                    block6: {
                        int n7;
                        block5: {
                            n4 = this.g.w(n2.a(aA2, n6)) ? 1 : 0;
                            if (string != null) break block4;
                            if (string != null) break block5;
                            if (n4 == 0) break block6;
                            ++n5;
                            if (string != null) break block7;
                            n7 = n5;
                        }
                        if (n7 >= n3) {
                            return n5;
                        }
                    }
                    ++n6;
                }
                if (string == null) continue;
            }
            n4 = n5;
        }
        return n4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static String a(G g10) {
        return "villages" + g10.r().d();
    }

    public void c() {
        block8: {
            c c10;
            block7: {
                String string;
                block6: {
                    ++this.c;
                    Iterator<g> iterator = this.e.iterator();
                    string = net.minecraft.y.b.f();
                    while (iterator.hasNext()) {
                        g g10 = iterator.next();
                        g10.b(this.c);
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block6;
                    }
                    this.d();
                    this.f();
                    this.a();
                }
                c10 = this;
                if (string != null) break block7;
                if (c10.c % 400 != 0) break block8;
                c10 = this;
            }
            c10.b();
        }
    }

    public List<g> e() {
        return this.e;
    }

    private boolean d(n n2) {
        i i2 = this.g.d(n2);
        K k2 = i2.b();
        String string = net.minecraft.y.b.f();
        boolean bl2 = k2 instanceof aB;
        if (string == null) {
            if (bl2) {
                return i2.o() == net.minecraft.ac.c.k;
            }
            bl2 = false;
        }
        return bl2;
    }

    private void a() {
        block4: {
            String string = net.minecraft.y.b.f();
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                d d10 = this.f.get(i2);
                g g10 = this.a(d10.i(), 32);
                if (string == null) {
                    g g11 = g10;
                    if (string == null) {
                        if (g11 == null) {
                            g10 = new g(this.g);
                            this.e.add(g10);
                            this.b();
                        }
                        g11 = g10;
                    }
                    g11.a(d10);
                    if (string == null) continue;
                }
                break block4;
            }
            this.f.clear();
        }
    }

    public c(z z2) {
        super(net.minecraft.y.c.a(z2.D));
        this.d = Lists.newArrayList();
        this.f = Lists.newArrayList();
        this.e = Lists.newArrayList();
        this.g = z2;
        this.b();
    }

    @Override
    public void b(net.minecraft.P.r r2) {
        this.c = r2.m("Tick");
        u u2 = r2.c("Villages", 10);
        String string = net.minecraft.y.b.f();
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            net.minecraft.P.r r3 = u2.d(i2);
            g g10 = new g();
            g10.b(r3);
            this.e.add(g10);
            if (string == null) continue;
        }
    }
}

