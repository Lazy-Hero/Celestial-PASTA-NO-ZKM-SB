/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.r;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.P.r;
import net.minecraft.av.a;

public class d
implements a {
    private static final /* synthetic */ Map<String, String> a;

    @Override
    public int a() {
        return 704;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = Maps.newHashMap();
        a.put("AreaEffectCloud", "minecraft:area_effect_cloud");
        a.put("ArmorStand", "minecraft:armor_stand");
        a.put("Arrow", "minecraft:arrow");
        a.put("Bat", "minecraft:bat");
        a.put("Blaze", "minecraft:blaze");
        a.put("Boat", "minecraft:boat");
        a.put("CaveSpider", "minecraft:cave_spider");
        a.put("Chicken", "minecraft:chicken");
        a.put("Cow", "minecraft:cow");
        a.put("Creeper", "minecraft:creeper");
        a.put("Donkey", "minecraft:donkey");
        a.put("DragonFireball", "minecraft:dragon_fireball");
        a.put("ElderGuardian", "minecraft:elder_guardian");
        a.put("EnderCrystal", "minecraft:ender_crystal");
        a.put("EnderDragon", "minecraft:ender_dragon");
        a.put("Enderman", "minecraft:enderman");
        a.put("Endermite", "minecraft:endermite");
        a.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
        a.put("FallingSand", "minecraft:falling_block");
        a.put("Fireball", "minecraft:fireball");
        a.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
        a.put("Ghast", "minecraft:ghast");
        a.put("Giant", "minecraft:giant");
        a.put("Guardian", "minecraft:guardian");
        a.put("Horse", "minecraft:horse");
        a.put("Husk", "minecraft:husk");
        a.put("Item", "minecraft:item");
        a.put("ItemFrame", "minecraft:item_frame");
        a.put("LavaSlime", "minecraft:magma_cube");
        a.put("LeashKnot", "minecraft:leash_knot");
        a.put("MinecartChest", "minecraft:chest_minecart");
        a.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
        a.put("MinecartFurnace", "minecraft:furnace_minecart");
        a.put("MinecartHopper", "minecraft:hopper_minecart");
        a.put("MinecartRideable", "minecraft:minecart");
        a.put("MinecartSpawner", "minecraft:spawner_minecart");
        a.put("MinecartTNT", "minecraft:tnt_minecart");
        a.put("Mule", "minecraft:mule");
        a.put("MushroomCow", "minecraft:mooshroom");
        a.put("Ozelot", "minecraft:ocelot");
        a.put("Painting", "minecraft:painting");
        a.put("Pig", "minecraft:pig");
        a.put("PigZombie", "minecraft:zombie_pigman");
        a.put("PolarBear", "minecraft:polar_bear");
        a.put("PrimedTnt", "minecraft:tnt");
        a.put("Rabbit", "minecraft:rabbit");
        a.put("Sheep", "minecraft:sheep");
        a.put("Shulker", "minecraft:shulker");
        a.put("ShulkerBullet", "minecraft:shulker_bullet");
        a.put("Silverfish", "minecraft:silverfish");
        a.put("Skeleton", "minecraft:skeleton");
        a.put("SkeletonHorse", "minecraft:skeleton_horse");
        a.put("Slime", "minecraft:slime");
        a.put("SmallFireball", "minecraft:small_fireball");
        a.put("SnowMan", "minecraft:snowman");
        a.put("Snowball", "minecraft:snowball");
        a.put("SpectralArrow", "minecraft:spectral_arrow");
        a.put("Spider", "minecraft:spider");
        a.put("Squid", "minecraft:squid");
        a.put("Stray", "minecraft:stray");
        a.put("ThrownEgg", "minecraft:egg");
        a.put("ThrownEnderpearl", "minecraft:ender_pearl");
        a.put("ThrownExpBottle", "minecraft:xp_bottle");
        a.put("ThrownPotion", "minecraft:potion");
        a.put("Villager", "minecraft:villager");
        a.put("VillagerGolem", "minecraft:villager_golem");
        a.put("Witch", "minecraft:witch");
        a.put("WitherBoss", "minecraft:wither");
        a.put("WitherSkeleton", "minecraft:wither_skeleton");
        a.put("WitherSkull", "minecraft:wither_skull");
        a.put("Wolf", "minecraft:wolf");
        a.put("XPOrb", "minecraft:xp_orb");
        a.put("Zombie", "minecraft:zombie");
        a.put("ZombieHorse", "minecraft:zombie_horse");
        a.put("ZombieVillager", "minecraft:zombie_villager");
    }

    @Override
    public r a(r r2) {
        block0: {
            String string = a.get(r2.j("id"));
            if (string == null) break block0;
            r2.a("id", string);
        }
        return r2;
    }
}

