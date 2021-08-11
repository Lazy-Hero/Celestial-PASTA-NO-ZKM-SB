/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.k.n;

public class cN {
    private final /* synthetic */ K b;
    private final /* synthetic */ int a;
    private final /* synthetic */ n d;
    private final /* synthetic */ int c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.a;
    }

    public String toString() {
        return "TE(" + this.d + ")," + this.c + "," + this.a + "," + this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        cN cN2;
        cN cN3;
        block7: {
            int n2;
            int n3;
            block6: {
                boolean bl2 = cL.b();
                Object object2 = object;
                if (!bl2) {
                    if (!(object2 instanceof cN)) {
                        return false;
                    }
                    object2 = object;
                }
                cN3 = (cN)object2;
                n3 = this.d.equals(cN3.d);
                if (!bl2) {
                    if (n3 == 0) return false;
                    n3 = this.c;
                }
                n2 = cN3.c;
                if (bl2) break block6;
                if (n3 != n2) return false;
                cN2 = this;
                if (bl2) break block7;
                n3 = cN2.a;
                n2 = cN3.a;
            }
            if (n3 != n2) return false;
            cN2 = this;
        }
        if (cN2.b != cN3.b) return false;
        return true;
    }

    public n d() {
        return this.d;
    }

    public cN(n n2, K k2, int n3, int n4) {
        this.d = n2;
        this.c = n3;
        this.a = n4;
        this.b = k2;
    }

    public K b() {
        return this.b;
    }

    public int a() {
        return this.c;
    }
}

