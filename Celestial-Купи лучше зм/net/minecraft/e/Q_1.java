/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.E;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.aq.e;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Q
extends K {
    private /* synthetic */ long e;
    private static final /* synthetic */ Logger f;
    private /* synthetic */ int d;

    private static String b() {
        String[] arrstring = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    @Override
    public String a() {
        return "debug";
    }

    static {
        f = LogManager.getLogger();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(long l2, int n2, b b10) {
        File file = new File(b10.f("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8);
            outputStreamWriter.write(this.b(l2, n2, b10));
        }
        catch (Throwable throwable) {
            try {
                f.error("Could not save profiler results to {}", (Object)file, (Object)throwable);
            }
            catch (Throwable throwable2) {
                IOUtils.closeQuietly(outputStreamWriter);
                throw throwable2;
            }
            IOUtils.closeQuietly((Writer)outputStreamWriter);
        }
        IOUtils.closeQuietly((Writer)outputStreamWriter);
    }

    @Override
    public String a(J j2) {
        return "commands.debug.usage";
    }

    private void a(int n2, String string, StringBuilder stringBuilder, b b10) {
        block11: {
            int n3;
            m[] arrm;
            List<e> list;
            block12: {
                List<e> list2;
                block10: {
                    list = b10.J.c(string);
                    arrm = s.b();
                    list2 = list;
                    if (arrm == null) break block10;
                    if (list2 == null) break block11;
                    list2 = list;
                }
                int n4 = list2.size();
                if (arrm == null) break block12;
                if (n4 < 3) break block11;
                n4 = n3 = 1;
            }
            while (n3 < list.size()) {
                e e10;
                block9: {
                    e10 = list.get(n3);
                    stringBuilder.append(String.format("[%02d] ", n2));
                    for (int i2 = 0; i2 < n2; ++i2) {
                        stringBuilder.append("|   ");
                        if (arrm != null) {
                            if (arrm != null) continue;
                        }
                        break block9;
                    }
                    stringBuilder.append(e10.b).append(" - ").append(String.format("%.2f", e10.c)).append("%/").append(String.format("%.2f", e10.a)).append("%\n");
                }
                if (arrm != null) {
                    if (!"unspecified".equals(e10.b)) {
                        try {
                            this.a(n2 + 1, string + "." + e10.b, stringBuilder, b10);
                        }
                        catch (Exception exception) {
                            stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
                        }
                    }
                    ++n3;
                }
                if (arrm != null) continue;
            }
        }
    }

    @Override
    public int a() {
        return 3;
    }

    private String b(long l2, int n2, b b10) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(Q.b());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l2).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n2).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n2 / ((float)l2 / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", stringBuilder, b10);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block13: {
            int n2;
            m[] arrm;
            block11: {
                block12: {
                    arrm = s.b();
                    n2 = arrstring.length;
                    if (arrm != null) {
                        if (n2 < 1) {
                            throw new z("commands.debug.usage", new Object[0]);
                        }
                        n2 = "start".equals(arrstring[0]) ? 1 : 0;
                    }
                    if (arrm == null) break block11;
                    if (n2 == 0) break block12;
                    if (arrstring.length != 1) {
                        throw new z("commands.debug.usage", new Object[0]);
                    }
                    Q.a(j2, (F)this, "commands.debug.start", new Object[0]);
                    b10.D();
                    this.e = b.R();
                    this.d = b10.g();
                    if (arrm != null) break block13;
                }
                n2 = "stop".equals(arrstring[0]) ? 1 : 0;
            }
            if (arrm != null) {
                if (n2 == 0) {
                    throw new z("commands.debug.usage", new Object[0]);
                }
                n2 = arrstring.length;
            }
            if (arrm != null) {
                if (n2 != 1) {
                    throw new z("commands.debug.usage", new Object[0]);
                }
                n2 = b10.J.g ? 1 : 0;
            }
            if (n2 == 0) {
                throw new s("commands.debug.notStarted", new Object[0]);
            }
            long l2 = b.R();
            int n3 = b10.g();
            long l3 = l2 - this.e;
            int n4 = n3 - this.d;
            this.a(l3, n4, b10);
            b10.J.g = false;
            Q.a(j2, (F)this, "commands.debug.stop", String.format("%.2f", Float.valueOf((float)l3 / 1000.0f)), n4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        m[] arrm = s.b();
        String[] arrstring2 = arrstring;
        if (arrm != null) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = Q.a(arrstring2, "start", "stop");
        return list;
    }
}

