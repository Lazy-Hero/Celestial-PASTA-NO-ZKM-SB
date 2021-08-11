/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.D;
import net.minecraft.B.n;
import net.minecraft.ar.a2;
import net.minecraft.client.I.p;
import net.minecraft.client.I.x;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class v
extends n {
    private static /* synthetic */ int[] l;
    public /* synthetic */ a2<d> k;

    @Override
    public boolean a(j j2) {
        return true;
    }

    public boolean b() {
        int[] arrn = v.a();
        boolean bl2 = this.k.size();
        if (arrn == null) {
            bl2 = bl2 > BADBOOL 45;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(D d10) {
        int[] arrn = v.a();
        int n2 = d10.c instanceof h;
        if (arrn != null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        n2 = d10.b;
        int n3 = 90;
        if (arrn == null) {
            if (n2 <= n3) return 0 != 0;
            n2 = d10.a;
            if (arrn != null) return n2 != 0;
            n3 = 162;
        }
        if (n2 > n3) return 0 != 0;
        return 1 != 0;
    }

    public void a(float f10) {
        int n2;
        int n3 = (this.k.size() + 9 - 1) / 9 - 5;
        int[] arrn = v.a();
        int n4 = n2 = (int)((double)(f10 * (float)n3) + 0.5);
        if (arrn == null) {
            if (n4 < 0) {
                n2 = 0;
            }
            n4 = 0;
        }
        int n5 = n4;
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < 5) {
                for (int i2 = 0; i2 < 9; ++i2) {
                    block10: {
                        int n7;
                        int n8;
                        block9: {
                            n6 = n8 = i2 + (n5 + n2) * 9;
                            if (arrn != null) continue block1;
                            if (arrn != null) break block9;
                            if (n6 < 0) break block10;
                            n7 = n8;
                        }
                        if (n7 < this.k.size()) {
                            p.a().a(i2 + n5 * 9, this.k.get(n8));
                            if (arrn == null) continue;
                        }
                    }
                    p.a().a(i2 + n5 * 9, net.minecraft.w.d.m);
                    if (arrn == null) continue;
                }
                ++n5;
                if (arrn == null) continue block0;
            }
            break;
        }
    }

    public static int[] a() {
        return l;
    }

    static {
        if (v.a() != null) {
            v.b(new int[1]);
        }
    }

    public static void b(int[] arrn) {
        l = arrn;
    }

    @Override
    public d b(j j2, int n2) {
        block3: {
            D d10;
            block5: {
                D d11;
                int[] arrn;
                block4: {
                    int n3;
                    int n4;
                    block2: {
                        arrn = v.a();
                        n4 = n2;
                        n3 = this.f.size() - 9;
                        if (arrn != null) break block2;
                        if (n4 < n3) break block3;
                        n4 = n2;
                        n3 = this.f.size();
                    }
                    if (n4 >= n3) break block3;
                    d10 = d11 = (D)this.f.get(n2);
                    if (arrn != null) break block4;
                    if (d10 == null) break block3;
                    d10 = d11;
                }
                if (arrn != null) break block5;
                if (!d10.b()) break block3;
                d10 = d11;
            }
            d10.a(net.minecraft.w.d.m);
        }
        return net.minecraft.w.d.m;
    }

    @Override
    public boolean a(d d10, D d11) {
        int[] arrn = v.a();
        boolean bl2 = d11.b;
        if (arrn == null) {
            bl2 = bl2 > BADBOOL 90;
        }
        return bl2;
    }

    public v(j j2) {
        block7: {
            int n2;
            h h2;
            int[] arrn;
            block5: {
                int n3;
                this.k = a2.a();
                arrn = v.a();
                h2 = j2.cB;
                n2 = 0;
                while (n2 < 5) {
                    block6: {
                        n3 = 0;
                        if (arrn != null) break block5;
                        for (int i2 = v369944; i2 < 9; ++i2) {
                            this.a(new x(p.a(), n2 * 9 + i2, 9 + i2 * 18, 18 + n2 * 18));
                            if (arrn == null) {
                                if (arrn == null) continue;
                            }
                            break block6;
                        }
                        ++n2;
                    }
                    if (arrn == null) continue;
                }
                n3 = n2 = 0;
            }
            while (n2 < 9) {
                this.a(new D(h2, n2, 9 + n2 * 18, 112));
                ++n2;
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block7;
            }
            this.a(0.0f);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

