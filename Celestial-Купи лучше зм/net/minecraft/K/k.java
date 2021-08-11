/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.K;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.K.b;
import net.minecraft.K.i;
import net.minecraft.K.j;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.at.l;
import net.minecraft.j.c;
import net.minecraft.j.f;
import net.minecraft.u.a;
import net.minecraft.w.d;

public class k {
    public static List<j> c(d d10) {
        return k.c(d10.v());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static d a(d d10, Collection<j> collection) {
        block4: {
            int[] arrn = j.b();
            Object object = collection;
            if (arrn == null) {
                if (object.isEmpty()) {
                    return d10;
                }
                object = MoreObjects.firstNonNull((Object)d10.v(), (Object)new r());
            }
            r r2 = (r)object;
            u u2 = r2.c("CustomPotionEffects", 9);
            for (j j2 : collection) {
                u2.a(j2.b(new r()));
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block4;
            }
            r2.a("CustomPotionEffects", u2);
            d10.b(r2);
        }
        return d10;
    }

    public static i d(d d10) {
        return k.a(d10.v());
    }

    public static void a(@Nullable r r2, List<j> list) {
        block7: {
            int n2;
            String string;
            r r3;
            int[] arrn;
            block8: {
                block6: {
                    arrn = j.b();
                    r3 = r2;
                    if (arrn != null) break block6;
                    if (r3 == null) break block7;
                    r3 = r2;
                }
                string = "CustomPotionEffects";
                n2 = 9;
                if (arrn != null) break block8;
                if (!r3.a(string, n2)) break block7;
                r3 = r2;
                string = "CustomPotionEffects";
                n2 = 10;
            }
            u u2 = r3.c(string, n2);
            int n3 = 0;
            while (n3 < u2.b()) {
                r r4 = u2.d(n3);
                j j2 = j.a(r4);
                if (arrn == null) {
                    if (j2 != null) {
                        list.add(j2);
                    }
                    ++n3;
                }
                if (arrn == null) continue;
            }
        }
    }

    public static List<j> a(i i2, Collection<j> collection) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(i2.a());
        arrayList.addAll(collection);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static d a(d var0, i var1_1) {
        block4: {
            block3: {
                var3_2 = i.d.b(var1_1);
                var2_3 = j.b();
                if (var1_1 != a.l) break block3;
                v0 = var0;
                if (var2_3 != null) return v0;
                if (!v0.x()) break block4;
                var4_4 = var0.v();
                var4_4.k("Potion");
                if (var4_4.c()) {
                    var0.b((r)null);
                }
                if (var2_3 == null) break block4;
            }
            v1 = var0;
            if (var2_3 != null) ** GOTO lbl17
            if (v1.x()) {
                v1 = var0;
lbl17:
                // 2 sources

                v2 = v1.v();
            } else {
                v2 = new r();
            }
            var4_4 = v2;
            var4_4.a("Potion", var3_2.toString());
            var0.b(var4_4);
        }
        v0 = var0;
        return v0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(i i2) {
        int[] arrn = j.b();
        i i3 = i2;
        if (arrn == null) {
            if (i3 == a.l) {
                return 0xF800F8;
            }
            i3 = i2;
        }
        int n2 = k.a(i3.a());
        return n2;
    }

    public static List<j> b(@Nullable r r2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(k.a(r2).a());
        k.a(r2, arrayList);
        return arrayList;
    }

    public static List<j> c(@Nullable r r2) {
        ArrayList arrayList = Lists.newArrayList();
        k.a(r2, arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static i a(@Nullable r r2) {
        i i2;
        int[] arrn = j.b();
        r r3 = r2;
        if (arrn == null) {
            if (r3 == null) {
                i2 = a.l;
                return i2;
            }
            r3 = r2;
        }
        i2 = i.a(r3.j("Potion"));
        return i2;
    }

    public static int a(Collection<j> collection) {
        int n2;
        int n3;
        float f10;
        float f11;
        float f12;
        int[] arrn;
        block12: {
            block14: {
                int n4;
                int n5;
                block13: {
                    n5 = 3694022;
                    arrn = j.b();
                    n4 = collection.isEmpty();
                    if (arrn != null) break block13;
                    if (n4 == 0) break block14;
                    n4 = fU.g();
                }
                if (arrn == null) {
                    n4 = n4 != 0 ? fa.a(null, n5) : 3694022;
                }
                return n4;
            }
            f12 = 0.0f;
            f11 = 0.0f;
            f10 = 0.0f;
            n3 = 0;
            for (j j2 : collection) {
                block16: {
                    int n5;
                    block15: {
                        n2 = j2.f() ? 1 : 0;
                        if (arrn != null) break block12;
                        if (arrn != null) break block15;
                        if (n2 == 0) break block16;
                        n5 = j2.g().b();
                    }
                    int n7 = n5;
                    int n6 = fU.g();
                    if (arrn == null) {
                        if (n6 != 0) {
                            n7 = fa.a(j2.g(), n7);
                        }
                        n6 = j2.h() + 1;
                    }
                    int n9 = n6;
                    f12 += (float)(n9 * (n7 >> 16 & 0xFF)) / 255.0f;
                    f11 += (float)(n9 * (n7 >> 8 & 0xFF)) / 255.0f;
                    f10 += (float)(n9 * (n7 >> 0 & 0xFF)) / 255.0f;
                    n3 += n9;
                }
                if (arrn == null) continue;
            }
            n2 = n3;
        }
        if (arrn == null) {
            if (n2 == 0) {
                return 0;
            }
            f12 = f12 / (float)n3 * 255.0f;
            f11 = f11 / (float)n3 * 255.0f;
            f10 = f10 / (float)n3 * 255.0f;
            n2 = (int)f12 << 16 | (int)f11 << 8 | (int)f10;
        }
        return n2;
    }

    public static void a(d d10, List<String> list, float f10) {
        block39: {
            Object object;
            ArrayList arrayList;
            int[] arrn;
            block38: {
                boolean bl2;
                block30: {
                    block34: {
                        List<j> list2;
                        block32: {
                            List<j> list3;
                            block33: {
                                list3 = k.a(d10);
                                arrn = j.b();
                                arrayList = Lists.newArrayList();
                                list2 = list3;
                                if (arrn != null) break block32;
                                if (!list2.isEmpty()) break block33;
                                Iterator iterator = net.minecraft.ab.a.a("effect.none").trim();
                                list.add("" + (Object)((Object)l.GRAY) + iterator);
                                if (arrn == null) break block34;
                            }
                            list2 = list3;
                        }
                        for (j object2 : list2) {
                            block36: {
                                int n2;
                                block37: {
                                    b b10;
                                    block35: {
                                        block31: {
                                            object = net.minecraft.ab.a.a(object2.j()).trim();
                                            b10 = object2.g();
                                            Map<c, f> map = b10.e();
                                            bl2 = map.isEmpty();
                                            if (arrn != null) break block30;
                                            if (arrn == null) {
                                                if (!bl2) {
                                                    for (Map.Entry<c, f> entry : map.entrySet()) {
                                                        f f11 = entry.getValue();
                                                        f f12 = new f(f11.d(), b10.a(object2.h(), f11), f11.e());
                                                        arrayList.add(new net.minecraft.ar.i<String, f>(entry.getKey().c(), f12));
                                                        if (arrn == null) {
                                                            if (arrn == null) continue;
                                                        }
                                                        break block31;
                                                    }
                                                }
                                                n2 = object2.h();
                                            }
                                            if (arrn != null) break block35;
                                            if (n2 > 0) {
                                                object = (String)object + " " + net.minecraft.ab.a.a("potion.potency." + object2.h()).trim();
                                            }
                                        }
                                        n2 = object2.e();
                                    }
                                    if (arrn == null) {
                                        if (n2 > 20) {
                                            object = (String)object + " (" + b.a(object2, f10) + ")";
                                        }
                                        n2 = b10.a() ? 1 : 0;
                                    }
                                    if (arrn != null) break block36;
                                    if (n2 == 0) break block37;
                                    list.add((Object)((Object)l.RED) + (String)object);
                                    if (arrn == null) break block36;
                                }
                                n2 = list.add((Object)((Object)l.BLUE) + (String)object) ? 1 : 0;
                            }
                            if (arrn == null) continue;
                        }
                    }
                    bl2 = arrayList.isEmpty();
                }
                if (arrn != null) break block38;
                if (bl2) break block39;
                list.add("");
                bl2 = list.add((Object)((Object)l.DARK_PURPLE) + net.minecraft.ab.a.a("potion.whenDrank"));
            }
            for (net.minecraft.ar.i i2 : arrayList) {
                block45: {
                    double d11;
                    block43: {
                        double d12;
                        double d13;
                        block44: {
                            double d14;
                            double d15;
                            block42: {
                                Object object2;
                                block40: {
                                    block41: {
                                        object = (f)i2.b();
                                        d13 = ((f)object).f();
                                        object2 = object;
                                        if (arrn != null) break block40;
                                        if (((f)object2).e() == 1) break block41;
                                        object2 = object;
                                        if (arrn != null) break block40;
                                        if (((f)object2).e() == 2) break block41;
                                        d15 = ((f)object).f();
                                        if (arrn == null) break block42;
                                    }
                                    object2 = object;
                                }
                                d15 = ((f)object2).f() * 100.0;
                            }
                            d11 = (d14 = d13 - 0.0) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            if (arrn != null) break block43;
                            if (d11 <= 0) break block44;
                            list.add((Object)((Object)l.BLUE) + net.minecraft.ab.a.a("attribute.modifier.plus." + ((f)object).e(), d.h.format(d15), net.minecraft.ab.a.a("attribute.name." + (String)i2.a())));
                            if (arrn == null) break block45;
                        }
                        d11 = (d12 = d13 - 0.0) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (arrn == null && d11 < 0) {
                        d11 = (double)list.add((Object)((Object)l.RED) + net.minecraft.ab.a.a("attribute.modifier.take." + ((f)object).e(), d.h.format(d15 *= -1.0), net.minecraft.ab.a.a("attribute.name." + (String)i2.a())));
                    }
                }
                if (arrn == null) continue;
            }
        }
    }

    public static List<j> a(d d10) {
        return k.b(d10.v());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(d d10) {
        int[] arrn;
        block7: {
            r r2;
            r r3;
            block6: {
                r3 = d10.v();
                arrn = j.b();
                r2 = r3;
                if (arrn != null) break block6;
                if (r2 == null) break block7;
                r2 = r3;
            }
            int n2 = r2.a("CustomPotionColor", 99);
            if (arrn != null) return n2;
            if (n2 != 0) {
                n2 = r3.m("CustomPotionColor");
                return n2;
            }
        }
        d d11 = d10;
        if (arrn == null) {
            if (k.d(d11) == a.l) {
                return 0xF800F8;
            }
            d11 = d10;
        }
        int n3 = k.a(k.a(d11));
        return n3;
    }
}

