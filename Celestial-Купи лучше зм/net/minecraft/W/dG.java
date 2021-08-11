/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum dG implements p
{
    DEFAULT(0, "default", "default"),
    CHISELED(1, "chiseled", "chiseled"),
    LINES_Y(2, "lines_y", "lines"),
    LINES_X(3, "lines_x", "lines"),
    LINES_Z(4, "lines_z", "lines");

    private final /* synthetic */ String c;
    private final /* synthetic */ int e;
    private final /* synthetic */ String d;
    private static final /* synthetic */ dG[] a;

    public String toString() {
        return this.c;
    }

    public int a() {
        return this.e;
    }

    static {
        a = new dG[dG.values().length];
        dG[] arrdG = dG.values();
        int n2 = arrdG.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dG dG2;
            dG.a[dG2.a()] = dG2 = arrdG[i2];
        }
    }

    public static dG a(int n2) {
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
                    if (n3 < a.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return a[n2];
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private dG(int n3, String string2, String string3) {
        this.e = n3;
        this.d = string2;
        this.c = string3;
    }

    @Override
    public String a() {
        return this.d;
    }
}

