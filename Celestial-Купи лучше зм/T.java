/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class T {
    private static /* synthetic */ aJ[][] a;

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a(List<List<aJ>> list, aJ aJ2) {
        int[] arrn = aJ2.b();
        int n2 = 0;
        String string = dB.i();
        block0: while (n2 < arrn.length) {
            List<aJ> list2;
            int n3 = arrn[n2];
            while (n3 >= list.size()) {
                list.add(null);
                if (string == null) continue block0;
                if (string != null) continue;
            }
            List<aJ> list3 = list2 = list.get(n3);
            if (string != null) {
                if (list3 == null) {
                    list2 = new ArrayList<aJ>();
                    list.set(n3, list2);
                }
                list3 = list2;
            }
            list3.add(aJ2);
            ++n2;
            if (string != null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2, int n3) {
        String string = dB.i();
        if (a == null) {
            return n2;
        }
        int n4 = n2;
        if (string == null) return n4;
        if (n4 >= 0) {
            n4 = n2;
            if (string == null) return n4;
            if (n4 < a.length) {
                int n5;
                aJ[] arraJ = a[n2];
                if (arraJ == null) {
                    return n2;
                }
                int n6 = 0;
                while (n6 < arraJ.length) {
                    aJ aJ2 = arraJ[n6];
                    if (string != null) {
                        n5 = aJ2.a(n2, n3) ? 1 : 0;
                        if (string == null) return n5;
                        if (n5 != 0) {
                            return aJ2.a();
                        }
                        ++n6;
                    }
                    if (string != null) continue;
                }
                n5 = n2;
                return n5;
            }
        }
        n4 = n2;
        return n4;
    }

    static {
        a = null;
    }

    public static void a() {
        a = null;
    }

    private static aJ[][] a(List<List<aJ>> list) {
        aJ[][] arraJ = new aJ[list.size()][];
        int n2 = 0;
        String string = dB.i();
        while (n2 < arraJ.length) {
            List<aJ> list2 = list.get(n2);
            if (string != null) {
                if (list2 != null) {
                    arraJ[n2] = list2.toArray(new aJ[list2.size()]);
                }
                ++n2;
            }
            if (string != null) continue;
        }
        return arraJ;
    }

    public static void a(fK fK2) {
        String string = dB.i();
        T.a();
        String string2 = "/shaders/block.properties";
        String string3 = string;
        try {
            ArrayList<List<aJ>> arrayList;
            block19: {
                int n2;
                ArrayList<List<aJ>> arrayList2;
                block11: {
                    InputStream inputStream = fK2.a(string2);
                    if (inputStream == null) {
                        return;
                    }
                    g0 g02 = new g0();
                    g02.load(inputStream);
                    inputStream.close();
                    fU.b("[Shaders] Parsing block mappings: " + string2);
                    arrayList2 = new ArrayList<List<aJ>>();
                    ha ha2 = new ha("Shaders");
                    for (Object object : ((Properties)g02).keySet()) {
                        block14: {
                            String string4;
                            String string5;
                            block18: {
                                R[] arrr;
                                R[] arrr2;
                                int n3;
                                block17: {
                                    block16: {
                                        block15: {
                                            String string6;
                                            String string7;
                                            block12: {
                                                String string8;
                                                block13: {
                                                    string5 = (String)object;
                                                    string4 = g02.getProperty(string5);
                                                    string8 = "block.";
                                                    string7 = string5;
                                                    string6 = string8;
                                                    if (string3 == null) break block12;
                                                    n2 = string7.startsWith(string6) ? 1 : 0;
                                                    if (string3 == null) break block11;
                                                    if (n2 != 0) break block13;
                                                    fU.h("[Shaders] Invalid block ID: " + string5);
                                                    if (string3 != null) break block14;
                                                }
                                                string7 = string5;
                                                string6 = string8;
                                            }
                                            String string9 = dQ.f(string7, string6);
                                            n3 = fU.b(string9, -1);
                                            if (string3 == null) break block15;
                                            if (n3 >= 0) break block16;
                                            fU.h("[Shaders] Invalid block ID: " + string5);
                                        }
                                        if (string3 != null) break block14;
                                    }
                                    arrr = arrr2 = ha2.j(string4);
                                    if (string3 == null) break block17;
                                    if (arrr == null) break block18;
                                    arrr = arrr2;
                                }
                                if (arrr.length < 1) break block18;
                                aJ aJ2 = new aJ(n3, arrr2);
                                T.a(arrayList2, aJ2);
                                if (string3 != null) break block14;
                            }
                            fU.h("[Shaders] Invalid block ID mapping: " + string5 + "=" + string4);
                        }
                        if (string3 != null) continue;
                    }
                    arrayList = arrayList2;
                    if (string3 == null) break block19;
                    n2 = arrayList.size();
                }
                if (n2 <= 0) {
                    return;
                }
                arrayList = arrayList2;
            }
            a = T.a(arrayList);
        }
        catch (IOException iOException) {
            fU.h("[Shaders] Error reading: " + string2);
        }
    }
}

