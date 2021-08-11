/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aq;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.H;

public class M
extends u<aq> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/endermite.png");
    }

    public M(a4 a42) {
        super(a42, new H(), 0.3f);
    }

    protected float a(aq aq2) {
        return 180.0f;
    }

    protected v b(aq aq2) {
        return z;
    }
}

