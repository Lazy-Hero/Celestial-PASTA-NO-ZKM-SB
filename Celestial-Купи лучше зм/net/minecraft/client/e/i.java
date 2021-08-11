/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.client.Q;
import net.minecraft.client.e.B;

class i
extends URLConnection {
    final /* synthetic */ B a;

    @Override
    public InputStream getInputStream() throws IOException {
        return Q.P().O().a(this.a.a).c();
    }

    i(B b10, URL uRL) {
        this.a = b10;
        super(uRL);
    }

    @Override
    public void connect() throws IOException {
    }
}

