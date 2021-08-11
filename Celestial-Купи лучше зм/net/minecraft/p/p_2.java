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
public class p
extends j {
    private /* synthetic */ short c;

    public p a() {
        return new p(this.c);
    }

    @Override
    public double d() {
        return this.c;
    }

    @Override
    public byte d() {
        return 2;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c;
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    public byte b() {
        return (byte)(this.c & 0xFF);
    }

    @Override
    public int f() {
        return this.c;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(80L);
        this.c = dataInput.readShort();
    }

    public p() {
    }

    @Override
    public float e() {
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.a();
        short s2 = super.equals(object);
        if (bl2) {
            if (s2 == 0) return 0 != 0;
            s2 = this.c;
        }
        if (!bl2) return s2 != 0;
        if (s2 != ((p)object).c) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public String toString() {
        return this.c + "s";
    }

    public p(short s2) {
        this.c = s2;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.c);
    }

    @Override
    public short a() {
        return this.c;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

