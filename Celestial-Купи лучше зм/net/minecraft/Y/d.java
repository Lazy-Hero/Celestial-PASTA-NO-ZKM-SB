/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.y;

import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.y.b;

public class d {
    private final /* synthetic */ n d;
    private /* synthetic */ int b;
    private /* synthetic */ int e;
    private final /* synthetic */ n a;
    private final /* synthetic */ aA f;
    private /* synthetic */ boolean c;

    private static aA a(int n2, int n3) {
        String string = net.minecraft.y.b.f();
        int n4 = n2;
        if (string == null) {
            if (n4 < 0) {
                return aA.WEST;
            }
            n4 = n2;
        }
        if (string == null) {
            if (n4 > 0) {
                return aA.EAST;
            }
            n4 = n3;
        }
        return n4 < 0 ? aA.NORTH : aA.SOUTH;
    }

    public n i() {
        return this.d;
    }

    public int a(n n2) {
        return (int)n2.b(this.i());
    }

    public int f() {
        return this.f.r() * 2;
    }

    public aA d() {
        return this.f;
    }

    public int j() {
        return this.b;
    }

    public boolean a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b() {
        this.e = 0;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public int c(n n2) {
        return (int)this.a.b(n2);
    }

    public void a(int n2) {
        this.b = n2;
    }

    public boolean b(n n2) {
        int n3 = n2.e() - this.d.e();
        String string = net.minecraft.y.b.f();
        int n4 = n2.a() - this.d.b();
        boolean bl2 = n3 * this.f.r() + n4 * this.f.i();
        if (string == null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    public d(n n2, int n3, int n4, int n5) {
        this(n2, net.minecraft.y.d.a(n3, n4), n5);
    }

    public int a(int n2, int n3, int n4) {
        return (int)this.d.b(n2, n3, n4);
    }

    public d(n n2, aA aA2, int n3) {
        this.d = n2;
        this.f = aA2;
        this.a = n2.a(aA2, 2);
        this.b = n3;
    }

    public int e() {
        return this.f.i() * 2;
    }

    public int c() {
        return this.e;
    }

    public void h() {
        ++this.e;
    }

    public n g() {
        return this.a;
    }
}

