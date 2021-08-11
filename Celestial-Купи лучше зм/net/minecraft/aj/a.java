/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package net.minecraft.aj;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import net.minecraft.aj.t;

public class a
extends TypeAdapter<t> {
    public void a(JsonWriter jsonWriter, t t2) throws IOException {
        jsonWriter.value(t.a(t2));
    }

    public t a(JsonReader jsonReader) throws IOException {
        return t.a(jsonReader.nextString());
    }
}

