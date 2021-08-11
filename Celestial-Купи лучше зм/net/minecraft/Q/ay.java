/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.Q.aD;

public class ay
extends aD {
    public ay() {
        this.g = true;
    }

    public ay(int n2, long l2, long l3, long l4, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.e = (int)l2;
        this.a = (int)l3;
        this.h = (int)l4;
        this.i = by2;
        this.f = by3;
        this.b = bl2;
        this.g = true;
    }

    @Override
    public void b(m m2) throws IOException {
        super.b(m2);
        m2.writeShort(this.e);
        m2.writeShort(this.a);
        m2.writeShort(this.h);
        m2.writeByte(this.i);
        m2.writeByte(this.f);
        m2.writeBoolean(this.b);
    }

    @Override
    public void a(m m2) throws IOException {
        super.a(m2);
        this.e = m2.readShort();
        this.a = m2.readShort();
        this.h = m2.readShort();
        this.i = m2.readByte();
        this.f = m2.readByte();
        this.b = m2.readBoolean();
    }
}

