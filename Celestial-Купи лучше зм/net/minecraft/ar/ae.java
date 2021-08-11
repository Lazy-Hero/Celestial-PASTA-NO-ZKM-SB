/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.P;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;

public enum ae {
    NONE("rotate_0"),
    CLOCKWISE_90("rotate_90"),
    CLOCKWISE_180("rotate_180"),
    COUNTERCLOCKWISE_90("rotate_270");

    private final /* synthetic */ String c;
    private static final /* synthetic */ String[] a;

    public int a(int n2, int n3) {
        int n4 = v.d();
        int n5 = P.a[this.ordinal()];
        if (n4 != 0) {
            switch (n5) {
                case 2: {
                    return (n2 + n3 / 4) % n3;
                }
                case 3: {
                    return (n2 + n3 / 2) % n3;
                }
                case 4: {
                    return (n2 + n3 * 3 / 4) % n3;
                }
            }
            n5 = n2;
        }
        return n5;
    }

    static {
        a = new String[ae.values().length];
        int n2 = 0;
        for (ae ae2 : ae.values()) {
            ae.a[n2++] = ae2.c;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public ae a(ae var1_1) {
        var2_2 = v.d();
        v0 = P.a[var1_1.ordinal()];
        if (var2_2 == 0) ** GOTO lbl7
        switch (v0) {
            case 3: {
                v0 = P.a[this.ordinal()];
lbl7:
                // 2 sources

                if (var2_2 == 0) ** GOTO lbl19
                switch (v0) {
                    case 1: {
                        return ae.CLOCKWISE_180;
                    }
                    case 2: {
                        return ae.COUNTERCLOCKWISE_90;
                    }
                    case 3: {
                        return ae.NONE;
                    }
                    case 4: {
                        return ae.CLOCKWISE_90;
                    }
                }
            }
            case 4: {
                v0 = P.a[this.ordinal()];
lbl19:
                // 2 sources

                if (var2_2 == 0) ** GOTO lbl31
                switch (v0) {
                    case 1: {
                        return ae.COUNTERCLOCKWISE_90;
                    }
                    case 2: {
                        return ae.NONE;
                    }
                    case 3: {
                        return ae.CLOCKWISE_90;
                    }
                    case 4: {
                        return ae.CLOCKWISE_180;
                    }
                }
            }
            case 2: {
                v0 = P.a[this.ordinal()];
lbl31:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return ae.CLOCKWISE_90;
                    }
                    case 2: {
                        return ae.CLOCKWISE_180;
                    }
                    case 3: {
                        return ae.COUNTERCLOCKWISE_90;
                    }
                    case 4: {
                        return ae.NONE;
                    }
                }
                return this;
            }
        }
        return this;
    }

    private ae(String string2) {
        this.c = string2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aA a(aA aA2) {
        block8: {
            aA aA3;
            block7: {
                int n2 = v.d();
                aA3 = aA2;
                if (n2 == 0) break block7;
                if (aA3.g() != Q.Y) break block8;
                aA3 = aA2;
            }
            return aA3;
        }
        switch (this) {
            case CLOCKWISE_90: {
                return aA2.l();
            }
            case CLOCKWISE_180: {
                return aA2.h();
            }
            case COUNTERCLOCKWISE_90: {
                return aA2.d();
            }
        }
        return aA2;
    }
}

