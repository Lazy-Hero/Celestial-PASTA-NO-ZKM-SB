/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.W.ak;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class ai
extends ak {
    @Override
    public d c(z z2, n n2, i i2) {
        return d.m;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    protected ai() {
        super(net.minecraft.ac.c.H);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public y a(z z2, int n2) {
        return new T();
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
        super.a(z2, n2, i2, f10, n3);
        int n4 = 15 + z2.J.nextInt(15) + z2.J.nextInt(15);
        this.a(z2, n2, n4);
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }
}

