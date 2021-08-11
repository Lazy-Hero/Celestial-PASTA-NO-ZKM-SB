/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import java.util.List;
import net.minecraft.U.y;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.a;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.k;

public class aA
extends k {
    public aA() {
        this.a(net.minecraft.ad.a.q);
    }

    @Override
    public t<d> a(z z2, net.minecraft.i.j j2, a3 a32) {
        d d10;
        block14: {
            z z3;
            block18: {
                n n2;
                int n3;
                block17: {
                    block16: {
                        boolean bl2;
                        block15: {
                            i i2;
                            i i3;
                            block13: {
                                block12: {
                                    Object object;
                                    block11: {
                                        List<y> list = z2.a(y.class, j2.m().a(2.0), new f(this));
                                        n3 = bl.c();
                                        d10 = j2.c(a32);
                                        object = list;
                                        if (n3 != 0) break block11;
                                        if (object.isEmpty()) break block12;
                                        object = list.get(0);
                                    }
                                    y y2 = (y)object;
                                    y2.d(y2.d() - 0.5f);
                                    z2.a(null, j2.a, j2.aF, j2.ax, E.f3, ay.NEUTRAL, 1.0f, 1.0f);
                                    return new t<d>(aX.SUCCESS, this.a(d10, j2, new d(net.minecraft.u.h.g)));
                                }
                                i2 = i3 = this.a(z2, j2, true);
                                if (n3 == 0) {
                                    if (i2 == null) {
                                        return new t<d>(aX.PASS, d10);
                                    }
                                    i2 = i3;
                                }
                                if (n3 != 0) break block13;
                                if (i2.d != j.BLOCK) break block14;
                                i2 = i3;
                            }
                            n2 = i2.a();
                            bl2 = z2.a(j2, n2);
                            if (n3 != 0) break block15;
                            if (!bl2) break block16;
                            bl2 = j2.a(n2.a(i3.b), i3.b, d10);
                        }
                        if (bl2) break block17;
                    }
                    return new t<d>(aX.PASS, d10);
                }
                z3 = z2;
                if (n3 != 0) break block18;
                if (z3.d(n2).o() != c.L) break block14;
                z3 = z2;
            }
            z3.a(j2, j2.a, j2.aF, j2.ax, E.g7, ay.NEUTRAL, 1.0f, 1.0f);
            return new t<d>(aX.SUCCESS, this.a(d10, j2, net.minecraft.K.k.a(new d(net.minecraft.u.h.V), net.minecraft.u.a.u)));
        }
        return new t<d>(aX.PASS, d10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected d a(d d10, net.minecraft.i.j j2, d d11) {
        block6: {
            net.minecraft.i.j j3;
            block5: {
                boolean bl2;
                block4: {
                    int n2 = bl.g();
                    d10.b(1);
                    int n3 = n2;
                    j2.b(m.b(this));
                    bl2 = d10.G();
                    if (n3 == 0) break block4;
                    if (bl2) {
                        return d11;
                    }
                    j3 = j2;
                    if (n3 == 0) break block5;
                    bl2 = j3.cB.b(d11);
                }
                if (bl2) break block6;
                j3 = j2;
            }
            j3.a(d11, false);
        }
        return d10;
    }
}

