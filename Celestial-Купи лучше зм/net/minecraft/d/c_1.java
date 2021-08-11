/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.d.z;
import net.minecraft.i.g;
import net.minecraft.k.m;
import net.minecraft.n.b;

public class c
implements K<b> {
    private /* synthetic */ boolean a;
    private /* synthetic */ boolean b;
    private /* synthetic */ float e;
    private /* synthetic */ boolean d;
    private /* synthetic */ boolean c;
    private /* synthetic */ float f;

    @Override
    public void a(float f10) {
        this.f = f10;
    }

    public boolean b() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        byte by2 = m2.readByte();
        int[] arrn = z.b();
        boolean bl2 = by2 & 1;
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        this.b(bl2);
        boolean bl3 = by2 & 2;
        if (arrn != null) {
            bl3 = bl3 > false;
        }
        this.c(bl3);
        boolean bl4 = by2 & 4;
        if (arrn != null) {
            bl4 = bl4 > false;
        }
        this.d(bl4);
        boolean bl5 = by2 & 8;
        if (arrn != null) {
            bl5 = bl5 > false;
        }
        this.a(bl5);
        this.b(m2.readFloat());
        this.a(m2.readFloat());
        if (arrn == null) {
            m.b(!m.d());
        }
    }

    public boolean a() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        byte by2;
        block10: {
            byte by3;
            block9: {
                by2 = 0;
                int[] arrn = z.b();
                by3 = this.b();
                if (arrn != null) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | true ? 1 : 0);
                    }
                    by3 = this.d();
                }
                if (arrn != null) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | 2);
                    }
                    by3 = this.a();
                }
                if (arrn != null) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | 4);
                    }
                    by3 = this.c();
                }
                if (arrn == null) break block9;
                if (by3 == 0) break block10;
                by3 = (byte)(by2 | 8);
            }
            by2 = by3;
        }
        m2.writeByte(by2);
        m2.writeFloat(this.e);
        m2.writeFloat(this.f);
    }

    public c(g g10) {
        this.b(g10.b);
        this.c(g10.e);
        this.d(g10.d);
        this.a(g10.g);
        this.b(g10.a());
        this.a(g10.c());
    }

    public void d(boolean bl2) {
        this.b = bl2;
    }

    @Override
    public void a(boolean bl2) {
        this.c = bl2;
    }

    public void b(float f10) {
        this.e = f10;
    }

    public c() {
    }

    public void b(boolean bl2) {
        this.a = bl2;
    }

    public boolean c() {
        return this.c;
    }

    public void c(boolean bl2) {
        this.d = bl2;
    }
}

