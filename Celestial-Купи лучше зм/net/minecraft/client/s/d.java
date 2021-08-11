/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.s;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.ar.aG;
import net.minecraft.client.D.t;
import net.minecraft.client.a.v;
import net.minecraft.client.j.u;
import net.minecraft.client.s.b;
import net.minecraft.client.s.c;
import org.apache.commons.io.IOUtils;
import org.lwjgl.util.vector.Matrix4f;

public class d {
    public final /* synthetic */ String b;
    public /* synthetic */ Matrix4f d;
    public static final /* synthetic */ List<c> i;
    public /* synthetic */ float g;
    public final /* synthetic */ Map<String, b> e;
    public final /* synthetic */ t c;
    public final /* synthetic */ List<b> h;
    public /* synthetic */ int a;
    public /* synthetic */ float f;
    public final /* synthetic */ b k;
    public /* synthetic */ int j;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void b(JsonElement var1_1) throws net.minecraft.client.B.c {
        var3_2 = aG.b(var1_1, "uniform");
        var2_3 = net.minecraft.client.s.b.g();
        var4_4 = aG.f(var3_2, "name");
        var5_5 = net.minecraft.client.s.d.i.get(net.minecraft.client.s.d.i.size() - 1).b().b(var4_4);
        if (var5_5 == null) {
            throw new net.minecraft.client.B.c("Uniform '" + var4_4 + "' does not exist");
        }
        var6_6 = new float[4];
        var7_7 = 0;
        for (JsonElement var9_9 : aG.i(var3_2, "values")) {
            try {
                var6_6[var7_7] = aG.a(var9_9, "value");
                if (var2_3 == 0) {
                }
                ** GOTO lbl26
            }
            catch (Exception var10_10) {
                var11_11 = net.minecraft.client.B.c.a(var10_10);
                var11_11.b("values[" + var7_7 + "]");
                throw var11_11;
            }
            ++var7_7;
            if (var2_3 == 0) continue;
        }
        switch (var7_7) {
            default: {
                if (var2_3 == 0) return;
            }
            case 1: {
                var5_5.a(var6_6[0]);
lbl26:
                // 2 sources

                if (var2_3 == 0) return;
            }
            case 2: {
                var5_5.a(var6_6[0], var6_6[1]);
                if (var2_3 == 0) return;
            }
            case 3: {
                var5_5.a(var6_6[0], var6_6[1], var6_6[2]);
                if (var2_3 == 0) return;
            }
            case 4: 
        }
        var5_5.b(var6_6[0], var6_6[1], var6_6[2], var6_6[3]);
    }

    public void a(String string, int n2, int n3) {
        block5: {
            int n4;
            int n5;
            b b10;
            block4: {
                int n6 = net.minecraft.client.s.b.c();
                b10 = new b(n2, n3, true);
                b10.a(0.0f, 0.0f, 0.0f, 0.0f);
                this.e.put(string, b10);
                int n7 = n6;
                n5 = n2;
                n4 = this.a;
                if (n7 == 0) break block4;
                if (n5 != n4) break block5;
                n5 = n3;
                if (n7 == 0) break block5;
                n4 = this.j;
            }
            if (n5 == n4) {
                n5 = this.h.add(b10) ? 1 : 0;
            }
        }
    }

    public d(u u2, t t2, b b10, net.minecraft.ar.v v2) throws IOException, JsonSyntaxException {
        this.e = Maps.newHashMap();
        this.h = Lists.newArrayList();
        this.c = t2;
        this.k = b10;
        this.g = 0.0f;
        this.f = 0.0f;
        this.a = b10.e;
        this.j = b10.a;
        this.b = v2.toString();
        this.d();
        this.a(u2, v2);
    }

    private void a(JsonElement jsonElement) throws net.minecraft.client.B.c {
        block7: {
            JsonElement jsonElement2;
            int n2;
            block5: {
                block6: {
                    n2 = net.minecraft.client.s.b.c();
                    jsonElement2 = jsonElement;
                    if (n2 == 0) break block5;
                    if (!aG.b(jsonElement2)) break block6;
                    this.a(jsonElement.getAsString(), this.a, this.j);
                    if (n2 != 0) break block7;
                }
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "target");
            String string = aG.f(jsonObject, "name");
            int n3 = aG.a(jsonObject, "width", this.a);
            int n4 = aG.a(jsonObject, "height", this.j);
            d d10 = this;
            if (n2 != 0) {
                if (d10.e.containsKey(string)) {
                    throw new net.minecraft.client.B.c(string + " is already defined");
                }
                d10 = this;
            }
            d10.a(string, n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(u u2, net.minecraft.ar.v v2) throws IOException, JsonSyntaxException {
        net.minecraft.client.D.v v3;
        block16: {
            String string;
            JsonObject jsonObject;
            JsonElement jsonElement;
            Iterator iterator;
            int n2;
            net.minecraft.client.B.c c10;
            int n3;
            block15: {
                JsonParser jsonParser = new JsonParser();
                v3 = null;
                n3 = net.minecraft.client.s.b.g();
                v3 = this.c.a(v2);
                JsonObject jsonObject2 = jsonParser.parse(IOUtils.toString((InputStream)v3.c(), (Charset)StandardCharsets.UTF_8)).getAsJsonObject();
                boolean bl2 = aG.k(jsonObject2, "targets");
                if (n3 == 0) {
                    if (bl2) {
                        c10 = jsonObject2.getAsJsonArray("targets");
                        n2 = 0;
                        iterator = c10.iterator();
                        while (iterator.hasNext()) {
                            jsonElement = (JsonElement)iterator.next();
                            try {
                                this.a(jsonElement);
                                if (n3 != 0) return;
                            }
                            catch (Exception exception) {
                                net.minecraft.client.B.c c11 = net.minecraft.client.B.c.a(exception);
                                c11.b("targets[" + n2 + "]");
                                throw c11;
                            }
                            ++n2;
                            if (n3 == 0) continue;
                        }
                    }
                    jsonObject = jsonObject2;
                    string = "passes";
                    if (n3 != 0) break block15;
                    bl2 = aG.k(jsonObject, string);
                }
                if (!bl2) break block16;
                jsonObject = jsonObject2;
                string = "passes";
            }
            try {
                c10 = jsonObject.getAsJsonArray(string);
                n2 = 0;
                iterator = c10.iterator();
                while (iterator.hasNext()) {
                    jsonElement = (JsonElement)iterator.next();
                    try {
                        this.a(u2, jsonElement);
                        if (n3 != 0) return;
                    }
                    catch (Exception exception) {
                        net.minecraft.client.B.c c12 = net.minecraft.client.B.c.a(exception);
                        c12.b("passes[" + n2 + "]");
                        throw c12;
                    }
                    ++n2;
                    if (n3 == 0) continue;
                }
            }
            catch (Exception exception) {
                try {
                    c10 = net.minecraft.client.B.c.a(exception);
                    c10.a(v2.a());
                    throw c10;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(v3);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((Closeable)v3);
        return;
    }

    public void a(int n2, int n3) {
        Object object;
        Iterator<Object> iterator;
        int n4;
        block3: {
            this.a = this.k.g;
            this.j = this.k.b;
            n4 = net.minecraft.client.s.b.g();
            this.d();
            iterator = i.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                ((c)object).a(this.d);
                if (n4 == 0) {
                    if (n4 == 0) continue;
                }
                break block3;
            }
            iterator = this.h.iterator();
        }
        while (iterator.hasNext()) {
            object = (b)iterator.next();
            ((b)object).a(n2, n3);
            if (n4 == 0) continue;
        }
    }

    public void a(float f10) {
        int n2;
        block6: {
            block5: {
                block4: {
                    n2 = net.minecraft.client.s.b.c();
                    if (n2 == 0) break block4;
                    if (!(f10 < this.f)) break block5;
                    this.g += 1.0f - this.f;
                    this.g += f10;
                }
                if (n2 != 0) break block6;
            }
            this.g += f10 - this.f;
        }
        this.f = f10;
        while (this.g > 20.0f) {
            this.g -= 20.0f;
            if (n2 != 0) continue;
        }
        for (c c10 : i) {
            c10.a(this.g / 20.0f);
            if (n2 != 0) continue;
        }
    }

    public List<b> e() {
        return this.h;
    }

    public List<c> a() {
        return i;
    }

    public c a(String string, b b10, b b11) throws IOException {
        c c10 = new c(this.c, string, b10, b11);
        i.add(i.size(), c10);
        return c10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(u var1_1, JsonElement var2_2) throws IOException {
        block20: {
            block17: {
                block21: {
                    var4_3 = aG.b(var2_2, "pass");
                    var5_4 = aG.f(var4_3, "name");
                    var3_5 = net.minecraft.client.s.b.c();
                    var6_6 = aG.f(var4_3, "intarget");
                    var7_7 = aG.f(var4_3, "outtarget");
                    var8_8 = this.b(var6_6);
                    var9_9 = this.b(var7_7);
                    v0 = var8_8;
                    if (var3_5 != 0) {
                        if (v0 == null) {
                            throw new net.minecraft.client.B.c("Input target '" + var6_6 + "' does not exist");
                        }
                        v0 = var9_9;
                    }
                    if (v0 == null) {
                        throw new net.minecraft.client.B.c("Output target '" + var7_7 + "' does not exist");
                    }
                    var10_10 = this.a(var5_4, var8_8, var9_9);
                    v1 = var11_11 = aG.a(var4_3, "auxtargets", null);
                    if (var3_5 == 0) break block20;
                    if (v1 == null) break block21;
                    var12_12 = 0;
                    for (Iterator var14_16 : var11_11) {
                        block19: {
                            block18: {
                                try {
                                    block23: {
                                        var15_17 = aG.b((JsonElement)var14_16, "auxtarget");
                                        var16_19 = aG.f((JsonObject)var15_17, "name");
                                        v2 = var15_17;
                                        v3 = "id";
                                        if (var3_5 == 0) break block17;
                                        var17_21 = aG.f(v2, v3);
                                        var18_22 = this.b((String)var17_21);
                                        if (var18_22 != null) ** GOTO lbl65
                                        var19_23 = new net.minecraft.ar.v("textures/effect/" + (String)var17_21 + ".png");
                                        var20_24 = null;
                                        try {
                                            var20_24 = this.c.a(var19_23);
                                        }
                                        catch (FileNotFoundException var21_26) {
                                            try {
                                                throw new net.minecraft.client.B.c("Render target or texture '" + (String)var17_21 + "' does not exist");
                                            }
                                            catch (Throwable var22_28) {
                                                IOUtils.closeQuietly(var20_24);
                                                throw var22_28;
                                            }
                                        }
                                        IOUtils.closeQuietly((Closeable)var20_24);
                                        var1_1.b(var19_23);
                                        var21_25 = var1_1.a(var19_23);
                                        var22_27 = aG.d((JsonObject)var15_17, "width");
                                        var23_29 = aG.d((JsonObject)var15_17, "height");
                                        v4 = var24_30 = aG.c((JsonObject)var15_17, "bilinear");
                                        if (var3_5 == 0) break block18;
                                        if (v4 == 0) break block23;
                                        v.c(3553, 10241, 9729);
                                        v.c(3553, 10240, 9729);
                                        if (var3_5 != 0) ** GOTO lbl63
                                    }
                                    v.c(3553, 10241, 9728);
                                    v4 = 3553;
                                }
                                catch (Exception var15_18) {
                                    var16_19 = net.minecraft.client.B.c.a(var15_18);
                                    var16_19.b("auxtargets[" + var12_12 + "]");
                                    throw var16_19;
                                }
                            }
                            v.c(v4, 10240, 9728);
lbl63:
                            // 2 sources

                            var10_10.a((String)var16_19, var21_25.c(), var22_27, var23_29);
                            if (var3_5 != 0) break block19;
lbl65:
                            // 2 sources

                            var10_10.a((String)var16_19, var18_22, var18_22.g, var18_22.b);
                        }
                        ++var12_12;
                        if (var3_5 != 0) continue;
                    }
                }
                v2 = var4_3;
                v3 = "uniforms";
            }
            v1 = aG.a(v2, v3, null);
        }
        if ((var12_13 = v1) == null) return;
        var13_15 = 0;
        var14_16 = var12_13.iterator();
        do {
            if (var14_16.hasNext() == false) return;
            var15_17 = (JsonElement)var14_16.next();
            try {
                this.b(var15_17);
            }
            catch (Exception var16_20) {
                var17_21 = net.minecraft.client.B.c.a(var16_20);
                var17_21.b("uniforms[" + var13_15 + "]");
                throw var17_21;
            }
            ++var13_15;
        } while (var3_5 != 0);
    }

    private void d() {
        this.d = new Matrix4f();
        this.d.setIdentity();
        this.d.m00 = 2.0f / (float)this.k.g;
        this.d.m11 = 2.0f / (float)(-this.k.b);
        this.d.m22 = -0.0020001999f;
        this.d.m33 = 1.0f;
        this.d.m03 = -1.0f;
        this.d.m13 = 1.0f;
        this.d.m23 = -1.0001999f;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public final String b() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    private b b(String string) {
        b b10;
        int n2 = net.minecraft.client.s.b.c();
        Object object = string;
        if (n2 != 0) {
            if (object == null) {
                return null;
            }
            object = string;
        }
        if (n2 != 0) {
            if (((String)object).equals("minecraft:main")) {
                b10 = this.k;
                return b10;
            }
            object = this.e.get(string);
        }
        b10 = (b)object;
        return b10;
    }

    public b a(String string) {
        return this.e.get(string);
    }

    public void c() {
        block5: {
            Object object;
            int n2;
            Iterator<Object> iterator;
            block4: {
                iterator = this.e.values().iterator();
                n2 = net.minecraft.client.s.b.c();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    ((b)object).e();
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                    }
                    break block4;
                }
                iterator = i.iterator();
            }
            while (iterator.hasNext()) {
                object = (c)iterator.next();
                ((c)object).c();
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block5;
            }
            i.clear();
        }
    }

    static {
        i = Lists.newArrayList();
    }
}

