/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.ar;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.w.k;
import org.apache.commons.lang3.StringUtils;

public class aG {
    public static float a(JsonElement jsonElement, String string) {
        block3: {
            JsonElement jsonElement2;
            block4: {
                boolean bl2;
                block2: {
                    int n2 = v.d();
                    bl2 = jsonElement.isJsonPrimitive();
                    if (n2 == 0) break block2;
                    if (!bl2) break block3;
                    jsonElement2 = jsonElement.getAsJsonPrimitive();
                    if (n2 == 0) break block4;
                    bl2 = jsonElement2.isNumber();
                }
                if (!bl2) break block3;
                jsonElement2 = jsonElement;
            }
            return jsonElement2.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + aG.c(jsonElement));
    }

    public static JsonArray c(JsonElement jsonElement, String string) {
        block3: {
            JsonElement jsonElement2;
            block2: {
                int n2 = v.d();
                jsonElement2 = jsonElement;
                if (n2 == 0) break block2;
                if (!jsonElement2.isJsonArray()) break block3;
                jsonElement2 = jsonElement;
            }
            return jsonElement2.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + aG.c(jsonElement));
    }

    public static String f(JsonObject jsonObject, String string) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.d();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 == 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.e((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static JsonObject a(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        JsonObject jsonObject3;
        int n2 = v.d();
        JsonObject jsonObject4 = jsonObject;
        String string2 = string;
        if (n2 != 0) {
            if (!jsonObject4.has(string2)) {
                jsonObject3 = jsonObject2;
                return jsonObject3;
            }
            jsonObject4 = jsonObject.get(string);
            string2 = string;
        }
        jsonObject3 = aG.b((JsonElement)jsonObject4, string2);
        return jsonObject3;
    }

    public static boolean d(JsonElement jsonElement, String string) {
        block3: {
            boolean bl2;
            block2: {
                int n2 = v.b();
                bl2 = jsonElement.isJsonPrimitive();
                if (n2 != 0) break block2;
                if (!bl2) break block3;
                bl2 = jsonElement.getAsBoolean();
            }
            return bl2;
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + aG.c(jsonElement));
    }

    public static <T> T a(JsonObject jsonObject, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> class_) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.d();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 == 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.a((JsonElement)jsonObject2, string2, jsonDeserializationContext, class_);
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(JsonElement jsonElement) {
        int n2 = v.b();
        boolean bl2 = jsonElement.isJsonPrimitive();
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = jsonElement.getAsJsonPrimitive().isNumber();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(JsonObject jsonObject, String string) {
        int n2 = v.b();
        boolean bl2 = aG.j(jsonObject, string);
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = jsonObject.getAsJsonPrimitive(string).isString();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static boolean e(JsonObject jsonObject, String string) {
        int n2 = v.b();
        JsonObject jsonObject2 = jsonObject;
        if (n2 == 0) {
            if (jsonObject2 == null) {
                return false;
            }
            jsonObject2 = jsonObject.get(string);
        }
        return jsonObject2 != null;
    }

    public static JsonObject l(JsonObject jsonObject, String string) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.b();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 != 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.b((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean k(JsonObject jsonObject, String string) {
        int n2 = v.d();
        boolean bl2 = aG.e(jsonObject, string);
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = jsonObject.get(string).isJsonArray();
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Nullable
    public static <T> T a(Gson gson, String string, Type type) {
        return aG.a(gson, string, type, false);
    }

    public static float h(JsonObject jsonObject, String string) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.d();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 == 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.a((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static String c(JsonElement jsonElement) {
        String string;
        block15: {
            JsonElement jsonElement2;
            int n2;
            block14: {
                boolean bl2;
                block13: {
                    string = StringUtils.abbreviateMiddle((String)String.valueOf((Object)jsonElement), (String)"...", (int)10);
                    n2 = v.b();
                    JsonElement jsonElement3 = jsonElement;
                    if (n2 == 0) {
                        if (jsonElement3 == null) {
                            return "null (missing)";
                        }
                        jsonElement3 = jsonElement;
                    }
                    bl2 = jsonElement3.isJsonNull();
                    if (n2 == 0) {
                        if (bl2) {
                            return "null (json)";
                        }
                        bl2 = jsonElement.isJsonArray();
                    }
                    if (n2 == 0) {
                        if (bl2) {
                            return "an array (" + string + ")";
                        }
                        bl2 = jsonElement.isJsonObject();
                    }
                    if (n2 != 0) break block13;
                    if (bl2) {
                        return "an object (" + string + ")";
                    }
                    jsonElement2 = jsonElement;
                    if (n2 != 0) break block14;
                    bl2 = jsonElement2.isJsonPrimitive();
                }
                if (!bl2) break block15;
                jsonElement2 = jsonElement;
            }
            JsonPrimitive jsonPrimitive = jsonElement2.getAsJsonPrimitive();
            boolean bl3 = jsonPrimitive.isNumber();
            if (n2 == 0) {
                if (bl3) {
                    return "a number (" + string + ")";
                }
                bl3 = jsonPrimitive.isBoolean();
            }
            if (bl3) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float a(JsonObject jsonObject, String string, float f10) {
        float f11;
        int n2 = v.b();
        JsonObject jsonObject2 = jsonObject;
        String string2 = string;
        if (n2 == 0) {
            if (!jsonObject2.has(string2)) {
                f11 = f10;
                return f11;
            }
            jsonObject2 = jsonObject.get(string);
            string2 = string;
        }
        f11 = aG.a((JsonElement)jsonObject2, string2);
        return f11;
    }

    public static k b(JsonObject jsonObject, String string) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.b();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 != 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.g((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find an item");
    }

    public static int a(JsonObject jsonObject, String string, int n2) {
        int n3 = v.d();
        int n4 = jsonObject.has(string);
        if (n3 != 0) {
            n4 = n4 != 0 ? aG.f(jsonObject.get(string), string) : n2;
        }
        return n4;
    }

    public static int d(JsonObject jsonObject, String string) {
        block3: {
            int n2;
            block2: {
                int n3 = v.b();
                n2 = jsonObject.has(string);
                if (n3 != 0) break block2;
                if (n2 == 0) break block3;
                n2 = aG.f(jsonObject.get(string), string);
            }
            return n2;
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static <T> T a(JsonObject jsonObject, String string, T t2, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> class_) {
        T t3;
        int n2 = v.b();
        JsonObject jsonObject2 = jsonObject;
        String string2 = string;
        if (n2 == 0) {
            if (!jsonObject2.has(string2)) {
                t3 = t2;
                return t3;
            }
            jsonObject2 = jsonObject.get(string);
            string2 = string;
        }
        t3 = aG.a((JsonElement)jsonObject2, string2, jsonDeserializationContext, class_);
        return t3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(JsonObject jsonObject, String string, String string2) {
        String string3;
        int n2 = v.d();
        JsonObject jsonObject2 = jsonObject;
        String string4 = string;
        if (n2 != 0) {
            if (!jsonObject2.has(string4)) {
                string3 = string2;
                return string3;
            }
            jsonObject2 = jsonObject.get(string);
            string4 = string;
        }
        string3 = aG.e((JsonElement)jsonObject2, string4);
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static JsonArray a(JsonObject jsonObject, String string, @Nullable JsonArray jsonArray) {
        JsonArray jsonArray2;
        int n2 = v.d();
        JsonObject jsonObject2 = jsonObject;
        String string2 = string;
        if (n2 != 0) {
            if (!jsonObject2.has(string2)) {
                jsonArray2 = jsonArray;
                return jsonArray2;
            }
            jsonObject2 = jsonObject.get(string);
            string2 = string;
        }
        jsonArray2 = aG.c((JsonElement)jsonObject2, string2);
        return jsonArray2;
    }

    public static JsonObject b(JsonElement jsonElement, String string) {
        block3: {
            JsonElement jsonElement2;
            block2: {
                int n2 = v.b();
                jsonElement2 = jsonElement;
                if (n2 != 0) break block2;
                if (!jsonElement2.isJsonObject()) break block3;
                jsonElement2 = jsonElement;
            }
            return jsonElement2.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + aG.c(jsonElement));
    }

    @Nullable
    public static <T> T a(Gson gson, String string, Class<T> class_) {
        return aG.a(gson, string, class_, false);
    }

    public static boolean a(JsonObject jsonObject, String string, boolean bl2) {
        int n2 = v.d();
        boolean bl3 = jsonObject.has(string);
        if (n2 != 0) {
            bl3 = bl3 ? aG.d(jsonObject.get(string), string) : bl2;
        }
        return bl3;
    }

    @Nullable
    public static <T> T a(Gson gson, Reader reader, Type type, boolean bl2) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(bl2);
            return (T)gson.getAdapter(TypeToken.get((Type)type)).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(JsonObject jsonObject, String string) {
        int n2 = v.d();
        boolean bl2 = aG.j(jsonObject, string);
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = jsonObject.getAsJsonPrimitive(string).isBoolean();
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Nullable
    public static <T> T a(Gson gson, Reader reader, Type type) {
        return aG.a(gson, reader, type, false);
    }

    public static <T> T a(@Nullable JsonElement jsonElement, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> class_) {
        block3: {
            Object object;
            block2: {
                int n2 = v.b();
                object = jsonElement;
                if (n2 != 0) break block2;
                if (object == null) break block3;
                object = jsonDeserializationContext.deserialize(jsonElement, class_);
            }
            return (T)object;
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    public static JsonArray i(JsonObject jsonObject, String string) {
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                int n2 = v.d();
                jsonObject2 = jsonObject;
                string2 = string;
                if (n2 == 0) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject.get(string);
                string2 = string;
            }
            return aG.c((JsonElement)jsonObject2, string2);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    @Nullable
    public static <T> T a(Gson gson, Reader reader, Class<T> class_) {
        return aG.a(gson, reader, class_, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean j(JsonObject jsonObject, String string) {
        int n2 = v.b();
        boolean bl2 = aG.e(jsonObject, string);
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = jsonObject.get(string).isJsonPrimitive();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Nullable
    public static <T> T a(Gson gson, String string, Type type, boolean bl2) {
        return aG.a(gson, (Reader)new StringReader(string), type, bl2);
    }

    public static int f(JsonElement jsonElement, String string) {
        block3: {
            int n2;
            block4: {
                int n3;
                block2: {
                    n3 = v.b();
                    n2 = jsonElement.isJsonPrimitive();
                    if (n3 != 0) break block2;
                    if (n2 == 0) break block3;
                    n2 = jsonElement.getAsJsonPrimitive().isNumber() ? 1 : 0;
                }
                if (n3 != 0) break block4;
                if (n2 == 0) break block3;
                n2 = jsonElement.getAsInt();
            }
            return n2;
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + aG.c(jsonElement));
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public static String e(JsonElement jsonElement, String string) {
        block3: {
            JsonElement jsonElement2;
            block2: {
                int n2 = v.b();
                jsonElement2 = jsonElement;
                if (n2 != 0) break block2;
                if (!jsonElement2.isJsonPrimitive()) break block3;
                jsonElement2 = jsonElement;
            }
            return jsonElement2.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + aG.c(jsonElement));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(JsonElement jsonElement) {
        int n2 = v.d();
        boolean bl2 = jsonElement.isJsonPrimitive();
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = jsonElement.getAsJsonPrimitive().isString();
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static k g(JsonElement jsonElement, String string) {
        block6: {
            k k2;
            JsonElement jsonElement2;
            int n2;
            block5: {
                n2 = v.b();
                jsonElement2 = jsonElement;
                if (n2 != 0) break block5;
                if (!jsonElement2.isJsonPrimitive()) break block6;
                jsonElement2 = jsonElement;
            }
            String string2 = jsonElement2.getAsString();
            k k3 = k2 = k.a(string2);
            if (n2 == 0) {
                if (k3 == null) {
                    throw new JsonSyntaxException("Expected " + string + " to be an item, was unknown string '" + string2 + "'");
                }
                k3 = k2;
            }
            return k3;
        }
        throw new JsonSyntaxException("Expected " + string + " to be an item, was " + aG.c(jsonElement));
    }

    @Nullable
    public static <T> T a(Gson gson, String string, Class<T> class_, boolean bl2) {
        return aG.a(gson, (Reader)new StringReader(string), class_, bl2);
    }

    public static boolean c(JsonObject jsonObject, String string) {
        block3: {
            boolean bl2;
            block2: {
                int n2 = v.b();
                bl2 = jsonObject.has(string);
                if (n2 != 0) break block2;
                if (!bl2) break block3;
                bl2 = aG.d(jsonObject.get(string), string);
            }
            return bl2;
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    @Nullable
    public static <T> T a(Gson gson, Reader reader, Class<T> class_, boolean bl2) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(bl2);
            return (T)gson.getAdapter(class_).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }
}

