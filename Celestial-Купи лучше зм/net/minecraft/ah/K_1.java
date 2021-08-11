/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.L;
import net.minecraft.ah.s;
import net.minecraft.aw.w;

public final class K {
    private final /* synthetic */ boolean f;
    private /* synthetic */ String a;
    private final /* synthetic */ boolean d;
    private /* synthetic */ boolean b;
    private final /* synthetic */ long h;
    private final /* synthetic */ L c;
    private /* synthetic */ boolean g;
    private final /* synthetic */ s e;

    public K(w w2) {
        this(w2.L(), w2.g(), w2.D(), w2.a(), w2.w());
    }

    public L i() {
        return this.c;
    }

    public s d() {
        return this.e;
    }

    public static s a(int n2) {
        return s.a(n2);
    }

    public boolean h() {
        return this.g;
    }

    public K g() {
        this.g = true;
        return this;
    }

    public boolean f() {
        return this.b;
    }

    public long e() {
        return this.h;
    }

    public boolean j() {
        return this.d;
    }

    public K a(String string) {
        this.a = string;
        return this;
    }

    public String c() {
        return this.a;
    }

    public boolean a() {
        return this.f;
    }

    public K b() {
        this.b = true;
        return this;
    }

    public K(long l2, s s2, boolean bl2, boolean bl3, L l3) {
        this.a = "";
        this.h = l2;
        this.e = s2;
        this.d = bl2;
        this.f = bl3;
        this.c = l3;
    }
}

