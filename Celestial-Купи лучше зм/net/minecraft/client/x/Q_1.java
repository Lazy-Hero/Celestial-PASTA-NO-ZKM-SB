/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import java.util.Arrays;
import net.minecraft.client.j.c;
import net.minecraft.client.x.N;
import net.minecraft.client.x.P;

public class Q
extends P {
    private final /* synthetic */ c j;
    private final /* synthetic */ c k;

    private void b() {
        String[] arrstring = P.o();
        for (int i2 = 0; i2 < 4; ++i2) {
            int n2 = this.b.a() * i2;
            int n3 = this.b.b(0) / 4;
            this.a[n2 + n3] = Float.floatToRawIntBits(this.k.a((double)this.j.a(Float.intBitsToFloat(this.a[n2 + n3]))));
            this.a[n2 + n3 + 1] = Float.floatToRawIntBits(this.k.b((double)this.j.b(Float.intBitsToFloat(this.a[n2 + n3 + 1]))));
            if (arrstring == null) continue;
        }
    }

    public Q(P p2, c c10) {
        super(Arrays.copyOf(p2.d(), p2.d().length), p2.h, N.a(p2.d()), c10);
        this.k = c10;
        this.b = p2.b;
        this.c = p2.c;
        this.j = p2.p();
        this.b();
        this.a();
    }
}

