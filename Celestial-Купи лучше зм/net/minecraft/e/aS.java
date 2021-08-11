/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import javax.annotation.Nullable;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.b;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.P.r;
import net.minecraft.k.m;

public class aS {
    private /* synthetic */ String[] a;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ String[] b;
    private /* synthetic */ String[] d;

    public void a(aS aS2) {
        d[] arrd = net.minecraft.E.d.values();
        int n2 = arrd.length;
        m[] arrm = s.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            d d10 = arrd[i2];
            aS.a(this, d10, aS2.a[d10.c()], aS2.d[d10.c()]);
            if (arrm != null) continue;
        }
    }

    public static void a(aS aS2, d d10, @Nullable String string, @Nullable String string2) {
        block10: {
            block3: {
                m[] arrm;
                block8: {
                    String[] arrstring;
                    block9: {
                        block6: {
                            aS aS3;
                            block7: {
                                String string3;
                                block5: {
                                    block4: {
                                        block2: {
                                            arrm = s.b();
                                            string3 = string;
                                            if (arrm == null) break block2;
                                            if (string3 == null) break block3;
                                            string3 = string;
                                        }
                                        if (arrm == null) break block4;
                                        if (string3.isEmpty()) break block3;
                                        string3 = string2;
                                    }
                                    if (arrm == null) break block5;
                                    if (string3 == null) break block3;
                                    string3 = string2;
                                }
                                if (string3.isEmpty()) break block3;
                                aS3 = aS2;
                                if (arrm == null) break block6;
                                if (aS3.a == b) break block7;
                                arrstring = aS2.d;
                                if (arrm == null) break block8;
                                if (arrstring != b) break block9;
                            }
                            aS2.a = new String[c];
                            aS3 = aS2;
                        }
                        aS3.d = new String[c];
                    }
                    aS2.a[d10.c()] = string;
                    arrstring = aS2.d;
                }
                arrstring[d10.c()] = string2;
                if (arrm != null) break block10;
            }
            aS.a(aS2, d10);
        }
    }

    public aS() {
        this.a = b;
        this.d = b;
    }

    static {
        c = net.minecraft.E.d.values().length;
        b = new String[c];
    }

    public void b(r r2) {
        block4: {
            String string;
            r r3;
            m[] arrm;
            block3: {
                arrm = s.b();
                r3 = r2;
                string = "CommandStats";
                if (arrm == null) break block3;
                if (!r3.a(string, 10)) break block4;
                r3 = r2;
                string = "CommandStats";
            }
            r r4 = r3.h(string);
            d[] arrd = net.minecraft.E.d.values();
            int n2 = arrd.length;
            int n3 = 0;
            while (n3 < n2) {
                block5: {
                    block6: {
                        String string2;
                        r r5;
                        String string3;
                        d d10;
                        block7: {
                            d10 = arrd[n3];
                            String string4 = d10.a() + "Name";
                            string3 = d10.a() + "Objective";
                            if (arrm == null) break block5;
                            if (!r4.a(string4, 8)) break block6;
                            r5 = r4;
                            string2 = string3;
                            if (arrm == null) break block7;
                            if (!r5.a(string2, 8)) break block6;
                            r5 = r4;
                            string2 = string4;
                        }
                        String string5 = r5.j(string2);
                        String string6 = r4.j(string3);
                        aS.a(this, d10, string5, string6);
                    }
                    ++n3;
                }
                if (arrm != null) continue;
            }
        }
    }

    public void a(net.minecraft.R.b b10, J j2, d d10, int n2) {
        block4: {
            h h2;
            String string;
            net.minecraft.D.b b11;
            block5: {
                net.minecraft.D.b b12;
                h h3;
                String string2;
                String string3 = this.a[d10.c()];
                m[] arrm = s.b();
                if (string3 == null) break block4;
                b b13 = new b(this, j2);
                try {
                    string2 = K.f(b10, b13, string3);
                }
                catch (s s2) {
                    return;
                }
                String string4 = this.d[d10.c()];
                if (string4 == null || (h3 = (b12 = j2.b().c()).h(string4)) == null) break block4;
                b11 = b12;
                string = string2;
                h2 = h3;
                if (arrm == null) break block5;
                if (!b11.c(string, h2)) break block4;
                b11 = b12;
                string = string2;
                h2 = h3;
            }
            e e10 = b11.d(string, h2);
            e10.a(n2);
        }
    }

    private static void a(aS aS2, d d10) {
        block10: {
            block8: {
                aS aS3;
                m[] arrm;
                block11: {
                    String[] arrstring;
                    String[] arrstring2;
                    block9: {
                        arrm = s.b();
                        arrstring2 = aS2.a;
                        arrstring = b;
                        if (arrm == null) break block9;
                        if (arrstring2 == arrstring) break block10;
                        arrstring2 = aS2.d;
                        if (arrm == null) break block11;
                        arrstring = b;
                    }
                    if (arrstring2 == arrstring) break block10;
                    aS2.a[d10.c()] = null;
                    arrstring2 = aS2.d;
                }
                arrstring2[d10.c()] = null;
                boolean bl2 = true;
                d[] arrd = net.minecraft.E.d.values();
                int n2 = arrd.length;
                int n3 = 0;
                while (n3 < n2) {
                    d d11 = arrd[n3];
                    if (arrm != null) {
                        aS3 = aS2;
                        if (arrm == null) break block8;
                        if (aS3.a[d11.c()] != null && aS2.d[d11.c()] != null) {
                            bl2 = false;
                            if (arrm != null) break;
                        }
                        ++n3;
                    }
                    if (arrm != null) continue;
                }
                if (!bl2) break block10;
                aS2.a = b;
                aS3 = aS2;
            }
            aS3.d = b;
        }
    }

    public void a(r r2) {
        block8: {
            r r3;
            r r4;
            block9: {
                r4 = new r();
                d[] arrd = net.minecraft.E.d.values();
                int n2 = arrd.length;
                int n3 = 0;
                m[] arrm = s.b();
                while (n3 < n2) {
                    d d10 = arrd[n3];
                    String string = this.a[d10.c()];
                    String string2 = this.d[d10.c()];
                    if (arrm != null) {
                        if (arrm != null) {
                            if (string != null && string2 != null) {
                                r4.a(d10.a() + "Name", string);
                                r4.a(d10.a() + "Objective", string2);
                            }
                            ++n3;
                        }
                        if (arrm != null) continue;
                    }
                    break block8;
                }
                r3 = r4;
                if (arrm == null) break block9;
                if (r3.c()) break block8;
                r3 = r2;
            }
            r3.a("CommandStats", r4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

