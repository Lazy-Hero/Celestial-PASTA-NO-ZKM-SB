/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.ad.a;
import net.minecraft.ag.O;
import net.minecraft.ar.a3;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.u.E;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class ak
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    public ak() {
        this.f = 1;
        this.a(net.minecraft.ad.a.t);
    }

    @Override
    public boolean a(d d10, j j2, B b10, a3 a32) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3;
                block6: {
                    block7: {
                        int n2 = bl.c();
                        bl2 = b10 instanceof O;
                        if (n2 != 0) break block4;
                        if (!bl2) break block5;
                        O o2 = (O)b10;
                        bl3 = o2.b();
                        if (n2 != 0) break block6;
                        if (bl3) break block7;
                        bl3 = o2.Q();
                        if (n2 != 0) break block6;
                        if (!bl3) {
                            o2.a(true);
                            o2.aG.a(j2, o2.a, o2.aF, o2.ax, E.dN, ay.NEUTRAL, 0.5f, 1.0f);
                            d10.b(1);
                        }
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }
}

