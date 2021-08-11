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
public enum dq implements p
{
    SAND(0, "sand", "default", net.minecraft.ac.a.K, -2370656),
    RED_SAND(1, "red_sand", "red", net.minecraft.ac.a.N, -5679071);

    private final /* synthetic */ a g;
    private final /* synthetic */ String e;
    private static final /* synthetic */ dq[] b;
    private final /* synthetic */ String f;
    private final /* synthetic */ int d;
    private final /* synthetic */ int c;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = new dq[dq.values().length];
        dq[] arrdq = dq.values();
        int n2 = arrdq.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dq dq2;
            dq.b[dq2.b()] = dq2 = arrdq[i2];
        }
    }

    public int b() {
        return this.c;
    }

    public a c() {
        return this.g;
    }

    @Override
    public String a() {
        return this.e;
    }

    public static dq a(int n2) {
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
                    if (n3 < b.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return b[n2];
    }

    private dq(int n3, String string2, String string3, a a10, int n4) {
        this.c = n3;
        this.e = string2;
        this.g = a10;
        this.f = string3;
        this.d = n4;
    }

    public String d() {
        return this.f;
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }
}

