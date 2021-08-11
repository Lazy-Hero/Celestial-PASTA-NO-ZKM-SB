/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Constructor;

public class ar {
    private /* synthetic */ boolean a;
    private /* synthetic */ Class[] c;
    private /* synthetic */ Constructor d;
    private /* synthetic */ aI b;

    public Constructor a() {
        block6: {
            if (this.a) {
                return this.d;
            }
            this.a = true;
            Class class_ = this.b.b();
            if (class_ == null) {
                return null;
            }
            this.d = ar.a(class_, this.c);
            if (this.d != null) break block6;
            fU.b("(Reflector) Constructor not present: " + class_.getName() + ", params: " + fU.a(this.c));
        }
        try {
            if (this.d != null) {
                this.d.setAccessible(true);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.d;
    }

    public void c() {
        this.a = true;
        this.d = null;
    }

    public boolean b() {
        String string = K.d();
        ar ar2 = this;
        if (string == null) {
            if (ar2.a) {
                return this.d != null;
            }
            ar2 = this;
        }
        return ar2.a() != null;
    }

    public ar(aI aI2, Class[] arrclass) {
        this.b = null;
        this.c = null;
        this.a = false;
        this.d = null;
        this.b = aI2;
        this.c = arrclass;
        Constructor constructor = this.a();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Constructor a(Class class_, Class[] arrclass) {
        Constructor<?>[] arrconstructor = class_.getDeclaredConstructors();
        for (int i2 = 0; i2 < arrconstructor.length; ++i2) {
            Constructor<?> constructor = arrconstructor[i2];
            Class[] arrclass2 = constructor.getParameterTypes();
            if (!cq.a(arrclass, arrclass2)) continue;
            return constructor;
        }
        return null;
    }
}

