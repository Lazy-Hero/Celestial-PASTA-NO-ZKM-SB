/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;

public class K {
    private static /* synthetic */ String b;
    private /* synthetic */ boolean d;
    private /* synthetic */ hE a;
    private /* synthetic */ Field c;

    public Object b() {
        return cq.a(null, this);
    }

    public K(aI aI2, String string) {
        this(new gL(aI2, string));
    }

    public Field a() {
        block1: {
            if (this.d) {
                return this.c;
            }
            this.d = true;
            this.c = this.a.a();
            if (this.c == null) break block1;
            this.c.setAccessible(true);
        }
        return this.c;
    }

    public static String d() {
        return b;
    }

    public K(hE hE2, boolean bl2) {
        this.a = null;
        this.d = false;
        this.c = null;
        this.a = hE2;
        if (!bl2) {
            this.a();
        }
    }

    public K(hE hE2) {
        this(hE2, false);
    }

    public K(aI aI2, Class class_) {
        this(aI2, class_, 0);
    }

    static {
        if (K.d() != null) {
            K.b("rQFdL");
        }
    }

    public void a(Object object, Object object2) {
        cq.a(object, this, object2);
    }

    public K(aI aI2, String string, boolean bl2) {
        this(new gL(aI2, string), bl2);
    }

    public K(Field field) {
        this(new gF(field));
    }

    public void a(Object object) {
        cq.a(null, this, object);
    }

    public boolean c() {
        return this.a() != null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public K(aI aI2, Class class_, int n2) {
        this(new a3(aI2, class_, n2));
    }

    public static void b(String string) {
        b = string;
    }
}

