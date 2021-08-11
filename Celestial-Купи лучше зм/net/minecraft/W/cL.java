/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum cL implements p
{
    NORTH_SOUTH(0, "north_south"),
    EAST_WEST(1, "east_west"),
    ASCENDING_EAST(2, "ascending_east"),
    ASCENDING_WEST(3, "ascending_west"),
    ASCENDING_NORTH(4, "ascending_north"),
    ASCENDING_SOUTH(5, "ascending_south"),
    SOUTH_EAST(6, "south_east"),
    SOUTH_WEST(7, "south_west"),
    NORTH_WEST(8, "north_west"),
    NORTH_EAST(9, "north_east");

    private static final /* synthetic */ cL[] c;
    private final /* synthetic */ String e;
    private static /* synthetic */ boolean b;
    private final /* synthetic */ int f;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        boolean bl2 = cL.e();
        cL cL2 = this;
        cL cL3 = ASCENDING_NORTH;
        if (bl2) {
            if (cL2 == cL3) return true;
            cL2 = this;
            cL3 = ASCENDING_EAST;
        }
        if (bl2) {
            if (cL2 == cL3) return true;
            cL2 = this;
            cL3 = ASCENDING_SOUTH;
        }
        if (bl2) {
            if (cL2 == cL3) return true;
            cL2 = this;
            cL3 = ASCENDING_WEST;
        }
        if (cL2 != cL3) return false;
        return true;
    }

    public static boolean e() {
        boolean bl2 = cL.b();
        return !bl2;
    }

    public static boolean b() {
        return b;
    }

    private cL(int n3, String string2) {
        this.f = n3;
        this.e = string2;
    }

    public String toString() {
        return this.e;
    }

    @Override
    public String a() {
        return this.e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public int d() {
        return this.f;
    }

    public static cL a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    boolean bl2 = cL.b();
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < c.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return c[n2];
    }

    static {
        c = new cL[cL.values().length];
        cL.b(false);
        cL[] arrcL = cL.values();
        int n2 = arrcL.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cL cL2;
            cL.c[cL2.d()] = cL2 = arrcL[i2];
        }
    }
}

