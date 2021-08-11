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
public enum D implements p
{
    OAK(0, "oak", net.minecraft.ac.a.E),
    SPRUCE(1, "spruce", net.minecraft.ac.a.v),
    BIRCH(2, "birch", net.minecraft.ac.a.K),
    JUNGLE(3, "jungle", net.minecraft.ac.a.ad),
    ACACIA(4, "acacia", net.minecraft.ac.a.N),
    DARK_OAK(5, "dark_oak", "big_oak", net.minecraft.ac.a.Z);

    private final /* synthetic */ String a;
    private final /* synthetic */ a d;
    private final /* synthetic */ int b;
    private static final /* synthetic */ D[] c;
    private final /* synthetic */ String e;

    public String toString() {
        return this.e;
    }

    static {
        c = new D[D.values().length];
        D[] arrd = D.values();
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            D d10;
            D.c[d10.b()] = d10 = arrd[i2];
        }
    }

    public a a() {
        return this.d;
    }

    public static D a(int n2) {
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

    private static gP a(gP gP2) {
        return gP2;
    }

    private D(int n3, String string2, a a10) {
        this(n3, string2, string2, a10);
    }

    @Override
    public String a() {
        return this.e;
    }

    public String c() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    private D(int n3, String string2, String string3, a a10) {
        this.b = n3;
        this.e = string2;
        this.a = string3;
        this.d = a10;
    }
}

