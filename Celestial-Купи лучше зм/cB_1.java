/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.W.bR;
import net.minecraft.W.bW;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.n;
import net.minecraft.client.x.x;

public class cB {
    private static /* synthetic */ List o;
    private static /* synthetic */ Y i;
    private static /* synthetic */ Y d;
    private static /* synthetic */ Y f;
    private static /* synthetic */ Y h;
    private static /* synthetic */ Y k;
    private static /* synthetic */ Y a;
    private static /* synthetic */ List m;
    private static /* synthetic */ Y e;
    private static /* synthetic */ Y q;
    private static /* synthetic */ Y j;
    private static /* synthetic */ List b;
    private static /* synthetic */ List n;
    private static /* synthetic */ Y r;
    private static /* synthetic */ List l;
    private static /* synthetic */ Y c;
    private static /* synthetic */ Y p;
    private static /* synthetic */ List g;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static List b(Y y2) {
        String string = K.d();
        Y y3 = y2;
        if (string == null) {
            if (y3 == null) {
                return null;
            }
            y3 = y2;
        }
        List<P> list = y3.a(null, null, 0L);
        return list;
    }

    static Y a(String string, List list) {
        block16: {
            Y y2;
            block14: {
                int n2;
                List<P> list2;
                List<P> list3;
                String string2;
                block19: {
                    int n3;
                    block18: {
                        Y y3;
                        block17: {
                            x x2;
                            block15: {
                                v v2;
                                v v3;
                                x2 = fU.a2();
                                string2 = K.d();
                                if (x2 == null) {
                                    return null;
                                }
                                v v4 = v3 = new v("blockstates/" + string + "_leaves.json");
                                if (string2 == null) {
                                    if (fU.c(v4) != fU.l()) {
                                        return null;
                                    }
                                    v4 = new v("models/block/" + string + "_leaves.json");
                                }
                                if (fU.c(v2 = v4) != fU.l()) {
                                    return null;
                                }
                                n n4 = new n(string + "_leaves", "normal");
                                y3 = y2 = x2.a(n4);
                                if (string2 != null) break block15;
                                if (y3 == null) break block16;
                                y3 = y2;
                            }
                            if (string2 != null) break block17;
                            if (y3 == x2.c()) break block16;
                            y3 = y2;
                        }
                        list3 = y3.a(null, null, 0L);
                        n3 = list3.size();
                        if (string2 != null) break block18;
                        if (n3 == 0) {
                            return y2;
                        }
                        list2 = list3;
                        if (string2 != null) break block19;
                        n3 = list2.size();
                    }
                    if (n3 != 6) {
                        return null;
                    }
                    list2 = list3;
                }
                for (P p2 : list2) {
                    List<P> list4 = y2.a(null, p2.b(), 0L);
                    n2 = list4.size();
                    if (string2 == null) {
                        if (string2 == null) {
                            if (n2 > 0) {
                                return null;
                            }
                            list4.add(p2);
                        }
                        if (string2 == null) continue;
                    }
                    break block14;
                }
                list3.clear();
                n2 = list.add(string + "_leaves");
            }
            return y2;
        }
        return null;
    }

    private static Y a(Y y2) {
        Y y3;
        block13: {
            Y y4;
            List[] arrlist;
            aA[] arraA;
            String string;
            block12: {
                block15: {
                    Y y5;
                    block14: {
                        string = K.d();
                        y5 = y2;
                        if (string == null) {
                            if (y5 == null) {
                                return null;
                            }
                            y5 = y2;
                        }
                        if (string != null) break block14;
                        if (y5.a(null, null, 0L).size() <= 0) break block15;
                        fU.h("SmartLeaves: Model is not cube, general quads: " + y2.a(null, null, 0L).size() + ", model: " + y2);
                        y5 = y2;
                    }
                    return y5;
                }
                arraA = aA.VALUES;
                int n2 = 0;
                while (n2 < arraA.length) {
                    arrlist = arraA[n2];
                    y4 = y2;
                    if (string == null) {
                        List<P> list = y4.a(null, (aA)arrlist, 0L);
                        if (string == null) {
                            if (list.size() != 1) {
                                fU.h("SmartLeaves: Model is not cube, side: " + arrlist + ", quads: " + list.size() + ", model: " + y2);
                                return y2;
                            }
                            ++n2;
                        }
                        if (string == null) continue;
                    }
                    break block12;
                }
                y4 = h1.a(y2);
            }
            Y y6 = y4;
            arrlist = new List[arraA.length];
            for (int i2 = 0; i2 < arraA.length; ++i2) {
                aA aA2 = arraA[i2];
                y3 = y6;
                if (string == null) {
                    List<P> list = y3.a(null, aA2, 0L);
                    P p2 = list.get(0);
                    P p3 = new P((int[])p2.d().clone(), p2.q(), p2.b(), p2.p());
                    int[] arrn = p3.d();
                    int[] arrn2 = (int[])arrn.clone();
                    int n3 = arrn.length / 4;
                    System.arraycopy(arrn, 0 * n3, arrn2, 3 * n3, n3);
                    System.arraycopy(arrn, 1 * n3, arrn2, 2 * n3, n3);
                    System.arraycopy(arrn, 2 * n3, arrn2, 1 * n3, n3);
                    System.arraycopy(arrn, 3 * n3, arrn2, 0 * n3, n3);
                    System.arraycopy(arrn2, 0, arrn, 0, arrn2.length);
                    list.add(p3);
                    if (string == null) continue;
                }
                break block13;
            }
            y3 = y6;
        }
        return y3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(i i2, i i3) {
        String string = K.d();
        i i4 = i2;
        if (string == null) {
            if (i4 == i3) {
                return true;
            }
            i4 = i2;
        }
        net.minecraft.W.K k2 = i4.b();
        net.minecraft.W.K k3 = i3.b();
        net.minecraft.W.K k4 = k2;
        if (string == null) {
            if (k4 != k3) {
                return false;
            }
            k4 = k2;
        }
        boolean bl2 = k4 instanceof bR;
        if (string == null) {
            if (bl2) {
                return i2.b(bR.D).equals(i3.b(bR.D));
            }
            bl2 = k2 instanceof bW;
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = i2.b(bW.D).equals(i3.b(bW.D));
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void a() {
        block3: {
            String string;
            block2: {
                ArrayList arrayList = new ArrayList();
                f = cB.a("acacia", arrayList);
                c = cB.a("birch", arrayList);
                r = cB.a("dark_oak", arrayList);
                String string2 = K.d();
                i = cB.a("jungle", arrayList);
                j = cB.a("oak", arrayList);
                string = "spruce";
                if (string2 != null) break block2;
                k = cB.a(string, arrayList);
                m = cB.b(f);
                g = cB.b(c);
                n = cB.b(r);
                b = cB.b(i);
                l = cB.b(j);
                o = cB.b(k);
                a = cB.a(f);
                e = cB.a(c);
                h = cB.a(r);
                p = cB.a(i);
                d = cB.a(j);
                q = cB.a(k);
                if (arrayList.size() <= 0) break block3;
                string = "Enable face culling: " + fU.a(arrayList.toArray());
            }
            fU.b(string);
        }
    }

    public static Y a(Y y2, i i2) {
        List<P> list;
        String string = K.d();
        if (!fU.h()) {
            return y2;
        }
        List<P> list2 = list = y2.a(i2, null, 0L);
        List list3 = m;
        if (string == null) {
            if (list2 == list3) {
                return a;
            }
            list2 = list;
            list3 = g;
        }
        if (string == null) {
            if (list2 == list3) {
                return e;
            }
            list2 = list;
            list3 = n;
        }
        if (string == null) {
            if (list2 == list3) {
                return h;
            }
            list2 = list;
            list3 = b;
        }
        if (string == null) {
            if (list2 == list3) {
                return p;
            }
            list2 = list;
            list3 = l;
        }
        if (string == null) {
            if (list2 == list3) {
                return d;
            }
            list2 = list;
            list3 = o;
        }
        return list2 == list3 ? q : y2;
    }

    static {
        f = null;
        c = null;
        r = null;
        i = null;
        j = null;
        k = null;
        m = null;
        g = null;
        n = null;
        b = null;
        l = null;
        o = null;
        a = null;
        e = null;
        h = null;
        p = null;
        d = null;
        q = null;
    }
}

