/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.b9;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.W.d_;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class Z
extends Y
implements cs {
    private static final /* synthetic */ k[] B;
    public static final /* synthetic */ f A;

    protected int c(i i2) {
        return i2.b(this.a());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected static float a(K var0, z var1_1, n var2_2) {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                block25: {
                                    var4_3 = 1.0f;
                                    var5_4 = var2_2.k();
                                    var6_5 = -1;
                                    var3_7 = cL.b();
                                    while (var6_5 <= 1) {
                                        block19: {
                                            for (var7_8 = -1; var7_8 <= 1; var4_3 += var8_10, ++var7_8) {
                                                block24: {
                                                    block23: {
                                                        block22: {
                                                            block21: {
                                                                block20: {
                                                                    var8_10 = 0.0f;
                                                                    var9_12 = var1_1.d(var5_4.a(var6_5, 0, var7_8));
                                                                    if (var3_7) break block19;
                                                                    v0 = var9_12;
                                                                    if (var3_7) break block20;
                                                                    if (v0.b() != g.cU) break block21;
                                                                    var8_10 = 1.0f;
                                                                    v0 = var9_12;
                                                                }
                                                                v1 = v0.b(b9.z);
                                                                if (var3_7) break block22;
                                                                if (v1 > 0) {
                                                                    var8_10 = 3.0f;
                                                                }
                                                            }
                                                            v1 = var6_5;
                                                        }
                                                        if (var3_7) break block23;
                                                        if (v1 != 0) break block24;
                                                        v1 = var7_8;
                                                    }
                                                    if (v1 == 0) continue;
                                                }
                                                var8_10 /= 4.0f;
                                                if (!var3_7) continue;
                                            }
                                            ++var6_5;
                                        }
                                        if (!var3_7) continue;
                                    }
                                    var6_6 = var2_2.i();
                                    var7_9 = var2_2.j();
                                    var8_11 = var2_2.b();
                                    var9_12 = var2_2.m();
                                    v2 = var0;
                                    v3 = var1_1.d(var8_11).b();
                                    if (var3_7) break block25;
                                    if (v2 == v3) ** GOTO lbl-1000
                                    v2 = var0;
                                    v3 = var1_1.d((n)var9_12).b();
                                }
                                if (v2 == v3) lbl-1000:
                                // 2 sources

                                {
                                    v4 = true;
                                } else {
                                    v4 = false;
                                }
                                var10_13 = v4;
                                v5 = var0;
                                v6 = var1_1.d(var6_6).b();
                                if (var3_7) break block26;
                                if (v5 == v6) ** GOTO lbl-1000
                                v5 = var0;
                                v6 = var1_1.d(var7_9).b();
                            }
                            if (v5 == v6) lbl-1000:
                            // 2 sources

                            {
                                v7 = true;
                            } else {
                                v7 = false;
                            }
                            var11_14 = v7;
                            v8 = var10_13;
                            if (var3_7) break block27;
                            if (!v8) break block28;
                            v8 = var11_14;
                        }
                        if (v8) {
                            var4_3 /= 2.0f;
                            if (var3_7 == false) return var4_3;
                        }
                    }
                    v9 = var0;
                    v10 = var1_1.d(var8_11.i()).b();
                    if (var3_7) break block29;
                    if (v9 == v10) ** GOTO lbl-1000
                    v9 = var0;
                    v10 = var1_1.d(var9_12.i()).b();
                }
                if (var3_7) break block30;
                if (v9 == v10) ** GOTO lbl-1000
                v9 = var0;
                v10 = var1_1.d(var9_12.j()).b();
            }
            if (var3_7) break block31;
            if (v9 == v10) ** GOTO lbl-1000
            v9 = var0;
            v10 = var1_1.d(var8_11.j()).b();
        }
        if (v9 == v10) lbl-1000:
        // 4 sources

        {
            v11 = true;
        } else {
            v11 = false;
        }
        var12_15 = v11;
        if (var12_15 == false) return var4_3;
        var4_3 /= 2.0f;
        return var4_3;
    }

    protected Z() {
        this.h(this.e.a().a(this.a(), 0));
        this.a(true);
        this.a((a)null);
        this.c(0.0f);
        this.a(d_.k);
        this.b();
    }

    @Override
    public int d(i i2) {
        return this.c(i2);
    }

    public i b(int n2) {
        return this.d().a(this.a(), n2);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block6: {
            int n3;
            int n4;
            boolean bl2;
            block5: {
                boolean bl3 = cL.b();
                super.a(z2, n2, i2, random);
                bl2 = bl3;
                n4 = z2.s(n2.a());
                if (bl2) break block5;
                if (n4 < 9) break block6;
                n4 = this.c(i2);
            }
            if ((n3 = n4) < this.b()) {
                float f10 = Z.a(this, z2, n2);
                int n5 = random.nextInt((int)(25.0f / f10) + 1);
                if (!bl2 && n5 == 0) {
                    n5 = z2.a(n2, this.b(n3 + 1), 2) ? 1 : 0;
                }
            }
        }
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        this.e(z2, n2, i2);
    }

    public int b() {
        return 7;
    }

    public boolean b(i i2) {
        boolean bl2 = cL.b();
        int n2 = i2.b(this.a());
        if (!bl2) {
            n2 = n2 >= this.b() ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public i c(int n2) {
        return this.b(n2);
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    protected int b(z z2) {
        return net.minecraft.k.h.a(z2.J, 2, 5);
    }

    protected net.minecraft.w.k d() {
        return net.minecraft.u.h.a6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2) {
        boolean bl2;
        boolean bl3;
        block2: {
            block3: {
                bl3 = cL.b();
                bl2 = z2.l(n2);
                if (bl3) break block2;
                if (bl2 >= BADBOOL 8) break block3;
                bl2 = z2.w(n2);
                if (bl3) break block2;
                if (!bl2) return false;
            }
            bl2 = this.a(z2.d(n2.k()));
        }
        if (bl3) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return B[i2.b(this.a())];
    }

    static {
        A = f.a("age", 0, 7);
        B = new k[]{new k(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new k(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new k(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        boolean bl3 = cL.b();
        boolean bl4 = this.b(i2);
        if (!bl3) {
            bl4 = !bl4;
        }
        return bl4;
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(this.d());
    }

    protected net.minecraft.w.k c() {
        return net.minecraft.u.h.b1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        net.minecraft.w.k k2;
        boolean bl2 = cL.b();
        Z z2 = this;
        if (!bl2) {
            if (z2.b(i2)) {
                k2 = this.c();
                return k2;
            }
            z2 = this;
        }
        k2 = z2.d();
        return k2;
    }

    protected f a() {
        return A;
    }

    public void e(z z2, n n2, i i2) {
        int n3 = this.c(i2) + this.b(z2);
        boolean bl2 = cL.b();
        int n4 = this.b();
        int n5 = n3;
        if (!bl2) {
            if (n5 > n4) {
                n3 = n4;
            }
            n5 = z2.a(n2, this.b(n3), 2) ? 1 : 0;
        }
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    protected c f() {
        return new c((K)this, A);
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        block6: {
            int n4;
            int n5;
            int n6;
            boolean bl2;
            block7: {
                int n7;
                block5: {
                    boolean bl3 = cL.b();
                    super.a(z2, n2, i2, f10, 0);
                    bl2 = bl3;
                    n7 = z2.C;
                    if (bl2) break block5;
                    if (n7 != 0) break block6;
                    n7 = this.c(i2);
                }
                n5 = n6 = n7;
                n4 = this.b();
                if (bl2) break block7;
                if (n5 < n4) break block6;
                n5 = 3;
                n4 = n3;
            }
            int n8 = n5 + n4;
            for (int i3 = 0; i3 < n8; ++i3) {
                z z3 = z2;
                if (!bl2) {
                    if (z3.J.nextInt(2 * this.b()) > n6) continue;
                    z3 = z2;
                }
                Z.a(z3, n2, new d(this.d()));
                if (!bl2) continue;
            }
        }
    }

    @Override
    protected boolean a(i i2) {
        return i2.b() == g.cU;
    }
}

