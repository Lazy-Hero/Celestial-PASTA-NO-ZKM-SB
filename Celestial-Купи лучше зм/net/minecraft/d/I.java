/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class I
implements K<b> {
    private /* synthetic */ int a;

    public I(int n2) {
        this.a = n2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeShort(this.a);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readShort();
    }

    public I() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }
}

