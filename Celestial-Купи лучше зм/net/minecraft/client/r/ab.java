/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aD;
import net.minecraft.U.B;
import net.minecraft.client.C.z;
import net.minecraft.client.r.T;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.minecraft.client.w.M;
import net.minecraft.k.m;

class ab
extends z {
    final /* synthetic */ T b;

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    m[] arrm = net.minecraft.client.r.b.b();
                    bl2 = ((aD)b10).f();
                    if (arrm != null) break block0;
                    if (bl2) break block1;
                    bl2 = ((aD)b10).y();
                }
                if (!bl2) break block2;
            }
            super.a(b10, f10, f11, f12, f13, f14, f15, f16);
        }
    }

    @Override
    protected void a(net.minecraft.ar.b b10) {
        ((M)this.a.b()).a(b10).a(0.0625f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    ab(T t2, s s2) {
        this.b = t2;
        super(s2);
    }
}

