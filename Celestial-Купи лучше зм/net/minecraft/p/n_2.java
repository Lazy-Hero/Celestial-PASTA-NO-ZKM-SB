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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
extends j {
    private /* synthetic */ int c;

    @Override
    public byte d() {
        return 3;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c;
    }

    public n(int n2) {
        this.c = n2;
    }

    public n a() {
        return new n(this.c);
    }

    @Override
    public double d() {
        return this.c;
    }

    @Override
    public int f() {
        return this.c;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.f();
        int n2 = super.equals(object);
        if (!bl2) {
            if (n2 == 0) return 0 != 0;
            n2 = this.c;
        }
        if (bl2) return n2 != 0;
        if (n2 != ((n)object).c) return 0 != 0;
        return 1 != 0;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(96L);
        this.c = dataInput.readInt();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public short a() {
        return (short)(this.c & 0xFFFF);
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public float e() {
        return this.c;
    }

    n() {
    }

    @Override
    public byte b() {
        return (byte)(this.c & 0xFF);
    }

    @Override
    public String toString() {
        return String.valueOf(this.c);
    }
}

