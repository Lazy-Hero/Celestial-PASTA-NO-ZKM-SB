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

public class z
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
        a.put("Airportal", "minecraft:end_portal");
        a.put("Banner", "minecraft:banner");
        a.put("Beacon", "minecraft:beacon");
        a.put("Cauldron", "minecraft:brewing_stand");
        a.put("Chest", "minecraft:chest");
        a.put("Comparator", "minecraft:comparator");
        a.put("Control", "minecraft:command_block");
        a.put("DLDetector", "minecraft:daylight_detector");
        a.put("Dropper", "minecraft:dropper");
        a.put("EnchantTable", "minecraft:enchanting_table");
        a.put("EndGateway", "minecraft:end_gateway");
        a.put("EnderChest", "minecraft:ender_chest");
        a.put("FlowerPot", "minecraft:flower_pot");
        a.put("Furnace", "minecraft:furnace");
        a.put("Hopper", "minecraft:hopper");
        a.put("MobSpawner", "minecraft:mob_spawner");
        a.put("Music", "minecraft:noteblock");
        a.put("Piston", "minecraft:piston");
        a.put("RecordPlayer", "minecraft:jukebox");
        a.put("Sign", "minecraft:sign");
        a.put("Skull", "minecraft:skull");
        a.put("Structure", "minecraft:structure_block");
        a.put("Trap", "minecraft:dispenser");
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

