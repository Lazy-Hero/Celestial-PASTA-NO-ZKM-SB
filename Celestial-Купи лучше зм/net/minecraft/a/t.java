/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.a;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import net.minecraft.a.a;
import net.minecraft.a.b;
import net.minecraft.a.k;
import net.minecraft.a.z;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t<K, V extends b<K>> {
    private static final /* synthetic */ ParameterizedType c;
    protected static final /* synthetic */ Logger f;
    private /* synthetic */ boolean d;
    protected final /* synthetic */ Gson e;
    private final /* synthetic */ File b;
    private final /* synthetic */ Map<String, V> a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() throws IOException {
        Collection<V> collection = this.a.values();
        String string = this.e.toJson(collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.b, (Charset)StandardCharsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
    }

    public V a(K k2) {
        this.d();
        return (V)((b)this.a.get(this.c(k2)));
    }

    protected Map<String, V> c() {
        return this.a;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public String[] e() {
        return this.a.keySet().toArray(new String[this.a.size()]);
    }

    protected boolean d(K k2) {
        return this.a.containsKey(this.c(k2));
    }

    static {
        f = LogManager.getLogger();
        c = new a();
    }

    public void a(V v2) {
        this.a.put(this.c(((b)v2).a()), v2);
        try {
            this.b();
        }
        catch (IOException iOException) {
            f.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public boolean a() {
        return this.d;
    }

    public t(File file) {
        this.a = Maps.newHashMap();
        this.d = true;
        this.b = file;
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeHierarchyAdapter(b.class, (Object)new z(this, null));
        this.e = gsonBuilder.create();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void d() {
        var2_1 = Lists.newArrayList();
        var3_2 = this.a.values().iterator();
        var1_3 = k.q();
        while (var3_2.hasNext()) {
            var4_4 = (b)var3_2.next();
            v0 = var4_4.b();
            if (!var1_3) {
                if (!var1_3 && v0) {
                    var2_1.add(var4_4.a());
                }
                if (!var1_3) continue;
            }
            ** GOTO lbl16
        }
        var3_2 = var2_1.iterator();
        do {
            v0 = var3_2.hasNext();
lbl16:
            // 2 sources

            if (v0 == false) return;
            var4_4 = var3_2.next();
            this.a.remove(var4_4);
        } while (!var1_3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected b<K> a(JsonObject jsonObject) {
        return new b<Object>(null, jsonObject);
    }

    public void b(K k2) {
        this.a.remove(this.c(k2));
        try {
            this.b();
        }
        catch (IOException iOException) {
            f.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    protected String c(K k2) {
        return k2.toString();
    }
}

