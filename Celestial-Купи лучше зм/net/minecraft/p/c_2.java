/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Optional
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.P;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Optional;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.W.K;
import net.minecraft.ae.a;
import net.minecraft.ar.aD;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.u.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class c {
    private static final /* synthetic */ Logger a;

    public static r a(r r2, net.minecraft.Z.i i2) {
        boolean bl2 = i.f();
        r r3 = r2;
        if (!bl2) {
            block4: {
                r3.a("Name", K.h.b(i2.b()).toString());
                if (!i2.a().isEmpty()) {
                    r r4 = new r();
                    for (Map.Entry entry : i2.a().entrySet()) {
                        a a10 = (a)entry.getKey();
                        r4.a(a10.c(), c.a(a10, (Comparable)entry.getValue()));
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block4;
                    }
                    r2.a("Properties", r4);
                }
            }
            r3 = r2;
        }
        return r3;
    }

    @VisibleForTesting
    public static boolean a(i i2, i i3, boolean bl2) {
        boolean bl3;
        block30: {
            block31: {
                int n2;
                block24: {
                    int n3;
                    boolean bl4;
                    block26: {
                        block27: {
                            boolean bl5;
                            block23: {
                                bl4 = i.f();
                                i i4 = i2;
                                if (!bl4) {
                                    if (i4 == i3) {
                                        return true;
                                    }
                                    i4 = i2;
                                }
                                if (!bl4) {
                                    if (i4 == null) {
                                        return true;
                                    }
                                    i4 = i3;
                                }
                                if (!bl4) {
                                    if (i4 == null) {
                                        return false;
                                    }
                                    i4 = i2;
                                }
                                bl3 = i4.getClass().equals(i3.getClass());
                                if (!bl4) {
                                    if (!bl3) {
                                        return false;
                                    }
                                    bl3 = i2 instanceof r;
                                }
                                if (bl4) break block26;
                                if (!bl3) break block27;
                                r r2 = (r)i2;
                                r r3 = (r)i3;
                                for (String string : r2.d()) {
                                    block29: {
                                        boolean bl6;
                                        block28: {
                                            i i5 = r2.g(string);
                                            bl5 = c.a(i5, r3.g(string), bl2);
                                            if (bl4) break block23;
                                            if (bl4) break block28;
                                            if (bl5) break block29;
                                            bl6 = false;
                                        }
                                        return bl6;
                                    }
                                    if (!bl4) continue;
                                }
                                bl5 = true;
                            }
                            return bl5;
                        }
                        bl3 = i2 instanceof u;
                    }
                    if (bl4) break block30;
                    if (!bl3) break block31;
                    bl3 = bl2;
                    if (bl4) break block30;
                    if (!bl3) break block31;
                    u u2 = (u)i2;
                    u u3 = (u)i3;
                    int n4 = u2.c();
                    if (!bl4) {
                        if (n4 != 0) {
                            return u3.c();
                        }
                        n4 = n3 = 0;
                    }
                    while (n3 < u2.b()) {
                        block33: {
                            boolean bl7;
                            block32: {
                                block25: {
                                    i i6 = u2.b(n3);
                                    boolean bl8 = false;
                                    n2 = 0;
                                    if (bl4) break block24;
                                    for (int i7 = v117289; i7 < u3.b(); ++i7) {
                                        bl7 = c.a(i6, u3.b(i7), bl2);
                                        if (!bl4) {
                                            if (!bl4) {
                                                if (!bl7) continue;
                                                boolean bl9 = bl8 = true;
                                            }
                                            if (!bl4) break;
                                            if (!bl4) continue;
                                        }
                                        break block25;
                                    }
                                    bl7 = bl8;
                                }
                                if (bl4) break block32;
                                if (bl7) break block33;
                                bl7 = false;
                            }
                            return bl7;
                        }
                        ++n3;
                        if (!bl4) continue;
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            bl3 = i2.equals(i3);
        }
        return bl3;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        a = LogManager.getLogger();
    }

    public static net.minecraft.Z.i b(r r2) {
        net.minecraft.Z.i i2;
        block8: {
            String string;
            r r3;
            K k2;
            boolean bl2;
            block7: {
                bl2 = i.a();
                Object object = r2;
                if (bl2) {
                    if (!((r)object).a("Name", 8)) {
                        return g.bf.d();
                    }
                    object = K.h.a(new v(r2.j("Name")));
                }
                k2 = (K)object;
                i2 = k2.d();
                r3 = r2;
                string = "Properties";
                if (!bl2) break block7;
                if (!r3.a(string, 10)) break block8;
                r3 = r2;
                string = "Properties";
            }
            r r4 = r3.h(string);
            net.minecraft.Z.c c10 = k2.i();
            for (String string2 : r4.d()) {
                a<?> a10 = c10.a(string2);
                if (a10 != null) {
                    i2 = c.a(i2, a10, string2, r4, r2);
                }
                if (bl2) continue;
            }
        }
        return i2;
    }

    private static <T extends Comparable<T>> net.minecraft.Z.i a(net.minecraft.Z.i i2, a<T> a10, String string, r r2, r r3) {
        Optional<T> optional = a10.a(r2.j(string));
        boolean bl2 = i.a();
        if (bl2) {
            if (optional.isPresent()) {
                return i2.a(a10, (Comparable)optional.get());
            }
            a.warn("Unable to read property: {} with value: {} for blockstate: {}", (Object)string, (Object)r2.j(string), (Object)r3.toString());
        }
        return i2;
    }

    public static r a(r r2, GameProfile gameProfile) {
        block10: {
            boolean bl2 = i.f();
            GameProfile gameProfile2 = gameProfile;
            if (!bl2) {
                if (!aD.a(gameProfile2.getName())) {
                    r2.a("Name", gameProfile.getName());
                }
                gameProfile2 = gameProfile;
            }
            if (!bl2) {
                if (gameProfile2.getId() != null) {
                    r2.a("Id", gameProfile.getId().toString());
                }
                gameProfile2 = gameProfile;
            }
            if (!gameProfile2.getProperties().isEmpty()) {
                r r3 = new r();
                Iterator iterator = gameProfile.getProperties().keySet().iterator();
                block0: while (true) {
                    boolean bl3 = iterator.hasNext();
                    block1: while (bl3) {
                        String string = (String)iterator.next();
                        u u2 = new u();
                        if (bl2) break block10;
                        for (Property property : gameProfile.getProperties().get((Object)string)) {
                            r r4 = new r();
                            r4.a("Value", property.getValue());
                            if (!bl2) {
                                bl3 = property.hasSignature();
                                if (bl2) continue block1;
                                if (bl3) {
                                    r4.a("Signature", property.getSignature());
                                }
                                u2.a(r4);
                            }
                            if (!bl2) continue;
                        }
                        r3.a(string, u2);
                        if (!bl2) continue block0;
                    }
                    break;
                }
                r2.a("Properties", r3);
            }
        }
        return r2;
    }

    public static r a(UUID uUID) {
        r r2 = new r();
        r2.a("M", uUID.getMostSignificantBits());
        r2.a("L", uUID.getLeastSignificantBits());
        return r2;
    }

    public static n d(r r2) {
        return new n(r2.m("X"), r2.m("Y"), r2.m("Z"));
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public static GameProfile a(r var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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

    private static <T extends Comparable<T>> String a(a<T> a10, Comparable<?> comparable) {
        return a10.a(comparable);
    }

    public static UUID c(r r2) {
        return new UUID(r2.o("M"), r2.o("L"));
    }

    public static r a(n n2) {
        r r2 = new r();
        r2.b("X", n2.e());
        r2.b("Y", n2.b());
        r2.b("Z", n2.a());
        return r2;
    }
}

