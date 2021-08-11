/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import net.minecraft.client.D.t;
import net.minecraft.client.j.e;
import net.minecraft.client.j.p;
import net.minecraft.client.v.b;
import net.minecraft.client.v.c;
import net.minecraft.client.v.d;
import net.minecraft.client.v.f;
import net.minecraft.client.v.h;
import net.minecraft.client.v.j;
import net.minecraft.client.v.m;
import net.minecraft.client.v.o;
import net.minecraft.client.v.q;
import org.apache.commons.io.IOUtils;

public class cg
extends e {
    private static final /* synthetic */ o g;
    private final /* synthetic */ String h;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private q a() {
        String string = this.h + ".mcmeta";
        String string2 = dB.i();
        String string3 = "texture";
        InputStream inputStream = cS.m(string);
        if (inputStream != null) {
            q q2;
            q q3;
            o o2 = g;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                q q4 = q3 = (q)o2.a(string3, jsonObject);
                if (string2 != null) {
                    if (q4 == null) {
                        q q5 = new q(false, false);
                        return q5;
                    }
                    q4 = q3;
                }
                q2 = q4;
            }
            catch (RuntimeException runtimeException) {
                fC.c("Error reading metadata: " + string);
                fC.c("" + runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                q3 = new q(false, false);
                return q3;
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            return q2;
        }
        return new q(false, false);
    }

    private static o b() {
        o o2 = new o();
        o2.a(new f(), q.class);
        o2.a(new c(), net.minecraft.client.v.p.class);
        o2.a(new b(), h.class);
        o2.a(new net.minecraft.client.v.e(), m.class);
        o2.a(new d(), j.class);
        return o2;
    }

    public cg(String string) {
        this.h = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(t var1_1) throws IOException {
        v0 = dB.i();
        this.c();
        var2_2 = v0;
        v1 = var3_3 = cS.m(this.h);
        if (var2_2 == null) ** GOTO lbl10
        if (v1 == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.h);
        }
        try {
            v1 = var3_3;
lbl10:
            // 2 sources

            var4_4 = p.a(v1);
            var5_5 = this.a();
            p.a(this.c(), var4_4, var5_5.a(), var5_5.b());
            return;
        }
        finally {
            IOUtils.closeQuietly((InputStream)var3_3);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        g = cg.b();
    }
}

