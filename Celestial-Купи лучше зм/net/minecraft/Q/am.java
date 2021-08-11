/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.ah.L;
import net.minecraft.ah.e;
import net.minecraft.ah.s;
import net.minecraft.n.a;

public class am
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ e d;
    private /* synthetic */ L h;
    private /* synthetic */ int c;
    private /* synthetic */ boolean b;
    private /* synthetic */ s g;
    private /* synthetic */ int e;
    private /* synthetic */ boolean f;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public am(int n2, s s2, boolean bl2, int n3, e e10, int n4, L l2, boolean bl3) {
        this.e = n2;
        this.a = n3;
        this.d = e10;
        this.g = s2;
        this.c = n4;
        this.f = bl2;
        this.h = l2;
        this.b = bl3;
    }

    public e e() {
        return this.d;
    }

    public am() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.e);
        int n2 = this.g.c();
        boolean bl2 = aD.c();
        if (!bl2) {
            if (this.f) {
                n2 |= 8;
            }
            m2.writeByte(n2);
            m2.writeInt(this.a);
            m2.writeByte(this.d.a());
            m2.writeByte(this.c);
            m2.a(this.h.b());
            m2.writeBoolean(this.b);
        }
    }

    public boolean b() {
        return this.f;
    }

    @Override
    public void a(m m2) throws IOException {
        this.e = m2.readInt();
        int n2 = m2.readUnsignedByte();
        boolean bl2 = aD.i();
        int n3 = n2 & 8;
        if (bl2) {
            n3 = n3 == 8 ? 1 : 0;
        }
        this.f = n3;
        this.g = s.a(n2 &= 0xFFFFFFF7);
        this.a = m2.readInt();
        this.d = net.minecraft.ah.e.a(m2.readUnsignedByte());
        this.c = m2.readUnsignedByte();
        this.h = L.a(m2.c(16));
        am am2 = this;
        if (bl2) {
            if (am2.h == null) {
                this.h = L.a;
            }
            am2 = this;
        }
        am2.b = m2.readBoolean();
    }

    public int a() {
        return this.e;
    }

    public int g() {
        return this.a;
    }

    public L h() {
        return this.h;
    }

    public boolean f() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public s d() {
        return this.g;
    }

    public int c() {
        return this.c;
    }
}

