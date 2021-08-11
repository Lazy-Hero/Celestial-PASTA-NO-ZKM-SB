/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ay;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.at.k;
import net.minecraft.at.o;

public class a
implements K<net.minecraft.al.a> {
    private /* synthetic */ k a;

    public k a() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = o.b(m2.c(32767));
    }

    @Override
    public void a(net.minecraft.al.a a10) {
        a10.a(this);
    }

    public a() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
    }

    public a(k k2) {
        this.a = k2;
    }
}

