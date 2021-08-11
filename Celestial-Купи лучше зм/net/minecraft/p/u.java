/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
package net.minecraft.p;

import com.google.common.base.Predicates;
import java.util.Random;
import net.minecraft.W.b6;
import net.minecraft.W.cZ;
import net.minecraft.W.cl;
import net.minecraft.W.cu;
import net.minecraft.W.dm;
import net.minecraft.W.dq;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.au.e;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class u
extends a {
    private final /* synthetic */ i a;
    private final /* synthetic */ i e;
    private static final /* synthetic */ e f;
    private final /* synthetic */ i d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public u() {
        this.d = g.bO.d().a(cl.C, cZ.SAND).a(cu.B, dm.BOTTOM);
        this.a = g.bC.d();
        this.e = g.cL.d();
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block36: {
            int n3;
            boolean bl3;
            block35: {
                int n4;
                int n5;
                block34: {
                    int n6;
                    block33: {
                        block31: {
                            int n7;
                            int n8;
                            int n9;
                            int n10;
                            block30: {
                                int n11;
                                block29: {
                                    bl3 = net.minecraft.p.a.c();
                                    while (z2.a(n2)) {
                                        n11 = n2.b();
                                        if (bl3 && bl3) {
                                            if (n11 <= 2) break;
                                            n2 = n2.k();
                                            if (bl3) continue;
                                        }
                                        break block29;
                                    }
                                    n11 = f.a(z2.d(n2)) ? 1 : 0;
                                }
                                if (bl3) {
                                    if (n11 == 0) {
                                        return false;
                                    }
                                    n11 = -2;
                                }
                                n10 = n11;
                                block1: while (true) {
                                    int n12 = n10;
                                    block2: while (n12 <= 2) {
                                        n9 = -2;
                                        if (!bl3) break block30;
                                        for (n8 = v2076926; n8 <= 2; ++n8) {
                                            boolean bl4;
                                            n12 = z2.a(n2.a(n10, -1, n8)) ? 1 : 0;
                                            if (!bl3) continue block2;
                                            if (bl3) {
                                                if (n12 == 0) continue;
                                                bl4 = z2.a(n2.a(n10, -2, n8));
                                            }
                                            if (bl3) {
                                                if (!bl4) continue;
                                                bl4 = false;
                                            }
                                            return bl4;
                                        }
                                        ++n10;
                                        if (bl3) continue block1;
                                    }
                                    break;
                                }
                                n9 = -1;
                            }
                            n10 = n9;
                            block4: while (true) {
                                int n13 = n10;
                                block5: while (n13 <= 0) {
                                    n7 = -2;
                                    if (!bl3) break block31;
                                    n8 = n7;
                                    while (n8 <= 2) {
                                        block32: {
                                            n13 = -2;
                                            if (!bl3) continue block5;
                                            for (int i2 = v2076927; i2 <= 2; ++i2) {
                                                z2.a(n2.a(n8, n10, i2), this.a, 2);
                                                if (bl3) {
                                                    if (bl3) continue;
                                                }
                                                break block32;
                                            }
                                            ++n8;
                                        }
                                        if (bl3) continue;
                                    }
                                    ++n10;
                                    if (bl3) continue block4;
                                }
                                break;
                            }
                            n7 = z2.a(n2, this.e, 2) ? 1 : 0;
                        }
                        for (aA aA2 : av.HORIZONTAL) {
                            n6 = z2.a(n2.a(aA2), this.e, 2) ? 1 : 0;
                            if (bl3) {
                                if (bl3) continue;
                            }
                            break block33;
                        }
                        n6 = -2;
                    }
                    n3 = n6;
                    block9: while (true) {
                        int n14 = n3;
                        int n15 = 2;
                        block10: while (n14 <= n15) {
                            n5 = -2;
                            if (!bl3) break block34;
                            for (int i3 = v2077045; i3 <= 2; ++i3) {
                                int n16 = n3;
                                if (!bl3) continue;
                                n15 = -2;
                                if (!bl3) continue block10;
                                if (n16 != n15) {
                                    n16 = n3;
                                    if (!bl3) continue;
                                    if (n16 != 2) {
                                        n16 = i3;
                                        if (!bl3) continue;
                                        if (n16 != -2) {
                                            n16 = i3;
                                            if (!bl3 || n16 != 2) continue;
                                        }
                                    }
                                }
                                n16 = z2.a(n2.a(n3, 1, i3), this.a, 2) ? 1 : 0;
                                if (bl3) continue;
                            }
                            ++n3;
                            if (bl3) continue block9;
                        }
                        break;
                    }
                    z2.a(n2.a(2, 1, 0), this.d, 2);
                    z2.a(n2.a(-2, 1, 0), this.d, 2);
                    z2.a(n2.a(0, 1, 2), this.d, 2);
                    z2.a(n2.a(0, 1, -2), this.d, 2);
                    n5 = -1;
                }
                n3 = n5;
                block12: while (true) {
                    int n17 = n3;
                    block13: while (n17 <= 1) {
                        n4 = -1;
                        if (!bl3) break block35;
                        for (int i4 = v2077080; i4 <= 1; ++i4) {
                            int n18;
                            n17 = n3;
                            if (!bl3) continue block13;
                            if (!bl3) continue;
                            if (n17 == 0) {
                                n18 = i4;
                                if (!bl3) continue;
                                if (n18 == 0) {
                                    z2.a(n2.a(n3, 4, i4), this.a, 2);
                                    if (bl3) continue;
                                }
                            }
                            n18 = z2.a(n2.a(n3, 4, i4), this.d, 2) ? 1 : 0;
                            if (bl3) continue;
                        }
                        ++n3;
                        if (bl3) continue block12;
                    }
                    break;
                }
                n4 = n3 = 1;
            }
            while (n3 <= 3) {
                z2.a(n2.a(-1, n3, -1), this.a, 2);
                z2.a(n2.a(-1, n3, 1), this.a, 2);
                z2.a(n2.a(1, n3, -1), this.a, 2);
                bl2 = z2.a(n2.a(1, n3, 1), this.a, 2);
                if (bl3) {
                    ++n3;
                    if (bl3) continue;
                }
                break block36;
            }
            bl2 = true;
        }
        return bl2;
    }

    static {
        f = net.minecraft.au.e.a(g.aO).a(b6.A, Predicates.equalTo((Object)dq.SAND));
    }
}

