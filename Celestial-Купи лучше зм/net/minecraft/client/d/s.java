/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import net.minecraft.ar.v;
import net.minecraft.client.D.h;
import net.minecraft.client.D.k;

class s
extends InputStream {
    private /* synthetic */ boolean c;
    private final /* synthetic */ String b;
    private final /* synthetic */ InputStream a;

    @Override
    public void close() throws IOException {
        this.a.close();
        this.c = true;
    }

    protected void finalize() throws Throwable {
        boolean bl2 = h.c();
        s s2 = this;
        if (bl2) {
            if (!s2.c) {
                k.a().warn(this.b);
            }
            s2 = this;
        }
        super.finalize();
    }

    public s(InputStream inputStream, v v2, String string) {
        this.a = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.b = "Leaked resource: '" + v2 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public int read() throws IOException {
        return this.a.read();
    }
}

