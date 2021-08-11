/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.aT;
import net.minecraft.W.bw;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class bl
extends bw {
    public static final /* synthetic */ d<net.minecraft.w.bl> A;

    @Override
    public int d(i i2) {
        return i2.b(A).e();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, net.minecraft.w.bl.c(n2));
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block3: {
            i i3;
            n n3;
            z z3;
            bl bl2;
            block2: {
                boolean bl3 = cL.e();
                bl2 = this;
                z3 = z2;
                n3 = n2;
                i3 = i2;
                if (!bl3) break block2;
                if (bl2.a(z3, n3, i3)) break block3;
                bl2 = this;
                z3 = z2;
                n3 = n2;
                i3 = i2;
            }
            super.b(z3, n3, i3);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        A = d.a("color", net.minecraft.w.bl.class);
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.a(i2.b(A));
    }

    @Override
    public void a(z z2, n n2, i i2, i i3) {
        boolean bl2 = cL.e();
        boolean bl3 = i3.o().b();
        if (bl2 && bl3) {
            bl3 = z2.a(n2, g.cK.d().a(aT.z, i2.b(A)), 3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected boolean a(z var1_1, n var2_2, i var3_3) {
        block8: {
            var5_4 = false;
            var6_5 = aA.values();
            var7_6 = var6_5.length;
            var8_7 = 0;
            var4_8 = cL.b();
            while (var8_7 < var7_6) {
                var9_9 = var6_5[var8_7];
                if (!var4_8) {
                    if (!var4_8) {
                        if (var9_9 != aA.DOWN) {
                            var10_10 = var2_2.a(var9_9);
                            if (!var4_8) {
                                if (var1_1.d(var10_10).o() == net.minecraft.ac.c.L) {
                                    var5_4 = true;
                                    if (!var4_8) break;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 4 sources

                        {
                            ++var8_7;
                        }
                    }
                    if (!var4_8) continue;
                }
                break block8;
            }
            v0 = var5_4;
            if (var4_8 != false) return v0;
            if (v0) {
                var1_1.a(var2_2, g.cK.d().a(aT.z, var3_3.b(bl.A)), 3);
            }
        }
        v0 = var5_4;
        return v0;
    }

    @Override
    public int g(i i2) {
        return i2.b(A).e();
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        net.minecraft.w.bl[] arrbl = net.minecraft.w.bl.values();
        boolean bl2 = cL.e();
        for (net.minecraft.w.bl bl3 : arrbl) {
            a22.add(new net.minecraft.w.d(this, 1, bl3.e()));
            if (bl2) continue;
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            bl bl2;
            block2: {
                boolean bl3 = cL.e();
                bl2 = this;
                if (!bl3) break block2;
                if (bl2.a(z2, n2, i2)) break block3;
                bl2 = this;
            }
            super.a(i2, z2, n2, k2, n3);
        }
    }

    public bl() {
        super(net.minecraft.ac.c.o);
        this.h(this.e.a().a(A, net.minecraft.w.bl.WHITE));
        this.a(net.minecraft.ad.a.r);
    }
}

