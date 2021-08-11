/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.d.z;

public class B
extends z {
    @Override
    public void a(m m2) throws IOException {
        this.i = m2.readDouble();
        this.c = m2.readDouble();
        this.d = m2.readDouble();
        this.b = m2.readFloat();
        this.a = m2.readFloat();
        super.a(m2);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeDouble(this.i);
        m2.writeDouble(this.c);
        m2.writeDouble(this.d);
        m2.writeFloat(this.b);
        m2.writeFloat(this.a);
        super.b(m2);
    }

    public B() {
        this.e = true;
        this.h = true;
    }

    public B(double d10, double d11, double d12, float f10, float f11, boolean bl2) {
        this.i = d10;
        this.c = d11;
        this.d = d12;
        this.b = f10;
        this.a = f11;
        this.g = bl2;
        this.h = true;
        this.e = true;
    }
}

