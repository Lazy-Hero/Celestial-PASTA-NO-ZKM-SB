/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.a0;
import net.minecraft.U.B;
import net.minecraft.ag.au;
import net.minecraft.i.j;

class a1
implements Predicate<B> {
    private final /* synthetic */ a0 a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable B b10) {
        boolean bl2;
        int[] arrn;
        block2: {
            double d10;
            block3: {
                arrn = S.f();
                bl2 = b10 instanceof j;
                if (arrn == null) break block2;
                if (bl2) break block3;
                bl2 = b10 instanceof au;
                if (arrn == null) break block2;
                if (!bl2) return false;
            }
            bl2 = (d10 = b10.s(this.a) - 9.0) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (arrn == null) return bl2;
        if (bl2 <= false) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a1(a0 a02) {
        this.a = a02;
    }
}

