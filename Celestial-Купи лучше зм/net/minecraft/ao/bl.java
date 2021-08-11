/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.ag;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.ae;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.u.g;

public class bl
extends ac {
    private /* synthetic */ boolean e;

    @Override
    public void a(z z2, Random random, b b10) {
        super.a(z2, random, b10);
        int n2 = this.b.e;
        int n3 = b10.c;
        String[] arrstring = u.b();
        block0: while (true) {
            int n4 = n3;
            block1: while (n4 <= b10.a) {
                int n5 = b10.f;
                block2: while (true) {
                    int n6 = n5;
                    block3: while (n6 <= b10.d) {
                        block18: {
                            int n7;
                            block22: {
                                int n8;
                                block17: {
                                    int n9;
                                    n n10;
                                    block19: {
                                        n10 = new n(n3, n2, n5);
                                        if (arrstring == null) continue block2;
                                        n4 = z2.a(n10) ? 1 : 0;
                                        if (arrstring == null) continue block1;
                                        if (n4 != 0) break block18;
                                        n9 = this.b.a(n10);
                                        if (arrstring == null) break block19;
                                        if (n9 == 0) break block18;
                                        n9 = 0;
                                    }
                                    int n11 = n9;
                                    for (Object object : this.c) {
                                        block21: {
                                            block20: {
                                                n8 = ((u)object).e.a(n10);
                                                if (arrstring == null) break block17;
                                                if (arrstring == null) break block20;
                                                if (n8 == 0) break block21;
                                                int n12 = n11 = 1;
                                            }
                                            if (arrstring != null) break;
                                        }
                                        if (arrstring != null) continue;
                                    }
                                    n8 = n11;
                                }
                                if (arrstring == null) break block22;
                                if (n8 == 0) break block18;
                                n8 = n7 = n2 - 1;
                            }
                            while (n7 > 1) {
                                Object object;
                                object = new n(n3, n7, n5);
                                n6 = z2.a((n)object) ? 1 : 0;
                                if (arrstring == null) continue block3;
                                if (arrstring != null) {
                                    boolean bl2;
                                    if (n6 == 0) {
                                        bl2 = z2.d((n)object).o().b();
                                        if (arrstring != null) {
                                            if (!bl2 && arrstring != null) break;
                                        }
                                    } else {
                                        bl2 = z2.a((n)object, g.cW.d(), 2);
                                    }
                                }
                                --n7;
                                if (arrstring != null) continue;
                            }
                        }
                        ++n5;
                        if (arrstring != null) continue block2;
                    }
                    break;
                }
                ++n3;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    public bl(z z2, net.minecraft.aA.u u2, Random random, int n2, int n3) {
        super(n2, n3);
        this.a(z2, u2, random, n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public bl() {
    }

    private void a(z z2, net.minecraft.aA.u u2, Random random, int n2, int n3) {
        block14: {
            int n4;
            ae ae2;
            block13: {
                String[] arrstring;
                block12: {
                    int n5;
                    int n6;
                    l l2;
                    block9: {
                        ae ae3;
                        ae ae4;
                        block10: {
                            block11: {
                                block7: {
                                    block8: {
                                        ae2 = ae.values()[random.nextInt(ae.values().length)];
                                        l2 = new l();
                                        String[] arrstring2 = u.b();
                                        u2.a(n2, n3, l2);
                                        arrstring = arrstring2;
                                        n6 = 5;
                                        n5 = 5;
                                        ae4 = ae2;
                                        ae3 = ae.CLOCKWISE_90;
                                        if (arrstring == null) break block7;
                                        if (ae4 != ae3) break block8;
                                        n6 = -5;
                                        if (arrstring != null) break block9;
                                    }
                                    ae4 = ae2;
                                    ae3 = ae.CLOCKWISE_180;
                                }
                                if (arrstring == null) break block10;
                                if (ae4 != ae3) break block11;
                                n6 = -5;
                                n5 = -5;
                                if (arrstring != null) break block9;
                            }
                            ae4 = ae2;
                            ae3 = ae.COUNTERCLOCKWISE_90;
                        }
                        if (ae4 == ae3) {
                            n5 = -5;
                        }
                    }
                    int n7 = l2.a(7, 7);
                    int n8 = l2.a(7, 7 + n5);
                    int n9 = l2.a(7 + n6, 7);
                    int n10 = l2.a(7 + n6, 7 + n5);
                    n4 = Math.min(Math.min(n7, n8), Math.min(n9, n10));
                    if (arrstring == null) break block12;
                    if (n4 >= 60) break block13;
                    this.e = false;
                }
                if (arrstring != null) break block14;
            }
            n n11 = new n(n2 * 16 + 8, n4 + 1, n3 * 16 + 8);
            LinkedList linkedList = Lists.newLinkedList();
            ag.a(z2.v().d(), n11, ae2, linkedList, random);
            this.c.addAll(linkedList);
            this.c();
            this.e = true;
        }
    }

    @Override
    public boolean a() {
        return this.e;
    }
}

