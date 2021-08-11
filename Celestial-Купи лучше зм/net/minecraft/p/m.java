/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.W.be;
import net.minecraft.W.cR;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class m
extends b {
    private final /* synthetic */ i d;
    private final /* synthetic */ int h;
    private static final /* synthetic */ i a;
    private static final /* synthetic */ i g;
    private final /* synthetic */ i f;
    private final /* synthetic */ boolean e;

    public m(boolean bl2, int n2, i i2, i i3, boolean bl3) {
        super(bl2);
        this.h = n2;
        this.f = i2;
        this.d = i3;
        this.e = bl3;
    }

    private void a(z z2, int n2, n n3, aA aA2) {
        this.a(z2, n3, net.minecraft.u.g.cT.d().a(be.C, n2).a(be.z, aA2));
    }

    public m(boolean bl2) {
        this(bl2, 4, a, g, false);
    }

    private void a(z z2, n n2, c c10) {
        this.a(z2, n2, net.minecraft.u.g.aW.d().a(c10, true));
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block83: {
            block84: {
                int n4;
                block98: {
                    block97: {
                        int n5;
                        block118: {
                            block80: {
                                int n6;
                                boolean bl2;
                                int n7;
                                block81: {
                                    Object object;
                                    n n8;
                                    int n9;
                                    int n10;
                                    int n11;
                                    block79: {
                                        int n12;
                                        int n13;
                                        int n14;
                                        block95: {
                                            K k2;
                                            K k3;
                                            block96: {
                                                K k4;
                                                block94: {
                                                    block93: {
                                                        int n15;
                                                        block92: {
                                                            block78: {
                                                                n7 = random.nextInt(3) + this.h;
                                                                int n16 = 1;
                                                                bl2 = net.minecraft.p.a.d();
                                                                n3 = n2.b();
                                                                if (bl2) break block83;
                                                                if (n3 < 1) break block84;
                                                                n3 = n2.b() + n7 + 1;
                                                                if (bl2) break block83;
                                                                if (n3 > 256) break block84;
                                                                int n17 = n2.b();
                                                                block0: while (true) {
                                                                    int n18 = n17;
                                                                    block1: while (n18 <= n2.b() + 1 + n7) {
                                                                        block87: {
                                                                            int n19;
                                                                            block86: {
                                                                                int n20;
                                                                                block85: {
                                                                                    n14 = 1;
                                                                                    n15 = n17;
                                                                                    if (bl2) break block78;
                                                                                    n20 = n2.b();
                                                                                    if (bl2) break block85;
                                                                                    if (n15 == n20) {
                                                                                        n14 = 0;
                                                                                    }
                                                                                    n19 = n17;
                                                                                    if (bl2) break block86;
                                                                                    n20 = n2.b() + 1 + n7 - 2;
                                                                                }
                                                                                if (n19 < n20) break block87;
                                                                                n19 = 2;
                                                                            }
                                                                            n14 = n19;
                                                                        }
                                                                        o o2 = new o();
                                                                        n6 = n2.e() - n14;
                                                                        block2: while (true) {
                                                                            int n21 = n6;
                                                                            block3: while (n21 <= n2.e() + n14) {
                                                                                n18 = n16;
                                                                                if (bl2) continue block1;
                                                                                if (!bl2) {
                                                                                    if (n18 == 0) break block2;
                                                                                    int n22 = n13 = n2.a() - n14;
                                                                                }
                                                                                while (n13 <= n2.a() + n14) {
                                                                                    block91: {
                                                                                        int n23;
                                                                                        block88: {
                                                                                            block89: {
                                                                                                boolean bl3;
                                                                                                block90: {
                                                                                                    n21 = n16;
                                                                                                    if (bl2) continue block3;
                                                                                                    if (!bl2) {
                                                                                                        if (n21 == 0) break;
                                                                                                        n23 = n17;
                                                                                                    }
                                                                                                    if (bl2) break block88;
                                                                                                    if (n23 < 0) break block89;
                                                                                                    n23 = n17;
                                                                                                    if (bl2) break block88;
                                                                                                    if (n23 >= 256) break block89;
                                                                                                    bl3 = this.a(z2.d(o2.a(n6, n17, n13)).b());
                                                                                                    if (bl2) break block90;
                                                                                                    if (bl3) break block91;
                                                                                                    bl3 = false;
                                                                                                }
                                                                                                n16 = bl3 ? 1 : 0;
                                                                                                if (!bl2) break block91;
                                                                                            }
                                                                                            n23 = 0;
                                                                                        }
                                                                                        n16 = n23;
                                                                                    }
                                                                                    ++n13;
                                                                                    if (!bl2) continue;
                                                                                }
                                                                                ++n6;
                                                                                if (!bl2) continue block2;
                                                                            }
                                                                            break;
                                                                        }
                                                                        ++n17;
                                                                        if (!bl2) continue block0;
                                                                    }
                                                                    break;
                                                                }
                                                                n15 = n16;
                                                            }
                                                            if (bl2) break block92;
                                                            if (n15 != 0) break block93;
                                                            n15 = 0;
                                                        }
                                                        return n15 != 0;
                                                    }
                                                    k3 = k4 = z2.d(n2.k()).b();
                                                    k2 = net.minecraft.u.g.aU;
                                                    if (bl2) break block94;
                                                    if (k3 == k2) break block95;
                                                    k3 = k4;
                                                    k2 = net.minecraft.u.g.bv;
                                                }
                                                if (bl2) break block96;
                                                if (k3 == k2) break block95;
                                                k3 = k4;
                                                k2 = net.minecraft.u.g.cU;
                                            }
                                            if (k3 != k2) break block97;
                                        }
                                        n4 = n2.b();
                                        if (bl2) break block98;
                                        if (n4 >= 256 - n7 - 1) break block97;
                                        this.a(z2, n2.k());
                                        n14 = 3;
                                        boolean bl4 = false;
                                        n6 = n2.b() - 3 + n7;
                                        block5: while (true) {
                                            int n24 = n6;
                                            block6: while (n24 <= n2.b() + n7) {
                                                n13 = n6 - (n2.b() + n7);
                                                n11 = 1 - n13 / 2;
                                                n12 = n2.e() - n11;
                                                if (bl2) break block79;
                                                int n25 = n12;
                                                block7: while (true) {
                                                    int n26 = n25;
                                                    int n27 = n2.e() + n11;
                                                    block8: while (n26 <= n27) {
                                                        n10 = n25 - n2.e();
                                                        n24 = n2.a() - n11;
                                                        if (bl2) continue block6;
                                                        for (n9 = v2068325; n9 <= n2.a() + n11; ++n9) {
                                                            block103: {
                                                                net.minecraft.ac.c c10;
                                                                net.minecraft.ac.c c11;
                                                                block104: {
                                                                    block102: {
                                                                        block100: {
                                                                            int n28;
                                                                            block101: {
                                                                                int n29;
                                                                                block99: {
                                                                                    int n30 = n9 - n2.a();
                                                                                    n26 = Math.abs(n10);
                                                                                    n27 = n11;
                                                                                    if (bl2) continue block8;
                                                                                    if (bl2) break block99;
                                                                                    if (n26 != n27) break block100;
                                                                                    n28 = Math.abs(n30);
                                                                                    if (bl2) break block101;
                                                                                    n29 = n11;
                                                                                }
                                                                                if (n28 != n29) break block100;
                                                                                n28 = random.nextInt(2);
                                                                            }
                                                                            if (!bl2) {
                                                                                if (n28 == 0) continue;
                                                                                n28 = n13;
                                                                            }
                                                                            if (n28 == 0) continue;
                                                                        }
                                                                        n8 = new n(n25, n6, n9);
                                                                        object = z2.d(n8).o();
                                                                        c11 = object;
                                                                        c10 = net.minecraft.ac.c.A;
                                                                        if (bl2) break block102;
                                                                        if (c11 == c10) break block103;
                                                                        c11 = object;
                                                                        c10 = net.minecraft.ac.c.J;
                                                                    }
                                                                    if (bl2) break block104;
                                                                    if (c11 == c10) break block103;
                                                                    c11 = object;
                                                                    c10 = net.minecraft.ac.c.z;
                                                                }
                                                                if (c11 != c10) continue;
                                                            }
                                                            this.a(z2, n8, this.d);
                                                            if (!bl2) continue;
                                                        }
                                                        ++n25;
                                                        if (!bl2) continue block7;
                                                    }
                                                    break;
                                                }
                                                ++n6;
                                                if (!bl2) continue block5;
                                            }
                                            break;
                                        }
                                        n12 = n6 = 0;
                                    }
                                    while (n6 < n7) {
                                        block109: {
                                            block108: {
                                                int n31;
                                                block117: {
                                                    block115: {
                                                        block116: {
                                                            block113: {
                                                                block114: {
                                                                    block111: {
                                                                        block112: {
                                                                            block110: {
                                                                                block105: {
                                                                                    block106: {
                                                                                        net.minecraft.ac.c c12;
                                                                                        net.minecraft.ac.c c13;
                                                                                        block107: {
                                                                                            net.minecraft.ac.c c14 = z2.d(n2.c(n6)).o();
                                                                                            if (bl2) break block80;
                                                                                            if (bl2) break block105;
                                                                                            if (c14 == net.minecraft.ac.c.A) break block106;
                                                                                            c13 = c14;
                                                                                            c12 = net.minecraft.ac.c.J;
                                                                                            if (bl2) break block107;
                                                                                            if (c13 == c12) break block106;
                                                                                            c13 = c14;
                                                                                            c12 = net.minecraft.ac.c.z;
                                                                                        }
                                                                                        if (c13 != c12) break block108;
                                                                                    }
                                                                                    this.a(z2, n2.c(n6), this.f);
                                                                                }
                                                                                if (bl2) break block109;
                                                                                if (!this.e) break block108;
                                                                                n31 = n6;
                                                                                if (bl2) break block110;
                                                                                if (n31 <= 0) break block108;
                                                                                n31 = random.nextInt(3);
                                                                            }
                                                                            if (bl2) break block111;
                                                                            if (n31 <= 0) break block112;
                                                                            n31 = z2.a(n2.a(-1, n6, 0)) ? 1 : 0;
                                                                            if (bl2) break block111;
                                                                            if (n31 != 0) {
                                                                                this.a(z2, n2.a(-1, n6, 0), cR.C);
                                                                            }
                                                                        }
                                                                        n31 = random.nextInt(3);
                                                                    }
                                                                    if (bl2) break block113;
                                                                    if (n31 <= 0) break block114;
                                                                    n31 = z2.a(n2.a(1, n6, 0)) ? 1 : 0;
                                                                    if (bl2) break block113;
                                                                    if (n31 != 0) {
                                                                        this.a(z2, n2.a(1, n6, 0), cR.D);
                                                                    }
                                                                }
                                                                n31 = random.nextInt(3);
                                                            }
                                                            if (bl2) break block115;
                                                            if (n31 <= 0) break block116;
                                                            n31 = z2.a(n2.a(0, n6, -1)) ? 1 : 0;
                                                            if (bl2) break block115;
                                                            if (n31 != 0) {
                                                                this.a(z2, n2.a(0, n6, -1), cR.E);
                                                            }
                                                        }
                                                        n31 = random.nextInt(3);
                                                    }
                                                    if (bl2) break block117;
                                                    if (n31 <= 0) break block108;
                                                    n31 = z2.a(n2.a(0, n6, 1)) ? 1 : 0;
                                                }
                                                if (n31 != 0) {
                                                    this.a(z2, n2.a(0, n6, 1), cR.J);
                                                }
                                            }
                                            ++n6;
                                        }
                                        if (!bl2) continue;
                                    }
                                    n5 = this.e;
                                    if (bl2) break block118;
                                    if (n5 == 0) break block80;
                                    n6 = n2.b() - 3 + n7;
                                    block11: while (true) {
                                        int n32 = n6;
                                        block12: while (n32 <= n2.b() + n7) {
                                            int n33 = n6 - (n2.b() + n7);
                                            n11 = 2 - n33 / 2;
                                            o o3 = new o();
                                            n5 = n2.e() - n11;
                                            if (bl2) break block81;
                                            n10 = n5;
                                            while (n10 <= n2.e() + n11) {
                                                block82: {
                                                    n32 = n2.a() - n11;
                                                    if (bl2) continue block12;
                                                    n9 = n32;
                                                    while (n9 <= n2.a() + n11) {
                                                        o3.a(n10, n6, n9);
                                                        if (!bl2) {
                                                            if (!bl2) {
                                                                if (z2.d(o3).o() == net.minecraft.ac.c.J) {
                                                                    n n34 = o3.b();
                                                                    n8 = o3.m();
                                                                    object = o3.i();
                                                                    n n35 = o3.j();
                                                                    int n36 = random.nextInt(4);
                                                                    if (!bl2) {
                                                                        if (n36 == 0 && z2.d(n34).o() == net.minecraft.ac.c.A) {
                                                                            this.b(z2, n34, cR.C);
                                                                        }
                                                                        n36 = random.nextInt(4);
                                                                    }
                                                                    if (!bl2) {
                                                                        if (n36 == 0 && z2.d(n8).o() == net.minecraft.ac.c.A) {
                                                                            this.b(z2, n8, cR.D);
                                                                        }
                                                                        n36 = random.nextInt(4);
                                                                    }
                                                                    if (!bl2) {
                                                                        if (n36 == 0 && z2.d((n)object).o() == net.minecraft.ac.c.A) {
                                                                            this.b(z2, (n)object, cR.E);
                                                                        }
                                                                        n36 = random.nextInt(4);
                                                                    }
                                                                    if (n36 == 0 && z2.d(n35).o() == net.minecraft.ac.c.A) {
                                                                        this.b(z2, n35, cR.J);
                                                                    }
                                                                }
                                                                ++n9;
                                                            }
                                                            if (!bl2) continue;
                                                        }
                                                        break block82;
                                                    }
                                                    ++n10;
                                                }
                                                if (!bl2) continue;
                                            }
                                            ++n6;
                                            if (!bl2) continue block11;
                                        }
                                        break;
                                    }
                                    n5 = random.nextInt(5);
                                }
                                if (bl2) break block118;
                                if (n5 != 0) break block80;
                                n5 = n7;
                                if (bl2) break block118;
                                if (n5 > 5) {
                                    n6 = 0;
                                    block15: while (true) {
                                        int n37 = n6;
                                        block16: while (n37 < 2) {
                                            for (aA aA2 : av.HORIZONTAL) {
                                                n37 = random.nextInt(4 - n6);
                                                if (bl2) continue block16;
                                                if (n37 == 0) {
                                                    aA aA3 = aA2.h();
                                                    this.a(z2, random.nextInt(3), n2.a(aA3.r(), n7 - 5 + n6, aA3.i()), aA2);
                                                }
                                                if (!bl2) continue;
                                            }
                                            ++n6;
                                            if (!bl2) continue block15;
                                        }
                                        break;
                                    }
                                }
                            }
                            n5 = 1;
                        }
                        return n5 != 0;
                    }
                    n4 = 0;
                }
                return n4 != 0;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private void b(z z2, n n2, c c10) {
        boolean bl2 = net.minecraft.p.a.c();
        this.a(z2, n2, c10);
        boolean bl3 = bl2;
        n n3 = n2.k();
        for (int i2 = 4; z2.d(n3).o() == net.minecraft.ac.c.A && i2 > 0; --i2) {
            this.a(z2, n3, c10);
            n3 = n3.k();
            if (bl3) continue;
        }
    }

    static {
        a = net.minecraft.u.g.bu.d().a(bc.B, D.OAK);
        g = net.minecraft.u.g.bU.d().a(bR.D, D.OAK).a(b2.A, false);
    }
}

