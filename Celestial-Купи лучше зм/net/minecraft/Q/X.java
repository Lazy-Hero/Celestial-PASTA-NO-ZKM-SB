/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class X
implements K<a> {
    private /* synthetic */ String a;
    private /* synthetic */ m b;

    public String b() {
        return this.a;
    }

    public m a() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        block4: {
            block3: {
                int n2;
                boolean bl2;
                int n3;
                block2: {
                    this.a = m2.c(20);
                    n3 = m2.readableBytes();
                    bl2 = aD.c();
                    n2 = n3;
                    if (bl2) break block2;
                    if (n2 < 0) break block3;
                    n2 = n3;
                }
                if (n2 > 0x100000) break block3;
                this.b = new m(m2.readBytes(n3));
                if (!bl2) break block4;
            }
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.writeBytes(this.b);
    }

    public X() {
    }

    public X(String string, m m2) {
        this.a = string;
        this.b = m2;
        if (m2.writerIndex() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }
}

