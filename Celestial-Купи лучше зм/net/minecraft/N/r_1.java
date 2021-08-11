/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.ar.p;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum r implements p
{
    SAVE("save", 0),
    LOAD("load", 1),
    CORNER("corner", 2),
    DATA("data", 3);

    private final /* synthetic */ String b;
    private static final /* synthetic */ r[] d;
    private final /* synthetic */ int c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.c;
    }

    static String a(r r2) {
        return r2.b;
    }

    @Override
    public String a() {
        return this.b;
    }

    private r(String string2, int n3) {
        this.b = string2;
        this.c = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static r a(int n2) {
        r r2;
        block5: {
            int n3;
            block4: {
                m[] arrm = j.f();
                n3 = n2;
                if (arrm != null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < d.length) {
                r2 = d[n2];
                return r2;
            }
        }
        r2 = d[0];
        return r2;
    }

    static {
        d = new r[r.values().length];
        r[] arrr = r.values();
        int n2 = arrr.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            r r2;
            r.d[r2.a()] = r2 = arrr[i2];
        }
    }
}

