/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.j.p;
import net.minecraft.client.v.l;
import net.minecraft.client.v.o;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class M
implements a {
    public final /* synthetic */ File a;
    private static final /* synthetic */ Logger b;

    private static String a(v v2) {
        return String.format("%s/%s/%s", "assets", v2.c(), v2.a());
    }

    protected abstract InputStream a(String var1) throws IOException;

    protected void b(String string) {
        b.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", (Object)string, (Object)this.a);
    }

    public M(File file) {
        this.a = file;
    }

    protected abstract boolean c(String var1);

    protected static String a(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public boolean b(v v2) {
        return this.c(M.a(v2));
    }

    static {
        b = LogManager.getLogger();
    }

    static <T extends l> T a(o o2, InputStream inputStream, String string) {
        JsonObject jsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new JsonParseException((Throwable)runtimeException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        return o2.a(string, jsonObject);
    }

    @Override
    public BufferedImage c() throws IOException {
        return p.a(this.a("pack.png"));
    }

    @Override
    public <T extends l> T a(o o2, String string) throws IOException {
        return M.a(o2, this.a("pack.mcmeta"), string);
    }

    @Override
    public String b() {
        return this.a.getName();
    }

    @Override
    public InputStream a(v v2) throws IOException {
        return this.a(M.a(v2));
    }
}

