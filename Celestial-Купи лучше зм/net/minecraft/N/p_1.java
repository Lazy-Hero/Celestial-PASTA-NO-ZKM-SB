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
import net.minecraft.N.j;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.C;
import net.minecraft.ah.z;
import net.minecraft.ar.aD;
import net.minecraft.ar.aH;
import net.minecraft.ar.al;
import net.minecraft.ar.v;
import net.minecraft.ar.x;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

public abstract class p {
    private final /* synthetic */ List<x> h;
    private /* synthetic */ int e;
    private /* synthetic */ net.minecraft.U.x g;
    private /* synthetic */ x f;
    private /* synthetic */ int d;
    private /* synthetic */ int b;
    private /* synthetic */ int i;
    private /* synthetic */ double l;
    private /* synthetic */ int j;
    private /* synthetic */ double k;
    private /* synthetic */ int a;
    private /* synthetic */ int c;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void f() {
        block34: {
            var1_1 = net.minecraft.N.j.f();
            v0 = this;
            if (var1_1 == null) {
                if (!v0.b()) {
                    this.k = this.l;
                    if (var1_1 == null) return;
                }
                v0 = this;
            }
            var2_2 = v0.h();
            v1 = this.c().C;
            if (var1_1 == null) {
                if (v1 != 0) {
                    var3_3 = (float)var2_2.e() + this.c().J.nextFloat();
                    var5_5 = (float)var2_2.b() + this.c().J.nextFloat();
                    var7_7 = (float)var2_2.a() + this.c().J.nextFloat();
                    this.c().a(aH.SMOKE_NORMAL, var3_3, var5_5, var7_7, 0.0, 0.0, 0.0, new int[0]);
                    this.c().a(aH.FLAME, var3_3, var5_5, var7_7, 0.0, 0.0, 0.0, new int[0]);
                    v2 = this;
                    if (var1_1 == null) {
                        if (v2.b > 0) {
                            --this.b;
                        }
                        this.k = this.l;
                        v2 = this;
                    }
                    v2.l = (this.l + (double)(1000.0f / ((float)this.b + 200.0f))) % 360.0;
                    if (var1_1 == null) return;
                }
                v1 = this.b;
            }
            if (var1_1 == null) {
                if (v1 == -1) {
                    this.g();
                }
                v1 = this.b;
            }
            if (var1_1 == null) {
                if (v1 > 0) {
                    --this.b;
                    return;
                }
                v1 = 0;
            }
            var3_4 = v1;
            for (var4_9 = 0; var4_9 < this.e; ++var4_9) {
                block41: {
                    block40: {
                        block39: {
                            block37: {
                                block38: {
                                    block36: {
                                        block35: {
                                            var5_6 = this.f.b();
                                            var6_10 = var5_6.c("Pos", 6);
                                            var7_8 = this.c();
                                            v3 = var8_11 = var6_10.b();
                                            if (var1_1 != null) break block34;
                                            if (var1_1 != null) ** GOTO lbl47
                                            if (v3 >= 1) {
                                                v4 = var6_10.g(0);
                                            } else {
                                                v5 = var2_2.e();
lbl47:
                                                // 2 sources

                                                v4 = (double)v5 + (var7_8.J.nextDouble() - var7_8.J.nextDouble()) * (double)this.a + 0.5;
                                            }
                                            var9_12 = v4;
                                            v6 = var8_11;
                                            v7 = 2;
                                            if (var1_1 != null) ** GOTO lbl57
                                            if (v6 >= v7) {
                                                v8 = var6_10.g(1);
                                            } else {
                                                v6 = var2_2.b() + var7_8.J.nextInt(3);
                                                v7 = 1;
lbl57:
                                                // 2 sources

                                                v8 = v6 - v7;
                                            }
                                            var11_13 = v8;
                                            v9 = var8_11;
                                            if (var1_1 != null) ** GOTO lbl65
                                            if (v9 >= 3) {
                                                v10 = var6_10.g(2);
                                            } else {
                                                v9 = var2_2.a();
lbl65:
                                                // 2 sources

                                                v10 = (double)v9 + (var7_8.J.nextDouble() - var7_8.J.nextDouble()) * (double)this.a + 0.5;
                                            }
                                            var13_14 = v10;
                                            var15_15 = net.minecraft.t.j.a(var5_6, var7_8, var9_12, var11_13, var13_14, false);
                                            if (var15_15 == null) {
                                                return;
                                            }
                                            v11 = var16_16 = var7_8.a(var15_15.getClass(), new k(var2_2.e(), var2_2.b(), var2_2.a(), var2_2.e() + 1, var2_2.b() + 1, var2_2.a() + 1).a(this.a)).size();
                                            if (var1_1 != null) break block35;
                                            if (v11 >= this.d) {
                                                this.g();
                                                return;
                                            }
                                            v12 = var15_15;
                                            if (var1_1 != null) ** GOTO lbl81
                                            v11 = v12 instanceof C;
                                        }
                                        if (v11 != 0) {
                                            v12 = var15_15;
lbl81:
                                            // 2 sources

                                            v13 = (C)v12;
                                        } else {
                                            v13 = null;
                                        }
                                        var17_17 = v13;
                                        var15_15.c(var15_15.a, var15_15.aF, var15_15.ax, var7_8.J.nextFloat() * 360.0f, 0.0f);
                                        v14 = var17_17;
                                        if (var1_1 != null) ** GOTO lbl90
                                        if (v14 != null) {
                                            v14 = var17_17;
lbl90:
                                            // 2 sources

                                            v15 = v14.C();
                                            if (var1_1 == null) {
                                                if (v15 == 0) continue;
                                                v15 = var17_17.u() ? 1 : 0;
                                            }
                                            if (var1_1 == null) {
                                                if (v15 == 0) continue;
                                            }
                                        } else {
                                            v15 = this.f.b().e();
                                        }
                                        if (var1_1 != null) break block36;
                                        if (v15 != 1) break block37;
                                        v15 = this.f.b().a("id", 8) ? 1 : 0;
                                    }
                                    if (var1_1 != null) break block38;
                                    if (v15 == 0) break block37;
                                    v16 = var15_15;
                                    if (var1_1 != null) break block39;
                                    v15 = v16 instanceof C;
                                }
                                if (v15 != 0) {
                                    ((C)var15_15).a(var7_8.h(new n(var15_15)), null);
                                }
                            }
                            v16 = var15_15;
                        }
                        net.minecraft.t.j.a(v16, var7_8);
                        var7_8.b(2004, var2_2, 0);
                        v17 = var17_17;
                        if (var1_1 != null) break block40;
                        if (v17 == null) break block41;
                        v17 = var17_17;
                    }
                    v17.Z();
                }
                var3_4 = 1;
                if (var1_1 == null) continue;
            }
            v3 = var3_4;
        }
        if (v3 == 0) return;
        this.g();
    }

    @Nullable
    private v d() {
        String string = this.f.b().j("id");
        return aD.a(string) ? null : new v(string);
    }

    public void a(@Nullable v v2) {
        block0: {
            if (v2 == null) break block0;
            this.f.b().a("id", v2.toString());
        }
    }

    private boolean b() {
        n n2 = this.h();
        return this.c().a((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5, (double)this.c);
    }

    public abstract z c();

    private static gP a(gP gP2) {
        return gP2;
    }

    public net.minecraft.U.x a() {
        net.minecraft.U.x x2;
        block4: {
            p p2;
            block6: {
                block5: {
                    m[] arrm = net.minecraft.N.j.f();
                    x2 = this.g;
                    if (arrm != null) break block4;
                    if (x2 != null) break block5;
                    this.g = net.minecraft.t.j.a(this.f.b(), this.c(), false);
                    p2 = this;
                    if (arrm != null) break block6;
                    if (p2.f.b().e() != 1) break block5;
                    p2 = this;
                    if (arrm != null) break block6;
                    if (!p2.f.b().a("id", 8)) break block5;
                    x2 = this.g;
                    if (arrm != null) break block4;
                    if (x2 instanceof C) {
                        ((C)this.g).a(this.c().h(new n(this.g)), null);
                    }
                }
                p2 = this;
            }
            x2 = p2.g;
        }
        return x2;
    }

    public abstract void a(int var1);

    public abstract n h();

    public p() {
        this.b = 20;
        this.h = Lists.newArrayList();
        this.f = new x();
        this.j = 200;
        this.i = 800;
        this.e = 4;
        this.d = 6;
        this.c = 16;
        this.a = 4;
    }

    public double i() {
        return this.l;
    }

    private void g() {
        m[] arrm;
        block7: {
            int n2;
            int n3;
            block5: {
                block6: {
                    arrm = net.minecraft.N.j.f();
                    n3 = this.i;
                    n2 = this.j;
                    if (arrm != null) break block5;
                    if (n3 > n2) break block6;
                    this.b = this.j;
                    if (arrm == null) break block7;
                }
                n3 = this.i;
                n2 = this.j;
            }
            int n4 = n3 - n2;
            this.b = this.j + this.c().J.nextInt(n4);
        }
        p p2 = this;
        if (arrm == null) {
            if (!p2.h.isEmpty()) {
                this.a(al.a(this.c().J, this.h));
            }
            p2 = this;
        }
        p2.a(1);
    }

    public void a(r r2) {
        block25: {
            block24: {
                boolean bl2;
                m[] arrm;
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                this.b = r2.q("Delay");
                                m[] arrm2 = net.minecraft.N.j.f();
                                this.h.clear();
                                arrm = arrm2;
                                bl2 = r2.a("SpawnPotentials", 9);
                                if (arrm == null) {
                                    if (bl2) {
                                        u u2 = r2.c("SpawnPotentials", 10);
                                        for (int i2 = 0; i2 < u2.b(); ++i2) {
                                            this.h.add(new x(u2.d(i2)));
                                            if (arrm == null) {
                                                if (arrm == null) continue;
                                            }
                                            break block20;
                                        }
                                    }
                                    bl2 = r2.a("SpawnData", 10);
                                }
                                if (arrm != null) break block21;
                                if (!bl2) break block20;
                                this.a(new x(1, r2.h("SpawnData")));
                                if (arrm == null) break block22;
                            }
                            bl2 = this.h.isEmpty();
                        }
                        if (arrm != null) break block23;
                        if (!bl2) {
                            this.a(al.a(this.c().J, this.h));
                        }
                    }
                    bl2 = r2.a("MinSpawnDelay", 99);
                }
                if (arrm == null) {
                    if (bl2) {
                        this.j = r2.q("MinSpawnDelay");
                        this.i = r2.q("MaxSpawnDelay");
                        this.e = r2.q("SpawnCount");
                    }
                    bl2 = r2.a("MaxNearbyEntities", 99);
                }
                if (arrm == null) {
                    if (bl2) {
                        this.d = r2.q("MaxNearbyEntities");
                        this.c = r2.q("RequiredPlayerRange");
                    }
                    bl2 = r2.a("SpawnRange", 99);
                }
                if (bl2) {
                    this.a = r2.q("SpawnRange");
                }
                p p2 = this;
                if (arrm != null) break block24;
                if (p2.c() == null) break block25;
                p2 = this;
            }
            p2.g = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm != null) return bl2;
        if (!bl2) return false;
        bl2 = this.c().C;
        if (arrm != null) return bl2;
        if (!bl2) return false;
        this.b = this.j;
        return true;
    }

    public double e() {
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public r b(r r2) {
        u u2;
        block8: {
            List<x> list;
            m[] arrm;
            block6: {
                block7: {
                    v v2 = this.d();
                    arrm = net.minecraft.N.j.f();
                    if (arrm == null) {
                        if (v2 == null) {
                            return r2;
                        }
                        r2.a("Delay", (short)this.b);
                        r2.a("MinSpawnDelay", (short)this.j);
                        r2.a("MaxSpawnDelay", (short)this.i);
                        r2.a("SpawnCount", (short)this.e);
                        r2.a("MaxNearbyEntities", (short)this.d);
                        r2.a("RequiredPlayerRange", (short)this.c);
                        r2.a("SpawnRange", (short)this.a);
                        r2.a("SpawnData", this.f.b().c());
                    }
                    u2 = new u();
                    list = this.h;
                    if (arrm != null) break block6;
                    if (!list.isEmpty()) break block7;
                    u2.a(this.f.a());
                    if (arrm == null) break block8;
                }
                list = this.h;
            }
            for (x x2 : list) {
                u2.a(x2.a());
                if (arrm != null) return r2;
                if (arrm == null) continue;
            }
        }
        r2.a("SpawnPotentials", u2);
        return r2;
    }

    public void a(x x2) {
        this.f = x2;
    }
}

