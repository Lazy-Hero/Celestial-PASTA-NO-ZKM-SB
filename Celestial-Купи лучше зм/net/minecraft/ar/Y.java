/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.J.n;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class Y
implements Predicate<x> {
    private final /* synthetic */ d a;

    public Y(d d10) {
        this.a = d10;
    }

    public boolean a(@Nullable x x2) {
        x x3;
        int n2;
        block12: {
            boolean bl2;
            block11: {
                n2 = v.b();
                bl2 = x2.aL();
                if (n2 != 0) break block11;
                if (!bl2) {
                    return false;
                }
                x3 = x2;
                if (n2 != 0) break block12;
                bl2 = x3 instanceof B;
            }
            if (!bl2) {
                return false;
            }
            x3 = x2;
        }
        B b10 = (B)x3;
        boolean bl3 = b10.b(C.a(this.a)).G();
        if (n2 == 0) {
            if (!bl3) {
                return false;
            }
            bl3 = b10 instanceof C;
        }
        if (n2 == 0) {
            if (bl3) {
                return ((C)b10).x();
            }
            bl3 = b10 instanceof n;
        }
        if (n2 == 0) {
            if (bl3) {
                return true;
            }
            bl3 = b10 instanceof j;
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

