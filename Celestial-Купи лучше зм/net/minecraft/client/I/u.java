/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.I;

import javax.annotation.Nullable;
import net.minecraft.ar.U;
import net.minecraft.client.I.r;
import net.minecraft.client.b.aq;
import net.minecraft.k.n;

class u
extends U {
    final /* synthetic */ r g;

    u(r r2, aq aq2, boolean bl2) {
        this.g = r2;
        super(aq2, bl2);
    }

    @Override
    @Nullable
    public n d() {
        return r.a(this.g).f();
    }
}

