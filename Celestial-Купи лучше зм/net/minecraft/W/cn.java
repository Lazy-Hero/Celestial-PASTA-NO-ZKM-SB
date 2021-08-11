/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class cn
extends K {
    protected static final /* synthetic */ k z;

    static {
        z = new k(0.0, 0.0, 0.0, 1.0, 0.875, 1.0);
    }

    public cn() {
        super(net.minecraft.ac.c.o, net.minecraft.ac.a.Z);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        x2.aq *= 0.4;
        x2.d *= 0.4;
    }
}

