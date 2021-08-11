/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.B.n;
import net.minecraft.ah.o;
import net.minecraft.at.k;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
implements o {
    private final /* synthetic */ String d;
    private final /* synthetic */ k c;
    private static /* synthetic */ int b;

    public static int a() {
        int n2 = net.minecraft.client.c.b.b();
        if (n2 == 0) {
            return 109;
        }
        return 0;
    }

    @Override
    public String a() {
        return this.d;
    }

    public static void b(int n2) {
        b = n2;
    }

    @Override
    public k d() {
        return this.c;
    }

    @Override
    public n a(h h2, j j2) {
        throw new UnsupportedOperationException();
    }

    static {
        if (net.minecraft.client.c.b.b() == 0) {
            net.minecraft.client.c.b.b(85);
        }
    }

    public static int b() {
        return b;
    }

    public b(String string, k k2) {
        block0: {
            this.d = string;
            int n2 = net.minecraft.client.c.b.a();
            this.c = k2;
            if (!m.c()) break block0;
            net.minecraft.client.c.b.b(++n2);
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @Override
    public String g() {
        return this.c.f();
    }

    @Override
    public boolean g() {
        return true;
    }
}

