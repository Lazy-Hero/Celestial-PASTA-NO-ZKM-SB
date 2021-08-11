/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.S;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;

public class Y
extends u<S> {
    private static final /* synthetic */ net.minecraft.ar.v A;
    private static final /* synthetic */ net.minecraft.ar.v z;
    private static final /* synthetic */ net.minecraft.ar.v C;
    private static final /* synthetic */ net.minecraft.ar.v B;

    protected net.minecraft.ar.v a(S s2) {
        switch (s2.a()) {
            default: {
                return z;
            }
            case 1: {
                return A;
            }
            case 2: {
                return B;
            }
            case 3: 
        }
        return C;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Y(a4 a42) {
        super(a42, new net.minecraft.client.w.S(), 0.4f);
    }

    protected void a(S s2, float f10) {
        block0: {
            super.e(s2, f10);
            if (!s2.U()) break block0;
            net.minecraft.client.a.v.d(0.8f, 0.8f, 0.8f);
        }
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/cat/black.png");
        z = new net.minecraft.ar.v("textures/entity/cat/ocelot.png");
        B = new net.minecraft.ar.v("textures/entity/cat/red.png");
        C = new net.minecraft.ar.v("textures/entity/cat/siamese.png");
    }
}

