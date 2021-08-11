/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.D.d;
import net.minecraft.D.h;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class x
implements K<a> {
    private /* synthetic */ d b;
    private /* synthetic */ int c;
    private /* synthetic */ String a;
    private /* synthetic */ String d;

    public x(h h2, int n2) {
        this.a = h2.e();
        this.d = h2.b();
        this.b = h2.a().c();
        this.c = n2;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int b() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        block4: {
            block2: {
                x x2;
                block3: {
                    this.a = m2.c(16);
                    this.c = m2.readByte();
                    boolean bl2 = aD.c();
                    x2 = this;
                    if (bl2) break block2;
                    if (x2.c == 0) break block3;
                    x2 = this;
                    if (bl2) break block2;
                    if (x2.c != 2) break block4;
                }
                this.d = m2.c(32);
                x2 = this;
            }
            x2.b = net.minecraft.D.d.a(m2.c(16));
        }
    }

    public d c() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        block3: {
            block2: {
                m2.a(this.a);
                boolean bl2 = aD.i();
                m2.writeByte(this.c);
                boolean bl3 = bl2;
                if (!bl3) break block2;
                if (this.c != 0 && this.c != 2) break block3;
                m2.a(this.d);
            }
            m2.a(this.b.a());
        }
    }

    public x() {
    }

    public String d() {
        return this.a;
    }

    public String a() {
        return this.d;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

