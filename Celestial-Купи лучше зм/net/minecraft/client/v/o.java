/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 */
package net.minecraft.client.v;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.ar.S;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.m;
import net.minecraft.b.b;
import net.minecraft.client.v.a;
import net.minecraft.client.v.g;
import net.minecraft.client.v.l;
import net.minecraft.client.v.n;

public class o {
    private /* synthetic */ Gson c;
    private final /* synthetic */ net.minecraft.b.a<String, g<? extends l>> b;
    private final /* synthetic */ GsonBuilder a;

    public <T extends l> void a(n<T> n2, Class<T> class_) {
        this.b.a(n2.a(), new g(this, n2, class_, null));
        this.a.registerTypeAdapter(class_, n2);
        this.c = null;
    }

    private Gson a() {
        String string = net.minecraft.client.v.a.b();
        Gson gson = this.c;
        if (string == null) {
            if (gson == null) {
                this.c = this.a.create();
            }
            gson = this.c;
        }
        return gson;
    }

    public <T extends l> T a(String string, JsonObject jsonObject) {
        Object object;
        String string2;
        block9: {
            boolean bl2;
            block8: {
                string2 = net.minecraft.client.v.a.b();
                if (string == null) {
                    throw new IllegalArgumentException("Metadata section name cannot be null");
                }
                bl2 = jsonObject.has(string);
                if (string2 != null) break block8;
                if (!bl2) {
                    return null;
                }
                object = jsonObject.get(string);
                if (string2 != null) break block9;
                bl2 = object.isJsonObject();
            }
            if (!bl2) {
                throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + (Object)jsonObject.get(string));
            }
            object = this.b.a(string);
        }
        g g10 = (g)object;
        Object object2 = g10;
        if (string2 == null) {
            if (object2 == null) {
                throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
            }
            object2 = this.a().fromJson((JsonElement)jsonObject.getAsJsonObject(string), g10.a);
        }
        return (T)((l)object2);
    }

    public o() {
        this.b = new b<String, g<? extends l>>();
        this.a = new GsonBuilder();
        this.a.registerTypeHierarchyAdapter(k.class, (Object)new net.minecraft.at.o());
        this.a.registerTypeHierarchyAdapter(i.class, (Object)new m());
        this.a.registerTypeAdapterFactory((TypeAdapterFactory)new S());
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

