/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.Y;
import net.minecraft.ar.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.l;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class w
extends u<Y> {
    private static final /* synthetic */ v z;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(Y y2, float f10) {
        net.minecraft.client.a.v.d(0.35f, 0.35f, 0.35f);
    }

    protected v a(Y y2) {
        return z;
    }

    public w(a4 a42) {
        super(a42, new l(), 0.25f);
    }

    @Override
    protected void a(Y y2, float f10, float f11, float f12) {
        block4: {
            block3: {
                m[] arrm;
                block2: {
                    arrm = b.b();
                    if (arrm != null) break block2;
                    if (!y2.b()) break block3;
                    net.minecraft.client.a.v.b(0.0f, -0.1f, 0.0f);
                }
                if (arrm == null) break block4;
            }
            net.minecraft.client.a.v.b(0.0f, net.minecraft.k.h.c(f10 * 0.3f) * 0.1f, 0.0f);
        }
        super.a(y2, f10, f11, f12);
    }

    static {
        z = new v("textures/entity/bat.png");
    }
}

