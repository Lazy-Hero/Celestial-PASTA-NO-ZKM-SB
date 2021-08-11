/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum k implements p
{
    NORTH_WEST(1, "north_west"),
    NORTH(2, "north"),
    NORTH_EAST(3, "north_east"),
    WEST(4, "west"),
    CENTER(5, "center"),
    EAST(6, "east"),
    SOUTH_WEST(7, "south_west"),
    SOUTH(8, "south"),
    SOUTH_EAST(9, "south_east"),
    STEM(10, "stem"),
    ALL_INSIDE(0, "all_inside"),
    ALL_OUTSIDE(14, "all_outside"),
    ALL_STEM(15, "all_stem");

    private final /* synthetic */ int a;
    private final /* synthetic */ String c;
    private static final /* synthetic */ k[] b;

    public static k a(int n2) {
        k k2;
        boolean bl2;
        block6: {
            int n3;
            block4: {
                block5: {
                    bl2 = cL.e();
                    n3 = n2;
                    if (!bl2) break block4;
                    if (n3 < 0) break block5;
                    n3 = n2;
                    if (!bl2) break block4;
                    if (n3 < b.length) break block6;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        k k3 = k2 = b[n2];
        if (bl2) {
            k3 = k3 == null ? b[0] : k2;
        }
        return k3;
    }

    public int a() {
        return this.a;
    }

    static {
        b = new k[16];
        k[] arrk = k.values();
        int n2 = arrk.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2;
            k.b[k2.a()] = k2 = arrk[i2];
        }
    }

    private k(int n3, String string2) {
        this.a = n3;
        this.c = string2;
    }

    @Override
    public String a() {
        return this.c;
    }

    public String toString() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

