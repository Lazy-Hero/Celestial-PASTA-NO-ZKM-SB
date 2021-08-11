/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.ax;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.ar.al;
import net.minecraft.ax.L;
import net.minecraft.ax.S;
import net.minecraft.ax.b;
import net.minecraft.ax.c;
import net.minecraft.ax.d;
import net.minecraft.ax.f;
import net.minecraft.ax.g;
import net.minecraft.ax.u;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.w.k;

public class T {
    private static final /* synthetic */ S a;
    private static final /* synthetic */ g d;
    private static /* synthetic */ String[] c;
    private static final /* synthetic */ d e;
    private static final /* synthetic */ c b;

    public static int f(B b10) {
        return T.a(net.minecraft.u.b.j, b10);
    }

    public static int c(B b10) {
        return T.a(net.minecraft.u.b.l, b10);
    }

    public static int d(net.minecraft.w.d d10) {
        return T.a(net.minecraft.u.b.d, d10);
    }

    private static void a(b b10, net.minecraft.w.d d10) {
        block7: {
            net.minecraft.w.d d11;
            String[] arrstring;
            block6: {
                arrstring = T.b();
                d11 = d10;
                if (arrstring != null) break block6;
                if (d11.G()) break block7;
                d11 = d10;
            }
            net.minecraft.P.u u2 = d11.D();
            int n2 = 0;
            while (n2 < u2.b()) {
                short s2 = u2.d(n2).q("id");
                short s3 = u2.d(n2).q("lvl");
                if (arrstring == null) {
                    if (u.c(s2) != null) {
                        b10.a(u.c(s2), s3);
                    }
                    ++n2;
                }
                if (arrstring == null) continue;
            }
        }
    }

    public static int a(B b10) {
        return T.a(net.minecraft.u.b.D, b10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static net.minecraft.w.d b(u u2, B b10) {
        net.minecraft.w.d d10;
        ArrayList arrayList;
        block13: {
            boolean bl2;
            ArrayList arrayList2;
            block10: {
                List<net.minecraft.w.d> list = u2.a(b10);
                String[] arrstring = T.b();
                if (list.isEmpty()) {
                    return net.minecraft.w.d.m;
                }
                arrayList2 = Lists.newArrayList();
                for (net.minecraft.w.d d11 : list) {
                    block12: {
                        int n2;
                        block11: {
                            bl2 = d11.G();
                            if (arrstring != null) break block10;
                            if (arrstring != null) break block11;
                            if (bl2) break block12;
                            n2 = T.a(u2, d11);
                        }
                        if (arrstring == null && n2 > 0) {
                            n2 = arrayList2.add(d11) ? 1 : 0;
                        }
                    }
                    if (arrstring == null) continue;
                }
                arrayList = arrayList2;
                if (arrstring != null) break block13;
                bl2 = arrayList.isEmpty();
            }
            if (bl2) {
                d10 = net.minecraft.w.d.m;
                return d10;
            }
            arrayList = arrayList2.get(b10.f().nextInt(arrayList2.size()));
        }
        d10 = (net.minecraft.w.d)((Object)arrayList);
        return d10;
    }

    private static void a(b b10, Iterable<net.minecraft.w.d> iterable) {
        Iterator<net.minecraft.w.d> iterator = iterable.iterator();
        String[] arrstring = T.b();
        while (iterator.hasNext()) {
            net.minecraft.w.d d10 = iterator.next();
            T.a(b10, d10);
            if (arrstring == null) continue;
        }
    }

    public static String[] b() {
        return c;
    }

    public static void a(B b10, x x2) {
        block2: {
            T.a.a = x2;
            T.a.b = b10;
            String[] arrstring = T.b();
            x x3 = b10;
            if (arrstring == null) {
                if (x3 != null) {
                    T.a((b)a, b10.ay());
                }
                x3 = x2;
            }
            if (!(x3 instanceof j)) break block2;
            T.a((b)a, b10.av());
        }
    }

    public static boolean b(net.minecraft.w.d d10) {
        String[] arrstring = T.b();
        boolean bl2 = T.a(net.minecraft.u.b.k, d10);
        if (arrstring == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static int a(u u2, B b10) {
        int n2;
        block4: {
            List<net.minecraft.w.d> list = u2.a(b10);
            String[] arrstring = T.b();
            if (list == null) {
                return 0;
            }
            int n3 = 0;
            for (net.minecraft.w.d d10 : list) {
                int n4;
                n2 = n4 = T.a(u2, d10);
                if (arrstring == null) {
                    if (arrstring == null && n2 > n3) {
                        int n5 = n3 = n4;
                    }
                    if (arrstring == null) continue;
                }
                break block4;
            }
            n2 = n3;
        }
        return n2;
    }

    static {
        d = new g(null);
        T.b(null);
        e = new d(null);
        a = new S(null);
        b = new c(null);
    }

    public static float a(net.minecraft.w.d d10, net.minecraft.U.g g10) {
        T.e.a = 0.0f;
        T.e.b = g10;
        T.a((b)e, d10);
        return T.e.a;
    }

    public static int a(Iterable<net.minecraft.w.d> iterable, G g10) {
        T.d.a = 0;
        T.d.b = g10;
        T.a((b)d, iterable);
        return T.d.a;
    }

    public static void a(Map<u, Integer> map, net.minecraft.w.d d10) {
        block11: {
            net.minecraft.w.d d11;
            net.minecraft.P.u u2;
            block12: {
                String[] arrstring;
                block5: {
                    net.minecraft.w.d d12;
                    block10: {
                        boolean bl2;
                        block9: {
                            u2 = new net.minecraft.P.u();
                            Iterator<Map.Entry<u, Integer>> iterator = map.entrySet().iterator();
                            arrstring = T.b();
                            while (iterator.hasNext()) {
                                block7: {
                                    net.minecraft.w.d d13;
                                    int n2;
                                    u u3;
                                    block8: {
                                        Object object;
                                        block6: {
                                            Map.Entry<u, Integer> entry = iterator.next();
                                            u3 = entry.getKey();
                                            if (arrstring != null) break block5;
                                            object = u3;
                                            if (arrstring != null) break block6;
                                            if (object == null) break block7;
                                            object = entry.getValue();
                                        }
                                        n2 = (Integer)object;
                                        r r2 = new r();
                                        r2.a("id", (short)u.c(u3));
                                        r2.a("lvl", (short)n2);
                                        u2.a(r2);
                                        d13 = d10;
                                        if (arrstring != null) break block8;
                                        if (d13.w() != net.minecraft.u.h.a0) break block7;
                                        d13 = d10;
                                    }
                                    net.minecraft.w.S.a(d13, new f(u3, n2));
                                }
                                if (arrstring == null) continue;
                            }
                            bl2 = u2.c();
                            if (arrstring != null) break block9;
                            if (!bl2) break block5;
                            d12 = d10;
                            if (arrstring != null) break block10;
                            bl2 = d12.x();
                        }
                        if (!bl2) break block11;
                        d12 = d10;
                    }
                    d12.v().k("ench");
                    if (arrstring == null) break block11;
                }
                d11 = d10;
                if (arrstring != null) break block12;
                if (d11.w() == net.minecraft.u.h.a0) break block11;
                d11 = d10;
            }
            d11.a("ench", u2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Map<u, Integer> a(net.minecraft.w.d var0) {
        var2_1 = Maps.newLinkedHashMap();
        var1_2 = T.b();
        v0 = var0;
        if (var1_2 != null) ** GOTO lbl9
        if (v0.w() == net.minecraft.u.h.a0) {
            v1 = net.minecraft.w.S.a(var0);
        } else {
            v0 = var0;
lbl9:
            // 2 sources

            v1 = v0.D();
        }
        var3_3 = v1;
        for (var4_4 = 0; var4_4 < var3_3.b(); ++var4_4) {
            var5_5 = var3_3.d(var4_4);
            var6_6 = u.c(var5_5.q("id"));
            var7_7 = var5_5.q("lvl");
            v2 = var2_1;
            if (var1_2 != null) return v2;
            v2.put(var6_6, Integer.valueOf(var7_7));
            if (var1_2 == null) continue;
        }
        v2 = var2_1;
        return v2;
    }

    public static int a(u u2, net.minecraft.w.d d10) {
        int n2;
        block6: {
            String[] arrstring = T.b();
            net.minecraft.w.d d11 = d10;
            if (arrstring == null) {
                if (d11.G()) {
                    return 0;
                }
                d11 = d10;
            }
            net.minecraft.P.u u3 = d11.D();
            int n3 = 0;
            while (n3 < u3.b()) {
                r r2 = u3.d(n3);
                u u4 = u.c(r2.q("id"));
                n2 = r2.q("lvl");
                if (arrstring == null) {
                    int n4 = n2;
                    if (arrstring == null) {
                        if (u4 == u2) {
                            return n4;
                        }
                        ++n3;
                    }
                    if (arrstring == null) continue;
                }
                break block6;
            }
            n2 = 0;
        }
        return n2;
    }

    public static boolean i(B b10) {
        String[] arrstring = T.b();
        boolean bl2 = T.a(net.minecraft.u.b.e, b10);
        if (arrstring == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static List<f> b(Random random, net.minecraft.w.d d10, int n2, boolean bl2) {
        ArrayList arrayList;
        block8: {
            List<f> list;
            String[] arrstring;
            block7: {
                int n3;
                arrayList = Lists.newArrayList();
                arrstring = T.b();
                k k2 = d10.w();
                int n4 = n3 = k2.o();
                if (arrstring == null) {
                    if (n4 <= 0) {
                        return arrayList;
                    }
                    n4 = n2 + 1 + random.nextInt(n3 / 4 + 1) + random.nextInt(n3 / 4 + 1);
                }
                n2 = n4;
                float f10 = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f;
                n2 = h.c(Math.round((float)n2 + (float)n2 * f10), 1, Integer.MAX_VALUE);
                list = T.a(n2, d10, bl2);
                boolean bl3 = list.isEmpty();
                if (arrstring != null) break block7;
                if (bl3) break block8;
                bl3 = arrayList.add(al.a(random, list));
            }
            while (random.nextInt(50) <= n2) {
                T.a(list, (f)net.minecraft.ar.T.a(arrayList));
                int n5 = list.isEmpty();
                if (arrstring == null) {
                    if (n5 != 0 && arrstring == null) break;
                    arrayList.add(al.a(random, list));
                    n5 = n2 / 2;
                }
                n2 = n5;
                if (arrstring == null) continue;
            }
        }
        return arrayList;
    }

    public static net.minecraft.w.d a(Random random, net.minecraft.w.d d10, int n2, boolean bl2) {
        block8: {
            boolean bl3;
            List<f> list = T.b(random, d10, n2, bl2);
            String[] arrstring = T.b();
            boolean bl4 = bl3 = d10.w() == net.minecraft.u.h.b8;
            if (bl3) {
                d10 = new net.minecraft.w.d(net.minecraft.u.h.a0);
            }
            for (f f10 : list) {
                block7: {
                    block6: {
                        block5: {
                            if (arrstring != null) break block5;
                            if (!bl3) break block6;
                            net.minecraft.w.S.a(d10, f10);
                        }
                        if (arrstring == null) break block7;
                    }
                    d10.a(f10.b, f10.c);
                }
                if (arrstring == null) continue;
            }
            if (m.d()) break block8;
            T.b(new String[2]);
        }
        return d10;
    }

    public static int b(B b10) {
        return T.a(net.minecraft.u.b.w, b10);
    }

    public static int e(B b10) {
        return T.a(net.minecraft.u.b.b, b10);
    }

    public static void b(B b10, x x2) {
        block2: {
            T.b.b = b10;
            String[] arrstring = T.b();
            T.b.a = x2;
            B b11 = b10;
            if (arrstring == null) {
                if (b11 != null) {
                    T.a((b)b, b10.ay());
                }
                b11 = b10;
            }
            if (!(b11 instanceof j)) break block2;
            T.a((b)b, b10.av());
        }
    }

    public static int g(B b10) {
        return T.a(net.minecraft.u.b.c, b10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(Random random, int n2, int n3, net.minecraft.w.d d10) {
        int n4;
        k k2 = d10.w();
        int n5 = k2.o();
        String[] arrstring = T.b();
        int n6 = n5;
        if (arrstring == null) {
            if (n6 <= 0) {
                return 0;
            }
            n6 = n3;
        }
        int n7 = 15;
        if (arrstring == null) {
            if (n6 > n7) {
                n3 = 15;
            }
            n6 = random.nextInt(8) + 1 + (n3 >> 1);
            n7 = random.nextInt(n3 + 1);
        }
        int n8 = n6 + n7;
        int n9 = n2;
        if (arrstring == null) {
            if (n9 == 0) {
                return Math.max(n8 / 3, 1);
            }
            n9 = n2;
        }
        int n10 = 1;
        if (arrstring == null) {
            if (n9 == n10) {
                n4 = n8 * 2 / 3 + 1;
                return n4;
            }
            n9 = n8;
            n10 = n3 * 2;
        }
        n4 = Math.max(n9, n10);
        return n4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float d(B b10) {
        int n2 = T.a(net.minecraft.u.b.f, b10);
        String[] arrstring = T.b();
        int n3 = n2;
        if (arrstring == null) {
            if (n3 <= 0) return 0.0f;
            n3 = n2;
        }
        float f10 = L.a(n3);
        return f10;
    }

    public static boolean e(net.minecraft.w.d d10) {
        String[] arrstring = T.b();
        boolean bl2 = T.a(net.minecraft.u.b.n, d10);
        if (arrstring == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(List<f> var0, f var1_1) {
        var3_2 = var0.iterator();
        var2_3 = T.b();
        do lbl-1000:
        // 3 sources

        {
            v0 = var3_2.hasNext();
            do {
                if (v0 == false) return;
                v0 = var1_1.b.b(var3_2.next().b);
            } while (var2_3 != null);
            if (v0) ** GOTO lbl-1000
            var3_2.remove();
        } while (var2_3 == null);
    }

    public static boolean h(B b10) {
        String[] arrstring = T.b();
        boolean bl2 = T.a(net.minecraft.u.b.h, b10);
        if (arrstring == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static int c(net.minecraft.w.d d10) {
        return T.a(net.minecraft.u.b.x, d10);
    }

    public static List<f> a(int n2, net.minecraft.w.d d10, boolean bl2) {
        ArrayList arrayList = Lists.newArrayList();
        k k2 = d10.w();
        String[] arrstring = T.b();
        int n3 = d10.w() == net.minecraft.u.h.b8 ? 1 : 0;
        for (u u2 : u.e) {
            block7: {
                int n4;
                block8: {
                    block9: {
                        block5: {
                            block6: {
                                n4 = u2.e();
                                if (arrstring != null) break block5;
                                if (n4 == 0) break block6;
                                n4 = bl2;
                                if (arrstring != null) break block5;
                                if (n4 == 0) break block7;
                            }
                            n4 = u2.b.a(k2);
                        }
                        if (arrstring != null) break block8;
                        if (n4 != 0) break block9;
                        n4 = n3;
                        if (arrstring != null) break block8;
                        if (n4 == 0) break block7;
                    }
                    n4 = u2.f();
                }
                int n5 = n4;
                block1: while (true) {
                    int n7 = n5;
                    n7 = u2.g() - 1;
                    while (n6 > n7) {
                        block11: {
                            block12: {
                                int n8;
                                int n9;
                                block10: {
                                    int n7 = n2;
                                    n7 = u2.a(n5);
                                    if (arrstring != null) continue;
                                    if (arrstring != null) break block10;
                                    if (n6 < n7) break block11;
                                    n9 = n2;
                                    if (arrstring != null) break block12;
                                    n8 = u2.b(n5);
                                }
                                if (n9 > n8) break block11;
                                n9 = arrayList.add(new f(u2, n5)) ? 1 : 0;
                            }
                            if (arrstring == null) break block1;
                        }
                        --n5;
                        if (arrstring == null) continue block1;
                    }
                    break;
                }
            }
            if (arrstring == null) continue;
        }
        return arrayList;
    }
}

