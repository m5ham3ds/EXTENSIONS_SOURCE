package eu.kanade.tachiyomi.extension.ar.mangapro;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Filters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/SortFilter;", "Leu/kanade/tachiyomi/extension/ar/mangapro/SelectFilter;", "", "<init>", "()V", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SortFilter extends SelectFilter<String> {
    public SortFilter() {
        super("الفرز", CollectionsKt.listOf(new Pair[]{TuplesKt.to("أحدث السلاسل", "latest"), TuplesKt.to("أحدث الفصول", "latest_chapter"), TuplesKt.to("الأكثر شهرة", "popular"), TuplesKt.to("الشعبية الإجمالية", "total_popularity"), TuplesKt.to("الأقدم", "oldest"), TuplesKt.to("أبجدي (أ-ي)", "az"), TuplesKt.to("أبجدي (ي-أ)", "za")}));
    }
}
