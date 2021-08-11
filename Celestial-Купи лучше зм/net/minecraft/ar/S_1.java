/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;
import net.minecraft.ar.E;
import net.minecraft.ar.v;

public class S
implements TypeAdapterFactory {
    /*
     * Enabled aggressive block sorting
     */
    private String a(Object object) {
        String string;
        int n2 = v.b();
        Object object2 = object;
        if (n2 == 0) {
            if (object2 instanceof Enum) {
                string = ((Enum)object).name().toLowerCase(Locale.ROOT);
                return string;
            }
            object2 = object;
        }
        string = object2.toString().toLowerCase(Locale.ROOT);
        return string;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static String a(S s2, Object object) {
        return s2.a(object);
    }

    @Nullable
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class class_ = typeToken.getRawType();
        int n2 = v.d();
        if (!class_.isEnum()) {
            return null;
        }
        HashMap hashMap = Maps.newHashMap();
        for (Object t2 : class_.getEnumConstants()) {
            hashMap.put(this.a(t2), t2);
            if (n2 != 0) continue;
        }
        return new E(this, hashMap);
    }
}

