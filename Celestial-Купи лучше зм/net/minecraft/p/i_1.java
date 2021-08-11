/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.bL;
import net.minecraft.W.bW;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class i
extends b {
    private static final /* synthetic */ net.minecraft.Z.i a;
    private static final /* synthetic */ net.minecraft.Z.i d;

    private void c(z z2, n n2) {
        block2: {
            block1: {
                c c10;
                c c11;
                block0: {
                    c c12 = z2.d(n2).o();
                    boolean bl2 = net.minecraft.p.a.c();
                    c11 = c12;
                    c10 = c.A;
                    if (!bl2) break block0;
                    if (c11 == c10) break block1;
                    c11 = c12;
                    c10 = c.J;
                }
                if (c11 != c10) break block2;
            }
            this.a(z2, n2, d);
        }
    }

    static {
        a = g.aB.d().a(bL.B, D.ACACIA);
        d = g.S.d().a(bW.D, D.ACACIA).a(b2.A, false);
    }

    private void b(z z2, n n2) {
        this.a(z2, n2, a);
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block60: {
            block61: {
                int n4;
                block74: {
                    block73: {
                        int n5;
                        block58: {
                            block80: {
                                n n6;
                                int n7;
                                boolean bl2;
                                block57: {
                                    int n8;
                                    int n9;
                                    int n10;
                                    int n11;
                                    block56: {
                                        aA aA2;
                                        int n12;
                                        aA aA3;
                                        int n13;
                                        block54: {
                                            int n14;
                                            n n15;
                                            int n16;
                                            block53: {
                                                int n17;
                                                n n18;
                                                block52: {
                                                    int n19;
                                                    block72: {
                                                        K k2;
                                                        K k3;
                                                        block71: {
                                                            K k4;
                                                            block70: {
                                                                int n20;
                                                                block69: {
                                                                    block51: {
                                                                        n13 = random.nextInt(3) + random.nextInt(3) + 5;
                                                                        bl2 = net.minecraft.p.a.c();
                                                                        int n21 = 1;
                                                                        n3 = n2.b();
                                                                        if (!bl2) break block60;
                                                                        if (n3 < 1) break block61;
                                                                        n3 = n2.b() + n13 + 1;
                                                                        if (!bl2) break block60;
                                                                        if (n3 > 256) break block61;
                                                                        int n22 = n2.b();
                                                                        block0: while (true) {
                                                                            int n23 = n22;
                                                                            block1: while (n23 <= n2.b() + 1 + n13) {
                                                                                int n24;
                                                                                block64: {
                                                                                    int n25;
                                                                                    block63: {
                                                                                        int n26;
                                                                                        block62: {
                                                                                            n24 = 1;
                                                                                            n20 = n22;
                                                                                            if (!bl2) break block51;
                                                                                            n26 = n2.b();
                                                                                            if (!bl2) break block62;
                                                                                            if (n20 == n26) {
                                                                                                n24 = 0;
                                                                                            }
                                                                                            n25 = n22;
                                                                                            if (!bl2) break block63;
                                                                                            n26 = n2.b() + 1 + n13 - 2;
                                                                                        }
                                                                                        if (n25 < n26) break block64;
                                                                                        n25 = 2;
                                                                                    }
                                                                                    n24 = n25;
                                                                                }
                                                                                o o2 = new o();
                                                                                n19 = n2.e() - n24;
                                                                                block2: while (true) {
                                                                                    int n27 = n19;
                                                                                    block3: while (n27 <= n2.e() + n24) {
                                                                                        n23 = n21;
                                                                                        if (!bl2) continue block1;
                                                                                        if (bl2) {
                                                                                            if (n23 == 0) break block2;
                                                                                            int n28 = n11 = n2.a() - n24;
                                                                                        }
                                                                                        while (n11 <= n2.a() + n24) {
                                                                                            block68: {
                                                                                                int n29;
                                                                                                block65: {
                                                                                                    block66: {
                                                                                                        boolean bl3;
                                                                                                        block67: {
                                                                                                            n27 = n21;
                                                                                                            if (!bl2) continue block3;
                                                                                                            if (bl2) {
                                                                                                                if (n27 == 0) break;
                                                                                                                n29 = n22;
                                                                                                            }
                                                                                                            if (!bl2) break block65;
                                                                                                            if (n29 < 0) break block66;
                                                                                                            n29 = n22;
                                                                                                            if (!bl2) break block65;
                                                                                                            if (n29 >= 256) break block66;
                                                                                                            bl3 = this.a(z2.d(o2.a(n19, n22, n11)).b());
                                                                                                            if (!bl2) break block67;
                                                                                                            if (bl3) break block68;
                                                                                                            bl3 = false;
                                                                                                        }
                                                                                                        n21 = bl3 ? 1 : 0;
                                                                                                        if (bl2) break block68;
                                                                                                    }
                                                                                                    n29 = 0;
                                                                                                }
                                                                                                n21 = n29;
                                                                                            }
                                                                                            ++n11;
                                                                                            if (bl2) continue;
                                                                                        }
                                                                                        ++n19;
                                                                                        if (bl2) continue block2;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                ++n22;
                                                                                if (bl2) continue block0;
                                                                            }
                                                                            break;
                                                                        }
                                                                        n20 = n21;
                                                                    }
                                                                    if (!bl2) break block69;
                                                                    if (n20 != 0) break block70;
                                                                    n20 = 0;
                                                                }
                                                                return n20 != 0;
                                                            }
                                                            k3 = k4 = z2.d(n2.k()).b();
                                                            k2 = g.aU;
                                                            if (!bl2) break block71;
                                                            if (k3 == k2) break block72;
                                                            k3 = k4;
                                                            k2 = g.bv;
                                                        }
                                                        if (k3 != k2) break block73;
                                                    }
                                                    n4 = n2.b();
                                                    if (!bl2) break block74;
                                                    if (n4 >= 256 - n13 - 1) break block73;
                                                    this.a(z2, n2.k());
                                                    aA3 = av.HORIZONTAL.a(random);
                                                    n12 = n13 - random.nextInt(4) - 1;
                                                    n19 = 3 - random.nextInt(3);
                                                    n11 = n2.e();
                                                    n10 = n2.a();
                                                    n9 = 0;
                                                    for (int i2 = 0; i2 < n13; ++i2) {
                                                        block76: {
                                                            int n30;
                                                            block77: {
                                                                block75: {
                                                                    n18 = n2;
                                                                    if (!bl2) break block52;
                                                                    n16 = n18.b() + i2;
                                                                    n30 = i2;
                                                                    if (!bl2) break block75;
                                                                    if (n30 < n12) break block76;
                                                                    n30 = n19;
                                                                }
                                                                if (!bl2) break block77;
                                                                if (n30 <= 0) break block76;
                                                                n11 += aA3.r();
                                                                n30 = n10 + aA3.i();
                                                            }
                                                            n10 = n30;
                                                            --n19;
                                                        }
                                                        n n31 = new n(n11, n16, n10);
                                                        c c10 = z2.d(n31).o();
                                                        if (bl2) {
                                                            if (c10 != c.A && c10 != c.J) continue;
                                                            this.b(z2, n31);
                                                        }
                                                        n9 = n16;
                                                        if (bl2) continue;
                                                    }
                                                    n18 = new n(n11, n9, n10);
                                                }
                                                n15 = n18;
                                                n16 = -3;
                                                block6: while (true) {
                                                    int n32 = n16;
                                                    int n33 = 3;
                                                    block7: while (n32 <= n33) {
                                                        n17 = -3;
                                                        if (!bl2) break block53;
                                                        for (int i3 = v2051103; i3 <= 3; ++i3) {
                                                            block79: {
                                                                int n34;
                                                                int n35;
                                                                block78: {
                                                                    n32 = Math.abs(n16);
                                                                    n33 = 3;
                                                                    if (!bl2) continue block7;
                                                                    if (!bl2) break block78;
                                                                    if (n32 != n33) break block79;
                                                                    n35 = Math.abs(i3);
                                                                    n34 = 3;
                                                                }
                                                                if (n35 == n34) continue;
                                                            }
                                                            this.c(z2, n15.a(n16, 0, i3));
                                                            if (bl2) continue;
                                                        }
                                                        ++n16;
                                                        if (bl2) continue block6;
                                                    }
                                                    break;
                                                }
                                                n15 = n15.a();
                                                n17 = n16 = -1;
                                            }
                                            while (n16 <= 1) {
                                                block55: {
                                                    n14 = -1;
                                                    if (!bl2) break block54;
                                                    for (int i4 = v2051143; i4 <= 1; ++i4) {
                                                        this.c(z2, n15.a(n16, 0, i4));
                                                        if (bl2) {
                                                            if (bl2) continue;
                                                        }
                                                        break block55;
                                                    }
                                                    ++n16;
                                                }
                                                if (bl2) continue;
                                            }
                                            this.c(z2, n15.b(2));
                                            this.c(z2, n15.d(2));
                                            this.c(z2, n15.f(2));
                                            this.c(z2, n15.e(2));
                                            n11 = n2.e();
                                            n14 = n10 = n2.a();
                                        }
                                        if ((aA2 = av.HORIZONTAL.a(random)) == aA3) break block80;
                                        int n36 = n12 - random.nextInt(2) - 1;
                                        int n37 = 1 + random.nextInt(3);
                                        n9 = 0;
                                        int n38 = n36;
                                        while (n38 < n13) {
                                            block82: {
                                                block83: {
                                                    int n39;
                                                    int n40;
                                                    block81: {
                                                        n5 = n37;
                                                        if (!bl2 || !bl2) break block56;
                                                        if (n5 <= 0) break;
                                                        n40 = n38;
                                                        n39 = 1;
                                                        if (!bl2) break block81;
                                                        if (n40 < n39) break block82;
                                                        n40 = n2.b();
                                                        n39 = n38;
                                                    }
                                                    n7 = n40 + n39;
                                                    n n41 = new n(n11 += aA2.r(), n7, n10 += aA2.i());
                                                    c c11 = z2.d(n41).o();
                                                    if (!bl2) break block83;
                                                    if (c11 != c.A && c11 != c.J) break block82;
                                                    this.b(z2, n41);
                                                }
                                                n9 = n7;
                                            }
                                            ++n38;
                                            --n37;
                                            if (bl2) continue;
                                        }
                                        n5 = n9;
                                    }
                                    if (!bl2) break block58;
                                    if (n5 <= 0) break block80;
                                    n6 = new n(n11, n9, n10);
                                    n7 = -2;
                                    block12: while (true) {
                                        int n42 = n7;
                                        int n43 = 2;
                                        block13: while (n42 <= n43) {
                                            n8 = -2;
                                            if (!bl2) break block57;
                                            for (int i5 = v2051237; i5 <= 2; ++i5) {
                                                block85: {
                                                    int n44;
                                                    int n45;
                                                    block84: {
                                                        n42 = Math.abs(n7);
                                                        n43 = 2;
                                                        if (!bl2) continue block13;
                                                        if (!bl2) break block84;
                                                        if (n42 != n43) break block85;
                                                        n45 = Math.abs(i5);
                                                        n44 = 2;
                                                    }
                                                    if (n45 == n44) continue;
                                                }
                                                this.c(z2, n6.a(n7, 0, i5));
                                                if (bl2) continue;
                                            }
                                            ++n7;
                                            if (bl2) continue block12;
                                        }
                                        break;
                                    }
                                    n6 = n6.a();
                                    n8 = n7 = -1;
                                }
                                while (n7 <= 1) {
                                    block59: {
                                        n5 = -1;
                                        if (!bl2) break block58;
                                        for (int i6 = v2051254; i6 <= 1; ++i6) {
                                            this.c(z2, n6.a(n7, 0, i6));
                                            if (bl2) {
                                                if (bl2) continue;
                                            }
                                            break block59;
                                        }
                                        ++n7;
                                    }
                                    if (bl2) continue;
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

    public i(boolean bl2) {
        super(bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

