/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.aH;
import net.minecraft.ao.u;

class bC {
    public /* synthetic */ int d;
    public final /* synthetic */ int c;
    public /* synthetic */ Class<? extends aH> a;
    public /* synthetic */ int b;

    public bC(Class<? extends aH> class_, int n2, int n3) {
        this.a = class_;
        this.c = n2;
        this.d = n3;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        String[] arrstring = u.b();
        int n3 = this.d;
        if (arrstring == null) return n3 != 0;
        if (n3 == 0) return 1 != 0;
        n3 = this.b;
        if (arrstring == null) return n3 != 0;
        if (n3 >= this.d) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String[] arrstring = u.b();
        int n2 = this.d;
        if (arrstring == null) return n2 != 0;
        if (n2 == 0) return 1 != 0;
        n2 = this.b;
        if (arrstring == null) return n2 != 0;
        if (n2 >= this.d) return 0 != 0;
        return 1 != 0;
    }
}

