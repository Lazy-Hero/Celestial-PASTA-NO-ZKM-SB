/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class y
implements K<b> {
    private /* synthetic */ boolean c;
    private /* synthetic */ boolean a;
    private /* synthetic */ float d;
    private /* synthetic */ float b;

    @Override
    public void b(m m2) throws IOException {
        byte by2;
        block6: {
            byte by3;
            block5: {
                int[] arrn = z.b();
                m2.writeFloat(this.d);
                int[] arrn2 = arrn;
                m2.writeFloat(this.b);
                by2 = 0;
                by3 = this.c;
                if (arrn2 != null) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | true ? 1 : 0);
                    }
                    by3 = this.a;
                }
                if (arrn2 == null) break block5;
                if (by3 == 0) break block6;
                by3 = (byte)(by2 | 2);
            }
            by2 = by3;
        }
        m2.writeByte(by2);
    }

    public boolean b() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        this.d = m2.readFloat();
        int[] arrn = z.b();
        this.b = m2.readFloat();
        byte by2 = m2.readByte();
        int n2 = by2 & 1;
        if (arrn != null) {
            n2 = n2 > 0 ? 1 : 0;
        }
        this.c = n2;
        int n3 = by2 & 2;
        if (arrn != null) {
            n3 = n3 > 0 ? 1 : 0;
        }
        this.a = n3;
    }

    public y(float f10, float f11, boolean bl2, boolean bl3) {
        this.d = f10;
        this.b = f11;
        this.c = bl2;
        this.a = bl3;
    }

    public boolean d() {
        return this.a;
    }

    public float a() {
        return this.b;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public float c() {
        return this.d;
    }

    public y() {
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }
}

