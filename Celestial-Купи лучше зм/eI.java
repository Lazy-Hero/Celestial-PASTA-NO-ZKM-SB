/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.al;
import net.minecraft.client.b.au;
import net.minecraft.k.m;

public class eI {
    protected /* synthetic */ int f;
    protected /* synthetic */ int i;
    private static /* synthetic */ String[] d;
    protected /* synthetic */ Q h;
    protected /* synthetic */ v g;
    protected /* synthetic */ int c;
    protected /* synthetic */ String b;
    protected /* synthetic */ int a;
    protected /* synthetic */ int e;
    protected /* synthetic */ int j;

    public static String[] b() {
        return d;
    }

    public void c(int n2, int n3) {
        block8: {
            int n4;
            String[] arrstring;
            block7: {
                arrstring = eI.b();
                n4 = this.b(n2, n3);
                if (arrstring != null) break block7;
                if (n4 == 0) break block8;
                n4 = this.a;
            }
            int n5 = 16;
            if (arrstring == null) {
                if (n4 == n5) {
                    this.h.a(new al(null, this.h.ac));
                }
                n4 = this.a;
                n5 = 15;
            }
            if (arrstring == null) {
                if (n4 == n5) {
                    this.h.a(new au(null, this.h.ac, this.h.aF()));
                }
                n4 = this.a;
                n5 = 14;
            }
            if (arrstring == null) {
                if (n4 == n5) {
                    this.h.m();
                }
                n4 = this.a;
                n5 = 13;
            }
            if (n4 == n5) {
                aV.a("https://vk.com/neverhook");
            }
        }
    }

    public eI(v v2, int n2, int n3, int n4, int n5, String string, int n6) {
        this.c = 0;
        this.g = v2;
        this.j = n2;
        this.f = n3;
        this.e = n4;
        String[] arrstring = eI.b();
        this.i = n5;
        this.b = string;
        this.a = n6;
        this.h = Q.P();
        if (arrstring != null) {
            m.b(!m.c());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected boolean b(int n2, int n3) {
        return dJ.a((double)this.j, (double)this.f, (double)(this.j + this.e), (double)(this.f + this.i), n2, n3);
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    protected void a(int n2, int n3) {
        block5: {
            eI eI2;
            block6: {
                int n4;
                block2: {
                    String[] arrstring;
                    block3: {
                        eI eI3;
                        block4: {
                            arrstring = eI.b();
                            n4 = this.b(n2, n3);
                            if (arrstring != null) break block2;
                            if (n4 == 0) break block3;
                            eI3 = this;
                            if (arrstring != null) break block4;
                            if (eI3.c >= 5) break block5;
                            eI3 = this;
                        }
                        ++eI3.c;
                        if (arrstring == null) break block5;
                    }
                    eI2 = this;
                    if (arrstring != null) break block6;
                    n4 = eI2.c;
                }
                if (n4 <= 0) break block5;
                eI2 = this;
            }
            --eI2.c;
        }
    }

    static {
        if (eI.b() != null) {
            eI.b(new String[3]);
        }
    }

    public void a(int n2, int n3, Color color) {
        block5: {
            block4: {
                eI eI2;
                block2: {
                    block3: {
                        String[] arrstring = eI.b();
                        net.minecraft.client.a.v.M();
                        net.minecraft.client.a.v.f();
                        this.a(n2, n3);
                        String[] arrstring2 = arrstring;
                        eI2 = this;
                        if (arrstring2 != null) break block2;
                        if (eI2.c <= 0) break block3;
                        dJ.a(this.g, (float)(this.j - this.c), (float)(this.f - this.c), (float)(this.e + this.c * 2), (float)(this.i + this.c * 2), new Color(199, 199, 199, 255));
                        if (arrstring2 == null) break block4;
                    }
                    eI2 = this;
                }
                dJ.a(eI2.g, (float)this.j, (float)this.f, (float)this.e, (float)this.i, color);
            }
            net.minecraft.client.a.v.B();
            if (!m.c()) break block5;
            eI.b(new String[1]);
        }
    }
}

