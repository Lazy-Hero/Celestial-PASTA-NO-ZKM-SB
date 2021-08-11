/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import net.minecraft.ar.v;
import net.minecraft.client.e.i;

final class B
extends URLStreamHandler {
    final /* synthetic */ v a;

    B(v v2) {
        this.a = v2;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new i(this, uRL);
    }
}

