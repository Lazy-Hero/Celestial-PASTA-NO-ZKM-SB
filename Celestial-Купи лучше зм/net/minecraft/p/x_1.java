/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class x
extends a {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block8: {
            Iterator<o> iterator = n.a(n2.a(-1, -2, -1), n2.a(1, 2, 1)).iterator();
            boolean bl2 = a.d();
            while (iterator.hasNext()) {
                block11: {
                    o o2;
                    block18: {
                        int n4;
                        block16: {
                            int n5;
                            block17: {
                                int n6;
                                block14: {
                                    void var7_7;
                                    block15: {
                                        block12: {
                                            block13: {
                                                block9: {
                                                    int n7;
                                                    block10: {
                                                        boolean bl3;
                                                        o2 = iterator.next();
                                                        n3 = o2.e();
                                                        if (bl2) break block8;
                                                        if (!bl2) {
                                                            bl3 = n3 == n2.e();
                                                        }
                                                        var7_7 = bl3;
                                                        int n8 = o2.b();
                                                        if (!bl2) {
                                                            n8 = n8 == n2.b() ? 1 : 0;
                                                        }
                                                        n7 = n8;
                                                        int n9 = o2.a();
                                                        if (!bl2) {
                                                            n9 = n9 == n2.a() ? 1 : 0;
                                                        }
                                                        n6 = n9;
                                                        int n10 = Math.abs(o2.b() - n2.b());
                                                        if (!bl2) {
                                                            n10 = n10 == 2 ? 1 : 0;
                                                        }
                                                        n5 = n10;
                                                        n4 = var7_7;
                                                        if (bl2) break block9;
                                                        if (n4 == false) break block10;
                                                        n4 = n7;
                                                        if (bl2) break block9;
                                                        if (n4 == 0) break block10;
                                                        n4 = n6;
                                                        if (bl2) break block9;
                                                        if (n4 == 0) break block10;
                                                        this.a(z2, new n(o2), g.m.d());
                                                        if (!bl2) break block11;
                                                    }
                                                    n4 = n7;
                                                }
                                                if (bl2) break block12;
                                                if (n4 == 0) break block13;
                                                this.a(z2, o2, g.bf.d());
                                                if (!bl2) break block11;
                                            }
                                            n4 = n5;
                                        }
                                        if (bl2) break block14;
                                        if (n4 == 0) break block15;
                                        n4 = var7_7;
                                        if (bl2) break block14;
                                        if (n4 == 0) break block15;
                                        n4 = n6;
                                        if (bl2) break block14;
                                        if (n4 == 0) break block15;
                                        this.a(z2, o2, g.g.d());
                                        if (!bl2) break block11;
                                    }
                                    n4 = var7_7;
                                }
                                if (bl2) break block16;
                                if (n4 != 0) break block17;
                                n4 = n6;
                                if (bl2) break block16;
                                if (n4 == 0) break block18;
                            }
                            n4 = n5;
                        }
                        if (n4 != 0) break block18;
                        this.a(z2, o2, g.g.d());
                        if (!bl2) break block11;
                    }
                    this.a(z2, o2, g.bf.d());
                }
                if (!bl2) continue;
            }
            n3 = 1;
        }
        return n3 != 0;
    }
}

