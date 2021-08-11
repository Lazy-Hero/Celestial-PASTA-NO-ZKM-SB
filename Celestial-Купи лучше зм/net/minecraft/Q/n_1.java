/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.util.EnumSet;
import java.util.Set;
import net.minecraft.Q.aD;

public enum n {
    X(0),
    Y(1),
    Z(2),
    Y_ROT(3),
    X_ROT(4);

    private final /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static Set<n> a(int n2) {
        EnumSet<n> enumSet = EnumSet.noneOf(n.class);
        boolean bl2 = aD.c();
        n[] arrn = n.values();
        int n3 = arrn.length;
        int n4 = 0;
        while (n4 < n3) {
            n n5 = arrn[n4];
            if (!bl2) {
                if (n5.b(n2)) {
                    enumSet.add(n5);
                }
                ++n4;
            }
            if (!bl2) continue;
        }
        return enumSet;
    }

    private boolean b(int n2) {
        boolean bl2 = aD.i();
        int n3 = n2 & this.a();
        if (bl2) {
            n3 = n3 == this.a() ? 1 : 0;
        }
        return n3 != 0;
    }

    public static int a(Set<n> set) {
        int n2;
        block2: {
            int n3 = 0;
            boolean bl2 = aD.c();
            for (n n4 : set) {
                n2 = n3 | n4.a();
                if (!bl2) {
                    n3 = n2;
                    if (!bl2) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    private int a() {
        return 1 << this.b;
    }

    private n(int n3) {
        this.b = n3;
    }
}

