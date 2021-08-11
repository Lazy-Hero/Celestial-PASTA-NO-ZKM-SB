/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ac.a;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum cZ implements p
{
    STONE(0, net.minecraft.ac.a.T, "stone"),
    SAND(1, net.minecraft.ac.a.K, "sandstone", "sand"),
    WOOD(2, net.minecraft.ac.a.E, "wood_old", "wood"),
    COBBLESTONE(3, net.minecraft.ac.a.T, "cobblestone", "cobble"),
    BRICK(4, net.minecraft.ac.a.W, "brick"),
    SMOOTHBRICK(5, net.minecraft.ac.a.T, "stone_brick", "smoothStoneBrick"),
    NETHERBRICK(6, net.minecraft.ac.a.aa, "nether_brick", "netherBrick"),
    QUARTZ(7, net.minecraft.ac.a.V, "quartz");

    private final /* synthetic */ a b;
    private final /* synthetic */ int c;
    private static final /* synthetic */ cZ[] f;
    private final /* synthetic */ String e;
    private final /* synthetic */ String a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return this.e;
    }

    public static cZ a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    boolean bl2 = cL.e();
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < f.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return f[n2];
    }

    public a a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    static {
        f = new cZ[cZ.values().length];
        cZ[] arrcZ = cZ.values();
        int n2 = arrcZ.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cZ cZ2;
            cZ.f[cZ2.b()] = cZ2 = arrcZ[i2];
        }
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return this.e;
    }

    private cZ(int n3, a a10, String string2) {
        this(n3, a10, string2, string2);
    }

    private cZ(int n3, a a10, String string2, String string3) {
        this.c = n3;
        this.b = a10;
        this.e = string2;
        this.a = string3;
    }
}

