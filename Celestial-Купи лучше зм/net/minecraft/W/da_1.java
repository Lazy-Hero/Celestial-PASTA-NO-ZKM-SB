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
public enum da implements p
{
    DIRT(0, "dirt", "default", net.minecraft.ac.a.ad),
    COARSE_DIRT(1, "coarse_dirt", "coarse", net.minecraft.ac.a.ad),
    PODZOL(2, "podzol", net.minecraft.ac.a.v);

    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ int d;
    private final /* synthetic */ a c;
    private static final /* synthetic */ da[] a;

    public a b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    private da(int n3, String string2, String string3, a a10) {
        this.d = n3;
        this.f = string2;
        this.e = string3;
        this.c = a10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return this.f;
    }

    static {
        a = new da[da.values().length];
        da[] arrda = da.values();
        int n2 = arrda.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            da da2;
            da.a[da2.a()] = da2 = arrda[i2];
        }
    }

    public static da a(int n2) {
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

    public int a() {
        return this.d;
    }

    private da(int n3, String string2, a a10) {
        this(n3, string2, string2, a10);
    }
}

