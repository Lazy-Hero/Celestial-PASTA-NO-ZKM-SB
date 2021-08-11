/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.d.z;

public class A
extends z {
    @Override
    public void b(m m2) throws IOException {
        m2.writeDouble(this.i);
        m2.writeDouble(this.c);
        m2.writeDouble(this.d);
        super.b(m2);
    }

    @Override
    public void a(m m2) throws IOException {
        this.i = m2.readDouble();
        this.c = m2.readDouble();
        this.d = m2.readDouble();
        super.a(m2);
    }

    public A() {
        this.e = true;
    }

    public A(double d10, double d11, double d12, boolean bl2) {
        this.i = d10;
        this.c = d11;
        this.d = d12;
        this.g = bl2;
        this.e = true;
    }
}

