/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 */
package net.minecraft.client.B;

import it.unimi.dsi.fastutil.ints.IntComparator;
import net.minecraft.client.B.d;
import net.minecraft.client.B.k;

class g
implements IntComparator {
    final /* synthetic */ int[] c;
    final /* synthetic */ int[] a;
    final /* synthetic */ k b;

    public int a(Integer n2, Integer n3) {
        return this.compare(n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int compare(int n2, int n3) {
        int n4;
        int n5 = d.b();
        int n6 = this.c[n2];
        int n7 = this.c[n3];
        if (n5 != 0) {
            if (n6 == n7) {
                n4 = Integer.compare(this.a[n2], this.a[n3]);
                return n4;
            }
            n6 = this.c[n2];
            n7 = this.c[n3];
        }
        n4 = Integer.compare(n6, n7);
        return n4;
    }

    g(k k2, int[] arrn, int[] arrn2) {
        this.b = k2;
        this.c = arrn;
        this.a = arrn2;
    }
}

