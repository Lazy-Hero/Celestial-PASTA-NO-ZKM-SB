/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.i.g;
import net.minecraft.n.a;

public class t
implements K<a> {
    private /* synthetic */ boolean f;
    private /* synthetic */ float a;
    private /* synthetic */ boolean c;
    private /* synthetic */ boolean e;
    private /* synthetic */ float b;
    private /* synthetic */ boolean d;

    public boolean a() {
        return this.c;
    }

    @Override
    public void a(float f10) {
        this.b = f10;
    }

    public void d(boolean bl2) {
        this.f = bl2;
    }

    public boolean e() {
        return this.d;
    }

    public float f() {
        return this.a;
    }

    public t() {
    }

    @Override
    public void a(m m2) throws IOException {
        byte by2 = m2.readByte();
        boolean bl2 = aD.i();
        boolean bl3 = by2 & 1;
        if (bl2) {
            bl3 = bl3 > false;
        }
        this.d(bl3);
        boolean bl4 = by2 & 2;
        if (bl2) {
            bl4 = bl4 > false;
        }
        this.a(bl4);
        boolean bl5 = by2 & 4;
        if (bl2) {
            bl5 = bl5 > false;
        }
        this.b(bl5);
        boolean bl6 = by2 & 8;
        if (bl2) {
            bl6 = bl6 > false;
        }
        this.c(bl6);
        this.b(m2.readFloat());
        this.a(m2.readFloat());
    }

    public float d() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public void b(float f10) {
        this.a = f10;
    }

    public t(g g10) {
        this.d(g10.b);
        this.a(g10.e);
        this.b(g10.d);
        this.c(g10.g);
        this.b(g10.a());
        this.a(g10.c());
    }

    public boolean b() {
        return this.e;
    }

    public void c(boolean bl2) {
        this.e = bl2;
    }

    public boolean c() {
        return this.f;
    }

    public void b(boolean bl2) {
        this.d = bl2;
    }

    @Override
    public void a(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public void b(m m2) throws IOException {
        byte by2;
        block10: {
            byte by3;
            block9: {
                by2 = 0;
                boolean bl2 = aD.c();
                by3 = this.c();
                if (!bl2) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | true ? 1 : 0);
                    }
                    by3 = this.a();
                }
                if (!bl2) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | 2);
                    }
                    by3 = this.e();
                }
                if (!bl2) {
                    if (by3 != 0) {
                        by2 = (byte)(by2 | 4);
                    }
                    by3 = this.b();
                }
                if (bl2) break block9;
                if (by3 == 0) break block10;
                by3 = (byte)(by2 | 8);
            }
            by2 = by3;
        }
        m2.writeByte(by2);
        m2.writeFloat(this.a);
        m2.writeFloat(this.b);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

