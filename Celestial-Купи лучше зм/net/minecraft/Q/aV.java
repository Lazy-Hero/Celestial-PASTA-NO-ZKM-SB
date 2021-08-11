/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.Q.aD;

public class aV
extends aD {
    public aV() {
        this.g = true;
    }

    @Override
    public void b(m m2) throws IOException {
        super.b(m2);
        m2.writeByte(this.i);
        m2.writeByte(this.f);
        m2.writeBoolean(this.b);
    }

    @Override
    public void a(m m2) throws IOException {
        super.a(m2);
        this.i = m2.readByte();
        this.f = m2.readByte();
        this.b = m2.readBoolean();
    }

    public aV(int n2, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.i = by2;
        this.f = by3;
        this.g = true;
        this.b = bl2;
    }
}

