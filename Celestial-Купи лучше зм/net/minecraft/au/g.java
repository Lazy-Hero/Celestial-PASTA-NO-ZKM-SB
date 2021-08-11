/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.au;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.Z.f;
import net.minecraft.au.d;
import net.minecraft.au.h;
import net.minecraft.k.m;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class g {
    private static final /* synthetic */ Joiner e;
    private /* synthetic */ int d;
    private final /* synthetic */ Map<Character, Predicate<f>> c;
    private final /* synthetic */ List<String[]> a;
    private /* synthetic */ int b;

    private Predicate<f>[][][] d() {
        int n2 = h.g();
        this.c();
        int n3 = n2;
        Predicate[][][] arrpredicate = (Predicate[][][])Array.newInstance(Predicate.class, this.a.size(), this.d, this.b);
        int n4 = 0;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 < this.a.size()) {
                int n6 = 0;
                while (n6 < this.d) {
                    block5: {
                        n5 = 0;
                        if (n3 != 0) continue block1;
                        for (int i2 = v2014457; i2 < this.b; ++i2) {
                            arrpredicate[n4][n6][i2] = this.c.get(Character.valueOf(this.a.get(n4)[n6].charAt(i2)));
                            if (n3 == 0) {
                                if (n3 == 0) continue;
                            }
                            break block5;
                        }
                        ++n6;
                    }
                    if (n3 == 0) continue;
                }
                ++n4;
                if (n3 == 0) continue block0;
            }
            break;
        }
        return arrpredicate;
    }

    private void c() {
        block4: {
            ArrayList arrayList = Lists.newArrayList();
            int n2 = h.g();
            for (Map.Entry<Character, Predicate<f>> entry : this.c.entrySet()) {
                if (n2 == 0) {
                    if (entry.getValue() == null) {
                        arrayList.add(entry.getKey());
                    }
                    if (n2 == 0) continue;
                }
                break block4;
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalStateException("Predicates for character(s) " + e.join((Iterable)arrayList) + " are missing");
            }
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public g a(char c10, Predicate<f> predicate) {
        this.c.put(Character.valueOf(c10), predicate);
        return this;
    }

    public g a(String ... arrstring) {
        block16: {
            int n2;
            block14: {
                int n3;
                String[] arrstring2;
                block19: {
                    int n4;
                    block18: {
                        block17: {
                            block15: {
                                n2 = h.g();
                                n4 = ArrayUtils.isEmpty((Object[])arrstring);
                                if (n2 != 0) break block15;
                                if (n4 != 0) break block16;
                                n4 = StringUtils.isEmpty((CharSequence)arrstring[0]);
                            }
                            if (n2 != 0) break block17;
                            if (n4 != 0) break block16;
                            n4 = this.a.isEmpty();
                        }
                        if (n2 != 0) break block18;
                        if (n4 != 0) {
                            this.d = arrstring.length;
                            this.b = arrstring[0].length();
                        }
                        arrstring2 = arrstring;
                        if (n2 != 0) break block19;
                        n4 = arrstring2.length;
                    }
                    if (n4 != this.d) {
                        throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + arrstring.length + ")");
                    }
                    arrstring2 = arrstring;
                }
                String[] arrstring3 = arrstring2;
                int n5 = arrstring3.length;
                int n6 = 0;
                block0: while (true) {
                    int n7 = n6;
                    block1: while (n7 < n5) {
                        String string;
                        String string2 = string = arrstring3[n6];
                        if (n2 == 0) {
                            n3 = string2.length();
                            if (n2 != 0) break block14;
                            if (n3 != this.b) {
                                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.b + ", found one with " + string.length() + ")");
                            }
                            string2 = string;
                        }
                        char[] arrc = string2.toCharArray();
                        int n8 = arrc.length;
                        int n9 = 0;
                        while (n9 < n8) {
                            char c10 = arrc[n9];
                            if (n2 == 0) {
                                n7 = this.c.containsKey(Character.valueOf(c10)) ? 1 : 0;
                                if (n2 != 0) continue block1;
                                if (n7 == 0) {
                                    this.c.put(Character.valueOf(c10), null);
                                }
                                ++n9;
                            }
                            if (n2 == 0) continue;
                        }
                        ++n6;
                        if (n2 == 0) continue block0;
                    }
                    break;
                }
                n3 = this.a.add(arrstring);
            }
            if (m.c()) {
                h.b(++n2);
            }
            return this;
        }
        throw new IllegalArgumentException("Empty pattern for aisle");
    }

    public static g b() {
        return new g();
    }

    static {
        e = Joiner.on((String)",");
    }

    public d a() {
        return new d(this.d());
    }

    private g() {
        this.a = Lists.newArrayList();
        this.c = Maps.newHashMap();
        this.c.put(Character.valueOf(' '), (Predicate<f>)Predicates.alwaysTrue());
    }
}

