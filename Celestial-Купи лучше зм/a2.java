/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.ar.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.n;

public class a2 {
    public static final /* synthetic */ String a;
    public static final /* synthetic */ String t;
    public static final /* synthetic */ String I;
    public static final /* synthetic */ String H;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String e;
    public static final /* synthetic */ String o;
    public static final /* synthetic */ String G;
    public static final /* synthetic */ String C;
    public static final /* synthetic */ String s;
    public static final /* synthetic */ String r;
    public static final /* synthetic */ String v;
    public static final /* synthetic */ String q;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String d;
    public static final /* synthetic */ String n;
    public static final /* synthetic */ String z;
    public static final /* synthetic */ String g;
    public static final /* synthetic */ String E;
    public static final /* synthetic */ String B;
    public static final /* synthetic */ String c;
    private static final /* synthetic */ JsonParser b;
    public static final /* synthetic */ String f;
    public static final /* synthetic */ String x;
    public static final /* synthetic */ String k;
    public static final /* synthetic */ String D;
    public static final /* synthetic */ String u;
    public static final /* synthetic */ String F;
    public static final /* synthetic */ String m;
    public static final /* synthetic */ String y;
    public static final /* synthetic */ String w;
    public static final /* synthetic */ String j;
    public static final /* synthetic */ String p;
    public static final /* synthetic */ String l;
    public static final /* synthetic */ String A;

    static {
        C = "textureSize";
        r = "uvSouth";
        D = "uvLeft";
        k = "uvBack";
        A = "type";
        B = "coordinates";
        E = "uvEast";
        w = "uvWest";
        G = "translate";
        c = "sizeAdd";
        p = "type";
        x = "usePlayerTexture";
        o = "attachTo";
        y = "uvNorth";
        s = "scale";
        t = "baseId";
        h = "rotate";
        j = "id";
        n = "texture";
        d = "submodel";
        u = "uvRight";
        v = "textureSize";
        l = "ModelBox";
        a = "invertAxis";
        e = "mirrorTexture";
        m = "models";
        f = "uvFront";
        F = "submodels";
        H = "boxes";
        g = "uvDown";
        I = "sprites";
        i = "PlayerItem";
        z = "textureOffset";
        q = "uvUp";
        b = new JsonParser();
    }

    public static g a(JsonObject jsonObject, Dimension dimension) {
        String string = a8.a(jsonObject, "type");
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (!fU.a((Object)string3, (Object)"ModelBox")) {
                fU.h("Unknown model type: " + string);
                return null;
            }
            string3 = a8.a(jsonObject, "attachTo");
        }
        String string4 = string3;
        int n2 = a2.a(string4);
        gy gy2 = new gy();
        gy2.g = dimension.width;
        gy2.f = dimension.height;
        c c10 = a2.a(jsonObject, gy2, null, null);
        g g10 = new g(n2, c10);
        return g10;
    }

    private static int[][] a(JsonObject jsonObject) {
        int[][] arrarrn;
        block12: {
            String string;
            int[][] arrarrn2;
            block15: {
                block14: {
                    int n2;
                    int[][] arrarrn3;
                    int[] arrn;
                    block13: {
                        arrarrn2 = new int[][]{a8.a(jsonObject.get("uvDown"), 4), a8.a(jsonObject.get("uvUp"), 4), a8.a(jsonObject.get("uvNorth"), 4), a8.a(jsonObject.get("uvSouth"), 4), a8.a(jsonObject.get("uvWest"), 4), a8.a(jsonObject.get("uvEast"), 4)};
                        string = K.d();
                        arrn = arrarrn2[2];
                        if (string == null) {
                            if (arrn == null) {
                                arrarrn2[2] = a8.a(jsonObject.get("uvFront"), 4);
                            }
                            arrn = arrarrn2[3];
                        }
                        if (string == null) {
                            if (arrn == null) {
                                arrarrn2[3] = a8.a(jsonObject.get("uvBack"), 4);
                            }
                            arrn = arrarrn2[4];
                        }
                        if (string != null) break block13;
                        if (arrn == null) {
                            arrarrn2[4] = a8.a(jsonObject.get("uvLeft"), 4);
                        }
                        arrarrn3 = arrarrn2;
                        n2 = 5;
                        if (string != null) break block14;
                        arrn = arrarrn3[n2];
                    }
                    if (arrn != null) break block15;
                    arrarrn3 = arrarrn2;
                    n2 = 5;
                }
                arrarrn3[n2] = a8.a(jsonObject.get("uvRight"), 4);
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < arrarrn2.length; ++i2) {
                arrarrn = arrarrn2;
                if (string == null) {
                    if (arrarrn[i2] == null) continue;
                    bl2 = true;
                    if (string == null) continue;
                }
                break block12;
            }
            if (!bl2) {
                return null;
            }
            arrarrn = arrarrn2;
        }
        return arrarrn;
    }

    public static gb b(JsonObject jsonObject) {
        String string = a8.a(jsonObject, "type");
        String string2 = K.d();
        if (!fU.a((Object)string, (Object)"PlayerItem")) {
            throw new JsonParseException("Unknown model type: " + string);
        }
        int[] arrn = a8.a(jsonObject.get("textureSize"), 2);
        a2.a(arrn, "Missing texture size");
        Dimension dimension = new Dimension(arrn[0], arrn[1]);
        boolean bl2 = a8.a(jsonObject, "usePlayerTexture", false);
        JsonArray jsonArray = (JsonArray)jsonObject.get("models");
        a2.a((Object)jsonArray, "Missing elements");
        HashMap<String, JsonObject> hashMap = new HashMap<String, JsonObject>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        new ArrayList();
        int n2 = 0;
        block0: while (true) {
            int n3 = n2;
            block1: while (n3 < jsonArray.size()) {
                block15: {
                    JsonObject jsonObject2;
                    block18: {
                        String string3;
                        block20: {
                            String string4;
                            HashMap<String, JsonObject> hashMap2;
                            block19: {
                                String string5;
                                block11: {
                                    block12: {
                                        String string6;
                                        block13: {
                                            block14: {
                                                String string7;
                                                jsonObject2 = (JsonObject)jsonArray.get(n2);
                                                string5 = string7 = a8.a(jsonObject2, "baseId");
                                                if (string2 != null) break block11;
                                                if (string5 == null) break block12;
                                                string6 = string3 = (JsonObject)hashMap.get(string7);
                                                if (string2 != null) break block13;
                                                if (string6 != null) break block14;
                                                fU.h("BaseID not found: " + string7);
                                                if (string2 == null) break block15;
                                            }
                                            string6 = string3;
                                        }
                                        for (Map.Entry entry : string6.entrySet()) {
                                            block17: {
                                                String string8;
                                                JsonObject jsonObject3;
                                                block16: {
                                                    jsonObject3 = jsonObject2;
                                                    string8 = (String)entry.getKey();
                                                    if (string2 != null) break block16;
                                                    n3 = jsonObject3.has(string8) ? 1 : 0;
                                                    if (string2 != null) continue block1;
                                                    if (n3 != 0) break block17;
                                                    jsonObject3 = jsonObject2;
                                                    string8 = (String)entry.getKey();
                                                }
                                                jsonObject3.add(string8, (JsonElement)entry.getValue());
                                            }
                                            if (string2 == null) continue;
                                        }
                                    }
                                    string5 = a8.a(jsonObject2, "id");
                                }
                                if ((string3 = string5) == null) break block18;
                                hashMap2 = hashMap;
                                string4 = string3;
                                if (string2 != null) break block19;
                                if (hashMap2.containsKey(string4)) break block20;
                                hashMap2 = hashMap;
                                string4 = string3;
                            }
                            hashMap2.put(string4, jsonObject2);
                            if (string2 == null) break block18;
                        }
                        fU.h("Duplicate model ID: " + string3);
                    }
                    g g10 = a2.a(jsonObject2, dimension);
                    if (string2 != null) continue block0;
                    if (g10 != null) {
                        arrayList.add(g10);
                    }
                }
                ++n2;
                if (string2 == null) continue block0;
            }
            break;
        }
        g[] arrg = arrayList.toArray(new g[arrayList.size()]);
        return new gb(dimension, bl2, arrg);
    }

    private static v b(String string) {
        int n2 = string.indexOf(58);
        if (n2 < 0) {
            return new v(string);
        }
        String string2 = string.substring(0, n2);
        String string3 = string.substring(n2 + 1);
        return new v(string2, string3);
    }

    private static int a(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 0;
            }
            string3 = string;
        }
        int n2 = string3.equals("body");
        if (string2 == null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = string.equals("head");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("leftArm");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.equals("rightArm");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.equals("leftLeg");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 4;
            }
            n2 = string.equals("rightLeg");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 5;
            }
            n2 = string.equals("cape") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 6;
            }
            fU.h("Unknown attachModel: " + string);
            n2 = 0;
        }
        return n2;
    }

    public static c a(JsonObject jsonObject, j j2, int[] arrn, String string) {
        c c10;
        block57: {
            c c11;
            block59: {
                JsonArray jsonArray;
                float f10;
                Object object;
                Object object2;
                Object object3;
                JsonObject jsonObject2;
                JsonArray jsonArray2;
                boolean bl2;
                float[] arrf;
                float[] arrf2;
                boolean bl3;
                boolean bl4;
                boolean bl5;
                int[] arrn2;
                String string2;
                block58: {
                    block56: {
                        float f11;
                        c11 = new c(j2);
                        string2 = K.d();
                        String string3 = a8.a(jsonObject, "id");
                        c11.c(string3);
                        c11.m = f11 = a8.a(jsonObject, "scale", 1.0f);
                        c11.c = f11;
                        c11.b = f11;
                        String string4 = a8.a(jsonObject, "texture");
                        if (string4 != null) {
                            c11.a(net.n.a(string, string4, ".png"));
                        }
                        int[] arrn3 = arrn2 = a8.a(jsonObject.get("textureSize"), 2);
                        if (string2 == null) {
                            if (arrn3 == null) {
                                arrn2 = arrn;
                            }
                            arrn3 = arrn2;
                        }
                        if (arrn3 != null) {
                            c11.a(arrn2[0], arrn2[1]);
                        }
                        String string5 = a8.a(jsonObject, "invertAxis", "").toLowerCase();
                        bl5 = string5.contains("x");
                        bl4 = string5.contains("y");
                        bl3 = string5.contains("z");
                        arrf2 = a8.a(jsonObject.get("translate"), 3, new float[3]);
                        boolean bl6 = bl5;
                        if (string2 == null) {
                            if (bl6) {
                                arrf2[0] = -arrf2[0];
                            }
                            bl6 = bl4;
                        }
                        if (string2 == null) {
                            if (bl6) {
                                arrf2[1] = -arrf2[1];
                            }
                            bl6 = bl3;
                        }
                        if (bl6) {
                            arrf2[2] = -arrf2[2];
                        }
                        arrf = a8.a(jsonObject.get("rotate"), 3, new float[3]);
                        for (int i2 = 0; i2 < arrf.length; ++i2) {
                            arrf[i2] = arrf[i2] / 180.0f * (float)Math.PI;
                            if (string2 == null) {
                                if (string2 == null) continue;
                            }
                            break block56;
                        }
                        bl2 = bl5;
                        if (string2 != null) break block58;
                        if (bl2) {
                            arrf[0] = -arrf[0];
                        }
                    }
                    bl2 = bl4;
                }
                if (string2 == null) {
                    if (bl2) {
                        arrf[1] = -arrf[1];
                    }
                    bl2 = bl3;
                }
                if (bl2) {
                    arrf[2] = -arrf[2];
                }
                c11.a(arrf2[0], arrf2[1], arrf2[2]);
                c11.y = arrf[0];
                c11.e = arrf[1];
                c11.r = arrf[2];
                String string6 = a8.a(jsonObject, "mirrorTexture", "").toLowerCase();
                boolean bl7 = string6.contains("u");
                boolean bl8 = string6.contains("v");
                boolean bl9 = bl7;
                if (string2 == null) {
                    if (bl9) {
                        c11.A = true;
                    }
                    bl9 = bl8;
                }
                if (bl9) {
                    c11.a = true;
                }
                JsonArray jsonArray3 = jsonArray2 = jsonObject.getAsJsonArray("boxes");
                if (string2 == null) {
                    JsonObject jsonObject3;
                    if (jsonArray3 != null) {
                        for (int i3 = 0; i3 < jsonArray2.size(); ++i3) {
                            jsonObject2 = jsonArray2.get(i3).getAsJsonObject();
                            object3 = a8.a(jsonObject2.get("textureOffset"), 2);
                            jsonObject3 = jsonObject2;
                            if (string2 == null) {
                                object2 = a2.a(jsonObject3);
                                if (object3 == null && object2 == null) {
                                    throw new JsonParseException("Texture offset not specified");
                                }
                                object = a8.b(jsonObject2.get("coordinates"), 6);
                                if (object == null) {
                                    throw new JsonParseException("Coordinates not specified");
                                }
                                boolean bl10 = bl5;
                                if (string2 == null) {
                                    if (bl10) {
                                        object[0] = -object[0] - object[3];
                                    }
                                    bl10 = bl4;
                                }
                                if (string2 == null) {
                                    if (bl10) {
                                        object[1] = -object[1] - object[4];
                                    }
                                    bl10 = bl3;
                                }
                                if (bl10) {
                                    object[2] = -object[2] - object[5];
                                }
                                f10 = a8.a(jsonObject2, "sizeAdd", 0.0f);
                                if (string2 == null) {
                                    if (object2 != null) {
                                        c11.a((int[][])object2, (float)object[0], (float)object[1], (float)object[2], (float)object[3], (float)object[4], (float)object[5], f10);
                                        if (string2 == null) continue;
                                    }
                                    c11.b((int)object3[0], (int)object3[1]);
                                }
                                c11.b((float)object[0], (float)object[1], (float)object[2], (int)object[3], (int)object[4], (int)object[5], f10);
                                if (string2 == null) continue;
                            }
                            break;
                        }
                    } else {
                        jsonObject3 = jsonObject;
                    }
                    jsonArray3 = jsonObject3.getAsJsonArray("sprites");
                }
                JsonArray jsonArray4 = jsonArray = jsonArray3;
                if (string2 == null) {
                    if (jsonArray4 != null) {
                        for (int i4 = 0; i4 < jsonArray.size(); ++i4) {
                            object3 = jsonArray.get(i4).getAsJsonObject();
                            jsonArray4 = object3.get("textureOffset");
                            if (string2 == null) {
                                object2 = a8.a((JsonElement)jsonArray4, 2);
                                if (object2 == null) {
                                    throw new JsonParseException("Texture offset not specified");
                                }
                                object = a8.b(object3.get("coordinates"), 6);
                                if (object == null) {
                                    throw new JsonParseException("Coordinates not specified");
                                }
                                boolean bl11 = bl5;
                                if (string2 == null) {
                                    if (bl11) {
                                        object[0] = -object[0] - object[3];
                                    }
                                    bl11 = bl4;
                                }
                                if (string2 == null) {
                                    if (bl11) {
                                        object[1] = -object[1] - object[4];
                                    }
                                    bl11 = bl3;
                                }
                                if (bl11) {
                                    object[2] = -object[2] - object[5];
                                }
                                f10 = a8.a((JsonObject)object3, "sizeAdd", 0.0f);
                                c11.b((int)object2[0], (int)object2[1]);
                                c11.a((float)object[0], (float)object[1], (float)object[2], (int)object[3], (int)object[4], (int)object[5], f10);
                                if (string2 == null) continue;
                            }
                            break;
                        }
                    } else {
                        jsonArray4 = jsonObject.get("submodel");
                    }
                }
                JsonObject jsonObject4 = jsonObject2 = (JsonObject)jsonArray4;
                if (string2 == null) {
                    if (jsonObject4 != null) {
                        object3 = a2.a(jsonObject2, j2, arrn2, string);
                        c11.a((c)object3);
                    }
                    jsonObject4 = jsonObject.get("submodels");
                }
                if ((object3 = (JsonArray)jsonObject4) == null) break block59;
                for (int i5 = 0; i5 < object3.size(); ++i5) {
                    c c12;
                    c c13;
                    block60: {
                        block61: {
                            c c14;
                            object = (JsonObject)object3.get(i5);
                            c10 = c13 = a2.a(object, j2, arrn2, string);
                            if (string2 != null) break block57;
                            if (string2 != null) break block60;
                            if (c10.b() == null) break block61;
                            c12 = c14 = c11.b(c13.b());
                            if (string2 != null) break block60;
                            if (c12 != null) {
                                fU.h("Duplicate model ID: " + c13.b());
                            }
                        }
                        c12 = c11;
                    }
                    c12.a(c13);
                    if (string2 == null) continue;
                }
            }
            c10 = c11;
        }
        return c10;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }
}

