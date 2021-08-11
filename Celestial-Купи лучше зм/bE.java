/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.at.l;
import net.minecraft.client.Q;
import net.minecraft.k.m;
import net.minecraft.u.E;

public class bE {
    private final /* synthetic */ String j;
    public /* synthetic */ ex a;
    private /* synthetic */ String i;
    private /* synthetic */ boolean b;
    public /* synthetic */ boolean g;
    protected static /* synthetic */ Q c;
    private /* synthetic */ String e;
    private /* synthetic */ int d;
    private final /* synthetic */ a5 f;
    private static /* synthetic */ int h;

    public static int j() {
        return h;
    }

    public ex h() {
        return this.a;
    }

    public static int l() {
        int n2 = bE.j();
        if (n2 == 0) {
            return 74;
        }
        return 0;
    }

    public void b(String string) {
        this.a(this.a() + " " + (Object)((Object)l.GRAY) + string);
    }

    public void a(int n2) {
        this.d = n2;
    }

    public a5 k() {
        return this.f;
    }

    public bE(String string, a5 a52) {
        block0: {
            String string2 = a5.c();
            String string3 = string2;
            this.a = new ex(0.0f, 0.0f);
            this.g = true;
            this.j = string;
            this.f = a52;
            this.b = false;
            this.d = 0;
            if (!m.c()) break block0;
            a5.b("xOpbf");
        }
    }

    public boolean i() {
        return this.b;
    }

    public String g() {
        return this.e;
    }

    public void d() {
        block9: {
            boolean bl2;
            block10: {
                String string;
                block8: {
                    block6: {
                        block7: {
                            String string2 = a5.c();
                            af.a(this);
                            string = string2;
                            bl2 = this.a().contains("ClickGui");
                            if (string == null) break block6;
                            if (bl2) break block7;
                            bl2 = this.a().contains("Client Font");
                            if (string == null) break block6;
                            if (bl2) break block7;
                            bl2 = b2.k.l();
                            if (string == null) break block6;
                            if (bl2) {
                                gd.a("Module", this.a() + " was Enabled!", 2, gD.INFO);
                            }
                        }
                        bl2 = this.a().contains("ClickGui");
                    }
                    if (string == null) break block8;
                    if (bl2) break block9;
                    bl2 = this.a().contains("Client Font");
                }
                if (string == null) break block10;
                if (bl2) break block9;
                bl2 = cj.b.i.a(bi.class).i();
            }
            if (bl2) {
                bE.c.s.a(E.eo, 1.0f, 1.0f);
            }
        }
    }

    public void b(boolean bl2) {
        block4: {
            block3: {
                String string;
                block2: {
                    string = a5.c();
                    if (string == null) break block2;
                    if (!bl2) break block3;
                    af.a(this);
                }
                if (string != null) break block4;
            }
            af.b(this);
        }
        this.b = bl2;
    }

    public static void b(int n2) {
        h = n2;
    }

    public void m() {
        block9: {
            boolean bl2;
            block10: {
                String string;
                block8: {
                    block6: {
                        block7: {
                            String string2 = a5.c();
                            af.b(this);
                            string = string2;
                            bl2 = this.a().contains("ClickGui");
                            if (string == null) break block6;
                            if (bl2) break block7;
                            bl2 = this.a().contains("Client Font");
                            if (string == null) break block6;
                            if (bl2) break block7;
                            bl2 = b2.k.l();
                            if (string == null) break block6;
                            if (bl2) {
                                gd.a("Module", this.a() + " was Disabled!", 2, gD.INFO);
                            }
                        }
                        bl2 = this.a().contains("ClickGui");
                    }
                    if (string == null) break block8;
                    if (bl2) break block9;
                    bl2 = this.a().contains("Client Font");
                }
                if (string == null) break block10;
                if (bl2) break block9;
                bl2 = cj.b.i.a(bi.class).i();
            }
            if (bl2) {
                bE.c.s.a(E.dc, 1.0f, 1.0f);
            }
        }
    }

    public void a(hH ... arrhH) {
        hH[] arrhH2 = arrhH;
        int n2 = arrhH2.length;
        String string = a5.c();
        for (int i2 = 0; i2 < n2; ++i2) {
            hH hH2 = arrhH2[i2];
            cj.b.f.b(hH2);
            if (string != null) continue;
        }
    }

    public String a() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String c() {
        String string;
        String string2 = a5.c();
        bE bE2 = this;
        if (string2 != null) {
            if (bE2.i == null) {
                string = this.j;
                return string;
            }
            bE2 = this;
        }
        string = bE2.i;
        return string;
    }

    public void a(String string) {
        this.i = string;
    }

    public void e() {
        block6: {
            bE bE2;
            block4: {
                block5: {
                    String string = a5.c();
                    boolean bl2 = this.b;
                    if (string != null) {
                        bl2 = !bl2;
                    }
                    this.b = bl2;
                    bE2 = this;
                    if (string == null) break block4;
                    if (!bE2.b) break block5;
                    this.d();
                    if (string != null) break block6;
                }
                bE2 = this;
            }
            bE2.m();
        }
    }

    public boolean f() {
        String string = a5.c();
        boolean bl2 = this.g;
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        c = Q.P();
        bE.b(125);
    }

    public int n() {
        return this.d;
    }

    public boolean b() {
        return this.g;
    }
}

