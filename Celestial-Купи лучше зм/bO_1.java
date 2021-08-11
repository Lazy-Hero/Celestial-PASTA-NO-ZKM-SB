/*
 * Decompiled with CFR 0.150.
 */
public class bO
extends bE {
    public static /* synthetic */ String k;

    private static gP b(gP gP2) {
        return gP2;
    }

    public bO() {
        super("AutoAuth", a5.Player);
    }

    static {
        k = "qwerty123";
    }

    @cL
    public void a(fo fo2) {
        block4: {
            block6: {
                boolean bl2;
                block5: {
                    int n2;
                    block2: {
                        block3: {
                            String string;
                            String string2;
                            block0: {
                                block1: {
                                    n2 = bE.j();
                                    string2 = fo2.a();
                                    string = "/reg";
                                    if (n2 == 0) break block0;
                                    if (string2.contains(string)) break block1;
                                    string2 = fo2.a();
                                    string = "/register";
                                    if (n2 == 0) break block0;
                                    if (string2.contains(string)) break block1;
                                    bl2 = fo2.a().contains("\u0417\u0430\u0440\u0435\u0433\u0435\u0441\u0442\u0440\u0438\u0440\u0443\u0439\u0442\u0435\u0441\u044c");
                                    if (n2 == 0) break block2;
                                    if (!bl2) break block3;
                                }
                                bO.c.s.b("/reg " + k + " " + k);
                                cp.a("Your password: " + k);
                                string2 = "AutoAuth";
                                string = "You are successfully registered!";
                            }
                            gd.a(string2, string, 4, gD.SUCCESS);
                            if (n2 != 0) break block4;
                        }
                        bl2 = fo2.a().contains("\u0410\u0432\u0442\u043e\u0440\u0438\u0437\u0443\u0439\u0442\u0435\u0441\u044c");
                    }
                    if (n2 == 0) break block5;
                    if (bl2) break block6;
                    bl2 = fo2.a().contains("/l");
                }
                if (!bl2) break block4;
            }
            bO.c.s.b("/login " + k);
        }
    }
}

