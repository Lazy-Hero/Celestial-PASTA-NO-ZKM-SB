/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.util.Locale;
import net.minecraft.Q.aD;

public enum Q {
    TITLE,
    SUBTITLE,
    ACTIONBAR,
    TIMES,
    CLEAR,
    RESET;


    public static Q a(String string) {
        Q q2;
        block4: {
            Q[] arrq = Q.values();
            int n2 = arrq.length;
            boolean bl2 = aD.i();
            int n3 = 0;
            while (n3 < n2) {
                Q q3 = arrq[n3];
                if (bl2) {
                    q2 = q3;
                    if (!bl2) break block4;
                    if (q2.name().equalsIgnoreCase(string)) {
                        return q3;
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
            q2 = TITLE;
        }
        return q2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static String[] a() {
        String[] arrstring;
        block2: {
            String[] arrstring2 = new String[Q.values().length];
            int n2 = 0;
            boolean bl2 = aD.i();
            for (Q q2 : Q.values()) {
                arrstring = arrstring2;
                if (bl2) {
                    arrstring[n2++] = q2.name().toLowerCase(Locale.ROOT);
                    if (bl2) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }
}

