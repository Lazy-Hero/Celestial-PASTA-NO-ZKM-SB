/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class cD
extends K {
    private static final /* synthetic */ k z;

    static {
        z = new k(0.3, 0.3, 0.3, 0.7, 0.7, 0.7);
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public float j(i i2) {
        return 1.0f;
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.DESTROY;
    }

    protected cD() {
        super(net.minecraft.ac.c.u);
    }

    @Override
    public aW b(i i2) {
        return aW.INVISIBLE;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }
}

