/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.r;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class C
implements a {
    private static final /* synthetic */ Set<String> a;

    @Override
    public int a() {
        return 109;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = Sets.newHashSet((Object[])new String[]{"ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie"});
    }

    @Override
    public r a(r r2) {
        block5: {
            float f10;
            block8: {
                String string;
                r r3;
                block9: {
                    boolean bl2;
                    block6: {
                        String string2;
                        block7: {
                            block4: {
                                string2 = m.b();
                                bl2 = a.contains(r2.j("id"));
                                if (string2 != null) break block4;
                                if (!bl2) break block5;
                                bl2 = r2.a("HealF", 99);
                            }
                            if (string2 != null) break block6;
                            if (!bl2) break block7;
                            f10 = r2.d("HealF");
                            r2.k("HealF");
                            if (string2 == null) break block8;
                        }
                        r3 = r2;
                        string = "Health";
                        if (string2 != null) break block9;
                        bl2 = r3.a(string, 99);
                    }
                    if (!bl2) {
                        return r2;
                    }
                    r3 = r2;
                    string = "Health";
                }
                f10 = r3.d(string);
            }
            r2.a("Health", f10);
        }
        return r2;
    }
}

