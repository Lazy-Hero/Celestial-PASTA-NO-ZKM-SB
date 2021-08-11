/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.client.b.l;
import net.minecraft.d.F;
import net.minecraft.d.G;
import net.minecraft.d.I;
import net.minecraft.d.g;
import net.minecraft.d.r;
import net.minecraft.d.v;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.aR;
import net.minecraft.w.a_;
import net.minecraft.w.am;
import net.minecraft.w.d;

public class bn
extends bE {
    public static /* synthetic */ hH s;
    public static /* synthetic */ hH n;
    private final /* synthetic */ ef B;
    public static /* synthetic */ hH r;
    public static /* synthetic */ hH t;
    private /* synthetic */ double o;
    public static /* synthetic */ ef u;
    public static /* synthetic */ B l;
    /* synthetic */ List<B> z;
    private final /* synthetic */ ef y;
    public static /* synthetic */ hH w;
    public static /* synthetic */ boolean p;
    public static /* synthetic */ hH m;
    private final /* synthetic */ ef A;
    public static /* synthetic */ hH v;
    public static /* synthetic */ hH x;
    private /* synthetic */ int k;
    public static /* synthetic */ hH q;

    @cL
    public void a(fn fn2) {
        block1: {
            B b10;
            block2: {
                int[] arrn = net.minecraft.ac.c.i();
                if (!cj.b.f.a("TargetHud").l()) break block1;
                b10 = l;
                if (arrn == null) break block2;
                if (b10 == null) break block1;
                b10 = l;
            }
            if (b10.V() > 0.0f) {
                this.a(fn2.a());
            }
        }
    }

    @cL
    public void b(fb fb2) {
        block8: {
            block27: {
                int n2;
                block28: {
                    int[] arrn;
                    block26: {
                        block25: {
                            int n3;
                            block24: {
                                block23: {
                                    block11: {
                                        block12: {
                                            block22: {
                                                net.minecraft.client.q.c c10;
                                                block21: {
                                                    int n4;
                                                    block17: {
                                                        block18: {
                                                            block20: {
                                                                net.minecraft.client.q.c c11;
                                                                block19: {
                                                                    block16: {
                                                                        block15: {
                                                                            float f10;
                                                                            float f11;
                                                                            block14: {
                                                                                block13: {
                                                                                    block9: {
                                                                                        block10: {
                                                                                            block7: {
                                                                                                String string = cj.b.f.a("Rotation Mode").m();
                                                                                                arrn = net.minecraft.ac.c.i();
                                                                                                f11 = string.equalsIgnoreCase("Packet") ? dC.b : bn.c.s.e;
                                                                                                float f12 = f10 = string.equalsIgnoreCase("Packet") ? dC.e : bn.c.s.at;
                                                                                                if (l == null) {
                                                                                                    return;
                                                                                                }
                                                                                                n2 = aK.e();
                                                                                                if (arrn != null) {
                                                                                                    if (n2 == 0) {
                                                                                                        return;
                                                                                                    }
                                                                                                    n2 = cj.b.f.a("Shield Breaker").l();
                                                                                                }
                                                                                                if (arrn == null) break block7;
                                                                                                if (n2 == 0) break block8;
                                                                                                n2 = l.b().w() instanceof aR;
                                                                                            }
                                                                                            if (arrn == null) break block9;
                                                                                            if (n2 != 0) break block10;
                                                                                            n2 = l.av().w() instanceof aR;
                                                                                            if (arrn == null) break block9;
                                                                                            if (n2 == 0) break block8;
                                                                                        }
                                                                                        n2 = l.ab();
                                                                                    }
                                                                                    if (arrn == null) break block11;
                                                                                    if (n2 == 0) break block12;
                                                                                    n2 = l.aq();
                                                                                    if (arrn == null) break block11;
                                                                                    if (n2 == 0) break block12;
                                                                                    n2 = l.am() ? 1 : 0;
                                                                                    if (arrn == null) break block11;
                                                                                    if (n2 == 0) break block12;
                                                                                    n4 = d5.a(l);
                                                                                    if (arrn == null) break block13;
                                                                                    if (n4 == 0) break block8;
                                                                                    n4 = l.c((x)bn.c.s);
                                                                                }
                                                                                if (arrn == null) break block14;
                                                                                if (n4 == 0) break block8;
                                                                                n4 = bn.c.s.c((x)l);
                                                                            }
                                                                            if (arrn == null) break block15;
                                                                            if (n4 == 0) break block8;
                                                                            n4 = d5.a(f11, f10, 0.2f, 0.2f, 0.2f, l, m.r()) ? 1 : 0;
                                                                        }
                                                                        if (arrn == null) break block16;
                                                                        if (n4 == 0) break block8;
                                                                        n4 = this.A.a(30.0) ? 1 : 0;
                                                                    }
                                                                    if (arrn == null) break block17;
                                                                    if (n4 == 0) break block18;
                                                                    c11 = bn.c.s;
                                                                    if (arrn == null) break block19;
                                                                    if (c11.cB.a == this.a()) break block20;
                                                                    bn.c.s.cB.a = this.a();
                                                                    bn.c.s.c9.a(new I(bn.c.s.cB.a));
                                                                    c11 = bn.c.s;
                                                                }
                                                                c11.u();
                                                            }
                                                            this.A.d();
                                                        }
                                                        c10 = bn.c.s;
                                                        if (arrn == null) break block21;
                                                        n4 = c10.cB.a;
                                                    }
                                                    if (n4 != this.a()) break block22;
                                                    bn.c.aW.a(bn.c.s, d5.a((x)l, (double)m.r()));
                                                    bn.c.s.b(a3.MAIN_HAND);
                                                    c10 = bn.c.s;
                                                }
                                                c10.u();
                                                this.k = -1;
                                                if (arrn != null) break block8;
                                            }
                                            this.k = 0;
                                            if (arrn != null) break block8;
                                        }
                                        n2 = bn.c.s.cB.a;
                                    }
                                    n3 = aK.a();
                                    if (arrn == null) break block23;
                                    if (n2 == n3) break block8;
                                    int n3 = this.k;
                                    n3 = -1;
                                }
                                if (arrn == null) break block24;
                                if (n2 != n3) break block8;
                                n2 = aK.a();
                                if (arrn == null) break block25;
                                n3 = -1;
                            }
                            if (n2 == n3) break block8;
                            n2 = l.ab() ? 1 : 0;
                        }
                        if (arrn == null) break block26;
                        if (n2 == 0) break block27;
                        n2 = l.aq() ? 1 : 0;
                    }
                    if (arrn == null) break block28;
                    if (n2 == 0) break block27;
                    n2 = l.am() ? 1 : 0;
                }
                if (n2 != 0) break block8;
            }
            bn.c.s.u();
            bn.c.s.cB.a = aK.a();
            bn.c.s.c9.a(new I(bn.c.s.cB.a));
            this.k = 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void b(fR var1_1) {
        block12: {
            block11: {
                var3_2 = cj.b.f.a("Rotation Mode").m();
                var2_3 = net.minecraft.ac.c.i();
                v0 = bn.l;
                if (var2_3 != null) {
                    if (v0 == null) {
                        return;
                    }
                    v0 = bn.l;
                }
                v1 = (cfr_temp_0 = v0.V() - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var2_3 == null) break block11;
                if (v1 <= 0) return;
                v2 = bn.c.s;
                if (var2_3 == null) break block12;
                v1 = (float)(v2.av().w() instanceof a_);
            }
            if (v1 == false) {
                v2 = bn.c.s;
                if (var2_3 != null) {
                    if (!(v2.av().w() instanceof am) && cj.b.f.a("Weapon Only").l()) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v2 = bn.l;
            }
        }
        var4_4 = d5.a((x)v2, true);
        v3 = var3_2.equalsIgnoreCase("Packet");
        if (var2_3 != null) {
            if (v3) {
                var1_1.a(var4_4[0]);
                var1_1.b(var4_4[1]);
                if (var2_3 != null) return;
            }
            v3 = var3_2.equalsIgnoreCase("Client");
        }
        if (v3 == false) return;
        bn.c.s.e = var4_4[0];
        bn.c.s.at = var4_4[1];
    }

    public bn() {
        super("KillAura", a5.Combat);
        this.B = new ef();
        this.y = new ef();
        this.A = new ef();
        this.z = new ArrayList<B>();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Packet");
        arrayList.add("Client");
        arrayList.add("None");
        cj.b.f.b(new hH("Rotation Mode", (bE)this, "Packet", arrayList));
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Distance");
        arrayList2.add("Health");
        cj.b.f.b(new hH("TargetSort Mode", (bE)this, "Distance", arrayList2));
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Wellmore");
        arrayList3.add("Other");
        cj.b.f.b(new hH("Attack Mode", (bE)this, "Wellmore", arrayList3));
        v = new hH("FOV", this, 360.0, 0.0, 360.0, 1.0);
        cj.b.f.b(v);
        m = new hH("AttackRange", this, 4.0, 3.0, 7.0, 0.01);
        cj.b.f.b(m);
        q = new hH("Players", this, true);
        cj.b.f.b(q);
        n = new hH("Mobs", this, false);
        cj.b.f.b(n);
        w = new hH("Invisible", this, false);
        cj.b.f.b(w);
        int[] arrn = net.minecraft.ac.c.i();
        r = new hH("Walls", this, true);
        cj.b.f.b(r);
        cj.b.f.b(new hH("Weapon Only", this, false));
        int[] arrn2 = arrn;
        cj.b.f.b(new hH("Using Item Check", this, false));
        cj.b.f.b(new hH("Shield Breaker", this, false));
        cj.b.f.b(new hH("Shield Fixer", this, true));
        t = new hH("Ray-Trace", this, false);
        cj.b.f.b(t);
        x = new hH("Wellmore", this, false);
        cj.b.f.b(x);
        s = new hH("Only Crits", this, false);
        cj.b.f.b(s);
        cj.b.f.b(new hH("Crits Fall Distance", this, 0.2f, 0.1f, 0.45f, 0.01f));
        cj.b.f.b(new hH("TargetHud", this, true));
        cj.b.f.b(new hH("TargetHudPositionX", this, 70.0, -700.0, 600.0, 1.0));
        cj.b.f.b(new hH("TargetHudPositionY", this, 80.0, -400.0, 300.0, 1.0));
        if (arrn2 == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @cL
    public void a(ft ft2) {
        block2: {
            boolean bl2;
            block4: {
                int[] arrn;
                block3: {
                    block1: {
                        arrn = net.minecraft.ac.c.i();
                        bl2 = bn.c.s.ab();
                        if (arrn == null) break block1;
                        if (!bl2) break block2;
                        bl2 = this.y.a(580.0);
                    }
                    if (arrn == null) break block3;
                    if (!bl2) break block2;
                    bl2 = bn.c.s.c(a3.OFF_HAND).w() instanceof aR;
                }
                if (arrn == null) break block4;
                if (!bl2) break block2;
                bl2 = cj.b.f.a("Shield Fixer").l();
            }
            if (bl2) {
                bn.c.s.c9.a(new F(net.minecraft.d.r.RELEASE_USE_ITEM, new n(900, 900, 900), aA.UP));
                bn.c.aW.a((j)bn.c.s, bn.c.e, a3.OFF_HAND);
                this.y.d();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void c(fb var1_1) {
        block19: {
            block20: {
                block21: {
                    block15: {
                        block16: {
                            block17: {
                                block18: {
                                    var2_2 = net.minecraft.ac.c.i();
                                    v0 = bn.c.s.aL();
                                    if (var2_2 == null) break block15;
                                    if (v0 == 0) break block16;
                                    ed.b();
                                    var3_3 = cj.b.f.a("Rotation Mode").m();
                                    var4_4 = var3_3.equalsIgnoreCase("Packet") != false ? dC.b : bn.c.s.e;
                                    var5_5 = var3_3.equalsIgnoreCase("Packet") != false ? dC.e : bn.c.s.at;
                                    this.b(var3_3 + ", " + aY.a(bn.m.r(), 1));
                                    bn.l = ed.a();
                                    if (bn.l == null) {
                                        return;
                                    }
                                    v0 = bn.c.s.av().w() instanceof a_;
                                    if (var2_2 == null) break block17;
                                    if (v0 != 0) break block18;
                                    v0 = bn.c.s.av().w() instanceof am;
                                    if (var2_2 == null) break block17;
                                    if (v0 == 0) {
                                        v0 = cj.b.f.a("Weapon Only").l() ? 1 : 0;
                                        if (var2_2 != null) {
                                            if (v0 != 0) {
                                                return;
                                            } else {
                                                ** GOTO lbl25
                                            }
                                        } else {
                                            ** GOTO lbl24
                                        }
                                    }
                                    break block18;
lbl24:
                                    // 2 sources

                                    break block17;
                                }
                                v0 = d5.a(var4_4, var5_5, bn.l, bn.m.r()) ? 1 : 0;
                            }
                            if (var2_2 != null) {
                                if (v0 != 0) {
                                    v0 = cj.b.f.a("Ray-Trace").l() ? 1 : 0;
                                    if (var2_2 != null) {
                                        if (v0 != 0) {
                                            return;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v0 = bn.c.s.l() ? 1 : 0;
                                }
                            }
                            if (var2_2 == null) break block15;
                            if (v0 == 0) break block16;
                            v0 = cj.b.f.a("Using Item Check").l() ? 1 : 0;
                            if (var2_2 != null) {
                                if (v0 != 0) {
                                    return;
                                } else {
                                    ** GOTO lbl43
                                }
                            }
                            break block15;
                        }
                        v1 = bn.c.s;
                        if (var2_2 == null) break block19;
                        cfr_temp_0 = v1.G - (double)(-cj.b.f.a("Crits Fall Distance").r());
                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                    }
                    if (v0 < 0) break block20;
                    v2 = bn.s.l();
                    if (var2_2 == null) break block21;
                    if (!v2) break block20;
                    v1 = bn.c.s;
                    if (var2_2 == null) break block19;
                    v2 = v1.s();
                }
                if (v2) break block20;
                v1 = bn.c.s;
                if (var2_2 != null) {
                    if (!v1.u()) {
                        v1 = bn.c.s;
                        if (var2_2 != null) {
                            if (!v1.aa) {
                                return;
                            } else {
                                ** GOTO lbl68
                            }
                        } else {
                            ** GOTO lbl67
                        }
                    } else {
                        ** GOTO lbl66
                    }
                }
                break block19;
lbl66:
                // 2 sources

                break block20;
lbl67:
                // 2 sources

                break block19;
            }
            v1 = bn.l;
        }
        bn.a(v1);
    }

    @Override
    public void d() {
        l = null;
        super.d();
    }

    @Override
    public void m() {
        l = null;
        super.m();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void c(fR var1_1) {
        block26: {
            block27: {
                block29: {
                    block24: {
                        block25: {
                            block28: {
                                block21: {
                                    block22: {
                                        block23: {
                                            var2_2 = net.minecraft.ac.c.i();
                                            v0 = bn.c.s.aL();
                                            if (var2_2 == null) break block21;
                                            if (!v0) ** GOTO lbl-1000
                                            ed.b();
                                            var3_3 = cj.b.f.a("Rotation Mode").m();
                                            var4_4 = var3_3.equalsIgnoreCase("Packet") != false ? dC.b : bn.c.s.e;
                                            var5_5 = var3_3.equalsIgnoreCase("Packet") != false ? dC.e : bn.c.s.at;
                                            this.b(var3_3 + ", " + aY.a(bn.m.r(), 1));
                                            bn.l = ed.a();
                                            if (bn.l == null) {
                                                return;
                                            }
                                            v0 = bn.c.s.av().w() instanceof a_;
                                            if (var2_2 == null) break block22;
                                            if (v0) break block23;
                                            v0 = bn.c.s.av().w() instanceof am;
                                            if (var2_2 == null) break block22;
                                            if (!v0) {
                                                v0 = cj.b.f.a("Weapon Only").l();
                                                if (var2_2 != null) {
                                                    if (v0) {
                                                        return;
                                                    } else {
                                                        ** GOTO lbl25
                                                    }
                                                } else {
                                                    ** GOTO lbl24
                                                }
                                            }
                                            break block23;
lbl24:
                                            // 2 sources

                                            break block22;
                                        }
                                        v0 = d5.a(var4_4, var5_5, bn.l, bn.m.r());
                                    }
                                    if (var2_2 != null) {
                                        if (v0) {
                                            v0 = cj.b.f.a("Ray-Trace").l();
                                            if (var2_2 != null) {
                                                if (v0) {
                                                    return;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v0 = bn.c.s.l();
                                        }
                                    }
                                    if (var2_2 != null) {
                                        ** if (!v0) goto lbl-1000
lbl-1000:
                                        // 1 sources

                                        {
                                            v0 = cj.b.f.a((String)"Using Item Check").l();
                                            if (var2_2 != null) {
                                                if (v0) {
                                                    return;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            } else {
                                                ** GOTO lbl42
                                            }
lbl42:
                                            // 2 sources

                                            ** GOTO lbl45
                                        }
                                    }
                                    break block21;
lbl-1000:
                                    // 4 sources

                                    {
                                        v0 = hC.a();
                                    }
                                }
                                if (var2_2 == null) break block24;
                                if (!v0) break block25;
                                v1 = bn.c.s;
                                if (var2_2 == null) break block26;
                                if (!(v1.G >= (double)(-cj.b.f.a("Crits Fall Distance").r()))) break block27;
                                v2 = bn.s.l();
                                if (var2_2 == null) break block28;
                                if (!v2) break block27;
                                v1 = bn.c.s;
                                if (var2_2 == null) break block26;
                                v2 = v1.s();
                            }
                            if (v2) break block27;
                            v1 = bn.c.s;
                            if (var2_2 == null) break block26;
                            if (v1.u()) break block27;
                            v1 = bn.c.s;
                            if (var2_2 == null) break block26;
                            if (!v1.aa) {
                                return;
                            }
                            break block27;
                        }
                        v1 = bn.c.s;
                        if (var2_2 == null) break block26;
                        cfr_temp_0 = v1.an - 0.0f;
                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    }
                    if (!v0) break block27;
                    v3 = bn.s.l();
                    if (var2_2 == null) break block29;
                    if (!v3) break block27;
                    v1 = bn.c.s;
                    if (var2_2 == null) break block26;
                    v3 = v1.s();
                }
                if (!v3) {
                    v1 = bn.c.s;
                    if (var2_2 != null) {
                        if (!v1.u()) {
                            v1 = bn.c.s;
                            if (var2_2 != null) {
                                if (!v1.aa) {
                                    return;
                                } else {
                                    ** GOTO lbl93
                                }
                            } else {
                                ** GOTO lbl92
                            }
                        } else {
                            ** GOTO lbl91
                        }
                    } else {
                        ** GOTO lbl90
                    }
                }
                break block27;
lbl90:
                // 2 sources

                break block26;
lbl91:
                // 2 sources

                break block27;
lbl92:
                // 2 sources

                break block26;
            }
            v1 = bn.l;
        }
        bn.a(v1);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fb fb2) {
        block0: {
            String string = cj.b.f.a("Attack Mode").m();
            if (!string.equalsIgnoreCase("Wellmore")) break block0;
            this.c(fb2);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(l var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @cL
    public void a(fR fR2) {
        block0: {
            String string = cj.b.f.a("Attack Mode").m();
            if (!string.equalsIgnoreCase("Other")) break block0;
            this.c(fR2);
        }
    }

    public static void a(B b10) {
        block6: {
            net.minecraft.client.q.c c10;
            block7: {
                float f10;
                block5: {
                    float f11;
                    int[] arrn = net.minecraft.ac.c.i();
                    float f12 = s.l() ? 0.95f : 1.0f;
                    B b11 = b10;
                    if (arrn != null) {
                        if (b11 == null) {
                            return;
                        }
                        b11 = b10;
                    }
                    f10 = (f11 = b11.V() - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (arrn == null) break block5;
                    if (f10 <= 0) break block6;
                    c10 = bn.c.s;
                    if (arrn == null) break block7;
                    float f13 = c10.e(0.0f) - f12;
                    f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (f10 < 0) break block6;
                bn.c.aW.a(bn.c.s, b10);
                c10 = bn.c.s;
            }
            c10.b(a3.MAIN_HAND);
        }
    }

    private int a() {
        int n2;
        block4: {
            int n3 = 0;
            int[] arrn = net.minecraft.ac.c.i();
            while (n3 < 9) {
                d d10 = bn.c.s.cB.a(n3);
                if (arrn != null) {
                    n2 = d10.w() instanceof am;
                    if (arrn == null) break block4;
                    if (n2 != 0) {
                        return n3;
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
            n2 = 1;
        }
        return n2;
    }

    @cL
    public void a(f3 f32) {
        block3: {
            block7: {
                G g10;
                G g11;
                block6: {
                    K k2;
                    int[] arrn;
                    block5: {
                        boolean bl2;
                        block4: {
                            boolean bl3;
                            block2: {
                                arrn = net.minecraft.ac.c.i();
                                bl3 = x.l();
                                if (arrn == null) break block2;
                                if (!bl3) break block3;
                                bl3 = this.i();
                            }
                            if (!bl3) break block3;
                            if (l == null) {
                                return;
                            }
                            bl2 = f32.d() instanceof v;
                            if (arrn == null) break block4;
                            if (bl2) {
                                f32.a(true);
                            }
                            k2 = f32.d();
                            if (arrn == null) break block5;
                            bl2 = k2 instanceof g;
                        }
                        if (!bl2) break block3;
                        k2 = f32.d();
                    }
                    g g12 = (g)k2;
                    g11 = g12.b();
                    g10 = G.INTERACT;
                    if (arrn == null) break block6;
                    if (g11 == g10) break block7;
                    g11 = g12.b();
                    g10 = G.INTERACT_AT;
                }
                if (g11 != g10) break block3;
            }
            f32.a(true);
        }
    }
}

