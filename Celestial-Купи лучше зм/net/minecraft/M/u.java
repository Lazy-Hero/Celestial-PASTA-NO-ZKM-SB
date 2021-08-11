/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.ae;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.U.E;
import net.minecraft.ag.C;
import net.minecraft.i.k;

public class u
extends t {
    private final /* synthetic */ al a;
    private final /* synthetic */ al e;
    private final /* synthetic */ al d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(k k2, C c10, C c11, E e10) {
        int n2 = t.b();
        boolean bl2 = this.a.a(k2, e10);
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.d.a(k2, c10);
        }
        if (n2 == 0) {
            if (bl2) {
                bl2 = this.e.a(k2, c11);
                if (n2 != 0) return bl2;
                if (bl2) return true;
            }
            bl2 = this.d.a(k2, c11);
        }
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = this.e.a(k2, c10);
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public u(al al2, al al3, al al4) {
        super(ae.b());
        this.d = al2;
        this.e = al3;
        this.a = al4;
    }
}

