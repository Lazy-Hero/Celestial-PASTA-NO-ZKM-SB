/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.u;

public enum aQ {
    NORMAL,
    MESA;


    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static aQ a(int n2) {
        aQ aQ2;
        block5: {
            int n3;
            block4: {
                String[] arrstring = u.b();
                n3 = n2;
                if (arrstring == null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < aQ.values().length) {
                aQ2 = aQ.values()[n2];
                return aQ2;
            }
        }
        aQ2 = NORMAL;
        return aQ2;
    }
}

