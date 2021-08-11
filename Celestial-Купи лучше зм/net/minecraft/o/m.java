/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.o.a;

public class m {
    private final /* synthetic */ byte[] a;

    public void a(int n2, int n3) {
        block4: {
            int n4;
            block2: {
                m m2;
                block3: {
                    n4 = this.b(n2);
                    int[] arrn = net.minecraft.o.a.k();
                    m2 = this;
                    if (arrn == null) break block2;
                    if (!m2.c(n2)) break block3;
                    this.a[n4] = (byte)(this.a[n4] & 0xF0 | n3 & 0xF);
                    if (arrn != null) break block4;
                }
                m2 = this;
            }
            m2.a[n4] = (byte)(this.a[n4] & 0xF | (n3 & 0xF) << 4);
        }
    }

    private int a(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private int b(int n2) {
        return n2 >> 1;
    }

    private boolean c(int n2) {
        int[] arrn = net.minecraft.o.a.k();
        boolean bl2 = n2 & 1;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.a(this.a(n2, n3, n4), n5);
    }

    public m(byte[] arrby) {
        this.a = arrby;
        if (arrby.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + arrby.length);
        }
    }

    public byte[] a() {
        return this.a;
    }

    public int b(int n2, int n3, int n4) {
        return this.a(this.a(n2, n3, n4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2) {
        int n3;
        int n4 = this.b(n2);
        int[] arrn = net.minecraft.o.a.k();
        int n5 = this.c(n2);
        if (arrn != null) {
            if (n5 != 0) {
                n3 = this.a[n4] & 0xF;
                return n3;
            }
            n5 = this.a[n4] >> 4;
        }
        n3 = n5 & 0xF;
        return n3;
    }

    public m() {
        this.a = new byte[2048];
    }
}

