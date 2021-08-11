/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.c;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.ar.Z;
import net.minecraft.c.a;
import net.minecraft.c.b;
import net.minecraft.c.e;
import net.minecraft.c.g;
import net.minecraft.c.i;
import net.minecraft.c.l;
import net.minecraft.c.n;
import net.minecraft.c.p;
import net.minecraft.k.m;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f {
    private final /* synthetic */ Throwable b;
    private final /* synthetic */ l i;
    private /* synthetic */ StackTraceElement[] e;
    private /* synthetic */ boolean c;
    private static final /* synthetic */ Logger d;
    private /* synthetic */ File g;
    private final /* synthetic */ String h;
    private /* synthetic */ boolean f;
    private final /* synthetic */ List<l> a;

    public f(String string, Throwable throwable) {
        this.i = new l(this, "System Details");
        this.a = Lists.newArrayList();
        this.f = true;
        this.e = new StackTraceElement[0];
        this.c = false;
        this.h = string;
        this.b = throwable;
        this.e();
    }

    public l a() {
        return this.i;
    }

    public File c() {
        return this.g;
    }

    static {
        d = LogManager.getLogger();
    }

    public String h() {
        return this.h;
    }

    public void a(StringBuilder stringBuilder) {
        block12: {
            f f10;
            String string;
            block18: {
                block11: {
                    StackTraceElement[] arrstackTraceElement;
                    block15: {
                        block17: {
                            block16: {
                                block13: {
                                    block14: {
                                        string = l.b();
                                        f10 = this;
                                        if (string != null) break block13;
                                        if (f10.e == null) break block14;
                                        arrstackTraceElement = this.e;
                                        if (string != null) break block15;
                                        if (arrstackTraceElement.length > 0) break block16;
                                    }
                                    f10 = this;
                                }
                                if (string != null) break block17;
                                if (!f10.a.isEmpty()) {
                                    this.e = (StackTraceElement[])ArrayUtils.subarray((Object[])this.a.get(0).a(), (int)0, (int)1);
                                }
                            }
                            f10 = this;
                        }
                        if (string != null) break block18;
                        arrstackTraceElement = f10.e;
                    }
                    if (arrstackTraceElement == null) break block11;
                    f10 = this;
                    if (string != null) break block18;
                    if (f10.e.length > 0) {
                        stringBuilder.append("-- Head --\n");
                        stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
                        stringBuilder.append("Stacktrace:\n");
                        for (StackTraceElement stackTraceElement : this.e) {
                            stringBuilder.append("\t").append("at ").append(stackTraceElement);
                            stringBuilder.append("\n");
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block11;
                        }
                        stringBuilder.append("\n");
                    }
                }
                f10 = this;
            }
            for (l l2 : f10.a) {
                l2.a(stringBuilder);
                stringBuilder.append("\n\n");
                if (string == null) {
                    if (string == null) continue;
                }
                break block12;
            }
            this.i.a(stringBuilder);
        }
    }

    public Throwable d() {
        return this.b;
    }

    public static f a(Throwable throwable, String string) {
        f f10;
        block4: {
            block3: {
                Throwable throwable2;
                String string2;
                block2: {
                    string2 = l.b();
                    throwable2 = throwable;
                    if (string2 != null) break block2;
                    if (!(throwable2 instanceof Z)) break block3;
                    throwable2 = throwable;
                }
                f10 = ((Z)throwable2).a();
                if (string2 == null) break block4;
            }
            f10 = new f(string, throwable);
        }
        return f10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(File file) {
        boolean bl3;
        block10: {
            File file2;
            block9: {
                String string = l.b();
                file2 = this.g;
                if (string == null) {
                    if (file2 != null) {
                        return false;
                    }
                    file2 = file.getParentFile();
                }
                if (string != null) break block9;
                if (file2 == null) break block10;
                file2 = file.getParentFile();
            }
            file2.mkdirs();
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            boolean bl4;
            boolean bl5;
            outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8);
            outputStreamWriter.write(this.f());
            this.g = file;
            bl3 = bl5 = (bl4 = true);
        }
        catch (Throwable throwable) {
            boolean bl2;
            try {
                d.error("Could not save crash report to {}", (Object)file, (Object)throwable);
                bl2 = false;
            }
            catch (Throwable throwable2) {
                IOUtils.closeQuietly(outputStreamWriter);
                throw throwable2;
            }
            IOUtils.closeQuietly((Writer)outputStreamWriter);
            return bl2;
        }
        IOUtils.closeQuietly((Writer)outputStreamWriter);
        return bl3;
    }

    public l a(String string) {
        return this.a(string, 1);
    }

    public String f() {
        StringBuilder stringBuilder;
        block6: {
            String string;
            block8: {
                f f10;
                block7: {
                    string = l.b();
                    f10 = this;
                    if (string != null) break block7;
                    if (f10.c) break block8;
                    this.c = true;
                    f10 = this;
                }
                cr.a(f10, this.i);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("---- Minecraft Crash Report ----\n");
            cq.d(cq.em, stringBuilder);
            cq.d(cq.cj, stringBuilder);
            stringBuilder.append("// ");
            stringBuilder.append(net.minecraft.c.f.b());
            stringBuilder.append("\n\n");
            stringBuilder.append("Time: ");
            stringBuilder.append(new SimpleDateFormat().format(new Date()));
            stringBuilder.append("\n");
            stringBuilder.append("Description: ");
            stringBuilder.append(this.h);
            stringBuilder.append("\n\n");
            stringBuilder.append(this.g());
            stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
            for (int i2 = 0; i2 < 87; ++i2) {
                stringBuilder.append("-");
                if (string == null) {
                    if (string == null) continue;
                    m.b(!m.c());
                    break;
                }
                break block6;
            }
            stringBuilder.append("\n\n");
            this.a(stringBuilder);
        }
        return stringBuilder.toString();
    }

    private void e() {
        block3: {
            Object object;
            block2: {
                this.i.a("Minecraft Version", new n(this));
                this.i.a("Operating System", new p(this));
                this.i.a("Java Version", new g(this));
                this.i.a("Java VM Version", new a(this));
                String string = l.b();
                this.i.a("Memory", new i(this));
                String string2 = string;
                this.i.a("JVM Flags", new b(this));
                this.i.a("IntCache", new e(this));
                object = cq.aO;
                if (string2 != null) break block2;
                if (!((ak)object).b()) break block3;
                object = cq.d(cq.a2, new Object[0]);
            }
            ak ak2 = object;
            cq.e((Object)ak2, cq.aO, this, this.i);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String b() {
        String[] arrstring = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    public l a(String string, int n2) {
        l l2;
        block7: {
            boolean bl2;
            block8: {
                block16: {
                    int n3;
                    int n4;
                    int n5;
                    StackTraceElement[] arrstackTraceElement;
                    String string2;
                    block18: {
                        block17: {
                            StackTraceElement[] arrstackTraceElement2;
                            int n6;
                            block15: {
                                block13: {
                                    Object object;
                                    block14: {
                                        int n7;
                                        block12: {
                                            StackTraceElement stackTraceElement;
                                            StackTraceElement stackTraceElement2;
                                            block9: {
                                                StackTraceElement[] arrstackTraceElement3;
                                                block11: {
                                                    int n8;
                                                    int n9;
                                                    block10: {
                                                        l2 = new l(this, string);
                                                        string2 = l.b();
                                                        bl2 = this.f;
                                                        if (string2 != null) break block7;
                                                        if (!bl2) break block8;
                                                        n6 = l2.b(n2);
                                                        arrstackTraceElement = this.b.getStackTrace();
                                                        stackTraceElement2 = null;
                                                        stackTraceElement = null;
                                                        n5 = arrstackTraceElement.length - n6;
                                                        if (n5 < 0) {
                                                            System.out.println("Negative index in crash report handler (" + arrstackTraceElement.length + "/" + n6 + ")");
                                                        }
                                                        if (arrstackTraceElement == null) break block9;
                                                        n9 = 0;
                                                        n8 = n5;
                                                        if (string2 != null) break block10;
                                                        if (n9 > n8) break block9;
                                                        n9 = n5;
                                                        n8 = arrstackTraceElement.length;
                                                    }
                                                    if (n9 >= n8) break block9;
                                                    stackTraceElement2 = arrstackTraceElement[n5];
                                                    arrstackTraceElement3 = arrstackTraceElement;
                                                    if (string2 != null) break block11;
                                                    if (arrstackTraceElement3.length + 1 - n6 >= arrstackTraceElement.length) break block9;
                                                    arrstackTraceElement3 = arrstackTraceElement;
                                                }
                                                stackTraceElement = arrstackTraceElement3[arrstackTraceElement.length + 1 - n6];
                                            }
                                            this.f = l2.a(stackTraceElement2, stackTraceElement);
                                            n7 = n6;
                                            if (string2 != null) break block12;
                                            if (n7 <= 0) break block13;
                                            object = this.a;
                                            if (string2 != null) break block14;
                                            n7 = object.isEmpty() ? 1 : 0;
                                        }
                                        if (n7 != 0) break block13;
                                        object = this.a.get(this.a.size() - 1);
                                    }
                                    l l3 = (l)object;
                                    l3.a(n6);
                                    if (string2 == null) break block8;
                                }
                                arrstackTraceElement2 = arrstackTraceElement;
                                if (string2 != null) break block15;
                                if (arrstackTraceElement2 == null) break block16;
                                arrstackTraceElement2 = arrstackTraceElement;
                            }
                            n4 = arrstackTraceElement2.length;
                            n3 = n6;
                            if (string2 != null) break block17;
                            if (n4 < n3) break block16;
                            n4 = 0;
                            n3 = n5;
                        }
                        if (string2 != null) break block18;
                        if (n4 > n3) break block16;
                        n4 = n5;
                        n3 = arrstackTraceElement.length;
                    }
                    if (n4 >= n3) break block16;
                    this.e = new StackTraceElement[n5];
                    System.arraycopy(arrstackTraceElement, 0, this.e, 0, this.e.length);
                    if (string2 == null) break block8;
                }
                this.f = false;
            }
            bl2 = this.a.add(l2);
        }
        return l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String g() {
        String string;
        Throwable throwable;
        PrintWriter printWriter;
        StringWriter stringWriter;
        block6: {
            block7: {
                Throwable throwable2;
                block13: {
                    block10: {
                        boolean bl2;
                        block11: {
                            String string2;
                            block12: {
                                block8: {
                                    block9: {
                                        stringWriter = null;
                                        string2 = l.b();
                                        printWriter = null;
                                        throwable = this.b;
                                        string = throwable.getMessage();
                                        if (string2 != null) break block6;
                                        if (string != null) break block7;
                                        bl2 = throwable instanceof NullPointerException;
                                        if (string2 != null) break block8;
                                        if (!bl2) break block9;
                                        throwable = new NullPointerException(this.h);
                                        if (string2 == null) break block10;
                                    }
                                    bl2 = throwable instanceof StackOverflowError;
                                }
                                if (string2 != null) break block11;
                                if (!bl2) break block12;
                                throwable = new StackOverflowError(this.h);
                                if (string2 == null) break block10;
                            }
                            throwable2 = throwable;
                            if (string2 != null) break block13;
                            bl2 = throwable2 instanceof OutOfMemoryError;
                        }
                        if (bl2) {
                            throwable = new OutOfMemoryError(this.h);
                        }
                    }
                    throwable2 = throwable;
                }
                throwable2.setStackTrace(this.b.getStackTrace());
            }
            string = throwable.toString();
        }
        String string3 = string;
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string3 = stringWriter.toString();
        }
        catch (Throwable throwable3) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable3;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string3;
    }
}

