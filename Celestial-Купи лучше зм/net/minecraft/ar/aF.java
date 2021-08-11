/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.ar;

import net.minecraft.ar.v;
import net.minecraft.k.h;
import org.apache.commons.lang3.Validate;

public class aF {
    private final /* synthetic */ int d;
    private final /* synthetic */ int c;
    private final /* synthetic */ long b;
    private final /* synthetic */ long[] a;

    public aF(int n2, int n3) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n2);
        this.c = n3;
        this.d = n2;
        this.b = (1L << n2) - 1L;
        this.a = new long[h.d(n3 * n2, 64) / 64];
    }

    public void a(int n2, int n3) {
        block3: {
            int n4;
            int n5;
            int n6;
            block2: {
                int n7 = v.d();
                Validate.inclusiveBetween((long)0L, (long)(this.c - 1), (long)n2);
                int n8 = n7;
                Validate.inclusiveBetween((long)0L, (long)this.b, (long)n3);
                int n9 = n2 * this.d;
                int n10 = n9 / 64;
                n6 = ((n2 + 1) * this.d - 1) / 64;
                int n11 = n9 % 64;
                this.a[n10] = this.a[n10] & (this.b << n11 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n3 & this.b) << n11;
                n5 = n10;
                n4 = n6;
                if (n8 == 0) break block2;
                if (n5 == n4) break block3;
                n5 = 64;
                n4 = n11;
            }
            int n12 = n5 - n4;
            int n13 = this.d - n12;
            this.a[n6] = this.a[n6] >>> n13 << n13 | ((long)n3 & this.b) >> n12;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public long[] b() {
        return this.a;
    }

    public int a() {
        return this.c;
    }

    public int a(int n2) {
        Validate.inclusiveBetween((long)0L, (long)(this.c - 1), (long)n2);
        int n3 = n2 * this.d;
        int n4 = v.b();
        int n5 = n3 / 64;
        int n6 = ((n2 + 1) * this.d - 1) / 64;
        int n7 = n3 % 64;
        int n8 = n5;
        int n9 = n6;
        if (n4 == 0) {
            if (n8 == n9) {
                return (int)(this.a[n5] >>> n7 & this.b);
            }
            n8 = 64;
            n9 = n7;
        }
        int n10 = n8 - n9;
        return (int)((this.a[n5] >>> n7 | this.a[n6] << n10) & this.b);
    }
}

