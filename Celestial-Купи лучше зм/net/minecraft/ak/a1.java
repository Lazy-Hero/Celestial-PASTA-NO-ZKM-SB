/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import net.minecraft.U.B;
import net.minecraft.ag.R;
import net.minecraft.ak.au;
import net.minecraft.ak.h;

public class a1<T extends B>
extends au<T> {
    private final /* synthetic */ R p;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.p.U();
        if (string == null) {
            if (bl2) return false;
            bl2 = super.c();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public a1(R r2, Class<T> class_, boolean bl2, Predicate<? super T> predicate) {
        super(r2, class_, 10, bl2, false, predicate);
        this.p = r2;
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

