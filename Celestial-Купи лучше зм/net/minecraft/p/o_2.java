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
public class o
extends j {
    private /* synthetic */ long c;

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(128L);
        this.c = dataInput.readLong();
    }

    o() {
    }

    @Override
    public short a() {
        return (short)(this.c & 0xFFFFL);
    }

    @Override
    public byte d() {
        return 4;
    }

    @Override
    public String toString() {
        return this.c + "L";
    }

    @Override
    public int f() {
        return (int)(this.c & 0xFFFFFFFFFFFFFFFFL);
    }

    public o(long l2) {
        this.c = l2;
    }

    @Override
    public byte b() {
        return (byte)(this.c & 0xFFL);
    }

    public o a() {
        return new o(this.c);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.c ^ this.c >>> 32);
    }

    @Override
    public float e() {
        return this.c;
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public double d() {
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.a();
        boolean bl3 = super.equals(object);
        if (bl2) {
            if (!bl3) return false;
            long l2 = this.c - ((o)object).c;
            bl3 = l2 == 0L ? (char)'\u0000' : (l2 < 0L ? (char)'\uffffffff' : '\u0001');
        }
        if (!bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.c);
    }
}

