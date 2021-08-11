/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ag.O;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.r.au;
import net.minecraft.client.w.X;

public class s
implements w<O> {
    private final /* synthetic */ X a;
    private final /* synthetic */ au c;
    private static final /* synthetic */ v b;

    @Override
    public boolean a() {
        return false;
    }

    static {
        b = new v("textures/entity/pig/pig_saddle.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(O o2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block3: {
            block2: {
                boolean bl2 = m.d();
                if (bl2) break block2;
                if (!o2.b()) break block3;
                this.c.b(b);
                this.a.a(this.c.b());
            }
            this.a.b(o2, f10, f11, f13, f14, f15, f16);
        }
    }

    public s(au au2) {
        this.a = new X(0.5f);
        this.c = au2;
    }
}

