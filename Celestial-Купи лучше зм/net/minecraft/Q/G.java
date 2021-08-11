/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class G
implements K<a> {
    private /* synthetic */ float a;
    private /* synthetic */ float c;
    private /* synthetic */ int b;

    @Override
    public void b(m m2) throws IOException {
        m2.writeFloat(this.a);
        m2.d(this.b);
        m2.writeFloat(this.c);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readFloat();
        this.b = m2.a();
        this.c = m2.readFloat();
    }

    public G() {
    }

    public int c() {
        return this.b;
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public G(float f10, int n2, float f11) {
        this.a = f10;
        this.b = n2;
        this.c = f11;
    }
}

