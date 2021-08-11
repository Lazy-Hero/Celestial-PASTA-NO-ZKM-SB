/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.K;

import com.google.common.collect.ComparisonChain;
import net.minecraft.K.b;
import net.minecraft.P.r;
import net.minecraft.U.B;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j
implements Comparable<j> {
    private final /* synthetic */ b h;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean g;
    private static /* synthetic */ int[] f;
    private static final /* synthetic */ Logger e;
    private /* synthetic */ int i;
    private /* synthetic */ boolean d;
    private /* synthetic */ int c;
    private /* synthetic */ boolean a;

    public boolean i() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        String string;
        int[] arrn;
        block7: {
            block6: {
                arrn = j.b();
                if (this.c <= 0) break block6;
                string = this.j() + " x " + (this.c + 1) + ", Duration: " + this.i;
                if (arrn == null) break block7;
            }
            string = this.j() + ", Duration: " + this.i;
        }
        boolean bl2 = this.g;
        if (arrn == null) {
            if (bl2) {
                string = string + ", Splash: true";
            }
            bl2 = this.b;
        }
        if (!bl2) {
            string = string + ", Particles: false";
        }
        return string;
    }

    private int d() {
        return --this.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b(j j2) {
        int n2;
        block4: {
            block5: {
                int[] arrn;
                block2: {
                    block3: {
                        int n3 = 32147;
                        arrn = j.b();
                        n2 = this.e();
                        if (arrn != null) break block2;
                        if (n2 <= 32147) break block3;
                        n2 = j2.e();
                        if (arrn != null) break block2;
                        if (n2 > 32147) break block4;
                    }
                    n2 = this.c() ? 1 : 0;
                }
                if (arrn != null) return n2;
                if (n2 == 0) break block5;
                n2 = j2.c() ? 1 : 0;
                if (arrn != null) return n2;
                if (n2 != 0) break block4;
            }
            n2 = ComparisonChain.start().compare(Boolean.valueOf(this.c()), Boolean.valueOf(j2.c())).compare(this.e(), j2.e()).compare(this.g().b(), j2.g().b()).result();
            return n2;
        }
        n2 = ComparisonChain.start().compare(Boolean.valueOf(this.c()), Boolean.valueOf(j2.c())).compare(this.g().b(), j2.g().b()).result();
        return n2;
    }

    public int hashCode() {
        int n2 = this.h.hashCode();
        n2 = 31 * n2 + this.i;
        int[] arrn = j.b();
        n2 = 31 * n2 + this.c;
        int n3 = this.g;
        if (arrn == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        n2 = 31 * n2 + n3;
        int n4 = this.d;
        if (arrn == null) {
            n4 = n4 != 0 ? 1 : 0;
        }
        n2 = 31 * n2 + n4;
        return n2;
    }

    public static int[] b() {
        return f;
    }

    public j(b b10) {
        this(b10, 0, 0);
    }

    public int h() {
        return this.c;
    }

    public r b(r r2) {
        r2.a("Id", (byte)net.minecraft.K.b.a(this.g()));
        r2.a("Amplifier", (byte)this.h());
        r2.b("Duration", this.e());
        r2.a("Ambient", this.c());
        r2.a("ShowParticles", this.f());
        return r2;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public j(b b10, int n2, int n3) {
        this(b10, n2, n3, false, true);
    }

    public j(b b10, int n2) {
        this(b10, n2, 0);
    }

    public static j a(r r2) {
        boolean bl2;
        boolean bl3;
        int n2;
        byte by2;
        b b10;
        block5: {
            boolean bl4;
            block4: {
                byte by3 = r2.r("Id");
                b10 = net.minecraft.K.b.a(by3);
                int[] arrn = j.b();
                if (b10 == null) {
                    return null;
                }
                by2 = r2.r("Amplifier");
                n2 = r2.m("Duration");
                bl3 = r2.f("Ambient");
                bl2 = true;
                bl4 = r2.a("ShowParticles", 1);
                if (arrn != null) break block4;
                if (!bl4) break block5;
                bl4 = r2.f("ShowParticles");
            }
            bl2 = bl4;
        }
        return new j(b10, n2, by2 < 0 ? (byte)0 : by2, bl3, bl2);
    }

    public String j() {
        return this.h.i();
    }

    public boolean f() {
        return this.b;
    }

    static {
        e = LogManager.getLogger();
        j.b(null);
    }

    public boolean a(B b10) {
        int[] arrn = j.b();
        boolean bl2 = this.i;
        if (arrn == null) {
            if (bl2 > false) {
                int n2 = this.h.a(this.i, this.c);
                if (arrn == null) {
                    if (n2 != 0) {
                        this.b(b10);
                    }
                    n2 = this.d();
                }
            }
            bl2 = this.i;
        }
        if (arrn == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public void b(B b10) {
        block3: {
            j j2;
            block2: {
                int[] arrn = j.b();
                j2 = this;
                if (arrn != null) break block2;
                if (j2.i <= 0) break block3;
                j2 = this;
            }
            j2.h.a(b10, this.c);
        }
    }

    public b g() {
        return this.h;
    }

    public void a(j j2) {
        block11: {
            j j3;
            block8: {
                int n2;
                int[] arrn;
                block9: {
                    block10: {
                        int n3;
                        block6: {
                            block7: {
                                arrn = j.b();
                                j j4 = this;
                                if (arrn == null) {
                                    if (j4.h != j2.h) {
                                        e.warn("This method should only be called for matching effects!");
                                    }
                                    j4 = j2;
                                }
                                n2 = j4.c;
                                n3 = this.c;
                                if (arrn != null) break block6;
                                if (n2 <= n3) break block7;
                                this.c = j2.c;
                                this.i = j2.i;
                                if (arrn == null) break block8;
                            }
                            n2 = j2.c;
                            if (arrn != null) break block9;
                            n3 = this.c;
                        }
                        if (n2 != n3) break block10;
                        n2 = this.i;
                        if (arrn != null) break block9;
                        if (n2 >= j2.i) break block10;
                        this.i = j2.i;
                        if (arrn == null) break block8;
                    }
                    j3 = j2;
                    if (arrn != null) break block11;
                    n2 = j3.d ? 1 : 0;
                }
                if (n2 != 0) break block8;
                j3 = this;
                if (arrn != null) break block11;
                if (j3.d) {
                    this.d = j2.d;
                }
            }
            j3 = this;
        }
        j3.b = j2.b;
    }

    public int e() {
        return this.i;
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    public j(b b10, int n2, int n3, boolean bl2, boolean bl3) {
        this.h = b10;
        this.i = n2;
        this.c = n3;
        this.d = bl2;
        this.b = bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2;
        int[] arrn;
        block10: {
            int n3;
            j j2;
            block9: {
                arrn = j.b();
                Object object2 = this;
                if (arrn == null) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (arrn == null) {
                    if (!(object2 instanceof j)) {
                        return false;
                    }
                    object2 = object;
                }
                j2 = (j)object2;
                n2 = this.i;
                n3 = j2.i;
                if (arrn == null) {
                    if (n2 != n3) return 0 != 0;
                    n2 = this.c;
                    n3 = j2.c;
                }
                if (arrn == null) {
                    if (n2 != n3) return 0 != 0;
                    n2 = this.g ? 1 : 0;
                    n3 = j2.g ? 1 : 0;
                }
                if (arrn != null) break block9;
                if (n2 != n3) return 0 != 0;
                n2 = this.d ? 1 : 0;
                if (arrn != null) break block10;
                n3 = j2.d ? 1 : 0;
            }
            if (n2 != n3) return 0 != 0;
            n2 = this.h.equals(j2.h) ? 1 : 0;
        }
        if (arrn != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    public boolean c() {
        return this.d;
    }

    public j(j j2) {
        this.h = j2.h;
        this.i = j2.i;
        this.c = j2.c;
        this.d = j2.d;
        this.b = j2.b;
    }
}

