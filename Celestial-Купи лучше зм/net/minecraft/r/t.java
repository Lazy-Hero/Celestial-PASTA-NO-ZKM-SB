/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class t
implements a {
    private static final /* synthetic */ String[] a;

    @Override
    public r a(r r2) {
        block2: {
            short s2;
            block3: {
                short s3;
                block4: {
                    r r3;
                    block5: {
                        String string = m.b();
                        if (!"minecraft:spawn_egg".equals(r2.j("id"))) break block2;
                        r3 = r2.h("tag");
                        r r4 = r3.h("EntityTag");
                        s3 = r2.q("Damage");
                        s2 = r4.a("id", 8);
                        if (string != null) break block3;
                        if (s2 != 0) break block4;
                        String string2 = a[s3 & 0xFF];
                        if (string != null) break block5;
                        if (string2 == null) break block4;
                        r4.a("id", string2);
                        r3.a("EntityTag", r4);
                    }
                    r2.a("tag", r3);
                }
                s2 = s3;
            }
            if (s2 == 0) break block2;
            r2.a("Damage", (short)0);
        }
        return r2;
    }

    static {
        String[] arrstring = a = new String[256];
        arrstring[1] = "Item";
        arrstring[2] = "XPOrb";
        arrstring[7] = "ThrownEgg";
        arrstring[8] = "LeashKnot";
        arrstring[9] = "Painting";
        arrstring[10] = "Arrow";
        arrstring[11] = "Snowball";
        arrstring[12] = "Fireball";
        arrstring[13] = "SmallFireball";
        arrstring[14] = "ThrownEnderpearl";
        arrstring[15] = "EyeOfEnderSignal";
        arrstring[16] = "ThrownPotion";
        arrstring[17] = "ThrownExpBottle";
        arrstring[18] = "ItemFrame";
        arrstring[19] = "WitherSkull";
        arrstring[20] = "PrimedTnt";
        arrstring[21] = "FallingSand";
        arrstring[22] = "FireworksRocketEntity";
        arrstring[23] = "TippedArrow";
        arrstring[24] = "SpectralArrow";
        arrstring[25] = "ShulkerBullet";
        arrstring[26] = "DragonFireball";
        arrstring[30] = "ArmorStand";
        arrstring[41] = "Boat";
        arrstring[42] = "MinecartRideable";
        arrstring[43] = "MinecartChest";
        arrstring[44] = "MinecartFurnace";
        arrstring[45] = "MinecartTNT";
        arrstring[46] = "MinecartHopper";
        arrstring[47] = "MinecartSpawner";
        arrstring[40] = "MinecartCommandBlock";
        arrstring[48] = "Mob";
        arrstring[49] = "Monster";
        arrstring[50] = "Creeper";
        arrstring[51] = "Skeleton";
        arrstring[52] = "Spider";
        arrstring[53] = "Giant";
        arrstring[54] = "Zombie";
        arrstring[55] = "Slime";
        arrstring[56] = "Ghast";
        arrstring[57] = "PigZombie";
        arrstring[58] = "Enderman";
        arrstring[59] = "CaveSpider";
        arrstring[60] = "Silverfish";
        arrstring[61] = "Blaze";
        arrstring[62] = "LavaSlime";
        arrstring[63] = "EnderDragon";
        arrstring[64] = "WitherBoss";
        arrstring[65] = "Bat";
        arrstring[66] = "Witch";
        arrstring[67] = "Endermite";
        arrstring[68] = "Guardian";
        arrstring[69] = "Shulker";
        arrstring[90] = "Pig";
        arrstring[91] = "Sheep";
        arrstring[92] = "Cow";
        arrstring[93] = "Chicken";
        arrstring[94] = "Squid";
        arrstring[95] = "Wolf";
        arrstring[96] = "MushroomCow";
        arrstring[97] = "SnowMan";
        arrstring[98] = "Ozelot";
        arrstring[99] = "VillagerGolem";
        arrstring[100] = "EntityHorse";
        arrstring[101] = "Rabbit";
        arrstring[120] = "Villager";
        arrstring[200] = "EnderCrystal";
    }

    @Override
    public int a() {
        return 105;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

