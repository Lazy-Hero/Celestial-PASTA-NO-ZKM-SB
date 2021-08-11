/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aj;

import net.minecraft.aj.j;
import net.minecraft.k.m;

public enum t {
    THIS("this"),
    KILLER("killer"),
    KILLER_PLAYER("killer_player");

    private final /* synthetic */ String b;

    private t(String string2) {
        this.b = string2;
    }

    static String a(t t2) {
        return t2.b;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static t a(String string) {
        t[] arrt = t.values();
        m[] arrm = j.b();
        int n2 = arrt.length;
        int n3 = 0;
        while (n3 < n2) {
            t t2 = arrt[n3];
            if (arrm != null) {
                if (t2.b.equals(string)) {
                    return t2;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        throw new IllegalArgumentException("Invalid entity target " + string);
    }
}

