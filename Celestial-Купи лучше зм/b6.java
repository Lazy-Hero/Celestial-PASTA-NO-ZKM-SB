/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.client.o.e;
import net.minecraft.i.j;

public class b6
extends bE {
    private /* synthetic */ boolean p;
    /* synthetic */ ArrayList<x> n;
    /* synthetic */ ArrayList<x> k;
    /* synthetic */ HashMap<x, Double> l;
    /* synthetic */ HashMap<x, Double> m;
    public static /* synthetic */ List<x> o;

    static {
        o = new ArrayList<x>();
    }

    @Override
    public void m() {
        o.clear();
        super.m();
    }

    public b6() {
        super("AntiBot", a5.Combat);
        this.k = new ArrayList();
        this.n = new ArrayList();
        this.l = new HashMap();
        this.m = new HashMap();
    }

    @cL
    public void a(fb fb2) {
        int[] arrn;
        block9: {
            b6 b62;
            block10: {
                b6 b63;
                block11: {
                    block12: {
                        int[] arrn2 = net.minecraft.ac.c.i();
                        this.b("Sunrise");
                        arrn = arrn2;
                        b63 = this;
                        if (arrn == null) break block11;
                        if (b63.p) break block12;
                        for (x x2 : b6.c.e.O) {
                            if (arrn != null) {
                                boolean bl2 = x2 instanceof j;
                                if (arrn != null) {
                                    if (!bl2) continue;
                                    bl2 = this.n.contains(x2);
                                }
                                if (arrn != null) {
                                    if (bl2 && arrn != null) continue;
                                    bl2 = this.k.add(x2);
                                }
                                this.l.put(x2, x2.a);
                                this.m.put(x2, x2.ax);
                                if (arrn != null) continue;
                            }
                            break block9;
                        }
                        if (arrn != null) break block9;
                    }
                    b63 = this;
                }
                for (x x2 : b63.k) {
                    double d10 = x2.a - this.l.get(x2);
                    double d11 = x2.ax - this.m.get(x2);
                    double d12 = Math.sqrt(d10 * d10 + d11 * d11) * 10.0;
                    b62 = this;
                    if (arrn != null) {
                        if (b62.a(x2, d12) && x2 != b6.c.s) {
                            o.add(x2);
                        }
                        if (arrn != null) continue;
                    }
                    break block10;
                }
                this.k.clear();
                this.l.clear();
                b62 = this;
            }
            b62.m.clear();
        }
        boolean bl3 = this.p;
        if (arrn != null) {
            bl3 = !bl3;
        }
        this.p = bl3;
    }

    @cL
    public void b(fb fb2) {
        int[] arrn = net.minecraft.ac.c.i();
        List<x> list = this.n;
        if (arrn != null) {
            if (list.size() > 10000) {
                this.n.clear();
            }
            list = b6.c.e.O;
        }
        for (x x2 : list) {
            block8: {
                int n2;
                block9: {
                    block10: {
                        block7: {
                            n2 = x2 instanceof j;
                            if (arrn == null) break block7;
                            if (n2 == 0) break block8;
                            float f10 = b6.c.s.o(x2) - 16.0f;
                            n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                        }
                        if (arrn == null) break block9;
                        if (n2 > 0) break block10;
                        n2 = this.a(x2.aF, b6.c.s.aF - 3.0, b6.c.s.aF + 3.0) ? 1 : 0;
                        if (arrn == null) break block9;
                        if (n2 != 0) break block8;
                    }
                    n2 = this.n.contains(x2) ? 1 : 0;
                }
                if (arrn != null && n2 == 0) {
                    n2 = this.n.add(x2) ? 1 : 0;
                }
            }
            if (arrn != null) continue;
        }
    }

    private boolean a(x x2) {
        int[] arrn = net.minecraft.ac.c.i();
        long l2 = b6.c.s.c9.c().stream().filter(arg_0 -> b6.lambda$isDuplicated$0(x2, arg_0)).count() - 1L;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (arrn != null) {
            l3 = l3 > 0 ? (long)1 : (long)0;
        }
        return (boolean)l3;
    }

    private static boolean lambda$isDuplicated$0(x x2, e e10) {
        return x2.d().f().equals(a0.a(dM.a(e10)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(x x2, double d10) {
        boolean bl2;
        x x3;
        b6 b62;
        block7: {
            block5: {
                int[] arrn;
                boolean bl3;
                block8: {
                    double d11;
                    block6: {
                        block4: {
                            bl3 = true;
                            arrn = net.minecraft.ac.c.i();
                            double d12 = d10 - 12.5;
                            d11 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            if (arrn == null) break block4;
                            if (d11 <= 0) break block5;
                            float f10 = b6.c.s.o(x2) - 5.0f;
                            d11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                        }
                        if (arrn == null) break block6;
                        if (d11 > 0) break block5;
                        b62 = this;
                        x3 = x2;
                        if (arrn == null) break block7;
                        d11 = (double)b62.a(x3.aF, b6.c.s.aF - 2.0, b6.c.s.aF + 2.0);
                    }
                    if (d11 == false) break block5;
                    bl2 = dM.a(x2);
                    if (arrn == null) break block8;
                    if (!bl2) break block5;
                    bl2 = b6.c.s().h.toLowerCase().contains("wellmore");
                }
                if (arrn == null) return bl2;
                if (bl2) {
                    bl2 = bl3;
                    return bl2;
                }
            }
            b62 = this;
            x3 = x2;
        }
        bl2 = b62.a(x3);
        return bl2;
    }

    @Override
    public void d() {
        this.p = false;
        super.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(double d10, double d11, double d12) {
        double d13;
        block5: {
            int[] arrn;
            block4: {
                arrn = net.minecraft.ac.c.i();
                d13 = d10 == d12 ? 0 : (d10 < d12 ? -1 : 1);
                if (arrn == null) break block4;
                if (d13 > 0) break block5;
                d13 = d10 == d11 ? 0 : (d10 > d11 ? 1 : -1);
            }
            if (arrn == null) return (boolean)d13;
            if (d13 >= 0) {
                d13 = 1.0;
                return (boolean)d13;
            }
        }
        d13 = 0.0;
        return (boolean)d13;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

