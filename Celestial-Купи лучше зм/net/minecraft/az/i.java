/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.az;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.az.k;
import net.minecraft.az.r;
import net.minecraft.k.m;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
implements k {
    private final /* synthetic */ a2<r> d;
    private final /* synthetic */ int b;
    private final /* synthetic */ String a;
    private final /* synthetic */ int f;
    private static /* synthetic */ m[] c;
    private final /* synthetic */ d e;

    /*
     * WARNING - void declaration
     */
    @VisibleForTesting
    static String[] a(String ... arrstring) {
        String[] arrstring2;
        block10: {
            void var5_6;
            int n2;
            m[] arrm;
            int n4;
            int n5;
            int n6;
            block9: {
                n6 = Integer.MAX_VALUE;
                n5 = 0;
                n4 = 0;
                arrm = i.b();
                boolean n3 = false;
                for (int arrstring3 = 0; arrstring3 < arrstring.length; ++arrstring3) {
                    String i3 = arrstring[arrstring3];
                    n6 = Math.min(n6, i.b(i3));
                    int n7 = i.a(i3);
                    n5 = Math.max(n5, n7);
                    n2 = n7;
                    if (arrm == null) {
                        boolean bl2;
                        if (arrm == null) {
                            if (n2 < 0) {
                                if (n4 == arrstring3) {
                                    ++n4;
                                }
                                ++var5_6;
                                if (arrm == null) continue;
                            }
                            bl2 = false;
                        }
                        var5_6 = bl2;
                        if (arrm == null) continue;
                    }
                    break block9;
                }
                n2 = arrstring.length;
            }
            int n8 = var5_6;
            if (arrm == null) {
                if (n2 == n8) {
                    return new String[0];
                }
                n2 = arrstring.length - var5_6;
                n8 = n4;
            }
            String[] arrstring3 = new String[n2 - n8];
            for (int i2 = 0; i2 < arrstring3.length; ++i2) {
                arrstring2 = arrstring3;
                if (arrm == null) {
                    arrstring2[i2] = arrstring[i2 + n4].substring(n6, n5 + 1);
                    if (arrm == null) continue;
                }
                break block10;
            }
            arrstring2 = arrstring3;
        }
        return arrstring2;
    }

    @Override
    public d d() {
        return this.e;
    }

    public int c() {
        return this.b;
    }

    public static r a(@Nullable JsonElement jsonElement) {
        block12: {
            d[] arrd;
            block10: {
                JsonElement jsonElement2;
                m[] arrm;
                block15: {
                    boolean bl2;
                    block14: {
                        block13: {
                            JsonElement jsonElement3;
                            block11: {
                                arrm = i.b();
                                jsonElement3 = jsonElement;
                                if (arrm != null) break block11;
                                if (jsonElement3 == null) break block12;
                                jsonElement3 = jsonElement;
                            }
                            bl2 = jsonElement3.isJsonNull();
                            if (arrm != null) break block13;
                            if (bl2) break block12;
                            bl2 = jsonElement.isJsonObject();
                        }
                        if (arrm != null) break block14;
                        if (bl2) {
                            return r.a(i.a(jsonElement.getAsJsonObject(), false));
                        }
                        jsonElement2 = jsonElement;
                        if (arrm != null) break block15;
                        bl2 = jsonElement2.isJsonArray();
                    }
                    if (!bl2) {
                        throw new JsonSyntaxException("Expected item to be object or array of objects");
                    }
                    jsonElement2 = jsonElement;
                }
                JsonArray jsonArray = jsonElement2.getAsJsonArray();
                int n2 = jsonArray.size();
                if (arrm == null) {
                    if (n2 == 0) {
                        throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                    }
                    n2 = jsonArray.size();
                }
                d[] arrd2 = new d[n2];
                for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                    arrd = arrd2;
                    if (arrm == null) {
                        arrd[i2] = i.a(aG.b(jsonArray.get(i2), "item"), false);
                        if (arrm == null) continue;
                    }
                    break block10;
                }
                arrd = arrd2;
            }
            return r.a(arrd);
        }
        throw new JsonSyntaxException("Item cannot be null");
    }

    public static i b(JsonObject jsonObject) {
        i i2;
        block0: {
            String string = aG.a(jsonObject, "group", "");
            Map<String, r> map = i.a(aG.l(jsonObject, "key"));
            m[] arrm = i.b();
            String[] arrstring = i.a(i.a(aG.i(jsonObject, "pattern")));
            int n2 = arrstring[0].length();
            int n3 = arrstring.length;
            a2<r> a22 = i.a(arrstring, map, n2, n3);
            d d10 = i.a(aG.l(jsonObject, "result"), true);
            i2 = new i(string, n2, n3, a22, d10);
            if (m.d()) break block0;
            i.b(new m[2]);
        }
        return i2;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        return this.d().C();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = i.b();
        boolean bl2 = n2;
        int n4 = this.b;
        if (arrm == null) {
            if (bl2 < n4) return false;
            bl2 = n3;
            if (arrm != null) return bl2;
            n4 = this.f;
        }
        if (bl2 < n4) return false;
        return true;
    }

    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        int n2;
        block6: {
            int n3 = 0;
            m[] arrm = i.b();
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 <= 3 - this.b) {
                    n2 = 0;
                    if (arrm != null) break block6;
                    for (int i2 = v1538446; i2 <= 3 - this.f; ++i2) {
                        boolean bl2;
                        n4 = this.a(m2, n3, i2, true) ? 1 : 0;
                        if (arrm != null) continue block1;
                        if (arrm == null) {
                            if (n4 != 0) {
                                return true;
                            }
                            bl2 = this.a(m2, n3, i2, false);
                        }
                        if (arrm == null) {
                            if (!bl2) continue;
                            bl2 = true;
                        }
                        return bl2;
                    }
                    ++n3;
                    if (arrm == null) continue block0;
                }
                break;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    private static String[] a(JsonArray jsonArray) {
        int n2;
        String[] arrstring = new String[jsonArray.size()];
        m[] arrm = i.b();
        int n3 = arrstring.length;
        if (arrm == null) {
            if (n3 > 3) {
                throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
            }
            n3 = arrstring.length;
        }
        if (arrm == null) {
            if (n3 == 0) {
                throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
            }
            n3 = n2 = 0;
        }
        while (n2 < arrstring.length) {
            String string;
            block12: {
                int n4;
                String[] arrstring2;
                block11: {
                    int n5;
                    block10: {
                        string = aG.e(jsonArray.get(n2), "pattern[" + n2 + "]");
                        n5 = string.length();
                        if (arrm == null) {
                            if (n5 > 3) {
                                throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
                            }
                            n5 = n2;
                        }
                        if (arrm != null) break block10;
                        if (n5 <= 0) break block11;
                        arrstring2 = arrstring;
                        n4 = 0;
                        if (arrm != null) break block12;
                        n5 = arrstring2[n4].length();
                    }
                    if (n5 != string.length()) {
                        throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                    }
                }
                arrstring2 = arrstring;
                n4 = n2;
            }
            arrstring2[n4] = string;
            ++n2;
            if (arrm == null) continue;
        }
        return arrstring;
    }

    private boolean a(net.minecraft.B.m m2, int n2, int n3, boolean bl2) {
        int n4;
        block7: {
            int n5 = 0;
            m[] arrm = i.b();
            block0: while (true) {
                int n6 = n5;
                block1: while (n6 < 3) {
                    n4 = 0;
                    if (arrm != null) break block7;
                    for (int i2 = v1538591; i2 < 3; ++i2) {
                        int n7;
                        block8: {
                            r r2;
                            block9: {
                                int n8;
                                int n9;
                                block10: {
                                    n9 = n5 - n2;
                                    n8 = i2 - n3;
                                    r2 = r.a;
                                    n6 = n9;
                                    if (arrm != null) continue block1;
                                    if (arrm != null) break block8;
                                    if (n6 < 0) break block9;
                                    n7 = n8;
                                    if (arrm != null) break block8;
                                    if (n7 < 0) break block9;
                                    n7 = n9;
                                    if (arrm != null) break block8;
                                    if (n7 >= this.b) break block9;
                                    n7 = n8;
                                    if (arrm != null) break block8;
                                    if (n7 >= this.f) break block9;
                                    if (!bl2) break block10;
                                    r2 = this.d.get(this.b - n9 - 1 + n8 * this.b);
                                    if (arrm == null) break block9;
                                }
                                r2 = this.d.get(n9 + n8 * this.b);
                            }
                            n7 = r2.a(m2.b(n5, i2)) ? 1 : 0;
                        }
                        if (arrm == null) {
                            if (n7 != 0) continue;
                            n7 = 0;
                        }
                        return n7 != 0;
                    }
                    ++n5;
                    if (arrm == null) continue block0;
                }
                break;
            }
            n4 = 1;
        }
        return n4 != 0;
    }

    @Override
    public a2<r> c() {
        return this.d;
    }

    static {
        if (i.b() != null) {
            i.b(new m[1]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static d a(JsonObject var0, boolean var1_1) {
        var3_2 = aG.f(var0, "item");
        var4_3 = net.minecraft.w.k.q.a(new v(var3_2));
        var2_4 = i.b();
        v0 = var4_3;
        if (var2_4 == null) {
            if (v0 == null) {
                throw new JsonSyntaxException("Unknown item '" + var3_2 + "'");
            }
            v0 = var4_3;
        }
        v1 = v0.l();
        if (var2_4 == null) {
            if (v1 != 0) {
                v1 = var0.has("data");
                if (var2_4 == null) {
                    if (v1 == 0) {
                        throw new JsonParseException("Missing data for item '" + var3_2 + "'");
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = aG.a(var0, "data", 0);
            }
        }
        var5_5 = v1;
        v2 = var1_1;
        if (var2_4 == null) {
            v2 = v2 != 0 ? aG.a(var0, "count", 1) : 1;
        }
        var6_6 = v2;
        return new d(var4_3, var6_6, var5_5);
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public a2<d> b(net.minecraft.B.m m2) {
        a2<d> a22 = a2.a(m2.e(), net.minecraft.w.d.m);
        m[] arrm = i.b();
        int n2 = 0;
        while (n2 < a22.size()) {
            d d10 = m2.a(n2);
            if (arrm == null) {
                if (d10.w().t()) {
                    a22.set(n2, new d(d10.w().s()));
                }
                ++n2;
            }
            if (arrm == null) continue;
        }
        return a22;
    }

    public int a() {
        return this.f;
    }

    private static Map<String, r> a(JsonObject jsonObject) {
        HashMap hashMap;
        block6: {
            Object object;
            hashMap = Maps.newHashMap();
            m[] arrm = i.b();
            for (Map.Entry entry : jsonObject.entrySet()) {
                block8: {
                    Object object2;
                    int n2;
                    block7: {
                        object = (String)entry.getKey();
                        if (arrm != null) break block6;
                        n2 = ((String)object).length();
                        if (arrm != null) break block7;
                        if (n2 != 1) {
                            throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only).");
                        }
                        object2 = " ";
                        if (arrm != null) break block8;
                        n2 = ((String)object2).equals(entry.getKey()) ? 1 : 0;
                    }
                    if (n2 != 0) {
                        throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
                    }
                    object2 = hashMap.put(entry.getKey(), i.a((JsonElement)entry.getValue()));
                }
                if (arrm == null) continue;
            }
            object = hashMap.put(" ", r.a);
        }
        return hashMap;
    }

    public static void b(m[] arrm) {
        c = arrm;
    }

    private static a2<r> a(String[] arrstring, Map<String, r> map, int n2, int n3) {
        int n4;
        HashSet hashSet;
        a2<r> a22;
        block5: {
            a22 = a2.a(n2 * n3, r.a);
            hashSet = Sets.newHashSet(map.keySet());
            m[] arrm = i.b();
            hashSet.remove(" ");
            m[] arrm2 = arrm;
            int n5 = 0;
            while (n5 < arrstring.length) {
                block6: {
                    n4 = 0;
                    if (arrm2 != null) break block5;
                    for (int i2 = v1539526; i2 < arrstring[n5].length(); ++i2) {
                        String string = arrstring[n5].substring(i2, i2 + 1);
                        r r2 = map.get(string);
                        if (arrm2 == null) {
                            r r3 = r2;
                            if (arrm2 != null) continue;
                            if (r3 == null) {
                                throw new JsonSyntaxException("Pattern references symbol '" + string + "' but it's not defined in the key");
                            }
                            hashSet.remove(string);
                            r3 = a22.set(i2 + n2 * n5, r2);
                            if (arrm2 == null) continue;
                        }
                        break block6;
                    }
                    ++n5;
                }
                if (arrm2 == null) continue;
            }
            n4 = hashSet.isEmpty();
        }
        if (n4 == 0) {
            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + hashSet);
        }
        return a22;
    }

    public static m[] b() {
        return c;
    }

    private static int b(String string) {
        int n2;
        block2: {
            int n3;
            m[] arrm = i.b();
            for (n3 = 0; n3 < string.length(); ++n3) {
                n2 = string.charAt(n3);
                if (arrm == null && arrm == null) {
                    if (n2 != 32) break;
                    if (arrm == null) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    private static int a(String string) {
        int n2;
        block2: {
            int n3;
            m[] arrm = i.b();
            for (n3 = string.length() - 1; n3 >= 0; --n3) {
                n2 = string.charAt(n3);
                if (arrm == null && arrm == null) {
                    if (n2 != 32) break;
                    if (arrm == null) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    public i(String string, int n2, int n3, a2<r> a22, d d10) {
        this.a = string;
        this.b = n2;
        this.f = n3;
        this.d = a22;
        this.e = d10;
    }
}

