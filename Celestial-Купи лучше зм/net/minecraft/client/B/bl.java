/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ar.a_;
import net.minecraft.client.Q;
import net.minecraft.client.b.F;
import net.minecraft.client.b.H;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aU;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.bu;
import net.minecraft.client.b.e;
import net.minecraft.client.b.f;
import net.minecraft.client.b.g;
import net.minecraft.client.b.h;
import net.minecraft.client.b.i;
import net.minecraft.client.b.j;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.b.y;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bl
extends bu {
    private /* synthetic */ int x;
    private /* synthetic */ q B;
    private final /* synthetic */ List<aq> C;
    private final /* synthetic */ aU A;
    private final /* synthetic */ a_<q> D;
    private final /* synthetic */ f[][] y;
    private final /* synthetic */ List<e> z;

    @Override
    public boolean b(int n2, int n3, int n4) {
        int n5;
        block4: {
            int n6;
            block5: {
                aJ aJ2;
                block6: {
                    bl bl2;
                    block7: {
                        int n7;
                        n6 = super.b(n2, n3, n4);
                        String[] arrstring = net.minecraft.client.b.q.b();
                        n5 = n7 = this.c(n2, n3);
                        if (arrstring == null) break block4;
                        if (n5 < 0) break block5;
                        aJ2 = this.a(n7);
                        bl2 = this;
                        if (arrstring == null) break block6;
                        if (bl2.B == net.minecraft.client.b.e.b((e)aJ2)) break block7;
                        bl2 = this;
                        if (arrstring == null) break block6;
                        if (bl2.B == null) break block7;
                        bl2 = this;
                        if (arrstring == null) break block6;
                        if (bl2.B instanceof aq) {
                            ((aq)this.B).c(false);
                        }
                    }
                    bl2 = this;
                }
                bl2.B = net.minecraft.client.b.e.b((e)aJ2);
            }
            n5 = n6;
        }
        return n5 != 0;
    }

    private void m() {
        f[][] arrf = this.y;
        String[] arrstring = net.minecraft.client.b.q.b();
        int n2 = arrf.length;
        int n3 = 0;
        block0: while (true) {
            int n4 = n3;
            int n5 = n2;
            block1: while (n4 < n5) {
                f[] arrf2 = arrf[n3];
                int n6 = 0;
                while (n6 < arrf2.length) {
                    block16: {
                        block14: {
                            q q2;
                            q q3;
                            block15: {
                                f f10;
                                f f11;
                                block11: {
                                    block12: {
                                        q q4;
                                        q q5;
                                        block13: {
                                            f f12 = arrf2[n6];
                                            n4 = n6;
                                            n5 = arrf2.length - 1;
                                            if (arrstring == null) continue block1;
                                            f11 = n4 < n5 ? arrf2[n6 + 1] : null;
                                            q5 = this.a(f12, 0, f11 == null);
                                            q3 = this.a(f11, 160, f12 == null);
                                            e e10 = new e(q5, q3);
                                            this.z.add(e10);
                                            f10 = f12;
                                            if (arrstring == null) break block11;
                                            if (f10 == null) break block12;
                                            q4 = q5;
                                            if (arrstring == null) break block13;
                                            if (q4 == null) break block12;
                                            this.D.a(f12.b(), q5);
                                            q4 = q5;
                                        }
                                        boolean bl2 = q4 instanceof aq;
                                        if (arrstring != null && bl2) {
                                            bl2 = this.C.add((aq)q5);
                                        }
                                    }
                                    f10 = f11;
                                }
                                if (f10 == null) break block14;
                                q2 = q3;
                                if (arrstring == null) break block15;
                                if (q2 == null) break block14;
                                this.D.a(f11.b(), q3);
                                if (arrstring == null) break block16;
                                q2 = q3;
                            }
                            if (q2 instanceof aq) {
                                this.C.add((aq)q3);
                            }
                        }
                        n6 += 2;
                    }
                    if (arrstring != null) continue;
                }
                ++n3;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    public q c(int n2) {
        return this.D.f(n2);
    }

    public void g() {
        block3: {
            bl bl2;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                bl2 = this;
                if (arrstring == null) break block2;
                if (bl2.x >= this.y.length - 1) break block3;
                bl2 = this;
            }
            bl2.b(this.x + 1);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q e() {
        return this.B;
    }

    public void a(char c10, int n2) {
        block15: {
            int n3;
            String[] arrstring;
            block17: {
                block18: {
                    int n4;
                    aq aq2;
                    block19: {
                        block29: {
                            int n5;
                            int n6;
                            block27: {
                                block28: {
                                    int n7;
                                    block24: {
                                        block26: {
                                            block25: {
                                                int n8;
                                                block20: {
                                                    block21: {
                                                        block23: {
                                                            block22: {
                                                                block16: {
                                                                    q q2;
                                                                    block14: {
                                                                        arrstring = net.minecraft.client.b.q.b();
                                                                        q2 = this.B;
                                                                        if (arrstring == null) break block14;
                                                                        if (!(q2 instanceof aq)) break block15;
                                                                        q2 = this.B;
                                                                    }
                                                                    aq2 = (aq)q2;
                                                                    n4 = L.d(n2);
                                                                    if (arrstring == null) break block16;
                                                                    if (n4 != 0) break block17;
                                                                    n4 = n2;
                                                                }
                                                                if (arrstring == null) break block18;
                                                                if (n4 != 15) break block19;
                                                                aq2.c(false);
                                                                n7 = this.C.indexOf(this.B);
                                                                n8 = L.o();
                                                                if (arrstring == null) break block20;
                                                                if (n8 == 0) break block21;
                                                                int n9 = n7;
                                                                if (arrstring == null) break block22;
                                                                if (n9 != 0) break block23;
                                                                n9 = n7 = this.C.size() - 1;
                                                            }
                                                            if (arrstring != null) break block24;
                                                        }
                                                        --n7;
                                                        if (arrstring != null) break block24;
                                                    }
                                                    n8 = n7;
                                                }
                                                if (arrstring == null) break block25;
                                                if (n8 != this.C.size() - 1) break block26;
                                                n8 = n7 = 0;
                                            }
                                            if (arrstring != null) break block24;
                                        }
                                        ++n7;
                                    }
                                    this.B = this.C.get(n7);
                                    aq2 = (aq)this.B;
                                    aq2.c(true);
                                    int n10 = aq2.o + this.a;
                                    n3 = aq2.o;
                                    n6 = n10;
                                    n5 = this.o;
                                    if (arrstring == null) break block27;
                                    if (n6 <= n5) break block28;
                                    this.f += (float)(n10 - this.o);
                                    if (arrstring != null) break block29;
                                }
                                n6 = n3;
                                n5 = this.s;
                            }
                            if (n6 < n5) {
                                this.f = n3;
                            }
                        }
                        if (arrstring != null) break block15;
                    }
                    n4 = aq2.a(c10, n2) ? 1 : 0;
                }
                if (arrstring != null) break block15;
            }
            String string = L.l();
            String[] arrstring2 = string.split(";");
            int n11 = n3 = this.C.indexOf(this.B);
            for (String string2 : arrstring2) {
                block32: {
                    block31: {
                        block30: {
                            aq aq3 = this.C.get(n11);
                            aq3.a(string2);
                            aq3.a(aq3.g(), string2);
                            int n12 = n11;
                            if (arrstring == null) break block30;
                            if (n12 != this.C.size() - 1) break block31;
                            n12 = n11 = 0;
                        }
                        if (arrstring != null) break block32;
                    }
                    ++n11;
                }
                if (n11 == n3 && arrstring != null) break;
                if (arrstring != null) continue;
                break;
            }
        }
    }

    private y a(int n2, int n3, h h2) {
        y y2 = new y(this.A, h2.b(), n2, n3, h2.a(), h2.a());
        y2.l = h2.c();
        return y2;
    }

    @Override
    public int j() {
        return 400;
    }

    @Override
    protected int h() {
        return super.h() + 32;
    }

    public int b() {
        return this.x;
    }

    public void d() {
        block3: {
            bl bl2;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                bl2 = this;
                if (arrstring == null) break block2;
                if (bl2.x <= 0) break block3;
                bl2 = this;
            }
            bl2.b(this.x - 1);
        }
    }

    private aq a(int n2, int n3, g g10) {
        aq aq2 = new aq(g10.b(), this.u.a6, n2, n3, 150, 20);
        aq2.a(g10.a());
        aq2.a(this.A);
        aq2.e(g10.c());
        aq2.a(g10.a());
        return aq2;
    }

    @Nullable
    private q a(@Nullable f f10, int n2, boolean bl2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl3 = f10 instanceof j;
        if (arrstring != null) {
            if (bl3) {
                return this.a(this.k / 2 - 155 + n2, 0, (j)f10);
            }
            bl3 = f10 instanceof h;
        }
        if (arrstring != null) {
            if (bl3) {
                return this.a(this.k / 2 - 155 + n2, 0, (h)f10);
            }
            bl3 = f10 instanceof g;
        }
        if (arrstring != null) {
            if (bl3) {
                return this.a(this.k / 2 - 155 + n2, 0, (g)f10);
            }
            bl3 = f10 instanceof i;
        }
        return bl3 ? this.a(this.k / 2 - 155 + n2, 0, (i)f10, bl2) : null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void h() {
        v0 = net.minecraft.client.b.q.b();
        this.z.clear();
        var1_1 = v0;
        var2_2 = 0;
        do {
            if (var2_2 >= this.y[this.x].length) return;
            var3_3 = this.y[this.x][var2_2];
            var4_4 = var2_2 < this.y[this.x].length - 1 ? this.y[this.x][var2_2 + 1] : null;
            var5_5 = this.D.f(var3_3.b());
            v1 = var4_4;
            if (var1_1 == null) ** GOTO lbl14
            if (v1 != null) {
                v1 = this.D.f(var4_4.b());
lbl14:
                // 2 sources

                v2 = (q)v1;
            } else {
                v2 = null;
            }
            var6_6 = v2;
            var7_7 = new e(var5_5, var6_6);
            this.z.add(var7_7);
            var2_2 += 2;
        } while (var1_1 != null);
    }

    @Override
    public int d() {
        return this.z.size();
    }

    public void c(boolean bl2) {
        Iterator<e> iterator = this.z.iterator();
        String[] arrstring = net.minecraft.client.b.q.b();
        while (iterator.hasNext()) {
            block7: {
                block6: {
                    q q2;
                    boolean bl3;
                    e e10;
                    block5: {
                        e10 = iterator.next();
                        bl3 = net.minecraft.client.b.e.c(e10) instanceof s;
                        if (arrstring == null) break block5;
                        if (bl3) {
                            ((s)net.minecraft.client.b.e.c((e)e10)).h = bl2;
                        }
                        q2 = net.minecraft.client.b.e.a(e10);
                        if (arrstring == null) break block6;
                        bl3 = q2 instanceof s;
                    }
                    if (!bl3) break block7;
                    q2 = net.minecraft.client.b.e.a(e10);
                }
                ((s)q2).h = bl2;
            }
            if (arrstring != null) continue;
        }
    }

    @Override
    public e a(int n2) {
        return this.z.get(n2);
    }

    private void a(q q2, boolean bl2) {
        block4: {
            block7: {
                q q3;
                boolean bl3;
                block5: {
                    String[] arrstring;
                    block6: {
                        block2: {
                            block3: {
                                arrstring = net.minecraft.client.b.q.b();
                                bl3 = q2 instanceof s;
                                if (arrstring == null) break block2;
                                if (!bl3) break block3;
                                ((s)q2).l = bl2;
                                if (arrstring != null) break block4;
                            }
                            bl3 = q2 instanceof aq;
                        }
                        if (arrstring == null) break block5;
                        if (!bl3) break block6;
                        ((aq)q2).e(bl2);
                        if (arrstring != null) break block4;
                    }
                    q3 = q2;
                    if (arrstring == null) break block7;
                    bl3 = q3 instanceof H;
                }
                if (!bl3) break block4;
                q3 = q2;
            }
            ((H)q3).n = bl2;
        }
    }

    public bl(Q q2, int n2, int n3, int n4, int n5, int n6, aU aU2, f[] ... arrf) {
        super(q2, n2, n3, n4, n5, n6);
        this.z = Lists.newArrayList();
        this.D = new a_();
        this.C = Lists.newArrayList();
        this.A = aU2;
        this.y = arrf;
        this.b = false;
        this.m();
        this.h();
    }

    private H a(int n2, int n3, i i2, boolean bl2) {
        H h2;
        block3: {
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                if (!bl2) break block2;
                h2 = new H(this.u.a6, i2.b(), n2, n3, this.k - n2 * 2, 20, -1);
                if (arrstring != null) break block3;
            }
            h2 = new H(this.u.a6, i2.b(), n2, n3, 150, 20, -1);
        }
        h2.n = i2.c();
        h2.a(i2.a());
        h2.a();
        return h2;
    }

    public void b(int n2) {
        block3: {
            int n3;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                n3 = n2;
                if (arrstring == null) break block2;
                if (n3 == this.x) break block3;
                n3 = this.x;
            }
            int n4 = n3;
            this.x = n2;
            this.h();
            this.c(n4, n2);
            this.f = 0.0f;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void c(int var1_1, int var2_2) {
        var4_3 = this.y[var1_1];
        var3_4 = net.minecraft.client.b.q.b();
        var5_5 = var4_3.length;
        var6_6 = 0;
        while (var6_6 < var5_5) {
            block6: {
                var7_7 = var4_3[var6_6];
                if (var3_4 == null) break block6;
                v0 = var7_7;
                if (var3_4 == null) ** GOTO lbl24
                if (v0 != null) {
                    this.a(this.D.f(var7_7.b()), false);
                }
                ++var6_6;
            }
            if (var3_4 != null) continue;
        }
        var4_3 = this.y[var2_2];
        var5_5 = var4_3.length;
        var6_6 = 0;
        do {
            if (var6_6 >= var5_5) return;
            var7_7 = var4_3[var6_6];
            if (var3_4 == null) continue;
            v0 = var7_7;
lbl24:
            // 2 sources

            if (v0 != null) {
                this.a(this.D.f(var7_7.b()), true);
            }
            ++var6_6;
        } while (var3_4 != null);
    }

    private F a(int n2, int n3, j j2) {
        F f10 = new F(this.A, j2.b(), n2, n3, j2.a(), j2.c(), j2.a(), j2.d(), j2.b());
        f10.l = j2.c();
        return f10;
    }

    public int l() {
        return this.y.length;
    }
}

