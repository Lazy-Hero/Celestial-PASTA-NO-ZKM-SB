/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.F;
import net.G;
import net.I;
import net.f;
import net.i;
import net.k;
import net.minecraft.N.y;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.m;
import net.r;
import net.t;
import net.u;
import net.v;

public class w
implements i {
    private final /* synthetic */ F d;
    private final /* synthetic */ j e;
    private final /* synthetic */ f[] c;
    private /* synthetic */ c b;
    private /* synthetic */ c a;
    private final /* synthetic */ I f;

    public void b(c c10) {
        this.a = c10;
    }

    public void a(c c10) {
        this.b = c10;
    }

    @Override
    public c b(String string) {
        int[] arrn;
        block23: {
            c c10;
            block22: {
                c c11;
                block21: {
                    c c12;
                    block19: {
                        String string2;
                        String string3;
                        block20: {
                            arrn = G.c();
                            string3 = string;
                            if (arrn == null) {
                                if (string3 == null) {
                                    return null;
                                }
                                string3 = string;
                            }
                            string2 = ":";
                            if (arrn != null) break block20;
                            if (string3.indexOf(string2) < 0) break block21;
                            string3 = string;
                            string2 = ":";
                        }
                        String[] arrstring = fU.c(string3, string2);
                        c c13 = this.b(arrstring[0]);
                        for (int i2 = 1; i2 < arrstring.length; ++i2) {
                            c c14;
                            String string4 = arrstring[i2];
                            c12 = c14 = c13.a(string4);
                            if (arrn == null) {
                                c c15;
                                if (arrn == null) {
                                    if (c12 == null) {
                                        return null;
                                    }
                                    c15 = c14;
                                }
                                c13 = c15;
                                if (arrn == null) continue;
                            }
                            break block19;
                        }
                        c12 = c13;
                    }
                    return c12;
                }
                c c16 = this.b;
                if (arrn == null) {
                    if (c16 != null && string.equals("this")) {
                        return this.b;
                    }
                    c16 = this.a;
                }
                if (arrn == null) {
                    if (c16 != null && string.equals("part")) {
                        return this.a;
                    }
                    c16 = this.f.a(this.e, string);
                }
                c10 = c11 = c16;
                if (arrn != null) break block22;
                if (c10 == null) break block23;
                c10 = c11;
            }
            return c10;
        }
        int n2 = 0;
        while (n2 < this.c.length) {
            f f10 = this.c[n2];
            c c17 = f10.d();
            if (string.equals(c17.b())) {
                return c17;
            }
            c c18 = c17.a(string);
            if (arrn == null) {
                if (c18 != null) {
                    return c18;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    @Override
    public k a(String string) {
        String[] arrstring = fU.c(string, ".");
        int[] arrn = G.c();
        String[] arrstring2 = arrstring;
        if (arrn == null) {
            if (arrstring2.length != 2) {
                return null;
            }
            arrstring2 = arrstring;
        }
        String string2 = arrstring2[0];
        String string3 = arrstring[1];
        c c10 = this.b(string2);
        if (c10 == null) {
            return null;
        }
        v v2 = v.a(string3);
        return v2 == null ? null : new k(string, c10, v2);
    }

    @Override
    public r c(String string) {
        k k2 = this.a(string);
        int[] arrn = G.c();
        r r2 = k2;
        if (arrn == null) {
            if (r2 != null) {
                return k2;
            }
            r2 = this.d.a(string);
        }
        k k3 = r2;
        return k3;
    }

    public w(I i2, j j2, f[] arrf) {
        block5: {
            block4: {
                block3: {
                    int[] arrn;
                    block2: {
                        int[] arrn2 = G.c();
                        arrn = arrn2;
                        this.f = i2;
                        this.e = j2;
                        this.c = arrf;
                        Class class_ = i2.b();
                        if (arrn != null) break block2;
                        if (!y.class.isAssignableFrom(class_)) break block3;
                        this.d = new u();
                    }
                    if (arrn == null) break block4;
                }
                this.d = new t();
            }
            if (m.d()) break block5;
            G.b(new int[4]);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

