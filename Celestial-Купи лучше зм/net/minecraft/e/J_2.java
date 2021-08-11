/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import javax.annotation.Nullable;
import net.minecraft.E.d;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.k.l;
import net.minecraft.k.n;

public interface J {
    default public void a(k k2) {
    }

    default public void a(d d10, int n2) {
    }

    @Nullable
    public b e();

    default public l h() {
        return l.a;
    }

    @Nullable
    default public x c() {
        return null;
    }

    public z b();

    public String g();

    default public n f() {
        return n.o;
    }

    default public boolean a() {
        return false;
    }

    default public k d() {
        return new g(this.g());
    }

    public boolean a(int var1, String var2);
}

