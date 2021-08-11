/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class aA
implements K<a> {
    private /* synthetic */ int e;
    private /* synthetic */ byte c;
    private /* synthetic */ byte b;
    private /* synthetic */ int d;
    private /* synthetic */ byte a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        boolean bl2 = aD.i();
        boolean bl3 = this.d;
        if (bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    public boolean a() {
        boolean bl2 = aD.i();
        boolean bl3 = this.b & 2;
        if (bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public boolean b() {
        boolean bl2 = aD.c();
        boolean bl3 = this.b & 1;
        if (!bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    public byte g() {
        return this.a;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.e);
        m2.writeByte(this.a);
        m2.writeByte(this.c);
        m2.d(this.d);
        m2.writeByte(this.b);
    }

    public byte d() {
        return this.c;
    }

    public aA(int n2, j j2) {
        block8: {
            boolean bl2;
            block7: {
                byte by2;
                block5: {
                    aA aA2;
                    block6: {
                        boolean bl3 = aD.c();
                        this.e = n2;
                        bl2 = bl3;
                        this.a = (byte)(net.minecraft.K.b.a(j2.g()) & 0xFF);
                        aA2 = this;
                        by2 = (byte)(j2.h() & 0xFF);
                        if (bl2) break block5;
                        aA2.c = by2;
                        if (j2.e() <= 32767) break block6;
                        this.d = 32767;
                        if (!bl2) break block7;
                    }
                    aA2 = this;
                    by2 = (byte)j2.e();
                }
                aA2.d = by2;
            }
            this.b = 0;
            boolean bl4 = j2.c();
            if (!bl2) {
                if (bl4) {
                    this.b = (byte)(this.b | 1);
                }
                bl4 = j2.f();
            }
            if (!bl4) break block8;
            this.b = (byte)(this.b | 2);
        }
    }

    public aA() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.e = m2.a();
        this.a = m2.readByte();
        this.c = m2.readByte();
        this.d = m2.a();
        this.b = m2.readByte();
    }
}

