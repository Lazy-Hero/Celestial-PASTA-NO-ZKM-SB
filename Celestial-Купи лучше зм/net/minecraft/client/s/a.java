/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.s;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.client.B.c;
import net.minecraft.client.D.t;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.j.d;
import net.minecraft.client.s.b;
import net.minecraft.client.s.e;
import net.minecraft.client.s.f;
import net.minecraft.client.s.g;
import net.minecraft.client.s.h;
import net.minecraft.client.s.i;
import net.minecraft.k.m;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private final /* synthetic */ List<String> f;
    private final /* synthetic */ List<String> s;
    private final /* synthetic */ String e;
    private final /* synthetic */ List<f> m;
    private final /* synthetic */ net.minecraft.client.B.f d;
    private final /* synthetic */ List<Integer> c;
    private final /* synthetic */ List<Integer> b;
    private static /* synthetic */ int k;
    private final /* synthetic */ Map<String, f> p;
    private final /* synthetic */ boolean g;
    private static final /* synthetic */ Logger t;
    private static /* synthetic */ a h;
    private /* synthetic */ boolean q;
    private final /* synthetic */ int i;
    private final /* synthetic */ List<Integer> o;
    private final /* synthetic */ h a;
    private static final /* synthetic */ g l;
    private static /* synthetic */ boolean j;
    private final /* synthetic */ h n;
    private final /* synthetic */ Map<String, Object> r;

    static {
        t = LogManager.getLogger();
        l = new g();
        k = -1;
        j = true;
    }

    public int h() {
        return this.i;
    }

    public h f() {
        return this.a;
    }

    private void e() {
        a a10;
        int n2;
        block6: {
            int n3 = 0;
            int n4 = 0;
            n2 = net.minecraft.client.s.b.g();
            while (n3 < this.s.size()) {
                block7: {
                    int n5;
                    int n6;
                    block8: {
                        String object = this.s.get(n3);
                        a10 = this;
                        if (n2 != 0) break block6;
                        n5 = n6 = as.b(a10.i, object);
                        if (n2 != 0) break block7;
                        if (n5 != -1) break block8;
                        t.warn("Shader {}could not find sampler named {} in the specified shader program.", (Object)this.e, (Object)object);
                        this.r.remove(object);
                        this.s.remove(n4);
                        --n4;
                        if (n2 == 0) break block7;
                    }
                    n5 = this.c.add(n6) ? 1 : 0;
                }
                ++n3;
                ++n4;
                if (n2 == 0) continue;
            }
            a10 = this;
        }
        for (f f10 : a10.m) {
            block11: {
                int n7;
                String string;
                block9: {
                    int n8;
                    block10: {
                        string = f10.c();
                        n8 = n7 = as.b(this.i, string);
                        if (n2 != 0) break block9;
                        if (n8 != -1) break block10;
                        t.warn("Could not find uniform named {} in the specified shader program.", (Object)string);
                        if (n2 == 0) break block11;
                    }
                    n8 = this.b.add(n7) ? 1 : 0;
                }
                f10.a(n7);
                this.p.put(string, f10);
            }
            if (n2 == 0) continue;
        }
    }

    private void b(JsonElement jsonElement) throws c {
        block2: {
            boolean bl2;
            String string;
            block3: {
                JsonObject jsonObject = aG.b(jsonElement, "sampler");
                string = aG.f(jsonObject, "name");
                int n2 = net.minecraft.client.s.b.g();
                bl2 = aG.a(jsonObject, "file");
                if (n2 != 0) break block2;
                if (bl2) break block3;
                this.r.put(string, null);
                this.s.add(string);
                if (n2 == 0) break block2;
            }
            bl2 = this.s.add(string);
        }
    }

    @Nullable
    public f b(String string) {
        return this.p.get(string);
    }

    public void d() {
        net.minecraft.client.s.e.c().a(this);
    }

    public void a(String string, Object object) {
        this.r.remove(string);
        this.r.put(string, object);
        this.a();
    }

    public void g() {
        as.a(0);
        k = -1;
        h = null;
        int n2 = net.minecraft.client.s.b.g();
        j = true;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (this.r.get(this.s.get(i2)) == null) continue;
            v.u(as.U + i2);
            v.t(0);
            if (n2 == 0) continue;
        }
    }

    public void a() {
        this.q = true;
    }

    public a(t t2, String string) throws IOException {
        block29: {
            int n2;
            block26: {
                this.r = Maps.newHashMap();
                this.s = Lists.newArrayList();
                this.c = Lists.newArrayList();
                this.m = Lists.newArrayList();
                this.b = Lists.newArrayList();
                this.p = Maps.newHashMap();
                n2 = net.minecraft.client.s.b.c();
                JsonParser jsonParser = new JsonParser();
                net.minecraft.ar.v v2 = new net.minecraft.ar.v("shaders/program/" + string + ".json");
                this.e = string;
                net.minecraft.client.D.v v3 = null;
                try {
                    block25: {
                        String string2;
                        String string3;
                        JsonObject jsonObject;
                        block24: {
                            block27: {
                                block28: {
                                    JsonArray jsonArray;
                                    JsonArray jsonArray2;
                                    v3 = t2.a(v2);
                                    jsonObject = jsonParser.parse(IOUtils.toString((InputStream)v3.c(), (Charset)StandardCharsets.UTF_8)).getAsJsonObject();
                                    string3 = aG.f(jsonObject, "vertex");
                                    string2 = aG.f(jsonObject, "fragment");
                                    JsonArray jsonArray3 = jsonArray2 = aG.a(jsonObject, "samplers", null);
                                    if (n2 != 0) {
                                        if (jsonArray3 != null) {
                                            int n3 = 0;
                                            for (Object object : jsonArray2) {
                                                try {
                                                    this.b((JsonElement)object);
                                                }
                                                catch (Exception exception) {
                                                    c c10 = net.minecraft.client.B.c.a(exception);
                                                    c10.b("samplers[" + n3 + "]");
                                                    throw c10;
                                                }
                                                ++n3;
                                                if (n2 != 0) continue;
                                            }
                                        }
                                        jsonArray3 = jsonArray = aG.a(jsonObject, "attributes", null);
                                    }
                                    if (n2 == 0) break block27;
                                    if (jsonArray == null) break block28;
                                    int n4 = 0;
                                    this.o = Lists.newArrayListWithCapacity((int)jsonArray.size());
                                    this.f = Lists.newArrayListWithCapacity((int)jsonArray.size());
                                    for (JsonElement object : jsonArray) {
                                        try {
                                            this.f.add(aG.e(object, "attribute"));
                                            if (n2 == 0) break block24;
                                        }
                                        catch (Exception exception) {
                                            c c11 = net.minecraft.client.B.c.a(exception);
                                            c11.b("attributes[" + n4 + "]");
                                            throw c11;
                                        }
                                        ++n4;
                                        if (n2 != 0) continue;
                                    }
                                    if (n2 != 0) break block24;
                                }
                                this.o = null;
                            }
                            this.f = null;
                        }
                        JsonArray jsonArray = aG.a(jsonObject, "uniforms", null);
                        if (n2 != 0) {
                            if (jsonArray != null) {
                                int n5 = 0;
                                for (JsonElement jsonElement : jsonArray) {
                                    try {
                                        this.a(jsonElement);
                                        if (n2 == 0) break block25;
                                    }
                                    catch (Exception exception) {
                                        c c12 = net.minecraft.client.B.c.a(exception);
                                        c12.b("uniforms[" + n5 + "]");
                                        throw c12;
                                    }
                                    ++n5;
                                    if (n2 != 0) continue;
                                }
                            }
                            this.d = net.minecraft.client.B.f.a(aG.a(jsonObject, "blend", null));
                            this.g = aG.a(jsonObject, "cull", true);
                            this.a = net.minecraft.client.s.h.a(t2, net.minecraft.client.s.i.VERTEX, string3);
                            this.n = net.minecraft.client.s.h.a(t2, net.minecraft.client.s.i.FRAGMENT, string2);
                            this.i = net.minecraft.client.s.e.c().b();
                            net.minecraft.client.s.e.c().b(this);
                            this.e();
                        }
                    }
                    if (n2 == 0 || this.f == null) break block26;
                    for (String string2 : this.f) {
                        int n3 = as.a(this.i, string2);
                        this.o.add(n3);
                        if (n2 != 0 && n2 != 0) continue;
                        break;
                    }
                }
                catch (Exception exception) {
                    c c13 = net.minecraft.client.B.c.a(exception);
                    c13.a(v2.a());
                    throw c13;
                }
                finally {
                    IOUtils.closeQuietly((Closeable)v3);
                }
            }
            this.a();
            if (net.minecraft.k.m.d()) break block29;
            net.minecraft.client.s.b.b(++n2);
        }
    }

    public f a(String string) {
        f f10 = this.b(string);
        return f10 == null ? l : f10;
    }

    public h b() {
        return this.n;
    }

    public void c() {
        a a10;
        int n2;
        block13: {
            block15: {
                block14: {
                    this.q = false;
                    h = this;
                    n2 = net.minecraft.client.s.b.g();
                    this.d.a();
                    int n3 = this.i;
                    if (n2 == 0) {
                        if (n3 != k) {
                            as.a(this.i);
                            k = this.i;
                        }
                        n3 = this.g ? 1 : 0;
                    }
                    if (n3 == 0) break block14;
                    v.c();
                    if (n2 == 0) break block15;
                }
                v.E();
            }
            for (int i2 = 0; i2 < this.c.size(); ++i2) {
                int n4;
                int n5;
                block21: {
                    block18: {
                        Object object;
                        block19: {
                            block20: {
                                block16: {
                                    block17: {
                                        a10 = this;
                                        if (n2 != 0) break block13;
                                        Object object2 = a10.r.get(this.s.get(i2));
                                        if (n2 == 0) {
                                            if (object2 == null) continue;
                                            v.u(as.U + i2);
                                            v.x();
                                            object2 = this.r.get(this.s.get(i2));
                                        }
                                        object = object2;
                                        n5 = -1;
                                        n4 = object instanceof b;
                                        if (n2 != 0) break block16;
                                        if (n4 == 0) break block17;
                                        n5 = ((b)object).d;
                                        if (n2 == 0) break block18;
                                    }
                                    n4 = object instanceof d;
                                }
                                if (n2 != 0) break block19;
                                if (n4 == 0) break block20;
                                n5 = ((d)object).c();
                                if (n2 == 0) break block18;
                            }
                            n4 = object instanceof Integer;
                        }
                        if (n2 != 0) break block21;
                        if (n4 != 0) {
                            n5 = (Integer)object;
                        }
                    }
                    n4 = n5;
                }
                int n6 = -1;
                if (n2 == 0) {
                    if (n4 == n6) continue;
                    v.t(n5);
                    n4 = as.b(this.i, this.s.get(i2));
                    n6 = i2;
                }
                as.d(n4, n6);
                if (n2 == 0) continue;
            }
            a10 = this;
        }
        for (f f10 : a10.m) {
            f10.a();
            if (n2 == 0) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(JsonElement var1_1) throws c {
        block22: {
            block23: {
                block20: {
                    block21: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        var3_2 = aG.b(var1_1, "uniform");
                                        var2_3 = net.minecraft.client.s.b.g();
                                        var4_4 = aG.f(var3_2, "name");
                                        var5_5 = net.minecraft.client.s.f.a(aG.f(var3_2, "type"));
                                        var6_6 = aG.d(var3_2, "count");
                                        var7_7 = new float[Math.max(var6_6, 16)];
                                        var8_8 = aG.i(var3_2, "values");
                                        v0 = var8_8.size();
                                        if (var2_3 == 0) {
                                            if (v0 != var6_6) {
                                                v0 = var8_8.size();
                                                if (var2_3 == 0) {
                                                    if (v0 > 1) {
                                                        throw new c("Invalid amount of values specified (expected " + var6_6 + ", found " + var8_8.size() + ")");
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v0 = 0;
                                            }
                                        }
                                        var9_9 = v0;
                                        for (Object var11_12 : var8_8) {
                                            try {
                                                var7_7[var9_9] = aG.a((JsonElement)var11_12, "value");
                                                if (var2_3 != 0) break block16;
                                            }
                                            catch (Exception var12_13) {
                                                var13_14 = net.minecraft.client.B.c.a(var12_13);
                                                var13_14.b("values[" + var9_9 + "]");
                                                throw var13_14;
                                            }
                                            ++var9_9;
                                            if (var2_3 == 0) continue;
                                        }
                                        v1 = var6_6;
                                        v2 = 1;
                                        if (var2_3 != 0) break block17;
                                        if (v1 <= v2) break block16;
                                        v1 = var8_8.size();
                                        v2 = 1;
                                        if (var2_3 != 0) break block17;
                                        if (v1 != v2) break block16;
                                        while (var9_9 < var6_6) {
                                            var7_7[var9_9] = var7_7[0];
                                            ++var9_9;
                                            if (var2_3 == 0) {
                                                if (var2_3 == 0) continue;
                                            }
                                            ** GOTO lbl-1000
                                        }
                                    }
                                    v1 = var6_6;
                                    v2 = 1;
                                }
                                if (var2_3 != 0) break block18;
                                if (v1 <= v2) ** GOTO lbl-1000
                                v1 = var6_6;
                                v2 = 4;
                            }
                            if (var2_3 != 0) break block19;
                            if (v1 > v2) ** GOTO lbl-1000
                            v1 = var5_5;
                            v2 = 8;
                        }
                        if (var2_3 != 0) ** GOTO lbl61
                        if (v1 < v2) {
                            v1 = var6_6;
                            v2 = 1;
lbl61:
                            // 2 sources

                            v3 = v1 - v2;
                        } else lbl-1000:
                        // 4 sources

                        {
                            v3 = 0;
                        }
                        var10_11 = v3;
                        var11_12 = new f(var4_4, var5_5 + var10_11, var6_6, this);
                        v4 = var5_5;
                        v5 = 3;
                        if (var2_3 != 0) break block20;
                        if (v4 > v5) break block21;
                        var11_12.a((int)var7_7[0], (int)var7_7[1], (int)var7_7[2], (int)var7_7[3]);
                        if (var2_3 == 0) break block22;
                    }
                    v4 = var5_5;
                    v5 = 7;
                }
                if (v4 > v5) break block23;
                var11_12.a(var7_7[0], var7_7[1], var7_7[2], var7_7[3]);
                if (var2_3 == 0) break block22;
            }
            var11_12.a(var7_7);
        }
        this.m.add((f)var11_12);
    }
}

