/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.J;
import net.minecraft.n.b;

public class s
implements K<b> {
    private /* synthetic */ J a;

    public s(J j2) {
        this.a = j2;
    }

    public J a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a(J.class);
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public s() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }
}

