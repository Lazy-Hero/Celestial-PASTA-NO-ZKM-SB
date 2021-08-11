/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dm;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public abstract class cu
extends K {
    public static final /* synthetic */ d<dm> B;
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k A;

    @Override
    public boolean w(i i2) {
        return this.b();
    }

    @Override
    public int a(Random random) {
        boolean bl2 = cL.b();
        int n2 = this.b();
        if (!bl2) {
            n2 = n2 != 0 ? 2 : 1;
        }
        return n2;
    }

    public abstract a<?> a();

    @Override
    public k a(i i2, t t2, n n2) {
        if (this.b()) {
            return k;
        }
        return i2.b(B) == dm.TOP ? z : A;
    }

    static {
        B = d.a("half", dm.class);
        A = new k(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
        z = new k(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
    }

    public abstract String a(int var1);

    @Override
    public boolean i(i i2) {
        boolean bl2 = cL.e();
        boolean bl3 = ((cu)i2.b()).b();
        if (bl2) {
            bl3 = bl3 || i2.b(B) == dm.TOP;
        }
        return bl3;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public cu(c c10) {
        this(c10, c10.a());
    }

    public abstract boolean b();

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        i i2;
        i i3;
        block6: {
            aA aA3;
            aA aA4;
            block5: {
                i3 = super.a(z2, n2, aA2, f10, f11, f12, n3, b10).a(B, dm.BOTTOM);
                boolean bl2 = cL.e();
                if (this.b()) {
                    return i3;
                }
                aA4 = aA2;
                aA3 = aA.DOWN;
                if (!bl2) break block5;
                if (aA4 == aA3) break block6;
                aA4 = aA2;
                aA3 = aA.UP;
            }
            if (aA4 == aA3 || (double)f11 <= 0.5) {
                i2 = i3;
                return i2;
            }
        }
        i2 = i3.a(B, dm.TOP);
        return i2;
    }

    @Override
    public boolean p(i i2) {
        return this.b();
    }

    public abstract Comparable<?> a(net.minecraft.w.d var1);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i var1_1, t var2_2, n var3_3, aA var4_4) {
        block27: {
            block26: {
                block25: {
                    block24: {
                        var5_5 = cL.b();
                        v0 = this.b();
                        if (var5_5 != false) return v0;
                        if (v0) {
                            v0 = super.b(var1_1, var2_2, var3_3, var4_4);
                            return v0;
                        }
                        v1 = var4_4;
                        v2 = aA.UP;
                        if (var5_5) break block24;
                        if (v1 == v2) break block25;
                        v1 = var4_4;
                        v2 = aA.DOWN;
                    }
                    if (v1 != v2) {
                        v3 = super.b(var1_1, var2_2, var3_3, var4_4);
                        if (var5_5 != false) return v3;
                        if (!v3) {
                            return false;
                        }
                    }
                }
                v4 = var6_6 = var2_2.d(var3_3.a(var4_4));
                if (var5_5) break block26;
                if (!cu.a(v4)) ** GOTO lbl-1000
                v4 = var6_6;
            }
            if (v4.b(cu.B) == dm.TOP) {
                v5 = true;
            } else lbl-1000:
            // 2 sources

            {
                v5 = false;
            }
            var7_7 = v5;
            v6 = var1_1;
            if (var5_5) break block27;
            if (!cu.a(v6)) ** GOTO lbl-1000
            v6 = var1_1;
        }
        if (v6.b(cu.B) == dm.TOP) {
            v7 = true;
        } else lbl-1000:
        // 2 sources

        {
            v7 = var8_8 = false;
        }
        if (var8_8) {
            v8 = var4_4;
            v9 = aA.DOWN;
            if (!var5_5) {
                if (v8 == v9) {
                    return true;
                }
                v8 = var4_4;
                v9 = aA.UP;
            }
            if (v8 == v9) {
                v10 = super.b(var1_1, var2_2, var3_3, var4_4);
                if (!var5_5) {
                    if (v10) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v10 = cu.a(var6_6);
            }
            if (var5_5 != false) return v10;
            if (v10 == false) return true;
            v10 = var7_7;
            if (var5_5 != false) return v10;
            if (v10 == false) return true;
            return false;
        }
        v11 = var4_4;
        v12 = aA.UP;
        if (!var5_5) {
            if (v11 == v12) {
                return true;
            }
            v11 = var4_4;
            v12 = aA.DOWN;
        }
        if (v11 == v12) {
            v13 = super.b(var1_1, var2_2, var3_3, var4_4);
            if (!var5_5) {
                if (v13) {
                    return true;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v13 = cu.a(var6_6);
        }
        if (var5_5 != false) return v13;
        if (v13 == false) return true;
        v13 = var7_7;
        if (var5_5 != false) return v13;
        if (v13 != false) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block8: {
            Enum enum_;
            block7: {
                aA aA3;
                block6: {
                    boolean bl2 = cL.e();
                    if (((cu)i2.b()).b()) {
                        return net.minecraft.Z.d.SOLID;
                    }
                    enum_ = aA2;
                    aA3 = aA.UP;
                    if (!bl2) break block6;
                    if (enum_ == aA3 && i2.b(B) == dm.TOP) {
                        return net.minecraft.Z.d.SOLID;
                    }
                    enum_ = aA2;
                    if (!bl2) break block7;
                    aA3 = aA.DOWN;
                }
                if (enum_ != aA3) break block8;
                enum_ = i2.b(B);
            }
            if (enum_ == dm.BOTTOM) {
                d10 = net.minecraft.Z.d.SOLID;
                return d10;
            }
        }
        d10 = net.minecraft.Z.d.UNDEFINED;
        return d10;
    }

    @Override
    protected boolean r() {
        return false;
    }

    public cu(c c10, net.minecraft.ac.a a10) {
        super(c10, a10);
        this.o = this.b();
        this.d(255);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(i i2) {
        K k2 = i2.b();
        boolean bl2 = cL.e();
        K k3 = k2;
        cu cu2 = g.bO;
        if (bl2) {
            if (k3 == cu2) return true;
            k3 = k2;
            cu2 = g.e;
        }
        if (bl2) {
            if (k3 == cu2) return true;
            k3 = k2;
            cu2 = g.U;
        }
        if (bl2) {
            if (k3 == cu2) return true;
            k3 = k2;
            cu2 = g.F;
        }
        if (k3 != cu2) return false;
        return true;
    }
}

