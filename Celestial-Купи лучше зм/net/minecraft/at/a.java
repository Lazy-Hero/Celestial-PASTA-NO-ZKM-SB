/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import net.minecraft.at.c;
import net.minecraft.k.m;

public enum a {
    CHAT(0),
    SYSTEM(1),
    GAME_INFO(2);

    private final /* synthetic */ byte b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public byte a() {
        return this.b;
    }

    private a(byte by2) {
        this.b = by2;
    }

    public static a a(byte by2) {
        a a10;
        block4: {
            a[] arra = net.minecraft.at.a.values();
            int n2 = arra.length;
            int n3 = 0;
            m[] arrm = c.b();
            while (n3 < n2) {
                a10 = arra[n3];
                if (arrm == null) {
                    a a11 = a10;
                    if (arrm == null) {
                        if (by2 == a11.b) {
                            return a11;
                        }
                        ++n3;
                    }
                    if (arrm == null) continue;
                }
                break block4;
            }
            a10 = CHAT;
        }
        return a10;
    }
}

