/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class c
implements a {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public r a(r var1_1) {
        block8: {
            block9: {
                block10: {
                    block7: {
                        var2_2 = m.b();
                        v0 = "minecraft:banner".equals(var1_1.j("id"));
                        if (var2_2 != null) break block7;
                        if (!v0) break block8;
                        v1 = var1_1;
                        if (var2_2 != null) return v1;
                        v0 = v1.a("tag", 10);
                    }
                    if (!v0) break block8;
                    v1 = var3_3 = var1_1.h("tag");
                    if (var2_2 != null) return v1;
                    if (!v1.a("BlockEntityTag", 10)) break block8;
                    v1 = var4_4 = var3_3.h("BlockEntityTag");
                    if (var2_2 != null) return v1;
                    if (!v1.a("Base", 99)) break block8;
                    var1_1.a("Damage", (short)(var4_4.q("Base") & 15));
                    v2 = var3_3.a("display", 10);
                    if (var2_2 != null) break block9;
                    if (v2 == 0) break block10;
                    var5_5 = var3_3.h("display");
                    v2 = var5_5.a("Lore", 9);
                    if (var2_2 != null) break block9;
                    if (v2 == 0) break block10;
                    var6_6 = var5_5.c("Lore", 8);
                    v2 = var6_6.b();
                    if (var2_2 == null) {
                        if (v2 == 1) {
                            v2 = "(+NBT)".equals(var6_6.c(0)) ? 1 : 0;
                            if (var2_2 == null) {
                                if (v2 != 0) {
                                    return var1_1;
                                } else {
                                    ** GOTO lbl35
                                }
                            } else {
                                ** GOTO lbl34
                            }
                        } else {
                            ** GOTO lbl33
                        }
                    }
                    break block9;
lbl33:
                    // 2 sources

                    break block10;
lbl34:
                    // 2 sources

                    break block9;
                }
                var4_4.k("Base");
                v2 = var4_4.c();
            }
            if (var2_2 == null) {
                if (v2 != 0) {
                    var3_3.k("BlockEntityTag");
                }
                v1 = var3_3;
                if (var2_2 != null) return v1;
                v2 = v1.c();
            }
            if (v2 != 0) {
                var1_1.k("tag");
            }
        }
        v1 = var1_1;
        return v1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 804;
    }
}

