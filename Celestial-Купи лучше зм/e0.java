/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  org.lwjgl.input.Keyboard
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.k.m;
import org.lwjgl.input.Keyboard;

public class e0
extends e2 {
    private static /* synthetic */ boolean f;

    /*
     * Exception decompiling
     */
    @Override
    public void a(String ... var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 18[WHILELOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
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

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void lambda$execute$0(aN aN2) {
        cp.a((Object)ChatFormatting.GREEN + "Macro list: " + (Object)ChatFormatting.WHITE + "Macro Name: " + (Object)ChatFormatting.RED + aN2.c() + (Object)ChatFormatting.WHITE + ", Macro Bind: " + (Object)ChatFormatting.RED + Keyboard.getKeyName((int)aN2.e()));
    }

    public static void b(boolean bl2) {
        f = bl2;
    }

    public static boolean a() {
        boolean bl2 = e0.c();
        return !bl2;
    }

    public static boolean c() {
        return f;
    }

    public e0() {
        boolean bl2 = e0.c();
        super("macros", "macros", "\u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " add \u00a73<key> </home_home> | \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " del \u00a73<key> | \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " clear \u00a73| \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " list", "\u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " add \u00a73<key> </home_home> | \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " del \u00a73<key> | \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " clear | \u00a76.macro" + (Object)ChatFormatting.LIGHT_PURPLE + " list", "macro");
        boolean bl3 = bl2;
        if (bl3) {
            m.b(!m.d());
        }
    }

    static {
        if (!e0.a()) {
            e0.b(true);
        }
    }
}

