/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.D.h;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.aS;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.N.B;
import net.minecraft.N.W;
import net.minecraft.N.y;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aF
extends K {
    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        int n2;
        Object object;
        Object object2;
        net.minecraft.ah.z z2;
        block75: {
            int n3;
            block74: {
                aS aS2;
                d d10;
                m[] arrm;
                block69: {
                    String string;
                    block70: {
                        block73: {
                            block72: {
                                boolean bl2;
                                block71: {
                                    int n4;
                                    block68: {
                                        block63: {
                                            block66: {
                                                y y2;
                                                block67: {
                                                    boolean bl3;
                                                    block64: {
                                                        block65: {
                                                            String[] arrstring2;
                                                            block60: {
                                                                block61: {
                                                                    int n5;
                                                                    block62: {
                                                                        block58: {
                                                                            block59: {
                                                                                block57: {
                                                                                    int n6;
                                                                                    block55: {
                                                                                        block56: {
                                                                                            block54: {
                                                                                                int n7;
                                                                                                block52: {
                                                                                                    block53: {
                                                                                                        arrm = s.b();
                                                                                                        n7 = arrstring.length;
                                                                                                        if (arrm != null) {
                                                                                                            if (n7 < 1) {
                                                                                                                throw new z("commands.stats.usage", new Object[0]);
                                                                                                            }
                                                                                                            n7 = "entity".equals(arrstring[0]) ? 1 : 0;
                                                                                                        }
                                                                                                        if (arrm == null) break block52;
                                                                                                        if (n7 == 0) break block53;
                                                                                                        n3 = 0;
                                                                                                        if (arrm != null) break block54;
                                                                                                    }
                                                                                                    n7 = "block".equals(arrstring[0]) ? 1 : 0;
                                                                                                }
                                                                                                if (arrm != null) {
                                                                                                    if (n7 == 0) {
                                                                                                        throw new z("commands.stats.usage", new Object[0]);
                                                                                                    }
                                                                                                    n7 = 1;
                                                                                                }
                                                                                                n3 = n7;
                                                                                            }
                                                                                            n6 = n3;
                                                                                            if (arrm == null) break block55;
                                                                                            if (n6 == 0) break block56;
                                                                                            int n8 = arrstring.length;
                                                                                            if (arrm != null) {
                                                                                                if (n8 < 5) {
                                                                                                    throw new z("commands.stats.block.usage", new Object[0]);
                                                                                                }
                                                                                                n8 = n4 = 4;
                                                                                            }
                                                                                            if (arrm != null) break block57;
                                                                                        }
                                                                                        n6 = arrstring.length;
                                                                                    }
                                                                                    if (arrm != null) {
                                                                                        if (n6 < 3) {
                                                                                            throw new z("commands.stats.entity.usage", new Object[0]);
                                                                                        }
                                                                                        n6 = 2;
                                                                                    }
                                                                                    n4 = n6;
                                                                                }
                                                                                string = arrstring[n4++];
                                                                                n5 = "set".equals(string);
                                                                                if (arrm == null) break block58;
                                                                                if (n5 == 0) break block59;
                                                                                arrstring2 = arrstring;
                                                                                if (arrm == null) break block60;
                                                                                if (arrstring2.length < n4 + 3) {
                                                                                    if (n4 == 5) {
                                                                                        throw new z("commands.stats.block.set.usage", new Object[0]);
                                                                                    }
                                                                                    throw new z("commands.stats.entity.set.usage", new Object[0]);
                                                                                }
                                                                                break block61;
                                                                            }
                                                                            n5 = "clear".equals(string);
                                                                        }
                                                                        if (arrm == null) break block62;
                                                                        if (n5 == 0) {
                                                                            throw new z("commands.stats.usage", new Object[0]);
                                                                        }
                                                                        arrstring2 = arrstring;
                                                                        if (arrm == null) break block60;
                                                                        n5 = arrstring2.length;
                                                                    }
                                                                    if (n5 < n4 + 1) {
                                                                        if (n4 == 5) {
                                                                            throw new z("commands.stats.block.clear.usage", new Object[0]);
                                                                        }
                                                                        throw new z("commands.stats.entity.clear.usage", new Object[0]);
                                                                    }
                                                                }
                                                                arrstring2 = arrstring;
                                                            }
                                                            if ((d10 = d.a(arrstring2[n4++])) == null) {
                                                                throw new s("commands.stats.failed", new Object[0]);
                                                            }
                                                            z2 = j2.b();
                                                            if (n3 == 0) break block63;
                                                            object2 = aF.b(j2, arrstring, 1, false);
                                                            object = z2.b((n)object2);
                                                            y y3 = object;
                                                            if (arrm != null) {
                                                                if (y3 == null) {
                                                                    throw new s("commands.stats.noCompatibleBlock", ((m)object2).e(), ((m)object2).b(), ((m)object2).a());
                                                                }
                                                                y3 = object;
                                                            }
                                                            bl3 = y3 instanceof B;
                                                            if (arrm == null) break block64;
                                                            if (!bl3) break block65;
                                                            aS2 = ((B)object).f();
                                                            if (arrm != null) break block66;
                                                        }
                                                        y2 = object;
                                                        if (arrm == null) break block67;
                                                        bl3 = y2 instanceof W;
                                                    }
                                                    if (!bl3) {
                                                        throw new s("commands.stats.noCompatibleBlock", ((m)object2).e(), ((m)object2).b(), ((m)object2).a());
                                                    }
                                                    y2 = object;
                                                }
                                                aS2 = ((W)y2).b();
                                            }
                                            if (arrm != null) break block68;
                                        }
                                        object2 = aF.a(b10, j2, arrstring[1]);
                                        aS2 = ((x)object2).Q();
                                    }
                                    n2 = "set".equals(string);
                                    if (arrm == null) break block69;
                                    if (n2 == 0) break block70;
                                    object2 = arrstring[n4++];
                                    object = arrstring[n4];
                                    bl2 = ((String)object2).isEmpty();
                                    if (arrm == null) break block71;
                                    if (bl2) break block72;
                                    bl2 = ((String)object).isEmpty();
                                }
                                if (!bl2) break block73;
                            }
                            throw new s("commands.stats.failed", new Object[0]);
                        }
                        aS.a(aS2, d10, (String)object2, (String)object);
                        aF.a(j2, (F)this, "commands.stats.success", d10.a(), object, object2);
                        if (arrm != null) break block74;
                    }
                    n2 = "clear".equals(string);
                }
                if (arrm == null) break block75;
                if (n2 != 0) {
                    aS.a(aS2, d10, null, null);
                    aF.a(j2, (F)this, "commands.stats.cleared", d10.a());
                }
            }
            n2 = n3;
        }
        if (n2 != 0) {
            object2 = aF.b(j2, arrstring, 1, false);
            object = z2.b((n)object2);
            ((y)object).b();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
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

    @Override
    public String a() {
        return "stats";
    }

    @Override
    public int a() {
        return 2;
    }

    protected List<String> a(b b10) {
        Collection<h> collection = b10.c(0).c().e();
        m[] arrm = s.b();
        ArrayList arrayList = Lists.newArrayList();
        for (h h2 : collection) {
            boolean bl2 = h2.a().b();
            if (arrm != null && !bl2) {
                bl2 = arrayList.add(h2.e());
            }
            if (arrm != null) continue;
        }
        return arrayList;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        int n3 = arrstring.length;
        if (arrm != null) {
            if (n3 <= 0) return 0 != 0;
            n3 = "entity".equals(arrstring[0]) ? 1 : 0;
        }
        if (arrm != null) {
            if (n3 == 0) return 0 != 0;
            n3 = n2;
        }
        if (arrm == null) return n3 != 0;
        if (n3 != 1) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public String a(J j2) {
        return "commands.stats.usage";
    }
}

