/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class w
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ int a;
    private /* synthetic */ int c;

    public w() {
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public w(int n2, int n3, int n4) {
        this.a = n2;
        this.c = n3;
        this.b = n4;
    }

    public int c() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readUnsignedByte();
        this.c = m2.readShort();
        this.b = m2.readShort();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.a);
        m2.writeShort(this.c);
        m2.writeShort(this.b);
    }
}

