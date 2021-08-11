/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.n.a;

public class aD
implements K<a> {
    protected /* synthetic */ boolean b;
    protected /* synthetic */ int h;
    protected /* synthetic */ byte i;
    protected /* synthetic */ int a;
    protected /* synthetic */ boolean g;
    protected /* synthetic */ byte f;
    protected /* synthetic */ int e;
    protected /* synthetic */ int c;
    private static /* synthetic */ boolean d;

    public x a(z z2) {
        return z2.a(this.c);
    }

    @Override
    public void a(m m2) throws IOException {
        this.c = m2.a();
    }

    public byte g() {
        return this.i;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int d() {
        return this.e;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.c);
    }

    public static boolean c() {
        boolean bl2 = aD.i();
        return !bl2;
    }

    public byte h() {
        return this.f;
    }

    public aD() {
    }

    public static boolean i() {
        return d;
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public int f() {
        return this.h;
    }

    public boolean a() {
        return this.g;
    }

    public boolean e() {
        return this.b;
    }

    static {
        if (aD.c()) {
            aD.b(true);
        }
    }

    public aD(int n2) {
        this.c = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int j() {
        return this.a;
    }

    public static void b(boolean bl2) {
        d = bl2;
    }
}

