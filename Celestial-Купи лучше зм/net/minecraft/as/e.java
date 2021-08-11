/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.s;

public class e {
    private final /* synthetic */ net.minecraft.client.b.v a;
    protected static final /* synthetic */ v b;

    public void b(int n2, int n3) {
    }

    public int f() {
        return this.a.a();
    }

    static {
        b = new v("textures/gui/widgets.png");
    }

    public int b() {
        return this.a.d();
    }

    public int a(boolean bl2) {
        return this.a.b(bl2);
    }

    public void c(int n2, int n3) {
    }

    public int e() {
        return this.a.f();
    }

    public s c() {
        return this.a;
    }

    public e(int n2, int n3, int n4, int n5, int n6, String string) {
        this.a = new net.minecraft.client.b.v(this, n2, n3, n4, string, n5, n6);
    }

    public void a(int n2, int n3, float f10) {
        this.a.a(Q.P(), n2, n3, f10);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
    }

    public void a(int n2, int n3) {
    }

    public int a() {
        return this.a.c();
    }

    public void b(boolean bl2) {
        this.a.c(bl2);
    }

    public boolean d() {
        return this.a.e();
    }

    public void a(String string) {
        this.a.a(string);
    }

    public e(int n2, int n3, int n4, String string) {
        this.a = new net.minecraft.client.b.v(this, n2, n3, n4, string);
    }
}

