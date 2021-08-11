/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.ag;
import net.minecraft.U.D;
import net.minecraft.W.H;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.W.bL;
import net.minecraft.W.bZ;
import net.minecraft.W.bc;
import net.minecraft.W.bf;
import net.minecraft.W.cG;
import net.minecraft.W.cV;
import net.minecraft.Z.i;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ao.a4;
import net.minecraft.ao.b;
import net.minecraft.ao.h;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

abstract class a2
extends u {
    protected /* synthetic */ int i;
    protected /* synthetic */ int h;
    protected /* synthetic */ boolean j;
    private /* synthetic */ int g;

    protected void a(z z2, b b10, Random random, int n2, int n3, int n4, aA aA2) {
        block3: {
            a2 a22;
            block2: {
                String[] arrstring = u.b();
                a22 = this;
                if (arrstring == null) break block2;
                if (a22.j) break block3;
                a22 = this;
            }
            a22.a(z2, b10, random, n2, n3, n4, aA.NORTH, this.a());
        }
    }

    protected aB a() {
        switch (this.h) {
            case 2: {
                return net.minecraft.u.g.cl;
            }
            case 3: {
                return net.minecraft.u.g.bT;
            }
        }
        return net.minecraft.u.g.aJ;
    }

    @Override
    protected void b(z z2, i i2, int n2, int n3, int n4, b b10) {
        i i3 = this.a(i2);
        super.b(z2, i3, n2, n3, n4, b10);
    }

    protected a2(a4 a42, int n2) {
        block3: {
            block2: {
                super(n2);
                this.i = -1;
                String[] arrstring = u.b();
                a2 a22 = a42;
                if (arrstring == null) break block2;
                if (a22 == null) break block3;
                this.h = a42.h;
                a22 = this;
            }
            a22.j = a42.j;
        }
    }

    protected i a(i i2) {
        i i3;
        block43: {
            block44: {
                K k2;
                K k3;
                block56: {
                    String[] arrstring;
                    block54: {
                        block55: {
                            K k4;
                            block52: {
                                block53: {
                                    int n2;
                                    int n3;
                                    block45: {
                                        block46: {
                                            K k5;
                                            K k6;
                                            block51: {
                                                block49: {
                                                    block50: {
                                                        K k7;
                                                        block47: {
                                                            block48: {
                                                                block36: {
                                                                    block37: {
                                                                        K k8;
                                                                        K k9;
                                                                        block42: {
                                                                            block40: {
                                                                                block41: {
                                                                                    K k10;
                                                                                    block38: {
                                                                                        block39: {
                                                                                            arrstring = u.b();
                                                                                            n3 = this.h;
                                                                                            n2 = 1;
                                                                                            if (arrstring == null) break block36;
                                                                                            if (n3 != n2) break block37;
                                                                                            k10 = i2.b();
                                                                                            if (arrstring == null) break block38;
                                                                                            if (k10 == net.minecraft.u.g.bu) break block39;
                                                                                            k9 = i2.b();
                                                                                            k8 = net.minecraft.u.g.aB;
                                                                                            if (arrstring == null) break block40;
                                                                                            if (k9 != k8) break block41;
                                                                                        }
                                                                                        k10 = net.minecraft.u.g.bC;
                                                                                    }
                                                                                    return k10.d();
                                                                                }
                                                                                k9 = i2.b();
                                                                                k8 = net.minecraft.u.g.cW;
                                                                            }
                                                                            if (arrstring != null) {
                                                                                if (k9 == k8) {
                                                                                    return net.minecraft.u.g.bC.c(H.DEFAULT.a());
                                                                                }
                                                                                k9 = i2.b();
                                                                                k8 = net.minecraft.u.g.cB;
                                                                            }
                                                                            if (arrstring != null) {
                                                                                if (k9 == k8) {
                                                                                    return net.minecraft.u.g.bC.c(H.SMOOTH.a());
                                                                                }
                                                                                k9 = i2.b();
                                                                                k8 = net.minecraft.u.g.aX;
                                                                            }
                                                                            if (arrstring != null) {
                                                                                if (k9 == k8) {
                                                                                    return net.minecraft.u.g.ch.d().a(cG.V, i2.b(cG.V));
                                                                                }
                                                                                k9 = i2.b();
                                                                                k8 = net.minecraft.u.g.a0;
                                                                            }
                                                                            if (arrstring == null) break block42;
                                                                            if (k9 == k8) {
                                                                                return net.minecraft.u.g.ch.d().a(cG.V, i2.b(cG.V));
                                                                            }
                                                                            i3 = i2;
                                                                            if (arrstring == null) break block43;
                                                                            k9 = i3.b();
                                                                            k8 = net.minecraft.u.g.di;
                                                                        }
                                                                        if (k9 == k8) {
                                                                            return net.minecraft.u.g.bC.d();
                                                                        }
                                                                        break block44;
                                                                    }
                                                                    n3 = this.h;
                                                                    n2 = 3;
                                                                }
                                                                if (arrstring == null) break block45;
                                                                if (n3 != n2) break block46;
                                                                k7 = i2.b();
                                                                if (arrstring == null) break block47;
                                                                if (k7 == net.minecraft.u.g.bu) break block48;
                                                                k6 = i2.b();
                                                                k5 = net.minecraft.u.g.aB;
                                                                if (arrstring == null) break block49;
                                                                if (k6 != k5) break block50;
                                                            }
                                                            k7 = net.minecraft.u.g.bu;
                                                        }
                                                        return k7.d().a(bc.B, net.minecraft.W.D.SPRUCE).a(bf.A, i2.b(bf.A));
                                                    }
                                                    k6 = i2.b();
                                                    k5 = net.minecraft.u.g.cB;
                                                }
                                                if (arrstring != null) {
                                                    if (k6 == k5) {
                                                        return net.minecraft.u.g.cB.d().a(bZ.z, net.minecraft.W.D.SPRUCE);
                                                    }
                                                    k6 = i2.b();
                                                    k5 = net.minecraft.u.g.aX;
                                                }
                                                if (arrstring == null) break block51;
                                                if (k6 == k5) {
                                                    return net.minecraft.u.g.aT.d().a(cG.V, i2.b(cG.V));
                                                }
                                                i3 = i2;
                                                if (arrstring == null) break block43;
                                                k6 = i3.b();
                                                k5 = net.minecraft.u.g.bt;
                                            }
                                            if (k6 == k5) {
                                                return net.minecraft.u.g.cN.d();
                                            }
                                            break block44;
                                        }
                                        n3 = this.h;
                                        n2 = 2;
                                    }
                                    if (n3 != n2) break block44;
                                    k4 = i2.b();
                                    if (arrstring == null) break block52;
                                    if (k4 == net.minecraft.u.g.bu) break block53;
                                    k3 = i2.b();
                                    k2 = net.minecraft.u.g.aB;
                                    if (arrstring == null) break block54;
                                    if (k3 != k2) break block55;
                                }
                                k4 = net.minecraft.u.g.aB;
                            }
                            return k4.d().a(bL.B, net.minecraft.W.D.ACACIA).a(bf.A, i2.b(bf.A));
                        }
                        k3 = i2.b();
                        k2 = net.minecraft.u.g.cB;
                    }
                    if (arrstring != null) {
                        if (k3 == k2) {
                            return net.minecraft.u.g.cB.d().a(bZ.z, net.minecraft.W.D.ACACIA);
                        }
                        k3 = i2.b();
                        k2 = net.minecraft.u.g.aX;
                    }
                    if (arrstring != null) {
                        if (k3 == k2) {
                            return net.minecraft.u.g.co.d().a(cG.V, i2.b(cG.V));
                        }
                        k3 = i2.b();
                        k2 = net.minecraft.u.g.cW;
                    }
                    if (arrstring == null) break block56;
                    if (k3 == k2) {
                        return net.minecraft.u.g.aB.d().a(bL.B, net.minecraft.W.D.ACACIA).a(bf.A, net.minecraft.W.o.Y);
                    }
                    i3 = i2;
                    if (arrstring == null) break block43;
                    k3 = i3.b();
                    k2 = net.minecraft.u.g.bt;
                }
                if (k3 == k2) {
                    return net.minecraft.u.g.aa.d();
                }
            }
            i3 = i2;
        }
        return i3;
    }

    @Nullable
    protected u a(a4 a42, List<u> list, Random random, int n2, int n3) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                default: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d());
                }
                case SOUTH: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d());
                }
                case WEST: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d());
                }
                case EAST: 
            }
            return net.minecraft.ao.h.b(a42, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d());
        }
        return null;
    }

    @Override
    protected void a(r r2, j j2) {
        this.i = r2.m("HPos");
        this.g = r2.m("VCount");
        this.h = r2.r("Type");
        String[] arrstring = u.b();
        if (arrstring != null) {
            if (r2.f("Desert")) {
                this.h = 1;
            }
            this.j = r2.f("Zombie");
        }
    }

    @Override
    protected void a(r r2) {
        r2.b("HPos", this.i);
        r2.b("VCount", this.g);
        r2.a("Type", (byte)this.h);
        r2.a("Zombie", this.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(b b10) {
        String[] arrstring = u.b();
        b b11 = b10;
        if (arrstring != null) {
            if (b11 == null) return 0 != 0;
            b11 = b10;
        }
        int n2 = b11.e;
        if (arrstring == null) return n2 != 0;
        if (n2 <= 10) return 0 != 0;
        return 1 != 0;
    }

    protected void a(int n2) {
        this.h = n2;
    }

    @Nullable
    protected u b(a4 a42, List<u> list, Random random, int n2, int n3) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                default: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d());
                }
                case SOUTH: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d());
                }
                case WEST: {
                    return net.minecraft.ao.h.b(a42, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d());
                }
                case EAST: 
            }
            return net.minecraft.ao.h.b(a42, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d());
        }
        return null;
    }

    protected int c(int n2, int n3) {
        return n3;
    }

    public a2() {
        this.i = -1;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5) {
        block6: {
            int n6;
            String[] arrstring;
            block5: {
                arrstring = u.b();
                int n7 = this.g;
                if (arrstring == null) break block5;
                if (n7 >= n5) break block6;
                n7 = n6 = this.g;
            }
            while (n6 < n5) {
                block8: {
                    D d10;
                    int n8;
                    int n9;
                    int n10;
                    block7: {
                        n10 = this.b(n2 + n6, n4);
                        n9 = this.a(n3);
                        n8 = this.a(n2 + n6, n4);
                        boolean bl2 = b10.a(new n(n10, n9, n8));
                        if (arrstring != null) {
                            if (!bl2 && arrstring != null) break;
                            ++this.g;
                            bl2 = this.j;
                        }
                        if (!bl2) break block7;
                        d10 = new ag(z2);
                        d10.c((double)n10 + 0.5, n9, (double)n8 + 0.5, 0.0f, 0.0f);
                        ((ag)d10).a(z2.h(new n(d10)), null);
                        ((ag)d10).a(this.c(n6, 0));
                        d10.A();
                        z2.f(d10);
                        if (arrstring != null) break block8;
                    }
                    d10 = new W(z2);
                    d10.c((double)n10 + 0.5, n9, (double)n8 + 0.5, 0.0f, 0.0f);
                    ((W)d10).a(this.c(n6, z2.J.nextInt(6)));
                    ((W)d10).a(z2.h(new n(d10)), null, false);
                    z2.f(d10);
                }
                ++n6;
                if (arrstring != null) continue;
            }
        }
    }

    protected int a(z z2, b b10) {
        int n2;
        String[] arrstring;
        int n3;
        int n4;
        block7: {
            n4 = 0;
            n3 = 0;
            o o2 = new o();
            int n5 = this.e.f;
            arrstring = u.b();
            block0: while (true) {
                int n6 = n5;
                block1: while (n6 <= this.e.d) {
                    n2 = this.e.c;
                    if (arrstring == null) break block7;
                    int n7 = n2;
                    while (n7 <= this.e.a) {
                        o2.a(n7, 64, n5);
                        if (arrstring != null) {
                            n6 = b10.a(o2) ? 1 : 0;
                            if (arrstring == null) continue block1;
                            if (n6 != 0) {
                                n4 += Math.max(z2.c(o2).b(), z2.D.c() - 1);
                                ++n3;
                            }
                            ++n7;
                        }
                        if (arrstring != null) continue;
                    }
                    ++n5;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            n2 = n3;
        }
        if (arrstring != null) {
            if (n2 == 0) {
                return -1;
            }
            n2 = n4 / n3;
        }
        return n2;
    }

    protected void a(z z2, aA aA2, int n2, int n3, int n4, b b10) {
        block3: {
            a2 a22;
            block2: {
                String[] arrstring = u.b();
                a22 = this;
                if (arrstring == null) break block2;
                if (a22.j) break block3;
                a22 = this;
            }
            a22.a(z2, net.minecraft.u.g.h.d().a(cV.z, aA2), n2, n3, n4, b10);
        }
    }
}

