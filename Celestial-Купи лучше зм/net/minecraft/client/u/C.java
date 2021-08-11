/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  javax.annotation.Nullable
 */
package net.minecraft.client.u;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.client.a.I;
import net.minecraft.client.a.an;
import net.minecraft.client.u.A;
import net.minecraft.client.u.B;
import net.minecraft.client.u.D;
import net.minecraft.client.u.E;
import net.minecraft.client.u.F;
import net.minecraft.client.u.G;
import net.minecraft.client.u.H;
import net.minecraft.client.u.J;
import net.minecraft.client.u.K;
import net.minecraft.client.u.M;
import net.minecraft.client.u.N;
import net.minecraft.client.u.O;
import net.minecraft.client.u.P;
import net.minecraft.client.u.Q;
import net.minecraft.client.u.R;
import net.minecraft.client.u.S;
import net.minecraft.client.u.T;
import net.minecraft.client.u.U;
import net.minecraft.client.u.V;
import net.minecraft.client.u.W;
import net.minecraft.client.u.X;
import net.minecraft.client.u.Y;
import net.minecraft.client.u.Z;
import net.minecraft.client.u.a;
import net.minecraft.client.u.a1;
import net.minecraft.client.u.aC;
import net.minecraft.client.u.aX;
import net.minecraft.client.u.ab;
import net.minecraft.client.u.al;
import net.minecraft.client.u.au;
import net.minecraft.client.u.av;
import net.minecraft.client.u.aw;
import net.minecraft.client.u.b;
import net.minecraft.client.u.c;
import net.minecraft.client.u.d;
import net.minecraft.client.u.e;
import net.minecraft.client.u.f;
import net.minecraft.client.u.g;
import net.minecraft.client.u.h;
import net.minecraft.client.u.i;
import net.minecraft.client.u.j;
import net.minecraft.client.u.k;
import net.minecraft.client.u.l;
import net.minecraft.client.u.m;
import net.minecraft.client.u.n;
import net.minecraft.client.u.o;
import net.minecraft.client.u.p;
import net.minecraft.client.u.q;
import net.minecraft.client.u.r;
import net.minecraft.client.u.s;
import net.minecraft.client.u.t;
import net.minecraft.client.u.u;
import net.minecraft.client.u.v;
import net.minecraft.client.u.w;
import net.minecraft.client.u.x;
import net.minecraft.client.u.y;
import net.minecraft.client.u.z;

public class C {
    private final /* synthetic */ ArrayDeque<av>[][] a;
    private final /* synthetic */ Queue<av> c;
    private final /* synthetic */ net.minecraft.client.j.u h;
    private final /* synthetic */ Random g;
    private static final /* synthetic */ net.minecraft.ar.v d;
    private final /* synthetic */ Map<Integer, A> f;
    private final /* synthetic */ Queue<aX> b;
    protected /* synthetic */ net.minecraft.ah.z e;

    static {
        d = new net.minecraft.ar.v("textures/particle/particles.png");
    }

    public void a(net.minecraft.U.x x2, float f10) {
        float f11 = (float)Math.PI / 180;
        float f12 = net.minecraft.k.h.c(x2.e * ((float)Math.PI / 180));
        float f13 = net.minecraft.k.h.g(x2.e * ((float)Math.PI / 180));
        float f14 = -f13 * net.minecraft.k.h.g(x2.at * ((float)Math.PI / 180));
        float f15 = f12 * net.minecraft.k.h.g(x2.at * ((float)Math.PI / 180));
        int[] arrn = av.e();
        float f16 = net.minecraft.k.h.c(x2.at * ((float)Math.PI / 180));
        int n2 = 0;
        while (n2 < 2) {
            ArrayDeque<av> arrayDeque = this.a[3][n2];
            if (arrn != null) {
                if (!arrayDeque.isEmpty()) {
                    net.minecraft.client.a.W w2 = net.minecraft.client.a.W.c();
                    I i2 = w2.b();
                    for (av av2 : arrayDeque) {
                        av2.a(i2, x2, f10, f12, f16, f13, f14, f15);
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break;
                    }
                } else {
                    ++n2;
                }
            }
            if (arrn != null) continue;
        }
    }

    public void a(net.minecraft.k.n n2, aA aA2) {
        net.minecraft.Z.i i2 = this.e.d(n2);
        int[] arrn = av.e();
        if (i2.n() != aW.INVISIBLE) {
            int n3 = n2.e();
            int n4 = n2.b();
            int n5 = n2.a();
            float f10 = 0.1f;
            net.minecraft.k.k k2 = i2.f(this.e, n2);
            double d10 = (double)n3 + this.g.nextDouble() * (k2.f - k2.e - (double)0.2f) + (double)0.1f + k2.e;
            double d11 = (double)n4 + this.g.nextDouble() * (k2.a - k2.b - (double)0.2f) + (double)0.1f + k2.b;
            double d12 = (double)n5 + this.g.nextDouble() * (k2.g - k2.d - (double)0.2f) + (double)0.1f + k2.d;
            aA aA3 = aA2;
            aA aA4 = aA.DOWN;
            if (arrn != null) {
                if (aA3 == aA4) {
                    d11 = (double)n4 + k2.b - (double)0.1f;
                }
                aA3 = aA2;
                aA4 = aA.UP;
            }
            if (arrn != null) {
                if (aA3 == aA4) {
                    d11 = (double)n4 + k2.a + (double)0.1f;
                }
                aA3 = aA2;
                aA4 = aA.NORTH;
            }
            if (arrn != null) {
                if (aA3 == aA4) {
                    d12 = (double)n5 + k2.d - (double)0.1f;
                }
                aA3 = aA2;
                aA4 = aA.SOUTH;
            }
            if (arrn != null) {
                if (aA3 == aA4) {
                    d12 = (double)n5 + k2.g + (double)0.1f;
                }
                aA3 = aA2;
                aA4 = aA.WEST;
            }
            if (arrn != null) {
                if (aA3 == aA4) {
                    d10 = (double)n3 + k2.e - (double)0.1f;
                }
                aA3 = aA2;
                aA4 = aA.EAST;
            }
            if (aA3 == aA4) {
                d10 = (double)n3 + k2.f + (double)0.1f;
            }
            this.a(new aC(this.e, d10, d11, d12, 0.0, 0.0, 0.0, i2).a(n2).d(0.2f).b(0.6f));
        }
    }

    public void a(@Nullable net.minecraft.ah.z z2) {
        block3: {
            this.e = z2;
            int n2 = 0;
            int[] arrn = av.e();
            while (n2 < 4) {
                block4: {
                    if (arrn == null) break block3;
                    for (int i2 = 0; i2 < 2; ++i2) {
                        this.a[n2][i2].clear();
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block4;
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
            this.b.clear();
        }
    }

    private void a(Queue<av> queue) {
        block6: {
            Queue<av> queue2;
            int[] arrn;
            block5: {
                arrn = av.e();
                queue2 = queue;
                if (arrn == null) break block5;
                if (queue2.isEmpty()) break block6;
                queue2 = queue;
            }
            Iterator iterator = queue2.iterator();
            while (iterator.hasNext()) {
                av av2 = (av)iterator.next();
                this.b(av2);
                if (!av2.l()) {
                    iterator.remove();
                }
                if (arrn != null) continue;
            }
        }
    }

    public void a(net.minecraft.U.x x2, aH aH2, int n2) {
        this.b.add(new aX(this.e, x2, aH2, n2));
    }

    public void b(net.minecraft.U.x x2, float f10) {
        int n2;
        block15: {
            float f11 = an.d();
            float f12 = an.b();
            float f13 = an.a();
            float f14 = an.e();
            float f15 = an.c();
            av.j = x2.am + (x2.a - x2.am) * (double)f10;
            int[] arrn = av.e();
            av.o = x2.af + (x2.aF - x2.af) * (double)f10;
            av.w = x2.n + (x2.ax - x2.n) * (double)f10;
            av.g = x2.b(f10);
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, net.minecraft.client.a.G.ONE_MINUS_SRC_ALPHA);
            net.minecraft.client.a.v.a(516, 0.003921569f);
            int n3 = 0;
            block9: while (true) {
                int n4 = n3;
                block10: while (n4 < 3) {
                    int n5 = n3;
                    n2 = 0;
                    if (arrn == null) break block15;
                    int n6 = n2;
                    while (n6 < 2) {
                        block16: {
                            block18: {
                                int n7;
                                block17: {
                                    n4 = this.a[n5][n6].isEmpty() ? 1 : 0;
                                    if (arrn == null) continue block10;
                                    if (arrn == null) break block17;
                                    if (n4 != 0) break block18;
                                    n7 = n6;
                                }
                                if (arrn != null) {
                                    switch (n7) {
                                        case 0: {
                                            net.minecraft.client.a.v.a(false);
                                            if (arrn != null) break;
                                        }
                                        case 1: {
                                            net.minecraft.client.a.v.a(true);
                                            break;
                                        }
                                    }
                                    n7 = n5;
                                }
                                switch (n7) {
                                    default: {
                                        this.h.b(d);
                                        if (arrn != null) break;
                                    }
                                    case 1: {
                                        this.h.b(net.minecraft.client.j.j.x);
                                        break;
                                    }
                                }
                                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                net.minecraft.client.a.W w2 = net.minecraft.client.a.W.c();
                                I i2 = w2.b();
                                i2.a(7, net.minecraft.client.y.b.n);
                                for (av av2 : this.a[n5][n6]) {
                                    try {
                                        av2.a(i2, x2, f10, f11, f15, f12, f13, f14);
                                        if (arrn == null) break block16;
                                    }
                                    catch (Throwable throwable) {
                                        net.minecraft.c.f f16 = net.minecraft.c.f.a(throwable, "Rendering Particle");
                                        net.minecraft.c.l l2 = f16.a("Particle being rendered");
                                        l2.a("Particle", new t(this, av2));
                                        l2.a("Particle Type", new V(this, n5));
                                        throw new net.minecraft.ar.Z(f16);
                                    }
                                    if (arrn != null) continue;
                                }
                                w2.a();
                            }
                            ++n6;
                        }
                        if (arrn != null) continue;
                    }
                    ++n3;
                    if (arrn != null) continue block9;
                }
                break;
            }
            net.minecraft.client.a.v.a(true);
            net.minecraft.client.a.v.f();
            n2 = 516;
        }
        net.minecraft.client.a.v.a(n2, 0.1f);
    }

    public C(net.minecraft.ah.z z2, net.minecraft.client.j.u u2) {
        block3: {
            int[] arrn = av.e();
            int[] arrn2 = arrn;
            this.a = new ArrayDeque[4][];
            this.b = Queues.newArrayDeque();
            this.g = new Random();
            this.f = Maps.newHashMap();
            this.c = Queues.newArrayDeque();
            this.e = z2;
            this.h = u2;
            int n2 = 0;
            while (n2 < 4) {
                block4: {
                    this.a[n2] = new ArrayDeque[2];
                    if (arrn2 == null) break block3;
                    for (int i2 = 0; i2 < 2; ++i2) {
                        this.a[n2][i2] = Queues.newArrayDeque();
                        if (arrn2 != null) {
                            if (arrn2 != null) continue;
                        }
                        break block4;
                    }
                    ++n2;
                }
                if (arrn2 != null) continue;
            }
            this.b();
        }
    }

    public void a(net.minecraft.k.n n2, net.minecraft.k.i i2) {
        block2: {
            net.minecraft.Z.i i3;
            net.minecraft.Z.i i4;
            block1: {
                i4 = this.e.d(n2);
                int[] arrn = av.e();
                i3 = i4;
                if (arrn == null) break block1;
                if (i3 == null) break block2;
                i3 = i4;
            }
            boolean bl2 = cq.g(i3.b(), cq.ax, i4, this.e, i2, this);
            if (i4 != null && !bl2) {
                this.a(n2, i2.b);
            }
        }
    }

    private boolean a(av av2, ArrayDeque<av> arrayDeque) {
        boolean bl2;
        block3: {
            Iterator<av> iterator = arrayDeque.iterator();
            int[] arrn = av.e();
            while (iterator.hasNext()) {
                block5: {
                    double d10;
                    block8: {
                        block7: {
                            av av3;
                            block6: {
                                block4: {
                                    av3 = iterator.next();
                                    bl2 = av3 instanceof al;
                                    if (arrn == null) break block3;
                                    if (arrn == null) break block4;
                                    if (!bl2) break block5;
                                    double d11 = av2.q - av3.q;
                                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                }
                                if (arrn == null) break block6;
                                if (d10 != false) break block5;
                                double d12 = av2.t - av3.t;
                                d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            }
                            if (arrn == null) break block7;
                            if (d10 != false) break block5;
                            double d13 = av2.f - av3.f;
                            d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        }
                        if (arrn == null) break block8;
                        if (d10 != false) break block5;
                        av3.K = 0;
                        d10 = 1.0;
                    }
                    return (boolean)d10;
                }
                if (arrn != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void a(int n2, A a10) {
        this.f.put(n2, a10);
    }

    private void b(av av2) {
        try {
            av2.i();
        }
        catch (Throwable throwable) {
            net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Ticking Particle");
            net.minecraft.c.l l2 = f10.a("Particle being ticked");
            int n2 = av2.d();
            l2.a("Particle", new r(this, av2));
            l2.a("Particle Type", new q(this, n2));
            throw new net.minecraft.ar.Z(f10);
        }
    }

    /*
     * Exception decompiling
     */
    public void a(net.minecraft.k.n var1_1, net.minecraft.Z.i var2_2) {
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

    private void a(int n2) {
        block2: {
            int[] arrn = av.e();
            this.e.H.b(String.valueOf(n2));
            int[] arrn2 = arrn;
            for (int i2 = 0; i2 < 2; ++i2) {
                this.e.H.b(String.valueOf(i2));
                this.a(this.a[n2][i2]);
                this.e.H.c();
                if (arrn2 != null) {
                    if (arrn2 != null) continue;
                }
                break block2;
            }
            this.e.H.c();
        }
    }

    @Nullable
    public av a(int n2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        block3: {
            av av2;
            block4: {
                av av3;
                A a10;
                int[] arrn2;
                block2: {
                    A a11 = this.f.get(n2);
                    arrn2 = av.e();
                    a10 = a11;
                    if (arrn2 == null) break block2;
                    if (a10 == null) break block3;
                    a10 = a11;
                }
                av2 = av3 = a10.a(n2, this.e, d10, d11, d12, d13, d14, d15, arrn);
                if (arrn2 == null) break block4;
                if (av2 == null) break block3;
                this.a(av3);
                av2 = av3;
            }
            return av2;
        }
        return null;
    }

    public String a() {
        int n2 = 0;
        int n3 = 0;
        int[] arrn = av.e();
        while (n3 < 4) {
            block3: {
                for (int i2 = 0; i2 < 2; ++i2) {
                    n2 += this.a[n3][i2].size();
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block3;
                }
                ++n3;
            }
            if (arrn != null) continue;
        }
        return "" + n2;
    }

    private void b() {
        this.a(aH.EXPLOSION_NORMAL.a(), new n());
        this.a(aH.SPIT.a(), new d());
        this.a(aH.WATER_BUBBLE.a(), new p());
        this.a(aH.WATER_SPLASH.a(), new w());
        this.a(aH.WATER_WAKE.a(), new m());
        this.a(aH.WATER_DROP.a(), new R());
        this.a(aH.SUSPENDED.a(), new a1());
        this.a(aH.SUSPENDED_DEPTH.a(), new N());
        this.a(aH.CRIT.a(), new O());
        this.a(aH.CRIT_MAGIC.a(), new g());
        this.a(aH.SMOKE_NORMAL.a(), new Y());
        this.a(aH.SMOKE_LARGE.a(), new k());
        this.a(aH.SPELL.a(), new b());
        this.a(aH.SPELL_INSTANT.a(), new h());
        this.a(aH.SPELL_MOB.a(), new H());
        this.a(aH.SPELL_MOB_AMBIENT.a(), new K());
        this.a(aH.SPELL_WITCH.a(), new Q());
        this.a(aH.DRIP_WATER.a(), new S());
        this.a(aH.DRIP_LAVA.a(), new aw());
        this.a(aH.VILLAGER_ANGRY.a(), new J());
        this.a(aH.VILLAGER_HAPPY.a(), new s());
        this.a(aH.TOWN_AURA.a(), new N());
        this.a(aH.NOTE.a(), new y());
        this.a(aH.PORTAL.a(), new T());
        this.a(aH.ENCHANTMENT_TABLE.a(), new M());
        this.a(aH.FLAME.a(), new l());
        this.a(aH.LAVA.a(), new F());
        this.a(aH.FOOTSTEP.a(), new i());
        this.a(aH.CLOUD.a(), new W());
        this.a(aH.REDSTONE.a(), new B());
        this.a(aH.FALLING_DUST.a(), new Z());
        this.a(aH.SNOWBALL.a(), new au());
        this.a(aH.SNOW_SHOVEL.a(), new f());
        this.a(aH.SLIME.a(), new v());
        this.a(aH.HEART.a(), new P());
        this.a(aH.BARRIER.a(), new c());
        this.a(aH.ITEM_CRACK.a(), new G());
        this.a(aH.BLOCK_CRACK.a(), new u());
        this.a(aH.BLOCK_DUST.a(), new X());
        this.a(aH.EXPLOSION_HUGE.a(), new o());
        this.a(aH.EXPLOSION_LARGE.a(), new z());
        this.a(aH.FIREWORKS_SPARK.a(), new D());
        this.a(aH.MOB_APPEARANCE.a(), new a());
        this.a(aH.DRAGON_BREATH.a(), new U());
        this.a(aH.END_ROD.a(), new E());
        this.a(aH.DAMAGE_INDICATOR.a(), new e());
        this.a(aH.SWEEP_ATTACK.a(), new j());
        this.a(aH.TOTEM.a(), new x());
    }

    public void a(net.minecraft.U.x x2, aH aH2) {
        this.b.add(new aX(this.e, x2, aH2));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void c() {
        block17: {
            Object object;
            int[] arrn;
            block16: {
                boolean bl2;
                block15: {
                    block14: {
                        arrn = av.e();
                        for (int i2 = 0; i2 < 4; ++i2) {
                            this.a(i2);
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break block14;
                        }
                        bl2 = this.b.isEmpty();
                        if (arrn == null) break block15;
                        if (!bl2) {
                            boolean bl3;
                            ArrayList arrayList = Lists.newArrayList();
                            for (aX aX2 : this.b) {
                                aX2.i();
                                bl3 = aX2.l();
                                if (arrn != null) {
                                    if (arrn != null && !bl3) {
                                        arrayList.add(aX2);
                                    }
                                    if (arrn != null) continue;
                                }
                                break block14;
                            }
                            bl3 = this.b.removeAll(arrayList);
                        }
                    }
                    object = this.c;
                    if (arrn == null) break block16;
                    bl2 = object.isEmpty();
                }
                if (bl2) break block17;
                object = this.c.poll();
            }
            av av2 = (av)object;
            while (av2 != null) {
                Object object2;
                block20: {
                    block18: {
                        int n2;
                        int n3;
                        int n4;
                        block19: {
                            n4 = av2.d();
                            int n5 = av2.a();
                            if (arrn != null) {
                                n5 = n5 != 0 ? 0 : 1;
                            }
                            n3 = n5;
                            n2 = this.a[n4][n3].size();
                            if (arrn != null) {
                                if (n2 >= 16384) {
                                    this.a[n4][n3].removeFirst();
                                }
                                n2 = av2 instanceof al;
                            }
                            if (arrn == null) break block18;
                            if (n2 == 0) break block19;
                            object2 = this;
                            if (arrn == null) break block20;
                            if (super.a(av2, this.a[n4][n3])) break block18;
                        }
                        n2 = this.a[n4][n3].add(av2) ? 1 : 0;
                    }
                    object2 = this.c.poll();
                }
                av2 = (av)object2;
                if (arrn != null) continue;
            }
        }
    }

    public void a(av av2) {
        block3: {
            boolean bl2;
            block4: {
                av av3;
                int[] arrn;
                block2: {
                    arrn = av.e();
                    av3 = av2;
                    if (arrn == null) break block2;
                    if (av3 == null) break block3;
                    av3 = av2;
                }
                bl2 = av3 instanceof ab;
                if (arrn == null) break block3;
                if (!bl2) break block4;
                bl2 = fU.j();
                if (arrn == null || !bl2) break block3;
            }
            bl2 = this.c.add(av2);
        }
    }
}

