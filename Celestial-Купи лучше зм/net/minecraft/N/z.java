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
import net.minecraft.N.h;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.Q.ag;
import net.minecraft.ah.f;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.k.m;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.t;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class z
extends y
implements f {
    private /* synthetic */ String k;
    private /* synthetic */ bl l;
    private /* synthetic */ List<bl> m;
    private /* synthetic */ List<h> j;
    private /* synthetic */ String o;
    private /* synthetic */ boolean i;
    private /* synthetic */ u n;

    public List<bl> e() {
        this.c();
        return this.m;
    }

    public d d() {
        d d10;
        block0: {
            d10 = t.a(this.l, this.n);
            if (!this.g()) break block0;
            d10.d(this.g());
        }
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(d d10) {
        r r2 = d10.c("BlockEntityTag");
        m[] arrm = net.minecraft.N.j.f();
        r r3 = r2;
        if (arrm == null) {
            if (r3 == null) return 0;
            r3 = r2;
        }
        int n2 = r3.b("Patterns");
        if (arrm != null) return n2;
        if (n2 == 0) return 0;
        n2 = r2.c("Patterns", 10).b();
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(d var1_1, boolean var2_2) {
        block7: {
            block6: {
                this.n = null;
                var4_3 = var1_1.c("BlockEntityTag");
                var3_4 = net.minecraft.N.j.f();
                v0 = var4_3;
                if (var3_4 != null) break block6;
                if (v0 == null) break block7;
                v0 = var4_3;
            }
            if (v0.a("Patterns", 9)) {
                this.n = var4_3.c("Patterns", 10).a();
            }
        }
        this.l = var2_2 != false ? z.c(var1_1) : t.a(var1_1);
        this.j = null;
        this.m = null;
        this.k = "";
        this.i = true;
        v1 = var1_1;
        if (var3_4 != null) ** GOTO lbl21
        if (v1.c()) {
            v1 = var1_1;
lbl21:
            // 2 sources

            v2 = v1.g();
        } else {
            v2 = null;
        }
        this.o = v2;
    }

    @Override
    public void c(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.c(r2);
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            if (r2.a("CustomName", 8)) {
                this.o = r2.j("CustomName");
            }
            this.l = bl.d(r2.m("Base"));
            this.n = r2.c("Patterns", 10);
            this.j = null;
            this.m = null;
            this.k = null;
            this.i = true;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public List<h> b() {
        this.c();
        return this.j;
    }

    @Override
    public r a(r r2) {
        block2: {
            m[] arrm = net.minecraft.N.j.f();
            super.a(r2);
            r2.b("Base", this.l.a());
            m[] arrm2 = arrm;
            z z2 = this;
            if (arrm2 == null) {
                if (z2.n != null) {
                    r2.a("Patterns", this.n);
                }
                z2 = this;
            }
            if (!z2.g()) break block2;
            r2.a("CustomName", this.o);
        }
        return r2;
    }

    public String a() {
        this.c();
        return this.k;
    }

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new net.minecraft.at.h(this.g(), new Object[0]);
    }

    public static void a(d d10) {
        block3: {
            d d11;
            block7: {
                boolean bl2;
                block6: {
                    m[] arrm;
                    block5: {
                        int n2;
                        String string;
                        r r2;
                        block4: {
                            r r3;
                            block2: {
                                r3 = d10.c("BlockEntityTag");
                                arrm = net.minecraft.N.j.f();
                                r2 = r3;
                                if (arrm != null) break block2;
                                if (r2 == null) break block3;
                                r2 = r3;
                            }
                            string = "Patterns";
                            n2 = 9;
                            if (arrm != null) break block4;
                            if (!r2.a(string, n2)) break block3;
                            r2 = r3;
                            string = "Patterns";
                            n2 = 10;
                        }
                        u u2 = r2.c(string, n2);
                        bl2 = u2.c();
                        if (arrm != null) break block5;
                        if (bl2) break block3;
                        u2.h(u2.b() - 1);
                        bl2 = u2.c();
                    }
                    if (arrm != null) break block6;
                    if (!bl2) break block3;
                    d10.v().k("BlockEntityTag");
                    d11 = d10;
                    if (arrm != null) break block7;
                    bl2 = d11.v().c();
                }
                if (!bl2) break block3;
                d11 = d10;
            }
            d11.b((r)null);
        }
    }

    private void c() {
        block8: {
            int n2;
            m[] arrm;
            block11: {
                int n3;
                block9: {
                    block10: {
                        z z2;
                        block6: {
                            block7: {
                                arrm = net.minecraft.N.j.f();
                                z2 = this;
                                if (arrm != null) break block6;
                                if (z2.j == null) break block7;
                                z2 = this;
                                if (arrm != null) break block6;
                                if (z2.m == null) break block7;
                                z2 = this;
                                if (arrm != null) break block6;
                                if (z2.k != null) break block8;
                            }
                            z2 = this;
                        }
                        n3 = z2.i;
                        if (arrm != null) break block9;
                        if (n3 != 0) break block10;
                        this.k = "";
                        if (arrm == null) break block8;
                    }
                    this.j = Lists.newArrayList();
                    this.m = Lists.newArrayList();
                    this.j.add(h.BASE);
                    n3 = this.m.add(this.l) ? 1 : 0;
                }
                if (arrm != null) break block11;
                this.k = "b" + this.l.a();
                if (this.n == null) break block8;
                n3 = n2 = 0;
            }
            while (n2 < this.n.b()) {
                r r2 = this.n.d(n2);
                h h2 = h.a(r2.j("Pattern"));
                if (arrm == null) {
                    if (h2 != null) {
                        this.j.add(h2);
                        int n4 = r2.m("Color");
                        this.m.add(bl.d(n4));
                        this.k = this.k + h2.d() + n4;
                    }
                    ++n2;
                }
                if (arrm == null) continue;
            }
        }
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 6, this.r());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.o;
        if (arrm == null) {
            if (string == null) return false;
            string = this.o;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bl c(d d10) {
        bl bl2;
        block3: {
            int n2;
            block4: {
                r r2;
                m[] arrm;
                r r3;
                block2: {
                    r3 = d10.c("BlockEntityTag");
                    arrm = net.minecraft.N.j.f();
                    r2 = r3;
                    if (arrm != null) break block2;
                    if (r2 == null) break block3;
                    r2 = r3;
                }
                n2 = r2.b("Base");
                if (arrm != null) break block4;
                if (n2 == 0) break block3;
                n2 = r3.m("Base");
            }
            bl2 = bl.d(n2);
            return bl2;
        }
        bl2 = bl.BLACK;
        return bl2;
    }

    public z() {
        this.l = bl.BLACK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        z z2 = this;
        if (arrm == null) {
            if (!z2.g()) return "banner";
            z2 = this;
        }
        String string = z2.o;
        return string;
    }

    @Override
    public r r() {
        return this.a(new r());
    }
}

