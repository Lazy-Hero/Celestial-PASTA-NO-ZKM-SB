/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.N.Y;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.r;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.n;

public class aj
extends ak {
    public static final /* synthetic */ d<net.minecraft.N.r> z;

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, net.minecraft.N.r.DATA);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(Y var1_1) {
        var2_2 = cL.e();
        v0 = net.minecraft.W.r.a[var1_1.o().ordinal()];
        if (!var2_2) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = var1_1.c(false) ? 1 : 0;
lbl7:
                // 2 sources

                if (var2_2 != false) return;
            }
            case 2: {
                var1_1.d(false);
                if (var2_2 != false) return;
            }
            case 3: {
                var1_1.u();
                return;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, net.minecraft.N.r.a(n2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.e();
        boolean bl3 = y2 instanceof Y;
        if (bl2) {
            if (!bl3) return false;
            bl3 = ((Y)y2).a(j2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public y a(z z2, int n2) {
        return new Y();
    }

    @Override
    public int d(i i2) {
        return i2.b(z).a();
    }

    static {
        z = d.a("mode", net.minecraft.N.r.class);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block2: {
            boolean bl2;
            Y y2;
            block6: {
                boolean bl3;
                boolean bl4;
                block4: {
                    boolean bl5;
                    block5: {
                        y y3;
                        block3: {
                            y y4;
                            z z3;
                            block1: {
                                bl4 = cL.b();
                                z3 = z2;
                                if (bl4) break block1;
                                if (z3.C) break block2;
                                z3 = z2;
                            }
                            y3 = y4 = z3.b(n2);
                            if (bl4) break block3;
                            if (!(y3 instanceof Y)) break block2;
                            y3 = y4;
                        }
                        y2 = (Y)y3;
                        bl5 = z2.x(n2);
                        bl3 = y2.g();
                        bl2 = bl5;
                        if (bl4) break block4;
                        if (!bl2) break block5;
                        bl2 = bl3;
                        if (bl4) break block4;
                        if (bl2) break block5;
                        y2.b(true);
                        this.a(y2);
                        if (!bl4) break block2;
                    }
                    bl2 = bl5;
                }
                if (bl4) break block6;
                if (bl2) break block2;
                bl2 = bl3;
            }
            if (bl2) {
                y2.b(false);
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public aj() {
        super(net.minecraft.ac.c.D, net.minecraft.ac.a.l);
        this.h(this.e.a());
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, net.minecraft.w.d d10) {
        block3: {
            y y2;
            block4: {
                y y3;
                z z3;
                boolean bl2;
                block2: {
                    bl2 = cL.e();
                    z3 = z2;
                    if (!bl2) break block2;
                    if (z3.C) break block3;
                    z3 = z2;
                }
                y2 = y3 = z3.b(n2);
                if (!bl2) break block4;
                if (!(y2 instanceof Y)) break block3;
                y2 = y3;
            }
            Y y4 = (Y)y2;
            y4.a(b10);
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }
}

