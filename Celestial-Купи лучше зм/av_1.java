/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Method;
import net.minecraft.k.m;

class av {
    private final /* synthetic */ byte c;
    private final /* synthetic */ Object b;
    private final /* synthetic */ Method a;

    public byte a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Object b() {
        return this.b;
    }

    public av(Object object, Method method, byte by2) {
        String string = af.b();
        String string2 = string;
        this.b = object;
        this.a = method;
        this.c = by2;
        if (string2 != null) {
            m.b(!m.d());
        }
    }

    public Method c() {
        return this.a;
    }
}

