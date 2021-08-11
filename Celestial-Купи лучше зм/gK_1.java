/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.A.h;
import net.minecraft.U.C;
import net.minecraft.ar.v;

public class gK {
    public /* synthetic */ fH[] b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public /* synthetic */ v[] a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(String var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = K.d();
                        v0 = this;
                        if (var2_2 != null) break block12;
                        if (v0.a != null) break block13;
                        v1 = this.b;
                        if (var2_2 == null) {
                            if (v1 == null) {
                                fU.h("No skins specified: " + var1_1);
                                return false;
                            } else {
                                ** GOTO lbl11
                            }
                        }
                        break block14;
                    }
                    v0 = this;
                }
                if (var2_2 != null) break block15;
                v1 = v0.b;
            }
            if (v1 != null) {
                var3_3 = 0;
                while (var3_3 < this.b.length) {
                    var4_4 = this.b[var3_3];
                    if (var2_2 == null) {
                        v2 = var4_4.a(var1_1);
                        if (var2_2 != null) return v2;
                        if (!v2) {
                            return false;
                        }
                        ++var3_3;
                    }
                    if (var2_2 == null) continue;
                }
            }
            v0 = this;
        }
        if (v0.a == null) return true;
        var3_3 = 0;
        do {
            if (var3_3 >= this.a.length) return true;
            var4_4 = this.a[var3_3];
            if (var2_2 != null) continue;
            v2 = fU.b((v)var4_4);
            if (var2_2 != null) return v2;
            if (!v2) {
                fU.h("Texture not found: " + var4_4.a());
                return false;
            }
            ++var3_3;
        } while (var2_2 == null);
        return true;
    }

    public gK(String string, v[] arrv) {
        this.d = null;
        this.c = null;
        this.a = null;
        this.b = null;
        ha ha2 = new ha("RandomMobs");
        this.d = ha2.m(string);
        this.c = ha2.h(string);
        this.a = arrv;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private cZ a(Properties var1_1, int var2_2) {
        block15: {
            block14: {
                var4_3 = var1_1.getProperty("minHeight." + var2_2);
                var3_4 = K.d();
                var5_5 = var1_1.getProperty("maxHeight." + var2_2);
                v0 = var4_3;
                if (var3_4 != null) break block14;
                if (v0 != null) break block15;
                v0 = var5_5;
            }
            if (v0 == null) {
                return null;
            }
        }
        var6_6 = 0;
        v1 = var4_3;
        if (var3_4 != null) ** GOTO lbl17
        if (v1 != null) {
            v1 = var4_3;
lbl17:
            // 2 sources

            v2 = var6_6 = fU.b(v1, -1);
            if (var3_4 == null) {
                if (v2 < 0) {
                    fU.h("Invalid minHeight: " + var4_3);
                    return null;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = 256;
        }
        var7_7 = v2;
        v3 = var5_5;
        if (var3_4 != null) ** GOTO lbl29
        if (v3 != null) {
            v3 = var5_5;
lbl29:
            // 2 sources

            v4 = var7_7 = fU.b(v3, -1);
            if (var3_4 == null) {
                if (v4 < 0) {
                    fU.h("Invalid maxHeight: " + var5_5);
                    return null;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v4 = var7_7;
        }
        if (v4 < 0) {
            fU.h("Invalid minHeight, maxHeight: " + var4_3 + ", " + var5_5);
            return null;
        }
        var8_8 = new cZ();
        var8_8.a(new e3(var6_6, var7_7));
        return var8_8;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private fH[] a(Properties properties, v v2, ha ha2) {
        ArrayList<fH> arrayList = new ArrayList<fH>();
        int n2 = properties.size();
        int n3 = 0;
        String string = K.d();
        while (n3 < n2) {
            block3: {
                block4: {
                    cZ cZ2;
                    h[] arrh;
                    int[] arrn;
                    int[] arrn2;
                    block6: {
                        cZ cZ3;
                        block5: {
                            int n4 = n3 + 1;
                            String string2 = properties.getProperty("skins." + n4);
                            if (string != null) break block3;
                            if (string2 == null) break block4;
                            arrn2 = ha2.k(string2);
                            arrn = ha2.k(properties.getProperty("weights." + n4));
                            arrh = ha2.f(properties.getProperty("biomes." + n4));
                            cZ3 = cZ2 = ha2.c(properties.getProperty("heights." + n4));
                            if (string != null) break block5;
                            if (cZ3 != null) break block6;
                            cZ3 = this.a(properties, n4);
                        }
                        cZ2 = cZ3;
                    }
                    fH fH2 = new fH(v2, arrn2, arrn, arrh, cZ2);
                    arrayList.add(fH2);
                }
                ++n3;
            }
            if (string == null) continue;
        }
        fH[] arrfH = arrayList.toArray(new fH[arrayList.size()]);
        return arrfH;
    }

    public v a(v v2, C c10) {
        block11: {
            int n2;
            block10: {
                int n3;
                String string = K.d();
                gK gK2 = this;
                if (string == null) {
                    if (gK2.b != null) {
                        n3 = 0;
                        while (n3 < this.b.length) {
                            fH fH2 = this.b[n3];
                            if (string == null) {
                                n2 = fH2.a(c10) ? 1 : 0;
                                if (string != null) break block10;
                                if (n2 != 0) {
                                    return fH2.a(v2, c10.b0);
                                }
                                ++n3;
                            }
                            if (string == null) continue;
                        }
                    }
                    gK2 = this;
                }
                if (gK2.a == null) break block11;
                n3 = c10.b0;
                n2 = n3 % this.a.length;
            }
            int n4 = n2;
            return this.a[n4];
        }
        return v2;
    }

    public gK(Properties properties, String string, v v2) {
        this.d = null;
        this.c = null;
        this.a = null;
        this.b = null;
        ha ha2 = new ha("RandomMobs");
        this.d = ha2.m(string);
        this.c = ha2.h(string);
        this.b = this.a(properties, v2, ha2);
    }
}

