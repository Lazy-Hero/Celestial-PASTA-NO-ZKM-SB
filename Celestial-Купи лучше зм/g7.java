/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;
import net.minecraft.k.m;

public class g7 {
    private /* synthetic */ String a;
    private /* synthetic */ Class<?> b;

    private static NoSuchFieldException a(NoSuchFieldException noSuchFieldException) {
        return noSuchFieldException;
    }

    public void a(String string, Object object) throws NoSuchFieldException, IllegalAccessException {
        Class<?> class_ = this.b;
        Field field = class_.getDeclaredField(d6.c(class_, string));
        field.setAccessible(true);
        Field field2 = Field.class.getDeclaredField("modifiers");
        field2.setAccessible(true);
        String[] arrstring = al.c();
        field2.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        String[] arrstring2 = arrstring;
        field.set(null, object);
        if (arrstring2 != null) {
            m.b(!m.c());
        }
    }

    public g7(String string) {
        try {
            this.b = Class.forName(d6.a(string));
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }
}

