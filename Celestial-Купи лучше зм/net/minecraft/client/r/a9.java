/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.an;
import net.minecraft.ar.v;
import net.minecraft.client.C.y;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.aa;

public class a9
extends u<an> {
    private static final /* synthetic */ v z;

    static {
        z = new v("textures/entity/snowman.png");
    }

    protected v a(an an2) {
        return z;
    }

    public aa a() {
        return (aa)super.b();
    }

    public a9(a4 a42) {
        super(a42, new aa(), 0.5f);
        this.a(new y(this));
    }
}

