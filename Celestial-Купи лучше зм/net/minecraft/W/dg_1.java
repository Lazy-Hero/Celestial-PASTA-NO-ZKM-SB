/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.W.dq;
import net.minecraft.ac.a;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum dg implements p
{
    RED_SANDSTONE(0, "red_sandstone", dq.RED_SAND.c());

    private static final /* synthetic */ dg[] d;
    private final /* synthetic */ String c;
    private final /* synthetic */ a b;
    private final /* synthetic */ int a;

    public a b() {
        return this.b;
    }

    private dg(int n3, String string2, a a10) {
        this.a = n3;
        this.c = string2;
        this.b = a10;
    }

    public String c() {
        return this.c;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static dg a(int n2) {
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
                    if (n3 < d.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return d[n2];
    }

    static {
        d = new dg[dg.values().length];
        dg[] arrdg = dg.values();
        int n2 = arrdg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dg dg2;
            dg.d[dg2.a()] = dg2 = arrdg[i2];
        }
    }

    public int a() {
        return this.a;
    }
}

