/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.J.D;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.U;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.z.f;

public class cT
extends K {
    public static final /* synthetic */ c z;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d();
        boolean bl3 = n2 & 1;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(z, bl3);
    }

    @Override
    public int d(i i2) {
        boolean bl2 = cL.e();
        int n2 = i2.b(z).booleanValue();
        if (bl2) {
            n2 = n2 != 0 ? 1 : 0;
        }
        return n2;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3;
                block11: {
                    block10: {
                        boolean bl4;
                        d d10;
                        block8: {
                            block9: {
                                k k2;
                                k k3;
                                block6: {
                                    block7: {
                                        d10 = j2.c(a32);
                                        bl4 = cL.b();
                                        bl2 = d10.G();
                                        if (bl4) break block4;
                                        if (bl2) break block5;
                                        k3 = d10.w();
                                        k2 = net.minecraft.u.h.cn;
                                        if (bl4) break block6;
                                        if (k3 == k2) break block7;
                                        k3 = d10.w();
                                        k2 = net.minecraft.u.h.bL;
                                        if (bl4) break block6;
                                        if (k3 != k2) break block5;
                                    }
                                    this.a(z2, n2, i2.a(z, true), (B)j2);
                                    bl3 = z2.a(n2, g.bf.d(), 11);
                                    if (bl4) break block8;
                                    k3 = d10.w();
                                    k2 = net.minecraft.u.h.cn;
                                }
                                if (k3 != k2) break block9;
                                d10.a(1, (B)j2);
                                if (!bl4) break block10;
                            }
                            bl3 = j2.cw.g;
                        }
                        if (bl4) break block11;
                        if (!bl3) {
                            d10.b(1);
                        }
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = super.a(z2, n2, i2, j2, a32, aA2, f10, f11, f12);
        }
        return bl2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, n var2_2, i var3_3, x var4_4) {
        block6: {
            block5: {
                var5_5 = cL.e();
                v0 = var1_1.C;
                if (!var5_5) break block5;
                if (v0 != false) return;
                v1 = var4_4;
                if (!var5_5) break block6;
                v0 = v1 instanceof f;
            }
            if (v0 == false) return;
            v1 = var4_4;
        }
        if ((var6_6 = (f)v1).p() == false) return;
        v2 = var1_1.d(var2_2).a(cT.z, true);
        v3 = var6_6.aY;
        if (!var5_5) ** GOTO lbl18
        if (v3 instanceof B) {
            v3 = var6_6.aY;
lbl18:
            // 2 sources

            v4 = (B)v3;
        } else {
            v4 = null;
        }
        this.a(var1_1, var2_2, v2, v4);
        var1_1.v(var2_2);
    }

    @Override
    public void d(z z2, n n2, i i2) {
        this.a(z2, n2, i2, (B)null);
    }

    public cT() {
        super(net.minecraft.ac.c.b);
        this.h(this.e.a().a(z, false));
        this.a(net.minecraft.ad.a.p);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.x(n2);
        if (bl2 && bl3) {
            this.d(z2, n2, i2.a(z, true));
            bl3 = z2.v(n2);
        }
    }

    @Override
    public boolean a(U u2) {
        return false;
    }

    static {
        z = net.minecraft.ae.c.a("explode");
    }

    @Override
    public void a(z z2, n n2, U u2) {
        if (!z2.C) {
            D d10 = new D(z2, (float)n2.e() + 0.5f, n2.b(), (float)n2.a() + 0.5f, u2.d());
            d10.a((short)(z2.J.nextInt(d10.a() / 4) + d10.a() / 8));
            z2.f(d10);
        }
    }

    public void a(z z2, n n2, i i2, B b10) {
        block5: {
            boolean bl2;
            block4: {
                boolean bl3 = cL.e();
                bl2 = z2.C;
                if (!bl3) break block4;
                if (bl2) break block5;
                bl2 = i2.b(z);
            }
            if (bl2) {
                D d10 = new D(z2, (float)n2.e() + 0.5f, n2.b(), (float)n2.a() + 0.5f, b10);
                z2.f(d10);
                z2.a(null, d10.a, d10.aF, d10.ax, E.ei, ay.BLOCKS, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void b(z z2, n n2, i i2) {
        boolean bl2 = cL.b();
        super.b(z2, n2, i2);
        boolean bl3 = bl2;
        boolean bl4 = z2.x(n2);
        if (!bl3 && bl4) {
            this.d(z2, n2, i2.a(z, true));
            bl4 = z2.v(n2);
        }
    }
}

