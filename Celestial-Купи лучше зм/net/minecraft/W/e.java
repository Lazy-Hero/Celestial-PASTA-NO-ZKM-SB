/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum e implements p
{
    DEAD_BUSH(0, "dead_bush"),
    GRASS(1, "tall_grass"),
    FERN(2, "fern");

    private final /* synthetic */ String a;
    private final /* synthetic */ int b;
    private static final /* synthetic */ e[] c;

    private e(int n3, String string2) {
        this.b = n3;
        this.a = string2;
    }

    public int a() {
        return this.b;
    }

    static {
        c = new e[e.values().length];
        e[] arre = e.values();
        int n2 = arre.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            e e10;
            e.c[e10.a()] = e10 = arre[i2];
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return this.a;
    }

    public static e a(int n2) {
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

    public String toString() {
        return this.a;
    }
}

