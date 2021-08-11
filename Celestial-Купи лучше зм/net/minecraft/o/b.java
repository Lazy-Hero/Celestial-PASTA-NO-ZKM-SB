/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.o;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.c;
import net.minecraft.ah.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.j;
import net.minecraft.u.g;

public class b
extends a {
    @Override
    public void a(x x2) {
    }

    public b(z z2, int n2, int n3) {
        super(z2, n2, n3);
    }

    @Override
    public void c() {
    }

    @Override
    public int b(int n2, int n3) {
        return 0;
    }

    @Override
    public Random c(long l2) {
        return new Random(this.z().C() + (long)(this.t * this.t * 4987142) + (long)(this.t * 5947611) + (long)(this.i * this.i) * 4392871L + (long)(this.i * 389711) ^ l2);
    }

    @Override
    public i c(n n2) {
        return g.bf.d();
    }

    @Override
    public void a(x x2, int n2) {
    }

    @Override
    @Nullable
    public y a(n n2, j j2) {
        return null;
    }

    @Override
    public int e(n n2) {
        return 255;
    }

    @Override
    public <T extends x> void a(Class<? extends T> class_, k k2, List<T> list, Predicate<? super T> predicate) {
    }

    @Override
    public boolean a(n n2) {
        return false;
    }

    @Override
    public void a(@Nullable x x2, k k2, List<x> list, Predicate<? super x> predicate) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(int n2, int n3) {
        int[] arrn = a.k();
        boolean bl2 = n2;
        int n4 = this.t;
        if (arrn != null) {
            if (bl2 != n4) return false;
            bl2 = n3;
            if (arrn == null) return bl2;
            n4 = this.i;
        }
        if (bl2 != n4) return false;
        return true;
    }

    @Override
    public void f() {
    }

    @Override
    public void a(n n2, y y2) {
    }

    @Override
    public int a(n n2, int n3) {
        return 0;
    }

    @Override
    public boolean e(int n2, int n3) {
        return true;
    }

    @Override
    public void r() {
    }

    @Override
    public void a(c c10, n n2, int n3) {
    }

    @Override
    public void a(y y2) {
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public int a(c c10, n n2) {
        return c10.defaultLightValue;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(x x2) {
    }

    @Override
    public void e() {
    }

    @Override
    public void w() {
    }

    @Override
    public boolean a(boolean bl2) {
        return false;
    }

    @Override
    public void b(n n2) {
    }
}

