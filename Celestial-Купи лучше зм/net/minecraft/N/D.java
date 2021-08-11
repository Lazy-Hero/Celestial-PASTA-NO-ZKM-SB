/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.a_;
import net.minecraft.ah.z;
import net.minecraft.ar.ao;
import net.minecraft.k.m;

public class D
extends y
implements ao {
    @Override
    public void c() {
        block3: {
            K k2;
            block6: {
                boolean bl2;
                block5: {
                    m[] arrm;
                    block4: {
                        z z2;
                        block2: {
                            arrm = j.f();
                            z2 = this.a;
                            if (arrm != null) break block2;
                            if (z2 == null) break block3;
                            z2 = this.a;
                        }
                        bl2 = z2.C;
                        if (arrm != null) break block4;
                        if (bl2) break block3;
                        long l2 = this.a.r() % 20L - 0L;
                        bl2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                    }
                    if (arrm != null) break block5;
                    if (bl2) break block3;
                    k2 = this.c = this.l();
                    if (arrm != null) break block6;
                    bl2 = k2 instanceof a_;
                }
                if (!bl2) break block3;
                k2 = this.c;
            }
            ((a_)k2).a(this.a, this.d);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

