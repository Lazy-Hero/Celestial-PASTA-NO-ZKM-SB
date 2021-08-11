/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.ah.z;
import net.minecraft.u.f;

public abstract class x
extends d {
    protected /* synthetic */ boolean c;

    @Override
    protected void a(i i2) {
        boolean bl2 = f.f();
        z z2 = i2.a();
        int n2 = this.c;
        if (!bl2) {
            n2 = n2 != 0 ? 1000 : 1001;
        }
        z2.b(n2, i2.e(), 0);
    }

    public x() {
        this.c = true;
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

