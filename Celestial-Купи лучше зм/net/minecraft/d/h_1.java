/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class h
implements K<b> {
    private /* synthetic */ m b;
    private /* synthetic */ String a;

    public m b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.writeBytes(this.b);
    }

    @Override
    public void a(m m2) throws IOException {
        block4: {
            block3: {
                int n2;
                int[] arrn;
                int n3;
                block2: {
                    this.a = m2.c(20);
                    n3 = m2.readableBytes();
                    arrn = z.b();
                    n2 = n3;
                    if (arrn == null) break block2;
                    if (n2 < 0) break block3;
                    n2 = n3;
                }
                if (n2 > 32767) break block3;
                this.b = new m(m2.readBytes(n3));
                if (arrn != null) break block4;
            }
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
    }

    @Override
    public void a(b b10) {
        block3: {
            m m2;
            block2: {
                int[] arrn = z.b();
                b10.a(this);
                int[] arrn2 = arrn;
                m2 = this.b;
                if (arrn2 == null) break block2;
                if (m2 == null) break block3;
                m2 = this.b;
            }
            m2.release();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public h(String string, m m2) {
        this.a = string;
        this.b = m2;
        if (m2.writerIndex() > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    public h() {
    }

    public String a() {
        return this.a;
    }
}

