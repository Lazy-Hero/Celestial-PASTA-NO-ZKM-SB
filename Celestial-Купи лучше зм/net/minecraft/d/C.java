/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.d.z;

public class C
extends z {
    public C(float f10, float f11, boolean bl2) {
        this.b = f10;
        this.a = f11;
        this.g = bl2;
        this.h = true;
    }

    public C() {
        this.h = true;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeFloat(this.b);
        m2.writeFloat(this.a);
        super.b(m2);
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readFloat();
        this.a = m2.readFloat();
        super.a(m2);
    }
}

