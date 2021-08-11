/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.Q;
import net.minecraft.ar.p;

public enum o implements p
{
    X("x"),
    Y("y"),
    Z("z"),
    NONE("none");

    private final /* synthetic */ String b;

    private o(String string2) {
        this.b = string2;
    }

    @Override
    public String a() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return this.b;
    }

    public static o a(Q q2) {
        switch (q2) {
            case X: {
                return X;
            }
            case Y: {
                return Y;
            }
            case Z: {
                return Z;
            }
        }
        return NONE;
    }
}

