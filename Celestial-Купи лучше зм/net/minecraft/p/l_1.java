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
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class l
extends b {
    private static final /* synthetic */ i a;
    private static final /* synthetic */ i d;

    public l(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block38: {
            block39: {
                int n4;
                block54: {
                    block53: {
                        int n5;
                        int n6;
                        boolean bl2;
                        int n7;
                        block36: {
                            int n8;
                            int n9;
                            int n10;
                            int n11;
                            int n12;
                            block51: {
                                K k2;
                                K k3;
                                block52: {
                                    K k4;
                                    block50: {
                                        block49: {
                                            int n13;
                                            block48: {
                                                block35: {
                                                    n7 = random.nextInt(4) + 6;
                                                    int n14 = 1 + random.nextInt(2);
                                                    bl2 = net.minecraft.p.a.d();
                                                    n12 = n7 - n14;
                                                    n11 = 2 + random.nextInt(2);
                                                    int n15 = 1;
                                                    n3 = n2.b();
                                                    if (bl2) break block38;
                                                    if (n3 < 1) break block39;
                                                    n3 = n2.b() + n7 + 1;
                                                    if (bl2) break block38;
                                                    if (n3 > 256) break block39;
                                                    int n16 = n2.b();
                                                    block0: while (true) {
                                                        int n17 = n16;
                                                        block1: while (n17 <= n2.b() + 1 + n7) {
                                                            block42: {
                                                                int n18;
                                                                block40: {
                                                                    block41: {
                                                                        n13 = n15;
                                                                        if (bl2 || bl2) break block35;
                                                                        if (n13 == 0) break block0;
                                                                        n18 = n16 - n2.b();
                                                                        if (bl2) break block40;
                                                                        if (n18 >= n14) break block41;
                                                                        n10 = 0;
                                                                        if (!bl2) break block42;
                                                                    }
                                                                    n18 = n11;
                                                                }
                                                                n10 = n18;
                                                            }
                                                            o o2 = new o();
                                                            n9 = n2.e() - n10;
                                                            block2: while (true) {
                                                                int n19 = n9;
                                                                block3: while (n19 <= n2.e() + n10) {
                                                                    n17 = n15;
                                                                    if (bl2) continue block1;
                                                                    if (!bl2) {
                                                                        if (n17 == 0) break block2;
                                                                        int n20 = n6 = n2.a() - n10;
                                                                    }
                                                                    while (n6 <= n2.a() + n10) {
                                                                        block47: {
                                                                            int n21;
                                                                            block43: {
                                                                                block44: {
                                                                                    block46: {
                                                                                        c c10;
                                                                                        c c11;
                                                                                        block45: {
                                                                                            c c12;
                                                                                            n19 = n15;
                                                                                            if (bl2) continue block3;
                                                                                            if (!bl2) {
                                                                                                if (n19 == 0) break;
                                                                                                n21 = n16;
                                                                                            }
                                                                                            if (bl2) break block43;
                                                                                            if (n21 < 0) break block44;
                                                                                            n21 = n16;
                                                                                            if (bl2) break block43;
                                                                                            if (n21 >= 256) break block44;
                                                                                            c11 = c12 = z2.d(o2.a(n9, n16, n6)).o();
                                                                                            c10 = c.A;
                                                                                            if (bl2) break block45;
                                                                                            if (c11 == c10) break block46;
                                                                                            c11 = c12;
                                                                                            c10 = c.J;
                                                                                        }
                                                                                        if (c11 != c10) {
                                                                                            n15 = 0;
                                                                                        }
                                                                                    }
                                                                                    if (!bl2) break block47;
                                                                                }
                                                                                n21 = 0;
                                                                            }
                                                                            n15 = n21;
                                                                        }
                                                                        ++n6;
                                                                        if (!bl2) continue;
                                                                    }
                                                                    ++n9;
                                                                    if (!bl2) continue block2;
                                                                }
                                                                break;
                                                            }
                                                            ++n16;
                                                            if (!bl2) continue block0;
                                                        }
                                                        break;
                                                    }
                                                    n13 = n15;
                                                }
                                                if (bl2) break block48;
                                                if (n13 != 0) break block49;
                                                n13 = 0;
                                            }
                                            return n13 != 0;
                                        }
                                        k3 = k4 = z2.d(n2.k()).b();
                                        k2 = g.aU;
                                        if (bl2) break block50;
                                        if (k3 == k2) break block51;
                                        k3 = k4;
                                        k2 = g.bv;
                                    }
                                    if (bl2) break block52;
                                    if (k3 == k2) break block51;
                                    k3 = k4;
                                    k2 = g.cU;
                                }
                                if (k3 != k2) break block53;
                            }
                            n4 = n2.b();
                            if (bl2) break block54;
                            if (n4 >= 256 - n7 - 1) break block53;
                            this.a(z2, n2.k());
                            n10 = random.nextInt(2);
                            int n22 = 1;
                            n9 = 0;
                            n6 = 0;
                            while (n6 <= n12) {
                                block62: {
                                    block63: {
                                        block61: {
                                            int n23;
                                            int n24;
                                            block60: {
                                                block37: {
                                                    n5 = n2.b() + n7 - n6;
                                                    n8 = n2.e() - n10;
                                                    if (bl2) break block36;
                                                    int n25 = n8;
                                                    block6: while (true) {
                                                        int n26 = n25;
                                                        int n27 = n2.e() + n10;
                                                        block7: while (n26 <= n27) {
                                                            int n28 = n25 - n2.e();
                                                            n24 = n2.a() - n10;
                                                            if (bl2) break block37;
                                                            int n29 = n24;
                                                            while (n29 <= n2.a() + n10) {
                                                                block59: {
                                                                    block58: {
                                                                        block56: {
                                                                            int n30;
                                                                            block57: {
                                                                                int n31;
                                                                                block55: {
                                                                                    int n32 = n29 - n2.a();
                                                                                    n26 = Math.abs(n28);
                                                                                    n27 = n10;
                                                                                    if (bl2) continue block7;
                                                                                    if (bl2) break block55;
                                                                                    if (n26 != n27) break block56;
                                                                                    n30 = Math.abs(n32);
                                                                                    if (bl2) break block57;
                                                                                    n31 = n10;
                                                                                }
                                                                                if (n30 != n31) break block56;
                                                                                n30 = n10;
                                                                            }
                                                                            if (n30 > 0) break block58;
                                                                        }
                                                                        n n33 = new n(n25, n5, n29);
                                                                        if (bl2) break block59;
                                                                        if (!z2.d(n33).m()) {
                                                                            this.a(z2, n33, d);
                                                                        }
                                                                    }
                                                                    ++n29;
                                                                }
                                                                if (!bl2) continue;
                                                            }
                                                            ++n25;
                                                            if (!bl2) continue block6;
                                                        }
                                                        break;
                                                    }
                                                    n24 = n10;
                                                }
                                                n23 = n22++;
                                                if (bl2) break block60;
                                                if (n24 < n23) break block61;
                                                n10 = n9;
                                                n9 = 1;
                                                if (bl2) break block62;
                                                n24 = n22;
                                                n23 = n11;
                                            }
                                            if (n24 <= n23) break block63;
                                            n22 = n11;
                                            if (!bl2) break block63;
                                        }
                                        ++n10;
                                    }
                                    ++n6;
                                }
                                if (!bl2) continue;
                            }
                            n6 = random.nextInt(3);
                            n8 = n5 = 0;
                        }
                        while (n5 < n7 - n6) {
                            block66: {
                                block65: {
                                    c c13;
                                    c c14;
                                    block64: {
                                        c c15;
                                        c14 = c15 = z2.d(n2.c(n5)).o();
                                        c13 = c.A;
                                        if (bl2) break block64;
                                        if (c14 == c13) break block65;
                                        c14 = c15;
                                        c13 = c.J;
                                    }
                                    if (c14 != c13) break block66;
                                }
                                this.a(z2, n2.c(n5), a);
                            }
                            ++n5;
                            if (!bl2) continue;
                        }
                        return true;
                    }
                    n4 = 0;
                }
                return n4 != 0;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    static {
        a = g.bu.d().a(bc.B, D.SPRUCE);
        d = g.bU.d().a(bR.D, D.SPRUCE).a(b2.A, false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

