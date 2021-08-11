/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class a8 {
    public static int[] a(JsonElement jsonElement, int n2) {
        return a8.a(jsonElement, n2, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(JsonObject jsonObject, String string, boolean bl2) {
        boolean bl3;
        JsonElement jsonElement = jsonObject.get(string);
        String string2 = K.d();
        JsonElement jsonElement2 = jsonElement;
        if (string2 == null) {
            if (jsonElement2 == null) {
                bl3 = bl2;
                return bl3;
            }
            jsonElement2 = jsonElement;
        }
        bl3 = jsonElement2.getAsBoolean();
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float a(JsonObject jsonObject, String string, float f10) {
        float f11;
        JsonElement jsonElement = jsonObject.get(string);
        String string2 = K.d();
        JsonElement jsonElement2 = jsonElement;
        if (string2 == null) {
            if (jsonElement2 == null) {
                f11 = f10;
                return f11;
            }
            jsonElement2 = jsonElement;
        }
        f11 = jsonElement2.getAsFloat();
        return f11;
    }

    public static String a(JsonObject jsonObject, String string) {
        return a8.a(jsonObject, string, null);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public static int[] a(JsonElement jsonElement, int n2, int[] arrn) {
        int[] arrn2;
        block6: {
            String string = K.d();
            JsonElement jsonElement2 = jsonElement;
            if (string == null) {
                if (jsonElement2 == null) {
                    return arrn;
                }
                jsonElement2 = jsonElement;
            }
            JsonArray jsonArray = jsonElement2.getAsJsonArray();
            int n3 = jsonArray.size();
            if (string == null) {
                if (n3 != n2) {
                    throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n2 + ", array: " + (Object)jsonArray);
                }
                n3 = jsonArray.size();
            }
            int[] arrn3 = new int[n3];
            for (int i2 = 0; i2 < arrn3.length; ++i2) {
                arrn2 = arrn3;
                if (string == null) {
                    arrn2[i2] = jsonArray.get(i2).getAsInt();
                    if (string == null) continue;
                }
                break block6;
            }
            arrn2 = arrn3;
        }
        return arrn2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(JsonObject jsonObject, String string, String string2) {
        String string3;
        JsonElement jsonElement = jsonObject.get(string);
        String string4 = K.d();
        JsonElement jsonElement2 = jsonElement;
        if (string4 == null) {
            if (jsonElement2 == null) {
                string3 = string2;
                return string3;
            }
            jsonElement2 = jsonElement;
        }
        string3 = jsonElement2.getAsString();
        return string3;
    }

    public static float[] a(JsonElement jsonElement, int n2, float[] arrf) {
        float[] arrf2;
        block6: {
            String string = K.d();
            JsonElement jsonElement2 = jsonElement;
            if (string == null) {
                if (jsonElement2 == null) {
                    return arrf;
                }
                jsonElement2 = jsonElement;
            }
            JsonArray jsonArray = jsonElement2.getAsJsonArray();
            int n3 = jsonArray.size();
            if (string == null) {
                if (n3 != n2) {
                    throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n2 + ", array: " + (Object)jsonArray);
                }
                n3 = jsonArray.size();
            }
            float[] arrf3 = new float[n3];
            for (int i2 = 0; i2 < arrf3.length; ++i2) {
                arrf2 = arrf3;
                if (string == null) {
                    arrf2[i2] = jsonArray.get(i2).getAsFloat();
                    if (string == null) continue;
                }
                break block6;
            }
            arrf2 = arrf3;
        }
        return arrf2;
    }

    public static float[] b(JsonElement jsonElement, int n2) {
        return a8.a(jsonElement, n2, null);
    }
}

