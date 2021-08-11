/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import net.minecraft.as.k;
import net.minecraft.aw.c;

public class o
implements Comparable<o> {
    private final /* synthetic */ c a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public String g() {
        return this.a.c();
    }

    public boolean d() {
        return this.a.d();
    }

    public boolean f() {
        return this.a.i();
    }

    public boolean h() {
        return this.a.e();
    }

    public int a(c c10) {
        return this.a.a(c10);
    }

    public int e() {
        return this.a.h().c();
    }

    public long a() {
        return this.a.f();
    }

    public String b() {
        return this.a.a();
    }

    public long c() {
        return this.a.j();
    }

    public o(c c10) {
        this.a = c10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(o o2) {
        c c10;
        block6: {
            long l2;
            block5: {
                int n2 = k.k();
                long l3 = this.a.f() - o2.a();
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (n2 != 0) break block5;
                if (l2 < 0) {
                    return 1;
                }
                c10 = this.a;
                if (n2 != 0) break block6;
                long l4 = c10.f() - o2.a();
                l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            }
            if (l2 > 0) {
                return -1;
            }
            c10 = this.a;
        }
        int n3 = c10.a().compareTo(o2.b());
        return n3;
    }
}

