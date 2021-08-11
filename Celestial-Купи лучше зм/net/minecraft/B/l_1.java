/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.B;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.ar.a2;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l
implements a {
    private /* synthetic */ net.minecraft.az.k a;
    private final /* synthetic */ a2<d> b;

    @Override
    public void d(j j2) {
    }

    @Override
    public void b() {
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public void a(int n2, d d10) {
        this.b.set(0, d10);
    }

    @Override
    public d b(int n2) {
        return W.a(this.b, 0);
    }

    @Override
    public d a(int n2) {
        return this.b.get(0);
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public void c(j j2) {
    }

    @Override
    public boolean a(j j2) {
        return true;
    }

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new h(this.g(), new Object[0]);
    }

    @Override
    public String g() {
        return "Result";
    }

    @Override
    public d a(int n2, int n3) {
        return W.a(this.b, 0);
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }

    @Nullable
    public net.minecraft.az.k a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    public l() {
        this.b = a2.a(1, d.m);
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.b.iterator();
            int n2 = n.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d10 = (d)iterator.next();
                        bl2 = d10.G();
                        if (n2 == 0) break block3;
                        if (n2 == 0) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (n2 != 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void d() {
        this.b.clear();
    }

    public void a(@Nullable net.minecraft.az.k k2) {
        this.a = k2;
    }
}

