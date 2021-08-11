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
import net.minecraft.aj.k;

public class e
extends d {
    @Override
    public void a(Collection<net.minecraft.w.d> collection, Random random, k k2) {
    }

    @Override
    protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
    }

    public static e a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n2, int n3, net.minecraft.g.d[] arrd) {
        return new e(n2, n3, arrd);
    }

    public e(int n2, int n3, net.minecraft.g.d[] arrd) {
        super(n2, n3, arrd);
    }
}

