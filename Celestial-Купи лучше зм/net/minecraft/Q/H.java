/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.Q;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class H
implements K<a> {
    private /* synthetic */ k a;
    private /* synthetic */ int b;
    private /* synthetic */ int d;
    private /* synthetic */ String c;
    private /* synthetic */ int e;

    public boolean a() {
        boolean bl2 = aD.c();
        boolean bl3 = this.e;
        if (!bl2) {
            bl3 = bl3 > false;
        }
        return bl3;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        boolean bl2 = aD.c();
        m2.a(this.c);
        m2.a(this.a);
        boolean bl3 = bl2;
        ByteBuf byteBuf = m2.writeByte(this.e);
        if (!bl3 && this.c.equals("EntityHorse")) {
            byteBuf = m2.writeInt(this.d);
        }
    }

    public H(int n2, String string, k k2, int n3, int n4) {
        this(n2, string, k2, n3);
        this.d = n4;
    }

    public int c() {
        return this.b;
    }

    public k d() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    public H(int n2, String string, k k2) {
        this(n2, string, k2, 0);
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public H() {
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public H(int n2, String string, k k2, int n3) {
        this.b = n2;
        this.c = string;
        this.a = k2;
        this.e = n3;
    }

    @Override
    public void a(m m2) throws IOException {
        block3: {
            block2: {
                this.b = m2.readUnsignedByte();
                this.c = m2.c(32);
                this.a = m2.m();
                boolean bl2 = aD.c();
                this.e = m2.readUnsignedByte();
                H h2 = this;
                if (bl2) break block2;
                if (!h2.c.equals("EntityHorse")) break block3;
                h2 = this;
            }
            h2.d = m2.readInt();
        }
    }
}

