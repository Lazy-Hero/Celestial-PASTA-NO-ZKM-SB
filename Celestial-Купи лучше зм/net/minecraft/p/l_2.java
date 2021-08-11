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
public class l
extends j {
    private /* synthetic */ double c;

    public l a() {
        return new l(this.c);
    }

    @Override
    public float e() {
        return (float)this.c;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.c);
    }

    @Override
    public short a() {
        return (short)(h.f(this.c) & 0xFFFF);
    }

    @Override
    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.c);
        return super.hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public long c() {
        return (long)Math.floor(this.c);
    }

    @Override
    public double d() {
        return this.c;
    }

    @Override
    public int f() {
        return h.f(this.c);
    }

    public l(double d10) {
        this.c = d10;
    }

    @Override
    public byte b() {
        return (byte)(h.f(this.c) & 0xFF);
    }

    @Override
    public String toString() {
        return this.c + "d";
    }

    l() {
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
            double d10 = this.c - ((l)object).c;
            bl3 = d10 == 0.0 ? (byte)0 : (d10 > 0.0 ? (byte)1 : -1);
        }
        if (bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    @Override
    public byte d() {
        return 6;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(128L);
        this.c = dataInput.readDouble();
    }
}

