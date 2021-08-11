/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.ar.aA;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class w
implements a {
    @Override
    public r a(r r2) {
        r r3;
        block5: {
            block4: {
                byte by2;
                String string;
                r r4;
                block10: {
                    aA aA2;
                    block8: {
                        block9: {
                            int n2;
                            block6: {
                                block7: {
                                    boolean bl2;
                                    String string2;
                                    boolean bl3;
                                    block2: {
                                        block3: {
                                            String string3 = r2.j("id");
                                            boolean bl4 = "Painting".equals(string3);
                                            bl3 = "ItemFrame".equals(string3);
                                            string2 = m.b();
                                            bl2 = bl4;
                                            if (string2 != null) break block2;
                                            if (bl2) break block3;
                                            bl2 = bl3;
                                            if (string2 != null) break block2;
                                            if (!bl2) break block4;
                                        }
                                        r3 = r2;
                                        if (string2 != null) break block5;
                                        bl2 = r3.a("Facing", 99);
                                    }
                                    if (bl2) break block4;
                                    n2 = r2.a("Direction", 99);
                                    if (string2 != null) break block6;
                                    if (n2 == 0) break block7;
                                    aA2 = aA.b(r2.r("Direction"));
                                    r2.b("TileX", r2.m("TileX") + aA2.r());
                                    r2.b("TileY", r2.m("TileY") + aA2.p());
                                    r2.b("TileZ", r2.m("TileZ") + aA2.i());
                                    r4 = r2;
                                    string = "Direction";
                                    if (string2 != null) break block8;
                                    r4.k(string);
                                    if (!bl3) break block9;
                                    r4 = r2;
                                    string = "ItemRotation";
                                    by2 = (byte)99;
                                    if (string2 != null) break block10;
                                    if (!r4.a(string, (int)by2)) break block9;
                                    r2.a("ItemRotation", (byte)(r2.r("ItemRotation") * 2));
                                    if (string2 == null) break block9;
                                }
                                n2 = r2.r("Dir");
                            }
                            aA2 = aA.b(n2);
                            r2.k("Dir");
                        }
                        r4 = r2;
                        string = "Facing";
                    }
                    by2 = (byte)aA2.k();
                }
                r4.a(string, by2);
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 111;
    }
}

