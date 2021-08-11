/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.P;
import net.minecraft.N.j;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.m;
import net.minecraft.x.d;

public class Q
extends P {
    @Override
    public String a() {
        return "minecraft:dropper";
    }

    public static void b(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new d(Q.class, "Items"));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        Q q2 = this;
        if (arrm == null) {
            if (!q2.g()) return "container.dropper";
            q2 = this;
        }
        String string = q2.j;
        return string;
    }
}

