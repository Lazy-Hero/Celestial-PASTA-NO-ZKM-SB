/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.W.D;

public enum g {
    OAK(D.OAK.b(), "oak"),
    SPRUCE(D.SPRUCE.b(), "spruce"),
    BIRCH(D.BIRCH.b(), "birch"),
    JUNGLE(D.JUNGLE.b(), "jungle"),
    ACACIA(D.ACACIA.b(), "acacia"),
    DARK_OAK(D.DARK_OAK.b(), "dark_oak");

    private final /* synthetic */ int a;
    private final /* synthetic */ String c;

    public String toString() {
        return this.c;
    }

    public int a() {
        return this.a;
    }

    private g(int n3, String string2) {
        this.c = string2;
        this.a = n3;
    }

    public static g a(String string) {
        g g10;
        block3: {
            int n2 = j.d();
            for (int i2 = 0; i2 < g.values().length; ++i2) {
                g10 = g.values()[i2];
                if (n2 != 0) {
                    g g11;
                    if (n2 != 0) {
                        if (!g10.b().equals(string)) continue;
                        g11 = g.values()[i2];
                    }
                    return g11;
                }
                break block3;
            }
            g10 = g.values()[0];
        }
        return g10;
    }

    public String b() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static g a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    int n4 = j.d();
                    n3 = n2;
                    if (n4 == 0) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (n4 == 0) break block2;
                    if (n3 < g.values().length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return g.values()[n2];
    }
}

