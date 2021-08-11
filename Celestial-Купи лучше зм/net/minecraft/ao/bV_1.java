/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.aA;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;

class bV
implements d {
    private bV() {
    }

    bV(bz bz2) {
        this();
    }

    @Override
    public Y a(net.minecraft.ar.aA aA2, s s2, Random random) {
        s2.a = true;
        return new aA(aA2, s2, random);
    }

    @Override
    public boolean a(s s2) {
        return true;
    }
}

