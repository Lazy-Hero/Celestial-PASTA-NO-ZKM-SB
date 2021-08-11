/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class aO
implements K<a> {
    private /* synthetic */ short c;
    private /* synthetic */ int b;
    private /* synthetic */ boolean a;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public aO(int n2, short s2, boolean bl2) {
        this.b = n2;
        this.c = s2;
        this.a = bl2;
    }

    public boolean c() {
        return this.a;
    }

    public short b() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readUnsignedByte();
        this.c = m2.readShort();
        this.a = m2.readBoolean();
    }

    public int a() {
        return this.b;
    }

    public aO() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        m2.writeShort(this.c);
        m2.writeBoolean(this.a);
    }
}

