/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.I;
import net.minecraft.W.cL;
import net.minecraft.ar.aA;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum z implements p
{
    DOWN_X(0, "down_x", aA.DOWN),
    EAST(1, "east", aA.EAST),
    WEST(2, "west", aA.WEST),
    SOUTH(3, "south", aA.SOUTH),
    NORTH(4, "north", aA.NORTH),
    UP_Z(5, "up_z", aA.UP),
    UP_X(6, "up_x", aA.UP),
    DOWN_Z(7, "down_z", aA.DOWN);

    private final /* synthetic */ String c;
    private final /* synthetic */ int a;
    private static final /* synthetic */ z[] b;
    private final /* synthetic */ aA e;

    @Override
    public String a() {
        return this.c;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        return this.c;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static z a(aA var0, aA var1_1) {
        var2_2 = cL.e();
        v0 = I.d[var0.ordinal()];
        if (!var2_2) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = I.a[var1_1.g().ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return z.DOWN_X;
                    }
                    case 2: {
                        return z.DOWN_Z;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + var1_1 + " for facing " + var0);
            }
            case 2: {
                switch (I.a[var1_1.g().ordinal()]) {
                    case 1: {
                        return z.UP_X;
                    }
                    case 2: {
                        return z.UP_Z;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + var1_1 + " for facing " + var0);
            }
            case 3: {
                return z.NORTH;
            }
            case 4: {
                return z.SOUTH;
            }
            case 5: {
                return z.WEST;
            }
            case 6: {
                return z.EAST;
            }
        }
        throw new IllegalArgumentException("Invalid facing: " + var0);
    }

    public aA b() {
        return this.e;
    }

    public static z a(int n2) {
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
                    if (n3 < b.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return b[n2];
    }

    static {
        b = new z[z.values().length];
        z[] arrz = z.values();
        int n2 = arrz.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            z z2;
            z.b[z2.a()] = z2 = arrz[i2];
        }
    }

    private z(int n3, String string2, aA aA2) {
        this.a = n3;
        this.c = string2;
        this.e = aA2;
    }
}

