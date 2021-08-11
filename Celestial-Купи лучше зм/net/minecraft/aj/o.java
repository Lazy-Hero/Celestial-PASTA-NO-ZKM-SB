/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.io.Files
 *  com.google.common.io.Resources
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
package net.minecraft.aj;

import com.google.common.cache.CacheLoader;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import net.minecraft.aj.h;
import net.minecraft.aj.i;
import net.minecraft.aj.j;
import net.minecraft.aj.m;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;

class o
extends CacheLoader<v, i> {
    final /* synthetic */ h a;

    private o(h h2) {
        this.a = h2;
    }

    o(h h2, m m2) {
        this(h2);
    }

    public i a(v v2) throws Exception {
        i i2;
        net.minecraft.k.m[] arrm;
        block8: {
            block7: {
                arrm = j.b();
                if (arrm == null) break block7;
                if (!v2.a().contains(".")) break block8;
                h.a().debug("Invalid loot table name '{}' (can't contain periods)", (Object)v2);
            }
            return i.b;
        }
        i i3 = i2 = this.c(v2);
        if (arrm != null) {
            if (i3 == null) {
                i2 = this.b(v2);
            }
            i3 = i2;
        }
        if (arrm != null) {
            if (i3 == null) {
                i2 = i.b;
                h.a().warn("Couldn't find resource table {}", (Object)v2);
            }
            i3 = i2;
        }
        return i3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    private i c(v var1_1) {
        block7: {
            var2_2 = j.b();
            v0 = h.a(this.a);
            if (var2_2 != null) {
                if (v0 == null) {
                    return null;
                }
                v0 = new File(new File(h.a(this.a), var1_1.c()), var1_1.a() + ".json");
            }
            var3_3 = v0;
            v1 = var3_3.exists();
            if (var2_2 == null) break block7;
            if (v1 == false) return null;
            v2 = var3_3;
            if (var2_2 == null) ** GOTO lbl20
            v1 = v2.isFile();
        }
        if (!v1) {
            h.a().warn("Expected to find loot table {} at {} but it was a folder.", (Object)var1_1, (Object)var3_3);
            return i.b;
        }
        try {
            v2 = var3_3;
lbl20:
            // 2 sources

            var4_4 = Files.toString((File)v2, (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException var5_5) {
            h.a().warn("Couldn't load loot table {} from {}", (Object)var1_1, (Object)var3_3, (Object)var5_5);
            return i.b;
        }
        try {
            return aG.a(h.b(), var4_4, i.class);
        }
        catch (JsonParseException | IllegalArgumentException var5_6) {
            h.a().error("Couldn't load loot table {} from {}", (Object)var1_1, (Object)var3_3, (Object)var5_6);
            return i.b;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    private i b(v var1_1) {
        var3_2 = h.class.getResource("/assets/" + var1_1.c() + "/loot_tables/" + var1_1.a() + ".json");
        var2_3 = j.b();
        v0 = var3_2;
        if (var2_3 == null) ** GOTO lbl8
        if (v0 == null) return null;
        try {
            v0 = var3_2;
lbl8:
            // 2 sources

            var4_4 = Resources.toString((URL)v0, (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException var5_5) {
            h.a().warn("Couldn't load loot table {} from {}", (Object)var1_1, (Object)var3_2, (Object)var5_5);
            return i.b;
        }
        try {
            return aG.a(h.b(), var4_4, i.class);
        }
        catch (JsonParseException var5_6) {
            h.a().error("Couldn't load loot table {} from {}", (Object)var1_1, (Object)var3_2, (Object)var5_6);
            return i.b;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

