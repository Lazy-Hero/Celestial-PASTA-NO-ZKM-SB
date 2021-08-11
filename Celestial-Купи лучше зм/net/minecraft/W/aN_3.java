/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.i.j;
import net.minecraft.w.au;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.e;

class aN
implements e {
    final /* synthetic */ au a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(d d10, @Nullable z z2, @Nullable B b10) {
        B b11;
        block9: {
            boolean bl2;
            block7: {
                int n2;
                block8: {
                    n2 = bl.c();
                    B b12 = b10;
                    if (n2 == 0) {
                        if (b12 == null) {
                            return 0.0f;
                        }
                        b12 = b10;
                    }
                    boolean bl3 = b12.av() == d10;
                    boolean bl4 = b10.b() == d10;
                    bl2 = b10.av().w() instanceof au;
                    if (n2 == 0) {
                        if (bl2) {
                            bl4 = false;
                        }
                        bl2 = bl3;
                    }
                    if (n2 != 0) break block7;
                    if (bl2) break block8;
                    bl2 = bl4;
                    if (n2 != 0) break block7;
                    if (!bl2) return 0.0f;
                }
                b11 = b10;
                if (n2 != 0) break block9;
                bl2 = b11 instanceof j;
            }
            if (!bl2) return 0.0f;
            b11 = b10;
        }
        if (((j)b11).ch == null) return 0.0f;
        return 1.0f;
    }

    aN(au au2) {
        this.a = au2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

