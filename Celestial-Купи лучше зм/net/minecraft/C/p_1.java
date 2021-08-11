/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 */
package net.minecraft.C;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.C.D;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.C.q;
import net.minecraft.C.r;
import net.minecraft.C.s;
import net.minecraft.C.t;
import org.apache.logging.log4j.LogManager;

public class p
extends Enum<p> {
    public static final /* synthetic */ /* enum */ p HANDSHAKING;
    private final /* synthetic */ int d;
    private static final /* synthetic */ Map<Class<? extends K<?>>, p> c;
    public static final /* synthetic */ /* enum */ p STATUS;
    private static final /* synthetic */ p[] a;
    public static final /* synthetic */ /* enum */ p PLAY;
    public static final /* synthetic */ /* enum */ p LOGIN;
    private final /* synthetic */ Map<D, BiMap<Integer, Class<? extends K<?>>>> e;
    private static final /* synthetic */ p[] b;

    p(int n3, q q2) {
        this(n3);
    }

    public static p a(K<?> k2) {
        return c.get(k2.getClass());
    }

    protected p a(D d10, Class<? extends K<?>> class_) {
        HashBiMap hashBiMap = this.e.get((Object)d10);
        if (hashBiMap == null) {
            hashBiMap = HashBiMap.create();
            this.e.put(d10, (BiMap<Integer, Class<K<?>>>)hashBiMap);
        }
        if (hashBiMap.containsValue(class_)) {
            String string = (Object)((Object)d10) + " packet " + class_ + " is already known to ID " + hashBiMap.inverse().get(class_);
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        hashBiMap.put((Object)hashBiMap.size(), class_);
        return this;
    }

    private p(int n3) {
        this.e = Maps.newEnumMap(D.class);
        this.d = n3;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    static {
        HANDSHAKING = new q(-1);
        PLAY = new r(0);
        STATUS = new s(1);
        LOGIN = new t(2);
        a = new p[]{HANDSHAKING, PLAY, STATUS, LOGIN};
        b = new p[4];
        c = Maps.newHashMap();
        for (p p2 : p.values()) {
            int n2 = p2.a();
            if (n2 < -1 || n2 > 2) {
                throw new Error("Invalid protocol ID " + n2);
            }
            p.b[n2 - -1] = p2;
            for (D d10 : p2.e.keySet()) {
                for (Class class_ : p2.e.get((Object)d10).values()) {
                    if (c.containsKey(class_) && c.get(class_) != p2) {
                        throw new Error("Packet " + class_ + " is already assigned to protocol " + (Object)((Object)c.get(class_)) + " - can't reassign to " + (Object)((Object)p2));
                    }
                    try {
                        class_.newInstance();
                    }
                    catch (Throwable throwable) {
                        throw new Error("Packet " + class_ + " fails instantiation checks! " + class_);
                    }
                    c.put(class_, p2);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public K<?> a(D d10, int n2) throws InstantiationException, IllegalAccessException {
        Class class_ = (Class)this.e.get((Object)d10).get((Object)n2);
        int n3 = m.h();
        Class class_2 = class_;
        if (n3 != 0) {
            if (class_2 == null) {
                return null;
            }
            class_2 = class_.newInstance();
        }
        K k2 = (K)((Object)class_2);
        return k2;
    }

    public int a() {
        return this.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static p a(int n2) {
        int n3 = m.h();
        int n4 = n2;
        int n5 = -1;
        if (n3 != 0) {
            if (n4 < n5) return null;
            n4 = n2;
            n5 = 2;
        }
        if (n4 > n5) return null;
        p p2 = b[n2 - -1];
        return p2;
    }

    public static p[] values() {
        return (p[])a.clone();
    }

    public Integer a(D d10, K<?> k2) throws Exception {
        return (Integer)this.e.get((Object)d10).inverse().get(k2.getClass());
    }
}

