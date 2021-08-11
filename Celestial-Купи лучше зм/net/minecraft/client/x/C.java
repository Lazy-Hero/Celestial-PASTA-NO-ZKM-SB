/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.minecraft.client.x.D;
import net.minecraft.client.x.au;

abstract class C {
    C(D d10) {
        this();
    }

    private C() {
    }

    public au a(au au2) {
        float f10 = au2.c(au2.b(0));
        float f11 = au2.a(au2.b(0));
        float f12 = au2.c(au2.b(2));
        float f13 = au2.a(au2.b(2));
        return this.a(f10, f11, f12, f13);
    }

    abstract au a(float var1, float var2, float var3, float var4);
}

