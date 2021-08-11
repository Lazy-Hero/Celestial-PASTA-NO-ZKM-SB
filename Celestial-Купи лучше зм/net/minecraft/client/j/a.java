/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.c;
import net.minecraft.client.j.s;
import net.minecraft.client.j.u;

public class a
implements Comparable<a> {
    private final /* synthetic */ int f;
    private /* synthetic */ boolean c;
    private /* synthetic */ float d;
    private final /* synthetic */ c b;
    private final /* synthetic */ int e;
    private final /* synthetic */ int a;

    public a(c c10, int n2) {
        this.d = 1.0f;
        this.b = c10;
        this.a = c10.f();
        boolean bl2 = u.d();
        this.f = c10.b();
        this.e = n2;
        int n3 = s.a(this.f, n2);
        if (bl2) {
            n3 = n3 > s.a(this.a, n2) ? 1 : 0;
        }
        this.c = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int c() {
        var1_1 = u.d();
        v0 = this;
        if (!var1_1) ** GOTO lbl8
        if (v0.c) {
            v1 = this.a;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.f;
        }
        var2_2 = v1;
        return s.a((int)((float)var2_2 * this.d), this.e);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a() {
        var1_1 = u.d();
        v0 = this;
        if (!var1_1) ** GOTO lbl8
        if (v0.c) {
            v1 = this.f;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.a;
        }
        var2_2 = v1;
        return s.a((int)((float)var2_2 * this.d), this.e);
    }

    public c b() {
        return this.b;
    }

    public String toString() {
        return "Holder{width=" + this.a + ", height=" + this.f + ", name=" + this.b.e() + '}';
    }

    public void d() {
        boolean bl2 = u.d();
        boolean bl3 = this.c;
        if (bl2) {
            bl3 = !bl3;
        }
        this.c = bl3;
    }

    public int a(a a10) {
        int n2;
        block13: {
            int n3;
            block14: {
                int n4;
                block9: {
                    boolean bl2;
                    block10: {
                        block12: {
                            int n5;
                            int n6;
                            block11: {
                                bl2 = u.d();
                                n3 = this.c();
                                n4 = a10.c();
                                if (!bl2) break block9;
                                if (n3 != n4) break block10;
                                n6 = this.a();
                                n5 = a10.a();
                                if (!bl2) break block11;
                                if (n6 == n5) {
                                    String string = this.b.e();
                                    if (bl2) {
                                        if (string == null) {
                                            return a10.b.e() == null ? 0 : -1;
                                        }
                                        string = this.b.e();
                                    }
                                    return string.compareTo(a10.b.e());
                                }
                                n6 = this.a();
                                if (!bl2) break block12;
                                n5 = a10.a();
                            }
                            n6 = n2 = n6 < n5 ? 1 : -1;
                        }
                        if (bl2) break block13;
                    }
                    n3 = this.c();
                    if (!bl2) break block14;
                    n4 = a10.c();
                }
                n3 = n3 < n4 ? 1 : -1;
            }
            n2 = n3;
        }
        return n2;
    }

    public boolean e() {
        return this.c;
    }

    public void a(int n2) {
        block3: {
            block4: {
                a a10;
                int n3;
                int n4;
                block2: {
                    boolean bl2 = u.c();
                    n4 = this.a;
                    n3 = n2;
                    if (bl2) break block2;
                    if (n4 <= n3) break block3;
                    a10 = this;
                    if (bl2) break block4;
                    n4 = a10.f;
                    n3 = n2;
                }
                if (n4 <= n3) break block3;
                a10 = this;
            }
            a10.d = (float)n2 / (float)Math.min(this.a, this.f);
        }
    }
}

