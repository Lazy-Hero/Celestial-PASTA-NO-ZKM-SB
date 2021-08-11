/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.m;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.ar.v;
import net.minecraft.g.d;
import net.minecraft.m.m;

public abstract class c<T extends m> {
    private final /* synthetic */ v b;
    private final /* synthetic */ Class<T> a;

    public v a() {
        return this.b;
    }

    public abstract T a(JsonObject var1, JsonDeserializationContext var2, d[] var3);

    public Class<T> b() {
        return this.a;
    }

    protected c(v v2, Class<T> class_) {
        this.b = v2;
        this.a = class_;
    }

    public abstract void a(JsonObject var1, T var2, JsonSerializationContext var3);
}

