/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.at.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class C
implements J {
    @Nullable
    private final /* synthetic */ x b;
    private final /* synthetic */ J a;
    @Nullable
    private final /* synthetic */ l d;
    @Nullable
    private final /* synthetic */ Integer f;
    @Nullable
    private final /* synthetic */ Boolean c;
    @Nullable
    private final /* synthetic */ n e;

    /*
     * Enabled aggressive block sorting
     */
    public C a(int n2) {
        C c10;
        block5: {
            Integer n3;
            block4: {
                m[] arrm = s.b();
                n3 = this.f;
                if (arrm == null) break block4;
                if (n3 == null) break block5;
                c10 = this;
                if (arrm == null) return c10;
                n3 = c10.f;
            }
            if (n3 <= n2) {
                c10 = this;
                return c10;
            }
        }
        c10 = new C(this.a, this.d, this.e, n2, this.b, this.c);
        return c10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public C a(x x2, l l2) {
        C c10;
        block5: {
            m[] arrm;
            block4: {
                arrm = s.b();
                c10 = this;
                if (arrm == null) break block4;
                if (c10.b != x2) break block5;
                c10 = this;
            }
            if (arrm == null) return c10;
            if (Objects.equals(c10.d, l2)) {
                c10 = this;
                return c10;
            }
        }
        c10 = new C(this.a, l2, new n(l2), this.f, x2, this.c);
        return c10;
    }

    public C a() {
        m[] arrm = s.b();
        C c10 = this;
        if (arrm != null) {
            c10 = c10.d != null ? this : new C(this.a, this.h(), this.f(), this.f, this.b, this.c);
        }
        return c10;
    }

    @Override
    public void a(d d10, int n2) {
        block4: {
            J j2;
            block2: {
                block3: {
                    m[] arrm = s.b();
                    j2 = this.b;
                    if (arrm == null) break block2;
                    if (j2 == null) break block3;
                    this.b.a(d10, n2);
                    if (arrm != null) break block4;
                }
                j2 = this.a;
            }
            j2.a(d10, n2);
        }
    }

    @Override
    public void a(k k2) {
        block4: {
            J j2;
            block2: {
                block3: {
                    m[] arrm = s.b();
                    j2 = this;
                    if (arrm == null) break block2;
                    if (j2.c == null) break block3;
                    j2 = this;
                    if (arrm == null) break block2;
                    if (!j2.c.booleanValue()) break block4;
                }
                j2 = this.a;
            }
            j2.a(k2);
        }
    }

    @Override
    @Nullable
    public b e() {
        return this.a.e();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @Nullable
    public x c() {
        x x2;
        m[] arrm = s.b();
        J j2 = this.b;
        if (arrm != null) {
            if (j2 != null) {
                x2 = this.b.c();
                return x2;
            }
            j2 = this.a;
        }
        x2 = j2.c();
        return x2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static C a(J j2) {
        C c10;
        m[] arrm = s.b();
        J j3 = j2;
        if (arrm != null) {
            if (!(j3 instanceof C)) {
                c10 = new C(j2, null, null, null, null, null);
                return c10;
            }
            j3 = j2;
        }
        c10 = (C)j3;
        return c10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public l h() {
        l l2;
        m[] arrm = s.b();
        C c10 = this;
        if (arrm != null) {
            if (c10.d != null) {
                return this.d;
            }
            c10 = this;
        }
        J j2 = c10.b;
        if (arrm != null) {
            if (j2 != null) {
                l2 = this.b.h();
                return l2;
            }
            j2 = this.a;
        }
        l2 = j2.h();
        return l2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean a() {
        boolean bl2;
        m[] arrm = s.b();
        J j2 = this;
        if (arrm != null) {
            if (j2.c != null) {
                bl2 = this.c;
                return bl2;
            }
            j2 = this.a;
        }
        bl2 = j2.a();
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public k d() {
        k k2;
        m[] arrm = s.b();
        J j2 = this.b;
        if (arrm != null) {
            if (j2 != null) {
                k2 = this.b.d();
                return k2;
            }
            j2 = this.a;
        }
        k2 = j2.d();
        return k2;
    }

    public C(J j2, @Nullable l l2, @Nullable n n2, @Nullable Integer n3, @Nullable x x2, @Nullable Boolean bl2) {
        this.a = j2;
        this.d = l2;
        this.e = n2;
        this.f = n3;
        this.b = x2;
        this.c = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public n f() {
        n n2;
        m[] arrm = s.b();
        C c10 = this;
        if (arrm != null) {
            if (c10.e != null) {
                return this.e;
            }
            c10 = this;
        }
        J j2 = c10.b;
        if (arrm != null) {
            if (j2 != null) {
                n2 = this.b.f();
                return n2;
            }
            j2 = this.a;
        }
        n2 = j2.f();
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public C a(boolean bl2) {
        C c10;
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    m[] arrm = s.b();
                    c10 = this;
                    if (arrm == null) return c10;
                    if (c10.c == null) break block2;
                    bl3 = this.c;
                    if (arrm == null) break block3;
                    if (!bl3) break block4;
                    bl3 = bl2;
                }
                if (bl3) break block4;
            }
            c10 = new C(this.a, this.d, this.e, this.f, this.b, bl2);
            return c10;
        }
        c10 = this;
        return c10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, String string) {
        int n3;
        m[] arrm;
        block4: {
            J j2;
            block2: {
                block3: {
                    arrm = s.b();
                    j2 = this;
                    if (arrm == null) break block2;
                    if (j2.f == null) break block3;
                    n3 = this.f;
                    if (arrm == null) break block4;
                    if (n3 < n2) return 0 != 0;
                }
                j2 = this.a;
            }
            n3 = j2.a(n2, string);
        }
        if (arrm == null) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public z b() {
        z z2;
        m[] arrm = s.b();
        J j2 = this.b;
        if (arrm != null) {
            if (j2 != null) {
                z2 = this.b.b();
                return z2;
            }
            j2 = this.a;
        }
        z2 = j2.b();
        return z2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String g() {
        String string;
        m[] arrm = s.b();
        J j2 = this.b;
        if (arrm != null) {
            if (j2 != null) {
                string = this.b.g();
                return string;
            }
            j2 = this.a;
        }
        string = j2.g();
        return string;
    }
}

