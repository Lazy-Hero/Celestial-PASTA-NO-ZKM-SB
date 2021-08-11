/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.A;

import net.minecraft.U.B;
import net.minecraft.client.A.e;
import net.minecraft.client.A.f;
import net.minecraft.client.a.p;
import net.minecraft.client.b.q;
import net.minecraft.k.m;
import net.minecraft.w.d;

enum a {
    ABOVE(0, 0, 28, 32, 8),
    BELOW(84, 0, 28, 32, 8),
    LEFT(0, 64, 32, 28, 5),
    RIGHT(96, 64, 32, 28, 5);

    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int e;
    private final /* synthetic */ int f;
    public static final /* synthetic */ int field_192659_e;
    private final /* synthetic */ int d;

    static {
        int n2 = 0;
        for (a a10 : net.minecraft.client.A.a.values()) {
            n2 += a10.f;
        }
        field_192659_e = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        m[] arrm = net.minecraft.client.A.e.b();
        int n3 = net.minecraft.client.A.f.a[this.ordinal()];
        if (arrm == null) return n3;
        switch (n3) {
            case 1: {
                n3 = (this.d + 4) * n2;
                return n3;
            }
            case 2: {
                return (this.d + 4) * n2;
            }
            case 3: {
                return -this.d + 4;
            }
            case 4: {
                return 248;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + (Object)((Object)this));
    }

    public int a() {
        return this.f;
    }

    private a(int n3, int n4, int n5, int n6, int n7) {
        this.e = n3;
        this.b = n4;
        this.d = n5;
        this.a = n6;
        this.f = n7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 + this.a(n4);
        m[] arrm = net.minecraft.client.A.e.b();
        int n8 = n3 + this.b(n4);
        int n9 = n5;
        int n10 = n7;
        if (arrm != null) {
            if (n9 <= n10) return 0 != 0;
            n9 = n5;
            n10 = n7 + this.d;
        }
        if (arrm != null) {
            if (n9 >= n10) return 0 != 0;
            n9 = n6;
            n10 = n8;
        }
        if (arrm != null) {
            if (n9 <= n10) return 0 != 0;
            n9 = n6;
            if (arrm == null) return n9 != 0;
            n10 = n8 + this.a;
        }
        if (n9 >= n10) return 0 != 0;
        return 1 != 0;
    }

    public void a(int n2, int n3, int n4, p p2, d d10) {
        int n5 = n2 + this.a(n4);
        int n6 = n3 + this.b(n4);
        m[] arrm = net.minecraft.client.A.e.b();
        if (arrm != null) {
            switch (this) {
                case ABOVE: {
                    n5 += 6;
                    n6 += 9;
                    if (arrm != null) break;
                }
                case BELOW: {
                    n5 += 6;
                    n6 += 6;
                    if (arrm != null) break;
                }
                case LEFT: {
                    n5 += 10;
                    n6 += 5;
                    if (arrm != null) break;
                }
                case RIGHT: {
                    n5 += 6;
                    n6 += 5;
                    break;
                }
            }
            p2.a((B)null, d10, n5, n6);
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public void a(q q2, int n2, int n3, boolean bl2, int n4) {
        int n5 = this.e;
        m[] arrm = net.minecraft.client.A.e.b();
        int n6 = n4;
        if (arrm != null) {
            if (n6 > 0) {
                n5 += this.d;
            }
            n6 = n4;
        }
        if (arrm != null) {
            if (n6 == this.f - 1) {
                n5 += this.d;
            }
            n6 = bl2 ? 1 : 0;
        }
        if (arrm != null) {
            n6 = n6 != 0 ? this.b + this.a : this.b;
        }
        int n7 = n6;
        q2.a(n2 + this.a(n4), n3 + this.b(n4), n5, n7, this.d, this.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(int n2) {
        m[] arrm = net.minecraft.client.A.e.b();
        int n3 = net.minecraft.client.A.f.a[this.ordinal()];
        if (arrm == null) return n3;
        switch (n3) {
            case 1: {
                n3 = -this.a + 4;
                return n3;
            }
            case 2: {
                return 136;
            }
            case 3: {
                return this.a * n2;
            }
            case 4: {
                return this.a * n2;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + (Object)((Object)this));
    }
}

