/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.E.e;
import net.minecraft.E.i;
import net.minecraft.E.s;
import net.minecraft.aZ;
import net.minecraft.k.m;

public class g {
    private final /* synthetic */ i[] a;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public i[] a() {
        return this.a;
    }

    public static g a(aZ aZ2, List<String> list) {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        m[] arrm = s.b();
        for (String string : list) {
            block8: {
                boolean bl2;
                block10: {
                    String string2;
                    block12: {
                        int n2;
                        block11: {
                            String string3;
                            block9: {
                                boolean bl3;
                                block7: {
                                    string = string.trim();
                                    bl3 = string.startsWith("#");
                                    if (arrm == null) break block7;
                                    if (bl3) break block8;
                                    string3 = string;
                                    if (arrm == null) break block9;
                                    bl3 = string3.isEmpty();
                                }
                                if (bl3) break block8;
                                string3 = string;
                            }
                            String[] arrstring = string3.split(" ", 2);
                            string2 = arrstring[0];
                            bl2 = aZ2.c().a().containsKey(string2);
                            if (arrm == null) break block8;
                            if (bl2) break block10;
                            n2 = string2.startsWith("//");
                            if (arrm != null) {
                                if (n2 != 0) {
                                    throw new IllegalArgumentException("Unknown or invalid command '" + string2 + "' (if you intended to make a comment, use '#' not '//')");
                                }
                                n2 = string2.startsWith("/");
                            }
                            if (arrm == null) break block11;
                            if (n2 == 0) break block12;
                            n2 = string2.length();
                        }
                        if (n2 > 1) {
                            throw new IllegalArgumentException("Unknown or invalid command '" + string2 + "' (did you mean '" + string2.substring(1) + "'? Do not use a preceding forwards slash.)");
                        }
                    }
                    throw new IllegalArgumentException("Unknown or invalid command '" + string2 + "'");
                }
                bl2 = arrayList.add(new e(string));
            }
            if (arrm != null) continue;
        }
        return new g(arrayList.toArray(new i[arrayList.size()]));
    }

    public g(i[] arri) {
        this.a = arri;
    }
}

