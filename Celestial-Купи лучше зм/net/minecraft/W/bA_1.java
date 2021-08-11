/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.a7;
import net.minecraft.w.d;

public class bA
extends K {
    public static final /* synthetic */ c z;
    public static final /* synthetic */ k D;
    public static final /* synthetic */ c I;
    public static final /* synthetic */ k A;
    public static final /* synthetic */ k C;
    public static final /* synthetic */ c B;
    protected static final /* synthetic */ k[] F;
    public static final /* synthetic */ c G;
    public static final /* synthetic */ k E;
    public static final /* synthetic */ k H;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(K k2) {
        boolean bl2 = cL.e();
        boolean bl3 = K.a(k2);
        if (!bl2) return bl3;
        if (bl3) return true;
        K k3 = k2;
        K k4 = g.ah;
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.ae;
        }
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.G;
        }
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.y;
        }
        if (k3 != k4) return false;
        return true;
    }

    @Override
    public boolean a(t t2, n n2) {
        return false;
    }

    private static int a(i i2) {
        int n2 = 0;
        boolean bl2 = cL.b();
        int n3 = i2.b(I).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.NORTH.k();
            }
            n3 = i2.b(G).booleanValue();
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.EAST.k();
            }
            n3 = i2.b(z).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.SOUTH.k();
            }
            n3 = i2.b(B).booleanValue() ? 1 : 0;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1 << aA.WEST.k();
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public int d(i i2) {
        return 0;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, I, G, B, z);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        net.minecraft.Z.d d10;
        block5: {
            aA aA3;
            aA aA4;
            block4: {
                boolean bl2 = cL.e();
                aA4 = aA2;
                aA3 = aA.UP;
                if (!bl2) break block4;
                if (aA4 == aA3) break block5;
                aA4 = aA2;
                aA3 = aA.DOWN;
            }
            if (aA4 != aA3) {
                d10 = net.minecraft.Z.d.MIDDLE_POLE;
                return d10;
            }
        }
        d10 = net.minecraft.Z.d.CENTER;
        return d10;
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(I, i2.b(z)).a(z, i2.b(I));
            }
            case FRONT_BACK: {
                return i2.a(G, i2.b(B)).a(B, i2.b(G));
            }
        }
        return super.a(i2, h2);
    }

    static {
        I = net.minecraft.ae.c.a("north");
        G = net.minecraft.ae.c.a("east");
        z = net.minecraft.ae.c.a("south");
        B = net.minecraft.ae.c.a("west");
        F = new k[]{new k(0.375, 0.0, 0.375, 0.625, 1.0, 0.625), new k(0.375, 0.0, 0.375, 0.625, 1.0, 1.0), new k(0.0, 0.0, 0.375, 0.625, 1.0, 0.625), new k(0.0, 0.0, 0.375, 0.625, 1.0, 1.0), new k(0.375, 0.0, 0.0, 0.625, 1.0, 0.625), new k(0.375, 0.0, 0.0, 0.625, 1.0, 1.0), new k(0.0, 0.0, 0.0, 0.625, 1.0, 0.625), new k(0.0, 0.0, 0.0, 0.625, 1.0, 1.0), new k(0.375, 0.0, 0.375, 1.0, 1.0, 0.625), new k(0.375, 0.0, 0.375, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.375, 1.0, 1.0, 0.625), new k(0.0, 0.0, 0.375, 1.0, 1.0, 1.0), new k(0.375, 0.0, 0.0, 1.0, 1.0, 0.625), new k(0.375, 0.0, 0.0, 1.0, 1.0, 1.0), new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.625), new k(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
        E = new k(0.375, 0.0, 0.375, 0.625, 1.5, 0.625);
        H = new k(0.375, 0.0, 0.625, 0.625, 1.5, 1.0);
        D = new k(0.0, 0.0, 0.375, 0.375, 1.5, 0.625);
        A = new k(0.375, 0.0, 0.0, 0.625, 1.5, 0.375);
        C = new k(0.625, 0.0, 0.375, 1.0, 1.5, 0.625);
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block8: {
            boolean bl3 = cL.e();
            boolean bl4 = bl2;
            if (bl3) {
                if (!bl4) {
                    i2 = i2.c((t)z2, n2);
                }
                bA.a(n2, k2, list, E);
                bl4 = i2.b(I);
            }
            if (bl3) {
                if (bl4) {
                    bA.a(n2, k2, list, A);
                }
                bl4 = i2.b(G);
            }
            if (bl3) {
                if (bl4) {
                    bA.a(n2, k2, list, C);
                }
                bl4 = i2.b(z);
            }
            if (bl3) {
                if (bl4) {
                    bA.a(n2, k2, list, H);
                }
                bl4 = i2.b(B);
            }
            if (!bl4) break block8;
            bA.a(n2, k2, list, D);
        }
    }

    public bA(net.minecraft.ac.c c10, net.minecraft.ac.a a10) {
        super(c10, a10);
        this.h(this.e.a().a(I, false).a(G, false).a(z, false).a(B, false));
        this.a(net.minecraft.ad.a.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        d d10;
        boolean bl2 = cL.b();
        boolean bl3 = z2.C;
        if (bl2) return bl3;
        if (!bl3) {
            bl3 = a7.a(j2, z2, n2);
            return bl3;
        }
        d d11 = d10 = j2.c(a32);
        if (!bl2) {
            if (d11.w() == net.minecraft.u.h.G) return true;
            d11 = d10;
        }
        boolean bl4 = d11.G();
        if (bl2) return bl4;
        if (!bl4) return false;
        return true;
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(I, i2.b(z)).a(G, i2.b(B)).a(z, i2.b(I)).a(B, i2.b(G));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(I, i2.b(G)).a(G, i2.b(z)).a(z, i2.b(B)).a(B, i2.b(I));
            }
            case CLOCKWISE_90: {
                return i2.a(I, i2.b(B)).a(G, i2.b(I)).a(z, i2.b(G)).a(B, i2.b(z));
            }
        }
        return i2;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        return i2.a(I, this.a(t2, n2.i(), aA.SOUTH)).a(G, this.a(t2, n2.m(), aA.WEST)).a(z, this.a(t2, n2.j(), aA.NORTH)).a(B, this.a(t2, n2.b(), aA.EAST));
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = this.e(i2, t2, n2);
        return F[bA.a(i2)];
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    /*
     * Exception decompiling
     */
    public boolean a(t var1_1, n var2_2, aA var3_3) {
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
}

