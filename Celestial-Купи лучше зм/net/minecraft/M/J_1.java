/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.Z;
import net.minecraft.M.aa;
import net.minecraft.M.q;
import net.minecraft.M.t;
import net.minecraft.ah.A;
import net.minecraft.k.l;

public class J
extends t {
    private final /* synthetic */ Z d;
    private final /* synthetic */ q a;
    private final /* synthetic */ Z e;

    public boolean a(A a10, l l2, double d10, double d11, double d12) {
        int n2 = t.b();
        boolean bl2 = this.d.a(a10, l2.e, l2.d, l2.b);
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.e.a(a10, d10, d11, d12);
        }
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.a.a(l2.e, l2.d, l2.b, d10, d11, d12);
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public J(Z z2, Z z3, q q2) {
        super(aa.b());
        this.d = z2;
        this.e = z3;
        this.a = q2;
    }
}

