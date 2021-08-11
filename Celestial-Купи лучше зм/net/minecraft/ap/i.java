/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ap;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.ap.e;
import net.minecraft.ap.f;
import net.minecraft.ap.g;
import net.minecraft.ap.k;
import net.minecraft.k.n;

public class i
implements f {
    private final /* synthetic */ float a;
    private final /* synthetic */ Random b;

    public i(n n2, k k2) {
        this.a = k2.e();
        this.b = k2.a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public e a(z z2, n n2, e e10) {
        block5: {
            float f10;
            block4: {
                int[] arrn = g.c();
                float f11 = this.a - 1.0f;
                f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (arrn == null) break block4;
                if (f10 >= 0) break block5;
                float f12 = this.b.nextFloat() - this.a;
                f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            }
            if (f10 > 0) {
                return null;
            }
        }
        e e11 = e10;
        return e11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

