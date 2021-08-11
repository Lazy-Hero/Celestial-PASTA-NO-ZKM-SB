/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
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

public class d
extends b {
    private static final /* synthetic */ i e;
    private static final /* synthetic */ i d;
    private final /* synthetic */ boolean a;

    public d(boolean bl2, boolean bl3) {
        super(bl2);
        this.a = bl3;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block37: {
            block38: {
                int n4;
                block52: {
                    block51: {
                        int n5;
                        boolean bl2;
                        int n6;
                        block36: {
                            int n7;
                            int n8;
                            int n9;
                            block49: {
                                K k2;
                                K k3;
                                block50: {
                                    K k4;
                                    block48: {
                                        block47: {
                                            int n10;
                                            block46: {
                                                block35: {
                                                    n6 = random.nextInt(3) + 5;
                                                    bl2 = net.minecraft.p.a.c();
                                                    int n11 = this.a;
                                                    if (bl2) {
                                                        if (n11 != 0) {
                                                            n6 += random.nextInt(7);
                                                        }
                                                        n11 = 1;
                                                    }
                                                    int n12 = n11;
                                                    n3 = n2.b();
                                                    if (!bl2) break block37;
                                                    if (n3 < 1) break block38;
                                                    n3 = n2.b() + n6 + 1;
                                                    if (!bl2) break block37;
                                                    if (n3 > 256) break block38;
                                                    int n13 = n2.b();
                                                    block0: while (true) {
                                                        int n14 = n13;
                                                        block1: while (n14 <= n2.b() + 1 + n6) {
                                                            block41: {
                                                                int n15;
                                                                block40: {
                                                                    int n16;
                                                                    block39: {
                                                                        n5 = 1;
                                                                        n10 = n13;
                                                                        if (!bl2) break block35;
                                                                        n16 = n2.b();
                                                                        if (!bl2) break block39;
                                                                        if (n10 == n16) {
                                                                            n5 = 0;
                                                                        }
                                                                        n15 = n13;
                                                                        if (!bl2) break block40;
                                                                        n16 = n2.b() + 1 + n6 - 2;
                                                                    }
                                                                    if (n15 < n16) break block41;
                                                                    n15 = 2;
                                                                }
                                                                n5 = n15;
                                                            }
                                                            o o2 = new o();
                                                            n9 = n2.e() - n5;
                                                            block2: while (true) {
                                                                int n17 = n9;
                                                                block3: while (n17 <= n2.e() + n5) {
                                                                    n14 = n12;
                                                                    if (!bl2) continue block1;
                                                                    if (bl2) {
                                                                        if (n14 == 0) break block2;
                                                                        int n18 = n8 = n2.a() - n5;
                                                                    }
                                                                    while (n8 <= n2.a() + n5) {
                                                                        block45: {
                                                                            int n19;
                                                                            block42: {
                                                                                block43: {
                                                                                    boolean bl3;
                                                                                    block44: {
                                                                                        n17 = n12;
                                                                                        if (!bl2) continue block3;
                                                                                        if (bl2) {
                                                                                            if (n17 == 0) break;
                                                                                            n19 = n13;
                                                                                        }
                                                                                        if (!bl2) break block42;
                                                                                        if (n19 < 0) break block43;
                                                                                        n19 = n13;
                                                                                        if (!bl2) break block42;
                                                                                        if (n19 >= 256) break block43;
                                                                                        bl3 = this.a(z2.d(o2.a(n9, n13, n8)).b());
                                                                                        if (!bl2) break block44;
                                                                                        if (bl3) break block45;
                                                                                        bl3 = false;
                                                                                    }
                                                                                    n12 = bl3 ? 1 : 0;
                                                                                    if (bl2) break block45;
                                                                                }
                                                                                n19 = 0;
                                                                            }
                                                                            n12 = n19;
                                                                        }
                                                                        ++n8;
                                                                        if (bl2) continue;
                                                                    }
                                                                    ++n9;
                                                                    if (bl2) continue block2;
                                                                }
                                                                break;
                                                            }
                                                            ++n13;
                                                            if (bl2) continue block0;
                                                        }
                                                        break;
                                                    }
                                                    n10 = n12;
                                                }
                                                if (!bl2) break block46;
                                                if (n10 != 0) break block47;
                                                n10 = 0;
                                            }
                                            return n10 != 0;
                                        }
                                        k3 = k4 = z2.d(n2.k()).b();
                                        k2 = g.aU;
                                        if (!bl2) break block48;
                                        if (k3 == k2) break block49;
                                        k3 = k4;
                                        k2 = g.bv;
                                    }
                                    if (!bl2) break block50;
                                    if (k3 == k2) break block49;
                                    k3 = k4;
                                    k2 = g.cU;
                                }
                                if (k3 != k2) break block51;
                            }
                            n4 = n2.b();
                            if (!bl2) break block52;
                            if (n4 >= 256 - n6 - 1) break block51;
                            this.a(z2, n2.k());
                            n5 = n2.b() - 3 + n6;
                            block5: while (true) {
                                int n20 = n5;
                                block6: while (n20 <= n2.b() + n6) {
                                    int n21 = n5 - (n2.b() + n6);
                                    n9 = 1 - n21 / 2;
                                    n7 = n2.e() - n9;
                                    if (!bl2) break block36;
                                    n8 = n7;
                                    block7: while (true) {
                                        int n22 = n8;
                                        int n23 = n2.e() + n9;
                                        block8: while (n22 <= n23) {
                                            int n24 = n8 - n2.e();
                                            n20 = n2.a() - n9;
                                            if (!bl2) continue block6;
                                            for (int i2 = v2054544; i2 <= n2.a() + n9; ++i2) {
                                                n n25;
                                                block57: {
                                                    c c10;
                                                    c c11;
                                                    block56: {
                                                        c c12;
                                                        block54: {
                                                            int n26;
                                                            block55: {
                                                                int n27;
                                                                block53: {
                                                                    int n28 = i2 - n2.a();
                                                                    n22 = Math.abs(n24);
                                                                    n23 = n9;
                                                                    if (!bl2) continue block8;
                                                                    if (!bl2) break block53;
                                                                    if (n22 != n23) break block54;
                                                                    n26 = Math.abs(n28);
                                                                    if (!bl2) break block55;
                                                                    n27 = n9;
                                                                }
                                                                if (n26 != n27) break block54;
                                                                n26 = random.nextInt(2);
                                                            }
                                                            if (bl2) {
                                                                if (n26 == 0) continue;
                                                                n26 = n21;
                                                            }
                                                            if (n26 == 0) continue;
                                                        }
                                                        n25 = new n(n8, n5, i2);
                                                        c11 = c12 = z2.d(n25).o();
                                                        c10 = c.A;
                                                        if (!bl2) break block56;
                                                        if (c11 == c10) break block57;
                                                        c11 = c12;
                                                        c10 = c.J;
                                                    }
                                                    if (c11 != c10) continue;
                                                }
                                                this.a(z2, n25, d);
                                                if (bl2) continue;
                                            }
                                            ++n8;
                                            if (bl2) continue block7;
                                        }
                                        break;
                                    }
                                    ++n5;
                                    if (bl2) continue block5;
                                }
                                break;
                            }
                            n7 = n5 = 0;
                        }
                        while (n5 < n6) {
                            block60: {
                                block59: {
                                    c c13;
                                    c c14;
                                    block58: {
                                        c c15;
                                        c14 = c15 = z2.d(n2.c(n5)).o();
                                        c13 = c.A;
                                        if (!bl2) break block58;
                                        if (c14 == c13) break block59;
                                        c14 = c15;
                                        c13 = c.J;
                                    }
                                    if (c14 != c13) break block60;
                                }
                                this.a(z2, n2.c(n5), e);
                            }
                            ++n5;
                            if (bl2) continue;
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
        e = g.bu.d().a(bc.B, D.BIRCH);
        d = g.bU.d().a(bR.D, D.BIRCH).a(bR.A, false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

