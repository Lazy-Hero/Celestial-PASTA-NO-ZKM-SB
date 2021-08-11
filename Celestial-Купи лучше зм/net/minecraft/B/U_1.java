/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.q;
import net.minecraft.ah.l;
import net.minecraft.ah.x;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U
implements l {
    private final /* synthetic */ String b;
    private final /* synthetic */ l c;
    private final /* synthetic */ l a;

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new net.minecraft.at.h(this.g(), new Object[0]);
    }

    public U(String string, l l2, l l3) {
        block9: {
            l l4;
            block10: {
                boolean bl2;
                block7: {
                    int n2;
                    block8: {
                        this.b = string;
                        n2 = n.b();
                        l l5 = l2;
                        if (n2 != 0) {
                            if (l5 == null) {
                                l2 = l3;
                            }
                            l5 = l3;
                        }
                        if (n2 != 0) {
                            if (l5 == null) {
                                l3 = l2;
                            }
                            this.c = l2;
                            this.a = l3;
                            l5 = l2;
                        }
                        bl2 = l5.e();
                        if (n2 == 0) break block7;
                        if (!bl2) break block8;
                        l3.a(l2.a());
                        if (n2 != 0) break block9;
                    }
                    l4 = l3;
                    if (n2 == 0) break block10;
                    bl2 = l4.e();
                }
                if (!bl2) break block9;
                l4 = l2;
            }
            l4.a(l3.a());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int n2 = n.c();
        boolean bl2 = this.c.e();
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.a.e();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public d a(int n2, int n3) {
        return n2 >= this.c.e() ? this.a.a(n2 - this.c.e(), n3) : this.c.a(n2, n3);
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        int n2 = n.b();
        boolean bl2 = this.c.a(j2);
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.a.a(j2);
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void d() {
        this.c.d();
        this.a.d();
    }

    @Override
    public void a(x x2) {
        this.c.a(x2);
        this.a.a(x2);
    }

    @Override
    public void d(j j2) {
        this.c.d(j2);
        this.a.d(j2);
    }

    @Override
    public String a() {
        return this.c.a();
    }

    @Override
    public int e() {
        return this.c.e() + this.a.e();
    }

    @Override
    public x a() {
        return this.c.a();
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public n a(h h2, j j2) {
        return new q(h2, this, j2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        int n2 = n.c();
        boolean bl2 = this.c.g();
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.a.g();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(a a10) {
        int n2 = n.c();
        l l2 = this.c;
        a a11 = a10;
        if (n2 == 0) {
            if (l2 == a11) return true;
            l2 = this.a;
            a11 = a10;
        }
        if (l2 != a11) return false;
        return true;
    }

    @Override
    public void a(int n2, d d10) {
        block2: {
            block1: {
                int n3;
                block0: {
                    n3 = n.c();
                    if (n3 != 0) break block0;
                    if (n2 < this.c.e()) break block1;
                    this.a.a(n2 - this.c.e(), d10);
                }
                if (n3 == 0) break block2;
            }
            this.c.a(n2, d10);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean f() {
        int n2 = n.c();
        boolean bl2 = this.c.f();
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = this.a.f();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String g() {
        String string;
        U u2;
        block6: {
            boolean bl2;
            block5: {
                int n2 = n.b();
                bl2 = this.c.g();
                if (n2 == 0) break block5;
                if (bl2) {
                    return this.c.g();
                }
                u2 = this;
                if (n2 == 0) break block6;
                bl2 = u2.a.g();
            }
            if (bl2) {
                string = this.a.g();
                return string;
            }
            u2 = this;
        }
        string = u2.b;
        return string;
    }

    @Override
    public int c() {
        return this.c.c();
    }

    @Override
    public d a(int n2) {
        return n2 >= this.c.e() ? this.a.a(n2 - this.c.e()) : this.c.a(n2);
    }

    @Override
    public void b() {
        this.c.b();
        this.a.b();
    }

    @Override
    public d b(int n2) {
        return n2 >= this.c.e() ? this.a.b(n2 - this.c.e()) : this.c.b(n2);
    }

    @Override
    public void c(j j2) {
        this.c.c(j2);
        this.a.c(j2);
    }

    @Override
    public boolean b(int n2, d d10) {
        return true;
    }
}

