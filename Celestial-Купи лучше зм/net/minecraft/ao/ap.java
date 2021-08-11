/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ao.a;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.ar.i;

class ap {
    private final /* synthetic */ a f;
    private final /* synthetic */ Random a;
    private final /* synthetic */ int e;
    private final /* synthetic */ a c;
    private final /* synthetic */ int d;
    private final /* synthetic */ a[] b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(a a10, int n2, int n3) {
        int n4 = a10.a(n2, n3);
        String[] arrstring = u.b();
        int n5 = n4;
        if (arrstring == null) return n5 != 0;
        if (n5 == 1) return 1 != 0;
        n5 = n4;
        if (arrstring == null) return n5 != 0;
        if (n5 == 2) return 1 != 0;
        n5 = n4;
        if (arrstring == null) return n5 != 0;
        if (n5 == 3) return 1 != 0;
        n5 = n4;
        if (arrstring == null) return n5 != 0;
        if (n5 != 4) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static a a(ap ap2) {
        return ap2.f;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(a a10) {
        int n2;
        block15: {
            int n3 = 0;
            int n4 = 0;
            String[] arrstring = u.b();
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 < net.minecraft.ao.a.a(a10)) {
                    n2 = 0;
                    if (arrstring == null) break block15;
                    int n6 = n2;
                    while (n6 < net.minecraft.ao.a.b(a10)) {
                        block21: {
                            block17: {
                                int n7;
                                block20: {
                                    int n8;
                                    block18: {
                                        void var6_6;
                                        block19: {
                                            boolean bl2;
                                            block16: {
                                                n5 = a10.a(n6, n4);
                                                if (arrstring == null) continue block1;
                                                if (arrstring == null) break block16;
                                                if (n5 != 0) break block17;
                                                bl2 = false;
                                            }
                                            var6_6 = bl2;
                                            boolean bl3 = ap.a(a10, n6 + 1, n4);
                                            if (arrstring != null) {
                                                bl3 = bl3;
                                            }
                                            var6_6 += bl3;
                                            boolean bl4 = ap.a(a10, n6 - 1, n4);
                                            if (arrstring != null) {
                                                bl4 = bl4;
                                            }
                                            var6_6 += bl4;
                                            boolean bl5 = ap.a(a10, n6, n4 + 1);
                                            if (arrstring != null) {
                                                bl5 = bl5;
                                            }
                                            var6_6 += bl5;
                                            boolean bl6 = ap.a(a10, n6, n4 - 1);
                                            if (arrstring != null) {
                                                bl6 = bl6;
                                            }
                                            int n8 = var6_6 += bl6;
                                            n8 = 3;
                                            if (arrstring == null) break block18;
                                            if (n7 < n8) break block19;
                                            a10.a(n6, n4, 2);
                                            n3 = 1;
                                            if (arrstring != null) break block17;
                                        }
                                        n7 = var6_6;
                                        if (arrstring == null) break block20;
                                        n8 = 2;
                                    }
                                    if (n7 != n8) break block17;
                                    n7 = 0;
                                }
                                int n9 = n7;
                                int n10 = ap.a(a10, n6 + 1, n4 + 1);
                                if (arrstring != null) {
                                    n10 = n10 != 0 ? 1 : 0;
                                }
                                n9 += n10;
                                int n11 = ap.a(a10, n6 - 1, n4 + 1);
                                if (arrstring != null) {
                                    n11 = n11 != 0 ? 1 : 0;
                                }
                                n9 += n11;
                                int n12 = ap.a(a10, n6 + 1, n4 - 1);
                                if (arrstring != null) {
                                    n12 = n12 != 0 ? 1 : 0;
                                }
                                n9 += n12;
                                int n13 = ap.a(a10, n6 - 1, n4 - 1);
                                if (arrstring != null) {
                                    n13 = n13 != 0 ? 1 : 0;
                                }
                                n9 += n13;
                                if (arrstring == null) break block21;
                                if (n9 <= 1) {
                                    a10.a(n6, n4, 2);
                                    n3 = 1;
                                }
                            }
                            ++n6;
                        }
                        if (arrstring != null) continue;
                    }
                    ++n4;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    static int e(ap ap2) {
        return ap2.e;
    }

    public ap(Random random) {
        this.a = random;
        int n2 = 11;
        this.e = 7;
        this.d = 4;
        this.f = new a(11, 11, 5);
        this.f.a(this.e, this.d, this.e + 1, this.d + 1, 3);
        this.f.a(this.e - 1, this.d, this.e - 1, this.d + 1, 2);
        this.f.a(this.e + 2, this.d - 2, this.e + 3, this.d + 3, 5);
        this.f.a(this.e + 1, this.d - 2, this.e + 1, this.d - 1, 1);
        this.f.a(this.e + 1, this.d + 2, this.e + 1, this.d + 3, 1);
        this.f.a(this.e - 1, this.d - 1, 1);
        this.f.a(this.e - 1, this.d + 2, 1);
        this.f.a(0, 0, 11, 1, 5);
        this.f.a(0, 9, 11, 11, 5);
        this.a(this.f, this.e, this.d - 2, aA.WEST, 6);
        this.a(this.f, this.e, this.d + 3, aA.WEST, 6);
        this.a(this.f, this.e - 2, this.d - 1, aA.WEST, 3);
        this.a(this.f, this.e - 2, this.d + 2, aA.WEST, 3);
        while (this.a(this.f)) {
        }
        this.b = new a[3];
        this.b[0] = new a(11, 11, 5);
        this.b[1] = new a(11, 11, 5);
        this.b[2] = new a(11, 11, 5);
        this.a(this.f, this.b[0]);
        this.a(this.f, this.b[1]);
        this.b[0].a(this.e + 1, this.d, this.e + 1, this.d + 1, 0x800000);
        this.b[1].a(this.e + 1, this.d, this.e + 1, this.d + 1, 0x800000);
        this.c = new a(net.minecraft.ao.a.b(this.f), net.minecraft.ao.a.a(this.f), 5);
        this.a();
        this.a(this.c, this.b[2]);
    }

    private void a(a a10, a a11) {
        int n2;
        String[] arrstring;
        int n3;
        ArrayList arrayList;
        block28: {
            arrayList = Lists.newArrayList();
            n3 = 0;
            arrstring = u.b();
            block0: while (true) {
                int n4 = n3;
                int n5 = net.minecraft.ao.a.a(a10);
                block1: while (n4 < n5) {
                    n2 = 0;
                    if (arrstring == null) break block28;
                    for (int i2 = v233205; i2 < net.minecraft.ao.a.b(a10); ++i2) {
                        int n6 = a10.a(i2, n3);
                        if (arrstring == null) continue;
                        n5 = 2;
                        if (arrstring == null) continue block1;
                        if (n6 != n5) continue;
                        n6 = arrayList.add(new i<Integer, Integer>(i2, n3)) ? 1 : 0;
                        if (arrstring != null) continue;
                    }
                    ++n3;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            Collections.shuffle(arrayList, this.a);
            n2 = 10;
        }
        n3 = n2;
        Iterator iterator = arrayList.iterator();
        block3: while (true) {
            int n7 = iterator.hasNext();
            block4: while (n7 != 0) {
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                block43: {
                    int n16;
                    block44: {
                        int n17;
                        block42: {
                            block31: {
                                int n18;
                                int n19;
                                block40: {
                                    block41: {
                                        block38: {
                                            block39: {
                                                block36: {
                                                    block37: {
                                                        block34: {
                                                            block35: {
                                                                block32: {
                                                                    block33: {
                                                                        block29: {
                                                                            block30: {
                                                                                i i3 = (i)iterator.next();
                                                                                n19 = (Integer)i3.a();
                                                                                n18 = (Integer)i3.b();
                                                                                int n20 = a11.a(n19, n18);
                                                                                if (arrstring != null) {
                                                                                    if (n20 != 0) continue block3;
                                                                                    n20 = n19;
                                                                                }
                                                                                n15 = n20;
                                                                                n14 = n19;
                                                                                n16 = n18;
                                                                                n13 = n18;
                                                                                n12 = 65536;
                                                                                n17 = a11.a(n19 + 1, n18);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 0) break block30;
                                                                                n17 = a11.a(n19, n18 + 1);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 0) break block30;
                                                                                n17 = a11.a(n19 + 1, n18 + 1);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 0) break block30;
                                                                                n17 = a10.a(n19 + 1, n18);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 2) break block30;
                                                                                n17 = a10.a(n19, n18 + 1);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 2) break block30;
                                                                                n17 = a10.a(n19 + 1, n18 + 1);
                                                                                if (arrstring == null) break block29;
                                                                                if (n17 != 2) break block30;
                                                                                n14 = n19 + 1;
                                                                                n13 = n18 + 1;
                                                                                n12 = 262144;
                                                                                if (arrstring != null) break block31;
                                                                            }
                                                                            n17 = a11.a(n19 - 1, n18);
                                                                        }
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 0) break block33;
                                                                        n17 = a11.a(n19, n18 + 1);
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 0) break block33;
                                                                        n17 = a11.a(n19 - 1, n18 + 1);
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 0) break block33;
                                                                        n17 = a10.a(n19 - 1, n18);
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 2) break block33;
                                                                        n17 = a10.a(n19, n18 + 1);
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 2) break block33;
                                                                        n17 = a10.a(n19 - 1, n18 + 1);
                                                                        if (arrstring == null) break block32;
                                                                        if (n17 != 2) break block33;
                                                                        n15 = n19 - 1;
                                                                        n13 = n18 + 1;
                                                                        n12 = 262144;
                                                                        if (arrstring != null) break block31;
                                                                    }
                                                                    n17 = a11.a(n19 - 1, n18);
                                                                }
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 0) break block35;
                                                                n17 = a11.a(n19, n18 - 1);
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 0) break block35;
                                                                n17 = a11.a(n19 - 1, n18 - 1);
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 0) break block35;
                                                                n17 = a10.a(n19 - 1, n18);
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 2) break block35;
                                                                n17 = a10.a(n19, n18 - 1);
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 2) break block35;
                                                                n17 = a10.a(n19 - 1, n18 - 1);
                                                                if (arrstring == null) break block34;
                                                                if (n17 != 2) break block35;
                                                                n15 = n19 - 1;
                                                                n16 = n18 - 1;
                                                                n12 = 262144;
                                                                if (arrstring != null) break block31;
                                                            }
                                                            n17 = a11.a(n19 + 1, n18);
                                                        }
                                                        if (arrstring == null) break block36;
                                                        if (n17 != 0) break block37;
                                                        n17 = a10.a(n19 + 1, n18);
                                                        if (arrstring == null) break block36;
                                                        if (n17 != 2) break block37;
                                                        n14 = n19 + 1;
                                                        n12 = 131072;
                                                        if (arrstring != null) break block31;
                                                    }
                                                    n17 = a11.a(n19, n18 + 1);
                                                }
                                                if (arrstring == null) break block38;
                                                if (n17 != 0) break block39;
                                                n17 = a10.a(n19, n18 + 1);
                                                if (arrstring == null) break block38;
                                                if (n17 != 2) break block39;
                                                n13 = n18 + 1;
                                                n12 = 131072;
                                                if (arrstring != null) break block31;
                                            }
                                            n17 = a11.a(n19 - 1, n18);
                                        }
                                        if (arrstring == null) break block40;
                                        if (n17 != 0) break block41;
                                        n17 = a10.a(n19 - 1, n18);
                                        if (arrstring == null) break block40;
                                        if (n17 != 2) break block41;
                                        n15 = n19 - 1;
                                        n12 = 131072;
                                        if (arrstring != null) break block31;
                                    }
                                    n17 = a11.a(n19, n18 - 1);
                                }
                                if (arrstring == null) break block42;
                                if (n17 != 0) break block31;
                                n17 = a10.a(n19, n18 - 1);
                                if (arrstring == null) break block42;
                                if (n17 == 2) {
                                    n16 = n18 - 1;
                                    n12 = 131072;
                                }
                            }
                            n17 = this.a.nextBoolean() ? 1 : 0;
                        }
                        if (arrstring != null) {
                            n17 = n17 != 0 ? n15 : n14;
                        }
                        n11 = n17;
                        int n21 = this.a.nextBoolean();
                        if (arrstring != null) {
                            n21 = n21 != 0 ? n16 : n13;
                        }
                        n10 = n21;
                        n9 = 0x200000;
                        n8 = a10.b(n11, n10, 1);
                        if (arrstring == null) break block43;
                        if (n8 != 0) break block44;
                        int n22 = n11;
                        if (arrstring != null) {
                            n22 = n22 == n15 ? n14 : n15;
                        }
                        n11 = n22;
                        int n23 = n10;
                        if (arrstring != null) {
                            n23 = n23 == n16 ? n13 : n16;
                        }
                        n10 = n23;
                        n8 = a10.b(n11, n10, 1) ? 1 : 0;
                        if (arrstring == null) break block43;
                        if (n8 != 0) break block44;
                        int n24 = n10;
                        if (arrstring != null) {
                            n24 = n24 == n16 ? n13 : n16;
                        }
                        n10 = n24;
                        n8 = a10.b(n11, n10, 1) ? 1 : 0;
                        if (arrstring == null) break block43;
                        if (n8 != 0) break block44;
                        int n25 = n11;
                        if (arrstring != null) {
                            n25 = n25 == n15 ? n14 : n15;
                        }
                        n11 = n25;
                        int n26 = n10;
                        if (arrstring != null) {
                            n26 = n26 == n16 ? n13 : n16;
                        }
                        n10 = n26;
                        n8 = a10.b(n11, n10, 1) ? 1 : 0;
                        if (arrstring == null) break block43;
                        if (n8 == 0) {
                            n9 = 0;
                            n11 = n15;
                            n10 = n16;
                        }
                    }
                    n8 = n16;
                }
                int n27 = n8;
                block5: while (true) {
                    int n28 = n27;
                    int n29 = n13;
                    block6: while (n28 <= n29) {
                        n7 = n15;
                        if (arrstring == null) continue block4;
                        for (int i4 = v233209; i4 <= n14; ++i4) {
                            block46: {
                                int n30;
                                int n31;
                                block45: {
                                    n28 = i4;
                                    n29 = n11;
                                    if (arrstring == null) continue block6;
                                    if (arrstring == null) break block45;
                                    if (n28 != n29) break block46;
                                    n31 = n27;
                                    n30 = n10;
                                }
                                if (n31 == n30) {
                                    a11.a(i4, n27, 0x100000 | n9 | n12 | n3);
                                    if (arrstring != null) continue;
                                }
                            }
                            a11.a(i4, n27, n12 | n3);
                            if (arrstring != null) continue;
                        }
                        ++n27;
                        if (arrstring != null) continue block5;
                    }
                    break;
                }
                ++n3;
                if (arrstring != null) continue block3;
            }
            break;
        }
    }

    static int c(ap ap2) {
        return ap2.d;
    }

    static a[] b(ap ap2) {
        return ap2.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(a var1_1, int var2_2, int var3_3, aA var4_4, int var5_5) {
        block7: {
            var6_6 = u.b();
            v0 = var5_5;
            if (var6_6 != null) {
                if (v0 <= 0) return;
                var1_1.a(var2_2, var3_3, 1);
                var1_1.a(var2_2 + var4_4.r(), var3_3 + var4_4.i(), 0, 1);
                v0 = var7_7 = 0;
            }
            while (var7_7 < 8) {
                block8: {
                    var8_9 = aA.b(this.a.nextInt(4));
                    if (var6_6 == null) break block8;
                    v1 = var8_9;
                    if (var6_6 == null) break block7;
                    if (v1 == var4_4.h()) ** GOTO lbl-1000
                    if (var8_9 != aA.EAST) ** GOTO lbl-1000
                    v2 = this.a.nextBoolean();
                    if (var6_6 != null) {
                        ** if (v2 != 0) goto lbl-1000
                    }
                    ** GOTO lbl20
lbl-1000:
                    // 2 sources

                    {
                        v2 = var2_2 + var4_4.r();
lbl20:
                        // 2 sources

                        var9_10 = v2;
                        var10_11 = var3_3 + var4_4.i();
                        if (var6_6 != null) {
                            if (var1_1.a(var9_10 + var8_9.r(), var10_11 + var8_9.i()) == 0 && var1_1.a(var9_10 + var8_9.r() * 2, var10_11 + var8_9.i() * 2) == 0) {
                                this.a(var1_1, var2_2 + var4_4.r() + var8_9.r(), var3_3 + var4_4.i() + var8_9.i(), var8_9, var5_5 - 1);
                                if (var6_6 != null) break;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                        ** GOTO lbl28
                    }
lbl-1000:
                    // 5 sources

                    {
                        ++var7_7;
                    }
                }
                if (var6_6 != null) continue;
            }
            v1 = var4_4.l();
        }
        var7_8 = v1;
        var8_9 = var4_4.d();
        var1_1.a(var2_2 + var7_8.r(), var3_3 + var7_8.i(), 0, 2);
        var1_1.a(var2_2 + var8_9.r(), var3_3 + var8_9.i(), 0, 2);
        var1_1.a(var2_2 + var4_4.r() + var7_8.r(), var3_3 + var4_4.i() + var7_8.i(), 0, 2);
        var1_1.a(var2_2 + var4_4.r() + var8_9.r(), var3_3 + var4_4.i() + var8_9.i(), 0, 2);
        var1_1.a(var2_2 + var4_4.r() * 2, var3_3 + var4_4.i() * 2, 0, 2);
        var1_1.a(var2_2 + var7_8.r() * 2, var3_3 + var7_8.i() * 2, 0, 2);
        var1_1.a(var2_2 + var8_9.r() * 2, var3_3 + var8_9.i() * 2, 0, 2);
    }

    @Nullable
    public aA b(a a10, int n2, int n3, int n4, int n5) {
        aA[] arraA = av.HORIZONTAL.a();
        int n6 = arraA.length;
        int n7 = 0;
        String[] arrstring = u.b();
        while (n7 < n6) {
            aA aA2 = arraA[n7];
            if (arrstring != null) {
                if (this.a(a10, n2 + aA2.r(), n3 + aA2.i(), n4, n5)) {
                    return aA2;
                }
                ++n7;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    static a d(ap ap2) {
        return ap2.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        block38: {
            block36: {
                block37: {
                    block35: {
                        var2_1 = Lists.newArrayList();
                        var3_2 = this.b[1];
                        var1_3 = u.b();
                        var4_4 = 0;
                        block0: while (true) {
                            v0 = var4_4;
                            v1 = net.minecraft.ao.a.a(this.c);
                            block1: while (v0 < v1) {
                                v2 = 0;
                                if (var1_3 == null) break block35;
                                var5_6 = v2;
                                while (var5_6 < net.minecraft.ao.a.b(this.c)) {
                                    var6_7 = var3_2.a(var5_6, var4_4);
                                    var7_9 = var6_7 & 983040;
                                    if (var1_3 != null) {
                                        v0 = var7_9;
                                        v1 = 131072;
                                        if (var1_3 == null) continue block1;
                                        if (v0 == v1) {
                                            v3 = var6_7 & 0x200000;
                                            if (var1_3 != null && v3 == 0x200000) {
                                                v3 = var2_1.add(new i<Integer, Integer>(var5_6, var4_4)) ? 1 : 0;
                                            }
                                        }
                                        ++var5_6;
                                    }
                                    if (var1_3 != null) continue;
                                }
                                ++var4_4;
                                if (var1_3 != null) continue block0;
                            }
                            break;
                        }
                        v4 /* !! */  = var2_1;
                        if (var1_3 == null) break block37;
                        v2 = v4 /* !! */ .isEmpty();
                    }
                    if (v2 != 0) {
                        this.c.a(0, 0, net.minecraft.ao.a.b(this.c), net.minecraft.ao.a.a(this.c), 5);
                        if (var1_3 != null) return;
                    }
                    v4 /* !! */  = var2_1.get(this.a.nextInt(var2_1.size()));
                }
                var4_5 = (i)v4 /* !! */ ;
                var5_6 = var3_2.a((Integer)var4_5.a(), (Integer)var4_5.b());
                var3_2.a((Integer)var4_5.a(), (Integer)var4_5.b(), var5_6 | 0x400000);
                var6_8 = this.b(this.f, (Integer)var4_5.a(), (Integer)var4_5.b(), 1, var5_6 & 65535);
                var7_9 = (Integer)var4_5.a() + var6_8.r();
                var8_10 = (Integer)var4_5.b() + var6_8.i();
                var9_11 = 0;
                block3: while (true) {
                    v5 = var9_11;
                    block4: while (v5 < net.minecraft.ao.a.a(this.c)) {
                        if (var1_3 == null) return;
                        for (var10_13 = 0; var10_13 < net.minecraft.ao.a.b(this.c); ++var10_13) {
                            v5 = ap.a(this.f, var10_13, var9_11) ? 1 : 0;
                            if (var1_3 == null) continue block4;
                            if (var1_3 != null) {
                                if (v5 == 0) {
                                    this.c.a(var10_13, var9_11, 5);
                                    if (var1_3 != null) continue;
                                }
                                v6 = var10_13;
                            }
                            v7 = (Integer)var4_5.a();
                            if (var1_3 != null) {
                                if (v6 == v7) {
                                    v6 = var9_11;
                                    v7 = (Integer)var4_5.b();
                                    if (var1_3 != null) {
                                        if (v6 == v7) {
                                            this.c.a(var10_13, var9_11, 3);
                                            if (var1_3 != null) continue;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 4 sources

                                {
                                    v6 = var10_13;
                                    v7 = var7_9;
                                }
                            }
                            if (var1_3 != null) {
                                if (v6 != v7) continue;
                                v6 = var9_11;
                                v7 = var8_10;
                            }
                            if (v6 != v7) continue;
                            this.c.a(var10_13, var9_11, 3);
                            this.b[2].a(var10_13, var9_11, 0x800000);
                            if (var1_3 != null) continue;
                        }
                        ++var9_11;
                        if (var1_3 != null) continue block3;
                    }
                    break;
                }
                var9_12 = Lists.newArrayList();
                var10_14 = av.HORIZONTAL.a();
                var11_15 = ((aA[])var10_14).length;
                var12_16 = 0;
                while (var12_16 < var11_15) {
                    var13_17 = var10_14[var12_16];
                    if (var1_3 != null) {
                        v8 = this.c.a(var7_9 + var13_17.r(), var8_10 + var13_17.i());
                        if (var1_3 == null) break block36;
                        if (v8 == 0) {
                            var9_12.add(var13_17);
                        }
                        ++var12_16;
                    }
                    if (var1_3 != null) continue;
                }
                v9 /* !! */  = var9_12;
                if (var1_3 == null) break block38;
                v8 = v9 /* !! */ .isEmpty();
            }
            if (v8 != 0) {
                this.c.a(0, 0, net.minecraft.ao.a.b(this.c), net.minecraft.ao.a.a(this.c), 5);
                var3_2.a((Integer)var4_5.a(), (Integer)var4_5.b(), var5_6);
                if (var1_3 != null) return;
            }
            v9 /* !! */  = var9_12.get(this.a.nextInt(var9_12.size()));
        }
        var10_14 = (aA)v9 /* !! */ ;
        this.a(this.c, var7_9 + var10_14.r(), var8_10 + var10_14.i(), (aA)var10_14, 4);
        while (this.a(this.c) != false) {
        }
    }

    public boolean a(a a10, int n2, int n3, int n4, int n5) {
        String[] arrstring = u.b();
        int n6 = this.b[n4].a(n2, n3) & 0xFFFF;
        if (arrstring != null) {
            n6 = n6 == n5 ? 1 : 0;
        }
        return n6 != 0;
    }
}

