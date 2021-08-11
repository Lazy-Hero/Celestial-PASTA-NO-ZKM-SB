/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.z.d;
import net.minecraft.z.j;

public class m
extends j {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean M() {
        return false;
    }

    public m(z z2) {
        super(z2);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    protected void a(i i2) {
        block12: {
            m m2;
            block22: {
                block16: {
                    boolean bl2;
                    net.minecraft.k.m[] arrm;
                    block21: {
                        boolean bl3;
                        block20: {
                            B b10;
                            block19: {
                                block14: {
                                    block18: {
                                        block17: {
                                            block15: {
                                                x x2;
                                                block13: {
                                                    block11: {
                                                        arrm = net.minecraft.z.d.b();
                                                        x2 = this;
                                                        if (arrm != null) break block11;
                                                        if (x2.aG.C) break block12;
                                                        x2 = i2.e;
                                                    }
                                                    if (arrm != null) break block13;
                                                    if (x2 == null) break block14;
                                                    x2 = i2.e;
                                                }
                                                boolean bl4 = x2.V();
                                                if (arrm != null) break block15;
                                                if (bl4) break block16;
                                                bl4 = bl3 = i2.e.a(net.minecraft.ar.G.a(this, (x)this.aN), 5.0f);
                                            }
                                            if (arrm != null) break block17;
                                            if (!bl3) break block18;
                                            this.a(this.aN, i2.e);
                                        }
                                        i2.e.h(5);
                                    }
                                    if (arrm == null) break block16;
                                }
                                bl3 = true;
                                b10 = this.aN;
                                if (arrm != null) break block19;
                                if (b10 == null) break block20;
                                b10 = this.aN;
                            }
                            bl2 = b10 instanceof C;
                            if (arrm != null) break block21;
                            if (bl2) {
                                bl3 = this.aG.M().c("mobGriefing");
                            }
                        }
                        bl2 = bl3;
                    }
                    if (!bl2) break block16;
                    n n2 = i2.a().a(i2.b);
                    m2 = this;
                    if (arrm != null) break block22;
                    if (m2.aG.a(n2)) {
                        this.aG.a(n2, net.minecraft.u.g.C.d());
                    }
                }
                m2 = this;
            }
            m2.a();
        }
    }

    public m(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.c(0.3125f, 0.3125f);
    }

    public m(z z2, B b10, double d10, double d11, double d12) {
        super(z2, b10, d10, d11, d12);
        this.c(0.3125f, 0.3125f);
    }

    public static void b(b b10) {
        net.minecraft.z.j.a(b10, "SmallFireball");
    }

    @Override
    public boolean a(G g10, float f10) {
        return false;
    }
}

