/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.u;

class a {
    private final /* synthetic */ int d;
    private final /* synthetic */ int b;
    private final /* synthetic */ int[][] c;
    private final /* synthetic */ int a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3, int n4) {
        String[] arrstring = u.b();
        int n5 = this.a(n2 - 1, n3);
        if (arrstring == null) return n5 != 0;
        if (n5 == n4) return 1 != 0;
        n5 = this.a(n2 + 1, n3);
        if (arrstring == null) return n5 != 0;
        if (n5 == n4) return 1 != 0;
        n5 = this.a(n2, n3 + 1);
        if (arrstring == null) return n5 != 0;
        if (n5 == n4) return 1 != 0;
        n5 = this.a(n2, n3 - 1);
        if (arrstring == null) return n5 != 0;
        if (n5 != n4) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2, int n3) {
        int n4;
        block5: {
            String[] arrstring;
            block7: {
                block6: {
                    block4: {
                        arrstring = u.b();
                        n4 = n2;
                        if (arrstring == null) break block4;
                        if (n4 < 0) break block5;
                        n4 = n2;
                    }
                    if (arrstring == null) break block6;
                    if (n4 >= this.d) break block5;
                    n4 = n3;
                }
                if (arrstring == null) break block7;
                if (n4 < 0) break block5;
                n4 = n3;
            }
            if (arrstring == null) return n4;
            if (n4 < this.a) {
                n4 = this.c[n2][n3];
                return n4;
            }
        }
        n4 = this.b;
        return n4;
    }

    static int b(a a10) {
        return a10.d;
    }

    public void a(int n2, int n3, int n4) {
        block2: {
            int n5;
            block4: {
                String[] arrstring;
                block3: {
                    block1: {
                        arrstring = u.b();
                        n5 = n2;
                        if (arrstring == null) break block1;
                        if (n5 < 0) break block2;
                        n5 = n2;
                    }
                    if (arrstring == null) break block3;
                    if (n5 >= this.d) break block2;
                    n5 = n3;
                }
                if (arrstring == null) break block4;
                if (n5 < 0) break block2;
                n5 = n3;
            }
            if (n5 < this.a) {
                this.c[n2][n3] = n4;
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n3;
        String[] arrstring = u.b();
        while (n7 <= n5) {
            block3: {
                for (int i2 = n2; i2 <= n4; ++i2) {
                    this.a(i2, n7, n6);
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block3;
                }
                ++n7;
            }
            if (arrstring != null) continue;
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        block3: {
            int n6;
            int n7;
            a a10;
            block2: {
                String[] arrstring = u.b();
                a10 = this;
                n7 = n2;
                n6 = n3;
                if (arrstring == null) break block2;
                if (a10.a(n7, n6) != n4) break block3;
                a10 = this;
                n7 = n2;
                n6 = n3;
            }
            a10.a(n7, n6, n5);
        }
    }

    static int a(a a10) {
        return a10.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a(int n2, int n3, int n4) {
        this.d = n2;
        this.a = n3;
        this.b = n4;
        this.c = new int[n2][n3];
    }
}

