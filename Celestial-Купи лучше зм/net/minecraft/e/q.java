/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.L;
import net.minecraft.E.j;
import net.minecraft.E.s;
import net.minecraft.k.m;

enum q {
    ONLY("only", false, false),
    THROUGH("through", true, true),
    FROM("from", false, true),
    UNTIL("until", true, false),
    EVERYTHING("everything", true, true);

    static final /* synthetic */ String[] a;
    final /* synthetic */ boolean d;
    final /* synthetic */ String c;
    final /* synthetic */ boolean e;

    void a(J j2, L l2, j j3, Object ... arrobject) {
        K.a(j2, (F)l2, j3.a + "." + this.c + ".success", arrobject);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new String[q.values().length];
        for (int i2 = 0; i2 < q.values().length; ++i2) {
            q.a[i2] = q.values()[i2].c;
        }
    }

    s a(j j2, Object ... arrobject) {
        return new s(j2.a + "." + this.c + ".failed", arrobject);
    }

    @Nullable
    static q a(String string) {
        q[] arrq = q.values();
        m[] arrm = s.b();
        int n2 = arrq.length;
        int n3 = 0;
        while (n3 < n2) {
            q q2 = arrq[n3];
            if (arrm != null) {
                if (q2.c.equals(string)) {
                    return q2;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        return null;
    }

    private q(String string2, boolean bl2, boolean bl3) {
        this.c = string2;
        this.d = bl2;
        this.e = bl3;
    }

    s a(j j2) {
        return new s(j2.a + "." + this.c + ".usage", new Object[0]);
    }
}

