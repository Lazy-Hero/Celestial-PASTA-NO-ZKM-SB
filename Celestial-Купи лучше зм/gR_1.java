/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.x;
import net.minecraft.W.L;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.b;
import net.minecraft.o.k;
import net.minecraft.u.g;

public class gR {
    public static void a(net.minecraft.client.l.c c10, z z2) {
        block20: {
            int n2;
            int n3;
            block16: {
                x x2;
                x x3;
                k k2;
                String string;
                block21: {
                    z z3;
                    block19: {
                        string = K.d();
                        if (c10 != null) {
                            int n4 = 3;
                            if (string == null) {
                                if (c10.aY) {
                                    n4 = 1;
                                }
                                L.a((net.minecraft.W.K)g.bQ, n4);
                            }
                            L.a((net.minecraft.W.K)g.cL, n4);
                        }
                        z3 = z2;
                        if (string != null) break block19;
                        if (z3 == null) break block20;
                        z3 = z2;
                    }
                    if ((k2 = z3.f()) == null) break block20;
                    x2 = x3 = fU.aX().Z();
                    if (string != null) break block21;
                    if (x2 == null) break block20;
                    x2 = x3;
                }
                int n5 = (int)x2.a / 16;
                int n6 = (int)x3.ax / 16;
                int n7 = n5 - 512;
                int n8 = n5 + 512;
                int n9 = n6 - 512;
                int n10 = n6 + 512;
                n3 = 0;
                int n11 = n7;
                while (n11 < n8) {
                    block17: {
                        n2 = n9;
                        if (string != null) break block16;
                        int n12 = n2;
                        block1: while (true) {
                            int n13 = n12;
                            block2: while (n13 < n10) {
                                block22: {
                                    int n14;
                                    block23: {
                                        a a10 = k2.c(n11, n12);
                                        if (string != null) break block17;
                                        if (string != null) continue block1;
                                        if (a10 == null) break block22;
                                        n14 = a10 instanceof b;
                                        if (string != null) break block23;
                                        if (n14 != 0) break block22;
                                        n14 = n11 << 4;
                                    }
                                    int n15 = n14;
                                    int n16 = n12 << 4;
                                    int n17 = n15 + 16;
                                    int n18 = n16 + 16;
                                    fZ fZ2 = new fZ(0, 0, 0);
                                    fZ fZ3 = new fZ(0, 0, 0);
                                    int n19 = n15;
                                    block3: while (true) {
                                        int n20 = n19;
                                        block4: while (n20 < n17) {
                                            n13 = n16;
                                            if (string != null) continue block2;
                                            int n21 = n13;
                                            while (n21 < n18) {
                                                block18: {
                                                    fZ2.a(n19, 0, n21);
                                                    n n22 = z2.d(fZ2);
                                                    n20 = 0;
                                                    if (string != null) continue block4;
                                                    int n23 = n20;
                                                    while (n23 < n22.b()) {
                                                        fZ3.a(n19, n23, n21);
                                                        i i2 = z2.d(fZ3);
                                                        if (string == null) {
                                                            if (string == null) {
                                                                if (i2.o() == c.L) {
                                                                    z2.a(n19, n21, fZ3.b(), n22.b());
                                                                    ++n3;
                                                                    if (string == null) break;
                                                                }
                                                                ++n23;
                                                            }
                                                            if (string == null) continue;
                                                        }
                                                        break block18;
                                                    }
                                                    ++n21;
                                                }
                                                if (string == null) continue;
                                            }
                                            ++n19;
                                            if (string == null) continue block3;
                                        }
                                        break;
                                    }
                                }
                                ++n12;
                                if (string == null) continue block1;
                            }
                            break;
                        }
                        ++n11;
                    }
                    if (string == null) continue;
                }
                n2 = n3;
            }
            if (n2 > 0) {
                String string = "server";
                if (fU.a8()) {
                    string = "client";
                }
                fU.b("ClearWater (" + string + ") relighted " + n3 + " chunks");
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

