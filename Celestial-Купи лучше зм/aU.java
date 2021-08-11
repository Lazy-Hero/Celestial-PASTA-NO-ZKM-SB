/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import net.minecraft.k.m;

public class aU {
    @SerializedName(value="expires")
    private /* synthetic */ String a;
    @SerializedName(value="premium_name")
    private /* synthetic */ String c;
    private /* synthetic */ boolean d;
    private /* synthetic */ String b;

    public String a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        int n2 = hA.e();
        String string = String.format("LicenseData[%s:%s:%s:%s]", this.b, this.d, this.c, this.a);
        if (n2 != 0) {
            m.b(!m.c());
        }
        return string;
    }

    public String d() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2 = hA.e();
        Object object2 = object;
        if (n2 == 0) {
            if (!(object2 instanceof aU)) {
                return false;
            }
            object2 = object;
        }
        aU aU2 = (aU)object2;
        boolean bl2 = aU2.d().equals(this.d());
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = aU2.a().equals(this.a());
        }
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = aU2.c();
        }
        if (n2 == 0) {
            if (bl2 != this.c()) return false;
            bl2 = aU2.b().equals(this.b());
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

