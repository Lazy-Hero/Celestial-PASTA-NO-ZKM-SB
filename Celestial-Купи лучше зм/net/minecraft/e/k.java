/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.util.Iterator;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.e.a;
import net.minecraft.e.d;
import net.minecraft.e.f;
import net.minecraft.e.h;
import net.minecraft.e.i;
import net.minecraft.e.o;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
extends i {
    private /* synthetic */ boolean t;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(l var1_1, l var2_2, int var3_3, int var4_4, int var5_5) {
        var7_6 = net.minecraft.k.h.f(var1_1.e);
        var8_7 = net.minecraft.k.h.f(var1_1.b);
        var9_8 = var2_2.e - var1_1.e;
        var11_9 = var2_2.b - var1_1.b;
        var6_10 = i.g();
        v0 = var13_11 = var9_8 * var9_8 + var11_9 * var11_9;
        v1 = 1.0E-8;
        if (var6_10 == 0) {
            if (v0 < v1) {
                return false;
            }
            v0 = 1.0;
            v1 = Math.sqrt(var13_11);
        }
        var15_12 = v0 / v1;
        v2 = this.a(var7_6, (int)var1_1.d, var8_7, var3_3 += 2, var4_4, var5_5 += 2, var1_1, var9_8 *= var15_12, var11_9 *= var15_12);
        if (var6_10 == 0) {
            if (v2 == 0) {
                return false;
            }
            var3_3 -= 2;
            v2 = var5_5 - 2;
        }
        var5_5 = v2 ? 1 : 0;
        var17_13 = 1.0 / Math.abs(var9_8);
        var19_14 = 1.0 / Math.abs(var11_9);
        var21_15 = (double)var7_6 - var1_1.e;
        var23_16 = (double)var8_7 - var1_1.b;
        cfr_temp_0 = var9_8 - 0.0;
        v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
        if (var6_10 == 0) {
            if (v3 >= 0) {
                var21_15 += 1.0;
            }
            v3 = (cfr_temp_1 = var11_9 - 0.0) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
        }
        if (var6_10 == 0) {
            if (v3 >= 0) {
                var23_16 += 1.0;
            }
            var21_15 /= var9_8;
            var23_16 /= var11_9;
            cfr_temp_2 = var9_8 - 0.0;
            v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
        }
        if (var6_10 == 0) {
            v3 = v3 < 0 ? (double)-1 : (double)true;
        }
        var25_17 = v3;
        cfr_temp_3 = var11_9 - 0.0;
        v4 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
        if (var6_10 == 0) {
            v4 = v4 < 0 ? (double)-1 : (double)true;
        }
        var26_18 = v4;
        var27_19 = net.minecraft.k.h.f(var2_2.e);
        var28_20 = net.minecraft.k.h.f(var2_2.b);
        var29_21 = var27_19 - var7_6;
        var30_22 = var28_20 - var8_7;
        block0: while (true) {
            if (var29_21 * var25_17 > 0) ** GOTO lbl57
            v5 = var30_22 * var26_18;
            do {
                block18: {
                    block16: {
                        block17: {
                            if (var6_10 != 0) return v5;
                            if (v5 <= false) {
                                return true;
                            }
lbl57:
                            // 3 sources

                            v6 = var21_15 == var23_16 ? 0 : (var21_15 < var23_16 ? -1 : 1);
                            if (var6_10 != 0) break block16;
                            if (v6 >= 0) break block17;
                            var21_15 += var17_13;
                            var29_21 = var27_19 - (var7_6 += var25_17);
                            if (var6_10 == 0) break block18;
                        }
                        var23_16 += var19_14;
                        v6 = var28_20 - (var8_7 += var26_18);
                    }
                    var30_22 = (int)v6;
                }
                if (this.a(var7_6, (int)var1_1.d, var8_7, var3_3, var4_4, var5_5, var1_1, var9_8, var11_9)) continue block0;
                v7 = false;
            } while (var6_10 != 0);
            break;
        }
        return v7;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public h b(n var1_1) {
        block6: {
            block7: {
                var2_2 = i.g();
                v0 = this.r.d(var1_1).o();
                if (var2_2 != 0) break block6;
                if (v0 != net.minecraft.ac.c.A) break block7;
                var3_3 = var1_1.k();
                while (var3_3.b() > 0) {
                    v0 = this.r.d(var3_3).o();
                    v1 = net.minecraft.ac.c.A;
                    if (var2_2 == 0) {
                        if (v0 != v1) break;
                        var3_3 = var3_3.k();
                        if (var2_2 == 0) continue;
                    }
                    ** GOTO lbl24
                }
                v2 = var3_3.b();
                if (var2_2 != 0) ** GOTO lbl20
                if (v2 > 0) {
                    return super.b(var3_3.a());
                }
                do {
                    v2 = var3_3.b();
lbl20:
                    // 2 sources

                    if (v2 >= this.r.i()) break;
                    v0 = this.r.d(var3_3).o();
                    if (var2_2 != 0) break block6;
                    v1 = net.minecraft.ac.c.A;
lbl24:
                    // 2 sources

                    if (v0 != v1) break;
                    var3_3 = var3_3.a();
                } while (var2_2 == 0);
                var1_1 = var3_3;
            }
            v3 = this;
            if (var2_2 != 0) return super.b(var1_1);
            v0 = v3.r.d(var1_1).o();
        }
        if (!v0.d()) {
            v3 = this;
            return super.b(var1_1);
        }
        var3_3 = var1_1.a();
        while (var3_3.b() < this.r.i()) {
            v4 = this;
            if (var2_2 != 0) return super.b(var3_3);
            if (var2_2 != 0) return super.b(var3_3);
            if (!v4.r.d(var3_3).o().d()) break;
            var3_3 = var3_3.a();
            if (var2_2 == 0) continue;
        }
        v4 = this;
        return super.b(var3_3);
    }

    public void d(boolean bl2) {
        this.b.a(bl2);
    }

    @Override
    protected o l() {
        this.b = new d();
        this.b.c(true);
        return new o(this.b);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, l l2, double d10, double d11) {
        int n8;
        block18: {
            int n9 = n2 - n5 / 2;
            int n10 = i.g();
            int n11 = n4 - n7 / 2;
            int n12 = this.b(n9, n3, n11, n5, n6, n7, l2, d10, d11);
            if (n10 == 0) {
                if (n12 == 0) {
                    return false;
                }
                n12 = n9;
            }
            int n13 = n12;
            block0: while (true) {
                int n14 = n13;
                block1: while (n14 < n9 + n5) {
                    n8 = n11;
                    if (n10 != 0) break block18;
                    int n15 = n8;
                    while (n15 < n11 + n7) {
                        block19: {
                            block20: {
                                block27: {
                                    a a10;
                                    a a11;
                                    block28: {
                                        a a12;
                                        block26: {
                                            block25: {
                                                float f10;
                                                block23: {
                                                    block24: {
                                                        a a13;
                                                        block22: {
                                                            a a14;
                                                            block21: {
                                                                double d12 = (double)n13 + 0.5 - l2.e;
                                                                double d13 = (double)n15 + 0.5 - l2.b;
                                                                if (n10 != 0) break block19;
                                                                double d14 = d12 * d10 + d13 * d11 - 0.0;
                                                                n14 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                                                if (n10 != 0) continue block1;
                                                                if (n14 < 0) break block20;
                                                                a13 = a12 = this.b.a(this.r, n13, n3 - 1, n15, this.j, n5, n6, n7, true, true);
                                                                a14 = net.minecraft.e.a.WATER;
                                                                if (n10 == 0) {
                                                                    if (a13 == a14) {
                                                                        return false;
                                                                    }
                                                                    a13 = a12;
                                                                    a14 = net.minecraft.e.a.LAVA;
                                                                }
                                                                if (n10 != 0) break block21;
                                                                if (a13 == a14) {
                                                                    return false;
                                                                }
                                                                a13 = a12;
                                                                if (n10 != 0) break block22;
                                                                a14 = net.minecraft.e.a.OPEN;
                                                            }
                                                            if (a13 == a14) {
                                                                return false;
                                                            }
                                                            a13 = this.b.a(this.r, n13, n3, n15, this.j, n5, n6, n7, true, true);
                                                        }
                                                        a12 = a13;
                                                        float f11 = this.j.a(a12);
                                                        float f12 = f11 - 0.0f;
                                                        f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                                        if (n10 != 0) break block23;
                                                        if (f10 < 0) break block24;
                                                        float f13 = f11 - 8.0f;
                                                        f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                        if (n10 != 0) break block23;
                                                        if (f10 < 0) break block25;
                                                    }
                                                    f10 = 0.0f;
                                                }
                                                return (boolean)f10;
                                            }
                                            a11 = a12;
                                            a10 = net.minecraft.e.a.DAMAGE_FIRE;
                                            if (n10 != 0) break block26;
                                            if (a11 == a10) break block27;
                                            a11 = a12;
                                            a10 = net.minecraft.e.a.DANGER_FIRE;
                                        }
                                        if (n10 != 0) break block28;
                                        if (a11 == a10) break block27;
                                        a11 = a12;
                                        a10 = net.minecraft.e.a.DAMAGE_OTHER;
                                    }
                                    if (a11 != a10) break block20;
                                }
                                return false;
                            }
                            ++n15;
                        }
                        if (n10 == 0) continue;
                    }
                    ++n13;
                    if (n10 == 0) continue block0;
                }
                break;
            }
            n8 = 1;
        }
        return n8 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean h() {
        int n2 = i.n();
        boolean bl2 = this.j.A;
        if (n2 == 0) return bl2;
        if (bl2) return true;
        bl2 = this.a();
        if (n2 != 0) {
            if (bl2) {
                bl2 = this.j();
                if (n2 == 0) return bl2;
                if (bl2) return true;
            }
            bl2 = this.j.N();
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public k(C c10, z z2) {
        super(c10, z2);
    }

    private int b() {
        int n2;
        block4: {
            block5: {
                int n3;
                block6: {
                    int n4;
                    block3: {
                        int n5 = i.g();
                        n2 = this.j.aj();
                        if (n5 != 0) break block4;
                        if (n2 == 0) break block5;
                        n2 = this.a() ? 1 : 0;
                        if (n5 != 0) break block4;
                        if (n2 == 0) break block5;
                        n4 = (int)this.j.m().b;
                        K k2 = this.r.d(new n(net.minecraft.k.h.f(this.j.a), n4, net.minecraft.k.h.f(this.j.ax))).b();
                        int n6 = 0;
                        do {
                            K k3;
                            if (k2 != g.cL) {
                                k3 = k2;
                                if (n5 != 0) continue;
                                if (k3 != g.bQ) break block3;
                            }
                            k3 = k2 = this.r.d(new n(net.minecraft.k.h.f(this.j.a), ++n4, net.minecraft.k.h.f(this.j.ax))).b();
                        } while (++n6 <= 16);
                        n3 = (int)this.j.m().b;
                        if (n5 == 0) {
                            return n3;
                        }
                        break block6;
                    }
                    n3 = n4;
                }
                return n3;
            }
            n2 = (int)(this.j.m().b + 0.5);
        }
        return n2;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    public h a(x x2) {
        return this.b(new n(x2));
    }

    public void a(boolean bl2) {
        this.b.b(bl2);
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, l l2, double d10, double d11) {
        int n8;
        block3: {
            Iterator<n> iterator = n.b(new n(n2, n3, n4), new n(n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1)).iterator();
            int n9 = i.n();
            while (iterator.hasNext()) {
                block4: {
                    boolean bl2;
                    block5: {
                        n n10 = iterator.next();
                        double d12 = (double)n10.e() + 0.5 - l2.e;
                        double d13 = (double)n10.a() + 0.5 - l2.b;
                        double d14 = d12 * d10 + d13 * d11 - 0.0;
                        n8 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                        if (n9 == 0) break block3;
                        if (n8 < 0) break block4;
                        K k2 = this.r.d(n10).b();
                        bl2 = k2.a((t)this.r, n10);
                        if (n9 == 0) break block5;
                        if (bl2) break block4;
                        bl2 = false;
                    }
                    return bl2;
                }
                if (n9 != 0) continue;
            }
            n8 = 1;
        }
        return n8 != 0;
    }

    @Override
    protected l q() {
        return new l(this.j.a, this.b(), this.j.ax);
    }

    public boolean a() {
        return this.b.c();
    }

    @Override
    protected void a() {
        block9: {
            int n2;
            int n3;
            int n4;
            block8: {
                int n5 = i.n();
                super.a();
                n4 = n5;
                n3 = this.t;
                if (n4 == 0) break block8;
                if (n3 == 0) break block9;
                n3 = this.r.w(new n(net.minecraft.k.h.f(this.j.a), (int)(this.j.m().b + 0.5), net.minecraft.k.h.f(this.j.ax))) ? 1 : 0;
            }
            if (n4 != 0) {
                if (n3 != 0) {
                    return;
                }
                n3 = n2 = 0;
            }
            while (n2 < this.c.f()) {
                f f10 = this.c.b(n2);
                if (n4 != 0) {
                    if (this.r.w(new n(f10.g, f10.m, f10.f))) {
                        this.c.c(n2 - 1);
                        return;
                    }
                    ++n2;
                }
                if (n4 != 0) continue;
            }
        }
    }

    public boolean c() {
        return this.b.d();
    }

    public void c(boolean bl2) {
        this.b.c(bl2);
    }

    public void b(boolean bl2) {
        this.t = bl2;
    }
}

