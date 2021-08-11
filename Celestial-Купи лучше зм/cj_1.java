/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.io.IOException;
import net.minecraft.client.Q;
import net.minecraft.k.m;
import org.lwjgl.input.Keyboard;

public class cj {
    public /* synthetic */ a6 a;
    public /* synthetic */ N f;
    public /* synthetic */ dp c;
    private static /* synthetic */ String k;
    public /* synthetic */ a1 o;
    public /* synthetic */ eA j;
    private static /* synthetic */ int[] d;
    public /* synthetic */ cI g;
    public static /* synthetic */ String e;
    public /* synthetic */ dN m;
    public static /* synthetic */ cj b;
    public /* synthetic */ dC n;
    public /* synthetic */ gv i;
    public /* synthetic */ dR l;
    public static /* synthetic */ String h;

    public static void b(int[] arrn) {
        d = arrn;
    }

    private static void lambda$onKey$0(aN aN2) {
        block3: {
            aN aN3;
            block2: {
                int[] arrn = cj.b();
                aN3 = aN2;
                if (arrn != null) break block2;
                if (aN3.e() != Keyboard.getEventKey()) break block3;
                aN3 = aN2;
            }
            aN3.b();
        }
    }

    public static eA f() {
        return cj.b.j;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gu g() {
        int n2;
        gu gu2;
        int[] arrn;
        Q q2;
        block21: {
            q2 = Q.P();
            arrn = cj.b();
            gu2 = q2.ax;
            String string = cj.b.f.a("FontList").m();
            String string2 = string.toLowerCase();
            int n3 = -1;
            n2 = string2.hashCode();
            if (arrn != null) break block21;
            switch (n2) {
                case -1686065428: {
                    n2 = string2.equals("comfortaa") ? 1 : 0;
                    if (arrn == null) {
                        if (n2 == 0) break;
                        n3 = 0;
                        if (arrn == null) break;
                    }
                    break block21;
                }
                case 109278081: {
                    n2 = string2.equals("sf ui") ? 1 : 0;
                    if (arrn == null) {
                        if (n2 == 0) break;
                        n3 = 1;
                        if (arrn == null) break;
                    }
                    break block21;
                }
                case 351153427: {
                    n2 = string2.equals("verdana") ? 1 : 0;
                    if (arrn == null) {
                        if (n2 == 0) break;
                        n3 = 2;
                        if (arrn == null) break;
                    }
                    break block21;
                }
                case -1063148335: {
                    n2 = string2.equals("robotoLight") ? 1 : 0;
                    if (arrn == null) {
                        if (n2 == 0) break;
                        n3 = 3;
                        if (arrn == null) break;
                    }
                    break block21;
                }
                case -232065865: {
                    n2 = string2.equals("robotoregular") ? 1 : 0;
                    if (arrn == null) {
                        if (n2 == 0) break;
                        n3 = 4;
                        if (arrn == null) break;
                    }
                    break block21;
                }
                case 3314352: {
                    n2 = string2.equals("lato") ? 1 : 0;
                    if (arrn != null) break block21;
                    if (n2 == 0) break;
                    n3 = 5;
                }
            }
            n2 = n3;
        }
        switch (n2) {
            case 0: {
                gu2 = q2.f;
                if (arrn == null) break;
            }
            case 1: {
                gu2 = q2.ax;
                if (arrn == null) break;
            }
            case 2: {
                gu2 = q2.q;
                if (arrn == null) break;
            }
            case 3: {
                gu2 = q2.A;
                if (arrn == null) break;
            }
            case 4: {
                gu2 = q2.m;
                if (arrn == null) break;
            }
            case 5: {
                gu2 = q2.a;
                break;
            }
        }
        if (!net.minecraft.k.m.c()) return gu2;
        cj.b(new int[2]);
        return gu2;
    }

    private static boolean lambda$onKey$1(fc fc2, bE bE2) {
        int[] arrn = cj.b();
        int n2 = bE2.n();
        if (arrn == null) {
            n2 = n2 == fc2.a() ? 1 : 0;
        }
        return n2 != 0;
    }

    public static void a(String string) {
        k = string;
    }

    public void d() {
        af.b(this);
        this.o = new a1();
        this.o.b();
    }

    public static a1 c() {
        return cj.b.o;
    }

    static {
        e = "Celestial";
        h = "Free 0.2";
        cj.b(null);
        b = new cj();
    }

    public static int[] b() {
        return d;
    }

    public static Color h() {
        Color color;
        block9: {
            boolean bl2;
            block14: {
                String string;
                block15: {
                    float f10;
                    int[] arrn;
                    double d10;
                    Color color2;
                    Color color3;
                    block12: {
                        block13: {
                            block10: {
                                block11: {
                                    int n2;
                                    block8: {
                                        block7: {
                                            color = Color.white;
                                            color3 = new Color(bT.s.o());
                                            color2 = new Color(bT.t.o());
                                            d10 = bT.r.f();
                                            arrn = cj.b();
                                            string = cj.b.f.a("ArrayList Color").m();
                                            f10 = 4.0f;
                                            n2 = 0;
                                            for (int i2 = 0; i2 < 30; ++i2) {
                                                n2 += Q.P().ax.c() + 5;
                                                if (arrn == null) {
                                                    if (arrn == null) continue;
                                                    net.minecraft.k.m.b(!net.minecraft.k.m.d());
                                                    break;
                                                }
                                                break block7;
                                            }
                                            bl2 = string.equalsIgnoreCase("Rainbow");
                                            if (arrn != null) break block8;
                                            if (!bl2) break block7;
                                            color = a0.a(20, 0.8f, 1.0f);
                                            if (arrn == null) break block9;
                                        }
                                        bl2 = string.equalsIgnoreCase("Astolfo");
                                    }
                                    if (arrn != null) break block10;
                                    if (!bl2) break block11;
                                    color = a0.b((int)f10, n2);
                                    if (arrn == null) break block9;
                                }
                                bl2 = string.equalsIgnoreCase("Pulse");
                            }
                            if (arrn != null) break block12;
                            if (!bl2) break block13;
                            color = a0.a(new Color(255, 50, 50), new Color(79, 9, 9), Math.abs((double)System.currentTimeMillis() / d10) / 100.0 + 6.0 * ((double)f10 * 2.55) / 60.0);
                            if (arrn == null) break block9;
                        }
                        bl2 = string.equalsIgnoreCase("Custom");
                    }
                    if (arrn != null) break block14;
                    if (!bl2) break block15;
                    color = a0.a(new Color(color3.getRGB()), new Color(color2.getRGB()), Math.abs((double)System.currentTimeMillis() / d10) / 100.0 + 3.0 * ((double)f10 * 2.55) / 60.0);
                    if (arrn == null) break block9;
                }
                bl2 = string.equalsIgnoreCase("None");
            }
            if (bl2) {
                color = new Color(255, 255, 255);
            }
        }
        return color;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static String i() {
        return k;
    }

    public void e() {
        this.f = new N();
        this.g = new cI();
        this.i = new gv();
        this.a = new a6();
        this.j = new eA();
        this.j.a();
        this.o = new a1();
        this.o.a();
        this.l = new dR();
        this.c = new dp();
        this.n = new dC();
        try {
            cj.c().a(cb.class).e();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.m = new dN();
        af.a(this.n);
        af.a(this);
    }

    @cL
    public void a(fc fc2) {
        cj.b.c.a().forEach(cj::lambda$onKey$0);
        this.i.a().stream().filter(arg_0 -> cj.lambda$onKey$1(fc2, arg_0)).forEach(bE::e);
    }
}

