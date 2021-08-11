/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class ak
implements K<a> {
    private /* synthetic */ k a;

    public ak(k k2) {
        this.a = k2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.m();
    }

    public ak() {
    }

    public k a() {
        return this.a;
    }
}

