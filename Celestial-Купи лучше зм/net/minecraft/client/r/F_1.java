/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.ag;
import net.minecraft.ar.v;
import net.minecraft.client.C.o;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.x;
import net.minecraft.k.m;

public class F
extends x<ag> {
    private static final /* synthetic */ v A;
    private static final /* synthetic */ v F;
    private static final /* synthetic */ v B;
    private static final /* synthetic */ v E;
    private static final /* synthetic */ v C;
    private static final /* synthetic */ v D;

    @Override
    protected v a(ag ag2) {
        switch (ag2.a()) {
            case 0: {
                return B;
            }
            case 1: {
                return C;
            }
            case 2: {
                return D;
            }
            case 3: {
                return A;
            }
            case 4: {
                return E;
            }
        }
        return F;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        F = new v("textures/entity/zombie_villager/zombie_villager.png");
        B = new v("textures/entity/zombie_villager/zombie_farmer.png");
        C = new v("textures/entity/zombie_villager/zombie_librarian.png");
        D = new v("textures/entity/zombie_villager/zombie_priest.png");
        A = new v("textures/entity/zombie_villager/zombie_smith.png");
        E = new v("textures/entity/zombie_villager/zombie_butcher.png");
    }

    public F(a4 a42) {
        super(a42, new net.minecraft.client.w.v(), 0.5f);
        this.a(new o(this));
    }

    @Override
    protected void a(ag ag2, float f10, float f11, float f12) {
        m[] arrm = b.b();
        if (arrm == null) {
            if (ag2.z()) {
                f11 += (float)(Math.cos((double)ag2.H * 3.25) * Math.PI * 0.25);
            }
            super.a(ag2, f10, f11, f12);
        }
    }
}

