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
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.B;
import net.I;
import net.a;
import net.aI;
import net.f;
import net.j;
import net.minecraft.ar.v;
import net.minecraft.client.w.c;
import net.minecraft.k.m;

public class n {
    public static final /* synthetic */ String b;
    public static final /* synthetic */ String w;
    public static final /* synthetic */ String t;
    public static final /* synthetic */ String j;
    public static final /* synthetic */ String l;
    public static final /* synthetic */ String n;
    public static final /* synthetic */ String r;
    public static final /* synthetic */ String a;
    public static final /* synthetic */ String s;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String k;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String g;
    public static final /* synthetic */ String B;
    public static final /* synthetic */ String c;
    public static final /* synthetic */ String u;
    public static final /* synthetic */ String f;
    public static final /* synthetic */ String m;
    public static final /* synthetic */ String d;
    public static final /* synthetic */ String e;
    public static final /* synthetic */ String o;
    public static final /* synthetic */ String y;
    public static final /* synthetic */ String x;
    public static final /* synthetic */ String q;
    public static final /* synthetic */ String p;
    public static final /* synthetic */ String v;
    public static final /* synthetic */ String A;
    public static final /* synthetic */ String z;

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a(JsonObject jsonObject, JsonObject jsonObject2) {
        Iterator iterator = jsonObject.entrySet().iterator();
        String[] arrstring = I.c();
        while (iterator.hasNext()) {
            block4: {
                String string;
                JsonObject jsonObject3;
                Map.Entry entry;
                block5: {
                    boolean bl2;
                    block3: {
                        entry = (Map.Entry)iterator.next();
                        bl2 = ((String)entry.getKey()).equals("id");
                        if (arrstring == null) break block3;
                        if (bl2) break block4;
                        jsonObject3 = jsonObject2;
                        string = (String)entry.getKey();
                        if (arrstring == null) break block5;
                        bl2 = jsonObject3.has(string);
                    }
                    if (bl2) break block4;
                    jsonObject3 = jsonObject2;
                    string = (String)entry.getKey();
                }
                jsonObject3.add(string, (JsonElement)entry.getValue());
            }
            if (arrstring != null) continue;
        }
    }

    public static v a(String string, String string2, String string3) {
        block7: {
            String string4;
            block10: {
                boolean bl2;
                block8: {
                    String[] arrstring;
                    block9: {
                        block5: {
                            block6: {
                                arrstring = I.c();
                                bl2 = string2.endsWith(string3);
                                if (arrstring != null) {
                                    if (!bl2) {
                                        string2 = string2 + string3;
                                    }
                                    bl2 = string2.contains("/");
                                }
                                if (arrstring == null) break block5;
                                if (bl2) break block6;
                                string2 = string + "/" + string2;
                                if (arrstring != null) break block7;
                            }
                            bl2 = string2.startsWith("./");
                        }
                        if (arrstring == null) break block8;
                        if (!bl2) break block9;
                        string2 = string + "/" + string2.substring(2);
                        if (arrstring != null) break block7;
                    }
                    string4 = string2;
                    if (arrstring == null) break block10;
                    bl2 = string4.startsWith("~/");
                }
                if (!bl2) break block7;
                string4 = "optifine/" + string2.substring(2);
            }
            string2 = string4;
        }
        return new v(string2);
    }

    private static void a(JsonObject jsonObject, Map map) {
        block3: {
            JsonObject jsonObject2;
            block4: {
                JsonObject jsonObject3;
                block5: {
                    String string;
                    String[] arrstring;
                    String string2;
                    block2: {
                        string2 = a8.a(jsonObject, "baseId");
                        arrstring = I.c();
                        string = string2;
                        if (arrstring == null) break block2;
                        if (string == null) break block3;
                        string = map.get(string2);
                    }
                    jsonObject2 = jsonObject3 = (JsonObject)string;
                    if (arrstring == null) break block4;
                    if (jsonObject2 != null) break block5;
                    fU.h("BaseID not found: " + string2);
                    if (arrstring != null) break block3;
                }
                jsonObject2 = jsonObject3;
            }
            net.n.a(jsonObject2, jsonObject);
        }
    }

    private static void b(JsonObject jsonObject, Map map) {
        block3: {
            String string;
            Map map2;
            block6: {
                String string2;
                block7: {
                    int n2;
                    String[] arrstring;
                    block4: {
                        block5: {
                            String string3;
                            block2: {
                                string2 = a8.a(jsonObject, "id");
                                arrstring = I.c();
                                string3 = string2;
                                if (arrstring == null) break block2;
                                if (string3 == null) break block3;
                                string3 = string2;
                            }
                            n2 = string3.length();
                            if (arrstring == null) break block4;
                            if (n2 >= 1) break block5;
                            fU.h("Empty model ID: " + string2);
                            if (arrstring != null) break block3;
                        }
                        map2 = map;
                        string = string2;
                        if (arrstring == null) break block6;
                        n2 = map2.containsKey(string) ? 1 : 0;
                    }
                    if (n2 == 0) break block7;
                    fU.h("Duplicate model ID: " + string2);
                    if (arrstring != null) break block3;
                }
                map2 = map;
                string = string2;
            }
            map2.put(string, jsonObject);
        }
    }

    private static void a(JsonObject jsonObject, Map map, String string) {
        block10: {
            String string2;
            String[] arrstring;
            String string3;
            block9: {
                string3 = a8.a(jsonObject, "model");
                arrstring = I.c();
                string2 = string3;
                if (arrstring == null) break block9;
                if (string2 == null) break block10;
                string2 = string;
            }
            v v2 = net.n.a(string2, string3, ".jpm");
            try {
                JsonObject jsonObject2;
                JsonObject jsonObject3 = jsonObject2 = net.n.a(v2);
                if (arrstring != null) {
                    if (jsonObject3 == null) {
                        fU.h("Model not found: " + v2);
                        return;
                    }
                    jsonObject3 = jsonObject2;
                }
                net.n.a(jsonObject3, jsonObject);
            }
            catch (IOException iOException) {
                fU.d("" + iOException.getClass().getName() + ": " + iOException.getMessage());
            }
            catch (JsonParseException jsonParseException) {
                fU.d("" + ((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static j a(JsonObject jsonObject, String string) {
        f[] arrf;
        Object object;
        Object object2;
        float f10;
        String string2;
        String string3;
        block7: {
            String string4;
            String string5;
            block6: {
                ha ha2 = new ha("CustomEntityModels");
                string3 = ha2.m(string);
                string2 = ha2.h(string);
                string5 = a8.a(jsonObject, "texture");
                int[] arrn = a8.a(jsonObject.get("textureSize"), 2);
                f10 = a8.a(jsonObject, "shadowSize", -1.0f);
                JsonArray jsonArray = (JsonArray)jsonObject.get("models");
                String[] arrstring = I.c();
                net.n.a((Object)jsonArray, "Missing models");
                HashMap hashMap = new HashMap();
                ArrayList<Object> arrayList = new ArrayList<Object>();
                int n2 = 0;
                while (n2 < jsonArray.size()) {
                    object2 = (JsonObject)jsonArray.get(n2);
                    net.n.a(object2, hashMap);
                    net.n.a(object2, hashMap, string2);
                    net.n.b(object2, hashMap);
                    object = net.n.a(object2, arrn, string2);
                    if (arrstring != null) {
                        if (object != null) {
                            arrayList.add(object);
                        }
                        ++n2;
                    }
                    if (arrstring != null) continue;
                    net.minecraft.k.m.b(!net.minecraft.k.m.c());
                    break;
                }
                arrf = arrayList.toArray(new f[arrayList.size()]);
                object2 = null;
                string4 = string5;
                if (arrstring == null) break block6;
                if (string4 == null) break block7;
                string4 = string2;
            }
            object2 = net.n.a(string4, string5, ".png");
        }
        object = new j(string3, string2, (v)object2, arrf, f10);
        return object;
    }

    public static f a(JsonObject jsonObject, int[] arrn, String string) {
        f f10;
        block17: {
            Object object;
            B b10;
            aI aI2;
            boolean bl2;
            String string2;
            block15: {
                Object object2;
                block16: {
                    block11: {
                        String[] arrstring;
                        block14: {
                            block13: {
                                String[] arrstring2 = I.c();
                                string2 = a8.a(jsonObject, "part");
                                net.n.a(string2, "Model part not specified, missing \"replace\" or \"attachTo\".");
                                bl2 = a8.a(jsonObject, "attach", false);
                                arrstring = arrstring2;
                                aI2 = new aI();
                                if (arrstring == null) break block13;
                                if (arrn == null) break block14;
                                aI2.g = arrn[0];
                            }
                            aI2.f = arrn[1];
                        }
                        b10 = null;
                        JsonArray jsonArray = (JsonArray)jsonObject.get("animations");
                        if (jsonArray == null) break block15;
                        object = new ArrayList();
                        int n2 = 0;
                        while (n2 < jsonArray.size()) {
                            block12: {
                                JsonObject jsonObject2 = (JsonObject)jsonArray.get(n2);
                                if (arrstring == null) break block11;
                                for (Map.Entry entry : jsonObject2.entrySet()) {
                                    String string3 = (String)entry.getKey();
                                    String string4 = ((JsonElement)entry.getValue()).getAsString();
                                    a a10 = new a(string3, string4);
                                    object.add(a10);
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block12;
                                }
                                ++n2;
                            }
                            if (arrstring != null) continue;
                        }
                        object2 = object;
                        if (arrstring == null) break block16;
                        if (object2.size() <= 0) break block15;
                    }
                    object2 = object;
                }
                a[] arra = object2.toArray(new a[object.size()]);
                b10 = new B(arra);
            }
            object = a2.a(jsonObject, aI2, arrn, string);
            f10 = new f(string2, bl2, (c)object, b10);
            if (!net.minecraft.k.m.c()) break block17;
            I.b(new String[1]);
        }
        return f10;
    }

    static {
        y = "textureOffset";
        l = "EntityModel";
        o = "model";
        f = "boxes";
        v = "submodel";
        n = "usePlayerTexture";
        r = "submodels";
        b = "entity";
        e = "models";
        q = "animations";
        m = "invertAxis";
        x = "part";
        k = "type";
        B = "baseId";
        u = "textureSize";
        p = "id";
        z = "coordinates";
        j = "type";
        d = "mirrorTexture";
        h = "shadowSize";
        A = "sprites";
        g = "EntityModelPart";
        c = "translate";
        s = "rotate";
        a = "texture";
        t = "scale";
        i = "sizeAdd";
        w = "attach";
    }

    public static JsonObject a(v v2) throws IOException, JsonParseException {
        InputStream inputStream = fU.a(v2);
        String[] arrstring = I.c();
        InputStream inputStream2 = inputStream;
        if (arrstring != null) {
            if (inputStream2 == null) {
                return null;
            }
            inputStream2 = inputStream;
        }
        String string = fU.a(inputStream2, "ASCII");
        inputStream.close();
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject)jsonParser.parse(string);
        return jsonObject;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }
}

