/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.b;

public class l
implements K<b> {
    private /* synthetic */ int a;

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public int a() {
        return this.a;
    }

    public l() {
    }

    public l(int n2) {
        this.a = n2;
    }
}

