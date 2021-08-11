/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import java.util.List;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.U.y;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.k.i;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.c;
import net.minecraft.z.d;
import net.minecraft.z.j;

public class k
extends j {
    public k(z z2, B b10, double d10, double d11, double d12) {
        super(z2, b10, d10, d11, d12);
        this.c(1.0f, 1.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(b b10) {
        net.minecraft.z.j.a(b10, "DragonFireball");
    }

    @Override
    protected boolean b() {
        return false;
    }

    @Override
    protected aH a() {
        return net.minecraft.ar.aH.DRAGON_BREATH;
    }

    public k(z z2) {
        super(z2);
        this.c(1.0f, 1.0f);
    }

    public k(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.c(1.0f, 1.0f);
    }

    @Override
    public boolean a(G g10, float f10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    protected void a(i i2) {
        block7: {
            block3: {
                int n2;
                y y2;
                block9: {
                    z z2;
                    m[] arrm;
                    block8: {
                        boolean bl2;
                        block6: {
                            block5: {
                                x x2;
                                block4: {
                                    arrm = net.minecraft.z.d.b();
                                    x2 = i2.e;
                                    if (arrm != null) break block4;
                                    if (x2 == null) break block5;
                                    x2 = i2.e;
                                }
                                bl2 = x2.d(this.aN);
                                if (arrm != null) break block6;
                                if (bl2) break block7;
                            }
                            z2 = this.aG;
                            if (arrm != null) break block8;
                            bl2 = z2.C;
                        }
                        if (bl2) break block7;
                        z2 = this.aG;
                    }
                    List<B> list = z2.a(B.class, this.m().a(4.0, 2.0, 4.0));
                    y2 = new y(this.aG, this.a, this.aF, this.ax);
                    y2.b(this.aN);
                    y2.a(net.minecraft.ar.aH.DRAGON_BREATH);
                    y2.d(3.0f);
                    y2.a(600);
                    y2.b((7.0f - y2.d()) / (float)y2.h());
                    y2.a(new net.minecraft.K.j(c.o, 1, 1));
                    n2 = list.isEmpty();
                    if (arrm != null) break block3;
                    if (n2 != 0) break block9;
                    for (B b10 : list) {
                        block11: {
                            block10: {
                                double d10 = this.s(b10);
                                if (arrm != null) break block10;
                                double d11 = d10 - 16.0;
                                n2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                if (arrm != null) break block3;
                                if (n2 >= 0) break block11;
                                y2.g(b10.a, b10.aF, b10.ax);
                            }
                            if (arrm == null) break;
                        }
                        if (arrm == null) continue;
                    }
                }
                this.aG.b(2006, new n(this.a, this.aF, this.ax), 0);
                n2 = this.aG.f(y2);
            }
            this.a();
        }
    }
}

