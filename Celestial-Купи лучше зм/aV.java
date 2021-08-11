/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class aV {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string, File file) {
        String string2;
        block39: {
            File file2;
            block38: {
                string2 = c_.d();
                file2 = file.getParentFile();
                if (string2 != null) break block38;
                if (file2 == null) break block39;
                file2 = file.getParentFile();
            }
            boolean bl2 = file2.exists();
            if (string2 == null && !bl2) {
                bl2 = file.getParentFile().mkdirs();
            }
        }
        try {
            HttpsURLConnection httpsURLConnection;
            block35: {
                InputStream inputStream;
                block36: {
                    httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
                    inputStream = httpsURLConnection.getInputStream();
                    Throwable throwable = null;
                    try {
                        block32: {
                            FileOutputStream fileOutputStream;
                            block33: {
                                fileOutputStream = new FileOutputStream(file);
                                Throwable throwable2 = null;
                                try {
                                    int n2;
                                    byte[] arrby = new byte[8192];
                                    while ((n2 = inputStream.read(arrby)) > -1) {
                                        fileOutputStream.write(arrby, 0, n2);
                                        if (string2 == null) {
                                            if (string2 == null) continue;
                                        }
                                        break block32;
                                    }
                                    if (fileOutputStream == null) break block32;
                                    if (throwable2 == null) break block33;
                                }
                                catch (Throwable throwable4) {
                                    try {
                                        throwable2 = throwable4;
                                        throw throwable4;
                                    }
                                    catch (Throwable throwable5) {
                                        throw throwable5;
                                    }
                                    finally {
                                        block34: {
                                            if (fileOutputStream != null) {
                                                if (throwable2 != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                        break block34;
                                                    }
                                                    catch (Throwable throwable6) {
                                                        throwable2.addSuppressed(throwable6);
                                                        if (string2 == null) break block34;
                                                    }
                                                }
                                                fileOutputStream.close();
                                            }
                                        }
                                    }
                                }
                                try {
                                    fileOutputStream.close();
                                }
                                catch (Throwable throwable3) {
                                    throwable2.addSuppressed(throwable3);
                                }
                                break block32;
                            }
                            fileOutputStream.close();
                        }
                        if (inputStream == null) break block35;
                        if (throwable == null) break block36;
                    }
                    catch (Throwable throwable8) {
                        try {
                            throwable = throwable8;
                            throw throwable8;
                        }
                        catch (Throwable throwable9) {
                            throw throwable9;
                        }
                        finally {
                            block37: {
                                if (inputStream != null) {
                                    if (throwable != null) {
                                        try {
                                            inputStream.close();
                                            break block37;
                                        }
                                        catch (Throwable throwable10) {
                                            throwable.addSuppressed(throwable10);
                                            if (string2 == null) break block37;
                                        }
                                    }
                                    inputStream.close();
                                }
                            }
                        }
                    }
                    try {
                        inputStream.close();
                    }
                    catch (Throwable throwable7) {
                        throwable.addSuppressed(throwable7);
                    }
                    break block35;
                }
                inputStream.close();
            }
            httpsURLConnection.disconnect();
            return;
        }
        catch (IOException iOException) {
            System.exit(-1);
        }
    }

    public static void a(String string) {
        try {
            Desktop.getDesktop().browse(new URI(string));
        }
        catch (IOException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

