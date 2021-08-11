/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.a3;

public class am
extends a3 {
    @Override
    public void a(double d10, double d11, double d12) {
        this.a(this.g().c(d10, d11, d12));
        this.j();
    }

    public am(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, 176, 8, -5.0E-4f);
        this.s = d13;
        this.n = d14;
        this.I = d15;
        this.E *= 0.75f;
        this.e = 60 + this.y.nextInt(12);
        this.c(15916745);
    }
}

