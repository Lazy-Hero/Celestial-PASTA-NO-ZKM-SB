/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.Q.k;
import net.minecraft.Q.p;
import net.minecraft.k.m;
import net.minecraft.u.c;

public class bD
extends bE {
    private /* synthetic */ boolean l;
    private final /* synthetic */ hH k;

    public bD() {
        block0: {
            super("Velocity", a5.Combat);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Packet");
            arrayList.add("CustomMotion");
            int[] arrn = net.minecraft.ac.c.i();
            arrayList.add("Matrix");
            cj.b.f.b(new hH("Velocity mode", (bE)this, "Packet", arrayList));
            int[] arrn2 = arrn;
            cj.b.f.b(new hH("Vertical Percentage", this, 0.0, 0.0, 100.0, 1.0));
            cj.b.f.b(new hH("Horizontal Percentage", this, 0.0, 0.0, 100.0, 1.0));
            this.k = new hH("Cancel Other Damage", this, true);
            cj.b.f.b(this.k);
            if (m.d()) break block0;
            net.minecraft.ac.c.b(new int[2]);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fz var1_1) {
        block42: {
            block43: {
                block37: {
                    block38: {
                        block41: {
                            block39: {
                                block40: {
                                    block32: {
                                        block33: {
                                            block35: {
                                                block36: {
                                                    block34: {
                                                        var3_2 = cj.b.f.a("Velocity Mode").m();
                                                        var2_3 = net.minecraft.ac.c.i();
                                                        v0 = this.k.l();
                                                        if (var2_3 == null) break block32;
                                                        if (v0 == 0) break block33;
                                                        v0 = bD.c.s.bc;
                                                        if (var2_3 == null) break block32;
                                                        if (v0 <= 0) break block33;
                                                        v0 = var1_1.a() instanceof k;
                                                        if (var2_3 == null) break block32;
                                                        if (v0 == 0) break block33;
                                                        v0 = bD.c.s.c(net.minecraft.u.c.g) ? 1 : 0;
                                                        if (var2_3 == null) break block34;
                                                        if (v0 != 0) break block35;
                                                        v0 = bD.c.s.c(net.minecraft.u.c.z) ? 1 : 0;
                                                    }
                                                    if (var2_3 == null) break block36;
                                                    if (v0 != 0) break block35;
                                                    v0 = bD.c.s.p() ? 1 : 0;
                                                }
                                                if (var2_3 == null) break block32;
                                                if (v0 == 0) break block33;
                                            }
                                            var1_1.a(true);
                                        }
                                        v0 = var3_2.equalsIgnoreCase("CustomMotion");
                                    }
                                    if (var2_3 != null) {
                                        if (v0 == 0) {
                                            this.b(var3_2);
                                        }
                                        v0 = var3_2.equalsIgnoreCase("Packet") ? 1 : 0;
                                    }
                                    if (var2_3 == null) break block37;
                                    if (v0 == 0) break block38;
                                    v1 = var1_1.a() instanceof k;
                                    if (var2_3 == null) break block39;
                                    if (v1 != 0) break block40;
                                    v1 = var1_1.a() instanceof p;
                                    if (var2_3 == null) break block39;
                                    if (v1 == 0) return;
                                }
                                v2 = var1_1;
                                if (var2_3 == null) break block41;
                                v1 = ((k)v2.a()).b();
                            }
                            if (v1 != bD.c.s.W()) return;
                            v2 = var1_1;
                        }
                        v2.a(true);
                        if (var2_3 != null) return;
                    }
                    v0 = var3_2.equalsIgnoreCase("CustomMotion") ? 1 : 0;
                }
                if (v0 == 0) return;
                var4_4 = cj.b.f.a("Horizontal Percentage").f();
                var6_5 = cj.b.f.a("Vertical Percentage").f();
                v3 = var3_2.equalsIgnoreCase("CustomMotion");
                if (var2_3 != null) {
                    if (v3 == 0) return;
                    this.b("H: " + var4_4 + "% V: " + var6_5 + "%");
                    v3 = ((k)var1_1.a()).b();
                }
                if (var2_3 != null) {
                    if (v3 != bD.c.s.W()) return;
                    v3 = var1_1.a() instanceof k;
                }
                if (var2_3 == null) break block42;
                if (v3 == 0) break block43;
                var8_6 = Objects.requireNonNull(bD.c.ar()).h.a(((k)var1_1.a()).b());
                v3 = var8_6 instanceof net.minecraft.client.q.c;
                if (var2_3 == null) break block42;
                if (v3 == 0) break block43;
                cfr_temp_0 = var4_4 - 0.0;
                v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                if (var2_3 != null) {
                    if (v3 == 0) {
                        cfr_temp_1 = var6_5 - 0.0;
                        v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                        if (var2_3 != null) {
                            if (v3 == 0) {
                                var1_1.a(true);
                                return;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v3 = (cfr_temp_2 = var4_4 - 100.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    }
                }
                if (var2_3 != null) {
                    if (v3 != 0) {
                        ((k)var1_1.a()).d = (int)((double)(((k)var1_1.a()).d / 100) * var4_4);
                        ((k)var1_1.a()).c = (int)((double)(((k)var1_1.a()).c / 100) * var4_4);
                    }
                    v3 = (cfr_temp_3 = var6_5 - 100.0) == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                }
                if (var2_3 == null) break block42;
                if (v3 != 0) {
                    ((k)var1_1.a()).a = (int)((double)(((k)var1_1.a()).a / 100) * var6_5);
                }
            }
            v3 = var1_1.a() instanceof p;
        }
        if (var2_3 != null) {
            if (v3 == 0) return;
            cfr_temp_4 = var4_4 - 0.0;
            v3 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
        }
        if (var2_3 != null) {
            if (v3 == 0) {
                cfr_temp_5 = var6_5 - 0.0;
                v3 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                if (var2_3 != null) {
                    if (v3 == 0) {
                        var1_1.a(true);
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v3 = (cfr_temp_6 = var4_4 - 100.0) == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
            }
        }
        if (var2_3 != null) {
            if (v3 != 0) {
                ((p)var1_1.a()).e = (int)((double)(((p)var1_1.a()).e / 100.0f) * var4_4);
                ((p)var1_1.a()).c = (int)((double)(((p)var1_1.a()).c / 100.0f) * var4_4);
            }
            v3 = (cfr_temp_7 = var6_5 - 100.0) == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
        }
        if (v3 == 0) return;
        ((p)var1_1.a()).a = (int)((double)(((p)var1_1.a()).a / 100.0f) * var6_5);
    }
}

