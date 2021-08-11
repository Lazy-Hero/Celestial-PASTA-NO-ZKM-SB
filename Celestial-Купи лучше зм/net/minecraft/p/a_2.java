/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import net.minecraft.P.i;

public class a
extends Exception {
    public a(String string, String string2, int n2) {
        super(string + " at: " + a.a(string2, n2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static String a(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = i.f();
        int n3 = Math.min(string.length(), n2);
        if (!bl2) {
            if (n3 > 35) {
                stringBuilder.append("...");
            }
            stringBuilder.append(string, Math.max(0, n3 - 35), n3);
            stringBuilder.append("<--[HERE]");
        }
        return stringBuilder.toString();
    }
}

