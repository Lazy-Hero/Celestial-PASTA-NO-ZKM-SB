/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.l;

import java.util.BitSet;
import javax.annotation.Nullable;
import net.minecraft.az.k;
import net.minecraft.az.t;

public class i {
    protected /* synthetic */ boolean a;
    protected /* synthetic */ boolean b;
    protected final /* synthetic */ BitSet d;
    protected final /* synthetic */ BitSet c;

    protected static int d(@Nullable k k2) {
        return t.a.c(k2);
    }

    public boolean b() {
        return this.b;
    }

    public i() {
        this.d = new BitSet();
        this.c = new BitSet();
    }

    public void e(k k2) {
        int n2 = i.d(k2);
        this.d.clear(n2);
        this.c.clear(n2);
    }

    public void c(k k2) {
        this.c.clear(i.d(k2));
    }

    public void b(k k2) {
        this.c.set(i.d(k2));
    }

    public void a(i i2) {
        this.d.clear();
        this.c.clear();
        this.d.or(i2.d);
        this.c.or(i2.c);
    }

    public boolean a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(boolean bl2) {
        this.a = bl2;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public boolean f(@Nullable k k2) {
        return this.d.get(i.d(k2));
    }

    public boolean a(k k2) {
        return this.c.get(i.d(k2));
    }

    public void g(k k2) {
        block0: {
            if (k2.b()) break block0;
            this.d.set(i.d(k2));
        }
    }
}

