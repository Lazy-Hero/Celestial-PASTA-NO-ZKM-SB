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

public class F
extends a {
    private final /* synthetic */ K a;
    private final /* synthetic */ boolean d;

    public F(K k2, boolean bl2) {
        this.a = k2;
        this.d = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block34: {
            block35: {
                block33: {
                    int n4;
                    block32: {
                        boolean bl2;
                        block30: {
                            int n5;
                            block31: {
                                block29: {
                                    i i2;
                                    block28: {
                                        bl2 = net.minecraft.p.a.d();
                                        i2 = z2.d(n2.a());
                                        if (!bl2) {
                                            if (i2.b() != g.j) {
                                                return false;
                                            }
                                            i2 = z2.d(n2);
                                        }
                                        if (bl2) break block28;
                                        if (i2.o() == c.A) break block29;
                                        i2 = z2.d(n2);
                                    }
                                    if (i2.b() != g.j) {
                                        return false;
                                    }
                                }
                                n5 = 0;
                                K k3 = z2.d(n2.b()).b();
                                k3 = g.j;
                                if (!bl2) {
                                    if (k2 == k3) {
                                        ++n5;
                                    }
                                    K k3 = z2.d(n2.m()).b();
                                    k3 = g.j;
                                }
                                if (!bl2) {
                                    if (k2 == k3) {
                                        ++n5;
                                    }
                                    K k3 = z2.d(n2.i()).b();
                                    k3 = g.j;
                                }
                                if (!bl2) {
                                    if (k2 == k3) {
                                        ++n5;
                                    }
                                    K k3 = z2.d(n2.j()).b();
                                    k3 = g.j;
                                }
                                if (!bl2) {
                                    if (k2 == k3) {
                                        ++n5;
                                    }
                                    K k3 = z2.d(n2.k()).b();
                                    k3 = g.j;
                                }
                                if (k2 == k3) {
                                    ++n5;
                                }
                                int n6 = 0;
                                n3 = z2.a(n2.b());
                                if (!bl2) {
                                    if (n3 != 0) {
                                        ++n6;
                                    }
                                    n3 = z2.a(n2.m());
                                }
                                if (!bl2) {
                                    if (n3 != 0) {
                                        ++n6;
                                    }
                                    n3 = z2.a(n2.i());
                                }
                                if (!bl2) {
                                    if (n3 != 0) {
                                        ++n6;
                                    }
                                    n3 = z2.a(n2.j());
                                }
                                if (!bl2) {
                                    if (n3 != 0) {
                                        ++n6;
                                    }
                                    n3 = z2.a(n2.k());
                                }
                                if (!bl2) {
                                    if (n3 != 0) {
                                        ++n6;
                                    }
                                    n3 = this.d;
                                }
                                if (bl2) break block30;
                                if (n3 != 0) break block31;
                                int n4 = n5;
                                n4 = 4;
                                if (bl2) break block32;
                                if (n3 != n4) break block31;
                                int n4 = n6;
                                n4 = 1;
                                if (bl2) break block32;
                                if (n3 == n4) break block33;
                            }
                            n3 = n5;
                        }
                        if (bl2) break block34;
                        n4 = 5;
                    }
                    if (n3 != n4) break block35;
                }
                i i3 = this.a.d();
                z2.a(n2, i3, 2);
                z2.a(n2, i3, random);
            }
            n3 = 1;
        }
        return n3 != 0;
    }
}

