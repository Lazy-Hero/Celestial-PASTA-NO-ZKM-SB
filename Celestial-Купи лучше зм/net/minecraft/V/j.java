/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.h.d;
import net.minecraft.v.c;
import net.minecraft.z.f;

public abstract class j
extends c {
    public j(d d10) {
        super(d10);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public float a(net.minecraft.U.G g10, G g11, float f10) {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.v.c.b();
                x2 = g11.q();
                if (arrn != null) break block2;
                if (!(x2 instanceof f)) break block3;
                x2 = g11.q();
            }
            x2.h(1);
            return 0.0f;
        }
        return super.a(g10, g11, f10);
    }
}

