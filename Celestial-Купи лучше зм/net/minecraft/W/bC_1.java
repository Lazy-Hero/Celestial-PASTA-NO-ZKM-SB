/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cT;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ae.c;
import net.minecraft.ae.f;
import net.minecraft.ah.H;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;

public class bC
extends K {
    public static final /* synthetic */ c F;
    public static final /* synthetic */ c B;
    private final /* synthetic */ Map<K, Integer> C;
    public static final /* synthetic */ c D;
    public static final /* synthetic */ f G;
    private final /* synthetic */ Map<K, Integer> E;
    public static final /* synthetic */ c z;
    public static final /* synthetic */ c A;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int c(K k2) {
        Integer n2 = this.E.get(k2);
        boolean bl2 = cL.e();
        Integer n3 = n2;
        if (bl2) {
            if (n3 == null) {
                return 0;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }

    private boolean d(z z2, n n2) {
        boolean bl2;
        block4: {
            aA[] arraA = aA.values();
            boolean bl3 = cL.e();
            int n3 = arraA.length;
            int n4 = 0;
            while (n4 < n3) {
                aA aA2 = arraA[n4];
                if (bl3) {
                    bl2 = this.c((t)z2, n2.a(aA2));
                    if (!bl3) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n4;
                }
                if (bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        bC bC2;
        block5: {
            block4: {
                boolean bl2;
                block3: {
                    boolean bl3 = cL.e();
                    bl2 = t2.d(n2.k()).d();
                    if (!bl3) break block3;
                    if (bl2) break block4;
                    bC2 = g.C;
                    if (!bl3) break block5;
                    bl2 = bC2.c(t2, n2.k());
                }
                if (!bl2) {
                    i3 = i2.a(D, this.c(t2, n2.i())).a(z, this.c(t2, n2.m())).a(B, this.c(t2, n2.j())).a(F, this.c(t2, n2.b())).a(A, this.c(t2, n2.a()));
                    return i3;
                }
            }
            bC2 = this;
        }
        i3 = bC2.d();
        return i3;
    }

    public static void b() {
        g.C.a(g.cB, 5, 20);
        g.C.a(g.f, 5, 20);
        g.C.a(g.e, 5, 20);
        g.C.a(g.dp, 5, 20);
        g.C.a(g.aq, 5, 20);
        g.C.a(g.O, 5, 20);
        g.C.a(g.cJ, 5, 20);
        g.C.a(g.cC, 5, 20);
        boolean bl2 = cL.b();
        g.C.a(g.bI, 5, 20);
        g.C.a(g.bt, 5, 20);
        g.C.a(g.cN, 5, 20);
        g.C.a(g.q, 5, 20);
        g.C.a(g.bd, 5, 20);
        g.C.a(g.bs, 5, 20);
        boolean bl3 = bl2;
        g.C.a(g.aa, 5, 20);
        g.C.a(g.aX, 5, 20);
        g.C.a(g.bA, 5, 20);
        g.C.a(g.aT, 5, 20);
        g.C.a(g.al, 5, 20);
        g.C.a(g.co, 5, 20);
        g.C.a(g.am, 5, 20);
        g.C.a(g.bu, 5, 5);
        g.C.a(g.aB, 5, 5);
        g.C.a(g.bU, 30, 60);
        g.C.a(g.S, 30, 60);
        g.C.a(g.c8, 30, 20);
        g.C.a(g.cR, 15, 100);
        g.C.a(g.dc, 60, 100);
        g.C.a(g.bW, 60, 100);
        g.C.a(g.cZ, 60, 100);
        g.C.a(g.cj, 60, 100);
        g.C.a(g.b9, 60, 100);
        g.C.a(g.s, 30, 60);
        g.C.a(g.aW, 15, 100);
        g.C.a(g.r, 5, 5);
        g.C.a(g.aL, 60, 20);
        g.C.a(g.D, 60, 20);
        if (net.minecraft.k.m.c()) {
            cL.b(!bl3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.d(n2.k()).d();
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.d(z2, n2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block4: {
            n n3;
            z z3;
            block5: {
                block6: {
                    boolean bl2;
                    block7: {
                        int n4;
                        block2: {
                            block3: {
                                bl2 = cL.b();
                                n4 = z2.D.r().a();
                                if (bl2) break block2;
                                if (n4 > 0) break block3;
                                n4 = g.aN.b(z2, n2) ? 1 : 0;
                                if (bl2) break block2;
                                if (n4 != 0) break block4;
                            }
                            z3 = z2;
                            n3 = n2.k();
                            if (bl2) break block5;
                            n4 = z3.d(n3).d() ? 1 : 0;
                        }
                        if (n4 != 0) break block6;
                        boolean bl3 = this.d(z2, n2);
                        if (bl2) break block7;
                        if (bl3) break block6;
                        bl3 = z2.v(n2);
                    }
                    if (!bl2) break block4;
                }
                z3 = z2;
                n3 = n2;
            }
            z3.a(n3, (K)this, this.a(z2) + z2.J.nextInt(10));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean b(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.t(n2);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = z2.t(n2.b());
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = z2.t(n2.m());
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = z2.t(n2.i());
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = z2.t(n2.j());
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(K k2) {
        Integer n2 = this.C.get(k2);
        boolean bl2 = cL.e();
        Integer n3 = n2;
        if (bl2) {
            if (n3 == null) {
                return 0;
            }
            n3 = n2;
        }
        int n4 = n3;
        return n4;
    }

    public void a(K k2, int n2, int n3) {
        this.C.put(k2, n2);
        this.E.put(k2, n3);
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            boolean bl3;
            block4: {
                bl3 = cL.b();
                bl2 = z2.d(n2.k()).d();
                if (bl3) break block4;
                if (bl2) break block5;
                bl2 = this.d(z2, n2);
            }
            if (!bl3 && !bl2) {
                bl2 = z2.v(n2);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        G = f.a("age", 0, 15);
        D = net.minecraft.ae.c.a("north");
        z = net.minecraft.ae.c.a("east");
        B = net.minecraft.ae.c.a("south");
        F = net.minecraft.ae.c.a("west");
        A = net.minecraft.ae.c.a("up");
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, G, D, z, B, F, A);
    }

    @Override
    public a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.X;
    }

    @Override
    public int d(i i2) {
        return i2.b(G);
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    private void a(z z2, n n2, int n3, Random random, int n4) {
        block8: {
            K k2;
            i i2;
            block11: {
                boolean bl2;
                block9: {
                    int n5;
                    block10: {
                        int n6;
                        int n7 = this.c(z2.d(n2).b());
                        bl2 = cL.e();
                        if (random.nextInt(n3) >= n7) break block8;
                        i2 = z2.d(n2);
                        n5 = random.nextInt(n4 + 10);
                        if (!bl2) break block9;
                        if (n5 >= 5) break block10;
                        n5 = z2.t(n2) ? 1 : 0;
                        if (!bl2) break block9;
                        if (n5 != 0) break block10;
                        int n8 = n6 = n4 + random.nextInt(5) / 4;
                        if (bl2) {
                            if (n8 > 15) {
                                n6 = 15;
                            }
                            n8 = z2.a(n2, this.d().a(G, n6), 3) ? 1 : 0;
                        }
                        if (bl2) break block9;
                    }
                    n5 = z2.v(n2) ? 1 : 0;
                }
                k2 = i2.b();
                if (!bl2) break block11;
                if (k2 != g.cR) break block8;
                k2 = g.cR;
            }
            k2.d(z2, n2, i2.a(cT.z, true));
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i c(int n2) {
        return this.d().a(G, n2);
    }

    protected bC() {
        super(net.minecraft.ac.c.w);
        this.C = Maps.newIdentityHashMap();
        this.E = Maps.newIdentityHashMap();
        this.h(this.e.a().a(G, 0).a(D, false).a(z, false).a(B, false).a(F, false).a(A, false));
        this.a(true);
    }

    public boolean c(t t2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = this.a(t2.d(n2).b());
        if (bl2) {
            bl3 = bl3 > false;
        }
        return bl3;
    }

    private int c(z z2, n n2) {
        int n3;
        block4: {
            boolean bl2 = cL.e();
            int n4 = z2.a(n2);
            if (bl2) {
                if (n4 == 0) {
                    return 0;
                }
                n4 = 0;
            }
            int n5 = n4;
            for (aA aA2 : aA.values()) {
                n3 = Math.max(this.a(z2.d(n2.a(aA2)).b()), n5);
                if (bl2) {
                    n5 = n3;
                    if (bl2) continue;
                }
                break block4;
            }
            n3 = n5;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(i var1_1, z var2_2, n var3_3, Random var4_4) {
        block23: {
            block24: {
                block27: {
                    block22: {
                        block26: {
                            block21: {
                                block25: {
                                    block20: {
                                        var5_5 = cL.b();
                                        v0 = var4_4.nextInt(24);
                                        if (!var5_5) {
                                            if (v0 == 0) {
                                                var2_2.a((float)var3_3.e() + 0.5f, (double)((float)var3_3.b() + 0.5f), (double)((float)var3_3.a() + 0.5f), net.minecraft.u.E.ev, ay.BLOCKS, 1.0f + var4_4.nextFloat(), var4_4.nextFloat() * 0.7f + 0.3f, false);
                                            }
                                            v0 = var2_2.d(var3_3.k()).d() ? 1 : 0;
                                        }
                                        if (var5_5) break block23;
                                        if (v0 != 0) break block24;
                                        v0 = g.C.c((t)var2_2, var3_3.k()) ? 1 : 0;
                                        if (var5_5) break block23;
                                        if (v0 != 0) break block24;
                                        v1 = g.C.c((t)var2_2, var3_3.b());
                                        if (!var5_5) {
                                            if (v1) {
                                                for (var6_6 = 0; var6_6 < 2; ++var6_6) {
                                                    var7_7 = (double)var3_3.e() + var4_4.nextDouble() * 0.10000000149011612;
                                                    var9_8 = (double)var3_3.b() + var4_4.nextDouble();
                                                    var11_9 = (double)var3_3.a() + var4_4.nextDouble();
                                                    var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
                                                    if (!var5_5) {
                                                        if (!var5_5) continue;
                                                    }
                                                    break block20;
                                                }
                                            }
                                            v1 = g.C.c((t)var2_2, var3_3.m());
                                        }
                                        if (!var5_5) {
                                            if (v1) {
                                                for (var6_6 = 0; var6_6 < 2; ++var6_6) {
                                                    var7_7 = (double)(var3_3.e() + 1) - var4_4.nextDouble() * 0.10000000149011612;
                                                    var9_8 = (double)var3_3.b() + var4_4.nextDouble();
                                                    var11_9 = (double)var3_3.a() + var4_4.nextDouble();
                                                    var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
                                                    if (!var5_5) {
                                                        if (!var5_5) continue;
                                                    }
                                                    break block21;
                                                }
                                            } else {
                                                ** GOTO lbl35
                                            }
                                        }
                                        break block25;
                                    }
                                    v1 = g.C.c((t)var2_2, var3_3.i());
                                }
                                if (!var5_5) {
                                    if (v1) {
                                        for (var6_6 = 0; var6_6 < 2; ++var6_6) {
                                            var7_7 = (double)var3_3.e() + var4_4.nextDouble();
                                            var9_8 = (double)var3_3.b() + var4_4.nextDouble();
                                            var11_9 = (double)var3_3.a() + var4_4.nextDouble() * 0.10000000149011612;
                                            var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
                                            if (!var5_5) {
                                                if (!var5_5) continue;
                                            }
                                            break block22;
                                        }
                                    } else {
                                        ** GOTO lbl49
                                    }
                                }
                                break block26;
                            }
                            v1 = g.C.c((t)var2_2, var3_3.j());
                        }
                        if (!var5_5) {
                            if (v1) {
                                for (var6_6 = 0; var6_6 < 2; ++var6_6) {
                                    var7_7 = (double)var3_3.e() + var4_4.nextDouble();
                                    var9_8 = (double)var3_3.b() + var4_4.nextDouble();
                                    var11_9 = (double)(var3_3.a() + 1) - var4_4.nextDouble() * 0.10000000149011612;
                                    var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
                                    if (var5_5 != false) return;
                                    if (!var5_5) continue;
                                }
                            } else {
                                ** GOTO lbl62
                            }
                        }
                        break block27;
                    }
                    v1 = g.C.c((t)var2_2, var3_3.a());
                }
                if (!var5_5) {
                    if (v1 == false) return;
                    v1 = false;
                }
                for (var6_6 = (int)((v1241910) ? 1 : 0); var6_6 < 2; ++var6_6) {
                    var7_7 = (double)var3_3.e() + var4_4.nextDouble();
                    var9_8 = (double)(var3_3.b() + 1) - var4_4.nextDouble() * 0.10000000149011612;
                    var11_9 = (double)var3_3.a() + var4_4.nextDouble();
                    var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
                    if (var5_5 != false) return;
                    if (!var5_5) continue;
                }
                if (var5_5 == false) return;
            }
            v0 = 0;
        }
        var6_6 = v0;
        do {
            if (var6_6 >= 3) return;
            var7_7 = (double)var3_3.e() + var4_4.nextDouble();
            var9_8 = (double)var3_3.b() + var4_4.nextDouble() * 0.5 + 0.5;
            var11_9 = (double)var3_3.a() + var4_4.nextDouble();
            var2_2.a(aH.SMOKE_LARGE, var7_7, var9_8, var11_9, 0.0, 0.0, 0.0, new int[0]);
            ++var6_6;
        } while (!var5_5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, n var2_2, i var3_3, Random var4_4) {
        block63: {
            block64: {
                block61: {
                    block62: {
                        block60: {
                            block59: {
                                block58: {
                                    var5_5 = cL.e();
                                    v0 = var1_1.M().c("doFireTick");
                                    if (!var5_5) break block58;
                                    if (v0 == false) return;
                                    v1 = this;
                                    if (!var5_5) break block59;
                                    v0 = v1.a(var1_1, var2_2);
                                }
                                if (!v0) {
                                    var1_1.v(var2_2);
                                }
                                v1 = var1_1.d(var2_2.k()).b();
                            }
                            v2 = var6_6 = v1;
                            v3 = g.j;
                            if (!var5_5) break block60;
                            if (v2 == v3) ** GOTO lbl-1000
                            v2 = var6_6;
                            v3 = g.bR;
                        }
                        if (v2 == v3) lbl-1000:
                        // 2 sources

                        {
                            v4 = 1;
                        } else {
                            v4 = 0;
                        }
                        var7_7 = v4;
                        v5 = var1_1.D instanceof H;
                        if (var5_5) {
                            if (v5 != 0 && var6_6 == g.g) {
                                var7_7 = 1;
                            }
                            v5 = var3_3.b(bC.G);
                        }
                        var8_8 = v5;
                        v6 = var7_7;
                        if (!var5_5) break block61;
                        if (v6 != 0) break block62;
                        v6 = var1_1.J() ? 1 : 0;
                        if (!var5_5) break block61;
                        if (v6 == 0) break block62;
                        v6 = this.b(var1_1, var2_2) ? 1 : 0;
                        if (!var5_5) break block61;
                        if (v6 == 0) break block62;
                        cfr_temp_0 = var4_4.nextFloat() - (0.2f + (float)var8_8 * 0.03f);
                        v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                        if (!var5_5) break block61;
                        if (v6 < 0) {
                            var1_1.v(var2_2);
                            if (var5_5 != false) return;
                        }
                    }
                    v6 = var8_8;
                }
                if (var5_5) {
                    if (v6 < 15) {
                        var3_3 = var3_3.a(bC.G, var8_8 + var4_4.nextInt(3) / 2);
                        var1_1.a(var2_2, var3_3, 4);
                    }
                    var1_1.a(var2_2, (K)this, this.a(var1_1) + var4_4.nextInt(10));
                    v6 = var7_7;
                }
                if (!var5_5) break block63;
                if (v6 != 0) break block64;
                v6 = this.d(var1_1, var2_2) ? 1 : 0;
                if (var5_5) {
                    if (v6 == 0) {
                        v7 = var1_1.d(var2_2.k()).d();
                        if (var5_5 == false) return;
                        if (v7 != 0) {
                            v7 = var8_8;
                            if (var5_5 == false) return;
                            if (v7 <= 3) return;
                        }
                        v7 = var1_1.v(var2_2) ? 1 : 0;
                        return;
                    }
                    v6 = this.c((t)var1_1, var2_2.k()) ? 1 : 0;
                }
                if (!var5_5) break block63;
                if (v6 != 0) break block64;
                v6 = var8_8;
                if (var5_5) {
                    if (v6 == 15) {
                        v6 = var4_4.nextInt(4);
                        if (var5_5) {
                            if (v6 == 0) {
                                var1_1.v(var2_2);
                                return;
                            } else {
                                ** GOTO lbl86
                            }
                        } else {
                            ** GOTO lbl85
                        }
                    } else {
                        ** GOTO lbl84
                    }
                }
                break block63;
lbl84:
                // 2 sources

                break block64;
lbl85:
                // 2 sources

                break block63;
            }
            v6 = var1_1.f(var2_2) ? 1 : 0;
        }
        var9_9 = v6;
        var10_10 = 0;
        v8 = var9_9;
        if (var5_5) {
            if (v8 != 0) {
                var10_10 = -50;
            }
            this.a(var1_1, var2_2.m(), 300 + var10_10, var4_4, var8_8);
            this.a(var1_1, var2_2.b(), 300 + var10_10, var4_4, var8_8);
            this.a(var1_1, var2_2.k(), 250 + var10_10, var4_4, var8_8);
            this.a(var1_1, var2_2.a(), 250 + var10_10, var4_4, var8_8);
            this.a(var1_1, var2_2.i(), 300 + var10_10, var4_4, var8_8);
            this.a(var1_1, var2_2.j(), 300 + var10_10, var4_4, var8_8);
            v8 = -1;
        }
        var11_11 = v8;
        do {
            v9 = var11_11;
            block1: while (true) {
                if (v9 > 1) return;
                var12_12 = -1;
                block2: while (true) {
                    v10 = var12_12;
                    block3: while (v10 <= 1) {
                        v9 = -1;
                        if (!var5_5) continue block1;
                        var13_13 = v9;
                        while (var13_13 <= 4) {
                            block70: {
                                block67: {
                                    block73: {
                                        block74: {
                                            block72: {
                                                block71: {
                                                    block69: {
                                                        block68: {
                                                            block65: {
                                                                block66: {
                                                                    v10 = var11_11;
                                                                    if (!var5_5) continue block3;
                                                                    if (!var5_5) break block65;
                                                                    if (v10 != 0) break block66;
                                                                    v11 = var13_13;
                                                                    if (!var5_5) break block65;
                                                                    if (v11 != 0) break block66;
                                                                    v11 = var12_12;
                                                                    if (!var5_5) break block65;
                                                                    if (v11 == 0) break block67;
                                                                }
                                                                v11 = 100;
                                                            }
                                                            var14_14 = v11;
                                                            v12 = var13_13;
                                                            v13 = 1;
                                                            if (!var5_5) break block68;
                                                            if (v12 <= v13) break block69;
                                                            v12 = var14_14;
                                                            v13 = (var13_13 - 1) * 100;
                                                        }
                                                        var14_14 = v12 + v13;
                                                    }
                                                    var15_15 = var2_2.a(var11_11, var13_13, var12_12);
                                                    var16_16 = this.c(var1_1, var15_15);
                                                    if (!var5_5) break block70;
                                                    if (var16_16 <= 0) break block67;
                                                    var17_17 = (var16_16 + 40 + var1_1.g().a() * 7) / (var8_8 + 30);
                                                    v14 = var9_9;
                                                    if (var5_5) {
                                                        if (v14 != 0) {
                                                            var17_17 /= 2;
                                                        }
                                                        v14 = var17_17;
                                                    }
                                                    if (!var5_5) break block71;
                                                    if (v14 <= 0) break block67;
                                                    v14 = var4_4.nextInt(var14_14);
                                                }
                                                if (!var5_5) break block72;
                                                if (v14 > var17_17) break block67;
                                                v14 = var1_1.J() ? 1 : 0;
                                            }
                                            if (!var5_5) break block73;
                                            if (v14 == 0) break block74;
                                            v14 = this.b(var1_1, var15_15) ? 1 : 0;
                                            if (!var5_5) break block73;
                                            if (v14 != 0) break block67;
                                        }
                                        v14 = var8_8 + var4_4.nextInt(5) / 4;
                                    }
                                    v15 = var18_18 = v14;
                                    if (var5_5) {
                                        if (v15 > 15) {
                                            var18_18 = 15;
                                        }
                                        v15 = var1_1.a(var15_15, var3_3.a(bC.G, var18_18), 3) ? 1 : 0;
                                    }
                                }
                                ++var13_13;
                            }
                            if (var5_5) continue;
                        }
                        ++var12_12;
                        if (var5_5) continue block2;
                    }
                    break block1;
                    break;
                }
                break;
            }
            ++var11_11;
        } while (var5_5);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int a(z z2) {
        return 30;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }
}

