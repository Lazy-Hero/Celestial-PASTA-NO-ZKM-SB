/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.L;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import net.minecraft.L.b;
import net.minecraft.ar.v;

public abstract class d<T extends b> {
    private final /* synthetic */ v d;
    private static /* synthetic */ boolean b;
    private final /* synthetic */ Class<T> c;

    public abstract JsonElement a(T var1, JsonSerializationContext var2);

    public v b() {
        return this.d;
    }

    protected d(v v2, Class<T> class_) {
        this.d = v2;
        this.c = class_;
    }

    public abstract T a(JsonElement var1, JsonDeserializationContext var2);

    public Class<T> d() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean c() {
        return b;
    }

    public static boolean a() {
        boolean bl2 = net.minecraft.L.d.c();
        return !bl2;
    }

    static {
        if (net.minecraft.L.d.c()) {
            net.minecraft.L.d.b(true);
        }
    }

    public static void b(boolean bl2) {
        b = bl2;
    }
}

