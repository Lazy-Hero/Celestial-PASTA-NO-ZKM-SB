/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.D;

import java.util.Comparator;
import net.minecraft.D.b;
import net.minecraft.D.h;
import net.minecraft.D.k;
import net.minecraft.D.l;

public class e {
    private /* synthetic */ int b;
    private /* synthetic */ boolean f;
    private final /* synthetic */ h e;
    private final /* synthetic */ String g;
    public static final /* synthetic */ Comparator<e> a;
    private final /* synthetic */ b d;
    private /* synthetic */ boolean c;

    public void a(boolean bl2) {
        this.f = bl2;
    }

    public void a(int n2) {
        block5: {
            e e10;
            block4: {
                block2: {
                    block3: {
                        int n3 = this.b;
                        int n4 = l.a();
                        this.b = n2;
                        if (n4 != 0) break block2;
                        if (n3 != n2) break block3;
                        e10 = this;
                        if (n4 != 0) break block4;
                        if (!e10.c) break block5;
                    }
                    this.c = false;
                }
                e10 = this;
            }
            e10.c().a(this);
        }
    }

    public void b(int n2) {
        int n3 = l.a();
        e e10 = this;
        if (n3 == 0) {
            if (e10.e.a().b()) {
                throw new IllegalStateException("Cannot modify read-only score");
            }
            e10 = this;
        }
        e10.a(this.a() + n2);
    }

    public boolean b() {
        return this.f;
    }

    static {
        a = new k();
    }

    public void c(int n2) {
        int n3 = l.a();
        e e10 = this;
        if (n3 == 0) {
            if (e10.e.a().b()) {
                throw new IllegalStateException("Cannot modify read-only score");
            }
            e10 = this;
        }
        e10.a(this.a() - n2);
    }

    public void e() {
        int n2 = l.a();
        e e10 = this;
        if (n2 == 0) {
            if (e10.e.a().b()) {
                throw new IllegalStateException("Cannot modify read-only score");
            }
            e10 = this;
        }
        e10.b(1);
    }

    public String d() {
        return this.g;
    }

    public h f() {
        return this.e;
    }

    public e(b b10, h h2, String string) {
        this.d = b10;
        this.e = h2;
        this.g = string;
        this.c = true;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public b c() {
        return this.d;
    }

    public int a() {
        return this.b;
    }
}

