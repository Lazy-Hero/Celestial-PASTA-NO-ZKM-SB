/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.ax;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.W.da;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.p.o;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aC
extends Y
implements cs {
    protected static final /* synthetic */ k A;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2) {
        i i3;
        boolean bl2;
        block8: {
            i i4;
            block7: {
                K k2;
                K k3;
                block6: {
                    bl2 = cL.b();
                    int n3 = n2.b();
                    if (bl2) return n3 != 0;
                    if (n3 < 0) return 0 != 0;
                    n3 = n2.b();
                    if (bl2) return n3 != 0;
                    if (n3 >= 256) return 0 != 0;
                    i3 = z2.d(n2.k());
                    k3 = i3.b();
                    k2 = g.a8;
                    if (bl2) break block6;
                    if (k3 == k2) {
                        return true;
                    }
                    i4 = i3;
                    if (bl2) break block7;
                    k3 = i4.b();
                    k2 = g.bv;
                }
                if (k3 != k2) break block8;
                i4 = i3;
            }
            if (i4.b(ax.A) == da.PODZOL) {
                return true;
            }
        }
        boolean bl3 = z2.l(n2);
        if (!bl2) {
            if (bl3 >= BADBOOL 13) return false;
            bl3 = this.a(i3);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(z var1_1, n var2_2, i var3_3, Random var4_4) {
        block8: {
            block7: {
                v0 = cL.b();
                var1_1.v(var2_2);
                var5_5 = v0;
                var6_6 = null;
                v1 = this;
                v2 = g.cg;
                if (var5_5) ** GOTO lbl14
                if (v1 == v2) {
                    var6_6 = new o(g.a1);
                } else {
                    v1 = this;
                    v2 = g.z;
lbl14:
                    // 2 sources

                    if (v1 == v2) {
                        var6_6 = new o(g.db);
                    }
                }
                v3 = var6_6;
                if (var5_5) break block7;
                if (v3 == null) break block8;
                v3 = var6_6;
            }
            v4 = v3.a(var1_1, var4_4, var2_2);
            if (var5_5 != false) return v4;
            if (v4) {
                return true;
            }
        }
        var1_1.a(var2_2, var3_3, 3);
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(z z2, n object, i i2, Random random) {
        block14: {
            boolean bl2;
            Object object2;
            boolean bl3;
            block21: {
                block15: {
                    void var9_11;
                    int n2;
                    block16: {
                        bl3 = cL.b();
                        n2 = random.nextInt(25);
                        if (bl3) break block16;
                        if (n2 != 0) break block14;
                        n2 = 5;
                    }
                    int n3 = n2;
                    int n4 = 4;
                    for (n n5 : net.minecraft.k.n.a(((n)object).a(-4, -1, -4), ((n)object).a(4, 1, 4))) {
                        block18: {
                            block17: {
                                if (bl3) break block14;
                                if (bl3) break block17;
                                if (z2.d(n5).b() != this) break block18;
                                --n3;
                            }
                            if (n3 <= 0) {
                                return;
                            }
                        }
                        if (!bl3) continue;
                    }
                    object2 = ((n)object).a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
                    boolean i3 = false;
                    while (var9_11 < 4) {
                        block20: {
                            boolean bl4;
                            block19: {
                                bl2 = z2.a((n)object2);
                                if (bl3) break block15;
                                if (bl3) break block19;
                                if (!bl2) break block20;
                                bl4 = this.a(z2, (n)object2, this.d());
                            }
                            if (bl4) {
                                object = object2;
                            }
                        }
                        object2 = ((n)object).a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
                        ++var9_11;
                        if (!bl3) continue;
                    }
                    bl2 = z2.a((n)object2);
                }
                if (bl3) break block21;
                if (!bl2) break block14;
                bl2 = this.a(z2, (n)object2, this.d());
            }
            if (!bl3 && bl2) {
                bl2 = z2.a((n)object2, this.d(), 2);
            }
        }
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        boolean bl2 = cL.b();
        double d10 = (double)random.nextFloat() - 0.4;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (!bl2) {
            d11 = d11 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected aC() {
        this.a(true);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        this.a(z2, n2, i2, random);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = super.a(z2, n2);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = this.a(z2, n2, this.d());
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        return true;
    }

    static {
        A = new k(0.3f, 0.0, 0.3f, 0.7f, 0.4f, 0.7f);
    }

    @Override
    protected boolean a(i i2) {
        return i2.m();
    }
}

