/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class z
implements K<a> {
    private /* synthetic */ n a;

    public z() {
    }

    public z(n n2) {
        this.a = n2;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.l();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    public n a() {
        return this.a;
    }
}

