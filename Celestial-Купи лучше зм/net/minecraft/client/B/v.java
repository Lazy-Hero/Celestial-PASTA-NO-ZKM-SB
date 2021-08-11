/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.as.e;
import net.minecraft.client.Q;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class v
extends s {
    private final /* synthetic */ e s;

    public int d() {
        return this.n;
    }

    public int c() {
        return this.r;
    }

    @Override
    public void b(Q q2, int n2, int n3) {
        this.s.c(n2, n3);
    }

    public e g() {
        return this.s;
    }

    public void c(boolean bl2) {
        this.h = bl2;
    }

    public boolean e() {
        return this.h;
    }

    public void a(String string) {
        this.m = string;
    }

    @Override
    public void b(int n2, int n3) {
        this.s.a(n2, n3);
    }

    @Override
    public int a() {
        return super.a();
    }

    @Override
    public int a(boolean bl2) {
        return this.s.a(bl2);
    }

    public v(e e10, int n2, int n3, int n4, String string, int n5, int n6) {
        super(n2, n3, n4, n5, n6, string);
        this.s = e10;
    }

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = q.b();
        boolean bl2 = super.a(q2, n2, n3);
        if (arrstring != null) {
            if (bl2) {
                this.s.b(n2, n3);
            }
            bl2 = super.a(q2, n2, n3);
        }
        return bl2;
    }

    public int b(boolean bl2) {
        return super.a(bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public v(e e10, int n2, int n3, int n4, String string) {
        super(n2, n3, n4, string);
        this.s = e10;
    }

    public int f() {
        return this.g;
    }
}

