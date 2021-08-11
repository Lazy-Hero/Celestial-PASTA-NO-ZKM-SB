/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aN;
import net.minecraft.ar.v;
import net.minecraft.client.r.a0;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.x;
import net.minecraft.client.w.u;

public class y
extends x<aN> {
    private static final /* synthetic */ v A;

    public y(a4 a42) {
        super(a42, new u(), 0.5f);
        this.a(new a0(this, this));
    }

    @Override
    protected v a(aN aN2) {
        return A;
    }

    static {
        A = new v("textures/entity/zombie_pigman.png");
    }
}

