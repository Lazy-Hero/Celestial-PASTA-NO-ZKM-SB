/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.M.at;
import net.minecraft.M.t;

public class v
extends t {
    private final /* synthetic */ i a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public v(@Nullable i i2) {
        super(at.b());
        this.a = i2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(i i2) {
        int n2 = t.c();
        i i3 = this.a;
        if (n2 != 0) {
            if (i3 == null) return true;
            i3 = this.a;
        }
        if (i3 != i2) return false;
        return true;
    }
}

