/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.at.l;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class dh
extends L {
    private /* synthetic */ db z;
    private /* synthetic */ aq A;
    private final /* synthetic */ dz B;
    private /* synthetic */ String y;

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
                                int n7 = fQ.d();
                                this.A.a((char)n2, n3);
                                n6 = n7;
                                this.z.a((char)n2, n3);
                                n5 = n2;
                                n4 = 9;
                                if (n6 != 0) break block5;
                                if (n5 != n4) break block6;
                                aq2 = this.A;
                                if (n6 != 0) break block7;
                                if (aq2.b()) break block8;
                                n5 = this.z.c() ? 1 : 0;
                                if (n6 != 0) break block9;
                                if (n5 == 0) break block6;
                            }
                            aq2 = this.A;
                        }
                        boolean bl2 = this.A.b();
                        if (n6 == 0) {
                            bl2 = !bl2;
                        }
                        aq2.c(bl2);
                        boolean bl3 = this.z.c();
                        if (n6 == 0) {
                            bl3 = !bl3;
                        }
                        this.z.b(bl3);
                    }
                    n5 = n2;
                }
                n4 = 13;
            }
            if (n5 != n4) break block10;
            this.a((s)this.t.get(0));
        }
    }

    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.t.clear();
        this.t.add(new dX(0, h / 2 - 100, w / 4 + 92 + 12, "Login"));
        this.t.add(new dX(1, h / 2 - 100, w / 4 + 116 + 12, "Back"));
        this.t.add(new dX(2, h / 2 - 100, w / 4 + 92 - 12, "Import user:pass"));
        this.A = new aq(this.a, this.m.a6, h / 2 - 100, 60, 200, 20);
        this.z = new db(this.m.a6, h / 2 - 100, 100, 200, 20);
    }

    dh(dz dz2) {
        this.y = (Object)((Object)net.minecraft.at.l.GRAY) + "Idle...";
        this.B = dz2;
    }

    @Override
    protected void a(s s2) {
        int n2 = fQ.d();
        switch (s2.g) {
            case 0: {
                aQ aQ2 = new aQ(this, this.A.n(), this.z.a());
                aQ2.start();
                if (n2 == 0) break;
            }
            case 1: {
                this.m.a(this.B);
                if (n2 == 0) break;
            }
            case 2: {
                String string;
                try {
                    string = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                }
                catch (Exception exception) {
                    return;
                }
                String string2 = string;
                String string3 = ":";
                if (n2 == 0) {
                    if (!string2.contains(string3)) break;
                    string2 = string;
                    string3 = ":";
                }
                String[] arrstring = string2.split(string3);
                this.A.a(arrstring[0]);
                this.z.b(arrstring[1]);
            }
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        try {
            super.a(n2, n3, n4);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.A.a(n2, n3, n4);
        this.z.a(n2, n3, n4);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void b(dh dh2, String string) {
        dh2.y = string;
    }

    static void a(dh dh2, String string) {
        dh.b(dh2, string);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        dh dh2;
        block7: {
            block8: {
                boolean bl2;
                int n4;
                block5: {
                    block6: {
                        dJ.a(0.0, 0.0, h, w, 0.5, new Color(22, 22, 22, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                        int n5 = fQ.e();
                        dJ.a(new v("neverhook/skeet.png"), 1.0f, 1.0f, 958.0f, 1.0f, Color.white);
                        this.A.d();
                        this.z.h();
                        n4 = n5;
                        this.m.ax.b("Add Alt", h / 2, 20.0f, -1);
                        bl2 = this.A.n().isEmpty();
                        if (n4 == 0) break block5;
                        if (!bl2) break block6;
                        bl2 = this.A.b();
                        if (n4 == 0) break block5;
                        if (!bl2) {
                            this.a(this.m.a6, "Username / E-Mail", h / 2 - 96, 66, -7829368);
                        }
                    }
                    dh2 = this;
                    if (n4 == 0) break block7;
                    bl2 = dh2.z.a().isEmpty();
                }
                if (!bl2) break block8;
                dh2 = this;
                if (n4 == 0) break block7;
                if (!dh2.z.c()) {
                    this.a(this.m.a6, "Password", h / 2 - 96, 106, -7829368);
                }
            }
            this.m.ax.b(this.y, (float)h / 2.0f, 30.0f, -1);
            dh2 = this;
        }
        super.a(n2, n3, f10);
    }
}

