/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.r;

public class s<T> {
    private /* synthetic */ T b;
    private final /* synthetic */ r<T> a;
    private /* synthetic */ boolean c;

    public r<T> d() {
        return this.a;
    }

    public s<T> a() {
        return new s<T>(this.a, this.a.b().a(this.b));
    }

    public s(r<T> r2, T t2) {
        this.a = r2;
        this.b = t2;
        this.c = true;
    }

    public void a(T t2) {
        this.b = t2;
    }

    public boolean b() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public T c() {
        return this.b;
    }

    static boolean a(s s2, boolean bl2) {
        s2.c = bl2;
        return s2.c;
    }
}

