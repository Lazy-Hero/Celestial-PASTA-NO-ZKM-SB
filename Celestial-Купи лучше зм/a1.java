/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.k.m;

public class a1 {
    private static final /* synthetic */ File b;
    public static /* synthetic */ ArrayList<c_> a;

    public a1() {
        a.add(new c3("alts", true));
        a.add(new cb("macro", true));
        String string = c_.d();
        a.add(new cm("friends", true));
        String string2 = string;
        if (string2 != null) {
            m.b(!m.c());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public c_ a(Class class_) {
        c_ c_2;
        block1: {
            Iterator<c_> iterator = a.iterator();
            String string = c_.d();
            do {
                if (iterator.hasNext()) continue;
                return null;
            } while ((c_2 = iterator.next()).getClass() != class_);
            if (!m.c()) break block1;
            c_.b("Xx3jec");
        }
        return c_2;
    }

    static {
        a = new ArrayList();
        b = new File(cj.e);
    }

    public void a() {
        Iterator<c_> iterator = a.iterator();
        String string = c_.d();
        while (iterator.hasNext()) {
            block6: {
                c_ c_2;
                block5: {
                    c_ c_3 = iterator.next();
                    c_2 = c_3;
                    if (string != null) break block5;
                    if (!c_.a(c_2)) break block6;
                    c_2 = c_3;
                }
                try {
                    c_2.e();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            if (string == null) continue;
        }
    }

    static File c() {
        return b;
    }

    public void b() {
        Iterator<c_> iterator = a.iterator();
        String string = c_.d();
        while (iterator.hasNext()) {
            c_ c_2 = iterator.next();
            try {
                c_2.b();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (string == null) continue;
        }
    }
}

