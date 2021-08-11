/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.ao;
import net.minecraft.M.t;
import net.minecraft.w.d;

public class B
extends t {
    private final /* synthetic */ a0 d;
    private final /* synthetic */ aA a;

    public boolean a(d d10, int n2) {
        int n3 = t.c();
        boolean bl2 = this.d.a(d10);
        if (n3 != 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.a.a(n2);
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public B(a0 a02, aA aA2) {
        super(ao.b());
        this.d = a02;
        this.a = aA2;
    }
}

