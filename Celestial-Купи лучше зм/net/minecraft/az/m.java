/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.az;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aG;
import net.minecraft.az.i;
import net.minecraft.az.k;
import net.minecraft.az.r;
import net.minecraft.w.d;

public class m
implements k {
    private final /* synthetic */ d c;
    private final /* synthetic */ a2<r> b;
    private final /* synthetic */ String a;

    public m(String string, d d10, a2<r> a22) {
        this.a = string;
        this.c = d10;
        this.b = a22;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), d.m);
        int n2 = 0;
        net.minecraft.k.m[] arrm = i.b();
        while (n2 < a22.size()) {
            d d10 = m2.a(n2);
            if (arrm == null) {
                if (d10.w().t()) {
                    a22.set(n2, new d(d10.w().s()));
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        int n2;
        block8: {
            ArrayList arrayList = Lists.newArrayList(this.b);
            net.minecraft.k.m[] arrm = i.b();
            int n3 = 0;
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 < m2.b()) {
                    n2 = 0;
                    if (arrm != null) break block8;
                    int n5 = n2;
                    while (n5 < m2.d()) {
                        block10: {
                            block11: {
                                boolean bl2;
                                block14: {
                                    block9: {
                                        d d10 = m2.b(n5, n3);
                                        if (arrm != null) break block10;
                                        n4 = d10.G() ? 1 : 0;
                                        if (arrm != null) continue block1;
                                        if (n4 != 0) break block11;
                                        boolean bl3 = false;
                                        for (r r2 : arrayList) {
                                            block13: {
                                                block12: {
                                                    bl2 = r2.a(d10);
                                                    if (arrm != null) break block9;
                                                    if (arrm != null) break block12;
                                                    if (!bl2) break block13;
                                                    bl3 = true;
                                                    arrayList.remove(r2);
                                                }
                                                if (arrm == null) break;
                                            }
                                            if (arrm == null) continue;
                                        }
                                        bl2 = bl3;
                                    }
                                    if (arrm != null) break block14;
                                    if (bl2) break block11;
                                    bl2 = false;
                                }
                                return bl2;
                            }
                            ++n5;
                        }
                        if (arrm == null) continue;
                    }
                    ++n3;
                    if (arrm == null) continue block0;
                }
                break;
            }
            n2 = arrayList.isEmpty();
        }
        return n2 != 0;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public static m a(JsonObject jsonObject) {
        String string = aG.a(jsonObject, "group", "");
        a2<r> a22 = m.a(aG.i(jsonObject, "ingredients"));
        net.minecraft.k.m[] arrm = i.b();
        int n2 = a22.isEmpty();
        if (arrm == null) {
            if (n2 != 0) {
                throw new JsonParseException("No ingredients for shapeless recipe");
            }
            n2 = a22.size();
        }
        if (n2 > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
        }
        d d10 = i.a(aG.l(jsonObject, "result"), true);
        return new m(string, d10, a22);
    }

    @Override
    public a2<r> c() {
        return this.b;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        return this.c.C();
    }

    @Override
    public boolean a(int n2, int n3) {
        net.minecraft.k.m[] arrm = i.b();
        int n4 = n2 * n3;
        if (arrm == null) {
            n4 = n4 >= this.b.size() ? 1 : 0;
        }
        return n4 != 0;
    }

    private static a2<r> a(JsonArray jsonArray) {
        a2<r> a22 = a2.a();
        net.minecraft.k.m[] arrm = i.b();
        int n2 = 0;
        while (n2 < jsonArray.size()) {
            r r2 = i.a(jsonArray.get(n2));
            if (arrm == null) {
                if (r2 != r.a) {
                    a22.add(r2);
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    @Override
    public d d() {
        return this.c;
    }
}

