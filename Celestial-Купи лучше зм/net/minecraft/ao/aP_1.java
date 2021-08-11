/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ao.D;
import net.minecraft.ao.E;
import net.minecraft.ao.F;
import net.minecraft.ao.G;
import net.minecraft.ao.H;
import net.minecraft.ao.aQ;
import net.minecraft.ao.b;
import net.minecraft.ao.by;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class aP {
    private static gP a(gP gP2) {
        return gP2;
    }

    private static D a(List<u> list, Random random, int n2, int n3, int n4, @Nullable aA aA2, int n5, aQ aQ2) {
        block8: {
            b b10;
            block9: {
                int n6;
                int n7;
                String[] arrstring;
                block6: {
                    int n8;
                    block7: {
                        n8 = random.nextInt(100);
                        arrstring = u.b();
                        n7 = n8;
                        n6 = 80;
                        if (arrstring == null) break block6;
                        if (n7 < n6) break block7;
                        b10 = F.a(list, random, n2, n3, n4, aA2);
                        if (b10 != null) {
                            return new F(n5, random, b10, aA2, aQ2);
                        }
                        if (arrstring != null) break block8;
                    }
                    n7 = n8;
                    n6 = 70;
                }
                if (n7 < n6) break block9;
                b10 = H.a(list, random, n2, n3, n4, aA2);
                if (b10 != null) {
                    return new H(n5, random, b10, aA2, aQ2);
                }
                if (arrstring != null) break block8;
            }
            if ((b10 = E.a(list, random, n2, n3, n4, aA2)) != null) {
                return new E(n5, random, b10, aA2, aQ2);
            }
        }
        return null;
    }

    static D a(u u2, List list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        return aP.b(u2, list, random, n2, n3, n4, aA2, n5);
    }

    private static D b(u u2, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        block9: {
            int n6;
            int n7;
            String[] arrstring;
            block8: {
                arrstring = u.b();
                n7 = n5;
                n6 = 8;
                if (arrstring != null) {
                    if (n7 > n6) {
                        return null;
                    }
                    n7 = Math.abs(n2 - u2.a().c);
                    n6 = 80;
                }
                if (arrstring == null) break block8;
                if (n7 > n6) break block9;
                n7 = Math.abs(n4 - u2.a().f);
                n6 = 80;
            }
            if (n7 <= n6) {
                D d10;
                aQ aQ2 = ((D)u2).g;
                D d11 = d10 = aP.a(list, random, n2, n3, n4, aA2, n5 + 1, aQ2);
                if (arrstring != null) {
                    if (d11 != null) {
                        list.add(d10);
                        d10.a(u2, list, random);
                    }
                    d11 = d10;
                }
                return d11;
            }
        }
        return null;
    }

    public static void a() {
        by.b(E.class, "MSCorridor");
        by.b(F.class, "MSCrossing");
        by.b(G.class, "MSRoom");
        by.b(H.class, "MSStairs");
    }
}

