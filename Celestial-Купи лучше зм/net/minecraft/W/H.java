/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum H implements p
{
    DEFAULT(0, "sandstone", "default"),
    CHISELED(1, "chiseled_sandstone", "chiseled"),
    SMOOTH(2, "smooth_sandstone", "smooth");

    private final /* synthetic */ String b;
    private static final /* synthetic */ H[] d;
    private final /* synthetic */ int c;
    private final /* synthetic */ String e;

    public static H a(int n2) {
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
                    if (n3 < d.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        d = new H[H.values().length];
        H[] arrh = H.values();
        int n2 = arrh.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            H h2;
            H.d[h2.a()] = h2 = arrh[i2];
        }
    }

    public int a() {
        return this.c;
    }

    private H(int n3, String string2, String string3) {
        this.c = n3;
        this.b = string2;
        this.e = string3;
    }

    public String b() {
        return this.e;
    }
}

