/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.ar.a3;
import net.minecraft.n.b;

public class H
implements K<b> {
    private /* synthetic */ a3 a;

    public H(a3 a32) {
        this.a = a32;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public a3 a() {
        return this.a;
    }

    public H() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a(a3.class);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }
}

