/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.B;
import net.I;
import net.aP;
import net.f;
import net.j;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.c;
import net.n;
import net.q;
import net.w;

public class p {
    private static /* synthetic */ Map<Class, net.minecraft.client.F.f> b;
    private static /* synthetic */ boolean a;
    private static /* synthetic */ Map<Class, b> c;

    public static boolean e() {
        return a;
    }

    private static q a(I i2, j j2) {
        q q2;
        block5: {
            net.minecraft.client.w.j j3;
            float f10;
            v v2 = j2.d();
            f[] arrf = j2.b();
            String[] arrstring = I.c();
            float f11 = f10 = j2.a();
            if (arrstring != null && f11 < 0.0f) {
                f11 = f10 = i2.d();
            }
            if ((j3 = i2.e()) == null) {
                return null;
            }
            w w2 = new w(i2, j3, arrf);
            I i3 = i2;
            net.minecraft.client.w.j j4 = j3;
            if (arrstring != null) {
                if (!p.a(i3, j4, arrf, w2)) {
                    return null;
                }
                i3 = i2;
                j4 = j3;
            }
            if ((q2 = i3.a(j4, f10)) == null) {
                throw new JsonParseException("Entity renderer is null, model: " + i2.a() + ", adapter: " + i2.getClass().getName());
            }
            if (v2 == null) break block5;
            q2.a(v2);
        }
        return q2;
    }

    public static void a() {
        block5: {
            Map<Class, q> map;
            Map<Class, net.minecraft.client.F.f> map2;
            String[] arrstring;
            Map<Class, b> map3;
            block6: {
                block7: {
                    block3: {
                        block4: {
                            map3 = p.b();
                            arrstring = I.c();
                            map2 = p.d();
                            map = map3;
                            if (arrstring == null) break block3;
                            if (map != null) break block4;
                            fU.h("Entity render map not found, custom entity models are DISABLED.");
                            if (arrstring != null) break block5;
                        }
                        map = map2;
                    }
                    if (arrstring == null) break block6;
                    if (map != null) break block7;
                    fU.h("Tile entity render map not found, custom entity models are DISABLED.");
                    if (arrstring != null) break block5;
                }
                a = false;
                map3.clear();
                map2.clear();
                map3.putAll(c);
                map = map2;
            }
            map.putAll(b);
            if (!fU.u()) break block5;
            v[] arrv = p.c();
            int n2 = 0;
            while (n2 < arrv.length) {
                block8: {
                    block9: {
                        block12: {
                            q q2;
                            block14: {
                                block13: {
                                    q q3;
                                    boolean bl2;
                                    Class class_;
                                    block10: {
                                        block11: {
                                            v v2 = arrv[n2];
                                            fU.b("CustomEntityModel: " + v2.a());
                                            q2 = p.a(v2);
                                            if (arrstring == null) break block8;
                                            if (q2 == null) break block9;
                                            class_ = q2.b();
                                            if (arrstring == null) break block8;
                                            if (class_ == null) break block9;
                                            bl2 = q2 instanceof b;
                                            if (arrstring == null) break block10;
                                            if (!bl2) break block11;
                                            map3.put(class_, (b)q2);
                                            if (arrstring != null) break block12;
                                        }
                                        q3 = q2;
                                        if (arrstring == null) break block13;
                                        bl2 = q3 instanceof net.minecraft.client.F.f;
                                    }
                                    if (!bl2) break block14;
                                    q3 = map2.put(class_, (net.minecraft.client.F.f)q2);
                                }
                                if (arrstring != null) break block12;
                            }
                            fU.h("Unknown renderer type: " + q2.getClass().getName());
                        }
                        a = true;
                    }
                    ++n2;
                }
                if (arrstring != null) continue;
            }
        }
    }

    private static q a(JsonObject jsonObject, String string) {
        q q2;
        j j2 = n.a(jsonObject, string);
        String[] arrstring = I.c();
        String string2 = j2.c();
        I i2 = aP.a(string2);
        p.a((Object)i2, "Entity not found: " + string2);
        Class class_ = i2.b();
        p.a(class_, "Entity class not found: " + string2);
        String[] arrstring2 = arrstring;
        q q3 = q2 = p.a(i2, j2);
        if (arrstring2 != null) {
            if (q3 == null) {
                return null;
            }
            q2.a(class_);
            q3 = q2;
        }
        return q3;
    }

    private static q a(v v2) {
        try {
            JsonObject jsonObject = n.a(v2);
            q q2 = p.a(jsonObject, v2.a());
            return q2;
        }
        catch (IOException iOException) {
            fU.d("" + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
        catch (JsonParseException jsonParseException) {
            fU.d("" + ((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static Map<Class, b> b() {
        a4 a42 = Q.P().aQ();
        Map<Class, b> map = a42.c();
        String[] arrstring = I.c();
        Map<Class, b> map2 = map;
        if (arrstring != null) {
            if (map2 == null) {
                return null;
            }
            map2 = c;
        }
        if (arrstring != null) {
            if (map2 == null) {
                c = new HashMap<Class, b>(map);
            }
            map2 = map;
        }
        return map2;
    }

    private static Map<Class, net.minecraft.client.F.f> d() {
        Map<Class, net.minecraft.client.F.f> map = net.minecraft.client.F.b.e.g;
        String[] arrstring = I.c();
        Map<Class, net.minecraft.client.F.f> map2 = b;
        if (arrstring != null) {
            if (map2 == null) {
                b = new HashMap<Class, net.minecraft.client.F.f>(map);
            }
            map2 = map;
        }
        return map2;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    private static v[] c() {
        Object[] arrobject;
        block4: {
            String string = "optifine/cem/";
            String string2 = ".jem";
            ArrayList<v> arrayList = new ArrayList<v>();
            String[] arrstring = I.c();
            String[] arrstring2 = aP.a();
            int n2 = 0;
            while (n2 < arrstring2.length) {
                arrobject = arrstring2;
                if (arrstring != null) {
                    String string3 = arrobject[n2];
                    String string4 = string + string3 + string2;
                    v v2 = new v(string4);
                    if (arrstring != null) {
                        if (fU.b(v2)) {
                            arrayList.add(v2);
                        }
                        ++n2;
                    }
                    if (arrstring != null) continue;
                }
                break block4;
            }
            arrobject = arrayList.toArray(new v[arrayList.size()]);
        }
        v[] arrv = (v[])arrobject;
        return arrv;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private static boolean a(I i2, net.minecraft.client.w.j j2, f f10, w w2) {
        block20: {
            B b10;
            block22: {
                boolean bl2;
                block21: {
                    B b11;
                    String[] arrstring;
                    block19: {
                        f f11;
                        c c10;
                        block15: {
                            c c11;
                            block18: {
                                block16: {
                                    List<c> list;
                                    block17: {
                                        block14: {
                                            block13: {
                                                String string = f10.a();
                                                arrstring = I.c();
                                                c10 = i2.a(j2, string);
                                                if (arrstring == null) break block13;
                                                if (c10 != null) break block14;
                                                fU.h("Model part not found: " + string + ", model: " + j2);
                                            }
                                            return false;
                                        }
                                        f11 = f10;
                                        if (arrstring == null) break block15;
                                        if (f11.c()) break block16;
                                        list = c10.p;
                                        if (arrstring != null) {
                                            if (list != null) {
                                                c10.p.clear();
                                            }
                                            list = c10.o;
                                        }
                                        if (arrstring == null) break block17;
                                        if (list != null) {
                                            c10.o.clear();
                                        }
                                        c11 = c10;
                                        if (arrstring == null) break block18;
                                        list = c11.D;
                                    }
                                    if (list != null) {
                                        c10.D.clear();
                                    }
                                }
                                c11 = c10;
                            }
                            c11.a(f10.d());
                            f11 = f10;
                        }
                        b11 = b10 = f11.b();
                        if (arrstring == null) break block19;
                        if (b11 == null) break block20;
                        w2.a(f10.d());
                        w2.b(c10);
                        b11 = b10;
                    }
                    bl2 = b11.a(w2);
                    if (arrstring == null) break block21;
                    if (bl2) break block22;
                    bl2 = false;
                }
                return bl2;
            }
            f10.d().a(b10);
        }
        return true;
    }

    private static boolean a(I i2, net.minecraft.client.w.j j2, f[] arrf, w w2) {
        boolean bl2;
        block4: {
            int n2 = 0;
            String[] arrstring = I.c();
            while (n2 < arrf.length) {
                f f10 = arrf[n2];
                if (arrstring != null) {
                    bl2 = p.a(i2, j2, f10, w2);
                    if (arrstring == null) break block4;
                    if (!bl2) {
                        return false;
                    }
                    ++n2;
                }
                if (arrstring != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    static {
        a = false;
        c = null;
        b = null;
    }
}

