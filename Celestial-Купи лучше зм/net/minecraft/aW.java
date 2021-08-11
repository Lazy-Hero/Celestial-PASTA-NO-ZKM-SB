/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft;

import net.minecraft.E.J;
import net.minecraft.R.b;
import net.minecraft.aG;
import net.minecraft.aZ;
import net.minecraft.ah.z;

class aW
implements J {
    final /* synthetic */ aZ a;

    @Override
    public z b() {
        return aZ.a((aZ)this.a).S[0];
    }

    @Override
    public b e() {
        return aZ.a(this.a);
    }

    aW(aZ aZ2) {
        this.a = aZ2;
    }

    @Override
    public String g() {
        return aZ.b(this.a);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(int n2, String string) {
        boolean bl2 = aG.b();
        boolean bl3 = n2;
        if (bl2) {
            bl3 = bl3 <= BADBOOL 2;
        }
        return bl3;
    }
}

