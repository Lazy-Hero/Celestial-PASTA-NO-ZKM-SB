/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.an;

public class ae
extends an {
    protected ae(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(z2, d10, d11, d12, d13, d14, d15);
        this.u = 0.5f;
    }

    @Override
    public void i() {
        super.i();
        this.n -= 0.004 + 0.04 * (double)this.u;
    }
}

