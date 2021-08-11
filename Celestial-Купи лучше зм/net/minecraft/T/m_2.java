/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import net.minecraft.t.i;

class m
extends ByteArrayOutputStream {
    private final /* synthetic */ int a;
    private final /* synthetic */ int c;
    final /* synthetic */ i b;

    public m(i i2, int n2, int n3) {
        this.b = i2;
        super(8096);
        this.c = n2;
        this.a = n3;
    }

    @Override
    public void close() throws IOException {
        this.b.a(this.c, this.a, this.buf, this.count);
    }
}

