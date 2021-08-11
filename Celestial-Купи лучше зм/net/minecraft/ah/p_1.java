/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.ah.G;
import net.minecraft.ah.H;
import net.minecraft.ah.I;
import net.minecraft.ah.J;
import net.minecraft.ah.z;

public enum p {
    OVERWORLD(0, "overworld", "", J.class),
    NETHER(-1, "the_nether", "_nether", I.class),
    THE_END(1, "the_end", "_end", H.class);

    private final /* synthetic */ String d;
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Class<? extends G> e;

    public static p a(int n2) {
        p[] arrp = p.values();
        int n3 = arrp.length;
        String string = z.I();
        int n4 = 0;
        while (n4 < n3) {
            p p2 = arrp[n4];
            if (string != null) {
                if (p2.a() == n2) {
                    return p2;
                }
                ++n4;
            }
            if (string != null) continue;
        }
        throw new IllegalArgumentException("Invalid dimension id " + n2);
    }

    public String d() {
        return this.b;
    }

    public G c() {
        try {
            Constructor<? extends G> constructor = this.e.getConstructor(new Class[0]);
            return constructor.newInstance(new Object[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new Error("Could not create new dimension", noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new Error("Could not create new dimension", invocationTargetException);
        }
        catch (InstantiationException instantiationException) {
            throw new Error("Could not create new dimension", instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new Error("Could not create new dimension", illegalAccessException);
        }
    }

    public int a() {
        return this.a;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private p(int n3, String string2, String string3, Class<? extends G> class_) {
        this.a = n3;
        this.d = string2;
        this.b = string3;
        this.e = class_;
    }

    public static p a(String string) {
        p[] arrp = p.values();
        int n2 = arrp.length;
        String string2 = z.I();
        int n3 = 0;
        while (n3 < n2) {
            p p2 = arrp[n3];
            if (string2 != null) {
                if (p2.b().equals(string)) {
                    return p2;
                }
                ++n3;
            }
            if (string2 != null) continue;
        }
        throw new IllegalArgumentException("Invalid dimension " + string);
    }

    public String b() {
        return this.d;
    }
}

