/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.k.n;

public class F
implements Comparable<F> {
    public /* synthetic */ long b;
    public /* synthetic */ int d;
    private final /* synthetic */ K c;
    public final /* synthetic */ n f;
    private static /* synthetic */ long e;
    private final /* synthetic */ long a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = z.I();
        Object object2 = object;
        if (string != null) {
            if (!(object2 instanceof F)) {
                return false;
            }
            object2 = object;
        }
        F f10 = (F)object2;
        boolean bl2 = this.f.equals(f10.f);
        if (string != null) {
            if (!bl2) return false;
            bl2 = K.a(this.c, f10.c);
        }
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public int a(F f10) {
        String string = z.I();
        long l2 = this.b - f10.b;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (string != null) {
            if (l3 < 0) {
                return -1;
            }
            long l4 = this.b - f10.b;
            l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        }
        if (string != null) {
            if (l3 > 0) {
                return 1;
            }
            l3 = this.d;
        }
        if (string != null) {
            if (l3 != f10.d) {
                return this.d - f10.d;
            }
            long l5 = this.a - f10.a;
            l3 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        }
        if (string != null) {
            if (l3 < 0) {
                return -1;
            }
            long l6 = this.a - f10.a;
            l3 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (string != null) {
            l3 = l3 > 0 ? (long)1 : (long)0;
        }
        return (int)l3;
    }

    public K a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public F a(long l2) {
        this.b = l2;
        return this;
    }

    public String toString() {
        return K.b(this.c) + ": " + this.f + ", " + this.b + ", " + this.d + ", " + this.a;
    }

    public F(n n2, K k2) {
        this.a = e++;
        this.f = n2.l();
        this.c = k2;
    }

    public int hashCode() {
        return this.f.hashCode();
    }
}

