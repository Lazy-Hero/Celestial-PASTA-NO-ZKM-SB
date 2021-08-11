/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class J
extends a {
    private final /* synthetic */ K a;

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block32: {
            block33: {
                boolean bl2;
                block31: {
                    i i2;
                    block30: {
                        i i3;
                        i i4;
                        block29: {
                            K k2;
                            K k3;
                            block28: {
                                bl2 = net.minecraft.p.a.c();
                                K k2 = z2.d(n2.a()).b();
                                k2 = g.bx;
                                if (!bl2) break block28;
                                if (k3 != k2) {
                                    return false;
                                }
                                i4 = z2.d(n2.k());
                                if (!bl2) break block29;
                                K k2 = i4.b();
                                k2 = g.bx;
                            }
                            if (k3 != k2) {
                                return false;
                            }
                            i4 = z2.d(n2);
                        }
                        i2 = i3 = i4;
                        if (!bl2) break block30;
                        if (i2.o() == c.A) break block31;
                        i2 = i3;
                    }
                    if (i2.b() != g.bx) {
                        return false;
                    }
                }
                int n4 = 0;
                K k5 = z2.d(n2.b()).b();
                k5 = g.bx;
                if (bl2) {
                    if (k4 == k5) {
                        ++n4;
                    }
                    K k5 = z2.d(n2.m()).b();
                    k5 = g.bx;
                }
                if (bl2) {
                    if (k4 == k5) {
                        ++n4;
                    }
                    K k5 = z2.d(n2.i()).b();
                    k5 = g.bx;
                }
                if (bl2) {
                    if (k4 == k5) {
                        ++n4;
                    }
                    K k5 = z2.d(n2.j()).b();
                    k5 = g.bx;
                }
                if (k4 == k5) {
                    ++n4;
                }
                int n5 = 0;
                n3 = z2.a(n2.b());
                if (bl2) {
                    if (n3 != 0) {
                        ++n5;
                    }
                    n3 = z2.a(n2.m());
                }
                if (bl2) {
                    if (n3 != 0) {
                        ++n5;
                    }
                    n3 = z2.a(n2.i());
                }
                if (bl2) {
                    if (n3 != 0) {
                        ++n5;
                    }
                    n3 = z2.a(n2.j()) ? 1 : 0;
                }
                if (bl2) {
                    if (n3 != 0) {
                        ++n5;
                    }
                    n3 = n4;
                }
                if (!bl2) break block32;
                if (n3 != 3) break block33;
                n3 = n5;
                if (!bl2) break block32;
                if (n3 == 1) {
                    i i5 = this.a.d();
                    z2.a(n2, i5, 2);
                    z2.a(n2, i5, random);
                }
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public J(K k2) {
        this.a = k2;
    }
}

