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

public class al
implements K<a> {
    private /* synthetic */ s d;
    private /* synthetic */ e b;
    private /* synthetic */ int a;
    private /* synthetic */ L c;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int d() {
        return this.a;
    }

    public e b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.a);
        m2.writeByte(this.b.a());
        m2.writeByte(this.d.c());
        m2.a(this.c.b());
    }

    public al(int n2, e e10, L l2, s s2) {
        this.a = n2;
        this.b = e10;
        this.d = s2;
        this.c = l2;
    }

    @Override
    public void a(m m2) throws IOException {
        block3: {
            block2: {
                this.a = m2.readInt();
                boolean bl2 = aD.c();
                this.b = e.a(m2.readUnsignedByte());
                this.d = s.a(m2.readUnsignedByte());
                this.c = L.a(m2.c(16));
                al al2 = this;
                if (bl2) break block2;
                if (al2.c != null) break block3;
                al2 = this;
            }
            al2.c = L.a;
        }
    }

    public s a() {
        return this.d;
    }

    public L c() {
        return this.c;
    }

    public al() {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

