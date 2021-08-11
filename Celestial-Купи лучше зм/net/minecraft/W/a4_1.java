/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.D;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.P.w;
import net.minecraft.Q.aZ;
import net.minecraft.ab.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aD;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.at.b;
import net.minecraft.at.g;
import net.minecraft.at.l;
import net.minecraft.at.o;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.w.a5;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a4
extends k {
    public static int a(d d10) {
        return d10.v().m("generation");
    }

    public a4() {
        this.b(1);
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10 = j2.c(a32);
        int n2 = bl.c();
        if (n2 == 0) {
            if (!z2.C) {
                this.a(d10, j2);
            }
            j2.a(d10, a32);
            j2.b(m.b(this));
        }
        return new t<d>(aX.SUCCESS, d10);
    }

    @Override
    public boolean e(d d10) {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(r r2) {
        String string;
        String string2;
        r r3;
        int n2;
        block8: {
            boolean bl2;
            block7: {
                n2 = bl.g();
                bl2 = a5.b(r2);
                if (n2 == 0) break block7;
                if (!bl2) {
                    return false;
                }
                r3 = r2;
                string2 = "title";
                if (n2 == 0) break block8;
                bl2 = r3.a(string2, 8);
            }
            if (!bl2) {
                return false;
            }
            r3 = r2;
            string2 = "title";
        }
        String string3 = string = r3.j(string2);
        if (n2 != 0) {
            if (string3 == null) return 0 != 0;
            string3 = string;
        }
        int n3 = string3.length();
        if (n2 != 0) {
            if (n3 > 32) return 0 != 0;
            n3 = r2.a("author", 8) ? 1 : 0;
        }
        if (n2 == 0) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String h(d d10) {
        String string;
        block5: {
            String string2;
            d d11;
            int n2;
            block4: {
                n2 = bl.c();
                d11 = d10;
                if (n2 != 0) break block4;
                if (!d11.x()) break block5;
                d11 = d10;
            }
            r r2 = d11.v();
            string = string2 = r2.j("title");
            if (n2 != 0) return string;
            if (!aD.a(string)) {
                return string2;
            }
        }
        string = super.h(d10);
        return string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, net.minecraft.client.B.o o2) {
        block6: {
            d d11;
            int n2;
            block5: {
                n2 = bl.g();
                d11 = d10;
                if (n2 == 0) break block5;
                if (!d11.x()) break block6;
                d11 = d10;
            }
            r r2 = d11.v();
            String string = r2.j("author");
            boolean bl2 = aD.a(string);
            if (n2 != 0) {
                if (!bl2) {
                    list.add((Object)((Object)l.GRAY) + net.minecraft.ab.a.a("book.byAuthor", string));
                }
                bl2 = list.add((Object)((Object)l.GRAY) + net.minecraft.ab.a.a("book.generation." + r2.m("generation")));
            }
        }
    }

    private void a(d d10, j j2) {
        block7: {
            j j3;
            block11: {
                int n2;
                block10: {
                    block5: {
                        r r2;
                        r r3;
                        block9: {
                            boolean bl2;
                            block8: {
                                r r4;
                                block6: {
                                    n2 = bl.g();
                                    r4 = d10.v();
                                    if (n2 == 0) break block6;
                                    if (r4 == null) break block7;
                                    r4 = d10.v();
                                }
                                r3 = r4;
                                bl2 = r3.f("resolved");
                                if (n2 == 0) break block8;
                                if (bl2) break block7;
                                r3.a("resolved", true);
                                r2 = r3;
                                if (n2 == 0) break block9;
                                bl2 = a4.b(r2);
                            }
                            if (!bl2) break block7;
                            r2 = r3;
                        }
                        u u2 = r2.c("pages", 8);
                        for (int i2 = 0; i2 < u2.b(); ++i2) {
                            net.minecraft.at.k k2;
                            String string = u2.c(i2);
                            try {
                                k2 = o.b(string);
                                k2 = net.minecraft.at.b.a(j2, k2, j2);
                                if (n2 == 0) break block5;
                            }
                            catch (Exception exception) {
                                k2 = new g(string);
                            }
                            u2.a(i2, new w(o.a(k2)));
                            if (n2 != 0) continue;
                        }
                        r3.a("pages", u2);
                    }
                    j3 = j2;
                    if (n2 == 0) break block10;
                    if (!(j3 instanceof net.minecraft.i.k)) break block7;
                    j3 = j2;
                }
                if (n2 == 0) break block11;
                if (j3.av() != d10) break block7;
                j3 = j2;
            }
            D d11 = j3.cm.a(j2.cB, j2.cB.a);
            ((net.minecraft.i.k)j2).cD.a(new aZ(0, d11.d, d10));
        }
    }
}

