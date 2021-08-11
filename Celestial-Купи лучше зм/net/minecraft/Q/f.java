/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class f
implements K<a> {
    private /* synthetic */ float b;
    private /* synthetic */ int a;
    private /* synthetic */ int c;

    public f(float f10, int n2, int n3) {
        this.b = f10;
        this.a = n2;
        this.c = n3;
    }

    public int b() {
        return this.c;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeFloat(this.b);
        m2.d(this.c);
        m2.d(this.a);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readFloat();
        this.c = m2.a();
        this.a = m2.a();
    }

    public int c() {
        return this.a;
    }

    public float a() {
        return this.b;
    }

    public f() {
    }
}

