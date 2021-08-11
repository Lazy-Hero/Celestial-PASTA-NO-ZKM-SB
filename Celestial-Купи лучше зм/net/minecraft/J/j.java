/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.J;

import com.google.common.collect.Maps;
import java.util.Map;

public final class j
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j HOPPER;
    public static final /* synthetic */ /* enum */ j COMMAND_BLOCK;
    public static final /* synthetic */ /* enum */ j RIDEABLE;
    public static final /* synthetic */ /* enum */ j CHEST;
    private static final /* synthetic */ Map<Integer, j> e;
    public static final /* synthetic */ /* enum */ j FURNACE;
    private static final /* synthetic */ j[] c;
    private final /* synthetic */ int a;
    public static final /* synthetic */ /* enum */ j TNT;
    private static /* synthetic */ int b;
    private final /* synthetic */ String d;
    public static final /* synthetic */ /* enum */ j SPAWNER;

    static {
        RIDEABLE = new j(0, "MinecartRideable");
        CHEST = new j(1, "MinecartChest");
        FURNACE = new j(2, "MinecartFurnace");
        TNT = new j(3, "MinecartTNT");
        SPAWNER = new j(4, "MinecartSpawner");
        j.b(76);
        HOPPER = new j(5, "MinecartHopper");
        COMMAND_BLOCK = new j(6, "MinecartCommandBlock");
        c = new j[]{RIDEABLE, CHEST, FURNACE, TNT, SPAWNER, HOPPER, COMMAND_BLOCK};
        e = Maps.newHashMap();
        for (j j2 : j.values()) {
            e.put(j2.a(), j2);
        }
    }

    public static int c() {
        int n2 = j.d();
        if (n2 == 0) {
            return 60;
        }
        return 0;
    }

    public int a() {
        return this.a;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private j(int n3, String string2) {
        this.a = n3;
        this.d = string2;
    }

    public static void b(int n2) {
        b = n2;
    }

    public static int d() {
        return b;
    }

    public static j c(int n2) {
        j j2 = e.get(n2);
        int n3 = j.d();
        j j3 = j2;
        if (n3 != 0) {
            j3 = j3 == null ? RIDEABLE : j2;
        }
        return j3;
    }

    public static j[] values() {
        return (j[])c.clone();
    }

    public String e() {
        return this.d;
    }
}

