/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

public enum d3 implements p
{
    NORMAL(0, "cobblestone", "normal"),
    MOSSY(1, "mossy_cobblestone", "mossy");

    private final /* synthetic */ String c;
    private final /* synthetic */ int b;
    private final /* synthetic */ String a;
    private static final /* synthetic */ d3[] e;

    public int c() {
        return this.b;
    }

    public static d3 a(int n2) {
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
                    if (n3 < e.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return e[n2];
    }

    public String toString() {
        return this.c;
    }

    private d3(int n3, String string2, String string3) {
        this.b = n3;
        this.c = string2;
        this.a = string3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String b() {
        return this.a;
    }

    static {
        e = new d3[d3.values().length];
        d3[] arrd3 = d3.values();
        int n2 = arrd3.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            d3 d32;
            d3.e[d32.c()] = d32 = arrd3[i2];
        }
    }

    @Override
    public String a() {
        return this.c;
    }
}

