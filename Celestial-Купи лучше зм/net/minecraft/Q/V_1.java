/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class V
implements K<a> {
    private /* synthetic */ long a;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readLong();
    }

    public V(long l2) {
        this.a = l2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeLong(this.a);
    }

    public V() {
    }

    public long a() {
        return this.a;
    }
}

