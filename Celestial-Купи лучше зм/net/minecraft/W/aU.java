/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.W.aI;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;

public class aU
extends aI {
    @Override
    protected void a(@Nullable j j2, z z2, n n2) {
        z2.a(j2, n2, E.eo, ay.BLOCKS, 0.3f, 0.6f);
    }

    @Override
    protected void a(z z2, n n2) {
        z2.a(null, n2, E.dc, ay.BLOCKS, 0.3f, 0.5f);
    }

    protected aU() {
        super(false);
    }
}

