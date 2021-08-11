/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.at.l;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;

public class d0
extends L {
    private /* synthetic */ db B;
    private final /* synthetic */ dz A;
    private /* synthetic */ aq y;
    private /* synthetic */ String z;

    public d0(dz dz2) {
        this.z = (Object)((Object)net.minecraft.at.l.GRAY) + "Waiting...";
        this.A = dz2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void r() {
        this.t.add(new dX(0, h / 2 - 100, w / 4 + 92 + 12, "Edit"));
        this.t.add(new dX(1, h / 2 - 100, w / 4 + 116 + 12, "Cancel"));
        this.y = new aq(this.a, this.m.a6, h / 2 - 100, 60, 200, 20);
        this.B = new db(this.m.a6, h / 2 - 100, 100, 200, 20);
    }

    @Override
    protected void a(char n2, int n3) {
        block10: {
            int n4;
            int n5;
            block5: {
                block9: {
                    block6: {
                        aq aq2;
                        int n6;
                        block7: {
                            block8: {
                                int n7 = fQ.e();
                                this.y.a((char)n2, n3);
                                this.B.a((char)n2, n3);
                                n6 = n7;
                                n5 = n2;
                                n4 = 9;
                                if (n6 == 0) break block5;
                                if (n5 != n4) break block6;
                                aq2 = this.y;
                                if (n6 == 0) break block7;
                                if (aq2.b()) break block8;
                                n5 = this.B.c() ? 1 : 0;
                                if (n6 == 0) break block9;
                                if (n5 == 0) break block6;
                            }
                            aq2 = this.y;
                        }
                        boolean bl2 = this.y.b();
                        if (n6 != 0) {
                            bl2 = !bl2;
                        }
                        aq2.c(bl2);
                        boolean bl3 = this.B.c();
                        if (n6 != 0) {
                            bl3 = !bl3;
                        }
                        this.B.b(bl3);
                    }
                    n5 = n2;
                }
                n4 = 13;
            }
            if (n5 != n4) break block10;
            this.a((s)this.t.get(0));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(s var1_1) {
        var2_2 = fQ.d();
        if (var2_2 != 0) ** GOTO lbl8
        switch (var1_1.g) {
            case 0: {
                this.A.E.b(this.y.n());
                this.A.E.a(this.B.a());
                this.z = "Edited!";
lbl8:
                // 2 sources

                if (var2_2 == 0) return;
            }
            case 1: {
                this.m.a(this.A);
                return;
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        d0 d02;
        block7: {
            block8: {
                boolean bl2;
                int n4;
                block5: {
                    block6: {
                        net.minecraft.client.b.l l2 = new net.minecraft.client.b.l(this.m);
                        int n5 = fQ.e();
                        dJ.a(0.0, 0.0, h, w, 0.5, new Color(17, 17, 17, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                        dJ.a(new v("neverhook/skeet.png"), 1.0f, 1.0f, (float)l2.e(), 1.0f, Color.white);
                        this.m.ax.b("Edit Alt", (float)h / 2.0f, 10.0f, -1);
                        this.m.ax.b(this.z, (float)h / 2.0f, 20.0f, -1);
                        n4 = n5;
                        this.y.d();
                        this.B.h();
                        bl2 = this.y.n().isEmpty();
                        if (n4 == 0) break block5;
                        if (!bl2) break block6;
                        bl2 = this.y.b();
                        if (n4 == 0) break block5;
                        if (!bl2) {
                            this.a(this.m.a6, "Name", h / 2 - 96, 66, -7829368);
                        }
                    }
                    d02 = this;
                    if (n4 == 0) break block7;
                    bl2 = d02.B.a().isEmpty();
                }
                if (!bl2) break block8;
                d02 = this;
                if (n4 == 0) break block7;
                if (!d02.B.c()) {
                    this.a(this.m.a6, "Password", h / 2 - 96, 106, -7829368);
                }
            }
            d02 = this;
        }
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        try {
            super.a(n2, n3, n4);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.y.a(n2, n3, n4);
        this.B.a(n2, n3, n4);
    }
}

