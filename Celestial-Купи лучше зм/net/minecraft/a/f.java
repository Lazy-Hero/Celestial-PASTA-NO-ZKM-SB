/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.a.b;
import net.minecraft.a.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f
extends b<GameProfile> {
    private final /* synthetic */ boolean c;
    private final /* synthetic */ int b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(JsonObject var1_1) {
        var2_2 = k.q();
        if (this.a() == null) return;
        v0 = ((GameProfile)this.a()).getId();
        if (var2_2) ** GOTO lbl9
        if (v0 == null) {
            v1 = "";
        } else {
            v0 = ((GameProfile)this.a()).getId();
lbl9:
            // 2 sources

            v1 = v0.toString();
        }
        var1_1.addProperty("uuid", v1);
        var1_1.addProperty("name", ((GameProfile)this.a()).getName());
        super.a(var1_1);
        var1_1.addProperty("level", (Number)this.b);
        var1_1.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.c));
    }

    public f(GameProfile gameProfile, int n2, boolean bl2) {
        super(gameProfile);
        this.b = n2;
        this.c = bl2;
    }

    private static GameProfile a(JsonObject jsonObject) {
        block4: {
            UUID uUID;
            String string;
            JsonObject jsonObject2;
            block5: {
                boolean bl2;
                block3: {
                    boolean bl3 = k.t();
                    bl2 = jsonObject.has("uuid");
                    if (!bl3) break block3;
                    if (!bl2) break block4;
                    jsonObject2 = jsonObject;
                    string = "name";
                    if (!bl3) break block5;
                    bl2 = jsonObject2.has(string);
                }
                if (!bl2) break block4;
                jsonObject2 = jsonObject;
                string = "uuid";
            }
            String string2 = jsonObject2.get(string).getAsString();
            try {
                uUID = UUID.fromString(string2);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }

    public int b() {
        return this.b;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    public f(JsonObject var1_1) {
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
    public boolean a() {
        return this.c;
    }
}

