/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ao.a7;
import net.minecraft.ao.aD;
import net.minecraft.ao.aF;
import net.minecraft.ao.aG;
import net.minecraft.ao.aH;
import net.minecraft.ao.aT;
import net.minecraft.ao.aV;
import net.minecraft.ao.aX;
import net.minecraft.ao.ae;
import net.minecraft.ao.ak;
import net.minecraft.ao.an;
import net.minecraft.ao.ao;
import net.minecraft.ao.at;
import net.minecraft.ao.ay;
import net.minecraft.ao.b;
import net.minecraft.ao.bA;
import net.minecraft.ao.bC;
import net.minecraft.ao.bH;
import net.minecraft.ao.ba;
import net.minecraft.ao.by;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class b7 {
    private static /* synthetic */ Class<? extends aH> c;
    private static /* synthetic */ List<bC> e;
    private static final /* synthetic */ bC[] d;
    static /* synthetic */ int a;
    private static final /* synthetic */ bA b;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static aH a(Class<? extends aH> class_, List<u> list, Random random, int n2, int n3, int n4, @Nullable aA aA2, int n5) {
        void var9_20;
        Object var9_8 = null;
        String[] arrstring = u.b();
        Class<? extends aH> class_2 = class_;
        Class class_3 = ak.class;
        if (arrstring != null) {
            if (class_2 == class_3) {
                ak ak2 = ak.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = ao.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                ao ao2 = ao.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = an.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                an an2 = an.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = ae.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                an an3 = ae.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = aD.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aD aD2 = aD.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = ay.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                ay ay2 = ay.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = aT.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aT aT2 = aT.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = aF.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aF aF2 = aF.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = a7.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                a7 a72 = a7.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = aG.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                aG aG2 = aG.a(list, random, n2, n3, n4, aA2, n5);
                return var9_20;
            }
            class_2 = class_;
            class_3 = at.class;
        }
        if (class_2 != class_3) return var9_20;
        at at2 = at.a(list, random, n2, n3, n4, aA2, n5);
        return var9_20;
    }

    static Class a(Class class_) {
        c = class_;
        return c;
    }

    static {
        d = new bC[]{new bC(ak.class, 40, 0), new bC(ao.class, 5, 5), new bC(an.class, 20, 0), new bC(ae.class, 20, 0), new bC(aD.class, 10, 6), new bC(ay.class, 5, 5), new bC(aT.class, 5, 5), new bC(aF.class, 5, 4), new bC(a7.class, 5, 4), new ba(aG.class, 10, 2), new bH(at.class, 20, 1)};
        b = new bA(null);
    }

    public static void d() {
        block2: {
            e = Lists.newArrayList();
            bC[] arrbC = d;
            String[] arrstring = u.b();
            for (bC bC2 : arrbC) {
                bC2.b = 0;
                e.add(bC2);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            c = null;
        }
    }

    static u b(aV aV2, List list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        return b7.c(aV2, list, random, n2, n3, n4, aA2, n5);
    }

    private static boolean a() {
        int n2;
        block5: {
            int n3 = 0;
            a = 0;
            String[] arrstring = u.b();
            for (bC bC2 : e) {
                block6: {
                    int n4;
                    int n5;
                    block8: {
                        block7: {
                            n2 = bC2.d;
                            if (arrstring == null) break block5;
                            if (arrstring == null) break block6;
                            if (n2 <= 0) break block7;
                            n5 = bC2.b;
                            n4 = bC2.d;
                            if (arrstring == null) break block8;
                            if (n5 < n4) {
                                n3 = 1;
                            }
                        }
                        n5 = a;
                        n4 = bC2.c;
                    }
                    int n6 = a = n5 + n4;
                }
                if (arrstring != null) continue;
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    private static u c(aV aV2, List<u> list, Random random, int n2, int n3, int n4, @Nullable aA aA2, int n5) {
        block9: {
            int n6;
            int n7;
            String[] arrstring;
            block8: {
                arrstring = u.b();
                n7 = n5;
                n6 = 50;
                if (arrstring != null) {
                    if (n7 > n6) {
                        return null;
                    }
                    n7 = Math.abs(n2 - aV2.a().c);
                    n6 = 112;
                }
                if (arrstring == null) break block8;
                if (n7 > n6) break block9;
                n7 = Math.abs(n4 - aV2.a().f);
                n6 = 112;
            }
            if (n7 <= n6) {
                aH aH2;
                aH aH3 = aH2 = b7.a(aV2, list, random, n2, n3, n4, aA2, n5 + 1);
                if (arrstring != null) {
                    if (aH3 != null) {
                        list.add(aH2);
                        aV2.i.add(aH2);
                    }
                    aH3 = aH2;
                }
                return aH3;
            }
        }
        return null;
    }

    static bA b() {
        return b;
    }

    private static aH a(aV aV2, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        block29: {
            b b10;
            b b11;
            block28: {
                List<Object> list2;
                String[] arrstring;
                block19: {
                    block21: {
                        aH aH2;
                        block22: {
                            Class<? extends aH> class_;
                            block20: {
                                arrstring = u.b();
                                if (!b7.a()) {
                                    return null;
                                }
                                class_ = c;
                                if (arrstring == null) break block20;
                                if (class_ == null) break block21;
                                class_ = c;
                            }
                            aH aH3 = b7.a(class_, list, random, n2, n3, n4, aA2, n5);
                            c = null;
                            aH2 = aH3;
                            if (arrstring == null) break block22;
                            if (aH2 == null) break block21;
                            aH2 = aH3;
                        }
                        return aH2;
                    }
                    int n6 = 0;
                    block0: while (true) {
                        int n7 = n6;
                        block1: while (n7 < 5) {
                            ++n6;
                            int n8 = random.nextInt(a);
                            list2 = e;
                            if (arrstring == null) break block19;
                            for (bC bC2 : list2) {
                                block24: {
                                    aH aH3;
                                    block27: {
                                        aH aH5;
                                        block26: {
                                            bC bC3;
                                            block25: {
                                                boolean bl2;
                                                block23: {
                                                    n7 = n8 -= bC2.c;
                                                    if (arrstring == null) continue block1;
                                                    if (arrstring == null) break block23;
                                                    if (n7 >= 0) break block24;
                                                    bC3 = bC2;
                                                    if (arrstring == null) break block25;
                                                    bl2 = bC3.a(n5);
                                                }
                                                if (!bl2) continue block0;
                                                bC3 = bC2;
                                            }
                                            if (arrstring != null) {
                                                if (bC3 == aV2.k && arrstring != null) continue block0;
                                                bC3 = bC2;
                                            }
                                            aH5 = b7.a(bC3.a, list, random, n2, n3, n4, aA2, n5);
                                            if (arrstring == null) break block26;
                                            if (aH5 == null) break block24;
                                            ++bC2.b;
                                            aH3 = aV2;
                                            if (arrstring == null) break block27;
                                            ((aV)aH3).k = bC2;
                                        }
                                        if (!bC2.a()) {
                                            e.remove(bC2);
                                        }
                                        aH3 = aH5;
                                    }
                                    return aH3;
                                }
                                if (arrstring != null) continue;
                            }
                            if (arrstring != null) continue block0;
                        }
                        break;
                    }
                    list2 = list;
                }
                b10 = b11 = aX.a(list2, random, n2, n3, n4, aA2);
                if (arrstring == null) break block28;
                if (b10 == null) break block29;
                b10 = b11;
            }
            if (b10.e > 1) {
                return new aX(n5, random, b11, aA2);
            }
        }
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void c() {
        by.b(a7.class, "SHCC");
        by.b(aX.class, "SHFC");
        by.b(aF.class, "SH5C");
        by.b(an.class, "SHLT");
        by.b(aG.class, "SHLi");
        by.b(at.class, "SHPR");
        by.b(ao.class, "SHPH");
        by.b(ae.class, "SHRT");
        by.b(aD.class, "SHRC");
        by.b(aT.class, "SHSD");
        by.b(aV.class, "SHStart");
        by.b(ak.class, "SHS");
        by.b(ay.class, "SHSSD");
    }
}

