/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum dO implements p
{
    DEFAULT(0, "stonebrick", "default"),
    MOSSY(1, "mossy_stonebrick", "mossy"),
    CRACKED(2, "cracked_stonebrick", "cracked"),
    CHISELED(3, "chiseled_stonebrick", "chiseled");

    private final /* synthetic */ int d;
    private final /* synthetic */ String e;
    private static final /* synthetic */ dO[] c;
    private final /* synthetic */ String b;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return this.b;
    }

    private dO(int n3, String string2, String string3) {
        this.d = n3;
        this.b = string2;
        this.e = string3;
    }

    public String b() {
        return this.e;
    }

    public String toString() {
        return this.b;
    }

    static {
        c = new dO[dO.values().length];
        dO[] arrdO = dO.values();
        int n2 = arrdO.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dO dO2;
            dO.c[dO2.a()] = dO2 = arrdO[i2];
        }
    }

    public int a() {
        return this.d;
    }

    public static dO a(int n2) {
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
                    if (n3 < c.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return c[n2];
    }
}

