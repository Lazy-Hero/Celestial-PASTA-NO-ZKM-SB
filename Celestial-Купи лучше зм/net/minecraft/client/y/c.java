/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.y;

import java.nio.ByteBuffer;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.y.e;
import net.minecraft.client.y.g;

public class c {
    private final /* synthetic */ e a;
    private /* synthetic */ int c;
    private /* synthetic */ int b;

    public void a(int n2) {
        v.b(n2, 0, this.c);
    }

    public void c() {
        as.g(as.n, 0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public c(e e10) {
        this.a = e10;
        this.b = as.e();
    }

    public void a() {
        block3: {
            int n2;
            block2: {
                int[] arrn = g.c();
                n2 = this.b;
                if (arrn != null) break block2;
                if (n2 < 0) break block3;
                n2 = this.b;
            }
            as.e(n2);
            this.b = -1;
        }
    }

    public void a(ByteBuffer byteBuffer) {
        this.b();
        as.a(as.n, byteBuffer, 35044);
        this.c();
        this.c = byteBuffer.limit() / this.a.c();
    }

    public void b() {
        as.g(as.n, this.b);
    }
}

