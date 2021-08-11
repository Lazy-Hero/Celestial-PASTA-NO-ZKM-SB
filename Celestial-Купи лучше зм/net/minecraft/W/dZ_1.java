/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum dZ implements p
{
    DEFAULT(0, "red_sandstone", "default"),
    CHISELED(1, "chiseled_red_sandstone", "chiseled"),
    SMOOTH(2, "smooth_red_sandstone", "smooth");

    private final /* synthetic */ String d;
    private static final /* synthetic */ dZ[] b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String e;

    public static dZ a(int n2) {
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

    @Override
    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    static {
        b = new dZ[dZ.values().length];
        dZ[] arrdZ = dZ.values();
        int n2 = arrdZ.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dZ dZ2;
            dZ.b[dZ2.a()] = dZ2 = arrdZ[i2];
        }
    }

    private dZ(int n3, String string2, String string3) {
        this.c = n3;
        this.d = string2;
        this.e = string3;
    }

    public String toString() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.c;
    }
}

