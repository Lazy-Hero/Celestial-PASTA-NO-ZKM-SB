/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.aA.g;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.ax;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.ar.ae;
import net.minecraft.k.n;
import net.minecraft.o.l;

public class k
extends j {
    private final /* synthetic */ int i = 20;
    private final /* synthetic */ int h = 11;
    private final /* synthetic */ g g;

    @Override
    protected ac a(int n2, int n3) {
        return new ax(this.d, this.g, this.a, n2, n3);
    }

    @Override
    public n a(z z2, n n2, boolean bl2) {
        this.d = z2;
        return k.a(z2, this, n2, 20, 11, 10387313, true, 100, bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static int b(int n2, int n3, g g10) {
        int n4;
        int n5;
        l l2;
        block6: {
            ae ae2;
            ae ae3;
            block7: {
                ae ae4;
                block8: {
                    String[] arrstring;
                    block4: {
                        block5: {
                            Random random = new Random(n2 + n3 * 10387313);
                            ae4 = ae.values()[random.nextInt(ae.values().length)];
                            arrstring = u.b();
                            l2 = new l();
                            g10.a(n2, n3, l2);
                            n5 = 5;
                            n4 = 5;
                            ae3 = ae4;
                            ae2 = ae.CLOCKWISE_90;
                            if (arrstring == null) break block4;
                            if (ae3 != ae2) break block5;
                            n5 = -5;
                            if (arrstring != null) break block6;
                        }
                        ae3 = ae4;
                        ae2 = ae.CLOCKWISE_180;
                    }
                    if (arrstring == null) break block7;
                    if (ae3 != ae2) break block8;
                    n5 = -5;
                    n4 = -5;
                    if (arrstring != null) break block6;
                }
                ae3 = ae4;
                ae2 = ae.COUNTERCLOCKWISE_90;
            }
            if (ae3 == ae2) {
                n4 = -5;
            }
        }
        int n6 = l2.a(7, 7);
        int n7 = l2.a(7, 7 + n4);
        int n8 = l2.a(7 + n5, 7);
        int n9 = l2.a(7 + n5, 7 + n4);
        int n10 = Math.min(Math.min(n6, n7), Math.min(n8, n9));
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(int n2, int n3) {
        boolean bl2;
        int n4 = n2;
        String[] arrstring = u.b();
        int n5 = n3;
        int n6 = n2;
        if (arrstring != null) {
            if (n6 < 0) {
                n2 -= 19;
            }
            n6 = n3;
        }
        if (arrstring != null) {
            if (n6 < 0) {
                n3 -= 19;
            }
            n6 = n2 / 20;
        }
        int n7 = n6;
        int n8 = n3 / 20;
        Random random = this.d.a(n7, n8, 10387313);
        n7 *= 20;
        n8 *= 20;
        int n9 = n4;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n7 += (random.nextInt(9) + random.nextInt(9)) / 2)) return 0 != 0;
        n9 = n5;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n8 += (random.nextInt(9) + random.nextInt(9)) / 2)) return 0 != 0;
        n9 = this.g.a(n4, n5) ? 1 : 0;
        if (arrstring == null) return n9 != 0;
        if (n9 == 0) return 0 != 0;
        boolean bl3 = bl2 = k.b(n4, n5, this.g);
        if (arrstring == null) return bl3;
        if (bl3 < BADBOOL 60) return false;
        return true;
    }

    @Override
    public String a() {
        return "EndCity";
    }

    public k(g g10) {
        this.i = 20;
        this.h = 11;
        this.g = g10;
    }

    static int a(int n2, int n3, g g10) {
        return k.b(n2, n3, g10);
    }
}

