/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;

public enum aC {
    NONE(0, 0.0, 0.0, 0.0),
    SUMMON_VEX(1, 0.7, 0.7, 0.8),
    FANGS(2, 0.4, 0.3, 0.35),
    WOLOLO(3, 0.7, 0.5, 0.2),
    DISAPPEAR(4, 0.3, 0.3, 0.8),
    BLINDNESS(5, 0.1, 0.1, 0.2);

    private final /* synthetic */ double[] b;
    private final /* synthetic */ int c;

    static double[] b(aC aC2) {
        return aC2.b;
    }

    public static aC a(int n2) {
        aC aC2;
        block4: {
            aC[] arraC = aC.values();
            int n3 = arraC.length;
            int[] arrn = S.f();
            int n4 = 0;
            while (n4 < n3) {
                aC2 = arraC[n4];
                if (arrn != null) {
                    aC aC3 = aC2;
                    if (arrn != null) {
                        if (n2 == aC3.c) {
                            return aC3;
                        }
                        ++n4;
                    }
                    if (arrn != null) continue;
                }
                break block4;
            }
            aC2 = NONE;
        }
        return aC2;
    }

    static int a(aC aC2) {
        return aC2.c;
    }

    private aC(int n3, double d10, double d11, double d12) {
        this.c = n3;
        this.b = new double[]{d10, d11, d12};
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

