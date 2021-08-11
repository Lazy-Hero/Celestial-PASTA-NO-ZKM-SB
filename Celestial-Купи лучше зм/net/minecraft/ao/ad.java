/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.a2;
import net.minecraft.ao.u;

public class ad {
    public /* synthetic */ Class<? extends a2> c;
    public /* synthetic */ int b;
    public final /* synthetic */ int a;
    public /* synthetic */ int d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String[] arrstring = u.b();
        int n2 = this.b;
        if (arrstring == null) return n2 != 0;
        if (n2 == 0) return 1 != 0;
        n2 = this.d;
        if (arrstring == null) return n2 != 0;
        if (n2 >= this.b) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        String[] arrstring = u.b();
        int n3 = this.b;
        if (arrstring == null) return n3 != 0;
        if (n3 == 0) return 1 != 0;
        n3 = this.d;
        if (arrstring == null) return n3 != 0;
        if (n3 >= this.b) return 0 != 0;
        return 1 != 0;
    }

    public ad(Class<? extends a2> class_, int n2, int n3) {
        this.c = class_;
        this.a = n2;
        this.b = n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

