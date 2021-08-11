/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.client.x.g;

public class S {
    private final /* synthetic */ g d;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ int c;
    private final /* synthetic */ v a;

    public int a() {
        return this.c;
    }

    public g d() {
        return this.d;
    }

    public boolean b() {
        return this.b;
    }

    public S(v v2, g g10, boolean bl2, int n2) {
        this.a = v2;
        this.d = g10;
        this.b = bl2;
        this.c = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] arrstring = P.o();
        Object object2 = this;
        if (arrstring == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (arrstring == null) {
            if (!(object2 instanceof S)) {
                return false;
            }
            object2 = object;
        }
        S s2 = (S)object2;
        S s3 = this;
        if (arrstring == null) {
            if (!s3.a.equals(s2.a)) return 0 != 0;
            s3 = this;
        }
        if (arrstring == null) {
            if (s3.d != s2.d) return 0 != 0;
            s3 = this;
        }
        int n2 = s3.b;
        int n3 = s2.b;
        if (arrstring == null) {
            if (n2 != n3) return 0 != 0;
            n2 = this.c;
            if (arrstring != null) return n2 != 0;
            n3 = s2.c;
        }
        if (n2 != n3) return 0 != 0;
        return 1 != 0;
    }

    public v c() {
        return this.a;
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + Boolean.valueOf(this.b).hashCode();
        n2 = 31 * n2 + this.c;
        return n2;
    }

    public String toString() {
        return "Variant{modelLocation=" + this.a + ", rotation=" + this.d + ", uvLock=" + this.b + ", weight=" + this.c + '}';
    }
}

