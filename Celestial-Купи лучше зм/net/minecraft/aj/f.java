/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.aj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;
import net.minecraft.aj.d;
import net.minecraft.aj.j;
import net.minecraft.aj.k;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.b;
import net.minecraft.k.m;

public class f
extends d {
    protected final /* synthetic */ net.minecraft.w.k e;
    protected final /* synthetic */ net.minecraft.m.m[] d;

    @Override
    public void a(Collection<net.minecraft.w.d> collection, Random random, k k2) {
        block11: {
            int n2;
            m[] arrm;
            net.minecraft.w.d d10;
            block12: {
                int n3;
                block13: {
                    block10: {
                        block9: {
                            d10 = new net.minecraft.w.d(this.e);
                            net.minecraft.m.m[] arrm2 = this.d;
                            int n4 = arrm2.length;
                            int n5 = 0;
                            arrm = j.b();
                            while (n5 < n4) {
                                net.minecraft.m.m m2 = arrm2[n5];
                                if (arrm != null) {
                                    n3 = net.minecraft.g.b.a(m2.c(), random, k2) ? 1 : 0;
                                    if (arrm == null) break block9;
                                    if (n3 != 0) {
                                        d10 = m2.a(d10, random, k2);
                                    }
                                    ++n5;
                                }
                                if (arrm != null) continue;
                            }
                            n3 = d10.G();
                        }
                        if (arrm == null) break block10;
                        if (n3 != 0) break block11;
                        n3 = d10.t();
                    }
                    if (arrm == null) break block12;
                    if (n3 >= this.e.a()) break block13;
                    collection.add(d10);
                    if (arrm != null) break block11;
                }
                n3 = n2 = d10.t();
            }
            while (n2 > 0) {
                net.minecraft.w.d d11 = d10.C();
                d11.c(Math.min(d10.f(), n2));
                n2 -= d11.t();
                collection.add(d11);
                if (arrm != null) continue;
            }
        }
    }

    @Override
    protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        Object object;
        m[] arrm;
        block6: {
            block7: {
                arrm = j.b();
                object = this.d;
                if (arrm == null) break block6;
                if (object == null) break block7;
                object = this.d;
                if (arrm == null) break block6;
                if (((net.minecraft.m.m[])object).length > 0) {
                    jsonObject.add("functions", jsonSerializationContext.serialize((Object)this.d));
                }
            }
            object = net.minecraft.w.k.q.b(this.e);
        }
        v v2 = (v)object;
        if (arrm != null) {
            if (v2 == null) {
                throw new IllegalArgumentException("Can't serialize unknown item " + this.e);
            }
            jsonObject.addProperty("name", v2.toString());
        }
    }

    public static f a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n2, int n3, net.minecraft.g.d[] arrd) {
        net.minecraft.m.m[] arrm;
        net.minecraft.w.k k2;
        block4: {
            int n4;
            block2: {
                block3: {
                    k2 = aG.b(jsonObject, "name");
                    m[] arrm2 = j.b();
                    n4 = jsonObject.has("functions");
                    if (arrm2 == null) break block2;
                    if (n4 == 0) break block3;
                    arrm = aG.a(jsonObject, "functions", jsonDeserializationContext, net.minecraft.m.m[].class);
                    if (arrm2 != null) break block4;
                }
                n4 = 0;
            }
            arrm = new net.minecraft.m.m[n4];
        }
        return new f(k2, n2, n3, arrm, arrd);
    }

    public f(net.minecraft.w.k k2, int n2, int n3, net.minecraft.m.m[] arrm, net.minecraft.g.d[] arrd) {
        super(n2, n3, arrd);
        this.e = k2;
        this.d = arrm;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

