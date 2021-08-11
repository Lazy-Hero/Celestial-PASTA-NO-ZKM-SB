/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.an;
import net.minecraft.ar.v;

public enum h {
    NONE("no_mirror"),
    LEFT_RIGHT("mirror_left_right"),
    FRONT_BACK("mirror_front_back");

    private static final /* synthetic */ String[] b;
    private final /* synthetic */ String a;

    /*
     * Enabled aggressive block sorting
     */
    public ae b(aA aA2) {
        ae ae2;
        block5: {
            h h2;
            h h3;
            Q q2;
            block4: {
                q2 = aA2.g();
                int n2 = v.d();
                h3 = this;
                h2 = LEFT_RIGHT;
                if (n2 == 0) break block4;
                if (h3 == h2 && q2 == Q.Z) break block5;
                h3 = this;
                h2 = FRONT_BACK;
            }
            if (h3 != h2 || q2 != Q.X) {
                ae2 = ae.NONE;
                return ae2;
            }
        }
        ae2 = ae.CLOCKWISE_180;
        return ae2;
    }

    private h(String string2) {
        this.a = string2;
    }

    static {
        b = new String[h.values().length];
        int n2 = 0;
        for (h h2 : h.values()) {
            h.b[n2++] = h2.a;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(int var1_1, int var2_2) {
        var4_3 = var2_2 / 2;
        var3_4 = v.d();
        v0 = var1_1;
        v1 = var4_3;
        if (var3_4 == 0) ** GOTO lbl9
        if (v0 > v1) {
            v0 = var1_1;
            v1 = var2_2;
lbl9:
            // 2 sources

            v2 = v0 - v1;
        } else {
            v2 = var1_1;
        }
        var5_5 = v2;
        v3 = an.a[this.ordinal()];
        if (var3_4 == 0) return v3;
        switch (v3) {
            case 1: {
                return (var2_2 - var5_5) % var2_2;
            }
            case 2: {
                return (var4_3 - var5_5 + var2_2) % var2_2;
            }
        }
        v3 = var1_1;
        return v3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aA a(aA aA2) {
        int n2 = v.b();
        switch (this) {
            case FRONT_BACK: {
                aA aA3 = aA2;
                aA aA4 = aA.WEST;
                if (n2 == 0) {
                    if (aA3 == aA4) {
                        return aA.EAST;
                    }
                    aA3 = aA2;
                    if (n2 != 0) return aA3;
                    aA4 = aA.EAST;
                }
                if (aA3 == aA4) {
                    return aA.WEST;
                }
                aA3 = aA2;
                return aA3;
            }
            case LEFT_RIGHT: {
                aA aA5 = aA2;
                aA aA6 = aA.NORTH;
                if (n2 == 0) {
                    if (aA5 == aA6) {
                        return aA.SOUTH;
                    }
                    aA5 = aA2;
                    if (n2 != 0) return aA5;
                    aA6 = aA.SOUTH;
                }
                if (aA5 == aA6) {
                    return aA.NORTH;
                }
                aA5 = aA2;
                return aA5;
            }
        }
        return aA2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

