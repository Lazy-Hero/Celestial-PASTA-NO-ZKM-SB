/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.x;

import net.minecraft.P.r;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.x.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a
implements g {
    private static final /* synthetic */ Logger a;

    static {
        a = LogManager.getLogger();
    }

    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block12: {
            block13: {
                boolean bl2;
                r r4;
                String string;
                block18: {
                    String string2;
                    block17: {
                        String string3;
                        block16: {
                            String string4;
                            boolean bl3;
                            block14: {
                                block15: {
                                    r r5 = r2.h("tag");
                                    string = b.b();
                                    r3 = r5;
                                    if (string == null) break block12;
                                    if (!r3.a("EntityTag", 10)) break block13;
                                    r4 = r5.h("EntityTag");
                                    string3 = r2.j("id");
                                    bl3 = "minecraft:armor_stand".equals(string3);
                                    if (string == null) break block14;
                                    if (!bl3) break block15;
                                    String string5 = string2 = n2 < 515 ? "ArmorStand" : "minecraft:armor_stand";
                                    if (string != null) break block16;
                                }
                                string4 = "minecraft:spawn_egg";
                                if (string == null) break block16;
                                bl3 = string4.equals(string3);
                            }
                            if (!bl3) {
                                return r2;
                            }
                            string4 = string2 = r4.j("id");
                        }
                        if (string2 != null) break block17;
                        a.warn("Unable to resolve Entity for ItemInstance: {}", (Object)string3);
                        bl2 = false;
                        if (string != null) break block18;
                    }
                    boolean bl4 = r4.a("id", 8);
                    if (string != null) {
                        bl4 = !bl4;
                    }
                    bl2 = bl4;
                    r4.a("id", string2);
                }
                r3 = c10.a(f.ENTITY, r4, n2);
                if (string == null) break block12;
                if (bl2) {
                    r4.k("id");
                }
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

