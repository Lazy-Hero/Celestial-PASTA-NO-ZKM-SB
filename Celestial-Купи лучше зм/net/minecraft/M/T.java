/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.a0;
import net.minecraft.M.al;
import net.minecraft.M.j;
import net.minecraft.M.t;
import net.minecraft.ag.W;
import net.minecraft.i.k;
import net.minecraft.w.d;

public class T
extends t {
    private final /* synthetic */ al a;
    private final /* synthetic */ a0 d;

    public boolean a(k k2, W w2, d d10) {
        int n2 = t.c();
        boolean bl2 = this.a.a(k2, w2);
        if (n2 != 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.d.a(d10);
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public T(al al2, a0 a02) {
        super(j.b());
        this.a = al2;
        this.d = a02;
    }
}

