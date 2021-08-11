/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.P.g;
import net.minecraft.P.i;
import net.minecraft.P.j;
import net.minecraft.k.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends j {
    private /* synthetic */ float c;

    @Override
    public byte b() {
        return (byte)(h.d(this.c) & 0xFF);
    }

    @Override
    public double d() {
        return this.c;
    }

    @Override
    public float e() {
        return this.c;
    }

    public m(float f10) {
        this.c = f10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.f();
        boolean bl3 = super.equals(object);
        if (!bl2) {
            if (!bl3) return false;
            float f10 = this.c - ((m)object).c;
            bl3 = f10 == 0.0f ? (byte)0 : (f10 > 0.0f ? (byte)1 : -1);
        }
        if (bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    public m a() {
        return new m(this.c);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.c);
    }

    @Override
    public long c() {
        return (long)this.c;
    }

    @Override
    public String toString() {
        return this.c + "f";
    }

    @Override
    public short a() {
        return (short)(h.d(this.c) & 0xFFFF);
    }

    @Override
    public int f() {
        return h.d(this.c);
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.c);
    }

    @Override
    public byte d() {
        return 5;
    }

    m() {
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(96L);
        this.c = dataInput.readFloat();
    }
}

