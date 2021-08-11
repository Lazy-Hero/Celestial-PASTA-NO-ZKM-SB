/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;

public class gL
implements hE {
    private /* synthetic */ String b;
    private /* synthetic */ aI a;

    private Field a(Class class_, String string) throws NoSuchFieldException {
        Field field;
        block5: {
            Field[] arrfield = class_.getDeclaredFields();
            int n2 = 0;
            String string2 = K.d();
            while (n2 < arrfield.length) {
                Field field2 = arrfield[n2];
                if (string2 == null) {
                    field = field2;
                    if (string2 != null) break block5;
                    if (field.getName().equals(string)) {
                        return field2;
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
            if (class_ == Object.class) {
                throw new NoSuchFieldException(string);
            }
            field = this.a(class_.getSuperclass(), string);
        }
        return field;
    }

    public gL(aI aI2, String string) {
        this.a = null;
        this.b = null;
        this.a = aI2;
        this.b = string;
    }

    @Override
    public Field a() {
        Class class_ = this.a.b();
        if (class_ == null) {
            return null;
        }
        try {
            Field field = this.a(class_, this.b);
            field.setAccessible(true);
            return field;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

