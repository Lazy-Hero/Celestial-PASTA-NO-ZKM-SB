/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.client.e.s;
import net.minecraft.k.m;

public enum h {
    FILE("file"),
    SOUND_EVENT("event");

    private final /* synthetic */ String a;

    private h(String string2) {
        this.a = string2;
    }

    public static h a(String string) {
        h[] arrh = h.values();
        int n2 = arrh.length;
        int n3 = 0;
        m[] arrm = s.b();
        while (n3 < n2) {
            h h2 = arrh[n3];
            if (arrm != null) {
                if (h2.a.equals(string)) {
                    return h2;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

