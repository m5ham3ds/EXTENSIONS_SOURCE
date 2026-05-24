package eu.kanade.tachiyomi.extension.ar.mangapro;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import kotlin.Metadata;

/* JADX INFO: compiled from: UrlActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/UrlActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UrlActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent();
        intent.setAction("eu.kanade.tachiyomi.SEARCH");
        intent.putExtra("query", String.valueOf(getIntent().getData()));
        intent.putExtra("filter", getPackageName());
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("ProChan", "Unable to launch activity", e);
        }
        finish();
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
