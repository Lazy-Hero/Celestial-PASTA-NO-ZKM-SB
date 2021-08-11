/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class p
implements a {
    @Override
    public int a() {
        return 806;
    }

    @Override
    public r a(r r2) {
        r r3;
        block12: {
            block11: {
                block9: {
                    boolean bl2;
                    r r4;
                    block10: {
                        String string;
                        block6: {
                            boolean bl3;
                            block8: {
                                String string2;
                                block7: {
                                    block5: {
                                        string2 = r2.j("id");
                                        string = m.b();
                                        bl3 = "minecraft:potion".equals(string2);
                                        if (string != null) break block5;
                                        if (bl3) break block6;
                                        bl3 = "minecraft:splash_potion".equals(string2);
                                    }
                                    if (string != null) break block7;
                                    if (bl3) break block6;
                                    bl3 = "minecraft:lingering_potion".equals(string2);
                                }
                                if (string != null) break block8;
                                if (bl3) break block6;
                                bl3 = "minecraft:tipped_arrow".equals(string2);
                            }
                            if (!bl3) break block9;
                        }
                        r4 = r2.h("tag");
                        bl2 = r4.a("Potion", 8);
                        if (string != null) break block10;
                        if (!bl2) {
                            r4.a("Potion", "minecraft:water");
                        }
                        r3 = r2;
                        if (string != null) break block11;
                        bl2 = r3.a("tag", 10);
                    }
                    if (!bl2) {
                        r2.a("tag", r4);
                    }
                }
                r3 = r2;
            }
            if (!net.minecraft.k.m.c()) break block12;
            m.b("bsRjZb");
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

