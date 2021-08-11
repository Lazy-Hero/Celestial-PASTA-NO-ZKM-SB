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
public class k
extends j {
    private /* synthetic */ byte c;

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c;
    }

    @Override
    public float e() {
        return this.c;
    }

    public k a() {
        return new k(this.c);
    }

    @Override
    public long c() {
        return this.c;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.c);
    }

    @Override
    public String toString() {
        return this.c + "b";
    }

    public k(byte by2) {
        this.c = by2;
    }

    @Override
    public byte d() {
        return 1;
    }

    @Override
    public short a() {
        return this.c;
    }

    @Override
    public byte b() {
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
        byte by2 = super.equals(object);
        if (bl2) {
            if (by2 == 0) return 0 != 0;
            by2 = this.c;
        }
        if (!bl2) return by2 != 0;
        if (by2 != ((k)object).c) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public int f() {
        return this.c;
    }

    k() {
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(72L);
        this.c = dataInput.readByte();
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

