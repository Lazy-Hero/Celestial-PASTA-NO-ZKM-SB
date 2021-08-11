/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class p
implements K<b> {
    private /* synthetic */ short a;
    private /* synthetic */ int c;
    private /* synthetic */ boolean b;

    @Override
    public void b(m m2) throws IOException {
        int[] arrn = z.b();
        m2.writeByte(this.c);
        int[] arrn2 = arrn;
        m2.writeShort(this.a);
        int n2 = this.b;
        if (arrn2 != null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        m2.writeByte(n2);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public short c() {
        return this.a;
    }

    public p() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.readByte();
        this.a = m2.readShort();
        int[] arrn = z.b();
        byte by2 = m2.readByte();
        if (arrn != null) {
            by2 = by2 != 0 ? (byte)1 : 0;
        }
        this.b = by2;
    }

    public p(int n2, short s2, boolean bl2) {
        this.c = n2;
        this.a = s2;
        this.b = bl2;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }
}

