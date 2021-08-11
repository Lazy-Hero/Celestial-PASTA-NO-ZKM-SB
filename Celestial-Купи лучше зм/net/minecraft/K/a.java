/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.K;

import com.google.common.base.Predicate;
import java.util.Iterator;
import net.minecraft.K.g;
import net.minecraft.K.j;
import net.minecraft.az.r;
import net.minecraft.w.d;

final class a
implements Predicate<d> {
    a() {
    }

    public boolean a(d d10) {
        boolean bl2;
        block3: {
            Iterator iterator = g.a().iterator();
            int[] arrn = j.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        r r2 = (r)iterator.next();
                        bl2 = r2.a(d10);
                        if (arrn != null) break block3;
                        if (arrn != null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrn == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

