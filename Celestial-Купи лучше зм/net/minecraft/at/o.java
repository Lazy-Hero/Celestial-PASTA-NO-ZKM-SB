/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 *  javax.annotation.Nullable
 */
package net.minecraft.at;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.S;
import net.minecraft.ar.aG;
import net.minecraft.at.c;
import net.minecraft.at.d;
import net.minecraft.at.e;
import net.minecraft.at.f;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.m;

public class o
implements JsonDeserializer<k>,
JsonSerializer<k> {
    private static final /* synthetic */ Gson a;

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private void a(i i2, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        block4: {
            JsonElement jsonElement;
            net.minecraft.k.m[] arrm;
            block3: {
                JsonElement jsonElement2 = jsonSerializationContext.serialize((Object)i2);
                arrm = c.b();
                jsonElement = jsonElement2;
                if (arrm != null) break block3;
                if (!jsonElement.isJsonObject()) break block4;
                jsonElement = jsonElement2;
            }
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
                if (arrm == null) continue;
            }
        }
    }

    public static String a(k k2) {
        return a.toJson((Object)k2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public k a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void var6_21;
        block47: {
            int n2;
            String string;
            JsonObject jsonObject;
            String string2;
            net.minecraft.k.m[] arrm;
            block46: {
                JsonObject jsonObject2;
                block34: {
                    boolean bl2;
                    block44: {
                        block45: {
                            block42: {
                                block43: {
                                    block35: {
                                        block36: {
                                            block41: {
                                                block38: {
                                                    String string3;
                                                    JsonObject jsonObject3;
                                                    block37: {
                                                        block32: {
                                                            block33: {
                                                                JsonElement jsonElement2;
                                                                block28: {
                                                                    block29: {
                                                                        void v3;
                                                                        void var6_8;
                                                                        boolean bl3;
                                                                        block27: {
                                                                            arrm = c.b();
                                                                            bl3 = jsonElement.isJsonPrimitive();
                                                                            if (arrm != null) break block27;
                                                                            if (bl3) {
                                                                                return new g(jsonElement.getAsString());
                                                                            }
                                                                            jsonElement2 = jsonElement;
                                                                            if (arrm != null) break block28;
                                                                            bl3 = jsonElement2.isJsonObject();
                                                                        }
                                                                        if (bl3) break block29;
                                                                        JsonElement jsonElement3 = jsonElement;
                                                                        if (arrm == null) {
                                                                            if (!jsonElement3.isJsonArray()) throw new JsonParseException("Don't know how to turn " + (Object)jsonElement + " into a Component");
                                                                            jsonElement3 = jsonElement;
                                                                        }
                                                                        JsonArray jsonArray = jsonElement3.getAsJsonArray();
                                                                        Object var6_7 = null;
                                                                        for (JsonElement jsonElement4 : jsonArray) {
                                                                            block30: {
                                                                                k k2;
                                                                                block31: {
                                                                                    k2 = this.a(jsonElement4, jsonElement4.getClass(), jsonDeserializationContext);
                                                                                    v3 = var6_8;
                                                                                    if (arrm != null) return v3;
                                                                                    if (arrm != null) break block30;
                                                                                    if (v3 != null) break block31;
                                                                                    k k3 = k2;
                                                                                    if (arrm == null) break block30;
                                                                                }
                                                                                var6_8.a(k2);
                                                                            }
                                                                            if (arrm == null) continue;
                                                                        }
                                                                        v3 = var6_8;
                                                                        return v3;
                                                                    }
                                                                    jsonElement2 = jsonElement;
                                                                }
                                                                jsonObject2 = jsonElement2.getAsJsonObject();
                                                                bl2 = jsonObject2.has("text");
                                                                if (arrm != null) break block32;
                                                                if (!bl2) break block33;
                                                                g g10 = new g(jsonObject2.get("text").getAsString());
                                                                if (arrm == null) break block34;
                                                            }
                                                            bl2 = jsonObject2.has("translate");
                                                        }
                                                        if (arrm != null) break block35;
                                                        if (!bl2) break block36;
                                                        string2 = jsonObject2.get("translate").getAsString();
                                                        jsonObject3 = jsonObject2;
                                                        string3 = "with";
                                                        if (arrm != null) break block37;
                                                        if (!jsonObject3.has(string3)) break block38;
                                                        jsonObject3 = jsonObject2;
                                                        string3 = "with";
                                                    }
                                                    JsonArray jsonArray = jsonObject3.getAsJsonArray(string3);
                                                    Object[] arrobject = new Object[jsonArray.size()];
                                                    int n3 = 0;
                                                    while (n3 < arrobject.length) {
                                                        block39: {
                                                            block40: {
                                                                arrobject[n3] = this.a(jsonArray.get(n3), type, jsonDeserializationContext);
                                                                if (arrm != null) break block39;
                                                                if (!(arrobject[n3] instanceof g)) break block40;
                                                                g g11 = (g)arrobject[n3];
                                                                if (arrm != null) break block39;
                                                                if (g11.e().b() && g11.c().isEmpty()) {
                                                                    arrobject[n3] = g11.c();
                                                                }
                                                            }
                                                            ++n3;
                                                        }
                                                        if (arrm == null) continue;
                                                    }
                                                    h h2 = new h(string2, arrobject);
                                                    if (arrm == null) break block41;
                                                }
                                                h h3 = new h(string2, new Object[0]);
                                            }
                                            if (arrm == null) break block34;
                                        }
                                        bl2 = jsonObject2.has("score");
                                    }
                                    if (arrm != null) break block42;
                                    if (!bl2) break block43;
                                    string2 = jsonObject2.getAsJsonObject("score");
                                    boolean bl4 = string2.has("name");
                                    if (arrm == null) {
                                        if (!bl4) throw new JsonParseException("A score component needs a least a name and an objective");
                                        bl4 = string2.has("objective");
                                    }
                                    if (!bl4) {
                                        throw new JsonParseException("A score component needs a least a name and an objective");
                                    }
                                    e e10 = new e(aG.f((JsonObject)string2, "name"), aG.f((JsonObject)string2, "objective"));
                                    if (string2.has("value")) {
                                        e10.a(aG.f((JsonObject)string2, "value"));
                                    }
                                    if (arrm == null) break block34;
                                }
                                bl2 = jsonObject2.has("selector");
                            }
                            if (arrm != null) break block44;
                            if (!bl2) break block45;
                            f f10 = new f(aG.f(jsonObject2, "selector"));
                            if (arrm == null) break block34;
                        }
                        bl2 = jsonObject2.has("keybind");
                    }
                    if (!bl2) {
                        throw new JsonParseException("Don't know how to turn " + (Object)jsonElement + " into a Component");
                    }
                    d d10 = new d(aG.f(jsonObject2, "keybind"));
                }
                jsonObject = jsonObject2;
                string = "extra";
                if (arrm != null) break block46;
                if (!jsonObject.has(string)) break block47;
                jsonObject = jsonObject2;
                string = "extra";
            }
            string2 = jsonObject.getAsJsonArray(string);
            int n4 = string2.size();
            if (arrm == null) {
                if (n4 <= 0) {
                    throw new JsonParseException("Unexpected empty array of components");
                }
                n4 = n2 = 0;
            }
            while (n2 < string2.size()) {
                var6_21.a(this.a(string2.get(n2), type, jsonDeserializationContext));
                ++n2;
                if (arrm != null) return var6_21;
                if (arrm == null) continue;
            }
        }
        var6_21.a((i)jsonDeserializationContext.deserialize(jsonElement, i.class));
        return var6_21;
    }

    public JsonElement a(k k2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block22: {
            k k3;
            Object object;
            block32: {
                boolean bl2;
                block30: {
                    net.minecraft.k.m[] arrm;
                    block31: {
                        block28: {
                            block29: {
                                JsonObject jsonObject2;
                                block23: {
                                    block24: {
                                        block19: {
                                            Object[] arrobject;
                                            block25: {
                                                block20: {
                                                    block21: {
                                                        jsonObject = new JsonObject();
                                                        arrm = c.b();
                                                        bl2 = k2.e().b();
                                                        if (arrm == null) {
                                                            if (!bl2) {
                                                                this.a(k2.e(), jsonObject, jsonSerializationContext);
                                                            }
                                                            bl2 = k2.c().isEmpty();
                                                        }
                                                        if (arrm == null) {
                                                            block18: {
                                                                if (!bl2) {
                                                                    object = new JsonArray();
                                                                    for (k arrobject2 : k2.c()) {
                                                                        object.add(this.a(arrobject2, arrobject2.getClass(), jsonSerializationContext));
                                                                        if (arrm == null) {
                                                                            if (arrm == null) continue;
                                                                        }
                                                                        break block18;
                                                                    }
                                                                    jsonObject.add("extra", (JsonElement)object);
                                                                }
                                                            }
                                                            bl2 = k2 instanceof g;
                                                        }
                                                        if (arrm != null) break block20;
                                                        if (!bl2) break block21;
                                                        jsonObject.addProperty("text", ((g)k2).c());
                                                        if (arrm == null) break block22;
                                                    }
                                                    bl2 = k2 instanceof h;
                                                }
                                                if (arrm != null) break block23;
                                                if (!bl2) break block24;
                                                object = (h)k2;
                                                jsonObject.addProperty("translate", ((h)object).c());
                                                arrobject = ((h)object).f();
                                                if (arrm != null) break block25;
                                                if (arrobject == null) break block19;
                                                arrobject = ((h)object).f();
                                            }
                                            if (arrobject.length <= 0) break block19;
                                            jsonObject2 = new JsonArray();
                                            for (Object object2 : ((h)object).f()) {
                                                block27: {
                                                    block26: {
                                                        if (arrm != null) break block19;
                                                        if (arrm != null) break block26;
                                                        if (!(object2 instanceof k)) break block27;
                                                        jsonObject2.add(this.a((k)object2, object2.getClass(), jsonSerializationContext));
                                                    }
                                                    if (arrm == null) continue;
                                                }
                                                jsonObject2.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                                                if (arrm == null) continue;
                                            }
                                            jsonObject.add("with", (JsonElement)jsonObject2);
                                        }
                                        if (arrm == null) break block22;
                                    }
                                    bl2 = k2 instanceof e;
                                }
                                if (arrm != null) break block28;
                                if (!bl2) break block29;
                                object = (e)k2;
                                jsonObject2 = new JsonObject();
                                jsonObject2.addProperty("name", ((e)object).c());
                                jsonObject2.addProperty("objective", ((e)object).d());
                                jsonObject2.addProperty("value", ((e)object).b());
                                jsonObject.add("score", (JsonElement)jsonObject2);
                                if (arrm == null) break block22;
                            }
                            bl2 = k2 instanceof f;
                        }
                        if (arrm != null) break block30;
                        if (!bl2) break block31;
                        object = (f)k2;
                        jsonObject.addProperty("selector", ((f)object).c());
                        if (arrm == null) break block22;
                    }
                    k3 = k2;
                    if (arrm != null) break block32;
                    bl2 = k3 instanceof d;
                }
                if (!bl2) {
                    throw new IllegalArgumentException("Don't know how to serialize " + k2 + " as a Component");
                }
                k3 = k2;
            }
            object = (d)k3;
            jsonObject.addProperty("keybind", ((d)object).c());
        }
        return jsonObject;
    }

    @Nullable
    public static k b(String string) {
        return aG.a(a, string, k.class, true);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(k.class, (Object)new o());
        gsonBuilder.registerTypeHierarchyAdapter(i.class, (Object)new m());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new S());
        a = gsonBuilder.create();
    }

    @Nullable
    public static k a(String string) {
        return aG.a(a, string, k.class, false);
    }
}

