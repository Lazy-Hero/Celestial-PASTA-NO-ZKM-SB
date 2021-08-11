/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.D.i;
import net.minecraft.U.x;
import net.minecraft.ar.C;
import net.minecraft.ar.J;
import net.minecraft.ar.ak;
import net.minecraft.ar.at;
import net.minecraft.ar.f;
import net.minecraft.ar.j;
import net.minecraft.ar.n;
import net.minecraft.ar.r;
import net.minecraft.ar.v;

public final class e {
    public static final /* synthetic */ Predicate<x> c;
    public static final /* synthetic */ Predicate<x> e;
    public static final /* synthetic */ Predicate<x> b;
    public static final /* synthetic */ Predicate<x> a;
    public static final /* synthetic */ Predicate<x> d;

    public static <T extends x> Predicate<T> a(double d10, double d11, double d12, double d13) {
        double d14 = d13 * d13;
        return new ak(d10, d11, d12, d14);
    }

    public static Predicate<x> a(x x2) {
        return new C(x2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static <T extends x> Predicate<T> b(x var0) {
        var2_1 = var0.aM();
        var1_2 = v.d();
        v0 = var2_1;
        if (var1_2 == 0) ** GOTO lbl9
        if (v0 == null) {
            v1 = i.ALWAYS;
        } else {
            v0 = var2_1;
lbl9:
            // 2 sources

            v1 = v0.i();
        }
        var3_3 = v1;
        return var3_3 == i.NEVER ? Predicates.alwaysFalse() : Predicates.and(net.minecraft.ar.e.e, (Predicate)new at(var0, var2_1, var3_3));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = new f();
        a = new n();
        c = new r();
        d = new J();
        e = new j();
    }
}

