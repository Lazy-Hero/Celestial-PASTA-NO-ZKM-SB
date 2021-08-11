/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.S;
import net.minecraft.ar.v;

class E
extends TypeAdapter<T> {
    final /* synthetic */ S a;
    final /* synthetic */ Map b;

    public void write(JsonWriter jsonWriter, T t2) throws IOException {
        block2: {
            block1: {
                int n2;
                block0: {
                    n2 = v.d();
                    if (n2 == 0) break block0;
                    if (t2 != null) break block1;
                    jsonWriter.nullValue();
                }
                if (n2 != 0) break block2;
            }
            jsonWriter.value(S.a(this.a, t2));
        }
    }

    E(S s2, Map map) {
        this.a = s2;
        this.b = map;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Nullable
    public T read(JsonReader jsonReader) throws IOException {
        int n2 = v.d();
        Object object = jsonReader.peek();
        if (n2 != 0) {
            if (object == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            object = this.b.get(jsonReader.nextString());
        }
        return object;
    }
}

