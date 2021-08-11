/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class s {
    /* synthetic */ boolean[] c;
    /* synthetic */ s[] f;
    /* synthetic */ boolean a;
    /* synthetic */ boolean e;
    /* synthetic */ int d;
    /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public s(int n2) {
        this.f = new s[6];
        this.c = new boolean[6];
        this.d = n2;
    }

    public void b() {
        String[] arrstring = u.b();
        for (int i2 = 0; i2 < 6; ++i2) {
            this.c[i2] = this.f[i2] != null;
            if (arrstring != null) continue;
        }
    }

    public void a(aA aA2, s s2) {
        this.f[aA2.f()] = s2;
        s2.f[aA2.h().f()] = this;
    }

    public boolean c() {
        String[] arrstring = u.b();
        boolean bl2 = this.d;
        if (arrstring != null) {
            bl2 = bl2 >= BADBOOL 75;
        }
        return bl2;
    }

    public int a() {
        int n2;
        block2: {
            int n3 = 0;
            String[] arrstring = u.b();
            for (int i2 = 0; i2 < 6; ++i2) {
                n2 = this.c[i2];
                if (arrstring != null) {
                    if (n2 == 0) continue;
                    ++n3;
                    if (arrstring != null) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    public boolean a(int n2) {
        int n3;
        String[] arrstring = u.b();
        int n4 = this.e;
        if (arrstring != null) {
            if (n4 != 0) {
                return true;
            }
            this.b = n2;
            n4 = n3 = 0;
        }
        while (n3 < 6) {
            block7: {
                int n5;
                block10: {
                    block9: {
                        block8: {
                            s s2;
                            block6: {
                                s2 = this.f[n3];
                                if (arrstring == null) break block6;
                                if (s2 == null) break block7;
                                s2 = this;
                            }
                            n5 = s2.c[n3];
                            if (arrstring == null) break block8;
                            if (n5 == 0) break block7;
                            n5 = this.f[n3].b;
                        }
                        if (arrstring == null) break block9;
                        if (n5 == n2) break block7;
                        n5 = this.f[n3].a(n2) ? 1 : 0;
                    }
                    if (arrstring == null) break block10;
                    if (n5 == 0) break block7;
                    n5 = 1;
                }
                return n5 != 0;
            }
            ++n3;
            if (arrstring != null) continue;
        }
        return false;
    }
}

