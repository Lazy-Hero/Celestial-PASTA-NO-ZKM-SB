/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.a_;
import net.minecraft.ar.v;

class M<V> {
    /* synthetic */ M<V> c;
    final /* synthetic */ int a;
    final /* synthetic */ int d;
    /* synthetic */ V b;

    public final int b() {
        return this.a;
    }

    public final String toString() {
        return this.b() + "=" + this.a();
    }

    public final int hashCode() {
        return a_.c(this.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n2 = v.b();
        Object object2 = object;
        if (n2 == 0) {
            if (!(object2 instanceof M)) {
                return false;
            }
            object2 = object;
        }
        M m2 = (M)object2;
        int n3 = this.a;
        if (n2 != 0) return n3 != 0;
        if (n3 != m2.a) return 0 != 0;
        V v2 = this.a();
        V v3 = m2.a();
        V v4 = v2;
        if (n2 == 0) {
            if (v4 == v3) return true;
            v4 = v2;
        }
        if (n2 == 0) {
            if (v4 == null) return false;
            v4 = v2;
        }
        boolean bl2 = v4.equals(v3);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public final V a() {
        return this.b;
    }

    M(int n2, int n3, V v2, M<V> m2) {
        this.b = v2;
        this.c = m2;
        this.a = n3;
        this.d = n2;
    }
}

