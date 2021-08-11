/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.BufferUtils
 */
package net.minecraft.client.s;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import net.minecraft.ar.v;
import net.minecraft.client.B.c;
import net.minecraft.client.D.t;
import net.minecraft.client.a.as;
import net.minecraft.client.s.a;
import net.minecraft.client.s.b;
import net.minecraft.client.s.i;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class h {
    private final /* synthetic */ String b;
    private final /* synthetic */ i d;
    private /* synthetic */ int c;
    private final /* synthetic */ int a;

    private static Exception a(Exception exception) {
        return exception;
    }

    public void b(a a10) {
        block3: {
            int n2;
            block2: {
                int n3 = net.minecraft.client.s.b.g();
                n2 = --this.c;
                if (n3 != 0) break block2;
                if (n2 > 0) break block3;
                n2 = this.a;
            }
            as.c(n2);
            i.b(this.d).remove(this.b);
        }
    }

    public String a() {
        return this.b;
    }

    public void a(a a10) {
        ++this.c;
        as.c(a10.h(), this.a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h a(t t2, i i2, String string) throws IOException {
        h h2 = (h)i.b(i2).get(string);
        int n2 = net.minecraft.client.s.b.g();
        h h3 = h2;
        if (n2 != 0) return h3;
        if (h3 == null) {
            v v2 = new v("shaders/program/" + string + i.a(i2));
            net.minecraft.client.D.v v3 = t2.a(v2);
            byte[] arrby = IOUtils.toByteArray((InputStream)new BufferedInputStream(v3.c()));
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)arrby.length);
            byteBuffer.put(arrby);
            byteBuffer.position(0);
            int n3 = as.g(i.c(i2));
            as.a(n3, byteBuffer);
            as.h(n3);
            if (n2 == 0) {
                if (as.f(n3, as.ad) == 0) {
                    String string2 = StringUtils.trim((String)as.i(n3, 32768));
                    c c10 = new c("Couldn't compile " + i2.b() + " program: " + string2);
                    c10.a(v2.a());
                    throw c10;
                }
                h2 = new h(i2, n3, string);
                i.b(i2).put(string, h2);
            }
        }
        h3 = h2;
        return h3;
    }

    private h(i i2, int n2, String string) {
        this.d = i2;
        this.a = n2;
        this.b = string;
    }
}

