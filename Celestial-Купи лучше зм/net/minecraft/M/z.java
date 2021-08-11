/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.al;
import net.minecraft.M.ay;
import net.minecraft.M.t;
import net.minecraft.T.a4;
import net.minecraft.ag.W;
import net.minecraft.i.k;

public class z
extends t {
    private final /* synthetic */ al a;
    private final /* synthetic */ al d;

    public z(al al2, al al3) {
        super(ay.b());
        this.a = al2;
        this.d = al3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(k k2, a4 a42, W w2) {
        int n2 = t.c();
        boolean bl2 = this.a.a(k2, a42);
        if (n2 != 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.d.a(k2, w2);
        }
        return bl2;
    }
}

