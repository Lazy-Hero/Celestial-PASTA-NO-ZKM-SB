/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.az;

import net.minecraft.B.m;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.az.r;
import net.minecraft.w.d;

public interface k {
    public a2<d> b(m var1);

    default public String a() {
        return "";
    }

    default public boolean b() {
        return false;
    }

    default public a2<r> c() {
        return a2.a();
    }

    public boolean a(m var1, z var2);

    public boolean a(int var1, int var2);

    public d a(m var1);

    public d d();
}

