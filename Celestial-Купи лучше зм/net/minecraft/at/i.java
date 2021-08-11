/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.at;

import javax.annotation.Nullable;
import net.minecraft.I.b;
import net.minecraft.I.d;
import net.minecraft.at.c;
import net.minecraft.at.j;
import net.minecraft.at.l;
import net.minecraft.k.m;

public class i {
    private /* synthetic */ Boolean e;
    private /* synthetic */ i f;
    private /* synthetic */ b j;
    private /* synthetic */ String k;
    private /* synthetic */ d d;
    private /* synthetic */ Boolean g;
    private /* synthetic */ Boolean i;
    private static final /* synthetic */ i b;
    private /* synthetic */ Boolean a;
    private /* synthetic */ l h;
    private /* synthetic */ Boolean c;

    public i a(Boolean bl2) {
        this.c = bl2;
        return this;
    }

    static Boolean b(i i2, Boolean bl2) {
        i2.c = bl2;
        return i2.c;
    }

    static Boolean e(i i2, Boolean bl2) {
        i2.i = bl2;
        return i2.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String c() {
        m[] arrm;
        block15: {
            i i2;
            block14: {
                arrm = net.minecraft.at.c.b();
                i2 = this;
                if (arrm != null) break block14;
                if (!i2.b()) break block15;
                i2 = this.f;
            }
            if (arrm == null) {
                if (i2 == null) return "";
                i2 = this.f;
            }
            String string = i2.c();
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        i i3 = this;
        if (arrm == null) {
            if (i3.e() != null) {
                stringBuilder.append((Object)this.e());
            }
            i3 = this;
        }
        boolean bl2 = i3.l();
        if (arrm == null) {
            if (bl2) {
                stringBuilder.append((Object)l.BOLD);
            }
            bl2 = this.m();
        }
        if (arrm == null) {
            if (bl2) {
                stringBuilder.append((Object)l.ITALIC);
            }
            bl2 = this.n();
        }
        if (arrm == null) {
            if (bl2) {
                stringBuilder.append((Object)l.UNDERLINE);
            }
            bl2 = this.a();
        }
        if (arrm == null) {
            if (bl2) {
                stringBuilder.append((Object)l.OBFUSCATED);
            }
            bl2 = this.i();
        }
        if (!bl2) return stringBuilder.toString();
        stringBuilder.append((Object)l.STRIKETHROUGH);
        return stringBuilder.toString();
    }

    public i a(l l2) {
        this.h = l2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a() {
        boolean bl2;
        m[] arrm = net.minecraft.at.c.b();
        Boolean bl3 = this.i;
        if (arrm == null) {
            if (bl3 == null) {
                bl2 = this.k().a();
                return bl2;
            }
            bl3 = this.i;
        }
        bl2 = bl3;
        return bl2;
    }

    public String toString() {
        return "Style{hasParent=" + (this.f != null) + ", color=" + (Object)((Object)this.h) + ", bold=" + this.c + ", italic=" + this.a + ", underlined=" + this.g + ", obfuscated=" + this.i + ", clickEvent=" + this.j() + ", hoverEvent=" + this.d() + ", insertion=" + this.h() + '}';
    }

    static Boolean d(i i2, Boolean bl2) {
        i2.g = bl2;
        return i2.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        i i2;
        m[] arrm;
        block10: {
            Boolean bl2;
            block9: {
                arrm = net.minecraft.at.c.b();
                bl2 = this.c;
                if (arrm == null) {
                    if (bl2 != null) return false;
                    bl2 = this.a;
                }
                if (arrm == null) {
                    if (bl2 != null) return false;
                    bl2 = this.e;
                }
                if (arrm == null) {
                    if (bl2 != null) return false;
                    bl2 = this.g;
                }
                if (arrm != null) break block9;
                if (bl2 != null) return false;
                i2 = this;
                if (arrm != null) break block10;
                bl2 = i2.i;
            }
            if (bl2 != null) return false;
            i2 = this;
        }
        if (arrm == null) {
            if (i2.h != null) return false;
            i2 = this;
        }
        if (arrm == null) {
            if (i2.d != null) return false;
            i2 = this;
        }
        if (arrm == null) {
            if (i2.j != null) return false;
            i2 = this;
        }
        if (i2.k != null) return false;
        return true;
    }

    static String e(i i2) {
        return i2.k;
    }

    /*
     * Enabled aggressive block sorting
     */
    private i k() {
        i i2;
        m[] arrm = net.minecraft.at.c.b();
        i i3 = this.f;
        if (arrm == null) {
            if (i3 == null) {
                i2 = b;
                return i2;
            }
            i3 = this;
        }
        i2 = i3.f;
        return i2;
    }

    public i a(String string) {
        this.k = string;
        return this;
    }

    public i j(i i2) {
        this.f = i2;
        return this;
    }

    static Boolean a(i i2, Boolean bl2) {
        i2.a = bl2;
        return i2.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean n() {
        boolean bl2;
        m[] arrm = net.minecraft.at.c.b();
        Boolean bl3 = this.g;
        if (arrm == null) {
            if (bl3 == null) {
                bl2 = this.k().n();
                return bl2;
            }
            bl3 = this.g;
        }
        bl2 = bl3;
        return bl2;
    }

    static Boolean d(i i2) {
        return i2.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public String h() {
        String string;
        m[] arrm = net.minecraft.at.c.b();
        i i2 = this;
        if (arrm == null) {
            if (i2.k == null) {
                string = this.k().h();
                return string;
            }
            i2 = this;
        }
        string = i2.k;
        return string;
    }

    static {
        b = new j();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean m() {
        boolean bl2;
        m[] arrm = net.minecraft.at.c.b();
        Boolean bl3 = this.a;
        if (arrm == null) {
            if (bl3 == null) {
                bl2 = this.k().m();
                return bl2;
            }
            bl3 = this.a;
        }
        bl2 = bl3;
        return bl2;
    }

    public i c(Boolean bl2) {
        this.a = bl2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public l e() {
        l l2;
        m[] arrm = net.minecraft.at.c.b();
        i i2 = this;
        if (arrm == null) {
            if (i2.h == null) {
                l2 = this.k().e();
                return l2;
            }
            i2 = this;
        }
        l2 = i2.h;
        return l2;
    }

    public i d(Boolean bl2) {
        this.e = bl2;
        return this;
    }

    static l a(i i2, l l2) {
        i2.h = l2;
        return i2.h;
    }

    public i f() {
        i i2;
        block0: {
            i2 = new i();
            m[] arrm = net.minecraft.at.c.b();
            i2.a(this.l());
            i2.c(this.m());
            i2.d(this.i());
            i2.b(this.n());
            i2.e(this.a());
            m[] arrm2 = arrm;
            i2.a(this.e());
            i2.a(this.j());
            i2.a(this.d());
            i2.a(this.h());
            if (!m.c()) break block0;
            net.minecraft.at.c.b(new m[2]);
        }
        return i2;
    }

    public i e(Boolean bl2) {
        this.i = bl2;
        return this;
    }

    static d h(i i2) {
        return i2.d;
    }

    static Boolean i(i i2) {
        return i2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean i() {
        boolean bl2;
        m[] arrm = net.minecraft.at.c.b();
        Boolean bl3 = this.e;
        if (arrm == null) {
            if (bl3 == null) {
                bl2 = this.k().i();
                return bl2;
            }
            bl3 = this.e;
        }
        bl2 = bl3;
        return bl2;
    }

    static b f(i i2) {
        return i2.j;
    }

    static Boolean c(i i2) {
        return i2.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public d j() {
        d d10;
        m[] arrm = net.minecraft.at.c.b();
        i i2 = this;
        if (arrm == null) {
            if (i2.d == null) {
                d10 = this.k().j();
                return d10;
            }
            i2 = this;
        }
        d10 = i2.d;
        return d10;
    }

    public boolean equals(Object object) {
        block20: {
            boolean bl2;
            block7: {
                block8: {
                    String string;
                    m[] arrm;
                    block18: {
                        i i2;
                        block19: {
                            i i3;
                            block16: {
                                block17: {
                                    b b10;
                                    block14: {
                                        block15: {
                                            i i4;
                                            block12: {
                                                block13: {
                                                    d d10;
                                                    block10: {
                                                        block11: {
                                                            i i5;
                                                            block9: {
                                                                arrm = net.minecraft.at.c.b();
                                                                Object object2 = this;
                                                                if (arrm == null) {
                                                                    if (object2 == object) {
                                                                        return true;
                                                                    }
                                                                    object2 = object;
                                                                }
                                                                if (arrm == null) {
                                                                    if (!(object2 instanceof i)) {
                                                                        return false;
                                                                    }
                                                                    object2 = object;
                                                                }
                                                                i2 = (i)object2;
                                                                bl2 = this.l();
                                                                if (arrm != null) break block7;
                                                                if (bl2 != i2.l()) break block8;
                                                                i5 = this;
                                                                if (arrm != null) break block9;
                                                                if (i5.e() != i2.e()) break block8;
                                                                i5 = this;
                                                            }
                                                            bl2 = i5.m();
                                                            if (arrm != null) break block7;
                                                            if (bl2 != i2.m()) break block8;
                                                            bl2 = this.a();
                                                            if (arrm != null) break block7;
                                                            if (bl2 != i2.a()) break block8;
                                                            bl2 = this.i();
                                                            if (arrm != null) break block7;
                                                            if (bl2 != i2.i()) break block8;
                                                            bl2 = this.n();
                                                            if (arrm != null) break block7;
                                                            if (bl2 != i2.n()) break block8;
                                                            d10 = this.j();
                                                            if (arrm != null) break block10;
                                                            if (d10 == null) break block11;
                                                            i4 = this;
                                                            if (arrm != null) break block12;
                                                            if (i4.j().equals(i2.j())) break block13;
                                                            if (arrm == null) break block8;
                                                        }
                                                        i4 = i2;
                                                        if (arrm != null) break block12;
                                                        d10 = i4.j();
                                                    }
                                                    if (d10 != null && arrm == null) break block8;
                                                }
                                                i4 = this;
                                            }
                                            b10 = i4.d();
                                            if (arrm != null) break block14;
                                            if (b10 == null) break block15;
                                            i3 = this;
                                            if (arrm != null) break block16;
                                            if (i3.d().equals(i2.d())) break block17;
                                            if (arrm == null) break block8;
                                        }
                                        i3 = i2;
                                        if (arrm != null) break block16;
                                        b10 = i3.d();
                                    }
                                    if (b10 != null && arrm == null) break block8;
                                }
                                i3 = this;
                            }
                            string = i3.h();
                            if (arrm != null) break block18;
                            if (string == null) break block19;
                            bl2 = this.h().equals(i2.h());
                            if (arrm != null) break block7;
                            if (!bl2) break block8;
                            if (arrm == null) break block20;
                        }
                        string = i2.h();
                    }
                    if (string == null && arrm == null) break block20;
                }
                bl2 = false;
            }
            boolean bl3 = bl2;
            return bl3;
        }
        boolean bl4 = true;
        return bl4;
    }

    public i a(b b10) {
        this.j = b10;
        return this;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int hashCode() {
        int n2 = this.h.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        n2 = 31 * n2 + this.g.hashCode();
        n2 = 31 * n2 + this.e.hashCode();
        n2 = 31 * n2 + this.i.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.j.hashCode();
        m[] arrm = net.minecraft.at.c.b();
        n2 = 31 * n2 + this.k.hashCode();
        if (arrm != null) {
            m.b(!m.c());
        }
        return n2;
    }

    static b a(i i2, b b10) {
        i2.j = b10;
        return i2.j;
    }

    static l a(i i2) {
        return i2.h;
    }

    static d a(i i2, d d10) {
        i2.d = d10;
        return i2.d;
    }

    static Boolean g(i i2) {
        return i2.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean l() {
        boolean bl2;
        m[] arrm = net.minecraft.at.c.b();
        Boolean bl3 = this.c;
        if (arrm == null) {
            if (bl3 == null) {
                bl2 = this.k().l();
                return bl2;
            }
            bl3 = this.c;
        }
        bl2 = bl3;
        return bl2;
    }

    static Boolean b(i i2) {
        return i2.i;
    }

    static String a(i i2, String string) {
        i2.k = string;
        return i2.k;
    }

    public i b(Boolean bl2) {
        this.g = bl2;
        return this;
    }

    public i a(d d10) {
        this.d = d10;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public b d() {
        b b10;
        m[] arrm = net.minecraft.at.c.b();
        i i2 = this;
        if (arrm == null) {
            if (i2.j == null) {
                b10 = this.k().d();
                return b10;
            }
            i2 = this;
        }
        b10 = i2.j;
        return b10;
    }

    public i g() {
        i i2 = new i();
        i2.c = this.c;
        i2.a = this.a;
        i2.e = this.e;
        i2.g = this.g;
        i2.i = this.i;
        i2.h = this.h;
        i2.d = this.d;
        i2.j = this.j;
        i2.f = this.f;
        i2.k = this.k;
        return i2;
    }

    static Boolean c(i i2, Boolean bl2) {
        i2.e = bl2;
        return i2.e;
    }
}

