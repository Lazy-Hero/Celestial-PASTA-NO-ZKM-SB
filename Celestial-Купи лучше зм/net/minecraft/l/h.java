/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.l;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.R.b;
import net.minecraft.ar.a1;
import net.minecraft.ar.a5;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.l.d;
import net.minecraft.l.g;
import net.minecraft.l.m;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h
extends g {
    private final /* synthetic */ Set<d> b;
    private /* synthetic */ int d;
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ File e;
    private final /* synthetic */ b f;

    private Set<d> d() {
        HashSet hashSet = Sets.newHashSet(this.b);
        this.b.clear();
        return hashSet;
    }

    public Map<d, a5> a(String string) {
        JsonElement jsonElement = new JsonParser().parse(string);
        int n2 = net.minecraft.l.d.h();
        JsonElement jsonElement2 = jsonElement;
        if (n2 == 0) {
            if (!jsonElement2.isJsonObject()) {
                return Maps.newHashMap();
            }
            jsonElement2 = jsonElement;
        }
        JsonObject jsonObject = jsonElement2.getAsJsonObject();
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            block18: {
                block11: {
                    block15: {
                        Object object;
                        a5 a52;
                        d d10;
                        block14: {
                            boolean bl2;
                            JsonObject jsonObject2;
                            block16: {
                                block17: {
                                    boolean bl3;
                                    block12: {
                                        block13: {
                                            d10 = m.a((String)entry.getKey());
                                            if (d10 == null) break block11;
                                            a52 = new a5();
                                            bl3 = ((JsonElement)entry.getValue()).isJsonPrimitive();
                                            if (n2 != 0) break block12;
                                            if (!bl3) break block13;
                                            bl3 = ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber();
                                            if (n2 != 0) break block12;
                                            if (!bl3) break block13;
                                            a52.a(((JsonElement)entry.getValue()).getAsInt());
                                            if (n2 == 0) break block14;
                                        }
                                        object = (JsonElement)entry.getValue();
                                        if (n2 != 0) break block15;
                                        bl3 = object.isJsonObject();
                                    }
                                    if (!bl3) break block14;
                                    jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                                    bl2 = jsonObject2.has("value");
                                    if (n2 != 0) break block16;
                                    if (!bl2) break block17;
                                    bl2 = jsonObject2.get("value").isJsonPrimitive();
                                    if (n2 != 0) break block16;
                                    if (!bl2) break block17;
                                    bl2 = jsonObject2.get("value").getAsJsonPrimitive().isNumber();
                                    if (n2 != 0) break block16;
                                    if (bl2) {
                                        a52.a(jsonObject2.getAsJsonPrimitive("value").getAsInt());
                                    }
                                }
                                object = jsonObject2;
                                if (n2 != 0) break block15;
                                bl2 = object.has("progress");
                            }
                            if (!bl2) break block14;
                            object = d10.a();
                            if (n2 != 0) break block15;
                            if (object != null) {
                                try {
                                    Constructor<? extends a1> constructor = d10.a().getConstructor(new Class[0]);
                                    a1 a12 = constructor.newInstance(new Object[0]);
                                    a12.a(jsonObject2.get("progress"));
                                    a52.a(a12);
                                }
                                catch (Throwable throwable) {
                                    c.warn("Invalid statistic progress in {}", (Object)this.e, (Object)throwable);
                                }
                            }
                        }
                        object = hashMap.put(d10, a52);
                    }
                    if (n2 == 0) break block18;
                }
                c.warn("Invalid statistic in {}: Don't know what {} is", (Object)this.e, entry.getKey());
            }
            if (n2 == 0) continue;
        }
        return hashMap;
    }

    static {
        c = LogManager.getLogger();
    }

    @Override
    public void b(j j2, d d10, int n2) {
        super.b(j2, d10, n2);
        this.b.add(d10);
    }

    public h(b b10, File file) {
        this.b = Sets.newHashSet();
        this.d = -300;
        this.f = b10;
        this.e = file;
    }

    public void a() {
        try {
            FileUtils.writeStringToFile((File)this.e, (String)h.a(this.a));
        }
        catch (IOException iOException) {
            c.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    public static String a(Map<d, a5> map) {
        JsonObject jsonObject = new JsonObject();
        Iterator<Map.Entry<d, a5>> iterator = map.entrySet().iterator();
        int n2 = net.minecraft.l.d.h();
        while (iterator.hasNext()) {
            block6: {
                Map.Entry<d, a5> entry;
                block5: {
                    entry = iterator.next();
                    if (entry.getValue().a() == null) break block5;
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("value", (Number)entry.getValue().b());
                    try {
                        jsonObject2.add("progress", entry.getValue().a().a());
                    }
                    catch (Throwable throwable) {
                        c.warn("Couldn't save statistic {}: error serializing progress", (Object)entry.getKey().i(), (Object)throwable);
                    }
                    jsonObject.add(entry.getKey().c, (JsonElement)jsonObject2);
                    if (n2 == 0) break block6;
                }
                jsonObject.addProperty(entry.getKey().c, (Number)entry.getValue().b());
            }
            if (n2 == 0) continue;
        }
        return jsonObject.toString();
    }

    public void c() {
        this.b.addAll(this.a.keySet());
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void a(k k2) {
        int n2 = this.f.g();
        HashMap hashMap = Maps.newHashMap();
        int n3 = net.minecraft.l.d.e();
        if (n3 != 0) {
            if (n2 - this.d > 300) {
                this.d = n2;
                for (d d10 : this.d()) {
                    hashMap.put(d10, this.a(d10));
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break;
                }
            } else {
                k2.cD.a(new net.minecraft.Q.j(hashMap));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b() {
        var1_1 = net.minecraft.l.d.e();
        v0 = this;
        if (var1_1 == 0) ** GOTO lbl8
        if (v0.e.isFile() == false) return;
        try {
            this.a.clear();
            v0 = this;
lbl8:
            // 2 sources

            v0.a.putAll(this.a(FileUtils.readFileToString((File)this.e)));
            return;
        }
        catch (IOException var2_2) {
            h.c.error("Couldn't read statistics file {}", (Object)this.e, (Object)var2_2);
            return;
        }
        catch (JsonParseException var2_3) {
            h.c.error("Couldn't parse statistics file {}", (Object)this.e, (Object)var2_3);
        }
    }
}

