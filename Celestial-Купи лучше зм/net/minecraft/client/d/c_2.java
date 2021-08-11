/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.client.D.h;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c {
    private final /* synthetic */ Map<String, File> b;
    private static final /* synthetic */ Logger a;

    public File a() {
        return this.b.get("pack.mcmeta");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(v v2) {
        File file = this.b(v2);
        boolean bl2 = h.c();
        File file2 = file;
        if (bl2) {
            if (file2 == null) return false;
            file2 = file;
        }
        boolean bl3 = file2.isFile();
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Nullable
    public File b(v v2) {
        String string = v2.toString();
        return this.b.get(string);
    }

    protected c() {
        this.b = Maps.newHashMap();
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    static {
        a = LogManager.getLogger();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public c(File var1_1, String var2_2) {
        super();
        this.b = Maps.newHashMap();
        var3_3 = h.c();
        var4_4 = new File(var1_1, "objects");
        var5_5 = new File(var1_1, "indexes/" + var2_2 + ".json");
        var6_6 = null;
        try {
            var6_6 = Files.newReader((File)var5_5, (Charset)StandardCharsets.UTF_8);
            var7_7 = new JsonParser().parse((Reader)var6_6).getAsJsonObject();
            var8_10 = aG.a(var7_7, "objects", null);
            if (var3_3 == false) return;
            if (var8_10 == null) return;
            var9_11 = var8_10.entrySet().iterator();
            do {
                if (var9_11.hasNext() == false) return;
                var10_12 = (Map.Entry)var9_11.next();
                var11_13 = (JsonObject)var10_12.getValue();
                var12_14 = (String)var10_12.getKey();
                var13_15 = var12_14.split("/", 2);
                if (var3_3 == false) return;
                v0 = var13_15;
                if (!var3_3) ** GOTO lbl25
                if (v0.length == 1) {
                    v0 = var13_15;
lbl25:
                    // 2 sources

                    v1 = v0[0];
                } else {
                    v1 = var13_15[0] + ":" + var13_15[1];
                }
                var14_16 = v1;
                var15_17 = aG.f(var11_13, "hash");
                var16_18 = new File(var4_4, var15_17.substring(0, 2) + "/" + var15_17);
                this.b.put(var14_16, var16_18);
            } while (var3_3);
            return;
        }
        catch (JsonParseException var7_8) {
            c.a.error("Unable to parse resource index file: {}", (Object)var5_5);
            return;
        }
        catch (FileNotFoundException var7_9) {
            c.a.error("Can't find the resource index file: {}", (Object)var5_5);
            return;
        }
        finally {
            IOUtils.closeQuietly((Reader)var6_6);
        }
    }
}

