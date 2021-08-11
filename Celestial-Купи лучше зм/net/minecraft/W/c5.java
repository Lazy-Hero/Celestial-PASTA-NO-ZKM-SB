/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum c5 implements p
{
    ROUGH(0, "prismarine", "rough"),
    BRICKS(1, "prismarine_bricks", "bricks"),
    DARK(2, "dark_prismarine", "dark");

    private final /* synthetic */ String b;
    private static final /* synthetic */ c5[] a;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    public int a() {
        return this.c;
    }

    public static c5 a(int n2) {
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
                    if (n3 < a.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return a[n2];
    }

    static {
        a = new c5[c5.values().length];
        c5[] arrc5 = c5.values();
        int n2 = arrc5.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            c5 c52;
            c5.a[c52.a()] = c52 = arrc5[i2];
        }
    }

    private c5(int n3, String string2, String string3) {
        this.c = n3;
        this.b = string2;
        this.d = string3;
    }

    @Override
    public String a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public String toString() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

