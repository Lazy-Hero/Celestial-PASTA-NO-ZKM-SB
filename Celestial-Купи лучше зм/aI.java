/*
 * Decompiled with CFR 0.150.
 */
public class aI {
    private /* synthetic */ Class b;
    private /* synthetic */ String a;
    private /* synthetic */ boolean c;

    public boolean c() {
        return this.b() != null;
    }

    public Class b() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(Object object) {
        String string = K.d();
        Class class_ = this.b();
        if (string == null) {
            if (class_ == null) return false;
            class_ = this.b();
        }
        boolean bl2 = class_.isInstance(object);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public ak a(String string) {
        return new ak(this, string);
    }

    public aI(String string, boolean bl2) {
        this.a = null;
        this.c = false;
        this.b = null;
        this.a = string;
        if (!bl2) {
            Class class_ = this.b();
        }
    }

    public K b(String string) {
        return new K(this, string);
    }

    public ak a(String string, Class[] arrclass) {
        return new ak(this, string, arrclass);
    }

    public aI(Class class_) {
        this.a = null;
        this.c = false;
        this.b = null;
        this.b = class_;
        this.a = class_.getName();
        this.c = true;
    }

    public aI(String string) {
        this(string, false);
    }

    public ak a(String string, Class[] arrclass, boolean bl2) {
        return new ak(this, string, arrclass, bl2);
    }
}

