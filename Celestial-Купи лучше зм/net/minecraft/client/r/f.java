/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.d;
import net.minecraft.z.h;

public class f
extends d<h> {
    public static final /* synthetic */ v i;
    public static final /* synthetic */ v j;

    public f(a4 a42) {
        super(a42);
    }

    protected v a(h h2) {
        return h2.c() > 0 ? i : j;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        j = new v("textures/entity/projectiles/arrow.png");
        i = new v("textures/entity/projectiles/tipped_arrow.png");
    }
}

