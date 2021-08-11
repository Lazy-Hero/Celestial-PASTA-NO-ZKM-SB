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
import java.util.List;
import java.util.Random;
import net.minecraft.aj.d;
import net.minecraft.aj.i;
import net.minecraft.aj.k;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;

public class g
extends d {
    protected final /* synthetic */ v d;

    public g(v v2, int n2, int n3, net.minecraft.g.d[] arrd) {
        super(n2, n3, arrd);
        this.d = v2;
    }

    public static g a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n2, int n3, net.minecraft.g.d[] arrd) {
        v v2 = new v(aG.f(jsonObject, "name"));
        return new g(v2, n2, n3, arrd);
    }

    @Override
    protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("name", this.d.toString());
    }

    @Override
    public void a(Collection<net.minecraft.w.d> collection, Random random, k k2) {
        i i2 = k2.c().a(this.d);
        List<net.minecraft.w.d> list = i2.a(random, k2);
        collection.addAll(list);
    }
}

