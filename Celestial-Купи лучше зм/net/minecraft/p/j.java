/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.W.cR;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class j
extends b {
    private static final /* synthetic */ i a;
    private static final /* synthetic */ i d;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = g.bu.d().a(bc.B, D.OAK);
        d = g.bU.d().a(bR.D, D.OAK).a(bR.A, false);
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block60: {
            block61: {
                int n4;
                block77: {
                    block76: {
                        int n5;
                        block58: {
                            n n6;
                            int n7;
                            boolean bl2;
                            int n8;
                            block57: {
                                block56: {
                                    int n9;
                                    int n10;
                                    int n11;
                                    block75: {
                                        K k2;
                                        K k3;
                                        block74: {
                                            K k4;
                                            block73: {
                                                int n12;
                                                block72: {
                                                    block55: {
                                                        n8 = random.nextInt(4) + 5;
                                                        bl2 = net.minecraft.p.a.d();
                                                        while (z2.d(n2.k()).o() == net.minecraft.ac.c.L) {
                                                            n2 = n2.k();
                                                            if (!bl2) continue;
                                                        }
                                                        int n13 = 1;
                                                        n3 = n2.b();
                                                        if (bl2) break block60;
                                                        if (n3 < 1) break block61;
                                                        n3 = n2.b() + n8 + 1;
                                                        if (bl2) break block60;
                                                        if (n3 > 256) break block61;
                                                        int n14 = n2.b();
                                                        block1: while (true) {
                                                            int n15 = n14;
                                                            block2: while (n15 <= n2.b() + 1 + n8) {
                                                                block64: {
                                                                    int n16;
                                                                    block63: {
                                                                        int n17;
                                                                        block62: {
                                                                            n7 = 1;
                                                                            n12 = n14;
                                                                            if (bl2) break block55;
                                                                            n17 = n2.b();
                                                                            if (bl2) break block62;
                                                                            if (n12 == n17) {
                                                                                n7 = 0;
                                                                            }
                                                                            n16 = n14;
                                                                            if (bl2) break block63;
                                                                            n17 = n2.b() + 1 + n8 - 2;
                                                                        }
                                                                        if (n16 < n17) break block64;
                                                                        n16 = 3;
                                                                    }
                                                                    n7 = n16;
                                                                }
                                                                o o2 = new o();
                                                                n11 = n2.e() - n7;
                                                                block3: while (true) {
                                                                    int n18 = n11;
                                                                    block4: while (n18 <= n2.e() + n7) {
                                                                        n15 = n13;
                                                                        if (bl2) continue block2;
                                                                        if (!bl2) {
                                                                            if (n15 == 0) break block3;
                                                                            int n19 = n10 = n2.a() - n7;
                                                                        }
                                                                        while (n10 <= n2.a() + n7) {
                                                                            block71: {
                                                                                int n20;
                                                                                block65: {
                                                                                    block66: {
                                                                                        block68: {
                                                                                            block70: {
                                                                                                K k5;
                                                                                                block69: {
                                                                                                    net.minecraft.ac.c c10;
                                                                                                    net.minecraft.ac.c c11;
                                                                                                    K k6;
                                                                                                    block67: {
                                                                                                        n18 = n13;
                                                                                                        if (bl2) continue block4;
                                                                                                        if (!bl2) {
                                                                                                            if (n18 == 0) break;
                                                                                                            n20 = n14;
                                                                                                        }
                                                                                                        if (bl2) break block65;
                                                                                                        if (n20 < 0) break block66;
                                                                                                        n20 = n14;
                                                                                                        if (bl2) break block65;
                                                                                                        if (n20 >= 256) break block66;
                                                                                                        i i2 = z2.d(o2.a(n11, n14, n10));
                                                                                                        k6 = i2.b();
                                                                                                        c11 = i2.o();
                                                                                                        c10 = net.minecraft.ac.c.A;
                                                                                                        if (bl2) break block67;
                                                                                                        if (c11 == c10) break block68;
                                                                                                        c11 = i2.o();
                                                                                                        c10 = net.minecraft.ac.c.J;
                                                                                                    }
                                                                                                    if (c11 == c10) break block68;
                                                                                                    k5 = k6;
                                                                                                    if (bl2) break block69;
                                                                                                    if (k5 == g.bQ) break block70;
                                                                                                    k5 = k6;
                                                                                                }
                                                                                                if (k5 == g.cL) break block70;
                                                                                                n13 = 0;
                                                                                                if (!bl2) break block68;
                                                                                            }
                                                                                            int n21 = n14;
                                                                                            if (!bl2 && n21 > n2.b()) {
                                                                                                n21 = n13 = 0;
                                                                                            }
                                                                                        }
                                                                                        if (!bl2) break block71;
                                                                                    }
                                                                                    n20 = 0;
                                                                                }
                                                                                n13 = n20;
                                                                            }
                                                                            ++n10;
                                                                            if (!bl2) continue;
                                                                        }
                                                                        ++n11;
                                                                        if (!bl2) continue block3;
                                                                    }
                                                                    break;
                                                                }
                                                                ++n14;
                                                                if (!bl2) continue block1;
                                                            }
                                                            break;
                                                        }
                                                        n12 = n13;
                                                    }
                                                    if (bl2) break block72;
                                                    if (n12 != 0) break block73;
                                                    n12 = 0;
                                                }
                                                return n12 != 0;
                                            }
                                            k3 = k4 = z2.d(n2.k()).b();
                                            k2 = g.aU;
                                            if (bl2) break block74;
                                            if (k3 == k2) break block75;
                                            k3 = k4;
                                            k2 = g.bv;
                                        }
                                        if (k3 != k2) break block76;
                                    }
                                    n4 = n2.b();
                                    if (bl2) break block77;
                                    if (n4 >= 256 - n8 - 1) break block76;
                                    this.a(z2, n2.k());
                                    n7 = n2.b() - 3 + n8;
                                    block6: while (true) {
                                        int n22 = n7;
                                        block7: while (n22 <= n2.b() + n8) {
                                            int n23 = n7 - (n2.b() + n8);
                                            n11 = 2 - n23 / 2;
                                            n9 = n2.e() - n11;
                                            if (bl2) break block56;
                                            n10 = n9;
                                            block8: while (true) {
                                                int n24 = n10;
                                                int n25 = n2.e() + n11;
                                                block9: while (n24 <= n25) {
                                                    int n26 = n10 - n2.e();
                                                    n22 = n2.a() - n11;
                                                    if (bl2) continue block7;
                                                    int n27 = n22;
                                                    while (n27 <= n2.a() + n11) {
                                                        block83: {
                                                            block82: {
                                                                block79: {
                                                                    int n28;
                                                                    block81: {
                                                                        block80: {
                                                                            int n29;
                                                                            block78: {
                                                                                int n30 = n27 - n2.a();
                                                                                n24 = Math.abs(n26);
                                                                                n25 = n11;
                                                                                if (bl2) continue block9;
                                                                                if (bl2) break block78;
                                                                                if (n24 != n25) break block79;
                                                                                n28 = Math.abs(n30);
                                                                                if (bl2) break block80;
                                                                                n29 = n11;
                                                                            }
                                                                            if (n28 != n29) break block79;
                                                                            n28 = random.nextInt(2);
                                                                        }
                                                                        if (bl2) break block81;
                                                                        if (n28 == 0) break block82;
                                                                        n28 = n23;
                                                                    }
                                                                    if (n28 == 0) break block82;
                                                                }
                                                                n6 = new n(n10, n7, n27);
                                                                if (bl2) break block83;
                                                                if (!z2.d(n6).m()) {
                                                                    this.a(z2, n6, d);
                                                                }
                                                            }
                                                            ++n27;
                                                        }
                                                        if (!bl2) continue;
                                                    }
                                                    ++n10;
                                                    if (!bl2) continue block8;
                                                }
                                                break;
                                            }
                                            ++n7;
                                            if (!bl2) continue block6;
                                        }
                                        break;
                                    }
                                    n9 = n7 = 0;
                                }
                                while (n7 < n8) {
                                    block87: {
                                        block85: {
                                            K k7;
                                            block86: {
                                                net.minecraft.ac.c c12;
                                                net.minecraft.ac.c c13;
                                                K k8;
                                                block84: {
                                                    i i3 = z2.d(n2.c(n7));
                                                    k8 = i3.b();
                                                    if (bl2) break block57;
                                                    c13 = i3.o();
                                                    c12 = net.minecraft.ac.c.A;
                                                    if (bl2) break block84;
                                                    if (c13 == c12) break block85;
                                                    c13 = i3.o();
                                                    c12 = net.minecraft.ac.c.J;
                                                }
                                                if (c13 == c12) break block85;
                                                k7 = k8;
                                                if (bl2) break block86;
                                                if (k7 == g.cL) break block85;
                                                k7 = k8;
                                            }
                                            if (k7 != g.bQ) break block87;
                                        }
                                        this.a(z2, n2.c(n7), a);
                                    }
                                    ++n7;
                                    if (!bl2) continue;
                                }
                                n7 = n2.b() - 3 + n8;
                            }
                            block12: while (true) {
                                int n31 = n7;
                                block13: while (n31 <= n2.b() + n8) {
                                    int n32 = n7 - (n2.b() + n8);
                                    int n33 = 2 - n32 / 2;
                                    o o3 = new o();
                                    n5 = n2.e() - n33;
                                    if (bl2) break block58;
                                    int n34 = n5;
                                    while (n34 <= n2.e() + n33) {
                                        block59: {
                                            n31 = n2.a() - n33;
                                            if (bl2) continue block13;
                                            int n35 = n31;
                                            while (n35 <= n2.a() + n33) {
                                                o3.a(n34, n7, n35);
                                                if (!bl2) {
                                                    if (!bl2) {
                                                        if (z2.d(o3).o() == net.minecraft.ac.c.J) {
                                                            n n36 = o3.b();
                                                            n6 = o3.m();
                                                            n n37 = o3.i();
                                                            n n38 = o3.j();
                                                            int n39 = random.nextInt(4);
                                                            if (!bl2) {
                                                                if (n39 == 0 && z2.d(n36).o() == net.minecraft.ac.c.A) {
                                                                    this.a(z2, n36, cR.C);
                                                                }
                                                                n39 = random.nextInt(4);
                                                            }
                                                            if (!bl2) {
                                                                if (n39 == 0 && z2.d(n6).o() == net.minecraft.ac.c.A) {
                                                                    this.a(z2, n6, cR.D);
                                                                }
                                                                n39 = random.nextInt(4);
                                                            }
                                                            if (!bl2) {
                                                                if (n39 == 0 && z2.d(n37).o() == net.minecraft.ac.c.A) {
                                                                    this.a(z2, n37, cR.E);
                                                                }
                                                                n39 = random.nextInt(4);
                                                            }
                                                            if (n39 == 0 && z2.d(n38).o() == net.minecraft.ac.c.A) {
                                                                this.a(z2, n38, cR.J);
                                                            }
                                                        }
                                                        ++n35;
                                                    }
                                                    if (!bl2) continue;
                                                }
                                                break block59;
                                            }
                                            ++n34;
                                        }
                                        if (!bl2) continue;
                                    }
                                    ++n7;
                                    if (!bl2) continue block12;
                                }
                                break;
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

    private void a(z z2, n n2, c c10) {
        i i2 = g.aW.d().a(c10, true);
        this.a(z2, n2, i2);
        boolean bl2 = net.minecraft.p.a.c();
        n n3 = n2.k();
        for (int i3 = 4; z2.d(n3).o() == net.minecraft.ac.c.A && i3 > 0; --i3) {
            this.a(z2, n3, i2);
            n3 = n3.k();
            if (bl2) continue;
        }
    }

    public j() {
        super(false);
    }
}

