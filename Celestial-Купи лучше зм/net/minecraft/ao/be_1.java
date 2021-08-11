/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.I;
import net.minecraft.ao.u;

class be {
    public final /* synthetic */ int b;
    public /* synthetic */ Class<? extends I> e;
    public /* synthetic */ boolean d;
    public /* synthetic */ int a;
    public /* synthetic */ int c;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        String[] arrstring = u.b();
        int n3 = this.a;
        if (arrstring == null) return n3 != 0;
        if (n3 == 0) return 1 != 0;
        n3 = this.c;
        if (arrstring == null) return n3 != 0;
        if (n3 >= this.a) return 0 != 0;
        return 1 != 0;
    }

    public be(Class<? extends I> class_, int n2, int n3) {
        this(class_, n2, n3, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String[] arrstring = u.b();
        int n2 = this.a;
        if (arrstring == null) return n2 != 0;
        if (n2 == 0) return 1 != 0;
        n2 = this.c;
        if (arrstring == null) return n2 != 0;
        if (n2 >= this.a) return 0 != 0;
        return 1 != 0;
    }

    public be(Class<? extends I> class_, int n2, int n3, boolean bl2) {
        this.e = class_;
        this.b = n2;
        this.a = n3;
        this.d = bl2;
    }
}

