/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.client.Q;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.q;

public class c {
    public static List<k> a(k k2, int n2, a5 a52, boolean bl2, boolean bl3) {
        ArrayList arrayList;
        block16: {
            boolean bl4;
            int n3 = 0;
            g g10 = new g("");
            arrayList = Lists.newArrayList();
            ArrayList arrayList2 = Lists.newArrayList((Iterable)k2);
            String[] arrstring = q.b();
            for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                int n4;
                block29: {
                    int n5;
                    block27: {
                        block28: {
                            int n6;
                            g g11;
                            int n7;
                            block17: {
                                block18: {
                                    int n8;
                                    block21: {
                                        block19: {
                                            String string;
                                            k k3;
                                            block20: {
                                                String string2;
                                                block24: {
                                                    String string3;
                                                    block26: {
                                                        int n9;
                                                        String string4;
                                                        block25: {
                                                            block22: {
                                                                block23: {
                                                                    int n10;
                                                                    String string5;
                                                                    k3 = (k)arrayList2.get(i2);
                                                                    String string6 = k3.b();
                                                                    n4 = 0;
                                                                    String string7 = string6;
                                                                    if (arrstring != null) {
                                                                        bl4 = string7.contains("\n");
                                                                        if (arrstring == null) break block16;
                                                                        if (bl4) {
                                                                            int n11 = string6.indexOf(10);
                                                                            string5 = string6.substring(n11 + 1);
                                                                            string6 = string6.substring(0, n11 + 1);
                                                                            g g12 = new g(string5);
                                                                            g12.a(k3.e().g());
                                                                            arrayList2.add(i2 + 1, g12);
                                                                            n4 = 1;
                                                                        }
                                                                        string7 = c.a(k3.e().c() + string6, bl3);
                                                                    }
                                                                    String string8 = string4 = string7;
                                                                    if (arrstring != null) {
                                                                        string8 = string8.endsWith("\n") ? string4.substring(0, string4.length() - 1) : string4;
                                                                    }
                                                                    string5 = string8;
                                                                    n7 = a52.e(string5);
                                                                    g11 = new g(string5);
                                                                    g11.a(k3.e().g());
                                                                    n5 = n3 + n7;
                                                                    n6 = n2;
                                                                    if (arrstring == null) break block17;
                                                                    if (n5 <= n6) break block18;
                                                                    String string9 = string = a52.a(string4, n2 - n3, false);
                                                                    if (arrstring != null) {
                                                                        string9 = string2 = string9.length() < string4.length() ? string4.substring(string.length()) : null;
                                                                    }
                                                                    if (arrstring == null) break block19;
                                                                    if (string2 == null) break block20;
                                                                    n8 = string2.isEmpty() ? 1 : 0;
                                                                    if (arrstring == null) break block21;
                                                                    if (n8 != 0) break block20;
                                                                    n9 = n10 = string.lastIndexOf(32);
                                                                    if (arrstring == null) break block22;
                                                                    if (n9 < 0) break block23;
                                                                    n9 = a52.e(string4.substring(0, n10));
                                                                    if (arrstring == null) break block22;
                                                                    if (n9 <= 0) break block23;
                                                                    string = string4.substring(0, n10);
                                                                    if (arrstring != null) {
                                                                        if (bl2) {
                                                                            ++n10;
                                                                        }
                                                                        string2 = string4.substring(n10);
                                                                    }
                                                                    if (arrstring != null) break block24;
                                                                }
                                                                n9 = n3;
                                                            }
                                                            if (arrstring == null) break block25;
                                                            if (n9 <= 0) break block24;
                                                            string3 = string4;
                                                            if (arrstring == null) break block26;
                                                            n9 = string3.contains(" ") ? 1 : 0;
                                                        }
                                                        if (n9 != 0) break block24;
                                                        string = "";
                                                        string3 = string4;
                                                    }
                                                    string2 = string3;
                                                }
                                                g g13 = new g(string2);
                                                g13.a(k3.e().g());
                                                arrayList2.add(i2 + 1, g13);
                                            }
                                            n7 = a52.e(string);
                                            g11 = new g(string);
                                            g11.a(k3.e().g());
                                        }
                                        n8 = 1;
                                    }
                                    n4 = n8;
                                }
                                n5 = n3 + n7;
                                if (arrstring == null) break block27;
                                n6 = n2;
                            }
                            if (n5 > n6) break block28;
                            n3 += n7;
                            g10.a(g11);
                            if (arrstring != null) break block29;
                        }
                        n5 = 1;
                    }
                    n4 = n5;
                }
                int n12 = n4;
                if (arrstring != null) {
                    if (n12 == 0) continue;
                    arrayList.add(g10);
                    n12 = 0;
                }
                n3 = n12;
                g10 = new g("");
                if (arrstring != null) continue;
            }
            bl4 = arrayList.add(g10);
        }
        return arrayList;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string, boolean bl2) {
        String string2;
        block5: {
            boolean bl3;
            block4: {
                String[] arrstring = q.b();
                bl3 = bl2;
                if (arrstring == null) break block4;
                if (bl3) break block5;
                bl3 = Q.P().ac.b1;
            }
            if (!bl3) {
                string2 = l.c(string);
                return string2;
            }
        }
        string2 = string;
        return string2;
    }
}

