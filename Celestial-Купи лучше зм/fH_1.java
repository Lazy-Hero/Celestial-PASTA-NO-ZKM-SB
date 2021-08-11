/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.A.h;
import net.minecraft.U.C;
import net.minecraft.ar.v;

public class fH {
    public /* synthetic */ int[] d;
    private /* synthetic */ cZ c;
    private /* synthetic */ h[] h;
    private /* synthetic */ int[] g;
    public /* synthetic */ int b;
    private /* synthetic */ int[] a;
    private /* synthetic */ v f;
    private /* synthetic */ v[] e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public v a(v v2, int n2) {
        fH fH2;
        int n3;
        block7: {
            String string;
            block6: {
                block5: {
                    n3 = 0;
                    string = K.d();
                    if (string != null) break block5;
                    if (this.a != null) break block6;
                    n3 = n2 % this.e.length;
                }
                if (string == null) break block7;
            }
            int n4 = n2 % this.b;
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                fH2 = this;
                if (string != null) return fH2.e[n3];
                int n5 = fH2.d[i2];
                if (string == null) {
                    if (n5 <= n4) continue;
                    n5 = n3 = i2;
                }
                if (string == null) break;
                if (string == null) continue;
            }
        }
        fH2 = this;
        return fH2.e[n3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(C c10) {
        String string = K.d();
        boolean bl2 = gc.a(c10.cl, this.h);
        if (string != null) return bl2;
        if (!bl2) {
            return false;
        }
        if (this.c == null) return true;
        if (c10.cd == null) return true;
        boolean bl3 = this.c.b(c10.cd.b());
        if (string != null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public boolean a(String string) {
        int n2;
        block47: {
            block44: {
                int n3;
                String string2;
                block36: {
                    int n4;
                    int n5;
                    block46: {
                        block35: {
                            int n6;
                            block45: {
                                block34: {
                                    int[] arrn;
                                    block43: {
                                        v v2;
                                        block38: {
                                            block37: {
                                                this.e = new v[this.g.length];
                                                string2 = K.d();
                                                v2 = ab.f(this.f);
                                                if (string2 != null) break block37;
                                                if (v2 != null) break block38;
                                                fU.h("Invalid path: " + this.f.a());
                                            }
                                            return false;
                                        }
                                        for (int i2 = 0; i2 < this.e.length; ++i2) {
                                            v v3;
                                            block42: {
                                                boolean bl2;
                                                block41: {
                                                    block40: {
                                                        block39: {
                                                            n5 = this.g[i2];
                                                            if (string2 != null) break block39;
                                                            n4 = n5;
                                                            n6 = 1;
                                                            if (string2 != null) break block34;
                                                            if (n4 > n6) break block40;
                                                            this.e[i2] = this.f;
                                                        }
                                                        if (string2 == null) continue;
                                                    }
                                                    v v4 = v3 = ab.a(v2, n5);
                                                    if (string2 == null) {
                                                        if (v4 == null) {
                                                            fU.h("Invalid path: " + this.f.a());
                                                            return false;
                                                        }
                                                        v4 = v3;
                                                    }
                                                    bl2 = fU.b(v4);
                                                    if (string2 != null) break block41;
                                                    if (bl2) break block42;
                                                    fU.h("Texture not found: " + v3.a());
                                                    bl2 = false;
                                                }
                                                return bl2;
                                            }
                                            this.e[i2] = v3;
                                            if (string2 == null) continue;
                                        }
                                        arrn = this.a;
                                        if (string2 != null) break block43;
                                        if (arrn == null) break block44;
                                        arrn = this.a;
                                    }
                                    n4 = arrn.length;
                                    n6 = this.e.length;
                                }
                                if (string2 != null) break block45;
                                if (n4 > n6) {
                                    fU.h("More weights defined than skins, trimming weights: " + string);
                                    int[] arrn = new int[this.e.length];
                                    System.arraycopy(this.a, 0, arrn, 0, arrn.length);
                                    this.a = arrn;
                                }
                                n4 = this.a.length;
                                if (string2 != null) break block46;
                                n6 = this.e.length;
                            }
                            if (n4 < n6) {
                                fU.h("Less weights defined than skins, expanding weights: " + string);
                                int[] arrn = new int[this.e.length];
                                System.arraycopy(this.a, 0, arrn, 0, this.a.length);
                                n5 = c5.b(this.a);
                                for (int i3 = this.a.length; i3 < arrn.length; ++i3) {
                                    arrn[i3] = n5;
                                    if (string2 == null) {
                                        if (string2 == null) continue;
                                    }
                                    break block35;
                                }
                                this.a = arrn;
                            }
                            this.d = new int[this.a.length];
                        }
                        n4 = 0;
                    }
                    n3 = n4;
                    for (n5 = 0; n5 < this.a.length; ++n5) {
                        n2 = this.a[n5];
                        if (string2 == null) {
                            int n7;
                            if (string2 == null) {
                                if (n2 < 0) {
                                    fU.h("Invalid weight: " + this.a[n5]);
                                    return false;
                                }
                                n7 = n3 + this.a[n5];
                            }
                            this.d[n5] = n3 = n7;
                            if (string2 == null) continue;
                        }
                        break block36;
                    }
                    n2 = this.b = n3;
                }
                if (string2 != null) break block47;
                if (n2 <= 0) {
                    fU.h("Invalid sum of all weights: " + n3);
                    this.b = 1;
                }
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public fH(v v2, int[] arrn, int[] arrn2, h[] arrh, cZ cZ2) {
        this.f = null;
        this.g = null;
        this.e = null;
        this.a = null;
        this.h = null;
        this.c = null;
        this.d = null;
        this.b = 1;
        this.f = v2;
        this.g = arrn;
        this.a = arrn2;
        this.h = arrh;
        this.c = cZ2;
    }
}

