/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.ao.a0;
import net.minecraft.ao.a2;
import net.minecraft.ao.a3;
import net.minecraft.ao.a4;
import net.minecraft.ao.a5;
import net.minecraft.ao.aO;
import net.minecraft.ao.aR;
import net.minecraft.ao.aS;
import net.minecraft.ao.aW;
import net.minecraft.ao.a_;
import net.minecraft.ao.ab;
import net.minecraft.ao.ad;
import net.minecraft.ao.ah;
import net.minecraft.ao.aq;
import net.minecraft.ao.az;
import net.minecraft.ao.b;
import net.minecraft.ao.by;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class h {
    private static a2 e(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10;
        a4 a43;
        block18: {
            int n6 = h.a(a42.n);
            String[] arrstring = u.b();
            int n7 = n6;
            if (arrstring != null) {
                if (n7 <= 0) {
                    return null;
                }
                n7 = 0;
            }
            int n8 = n7;
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 < 5) {
                    ++n8;
                    int n10 = random.nextInt(n6);
                    a43 = a42;
                    if (arrstring == null) break block18;
                    for (ad ad2 : a43.n) {
                        block20: {
                            a4 a44;
                            block23: {
                                a4 a45;
                                block22: {
                                    a2 a22;
                                    ad ad3;
                                    block21: {
                                        boolean bl2;
                                        block19: {
                                            n9 = n10 -= ad2.a;
                                            if (arrstring == null) continue block1;
                                            if (arrstring == null) break block19;
                                            if (n9 >= 0) break block20;
                                            ad3 = ad2;
                                            if (arrstring == null) break block21;
                                            bl2 = ad3.a(n5);
                                        }
                                        if (!bl2) continue block0;
                                        ad3 = ad2;
                                    }
                                    if (ad3 == a42.l) {
                                        a22 = a42;
                                        if (arrstring != null) {
                                            if (a22.n.size() > 1 && arrstring != null) continue block0;
                                        }
                                    } else {
                                        a22 = a45 = h.a(a42, ad2, list, random, n2, n3, n4, aA2, n5);
                                    }
                                    if (arrstring == null) break block22;
                                    if (a45 == null) break block20;
                                    ++ad2.d;
                                    a44 = a42;
                                    if (arrstring == null) break block23;
                                    a44.l = ad2;
                                }
                                if (!ad2.a()) {
                                    a42.n.remove(ad2);
                                }
                                a44 = a45;
                            }
                            return a44;
                        }
                        if (arrstring != null) continue;
                    }
                    if (arrstring != null) continue block0;
                }
                break;
            }
            a43 = a42;
        }
        if ((b10 = aS.a(a43, list, random, n2, n3, n4, aA2)) != null) {
            return new aS(a42, n5, random, b10, aA2);
        }
        return null;
    }

    public static void a() {
        by.b(az.class, "ViBH");
        by.b(aR.class, "ViDF");
        by.b(ah.class, "ViF");
        by.b(aS.class, "ViL");
        by.b(aq.class, "ViPH");
        by.b(a3.class, "ViSH");
        by.b(aO.class, "ViSmH");
        by.b(aW.class, "ViST");
        by.b(a0.class, "ViS");
        by.b(a4.class, "ViStart");
        by.b(ab.class, "ViSR");
        by.b(a_.class, "ViTRH");
        by.b(a5.class, "ViW");
    }

    public static List<ad> a(Random random, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new ad(a3.class, 4, net.minecraft.k.h.a(random, 2 + n2, 4 + n2 * 2)));
        String[] arrstring = u.b();
        arrayList.add(new ad(aW.class, 20, net.minecraft.k.h.a(random, 0 + n2, 1 + n2)));
        String[] arrstring2 = arrstring;
        arrayList.add(new ad(az.class, 20, net.minecraft.k.h.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new ad(aO.class, 3, net.minecraft.k.h.a(random, 2 + n2, 5 + n2 * 3)));
        arrayList.add(new ad(aq.class, 15, net.minecraft.k.h.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new ad(aR.class, 3, net.minecraft.k.h.a(random, 1 + n2, 4 + n2)));
        arrayList.add(new ad(ah.class, 3, net.minecraft.k.h.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new ad(a0.class, 15, net.minecraft.k.h.a(random, 0, 1 + n2)));
        arrayList.add(new ad(a_.class, 8, net.minecraft.k.h.a(random, 0 + n2, 3 + n2 * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = iterator;
            if (arrstring2 != null) {
                if (((ad)iterator2.next()).b != 0) continue;
                iterator2 = iterator;
            }
            iterator2.remove();
            if (arrstring2 != null) continue;
        }
        return arrayList;
    }

    private static int a(List<ad> list) {
        int n2;
        String[] arrstring;
        int n3;
        block6: {
            int n4 = 0;
            n3 = 0;
            arrstring = u.b();
            for (ad ad2 : list) {
                block7: {
                    int n5;
                    int n6;
                    block9: {
                        block8: {
                            n2 = ad2.b;
                            if (arrstring == null) break block6;
                            if (arrstring == null) break block7;
                            if (n2 <= 0) break block8;
                            n6 = ad2.d;
                            n5 = ad2.b;
                            if (arrstring == null) break block9;
                            if (n6 < n5) {
                                n4 = 1;
                            }
                        }
                        n6 = n3;
                        n5 = ad2.a;
                    }
                    int n7 = n3 = n6 + n5;
                }
                if (arrstring != null) continue;
            }
            n2 = n4;
        }
        if (arrstring != null) {
            n2 = n2 != 0 ? n3 : -1;
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static u a(a4 a42, List list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        return h.d(a42, list, random, n2, n3, n4, aA2, n5);
    }

    static u b(a4 a42, List list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        return h.c(a42, list, random, n2, n3, n4, aA2, n5);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static a2 a(a4 a42, ad ad2, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        void var11_21;
        Class<? extends a2> class_ = ad2.c;
        String[] arrstring = u.b();
        Object var11_11 = null;
        Class<? extends a2> class_2 = class_;
        Class class_3 = a3.class;
        if (arrstring != null) {
            if (class_2 == class_3) {
                a3 a32 = a3.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = aW.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aW aW2 = aW.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = az.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                az az2 = az.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = aO.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aO aO2 = aO.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = aq.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aq aq2 = aq.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = aR.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aR aR2 = aR.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = ah.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                ah ah2 = ah.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = a0.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                a0 a02 = a0.a(a42, list, random, n2, n3, n4, aA2, n5);
                return var11_21;
            }
            class_2 = class_;
            class_3 = a_.class;
        }
        if (class_2 != class_3) return var11_21;
        a_ a_2 = a_.a(a42, list, random, n2, n3, n4, aA2, n5);
        return var11_21;
    }

    private static u d(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        block7: {
            block9: {
                b b10;
                b b11;
                block8: {
                    int n6;
                    int n7;
                    String[] arrstring;
                    block6: {
                        arrstring = u.b();
                        n7 = n5;
                        n6 = 3 + a42.p;
                        if (arrstring != null) {
                            if (n7 > n6) {
                                return null;
                            }
                            n7 = Math.abs(n2 - a42.a().c);
                            n6 = 112;
                        }
                        if (arrstring == null) break block6;
                        if (n7 > n6) break block7;
                        n7 = Math.abs(n4 - a42.a().f);
                        n6 = 112;
                    }
                    if (n7 > n6) break block7;
                    b10 = b11 = ab.a(a42, list, random, n2, n3, n4, aA2);
                    if (arrstring == null) break block8;
                    if (b10 == null) break block9;
                    b10 = b11;
                }
                if (b10.e > 10) {
                    ab ab2 = new ab(a42, n5, random, b11, aA2);
                    list.add(ab2);
                    a42.o.add(ab2);
                    return ab2;
                }
            }
            return null;
        }
        return null;
    }

    private static u c(a4 a42, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        block6: {
            block8: {
                a2 a22;
                block7: {
                    a2 a23;
                    int n6;
                    int n7;
                    String[] arrstring;
                    block5: {
                        arrstring = u.b();
                        n7 = n5;
                        n6 = 50;
                        if (arrstring != null) {
                            if (n7 > n6) {
                                return null;
                            }
                            n7 = Math.abs(n2 - a42.a().c);
                            n6 = 112;
                        }
                        if (arrstring == null) break block5;
                        if (n7 > n6) break block6;
                        n7 = Math.abs(n4 - a42.a().f);
                        n6 = 112;
                    }
                    if (n7 > n6) break block6;
                    a22 = a23 = h.e(a42, list, random, n2, n3, n4, aA2, n5 + 1);
                    if (arrstring == null) break block7;
                    if (a22 == null) break block8;
                    list.add(a23);
                    a42.k.add(a23);
                    a22 = a23;
                }
                return a22;
            }
            return null;
        }
        return null;
    }
}

