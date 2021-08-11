/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.aq;

import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import net.minecraft.aq.a;
import net.minecraft.aq.b;
import net.minecraft.aq.c;
import net.minecraft.k.m;

public class d {
    private final /* synthetic */ URL g;
    private /* synthetic */ boolean a;
    private final /* synthetic */ Timer b;
    private final /* synthetic */ Object d;
    private /* synthetic */ int i;
    private final /* synthetic */ Map<String, Object> j;
    private final /* synthetic */ Map<String, Object> c;
    private final /* synthetic */ long f;
    private final /* synthetic */ c e;
    private final /* synthetic */ String h;

    static Map d(d d10) {
        return d10.j;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, Object object) {
        Object object2 = this.d;
        synchronized (object2) {
            this.j.put(string, object);
        }
    }

    public void b() {
        block3: {
            d d10;
            block2: {
                int n2 = net.minecraft.aq.b.f();
                d10 = this;
                if (n2 == 0) break block2;
                if (d10.a) break block3;
                this.a = true;
                this.i();
                d10 = this;
            }
            d10.b.schedule((TimerTask)new a(this), 0L, 900000L);
        }
    }

    private void i() {
        this.a();
        this.b("snooper_token", this.h);
        this.a("snooper_token", this.h);
        this.a("os_name", System.getProperty("os.name"));
        this.a("os_version", System.getProperty("os.version"));
        this.a("os_architecture", System.getProperty("os.arch"));
        this.a("java_version", System.getProperty("java.version"));
        this.b("version", "1.12.2");
        this.e.a(this);
    }

    public long f() {
        return this.f;
    }

    static String e(d d10) {
        return d10.h;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static Object g(d d10) {
        return d10.d;
    }

    static int b(d d10) {
        return d10.i;
    }

    public boolean e() {
        return this.a;
    }

    private void a() {
        block3: {
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            List<String> list = runtimeMXBean.getInputArguments();
            int n2 = 0;
            Iterator<String> iterator = list.iterator();
            int n3 = net.minecraft.aq.b.b();
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (n3 == 0) {
                    if (string.startsWith("-X")) {
                        this.b("jvm_arg[" + n2++ + "]", string);
                    }
                    if (n3 == 0) continue;
                }
                break block3;
            }
            this.b("jvm_args", n2);
        }
    }

    static URL a(d d10) {
        return d10.g;
    }

    public d(String string, c c10, long l2) {
        int n2 = net.minecraft.aq.b.f();
        int n3 = n2;
        this.j = Maps.newHashMap();
        this.c = Maps.newHashMap();
        this.h = UUID.randomUUID().toString();
        this.b = new Timer("Snooper Timer", true);
        this.d = new Object();
        try {
            this.g = new URL("http://snoop.minecraft.net/" + string + "?version=" + 2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.e = c10;
        this.f = l2;
        if (n3 == 0) {
            m.b(!m.d());
        }
    }

    static Map h(d d10) {
        return d10.c;
    }

    static c f(d d10) {
        return d10.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map<String, String> c() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        int n2 = net.minecraft.aq.b.f();
        Object object = this.d;
        synchronized (object) {
            LinkedHashMap linkedHashMap2;
            block10: {
                Object object2;
                Map.Entry<String, Object> entry;
                Iterator<Map.Entry<String, Object>> iterator;
                block9: {
                    this.h();
                    iterator = this.j.entrySet().iterator();
                    while (iterator.hasNext()) {
                        entry = iterator.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        if (n2 != 0) {
                            if (n2 != 0) continue;
                        }
                        break block9;
                    }
                    iterator = this.c.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    entry = iterator.next();
                    linkedHashMap2 = linkedHashMap;
                    object2 = entry.getKey();
                    if (n2 != 0) {
                        linkedHashMap2.put(object2, entry.getValue().toString());
                        if (n2 != 0) continue;
                    }
                    break block10;
                }
                linkedHashMap2 = linkedHashMap;
                object2 = object;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            if (!m.d()) {
                net.minecraft.aq.b.b(++n2);
            }
            return linkedHashMap2;
        }
    }

    public String g() {
        return this.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(String string, Object object) {
        Object object2 = this.d;
        synchronized (object2) {
            this.c.put(string, object);
        }
    }

    public void d() {
        this.b.cancel();
    }

    static int c(d d10) {
        return d10.i++;
    }

    public void h() {
        this.a("memory_total", Runtime.getRuntime().totalMemory());
        this.a("memory_max", Runtime.getRuntime().maxMemory());
        this.a("memory_free", Runtime.getRuntime().freeMemory());
        this.a("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.e.b(this);
    }
}

