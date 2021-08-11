/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class cd {
    private /* synthetic */ int c;
    private /* synthetic */ Class b;
    private final /* synthetic */ ArrayDeque a;

    public synchronized Object a(int n2) {
        Object e10;
        block4: {
            Object e11;
            block5: {
                Object object;
                block2: {
                    block3: {
                        e11 = this.a.pollLast();
                        String string = K.d();
                        object = e11;
                        if (string != null) break block2;
                        if (object == null) break block3;
                        e10 = e11;
                        if (string != null) break block4;
                        if (Array.getLength(e10) >= n2) break block5;
                    }
                    object = Array.newInstance(this.b, n2);
                }
                e11 = object;
            }
            e10 = e11;
        }
        return e10;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public synchronized void a(Object object) {
        block6: {
            Class<?> class_;
            Object object2;
            String string;
            block5: {
                string = K.d();
                object2 = object;
                if (string != null) break block5;
                if (object2 == null) break block6;
                object2 = object;
            }
            if ((class_ = object2.getClass()).getComponentType() != this.b) {
                throw new IllegalArgumentException("Wrong component type");
            }
            int n2 = this.a.size();
            if (string == null && n2 < this.c) {
                n2 = this.a.add(object) ? 1 : 0;
            }
        }
    }

    public cd(Class class_, int n2) {
        this.b = null;
        this.c = 0;
        this.a = new ArrayDeque();
        this.b = class_;
        this.c = n2;
    }
}

