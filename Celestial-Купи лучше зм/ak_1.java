/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ak {
    private /* synthetic */ boolean b;
    private /* synthetic */ String d;
    private /* synthetic */ aI c;
    private /* synthetic */ Method a;
    private /* synthetic */ Class[] e;

    public ak(aI aI2, String string, Class[] arrclass) {
        this(aI2, string, arrclass, false);
    }

    public ak(aI aI2, String string, Class[] arrclass, boolean bl2) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = false;
        this.a = null;
        this.c = aI2;
        this.d = string;
        this.e = arrclass;
        if (!bl2) {
            Method method = this.c();
        }
    }

    public void d() {
        this.b = true;
        this.a = null;
    }

    public Method c() {
        if (this.b) {
            return this.a;
        }
        this.b = true;
        Class class_ = this.c.b();
        if (class_ == null) {
            return null;
        }
        try {
            if (this.e == null) {
                Method[] arrmethod = ak.a(class_, this.d);
                if (arrmethod.length <= 0) {
                    return null;
                }
                if (arrmethod.length > 1) {
                    for (Method method : arrmethod) {
                    }
                    return null;
                }
                this.a = arrmethod[0];
            } else {
                this.a = ak.a(class_, this.d, this.e);
            }
            if (this.a == null) {
                return null;
            }
            this.a.setAccessible(true);
            return this.a;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Method[] a(Class class_, String string) {
        ArrayList<Method> arrayList = new ArrayList<Method>();
        Method[] arrmethod = class_.getDeclaredMethods();
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            Method method = arrmethod[i2];
            if (!method.getName().equals(string)) continue;
            arrayList.add(method);
        }
        Method[] arrmethod2 = arrayList.toArray(new Method[arrayList.size()]);
        return arrmethod2;
    }

    public static Method a(Class class_, String string, Class[] arrclass) {
        Method[] arrmethod = class_.getDeclaredMethods();
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            Class[] arrclass2;
            Method method = arrmethod[i2];
            if (!method.getName().equals(string) || !cq.a(arrclass, arrclass2 = method.getParameterTypes())) continue;
            return method;
        }
        return null;
    }

    public ak(aI aI2, String string) {
        this(aI2, string, null, false);
    }

    public boolean b() {
        String string = K.d();
        ak ak2 = this;
        if (string == null) {
            if (ak2.b) {
                return this.a != null;
            }
            ak2 = this;
        }
        return ak2.c() != null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Class a() {
        Method method = this.c();
        String string = K.d();
        Method method2 = method;
        if (string == null) {
            if (method2 == null) {
                return null;
            }
            method2 = method;
        }
        Class<?> class_ = method2.getReturnType();
        return class_;
    }
}

