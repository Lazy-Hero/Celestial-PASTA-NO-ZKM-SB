/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ay;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.al.a;

public class c
implements K<a> {
    private /* synthetic */ int a;

    public int a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
    }

    public c() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
    }

    public c(int n2) {
        this.a = n2;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

