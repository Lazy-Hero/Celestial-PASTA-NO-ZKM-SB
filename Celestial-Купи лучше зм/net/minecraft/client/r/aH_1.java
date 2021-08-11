/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.W;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.aX;
import net.minecraft.k.m;

public class aH
extends u<W> {
    private static final /* synthetic */ net.minecraft.ar.v A;
    private static final /* synthetic */ net.minecraft.ar.v C;
    private static final /* synthetic */ net.minecraft.ar.v B;
    private static final /* synthetic */ net.minecraft.ar.v z;
    private static final /* synthetic */ net.minecraft.ar.v D;
    private static final /* synthetic */ net.minecraft.ar.v E;

    public aH(a4 a42) {
        super(a42, new aX(0.0f), 0.5f);
        this.a(new net.minecraft.client.C.u(this.a().j));
    }

    protected net.minecraft.ar.v a(W w2) {
        switch (w2.aa()) {
            case 0: {
                return B;
            }
            case 1: {
                return A;
            }
            case 2: {
                return z;
            }
            case 3: {
                return D;
            }
            case 4: {
                return E;
            }
        }
        return C;
    }

    static {
        C = new net.minecraft.ar.v("textures/entity/villager/villager.png");
        B = new net.minecraft.ar.v("textures/entity/villager/farmer.png");
        A = new net.minecraft.ar.v("textures/entity/villager/librarian.png");
        z = new net.minecraft.ar.v("textures/entity/villager/priest.png");
        D = new net.minecraft.ar.v("textures/entity/villager/smith.png");
        E = new net.minecraft.ar.v("textures/entity/villager/butcher.png");
    }

    protected void a(W w2, float f10) {
        float f11;
        block4: {
            block3: {
                m[] arrm;
                block2: {
                    f11 = 0.9375f;
                    arrm = b.b();
                    if (arrm != null) break block2;
                    if (w2.z() >= 0) break block3;
                    f11 = (float)((double)f11 * 0.5);
                    this.a = 0.25f;
                }
                if (arrm == null) break block4;
            }
            this.a = 0.5f;
        }
        net.minecraft.client.a.v.d(f11, f11, f11);
    }

    public aX a() {
        return (aX)super.b();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

