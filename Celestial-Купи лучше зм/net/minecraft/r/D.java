/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class D
implements a {
    public static final /* synthetic */ String[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 813;
    }

    @Override
    public r a(r r2) {
        r r3;
        block9: {
            block8: {
                r r4;
                int n2;
                block11: {
                    boolean bl2;
                    block10: {
                        r r5;
                        boolean bl3;
                        String string;
                        block7: {
                            string = m.b();
                            bl3 = "minecraft:shulker_box".equals(r2.j("id"));
                            if (string != null) break block7;
                            if (!bl3) break block8;
                            r3 = r2;
                            if (string != null) break block9;
                            bl3 = r3.a("tag", 10);
                        }
                        if (!bl3) break block8;
                        r3 = r5 = r2.h("tag");
                        if (string != null) break block9;
                        if (!r3.a("BlockEntityTag", 10)) break block8;
                        r r6 = r5.h("BlockEntityTag");
                        int n3 = r6.c("Items", 10).c();
                        if (string == null) {
                            if (n3 != 0) {
                                r6.k("Items");
                            }
                            n3 = r6.m("Color");
                        }
                        n2 = n3;
                        r6.k("Color");
                        bl2 = r6.c();
                        if (string != null) break block10;
                        if (bl2) {
                            r5.k("BlockEntityTag");
                        }
                        r4 = r5;
                        if (string != null) break block11;
                        bl2 = r4.c();
                    }
                    if (bl2) {
                        r2.k("tag");
                    }
                    r4 = r2;
                }
                r4.a("id", a[n2 % 16]);
            }
            r3 = r2;
        }
        return r3;
    }

    static {
        a = new String[]{"minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box"};
    }
}

