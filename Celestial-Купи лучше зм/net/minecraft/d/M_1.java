/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class M
implements K<b> {
    private /* synthetic */ long a;

    public M(long l2) {
        this.a = l2;
    }

    public M() {
    }

    public long a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readLong();
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeLong(this.a);
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }
}

