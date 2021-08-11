/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.ar.v;
import net.minecraft.g.d;

public abstract class f<T extends d> {
    private final /* synthetic */ v c;
    private final /* synthetic */ Class<T> a;
    private static /* synthetic */ int[] b;

    public abstract T a(JsonObject var1, JsonDeserializationContext var2);

    static {
        if (f.b() == null) {
            f.b(new int[2]);
        }
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public v c() {
        return this.c;
    }

    public Class<T> d() {
        return this.a;
    }

    public abstract void a(JsonObject var1, T var2, JsonSerializationContext var3);

    public static int[] b() {
        return b;
    }

    protected f(v v2, Class<T> class_) {
        this.c = v2;
        this.a = class_;
    }
}

