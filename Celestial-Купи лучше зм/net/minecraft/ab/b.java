/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.ab;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.ab.a;
import net.minecraft.k.m;
import org.apache.commons.io.IOUtils;

public class b {
    private final /* synthetic */ Map<String, String> a;
    private static final /* synthetic */ Pattern e;
    private static final /* synthetic */ Splitter c;
    private static final /* synthetic */ b d;
    private /* synthetic */ long b;

    public static synchronized void a(Map<String, String> map) {
        net.minecraft.ab.b.d.a.clear();
        m[] arrm = net.minecraft.ab.a.b();
        net.minecraft.ab.b.d.a.putAll(map);
        m[] arrm2 = arrm;
        net.minecraft.ab.b.d.b = System.currentTimeMillis();
        if (arrm2 != null) {
            m.b(!m.c());
        }
    }

    public long a() {
        return this.b;
    }

    static {
        e = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
        c = Splitter.on((char)'=').limit(2);
        d = new b();
    }

    public synchronized String a(String string, Object ... arrobject) {
        String string2 = this.b(string);
        m[] arrm = net.minecraft.ab.a.b();
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            String string3;
            block2: {
                string3 = "Format error: " + string2;
                if (m.d()) break block2;
                net.minecraft.ab.a.b(new m[1]);
            }
            return string3;
        }
    }

    public synchronized String c(String string) {
        return this.b(string);
    }

    public b() {
        this.a = Maps.newHashMap();
        try {
            InputStream inputStream = b.class.getResourceAsStream("/assets/minecraft/lang/en_us.lang");
            for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)StandardCharsets.UTF_8)) {
                String[] arrstring;
                if (string.isEmpty() || string.charAt(0) == '#' || (arrstring = (String[])Iterables.toArray((Iterable)c.split((CharSequence)string), String.class)) == null || arrstring.length != 2) continue;
                String string2 = arrstring[0];
                String string3 = e.matcher(arrstring[1]).replaceAll("%$1s");
                this.a.put(string2, string3);
            }
            this.b = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private String b(String string) {
        String string2 = this.a.get(string);
        m[] arrm = net.minecraft.ab.a.b();
        String string3 = string2;
        if (arrm == null) {
            string3 = string3 == null ? string : string2;
        }
        return string3;
    }

    public synchronized boolean a(String string) {
        return this.a.containsKey(string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static b b() {
        return d;
    }
}

