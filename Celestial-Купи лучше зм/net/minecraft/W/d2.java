/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ar.p;

public enum d2 implements p
{
    SUNFLOWER(0, "sunflower"),
    SYRINGA(1, "syringa"),
    GRASS(2, "double_grass", "grass"),
    FERN(3, "double_fern", "fern"),
    ROSE(4, "double_rose", "rose"),
    PAEONIA(5, "paeonia");

    private final /* synthetic */ int e;
    private final /* synthetic */ String a;
    private final /* synthetic */ String c;
    private static final /* synthetic */ d2[] d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static d2 a(int n2) {
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

    private d2(int n3, String string2, String string3) {
        this.e = n3;
        this.c = string2;
        this.a = string3;
    }

    public String b() {
        return this.a;
    }

    static {
        d = new d2[d2.values().length];
        d2[] arrd2 = d2.values();
        int n2 = arrd2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            d2 d22;
            d2.d[d22.c()] = d22 = arrd2[i2];
        }
    }

    public int c() {
        return this.e;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String a() {
        return this.c;
    }

    private d2(int n3, String string2) {
        this(n3, string2, string2);
    }
}

