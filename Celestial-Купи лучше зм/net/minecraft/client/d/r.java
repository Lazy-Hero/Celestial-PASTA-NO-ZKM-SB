/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.D;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.client.D.h;
import net.minecraft.client.D.v;
import net.minecraft.client.v.l;
import net.minecraft.client.v.o;
import org.apache.commons.io.IOUtils;

public class r
implements v {
    private final /* synthetic */ InputStream a;
    private final /* synthetic */ net.minecraft.ar.v b;
    private final /* synthetic */ InputStream d;
    private /* synthetic */ boolean e;
    private final /* synthetic */ String f;
    private /* synthetic */ JsonObject h;
    private final /* synthetic */ o g;
    private final /* synthetic */ Map<String, l> c;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public <T extends l> T a(String var1_1) {
        var2_2 = net.minecraft.client.D.h.c();
        v0 = this;
        if (var2_2) {
            if (!v0.a()) {
                return null;
            }
            v0 = this;
        }
        v1 /* !! */  = v0.h;
        if (var2_2) {
            if (v1 /* !! */  == null) {
                v1 /* !! */  = this;
                if (var2_2) {
                    if (!v1 /* !! */ .e) {
                        this.e = true;
                        var3_3 = null;
                        try {
                            var3_3 = new BufferedReader(new InputStreamReader(this.a, StandardCharsets.UTF_8));
                            this.h = new JsonParser().parse((Reader)var3_3).getAsJsonObject();
                            ** break block11
                        }
                        finally {
                            IOUtils.closeQuietly((Reader)var3_3);
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v1 /* !! */  = this.c.get(var1_1);
            }
        }
        var3_3 = (l)v1 /* !! */ ;
        v2 = var3_3;
        if (var2_2 == false) return (T)v2;
        if (v2 == null) {
            var3_3 = this.g.a(var1_1, this.h);
        }
        v2 = var3_3;
        return (T)v2;
    }

    @Override
    public void close() throws IOException {
        block3: {
            InputStream inputStream;
            block2: {
                boolean bl2 = net.minecraft.client.D.h.c();
                this.d.close();
                boolean bl3 = bl2;
                inputStream = this.a;
                if (!bl3) break block2;
                if (inputStream == null) break block3;
                inputStream = this.a;
            }
            inputStream.close();
        }
    }

    @Override
    public InputStream c() {
        return this.d;
    }

    @Override
    public String d() {
        return this.f;
    }

    public r(String string, net.minecraft.ar.v v2, InputStream inputStream, InputStream inputStream2, o o2) {
        this.c = Maps.newHashMap();
        this.f = string;
        this.b = v2;
        this.d = inputStream;
        this.a = inputStream2;
        this.g = o2;
    }

    public boolean equals(Object object) {
        r r2;
        r r3;
        boolean bl2;
        block13: {
            block14: {
                net.minecraft.ar.v v2;
                block11: {
                    block12: {
                        bl2 = net.minecraft.client.D.h.b();
                        Object object2 = this;
                        if (!bl2) {
                            if (object2 == object) {
                                return true;
                            }
                            object2 = object;
                        }
                        if (!bl2) {
                            if (!(object2 instanceof r)) {
                                return false;
                            }
                            object2 = object;
                        }
                        r3 = (r)object2;
                        v2 = this.b;
                        if (bl2) break block11;
                        if (v2 == null) break block12;
                        r2 = this;
                        if (bl2) break block13;
                        if (!r2.b.equals(r3.b)) {
                            return false;
                        }
                        break block14;
                    }
                    r2 = r3;
                    if (bl2) break block13;
                    v2 = r2.b;
                }
                if (v2 != null) {
                    return false;
                }
            }
            r2 = this;
        }
        String string = r2.f;
        if (!bl2) {
            if (string != null) {
                return this.f.equals(r3.f);
            }
            string = r3.f;
        }
        return string == null;
    }

    @Override
    public boolean a() {
        return this.a != null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int hashCode() {
        var1_1 = net.minecraft.client.D.h.b();
        v0 = this.f;
        if (var1_1) ** GOTO lbl6
        if (v0 != null) {
            v0 = this.f;
lbl6:
            // 2 sources

            v1 = v0.hashCode();
        } else {
            v1 = 0;
        }
        var2_2 = v1;
        v2 = this.b;
        if (var1_1) ** GOTO lbl14
        if (v2 != null) {
            v2 = this.b;
lbl14:
            // 2 sources

            v3 = v2.hashCode();
            return 31 * var2_2 + v3;
        } else {
            v3 = 0;
        }
        return 31 * var2_2 + v3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public net.minecraft.ar.v b() {
        return this.b;
    }
}

