/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.util.UUID;
import net.minecraft.ar.v;
import net.minecraft.client.D.h;

public class z {
    private static final /* synthetic */ v b;
    private static final /* synthetic */ v a;

    public static String b(UUID uUID) {
        return z.a(uUID) ? "slim" : "default";
    }

    private static boolean a(UUID uUID) {
        boolean bl2 = h.c();
        boolean bl3 = uUID.hashCode() & 1;
        if (bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    static {
        b = new v("textures/entity/steve.png");
        a = new v("textures/entity/alex.png");
    }

    public static v c(UUID uUID) {
        return z.a(uUID) ? a : b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static v a() {
        return b;
    }
}

