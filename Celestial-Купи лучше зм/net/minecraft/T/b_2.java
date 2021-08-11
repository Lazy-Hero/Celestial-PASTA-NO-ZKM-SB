/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.A.h;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.k.m;
import net.minecraft.k.o;
import net.minecraft.t.a;
import net.minecraft.t.c;
import net.minecraft.t.f;
import net.minecraft.u.d;

public class b {
    public static c a(r r2) {
        int n2 = r2.m("xPos");
        int n3 = r2.m("zPos");
        c c10 = new c(n2, n3);
        c10.b = r2.a("Blocks");
        c10.i = new a(r2.a("Data"), 7);
        c10.f = new a(r2.a("SkyLight"), 7);
        c10.e = new a(r2.a("BlockLight"), 7);
        c10.l = r2.a("HeightMap");
        c10.g = r2.f("TerrainPopulated");
        c10.c = r2.c("Entities", 10);
        c10.h = r2.c("TileEntities", 10);
        c10.d = r2.c("TileTicks", 10);
        try {
            c10.j = r2.o("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            c10.j = r2.m("LastUpdate");
        }
        return c10;
    }

    private static ClassCastException a(ClassCastException classCastException) {
        return classCastException;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(c c10, r r2, net.minecraft.A.b b10) {
        block35: {
            int n2;
            block34: {
                u u2;
                String string;
                r r3;
                block33: {
                    block29: {
                        int n3;
                        block26: {
                            block25: {
                                int n4 = f.e();
                                r2.b("xPos", c10.a);
                                r2.b("zPos", c10.k);
                                r2.a("LastUpdate", c10.j);
                                n2 = n4;
                                int[] arrn = new int[c10.l.length];
                                for (int i2 = 0; i2 < c10.l.length; ++i2) {
                                    arrn[i2] = c10.l[i2];
                                    if (n2 == 0) {
                                        if (n2 == 0) continue;
                                    }
                                    break block25;
                                }
                                r2.a("HeightMap", arrn);
                                r2.a("TerrainPopulated", c10.g);
                            }
                            u u3 = new u();
                            int n5 = 0;
                            block1: while (true) {
                                int n6 = n5;
                                block2: while (n6 < 8) {
                                    block32: {
                                        int n7;
                                        int n8;
                                        block31: {
                                            block27: {
                                                int n9 = 1;
                                                n3 = 0;
                                                if (n2 != 0) break block26;
                                                int n10 = n3;
                                                block3: while (true) {
                                                    int n11 = n10;
                                                    block4: while (n11 < 16) {
                                                        n8 = n9;
                                                        if (n2 != 0 || n2 != 0) break block27;
                                                        if (n8 == 0) break block3;
                                                        int n12 = 0;
                                                        block5: while (true) {
                                                            int n13 = n12;
                                                            block6: while (n13 < 16) {
                                                                void var10_17;
                                                                n11 = n9;
                                                                if (n2 != 0) continue block4;
                                                                if (n2 == 0) {
                                                                    if (n11 == 0) break block5;
                                                                    boolean bl2 = var10_17 = false;
                                                                }
                                                                while (var10_17 < 16) {
                                                                    int n14 = n10 << 11 | var10_17 << 7 | n12 + (n5 << 4);
                                                                    n7 = c10.b[n14];
                                                                    if (n2 == 0) {
                                                                        n13 = n7;
                                                                        if (n2 != 0) continue block6;
                                                                        if (n13 != 0) {
                                                                            n9 = 0;
                                                                            if (n2 == 0) break;
                                                                        }
                                                                        ++var10_17;
                                                                    }
                                                                    if (n2 == 0) continue;
                                                                }
                                                                ++n12;
                                                                if (n2 == 0) continue block5;
                                                            }
                                                            break;
                                                        }
                                                        ++n10;
                                                        if (n2 == 0) continue block3;
                                                    }
                                                    break;
                                                }
                                                n8 = n9;
                                            }
                                            if (n2 != 0) break block31;
                                            if (n8 != 0) break block32;
                                            n8 = 4096;
                                        }
                                        byte[] arrby = new byte[n8];
                                        net.minecraft.o.m m2 = new net.minecraft.o.m();
                                        net.minecraft.o.m m3 = new net.minecraft.o.m();
                                        net.minecraft.o.m m4 = new net.minecraft.o.m();
                                        n7 = 0;
                                        block8: while (true) {
                                            int n15 = n7;
                                            block9: while (n15 < 16) {
                                                n6 = 0;
                                                if (n2 != 0) continue block2;
                                                int n16 = n6;
                                                while (n16 < 16) {
                                                    block28: {
                                                        n15 = 0;
                                                        if (n2 != 0) continue block9;
                                                        for (int i3 = v723019; i3 < 16; ++i3) {
                                                            int n17 = n7 << 11 | i3 << 7 | n16 + (n5 << 4);
                                                            byte by2 = c10.b[n17];
                                                            arrby[n16 << 8 | i3 << 4 | n7] = (byte)(by2 & 0xFF);
                                                            m2.a(n7, n16, i3, c10.i.a(n7, n16 + (n5 << 4), i3));
                                                            m3.a(n7, n16, i3, c10.f.a(n7, n16 + (n5 << 4), i3));
                                                            m4.a(n7, n16, i3, c10.e.a(n7, n16 + (n5 << 4), i3));
                                                            if (n2 == 0) {
                                                                if (n2 == 0) continue;
                                                            }
                                                            break block28;
                                                        }
                                                        ++n16;
                                                    }
                                                    if (n2 == 0) continue;
                                                }
                                                ++n7;
                                                if (n2 == 0) continue block8;
                                            }
                                            break;
                                        }
                                        r r4 = new r();
                                        r4.a("Y", (byte)(n5 & 0xFF));
                                        r4.a("Blocks", arrby);
                                        r4.a("Data", m2.a());
                                        r4.a("SkyLight", m3.a());
                                        r4.a("BlockLight", m4.a());
                                        u3.a(r4);
                                    }
                                    ++n5;
                                    if (n2 == 0) continue block1;
                                }
                                break;
                            }
                            r2.a("Sections", u3);
                            n3 = 256;
                        }
                        byte[] arrby = new byte[n3];
                        o o2 = new o();
                        int n18 = 0;
                        while (n18 < 16) {
                            block30: {
                                if (n2 != 0) break block29;
                                for (int i4 = 0; i4 < 16; ++i4) {
                                    o2.a(c10.a << 4 | n18, 0, c10.k << 4 | i4);
                                    arrby[i4 << 4 | n18] = (byte)(h.b(b10.a(o2, d.ai)) & 0xFF);
                                    if (n2 == 0) {
                                        if (n2 == 0) continue;
                                    }
                                    break block30;
                                }
                                ++n18;
                            }
                            if (n2 == 0) continue;
                        }
                        r2.a("Biomes", arrby);
                        r2.a("Entities", c10.c);
                        r3 = r2;
                        string = "TileEntities";
                        u2 = c10.h;
                        if (n2 != 0) break block33;
                        r3.a(string, u2);
                    }
                    if (c10.d == null) break block34;
                    r3 = r2;
                    string = "TileTicks";
                    u2 = c10.d;
                }
                r3.a(string, u2);
            }
            if (m.d()) break block35;
            f.b(++n2);
        }
    }
}

