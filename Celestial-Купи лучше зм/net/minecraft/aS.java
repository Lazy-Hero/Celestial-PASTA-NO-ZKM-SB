/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.aC;
import net.minecraft.aG;
import net.minecraft.aT;

public class aS
implements Comparable<aS> {
    private final /* synthetic */ Map<String, aC> b;
    private /* synthetic */ String[][] a;

    public Iterable<String> c() {
        ArrayList arrayList = Lists.newArrayList();
        Iterator<Map.Entry<String, aC>> iterator = this.b.entrySet().iterator();
        boolean bl2 = aG.a();
        while (iterator.hasNext()) {
            Map.Entry<String, aC> entry = iterator.next();
            boolean bl3 = entry.getValue().c();
            if (!bl2 && bl3) {
                bl3 = arrayList.add(entry.getKey());
            }
            if (!bl2) continue;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string) {
        aC aC2 = this.b.get(string);
        boolean bl2 = aG.a();
        aC aC3 = aC2;
        if (!bl2) {
            if (aC3 == null) return false;
            aC3 = aC2;
        }
        boolean bl3 = aC3.c();
        if (bl2) return bl3;
        if (!bl3) return false;
        aC2.e();
        return true;
    }

    public boolean h() {
        boolean bl2;
        block3: {
            Iterator<aC> iterator = this.b.values().iterator();
            boolean bl3 = aG.a();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl4;
                    block4: {
                        aC aC2 = iterator.next();
                        bl2 = aC2.c();
                        if (bl3) break block3;
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        bl4 = true;
                    }
                    return bl4;
                }
                if (!bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void a(Map<String, aT> map, String[][] arrstring) {
        block9: {
            aS aS2;
            Set<String> set;
            boolean bl2;
            block8: {
                Set<String> set2 = map.keySet();
                Iterator<Map.Entry<String, aC>> iterator = this.b.entrySet().iterator();
                bl2 = aG.a();
                while (iterator.hasNext()) {
                    Map.Entry<String, aC> entry = iterator.next();
                    set = set2;
                    if (!bl2) {
                        if (!set.contains(entry.getKey())) {
                            iterator.remove();
                        }
                        if (!bl2) continue;
                    }
                    break block8;
                }
                set = set2;
            }
            for (String string : set) {
                block11: {
                    String string2;
                    Map<String, aC> map2;
                    block10: {
                        aS2 = this;
                        if (bl2) break block9;
                        map2 = aS2.b;
                        string2 = string;
                        if (bl2) break block10;
                        if (map2.containsKey(string2)) break block11;
                        map2 = this.b;
                        string2 = string;
                    }
                    map2.put(string2, new aC(this));
                }
                if (!bl2) continue;
            }
            aS2 = this;
        }
        aS2.a = arrstring;
    }

    private int g() {
        int n2;
        block6: {
            int n3 = 0;
            String[][] arrstring = this.a;
            int n4 = arrstring.length;
            int n5 = 0;
            boolean bl2 = aG.b();
            while (n5 < n4) {
                block7: {
                    String[] arrstring2 = arrstring[n5];
                    boolean bl3 = false;
                    String[] arrstring3 = arrstring2;
                    int n6 = arrstring3.length;
                    n2 = 0;
                    if (!bl2) break block6;
                    int n7 = n2;
                    while (n7 < n6) {
                        block8: {
                            block9: {
                                block10: {
                                    String string = arrstring3[n7];
                                    aC aC2 = this.c(string);
                                    if (!bl2) break block7;
                                    if (!bl2) break block8;
                                    if (aC2 == null) break block9;
                                    boolean bl4 = aC2.c();
                                    if (!bl2) break block10;
                                    if (!bl4) break block9;
                                    bl4 = bl3 = true;
                                }
                                if (bl2) break;
                            }
                            ++n7;
                        }
                        if (bl2) continue;
                    }
                    if (bl3) {
                        ++n3;
                    }
                    ++n5;
                }
                if (bl2) continue;
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(String string) {
        aC aC2 = this.b.get(string);
        boolean bl2 = aG.a();
        aC aC3 = aC2;
        if (!bl2) {
            if (aC3 == null) return false;
            aC3 = aC2;
        }
        boolean bl3 = aC3.c();
        if (bl2) return bl3;
        if (bl3) return false;
        aC2.a();
        return true;
    }

    @Nullable
    public aC c(String string) {
        return this.b.get(string);
    }

    @Nullable
    public String f() {
        int n2;
        boolean bl2 = aG.b();
        int n3 = this.b.isEmpty();
        if (bl2) {
            if (n3 != 0) {
                return null;
            }
            n3 = this.a.length;
        }
        int n4 = n2 = n3;
        if (bl2) {
            if (n4 <= 1) {
                return null;
            }
            n4 = this.g();
        }
        int n5 = n4;
        return n5 + "/" + n2;
    }

    public aS() {
        this.b = Maps.newHashMap();
        this.a = new String[0][];
    }

    @Nullable
    public Date e() {
        Date date = null;
        Iterator<aC> iterator = this.b.values().iterator();
        boolean bl2 = aG.b();
        while (iterator.hasNext()) {
            block3: {
                Date date2;
                aC aC2;
                block4: {
                    aC2 = iterator.next();
                    if (!aC2.c()) break block3;
                    date2 = date;
                    if (!bl2) break block3;
                    if (date2 == null) break block4;
                    date2 = aC2.d();
                    if (!bl2 || !date2.before(date)) break block3;
                }
                date2 = date = aC2.d();
            }
            if (bl2) continue;
        }
        return date;
    }

    public Iterable<String> b() {
        ArrayList arrayList = Lists.newArrayList();
        boolean bl2 = aG.a();
        for (Map.Entry<String, aC> entry : this.b.entrySet()) {
            boolean bl3 = entry.getValue().c();
            if (!bl2 && !bl3) {
                bl3 = arrayList.add(entry.getKey());
            }
            if (!bl2) continue;
        }
        return arrayList;
    }

    public float a() {
        boolean bl2 = aG.b();
        int n2 = this.b.isEmpty();
        if (bl2) {
            if (n2 != 0) {
                return 0.0f;
            }
            n2 = this.a.length;
        }
        float f10 = n2;
        float f11 = this.g();
        return f11 / f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static Map b(aS aS2) {
        return aS2.b;
    }

    public static aS b(m m2) {
        aS aS2;
        block2: {
            aS aS3 = new aS();
            int n2 = m2.a();
            boolean bl2 = aG.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                aS2 = aS3;
                if (bl2) {
                    aS2.b.put(m2.c(32767), aC.a(m2, aS3));
                    if (bl2) continue;
                }
                break block2;
            }
            aS2 = aS3;
        }
        return aS2;
    }

    public boolean d() {
        int n2;
        block10: {
            boolean bl2 = aG.b();
            String[][] arrstring = this.a;
            if (bl2) {
                if (arrstring.length == 0) {
                    return false;
                }
                arrstring = this.a;
            }
            String[][] arrstring2 = arrstring;
            int n3 = arrstring2.length;
            int n4 = 0;
            while (n4 < n3) {
                block11: {
                    block16: {
                        boolean bl3;
                        block15: {
                            String[] arrstring3 = arrstring2[n4];
                            boolean bl4 = false;
                            String[] arrstring4 = arrstring3;
                            int n5 = arrstring4.length;
                            n2 = 0;
                            if (!bl2) break block10;
                            int n6 = n2;
                            while (n6 < n5) {
                                block12: {
                                    block13: {
                                        block14: {
                                            String string = arrstring4[n6];
                                            aC aC2 = this.c(string);
                                            if (!bl2) break block11;
                                            if (!bl2) break block12;
                                            if (aC2 == null) break block13;
                                            boolean bl5 = aC2.c();
                                            if (!bl2) break block14;
                                            if (!bl5) break block13;
                                            bl5 = bl4 = true;
                                        }
                                        if (bl2) break;
                                    }
                                    ++n6;
                                }
                                if (bl2) continue;
                            }
                            bl3 = bl4;
                            if (!bl2) break block15;
                            if (bl3) break block16;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    ++n4;
                }
                if (bl2) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(aS var1_1) {
        var3_2 = this.e();
        var4_3 = var1_1.e();
        var2_4 = aG.a();
        v0 = var3_2;
        if (!var2_4) {
            if (v0 == null) {
                v0 = var4_3;
                if (!var2_4) {
                    if (v0 != null) {
                        return 1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_2;
            }
        }
        if (!var2_4) {
            if (v0 != null) {
                v0 = var4_3;
                if (!var2_4) {
                    if (v0 == null) {
                        return -1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_2;
            }
        }
        if (!var2_4) {
            if (v0 == null) {
                v0 = var4_3;
                if (!var2_4) {
                    if (v0 == null) {
                        return 0;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_2;
            }
        }
        v1 = v0.compareTo(var4_3);
        return v1;
    }

    public String toString() {
        return "AdvancementProgress{criteria=" + this.b + ", requirements=" + Arrays.deepToString((Object[])this.a) + '}';
    }

    public void a(m m2) {
        boolean bl2 = aG.a();
        m2.d(this.b.size());
        boolean bl3 = bl2;
        for (Map.Entry<String, aC> entry : this.b.entrySet()) {
            m2.a(entry.getKey());
            entry.getValue().a(m2);
            if (!bl3) continue;
        }
    }
}

