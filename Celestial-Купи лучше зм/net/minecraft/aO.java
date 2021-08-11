/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package net.minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aR;
import net.minecraft.ar.v;

public interface aO<T extends aR> {
    public void b(a4 var1, aG<T> var2);

    public void a(a4 var1, aG<T> var2);

    public void a(a4 var1);

    public v a();

    public T a(JsonObject var1, JsonDeserializationContext var2);
}

