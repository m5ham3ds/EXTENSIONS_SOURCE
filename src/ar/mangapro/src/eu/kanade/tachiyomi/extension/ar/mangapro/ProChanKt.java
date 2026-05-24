package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import okhttp3.MediaType;

/* JADX INFO: compiled from: ProChan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"SUPPORTED_TYPES", "", "", "SCRAMBLED_IMAGE_HOST", "JSON_MEDIA_TYPE", "Lokhttp3/MediaType;", "MOBILE_REGEX", "Lkotlin/text/Regex;", "TABLES_REGEX", "mangapro"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ProChanKt {
    private static final String SCRAMBLED_IMAGE_HOST = "127.0.0.1";
    private static final Set<String> SUPPORTED_TYPES = SetsKt.setOf(new String[]{"manga", "manhwa", "manhua"});
    private static final MediaType JSON_MEDIA_TYPE = MediaType.Companion.get("application/json");
    private static final Regex MOBILE_REGEX = new Regex("mobile|android|iphone|ipad|ipod", RegexOption.IGNORE_CASE);
    private static final Regex TABLES_REGEX = new Regex("tablet", RegexOption.IGNORE_CASE);
}
