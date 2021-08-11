/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.p.a;
import net.minecraft.p.m;
import net.minecraft.u.g;

public class n
extends m {
    private final /* synthetic */ i j;
    private final /* synthetic */ i i;

    public n(i i2, i i3) {
        super(false);
        this.i = i2;
        this.j = i3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, net.minecraft.k.n n2) {
        int n3;
        block20: {
            block22: {
                boolean bl2;
                block21: {
                    i i2;
                    Object object;
                    block19: {
                        object = z2.d(n2);
                        bl2 = a.c();
                        do {
                            if (object.o() != c.A) {
                                i2 = object;
                                if (bl2 && bl2) {
                                    if (i2.o() != c.J) break;
                                }
                                break block19;
                            }
                            net.minecraft.k.n n4 = n2;
                            if (bl2) {
                                if (n4.b() <= 0) break;
                                n4 = n2.k();
                            }
                            n2 = n4;
                            object = z2.d(n2);
                        } while (bl2);
                        i2 = z2.d(n2);
                    }
                    object = i2.b();
                    if (!bl2) break block21;
                    if (object != g.bv && object != g.aU) break block22;
                    n2 = n2.a();
                    this.a(z2, n2, this.i);
                }
                int n5 = n2.b();
                block1: while (true) {
                    int n6 = n5;
                    block2: while (n6 <= n2.b() + 2) {
                        int n7 = n5 - n2.b();
                        int n8 = 2 - n7;
                        n3 = n2.e() - n8;
                        if (!bl2) break block20;
                        int n9 = n3;
                        block3: while (true) {
                            int n10 = n9;
                            int n11 = n2.e() + n8;
                            block4: while (n10 <= n11) {
                                int n12 = n9 - n2.e();
                                n6 = n2.a() - n8;
                                if (!bl2) continue block2;
                                for (int i3 = v2068843; i3 <= n2.a() + n8; ++i3) {
                                    net.minecraft.k.n n13;
                                    block27: {
                                        c c10;
                                        c c11;
                                        block26: {
                                            c c12;
                                            block24: {
                                                int n14;
                                                block25: {
                                                    int n15;
                                                    block23: {
                                                        int n16 = i3 - n2.a();
                                                        n10 = Math.abs(n12);
                                                        n11 = n8;
                                                        if (!bl2) continue block4;
                                                        if (!bl2) break block23;
                                                        if (n10 != n11) break block24;
                                                        n14 = Math.abs(n16);
                                                        if (!bl2) break block25;
                                                        n15 = n8;
                                                    }
                                                    if (n14 != n15) break block24;
                                                    n14 = random.nextInt(2);
                                                }
                                                if (n14 == 0) continue;
                                            }
                                            n13 = new net.minecraft.k.n(n9, n5, i3);
                                            c11 = c12 = z2.d(n13).o();
                                            c10 = c.A;
                                            if (!bl2) break block26;
                                            if (c11 == c10) break block27;
                                            c11 = c12;
                                            c10 = c.J;
                                        }
                                        if (c11 != c10) continue;
                                    }
                                    this.a(z2, n13, this.j);
                                    if (bl2) continue;
                                }
                                ++n9;
                                if (bl2) continue block3;
                            }
                            break;
                        }
                        ++n5;
                        if (bl2) continue block1;
                    }
                    break;
                }
            }
            n3 = 1;
        }
        return n3 != 0;
    }
}

