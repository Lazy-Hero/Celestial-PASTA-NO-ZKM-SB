/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.aj.k;
import net.minecraft.ax.T;
import net.minecraft.g.d;
import net.minecraft.g.f;

public class a
implements d {
    private final /* synthetic */ float a;
    private final /* synthetic */ float b;

    @Override
    public boolean a(Random random, k k2) {
        int n2 = 0;
        int[] arrn = f.b();
        boolean bl2 = k2.b() instanceof B;
        if (arrn != null) {
            float f10;
            if (bl2) {
                n2 = T.g((B)k2.b());
            }
            bl2 = (f10 = random.nextFloat() - (this.b + (float)n2 * this.a)) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        }
        if (arrn != null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    public a(float f10, float f11) {
        this.b = f10;
        this.a = f11;
    }

    static float a(a a10) {
        return a10.b;
    }

    static float b(a a10) {
        return a10.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

