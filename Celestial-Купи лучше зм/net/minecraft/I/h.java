/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.i;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.Q.aZ;
import net.minecraft.U.B;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.i.g;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.w.d;
import net.minecraft.w.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
implements a {
    public /* synthetic */ int a;
    public final /* synthetic */ a2<d> e;
    public /* synthetic */ j g;
    private /* synthetic */ d b;
    public final /* synthetic */ a2<d> c;
    private /* synthetic */ int f;
    private final /* synthetic */ List<a2<d>> d;
    public final /* synthetic */ a2<d> h;

    @Override
    public int c(int n2) {
        return 0;
    }

    public static int j() {
        return 9;
    }

    @Override
    public net.minecraft.at.k d() {
        return this.g() ? new net.minecraft.at.g(this.g()) : new net.minecraft.at.h(this.g(), new Object[0]);
    }

    @Override
    public void d() {
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            List list = iterator.next();
            list.clear();
            if (string == null) continue;
        }
    }

    public void a(h h2) {
        block2: {
            String string = net.minecraft.i.g.b();
            for (int i2 = 0; i2 < this.e(); ++i2) {
                this.a(i2, h2.a(i2));
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            this.a = h2.a;
        }
    }

    public void e(d d10) {
        this.b = d10;
    }

    public void f(int n2) {
        block9: {
            String string;
            block11: {
                int n3;
                block10: {
                    string = net.minecraft.i.g.b();
                    n3 = n2;
                    if (string == null) {
                        if (n3 > 0) {
                            n2 = 1;
                        }
                        n3 = n2;
                    }
                    if (string != null) break block10;
                    if (n3 >= 0) break block11;
                    n3 = -1;
                }
                n2 = n3;
            }
            this.a -= n2;
            while (this.a < 0) {
                this.a += 9;
                if (string == null) {
                    if (string == null) continue;
                }
                break block9;
            }
            while (this.a >= 9) {
                this.a -= 9;
                if (string == null) continue;
            }
        }
    }

    public boolean b(d d10) {
        return this.a(-1, d10);
    }

    @Override
    public String g() {
        return "container.inventory";
    }

    public boolean h(d d10) {
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            List list = iterator.next();
            Iterator iterator2 = list.iterator();
            while (iterator2.hasNext() || string != null) {
                block6: {
                    block5: {
                        boolean bl2;
                        block4: {
                            d d11 = (d)iterator2.next();
                            bl2 = d11.G();
                            if (string != null) break block4;
                            if (bl2) break block5;
                            bl2 = d11.c(d10);
                        }
                        if (bl2 && string == null) break block6;
                    }
                    if (string == null) continue;
                }
                return true;
            }
        }
        return false;
    }

    public void a(u u2) {
        String string = net.minecraft.i.g.b();
        this.c.clear();
        String string2 = string;
        this.e.clear();
        this.h.clear();
        int n2 = 0;
        while (n2 < u2.b()) {
            block5: {
                block6: {
                    int n3;
                    int n4;
                    d d10;
                    int n5;
                    block12: {
                        block10: {
                            block11: {
                                block9: {
                                    block7: {
                                        block8: {
                                            r r2 = u2.d(n2);
                                            n5 = r2.r("Slot") & 0xFF;
                                            d10 = new d(r2);
                                            if (string2 != null) break block5;
                                            if (d10.G()) break block6;
                                            n4 = n5;
                                            if (string2 != null) break block7;
                                            if (n4 < 0) break block8;
                                            n4 = n5;
                                            n3 = this.c.size();
                                            if (string2 != null) break block9;
                                            if (n4 >= n3) break block8;
                                            this.c.set(n5, d10);
                                            if (string2 == null) break block6;
                                        }
                                        n4 = n5;
                                    }
                                    n3 = 100;
                                }
                                if (string2 != null) break block10;
                                if (n4 < n3) break block11;
                                n4 = n5;
                                n3 = this.e.size() + 100;
                                if (string2 != null) break block10;
                                if (n4 >= n3) break block11;
                                this.e.set(n5 - 100, d10);
                                if (string2 == null) break block6;
                            }
                            n4 = n5;
                            n3 = 150;
                        }
                        if (string2 != null) break block12;
                        if (n4 < n3) break block6;
                        n4 = n5;
                        n3 = this.h.size() + 150;
                    }
                    if (n4 < n3) {
                        this.h.set(n5 - 150, d10);
                    }
                }
                ++n2;
            }
            if (string2 == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public d b(int n2) {
        d d10;
        block8: {
            a2<d> a22;
            String string;
            a2<d> a23;
            block7: {
                a23 = null;
                string = net.minecraft.i.g.b();
                for (a2<d> a24 : this.d) {
                    int n4 = n2;
                    n4 = a24.size();
                    if (string == null) {
                        if (n3 < n4) {
                            a23 = a24;
                            break;
                        }
                        int n4 = n2;
                        n4 = a24.size();
                    }
                    n2 = n3 - n4;
                }
                a22 = a23;
                if (string != null) break block7;
                if (a22 == null) break block8;
                a22 = a23.get(n2);
            }
            d10 = (d)((Object)a22);
            if (string != null) return d10;
            if (!d10.G()) {
                d d11 = (d)a23.get(n2);
                a23.set(n2, net.minecraft.w.d.m);
                return d11;
            }
        }
        d10 = net.minecraft.w.d.m;
        return d10;
    }

    public void d(d d10) {
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            block1: while (true) {
                a2<d> a22 = object;
                for (int i2 = 0; i2 < a22.size(); ++i2) {
                    object = a22.get(i2);
                    if (string != null) continue block1;
                    if (string == null) {
                        if (object != d10) continue;
                        a22.set(i2, net.minecraft.w.d.m);
                    }
                    if (string == null) break block1;
                    if (string == null) continue;
                }
                break;
            }
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean f() {
        var2_1 = this.c.iterator();
        var1_2 = net.minecraft.i.g.b();
        while (var2_1.hasNext()) {
            var3_3 = (d)var2_1.next();
            v0 = var3_3.G();
            if (var1_2 == null) {
                if (var1_2 != null) return v1;
                if (!v0) {
                    return false;
                }
                if (var1_2 == null) continue;
            }
            ** GOTO lbl15
        }
        var2_1 = this.e.iterator();
        do {
            v0 = var2_1.hasNext();
lbl15:
            // 2 sources

            if (!v0) break;
            var3_3 = (d)var2_1.next();
            v2 = var3_3.G();
            if (var1_2 != null) ** GOTO lbl26
            if (var1_2 != null) return v3;
            if (v2) continue;
            return false;
        } while (var1_2 == null);
        var2_1 = this.h.iterator();
        do {
            v2 = var2_1.hasNext();
lbl26:
            // 2 sources

            if (v2 == false) return true;
            var3_3 = (d)var2_1.next();
            v4 = var3_3.G();
            if (var1_2 != null) return v4;
            if (var1_2 != null) return v5;
            if (v4) continue;
            return false;
        } while (var1_2 == null);
        return true;
    }

    public int g(d d10) {
        int n2;
        block4: {
            String string = net.minecraft.i.g.b();
            for (int i2 = 0; i2 < this.c.size(); ++i2) {
                n2 = this.c.get(i2).G() ? 1 : 0;
                if (string == null) {
                    int n3;
                    if (string == null) {
                        if (n2 != 0) continue;
                        n3 = this.a(d10, this.c.get(i2)) ? 1 : 0;
                    }
                    if (string == null) {
                        if (n3 == false) continue;
                        n3 = i2;
                    }
                    return n3;
                }
                break block4;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public void b() {
        ++this.f;
    }

    @Override
    public void d(j j2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(d d10, d d11) {
        int n2;
        String string;
        block4: {
            block5: {
                string = net.minecraft.i.g.b();
                d d12 = d10;
                if (string == null) {
                    if (d12.w() != d11.w()) return 0 != 0;
                    d12 = d10;
                }
                n2 = d12.z();
                if (string != null) break block4;
                if (n2 == 0) break block5;
                n2 = d10.d();
                if (string != null) break block4;
                if (n2 != d11.d()) return 0 != 0;
            }
            n2 = net.minecraft.w.d.b(d10, d11) ? 1 : 0;
        }
        if (string != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    public u b(u u2) {
        r r2;
        int n2;
        String string;
        block8: {
            int n3;
            block7: {
                int n4;
                string = net.minecraft.i.g.b();
                for (n2 = 0; n2 < this.c.size(); ++n2) {
                    n4 = this.c.get(n2).G() ? 1 : 0;
                    if (string == null) {
                        if (n4 != 0) continue;
                        r2 = new r();
                        r2.a("Slot", (byte)n2);
                        this.c.get(n2).a(r2);
                        u2.a(r2);
                        if (string == null) continue;
                    }
                    break block7;
                }
                n4 = n2 = 0;
            }
            while (n2 < this.e.size()) {
                n3 = this.e.get(n2).G() ? 1 : 0;
                if (string == null) {
                    if (n3 == 0) {
                        r2 = new r();
                        r2.a("Slot", (byte)(n2 + 100));
                        this.e.get(n2).a(r2);
                        u2.a(r2);
                    }
                    ++n2;
                    if (string == null) continue;
                }
                break block8;
            }
            n3 = n2 = 0;
        }
        while (n2 < this.h.size()) {
            if (!this.h.get(n2).G()) {
                r2 = new r();
                r2.a("Slot", (byte)(n2 + 150));
                this.h.get(n2).a(r2);
                u2.a(r2);
            }
            ++n2;
            if (string == null) continue;
        }
        return u2;
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public int e() {
        return this.c.size() + this.e.size() + this.h.size();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(@Nullable net.minecraft.w.k var1_1, int var2_2, int var3_3, @Nullable r var4_4) {
        block42: {
            block46: {
                block45: {
                    block44: {
                        block43: {
                            block31: {
                                var6_5 = 0;
                                var5_6 = net.minecraft.i.g.b();
                                var7_7 = 0;
                                while (var7_7 < this.e()) {
                                    block32: {
                                        block33: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block34: {
                                                                            var8_8 = this.a(var7_7);
                                                                            if (var5_6 != null) break block32;
                                                                            v0 = var8_8.G() ? 1 : 0;
                                                                            if (var5_6 != null) break block31;
                                                                            if (v0 != 0) break block33;
                                                                            v1 = var1_1;
                                                                            if (var5_6 != null) break block34;
                                                                            if (v1 == null) break block35;
                                                                            v1 = var8_8.w();
                                                                        }
                                                                        if (v1 != var1_1) break block33;
                                                                    }
                                                                    v2 = var2_2;
                                                                    v3 = -1;
                                                                    if (var5_6 != null) break block36;
                                                                    if (v2 <= v3) break block37;
                                                                    v2 = var8_8.d();
                                                                    v3 = var2_2;
                                                                }
                                                                if (v2 != v3) break block33;
                                                            }
                                                            v4 = var4_4;
                                                            if (var5_6 != null) break block38;
                                                            if (v4 == null) break block39;
                                                            v4 = var4_4;
                                                        }
                                                        v5 = net.minecraft.P.c.a(v4, var8_8.v(), true) ? 1 : 0;
                                                        if (var5_6 != null) break block40;
                                                        if (v5 == 0) break block33;
                                                    }
                                                    v5 = var3_3;
                                                }
                                                if (var5_6 != null) ** GOTO lbl42
                                                if (v5 <= 0) {
                                                    v6 = var8_8.t();
                                                } else {
                                                    v5 = var3_3 - var6_5;
lbl42:
                                                    // 2 sources

                                                    v6 = Math.min(v5, var8_8.t());
                                                }
                                                var9_9 = v6;
                                                var6_5 += var9_9;
                                                if (var5_6 != null) break block32;
                                                if (var3_3 == 0) break block33;
                                                var8_8.b(var9_9);
                                                v7 = var8_8.G();
                                                if (var5_6 == null) {
                                                    if (v7 != 0) {
                                                        this.a(var7_7, net.minecraft.w.d.m);
                                                    }
                                                    v7 = var3_3;
                                                }
                                                if (var5_6 != null) break block41;
                                                if (v7 <= 0) break block33;
                                                v7 = var6_5;
                                            }
                                            if (var5_6 != null) return v7;
                                            if (v7 >= var3_3) {
                                                v7 = var6_5;
                                                return v7;
                                            }
                                        }
                                        ++var7_7;
                                    }
                                    if (var5_6 == null) continue;
                                }
                                v0 = this.b.G();
                            }
                            if (var5_6 != null) return v0;
                            if (v0 != 0) break block42;
                            v8 = var1_1;
                            if (var5_6 != null) break block43;
                            if (v8 == null) break block44;
                            v8 = this.b.w();
                        }
                        if (v8 != var1_1) {
                            return var6_5;
                        }
                    }
                    v9 = var2_2;
                    v10 = -1;
                    if (var5_6 != null) break block45;
                    if (v9 <= v10) break block46;
                    v9 = this.b.d();
                    if (var5_6 != null) return v9;
                    v10 = var2_2;
                }
                if (v9 != v10) {
                    v9 = var6_5;
                    return v9;
                }
            }
            v11 = var4_4;
            if (var5_6 != null) ** GOTO lbl93
            if (v11 != null) {
                v11 = var4_4;
lbl93:
                // 2 sources

                v12 = net.minecraft.P.c.a(v11, this.b.v(), true) ? 1 : 0;
                if (var5_6 == null) {
                    if (v12 == 0) {
                        return var6_5;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v12 = var3_3;
            }
            if (var5_6 != null) ** GOTO lbl104
            if (v12 <= 0) {
                v13 = this.b.t();
            } else {
                v12 = var3_3 - var6_5;
lbl104:
                // 2 sources

                v13 = Math.min(v12, this.b.t());
            }
            var7_7 = v13;
            var6_5 += var7_7;
            v0 = var3_3;
            if (var5_6 != null) return v0;
            if (v0 != 0) {
                this.b.b(var7_7);
                v0 = this.b.G() ? 1 : 0;
                if (var5_6 == null) {
                    if (v0 != 0) {
                        this.b = net.minecraft.w.d.m;
                    }
                    v0 = var3_3;
                }
                if (var5_6 != null) return v0;
                if (v0 > 0) {
                    v0 = var6_5;
                    if (var5_6 != null) return v0;
                    if (v0 >= var3_3) {
                        return var6_5;
                    }
                }
            }
        }
        v0 = var6_5;
        return v0;
    }

    @Override
    public void a(int n2, d d10) {
        a2<d> a22 = null;
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            a2<d> a23 = iterator.next();
            int n3 = n2;
            int n4 = a23.size();
            if (string == null) {
                if (n3 < n4) {
                    a22 = a23;
                    break;
                }
                n3 = n2;
                n4 = a23.size();
            }
            n2 = n3 - n4;
        }
        Object object = a22;
        if (string == null && object != null) {
            object = a22.set(n2, d10);
        }
    }

    public void i() {
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        block0: while (true) {
            boolean bl2 = iterator.hasNext();
            block1: while (bl2) {
                List list = iterator.next();
                int n2 = 0;
                while (n2 < list.size()) {
                    d d10 = (d)list.get(n2);
                    if (string == null) {
                        bl2 = d10.G();
                        if (string != null) continue block1;
                        if (!bl2) {
                            this.g.a(d10, true, false);
                            list.set(n2, net.minecraft.w.d.m);
                        }
                        ++n2;
                    }
                    if (string == null) continue;
                }
                if (string == null) continue block0;
            }
            break;
        }
    }

    public void g() {
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        block0: while (true) {
            boolean bl2 = iterator.hasNext();
            block1: while (bl2) {
                a2<d> a22 = iterator.next();
                for (int i2 = 0; i2 < a22.size(); ++i2) {
                    d d10 = a22.get(i2);
                    if (string == null) {
                        bl2 = d10.G();
                        if (string != null) continue block1;
                        if (bl2) continue;
                        d10 = a22.get(i2);
                    }
                    int n2 = this.a;
                    if (string == null) {
                        n2 = n2 == i2 ? 1 : 0;
                    }
                    d10.a(this.g.aG, this.g, i2, n2 != 0);
                    if (string == null) continue;
                }
                if (string == null) continue block0;
            }
            break;
        }
    }

    public float b(i i2) {
        float f10 = 1.0f;
        if (!this.c.get(this.a).G()) {
            f10 *= this.c.get(this.a).b(i2);
        }
        return f10;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public int b() {
        int n2;
        block3: {
            String string = net.minecraft.i.g.b();
            for (int i2 = 0; i2 < this.c.size(); ++i2) {
                n2 = this.c.get(i2).G() ? 1 : 0;
                if (string == null) {
                    int n3;
                    if (string == null) {
                        if (n2 == 0) continue;
                        n3 = i2;
                    }
                    return n3;
                }
                break block3;
            }
            n2 = -1;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d a(int n2) {
        d d10;
        a2<d> a22 = null;
        Iterator<a2<d>> iterator = this.d.iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            a2<d> a23 = iterator.next();
            int n4 = n2;
            n4 = a23.size();
            if (string == null) {
                if (n3 < n4) {
                    a22 = a23;
                    break;
                }
                int n4 = n2;
                n4 = a23.size();
            }
            n2 = n3 - n4;
        }
        a2<d> a24 = a22;
        if (string == null) {
            if (a24 == null) {
                d10 = net.minecraft.w.d.m;
                return d10;
            }
            a24 = a22.get(n2);
        }
        d10 = (d)((Object)a24);
        return d10;
    }

    public void a(float f10) {
        float f11;
        String string = net.minecraft.i.g.b();
        float f12 = (f10 /= 4.0f) - 1.0f;
        float f13 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (string == null) {
            if (f13 < 0) {
                f10 = 1.0f;
            }
            f13 = f11 = 0.0f;
        }
        while (f11 < this.e.size()) {
            d d10 = this.e.get((int)f11);
            if (string == null) {
                if (d10.w() instanceof m) {
                    d10.a((int)f10, (B)this.g);
                }
                ++f11;
            }
            if (string == null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean a(int var1_1, d var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 14[DOLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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

    @Override
    public boolean a(j j2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.g.P;
        if (string == null) {
            if (bl2) {
                return false;
            }
            double d10 = j2.s(this.g) - 64.0;
            bl2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            bl2 = bl2 <= false;
        }
        return bl2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void a(z z2, d d10) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = z2.C;
        boolean bl3 = true;
        do {
            int n2;
            block10: {
                block9: {
                    if (!bl3 || (bl3 = false)) break block9;
                    if (string != null) break block10;
                    if (bl2) break;
                }
                bl2 = d10.G();
            }
            if (bl2) break;
            int n3 = n2 = this.c(d10);
            int n4 = -1;
            if (string == null) {
                if (n3 == n4) {
                    n2 = this.b();
                }
                n3 = n2;
                n4 = -1;
            }
            if (string == null) {
                if (n3 == n4) {
                    this.g.a(d10, false);
                    if (string == null) break;
                }
                n3 = d10.f();
                n4 = this.a(n2).t();
            }
            int n5 = n3 - n4;
            h h2 = this;
            if (string == null) {
                if (!h2.a(n2, d10.d(n5))) continue;
                h2 = this;
            }
            ((k)h2.g).cD.a(new aZ(-2, n2, this.a(n2)));
        } while (string == null);
    }

    @Override
    public boolean g() {
        return false;
    }

    public int f() {
        int n2;
        block9: {
            int n3;
            String string;
            int n4;
            block8: {
                int n5;
                n4 = 0;
                string = net.minecraft.i.g.b();
                while (n4 < 9) {
                    n3 = (this.a + n4) % 9;
                    if (string == null) {
                        n5 = this.c.get(n3).G() ? 1 : 0;
                        if (string != null) break block8;
                        if (n5 != 0) {
                            return n3;
                        }
                        ++n4;
                    }
                    if (string == null) continue;
                }
                n5 = n4 = 0;
            }
            while (n4 < 9) {
                n3 = (this.a + n4) % 9;
                if (string == null) {
                    n2 = this.c.get(n3).r() ? 1 : 0;
                    if (string != null) break block9;
                    if (n2 == 0) {
                        return n3;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            n2 = this.a;
        }
        return n2;
    }

    private int f(d d10) {
        int n2;
        block5: {
            int n3;
            int n4;
            block4: {
                n4 = this.c(d10);
                String string = net.minecraft.i.g.b();
                n2 = n4;
                n3 = -1;
                if (string != null) break block4;
                if (n2 == n3) {
                    n4 = this.b();
                }
                n2 = n4;
                if (string != null) break block5;
                n3 = -1;
            }
            n2 = n2 == n3 ? d10.t() : this.b(n4, d10);
        }
        return n2;
    }

    public d h() {
        return this.b;
    }

    @Override
    public int a() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d a(int n2, int n3) {
        d d10;
        block8: {
            a2<d> a22;
            String string;
            a2<d> a23;
            block7: {
                a23 = null;
                string = net.minecraft.i.g.b();
                for (a2<d> a24 : this.d) {
                    int n4 = n2;
                    int n5 = a24.size();
                    if (string == null) {
                        if (n4 < n5) {
                            a23 = a24;
                            break;
                        }
                        n4 = n2;
                        n5 = a24.size();
                    }
                    n2 = n4 - n5;
                }
                a22 = a23;
                if (string != null) break block7;
                if (a22 == null) break block8;
                a22 = a23.get(n2);
            }
            d10 = (d)((Object)a22);
            if (string != null) return d10;
            if (!d10.G()) {
                d10 = W.a(a23, n2, n3);
                return d10;
            }
        }
        d10 = net.minecraft.w.d.m;
        return d10;
    }

    public int d() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(d d10, d d11) {
        String string = net.minecraft.i.g.b();
        int n2 = d10.G();
        if (string == null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.a(d10, d11);
        }
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = d10.p();
        }
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = d10.t();
        }
        int n3 = d10.f();
        if (string == null) {
            if (n2 >= n3) return 0 != 0;
            n2 = d10.t();
            if (string != null) return n2 != 0;
            n3 = this.c();
        }
        if (n2 >= n3) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    private int b(int n2, d d10) {
        int n3;
        int n4;
        d d11;
        int n5;
        String string;
        block15: {
            int n6;
            block14: {
                int n7;
                block10: {
                    block11: {
                        block13: {
                            d d12;
                            block12: {
                                net.minecraft.w.k k2 = d10.w();
                                string = net.minecraft.i.g.b();
                                n5 = d10.t();
                                d11 = this.a(n2);
                                n7 = d11.G();
                                if (string != null) break block10;
                                if (n7 == 0) break block11;
                                d11 = new d(k2, 0, d10.d());
                                d12 = d10;
                                if (string != null) break block12;
                                if (!d12.x()) break block13;
                                d12 = d11;
                            }
                            d12.b(d10.v().c());
                        }
                        this.a(n2, d11);
                    }
                    n7 = n5;
                }
                n4 = n7;
                n3 = n5;
                n6 = d11.f() - d11.t();
                if (string != null) break block14;
                if (n3 > n6) {
                    n4 = d11.f() - d11.t();
                }
                n3 = n4;
                if (string != null) break block15;
                n6 = this.c() - d11.t();
            }
            if (n3 > n6) {
                n4 = this.c() - d11.t();
            }
            n3 = n4;
        }
        if (string == null) {
            if (n3 == 0) {
                return n5;
            }
            d11.g(n4);
            d11.f(5);
            n3 = n5 -= n4;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(int n2) {
        String string = net.minecraft.i.g.b();
        int n3 = n2;
        if (string == null) {
            if (n3 < 0) return 0 != 0;
            n3 = n2;
        }
        if (string != null) return n3 != 0;
        if (n3 >= 9) return 0 != 0;
        return 1 != 0;
    }

    public int i(d d10) {
        int n2;
        block3: {
            int n3 = 0;
            String string = net.minecraft.i.g.b();
            while (n3 < this.c.size()) {
                block4: {
                    block5: {
                        int n4;
                        block9: {
                            block8: {
                                d d11;
                                block7: {
                                    block6: {
                                        d11 = this.c.get(n3);
                                        if (string != null) break block4;
                                        n2 = this.c.get(n3).G() ? 1 : 0;
                                        if (string != null) break block3;
                                        if (n2 != 0) break block5;
                                        n4 = this.a(d10, this.c.get(n3));
                                        if (string != null) break block6;
                                        if (n4 == 0) break block5;
                                        n4 = this.c.get(n3).a() ? 1 : 0;
                                    }
                                    if (string != null) break block7;
                                    if (n4 != 0) break block5;
                                    n4 = d11.r();
                                }
                                if (string != null) break block8;
                                if (n4 != 0) break block5;
                                n4 = d11.c() ? 1 : 0;
                            }
                            if (string != null) break block9;
                            if (n4 != 0) break block5;
                            n4 = n3;
                        }
                        return n4;
                    }
                    ++n3;
                }
                if (string == null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public void c(j j2) {
    }

    public void a(net.minecraft.client.B.d d10, boolean bl2) {
        block2: {
            Iterator iterator = this.c.iterator();
            String string = net.minecraft.i.g.b();
            while (iterator.hasNext()) {
                d d11 = (d)iterator.next();
                d10.b(d11);
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            if (!bl2) break block2;
            d10.b(this.h.get(0));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public d k() {
        d d10;
        String string = net.minecraft.i.g.b();
        Object object = this;
        if (string == null) {
            if (!net.minecraft.i.h.d(((h)object).a)) {
                d10 = net.minecraft.w.d.m;
                return d10;
            }
            object = this.c.get(this.a);
        }
        d10 = (d)object;
        return d10;
    }

    public void a(d d10) {
        block6: {
            int n2;
            block8: {
                String string;
                block9: {
                    d d11;
                    block10: {
                        int n3;
                        block7: {
                            block4: {
                                block5: {
                                    n2 = this.g(d10);
                                    string = net.minecraft.i.g.b();
                                    n3 = net.minecraft.i.h.d(n2);
                                    if (string != null) break block4;
                                    if (n3 == 0) break block5;
                                    this.a = n2;
                                    if (string == null) break block6;
                                }
                                n3 = n2;
                            }
                            if (string != null) break block7;
                            if (n3 != -1) break block8;
                            this.a = this.f();
                            d11 = this.c.get(this.a);
                            if (string != null) break block9;
                            n3 = d11.G() ? 1 : 0;
                        }
                        if (n3 != 0) break block10;
                        int n4 = this.b();
                        if (string != null) break block9;
                        if (n4 != -1) {
                            this.c.set(n4, this.c.get(this.a));
                        }
                    }
                    d11 = this.c.set(this.a, d10);
                }
                if (string == null) break block6;
            }
            this.e(n2);
        }
    }

    public void e(int n2) {
        this.a = this.f();
        d d10 = this.c.get(this.a);
        this.c.set(this.a, this.c.get(n2));
        this.c.set(n2, d10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(i i2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = i2.o().p();
        if (string != null) return bl2;
        if (bl2) {
            return true;
        }
        d d10 = this.a(this.a);
        boolean bl3 = d10.G();
        if (string == null) {
            if (bl3) return false;
            bl3 = d10.a(i2);
        }
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public h(j j2) {
        this.c = a2.a(36, net.minecraft.w.d.m);
        this.e = a2.a(4, net.minecraft.w.d.m);
        this.h = a2.a(1, net.minecraft.w.d.m);
        this.d = Arrays.asList(this.c, this.e, this.h);
        this.b = net.minecraft.w.d.m;
        this.g = j2;
    }

    public d c(int n2) {
        return this.e.get(n2);
    }

    public int c(d d10) {
        int n2;
        block8: {
            int n3;
            String string = net.minecraft.i.g.b();
            int n4 = this.b(this.a(this.a), d10);
            if (string == null) {
                if (n4 != 0) {
                    return this.a;
                }
                n4 = this.b(this.a(40), d10);
            }
            if (string == null) {
                if (n4 != 0) {
                    return 40;
                }
                n4 = n3 = 0;
            }
            while (n3 < this.c.size()) {
                block10: {
                    int n5;
                    block9: {
                        n2 = this.b(this.c.get(n3), d10) ? 1 : 0;
                        if (string != null) break block8;
                        if (string != null) break block9;
                        if (n2 == 0) break block10;
                        n5 = n3;
                    }
                    return n5;
                }
                ++n3;
                if (string == null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }
}

