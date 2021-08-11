/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.p;

import com.google.common.base.Predicate;
import net.minecraft.W.cM;
import net.minecraft.W.ct;
import net.minecraft.Z.i;
import net.minecraft.p.U;
import net.minecraft.p.a;
import net.minecraft.u.g;

class V
implements Predicate<i> {
    V(U u2) {
        this();
    }

    public boolean a(i i2) {
        block3: {
            i i3;
            block4: {
                boolean bl2;
                block2: {
                    bl2 = a.d();
                    i3 = i2;
                    if (bl2) break block2;
                    if (i3 == null) break block3;
                    i3 = i2;
                }
                if (bl2) break block4;
                if (i3.b() != g.bx) break block3;
                i3 = i2;
            }
            cM cM2 = i3.b(ct.z);
            return cM2.e();
        }
        return false;
    }

    private V() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

