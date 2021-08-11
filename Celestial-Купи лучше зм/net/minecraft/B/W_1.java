/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import java.util.List;
import net.minecraft.B.n;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ar.a2;
import net.minecraft.w.d;

public class W {
    public static r b(r r2, a2<d> a22) {
        return W.a(r2, a22, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static d a(List<d> list, int n2) {
        d d10;
        block5: {
            int n3;
            block4: {
                int n4 = n.c();
                n3 = n2;
                if (n4 != 0) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < list.size()) {
                d10 = list.set(n2, d.m);
                return d10;
            }
        }
        d10 = d.m;
        return d10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static d a(List<d> list, int n2, int n3) {
        d d10;
        block5: {
            int n4;
            block7: {
                int n5;
                block6: {
                    block4: {
                        n5 = n.b();
                        n4 = n2;
                        if (n5 == 0) break block4;
                        if (n4 < 0) break block5;
                        n4 = n2;
                    }
                    if (n5 == 0) break block6;
                    if (n4 >= list.size()) break block5;
                    n4 = list.get(n2).G() ? 1 : 0;
                }
                if (n5 == 0) break block7;
                if (n4 != 0) break block5;
                n4 = n3;
            }
            if (n4 > 0) {
                d10 = list.get(n2).d(n3);
                return d10;
            }
        }
        d10 = d.m;
        return d10;
    }

    public static r a(r r2, a2<d> a22, boolean bl2) {
        block7: {
            u u2;
            block6: {
                boolean bl3;
                block5: {
                    int n2;
                    block4: {
                        u2 = new u();
                        n2 = n.c();
                        int n3 = 0;
                        while (n3 < a22.size()) {
                            d d10 = a22.get(n3);
                            if (n2 == 0) {
                                bl3 = d10.G();
                                if (n2 != 0) break block4;
                                if (!bl3) {
                                    r r3 = new r();
                                    r3.a("Slot", (byte)n3);
                                    d10.a(r3);
                                    u2.a(r3);
                                }
                                ++n3;
                            }
                            if (n2 == 0) continue;
                        }
                        bl3 = u2.c();
                    }
                    if (n2 != 0) break block5;
                    if (!bl3) break block6;
                    bl3 = bl2;
                }
                if (!bl3) break block7;
            }
            r2.a("Items", u2);
        }
        return r2;
    }

    public static void a(r r2, a2<d> a22) {
        u u2 = r2.c("Items", 10);
        int n2 = n.b();
        int n3 = 0;
        while (n3 < u2.b()) {
            r r3 = u2.d(n3);
            int n4 = r3.r("Slot") & 0xFF;
            if (n2 != 0) {
                if (n4 >= 0 && n4 < a22.size()) {
                    a22.set(n4, new d(r3));
                }
                ++n3;
            }
            if (n2 != 0) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

