/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 */
import it.unimi.dsi.fastutil.ints.IntArraySet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.minecraft.A.h;
import net.minecraft.N.H;
import net.minecraft.N.K;
import net.minecraft.N.O;
import net.minecraft.N.P;
import net.minecraft.N.Q;
import net.minecraft.N.S;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.cd;
import net.minecraft.ag.D;
import net.minecraft.ag.F;
import net.minecraft.ag.G;
import net.minecraft.ag.I;
import net.minecraft.ag.W;
import net.minecraft.ah.f;
import net.minecraft.ah.t;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class go {
    private static final /* synthetic */ v v;
    private static final /* synthetic */ i[] f;
    private /* synthetic */ Boolean h;
    private static final /* synthetic */ v e;
    private static final /* synthetic */ v w;
    private static final /* synthetic */ i[] B;
    private /* synthetic */ cZ k;
    private /* synthetic */ cZ C;
    private static final /* synthetic */ v l;
    private /* synthetic */ dZ[] E;
    private static final /* synthetic */ v g;
    private static final /* synthetic */ bl[] y;
    private static final /* synthetic */ v m;
    private /* synthetic */ String x;
    private /* synthetic */ Map<v, v> s;
    private /* synthetic */ Boolean i;
    private static final /* synthetic */ v d;
    private /* synthetic */ bl[] n;
    private static final /* synthetic */ v a;
    private static final /* synthetic */ v p;
    private static final /* synthetic */ v u;
    private /* synthetic */ Boolean D;
    private /* synthetic */ dr c;
    private static final /* synthetic */ i[] j;
    private /* synthetic */ i[] A;
    private static final /* synthetic */ dZ[] F;
    private /* synthetic */ h[] r;
    private /* synthetic */ eU b;
    private static final /* synthetic */ v z;
    private /* synthetic */ String G;
    private static final /* synthetic */ v o;
    private /* synthetic */ Boolean q;
    private static final /* synthetic */ v t;

    static {
        F = new dZ[0];
        j = new i[]{i.HORSE, i.DONKEY, i.MULE, i.LLAMA};
        B = new i[]{i.DISPENSER, i.DROPPER};
        f = new i[0];
        y = new bl[0];
        p = new v("textures/gui/container/anvil.png");
        t = new v("textures/gui/container/beacon.png");
        w = new v("textures/gui/container/brewing_stand.png");
        v = new v("textures/gui/container/generic_54.png");
        z = new v("textures/gui/container/crafting_table.png");
        m = new v("textures/gui/container/horse.png");
        u = new v("textures/gui/container/dispenser.png");
        l = new v("textures/gui/container/enchanting_table.png");
        a = new v("textures/gui/container/furnace.png");
        e = new v("textures/gui/container/hopper.png");
        g = new v("textures/gui/container/inventory.png");
        o = new v("textures/gui/container/shulker_box.png");
        d = new v("textures/gui/container/villager.png");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(eU eU2, n n2, t t2) {
        String string = K.d();
        go go2 = this;
        if (string == null) {
            if (go2.b != eU2) {
                return false;
            }
            go2 = this;
        }
        if (string == null) {
            if (go2.r != null) {
                h h2 = t2.c(n2);
                boolean bl2 = gc.a(h2, this.r);
                if (string != null) return bl2;
                if (!bl2) {
                    return false;
                }
            }
            go2 = this;
        }
        cZ cZ2 = go2.k;
        if (string == null) {
            if (cZ2 == null) return true;
            cZ2 = this.k;
        }
        boolean bl3 = cZ2.b(n2.b());
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g(String string) {
        String string2 = K.d();
        String string3 = this.G;
        if (string2 == null) {
            if (string3 != null) {
                int n2 = this.G.length();
                if (string2 != null) return n2 != 0;
                if (n2 > 0) {
                    go go2 = this;
                    if (string2 == null) {
                        if (go2.x == null) {
                            go.c("No base path found: " + string);
                            return false;
                        }
                        go2 = this;
                    }
                    if (string2 == null) {
                        if (go2.b == null) {
                            go.c("No container found: " + string);
                            return false;
                        }
                        go2 = this;
                    }
                    if (string2 == null) {
                        if (go2.s.isEmpty()) {
                            go.c("No texture found: " + string);
                            return false;
                        }
                        go2 = this;
                    }
                    if (string2 == null) {
                        if (go2.E == F) {
                            go.c("Invalid professions or careers: " + string);
                            return false;
                        }
                        go2 = this;
                    }
                    if (string2 == null) {
                        if (go2.A == f) {
                            go.c("Invalid variants: " + string);
                            return false;
                        }
                        go2 = this;
                    }
                    if (go2.n != y) return true;
                    go.c("Invalid colors: " + string);
                    return false;
                }
            }
            string3 = "No name found: " + string;
        }
        go.c(string3);
        return 0 != 0;
    }

    private static v a(eU eU2) {
        switch (eU2) {
            case ANVIL: {
                return p;
            }
            case BEACON: {
                return t;
            }
            case BREWING_STAND: {
                return w;
            }
            case CHEST: {
                return v;
            }
            case CRAFTING: {
                return z;
            }
            case CREATIVE: {
                return null;
            }
            case DISPENSER: {
                return u;
            }
            case ENCHANTMENT: {
                return l;
            }
            case FURNACE: {
                return a;
            }
            case HOPPER: {
                return e;
            }
            case HORSE: {
                return m;
            }
            case INVENTORY: {
                return g;
            }
            case SHULKER_BOX: {
                return o;
            }
            case VILLAGER: {
                return d;
            }
        }
        return null;
    }

    public v a(v v2) {
        v v3 = this.s.get(v2);
        String string = K.d();
        v v4 = v3;
        if (string == null) {
            v4 = v4 == null ? v2 : v3;
        }
        return v4;
    }

    private static int e(String string) {
        int n2 = fU.b(string, -1);
        String string2 = K.d();
        int n3 = n2;
        if (string2 == null) {
            if (n3 >= 0) {
                return n2;
            }
            n3 = string.equals("farmer") ? 1 : 0;
        }
        if (string2 == null) {
            if (n3 != 0) {
                return 0;
            }
            n3 = string.equals("librarian") ? 1 : 0;
        }
        if (string2 == null) {
            if (n3 != 0) {
                return 1;
            }
            n3 = string.equals("priest") ? 1 : 0;
        }
        if (string2 == null) {
            if (n3 != 0) {
                return 2;
            }
            n3 = string.equals("blacksmith") ? 1 : 0;
        }
        if (string2 == null) {
            if (n3 != 0) {
                return 3;
            }
            n3 = string.equals("butcher") ? 1 : 0;
        }
        if (string2 == null) {
            if (n3 != 0) {
                return 4;
            }
            n3 = string.equals("nitwit") ? 1 : 0;
        }
        if (string2 == null) {
            n3 = n3 != 0 ? 5 : -1;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(x var1_1, t var2_2) {
        var3_3 = K.d();
        v0 = var1_1;
        if (var3_3 == null) {
            if (!(v0 instanceof D)) {
                return false;
            }
            v0 = var1_1;
        }
        var4_4 = (D)v0;
        v1 = this;
        if (var3_3 == null) {
            if (v1.A != null) {
                v1 = this;
                if (var3_3 == null) {
                    var5_5 = v1.a(var4_4);
                    if (!fU.b((Object)var5_5, (Object[])this.A)) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this;
            }
        }
        if (v1.n == null) return true;
        v2 = var4_4 instanceof G;
        if (var3_3 != null) return v2;
        if (v2 == false) return true;
        var5_6 = (G)var4_4;
        var6_7 = var5_6.af();
        return fU.b(var6_7, this.n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean d(n var1_1, t var2_2) {
        var4_3 = var2_2.b(var1_1);
        var3_4 = K.d();
        v0 = var4_3;
        if (var3_4 == null) {
            if (!(v0 instanceof S)) {
                return false;
            }
            v0 = var4_3;
        }
        var5_5 = (S)v0;
        v1 = this;
        if (var3_4 == null) {
            if (v1.c != null) {
                var6_6 = var5_5.g();
                v1 = this;
                if (var3_4 == null) {
                    if (!v1.c.a((String)var6_6)) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this;
            }
        }
        if (v1.n == null) return true;
        var6_6 = var5_5.l();
        return fU.b(var6_6, this.n);
    }

    private boolean b(x x2, t t2) {
        block12: {
            Integer n2;
            Integer n3;
            Integer n4;
            String string;
            block11: {
                string = K.d();
                x x3 = x2;
                if (string == null) {
                    if (!(x3 instanceof W)) {
                        return false;
                    }
                    x3 = x2;
                }
                W w2 = (W)x3;
                r r2 = new r();
                w2.b(r2);
                n4 = r2.m("Profession");
                n3 = r2.m("Career");
                n2 = n4;
                if (string != null) break block11;
                if (n2 == null) break block12;
                n2 = n3;
            }
            if (n2 != null) {
                if (this.E != null) {
                    boolean bl2;
                    block10: {
                        boolean bl3 = false;
                        int n5 = 0;
                        while (n5 < this.E.length) {
                            dZ dZ2 = this.E[n5];
                            if (string == null) {
                                bl2 = dZ2.a(n4, n3);
                                if (string != null) break block10;
                                if (bl2) {
                                    bl3 = true;
                                    if (string == null) break;
                                }
                                ++n5;
                            }
                            if (string == null) continue;
                        }
                        bl2 = bl3;
                    }
                    return bl2;
                }
                return true;
            }
        }
        return false;
    }

    private static bl[] b(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return null;
            }
            string3 = string = string.toLowerCase();
        }
        String[] arrstring = fU.c(string3, " ");
        bl[] arrbl = new bl[arrstring.length];
        int n2 = 0;
        while (n2 < arrstring.length) {
            String string4 = arrstring[n2];
            bl bl2 = go.d(string4);
            if (string2 == null) {
                if (bl2 == null) {
                    go.c("Invalid color: " + string4);
                    return y;
                }
                arrbl[n2] = bl2;
                ++n2;
            }
            if (string2 == null) continue;
        }
        return arrbl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(eU var1_1, x var2_2, t var3_3) {
        var4_4 = K.d();
        v0 = this;
        if (var4_4 == null) {
            if (!v0.b(var1_1, var2_2.f(), var3_3)) {
                return false;
            }
            v0 = this;
        }
        if (v0.c != null) {
            var5_5 = var2_2.g();
            v1 = (boolean)(this.c.a(var5_5) ? 1 : 0);
            if (var4_4 == null) {
                if (!v1) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = gC.a[var1_1.ordinal()];
        }
        if (var4_4 != null) return v1;
        switch (v1) {
            case 11: {
                return this.a(var2_2, var3_3);
            }
            case 14: {
                return this.b(var2_2, var3_3);
            }
        }
        return true;
    }

    public boolean a(eU eU2, n n2, t t2) {
        String string = K.d();
        int n3 = this.b(eU2, n2, t2);
        if (string == null) {
            if (n3 == 0) {
                return false;
            }
            n3 = gC.a[eU2.ordinal()];
        }
        if (string == null) {
            switch (n3) {
                case 2: {
                    return this.c(n2, t2);
                }
                case 3: {
                    return this.e(n2, t2);
                }
                case 4: {
                    return this.a(n2, t2);
                }
                default: {
                    return true;
                }
                case 7: {
                    return this.b(n2, t2);
                }
                case 8: {
                    return this.e(n2, t2);
                }
                case 9: {
                    return this.e(n2, t2);
                }
                case 10: {
                    return this.e(n2, t2);
                }
                case 13: 
            }
            n3 = this.d(n2, t2) ? 1 : 0;
        }
        return n3 != 0;
    }

    private boolean a(H h2, n n2, t t2) {
        return this.a(false, false, false, true, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static int a(int var0, String var1_1) {
        block45: {
            block44: {
                var3_2 = fU.b(var1_1, -1);
                var2_3 = K.d();
                v0 = var3_2;
                if (var2_3 == null) {
                    if (v0 >= 0) {
                        return var3_2;
                    }
                    v0 = var0;
                }
                if (var2_3 == null) {
                    if (v0 == 0) {
                        v0 = var1_1.equals("farmer") ? 1 : 0;
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 1;
                            }
                            v0 = var1_1.equals("fisherman") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 2;
                            }
                            v0 = var1_1.equals("shepherd") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 3;
                            }
                            v0 = var1_1.equals("fletcher") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 4;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var0;
                    }
                }
                v1 = 1;
                if (var2_3 == null) {
                    if (v0 == v1) {
                        v0 = var1_1.equals("librarian") ? 1 : 0;
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 1;
                            }
                            v0 = var1_1.equals("cartographer") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 2;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var0;
                    }
                    v1 = 2;
                }
                if (var2_3 == null) {
                    if (v0 == v1) {
                        v0 = var1_1.equals("cleric") ? 1 : 0;
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 1;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var0;
                    }
                    v1 = 3;
                }
                if (var2_3 == null) {
                    if (v0 == v1) {
                        v0 = var1_1.equals("armor") ? 1 : 0;
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 1;
                            }
                            v0 = var1_1.equals("weapon") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 2;
                            }
                            v0 = var1_1.equals("tool") ? 1 : 0;
                        }
                        if (var2_3 == null) {
                            if (v0 != 0) {
                                return 3;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var0;
                    }
                    v1 = 4;
                }
                if (var2_3 != null) break block44;
                if (v0 == v1) {
                    v0 = var1_1.equals("butcher") ? 1 : 0;
                    if (var2_3 == null) {
                        if (v0 != 0) {
                            return 1;
                        }
                        v0 = var1_1.equals("leather") ? 1 : 0;
                    }
                    if (var2_3 == null) {
                        if (v0 != 0) {
                            return 2;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = var0;
                }
                if (var2_3 != null) break block45;
                v1 = 5;
            }
            if (v0 != v1) return -1;
            v0 = var1_1.equals("nitwit") ? 1 : 0;
        }
        if (var2_3 != null) return v0;
        if (v0 == 0) return -1;
        return 1;
    }

    private boolean a(n n2, t t2) {
        y y2 = t2.b(n2);
        String string = K.d();
        boolean bl2 = y2 instanceof O;
        if (string == null) {
            if (bl2) {
                O o2 = (O)y2;
                return this.a(o2, n2, t2);
            }
            bl2 = y2 instanceof H;
        }
        if (string == null) {
            if (bl2) {
                H h2 = (H)y2;
                return this.a(h2, n2, t2);
            }
            bl2 = false;
        }
        return bl2;
    }

    public go(Properties properties, String string) {
        this.G = null;
        this.x = null;
        this.b = null;
        this.s = null;
        this.c = null;
        this.r = null;
        this.k = null;
        this.h = null;
        this.D = null;
        this.i = null;
        this.q = null;
        this.C = null;
        this.E = null;
        this.A = null;
        this.n = null;
        ha ha2 = new ha("CustomGuis");
        this.G = ha2.m(string);
        this.x = ha2.h(string);
        this.b = (eU)ha2.a(properties.getProperty("container"), eU.values(), "container");
        this.s = go.a(properties, "texture", this.b, "textures/gui/", this.x);
        this.c = go.b("name", properties.getProperty("name"));
        this.r = ha2.f(properties.getProperty("biomes"));
        this.k = ha2.c(properties.getProperty("heights"));
        this.h = ha2.d(properties.getProperty("large"));
        this.D = ha2.d(properties.getProperty("trapped"));
        this.i = ha2.d(properties.getProperty("christmas"));
        this.q = ha2.d(properties.getProperty("ender"));
        this.C = ha2.c(properties.getProperty("levels"));
        this.E = go.f(properties.getProperty("professions"));
        Enum[] arrenum = go.b(this.b);
        this.A = (i[])ha2.a(properties.getProperty("variants"), arrenum, "variants", f);
        this.n = go.b(properties.getProperty("colors"));
    }

    private static int[] b(int n2, String string) {
        IntArraySet intArraySet = new IntArraySet();
        String[] arrstring = fU.c(string, ",");
        String string2 = K.d();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            int n3;
            String string3 = arrstring[i2];
            int n4 = n3 = go.a(n2, string3);
            if (string2 != null) continue;
            if (n4 < 0) {
                return null;
            }
            n4 = intArraySet.add(n3) ? 1 : 0;
            if (string2 == null) continue;
        }
        int[] arrn = intArraySet.toIntArray();
        return arrn;
    }

    private static i[] b(eU eU2) {
        String string = K.d();
        eU eU3 = eU2;
        eU eU4 = eU.HORSE;
        if (string == null) {
            if (eU3 == eU4) {
                return j;
            }
            eU3 = eU2;
            eU4 = eU.DISPENSER;
        }
        return eU3 == eU4 ? B : new i[0];
    }

    private static dZ a(String string) {
        int n2;
        String string2;
        String string3;
        block8: {
            String[] arrstring;
            block7: {
                String[] arrstring2;
                string = string.toLowerCase();
                String string4 = K.d();
                String[] arrstring3 = arrstring2 = fU.c(string, ":");
                if (string4 == null) {
                    if (arrstring3.length > 2) {
                        return null;
                    }
                    arrstring3 = arrstring2;
                }
                string3 = arrstring3[0];
                string2 = null;
                arrstring = arrstring2;
                if (string4 != null) break block7;
                if (arrstring.length <= 1) break block8;
                arrstring = arrstring2;
            }
            string2 = arrstring[1];
        }
        if ((n2 = go.e(string3)) < 0) {
            return null;
        }
        int[] arrn = null;
        if (string2 != null && (arrn = go.b(n2, string2)) == null) {
            return null;
        }
        return new dZ(n2, arrn);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(O var1_1, n var2_2, t var3_3) {
        block4: {
            block3: {
                block2: {
                    var4_4 = K.d();
                    v0 = var1_1.u;
                    if (var4_4 != null) break block2;
                    if (v0 != null) ** GOTO lbl-1000
                    v0 = var1_1.s;
                }
                if (var4_4 != null) break block3;
                if (v0 != null) ** GOTO lbl-1000
                v0 = var1_1.p;
            }
            if (var4_4 != null) break block4;
            if (v0 != null) ** GOTO lbl-1000
            v0 = var1_1.v;
        }
        if (v0 != null) lbl-1000:
        // 4 sources

        {
            v1 = true;
        } else {
            v1 = false;
        }
        var5_5 = v1;
        var6_6 = var1_1.a() == cd.TRAP;
        var7_7 = eO.a;
        var8_8 = false;
        var9_9 = var1_1.g();
        return this.a(var5_5, var6_6, var7_7, var8_8, var9_9);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean b(n var1_1, t var2_2) {
        var4_3 = var2_2.b(var1_1);
        var3_4 = K.d();
        v0 = var4_3;
        if (var3_4 == null) {
            if (!(v0 instanceof P)) {
                return false;
            }
            v0 = var4_3;
        }
        var5_5 = (P)v0;
        v1 = this;
        if (var3_4 == null) {
            if (v1.c != null) {
                var6_6 = var5_5.g();
                v1 = this;
                if (var3_4 == null) {
                    if (!v1.c.a(var6_6)) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this;
            }
        }
        if (var3_4 == null) {
            if (v1.A == null) return true;
            v1 = this;
        }
        var6_7 = v1.a(var5_5);
        return fU.b((Object)var6_7, (Object[])this.A);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static dr b(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 == null) {
            if (string4 == null) return null;
            string4 = string2;
        }
        if (string4 == null) return null;
        dr dr2 = new dr(string, string2);
        return dr2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static dZ[] f(String string) {
        ArrayList<dZ> arrayList;
        ArrayList<dZ> arrayList2;
        block6: {
            String string2 = K.d();
            if (string == null) {
                return null;
            }
            arrayList2 = new ArrayList<dZ>();
            String[] arrstring = fU.c(string, " ");
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string3 = arrstring[n2];
                dZ dZ2 = go.a(string3);
                if (string2 == null) {
                    if (string2 == null) {
                        if (dZ2 == null) {
                            go.c("Invalid profession: " + string3);
                            return F;
                        }
                        arrayList2.add(dZ2);
                        ++n2;
                    }
                    if (string2 == null) continue;
                }
                break block6;
            }
            arrayList = arrayList2;
            if (string2 != null) return arrayList.toArray(new dZ[arrayList2.size()]);
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        arrayList = arrayList2;
        return arrayList.toArray(new dZ[arrayList2.size()]);
    }

    public String toString() {
        return "name: " + this.G + ", container: " + (Object)((Object)this.b) + ", textures: " + this.s;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean c(n var1_1, t var2_2) {
        var4_3 = var2_2.b(var1_1);
        var3_4 = K.d();
        v0 = var4_3;
        if (var3_4 == null) {
            if (!(v0 instanceof K)) {
                return false;
            }
            v0 = var4_3;
        }
        var5_5 = (K)v0;
        v1 = this;
        if (var3_4 == null) {
            if (v1.C != null) {
                var6_6 = var5_5.b();
                v1 = this;
                if (var3_4 == null) {
                    if (!v1.C.b(var6_6)) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this;
            }
        }
        if (v1.c == null) return true;
        var6_7 = var5_5.g();
        return this.c.a(var6_7);
    }

    private static Map<v, v> a(Properties properties, String string, eU eU2, String string2, String string3) {
        Object object;
        String string4;
        String string5;
        HashMap<v, v> hashMap;
        block9: {
            block10: {
                hashMap = new HashMap<v, v>();
                String string6 = properties.getProperty(string);
                string5 = K.d();
                string4 = string6;
                if (string5 != null) break block9;
                if (string4 == null) break block10;
                object = go.a(eU2);
                string4 = string6;
                if (string5 != null) break block9;
                v v2 = go.a(string4, string3);
                if (object != null) {
                    v v3 = v2;
                    if (string5 == null && v3 != null) {
                        v3 = hashMap.put((v)object, v2);
                    }
                }
            }
            string4 = string + ".";
        }
        object = string4;
        for (Object object2 : properties.keySet()) {
            block12: {
                Object object3;
                String string7;
                block11: {
                    string7 = (String)object2;
                    object3 = object;
                    if (string5 != null) break block11;
                    if (!string7.startsWith((String)object3)) break block12;
                    string7 = (String)object2;
                    object3 = object;
                }
                String string8 = string7.substring(((String)object3).length());
                string8 = string8.replace('\\', '/');
                string8 = dQ.b(string8, "/", ".png");
                String string9 = string2 + string8 + ".png";
                String string10 = properties.getProperty((String)object2);
                v v4 = new v(string9);
                v v5 = go.a(string10, string3);
                hashMap.put(v4, v5);
            }
            if (string5 == null) continue;
        }
        return hashMap;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private i a(P p2) {
        return p2 instanceof Q ? i.DROPPER : i.DISPENSER;
    }

    private static void c(String string) {
        fU.h("[CustomGuis] " + string);
    }

    private static v a(String string, String string2) {
        String string3;
        block6: {
            String string4;
            block5: {
                String string5 = K.d();
                String string6 = string;
                if (string5 == null) {
                    if (string6 == null) {
                        return null;
                    }
                    string = string.trim();
                    string6 = fp.a(string, string2);
                }
                string4 = string3 = string6;
                if (string5 != null) break block5;
                if (string4.endsWith(".png")) break block6;
                string4 = string3 + ".png";
            }
            string3 = string4;
        }
        return new v(string2 + "/" + string3);
    }

    private i a(D d10) {
        String string = K.d();
        boolean bl2 = d10 instanceof I;
        if (string == null) {
            if (bl2) {
                return i.HORSE;
            }
            bl2 = d10 instanceof F;
        }
        if (string == null) {
            if (bl2) {
                return i.DONKEY;
            }
            bl2 = d10 instanceof net.minecraft.ag.H;
        }
        if (string == null) {
            if (bl2) {
                return i.MULE;
            }
            bl2 = d10 instanceof G;
        }
        return bl2 ? i.LLAMA : null;
    }

    private static bl d(String string) {
        String string2 = K.d();
        if (string == null) {
            return null;
        }
        bl[] arrbl = bl.values();
        for (int i2 = 0; i2 < arrbl.length; ++i2) {
            bl bl2;
            block7: {
                boolean bl3;
                bl bl4;
                block6: {
                    bl4 = arrbl[i2];
                    bl3 = bl4.a().equals(string);
                    if (string2 != null) break block6;
                    if (bl3) {
                        return bl4;
                    }
                    bl2 = bl4;
                    if (string2 != null) break block7;
                    bl3 = bl2.d().equals(string);
                }
                if (!bl3) continue;
                bl2 = bl4;
            }
            return bl2;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4, String var5_5) {
        block22: {
            block20: {
                block21: {
                    var6_6 = K.d();
                    v0 = this.h;
                    if (var6_6 == null) {
                        if (v0 != null) {
                            v0 = this.h;
                            if (var6_6 == null) {
                                if (v0 != var1_1) {
                                    return false;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = this.D;
                        }
                    }
                    if (var6_6 == null) {
                        if (v0 != null) {
                            v0 = this.D;
                            if (var6_6 == null) {
                                if (v0 != var2_2) {
                                    return false;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = this.i;
                        }
                    }
                    if (var6_6 != null) break block20;
                    if (v0 == null) break block21;
                    v0 = this.i;
                    if (var6_6 == null) {
                        if (v0 != var3_3) {
                            return false;
                        } else {
                            ** GOTO lbl26
                        }
                    }
                    break block20;
                }
                v1 = this;
                if (var6_6 != null) break block22;
                v0 = v1.q;
            }
            if (v0 != null) {
                v1 = this;
                if (var6_6 == null) {
                    if (v1.q != var4_4) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this;
            }
        }
        v2 = v1.c;
        if (var6_6 == null) {
            if (v2 == null) return true;
            v2 = this.c;
        }
        v3 = v2.a(var5_5);
        if (var6_6 != null) return v3;
        if (v3 != false) return true;
        return false;
    }

    public eU a() {
        return this.b;
    }

    private boolean e(n n2, t t2) {
        y y2 = t2.b(n2);
        String string = K.d();
        y y3 = y2;
        if (string == null) {
            if (!(y3 instanceof f)) {
                return false;
            }
            y3 = y2;
        }
        f f10 = (f)((Object)y3);
        if (this.c != null) {
            String string2 = f10.g();
            return this.c.a(string2);
        }
        return true;
    }
}

